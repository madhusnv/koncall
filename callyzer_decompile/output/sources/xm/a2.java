package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a2 extends AbstractC8193c {

    /* renamed from: a */
    public int f40111a;

    /* renamed from: b */
    public /* synthetic */ Object f40112b;

    /* renamed from: c */
    public final /* synthetic */ l2 f40113c;

    /* renamed from: d */
    public int f40114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(l2 l2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40113c = l2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40112b = obj;
        this.f40114d |= Integer.MIN_VALUE;
        return this.f40113c.m15587c(0, this);
    }
}
