package qn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qn.i */
/* loaded from: classes3.dex */
public final class C6260i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f30340a;

    /* renamed from: b */
    public final /* synthetic */ C6263l f30341b;

    /* renamed from: c */
    public int f30342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6260i(C6263l c6263l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30341b = c6263l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30340a = obj;
        this.f30342c |= Integer.MIN_VALUE;
        return this.f30341b.m12266l(null, this);
    }
}
