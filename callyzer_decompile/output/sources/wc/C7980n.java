package wc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.n */
/* loaded from: classes.dex */
public final class C7980n extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f38384a;

    /* renamed from: b */
    public final /* synthetic */ C7983q f38385b;

    /* renamed from: c */
    public int f38386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7980n(C7983q c7983q, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38385b = c7983q;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38384a = obj;
        this.f38386c |= Integer.MIN_VALUE;
        return this.f38385b.m15154u(this);
    }
}
