package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h2 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40373a;

    /* renamed from: b */
    public final /* synthetic */ l2 f40374b;

    /* renamed from: c */
    public int f40375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(l2 l2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40374b = l2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40373a = obj;
        this.f40375c |= Integer.MIN_VALUE;
        return this.f40374b.m15594j(null, this);
    }
}
