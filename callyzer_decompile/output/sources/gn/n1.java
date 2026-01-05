package gn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n1 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f14705a;

    /* renamed from: b */
    public final /* synthetic */ x2 f14706b;

    /* renamed from: c */
    public int f14707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14706b = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14705a = obj;
        this.f14707c |= Integer.MIN_VALUE;
        return this.f14706b.l0(this);
    }
}
