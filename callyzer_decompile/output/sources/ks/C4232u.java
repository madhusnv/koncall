package ks;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.u */
/* loaded from: classes3.dex */
public final class C4232u extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21526a;

    /* renamed from: b */
    public final /* synthetic */ c0 f21527b;

    /* renamed from: c */
    public int f21528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4232u(c0 c0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21527b = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21526a = obj;
        this.f21528c |= Integer.MIN_VALUE;
        return c0.m8948i(this.f21527b, this);
    }
}
