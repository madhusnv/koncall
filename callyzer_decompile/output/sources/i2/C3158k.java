package i2;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.k */
/* loaded from: classes.dex */
public final class C3158k extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17060a;

    /* renamed from: b */
    public final /* synthetic */ C3160m f17061b;

    /* renamed from: c */
    public int f17062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3158k(C3160m c3160m, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17061b = c3160m;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17060a = obj;
        this.f17062c |= Integer.MIN_VALUE;
        return this.f17061b.mo6163v(0L, this);
    }
}
