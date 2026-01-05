package to;

import c9.C0914i;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: to.c */
/* loaded from: classes3.dex */
public final class C7177c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34446a;

    /* renamed from: b */
    public final /* synthetic */ C0914i f34447b;

    /* renamed from: c */
    public int f34448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7177c(C0914i c0914i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34447b = c0914i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34446a = obj;
        this.f34448c |= Integer.MIN_VALUE;
        return this.f34447b.m2627g(this);
    }
}
