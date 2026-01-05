package ub;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ub.f */
/* loaded from: classes.dex */
public final class C7390f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f35141a;

    /* renamed from: b */
    public final /* synthetic */ C7392h f35142b;

    /* renamed from: c */
    public int f35143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7390f(C7392h c7392h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35142b = c7392h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35141a = obj;
        this.f35143c |= Integer.MIN_VALUE;
        return this.f35142b.m13801e(null, this);
    }
}
