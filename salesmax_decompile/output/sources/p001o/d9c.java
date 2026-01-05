package p001o;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class d9c extends x6c {

    /* renamed from: a */
    public final x8c[] f19417a;

    /* renamed from: b */
    public final Iterable f19418b;

    /* renamed from: c */
    public final rl7 f19419c;

    /* renamed from: d */
    public final int f19420d;

    /* renamed from: e */
    public final boolean f19421e;

    /* renamed from: o.d9c$a */
    public static final class C12843a extends AtomicInteger implements su5 {

        /* renamed from: a */
        public final m9c f19422a;

        /* renamed from: b */
        public final rl7 f19423b;

        /* renamed from: c */
        public final C12844b[] f19424c;

        /* renamed from: d */
        public final Object[] f19425d;

        /* renamed from: e */
        public final boolean f19426e;

        /* renamed from: f */
        public volatile boolean f19427f;

        public C12843a(m9c m9cVar, rl7 rl7Var, int i, boolean z) {
            this.f19422a = m9cVar;
            this.f19423b = rl7Var;
            this.f19424c = new C12844b[i];
            this.f19425d = new Object[i];
            this.f19426e = z;
        }

        /* renamed from: a */
        public void m22618a() {
            m22621e();
            m22619b();
        }

        /* renamed from: b */
        public void m22619b() {
            for (C12844b c12844b : this.f19424c) {
                c12844b.m22624b();
            }
        }

        /* renamed from: d */
        public boolean m22620d(boolean z, boolean z2, m9c m9cVar, boolean z3, C12844b c12844b) {
            if (this.f19427f) {
                m22618a();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = c12844b.f19431d;
                this.f19427f = true;
                m22618a();
                if (th != null) {
                    m9cVar.onError(th);
                } else {
                    m9cVar.onComplete();
                }
                return true;
            }
            Throwable th2 = c12844b.f19431d;
            if (th2 != null) {
                this.f19427f = true;
                m22618a();
                m9cVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f19427f = true;
            m22618a();
            m9cVar.onComplete();
            return true;
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f19427f) {
                return;
            }
            this.f19427f = true;
            m22619b();
            if (getAndIncrement() == 0) {
                m22621e();
            }
        }

        /* renamed from: e */
        public void m22621e() {
            for (C12844b c12844b : this.f19424c) {
                c12844b.f19429b.clear();
            }
        }

        /* renamed from: f */
        public void m22622f() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            C12844b[] c12844bArr = this.f19424c;
            m9c m9cVar = this.f19422a;
            Object[] objArr = this.f19425d;
            boolean z = this.f19426e;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (C12844b c12844b : c12844bArr) {
                    if (objArr[i2] == null) {
                        boolean z2 = c12844b.f19430c;
                        Object objPoll = c12844b.f19429b.poll();
                        boolean z3 = objPoll == null;
                        if (m22620d(z2, z3, m9cVar, z, c12844b)) {
                            return;
                        }
                        if (z3) {
                            i++;
                        } else {
                            objArr[i2] = objPoll;
                        }
                    } else if (c12844b.f19430c && !z && (th = c12844b.f19431d) != null) {
                        this.f19427f = true;
                        m22618a();
                        m9cVar.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        Object objApply = this.f19423b.apply(objArr.clone());
                        Objects.requireNonNull(objApply, "The zipper returned a null value");
                        m9cVar.mo16560e(objApply);
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        zk6.m59526b(th2);
                        m22618a();
                        m9cVar.onError(th2);
                        return;
                    }
                }
            }
        }

        /* renamed from: h */
        public void m22623h(x8c[] x8cVarArr, int i) {
            C12844b[] c12844bArr = this.f19424c;
            int length = c12844bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                c12844bArr[i2] = new C12844b(this, i);
            }
            lazySet(0);
            this.f19422a.mo16559a(this);
            for (int i3 = 0; i3 < length && !this.f19427f; i3++) {
                x8cVarArr[i3].mo55724b(c12844bArr[i3]);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f19427f;
        }
    }

    /* renamed from: o.d9c$b */
    public static final class C12844b implements m9c {

        /* renamed from: a */
        public final C12843a f19428a;

        /* renamed from: b */
        public final c1g f19429b;

        /* renamed from: c */
        public volatile boolean f19430c;

        /* renamed from: d */
        public Throwable f19431d;

        /* renamed from: e */
        public final AtomicReference f19432e = new AtomicReference();

        public C12844b(C12843a c12843a, int i) {
            this.f19428a = c12843a;
            this.f19429b = new c1g(i);
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            zu5.setOnce(this.f19432e, su5Var);
        }

        /* renamed from: b */
        public void m22624b() {
            zu5.dispose(this.f19432e);
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f19429b.offer(obj);
            this.f19428a.m22622f();
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f19430c = true;
            this.f19428a.m22622f();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f19431d = th;
            this.f19430c = true;
            this.f19428a.m22622f();
        }
    }

    public d9c(x8c[] x8cVarArr, Iterable iterable, rl7 rl7Var, int i, boolean z) {
        this.f19417a = x8cVarArr;
        this.f19418b = iterable;
        this.f19419c = rl7Var;
        this.f19420d = i;
        this.f19421e = z;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        int length;
        x8c[] x8cVarArr = this.f19417a;
        if (x8cVarArr == null) {
            x8cVarArr = new x8c[8];
            length = 0;
            for (x8c x8cVar : this.f19418b) {
                if (length == x8cVarArr.length) {
                    x8c[] x8cVarArr2 = new x8c[(length >> 2) + length];
                    System.arraycopy(x8cVarArr, 0, x8cVarArr2, 0, length);
                    x8cVarArr = x8cVarArr2;
                }
                x8cVarArr[length] = x8cVar;
                length++;
            }
        } else {
            length = x8cVarArr.length;
        }
        if (length == 0) {
            h66.complete(m9cVar);
        } else {
            new C12843a(m9cVar, this.f19419c, length, this.f19421e).m22623h(x8cVarArr, this.f19420d);
        }
    }
}
