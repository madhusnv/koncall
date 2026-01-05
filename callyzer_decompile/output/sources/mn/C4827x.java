package mn;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.x */
/* loaded from: classes3.dex */
public final class C4827x extends AbstractC8193c {

    /* renamed from: a */
    public long f24095a;

    /* renamed from: b */
    public /* synthetic */ Object f24096b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24097c;

    /* renamed from: d */
    public int f24098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4827x(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24097c = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24096b = obj;
        this.f24098d |= Integer.MIN_VALUE;
        Object objM9772p = this.f24097c.m9772p(null, null, null, null, this, false);
        return objM9772p == EnumC7794a.COROUTINE_SUSPENDED ? objM9772p : new C6364n(objM9772p);
    }
}
