package p001o;

import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2146o;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class rca implements wca, g72 {

    /* renamed from: b */
    public final xca f43373b;

    /* renamed from: c */
    public final za2 f43374c;

    /* renamed from: a */
    public final Object f43372a = new Object();

    /* renamed from: d */
    public volatile boolean f43375d = false;

    /* renamed from: e */
    public boolean f43376e = false;

    /* renamed from: f */
    public boolean f43377f = false;

    public rca(xca xcaVar, za2 za2Var) {
        this.f43373b = xcaVar;
        this.f43374c = za2Var;
        if (xcaVar.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
            za2Var.m59070m();
        } else {
            za2Var.m59078z();
        }
        xcaVar.getLifecycle().mo6521a(this);
    }

    @Override // p001o.g72
    /* renamed from: a */
    public t92 mo28113a() {
        return this.f43374c.mo28113a();
    }

    /* renamed from: b */
    public void m46514b(Collection collection) {
        synchronized (this.f43372a) {
            this.f43374c.m59069g(collection);
        }
    }

    /* renamed from: e */
    public za2 m46515e() {
        return this.f43374c;
    }

    /* renamed from: m */
    public xca m46516m() {
        xca xcaVar;
        synchronized (this.f43372a) {
            xcaVar = this.f43373b;
        }
        return xcaVar;
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_DESTROY)
    public void onDestroy(xca xcaVar) {
        synchronized (this.f43372a) {
            za2 za2Var = this.f43374c;
            za2Var.m59066Y(za2Var.m59063I());
        }
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_PAUSE)
    public void onPause(xca xcaVar) {
        this.f43374c.m59068f(false);
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_RESUME)
    public void onResume(xca xcaVar) {
        this.f43374c.m59068f(true);
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_START)
    public void onStart(xca xcaVar) {
        synchronized (this.f43372a) {
            if (!this.f43376e && !this.f43377f) {
                this.f43374c.m59070m();
                this.f43375d = true;
            }
        }
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_STOP)
    public void onStop(xca xcaVar) {
        synchronized (this.f43372a) {
            if (!this.f43376e && !this.f43377f) {
                this.f43374c.m59078z();
                this.f43375d = false;
            }
        }
    }

    /* renamed from: r */
    public t92 m46517r() {
        return this.f43374c.m59060F();
    }

    /* renamed from: s */
    public List m46518s() {
        List listUnmodifiableList;
        synchronized (this.f43372a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f43374c.m59063I());
        }
        return listUnmodifiableList;
    }

    /* renamed from: t */
    public boolean m46519t(w8i w8iVar) {
        boolean zContains;
        synchronized (this.f43372a) {
            zContains = this.f43374c.m59063I().contains(w8iVar);
        }
        return zContains;
    }

    /* renamed from: u */
    public void m46520u() {
        synchronized (this.f43372a) {
            if (this.f43376e) {
                return;
            }
            onStop(this.f43373b);
            this.f43376e = true;
        }
    }

    /* renamed from: v */
    public void m46521v() {
        synchronized (this.f43372a) {
            za2 za2Var = this.f43374c;
            za2Var.m59066Y(za2Var.m59063I());
        }
    }

    /* renamed from: w */
    public void m46522w() {
        synchronized (this.f43372a) {
            if (this.f43376e) {
                this.f43376e = false;
                if (this.f43373b.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
                    onStart(this.f43373b);
                }
            }
        }
    }
}
