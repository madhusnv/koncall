package np;

import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: np.c */
/* loaded from: classes3.dex */
public final class C5125c extends AbstractC8193c {

    /* renamed from: a */
    public Object f25104a;

    /* renamed from: b */
    public LocalDateTime f25105b;

    /* renamed from: c */
    public LocalDateTime f25106c;

    /* renamed from: d */
    public /* synthetic */ Object f25107d;

    /* renamed from: e */
    public final /* synthetic */ C5128f f25108e;

    /* renamed from: f */
    public int f25109f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5125c(C5128f c5128f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f25108e = c5128f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25107d = obj;
        this.f25109f |= Integer.MIN_VALUE;
        return C5128f.m10052h(this.f25108e, this);
    }
}
