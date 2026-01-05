package tt;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tt.e */
/* loaded from: classes3.dex */
public final class C7222e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34536a;

    /* renamed from: b */
    public final /* synthetic */ C7224g f34537b;

    /* renamed from: c */
    public int f34538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7222e(C7224g c7224g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34537b = c7224g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34536a = obj;
        this.f34538c |= Integer.MIN_VALUE;
        return C7224g.m13451f(this.f34537b, this);
    }
}
