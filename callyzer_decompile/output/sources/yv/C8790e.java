package yv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.e */
/* loaded from: classes3.dex */
public final class C8790e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42454a;

    /* renamed from: b */
    public final /* synthetic */ C8791f f42455b;

    /* renamed from: c */
    public int f42456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8790e(C8791f c8791f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42455b = c8791f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42454a = obj;
        this.f42456c |= Integer.MIN_VALUE;
        return this.f42455b.m16175a(null, null, null, null, this);
    }
}
