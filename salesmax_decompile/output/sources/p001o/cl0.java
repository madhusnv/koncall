package p001o;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import p001o.nl0;
import p001o.sja;

/* loaded from: classes5.dex */
public final class cl0 {

    /* renamed from: f */
    public static ScheduledFuture f18284f;

    /* renamed from: a */
    public static final cl0 f18279a = new cl0();

    /* renamed from: b */
    public static final String f18280b = cl0.class.getName();

    /* renamed from: c */
    public static final int f18281c = 100;

    /* renamed from: d */
    public static volatile uk0 f18282d = new uk0();

    /* renamed from: e */
    public static final ScheduledExecutorService f18283e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g */
    public static final Runnable f18285g = new Runnable() { // from class: o.xk0
        @Override // java.lang.Runnable
        public final void run() {
            cl0.m21364o();
        }
    };

    /* renamed from: g */
    public static final void m21356g(final ua uaVar, final tk0 tk0Var) {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(uaVar, "accessTokenAppId");
            sq8.m48649h(tk0Var, "appEvent");
            f18283e.execute(new Runnable() { // from class: o.wk0
                @Override // java.lang.Runnable
                public final void run() {
                    cl0.m21357h(uaVar, tk0Var);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: h */
    public static final void m21357h(ua uaVar, tk0 tk0Var) {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(uaVar, "$accessTokenAppId");
            sq8.m48649h(tk0Var, "$appEvent");
            f18282d.m51664a(uaVar, tk0Var);
            if (nl0.f36985b.m40736c() != nl0.EnumC15599b.EXPLICIT_ONLY && f18282d.m51667d() > f18281c) {
                m21363n(m67.EVENT_THRESHOLD);
            } else if (f18284f == null) {
                f18284f = f18283e.schedule(f18285g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: i */
    public static final GraphRequest m21358i(final ua uaVar, final ghf ghfVar, boolean z, final o67 o67Var) {
        if (a94.m16694d(cl0.class)) {
            return null;
        }
        try {
            sq8.m48649h(uaVar, "accessTokenAppId");
            sq8.m48649h(ghfVar, "appEvents");
            sq8.m48649h(o67Var, "flushState");
            String strM51266b = uaVar.m51266b();
            tt6 tt6VarM56803u = xt6.m56803u(strM51266b, false);
            GraphRequest.C10764c c10764c = GraphRequest.f11338n;
            h8g h8gVar = h8g.f26398a;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{strM51266b}, 1));
            sq8.m48648g(str, "format(format, *args)");
            final GraphRequest graphRequestM12882A = c10764c.m12882A(null, str, null, null);
            graphRequestM12882A.m12843D(true);
            Bundle bundleM12861u = graphRequestM12882A.m12861u();
            if (bundleM12861u == null) {
                bundleM12861u = new Bundle();
            }
            bundleM12861u.putString("access_token", uaVar.m51265a());
            String strM17572e = ao8.f15070b.m17572e();
            if (strM17572e != null) {
                bundleM12861u.putString("device_token", strM17572e);
            }
            String strM45620l = ql0.f42105c.m45620l();
            if (strM45620l != null) {
                bundleM12861u.putString("install_referrer", strM45620l);
            }
            graphRequestM12882A.m12846G(bundleM12861u);
            int iM28722e = ghfVar.m28722e(graphRequestM12882A, C10773c.m13019l(), tt6VarM56803u != null ? tt6VarM56803u.m50559z() : false, z);
            if (iM28722e == 0) {
                return null;
            }
            o67Var.m41637c(o67Var.m41635a() + iM28722e);
            graphRequestM12882A.m12842C(new GraphRequest.InterfaceC10763b() { // from class: o.yk0
                @Override // com.facebook.GraphRequest.InterfaceC10763b
                /* renamed from: a */
                public final void mo12873a(C10776f c10776f) {
                    cl0.m21359j(uaVar, graphRequestM12882A, ghfVar, o67Var, c10776f);
                }
            });
            return graphRequestM12882A;
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final void m21359j(ua uaVar, GraphRequest graphRequest, ghf ghfVar, o67 o67Var, C10776f c10776f) {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(uaVar, "$accessTokenAppId");
            sq8.m48649h(graphRequest, "$postRequest");
            sq8.m48649h(ghfVar, "$appEvents");
            sq8.m48649h(o67Var, "$flushState");
            sq8.m48649h(c10776f, "response");
            m21366q(uaVar, graphRequest, c10776f, ghfVar, o67Var);
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: k */
    public static final List m21360k(uk0 uk0Var, o67 o67Var) {
        if (a94.m16694d(cl0.class)) {
            return null;
        }
        try {
            sq8.m48649h(uk0Var, "appEventCollection");
            sq8.m48649h(o67Var, "flushResults");
            boolean zM12987A = C10773c.m12987A(C10773c.m13019l());
            ArrayList arrayList = new ArrayList();
            for (ua uaVar : uk0Var.m51669f()) {
                ghf ghfVarM51666c = uk0Var.m51666c(uaVar);
                if (ghfVarM51666c == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                GraphRequest graphRequestM21358i = m21358i(uaVar, ghfVarM51666c, zM12987A, o67Var);
                if (graphRequestM21358i != null) {
                    arrayList.add(graphRequestM21358i);
                    if (il0.f28789a.m32255f()) {
                        ll0.m37399l(graphRequestM21358i);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
            return null;
        }
    }

    /* renamed from: l */
    public static final void m21361l(final m67 m67Var) {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(m67Var, "reason");
            f18283e.execute(new Runnable() { // from class: o.zk0
                @Override // java.lang.Runnable
                public final void run() {
                    cl0.m21362m(m67Var);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: m */
    public static final void m21362m(m67 m67Var) {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(m67Var, "$reason");
            m21363n(m67Var);
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: n */
    public static final void m21363n(m67 m67Var) {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(m67Var, "reason");
            f18282d.m51665b(vk0.m52895a());
            try {
                o67 o67VarM21370u = m21370u(m67Var, f18282d);
                if (o67VarM21370u != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", o67VarM21370u.m41635a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", o67VarM21370u.m41636b());
                    gha.m28700b(C10773c.m13019l()).m28703d(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: o */
    public static final void m21364o() {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            f18284f = null;
            if (nl0.f36985b.m40736c() != nl0.EnumC15599b.EXPLICIT_ONLY) {
                m21363n(m67.TIMER);
            }
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: p */
    public static final Set m21365p() {
        if (a94.m16694d(cl0.class)) {
            return null;
        }
        try {
            return f18282d.m51669f();
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
            return null;
        }
    }

    /* renamed from: q */
    public static final void m21366q(final ua uaVar, GraphRequest graphRequest, C10776f c10776f, final ghf ghfVar, o67 o67Var) {
        String string;
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(uaVar, "accessTokenAppId");
            sq8.m48649h(graphRequest, "request");
            sq8.m48649h(c10776f, "response");
            sq8.m48649h(ghfVar, "appEvents");
            sq8.m48649h(o67Var, "flushState");
            FacebookRequestError facebookRequestErrorM13064b = c10776f.m13064b();
            String str = "Success";
            n67 n67Var = n67.SUCCESS;
            boolean z = true;
            if (facebookRequestErrorM13064b != null) {
                if (facebookRequestErrorM13064b.m12820b() == -1) {
                    str = "Failed: No Connectivity";
                    n67Var = n67.NO_CONNECTIVITY;
                } else {
                    h8g h8gVar = h8g.f26398a;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{c10776f.toString(), facebookRequestErrorM13064b.toString()}, 2));
                    sq8.m48648g(str, "format(format, *args)");
                    n67Var = n67.SERVER_ERROR;
                }
            }
            if (C10773c.m12995I(bka.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) graphRequest.m12863w()).toString(2);
                    sq8.m48648g(string, "{\n            val jsonAr…y.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                sja.C16851a c16851a = sja.f45482e;
                bka bkaVar = bka.APP_EVENTS;
                String str2 = f18280b;
                sq8.m48648g(str2, "TAG");
                c16851a.m48388c(bkaVar, str2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.m12857q()), str, string);
            }
            if (facebookRequestErrorM13064b == null) {
                z = false;
            }
            ghfVar.m28719b(z);
            n67 n67Var2 = n67.NO_CONNECTIVITY;
            if (n67Var == n67Var2) {
                C10773c.m13028u().execute(new Runnable() { // from class: o.al0
                    @Override // java.lang.Runnable
                    public final void run() {
                        cl0.m21367r(uaVar, ghfVar);
                    }
                });
            }
            if (n67Var == n67.SUCCESS || o67Var.m41636b() == n67Var2) {
                return;
            }
            o67Var.m41638d(n67Var);
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: r */
    public static final void m21367r(ua uaVar, ghf ghfVar) {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            sq8.m48649h(uaVar, "$accessTokenAppId");
            sq8.m48649h(ghfVar, "$appEvents");
            dl0.m23384a(uaVar, ghfVar);
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: s */
    public static final void m21368s() {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            f18283e.execute(new Runnable() { // from class: o.bl0
                @Override // java.lang.Runnable
                public final void run() {
                    cl0.m21369t();
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: t */
    public static final void m21369t() {
        if (a94.m16694d(cl0.class)) {
            return;
        }
        try {
            dl0.m23385b(f18282d);
            f18282d = new uk0();
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
        }
    }

    /* renamed from: u */
    public static final o67 m21370u(m67 m67Var, uk0 uk0Var) {
        if (a94.m16694d(cl0.class)) {
            return null;
        }
        try {
            sq8.m48649h(m67Var, "reason");
            sq8.m48649h(uk0Var, "appEventCollection");
            o67 o67Var = new o67();
            List listM21360k = m21360k(uk0Var, o67Var);
            if (!(!listM21360k.isEmpty())) {
                return null;
            }
            sja.C16851a c16851a = sja.f45482e;
            bka bkaVar = bka.APP_EVENTS;
            String str = f18280b;
            sq8.m48648g(str, "TAG");
            c16851a.m48388c(bkaVar, str, "Flushing %d events due to %s.", Integer.valueOf(o67Var.m41635a()), m67Var.toString());
            Iterator it = listM21360k.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).m12851k();
            }
            return o67Var;
        } catch (Throwable th) {
            a94.m16692b(th, cl0.class);
            return null;
        }
    }
}
