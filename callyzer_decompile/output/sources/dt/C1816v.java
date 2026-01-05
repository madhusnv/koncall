package dt;

import at.C0433d;
import ay.C0496f;
import ex.InterfaceC2141e;
import og.od;
import qn.C6263l;
import qw.C6361k;
import qw.a0;
import td.AbstractC7136m;
import tx.InterfaceC7266z;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import ux.C7569c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.m1;
import yx.AbstractC8819m;
import zs.C9056u;
import zs.C9058w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.v */
/* loaded from: classes3.dex */
public final class C1816v extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8781a;

    /* renamed from: b */
    public int f8782b;

    /* renamed from: c */
    public final /* synthetic */ C1818x f8783c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC7136m f8784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1816v(C1818x c1818x, AbstractC7136m abstractC7136m, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8781a = i10;
        this.f8783c = c1818x;
        this.f8784d = abstractC7136m;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8781a) {
            case 0:
                return new C1816v(this.f8783c, this.f8784d, interfaceC7559c, 0);
            case 1:
                return new C1816v(this.f8783c, this.f8784d, interfaceC7559c, 1);
            default:
                return new C1816v(this.f8783c, this.f8784d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8781a) {
        }
        return ((C1816v) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM12265k;
        Object value;
        Object value2;
        Object objM12258d;
        Object value3;
        Object objM12265k2;
        Object value4;
        int i10 = this.f8781a;
        InterfaceC7559c interfaceC7559c = null;
        a0 a0Var = a0.f30746a;
        AbstractC7136m abstractC7136m = this.f8784d;
        C1818x c1818x = this.f8783c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f8782b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C6263l c6263l = c1818x.f8788b;
                    String str = ((C0433d) c1818x.f8793g.f39340a.getValue()).f3196e;
                    this.f8782b = 1;
                    objM12265k = c6263l.m12265k(str, this);
                    if (objM12265k != enumC7794a) {
                    }
                    return enumC7794a;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                objM12265k = obj;
                if (((Boolean) objM12265k).booleanValue()) {
                    m1 m1Var = c1818x.f8792f;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C0433d.m1455a((C0433d) value, false, ((C9056u) abstractC7136m).f43566a, false, false, null, null, false, 125)));
                    return a0Var;
                }
                C0496f c0496f = m0.f34659a;
                C7569c c7569c = AbstractC8819m.f42514a;
                C1815u c1815u = new C1815u(c1818x, interfaceC7559c, 0);
                this.f8782b = 2;
                if (c0.m13475K(c7569c, c1815u, this) != enumC7794a) {
                    return a0Var;
                }
                return enumC7794a;
            case 1:
                m1 m1Var2 = c1818x.f8792f;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8782b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C0433d.m1455a((C0433d) value2, false, false, false, true, null, null, false, 119)));
                    C6263l c6263l2 = c1818x.f8788b;
                    int i13 = ((C9058w) abstractC7136m).f43568a;
                    this.f8782b = 1;
                    objM12258d = c6263l2.m12258d(i13, this);
                    if (objM12258d != enumC7794a2) {
                    }
                    return enumC7794a2;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                objM12258d = obj;
                boolean zBooleanValue = ((Boolean) objM12258d).booleanValue();
                do {
                    value3 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value3, C0433d.m1455a((C0433d) value3, false, false, false, false, null, null, false, 119)));
                C0496f c0496f2 = m0.f34659a;
                C7569c c7569c2 = AbstractC8819m.f42514a;
                C1817w c1817w = new C1817w(zBooleanValue, c1818x, (InterfaceC7559c) null);
                this.f8782b = 2;
                if (c0.m13475K(c7569c2, c1817w, this) != enumC7794a2) {
                    return a0Var;
                }
                return enumC7794a2;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f8782b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    C6263l c6263l3 = c1818x.f8788b;
                    String str2 = ((C0433d) c1818x.f8793g.f39340a.getValue()).f3196e;
                    this.f8782b = 1;
                    objM12265k2 = c6263l3.m12265k(str2, this);
                    if (objM12265k2 != enumC7794a3) {
                    }
                    return enumC7794a3;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                objM12265k2 = obj;
                Boolean bool = (Boolean) objM12265k2;
                boolean zBooleanValue2 = bool.booleanValue();
                m1 m1Var3 = c1818x.f8792f;
                do {
                    value4 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value4, C0433d.m1455a((C0433d) value4, false, false, zBooleanValue2, false, null, null, false, 123)));
                C7806h c7806h = c1818x.f8794h;
                C6361k c6361k = new C6361k(((zs.a0) abstractC7136m).f43546a, bool);
                this.f8782b = 2;
                if (c7806h.mo14775g(c6361k, this) != enumC7794a3) {
                    return a0Var;
                }
                return enumC7794a3;
        }
    }
}
