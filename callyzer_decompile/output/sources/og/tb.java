package og;

import d3.C1565s;
import j3.C3551e;
import j3.C3552f;
import j3.C3553g;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class tb {

    /* renamed from: a */
    public static C3552f f26817a;

    /* renamed from: a */
    public static final C3552f m10928a() {
        C3552f c3552f = f26817a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        C3553g c3553g = new C3553g();
        c3553g.m8100h(12.0f, 2.0f);
        c3553g.m8095c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c3553g.m8102j(4.48f, 10.0f, 10.0f, 10.0f);
        c3553g.m8102j(10.0f, -4.48f, 10.0f, -10.0f);
        c3553g.m8101i(17.52f, 2.0f, 12.0f, 2.0f);
        c3553g.m8094b();
        c3553g.m8100h(10.0f, 17.0f);
        c3553g.m8099g(-5.0f, -5.0f);
        c3553g.m8099g(1.41f, -1.41f);
        c3553g.m8098f(10.0f, 14.17f);
        c3553g.m8099g(7.59f, -7.59f);
        c3553g.m8098f(19.0f, 8.0f);
        c3553g.m8099g(-9.0f, 9.0f);
        c3553g.m8094b();
        C3551e.m8090a(c3551e, c3553g.f19011a, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26817a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: b */
    public static void m10929b(int i10, int i11) {
        String strM10970b;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10970b = ub.m10970b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
                }
                strM10970b = ub.m10970b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10970b);
        }
    }

    /* renamed from: c */
    public static void m10930c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? m10931d(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m10931d(i11, i12, "end index") : ub.m10970b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* renamed from: d */
    public static String m10931d(int i10, int i11, String str) {
        if (i10 < 0) {
            return ub.m10970b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return ub.m10970b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
    }
}
