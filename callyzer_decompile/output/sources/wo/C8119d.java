package wo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.d */
/* loaded from: classes3.dex */
public final class C8119d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f38859a;

    /* renamed from: b */
    public final /* synthetic */ C8134s f38860b;

    /* renamed from: c */
    public int f38861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8119d(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38860b = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38859a = obj;
        this.f38861c |= Integer.MIN_VALUE;
        return this.f38860b.m15302e(this);
    }
}
