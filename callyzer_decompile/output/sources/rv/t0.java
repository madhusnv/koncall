package rv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f31905a;

    /* renamed from: b */
    public final /* synthetic */ v0 f31906b;

    /* renamed from: c */
    public int f31907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31906b = v0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31905a = obj;
        this.f31907c |= Integer.MIN_VALUE;
        return v0.m12687e(this.f31906b, this);
    }
}
