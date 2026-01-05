package dd;

import dy.C1855c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.q */
/* loaded from: classes.dex */
public final class C1699q extends AbstractC8193c {

    /* renamed from: a */
    public int f8297a;

    /* renamed from: b */
    public C1855c f8298b;

    /* renamed from: c */
    public /* synthetic */ Object f8299c;

    /* renamed from: d */
    public final /* synthetic */ C1700r f8300d;

    /* renamed from: e */
    public int f8301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1699q(C1700r c1700r, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8300d = c1700r;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8299c = obj;
        this.f8301e |= Integer.MIN_VALUE;
        return C1700r.m5391a(this.f8300d, 0, this);
    }
}
