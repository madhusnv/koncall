package pg;

import j1.C3515g;
import j1.C3518j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class s7 {
    /* renamed from: a */
    public static String m11858a(int i10, int i11, String str) {
        if (i10 < 0) {
            return t7.m11871c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return t7.m11871c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    public static void m11859b(int i10, int i11) {
        String strM11871c;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM11871c = t7.m11871c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("negative size: ");
                    sb2.append(i11);
                    throw new IllegalArgumentException(sb2.toString());
                }
                strM11871c = t7.m11871c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM11871c);
        }
    }

    /* renamed from: c */
    public static void m11860c(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m11858a(i10, i11, "index"));
        }
    }

    /* renamed from: d */
    public static void m11861d(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? m11858a(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m11858a(i11, i12, "end index") : t7.m11871c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* renamed from: e */
    public static final void m11862e(C3518j c3518j) {
        c3518j.f18408a.setValue(C3515g.f18406a);
    }
}
