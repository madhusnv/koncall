package ep;

import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ep.c */
/* loaded from: classes3.dex */
public final class C2085c extends AbstractC8193c {

    /* renamed from: a */
    public Object f9755a;

    /* renamed from: b */
    public LocalDateTime f9756b;

    /* renamed from: c */
    public LocalDateTime f9757c;

    /* renamed from: d */
    public /* synthetic */ Object f9758d;

    /* renamed from: e */
    public final /* synthetic */ C2088f f9759e;

    /* renamed from: f */
    public int f9760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2085c(C2088f c2088f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f9759e = c2088f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f9758d = obj;
        this.f9760f |= Integer.MIN_VALUE;
        return C2088f.m5800h(this.f9759e, this);
    }
}
