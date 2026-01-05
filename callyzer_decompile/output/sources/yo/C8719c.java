package yo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yo.c */
/* loaded from: classes3.dex */
public final class C8719c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42182a;

    /* renamed from: b */
    public final /* synthetic */ C8720d f42183b;

    /* renamed from: c */
    public int f42184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8719c(C8720d c8720d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42183b = c8720d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42182a = obj;
        this.f42184c |= Integer.MIN_VALUE;
        return this.f42183b.m16111c(null, this);
    }
}
