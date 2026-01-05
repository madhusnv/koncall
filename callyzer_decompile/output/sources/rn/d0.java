package rn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f31484a;

    /* renamed from: b */
    public final /* synthetic */ h0 f31485b;

    /* renamed from: c */
    public int f31486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31485b = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31484a = obj;
        this.f31486c |= Integer.MIN_VALUE;
        return this.f31485b.m12612M(0, null, this);
    }
}
