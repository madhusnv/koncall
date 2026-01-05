package dt;

import at.C0431b;
import ex.InterfaceC2141e;
import java.util.List;
import mm.C4802m;
import og.od;
import qn.C6263l;
import qw.a0;
import sc.c0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import zs.C9054s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.q */
/* loaded from: classes3.dex */
public final class C1811q extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f8752a;

    /* renamed from: b */
    public int f8753b;

    /* renamed from: c */
    public int f8754c;

    /* renamed from: d */
    public final /* synthetic */ c0 f8755d;

    /* renamed from: e */
    public final /* synthetic */ C1813s f8756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1811q(c0 c0Var, C1813s c1813s, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8755d = c0Var;
        this.f8756e = c1813s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C1811q(this.f8755d, this.f8756e, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1811q) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Object objM15696l;
        int i11;
        Object value;
        C0431b c0431b;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i12 = this.f8754c;
        C1813s c1813s = this.f8756e;
        if (i12 == 0) {
            od.m10798c(obj);
            i10 = ((C9054s) this.f8755d).f43564a;
            C6263l c6263l = c1813s.f8758b;
            this.f8752a = i10;
            this.f8753b = i10;
            this.f8754c = 1;
            objM15696l = c6263l.f30352b.m15696l(this);
            if (objM15696l == enumC7794a) {
                return enumC7794a;
            }
            i11 = i10;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f8753b;
            i10 = this.f8752a;
            od.m10798c(obj);
            objM15696l = obj;
        }
        String str = ((C4802m) ((List) objM15696l).get(i11)).f23891c;
        m1 m1Var = c1813s.f8764h;
        do {
            value = m1Var.getValue();
            c0431b = (C0431b) value;
        } while (!m1Var.m15397i(value, C0431b.m1454a(c0431b, null, 0, null, 0, false, false, null, null, null, false, str == null ? c0431b.f3179k : str, new Integer(i10), null, null, null, null, null, null, false, 2094079)));
        return a0.f30746a;
    }
}
