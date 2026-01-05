package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C10773c;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.login.C10830e;
import com.facebook.login.LoginClient;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p001o.d32;
import p001o.di4;
import p001o.e32;
import p001o.e9g;
import p001o.eic;
import p001o.fi4;
import p001o.fka;
import p001o.id5;
import p001o.kh3;
import p001o.mka;
import p001o.nif;
import p001o.nr6;
import p001o.os;
import p001o.pr6;
import p001o.qj7;
import p001o.rri;
import p001o.sq8;
import p001o.t3g;
import p001o.ur6;
import p001o.wka;
import p001o.xka;
import p001o.y3i;
import p001o.ye3;
import p001o.za5;

/* renamed from: com.facebook.login.e */
/* loaded from: classes5.dex */
public class C10830e {

    /* renamed from: j */
    public static final b f11648j;

    /* renamed from: k */
    public static final Set f11649k;

    /* renamed from: l */
    public static final String f11650l;

    /* renamed from: m */
    public static volatile C10830e f11651m;

    /* renamed from: c */
    public final SharedPreferences f11654c;

    /* renamed from: e */
    public String f11656e;

    /* renamed from: f */
    public boolean f11657f;

    /* renamed from: h */
    public boolean f11659h;

    /* renamed from: i */
    public boolean f11660i;

    /* renamed from: a */
    public fka f11652a = fka.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public za5 f11653b = za5.FRIENDS;

    /* renamed from: d */
    public String f11655d = "rerequest";

    /* renamed from: g */
    public xka f11658g = xka.FACEBOOK;

    /* renamed from: com.facebook.login.e$a */
    public static final class a implements t3g {

        /* renamed from: a */
        public final Activity f11661a;

        public a(Activity activity) {
            sq8.m48649h(activity, "activity");
            this.f11661a = activity;
        }

        @Override // p001o.t3g
        /* renamed from: a */
        public Activity mo13413a() {
            return this.f11661a;
        }

        @Override // p001o.t3g
        public void startActivityForResult(Intent intent, int i) {
            sq8.m48649h(intent, "intent");
            mo13413a().startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.e$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final wka m13415b(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            sq8.m48649h(request, "request");
            sq8.m48649h(accessToken, "newToken");
            Set setM13278n = request.m13278n();
            Set setU0 = kh3.U0(kh3.c0(accessToken.m12758j()));
            if (request.m13283s()) {
                setU0.retainAll(setM13278n);
            }
            Set setU02 = kh3.U0(kh3.c0(setM13278n));
            setU02.removeAll(setU0);
            return new wka(accessToken, authenticationToken, setU0, setU02);
        }

        /* renamed from: c */
        public C10830e m13416c() {
            if (C10830e.f11651m == null) {
                synchronized (this) {
                    C10830e.f11651m = new C10830e();
                    y3i y3iVar = y3i.f54824a;
                }
            }
            C10830e c10830e = C10830e.f11651m;
            if (c10830e != null) {
                return c10830e;
            }
            sq8.m48667z("instance");
            return null;
        }

        /* renamed from: d */
        public final Set m13417d() {
            return nif.m40668i("ads_management", "create_event", "rsvp_event");
        }

        /* renamed from: e */
        public final boolean m13418e(String str) {
            if (str != null) {
                return e9g.m24597K(str, "publish", false, 2, null) || e9g.m24597K(str, "manage", false, 2, null) || C10830e.f11649k.contains(str);
            }
            return false;
        }
    }

    /* renamed from: com.facebook.login.e$c */
    public final class c extends os {

        /* renamed from: a */
        public d32 f11662a;

        /* renamed from: b */
        public String f11663b;

        public c(d32 d32Var, String str) {
            this.f11662a = d32Var;
            this.f11663b = str;
        }

        @Override // p001o.os
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo6230a(Context context, Collection collection) throws NoSuchAlgorithmException {
            sq8.m48649h(context, "context");
            sq8.m48649h(collection, "permissions");
            LoginClient.Request requestM13398j = C10830e.this.m13398j(new mka(collection, null, 2, null));
            String str = this.f11663b;
            if (str != null) {
                requestM13398j.m13284t(str);
            }
            C10830e.this.m13407s(context, requestM13398j);
            Intent intentM13400l = C10830e.this.m13400l(requestM13398j);
            if (C10830e.this.m13410x(intentM13400l)) {
                return intentM13400l;
            }
            ur6 ur6Var = new ur6("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            C10830e.this.m13401m(context, LoginClient.Result.EnumC10810a.ERROR, null, ur6Var, false, requestM13398j);
            throw ur6Var;
        }

        @Override // p001o.os
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public d32.C12789a mo6231c(int i, Intent intent) {
            C10830e.m13386u(C10830e.this, i, intent, null, 4, null);
            int requestCode = e32.EnumC13090c.Login.toRequestCode();
            d32 d32Var = this.f11662a;
            if (d32Var != null) {
                d32Var.mo22293a(requestCode, i, intent);
            }
            return new d32.C12789a(requestCode, i, intent);
        }

        /* renamed from: f */
        public final void m13421f(d32 d32Var) {
            this.f11662a = d32Var;
        }
    }

    /* renamed from: com.facebook.login.e$d */
    public static final class d implements t3g {

        /* renamed from: a */
        public final qj7 f11665a;

        /* renamed from: b */
        public final Activity f11666b;

        public d(qj7 qj7Var) {
            sq8.m48649h(qj7Var, "fragment");
            this.f11665a = qj7Var;
            this.f11666b = qj7Var.m45543a();
        }

        @Override // p001o.t3g
        /* renamed from: a */
        public Activity mo13413a() {
            return this.f11666b;
        }

        @Override // p001o.t3g
        public void startActivityForResult(Intent intent, int i) {
            sq8.m48649h(intent, "intent");
            this.f11665a.m45546d(intent, i);
        }
    }

    /* renamed from: com.facebook.login.e$e */
    public static final class e {

        /* renamed from: a */
        public static final e f11667a = new e();

        /* renamed from: b */
        public static C10829d f11668b;

        /* JADX WARN: Removed duplicated region for block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[DONT_GENERATE] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized C10829d m13422a(Context context) {
            if (context == null) {
                context = C10773c.m13019l();
                if (context != null) {
                    return null;
                }
                if (f11668b == null) {
                    f11668b = new C10829d(context, C10773c.m13020m());
                }
                return f11668b;
            }
            if (context != null) {
            }
        }
    }

    static {
        b bVar = new b(null);
        f11648j = bVar;
        f11649k = bVar.m13417d();
        String string = C10830e.class.toString();
        sq8.m48648g(string, "LoginManager::class.java.toString()");
        f11650l = string;
    }

    public C10830e() {
        rri.m47117l();
        SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.loginManager", 0);
        sq8.m48648g(sharedPreferences, "getApplicationContext().…ER, Context.MODE_PRIVATE)");
        this.f11654c = sharedPreferences;
        if (!C10773c.f11412q || di4.m23197a() == null) {
            return;
        }
        fi4.m26733a(C10773c.m13019l(), "com.android.chrome", new C10826a());
        fi4.m26734b(C10773c.m13019l(), C10773c.m13019l().getPackageName());
    }

    /* renamed from: I */
    public static final boolean m13377I(C10830e c10830e, int i, Intent intent) {
        sq8.m48649h(c10830e, "this$0");
        return m13386u(c10830e, i, intent, null, 4, null);
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m13386u(C10830e c10830e, int i, Intent intent, pr6 pr6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i2 & 4) != 0) {
            pr6Var = null;
        }
        return c10830e.m13408t(i, intent, pr6Var);
    }

    /* renamed from: w */
    public static final boolean m13387w(C10830e c10830e, pr6 pr6Var, int i, Intent intent) {
        sq8.m48649h(c10830e, "this$0");
        return c10830e.m13408t(i, intent, pr6Var);
    }

    /* renamed from: A */
    public final void m13388A(boolean z) {
        SharedPreferences.Editor editorEdit = this.f11654c.edit();
        editorEdit.putBoolean("express_login_allowed", z);
        editorEdit.apply();
    }

    /* renamed from: B */
    public final C10830e m13389B(boolean z) {
        this.f11659h = z;
        return this;
    }

    /* renamed from: C */
    public final C10830e m13390C(fka fkaVar) {
        sq8.m48649h(fkaVar, "loginBehavior");
        this.f11652a = fkaVar;
        return this;
    }

    /* renamed from: D */
    public final C10830e m13391D(xka xkaVar) {
        sq8.m48649h(xkaVar, "targetApp");
        this.f11658g = xkaVar;
        return this;
    }

    /* renamed from: E */
    public final C10830e m13392E(String str) {
        this.f11656e = str;
        return this;
    }

    /* renamed from: F */
    public final C10830e m13393F(boolean z) {
        this.f11657f = z;
        return this;
    }

    /* renamed from: G */
    public final C10830e m13394G(boolean z) {
        this.f11660i = z;
        return this;
    }

    /* renamed from: H */
    public final void m13395H(t3g t3gVar, LoginClient.Request request) {
        m13407s(t3gVar.mo13413a(), request);
        e32.f20849b.m24167c(e32.EnumC13090c.Login.toRequestCode(), new e32.InterfaceC13088a() { // from class: o.qka
            @Override // p001o.e32.InterfaceC13088a
            /* renamed from: a */
            public final boolean mo24164a(int i, Intent intent) {
                return C10830e.m13377I(this.f42097a, i, intent);
            }
        });
        if (m13396J(t3gVar, request)) {
            return;
        }
        ur6 ur6Var = new ur6("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m13401m(t3gVar.mo13413a(), LoginClient.Result.EnumC10810a.ERROR, null, ur6Var, false, request);
        throw ur6Var;
    }

    /* renamed from: J */
    public final boolean m13396J(t3g t3gVar, LoginClient.Request request) {
        Intent intentM13400l = m13400l(request);
        if (!m13410x(intentM13400l)) {
            return false;
        }
        try {
            t3gVar.startActivityForResult(intentM13400l, LoginClient.f11564H.m13305b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public final c m13397i(d32 d32Var, String str) {
        return new c(d32Var, str);
    }

    /* renamed from: j */
    public LoginClient.Request m13398j(mka mkaVar) throws NoSuchAlgorithmException {
        String strM39291a;
        sq8.m48649h(mkaVar, "loginConfig");
        ye3 ye3Var = ye3.S256;
        try {
            strM39291a = eic.m25116b(mkaVar.m39291a(), ye3Var);
        } catch (ur6 unused) {
            ye3Var = ye3.PLAIN;
            strM39291a = mkaVar.m39291a();
        }
        fka fkaVar = this.f11652a;
        Set setV0 = kh3.V0(mkaVar.m39293c());
        za5 za5Var = this.f11653b;
        String str = this.f11655d;
        String strM13020m = C10773c.m13020m();
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "randomUUID().toString()");
        xka xkaVar = this.f11658g;
        String strM39292b = mkaVar.m39292b();
        String strM39291a2 = mkaVar.m39291a();
        LoginClient.Request request = new LoginClient.Request(fkaVar, setV0, za5Var, str, strM13020m, string, xkaVar, strM39292b, strM39291a2, strM39291a, ye3Var);
        request.m13288x(AccessToken.f11242y.m12776g());
        request.m13286v(this.f11656e);
        request.m13289y(this.f11657f);
        request.m13285u(this.f11659h);
        request.m13290z(this.f11660i);
        return request;
    }

    /* renamed from: k */
    public final void m13399k(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, ur6 ur6Var, boolean z, pr6 pr6Var) {
        if (accessToken != null) {
            AccessToken.f11242y.m12778i(accessToken);
            Profile.f11367h.m12934a();
        }
        if (authenticationToken != null) {
            AuthenticationToken.f11255f.m12783a(authenticationToken);
        }
        if (pr6Var != null) {
            wka wkaVarM13415b = (accessToken == null || request == null) ? null : f11648j.m13415b(request, accessToken, authenticationToken);
            if (z || (wkaVarM13415b != null && wkaVarM13415b.m54670b().isEmpty())) {
                pr6Var.onCancel();
                return;
            }
            if (ur6Var != null) {
                pr6Var.mo2740a(ur6Var);
            } else {
                if (accessToken == null || wkaVarM13415b == null) {
                    return;
                }
                m13388A(true);
                pr6Var.onSuccess(wkaVarM13415b);
            }
        }
    }

    /* renamed from: l */
    public Intent m13400l(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        Intent intent = new Intent();
        intent.setClass(C10773c.m13019l(), FacebookActivity.class);
        intent.setAction(request.m13274j().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: m */
    public final void m13401m(Context context, LoginClient.Result.EnumC10810a enumC10810a, Map map, Exception exc, boolean z, LoginClient.Request request) {
        C10829d c10829dM13422a = e.f11667a.m13422a(context);
        if (c10829dM13422a == null) {
            return;
        }
        if (request == null) {
            C10829d.m13366k(c10829dM13422a, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z ? "1" : "0");
        c10829dM13422a.m13371f(request.m13266b(), map2, enumC10810a, map, exc, request.m13281q() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    /* renamed from: n */
    public final void m13402n(Activity activity, Collection collection, String str) throws NoSuchAlgorithmException {
        sq8.m48649h(activity, "activity");
        LoginClient.Request requestM13398j = m13398j(new mka(collection, null, 2, null));
        if (str != null) {
            requestM13398j.m13284t(str);
        }
        m13395H(new a(activity), requestM13398j);
    }

    /* renamed from: o */
    public final void m13403o(Fragment fragment, Collection collection, String str) throws NoSuchAlgorithmException {
        sq8.m48649h(fragment, "fragment");
        m13405q(new qj7(fragment), collection, str);
    }

    /* renamed from: p */
    public final void m13404p(androidx.fragment.app.Fragment fragment, Collection collection, String str) throws NoSuchAlgorithmException {
        sq8.m48649h(fragment, "fragment");
        m13405q(new qj7(fragment), collection, str);
    }

    /* renamed from: q */
    public final void m13405q(qj7 qj7Var, Collection collection, String str) throws NoSuchAlgorithmException {
        sq8.m48649h(qj7Var, "fragment");
        LoginClient.Request requestM13398j = m13398j(new mka(collection, null, 2, null));
        if (str != null) {
            requestM13398j.m13284t(str);
        }
        m13395H(new d(qj7Var), requestM13398j);
    }

    /* renamed from: r */
    public void m13406r() {
        AccessToken.f11242y.m12778i(null);
        AuthenticationToken.f11255f.m12783a(null);
        Profile.f11367h.m12936c(null);
        m13388A(false);
    }

    /* renamed from: s */
    public final void m13407s(Context context, LoginClient.Request request) {
        C10829d c10829dM13422a = e.f11667a.m13422a(context);
        if (c10829dM13422a == null || request == null) {
            return;
        }
        c10829dM13422a.m13373i(request, request.m13281q() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m13408t(int i, Intent intent, pr6 pr6Var) {
        LoginClient.Result.EnumC10810a enumC10810a;
        boolean z;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map map;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.EnumC10810a enumC10810a2 = LoginClient.Result.EnumC10810a.ERROR;
        ur6 ur6Var = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                request = result.f11602f;
                LoginClient.Result.EnumC10810a enumC10810a3 = result.f11597a;
                if (i != -1) {
                    z = i == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (enumC10810a3 == LoginClient.Result.EnumC10810a.SUCCESS) {
                    accessToken = result.f11598b;
                    authenticationToken2 = result.f11599c;
                } else {
                    authenticationToken2 = null;
                    ur6Var = new nr6(result.f11600d);
                    accessToken = null;
                }
                map = result.f11603g;
                z = z;
                authenticationToken = authenticationToken2;
                enumC10810a = enumC10810a3;
            } else {
                enumC10810a = enumC10810a2;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
                z = false;
            }
        } else if (i == 0) {
            enumC10810a = LoginClient.Result.EnumC10810a.CANCEL;
            z = true;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
        }
        if (ur6Var == null && accessToken == null && !z) {
            ur6Var = new ur6("Unexpected call to LoginManager.onActivityResult");
        }
        ur6 ur6Var2 = ur6Var;
        LoginClient.Request request2 = request;
        m13401m(null, enumC10810a, map, ur6Var2, true, request2);
        m13399k(accessToken, authenticationToken, request2, ur6Var2, z, pr6Var);
        return true;
    }

    /* renamed from: v */
    public final void m13409v(d32 d32Var, final pr6 pr6Var) {
        if (!(d32Var instanceof e32)) {
            throw new ur6("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((e32) d32Var).m24163c(e32.EnumC13090c.Login.toRequestCode(), new e32.InterfaceC13088a() { // from class: o.rka
            @Override // p001o.e32.InterfaceC13088a
            /* renamed from: a */
            public final boolean mo24164a(int i, Intent intent) {
                return C10830e.m13387w(this.f43727a, pr6Var, i, intent);
            }
        });
    }

    /* renamed from: x */
    public final boolean m13410x(Intent intent) {
        return C10773c.m13019l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: y */
    public final C10830e m13411y(String str) {
        sq8.m48649h(str, "authType");
        this.f11655d = str;
        return this;
    }

    /* renamed from: z */
    public final C10830e m13412z(za5 za5Var) {
        sq8.m48649h(za5Var, "defaultAudience");
        this.f11653b = za5Var;
        return this;
    }
}
