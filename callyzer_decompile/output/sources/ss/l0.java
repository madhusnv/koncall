package ss;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f33456a;

    /* renamed from: b */
    public final /* synthetic */ z0 f33457b;

    /* renamed from: c */
    public int f33458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(z0 z0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f33457b = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33456a = obj;
        this.f33458c |= Integer.MIN_VALUE;
        return z0.m13186i(this.f33457b, this);
    }
}
