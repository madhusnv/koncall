package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40438a;

    /* renamed from: b */
    public final /* synthetic */ x1 f40439b;

    /* renamed from: c */
    public int f40440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(x1 x1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40439b = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40438a = obj;
        this.f40440c |= Integer.MIN_VALUE;
        return x1.m15641a(this.f40439b, null, this);
    }
}
