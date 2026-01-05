package b00;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.o */
/* loaded from: classes3.dex */
public final class C0530o implements i0 {

    /* renamed from: a */
    public final C0538w f3651a;

    /* renamed from: b */
    public long f3652b;

    /* renamed from: c */
    public boolean f3653c;

    public C0530o(C0538w c0538w, long j6) {
        this.f3651a = c0538w;
        this.f3652b = j6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0538w c0538w = this.f3651a;
        if (this.f3653c) {
            return;
        }
        this.f3653c = true;
        ReentrantLock reentrantLock = c0538w.f3678c;
        reentrantLock.lock();
        try {
            int i10 = c0538w.f3677b - 1;
            c0538w.f3677b = i10;
            if (i10 == 0) {
                if (c0538w.f3676a) {
                    synchronized (c0538w) {
                        c0538w.f3679d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return k0.f3639d;
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) {
        long j10;
        long j11;
        int i10;
        AbstractC4154l.m8923f(sink, "sink");
        if (this.f3653c) {
            throw new IllegalStateException("closed");
        }
        C0538w c0538w = this.f3651a;
        long j12 = this.f3652b;
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        long j13 = j6 + j12;
        long j14 = j12;
        while (true) {
            if (j14 >= j13) {
                j10 = -1;
                break;
            }
            e0 e0VarW0 = sink.w0(1);
            byte[] array = e0VarW0.f3607a;
            int i11 = e0VarW0.f3609c;
            j10 = -1;
            int iMin = (int) Math.min(j13 - j14, 8192 - i11);
            synchronized (c0538w) {
                AbstractC4154l.m8923f(array, "array");
                c0538w.f3679d.seek(j14);
                i10 = 0;
                while (true) {
                    if (i10 >= iMin) {
                        break;
                    }
                    int i12 = c0538w.f3679d.read(array, i11, iMin - i10);
                    if (i12 != -1) {
                        i10 += i12;
                    } else if (i10 == 0) {
                        i10 = -1;
                    }
                }
            }
            if (i10 == -1) {
                if (e0VarW0.f3608b == e0VarW0.f3609c) {
                    sink.f3637a = e0VarW0.m1552a();
                    f0.m1559a(e0VarW0);
                }
                if (j12 == j14) {
                    j11 = -1;
                }
            } else {
                e0VarW0.f3609c += i10;
                long j15 = i10;
                j14 += j15;
                sink.f3638b += j15;
            }
        }
        j11 = j14 - j12;
        if (j11 != j10) {
            this.f3652b += j11;
        }
        return j11;
    }
}
