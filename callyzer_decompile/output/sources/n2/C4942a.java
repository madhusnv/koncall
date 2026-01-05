package n2;

import java.util.List;
import o2.AbstractC5269b;
import og.ud;
import rw.AbstractC6654d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n2.a */
/* loaded from: classes.dex */
public final class C4942a extends AbstractC6654d {

    /* renamed from: a */
    public final AbstractC5269b f24616a;

    /* renamed from: b */
    public final int f24617b;

    /* renamed from: c */
    public final int f24618c;

    public C4942a(AbstractC5269b abstractC5269b, int i10, int i11) {
        this.f24616a = abstractC5269b;
        this.f24617b = i10;
        ud.m10977c(i10, i11, abstractC5269b.mo1628b());
        this.f24618c = i11 - i10;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f24618c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ud.m10975a(i10, this.f24618c);
        return this.f24616a.get(this.f24617b + i10);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final List subList(int i10, int i11) {
        ud.m10977c(i10, i11, this.f24618c);
        int i12 = this.f24617b;
        return new C4942a(this.f24616a, i10 + i12, i12 + i11);
    }
}
