package ks;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.e */
/* loaded from: classes3.dex */
public final class C4216e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21394a;

    /* renamed from: b */
    public final /* synthetic */ C4223l f21395b;

    /* renamed from: c */
    public int f21396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4216e(C4223l c4223l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21395b = c4223l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21394a = obj;
        this.f21396c |= Integer.MIN_VALUE;
        return this.f21395b.m8960g(this);
    }
}
