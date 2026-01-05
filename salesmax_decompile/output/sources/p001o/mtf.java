package p001o;

import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public abstract class mtf implements x75 {

    /* renamed from: a */
    public final Thread f35963a;

    /* renamed from: e */
    public final a85[] f35967e;

    /* renamed from: f */
    public final b85[] f35968f;

    /* renamed from: g */
    public int f35969g;

    /* renamed from: h */
    public int f35970h;

    /* renamed from: i */
    public a85 f35971i;

    /* renamed from: j */
    public z75 f35972j;

    /* renamed from: k */
    public boolean f35973k;

    /* renamed from: l */
    public boolean f35974l;

    /* renamed from: m */
    public int f35975m;

    /* renamed from: b */
    public final Object f35964b = new Object();

    /* renamed from: n */
    public long f35976n = -9223372036854775807L;

    /* renamed from: c */
    public final ArrayDeque f35965c = new ArrayDeque();

    /* renamed from: d */
    public final ArrayDeque f35966d = new ArrayDeque();

    /* renamed from: o.mtf$a */
    public class C15430a extends Thread {
        public C15430a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            mtf.this.m39677v();
        }
    }

    public mtf(a85[] a85VarArr, b85[] b85VarArr) {
        this.f35967e = a85VarArr;
        this.f35969g = a85VarArr.length;
        for (int i = 0; i < this.f35969g; i++) {
            this.f35967e[i] = mo28780i();
        }
        this.f35968f = b85VarArr;
        this.f35970h = b85VarArr.length;
        for (int i2 = 0; i2 < this.f35970h; i2++) {
            this.f35968f[i2] = mo28781j();
        }
        C15430a c15430a = new C15430a("ExoPlayer:SimpleDecoder");
        this.f35963a = c15430a;
        c15430a.start();
    }

    @Override // p001o.x75
    /* renamed from: d */
    public final void mo18816d(long j) {
        synchronized (this.f35964b) {
            op0.m42517g(this.f35969g == this.f35967e.length || this.f35973k);
            this.f35976n = j;
        }
    }

    @Override // p001o.x75
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void mo18815c(a85 a85Var) {
        synchronized (this.f35964b) {
            m39673r();
            op0.m42511a(a85Var == this.f35971i);
            this.f35965c.addLast(a85Var);
            m39672q();
            this.f35971i = null;
        }
    }

    @Override // p001o.x75
    public final void flush() {
        synchronized (this.f35964b) {
            this.f35973k = true;
            this.f35975m = 0;
            a85 a85Var = this.f35971i;
            if (a85Var != null) {
                m39674s(a85Var);
                this.f35971i = null;
            }
            while (!this.f35965c.isEmpty()) {
                m39674s((a85) this.f35965c.removeFirst());
            }
            while (!this.f35966d.isEmpty()) {
                ((b85) this.f35966d.removeFirst()).mo18274u();
            }
        }
    }

    /* renamed from: h */
    public final boolean m39667h() {
        return !this.f35965c.isEmpty() && this.f35970h > 0;
    }

    /* renamed from: i */
    public abstract a85 mo28780i();

    /* renamed from: j */
    public abstract b85 mo28781j();

    /* renamed from: k */
    public abstract z75 mo28782k(Throwable th);

    /* renamed from: l */
    public abstract z75 mo28783l(a85 a85Var, b85 b85Var, boolean z);

    /* renamed from: m */
    public final boolean m39668m() {
        z75 z75VarMo28782k;
        synchronized (this.f35964b) {
            while (!this.f35974l && !m39667h()) {
                this.f35964b.wait();
            }
            if (this.f35974l) {
                return false;
            }
            a85 a85Var = (a85) this.f35965c.removeFirst();
            b85[] b85VarArr = this.f35968f;
            int i = this.f35970h - 1;
            this.f35970h = i;
            b85 b85Var = b85VarArr[i];
            boolean z = this.f35973k;
            this.f35973k = false;
            if (a85Var.m50150n()) {
                b85Var.m50147g(4);
            } else {
                b85Var.f15666b = a85Var.f14284f;
                if (a85Var.m50151o()) {
                    b85Var.m50147g(134217728);
                }
                if (!m39671p(a85Var.f14284f)) {
                    b85Var.f15668d = true;
                }
                try {
                    z75VarMo28782k = mo28783l(a85Var, b85Var, z);
                } catch (OutOfMemoryError e) {
                    z75VarMo28782k = mo28782k(e);
                } catch (RuntimeException e2) {
                    z75VarMo28782k = mo28782k(e2);
                }
                if (z75VarMo28782k != null) {
                    synchronized (this.f35964b) {
                        this.f35972j = z75VarMo28782k;
                    }
                    return false;
                }
            }
            synchronized (this.f35964b) {
                if (this.f35973k) {
                    b85Var.mo18274u();
                } else if (b85Var.f15668d) {
                    this.f35975m++;
                    b85Var.mo18274u();
                } else {
                    b85Var.f15667c = this.f35975m;
                    this.f35975m = 0;
                    this.f35966d.addLast(b85Var);
                }
                m39674s(a85Var);
            }
            return true;
        }
    }

    @Override // p001o.x75
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final a85 mo18817e() {
        a85 a85Var;
        synchronized (this.f35964b) {
            m39673r();
            op0.m42517g(this.f35971i == null);
            int i = this.f35969g;
            if (i == 0) {
                a85Var = null;
            } else {
                a85[] a85VarArr = this.f35967e;
                int i2 = i - 1;
                this.f35969g = i2;
                a85Var = a85VarArr[i2];
            }
            this.f35971i = a85Var;
        }
        return a85Var;
    }

    @Override // p001o.x75
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final b85 mo16896a() {
        synchronized (this.f35964b) {
            m39673r();
            if (this.f35966d.isEmpty()) {
                return null;
            }
            return (b85) this.f35966d.removeFirst();
        }
    }

    /* renamed from: p */
    public final boolean m39671p(long j) {
        boolean z;
        synchronized (this.f35964b) {
            long j2 = this.f35976n;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    /* renamed from: q */
    public final void m39672q() {
        if (m39667h()) {
            this.f35964b.notify();
        }
    }

    /* renamed from: r */
    public final void m39673r() throws z75 {
        z75 z75Var = this.f35972j;
        if (z75Var != null) {
            throw z75Var;
        }
    }

    @Override // p001o.x75
    public void release() throws InterruptedException {
        synchronized (this.f35964b) {
            this.f35974l = true;
            this.f35964b.notify();
        }
        try {
            this.f35963a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: s */
    public final void m39674s(a85 a85Var) {
        a85Var.mo16674h();
        a85[] a85VarArr = this.f35967e;
        int i = this.f35969g;
        this.f35969g = i + 1;
        a85VarArr[i] = a85Var;
    }

    /* renamed from: t */
    public void m39675t(b85 b85Var) {
        synchronized (this.f35964b) {
            m39676u(b85Var);
            m39672q();
        }
    }

    /* renamed from: u */
    public final void m39676u(b85 b85Var) {
        b85Var.mo16674h();
        b85[] b85VarArr = this.f35968f;
        int i = this.f35970h;
        this.f35970h = i + 1;
        b85VarArr[i] = b85Var;
    }

    /* renamed from: v */
    public final void m39677v() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m39668m());
    }

    /* renamed from: w */
    public final void m39678w(int i) {
        op0.m42517g(this.f35969g == this.f35967e.length);
        for (a85 a85Var : this.f35967e) {
            a85Var.m16676v(i);
        }
    }
}
