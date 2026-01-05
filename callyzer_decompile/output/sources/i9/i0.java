package i9;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17183a;

    /* renamed from: b */
    public final /* synthetic */ l0 f17184b;

    /* renamed from: c */
    public int f17185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17184b = l0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17183a = obj;
        this.f17185c |= Integer.MIN_VALUE;
        return l0.m7546a(this.f17184b, this);
    }
}
