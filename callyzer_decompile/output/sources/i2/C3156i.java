package i2;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.i */
/* loaded from: classes.dex */
public final class C3156i extends AbstractC8193c {

    /* renamed from: a */
    public C3160m f17053a;

    /* renamed from: b */
    public /* synthetic */ Object f17054b;

    /* renamed from: c */
    public final /* synthetic */ C3160m f17055c;

    /* renamed from: d */
    public int f17056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3156i(C3160m c3160m, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17055c = c3160m;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17054b = obj;
        this.f17056d |= Integer.MIN_VALUE;
        return this.f17055c.P0(this);
    }
}
