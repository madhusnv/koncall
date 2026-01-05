package p001o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class f79 {

    /* renamed from: a */
    public final Map f22855a = new HashMap();

    /* renamed from: b */
    public final Map f22856b = new HashMap();

    /* renamed from: a */
    public bg6 m26226a(ic9 ic9Var, boolean z) {
        return (bg6) m26227b(z).get(ic9Var);
    }

    /* renamed from: b */
    public final Map m26227b(boolean z) {
        return z ? this.f22856b : this.f22855a;
    }

    /* renamed from: c */
    public void m26228c(ic9 ic9Var, bg6 bg6Var) {
        m26227b(bg6Var.m18862p()).put(ic9Var, bg6Var);
    }

    /* renamed from: d */
    public void m26229d(ic9 ic9Var, bg6 bg6Var) {
        Map mapM26227b = m26227b(bg6Var.m18862p());
        if (bg6Var.equals(mapM26227b.get(ic9Var))) {
            mapM26227b.remove(ic9Var);
        }
    }
}
