package yn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.c */
/* loaded from: classes3.dex */
public final class C8705c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42079a;

    /* renamed from: b */
    public final /* synthetic */ C8716n f42080b;

    /* renamed from: c */
    public int f42081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8705c(C8716n c8716n, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42080b = c8716n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42079a = obj;
        this.f42081c |= Integer.MIN_VALUE;
        return this.f42080b.m16105c(this);
    }
}
