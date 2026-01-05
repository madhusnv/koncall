package ks;

import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import cs.AbstractC1500s;
import cs.C1493l;
import cs.C1498q;
import ex.InterfaceC2141e;
import im.p1;
import iq.EnumC3343a;
import java.util.List;
import js.C3846b;
import js.C3847c;
import js.C3850f;
import og.od;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rt.C6617a;
import rw.AbstractC6663m;
import sq.g2;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21478a;

    /* renamed from: b */
    public int f21479b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC1500s f21480c;

    /* renamed from: d */
    public final /* synthetic */ q0 f21481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, AbstractC1500s abstractC1500s, q0 q0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21478a = i10;
        this.f21480c = abstractC1500s;
        this.f21481d = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21478a) {
            case 0:
                return new o0(0, this.f21480c, this.f21481d, interfaceC7559c);
            default:
                return new o0(1, this.f21480c, this.f21481d, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21478a) {
        }
        return ((o0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C3846b c3846b;
        List list;
        String str;
        switch (this.f21478a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f21479b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C1493l c1493l = (C1493l) this.f21480c;
                    String str2 = (String) AbstractC6663m.m12742F(c1493l.f7574a.f19819i);
                    C7806h c7806h = this.f21481d.f21507r;
                    C3850f c3850f = c1493l.f7574a;
                    C3847c c3847c = new C3847c(str2, c3850f.f19813c, c3850f.f19814d);
                    this.f21479b = 1;
                    if (c7806h.mo14775g(c3847c, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f21479b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C1498q c1498q = (C1498q) this.f21480c;
                    C3850f c3850f2 = c1498q.f7584a;
                    String str3 = (c3850f2 == null || (list = c3850f2.f19819i) == null || (str = (String) AbstractC6663m.m12744H(AbstractC6663m.m12758V(list), 0)) == null) ? "" : str;
                    C3850f c3850f3 = c1498q.f7584a;
                    C6617a c6617a = null;
                    LastCallDetails lastCallDetails = (c3850f3 == null || (c3846b = c3850f3.f19826p) == null) ? null : c3846b.f19803a;
                    if (lastCallDetails != null) {
                        EnumC8994d enumC8994dI0 = g2.i0(lastCallDetails.m4905c());
                        C3850f c3850f4 = c1498q.f7584a;
                        String str4 = c3850f4.f19812b;
                        String str5 = c3850f4.f19813c;
                        int i12 = c1498q.f7585b;
                        String str6 = c3850f4.f19815e;
                        c6617a = new C6617a(str4, str5, str3, String.valueOf(c1498q.f7584a.f19814d), enumC8994dI0, lastCallDetails.m4904b(), lastCallDetails.m4909g(), "lead", i12, str6 == null ? "" : str6, String.valueOf(c3850f4.f19816f), null, NewHope.SENDB_BYTES);
                    }
                    q0 q0Var = this.f21481d;
                    q0Var.f21504o.m9337b(p1.MESSAGE_TEMPLATE_CALL_LOG_DATA, c6617a);
                    C7806h c7806h2 = q0Var.f21492C;
                    EnumC3343a enumC3343a = EnumC3343a.NavigateToMessageTemplate;
                    this.f21479b = 1;
                    if (c7806h2.mo14775g(enumC3343a, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
