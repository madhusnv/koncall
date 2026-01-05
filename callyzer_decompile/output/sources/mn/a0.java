package mn;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC8193c {

    /* renamed from: a */
    public long f23924a;

    /* renamed from: b */
    public /* synthetic */ Object f23925b;

    /* renamed from: c */
    public final /* synthetic */ g0 f23926c;

    /* renamed from: d */
    public int f23927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f23926c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f23925b = obj;
        this.f23927d |= Integer.MIN_VALUE;
        Object objM9773q = this.f23926c.m9773q(null, null, null, null, this, false);
        return objM9773q == EnumC7794a.COROUTINE_SUSPENDED ? objM9773q : new C6364n(objM9773q);
    }
}
