package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C10773c;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookRequestError;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.ai4;
import p001o.cri;
import p001o.di4;
import p001o.e9g;
import p001o.id5;
import p001o.is6;
import p001o.sq8;
import p001o.ur6;
import p001o.wr6;
import p001o.xj8;
import p001o.za;

/* loaded from: classes5.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    /* renamed from: y */
    public static boolean f11519y;

    /* renamed from: f */
    public String f11520f;

    /* renamed from: g */
    public String f11521g;

    /* renamed from: h */
    public String f11522h;

    /* renamed from: q */
    public final String f11523q;

    /* renamed from: s */
    public final za f11524s;

    /* renamed from: x */
    public static final C10793b f11518x = new C10793b(null);
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C10792a();

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    public static final class C10792a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$b */
    public static final class C10793b {
        public C10793b() {
        }

        public /* synthetic */ C10793b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
        this.f11523q = "custom_tab";
        this.f11524s = za.CHROME_CUSTOM_TAB;
        this.f11521g = cri.m21672t(20);
        f11519y = false;
        this.f11522h = di4.m23199c(m13192y());
    }

    /* renamed from: A */
    public static final void m13181A(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        sq8.m48649h(customTabLoginMethodHandler, "this$0");
        sq8.m48649h(request, "$request");
        sq8.m48649h(bundle, "$values");
        try {
            customTabLoginMethodHandler.m13335u(request, customTabLoginMethodHandler.m13314k(request, bundle), null);
        } catch (ur6 e) {
            customTabLoginMethodHandler.m13335u(request, null, e);
        }
    }

    /* renamed from: B */
    public final boolean m13183B(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return sq8.m48644c(new JSONObject(string).getString("7_challenge"), this.f11521g);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo13184f() {
        return this.f11523q;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    public String mo13185g() {
        return this.f11522h;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: j */
    public boolean mo13186j(int i, int i2, Intent intent) throws NumberFormatException {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f11301s, false)) {
            return super.mo13186j(i, i2, intent);
        }
        if (i != 1) {
            return super.mo13186j(i, i2, intent);
        }
        LoginClient.Request requestM13252o = m13310d().m13252o();
        if (requestM13252o == null) {
            return false;
        }
        if (i2 == -1) {
            m13193z(intent != null ? intent.getStringExtra(CustomTabMainActivity.f11298g) : null, requestM13252o);
            return true;
        }
        super.m13335u(requestM13252o, null, new wr6());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: l */
    public void mo13187l(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "param");
        jSONObject.put("7_challenge", this.f11521g);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo13188o(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        LoginClient loginClientM13310d = m13310d();
        if (mo13185g().length() == 0) {
            return 0;
        }
        Bundle bundleM13332p = m13332p(m13333q(request), request);
        if (f11519y) {
            bundleM13332p.putString("cct_over_app_switch", "1");
        }
        if (C10773c.f11412q) {
            if (request.m13282r()) {
                C10826a.f11635a.m13357c(xj8.f53848c.m56381a("oauth", bundleM13332p));
            } else {
                C10826a.f11635a.m13357c(ai4.f14771b.m17141a("oauth", bundleM13332p));
            }
        }
        FragmentActivity fragmentActivityM13246i = loginClientM13310d.m13246i();
        if (fragmentActivityM13246i == null) {
            return 0;
        }
        Intent intent = new Intent(fragmentActivityM13246i, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f11295d, "oauth");
        intent.putExtra(CustomTabMainActivity.f11296e, bundleM13332p);
        intent.putExtra(CustomTabMainActivity.f11297f, m13191x());
        intent.putExtra(CustomTabMainActivity.f11299h, request.m13275k().toString());
        Fragment fragmentM13248k = loginClientM13310d.m13248k();
        if (fragmentM13248k != null) {
            fragmentM13248k.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: r */
    public String mo13189r() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: s */
    public za mo13190s() {
        return this.f11524s;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11521g);
    }

    /* renamed from: x */
    public final String m13191x() {
        String str = this.f11520f;
        if (str != null) {
            return str;
        }
        String strM23197a = di4.m23197a();
        this.f11520f = strM23197a;
        return strM23197a;
    }

    /* renamed from: y */
    public final String m13192y() {
        return super.mo13185g();
    }

    /* renamed from: z */
    public final void m13193z(String str, final LoginClient.Request request) throws NumberFormatException {
        int i;
        if (str != null) {
            if (e9g.m24597K(str, "fbconnect://cct.", false, 2, null) || e9g.m24597K(str, super.mo13185g(), false, 2, null)) {
                Uri uri = Uri.parse(str);
                final Bundle bundleP0 = cri.p0(uri.getQuery());
                bundleP0.putAll(cri.p0(uri.getFragment()));
                if (!m13183B(bundleP0)) {
                    super.m13335u(request, null, new ur6("Invalid state parameter"));
                    return;
                }
                String string = bundleP0.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                if (string == null) {
                    string = bundleP0.getString("error_type");
                }
                String string2 = bundleP0.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleP0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleP0.getString("error_description");
                }
                String string3 = bundleP0.getString("error_code");
                if (string3 != null) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    i = -1;
                }
                if (cri.d0(string) && cri.d0(string2) && i == -1) {
                    if (bundleP0.containsKey("access_token")) {
                        super.m13335u(request, bundleP0, null);
                        return;
                    } else {
                        C10773c.m13028u().execute(new Runnable() { // from class: o.ci4
                            @Override // java.lang.Runnable
                            public final void run() {
                                CustomTabLoginMethodHandler.m13181A(this.f18220a, request, bundleP0);
                            }
                        });
                        return;
                    }
                }
                if (string != null && (sq8.m48644c(string, "access_denied") || sq8.m48644c(string, "OAuthAccessDeniedException"))) {
                    super.m13335u(request, null, new wr6());
                } else if (i == 4201) {
                    super.m13335u(request, null, new wr6());
                } else {
                    super.m13335u(request, null, new is6(new FacebookRequestError(i, string, string2), string2));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
        this.f11523q = "custom_tab";
        this.f11524s = za.CHROME_CUSTOM_TAB;
        this.f11521g = parcel.readString();
        this.f11522h = di4.m23199c(m13192y());
    }
}
