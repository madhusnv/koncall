package lo;

import l4.C4367l;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lo.b */
/* loaded from: classes3.dex */
public final class C4496b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f22375a;

    /* renamed from: b */
    public final /* synthetic */ C4367l f22376b;

    /* renamed from: c */
    public int f22377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4496b(C4367l c4367l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22376b = c4367l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22375a = obj;
        this.f22377c |= Integer.MIN_VALUE;
        Object objM9142v = this.f22376b.m9142v(this);
        return objM9142v == EnumC7794a.COROUTINE_SUSPENDED ? objM9142v : new C6364n(objM9142v);
    }
}
