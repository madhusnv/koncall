package ub;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ub.d */
/* loaded from: classes.dex */
public final class C7388d extends AbstractC8193c {

    /* renamed from: a */
    public byte[] f35133a;

    /* renamed from: b */
    public /* synthetic */ Object f35134b;

    /* renamed from: c */
    public final /* synthetic */ C7392h f35135c;

    /* renamed from: d */
    public int f35136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7388d(C7392h c7392h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35135c = c7392h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35134b = obj;
        this.f35136d |= Integer.MIN_VALUE;
        return this.f35135c.m13799c(null, this);
    }
}
