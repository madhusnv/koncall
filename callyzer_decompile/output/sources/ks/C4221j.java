package ks;

import com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.ReminderDate;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.StaticProperties;
import ex.InterfaceC2141e;
import im.EnumC3314p;
import im.EnumC3315q;
import im.EnumC3316r;
import is.C3348b;
import j$.time.LocalDate;
import og.od;
import qw.C6364n;
import rw.C6669s;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8090p;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.j */
/* loaded from: classes3.dex */
public final class C4221j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21427a = 1;

    /* renamed from: b */
    public int f21428b;

    /* renamed from: c */
    public final /* synthetic */ C4223l f21429c;

    /* renamed from: d */
    public /* synthetic */ int f21430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4221j(int i10, C4223l c4223l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21429c = c4223l;
        this.f21430d = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21427a) {
            case 0:
                C4221j c4221j = new C4221j(this.f21429c, interfaceC7559c);
                c4221j.f21430d = ((Number) obj).intValue();
                return c4221j;
            default:
                return new C4221j(this.f21430d, this.f21429c, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21427a) {
            case 0:
                return ((C4221j) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((C4221j) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM8959f;
        switch (this.f21427a) {
            case 0:
                int i10 = this.f21430d;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f21428b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f21430d = i10;
                    this.f21428b = 1;
                    objM8959f = C4223l.m8959f(this.f21429c, i10, this);
                    if (objM8959f == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM8959f = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM8959f);
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f21428b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C4223l c4223l = this.f21429c;
                C8090p c8090p = c4223l.f21442b;
                int i13 = this.f21430d;
                EnumC3316r enumC3316r = EnumC3316r.Reminder;
                LeadFilterRequest leadFilterRequest = new LeadFilterRequest(new StaticProperties(null, null, new ReminderDate(EnumC3314p.Before.getLeadCondition(), null, LocalDate.now(), 2, null), null, null, null, null, null, null, 507, null), C6669s.f31944a);
                String screenName = EnumC3315q.DueLead.getScreenName();
                EnumC7204p enumC7204p = ((C3348b) c4223l.f21457q.f39340a.getValue()).f17722j;
                this.f21428b = 1;
                Object objM15265v = c8090p.m15265v(i13, enumC3316r, leadFilterRequest, screenName, enumC7204p, this);
                return objM15265v == enumC7794a2 ? enumC7794a2 : objM15265v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4221j(C4223l c4223l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21429c = c4223l;
    }
}
