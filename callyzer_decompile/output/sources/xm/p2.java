package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p2 extends AbstractC8193c {

    /* renamed from: a */
    public long f40704a;

    /* renamed from: b */
    public /* synthetic */ Object f40705b;

    /* renamed from: c */
    public final /* synthetic */ s2 f40706c;

    /* renamed from: d */
    public int f40707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(s2 s2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40706c = s2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40705b = obj;
        this.f40707d |= Integer.MIN_VALUE;
        return this.f40706c.m15623g(0L, this);
    }
}
