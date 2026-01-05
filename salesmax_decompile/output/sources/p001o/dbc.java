package p001o;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class dbc {

    /* renamed from: a */
    public boolean f19530a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f19531b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public uk7 f19532c;

    public dbc(boolean z) {
        this.f19530a = z;
    }

    /* renamed from: a */
    public final void m22744a(wb2 wb2Var) {
        sq8.m48649h(wb2Var, "cancellable");
        this.f19531b.add(wb2Var);
    }

    /* renamed from: b */
    public final uk7 m22745b() {
        return this.f19532c;
    }

    /* renamed from: c */
    public void mo6219c() {
    }

    /* renamed from: d */
    public abstract void mo940d();

    /* renamed from: e */
    public void mo6220e(l91 l91Var) {
        sq8.m48649h(l91Var, "backEvent");
    }

    /* renamed from: f */
    public void mo6221f(l91 l91Var) {
        sq8.m48649h(l91Var, "backEvent");
    }

    /* renamed from: g */
    public final boolean m22746g() {
        return this.f19530a;
    }

    /* renamed from: h */
    public final void m22747h() {
        Iterator it = this.f19531b.iterator();
        while (it.hasNext()) {
            ((wb2) it.next()).cancel();
        }
    }

    /* renamed from: i */
    public final void m22748i(wb2 wb2Var) {
        sq8.m48649h(wb2Var, "cancellable");
        this.f19531b.remove(wb2Var);
    }

    /* renamed from: j */
    public final void m22749j(boolean z) {
        this.f19530a = z;
        uk7 uk7Var = this.f19532c;
        if (uk7Var != null) {
            uk7Var.invoke();
        }
    }

    /* renamed from: k */
    public final void m22750k(uk7 uk7Var) {
        this.f19532c = uk7Var;
    }
}
