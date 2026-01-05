package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d3 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40222a;

    /* renamed from: b */
    public final /* synthetic */ r3 f40223b;

    /* renamed from: c */
    public int f40224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(r3 r3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40223b = r3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40222a = obj;
        this.f40224c |= Integer.MIN_VALUE;
        return this.f40223b.m15604c(null, this);
    }
}
