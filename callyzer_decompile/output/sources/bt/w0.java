package bt;

import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import cp.AbstractC1473d;
import cp.AbstractC1477h;
import cs.C1495n;
import dt.C1818x;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import hy.C3060k;
import hy.InterfaceC3055f;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import js.C3850f;
import jy.C3883t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5941v;
import pg.c9;
import qp.C6264a;
import qz.C6398p;
import qz.EnumC6384b;
import zm.EnumC8994d;
import zp.C9002b;
import zp.C9010j;
import zs.C9059x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4945a;

    /* renamed from: b */
    public final /* synthetic */ int f4946b;

    /* renamed from: c */
    public final /* synthetic */ Object f4947c;

    /* renamed from: d */
    public final /* synthetic */ Object f4948d;

    public /* synthetic */ w0(int i10, String str, C3883t c3883t) {
        this.f4945a = 4;
        this.f4946b = i10;
        this.f4948d = str;
        this.f4947c = c3883t;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4945a) {
            case 0:
                C1818x c1818x = (C1818x) this.f4947c;
                c1818x.m5481f(new zs.a0("create_call_note_templates/" + ((String) this.f4948d) + "/" + this.f4946b));
                c1818x.m5481f(new C9059x(false));
                break;
            case 1:
                C6264a c6264a = (C6264a) this.f4947c;
                l7.a0 a0Var = (l7.a0) this.f4948d;
                switch (AbstractC1473d.f7529a[((C9002b) c6264a.f30358b.get(this.f4946b)).f43358b.ordinal()]) {
                    case 1:
                        l7.a0.m9181f(a0Var, "top_caller");
                        break;
                    case 2:
                        l7.a0.m9181f(a0Var, "longest_call");
                        break;
                    case 3:
                        l7.a0.m9181f(a0Var, "highest_call");
                        break;
                    case 4:
                        l7.a0.m9181f(a0Var, "top_frequent_call");
                        break;
                    case 5:
                        l7.a0.m9181f(a0Var, "top_duration_call");
                        break;
                    case 6:
                        l7.a0.m9181f(a0Var, "average_call_duration");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return qw.a0.f30746a;
            case 2:
                List list = (List) this.f4947c;
                l7.a0 a0Var2 = (l7.a0) this.f4948d;
                switch (AbstractC1477h.f7537a[((C9010j) list.get(this.f4946b)).f43405b.ordinal()]) {
                    case 1:
                        l7.a0.m9181f(a0Var2, "total_calls");
                        break;
                    case 2:
                        l7.a0.m9181f(a0Var2, c9.m11575d(EnumC8994d.INCOMING));
                        break;
                    case 3:
                        l7.a0.m9181f(a0Var2, c9.m11575d(EnumC8994d.OUTGOING));
                        break;
                    case 4:
                        l7.a0.m9181f(a0Var2, c9.m11575d(EnumC8994d.MISSED));
                        break;
                    case 5:
                        l7.a0.m9181f(a0Var2, c9.m11575d(EnumC8994d.REJECTED));
                        break;
                    case 6:
                        l7.a0.m9181f(a0Var2, "unique_call_summary_calls");
                        break;
                    case 7:
                        l7.a0.m9181f(a0Var2, "connected_call_summary_calls");
                        break;
                    case 8:
                        l7.a0.m9181f(a0Var2, "unique_connected_call_summary_calls");
                        break;
                    case 9:
                        l7.a0.m9181f(a0Var2, "never_attend_calls_summary");
                        break;
                    case 10:
                        l7.a0.m9181f(a0Var2, "not_pick_up_call_by_client");
                        break;
                }
                return qw.a0.f30746a;
            case 3:
                ((InterfaceC2141e) this.f4947c).invoke(String.valueOf(this.f4946b), (String) this.f4948d);
                break;
            case 4:
                String str = (String) this.f4948d;
                C3883t c3883t = (C3883t) this.f4947c;
                int i10 = this.f4946b;
                InterfaceC3055f[] interfaceC3055fArr = new InterfaceC3055f[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    interfaceC3055fArr[i11] = AbstractC5941v.m11889c(str + '.' + c3883t.f19945e[i11], C3060k.f16416e, new InterfaceC3055f[0]);
                }
                return interfaceC3055fArr;
            case 5:
                C6398p c6398p = (C6398p) this.f4947c;
                int i12 = this.f4946b;
                EnumC6384b statusCode = (EnumC6384b) this.f4948d;
                try {
                    AbstractC4154l.m8923f(statusCode, "statusCode");
                    c6398p.f30842B.m12411A(i12, statusCode);
                } catch (IOException e2) {
                    EnumC6384b enumC6384b = EnumC6384b.PROTOCOL_ERROR;
                    c6398p.m12388h(enumC6384b, enumC6384b, e2);
                }
                return qw.a0.f30746a;
            default:
                C3850f c3850f = (C3850f) this.f4947c;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f4948d;
                Objects.toString(c3850f.f19826p.f19803a);
                LastCallDetails lastCallDetails = c3850f.f19826p.f19803a;
                AbstractC4154l.m8920c(lastCallDetails);
                interfaceC2139c.invoke(new C1495n(lastCallDetails, c3850f.f19811a, this.f4946b));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ w0(Object obj, int i10, Object obj2, int i11) {
        this.f4945a = i11;
        this.f4947c = obj;
        this.f4946b = i10;
        this.f4948d = obj2;
    }

    public /* synthetic */ w0(Object obj, Object obj2, int i10, int i11) {
        this.f4945a = i11;
        this.f4947c = obj;
        this.f4948d = obj2;
        this.f4946b = i10;
    }
}
