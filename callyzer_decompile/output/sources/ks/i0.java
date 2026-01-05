package ks;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21424a;

    /* renamed from: b */
    public final /* synthetic */ q0 f21425b;

    /* renamed from: c */
    public int f21426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(q0 q0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21425b = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21424a = obj;
        this.f21426c |= Integer.MIN_VALUE;
        return q0.m8966i(this.f21425b, this);
    }
}
