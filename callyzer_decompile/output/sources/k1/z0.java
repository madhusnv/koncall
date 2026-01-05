package k1;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends AbstractC8193c {

    /* renamed from: a */
    public a1 f20335a;

    /* renamed from: b */
    public /* synthetic */ Object f20336b;

    /* renamed from: c */
    public final /* synthetic */ a1 f20337c;

    /* renamed from: d */
    public int f20338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f20337c = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20336b = obj;
        this.f20338d |= Integer.MIN_VALUE;
        return this.f20337c.m8440f(this);
    }
}
