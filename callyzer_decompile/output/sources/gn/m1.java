package gn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m1 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f14676a;

    /* renamed from: b */
    public final /* synthetic */ x2 f14677b;

    /* renamed from: c */
    public int f14678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14677b = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14676a = obj;
        this.f14678c |= Integer.MIN_VALUE;
        return this.f14677b.k0(null, this);
    }
}
