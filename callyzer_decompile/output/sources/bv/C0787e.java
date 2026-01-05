package bv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bv.e */
/* loaded from: classes3.dex */
public final class C0787e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f4969a;

    /* renamed from: b */
    public final /* synthetic */ C0790h f4970b;

    /* renamed from: c */
    public int f4971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0787e(C0790h c0790h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4970b = c0790h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4969a = obj;
        this.f4971c |= Integer.MIN_VALUE;
        return C0790h.m2114e(this.f4970b, this);
    }
}
