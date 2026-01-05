package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l3 extends AbstractC8193c {

    /* renamed from: a */
    public boolean f40534a;

    /* renamed from: b */
    public /* synthetic */ Object f40535b;

    /* renamed from: c */
    public final /* synthetic */ r3 f40536c;

    /* renamed from: d */
    public int f40537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(r3 r3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40536c = r3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40535b = obj;
        this.f40537d |= Integer.MIN_VALUE;
        return this.f40536c.m15610i(false, this);
    }
}
