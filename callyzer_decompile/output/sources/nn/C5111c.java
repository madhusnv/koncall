package nn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nn.c */
/* loaded from: classes3.dex */
public final class C5111c extends AbstractC8193c {

    /* renamed from: a */
    public int f25022a;

    /* renamed from: b */
    public /* synthetic */ Object f25023b;

    /* renamed from: c */
    public final /* synthetic */ C5113e f25024c;

    /* renamed from: d */
    public int f25025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5111c(C5113e c5113e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f25024c = c5113e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25023b = obj;
        this.f25025d |= Integer.MIN_VALUE;
        return this.f25024c.m10039b(0, this);
    }
}
