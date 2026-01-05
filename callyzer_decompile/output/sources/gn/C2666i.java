package gn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gn.i */
/* loaded from: classes3.dex */
public final class C2666i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f14557a;

    /* renamed from: b */
    public final /* synthetic */ x2 f14558b;

    /* renamed from: c */
    public int f14559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2666i(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14558b = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14557a = obj;
        this.f14559c |= Integer.MIN_VALUE;
        return this.f14558b.m6688h(0, this);
    }
}
