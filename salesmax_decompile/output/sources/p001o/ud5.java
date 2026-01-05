package p001o;

import android.net.Uri;
import java.util.Map;
import p001o.dz4;
import p001o.je5;
import p001o.qd5;
import p001o.s2b;

/* loaded from: classes2.dex */
public final class ud5 implements pz5 {

    /* renamed from: a */
    public final Object f48731a = new Object();

    /* renamed from: b */
    public s2b.C16721f f48732b;

    /* renamed from: c */
    public nz5 f48733c;

    /* renamed from: d */
    public dz4.InterfaceC13064a f48734d;

    /* renamed from: e */
    public String f48735e;

    /* renamed from: f */
    public sga f48736f;

    @Override // p001o.pz5
    /* renamed from: a */
    public nz5 mo44362a(s2b s2bVar) {
        nz5 nz5Var;
        op0.m42515e(s2bVar.f44480b);
        s2b.C16721f c16721f = s2bVar.f44480b.f44574c;
        if (c16721f == null) {
            return nz5.f37467a;
        }
        synchronized (this.f48731a) {
            if (!sqi.m48724c(c16721f, this.f48732b)) {
                this.f48732b = c16721f;
                this.f48733c = m51374b(c16721f);
            }
            nz5Var = (nz5) op0.m42515e(this.f48733c);
        }
        return nz5Var;
    }

    /* renamed from: b */
    public final nz5 m51374b(s2b.C16721f c16721f) {
        dz4.InterfaceC13064a interfaceC13064aM33623c = this.f48734d;
        if (interfaceC13064aM33623c == null) {
            interfaceC13064aM33623c = new je5.C14508b().m33623c(this.f48735e);
        }
        Uri uri = c16721f.f44531c;
        n38 n38Var = new n38(uri == null ? null : uri.toString(), c16721f.f44536h, interfaceC13064aM33623c);
        q4i it = c16721f.f44533e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n38Var.m40040e((String) entry.getKey(), (String) entry.getValue());
        }
        qd5.C16340b c16340bM45143e = new qd5.C16340b().m45144f(c16721f.f44529a, hk7.f27078d).m45141c(c16721f.f44534f).m45142d(c16721f.f44535g).m45143e(br8.m19646m(c16721f.f44538j));
        sga sgaVar = this.f48736f;
        if (sgaVar != null) {
            c16340bM45143e.m45140b(sgaVar);
        }
        qd5 qd5VarM45139a = c16340bM45143e.m45139a(n38Var);
        qd5VarM45139a.m45131F(0, c16721f.m47487c());
        return qd5VarM45139a;
    }
}
