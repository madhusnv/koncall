package i9;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.e */
/* loaded from: classes.dex */
public final class C3187e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17153a;

    /* renamed from: b */
    public final /* synthetic */ C3190h f17154b;

    /* renamed from: c */
    public int f17155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3187e(C3190h c3190h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17154b = c3190h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17153a = obj;
        this.f17155c |= Integer.MIN_VALUE;
        return this.f17154b.m7543j(null, this);
    }
}
