package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends AbstractC8193c {

    /* renamed from: a */
    public String f40210a;

    /* renamed from: b */
    public /* synthetic */ Object f40211b;

    /* renamed from: c */
    public final /* synthetic */ g0 f40212c;

    /* renamed from: d */
    public int f40213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40212c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40211b = obj;
        this.f40213d |= Integer.MIN_VALUE;
        return this.f40212c.m15576c(this);
    }
}
