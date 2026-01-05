package com.amplifyframework.auth.cognito;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.OauthConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.ch3;
import p001o.dh3;
import p001o.id5;
import p001o.kh3;
import p001o.nl7;
import p001o.sq8;
import p001o.szb;

@InternalAmplifyApi
/* loaded from: classes5.dex */
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

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
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

        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public static /* synthetic */ AuthConfiguration fromJson$default(Companion companion, JSONObject jSONObject, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "Default";
            }
            return companion.fromJson(jSONObject, str);
        }

        private final AuthFlowType getAuthenticationFlowType(String str) {
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                AuthFlowType[] authFlowTypeArrValues = AuthFlowType.values();
                int length = authFlowTypeArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (sq8.m48644c(authFlowTypeArrValues[i].name(), str)) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    return AuthFlowType.valueOf(str);
                }
            }
            return AuthFlowType.USER_SRP_AUTH;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
        private final PasswordProtectionSettings getPasswordProtectionSettings(JSONObject jSONObject) {
            ?? M21246k;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("passwordProtectionSettings") : null;
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("passwordPolicyMinLength");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("passwordPolicyCharacters");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                M21246k = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    M21246k.add(jSONArrayOptJSONArray.getString(i));
                }
            } else {
                M21246k = ch3.m21246k();
            }
            return new PasswordProtectionSettings(iOptInt, M21246k.contains("REQUIRES_NUMBERS"), M21246k.contains("REQUIRES_SYMBOLS"), M21246k.contains("REQUIRES_UPPERCASE"), M21246k.contains("REQUIRES_LOWERCASE"));
        }

        private final <T> List<T> map(JSONArray jSONArray, nl7 nl7Var) {
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(nl7Var.invoke(jSONArray, Integer.valueOf(i)));
            }
            return arrayList;
        }

        private final UsernameAttribute toConfigType(AmplifyOutputsData.Auth.UsernameAttributes usernameAttributes) {
            int i = WhenMappings.$EnumSwitchMapping$0[usernameAttributes.ordinal()];
            if (i == 1) {
                return UsernameAttribute.Email;
            }
            if (i == 2) {
                return UsernameAttribute.PhoneNumber;
            }
            if (i == 3) {
                return UsernameAttribute.Username;
            }
            throw new szb();
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

        public final AuthConfiguration from(AmplifyOutputsData amplifyOutputsData) throws ConfigurationException {
            sq8.m48649h(amplifyOutputsData, "amplifyOutputs");
            AmplifyOutputsData.Auth auth = amplifyOutputsData.getAuth();
            if (auth == null) {
                throw new ConfigurationException("Missing Auth configuration", "Ensure the auth category is properly configured", null, 4, null);
            }
            AmplifyOutputsData.Auth.Oauth oauth = auth.getOauth();
            OauthConfiguration oauthConfiguration = oauth != null ? new OauthConfiguration(auth.getUserPoolClientId(), null, oauth.getDomain(), kh3.V0(oauth.getScopes()), kh3.p0(oauth.getRedirectSignInUri(), ",", null, null, 0, null, null, 62, null), kh3.p0(oauth.getRedirectSignOutUri(), ",", null, null, 0, null, null, 62, null)) : null;
            String identityPoolId = auth.getIdentityPoolId();
            IdentityPoolConfiguration identityPoolConfiguration = identityPoolId != null ? new IdentityPoolConfiguration(auth.getAwsRegion(), identityPoolId) : null;
            UserPoolConfiguration userPoolConfiguration = new UserPoolConfiguration(auth.getAwsRegion(), null, auth.getUserPoolId(), auth.getUserPoolClientId(), null, null);
            AuthFlowType authFlowType = AuthFlowType.USER_SRP_AUTH;
            List<AuthUserAttributeKey> standardRequiredAttributes = auth.getStandardRequiredAttributes();
            List<AmplifyOutputsData.Auth.UsernameAttributes> usernameAttributes = auth.getUsernameAttributes();
            ArrayList arrayList = new ArrayList(dh3.m23088v(usernameAttributes, 10));
            Iterator<T> it = usernameAttributes.iterator();
            while (it.hasNext()) {
                arrayList.add(AuthConfiguration.Companion.toConfigType((AmplifyOutputsData.Auth.UsernameAttributes) it.next()));
            }
            List<AmplifyOutputsData.Auth.UserVerificationTypes> userVerificationTypes = auth.getUserVerificationTypes();
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(userVerificationTypes, 10));
            Iterator<T> it2 = userVerificationTypes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AuthConfiguration.Companion.toConfigType((AmplifyOutputsData.Auth.UserVerificationTypes) it2.next()));
            }
            AmplifyOutputsData.Auth.PasswordPolicy passwordPolicy = auth.getPasswordPolicy();
            return new AuthConfiguration(userPoolConfiguration, identityPoolConfiguration, oauthConfiguration, authFlowType, standardRequiredAttributes, arrayList, arrayList2, passwordPolicy != null ? toConfigType(passwordPolicy) : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
        public final AuthConfiguration fromJson(JSONObject jSONObject, String str) throws JSONException {
            ?? M21246k;
            List listM21246k;
            List listM21246k2;
            JSONObject jSONObjectOptJSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            JSONArray jSONArrayOptJSONArray;
            JSONArray jSONArrayOptJSONArray2;
            JSONArray jSONArrayOptJSONArray3;
            sq8.m48649h(jSONObject, "pluginJson");
            sq8.m48649h(str, "configName");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("Auth");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject3.optJSONArray("signupAttributes")) == null) {
                M21246k = ch3.m21246k();
            } else {
                int length = jSONArrayOptJSONArray3.length();
                M21246k = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String string = jSONArrayOptJSONArray3.getString(i);
                    sq8.m48648g(string, "getString(...)");
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                    M21246k.add(AuthUserAttributeKey.custom(lowerCase));
                }
            }
            List list = M21246k;
            if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("usernameAttributes")) == null) {
                listM21246k = ch3.m21246k();
            } else {
                int length2 = jSONArrayOptJSONArray2.length();
                ArrayList arrayList = new ArrayList(length2);
                for (int i2 = 0; i2 < length2; i2++) {
                    String string2 = jSONArrayOptJSONArray2.getString(i2);
                    arrayList.add(sq8.m48644c(string2, "EMAIL") ? UsernameAttribute.Email : sq8.m48644c(string2, "PHONE_NUMBER") ? UsernameAttribute.PhoneNumber : UsernameAttribute.Username);
                }
                listM21246k = arrayList;
            }
            if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("verificationMechanisms")) == null) {
                listM21246k2 = ch3.m21246k();
            } else {
                int length3 = jSONArrayOptJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length3);
                for (int i3 = 0; i3 < length3; i3++) {
                    arrayList2.add(sq8.m48644c(jSONArrayOptJSONArray.getString(i3), "EMAIL") ? VerificationMechanism.Email : VerificationMechanism.PhoneNumber);
                }
                listM21246k2 = arrayList2;
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("CognitoUserPool");
            UserPoolConfiguration userPoolConfigurationBuild = (jSONObjectOptJSONObject4 == null || (jSONObject4 = jSONObjectOptJSONObject4.getJSONObject(str)) == null) ? null : UserPoolConfiguration.Companion.fromJson(jSONObject4).build();
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("CredentialsProvider");
            return new AuthConfiguration(userPoolConfigurationBuild, (jSONObjectOptJSONObject5 == null || (jSONObject2 = jSONObjectOptJSONObject5.getJSONObject("CognitoIdentity")) == null || (jSONObject3 = jSONObject2.getJSONObject(str)) == null) ? null : IdentityPoolConfiguration.Companion.fromJson(jSONObject3).build(), (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("OAuth")) == null) ? null : OauthConfiguration.Companion.fromJson(jSONObjectOptJSONObject), getAuthenticationFlowType(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("authenticationFlowType") : null), list, listM21246k, listM21246k2, getPasswordProtectionSettings(jSONObjectOptJSONObject3));
        }

        private final VerificationMechanism toConfigType(AmplifyOutputsData.Auth.UserVerificationTypes userVerificationTypes) {
            int i = WhenMappings.$EnumSwitchMapping$2[userVerificationTypes.ordinal()];
            if (i == 1) {
                return VerificationMechanism.Email;
            }
            if (i == 2) {
                return VerificationMechanism.PhoneNumber;
            }
            throw new szb();
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
        public final String toGen1Json(UsernameAttribute usernameAttribute) {
            int i = WhenMappings.$EnumSwitchMapping$1[usernameAttribute.ordinal()];
            if (i == 1) {
                return "USERNAME";
            }
            if (i == 2) {
                return "EMAIL";
            }
            if (i == 3) {
                return "PHONE_NUMBER";
            }
            throw new szb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toGen1Json(VerificationMechanism verificationMechanism) {
            int i = WhenMappings.$EnumSwitchMapping$3[verificationMechanism.ordinal()];
            if (i == 1) {
                return "EMAIL";
            }
            if (i == 2) {
                return "PHONE_NUMBER";
            }
            throw new szb();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthConfiguration(UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, AuthFlowType authFlowType, List<AuthUserAttributeKey> list, List<? extends UsernameAttribute> list2, List<? extends VerificationMechanism> list3, PasswordProtectionSettings passwordProtectionSettings) {
        sq8.m48649h(authFlowType, "authFlowType");
        sq8.m48649h(list, "signUpAttributes");
        sq8.m48649h(list2, "usernameAttributes");
        sq8.m48649h(list3, "verificationMechanisms");
        this.userPool = userPoolConfiguration;
        this.identityPool = identityPoolConfiguration;
        this.oauth = oauthConfiguration;
        this.authFlowType = authFlowType;
        this.signUpAttributes = list;
        this.usernameAttributes = list2;
        this.verificationMechanisms = list3;
        this.passwordProtectionSettings = passwordProtectionSettings;
    }

    public static /* synthetic */ JSONObject toGen1Json$aws_auth_cognito_release$default(AuthConfiguration authConfiguration, String str, int i, Object obj) {
        if ((i & 1) != 0) {
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

    public final AuthConfiguration copy(UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, AuthFlowType authFlowType, List<AuthUserAttributeKey> list, List<? extends UsernameAttribute> list2, List<? extends VerificationMechanism> list3, PasswordProtectionSettings passwordProtectionSettings) {
        sq8.m48649h(authFlowType, "authFlowType");
        sq8.m48649h(list, "signUpAttributes");
        sq8.m48649h(list2, "usernameAttributes");
        sq8.m48649h(list3, "verificationMechanisms");
        return new AuthConfiguration(userPoolConfiguration, identityPoolConfiguration, oauthConfiguration, authFlowType, list, list2, list3, passwordProtectionSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthConfiguration)) {
            return false;
        }
        AuthConfiguration authConfiguration = (AuthConfiguration) obj;
        return sq8.m48644c(this.userPool, authConfiguration.userPool) && sq8.m48644c(this.identityPool, authConfiguration.identityPool) && sq8.m48644c(this.oauth, authConfiguration.oauth) && this.authFlowType == authConfiguration.authFlowType && sq8.m48644c(this.signUpAttributes, authConfiguration.signUpAttributes) && sq8.m48644c(this.usernameAttributes, authConfiguration.usernameAttributes) && sq8.m48644c(this.verificationMechanisms, authConfiguration.verificationMechanisms) && sq8.m48644c(this.passwordProtectionSettings, authConfiguration.passwordProtectionSettings);
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
        int iHashCode3 = (((((((((iHashCode2 + (oauthConfiguration == null ? 0 : oauthConfiguration.hashCode())) * 31) + this.authFlowType.hashCode()) * 31) + this.signUpAttributes.hashCode()) * 31) + this.usernameAttributes.hashCode()) * 31) + this.verificationMechanisms.hashCode()) * 31;
        PasswordProtectionSettings passwordProtectionSettings = this.passwordProtectionSettings;
        return iHashCode3 + (passwordProtectionSettings != null ? passwordProtectionSettings.hashCode() : 0);
    }

    public final JSONObject toGen1Json$aws_auth_cognito_release(String str) throws JSONException {
        sq8.m48649h(str, "configName");
        JSONObject jSONObject = new JSONObject();
        List<AuthUserAttributeKey> list = this.signUpAttributes;
        ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String keyString = ((AuthUserAttributeKey) it.next()).getKeyString();
            sq8.m48648g(keyString, "getKeyString(...)");
            String upperCase = keyString.toUpperCase(Locale.ROOT);
            sq8.m48648g(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        jSONObject.put("signupAttributes", new JSONArray((Collection) arrayList));
        List<UsernameAttribute> list2 = this.usernameAttributes;
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Companion.toGen1Json((UsernameAttribute) it2.next()));
        }
        jSONObject.put("usernameAttributes", new JSONArray((Collection) arrayList2));
        List<VerificationMechanism> list3 = this.verificationMechanisms;
        ArrayList arrayList3 = new ArrayList(dh3.m23088v(list3, 10));
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
        jSONObject2.put("Auth", new JSONObject().put(str, jSONObject));
        UserPoolConfiguration userPoolConfiguration = this.userPool;
        if (userPoolConfiguration != null) {
            jSONObject2.put("CognitoUserPool", new JSONObject().put(str, userPoolConfiguration.toGen1Json$aws_auth_cognito_release()));
        }
        IdentityPoolConfiguration identityPoolConfiguration = this.identityPool;
        if (identityPoolConfiguration != null) {
            jSONObject2.put("CredentialsProvider", new JSONObject().put("CognitoIdentity", new JSONObject().put(str, identityPoolConfiguration.toGen1Json$aws_auth_cognito_release())));
        }
        return jSONObject2;
    }

    public String toString() {
        return "AuthConfiguration(userPool=" + this.userPool + ", identityPool=" + this.identityPool + ", oauth=" + this.oauth + ", authFlowType=" + this.authFlowType + ", signUpAttributes=" + this.signUpAttributes + ", usernameAttributes=" + this.usernameAttributes + ", verificationMechanisms=" + this.verificationMechanisms + ", passwordProtectionSettings=" + this.passwordProtectionSettings + ")";
    }
}
