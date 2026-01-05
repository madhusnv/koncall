package mn;

import an.C0198e;
import an.C0201h;
import an.C0202i;
import an.C0205l;
import an.t4;
import ex.InterfaceC2141e;
import gn.x2;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.List;
import og.od;
import og.pe;
import p020v.a1;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8090p;
import ww.AbstractC8199i;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.y */
/* loaded from: classes3.dex */
public final class C4828y extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24099a;

    /* renamed from: b */
    public int f24100b;

    /* renamed from: c */
    public final /* synthetic */ g0 f24101c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f24102d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f24103e;

    /* renamed from: f */
    public final /* synthetic */ boolean f24104f;

    /* renamed from: g */
    public final /* synthetic */ String f24105g;

    /* renamed from: h */
    public final /* synthetic */ List f24106h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4828y(g0 g0Var, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6, String str, List list, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24099a = i10;
        this.f24101c = g0Var;
        this.f24102d = localDateTime;
        this.f24103e = localDateTime2;
        this.f24104f = z6;
        this.f24105g = str;
        this.f24106h = list;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24099a) {
            case 0:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24105g, this.f24106h, interfaceC7559c, 0);
            case 1:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24105g, this.f24106h, interfaceC7559c, 1);
            case 2:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24105g, this.f24106h, interfaceC7559c, 2);
            case 3:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24106h, this.f24105g, interfaceC7559c, 3);
            case 4:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24106h, this.f24105g, interfaceC7559c, 4);
            case 5:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24106h, this.f24105g, interfaceC7559c, 5);
            case 6:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24106h, this.f24105g, interfaceC7559c, 6);
            default:
                return new C4828y(this.f24101c, this.f24102d, this.f24103e, this.f24104f, this.f24105g, this.f24106h, interfaceC7559c, 7);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f24099a) {
        }
        return ((C4828y) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM10839n;
        switch (this.f24099a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f24100b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p = this.f24101c.f24007b;
                this.f24100b = 1;
                Object objM15236M = c8090p.m15236M(this.f24105g, this.f24102d, this.f24103e, this.f24106h, this, this.f24104f);
                return objM15236M == enumC7794a ? enumC7794a : objM15236M;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f24100b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p2 = this.f24101c.f24007b;
                this.f24100b = 1;
                Object objM15237O = c8090p2.m15237O(this.f24105g, this.f24102d, this.f24103e, this.f24106h, this, this.f24104f);
                return objM15237O == enumC7794a2 ? enumC7794a2 : objM15237O;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f24100b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p3 = this.f24101c.f24007b;
                this.f24100b = 1;
                t4 t4Var = ((x2) c8090p3.f38723a).f14946f;
                LocalDateTime localDateTime = this.f24102d;
                LocalDateTime localDateTime2 = this.f24103e;
                boolean z6 = this.f24104f;
                String str = this.f24105g;
                List list = this.f24106h;
                if (z6 && str.length() > 0) {
                    t4Var.getClass();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SELECT COUNT(DISTINCT phone_number) as count FROM CallLog WHERE sim_number = ? AND phone_number NOT IN (");
                    objM10839n = pe.m10839n(this, t4Var.f1410a, true, false, new C0198e(m0.m7381n(sb2, "?", "toString(...)"), str, list, a1.m14323c(list, sb2, ") AND date_time BETWEEN ", "?", " AND "), localDateTime, localDateTime2, 8));
                } else if (z6 && str.length() == 0) {
                    t4Var.getClass();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SELECT COUNT(DISTINCT phone_number) as count FROM CallLog WHERE  phone_number NOT IN (");
                    objM10839n = pe.m10839n(this, t4Var.f1410a, true, false, new C0202i(m0.m7381n(sb3, "?", "toString(...)"), list, a1.m14323c(list, sb3, ") AND date_time BETWEEN ", "?", " AND "), localDateTime, localDateTime2, 8));
                } else {
                    objM10839n = str.length() > 0 ? pe.m10839n(this, t4Var.f1410a, true, false, new C0205l(6, str, localDateTime, localDateTime2)) : pe.m10839n(this, t4Var.f1410a, true, false, new C0201h(localDateTime, localDateTime2, 7));
                }
                return objM10839n == enumC7794a3 ? enumC7794a3 : objM10839n;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f24100b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p4 = this.f24101c.f24007b;
                EnumC8994d enumC8994d = EnumC8994d.INCOMING;
                this.f24100b = 1;
                Object objM15229E = c8090p4.m15229E(this.f24102d, this.f24103e, enumC8994d, this.f24104f, this.f24106h, this.f24105g, this);
                return objM15229E == enumC7794a4 ? enumC7794a4 : objM15229E;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f24100b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p5 = this.f24101c.f24007b;
                EnumC8994d enumC8994d2 = EnumC8994d.OUTGOING;
                this.f24100b = 1;
                Object objM15229E2 = c8090p5.m15229E(this.f24102d, this.f24103e, enumC8994d2, this.f24104f, this.f24106h, this.f24105g, this);
                return objM15229E2 == enumC7794a5 ? enumC7794a5 : objM15229E2;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f24100b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p6 = this.f24101c.f24007b;
                EnumC8994d enumC8994d3 = EnumC8994d.MISSED;
                this.f24100b = 1;
                Object objM15229E3 = c8090p6.m15229E(this.f24102d, this.f24103e, enumC8994d3, this.f24104f, this.f24106h, this.f24105g, this);
                return objM15229E3 == enumC7794a6 ? enumC7794a6 : objM15229E3;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f24100b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p7 = this.f24101c.f24007b;
                EnumC8994d enumC8994d4 = EnumC8994d.REJECTED;
                this.f24100b = 1;
                Object objM15229E4 = c8090p7.m15229E(this.f24102d, this.f24103e, enumC8994d4, this.f24104f, this.f24106h, this.f24105g, this);
                return objM15229E4 == enumC7794a7 ? enumC7794a7 : objM15229E4;
            default:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f24100b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p8 = this.f24101c.f24007b;
                this.f24100b = 1;
                Object objM15248a = c8090p8.m15248a(this.f24105g, this.f24102d, this.f24103e, this.f24106h, this, this.f24104f);
                return objM15248a == enumC7794a8 ? enumC7794a8 : objM15248a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4828y(g0 g0Var, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6, List list, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24099a = i10;
        this.f24101c = g0Var;
        this.f24102d = localDateTime;
        this.f24103e = localDateTime2;
        this.f24104f = z6;
        this.f24106h = list;
        this.f24105g = str;
    }
}
