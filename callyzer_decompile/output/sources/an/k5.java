package an;

import ex.InterfaceC2139c;
import io.C3330e;
import iu.C3351c;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kn.EnumC4127g;
import kotlin.jvm.internal.AbstractC4154l;
import og.re;
import po.C5984e;
import ug.C7452w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1023a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1024b;

    /* renamed from: c */
    public final /* synthetic */ Object f1025c;

    public /* synthetic */ k5(rn.q0 q0Var, boolean z6) {
        this.f1023a = 2;
        this.f1025c = q0Var;
        this.f1024b = z6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String str;
        switch (this.f1023a) {
            case 0:
                boolean z6 = this.f1024b;
                String str2 = (String) this.f1025c;
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0("UPDATE UserSimDetails SET is_lead = ? WHERE sim_number = ?");
                try {
                    interfaceC4026cY0.mo1778g(1, z6 ? 1L : 0L);
                    interfaceC4026cY0.mo1776B(2, str2);
                    interfaceC4026cY0.r0();
                    int iM10878b = re.m10878b(_connection);
                    interfaceC4026cY0.close();
                    return Integer.valueOf(iM10878b);
                } catch (Throwable th2) {
                    interfaceC4026cY0.close();
                    throw th2;
                }
            case 1:
                C3330e c3330e = (C3330e) this.f1025c;
                int iIntValue = ((Integer) obj).intValue();
                if (!this.f1024b) {
                    c3330e.f17625c.m15601a(im.p1.LOG_FILE_UPLOAD_STATE, new C3351c(iIntValue));
                }
                return qw.a0.f30746a;
            default:
                rn.q0 q0Var = (rn.q0) this.f1025c;
                int iIntValue2 = ((Integer) obj).intValue();
                C7452w c7452w = xm.s2.f40808l;
                xm.s2.f40812p = false;
                q0Var.f31642l.clear();
                c7452w.m14181f();
                if (this.f1024b) {
                    C5984e c5984e = q0Var.f31637g;
                    if (iIntValue2 <= 0) {
                        str = "No recordings found";
                    } else {
                        str = iIntValue2 + " recordings found";
                    }
                    C5984e.m12016g(c5984e, 158, str, "Call Recording Finding Complete", EnumC4127g.Floating, null, false, null, false, null, 1008);
                }
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ k5(boolean z6, Object obj, int i10) {
        this.f1023a = i10;
        this.f1024b = z6;
        this.f1025c = obj;
    }
}
