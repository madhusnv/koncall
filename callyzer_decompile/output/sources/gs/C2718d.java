package gs;

import es.C2127d;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.d */
/* loaded from: classes3.dex */
public final class C2718d extends AbstractC8193c {

    /* renamed from: a */
    public C2127d f15165a;

    /* renamed from: b */
    public /* synthetic */ Object f15166b;

    /* renamed from: c */
    public final /* synthetic */ C2721g f15167c;

    /* renamed from: d */
    public int f15168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2718d(C2721g c2721g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15167c = c2721g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15166b = obj;
        this.f15168d |= Integer.MIN_VALUE;
        return C2721g.m6722f(this.f15167c, null, this);
    }
}
