package bq;

import eo.C2082h;
import ex.InterfaceC2141e;
import lv.C4531c;
import og.od;
import qp.C6274k;
import qw.a0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.v0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bq.c */
/* loaded from: classes3.dex */
public final class C0723c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4547a;

    /* renamed from: b */
    public int f4548b;

    /* renamed from: c */
    public final /* synthetic */ C0737q f4549c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0723c(C0737q c0737q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4547a = i10;
        this.f4549c = c0737q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4547a) {
            case 0:
                return new C0723c(this.f4549c, interfaceC7559c, 0);
            case 1:
                return new C0723c(this.f4549c, interfaceC7559c, 1);
            case 2:
                return new C0723c(this.f4549c, interfaceC7559c, 2);
            case 3:
                return new C0723c(this.f4549c, interfaceC7559c, 3);
            default:
                return new C0723c(this.f4549c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f4547a) {
        }
        return ((C0723c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM15700p;
        Object value;
        switch (this.f4547a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f4548b;
                C0737q c0737q = this.f4549c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c0737q.f4643h;
                    this.f4548b = 1;
                    objM15700p = c2082h.f9747b.m15700p(this);
                    if (objM15700p == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM15700p = obj;
                }
                EnumC7204p enumC7204p = (EnumC7204p) objM15700p;
                m1 m1Var = c0737q.f4649n;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6274k.m12278a((C6274k) value, null, false, enumC7204p, null, null, null, false, false, false, false, false, false, 0, false, false, 262127)));
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f4548b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f4549c.f36254d;
                    this.f4548b = 1;
                    if (c7806h.mo14775g(j0.f36232a, this) == enumC7794a2) {
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
                int i12 = this.f4548b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C0737q c0737q2 = this.f4549c;
                    c0737q2.f4647l.getClass();
                    v0 v0Var = x1.f40990o;
                    C0730j c0730j = new C0730j(c0737q2, null, 0);
                    this.f4548b = 1;
                    if (c1.m15379j(v0Var, c0730j, this) == enumC7794a3) {
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
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f4548b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f4549c.f4651p;
                    this.f4548b = 1;
                    if (c4531c.m9378b(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f4548b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    this.f4548b = 1;
                    if (C0737q.m2032k(this.f4549c, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
