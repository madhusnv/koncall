package yn;

import aw.d0;
import com.websoptimization.callyzerbiz.domain.model.FCMData;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;
import no.C5122i;
import og.od;
import po.C5984e;
import qw.a0;
import sq.g2;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import xm.C8418z;
import xm.x1;
import yv.C8800o;
import yv.C8805t;
import zm.EnumC8991a;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.h */
/* loaded from: classes3.dex */
public final class C8710h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42101a;

    /* renamed from: b */
    public int f42102b;

    /* renamed from: c */
    public final /* synthetic */ C8716n f42103c;

    /* renamed from: d */
    public final /* synthetic */ FCMData f42104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8710h(int i10, FCMData fCMData, InterfaceC7559c interfaceC7559c, C8716n c8716n) {
        super(2, interfaceC7559c);
        this.f42101a = i10;
        this.f42103c = c8716n;
        this.f42104d = fCMData;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42101a) {
            case 0:
                return new C8710h(0, this.f42104d, interfaceC7559c, this.f42103c);
            case 1:
                return new C8710h(1, this.f42104d, interfaceC7559c, this.f42103c);
            default:
                return new C8710h(this.f42104d, this.f42103c, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42101a) {
        }
        return ((C8710h) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM13475K;
        int i10 = this.f42101a;
        a0 a0Var = a0.f30746a;
        C8716n c8716n = this.f42103c;
        FCMData fCMData = this.f42104d;
        switch (i10) {
            case 0:
                C8805t c8805t = c8716n.f42156n;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42102b;
                try {
                    if (i11 == 0) {
                        od.m10798c(obj);
                        x1 x1Var = c8716n.f42159q;
                        String toNumber = fCMData.getToNumber();
                        AbstractC4154l.m8920c(toNumber);
                        String mobileNo = fCMData.getMobileNo();
                        String callType = fCMData.getCallType();
                        AbstractC4154l.m8920c(callType);
                        EnumC8994d enumC8994dI0 = g2.i0(callType);
                        AbstractC4154l.m8920c(enumC8994dI0);
                        C8800o c8800o = C8800o.f42459a;
                        String callTime = fCMData.getCallTime();
                        AbstractC4154l.m8920c(callTime);
                        LocalDateTime localDateTimeM16183G = C8800o.m16183G(callTime);
                        this.f42102b = 1;
                        objM13475K = c0.m13475K(x1Var.f40994d.f42488a, new d0(x1Var, toNumber, mobileNo, enumC8994dI0, localDateTimeM16183G, null, 17), this);
                        if (objM13475K == enumC7794a) {
                        }
                        return enumC7794a;
                    }
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    od.m10798c(obj);
                    objM13475K = obj;
                    C4791b c4791b = (C4791b) objM13475K;
                    if (c4791b != null) {
                        if (c4791b.f23835d.contains(EnumC8991a.SYNC_NOTE_UPDATE)) {
                            C8418z c8418z = c8716n.f42153k;
                            this.f42102b = 3;
                            if (c8418z.m15722l(true, this) != enumC7794a) {
                                return a0Var;
                            }
                        } else {
                            C5122i c5122i = c8716n.f42160r;
                            this.f42102b = 2;
                            if (c5122i.m10046b(c4791b, this) != enumC7794a) {
                                return a0Var;
                            }
                        }
                        return enumC7794a;
                    }
                    String mobileNo2 = fCMData.getMobileNo();
                    AbstractC4154l.m8920c(mobileNo2);
                    String toNumber2 = fCMData.getToNumber();
                    AbstractC4154l.m8920c(toNumber2);
                    String callTime2 = fCMData.getCallTime();
                    AbstractC4154l.m8920c(callTime2);
                    c8805t.m16232g("CALLLOG_NOTE_UPDATE", "No matching call log found for: " + mobileNo2 + " -> " + toNumber2 + " at " + callTime2);
                    return a0Var;
                } catch (Exception e2) {
                    c8805t.m16232g("CALLLOG_NOTE_UPDATE", "Exception during processing: " + e2);
                    return a0Var;
                }
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f42102b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C5984e c5984e = c8716n.f42145c;
                this.f42102b = 1;
                return c5984e.m12021e(fCMData, this) == enumC7794a2 ? enumC7794a2 : a0Var;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f42102b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                if (!fCMData.getCode().contentEquals("DEVICE_RESTORED")) {
                    return a0Var;
                }
                this.f42102b = 1;
                return C8716n.m16104b(c8716n, this) == enumC7794a3 ? enumC7794a3 : a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8710h(FCMData fCMData, C8716n c8716n, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f42101a = 2;
        this.f42104d = fCMData;
        this.f42103c = c8716n;
    }
}
