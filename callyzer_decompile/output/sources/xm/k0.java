package xm;

import ex.InterfaceC2141e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import og.pe;
import og.ue;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40473a;

    /* renamed from: b */
    public int f40474b;

    /* renamed from: c */
    public final /* synthetic */ x1 f40475c;

    /* renamed from: d */
    public final /* synthetic */ int f40476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(x1 x1Var, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f40473a = i11;
        this.f40475c = x1Var;
        this.f40476d = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40473a) {
            case 0:
                return new k0(this.f40475c, this.f40476d, interfaceC7559c, 0);
            case 1:
                return new k0(this.f40475c, this.f40476d, interfaceC7559c, 1);
            case 2:
                return new k0(this.f40475c, this.f40476d, interfaceC7559c, 2);
            case 3:
                return new k0(this.f40475c, this.f40476d, interfaceC7559c, 3);
            case 4:
                return new k0(this.f40475c, this.f40476d, interfaceC7559c, 4);
            case 5:
                return new k0(this.f40475c, this.f40476d, interfaceC7559c, 5);
            default:
                return new k0(this.f40475c, this.f40476d, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40473a) {
        }
        return ((k0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40473a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40474b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var = this.f40475c.f40991a;
                this.f40474b = 1;
                Object objM6688h = x2Var.m6688h(this.f40476d, this);
                return objM6688h == enumC7794a ? enumC7794a : objM6688h;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40474b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var2 = this.f40475c.f40991a;
                this.f40474b = 1;
                an.e4 e4Var = x2Var2.f14945e;
                List listM10834i = pe.m10834i(EnumC8993c.SUCCESS, EnumC8993c.DELETED);
                StringBuilder sbM14339s = p020v.a1.m14339s(e4Var, "SELECT id,calllog_id,name,phone_number,country_code,date_time,duration,call_type,notes,is_lead_call_log,sim_number,call_record_sync_status,call_record_source_path,call_record_web_url,(CASE WHEN is_call_recording ='1' AND (call_record_sync_status IN(");
                int size = listM10834i.size();
                ue.m10986b(size, sbM14339s);
                sbM14339s.append(") OR (date_time BETWEEN sync_subscription_start_time AND sync_subscription_end_time)) THEN '1' ELSE '0' END) AS is_call_has_recording,(CASE WHEN connected_sim_count > 1 THEN slot ELSE NULL END) AS slot FROM ViewCallLogContactUserSim WHERE id=");
                sbM14339s.append("?");
                String string = sbM14339s.toString();
                AbstractC4154l.m8922e(string, "toString(...)");
                Object objM10839n = pe.m10839n(this, e4Var.f784a, true, false, new an.i3(string, listM10834i, e4Var, size, this.f40476d));
                return objM10839n == enumC7794a2 ? enumC7794a2 : objM10839n;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40474b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var3 = this.f40475c.f40991a;
                this.f40474b = 1;
                Object objM10839n2 = pe.m10839n(this, x2Var3.f14941a.f899a, true, false, new an.r1(this.f40476d, 2));
                return objM10839n2 == enumC7794a3 ? enumC7794a3 : objM10839n2;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40474b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var4 = this.f40475c.f40991a;
                this.f40474b = 1;
                an.h3 h3Var = x2Var4.f14941a;
                Object objM10839n3 = pe.m10839n(this, h3Var.f899a, true, false, new an.b1(this.f40476d, h3Var, 1));
                return objM10839n3 == enumC7794a4 ? enumC7794a4 : objM10839n3;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f40474b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var5 = this.f40475c.f40991a;
                this.f40474b = 1;
                Object objM10839n4 = pe.m10839n(this, x2Var5.f14941a.f899a, true, false, new an.r1(this.f40476d, 6));
                return objM10839n4 == enumC7794a5 ? enumC7794a5 : objM10839n4;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f40474b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var6 = this.f40475c.f40991a;
                this.f40474b = 1;
                an.e4 e4Var2 = x2Var6.f14945e;
                Object objM10839n5 = pe.m10839n(this, e4Var2.f784a, true, false, new an.b1(this.f40476d, e4Var2, 2));
                return objM10839n5 == enumC7794a6 ? enumC7794a6 : objM10839n5;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f40474b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var7 = this.f40475c.f40991a;
                this.f40474b = 1;
                Object objM10839n6 = pe.m10839n(this, x2Var7.f14941a.f899a, true, false, new an.r1(this.f40476d, 3));
                return objM10839n6 == enumC7794a7 ? enumC7794a7 : objM10839n6;
        }
    }
}
