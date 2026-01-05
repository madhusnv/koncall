package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t3 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40862a;

    /* renamed from: b */
    public final /* synthetic */ b0 f40863b;

    /* renamed from: c */
    public int f40864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(b0 b0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40863b = b0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40862a = obj;
        this.f40864c |= Integer.MIN_VALUE;
        return this.f40863b.m15558d(null, this);
    }
}
