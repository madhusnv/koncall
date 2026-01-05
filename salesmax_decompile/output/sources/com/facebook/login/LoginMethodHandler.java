package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import com.google.firebase.messaging.Constants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.ao8;
import p001o.ch3;
import p001o.cri;
import p001o.eic;
import p001o.f9g;
import p001o.id5;
import p001o.is6;
import p001o.isa;
import p001o.sh2;
import p001o.sq8;
import p001o.ur6;
import p001o.za;

/* loaded from: classes5.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: c */
    public static final C10820a f11614c = new C10820a(null);

    /* renamed from: a */
    public Map f11615a;

    /* renamed from: b */
    public LoginClient f11616b;

    /* renamed from: com.facebook.login.LoginMethodHandler$a */
    public static final class C10820a {
        public C10820a() {
        }

        public /* synthetic */ C10820a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final AccessToken m13316a(Bundle bundle, za zaVar, String str) throws NumberFormatException {
            String string;
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, "applicationId");
            Date dateM21676y = cri.m21676y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateM21676y2 = cri.m21676y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (!(string.length() == 0)) {
                        return new AccessToken(string2, str, string, stringArrayList, null, null, zaVar, dateM21676y, new Date(), dateM21676y2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AccessToken m13317b(Collection collection, Bundle bundle, za zaVar, String str) throws NumberFormatException {
            Collection collectionM21242g;
            ArrayList arrayListM21242g;
            ArrayList arrayListM21242g2;
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, "applicationId");
            Date dateM21676y = cri.m21676y(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date dateM21676y2 = cri.m21676y(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null) {
                collectionM21242g = collection;
            } else {
                if (string2.length() > 0) {
                    String[] strArr = (String[]) f9g.D0(string2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    collectionM21242g = ch3.m21242g(Arrays.copyOf(strArr, strArr.length));
                }
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null) {
                arrayListM21242g = null;
            } else {
                if (string3.length() > 0) {
                    String[] strArr2 = (String[]) f9g.D0(string3, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    arrayListM21242g = ch3.m21242g(Arrays.copyOf(strArr2, strArr2.length));
                }
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null) {
                arrayListM21242g2 = null;
            } else {
                if (string4.length() > 0) {
                    String[] strArr3 = (String[]) f9g.D0(string4, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    arrayListM21242g2 = ch3.m21242g(Arrays.copyOf(strArr3, strArr3.length));
                }
            }
            if (cri.d0(string)) {
                return null;
            }
            return new AccessToken(string, str, m13320e(bundle.getString("signed_request")), collectionM21242g, arrayListM21242g, arrayListM21242g2, zaVar, dateM21676y, new Date(), dateM21676y2, bundle.getString("graph_domain"));
        }

        /* renamed from: c */
        public final AuthenticationToken m13318c(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e) {
                            throw new ur6(e.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: d */
        public final AuthenticationToken m13319d(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e) {
                            throw new ur6(e.getMessage(), e);
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: e */
        public final String m13320e(String str) throws JSONException {
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        String[] strArr = (String[]) f9g.D0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                        if (strArr.length == 2) {
                            byte[] bArrDecode = Base64.decode(strArr[1], 0);
                            sq8.m48648g(bArrDecode, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            String string = new JSONObject(new String(bArrDecode, sh2.f45422b)).getString("user_id");
                            sq8.m48648g(string, "jsonObject.getString(\"user_id\")");
                            return string;
                        }
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    throw new ur6("Failed to retrieve user_id from signed_request");
                }
            }
            throw new ur6("Authorization response does not contain the signed_request");
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        sq8.m48649h(loginClient, "loginClient");
        m13315m(loginClient);
    }

    /* renamed from: a */
    public void m13308a(String str, Object obj) {
        if (this.f11615a == null) {
            this.f11615a = new HashMap();
        }
        Map map = this.f11615a;
        if (map != null) {
        }
    }

    /* renamed from: b */
    public void mo13224b() {
    }

    /* renamed from: c */
    public String m13309c(String str) {
        sq8.m48649h(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo13184f());
            mo13187l(jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating client state json: ");
            sb.append(e.getMessage());
        }
        String string = jSONObject.toString();
        sq8.m48648g(string, "param.toString()");
        return string;
    }

    /* renamed from: d */
    public final LoginClient m13310d() {
        LoginClient loginClient = this.f11616b;
        if (loginClient != null) {
            return loginClient;
        }
        sq8.m48667z("loginClient");
        return null;
    }

    /* renamed from: e */
    public final Map m13311e() {
        return this.f11615a;
    }

    /* renamed from: f */
    public abstract String mo13184f();

    /* renamed from: g */
    public String mo13185g() {
        return "fb" + C10773c.m13020m() + "://authorize/";
    }

    /* renamed from: h */
    public void m13312h(String str) {
        String strM13020m;
        LoginClient.Request requestM13252o = m13310d().m13252o();
        if (requestM13252o == null || (strM13020m = requestM13252o.m13265a()) == null) {
            strM13020m = C10773c.m13020m();
        }
        ao8 ao8Var = new ao8(m13310d().m13246i(), strM13020m);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", strM13020m);
        ao8Var.m17565h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    /* renamed from: i */
    public boolean mo13313i() {
        return false;
    }

    /* renamed from: j */
    public boolean mo13186j(int i, int i2, Intent intent) {
        return false;
    }

    /* renamed from: k */
    public Bundle m13314k(LoginClient.Request request, Bundle bundle) {
        sq8.m48649h(request, "request");
        sq8.m48649h(bundle, "values");
        String string = bundle.getString("code");
        if (cri.d0(string)) {
            throw new ur6("No code param found from the request");
        }
        if (string != null) {
            String strMo13185g = mo13185g();
            String strM13270f = request.m13270f();
            if (strM13270f == null) {
                strM13270f = "";
            }
            GraphRequest graphRequestM25115a = eic.m25115a(string, strMo13185g, strM13270f);
            if (graphRequestM25115a != null) {
                C10776f c10776fM12851k = graphRequestM25115a.m12851k();
                FacebookRequestError facebookRequestErrorM13064b = c10776fM12851k.m13064b();
                if (facebookRequestErrorM13064b != null) {
                    throw new is6(facebookRequestErrorM13064b, facebookRequestErrorM13064b.m12821c());
                }
                try {
                    JSONObject jSONObjectM13065c = c10776fM12851k.m13065c();
                    String string2 = jSONObjectM13065c != null ? jSONObjectM13065c.getString("access_token") : null;
                    if (jSONObjectM13065c == null || cri.d0(string2)) {
                        throw new ur6("No access token found from result");
                    }
                    bundle.putString("access_token", string2);
                    if (jSONObjectM13065c.has("id_token")) {
                        bundle.putString("id_token", jSONObjectM13065c.getString("id_token"));
                    }
                    return bundle;
                } catch (JSONException e) {
                    throw new ur6("Fail to process code exchange response: " + e.getMessage());
                }
            }
        }
        throw new ur6("Failed to create code exchange request");
    }

    /* renamed from: l */
    public void mo13187l(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "param");
    }

    /* renamed from: m */
    public final void m13315m(LoginClient loginClient) {
        sq8.m48649h(loginClient, "<set-?>");
        this.f11616b = loginClient;
    }

    /* renamed from: n */
    public boolean mo13233n() {
        return false;
    }

    /* renamed from: o */
    public abstract int mo13188o(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        cri.I0(parcel, this.f11615a);
    }

    public LoginMethodHandler(Parcel parcel) {
        sq8.m48649h(parcel, "source");
        Map mapU0 = cri.u0(parcel);
        this.f11615a = mapU0 != null ? isa.m32696w(mapU0) : null;
    }
}
