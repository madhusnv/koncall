package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d5 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40226a;

    /* renamed from: b */
    public final /* synthetic */ y5 f40227b;

    /* renamed from: c */
    public int f40228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(y5 y5Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40227b = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40226a = obj;
        this.f40228c |= Integer.MIN_VALUE;
        return this.f40227b.m15697m(null, this);
    }
}
