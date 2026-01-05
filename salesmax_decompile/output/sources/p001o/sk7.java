package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class sk7 {

    /* renamed from: a */
    public final Executor f45515a;

    /* renamed from: b */
    public final uk7 f45516b;

    /* renamed from: c */
    public final Object f45517c;

    /* renamed from: d */
    public int f45518d;

    /* renamed from: e */
    public boolean f45519e;

    /* renamed from: f */
    public boolean f45520f;

    /* renamed from: g */
    public final List f45521g;

    /* renamed from: h */
    public final Runnable f45522h;

    public sk7(Executor executor, uk7 uk7Var) {
        sq8.m48649h(executor, "executor");
        sq8.m48649h(uk7Var, "reportFullyDrawn");
        this.f45515a = executor;
        this.f45516b = uk7Var;
        this.f45517c = new Object();
        this.f45521g = new ArrayList();
        this.f45522h = new Runnable() { // from class: o.rk7
            @Override // java.lang.Runnable
            public final void run() {
                sk7.m48443d(this.f43725a);
            }
        };
    }

    /* renamed from: d */
    public static final void m48443d(sk7 sk7Var) {
        sq8.m48649h(sk7Var, "this$0");
        synchronized (sk7Var.f45517c) {
            sk7Var.f45519e = false;
            if (sk7Var.f45518d == 0 && !sk7Var.f45520f) {
                sk7Var.f45516b.invoke();
                sk7Var.m48444b();
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: b */
    public final void m48444b() {
        synchronized (this.f45517c) {
            this.f45520f = true;
            Iterator it = this.f45521g.iterator();
            while (it.hasNext()) {
                ((uk7) it.next()).invoke();
            }
            this.f45521g.clear();
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: c */
    public final boolean m48445c() {
        boolean z;
        synchronized (this.f45517c) {
            z = this.f45520f;
        }
        return z;
    }
}
