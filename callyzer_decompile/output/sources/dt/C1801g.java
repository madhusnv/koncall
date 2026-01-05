package dt;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.g */
/* loaded from: classes3.dex */
public final class C1801g extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f8716a;

    /* renamed from: b */
    public final /* synthetic */ C1804j f8717b;

    /* renamed from: c */
    public int f8718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801g(C1804j c1804j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8717b = c1804j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8716a = obj;
        this.f8718c |= Integer.MIN_VALUE;
        return C1804j.m5474e(this.f8717b, this);
    }
}
