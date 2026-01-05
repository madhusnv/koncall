package ae;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.k */
/* loaded from: classes.dex */
public final class C0130k extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f414a;

    /* renamed from: b */
    public final /* synthetic */ C0132m f415b;

    /* renamed from: c */
    public int f416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130k(C0132m c0132m, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f415b = c0132m;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f414a = obj;
        this.f416c |= Integer.MIN_VALUE;
        return this.f415b.m302b(null, this);
    }
}
