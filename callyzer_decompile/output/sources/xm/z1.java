package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z1 extends AbstractC8193c {

    /* renamed from: a */
    public String f41085a;

    /* renamed from: b */
    public /* synthetic */ Object f41086b;

    /* renamed from: c */
    public final /* synthetic */ l2 f41087c;

    /* renamed from: d */
    public int f41088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(l2 l2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41087c = l2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41086b = obj;
        this.f41088d |= Integer.MIN_VALUE;
        return this.f41087c.m15586b(null, this);
    }
}
