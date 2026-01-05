package p001o;

import androidx.compose.ui.focus.C1932f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p001o.alb;

/* loaded from: classes2.dex */
public final class t67 {

    /* renamed from: a */
    public final xk7 f46495a;

    /* renamed from: b */
    public Set f46496b;

    /* renamed from: c */
    public Set f46497c;

    /* renamed from: d */
    public Set f46498d;

    /* renamed from: e */
    public final uk7 f46499e;

    /* renamed from: o.t67$a */
    public static final class C17004a extends kf9 implements uk7 {
        public C17004a() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69034invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69034invoke() {
            g77 g77VarG0;
            Set set = t67.this.f46498d;
            t67 t67Var = t67.this;
            Iterator it = set.iterator();
            while (true) {
                int i = 16;
                int i2 = 1024;
                if (!it.hasNext()) {
                    t67.this.f46498d.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Set<r67> set2 = t67.this.f46497c;
                    t67 t67Var2 = t67.this;
                    for (r67 r67Var : set2) {
                        if (r67Var.mo17377h().m17361J()) {
                            int iM60153a = zzb.m60153a(i2);
                            C1932f c1932f = null;
                            boolean z = false;
                            boolean z2 = true;
                            for (alb.AbstractC12216c abstractC12216cMo17377h = r67Var.mo17377h(); abstractC12216cMo17377h != null; abstractC12216cMo17377h = sk5.m48434f(null)) {
                                if (abstractC12216cMo17377h instanceof C1932f) {
                                    C1932f c1932f2 = (C1932f) abstractC12216cMo17377h;
                                    if (c1932f != null) {
                                        z = true;
                                    }
                                    if (t67Var2.f46496b.contains(c1932f2)) {
                                        linkedHashSet.add(c1932f2);
                                        z2 = false;
                                    }
                                    c1932f = c1932f2;
                                } else if ((abstractC12216cMo17377h.m17356E() & iM60153a) != 0) {
                                }
                            }
                            if (!r67Var.mo17377h().m17361J()) {
                                throw new IllegalStateException("visitChildren called on an unattached node".toString());
                            }
                            fqb fqbVar = new fqb(new alb.AbstractC12216c[i], 0);
                            alb.AbstractC12216c abstractC12216cM17353B = r67Var.mo17377h().m17353B();
                            if (abstractC12216cM17353B == null) {
                                sk5.m48431c(fqbVar, r67Var.mo17377h());
                            } else {
                                fqbVar.m27344c(abstractC12216cM17353B);
                            }
                            while (fqbVar.m27357r()) {
                                alb.AbstractC12216c abstractC12216cM48434f = (alb.AbstractC12216c) fqbVar.m27361v(fqbVar.m27354o() - 1);
                                if ((abstractC12216cM48434f.m17352A() & iM60153a) == 0) {
                                    sk5.m48431c(fqbVar, abstractC12216cM48434f);
                                } else {
                                    while (abstractC12216cM48434f != null) {
                                        if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                            while (abstractC12216cM48434f != null) {
                                                if (abstractC12216cM48434f instanceof C1932f) {
                                                    C1932f c1932f3 = (C1932f) abstractC12216cM48434f;
                                                    if (c1932f != null) {
                                                        z = true;
                                                    }
                                                    if (t67Var2.f46496b.contains(c1932f3)) {
                                                        linkedHashSet.add(c1932f3);
                                                        z2 = false;
                                                    }
                                                    c1932f = c1932f3;
                                                } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                                }
                                                abstractC12216cM48434f = sk5.m48434f(null);
                                            }
                                        } else {
                                            abstractC12216cM48434f = abstractC12216cM48434f.m17353B();
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                if (z) {
                                    g77VarG0 = s67.m47902a(r67Var);
                                } else if (c1932f == null || (g77VarG0 = c1932f.g0()) == null) {
                                    g77VarG0 = h77.Inactive;
                                }
                                r67Var.mo40257i(g77VarG0);
                            }
                        } else {
                            r67Var.mo40257i(h77.Inactive);
                        }
                        i = 16;
                        i2 = 1024;
                    }
                    t67.this.f46497c.clear();
                    for (C1932f c1932f4 : t67.this.f46496b) {
                        if (c1932f4.m17361J()) {
                            h77 h77VarG0 = c1932f4.g0();
                            c1932f4.h0();
                            if (h77VarG0 != c1932f4.g0() || linkedHashSet.contains(c1932f4)) {
                                s67.m47904c(c1932f4);
                            }
                        }
                    }
                    t67.this.f46496b.clear();
                    linkedHashSet.clear();
                    if (!t67.this.f46498d.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                    }
                    if (!t67.this.f46497c.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                    }
                    if (!t67.this.f46496b.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                    }
                    return;
                }
                d77 d77Var = (d77) it.next();
                if (d77Var.mo17377h().m17361J()) {
                    int iM60153a2 = zzb.m60153a(1024);
                    for (alb.AbstractC12216c abstractC12216cMo17377h2 = d77Var.mo17377h(); abstractC12216cMo17377h2 != null; abstractC12216cMo17377h2 = sk5.m48434f(null)) {
                        if (abstractC12216cMo17377h2 instanceof C1932f) {
                            t67Var.f46496b.add((C1932f) abstractC12216cMo17377h2);
                        } else if ((abstractC12216cMo17377h2.m17356E() & iM60153a2) != 0) {
                        }
                    }
                    if (!d77Var.mo17377h().m17361J()) {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                    fqb fqbVar2 = new fqb(new alb.AbstractC12216c[16], 0);
                    alb.AbstractC12216c abstractC12216cM17353B2 = d77Var.mo17377h().m17353B();
                    if (abstractC12216cM17353B2 == null) {
                        sk5.m48431c(fqbVar2, d77Var.mo17377h());
                    } else {
                        fqbVar2.m27344c(abstractC12216cM17353B2);
                    }
                    while (fqbVar2.m27357r()) {
                        alb.AbstractC12216c abstractC12216cM48434f2 = (alb.AbstractC12216c) fqbVar2.m27361v(fqbVar2.m27354o() - 1);
                        if ((abstractC12216cM48434f2.m17352A() & iM60153a2) == 0) {
                            sk5.m48431c(fqbVar2, abstractC12216cM48434f2);
                        } else {
                            while (true) {
                                if (abstractC12216cM48434f2 == null) {
                                    break;
                                }
                                if ((abstractC12216cM48434f2.m17356E() & iM60153a2) != 0) {
                                    while (abstractC12216cM48434f2 != null) {
                                        if (abstractC12216cM48434f2 instanceof C1932f) {
                                            t67Var.f46496b.add((C1932f) abstractC12216cM48434f2);
                                        } else if ((abstractC12216cM48434f2.m17356E() & iM60153a2) != 0) {
                                        }
                                        abstractC12216cM48434f2 = sk5.m48434f(null);
                                    }
                                } else {
                                    abstractC12216cM48434f2 = abstractC12216cM48434f2.m17353B();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public t67(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "onRequestApplyChangesListener");
        this.f46495a = xk7Var;
        this.f46496b = new LinkedHashSet();
        this.f46497c = new LinkedHashSet();
        this.f46498d = new LinkedHashSet();
        this.f46499e = new C17004a();
    }

    /* renamed from: d */
    public final void m49431d(C1932f c1932f) {
        sq8.m48649h(c1932f, "node");
        m49432e(this.f46496b, c1932f);
    }

    /* renamed from: e */
    public final void m49432e(Set set, Object obj) {
        if (set.add(obj) && this.f46496b.size() + this.f46497c.size() + this.f46498d.size() == 1) {
            this.f46495a.invoke(this.f46499e);
        }
    }

    /* renamed from: f */
    public final void m49433f(r67 r67Var) {
        sq8.m48649h(r67Var, "node");
        m49432e(this.f46497c, r67Var);
    }

    /* renamed from: g */
    public final void m49434g(d77 d77Var) {
        sq8.m48649h(d77Var, "node");
        m49432e(this.f46498d, d77Var);
    }
}
