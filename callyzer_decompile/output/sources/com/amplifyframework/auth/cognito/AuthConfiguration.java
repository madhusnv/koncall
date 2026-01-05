package com.amplifyframework.auth.cognito;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.helpers.HostedUIHelper;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.OauthConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class AuthConfiguration {
    public static final Companion Companion = new Companion(null);
    private final AuthFlowType authFlowType;
    private final IdentityPoolConfiguration identityPool;
    private final OauthConfiguration oauth;
    private final PasswordProtectionSettings passwordProtectionSettings;
    private final List<AuthUserAttributeKey> signUpAttributes;
    private final UserPoolConfiguration userPool;
    private final List<UsernameAttribute> usernameAttributes;
    private final List<VerificationMechanism> verificationMechanisms;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;

            static {
                int[] iArr = new int[AmplifyOutputsData.Auth.UsernameAttributes.values().length];
                try {
                    iArr[AmplifyOutputsData.Auth.UsernameAttributes.Email.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AmplifyOutputsData.Auth.UsernameAttributes.PhoneNumber.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AmplifyOutputsData.Auth.UsernameAttributes.Username.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[UsernameAttribute.values().length];
                try {
                    iArr2[UsernameAttribute.Username.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[UsernameAttribute.Email.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[UsernameAttribute.PhoneNumber.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[AmplifyOutputsData.Auth.UserVerificationTypes.values().length];
                try {
                    iArr3[AmplifyOutputsData.Auth.UserVerificationTypes.Email.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr3[AmplifyOutputsData.Auth.UserVerificationTypes.PhoneNumber.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$2 = iArr3;
                int[] iArr4 = new int[VerificationMechanism.values().length];
                try {
                    iArr4[VerificationMechanism.Email.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr4[VerificationMechanism.PhoneNumber.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$3 = iArr4;
            }
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public static /* synthetic */ AuthConfiguration fromJson$default(Companion companion, JSONObject jSONObject, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = "Default";
            }
            return companion.fromJson(jSONObject, str);
        }

        private final AuthFlowType getAuthenticationFlowType(String str) {
            if (str != null && str.length() != 0) {
                for (AuthFlowType authFlowType : AuthFlowType.values()) {
                    if (AbstractC4154l.m8918a(authFlowType.name(), str)) {
                        return AuthFlowType.valueOf(str);
                    }
                }
            }
            return AuthFlowType.USER_SRP_AUTH;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [rw.r] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
        private final PasswordProtectionSettings getPasswordProtectionSettings(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject;
            ?? arrayList;
            if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("passwordProtectionSettings")) == null) {
                return null;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("passwordPolicyMinLength");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("passwordPolicyCharacters");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                arrayList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            } else {
                arrayList = C6668r.f31943a;
            }
            return new PasswordProtectionSettings(iOptInt, arrayList.contains("REQUIRES_NUMBERS"), arrayList.contains("REQUIRES_SYMBOLS"), arrayList.contains("REQUIRES_UPPERCASE"), arrayList.contains("REQUIRES_LOWERCASE"));
        }

        private final <T> List<T> map(JSONArray jSONArray, InterfaceC2141e interfaceC2141e) {
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(interfaceC2141e.invoke(jSONArray, Integer.valueOf(i10)));
            }
            return arrayList;
        }

        private final UsernameAttribute toConfigType(AmplifyOutputsData.Auth.UsernameAttributes usernameAttributes) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[usernameAttributes.ordinal()];
            if (i10 == 1) {
                return UsernameAttribute.Email;
            }
            if (i10 == 2) {
                return UsernameAttribute.PhoneNumber;
            }
            if (i10 == 3) {
                return UsernameAttribute.Username;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject toGen1Json(PasswordProtectionSettings passwordProtectionSettings) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("passwordPolicyMinLength", passwordProtectionSettings.getLength());
            JSONArray jSONArray = new JSONArray();
            if (passwordProtectionSettings.getRequiresLower()) {
                jSONArray.put("REQUIRES_LOWERCASE");
            }
            if (passwordProtectionSettings.getRequiresUpper()) {
                jSONArray.put("REQUIRES_UPPERCASE");
            }
            if (passwordProtectionSettings.getRequiresNumber()) {
                jSONArray.put("REQUIRES_NUMBERS");
            }
            if (passwordProtectionSettings.getRequiresSpecial()) {
                jSONArray.put("REQUIRES_SYMBOLS");
            }
            jSONObject.put("passwordPolicyCharacters", jSONArray);
            return jSONObject;
        }

        public final AuthConfiguration from(AmplifyOutputsData amplifyOutputs) throws ConfigurationException {
            OauthConfiguration oauthConfiguration;
            AbstractC4154l.m8923f(amplifyOutputs, "amplifyOutputs");
            AmplifyOutputsData.Auth auth = amplifyOutputs.getAuth();
            if (auth == null) {
                throw new ConfigurationException("Missing Auth configuration", "Ensure the auth category is properly configured", null, 4, null);
            }
            AmplifyOutputsData.Auth.Oauth oauth = auth.getOauth();
            if (oauth != null) {
                String userPoolClientId = auth.getUserPoolClientId();
                String domain = oauth.getDomain();
                Set setG0 = AbstractC6663m.g0(oauth.getScopes());
                HostedUIHelper hostedUIHelper = HostedUIHelper.INSTANCE;
                String strSelectRedirectUri = hostedUIHelper.selectRedirectUri(oauth.getRedirectSignInUri());
                if (strSelectRedirectUri == null) {
                    strSelectRedirectUri = "";
                }
                String strSelectRedirectUri2 = hostedUIHelper.selectRedirectUri(oauth.getRedirectSignOutUri());
                oauthConfiguration = new OauthConfiguration(userPoolClientId, null, domain, setG0, strSelectRedirectUri, strSelectRedirectUri2 != null ? strSelectRedirectUri2 : "");
            } else {
                oauthConfiguration = null;
            }
            String identityPoolId = auth.getIdentityPoolId();
            IdentityPoolConfiguration identityPoolConfiguration = identityPoolId != null ? new IdentityPoolConfiguration(auth.getAwsRegion(), identityPoolId) : null;
            UserPoolConfiguration userPoolConfiguration = new UserPoolConfiguration(auth.getAwsRegion(), null, auth.getUserPoolId(), auth.getUserPoolClientId(), null, null);
            AuthFlowType authFlowType = AuthFlowType.USER_SRP_AUTH;
            List<AuthUserAttributeKey> standardRequiredAttributes = auth.getStandardRequiredAttributes();
            List<AmplifyOutputsData.Auth.UsernameAttributes> usernameAttributes = auth.getUsernameAttributes();
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(usernameAttributes, 10));
            Iterator<T> it = usernameAttributes.iterator();
            while (it.hasNext()) {
                arrayList.add(AuthConfiguration.Companion.toConfigType((AmplifyOutputsData.Auth.UsernameAttributes) it.next()));
            }
            List<AmplifyOutputsData.Auth.UserVerificationTypes> userVerificationTypes = auth.getUserVerificationTypes();
            ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(userVerificationTypes, 10));
            Iterator<T> it2 = userVerificationTypes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AuthConfiguration.Companion.toConfigType((AmplifyOutputsData.Auth.UserVerificationTypes) it2.next()));
            }
            AmplifyOutputsData.Auth.PasswordPolicy passwordPolicy = auth.getPasswordPolicy();
            return new AuthConfiguration(userPoolConfiguration, identityPoolConfiguration, oauthConfiguration, authFlowType, standardRequiredAttributes, arrayList, arrayList2, passwordPolicy != null ? toConfigType(passwordPolicy) : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AuthConfiguration fromJson(JSONObject pluginJson, String configName) throws JSONException {
            C6668r c6668r;
            C6668r c6668r2;
            C6668r c6668r3;
            JSONObject jSONObjectOptJSONObject;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONArray jSONArrayOptJSONArray;
            JSONArray jSONArrayOptJSONArray2;
            JSONArray jSONArrayOptJSONArray3;
            AbstractC4154l.m8923f(pluginJson, "pluginJson");
            AbstractC4154l.m8923f(configName, "configName");
            JSONObject jSONObjectOptJSONObject2 = pluginJson.optJSONObject("Auth");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject(configName) : null;
            C6668r c6668r4 = C6668r.f31943a;
            if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject3.optJSONArray("signupAttributes")) == null) {
                c6668r = c6668r4;
            } else {
                int length = jSONArrayOptJSONArray3.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArrayOptJSONArray3.getString(i10);
                    AbstractC4154l.m8922e(string, "getString(...)");
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                    arrayList.add(AuthUserAttributeKey.custom(lowerCase));
                }
                c6668r = arrayList;
            }
            if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("usernameAttributes")) == null) {
                c6668r2 = c6668r4;
            } else {
                int length2 = jSONArrayOptJSONArray2.length();
                ArrayList arrayList2 = new ArrayList(length2);
                for (int i11 = 0; i11 < length2; i11++) {
                    String string2 = jSONArrayOptJSONArray2.getString(i11);
                    arrayList2.add(AbstractC4154l.m8918a(string2, "EMAIL") ? UsernameAttribute.Email : AbstractC4154l.m8918a(string2, "PHONE_NUMBER") ? UsernameAttribute.PhoneNumber : UsernameAttribute.Username);
                }
                c6668r2 = arrayList2;
            }
            if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("verificationMechanisms")) == null) {
                c6668r3 = c6668r4;
            } else {
                int length3 = jSONArrayOptJSONArray.length();
                ArrayList arrayList3 = new ArrayList(length3);
                for (int i12 = 0; i12 < length3; i12++) {
                    arrayList3.add(AbstractC4154l.m8918a(jSONArrayOptJSONArray.getString(i12), "EMAIL") ? VerificationMechanism.Email : VerificationMechanism.PhoneNumber);
                }
                c6668r3 = arrayList3;
            }
            JSONObject jSONObjectOptJSONObject4 = pluginJson.optJSONObject("CognitoUserPool");
            UserPoolConfiguration userPoolConfigurationBuild = (jSONObjectOptJSONObject4 == null || (jSONObject3 = jSONObjectOptJSONObject4.getJSONObject(configName)) == null) ? null : UserPoolConfiguration.Companion.fromJson(jSONObject3).build();
            JSONObject jSONObjectOptJSONObject5 = pluginJson.optJSONObject("CredentialsProvider");
            return new AuthConfiguration(userPoolConfigurationBuild, (jSONObjectOptJSONObject5 == null || (jSONObject = jSONObjectOptJSONObject5.getJSONObject("CognitoIdentity")) == null || (jSONObject2 = jSONObject.getJSONObject(configName)) == null) ? null : IdentityPoolConfiguration.Companion.fromJson(jSONObject2).build(), (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("OAuth")) == null) ? null : OauthConfiguration.Companion.fromJson(jSONObjectOptJSONObject), getAuthenticationFlowType(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("authenticationFlowType") : null), c6668r, c6668r2, c6668r3, getPasswordProtectionSettings(jSONObjectOptJSONObject3));
        }

        private Companion() {
        }

        private final VerificationMechanism toConfigType(AmplifyOutputsData.Auth.UserVerificationTypes userVerificationTypes) {
            int i10 = WhenMappings.$EnumSwitchMapping$2[userVerificationTypes.ordinal()];
            if (i10 == 1) {
                return VerificationMechanism.Email;
            }
            if (i10 == 2) {
                return VerificationMechanism.PhoneNumber;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toGen1Json(UsernameAttribute usernameAttribute) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[usernameAttribute.ordinal()];
            if (i10 == 1) {
                return "USERNAME";
            }
            if (i10 == 2) {
                return "EMAIL";
            }
            if (i10 == 3) {
                return "PHONE_NUMBER";
            }
            throw new NoWhenBranchMatchedException();
        }

        private final PasswordProtectionSettings toConfigType(AmplifyOutputsData.Auth.PasswordPolicy passwordPolicy) {
            Integer minLength = passwordPolicy.getMinLength();
            int iIntValue = minLength != null ? minLength.intValue() : 6;
            Boolean requireNumbers = passwordPolicy.getRequireNumbers();
            boolean zBooleanValue = requireNumbers != null ? requireNumbers.booleanValue() : false;
            Boolean requireSymbols = passwordPolicy.getRequireSymbols();
            boolean zBooleanValue2 = requireSymbols != null ? requireSymbols.booleanValue() : false;
            Boolean requireUppercase = passwordPolicy.getRequireUppercase();
            boolean zBooleanValue3 = requireUppercase != null ? requireUppercase.booleanValue() : false;
            Boolean requireLowercase = passwordPolicy.getRequireLowercase();
            return new PasswordProtectionSettings(iIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, requireLowercase != null ? requireLowercase.booleanValue() : false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toGen1Json(VerificationMechanism verificationMechanism) {
            int i10 = WhenMappings.$EnumSwitchMapping$3[verificationMechanism.ordinal()];
            if (i10 == 1) {
                return "EMAIL";
            }
            if (i10 == 2) {
                return "PHONE_NUMBER";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthConfiguration(UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, AuthFlowType authFlowType, List<AuthUserAttributeKey> signUpAttributes, List<? extends UsernameAttribute> usernameAttributes, List<? extends VerificationMechanism> verificationMechanisms, PasswordProtectionSettings passwordProtectionSettings) {
        AbstractC4154l.m8923f(authFlowType, "authFlowType");
        AbstractC4154l.m8923f(signUpAttributes, "signUpAttributes");
        AbstractC4154l.m8923f(usernameAttributes, "usernameAttributes");
        AbstractC4154l.m8923f(verificationMechanisms, "verificationMechanisms");
        this.userPool = userPoolConfiguration;
        this.identityPool = identityPoolConfiguration;
        this.oauth = oauthConfiguration;
        this.authFlowType = authFlowType;
        this.signUpAttributes = signUpAttributes;
        this.usernameAttributes = usernameAttributes;
        this.verificationMechanisms = verificationMechanisms;
        this.passwordProtectionSettings = passwordProtectionSettings;
    }

    public static /* synthetic */ AuthConfiguration copy$aws_auth_cognito_release$default(AuthConfiguration authConfiguration, UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, AuthFlowType authFlowType, List list, List list2, List list3, PasswordProtectionSettings passwordProtectionSettings, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userPoolConfiguration = authConfiguration.userPool;
        }
        if ((i10 & 2) != 0) {
            identityPoolConfiguration = authConfiguration.identityPool;
        }
        if ((i10 & 4) != 0) {
            oauthConfiguration = authConfiguration.oauth;
        }
        if ((i10 & 8) != 0) {
            authFlowType = authConfiguration.authFlowType;
        }
        if ((i10 & 16) != 0) {
            list = authConfiguration.signUpAttributes;
        }
        if ((i10 & 32) != 0) {
            list2 = authConfiguration.usernameAttributes;
        }
        if ((i10 & 64) != 0) {
            list3 = authConfiguration.verificationMechanisms;
        }
        if ((i10 & 128) != 0) {
            passwordProtectionSettings = authConfiguration.passwordProtectionSettings;
        }
        List list4 = list3;
        PasswordProtectionSettings passwordProtectionSettings2 = passwordProtectionSettings;
        List list5 = list;
        List list6 = list2;
        return authConfiguration.copy$aws_auth_cognito_release(userPoolConfiguration, identityPoolConfiguration, oauthConfiguration, authFlowType, list5, list6, list4, passwordProtectionSettings2);
    }

    public static /* synthetic */ JSONObject toGen1Json$aws_auth_cognito_release$default(AuthConfiguration authConfiguration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Default";
        }
        return authConfiguration.toGen1Json$aws_auth_cognito_release(str);
    }

    public final UserPoolConfiguration component1() {
        return this.userPool;
    }

    public final IdentityPoolConfiguration component2() {
        return this.identityPool;
    }

    public final OauthConfiguration component3() {
        return this.oauth;
    }

    public final AuthFlowType component4() {
        return this.authFlowType;
    }

    public final List<AuthUserAttributeKey> component5() {
        return this.signUpAttributes;
    }

    public final List<UsernameAttribute> component6() {
        return this.usernameAttributes;
    }

    public final List<VerificationMechanism> component7() {
        return this.verificationMechanisms;
    }

    public final PasswordProtectionSettings component8() {
        return this.passwordProtectionSettings;
    }

    public final AuthConfiguration copy$aws_auth_cognito_release(UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, AuthFlowType authFlowType, List<AuthUserAttributeKey> signUpAttributes, List<? extends UsernameAttribute> usernameAttributes, List<? extends VerificationMechanism> verificationMechanisms, PasswordProtectionSettings passwordProtectionSettings) {
        AbstractC4154l.m8923f(authFlowType, "authFlowType");
        AbstractC4154l.m8923f(signUpAttributes, "signUpAttributes");
        AbstractC4154l.m8923f(usernameAttributes, "usernameAttributes");
        AbstractC4154l.m8923f(verificationMechanisms, "verificationMechanisms");
        return new AuthConfiguration(userPoolConfiguration, identityPoolConfiguration, oauthConfiguration, authFlowType, signUpAttributes, usernameAttributes, verificationMechanisms, passwordProtectionSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthConfiguration)) {
            return false;
        }
        AuthConfiguration authConfiguration = (AuthConfiguration) obj;
        return AbstractC4154l.m8918a(this.userPool, authConfiguration.userPool) && AbstractC4154l.m8918a(this.identityPool, authConfiguration.identityPool) && AbstractC4154l.m8918a(this.oauth, authConfiguration.oauth) && this.authFlowType == authConfiguration.authFlowType && AbstractC4154l.m8918a(this.signUpAttributes, authConfiguration.signUpAttributes) && AbstractC4154l.m8918a(this.usernameAttributes, authConfiguration.usernameAttributes) && AbstractC4154l.m8918a(this.verificationMechanisms, authConfiguration.verificationMechanisms) && AbstractC4154l.m8918a(this.passwordProtectionSettings, authConfiguration.passwordProtectionSettings);
    }

    public final AuthFlowType getAuthFlowType() {
        return this.authFlowType;
    }

    public final IdentityPoolConfiguration getIdentityPool() {
        return this.identityPool;
    }

    public final OauthConfiguration getOauth() {
        return this.oauth;
    }

    public final PasswordProtectionSettings getPasswordProtectionSettings() {
        return this.passwordProtectionSettings;
    }

    public final List<AuthUserAttributeKey> getSignUpAttributes() {
        return this.signUpAttributes;
    }

    public final UserPoolConfiguration getUserPool() {
        return this.userPool;
    }

    public final List<UsernameAttribute> getUsernameAttributes() {
        return this.usernameAttributes;
    }

    public final List<VerificationMechanism> getVerificationMechanisms() {
        return this.verificationMechanisms;
    }

    public int hashCode() {
        UserPoolConfiguration userPoolConfiguration = this.userPool;
        int iHashCode = (userPoolConfiguration == null ? 0 : userPoolConfiguration.hashCode()) * 31;
        IdentityPoolConfiguration identityPoolConfiguration = this.identityPool;
        int iHashCode2 = (iHashCode + (identityPoolConfiguration == null ? 0 : identityPoolConfiguration.hashCode())) * 31;
        OauthConfiguration oauthConfiguration = this.oauth;
        int iM4559f = AbstractC1452a.m4559f(this.verificationMechanisms, AbstractC1452a.m4559f(this.usernameAttributes, AbstractC1452a.m4559f(this.signUpAttributes, (this.authFlowType.hashCode() + ((iHashCode2 + (oauthConfiguration == null ? 0 : oauthConfiguration.hashCode())) * 31)) * 31, 31), 31), 31);
        PasswordProtectionSettings passwordProtectionSettings = this.passwordProtectionSettings;
        return iM4559f + (passwordProtectionSettings != null ? passwordProtectionSettings.hashCode() : 0);
    }

    public final JSONObject toGen1Json$aws_auth_cognito_release(String configName) throws JSONException {
        AbstractC4154l.m8923f(configName, "configName");
        JSONObject jSONObject = new JSONObject();
        List<AuthUserAttributeKey> list = this.signUpAttributes;
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String keyString = ((AuthUserAttributeKey) it.next()).getKeyString();
            AbstractC4154l.m8922e(keyString, "getKeyString(...)");
            String upperCase = keyString.toUpperCase(Locale.ROOT);
            AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        jSONObject.put("signupAttributes", new JSONArray((Collection) arrayList));
        List<UsernameAttribute> list2 = this.usernameAttributes;
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Companion.toGen1Json((UsernameAttribute) it2.next()));
        }
        jSONObject.put("usernameAttributes", new JSONArray((Collection) arrayList2));
        List<VerificationMechanism> list3 = this.verificationMechanisms;
        ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Companion.toGen1Json((VerificationMechanism) it3.next()));
        }
        jSONObject.put("verificationMechanisms", new JSONArray((Collection) arrayList3));
        jSONObject.put("authenticationFlowType", this.authFlowType.name());
        OauthConfiguration oauthConfiguration = this.oauth;
        if (oauthConfiguration != null) {
            jSONObject.put("OAuth", oauthConfiguration.toGen1Json$aws_auth_cognito_release());
        }
        PasswordProtectionSettings passwordProtectionSettings = this.passwordProtectionSettings;
        if (passwordProtectionSettings != null) {
            jSONObject.put("passwordProtectionSettings", Companion.toGen1Json(passwordProtectionSettings));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("Auth", new JSONObject().put(configName, jSONObject));
        UserPoolConfiguration userPoolConfiguration = this.userPool;
        if (userPoolConfiguration != null) {
            jSONObject2.put("CognitoUserPool", new JSONObject().put(configName, userPoolConfiguration.toGen1Json$aws_auth_cognito_release()));
        }
        IdentityPoolConfiguration identityPoolConfiguration = this.identityPool;
        if (identityPoolConfiguration != null) {
            jSONObject2.put("CredentialsProvider", new JSONObject().put("CognitoIdentity", new JSONObject().put(configName, identityPoolConfiguration.toGen1Json$aws_auth_cognito_release())));
        }
        return jSONObject2;
    }

    public String toString() {
        return "AuthConfiguration(userPool=" + this.userPool + ", identityPool=" + this.identityPool + ", oauth=" + this.oauth + ", authFlowType=" + this.authFlowType + ", signUpAttributes=" + this.signUpAttributes + ", usernameAttributes=" + this.usernameAttributes + ", verificationMechanisms=" + this.verificationMechanisms + ", passwordProtectionSettings=" + this.passwordProtectionSettings + ")";
    }
}
