package ia;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.d */
/* loaded from: classes.dex */
public final class C3212d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17327a;

    /* renamed from: b */
    public final /* synthetic */ C3215g f17328b;

    /* renamed from: c */
    public int f17329c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3212d(C3215g c3215g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17328b = c3215g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17327a = obj;
        this.f17329c |= Integer.MIN_VALUE;
        return this.f17328b.m7557a(this);
    }
}
