package p001o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.fve;

/* loaded from: classes6.dex */
public final class yce implements bt1, Cloneable {

    /* renamed from: H */
    public boolean f55248H;

    /* renamed from: L */
    public boolean f55249L;

    /* renamed from: M */
    public boolean f55250M;

    /* renamed from: Q */
    public volatile boolean f55251Q;

    /* renamed from: X */
    public volatile dl6 f55252X;

    /* renamed from: Y */
    public final CopyOnWriteArrayList f55253Y;

    /* renamed from: a */
    public final hac f55254a;

    /* renamed from: b */
    public final ule f55255b;

    /* renamed from: c */
    public final boolean f55256c;

    /* renamed from: d */
    public final ade f55257d;

    /* renamed from: e */
    public final dk6 f55258e;

    /* renamed from: f */
    public final C18379c f55259f;

    /* renamed from: g */
    public final AtomicBoolean f55260g;

    /* renamed from: h */
    public Object f55261h;

    /* renamed from: q */
    public fl6 f55262q;

    /* renamed from: s */
    public zce f55263s;

    /* renamed from: x */
    public boolean f55264x;

    /* renamed from: y */
    public dl6 f55265y;

    /* renamed from: o.yce$a */
    public final class RunnableC18377a implements Runnable {

        /* renamed from: a */
        public final z22 f55266a;

        /* renamed from: b */
        public volatile AtomicInteger f55267b;

        /* renamed from: c */
        public final /* synthetic */ yce f55268c;

        public RunnableC18377a(yce yceVar, z22 z22Var) {
            sq8.m48649h(z22Var, "responseCallback");
            this.f55268c = yceVar;
            this.f55266a = z22Var;
            this.f55267b = new AtomicInteger(0);
        }

        /* renamed from: c */
        public static /* synthetic */ void m57599c(RunnableC18377a runnableC18377a, RejectedExecutionException rejectedExecutionException, int i, Object obj) {
            if ((i & 1) != 0) {
                rejectedExecutionException = null;
            }
            runnableC18377a.m57601b(rejectedExecutionException);
        }

        /* renamed from: a */
        public final void m57600a(ExecutorService executorService) {
            sq8.m48649h(executorService, "executorService");
            du5 du5VarM30076o = this.f55268c.m57585k().m30076o();
            if (jgj.f30421e && Thread.holdsLock(du5VarM30076o)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + du5VarM30076o);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    m57601b(e);
                    this.f55268c.m57585k().m30076o().m23826f(this);
                }
            } catch (Throwable th) {
                this.f55268c.m57585k().m30076o().m23826f(this);
                throw th;
            }
        }

        /* renamed from: b */
        public final void m57601b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f55268c.m57595w(interruptedIOException);
            this.f55266a.onFailure(this.f55268c, interruptedIOException);
        }

        /* renamed from: d */
        public final yce m57602d() {
            return this.f55268c;
        }

        /* renamed from: e */
        public final AtomicInteger m57603e() {
            return this.f55267b;
        }

        /* renamed from: f */
        public final String m57604f() {
            return this.f55268c.m57590q().m51741l().m53877h();
        }

        /* renamed from: g */
        public final void m57605g(RunnableC18377a runnableC18377a) {
            sq8.m48649h(runnableC18377a, "other");
            this.f55267b = runnableC18377a.f55267b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            du5 du5VarM30076o;
            String str = "OkHttp " + this.f55268c.m57596x();
            yce yceVar = this.f55268c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                yceVar.f55259f.m17742v();
                try {
                    try {
                        z = true;
                        try {
                            this.f55266a.onResponse(yceVar, yceVar.m57592t());
                            du5VarM30076o = yceVar.m57585k().m30076o();
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                e9d.f21191a.m24582g().m24573j("Callback failure for " + yceVar.m57578C(), 4, e);
                            } else {
                                this.f55266a.onFailure(yceVar, e);
                            }
                            du5VarM30076o = yceVar.m57585k().m30076o();
                            du5VarM30076o.m23826f(this);
                        } catch (Throwable th2) {
                            th = th2;
                            yceVar.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                cl6.m21376a(iOException, th);
                                this.f55266a.onFailure(yceVar, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        yceVar.m57585k().m30076o().m23826f(this);
                        throw th3;
                    }
                } catch (IOException e3) {
                    z = false;
                    e = e3;
                } catch (Throwable th4) {
                    z = false;
                    th = th4;
                }
                du5VarM30076o.m23826f(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* renamed from: o.yce$b */
    public static final class C18378b extends WeakReference {

        /* renamed from: a */
        public final Object f55269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18378b(yce yceVar, Object obj) {
            super(yceVar);
            sq8.m48649h(yceVar, "referent");
            this.f55269a = obj;
        }

        /* renamed from: a */
        public final Object m57606a() {
            return this.f55269a;
        }
    }

    /* renamed from: o.yce$c */
    public static final class C18379c extends as0 {
        public C18379c() {
        }

        @Override // p001o.as0
        /* renamed from: B */
        public void mo17740B() {
            yce.this.cancel();
        }
    }

    public yce(hac hacVar, ule uleVar, boolean z) {
        sq8.m48649h(hacVar, "client");
        sq8.m48649h(uleVar, "originalRequest");
        this.f55254a = hacVar;
        this.f55255b = uleVar;
        this.f55256c = z;
        this.f55257d = hacVar.m30073l().m21742c();
        this.f55258e = hacVar.m30078q().mo23359a(this);
        C18379c c18379c = new C18379c();
        c18379c.mo40796g(hacVar.m30069h(), TimeUnit.MILLISECONDS);
        this.f55259f = c18379c;
        this.f55260g = new AtomicBoolean();
        this.f55250M = true;
        this.f55253Y = new CopyOnWriteArrayList();
    }

    /* renamed from: A */
    public final void m57576A() {
        if (!(!this.f55264x)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f55264x = true;
        this.f55259f.m17743w();
    }

    /* renamed from: B */
    public final IOException m57577B(IOException iOException) {
        if (this.f55264x || !this.f55259f.m17743w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: C */
    public final String m57578C() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f55256c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m57596x());
        return sb.toString();
    }

    /* renamed from: c */
    public final void m57579c(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        if (!jgj.f30421e || Thread.holdsLock(zceVar)) {
            if (!(this.f55263s == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f55263s = zceVar;
            zceVar.m59195i().add(new C18378b(this, this.f55261h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + zceVar);
    }

    @Override // p001o.bt1
    public void cancel() {
        if (this.f55251Q) {
            return;
        }
        this.f55251Q = true;
        dl6 dl6Var = this.f55252X;
        if (dl6Var != null) {
            dl6Var.m23387b();
        }
        Iterator it = this.f55253Y.iterator();
        while (it.hasNext()) {
            ((fve.InterfaceC13582b) it.next()).cancel();
        }
        this.f55258e.canceled(this);
    }

    @Override // p001o.bt1
    public zqe execute() {
        if (!this.f55260g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f55259f.m17742v();
        m57581g();
        try {
            this.f55254a.m30076o().m23822b(this);
            return m57592t();
        } finally {
            this.f55254a.m30076o().m23827g(this);
        }
    }

    /* renamed from: f */
    public final IOException m57580f(IOException iOException) throws IOException {
        Socket socketM57597y;
        boolean z = jgj.f30421e;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        zce zceVar = this.f55263s;
        if (zceVar != null) {
            if (z && Thread.holdsLock(zceVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + zceVar);
            }
            synchronized (zceVar) {
                socketM57597y = m57597y();
            }
            if (this.f55263s == null) {
                if (socketM57597y != null) {
                    jgj.m33813g(socketM57597y);
                }
                this.f55258e.connectionReleased(this, zceVar);
                zceVar.m59196j().mo17806g(zceVar, this);
                if (socketM57597y != null) {
                    zceVar.m59196j().m19707f(zceVar);
                }
            } else {
                if (!(socketM57597y == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        IOException iOExceptionM57577B = m57577B(iOException);
        if (iOException != null) {
            dk6 dk6Var = this.f55258e;
            sq8.m48646e(iOExceptionM57577B);
            dk6Var.callFailed(this, iOExceptionM57577B);
        } else {
            this.f55258e.callEnd(this);
        }
        return iOExceptionM57577B;
    }

    /* renamed from: g */
    public final void m57581g() {
        this.f55261h = e9d.f21191a.m24582g().mo24571h("response.body().close()");
        this.f55258e.callStart(this);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public bt1 clone() {
        return new yce(this.f55254a, this.f55255b, this.f55256c);
    }

    /* renamed from: i */
    public final void m57583i(ule uleVar, boolean z, cde cdeVar) {
        sq8.m48649h(uleVar, "request");
        sq8.m48649h(cdeVar, "chain");
        if (!(this.f55265y == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f55249L)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f55248H)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            y3i y3iVar = y3i.f54824a;
        }
        if (z) {
            ede edeVar = new ede(this.f55254a.m30083v(), this.f55257d, this.f55254a.m30058H(), this.f55254a.m30064N(), cdeVar.m20976f(), cdeVar.m20978h(), this.f55254a.m30053C(), this.f55254a.m30059I(), this.f55254a.m30079r(), this.f55254a.m30066e(uleVar.m51741l()), this.f55254a.m30082u(), new et1(this, this.f55257d.m16924f(), cdeVar));
            this.f55262q = this.f55254a.m30079r() ? new ys6(edeVar, this.f55254a.m30083v()) : new sef(edeVar);
        }
    }

    @Override // p001o.bt1
    public boolean isCanceled() {
        return this.f55251Q;
    }

    @Override // p001o.bt1
    public boolean isExecuted() {
        return this.f55260g.get();
    }

    /* renamed from: j */
    public final void m57584j(boolean z) {
        dl6 dl6Var;
        synchronized (this) {
            if (!this.f55250M) {
                throw new IllegalStateException("released".toString());
            }
            y3i y3iVar = y3i.f54824a;
        }
        if (z && (dl6Var = this.f55252X) != null) {
            dl6Var.m23389d();
        }
        this.f55265y = null;
    }

    /* renamed from: k */
    public final hac m57585k() {
        return this.f55254a;
    }

    /* renamed from: l */
    public final zce m57586l() {
        return this.f55263s;
    }

    /* renamed from: m */
    public final dk6 m57587m() {
        return this.f55258e;
    }

    /* renamed from: n */
    public final boolean m57588n() {
        return this.f55256c;
    }

    /* renamed from: p */
    public final dl6 m57589p() {
        return this.f55265y;
    }

    /* renamed from: q */
    public final ule m57590q() {
        return this.f55255b;
    }

    @Override // p001o.bt1
    public ule request() {
        return this.f55255b;
    }

    /* renamed from: s */
    public final CopyOnWriteArrayList m57591s() {
        return this.f55253Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zqe m57592t() throws Throwable {
        ArrayList arrayList = new ArrayList();
        hh3.m30441A(arrayList, this.f55254a.m30085x());
        arrayList.add(new cse(this.f55254a));
        arrayList.add(new ol1(this.f55254a.m30075n()));
        this.f55254a.m30068g();
        arrayList.add(new as1(null));
        arrayList.add(vr3.f50783a);
        if (!this.f55256c) {
            hh3.m30441A(arrayList, this.f55254a.m30087z());
        }
        arrayList.add(new uz1(this.f55256c));
        boolean z = false;
        try {
            zqe zqeVarMo20972a = new cde(this, arrayList, 0, null, this.f55255b, this.f55254a.m30072k(), this.f55254a.m30058H(), this.f55254a.m30064N()).mo20972a(this.f55255b);
            if (isCanceled()) {
                ggj.m28626f(zqeVarMo20972a);
                throw new IOException("Canceled");
            }
            m57595w(null);
            return zqeVarMo20972a;
        } catch (IOException e) {
            try {
                IOException iOExceptionM57595w = m57595w(e);
                sq8.m48647f(iOExceptionM57595w, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM57595w;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    m57595w(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
            }
            throw th;
        }
    }

    @Override // p001o.bt1
    public nmh timeout() {
        return this.f55259f;
    }

    /* renamed from: u */
    public final dl6 m57593u(cde cdeVar) throws IOException {
        sq8.m48649h(cdeVar, "chain");
        synchronized (this) {
            if (!this.f55250M) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f55249L)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f55248H)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            y3i y3iVar = y3i.f54824a;
        }
        fl6 fl6Var = this.f55262q;
        sq8.m48646e(fl6Var);
        dl6 dl6Var = new dl6(this, this.f55258e, fl6Var, fl6Var.mo27015a().m59205s(this.f55254a, cdeVar));
        this.f55265y = dl6Var;
        this.f55252X = dl6Var;
        synchronized (this) {
            this.f55248H = true;
            this.f55249L = true;
        }
        if (this.f55251Q) {
            throw new IOException("Canceled");
        }
        return dl6Var;
    }

    /* renamed from: v */
    public final IOException m57594v(dl6 dl6Var, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        sq8.m48649h(dl6Var, "exchange");
        if (!sq8.m48644c(dl6Var, this.f55252X)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.f55248H) {
                        if (z2 || !this.f55249L) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.f55248H = false;
                    }
                    if (z2) {
                        this.f55249L = false;
                    }
                    boolean z5 = this.f55248H;
                    boolean z6 = (z5 || this.f55249L) ? false : true;
                    if (!z5 && !this.f55249L && !this.f55250M) {
                        z3 = true;
                    }
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            y3i y3iVar = y3i.f54824a;
        }
        if (z3) {
            this.f55252X = null;
            zce zceVar = this.f55263s;
            if (zceVar != null) {
                zceVar.m59201o();
            }
        }
        return z4 ? m57580f(iOException) : iOException;
    }

    @Override // p001o.bt1
    public void v1(z22 z22Var) {
        sq8.m48649h(z22Var, "responseCallback");
        if (!this.f55260g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        m57581g();
        this.f55254a.m30076o().m23821a(new RunnableC18377a(this, z22Var));
    }

    /* renamed from: w */
    public final IOException m57595w(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f55250M) {
                this.f55250M = false;
                if (!this.f55248H && !this.f55249L) {
                    z = true;
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
        return z ? m57580f(iOException) : iOException;
    }

    /* renamed from: x */
    public final String m57596x() {
        return this.f55255b.m51741l().m53884p();
    }

    /* renamed from: y */
    public final Socket m57597y() {
        zce zceVar = this.f55263s;
        sq8.m48646e(zceVar);
        if (jgj.f30421e && !Thread.holdsLock(zceVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + zceVar);
        }
        List listM59195i = zceVar.m59195i();
        Iterator it = listM59195i.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (sq8.m48644c(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listM59195i.remove(i);
        this.f55263s = null;
        if (listM59195i.isEmpty()) {
            zceVar.m59210x(System.nanoTime());
            if (this.f55257d.m16921c(zceVar)) {
                return zceVar.mo56684d();
            }
        }
        return null;
    }

    /* renamed from: z */
    public final boolean m57598z() {
        dl6 dl6Var = this.f55252X;
        if (dl6Var != null && dl6Var.m23396k()) {
            fl6 fl6Var = this.f55262q;
            sq8.m48646e(fl6Var);
            fve fveVarMo27016b = fl6Var.mo27016b();
            dl6 dl6Var2 = this.f55252X;
            if (fveVarMo27016b.mo24818c(dl6Var2 != null ? dl6Var2.m23393h() : null)) {
                return true;
            }
        }
        return false;
    }
}
