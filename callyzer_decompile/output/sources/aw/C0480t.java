package aw;

import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.ReminderDate;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.StaticProperties;
import com.websoptimization.callyzerbiz.workManager.RecordingFindManager;
import ct.C1502a;
import dr.C1772v;
import dt.C1818x;
import e1.x0;
import ex.InterfaceC2141e;
import f9.C2222e;
import fs.C2370a;
import fu.C2373a;
import fu.C2375c;
import g2.dc;
import g2.w9;
import gs.C2721g;
import h1.AbstractC2773d;
import h1.w1;
import i1.p1;
import im.EnumC3315q;
import im.EnumC3316r;
import im.k1;
import io.C3328c;
import is.C3348b;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import k1.r1;
import kotlin.jvm.internal.AbstractC4154l;
import ks.q0;
import nn.C5113e;
import nu.C5148i;
import og.od;
import og.pe;
import ou.C5744a;
import pu.C6040h;
import pu.EnumC6039g;
import qu.C6324e;
import qw.C6364n;
import ru.C6624b;
import rw.AbstractC6654d;
import rw.AbstractC6664n;
import s1.o0;
import s1.r0;
import t1.C6979d;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8090p;
import ww.AbstractC8199i;
import wx.m1;
import yv.C8794i;
import yv.EnumC8795j;
import zs.C9060y;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.t */
/* loaded from: classes3.dex */
public final class C0480t extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3437a;

    /* renamed from: b */
    public int f3438b;

    /* renamed from: c */
    public /* synthetic */ int f3439c;

    /* renamed from: d */
    public final /* synthetic */ Object f3440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0480t(RecordingFindManager recordingFindManager, int i10, int i11, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3437a = 0;
        this.f3440d = recordingFindManager;
        this.f3438b = i10;
        this.f3439c = i11;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3437a) {
            case 0:
                return new C0480t((RecordingFindManager) this.f3440d, this.f3438b, this.f3439c, interfaceC7559c);
            case 1:
                return new C0480t((C1818x) this.f3440d, this.f3439c, interfaceC7559c, 1);
            case 2:
                return new C0480t((C2375c) this.f3440d, this.f3439c, interfaceC7559c, 2);
            case 3:
                return new C0480t((w9) this.f3440d, this.f3439c, interfaceC7559c, 3);
            case 4:
                C0480t c0480t = new C0480t((C2721g) this.f3440d, interfaceC7559c);
                c0480t.f3439c = ((Number) obj).intValue();
                return c0480t;
            case 5:
                return new C0480t((C6979d) this.f3440d, this.f3439c, interfaceC7559c, 5);
            case 6:
                return new C0480t((ks.c0) this.f3440d, this.f3439c, interfaceC7559c, 6);
            case 7:
                return new C0480t((q0) this.f3440d, this.f3439c, interfaceC7559c, 7);
            case 8:
                return new C0480t((C6324e) this.f3440d, this.f3439c, interfaceC7559c, 8);
            default:
                return new C0480t((r0) this.f3440d, this.f3439c, interfaceC7559c, 9);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.f3437a) {
            case 0:
                C0480t c0480t = (C0480t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c0480t.invokeSuspend(a0Var);
                break;
            case 4:
                break;
        }
        return ((C0480t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM5480e;
        EnumC8795j enumC8795j;
        Object value;
        Object objM6721e;
        Object objM15265v;
        Object objM15269z;
        StaticProperties staticProperties;
        LeadFilterRequest leadFilterRequestM4697a;
        ReminderDate reminderDateM4708g;
        switch (this.f3437a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                RecordingFindManager recordingFindManager = (RecordingFindManager) this.f3440d;
                int i10 = this.f3438b;
                int i11 = this.f3439c;
                C9097a c9097a = recordingFindManager.f7475g;
                if (c9097a != null) {
                    recordingFindManager.f7471c.m12025l(C9097a.m16506b(c9097a, null, i11 + "/" + i10, null, false, null, Integer.valueOf((i11 * 100) / i10), 262139), true);
                }
                return qw.a0.f30746a;
            case 1:
                C1818x c1818x = (C1818x) this.f3440d;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f3438b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    int i13 = this.f3439c;
                    this.f3438b = 1;
                    objM5480e = c1818x.m5480e(i13, this);
                    if (objM5480e == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM5480e = obj;
                }
                c1818x.m5481f(new C9060y((C1502a) objM5480e));
                return qw.a0.f30746a;
            case 2:
                qw.a0 a0Var = qw.a0.f30746a;
                C2375c c2375c = (C2375c) this.f3440d;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f3438b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    C5113e c5113e = c2375c.f10808b;
                    C8794i c8794i = EnumC8795j.Companion;
                    int i15 = ((C6624b) ((C2373a) c2375c.f10812f.f39340a.getValue()).f10803a.get(this.f3439c)).f31815a;
                    c8794i.getClass();
                    AbstractC6654d abstractC6654d = (AbstractC6654d) EnumC8795j.getEntries();
                    abstractC6654d.getClass();
                    x0 x0Var = new x0(7, abstractC6654d);
                    while (true) {
                        if (x0Var.hasNext()) {
                            enumC8795j = (EnumC8795j) x0Var.next();
                            if (enumC8795j.getPeriodName() == i15) {
                            }
                        } else {
                            enumC8795j = EnumC8795j._2_HOUR;
                        }
                    }
                    this.f3438b = 1;
                    Object objM6033m = c5113e.f25030a.f41069a.m6033m("not_sync_notification_hour_period", enumC8795j.getPeriod(), this);
                    EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                    if (objM6033m != enumC7794a4) {
                        objM6033m = a0Var;
                    }
                    if (objM6033m != enumC7794a4) {
                        objM6033m = a0Var;
                    }
                    if (objM6033m != enumC7794a3) {
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
                this.f3438b = 2;
                if (C2375c.m6059e(c2375c, this) != enumC7794a3) {
                    return a0Var;
                }
                return enumC7794a3;
            case 3:
                qw.a0 a0Var2 = qw.a0.f30746a;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f3438b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var2;
                }
                od.m10798c(obj);
                p1 p1Var = ((w9) this.f3440d).f13157a;
                int i17 = this.f3439c;
                w1 w1Var = dc.f11412b;
                this.f3438b = 1;
                Object objM8470a = r1.m8470a(p1Var, i17 - p1Var.f16953a.m8526f(), w1Var, this);
                if (objM8470a != enumC7794a5) {
                    objM8470a = a0Var2;
                }
                return objM8470a == enumC7794a5 ? enumC7794a5 : a0Var2;
            case 4:
                C2721g c2721g = (C2721g) this.f3440d;
                int i18 = this.f3439c;
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f3438b;
                if (i19 == 0) {
                    od.m10798c(obj);
                    m1 m1Var = c2721g.f15184l;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C2370a.m6057a((C2370a) value, false, null, null, 0, false, false, 767)));
                    String str = c2721g.f15179g;
                    this.f3439c = i18;
                    this.f3438b = 1;
                    objM6721e = C2721g.m6721e(c2721g, str, i18, this);
                    if (objM6721e == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM6721e = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM6721e);
            case 5:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f3438b;
                if (i20 == 0) {
                    od.m10798c(obj);
                    C6979d c6979d = (C6979d) this.f3440d;
                    int i21 = this.f3439c;
                    this.f3438b = 1;
                    if (c6979d.m13260f(i21, AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7), this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 6:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i22 = this.f3438b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        od.m10798c(obj);
                        objM15269z = obj;
                        return (k1) objM15269z;
                    }
                    if (i22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM15265v = obj;
                    return (k1) objM15265v;
                }
                od.m10798c(obj);
                if (((C3348b) ((ks.c0) this.f3440d).f21361C.f39340a.getValue()).f17729q) {
                    ks.c0 c0Var = (ks.c0) this.f3440d;
                    C8090p c8090p = c0Var.f21365f;
                    int i23 = this.f3439c;
                    EnumC3316r enumC3316r = ((C3348b) c0Var.f21361C.f39340a.getValue()).f17725m;
                    LeadFilterRequest leadFilterRequest = ((C3348b) ((ks.c0) this.f3440d).f21361C.f39340a.getValue()).f17727o;
                    String screenName = EnumC3315q.MyLead.getScreenName();
                    EnumC7204p enumC7204p = ((ks.c0) this.f3440d).f21385z;
                    if (enumC7204p == null) {
                        AbstractC4154l.m8928k("simSelectionMode");
                        throw null;
                    }
                    this.f3438b = 1;
                    objM15269z = c8090p.m15269z(i23, enumC3316r, leadFilterRequest, screenName, enumC7204p, this);
                    if (objM15269z == enumC7794a8) {
                        return enumC7794a8;
                    }
                    return (k1) objM15269z;
                }
                ks.c0 c0Var2 = (ks.c0) this.f3440d;
                C8090p c8090p2 = c0Var2.f21365f;
                int i24 = this.f3439c;
                EnumC3316r enumC3316r2 = ((C3348b) c0Var2.f21361C.f39340a.getValue()).f17725m;
                LeadFilterRequest leadFilterRequest2 = ((C3348b) ((ks.c0) this.f3440d).f21361C.f39340a.getValue()).f17727o;
                String screenName2 = EnumC3315q.MyLead.getScreenName();
                EnumC7204p enumC7204p2 = ((ks.c0) this.f3440d).f21385z;
                if (enumC7204p2 == null) {
                    AbstractC4154l.m8928k("simSelectionMode");
                    throw null;
                }
                this.f3438b = 2;
                objM15265v = c8090p2.m15265v(i24, enumC3316r2, leadFilterRequest2, screenName2, enumC7204p2, this);
                if (objM15265v == enumC7794a8) {
                    return enumC7794a8;
                }
                return (k1) objM15265v;
            case 7:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                int i25 = this.f3438b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                q0 q0Var = (q0) this.f3440d;
                C8090p c8090p3 = q0Var.f21495f;
                int i26 = this.f3439c;
                EnumC3316r enumC3316r3 = EnumC3316r.Reminder;
                StaticProperties staticPropertiesM4699c = ((C3348b) q0Var.f21513x.f39340a.getValue()).f17727o.m4699c();
                if (((staticPropertiesM4699c == null || (reminderDateM4708g = staticPropertiesM4699c.m4708g()) == null) ? null : reminderDateM4708g.m4701b()) != null) {
                    leadFilterRequestM4697a = ((C3348b) ((q0) this.f3440d).f21513x.f39340a.getValue()).f17727o;
                } else {
                    LeadFilterRequest leadFilterRequest3 = ((C3348b) ((q0) this.f3440d).f21513x.f39340a.getValue()).f17727o;
                    if (((C3348b) ((q0) this.f3440d).f21513x.f39340a.getValue()).f17727o.m4699c() != null) {
                        StaticProperties staticPropertiesM4699c2 = ((C3348b) ((q0) this.f3440d).f21513x.f39340a.getValue()).f17727o.m4699c();
                        staticProperties = staticPropertiesM4699c2 != null ? StaticProperties.m4702a(staticPropertiesM4699c2, new ReminderDate("after", LocalDate.now(), null, 4, null)) : null;
                    } else {
                        staticProperties = new StaticProperties(null, null, new ReminderDate("after", LocalDate.now(), null, 4, null), 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, 507, null);
                    }
                    leadFilterRequestM4697a = LeadFilterRequest.m4697a(leadFilterRequest3, staticProperties);
                }
                String screenName3 = EnumC3315q.ScheduleLead.getScreenName();
                EnumC7204p enumC7204p3 = ((q0) this.f3440d).f21511v;
                if (enumC7204p3 == null) {
                    AbstractC4154l.m8928k("simSelectionMode");
                    throw null;
                }
                this.f3438b = 1;
                Object objM15265v2 = c8090p3.m15265v(i26, enumC3316r3, leadFilterRequestM4697a, screenName3, enumC7204p3, this);
                return objM15265v2 == enumC7794a9 ? enumC7794a9 : objM15265v2;
            case 8:
                int i27 = this.f3439c;
                C6324e c6324e = (C6324e) this.f3440d;
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                int i28 = this.f3438b;
                if (i28 == 0) {
                    od.m10798c(obj);
                    c6324e.f30666f = true;
                    int i29 = 0;
                    c6324e.f30667g = false;
                    c6324e.f30668h = 0;
                    List list = ((C5744a) c6324e.f30669i.getValue()).f28301a;
                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
                    for (Object obj2 : list) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        C6040h c6040hM12050a = (C6040h) obj2;
                        if (i29 >= i27) {
                            c6040hM12050a = C6040h.m12050a(c6040hM12050a, EnumC6039g.PENDING, null, null, 143);
                        }
                        arrayList.add(c6040hM12050a);
                        i29 = i30;
                    }
                    C3328c c3328c = c6324e.f30662b;
                    c3328c.getClass();
                    C2222e c2222e = new C2222e(new C5148i(arrayList, i27, c3328c, null));
                    C1772v c1772v = new C1772v(9, c6324e);
                    this.f3438b = 1;
                    if (c2222e.collect(c1772v, this) == enumC7794a10) {
                        return enumC7794a10;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                int i31 = this.f3438b;
                if (i31 == 0) {
                    od.m10798c(obj);
                    o0 o0Var = ((r0) this.f3440d).f32124r;
                    int i32 = this.f3439c;
                    this.f3438b = 1;
                    if (o0Var.mo12088f(i32, this) == enumC7794a11) {
                        return enumC7794a11;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0480t(C2721g c2721g, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3437a = 4;
        this.f3440d = c2721g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0480t(Object obj, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f3437a = i11;
        this.f3440d = obj;
        this.f3439c = i10;
    }
}
