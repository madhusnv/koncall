package an;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f1077a;

    /* renamed from: b */
    public final /* synthetic */ h3 f1078b;

    /* renamed from: c */
    public int f1079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h3 h3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f1078b = h3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f1077a = obj;
        this.f1079c |= Integer.MIN_VALUE;
        return h3.m453C(this.f1078b, 0, this);
    }
}
