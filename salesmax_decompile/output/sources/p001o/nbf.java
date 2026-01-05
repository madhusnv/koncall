package p001o;

import androidx.media3.common.C2181a;
import java.util.List;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class nbf {

    /* renamed from: a */
    public final List f36657a;

    /* renamed from: b */
    public final uth[] f36658b;

    public nbf(List list) {
        this.f36657a = list;
        this.f36658b = new uth[list.size()];
    }

    /* renamed from: a */
    public void m40290a(long j, zwc zwcVar) {
        df2.m22956a(j, zwcVar, this.f36658b);
    }

    /* renamed from: b */
    public void m40291b(vq6 vq6Var, hyh.C14129d c14129d) {
        for (int i = 0; i < this.f36658b.length; i++) {
            c14129d.m31294a();
            uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 3);
            C2181a c2181a = (C2181a) this.f36657a.get(i);
            String str = c2181a.f7943n;
            op0.m42512b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strM31295b = c2181a.f7930a;
            if (strM31295b == null) {
                strM31295b = c14129d.m31295b();
            }
            uthVarMo32487f.mo7072b(new C2181a.b().a0(strM31295b).o0(str).q0(c2181a.f7934e).e0(c2181a.f7933d).m6749L(c2181a.f7924G).b0(c2181a.f7946q).m6748K());
            this.f36658b[i] = uthVarMo32487f;
        }
    }
}
