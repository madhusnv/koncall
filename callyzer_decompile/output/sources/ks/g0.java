package ks;

import cs.EnumC1501t;
import ex.InterfaceC2141e;
import gs.C2715a;
import im.C3304f;
import im.C3305g;
import im.C3306h;
import im.InterfaceC3307i;
import is.C3348b;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4531c;
import og.od;
import om.C5414p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8090p;
import ww.AbstractC8199i;
import wx.k1;
import wx.m1;
import wx.w0;
import yv.C8800o;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21408a;

    /* renamed from: b */
    public int f21409b;

    /* renamed from: c */
    public /* synthetic */ Object f21410c;

    /* renamed from: d */
    public final /* synthetic */ q0 f21411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(q0 q0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21408a = i10;
        this.f21411d = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21408a) {
            case 0:
                g0 g0Var = new g0(this.f21411d, interfaceC7559c, 0);
                g0Var.f21410c = obj;
                return g0Var;
            default:
                g0 g0Var2 = new g0(this.f21411d, interfaceC7559c, 1);
                g0Var2.f21410c = obj;
                return g0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21408a) {
            case 0:
                return ((g0) create((C8801p) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((g0) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objM8971n;
        String strM16188L;
        int i10 = this.f21408a;
        q0 q0Var = this.f21411d;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                w0 w0Var = q0Var.f21513x;
                C8801p c8801p = (C8801p) this.f21410c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f21409b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    if (!c8801p.f42464a || !((C3348b) w0Var.f39340a.getValue()).f17713a.isEmpty() || q0Var.f21491B != null) {
                        if (!((C3348b) w0Var.f39340a.getValue()).f17713a.isEmpty()) {
                            return a0Var;
                        }
                        m1 m1Var = q0Var.f21512w;
                        do {
                            value = m1Var.getValue();
                        } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, false, 0, null, 0, false, ((C3348b) w0Var.f39340a.getValue()).f17713a.isEmpty(), false, null, null, false, null, null, null, null, null, false, null, 1048479)));
                        return a0Var;
                    }
                    C4531c c4531c = q0Var.f21494E;
                    this.f21410c = null;
                    this.f21409b = 1;
                    if (c4531c.m9378b(this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                tx.c0.m13502y(q0Var.f21498i, null, null, new C2715a(q0Var, (InterfaceC7559c) null, 29), 3);
                return a0Var;
            default:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f21410c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f21409b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                this.f21410c = null;
                this.f21409b = 1;
                w0 w0Var2 = q0Var.f21513x;
                if (((C3348b) w0Var2.f39340a.getValue()).f17713a.size() <= q0Var.f21509t) {
                    objM8971n = a0Var;
                } else {
                    if ((interfaceC3307i instanceof C3305g) || (interfaceC3307i instanceof C3306h)) {
                        objM8971n = q0Var.m8971n(this);
                        if (objM8971n != enumC7794a2) {
                        }
                    } else if (interfaceC3307i instanceof C3304f) {
                        C3304f c3304f = (C3304f) interfaceC3307i;
                        C8090p c8090p = q0Var.f21495f;
                        k1 k1Var = w0Var2.f39340a;
                        List list = ((C3348b) k1Var.getValue()).f17713a;
                        String str = c3304f.f17549a;
                        String str2 = c3304f.f17551c;
                        String str3 = c3304f.f17552d;
                        LocalDateTime localDateTime = c3304f.f17553e;
                        if (localDateTime != null) {
                            C8800o c8800o = C8800o.f42459a;
                            strM16188L = C8800o.m16188L(localDateTime);
                        } else {
                            strM16188L = null;
                        }
                        boolean z6 = localDateTime == null;
                        C5414p c5414p = c3304f.f17550b;
                        LocalDateTime localDateTime2 = c5414p != null ? c5414p.f27192j : null;
                        AbstractC4154l.m8920c(localDateTime2);
                        List listM15245X = c8090p.m15245X(list, str, str2, str3, strM16188L, z6, localDateTime2, EnumC1501t.SCHEDULED_LEAD);
                        if (listM15245X != null) {
                            m1 m1Var2 = q0Var.f21512w;
                            while (true) {
                                Object value2 = m1Var2.getValue();
                                List list2 = listM15245X;
                                if (!m1Var2.m15397i(value2, C3348b.m7669a((C3348b) value2, list2, false, 0, null, localDateTime == null ? ((C3348b) k1Var.getValue()).f17717e - 1 : ((C3348b) k1Var.getValue()).f17717e, false, listM15245X.isEmpty(), false, null, null, false, null, null, null, null, null, false, q0Var.m8974q(listM15245X), 524206))) {
                                    listM15245X = list2;
                                }
                            }
                        }
                    }
                    objM8971n = a0Var;
                }
                return objM8971n == enumC7794a2 ? enumC7794a2 : a0Var;
        }
    }
}
