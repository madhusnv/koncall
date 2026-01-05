package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001o.g32;

/* loaded from: classes2.dex */
public class rm7 implements zfa {

    /* renamed from: a */
    public final zfa f43798a;

    /* renamed from: b */
    public g32.C13614a f43799b;

    /* renamed from: o.rm7$a */
    public class C16624a implements g32.InterfaceC13616c {
        public C16624a() {
        }

        @Override // p001o.g32.InterfaceC13616c
        public Object attachCompleter(g32.C13614a c13614a) {
            fgd.m26666j(rm7.this.f43799b == null, "The result can only set once!");
            rm7.this.f43799b = c13614a;
            return "FutureChain[" + rm7.this + "]";
        }
    }

    public rm7(zfa zfaVar) {
        this.f43798a = (zfa) fgd.m26663g(zfaVar);
    }

    /* renamed from: a */
    public static rm7 m46957a(zfa zfaVar) {
        return zfaVar instanceof rm7 ? (rm7) zfaVar : new rm7(zfaVar);
    }

    @Override // p001o.zfa
    public void addListener(Runnable runnable, Executor executor) {
        this.f43798a.addListener(runnable, executor);
    }

    /* renamed from: b */
    boolean m46958b(Object obj) {
        g32.C13614a c13614a = this.f43799b;
        if (c13614a != null) {
            return c13614a.m28005c(obj);
        }
        return false;
    }

    /* renamed from: c */
    boolean m46959c(Throwable th) {
        g32.C13614a c13614a = this.f43799b;
        if (c13614a != null) {
            return c13614a.m28008f(th);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f43798a.cancel(z);
    }

    /* renamed from: d */
    public final rm7 m46960d(zl7 zl7Var, Executor executor) {
        return (rm7) bn7.m19412G(this, zl7Var, executor);
    }

    /* renamed from: e */
    public final rm7 m46961e(wr0 wr0Var, Executor executor) {
        return (rm7) bn7.m19413H(this, wr0Var, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f43798a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f43798a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f43798a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.f43798a.get(j, timeUnit);
    }

    public rm7() {
        this.f43798a = g32.m28002a(new C16624a());
    }
}
