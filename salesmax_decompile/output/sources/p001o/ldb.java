package p001o;

import android.app.Activity;
import com.facebook.C10773c;

/* loaded from: classes5.dex */
public final class ldb {

    /* renamed from: a */
    public static final ldb f33651a = new ldb();

    /* renamed from: b */
    public static final String f33652b = ldb.class.getCanonicalName();

    /* renamed from: c */
    public static boolean f33653c;

    /* renamed from: b */
    public static final void m36976b() {
        try {
            if (a94.m16694d(ldb.class)) {
                return;
            }
            try {
                C10773c.m13028u().execute(new Runnable() { // from class: o.kdb
                    @Override // java.lang.Runnable
                    public final void run() {
                        ldb.m36977c();
                    }
                });
            } catch (Exception e) {
                cri.j0(f33652b, e);
            }
        } catch (Throwable th) {
            a94.m16692b(th, ldb.class);
        }
    }

    /* renamed from: c */
    public static final void m36977c() {
        if (a94.m16694d(ldb.class)) {
            return;
        }
        try {
            if (vx0.f50974f.m53533h(C10773c.m13019l())) {
                return;
            }
            f33651a.m36979e();
            f33653c = true;
        } catch (Throwable th) {
            a94.m16692b(th, ldb.class);
        }
    }

    /* renamed from: d */
    public static final void m36978d(Activity activity) {
        if (a94.m16694d(ldb.class)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            try {
                if (f33653c && !xdb.f53550d.m56087c().isEmpty()) {
                    ceb.f18001e.m21084e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, ldb.class);
        }
    }

    /* renamed from: e */
    public final void m36979e() {
        String strM50549p;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null || (strM50549p = tt6VarM56803u.m50549p()) == null) {
                return;
            }
            xdb.f53550d.m56088d(strM50549p);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
