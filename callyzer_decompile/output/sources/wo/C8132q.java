package wo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.q */
/* loaded from: classes3.dex */
public final class C8132q extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f38942a;

    /* renamed from: b */
    public final /* synthetic */ C8134s f38943b;

    /* renamed from: c */
    public int f38944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8132q(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38943b = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38942a = obj;
        this.f38944c |= Integer.MIN_VALUE;
        return this.f38943b.m15316t(null, this);
    }
}
