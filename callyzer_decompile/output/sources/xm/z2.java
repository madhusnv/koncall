package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z2 extends AbstractC8193c {

    /* renamed from: a */
    public String f41089a;

    /* renamed from: b */
    public /* synthetic */ Object f41090b;

    /* renamed from: c */
    public final /* synthetic */ b0 f41091c;

    /* renamed from: d */
    public int f41092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(b0 b0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41091c = b0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41090b = obj;
        this.f41092d |= Integer.MIN_VALUE;
        return b0.m15555a(this.f41091c, null, this);
    }
}
