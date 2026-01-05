package cd;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cd.d */
/* loaded from: classes.dex */
public final class C0949d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f5719a;

    /* renamed from: b */
    public final /* synthetic */ C0951f f5720b;

    /* renamed from: c */
    public int f5721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0949d(C0951f c0951f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f5720b = c0951f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f5719a = obj;
        this.f5721c |= Integer.MIN_VALUE;
        return this.f5720b.mo2716b(this);
    }
}
