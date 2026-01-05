package yq;

import ex.InterfaceC2141e;
import lv.C4531c;
import og.od;
import qw.a0;
import rw.C6668r;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import wq.C8142a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yq.d */
/* loaded from: classes3.dex */
public final class C8739d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42326a;

    /* renamed from: b */
    public int f42327b;

    /* renamed from: c */
    public final /* synthetic */ C8741f f42328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8739d(C8741f c8741f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42326a = i10;
        this.f42328c = c8741f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42326a) {
            case 0:
                return new C8739d(this.f42328c, interfaceC7559c, 0);
            case 1:
                return new C8739d(this.f42328c, interfaceC7559c, 1);
            default:
                return new C8739d(this.f42328c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42326a) {
        }
        return ((C8739d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f42326a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f42327b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f42327b = 1;
                    if (c0.m13489l(500L, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                C8741f c8741f = this.f42328c;
                m1 m1Var = c8741f.f42337f;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C8142a.m15319a((C8142a) value, C6668r.f31943a, false, false, false, null, 0, 62)));
                C4531c c4531c = c8741f.f42349r;
                this.f42327b = 2;
                if (c4531c.m9381e(this) == enumC7794a) {
                    return enumC7794a;
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42327b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c2 = this.f42328c.f42349r;
                    this.f42327b = 1;
                    if (c4531c2.m9378b(this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f42327b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f42328c.f42346o;
                    Boolean bool = Boolean.TRUE;
                    this.f42327b = 1;
                    if (c7806h.mo14775g(bool, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
