package z7;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC8193c {

    /* renamed from: a */
    public C8889r f42712a;

    /* renamed from: b */
    public int f42713b;

    /* renamed from: c */
    public /* synthetic */ Object f42714c;

    /* renamed from: d */
    public final /* synthetic */ C8889r f42715d;

    /* renamed from: e */
    public int f42716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(C8889r c8889r, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42715d = c8889r;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42714c = obj;
        this.f42716e |= Integer.MIN_VALUE;
        return C8889r.m16384l(this.f42715d, this);
    }
}
