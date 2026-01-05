package fk;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends AbstractC8193c {

    /* renamed from: a */
    public v0 f10495a;

    /* renamed from: b */
    public /* synthetic */ Object f10496b;

    /* renamed from: c */
    public final /* synthetic */ v0 f10497c;

    /* renamed from: d */
    public int f10498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10497c = v0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10496b = obj;
        this.f10498d |= Integer.MIN_VALUE;
        return v0.m5985a(this.f10497c, this);
    }
}
