package xv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.j */
/* loaded from: classes3.dex */
public final class C8483j extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f41319a;

    /* renamed from: b */
    public final /* synthetic */ C8489p f41320b;

    /* renamed from: c */
    public int f41321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8483j(C8489p c8489p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41320b = c8489p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41319a = obj;
        this.f41321c |= Integer.MIN_VALUE;
        return this.f41320b.m15783l(this);
    }
}
