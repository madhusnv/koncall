package p001o;

import androidx.media3.common.C2181a;
import java.util.List;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class adi {

    /* renamed from: a */
    public final List f14554a;

    /* renamed from: b */
    public final uth[] f14555b;

    public adi(List list) {
        this.f14554a = list;
        this.f14555b = new uth[list.size()];
    }

    /* renamed from: a */
    public void m16933a(long j, zwc zwcVar) {
        if (zwcVar.m60020a() < 9) {
            return;
        }
        int iM60036q = zwcVar.m60036q();
        int iM60036q2 = zwcVar.m60036q();
        int iM60004H = zwcVar.m60004H();
        if (iM60036q == 434 && iM60036q2 == 1195456820 && iM60004H == 3) {
            df2.m22957b(j, zwcVar, this.f14555b);
        }
    }

    /* renamed from: b */
    public void m16934b(vq6 vq6Var, hyh.C14129d c14129d) {
        for (int i = 0; i < this.f14555b.length; i++) {
            c14129d.m31294a();
            uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 3);
            C2181a c2181a = (C2181a) this.f14554a.get(i);
            String str = c2181a.f7943n;
            op0.m42512b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            uthVarMo32487f.mo7072b(new C2181a.b().a0(c14129d.m31295b()).o0(str).q0(c2181a.f7934e).e0(c2181a.f7933d).m6749L(c2181a.f7924G).b0(c2181a.f7946q).m6748K());
            this.f14555b[i] = uthVarMo32487f;
        }
    }
}
