package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginClient;
import p001o.cri;
import p001o.fka;
import p001o.id5;
import p001o.sq8;
import p001o.ur6;
import p001o.xka;
import p001o.za;

/* loaded from: classes5.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    /* renamed from: f */
    public WebDialog f11621f;

    /* renamed from: g */
    public String f11622g;

    /* renamed from: h */
    public final String f11623h;

    /* renamed from: q */
    public final za f11624q;

    /* renamed from: s */
    public static final C10824c f11620s = new C10824c(null);
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C10823b();

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    public final class C10822a extends WebDialog.C10783a {

        /* renamed from: h */
        public String f11625h;

        /* renamed from: i */
        public fka f11626i;

        /* renamed from: j */
        public xka f11627j;

        /* renamed from: k */
        public boolean f11628k;

        /* renamed from: l */
        public boolean f11629l;

        /* renamed from: m */
        public String f11630m;

        /* renamed from: n */
        public String f11631n;

        /* renamed from: o */
        public final /* synthetic */ WebViewLoginMethodHandler f11632o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10822a(WebViewLoginMethodHandler webViewLoginMethodHandler, Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            sq8.m48649h(context, "context");
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(bundle, "parameters");
            this.f11632o = webViewLoginMethodHandler;
            this.f11625h = "fbconnect://success";
            this.f11626i = fka.NATIVE_WITH_FALLBACK;
            this.f11627j = xka.FACEBOOK;
        }

        @Override // com.facebook.internal.WebDialog.C10783a
        /* renamed from: a */
        public WebDialog mo13130a() {
            Bundle bundleM13135f = m13135f();
            sq8.m48647f(bundleM13135f, "null cannot be cast to non-null type android.os.Bundle");
            bundleM13135f.putString("redirect_uri", this.f11625h);
            bundleM13135f.putString("client_id", m13132c());
            bundleM13135f.putString("e2e", m13339j());
            bundleM13135f.putString("response_type", this.f11627j == xka.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundleM13135f.putString("return_scopes", "true");
            bundleM13135f.putString("auth_type", m13338i());
            bundleM13135f.putString("login_behavior", this.f11626i.name());
            if (this.f11628k) {
                bundleM13135f.putString("fx_app", this.f11627j.toString());
            }
            if (this.f11629l) {
                bundleM13135f.putString("skip_dedupe", "true");
            }
            WebDialog.C10784b c10784b = WebDialog.f11467H;
            Context contextM13133d = m13133d();
            sq8.m48647f(contextM13133d, "null cannot be cast to non-null type android.content.Context");
            return c10784b.m13141d(contextM13133d, "oauth", bundleM13135f, m13136g(), this.f11627j, m13134e());
        }

        /* renamed from: i */
        public final String m13338i() {
            String str = this.f11631n;
            if (str != null) {
                return str;
            }
            sq8.m48667z("authType");
            return null;
        }

        /* renamed from: j */
        public final String m13339j() {
            String str = this.f11630m;
            if (str != null) {
                return str;
            }
            sq8.m48667z("e2e");
            return null;
        }

        /* renamed from: k */
        public final C10822a m13340k(String str) {
            sq8.m48649h(str, "authType");
            m13341l(str);
            return this;
        }

        /* renamed from: l */
        public final void m13341l(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f11631n = str;
        }

        /* renamed from: m */
        public final C10822a m13342m(String str) {
            sq8.m48649h(str, "e2e");
            m13343n(str);
            return this;
        }

        /* renamed from: n */
        public final void m13343n(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f11630m = str;
        }

        /* renamed from: o */
        public final C10822a m13344o(boolean z) {
            this.f11628k = z;
            return this;
        }

        /* renamed from: p */
        public final C10822a m13345p(boolean z) {
            this.f11625h = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        /* renamed from: q */
        public final C10822a m13346q(fka fkaVar) {
            sq8.m48649h(fkaVar, "loginBehavior");
            this.f11626i = fkaVar;
            return this;
        }

        /* renamed from: r */
        public final C10822a m13347r(xka xkaVar) {
            sq8.m48649h(xkaVar, "targetApp");
            this.f11627j = xkaVar;
            return this;
        }

        /* renamed from: s */
        public final C10822a m13348s(boolean z) {
            this.f11629l = z;
            return this;
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    public static final class C10823b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    public static final class C10824c {
        public C10824c() {
        }

        public /* synthetic */ C10824c(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$d */
    public static final class C10825d implements WebDialog.InterfaceC10786d {

        /* renamed from: b */
        public final /* synthetic */ LoginClient.Request f11634b;

        public C10825d(LoginClient.Request request) {
            this.f11634b = request;
        }

        @Override // com.facebook.internal.WebDialog.InterfaceC10786d
        /* renamed from: a */
        public void mo13143a(Bundle bundle, ur6 ur6Var) {
            WebViewLoginMethodHandler.this.m13337w(this.f11634b, bundle, ur6Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
        this.f11623h = "web_view";
        this.f11624q = za.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: b */
    public void mo13224b() {
        WebDialog webDialog = this.f11621f;
        if (webDialog != null) {
            if (webDialog != null) {
                webDialog.cancel();
            }
            this.f11621f = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo13184f() {
        return this.f11623h;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: i */
    public boolean mo13313i() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo13188o(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        Bundle bundleM13333q = m13333q(request);
        C10825d c10825d = new C10825d(request);
        String strM13304a = LoginClient.f11564H.m13304a();
        this.f11622g = strM13304a;
        m13308a("e2e", strM13304a);
        FragmentActivity fragmentActivityM13246i = m13310d().m13246i();
        if (fragmentActivityM13246i == null) {
            return 0;
        }
        boolean zM21655X = cri.m21655X(fragmentActivityM13246i);
        C10822a c10822a = new C10822a(this, fragmentActivityM13246i, request.m13265a(), bundleM13333q);
        String str = this.f11622g;
        sq8.m48647f(str, "null cannot be cast to non-null type kotlin.String");
        this.f11621f = c10822a.m13342m(str).m13345p(zM21655X).m13340k(request.m13267c()).m13346q(request.m13274j()).m13347r(request.m13275k()).m13344o(request.m13281q()).m13348s(request.m13264A()).m13137h(c10825d).mo13130a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.O0(this.f11621f);
        facebookDialogFragment.show(fragmentActivityM13246i.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: s */
    public za mo13190s() {
        return this.f11624q;
    }

    /* renamed from: w */
    public final void m13337w(LoginClient.Request request, Bundle bundle, ur6 ur6Var) {
        sq8.m48649h(request, "request");
        super.m13335u(request, bundle, ur6Var);
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11622g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
        this.f11623h = "web_view";
        this.f11624q = za.WEB_VIEW;
        this.f11622g = parcel.readString();
    }
}
