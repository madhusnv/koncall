package ao;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f2917a;

    /* renamed from: b */
    public final /* synthetic */ c0 f2918b;

    /* renamed from: c */
    public int f2919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f2918b = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f2917a = obj;
        this.f2919c |= Integer.MIN_VALUE;
        return c0.m1391f(this.f2918b, this);
    }
}
