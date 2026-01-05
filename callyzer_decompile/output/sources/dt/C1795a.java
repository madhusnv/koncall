package dt;

import at.C0430a;
import bu.C0782a;
import dr.C1772v;
import ex.InterfaceC2141e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qn.C6263l;
import qw.a0;
import rw.AbstractC6663m;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.l2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.a */
/* loaded from: classes3.dex */
public final class C1795a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8695a;

    /* renamed from: b */
    public int f8696b;

    /* renamed from: c */
    public final /* synthetic */ C1804j f8697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1795a(C1804j c1804j, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8695a = i10;
        this.f8697c = c1804j;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8695a) {
            case 0:
                return new C1795a(this.f8697c, interfaceC7559c, 0);
            case 1:
                return new C1795a(this.f8697c, interfaceC7559c, 1);
            case 2:
                return new C1795a(this.f8697c, interfaceC7559c, 2);
            case 3:
                return new C1795a(this.f8697c, interfaceC7559c, 3);
            default:
                return new C1795a(this.f8697c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8695a) {
        }
        return ((C1795a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objM12263i;
        Object value2;
        switch (this.f8695a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f8696b;
                C1804j c1804j = this.f8697c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C6263l c6263l = c1804j.f8728b;
                    this.f8696b = 1;
                    if (c6263l.m12259e(this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                m1 m1Var = c1804j.f8732f;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C0430a.m1453a((C0430a) value, false, false, null, false, false, false, null, 0, false, 0, null, null, null, 126975)));
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f8696b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C1804j c1804j2 = this.f8697c;
                    c1804j2.f8728b.getClass();
                    InterfaceC8209j interfaceC8209j = (InterfaceC8209j) l2.f40529g.getValue();
                    C1772v c1772v = new C1772v(1, c1804j2);
                    this.f8696b = 1;
                    if (interfaceC8209j.collect(c1772v, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8696b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f8696b = 1;
                    if (C1804j.m5476g(this.f8697c, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 3:
                C1804j c1804j3 = this.f8697c;
                w0 w0Var = c1804j3.f8735i;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f8696b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C6263l c6263l2 = c1804j3.f8728b;
                    String str = (String) w0Var.f39340a.getValue();
                    String str2 = ((C0430a) c1804j3.f8733g.f39340a.getValue()).f3155c;
                    this.f8696b = 1;
                    objM12263i = c6263l2.m12263i(str, str2, this);
                    if (objM12263i == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM12263i = obj;
                }
                List list = (List) objM12263i;
                if (!AbstractC4154l.m8918a(w0Var.f39340a.getValue(), "")) {
                    m1 m1Var2 = c1804j3.f8732f;
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C0430a.m1453a((C0430a) value2, false, false, null, false, false, false, null, ((CharSequence) w0Var.f39340a.getValue()).length() == 0 ? -1 : list.size(), false, 0, null, AbstractC6663m.d0(list), null, 97279)));
                }
                return a0.f30746a;
            default:
                C1804j c1804j4 = this.f8697c;
                w0 w0Var2 = c1804j4.f8735i;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f8696b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    if (AbstractC4154l.m8918a(w0Var2.f39340a.getValue(), "")) {
                        this.f8696b = 1;
                        if (C1804j.m5476g(c1804j4, this) == enumC7794a5) {
                            return enumC7794a5;
                        }
                    } else {
                        InterfaceC8209j interfaceC8209jM15382m = c1.m15382m(c1.m15381l(w0Var2, 500L));
                        C0782a c0782a = new C0782a(c1804j4, null, 1);
                        this.f8696b = 2;
                        if (c1.m15379j(interfaceC8209jM15382m, c0782a, this) == enumC7794a5) {
                            return enumC7794a5;
                        }
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
