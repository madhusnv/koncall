package tv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tv.b */
/* loaded from: classes3.dex */
public final class C7228b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34564a;

    /* renamed from: b */
    public final /* synthetic */ C7230d f34565b;

    /* renamed from: c */
    public int f34566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7228b(C7230d c7230d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34565b = c7230d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34564a = obj;
        this.f34566c |= Integer.MIN_VALUE;
        return C7230d.m13455e(this.f34565b, this);
    }
}
