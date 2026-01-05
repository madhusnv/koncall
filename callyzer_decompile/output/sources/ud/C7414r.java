package ud;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.r */
/* loaded from: classes.dex */
public final class C7414r extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f35207a;

    /* renamed from: b */
    public final /* synthetic */ C7416t f35208b;

    /* renamed from: c */
    public int f35209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7414r(C7416t c7416t, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35208b = c7416t;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35207a = obj;
        this.f35209c |= Integer.MIN_VALUE;
        return this.f35208b.m13808c(null, this);
    }
}
