package mn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.e */
/* loaded from: classes3.dex */
public final class C4808e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f23982a;

    /* renamed from: b */
    public final /* synthetic */ C4812i f23983b;

    /* renamed from: c */
    public int f23984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4808e(C4812i c4812i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f23983b = c4812i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f23982a = obj;
        this.f23984c |= Integer.MIN_VALUE;
        return this.f23983b.m9781d(null, null, null, null, this, false);
    }
}
