package i0;

import a1.C0004c;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import t0.C6973a;
import t0.C6974b;
import t0.C6975c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface s0 {
    /* renamed from: H */
    static void m7413H(j1 j1Var, s0 s0Var, s0 s0Var2, C3076g c3076g) {
        if (!Objects.equals(c3076g, b1.f44340p0)) {
            j1Var.m7351m(c3076g, s0Var2.mo7407l(c3076g), s0Var2.mo7406k(c3076g));
            return;
        }
        C6974b c6974b = (C6974b) s0Var2.mo7401e(c3076g, null);
        C6974b c6974b2 = (C6974b) s0Var.mo7401e(c3076g, null);
        r0 r0VarMo7407l = s0Var2.mo7407l(c3076g);
        if (c6974b == null) {
            c6974b = c6974b2;
        } else if (c6974b2 != null) {
            C6973a c6973a = c6974b2.f33748a;
            C6975c c6975c = c6974b2.f33749b;
            C6973a c6973a2 = c6974b.f33748a;
            if (c6973a2 != null) {
                c6973a = c6973a2;
            }
            C6975c c6975c2 = c6974b.f33749b;
            if (c6975c2 != null) {
                c6975c = c6975c2;
            }
            c6974b = new C6974b(c6973a, c6975c);
        }
        j1Var.m7351m(c3076g, r0VarMo7407l, c6974b);
    }

    /* renamed from: Q */
    static o1 m7414Q(s0 s0Var, s0 s0Var2) {
        if (s0Var == null && s0Var2 == null) {
            return o1.f16549c;
        }
        j1 j1VarM7350g = s0Var2 != null ? j1.m7350g(s0Var2) : j1.m7349b();
        if (s0Var != null) {
            Iterator it = s0Var.mo7403h().iterator();
            while (it.hasNext()) {
                m7413H(j1VarM7350g, s0Var2, s0Var, (C3076g) it.next());
            }
        }
        return o1.m7399a(j1VarM7350g);
    }

    /* renamed from: c */
    Set mo7400c(C3076g c3076g);

    /* renamed from: e */
    Object mo7401e(C3076g c3076g, Object obj);

    /* renamed from: f */
    void mo7402f(C0004c c0004c);

    /* renamed from: h */
    Set mo7403h();

    /* renamed from: i */
    boolean mo7404i(C3076g c3076g);

    /* renamed from: j */
    Object mo7405j(C3076g c3076g, r0 r0Var);

    /* renamed from: k */
    Object mo7406k(C3076g c3076g);

    /* renamed from: l */
    r0 mo7407l(C3076g c3076g);
}
