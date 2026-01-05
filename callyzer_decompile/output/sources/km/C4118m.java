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
/* renamed from: km.m */
/* loaded from: classes3.dex */
public final class C4118m extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21044a;

    /* renamed from: b */
    public /* synthetic */ Object f21045b;

    /* renamed from: c */
    public final /* synthetic */ C6765d f21046c;

    /* renamed from: d */
    public final /* synthetic */ boolean f21047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4118m(C6765d c6765d, boolean z6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21044a = i10;
        this.f21046c = c6765d;
        this.f21047d = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21044a) {
            case 0:
                C4118m c4118m = new C4118m(this.f21046c, this.f21047d, interfaceC7559c, 0);
                c4118m.f21045b = obj;
                return c4118m;
            default:
                C4118m c4118m2 = new C4118m(this.f21046c, this.f21047d, interfaceC7559c, 1);
                c4118m2.f21045b = obj;
                return c4118m2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C6763b c6763b = (C6763b) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21044a) {
            case 0:
                C4118m c4118m = (C4118m) create(c6763b, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c4118m.invokeSuspend(a0Var);
                return a0Var;
            default:
                C4118m c4118m2 = (C4118m) create(c6763b, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c4118m2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f21044a;
        a0 a0Var = a0.f30746a;
        boolean z6 = this.f21047d;
        C6765d c6765d = this.f21046c;
        switch (i10) {
            case 0:
                C6763b c6763b = (C6763b) this.f21045b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c6763b.m12968e(c6765d, Boolean.valueOf(z6));
                break;
            default:
                C6763b c6763b2 = (C6763b) this.f21045b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c6763b2.m12968e(c6765d, Boolean.valueOf(z6));
                break;
        }
        return a0Var;
    }
}
