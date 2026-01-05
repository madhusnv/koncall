package yn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.d */
/* loaded from: classes3.dex */
public final class C8706d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42082a;

    /* renamed from: b */
    public final /* synthetic */ C8716n f42083b;

    /* renamed from: c */
    public int f42084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8706d(C8716n c8716n, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42083b = c8716n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42082a = obj;
        this.f42084c |= Integer.MIN_VALUE;
        return this.f42083b.m16106d(this);
    }
}
