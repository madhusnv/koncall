package nz;

import iz.AbstractC3386s;
import iz.C3368a;
import iz.C3382o;
import iz.C3391x;
import iz.InterfaceC3372e;
import iz.d0;
import iz.k0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import kz.AbstractC4299e;
import lz.C4602a;
import oz.C5778a;
import oz.C5783f;
import p020v.x0;
import rw.AbstractC6663m;
import tz.AbstractC7285d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.p */
/* loaded from: classes3.dex */
public final class C5205p implements Cloneable {

    /* renamed from: a */
    public final d0 f25359a;

    /* renamed from: b */
    public final x0 f25360b;

    /* renamed from: c */
    public final C5207r f25361c;

    /* renamed from: d */
    public final AbstractC3386s f25362d;

    /* renamed from: e */
    public final C5204o f25363e;

    /* renamed from: f */
    public final AtomicBoolean f25364f;

    /* renamed from: g */
    public Object f25365g;

    /* renamed from: h */
    public InterfaceC5198i f25366h;

    /* renamed from: j */
    public C5206q f25367j;

    /* renamed from: k */
    public boolean f25368k;

    /* renamed from: l */
    public C5197h f25369l;

    /* renamed from: m */
    public boolean f25370m;

    /* renamed from: n */
    public boolean f25371n;

    /* renamed from: p */
    public boolean f25372p;

    /* renamed from: q */
    public volatile boolean f25373q;

    /* renamed from: r */
    public volatile C5197h f25374r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f25375s;

    public C5205p(d0 d0Var, x0 originalRequest) {
        AbstractC4154l.m8923f(originalRequest, "originalRequest");
        this.f25359a = d0Var;
        this.f25360b = originalRequest;
        this.f25361c = (C5207r) d0Var.f17833A.f24823b;
        this.f25362d = d0Var.f17837d.mo1955b(this);
        C5204o c5204o = new C5204o(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c5204o.mo1585g(0);
        this.f25363e = c5204o;
        this.f25364f = new AtomicBoolean();
        this.f25372p = true;
        this.f25375s = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public final IOException m10190a(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM10196g;
        TimeZone timeZone = AbstractC4299e.f21707a;
        C5206q c5206q = this.f25367j;
        if (c5206q != null) {
            synchronized (c5206q) {
                socketM10196g = m10196g();
            }
            if (this.f25367j == null) {
                if (socketM10196g != null) {
                    AbstractC4299e.m9014c(socketM10196g);
                }
                this.f25362d.mo7769k(this, c5206q);
            } else if (socketM10196g != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f25368k && this.f25363e.m1557i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f25362d.mo7761c(this);
            return interruptedIOException;
        }
        AbstractC3386s abstractC3386s = this.f25362d;
        AbstractC4154l.m8920c(interruptedIOException);
        abstractC3386s.mo7762d(this, interruptedIOException);
        return interruptedIOException;
    }

    /* renamed from: b */
    public final void m10191b(InterfaceC3372e interfaceC3372e) {
        if (!this.f25364f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
        this.f25365g = AbstractC7285d.f34750a.mo13610f();
        this.f25362d.mo7763e(this);
        C3382o c3382o = this.f25359a.f17834a;
        RunnableC5202m runnableC5202m = new RunnableC5202m(this, interfaceC3372e);
        c3382o.getClass();
        synchronized (c3382o) {
            ((ArrayDeque) c3382o.f17966d).add(runnableC5202m);
            RunnableC5202m runnableC5202mM7749c = c3382o.m7749c(((C3391x) this.f25360b.f36754b).f17994d);
            if (runnableC5202mM7749c != null) {
                runnableC5202m.f25355b = runnableC5202mM7749c.f25355b;
            }
        }
        c3382o.m7754h();
    }

    /* renamed from: c */
    public final void m10192c(boolean z6) {
        C5197h c5197h;
        synchronized (this) {
            if (!this.f25372p) {
                throw new IllegalStateException("released");
            }
        }
        if (z6 && (c5197h = this.f25374r) != null) {
            c5197h.f25341d.cancel();
            c5197h.f25338a.m10194e(c5197h, true, true, null);
        }
        this.f25369l = null;
    }

    public final void cancel() {
        if (this.f25373q) {
            return;
        }
        this.f25373q = true;
        C5197h c5197h = this.f25374r;
        if (c5197h != null) {
            c5197h.f25341d.cancel();
        }
        Iterator it = this.f25375s.iterator();
        AbstractC4154l.m8922e(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC5211v) it.next()).cancel();
        }
        this.f25362d.mo7764f(this);
    }

    public final Object clone() {
        return new C5205p(this.f25359a, this.f25360b);
    }

    /* renamed from: d */
    public final k0 m10193d() {
        ArrayList arrayList = new ArrayList();
        AbstractC6663m.m12765x(arrayList, this.f25359a.f17835b);
        arrayList.add(new C5778a(1, this.f25359a));
        arrayList.add(new C5778a(this.f25359a.f17843j));
        arrayList.add(new C4602a(0));
        arrayList.add(C5191b.f25300a);
        AbstractC6663m.m12765x(arrayList, this.f25359a.f17836c);
        arrayList.add(new C4602a(1));
        x0 x0Var = this.f25360b;
        d0 d0Var = this.f25359a;
        boolean z6 = false;
        try {
            try {
                k0 k0VarM11332f = new C5783f(this, arrayList, 0, null, x0Var, d0Var.f17855v, d0Var.f17856w, d0Var.f17857x).m11332f(this.f25360b);
                if (this.f25373q) {
                    AbstractC4297c.m8998b(k0VarM11332f);
                    throw new IOException("Canceled");
                }
                m10195f(null);
                return k0VarM11332f;
            } catch (IOException e2) {
                z6 = true;
                IOException iOExceptionM10195f = m10195f(e2);
                AbstractC4154l.m8921d(iOExceptionM10195f, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM10195f;
            }
        } catch (Throwable th2) {
            if (!z6) {
                m10195f(null);
            }
            throw th2;
        }
    }

    /* renamed from: e */
    public final IOException m10194e(C5197h exchange, boolean z6, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        AbstractC4154l.m8923f(exchange, "exchange");
        if (exchange.equals(this.f25374r)) {
            synchronized (this) {
                z11 = false;
                if (z6) {
                    try {
                        if (!this.f25370m) {
                            if (z10 || !this.f25371n) {
                                z12 = false;
                            }
                        }
                        if (z6) {
                            this.f25370m = false;
                        }
                        if (z10) {
                            this.f25371n = false;
                        }
                        boolean z13 = this.f25370m;
                        boolean z14 = (z13 || this.f25371n) ? false : true;
                        if (!z13 && !this.f25371n) {
                            if (!this.f25372p) {
                                z11 = true;
                            }
                        }
                        z12 = z11;
                        z11 = z14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                }
            }
            if (z11) {
                this.f25374r = null;
                C5206q c5206q = this.f25367j;
                if (c5206q != null) {
                    synchronized (c5206q) {
                        c5206q.f25391q++;
                    }
                }
            }
            if (z12) {
                return m10190a(iOException);
            }
        }
        return iOException;
    }

    /* renamed from: f */
    public final IOException m10195f(IOException iOException) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f25372p) {
                this.f25372p = false;
                if (!this.f25370m) {
                    if (!this.f25371n) {
                        z6 = true;
                    }
                }
            }
        }
        return z6 ? m10190a(iOException) : iOException;
    }

    /* renamed from: g */
    public final Socket m10196g() {
        C5206q c5206q = this.f25367j;
        AbstractC4154l.m8920c(c5206q);
        TimeZone timeZone = AbstractC4299e.f21707a;
        ArrayList arrayList = c5206q.f25394t;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i10 = -1;
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            if (AbstractC4154l.m8918a(((Reference) obj).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f25367j = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c5206q.f25395u = System.nanoTime();
        C5207r c5207r = this.f25361c;
        ConcurrentLinkedQueue concurrentLinkedQueue = c5207r.f25402g;
        TimeZone timeZone2 = AbstractC4299e.f21707a;
        if (!c5206q.f25388n && c5207r.f25396a != 0) {
            c5207r.f25400e.m9818d(c5207r.f25401f, 0L);
            return null;
        }
        c5206q.f25388n = true;
        concurrentLinkedQueue.remove(c5206q);
        if (concurrentLinkedQueue.isEmpty()) {
            c5207r.f25400e.m9816a();
        }
        C3368a address = c5206q.f25378d.f17969a;
        AbstractC4154l.m8923f(address, "address");
        if (c5207r.f25399d.get(address) == null) {
            return c5206q.f25380f;
        }
        throw new ClassCastException();
    }
}
