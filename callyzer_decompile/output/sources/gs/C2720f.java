package gs;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.f */
/* loaded from: classes3.dex */
public final class C2720f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f15171a;

    /* renamed from: b */
    public final /* synthetic */ C2721g f15172b;

    /* renamed from: c */
    public int f15173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2720f(C2721g c2721g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15172b = c2721g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15171a = obj;
        this.f15173c |= Integer.MIN_VALUE;
        return C2721g.m6723g(this.f15172b, this);
    }
}
