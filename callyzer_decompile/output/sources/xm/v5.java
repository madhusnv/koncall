package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v5 extends AbstractC8193c {

    /* renamed from: a */
    public Object f40943a;

    /* renamed from: b */
    public /* synthetic */ Object f40944b;

    /* renamed from: c */
    public final /* synthetic */ y5 f40945c;

    /* renamed from: d */
    public int f40946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(y5 y5Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40945c = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40944b = obj;
        this.f40946d |= Integer.MIN_VALUE;
        return y5.m15681c(this.f40945c, this);
    }
}
