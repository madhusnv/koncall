package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40799a;

    /* renamed from: b */
    public final /* synthetic */ x1 f40800b;

    /* renamed from: c */
    public int f40801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(x1 x1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40800b = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40799a = obj;
        this.f40801c |= Integer.MIN_VALUE;
        return this.f40800b.m15664n(null, this);
    }
}
