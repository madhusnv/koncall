package mn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.d */
/* loaded from: classes3.dex */
public final class C4807d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f23956a;

    /* renamed from: b */
    public final /* synthetic */ C4812i f23957b;

    /* renamed from: c */
    public int f23958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4807d(C4812i c4812i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f23957b = c4812i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f23956a = obj;
        this.f23958c |= Integer.MIN_VALUE;
        return this.f23957b.m9780c(null, null, null, null, this, false);
    }
}
