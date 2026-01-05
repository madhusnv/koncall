package dr;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.j */
/* loaded from: classes3.dex */
public final class C1760j extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f8539a;

    /* renamed from: b */
    public final /* synthetic */ C1775y f8540b;

    /* renamed from: c */
    public int f8541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1760j(C1775y c1775y, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8540b = c1775y;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8539a = obj;
        this.f8541c |= Integer.MIN_VALUE;
        return this.f8540b.m5456p(this);
    }
}
