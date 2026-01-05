package w3;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.u */
/* loaded from: classes.dex */
public final class C7903u extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f37965a;

    /* renamed from: b */
    public final /* synthetic */ C7904v f37966b;

    /* renamed from: c */
    public int f37967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7903u(C7904v c7904v, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f37966b = c7904v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f37965a = obj;
        this.f37967c |= Integer.MIN_VALUE;
        return this.f37966b.m15029K(null, this);
    }
}
