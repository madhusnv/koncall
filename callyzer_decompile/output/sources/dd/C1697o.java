package dd;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.o */
/* loaded from: classes.dex */
public final class C1697o extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f8289a;

    /* renamed from: b */
    public final /* synthetic */ C1700r f8290b;

    /* renamed from: c */
    public int f8291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697o(C1700r c1700r, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8290b = c1700r;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8289a = obj;
        this.f8291c |= Integer.MIN_VALUE;
        return this.f8290b.m5392b(this);
    }
}
