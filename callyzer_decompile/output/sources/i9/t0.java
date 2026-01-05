package i9;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17273a;

    /* renamed from: b */
    public final /* synthetic */ u0 f17274b;

    /* renamed from: c */
    public int f17275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17274b = u0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17273a = obj;
        this.f17275c |= Integer.MIN_VALUE;
        return this.f17274b.resolve(null, this);
    }
}
