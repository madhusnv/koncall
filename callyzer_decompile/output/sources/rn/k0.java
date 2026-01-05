package rn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f31566a;

    /* renamed from: b */
    public final /* synthetic */ q0 f31567b;

    /* renamed from: c */
    public int f31568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q0 q0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31567b = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31566a = obj;
        this.f31568c |= Integer.MIN_VALUE;
        return this.f31567b.m12644m(false, this);
    }
}
