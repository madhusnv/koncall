package i1;

import m1.C4626h;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends AbstractC8193c {

    /* renamed from: a */
    public n0 f16899a;

    /* renamed from: b */
    public C4626h f16900b;

    /* renamed from: c */
    public /* synthetic */ Object f16901c;

    /* renamed from: d */
    public final /* synthetic */ n0 f16902d;

    /* renamed from: e */
    public int f16903e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16902d = n0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16901c = obj;
        this.f16903e |= Integer.MIN_VALUE;
        return n0.L0(this.f16902d, this);
    }
}
