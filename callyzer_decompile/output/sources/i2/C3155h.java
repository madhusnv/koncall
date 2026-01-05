package i2;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.h */
/* loaded from: classes.dex */
public final class C3155h extends AbstractC8193c {

    /* renamed from: a */
    public C3160m f17049a;

    /* renamed from: b */
    public /* synthetic */ Object f17050b;

    /* renamed from: c */
    public final /* synthetic */ C3160m f17051c;

    /* renamed from: d */
    public int f17052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3155h(C3160m c3160m, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17051c = c3160m;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17050b = obj;
        this.f17052d |= Integer.MIN_VALUE;
        return this.f17051c.O0(this);
    }
}
