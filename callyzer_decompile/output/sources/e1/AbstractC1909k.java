package e1;

import f1.AbstractC2176a;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.k */
/* loaded from: classes.dex */
public abstract class AbstractC1909k {

    /* renamed from: a */
    public static final C1921w f9004a = new C1921w(0);

    /* renamed from: a */
    public static final C1921w m5580a(int... iArr) {
        C1921w c1921w = new C1921w(iArr.length);
        int i10 = c1921w.f9077b;
        if (i10 < 0) {
            AbstractC2176a.m5863d("");
            throw null;
        }
        if (iArr.length == 0) {
            return c1921w;
        }
        c1921w.m5652b(iArr.length + i10);
        int[] iArr2 = c1921w.f9076a;
        int i11 = c1921w.f9077b;
        if (i10 != i11) {
            AbstractC6662l.m12717g(iArr.length + i10, iArr2, i10, i11, iArr2);
        }
        AbstractC6662l.m12722l(i10, iArr, 0, 12, iArr2);
        c1921w.f9077b += iArr.length;
        return c1921w;
    }
}
