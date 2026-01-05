package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.cognito.helpers.HostedUIHelper;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class OauthConfiguration {
    private static final String APP_CLIENT_ID = "AppClientId";
    private static final String APP_CLIENT_SECRET = "AppClientSecret";
    public static final Companion Companion = new Companion(null);
    private static final String SCOPES = "Scopes";
    private static final String SIGN_IN_REDIRECT_URI = "SignInRedirectURI";
    private static final String SIGN_OUT_REDIRECT_URI = "SignOutRedirectURI";
    private static final String WEB_DOMAIN = "WebDomain";
    private final String appClient;
    private final String appSecret;
    private final String domain;
    private final Set<String> scopes;
    private final String signInRedirectURI;
    private final String signOutRedirectURI;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final OauthConfiguration fromJson(JSONObject jSONObject) {
            LinkedHashSet linkedHashSet;
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(OauthConfiguration.APP_CLIENT_ID);
                String str = (strOptString == null || strOptString.length() == 0) ? null : strOptString;
                String strOptString2 = jSONObject.optString(OauthConfiguration.APP_CLIENT_SECRET, null);
                String str2 = (strOptString2 == null || strOptString2.length() == 0) ? null : strOptString2;
                String strOptString3 = jSONObject.optString(OauthConfiguration.WEB_DOMAIN);
                String str3 = (strOptString3 == null || strOptString3.length() == 0) ? null : strOptString3;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(OauthConfiguration.SCOPES);
                if (jSONArrayOptJSONArray != null) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String strOptString4 = jSONArrayOptJSONArray.optString(i10);
                        if (strOptString4 != null) {
                            linkedHashSet2.add(strOptString4);
                        }
                    }
                    linkedHashSet = linkedHashSet2;
                } else {
                    linkedHashSet = null;
                }
                String strOptString5 = jSONObject.optString(OauthConfiguration.SIGN_IN_REDIRECT_URI);
                if (strOptString5 == null || strOptString5.length() == 0) {
                    strOptString5 = null;
                }
                List<String> listM10112W = C6668r.f31943a;
                List<String> listM10112W2 = strOptString5 != null ? AbstractC5178p.m10112W(strOptString5, new String[]{","}, 6) : listM10112W;
                String strOptString6 = jSONObject.optString(OauthConfiguration.SIGN_OUT_REDIRECT_URI);
                if (strOptString6 == null || strOptString6.length() == 0) {
                    strOptString6 = null;
                }
                if (strOptString6 != null) {
                    listM10112W = AbstractC5178p.m10112W(strOptString6, new String[]{","}, 6);
                }
                HostedUIHelper hostedUIHelper = HostedUIHelper.INSTANCE;
                String strSelectRedirectUri = hostedUIHelper.selectRedirectUri(listM10112W2);
                String strSelectRedirectUri2 = hostedUIHelper.selectRedirectUri(listM10112W);
                if (str != null && str3 != null && linkedHashSet != null && strSelectRedirectUri != null && strSelectRedirectUri2 != null) {
                    return new OauthConfiguration(str, str2, str3, linkedHashSet, strSelectRedirectUri, strSelectRedirectUri2);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public OauthConfiguration(String appClient, String str, String domain, Set<String> scopes, String signInRedirectURI, String signOutRedirectURI) {
        AbstractC4154l.m8923f(appClient, "appClient");
        AbstractC4154l.m8923f(domain, "domain");
        AbstractC4154l.m8923f(scopes, "scopes");
        AbstractC4154l.m8923f(signInRedirectURI, "signInRedirectURI");
        AbstractC4154l.m8923f(signOutRedirectURI, "signOutRedirectURI");
        this.appClient = appClient;
        this.appSecret = str;
        this.domain = domain;
        this.scopes = scopes;
        this.signInRedirectURI = signInRedirectURI;
        this.signOutRedirectURI = signOutRedirectURI;
    }

    public static /* synthetic */ OauthConfiguration copy$aws_auth_cognito_release$default(OauthConfiguration oauthConfiguration, String str, String str2, String str3, Set set, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oauthConfiguration.appClient;
        }
        if ((i10 & 2) != 0) {
            str2 = oauthConfiguration.appSecret;
        }
        if ((i10 & 4) != 0) {
            str3 = oauthConfiguration.domain;
        }
        if ((i10 & 8) != 0) {
            set = oauthConfiguration.scopes;
        }
        if ((i10 & 16) != 0) {
            str4 = oauthConfiguration.signInRedirectURI;
        }
        if ((i10 & 32) != 0) {
            str5 = oauthConfiguration.signOutRedirectURI;
        }
        String str6 = str4;
        String str7 = str5;
        return oauthConfiguration.copy$aws_auth_cognito_release(str, str2, str3, set, str6, str7);
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

    public final OauthConfiguration copy$aws_auth_cognito_release(String appClient, String str, String domain, Set<String> scopes, String signInRedirectURI, String signOutRedirectURI) {
        AbstractC4154l.m8923f(appClient, "appClient");
        AbstractC4154l.m8923f(domain, "domain");
        AbstractC4154l.m8923f(scopes, "scopes");
        AbstractC4154l.m8923f(signInRedirectURI, "signInRedirectURI");
        AbstractC4154l.m8923f(signOutRedirectURI, "signOutRedirectURI");
        return new OauthConfiguration(appClient, str, domain, scopes, signInRedirectURI, signOutRedirectURI);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OauthConfiguration)) {
            return false;
        }
        OauthConfiguration oauthConfiguration = (OauthConfiguration) obj;
        return AbstractC4154l.m8918a(this.appClient, oauthConfiguration.appClient) && AbstractC4154l.m8918a(this.appSecret, oauthConfiguration.appSecret) && AbstractC4154l.m8918a(this.domain, oauthConfiguration.domain) && AbstractC4154l.m8918a(this.scopes, oauthConfiguration.scopes) && AbstractC4154l.m8918a(this.signInRedirectURI, oauthConfiguration.signInRedirectURI) && AbstractC4154l.m8918a(this.signOutRedirectURI, oauthConfiguration.signOutRedirectURI);
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
        return this.signOutRedirectURI.hashCode() + AbstractC0030c.m113d((this.scopes.hashCode() + AbstractC0030c.m113d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.domain)) * 31, 31, this.signInRedirectURI);
    }

    public final JSONObject toGen1Json$aws_auth_cognito_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(APP_CLIENT_ID, this.appClient);
        String str = this.appSecret;
        if (str != null) {
            jSONObject.put(APP_CLIENT_SECRET, str);
        }
        jSONObject.put(WEB_DOMAIN, this.domain);
        jSONObject.put(SCOPES, new JSONArray((Collection) this.scopes));
        jSONObject.put(SIGN_IN_REDIRECT_URI, this.signInRedirectURI);
        jSONObject.put(SIGN_OUT_REDIRECT_URI, this.signOutRedirectURI);
        return jSONObject;
    }

    public String toString() {
        String str = this.appClient;
        String str2 = this.appSecret;
        String str3 = this.domain;
        Set<String> set = this.scopes;
        String str4 = this.signInRedirectURI;
        String str5 = this.signOutRedirectURI;
        StringBuilder sbM127r = AbstractC0030c.m127r("OauthConfiguration(appClient=", str, ", appSecret=", str2, ", domain=");
        sbM127r.append(str3);
        sbM127r.append(", scopes=");
        sbM127r.append(set);
        sbM127r.append(", signInRedirectURI=");
        return AbstractC0030c.m124o(sbM127r, str4, ", signOutRedirectURI=", str5, ")");
    }
}
