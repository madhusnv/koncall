package km;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import s6.C6763b;
import s6.C6765d;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: km.n */
/* loaded from: classes3.dex */
public final class C4119n extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public /* synthetic */ Object f21048a;

    /* renamed from: b */
    public final /* synthetic */ C6765d f21049b;

    /* renamed from: c */
    public final /* synthetic */ long f21050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4119n(C6765d c6765d, long j6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21049b = c6765d;
        this.f21050c = j6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C4119n c4119n = new C4119n(this.f21049b, this.f21050c, interfaceC7559c);
        c4119n.f21048a = obj;
        return c4119n;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C4119n c4119n = (C4119n) create((C6763b) obj, (InterfaceC7559c) obj2);
        a0 a0Var = a0.f30746a;
        c4119n.invokeSuspend(a0Var);
        return a0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C6763b c6763b = (C6763b) this.f21048a;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        od.m10798c(obj);
        c6763b.m12968e(this.f21049b, new Long(this.f21050c));
        return a0.f30746a;
    }
}
