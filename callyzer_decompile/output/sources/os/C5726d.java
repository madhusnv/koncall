package os;

import bu.C0782a;
import c9.C0910e;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import d7.q0;
import ex.InterfaceC2141e;
import java.util.Iterator;
import ls.C4511b;
import lv.C4531c;
import ms.AbstractC4871f;
import ms.C4866a;
import ms.C4868c;
import ns.C5136b;
import og.od;
import qw.a0;
import rw.C6668r;
import ts.C7217d;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.m1;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.d */
/* loaded from: classes3.dex */
public final class C5726d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f28214a;

    /* renamed from: b */
    public int f28215b;

    /* renamed from: c */
    public final /* synthetic */ C5731i f28216c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC4871f f28217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5726d(C5731i c5731i, AbstractC4871f abstractC4871f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f28214a = i10;
        this.f28216c = c5731i;
        this.f28217d = abstractC4871f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f28214a) {
            case 0:
                return new C5726d(this.f28216c, this.f28217d, interfaceC7559c, 0);
            default:
                return new C5726d(this.f28216c, this.f28217d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f28214a) {
        }
        return ((C5726d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM15704t;
        Object value;
        C4511b c4511b;
        switch (this.f28214a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f28215b;
                AbstractC4871f abstractC4871f = this.f28217d;
                C5731i c5731i = this.f28216c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C0910e c0910e = c5731i.f28244b;
                    String str = ((C4868c) abstractC4871f).f24378b;
                    this.f28215b = 1;
                    objM15704t = ((y5) c0910e.f5580c).m15704t(str, this);
                    if (objM15704t == enumC7794a) {
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
                    objM15704t = obj;
                }
                Object obj2 = null;
                Object[] objArr = 0;
                if (((Boolean) objM15704t).booleanValue()) {
                    Iterator it = ((C4511b) c5731i.f28252j.f39340a.getValue()).f22451a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((C5136b) next).f25145h == ((C4868c) abstractC4871f).f24377a) {
                                obj2 = next;
                            }
                        }
                    }
                    C5136b c5136b = (C5136b) obj2;
                    if (c5136b != null) {
                        LastCallDetails lastCallDetails = new LastCallDetails(c5136b.f25140c.getTypeName(), c5136b.f25139b, 91, c5136b.f25138a, c5136b.f25143f, c5136b.f25149l, c5136b.f25146i, c5136b.f25141d);
                        C7806h c7806h = c5731i.f28253k;
                        C5732j c5732j = new C5732j(((C4868c) abstractC4871f).f24377a, lastCallDetails);
                        this.f28215b = 2;
                        if (c7806h.mo14775g(c5732j, this) == enumC7794a) {
                            return enumC7794a;
                        }
                    }
                } else {
                    c0.m13502y(q0.m5340g(c5731i), null, null, new C0782a(c5731i, objArr == true ? 1 : 0, 13), 3);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f28215b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C5731i c5731i2 = this.f28216c;
                    m1 m1Var = c5731i2.f28251i;
                    do {
                        value = m1Var.getValue();
                        c4511b = (C4511b) value;
                    } while (!m1Var.m15397i(value, C4511b.m9347a(c4511b, C6668r.f31943a, false, false, false, 0, false, false, false, false, null, false, null, C7217d.m13449a(c4511b.f22463m, null, ((C4866a) this.f28217d).f24375a, null, 5), 32750)));
                    C4531c c4531c = c5731i2.f28255m;
                    this.f28215b = 1;
                    if (c4531c.m9381e(this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
