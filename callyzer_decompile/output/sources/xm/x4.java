package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x4 extends AbstractC8193c {

    /* renamed from: a */
    public String f41014a;

    /* renamed from: b */
    public /* synthetic */ Object f41015b;

    /* renamed from: c */
    public final /* synthetic */ y5 f41016c;

    /* renamed from: d */
    public int f41017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(y5 y5Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41016c = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41015b = obj;
        this.f41017d |= Integer.MIN_VALUE;
        return this.f41016c.m15693i(null, this);
    }
}
