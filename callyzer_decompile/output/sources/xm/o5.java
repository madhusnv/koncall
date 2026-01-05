package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o5 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40675a;

    /* renamed from: b */
    public final /* synthetic */ y5 f40676b;

    /* renamed from: c */
    public int f40677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(y5 y5Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40676b = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40675a = obj;
        this.f40677c |= Integer.MIN_VALUE;
        return y5.m15679a(this.f40676b, this);
    }
}
