package yo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yo.a */
/* loaded from: classes3.dex */
public final class C8717a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42164a;

    /* renamed from: b */
    public final /* synthetic */ C8720d f42165b;

    /* renamed from: c */
    public int f42166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8717a(C8720d c8720d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42165b = c8720d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42164a = obj;
        this.f42166c |= Integer.MIN_VALUE;
        return this.f42165b.m16109a(null, this);
    }
}
