package qn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qn.k */
/* loaded from: classes3.dex */
public final class C6262k extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f30348a;

    /* renamed from: b */
    public final /* synthetic */ C6263l f30349b;

    /* renamed from: c */
    public int f30350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6262k(C6263l c6263l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30349b = c6263l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30348a = obj;
        this.f30350c |= Integer.MIN_VALUE;
        return this.f30349b.m12268n(null, null, 0, this);
    }
}
