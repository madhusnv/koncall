package qx;

import java.util.List;
import og.ag;
import rw.AbstractC6654d;
import rx.AbstractC6677a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qx.a */
/* loaded from: classes3.dex */
public final class C6377a extends AbstractC6654d implements InterfaceC6378b {

    /* renamed from: a */
    public final AbstractC6677a f30777a;

    /* renamed from: b */
    public final int f30778b;

    /* renamed from: c */
    public final int f30779c;

    public C6377a(AbstractC6677a abstractC6677a, int i10, int i11) {
        this.f30777a = abstractC6677a;
        this.f30778b = i10;
        ag.m10538c(i10, i11, abstractC6677a.mo1628b());
        this.f30779c = i11 - i10;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f30779c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ag.m10536a(i10, this.f30779c);
        return this.f30777a.get(this.f30778b + i10);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final List subList(int i10, int i11) {
        ag.m10538c(i10, i11, this.f30779c);
        int i12 = this.f30778b;
        return new C6377a(this.f30777a, i10 + i12, i12 + i11);
    }
}
