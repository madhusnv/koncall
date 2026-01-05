package p001o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class nmh {

    /* renamed from: d */
    public static final C15614b f37048d = new C15614b(null);

    /* renamed from: e */
    public static final nmh f37049e = new C15613a();

    /* renamed from: a */
    public boolean f37050a;

    /* renamed from: b */
    public long f37051b;

    /* renamed from: c */
    public long f37052c;

    /* renamed from: o.nmh$a */
    public static final class C15613a extends nmh {
        @Override // p001o.nmh
        /* renamed from: d */
        public nmh mo40793d(long j) {
            return this;
        }

        @Override // p001o.nmh
        /* renamed from: f */
        public void mo40795f() {
        }

        @Override // p001o.nmh
        /* renamed from: g */
        public nmh mo40796g(long j, TimeUnit timeUnit) {
            sq8.m48649h(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: o.nmh$b */
    public static final class C15614b {
        public C15614b() {
        }

        public /* synthetic */ C15614b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: a */
    public nmh mo40790a() {
        this.f37050a = false;
        return this;
    }

    /* renamed from: b */
    public nmh mo40791b() {
        this.f37052c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo40792c() {
        if (this.f37050a) {
            return this.f37051b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public nmh mo40793d(long j) {
        this.f37050a = true;
        this.f37051b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo40794e() {
        return this.f37050a;
    }

    /* renamed from: f */
    public void mo40795f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f37050a && this.f37051b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public nmh mo40796g(long j, TimeUnit timeUnit) {
        sq8.m48649h(timeUnit, "unit");
        if (j >= 0) {
            this.f37052c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    /* renamed from: h */
    public long mo40797h() {
        return this.f37052c;
    }
}
