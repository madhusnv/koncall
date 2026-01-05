package p001o;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import p001o.bt1;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;

/* loaded from: classes6.dex */
public final class fac implements Call {

    /* renamed from: a */
    public final dme f23041a;

    /* renamed from: b */
    public final Object[] f23042b;

    /* renamed from: c */
    public final bt1.InterfaceC12488a f23043c;

    /* renamed from: d */
    public final Converter f23044d;

    /* renamed from: e */
    public volatile boolean f23045e;

    /* renamed from: f */
    public bt1 f23046f;

    /* renamed from: g */
    public Throwable f23047g;

    /* renamed from: h */
    public boolean f23048h;

    /* renamed from: o.fac$a */
    public class C13376a implements z22 {

        /* renamed from: a */
        public final /* synthetic */ Callback f23049a;

        public C13376a(Callback callback) {
            this.f23049a = callback;
        }

        /* renamed from: a */
        public final void m26347a(Throwable th) {
            try {
                this.f23049a.onFailure(fac.this, th);
            } catch (Throwable th2) {
                lri.m37850s(th2);
                th2.printStackTrace();
            }
        }

        @Override // p001o.z22
        public void onFailure(bt1 bt1Var, IOException iOException) {
            m26347a(iOException);
        }

        @Override // p001o.z22
        public void onResponse(bt1 bt1Var, zqe zqeVar) {
            try {
                try {
                    this.f23049a.onResponse(fac.this, fac.this.m26346f(zqeVar));
                } catch (Throwable th) {
                    lri.m37850s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                lri.m37850s(th2);
                m26347a(th2);
            }
        }
    }

    /* renamed from: o.fac$b */
    public static final class C13377b extends cre {

        /* renamed from: c */
        public final cre f23051c;

        /* renamed from: d */
        public final im1 f23052d;

        /* renamed from: e */
        public IOException f23053e;

        /* renamed from: o.fac$b$a */
        public class a extends tf7 {
            public a(lzf lzfVar) {
                super(lzfVar);
            }

            @Override // p001o.tf7, p001o.lzf
            public long N0(rl1 rl1Var, long j) throws IOException {
                try {
                    return super.N0(rl1Var, j);
                } catch (IOException e) {
                    C13377b.this.f23053e = e;
                    throw e;
                }
            }
        }

        public C13377b(cre creVar) {
            this.f23051c = creVar;
            this.f23052d = uac.m51310c(new a(creVar.mo21619o()));
        }

        @Override // p001o.cre, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f23051c.close();
        }

        @Override // p001o.cre
        /* renamed from: g */
        public long mo21617g() {
            return this.f23051c.mo21617g();
        }

        @Override // p001o.cre
        /* renamed from: h */
        public y9b mo21618h() {
            return this.f23051c.mo21618h();
        }

        @Override // p001o.cre
        /* renamed from: o */
        public im1 mo21619o() {
            return this.f23052d;
        }

        /* renamed from: s */
        public void m26348s() throws IOException {
            IOException iOException = this.f23053e;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: o.fac$c */
    public static final class C13378c extends cre {

        /* renamed from: c */
        public final y9b f23055c;

        /* renamed from: d */
        public final long f23056d;

        public C13378c(y9b y9bVar, long j) {
            this.f23055c = y9bVar;
            this.f23056d = j;
        }

        @Override // p001o.cre
        /* renamed from: g */
        public long mo21617g() {
            return this.f23056d;
        }

        @Override // p001o.cre
        /* renamed from: h */
        public y9b mo21618h() {
            return this.f23055c;
        }

        @Override // p001o.cre
        /* renamed from: o */
        public im1 mo21619o() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public fac(dme dmeVar, Object[] objArr, bt1.InterfaceC12488a interfaceC12488a, Converter converter) {
        this.f23041a = dmeVar;
        this.f23042b = objArr;
        this.f23043c = interfaceC12488a;
        this.f23044d = converter;
    }

    @Override // retrofit2.Call
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fac clone() {
        return new fac(this.f23041a, this.f23042b, this.f23043c, this.f23044d);
    }

    /* renamed from: b */
    public final bt1 m26344b() {
        bt1 bt1VarMo19702a = this.f23043c.mo19702a(this.f23041a.m23558a(this.f23042b));
        if (bt1VarMo19702a != null) {
            return bt1VarMo19702a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: c */
    public final bt1 m26345c() throws IOException {
        bt1 bt1Var = this.f23046f;
        if (bt1Var != null) {
            return bt1Var;
        }
        Throwable th = this.f23047g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            bt1 bt1VarM26344b = m26344b();
            this.f23046f = bt1VarM26344b;
            return bt1VarM26344b;
        } catch (IOException | Error | RuntimeException e) {
            lri.m37850s(e);
            this.f23047g = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        bt1 bt1Var;
        this.f23045e = true;
        synchronized (this) {
            bt1Var = this.f23046f;
        }
        if (bt1Var != null) {
            bt1Var.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(Callback callback) {
        bt1 bt1Var;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            if (this.f23048h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f23048h = true;
            bt1Var = this.f23046f;
            th = this.f23047g;
            if (bt1Var == null && th == null) {
                try {
                    bt1 bt1VarM26344b = m26344b();
                    this.f23046f = bt1VarM26344b;
                    bt1Var = bt1VarM26344b;
                } catch (Throwable th2) {
                    th = th2;
                    lri.m37850s(th);
                    this.f23047g = th;
                }
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.f23045e) {
            bt1Var.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(bt1Var, new C13376a(callback));
    }

    @Override // retrofit2.Call
    public bre execute() {
        bt1 bt1VarM26345c;
        synchronized (this) {
            if (this.f23048h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f23048h = true;
            bt1VarM26345c = m26345c();
        }
        if (this.f23045e) {
            bt1VarM26345c.cancel();
        }
        return m26346f(FirebasePerfOkHttpClient.execute(bt1VarM26345c));
    }

    /* renamed from: f */
    public bre m26346f(zqe zqeVar) throws IOException {
        cre creVarM59735c = zqeVar.m59735c();
        zqe zqeVarM59750c = zqeVar.m59728H().m59749b(new C13378c(creVarM59735c.mo21618h(), creVarM59735c.mo21617g())).m59750c();
        int iM59739h = zqeVarM59750c.m59739h();
        if (iM59739h < 200 || iM59739h >= 300) {
            try {
                return bre.m19661c(lri.m37832a(creVarM59735c), zqeVarM59750c);
            } finally {
                creVarM59735c.close();
            }
        }
        if (iM59739h == 204 || iM59739h == 205) {
            creVarM59735c.close();
            return bre.m19662f(null, zqeVarM59750c);
        }
        C13377b c13377b = new C13377b(creVarM59735c);
        try {
            return bre.m19662f(this.f23044d.convert(c13377b), zqeVarM59750c);
        } catch (RuntimeException e) {
            c13377b.m26348s();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.f23045e) {
            return true;
        }
        synchronized (this) {
            bt1 bt1Var = this.f23046f;
            if (bt1Var == null || !bt1Var.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.f23048h;
    }

    @Override // retrofit2.Call
    public synchronized ule request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m26345c().request();
    }

    @Override // retrofit2.Call
    public synchronized nmh timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return m26345c().timeout();
    }
}
