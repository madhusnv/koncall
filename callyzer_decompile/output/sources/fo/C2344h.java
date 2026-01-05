package fo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.h */
/* loaded from: classes3.dex */
public final class C2344h extends AbstractC8193c {

    /* renamed from: a */
    public String f10612a;

    /* renamed from: b */
    public String f10613b;

    /* renamed from: c */
    public int f10614c;

    /* renamed from: d */
    public /* synthetic */ Object f10615d;

    /* renamed from: e */
    public final /* synthetic */ C2348l f10616e;

    /* renamed from: f */
    public int f10617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2344h(C2348l c2348l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10616e = c2348l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10615d = obj;
        this.f10617f |= Integer.MIN_VALUE;
        return this.f10616e.m6045e(null, null, 0, this);
    }
}
