package rn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f31471a;

    /* renamed from: b */
    public final /* synthetic */ h0 f31472b;

    /* renamed from: c */
    public int f31473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31472b = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31471a = obj;
        this.f31473c |= Integer.MIN_VALUE;
        return this.f31472b.m12611L(this);
    }
}
