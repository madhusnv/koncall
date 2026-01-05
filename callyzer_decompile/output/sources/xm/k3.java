package xm;

import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.LeadResponse;
import ex.InterfaceC2141e;
import im.EnumC3315q;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k3 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40489a;

    /* renamed from: b */
    public final /* synthetic */ String f40490b;

    /* renamed from: c */
    public final /* synthetic */ im.d1 f40491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(String str, im.d1 d1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40489a = i10;
        this.f40490b = str;
        this.f40491c = d1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40489a) {
            case 0:
                return new k3(this.f40490b, this.f40491c, interfaceC7559c, 0);
            default:
                return new k3(this.f40490b, this.f40491c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40489a) {
            case 0:
                k3 k3Var = (k3) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                k3Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                k3 k3Var2 = (k3) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                k3Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i10 = this.f40489a;
        qw.a0 a0Var = qw.a0.f30746a;
        String str = this.f40490b;
        im.d1 d1Var = this.f40491c;
        switch (i10) {
            case 0:
                Object obj2 = d1Var.f17545a;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC4154l.m8918a(str, EnumC3315q.ScheduleLead.getScreenName())) {
                    wx.m1 m1Var = r3.f40777h;
                    do {
                        value3 = m1Var.getValue();
                    } while (!m1Var.m15397i(value3, a3.m15554a((a3) value3, null, ((LeadResponse) ((BaseResponse) obj2).m4732a()).m4913b() == 0 ? null : new Integer(((LeadResponse) ((BaseResponse) obj2).m4732a()).m4913b()), null, 5)));
                } else if (AbstractC4154l.m8918a(str, EnumC3315q.MyLead.getScreenName())) {
                    wx.m1 m1Var2 = r3.f40777h;
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, a3.m15554a((a3) value2, ((LeadResponse) ((BaseResponse) obj2).m4732a()).m4913b() == 0 ? null : new Integer(((LeadResponse) ((BaseResponse) obj2).m4732a()).m4913b()), null, null, 6)));
                } else if (AbstractC4154l.m8918a(str, EnumC3315q.DueLead.getScreenName())) {
                    wx.m1 m1Var3 = r3.f40777h;
                    do {
                        value = m1Var3.getValue();
                    } while (!m1Var3.m15397i(value, a3.m15554a((a3) value, null, null, ((LeadResponse) ((BaseResponse) obj2).m4732a()).m4913b() == 0 ? null : new Integer(((LeadResponse) ((BaseResponse) obj2).m4732a()).m4913b()), 3)));
                }
                break;
            default:
                Object obj3 = d1Var.f17545a;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC4154l.m8918a(str, EnumC3315q.ScheduleLead.getScreenName())) {
                    wx.m1 m1Var4 = r3.f40777h;
                    do {
                        value5 = m1Var4.getValue();
                    } while (!m1Var4.m15397i(value5, a3.m15554a((a3) value5, null, ((LeadResponse) ((BaseResponse) obj3).m4732a()).m4913b() == 0 ? null : new Integer(((LeadResponse) ((BaseResponse) obj3).m4732a()).m4913b()), null, 5)));
                } else if (AbstractC4154l.m8918a(str, EnumC3315q.MyLead.getScreenName())) {
                    wx.m1 m1Var5 = r3.f40777h;
                    do {
                        value4 = m1Var5.getValue();
                    } while (!m1Var5.m15397i(value4, a3.m15554a((a3) value4, ((LeadResponse) ((BaseResponse) obj3).m4732a()).m4913b() == 0 ? null : new Integer(((LeadResponse) ((BaseResponse) obj3).m4732a()).m4913b()), null, null, 6)));
                }
                break;
        }
        return a0Var;
    }
}
