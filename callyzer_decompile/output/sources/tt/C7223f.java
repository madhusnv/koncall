package tt;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tt.f */
/* loaded from: classes3.dex */
public final class C7223f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34539a;

    /* renamed from: b */
    public final /* synthetic */ C7224g f34540b;

    /* renamed from: c */
    public int f34541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7223f(C7224g c7224g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34540b = c7224g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34539a = obj;
        this.f34541c |= Integer.MIN_VALUE;
        return C7224g.m13452g(this.f34540b, this);
    }
}
