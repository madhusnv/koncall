package w3;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f37919a;

    /* renamed from: b */
    public final /* synthetic */ r0 f37920b;

    /* renamed from: c */
    public int f37921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f37920b = r0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f37919a = obj;
        this.f37921c |= Integer.MIN_VALUE;
        return this.f37920b.m15001a(null, this);
    }
}
