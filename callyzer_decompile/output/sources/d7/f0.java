package d7;

import java.util.Iterator;
import java.util.Map;
import p015q.C6055b;
import p015q.C6056c;
import p015q.C6059f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class f0 extends g0 {

    /* renamed from: l */
    public final C6059f f8102l = new C6059f();

    @Override // d7.d0
    /* renamed from: g */
    public final void mo5317g() {
        Iterator it = this.f8102l.iterator();
        while (true) {
            C6055b c6055b = (C6055b) it;
            if (!c6055b.hasNext()) {
                return;
            }
            e0 e0Var = (e0) ((Map.Entry) c6055b.next()).getValue();
            e0Var.f8099a.m5316f(e0Var);
        }
    }

    @Override // d7.d0
    /* renamed from: h */
    public final void mo5318h() {
        Iterator it = this.f8102l.iterator();
        while (true) {
            C6055b c6055b = (C6055b) it;
            if (!c6055b.hasNext()) {
                return;
            }
            e0 e0Var = (e0) ((Map.Entry) c6055b.next()).getValue();
            e0Var.f8099a.mo5320j(e0Var);
        }
    }

    /* renamed from: l */
    public void mo5322l(d0 d0Var, h0 h0Var) {
        Object obj;
        if (d0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        e0 e0Var = new e0(d0Var, h0Var);
        C6059f c6059f = this.f8102l;
        C6056c c6056cMo12061a = c6059f.mo12061a(d0Var);
        if (c6056cMo12061a != null) {
            obj = c6056cMo12061a.f29550b;
        } else {
            C6056c c6056c = new C6056c(d0Var, e0Var);
            c6059f.f29559d++;
            C6056c c6056c2 = c6059f.f29557b;
            if (c6056c2 == null) {
                c6059f.f29556a = c6056c;
                c6059f.f29557b = c6056c;
            } else {
                c6056c2.f29551c = c6056c;
                c6056c.f29552d = c6056c2;
                c6059f.f29557b = c6056c;
            }
            obj = null;
        }
        e0 e0Var2 = (e0) obj;
        if (e0Var2 != null && e0Var2.f8100b != h0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (e0Var2 == null && this.f8085c > 0) {
            d0Var.m5316f(e0Var);
        }
    }
}
