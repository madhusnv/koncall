package to;

import c9.C0914i;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: to.e */
/* loaded from: classes3.dex */
public final class C7179e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34452a;

    /* renamed from: b */
    public final /* synthetic */ C0914i f34453b;

    /* renamed from: c */
    public int f34454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7179e(C0914i c0914i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34453b = c0914i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34452a = obj;
        this.f34454c |= Integer.MIN_VALUE;
        return this.f34453b.m2628h(this);
    }
}
