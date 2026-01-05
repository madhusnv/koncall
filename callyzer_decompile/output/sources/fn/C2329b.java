package fn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fn.b */
/* loaded from: classes3.dex */
public final class C2329b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f10563a;

    /* renamed from: b */
    public final /* synthetic */ C2336i f10564b;

    /* renamed from: c */
    public int f10565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2329b(C2336i c2336i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10564b = c2336i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10563a = obj;
        this.f10565c |= Integer.MIN_VALUE;
        return this.f10564b.m6023c(this);
    }
}
