package p001o;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public abstract class rw6 implements Closeable {

    /* renamed from: a */
    public final boolean f44142a;

    /* renamed from: b */
    public boolean f44143b;

    /* renamed from: c */
    public int f44144c;

    /* renamed from: d */
    public final ReentrantLock f44145d = xfj.m56227b();

    /* renamed from: o.rw6$a */
    public static final class C16674a implements lzf {

        /* renamed from: a */
        public final rw6 f44146a;

        /* renamed from: b */
        public long f44147b;

        /* renamed from: c */
        public boolean f44148c;

        public C16674a(rw6 rw6Var, long j) {
            sq8.m48649h(rw6Var, "fileHandle");
            this.f44146a = rw6Var;
            this.f44147b = j;
        }

        @Override // p001o.lzf
        public long N0(rl1 rl1Var, long j) {
            sq8.m48649h(rl1Var, "sink");
            if (!(!this.f44148c)) {
                throw new IllegalStateException("closed".toString());
            }
            long jM47205r = this.f44146a.m47205r(this.f44147b, rl1Var, j);
            if (jM47205r != -1) {
                this.f44147b += jM47205r;
            }
            return jM47205r;
        }

        @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f44148c) {
                return;
            }
            this.f44148c = true;
            ReentrantLock reentrantLockM47204g = this.f44146a.m47204g();
            reentrantLockM47204g.lock();
            try {
                rw6 rw6Var = this.f44146a;
                rw6Var.f44144c--;
                if (this.f44146a.f44144c == 0 && this.f44146a.f44143b) {
                    y3i y3iVar = y3i.f54824a;
                    reentrantLockM47204g.unlock();
                    this.f44146a.mo31817h();
                }
            } finally {
                reentrantLockM47204g.unlock();
            }
        }

        @Override // p001o.lzf
        public nmh timeout() {
            return nmh.f37049e;
        }
    }

    public rw6(boolean z) {
        this.f44142a = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f44145d;
        reentrantLock.lock();
        try {
            if (this.f44143b) {
                return;
            }
            this.f44143b = true;
            if (this.f44144c != 0) {
                return;
            }
            y3i y3iVar = y3i.f54824a;
            reentrantLock.unlock();
            mo31817h();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final ReentrantLock m47204g() {
        return this.f44145d;
    }

    /* renamed from: h */
    public abstract void mo31817h();

    /* renamed from: k */
    public abstract int mo31818k(long j, byte[] bArr, int i, int i2);

    /* renamed from: o */
    public abstract long mo31819o();

    /* renamed from: r */
    public final long m47205r(long j, rl1 rl1Var, long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = j + j2;
        long j4 = j;
        while (true) {
            if (j4 >= j3) {
                break;
            }
            hbf hbfVarR0 = rl1Var.r0(1);
            int iMo31818k = mo31818k(j4, hbfVarR0.f26587a, hbfVarR0.f26589c, (int) Math.min(j3 - j4, 8192 - r9));
            if (iMo31818k == -1) {
                if (hbfVarR0.f26588b == hbfVarR0.f26589c) {
                    rl1Var.f43757a = hbfVarR0.m30154b();
                    lbf.m36864b(hbfVarR0);
                }
                if (j == j4) {
                    return -1L;
                }
            } else {
                hbfVarR0.f26589c += iMo31818k;
                long j5 = iMo31818k;
                j4 += j5;
                rl1Var.m46911Y(rl1Var.f0() + j5);
            }
        }
        return j4 - j;
    }

    /* renamed from: s */
    public final long m47206s() {
        ReentrantLock reentrantLock = this.f44145d;
        reentrantLock.lock();
        try {
            if (!(!this.f44143b)) {
                throw new IllegalStateException("closed".toString());
            }
            y3i y3iVar = y3i.f54824a;
            reentrantLock.unlock();
            return mo31819o();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: t */
    public final lzf m47207t(long j) {
        ReentrantLock reentrantLock = this.f44145d;
        reentrantLock.lock();
        try {
            if (!(!this.f44143b)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f44144c++;
            reentrantLock.unlock();
            return new C16674a(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
