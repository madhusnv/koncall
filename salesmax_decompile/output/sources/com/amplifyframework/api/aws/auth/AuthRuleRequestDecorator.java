package com.amplifyframework.api.aws.auth;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.ApiAuthProviders;
import com.amplifyframework.api.aws.AppSyncGraphQLRequest;
import com.amplifyframework.api.aws.AuthorizationType;
import com.amplifyframework.api.aws.sigv4.CognitoUserPoolsAuthProvider;
import com.amplifyframework.api.aws.sigv4.DefaultCognitoUserPoolsAuthProvider;
import com.amplifyframework.api.aws.sigv4.OidcAuthProvider;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.core.model.AuthRule;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.ModelOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AuthRuleRequestDecorator {
    private final ApiAuthProviders authProvider;

    /* renamed from: com.amplifyframework.api.aws.auth.AuthRuleRequestDecorator$1 */
    public static /* synthetic */ class C102981 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$aws$AuthorizationType;

        static {
            int[] iArr = new int[AuthorizationType.values().length];
            $SwitchMap$com$amplifyframework$api$aws$AuthorizationType = iArr;
            try {
                iArr[AuthorizationType.AMAZON_COGNITO_USER_POOLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.OPENID_CONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.API_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.AWS_IAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AuthRuleRequestDecorator(ApiAuthProviders apiAuthProviders) {
        Objects.requireNonNull(apiAuthProviders);
        this.authProvider = apiAuthProviders;
    }

    private boolean doesRuleAllowPublicSubscribe(AuthRule authRule, AuthorizationType authorizationType) {
        AuthorizationType authorizationType2;
        AuthorizationType authorizationTypeFrom = AuthorizationType.from(authRule.getAuthProvider());
        AuthStrategy authStrategy = authRule.getAuthStrategy();
        List<ModelOperation> operationsOrDefault = authRule.getOperationsOrDefault();
        return authStrategy == AuthStrategy.PUBLIC && authorizationTypeFrom == (authorizationType2 = AuthorizationType.API_KEY) && authorizationType == authorizationType2 && (operationsOrDefault.contains(ModelOperation.LISTEN) || operationsOrDefault.contains(ModelOperation.READ));
    }

    private String getAuthToken(AuthorizationType authorizationType) throws ApiException.ApiAuthException {
        int i = C102981.$SwitchMap$com$amplifyframework$api$aws$AuthorizationType[authorizationType.ordinal()];
        if (i == 1) {
            CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider = this.authProvider.getCognitoUserPoolsAuthProvider();
            if (cognitoUserPoolsAuthProvider == null) {
                cognitoUserPoolsAuthProvider = new DefaultCognitoUserPoolsAuthProvider();
            }
            return cognitoUserPoolsAuthProvider.getLatestAuthToken();
        }
        if (i != 2) {
            throw new ApiException.ApiAuthException("Tried to use owner/group-based authorization on an API that is not configured with either Cognito User Pools or OpenID Connect.", "Verify that the API is configured with either Cognito User Pools or OpenID Connect. @auth with owner/group-based authorization is not supported for other modes.");
        }
        OidcAuthProvider oidcAuthProvider = this.authProvider.getOidcAuthProvider();
        if (oidcAuthProvider != null) {
            return oidcAuthProvider.getLatestAuthToken();
        }
        throw new ApiException.ApiAuthException("OidcAuthProvider interface is not implemented.", "Configure AWSApiPlugin with ApiAuthProviders containing an implementation of OidcAuthProvider interface that can vend a valid JWT token.");
    }

    private String getIdentityValue(String str, AuthorizationType authorizationType) throws ApiException.ApiAuthException {
        try {
            return CognitoJWTParser.Companion.getPayload(getAuthToken(authorizationType)).getString(str);
        } catch (CognitoParameterInvalidException e) {
            throw new ApiException.ApiAuthException("Failed to parse the ID token for identity claim: " + e.getMessage(), "Please verify the validity of token vended by the registered auth provider.");
        } catch (JSONException unused) {
            throw new ApiException.ApiAuthException("Attempted to subscribe to a model with owner-based authorization without " + str + " which was specified (or defaulted to) as the identity claim.", "If you did not specify a custom identityClaim in your schema, make sure you are logged in. If you did, check that the value you specified in your schema is present in the access key.");
        }
    }

    private ArrayList<String> getUserGroups(String str, AuthorizationType authorizationType) throws JSONException, ApiException {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONObject payload = CognitoJWTParser.Companion.getPayload(getAuthToken(authorizationType));
            if (payload.has(str)) {
                JSONArray jSONArray = payload.getJSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
            return arrayList;
        } catch (CognitoParameterInvalidException e) {
            throw new ApiException("Failed to parse the ID token for group claim: " + e.getMessage(), "Please verify the validity of token vended by the registered auth provider.");
        } catch (JSONException e2) {
            throw new ApiException("Failed obtain group claim from the parsed JWT token.", e2, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        }
    }

    private boolean isReadRestrictingOwner(AuthRule authRule) {
        return AuthStrategy.OWNER.equals(authRule.getAuthStrategy()) && authRule.getOperationsOrDefault().contains(ModelOperation.READ);
    }

    private boolean isReadRestrictingStaticGroup(AuthRule authRule) {
        return AuthStrategy.GROUPS.equals(authRule.getAuthStrategy()) && !authRule.getGroups().isEmpty() && authRule.getOperationsOrDefault().contains(ModelOperation.READ);
    }

    private boolean userNotInReadRestrictingGroups(Map<String, Set<String>> map, AuthorizationType authorizationType) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (!Collections.disjoint(getUserGroups(entry.getKey(), authorizationType), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (userNotInReadRestrictingGroups(r1, r9) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r8 = r3.getIdentityClaimOrDefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        return r0.newBuilder().variable(r3.getOwnerFieldOrDefault(), "String!", getIdentityValue(r8, r9)).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        throw new com.amplifyframework.api.ApiException.ApiAuthException("Failed to set owner field on AppSyncGraphQLRequest.", r8, com.amplifyframework.AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> GraphQLRequest<R> decorate(GraphQLRequest<R> graphQLRequest, AuthorizationType authorizationType) throws ApiException.ApiAuthException {
        boolean z;
        if (!(graphQLRequest instanceof AppSyncGraphQLRequest)) {
            return graphQLRequest;
        }
        AppSyncGraphQLRequest appSyncGraphQLRequest = (AppSyncGraphQLRequest) graphQLRequest;
        HashMap map = new HashMap();
        Iterator<AuthRule> it = appSyncGraphQLRequest.getModelSchema().getAuthRules().iterator();
        AuthRule authRule = null;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AuthRule next = it.next();
            if (doesRuleAllowPublicSubscribe(next, authorizationType)) {
                z = true;
                break;
            }
            if (isReadRestrictingOwner(next)) {
                if (authRule != null) {
                    throw new ApiException.ApiAuthException("Detected multiple owner type auth rules with a READ operation", "We currently do not support this use case. Please limit your type to just one owner auth rule with a READ operation restriction.");
                }
                authRule = next;
            } else if (isReadRestrictingStaticGroup(next)) {
                String groupClaimOrDefault = next.getGroupClaimOrDefault();
                List<String> groups = next.getGroups();
                Set<String> set = map.get(groupClaimOrDefault);
                if (set != null) {
                    set.addAll(groups);
                } else {
                    map.put(groupClaimOrDefault, new HashSet(groups));
                }
            }
        }
    }
}
