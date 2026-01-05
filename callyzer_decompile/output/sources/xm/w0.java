package xm;

import ex.InterfaceC2141e;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import og.pe;
import om.C5415q;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40951a;

    /* renamed from: b */
    public int f40952b;

    /* renamed from: c */
    public final /* synthetic */ x1 f40953c;

    /* renamed from: d */
    public final /* synthetic */ C5415q f40954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(x1 x1Var, C5415q c5415q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40951a = i10;
        this.f40953c = x1Var;
        this.f40954d = c5415q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40951a) {
            case 0:
                return new w0(this.f40953c, this.f40954d, interfaceC7559c, 0);
            case 1:
                return new w0(this.f40953c, this.f40954d, interfaceC7559c, 1);
            default:
                return new w0(this.f40953c, this.f40954d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40951a) {
        }
        return ((w0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40951a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40952b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var = this.f40953c.f40991a;
                this.f40952b = 1;
                an.h3 h3Var = x2Var.f14941a;
                LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.now(), LocalTime.now());
                AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
                h3Var.getClass();
                Object objM465m = an.h3.m465m(h3Var, localDateTimeOf, this.f40954d, this);
                return objM465m == enumC7794a ? enumC7794a : objM465m;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40952b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var2 = this.f40953c.f40991a;
                this.f40952b = 1;
                an.h3 h3Var2 = x2Var2.f14941a;
                LocalDateTime localDateTimeOf2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
                AbstractC4154l.m8922e(localDateTimeOf2, "of(...)");
                Object objM10838m = pe.m10838m(h3Var2.f899a, new an.w2(h3Var2, this.f40954d, localDateTimeOf2, null, 0), this);
                return objM10838m == enumC7794a2 ? enumC7794a2 : objM10838m;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40952b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var3 = this.f40953c.f40991a;
                this.f40952b = 1;
                an.h3 h3Var3 = x2Var3.f14941a;
                LocalDateTime localDateTimeOf3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
                AbstractC4154l.m8922e(localDateTimeOf3, "of(...)");
                Object objM10838m2 = pe.m10838m(h3Var3.f899a, new an.w2(h3Var3, this.f40954d, localDateTimeOf3, null, 1), this);
                return objM10838m2 == enumC7794a3 ? enumC7794a3 : objM10838m2;
        }
    }
}
