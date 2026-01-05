package ks;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 extends AbstractC8193c {

    /* renamed from: a */
    public boolean f21438a;

    /* renamed from: b */
    public /* synthetic */ Object f21439b;

    /* renamed from: c */
    public final /* synthetic */ q0 f21440c;

    /* renamed from: d */
    public int f21441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q0 q0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21440c = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21439b = obj;
        this.f21441d |= Integer.MIN_VALUE;
        return this.f21440c.m8970m(false, this);
    }
}
