package ug;

import android.os.Bundle;
import e1.C1900b;
import e1.C1903e;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends d0 {

    /* renamed from: b */
    public final C1903e f35305b;

    /* renamed from: c */
    public final C1903e f35306c;

    /* renamed from: d */
    public long f35307d;

    public c0(n1 n1Var) {
        super(n1Var);
        this.f35306c = new C1903e(0);
        this.f35305b = new C1903e(0);
    }

    /* renamed from: N */
    public final void m13850N(String str, long j6) {
        n1 n1Var = (n1) this.f482a;
        if (str == null || str.length() == 0) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Ad unit id must be a non-empty string");
        } else {
            m1 m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(new RunnableC7430a(this, str, j6, 0));
        }
    }

    /* renamed from: O */
    public final void m13851O(String str, long j6) {
        n1 n1Var = (n1) this.f482a;
        if (str == null || str.length() == 0) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Ad unit id must be a non-empty string");
        } else {
            m1 m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(new RunnableC7430a(this, str, j6, 1));
        }
    }

    /* renamed from: P */
    public final void m13852P(long j6) {
        b3 b3Var = ((n1) this.f482a).f35675m;
        n1.m14084k(b3Var);
        x2 x2VarM13842S = b3Var.m13842S(false);
        C1903e c1903e = this.f35305b;
        Iterator it = ((C1900b) c1903e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m13854R(str, j6 - ((Long) c1903e.get(str)).longValue(), x2VarM13842S);
        }
        if (!c1903e.isEmpty()) {
            m13853Q(j6 - this.f35307d, x2VarM13842S);
        }
        m13855S(j6);
    }

    /* renamed from: Q */
    public final void m13853Q(long j6, x2 x2Var) {
        n1 n1Var = (n1) this.f482a;
        if (x2Var == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14140a("Not logging ad exposure. No active activity");
        } else if (j6 < 1000) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35870p.m14141b(Long.valueOf(j6), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j6);
            l4.E0(x2Var, bundle, true);
            q2 q2Var = n1Var.f35676n;
            n1.m14084k(q2Var);
            q2Var.m14122T("am", "_xa", bundle);
        }
    }

    /* renamed from: R */
    public final void m13854R(String str, long j6, x2 x2Var) {
        n1 n1Var = (n1) this.f482a;
        if (x2Var == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14140a("Not logging ad unit exposure. No active activity");
        } else {
            if (j6 < 1000) {
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35870p.m14141b(Long.valueOf(j6), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j6);
            l4.E0(x2Var, bundle, true);
            q2 q2Var = n1Var.f35676n;
            n1.m14084k(q2Var);
            q2Var.m14122T("am", "_xu", bundle);
        }
    }

    /* renamed from: S */
    public final void m13855S(long j6) {
        C1903e c1903e = this.f35305b;
        Iterator it = ((C1900b) c1903e.keySet()).iterator();
        while (it.hasNext()) {
            c1903e.put((String) it.next(), Long.valueOf(j6));
        }
        if (c1903e.isEmpty()) {
            return;
        }
        this.f35307d = j6;
    }
}
