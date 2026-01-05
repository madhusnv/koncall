package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class u2 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40890a;

    /* renamed from: b */
    public final /* synthetic */ w2 f40891b;

    /* renamed from: c */
    public int f40892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w2 w2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40891b = w2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40890a = obj;
        this.f40892c |= Integer.MIN_VALUE;
        return this.f40891b.m15637c(null, false, null, null, null, false, null, 0, this);
    }
}
