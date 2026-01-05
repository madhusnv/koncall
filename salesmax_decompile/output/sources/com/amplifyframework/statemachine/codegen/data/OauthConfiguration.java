package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class OauthConfiguration {
    private static final String AppClientId = "AppClientId";
    private static final String AppClientSecret = "AppClientSecret";
    public static final Companion Companion = new Companion(null);
    private static final String Scopes = "Scopes";
    private static final String SignInRedirectURI = "SignInRedirectURI";
    private static final String SignOutRedirectURI = "SignOutRedirectURI";
    private static final String WebDomain = "WebDomain";
    private final String appClient;
    private final String appSecret;
    private final String domain;
    private final Set<String> scopes;
    private final String signInRedirectURI;
    private final String signOutRedirectURI;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final OauthConfiguration fromJson(JSONObject jSONObject) {
            LinkedHashSet linkedHashSet;
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(OauthConfiguration.AppClientId);
                String str = !(strOptString == null || strOptString.length() == 0) ? strOptString : null;
                String strOptString2 = jSONObject.optString(OauthConfiguration.AppClientSecret, null);
                String str2 = !(strOptString2 == null || strOptString2.length() == 0) ? strOptString2 : null;
                String strOptString3 = jSONObject.optString(OauthConfiguration.WebDomain);
                String str3 = !(strOptString3 == null || strOptString3.length() == 0) ? strOptString3 : null;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(OauthConfiguration.Scopes);
                if (jSONArrayOptJSONArray != null) {
                    sq8.m48646e(jSONArrayOptJSONArray);
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String strOptString4 = jSONArrayOptJSONArray.optString(i);
                        if (strOptString4 != null) {
                            sq8.m48646e(strOptString4);
                            linkedHashSet2.add(strOptString4);
                        }
                    }
                    linkedHashSet = linkedHashSet2;
                } else {
                    linkedHashSet = null;
                }
                String strOptString5 = jSONObject.optString(OauthConfiguration.SignInRedirectURI);
                String str4 = !(strOptString5 == null || strOptString5.length() == 0) ? strOptString5 : null;
                String strOptString6 = jSONObject.optString(OauthConfiguration.SignOutRedirectURI);
                String str5 = !(strOptString6 == null || strOptString6.length() == 0) ? strOptString6 : null;
                if (str != null && str3 != null && linkedHashSet != null && str4 != null && str5 != null) {
                    return new OauthConfiguration(str, str2, str3, linkedHashSet, str4, str5);
                }
            }
            return null;
        }
    }

    public OauthConfiguration(String str, String str2, String str3, Set<String> set, String str4, String str5) {
        sq8.m48649h(str, "appClient");
        sq8.m48649h(str3, ClientCookie.DOMAIN_ATTR);
        sq8.m48649h(set, "scopes");
        sq8.m48649h(str4, "signInRedirectURI");
        sq8.m48649h(str5, "signOutRedirectURI");
        this.appClient = str;
        this.appSecret = str2;
        this.domain = str3;
        this.scopes = set;
        this.signInRedirectURI = str4;
        this.signOutRedirectURI = str5;
    }

    public static /* synthetic */ OauthConfiguration copy$default(OauthConfiguration oauthConfiguration, String str, String str2, String str3, Set set, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oauthConfiguration.appClient;
        }
        if ((i & 2) != 0) {
            str2 = oauthConfiguration.appSecret;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oauthConfiguration.domain;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            set = oauthConfiguration.scopes;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            str4 = oauthConfiguration.signInRedirectURI;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = oauthConfiguration.signOutRedirectURI;
        }
        return oauthConfiguration.copy(str, str6, str7, set2, str8, str5);
    }

    public final String component1() {
        return this.appClient;
    }

    public final String component2() {
        return this.appSecret;
    }

    public final String component3() {
        return this.domain;
    }

    public final Set<String> component4() {
        return this.scopes;
    }

    public final String component5() {
        return this.signInRedirectURI;
    }

    public final String component6() {
        return this.signOutRedirectURI;
    }

    public final OauthConfiguration copy(String str, String str2, String str3, Set<String> set, String str4, String str5) {
        sq8.m48649h(str, "appClient");
        sq8.m48649h(str3, ClientCookie.DOMAIN_ATTR);
        sq8.m48649h(set, "scopes");
        sq8.m48649h(str4, "signInRedirectURI");
        sq8.m48649h(str5, "signOutRedirectURI");
        return new OauthConfiguration(str, str2, str3, set, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OauthConfiguration)) {
            return false;
        }
        OauthConfiguration oauthConfiguration = (OauthConfiguration) obj;
        return sq8.m48644c(this.appClient, oauthConfiguration.appClient) && sq8.m48644c(this.appSecret, oauthConfiguration.appSecret) && sq8.m48644c(this.domain, oauthConfiguration.domain) && sq8.m48644c(this.scopes, oauthConfiguration.scopes) && sq8.m48644c(this.signInRedirectURI, oauthConfiguration.signInRedirectURI) && sq8.m48644c(this.signOutRedirectURI, oauthConfiguration.signOutRedirectURI);
    }

    public final String getAppClient() {
        return this.appClient;
    }

    public final String getAppSecret() {
        return this.appSecret;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Set<String> getScopes() {
        return this.scopes;
    }

    public final String getSignInRedirectURI() {
        return this.signInRedirectURI;
    }

    public final String getSignOutRedirectURI() {
        return this.signOutRedirectURI;
    }

    public int hashCode() {
        int iHashCode = this.appClient.hashCode() * 31;
        String str = this.appSecret;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.domain.hashCode()) * 31) + this.scopes.hashCode()) * 31) + this.signInRedirectURI.hashCode()) * 31) + this.signOutRedirectURI.hashCode();
    }

    public final JSONObject toGen1Json$aws_auth_cognito_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppClientId, this.appClient);
        String str = this.appSecret;
        if (str != null) {
            jSONObject.put(AppClientSecret, str);
        }
        jSONObject.put(WebDomain, this.domain);
        jSONObject.put(Scopes, new JSONArray((Collection) this.scopes));
        jSONObject.put(SignInRedirectURI, this.signInRedirectURI);
        jSONObject.put(SignOutRedirectURI, this.signOutRedirectURI);
        return jSONObject;
    }

    public String toString() {
        return "OauthConfiguration(appClient=" + this.appClient + ", appSecret=" + this.appSecret + ", domain=" + this.domain + ", scopes=" + this.scopes + ", signInRedirectURI=" + this.signInRedirectURI + ", signOutRedirectURI=" + this.signOutRedirectURI + ")";
    }
}
