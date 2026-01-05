package wo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.f */
/* loaded from: classes3.dex */
public final class C8121f extends AbstractC8193c {

    /* renamed from: a */
    public int f38869a;

    /* renamed from: b */
    public /* synthetic */ Object f38870b;

    /* renamed from: c */
    public final /* synthetic */ C8134s f38871c;

    /* renamed from: d */
    public int f38872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8121f(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38871c = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38870b = obj;
        this.f38872d |= Integer.MIN_VALUE;
        return this.f38871c.m15305h(0, this);
    }
}
