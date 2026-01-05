package lo;

import l4.C4367l;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lo.c */
/* loaded from: classes3.dex */
public final class C4497c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f22378a;

    /* renamed from: b */
    public final /* synthetic */ C4367l f22379b;

    /* renamed from: c */
    public int f22380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4497c(C4367l c4367l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22379b = c4367l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22378a = obj;
        this.f22380c |= Integer.MIN_VALUE;
        Object objM9143w = this.f22379b.m9143w(0, this);
        return objM9143w == EnumC7794a.COROUTINE_SUSPENDED ? objM9143w : new C6364n(objM9143w);
    }
}
