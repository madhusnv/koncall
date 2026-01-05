package p001o;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.bh8;
import p001o.eh8;
import p001o.kh8;
import p001o.mt6;

/* loaded from: classes5.dex */
public final class xg8 {

    /* renamed from: a */
    public static final xg8 f53729a = new xg8();

    /* renamed from: b */
    public static final AtomicBoolean f53730b = new AtomicBoolean(false);

    /* renamed from: e */
    public static final synchronized void m56252e(final Context context, final kh8.EnumC14835a enumC14835a) {
        if (a94.m16694d(xg8.class)) {
            return;
        }
        try {
            sq8.m48649h(context, "context");
            sq8.m48649h(enumC14835a, "billingClientVersion");
            AtomicBoolean atomicBoolean = f53730b;
            if (atomicBoolean.get()) {
                return;
            }
            final gge ggeVar = new gge();
            kh8.EnumC14835a enumC14835a2 = kh8.EnumC14835a.V2_V4;
            if (enumC14835a == enumC14835a2) {
                ggeVar.f25106a = bh8.f16212q.m18996d(context);
            } else if (enumC14835a == kh8.EnumC14835a.V5_V7) {
                ggeVar.f25106a = eh8.f21613N.m25044d(context);
            }
            if (ggeVar.f25106a == null) {
                atomicBoolean.set(true);
                return;
            }
            if (!mt6.m39648g(mt6.EnumC15426c.AndroidIAPSubscriptionAutoLogging) || (r1e.m46050d() && enumC14835a != enumC14835a2)) {
                ((yg8) ggeVar.f25106a).mo18988a(kh8.EnumC14836b.INAPP, new Runnable() { // from class: o.vg8
                    @Override // java.lang.Runnable
                    public final void run() {
                        xg8.m56255h(enumC14835a, context);
                    }
                });
            } else {
                ((yg8) ggeVar.f25106a).mo18988a(kh8.EnumC14836b.INAPP, new Runnable() { // from class: o.ug8
                    @Override // java.lang.Runnable
                    public final void run() {
                        xg8.m56253f(ggeVar, enumC14835a, context);
                    }
                });
            }
        } catch (Throwable th) {
            a94.m16692b(th, xg8.class);
        }
    }

    /* renamed from: f */
    public static final void m56253f(gge ggeVar, final kh8.EnumC14835a enumC14835a, final Context context) {
        if (a94.m16694d(xg8.class)) {
            return;
        }
        try {
            sq8.m48649h(ggeVar, "$billingClientWrapper");
            sq8.m48649h(enumC14835a, "$billingClientVersion");
            sq8.m48649h(context, "$context");
            ((yg8) ggeVar.f25106a).mo18988a(kh8.EnumC14836b.SUBS, new Runnable() { // from class: o.wg8
                @Override // java.lang.Runnable
                public final void run() {
                    xg8.m56254g(enumC14835a, context);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, xg8.class);
        }
    }

    /* renamed from: g */
    public static final void m56254g(kh8.EnumC14835a enumC14835a, Context context) {
        if (a94.m16694d(xg8.class)) {
            return;
        }
        try {
            sq8.m48649h(enumC14835a, "$billingClientVersion");
            sq8.m48649h(context, "$context");
            xg8 xg8Var = f53729a;
            String packageName = context.getPackageName();
            sq8.m48648g(packageName, "context.packageName");
            xg8Var.m56256d(enumC14835a, packageName);
        } catch (Throwable th) {
            a94.m16692b(th, xg8.class);
        }
    }

    /* renamed from: h */
    public static final void m56255h(kh8.EnumC14835a enumC14835a, Context context) {
        if (a94.m16694d(xg8.class)) {
            return;
        }
        try {
            sq8.m48649h(enumC14835a, "$billingClientVersion");
            sq8.m48649h(context, "$context");
            xg8 xg8Var = f53729a;
            String packageName = context.getPackageName();
            sq8.m48648g(packageName, "context.packageName");
            xg8Var.m56256d(enumC14835a, packageName);
        } catch (Throwable th) {
            a94.m16692b(th, xg8.class);
        }
    }

    /* renamed from: d */
    public final void m56256d(kh8.EnumC14835a enumC14835a, String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            boolean zM30455e = hh8.m30455e();
            if (zM30455e) {
                hh8.m30456g();
            }
            if (enumC14835a == kh8.EnumC14835a.V2_V4) {
                bh8.C12394b c12394b = bh8.f16212q;
                hh8.m30454d(c12394b.m18995c(), c12394b.m18997e(), false, str, enumC14835a, zM30455e);
                hh8.m30454d(c12394b.m18998f(), c12394b.m18997e(), true, str, enumC14835a, zM30455e);
                c12394b.m18995c().clear();
                c12394b.m18998f().clear();
            } else {
                eh8.C13190a c13190a = eh8.f21613N;
                hh8.m30454d(c13190a.m25043c(), c13190a.m25045e(), false, str, enumC14835a, zM30455e);
                hh8.m30454d(c13190a.m25046f(), c13190a.m25045e(), true, str, enumC14835a, zM30455e);
                c13190a.m25043c().clear();
                c13190a.m25046f().clear();
            }
            if (zM30455e) {
                hh8.m30457h();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
