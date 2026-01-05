package p001o;

import com.facebook.C10773c;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class xj1 {

    /* renamed from: b */
    public static boolean f53839b;

    /* renamed from: a */
    public static final xj1 f53838a = new xj1();

    /* renamed from: c */
    public static Set f53840c = new HashSet();

    /* renamed from: a */
    public static final void m56368a() {
        if (a94.m16694d(xj1.class)) {
            return;
        }
        try {
            f53838a.m56370c();
            Set set = f53840c;
            if (set == null || set.isEmpty()) {
                return;
            }
            f53839b = true;
        } catch (Throwable th) {
            a94.m16692b(th, xj1.class);
        }
    }

    /* renamed from: b */
    public static final boolean m56369b(String str) {
        if (a94.m16694d(xj1.class)) {
            return false;
        }
        try {
            sq8.m48649h(str, "eventName");
            if (f53839b) {
                return f53840c.contains(str);
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, xj1.class);
            return false;
        }
    }

    /* renamed from: c */
    public final void m56370c() {
        HashSet hashSetM21666m;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null || (hashSetM21666m = cri.m21666m(tt6VarM56803u.m50536c())) == null) {
                return;
            }
            f53840c = hashSetM21666m;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
