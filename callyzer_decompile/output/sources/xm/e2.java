package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e2 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40243a;

    /* renamed from: b */
    public final /* synthetic */ l2 f40244b;

    /* renamed from: c */
    public int f40245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(l2 l2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40244b = l2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40243a = obj;
        this.f40245c |= Integer.MIN_VALUE;
        return this.f40244b.m15591g(null, this);
    }
}
