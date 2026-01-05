package an;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f1030a;

    /* renamed from: b */
    public final /* synthetic */ h3 f1031b;

    /* renamed from: c */
    public int f1032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h3 h3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f1031b = h3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f1030a = obj;
        this.f1032c |= Integer.MIN_VALUE;
        return h3.m452B(this.f1031b, null, this);
    }
}
