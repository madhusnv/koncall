package dt;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.i */
/* loaded from: classes3.dex */
public final class C1803i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f8725a;

    /* renamed from: b */
    public final /* synthetic */ C1804j f8726b;

    /* renamed from: c */
    public int f8727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1803i(C1804j c1804j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8726b = c1804j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8725a = obj;
        this.f8727c |= Integer.MIN_VALUE;
        return C1804j.m5476g(this.f8726b, this);
    }
}
