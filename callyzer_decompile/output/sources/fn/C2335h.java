package fn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fn.h */
/* loaded from: classes3.dex */
public final class C2335h extends AbstractC8193c {

    /* renamed from: a */
    public int f10581a;

    /* renamed from: b */
    public /* synthetic */ Object f10582b;

    /* renamed from: c */
    public final /* synthetic */ C2336i f10583c;

    /* renamed from: d */
    public int f10584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335h(C2336i c2336i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10583c = c2336i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10582b = obj;
        this.f10584d |= Integer.MIN_VALUE;
        return this.f10583c.m6035o(0, this);
    }
}
