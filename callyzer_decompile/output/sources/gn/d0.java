package gn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends AbstractC8193c {

    /* renamed from: a */
    public long f14447a;

    /* renamed from: b */
    public /* synthetic */ Object f14448b;

    /* renamed from: c */
    public final /* synthetic */ x2 f14449c;

    /* renamed from: d */
    public int f14450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14449c = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14448b = obj;
        this.f14450d |= Integer.MIN_VALUE;
        return this.f14449c.m6657C(null, null, null, null, this, false);
    }
}
