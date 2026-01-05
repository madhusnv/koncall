package gn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f14391a;

    /* renamed from: b */
    public final /* synthetic */ x2 f14392b;

    /* renamed from: c */
    public int f14393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14392b = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14391a = obj;
        this.f14393c |= Integer.MIN_VALUE;
        return this.f14392b.m6706z(null, this);
    }
}
