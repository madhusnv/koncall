package b00;

import java.util.RandomAccess;
import rw.AbstractC6654d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.z */
/* loaded from: classes3.dex */
public final class C0541z extends AbstractC6654d implements RandomAccess {

    /* renamed from: a */
    public final C0529n[] f3680a;

    /* renamed from: b */
    public final int[] f3681b;

    public C0541z(C0529n[] c0529nArr, int[] iArr) {
        this.f3680a = c0529nArr;
        this.f3681b = iArr;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f3680a.length;
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0529n) {
            return super.contains((C0529n) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f3680a[i10];
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0529n) {
            return super.indexOf((C0529n) obj);
        }
        return -1;
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0529n) {
            return super.lastIndexOf((C0529n) obj);
        }
        return -1;
    }
}
