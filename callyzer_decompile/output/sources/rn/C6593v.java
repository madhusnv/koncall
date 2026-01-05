package rn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.v */
/* loaded from: classes3.dex */
public final class C6593v extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f31680a;

    /* renamed from: b */
    public final /* synthetic */ h0 f31681b;

    /* renamed from: c */
    public int f31682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6593v(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31681b = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31680a = obj;
        this.f31682c |= Integer.MIN_VALUE;
        return this.f31681b.m12605F(null, this);
    }
}
