package ss;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f33430a;

    /* renamed from: b */
    public final /* synthetic */ z0 f33431b;

    /* renamed from: c */
    public int f33432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(z0 z0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f33431b = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33430a = obj;
        this.f33432c |= Integer.MIN_VALUE;
        return z0.m13182e(this.f33431b, this);
    }
}
