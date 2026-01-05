package yp;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yp.l */
/* loaded from: classes3.dex */
public final class C8732l extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42248a;

    /* renamed from: b */
    public final /* synthetic */ C8735o f42249b;

    /* renamed from: c */
    public int f42250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8732l(C8735o c8735o, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42249b = c8735o;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42248a = obj;
        this.f42250c |= Integer.MIN_VALUE;
        return C8735o.m16115k(this.f42249b, this);
    }
}
