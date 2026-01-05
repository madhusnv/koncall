package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.C10773c;
import com.facebook.FacebookRequestError;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.common.Scopes;
import p001o.cri;
import p001o.id5;
import p001o.is6;
import p001o.sq8;
import p001o.ur6;
import p001o.wr6;
import p001o.ye3;
import p001o.za;
import p001o.za5;

/* loaded from: classes5.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: e */
    public static final C10821a f11618e = new C10821a(null);

    /* renamed from: d */
    public String f11619d;

    /* renamed from: com.facebook.login.WebLoginMethodHandler$a */
    public static final class C10821a {
        public C10821a() {
        }

        public /* synthetic */ C10821a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
    }

    /* renamed from: p */
    public Bundle m13332p(Bundle bundle, LoginClient.Request request) {
        sq8.m48649h(bundle, "parameters");
        sq8.m48649h(request, "request");
        bundle.putString("redirect_uri", mo13185g());
        if (request.m13282r()) {
            bundle.putString("app_id", request.m13265a());
        } else {
            bundle.putString("client_id", request.m13265a());
        }
        bundle.putString("e2e", LoginClient.f11564H.m13304a());
        if (request.m13282r()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.m13278n().contains(Scopes.OPEN_ID)) {
                bundle.putString("nonce", request.m13277m());
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", request.m13268d());
        ye3 ye3VarM13269e = request.m13269e();
        bundle.putString("code_challenge_method", ye3VarM13269e != null ? ye3VarM13269e.name() : null);
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.m13267c());
        bundle.putString("login_behavior", request.m13274j().name());
        bundle.putString("sdk", "android-" + C10773c.m12989C());
        if (mo13189r() != null) {
            bundle.putString("sso", mo13189r());
        }
        bundle.putString("cct_prefetching", C10773c.f11412q ? "1" : "0");
        if (request.m13281q()) {
            bundle.putString("fx_app", request.m13275k().toString());
        }
        if (request.m13264A()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (request.m13276l() != null) {
            bundle.putString("messenger_page_id", request.m13276l());
            bundle.putString("reset_messenger_state", request.m13279o() ? "1" : "0");
        }
        return bundle;
    }

    /* renamed from: q */
    public Bundle m13333q(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        Bundle bundle = new Bundle();
        if (!cri.e0(request.m13278n())) {
            String strJoin = TextUtils.join(",", request.m13278n());
            bundle.putString("scope", strJoin);
            m13308a("scope", strJoin);
        }
        za5 za5VarM13271g = request.m13271g();
        if (za5VarM13271g == null) {
            za5VarM13271g = za5.NONE;
        }
        bundle.putString("default_audience", za5VarM13271g.getNativeProtocolAudience());
        bundle.putString("state", m13309c(request.m13266b()));
        AccessToken accessTokenM12774e = AccessToken.f11242y.m12774e();
        String strM12760l = accessTokenM12774e != null ? accessTokenM12774e.m12760l() : null;
        if (strM12760l == null || !sq8.m48644c(strM12760l, m13334t())) {
            FragmentActivity fragmentActivityM13246i = m13310d().m13246i();
            if (fragmentActivityM13246i != null) {
                cri.m21663i(fragmentActivityM13246i);
            }
            m13308a("access_token", "0");
        } else {
            bundle.putString("access_token", strM12760l);
            m13308a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", C10773c.m13023p() ? "1" : "0");
        return bundle;
    }

    /* renamed from: r */
    public String mo13189r() {
        return null;
    }

    /* renamed from: s */
    public abstract za mo13190s();

    /* renamed from: t */
    public final String m13334t() {
        Context contextM13246i = m13310d().m13246i();
        if (contextM13246i == null) {
            contextM13246i = C10773c.m13019l();
        }
        return contextM13246i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* renamed from: u */
    public void m13335u(LoginClient.Request request, Bundle bundle, ur6 ur6Var) {
        String strValueOf;
        LoginClient.Result resultM13298c;
        sq8.m48649h(request, "request");
        LoginClient loginClientM13310d = m13310d();
        this.f11619d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f11619d = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.C10820a c10820a = LoginMethodHandler.f11614c;
                AccessToken accessTokenM13317b = c10820a.m13317b(request.m13278n(), bundle, mo13190s(), request.m13265a());
                resultM13298c = LoginClient.Result.f11596q.m13297b(loginClientM13310d.m13252o(), accessTokenM13317b, c10820a.m13319d(bundle, request.m13277m()));
                if (loginClientM13310d.m13246i() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientM13310d.m13246i()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenM13317b != null) {
                        m13336v(accessTokenM13317b.m12760l());
                    }
                }
            } catch (ur6 e) {
                resultM13298c = LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, loginClientM13310d.m13252o(), null, e.getMessage(), null, 8, null);
            }
        } else if (ur6Var instanceof wr6) {
            resultM13298c = LoginClient.Result.f11596q.m13296a(loginClientM13310d.m13252o(), "User canceled log in.");
        } else {
            this.f11619d = null;
            String message = ur6Var != null ? ur6Var.getMessage() : null;
            if (ur6Var instanceof is6) {
                FacebookRequestError facebookRequestErrorM32672c = ((is6) ur6Var).m32672c();
                strValueOf = String.valueOf(facebookRequestErrorM32672c.m12820b());
                message = facebookRequestErrorM32672c.toString();
            } else {
                strValueOf = null;
            }
            resultM13298c = LoginClient.Result.f11596q.m13298c(loginClientM13310d.m13252o(), null, message, strValueOf);
        }
        if (!cri.d0(this.f11619d)) {
            m13312h(this.f11619d);
        }
        loginClientM13310d.m13244g(resultM13298c);
    }

    /* renamed from: v */
    public final void m13336v(String str) {
        Context contextM13246i = m13310d().m13246i();
        if (contextM13246i == null) {
            contextM13246i = C10773c.m13019l();
        }
        contextM13246i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
    }
}
