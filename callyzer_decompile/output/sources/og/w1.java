package og;

import d3.C1565s;
import j3.C3551e;
import j3.C3552f;
import j3.C3557k;
import j3.C3560n;
import j3.C3561o;
import j3.C3568v;
import java.util.ArrayList;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a */
    public static C3552f f26886a;

    /* renamed from: a */
    public static final C3552f m11021a() {
        C3552f c3552f = f26886a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C3561o(8.59f, 16.59f));
        arrayList.add(new C3560n(13.17f, 12.0f));
        arrayList.add(new C3560n(8.59f, 7.41f));
        arrayList.add(new C3560n(10.0f, 6.0f));
        arrayList.add(new C3568v(6.0f, 6.0f));
        arrayList.add(new C3568v(-6.0f, 6.0f));
        arrayList.add(new C3568v(-1.41f, -1.41f));
        arrayList.add(C3557k.f19059c);
        C3551e.m8090a(c3551e, arrayList, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26886a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: b */
    public static void m11022b(int i10, int i11) {
        String strM11037c;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM11037c = x1.m11037c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
                }
                strM11037c = x1.m11037c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM11037c);
        }
    }

    /* renamed from: c */
    public static void m11023c(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m11025e(i10, i11, "index"));
        }
    }

    /* renamed from: d */
    public static void m11024d(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? m11025e(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m11025e(i11, i12, "end index") : x1.m11037c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* renamed from: e */
    public static String m11025e(int i10, int i11, String str) {
        if (i10 < 0) {
            return x1.m11037c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return x1.m11037c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
    }
}
