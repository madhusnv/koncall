package tt;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tt.a */
/* loaded from: classes3.dex */
public final class C7218a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34526a;

    /* renamed from: b */
    public final /* synthetic */ C7224g f34527b;

    /* renamed from: c */
    public int f34528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7218a(C7224g c7224g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34527b = c7224g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34526a = obj;
        this.f34528c |= Integer.MIN_VALUE;
        return C7224g.m13450e(this.f34527b, this);
    }
}
