package au;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.m */
/* loaded from: classes3.dex */
public final class C0449m extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f3245a;

    /* renamed from: b */
    public final /* synthetic */ C0450n f3246b;

    /* renamed from: c */
    public int f3247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449m(C0450n c0450n, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3246b = c0450n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3245a = obj;
        this.f3247c |= Integer.MIN_VALUE;
        return C0450n.m1457e(this.f3246b, this);
    }
}
