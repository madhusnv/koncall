package b00;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.w */
/* loaded from: classes3.dex */
public final class C0538w implements Closeable {

    /* renamed from: a */
    public boolean f3676a;

    /* renamed from: b */
    public int f3677b;

    /* renamed from: c */
    public final ReentrantLock f3678c = new ReentrantLock();

    /* renamed from: d */
    public final RandomAccessFile f3679d;

    public C0538w(RandomAccessFile randomAccessFile) {
        this.f3679d = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f3678c;
        reentrantLock.lock();
        try {
            if (this.f3676a) {
                return;
            }
            this.f3676a = true;
            if (this.f3677b != 0) {
                return;
            }
            synchronized (this) {
                this.f3679d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final C0530o m1626h(long j6) {
        ReentrantLock reentrantLock = this.f3678c;
        reentrantLock.lock();
        try {
            if (this.f3676a) {
                throw new IllegalStateException("closed");
            }
            this.f3677b++;
            reentrantLock.unlock();
            return new C0530o(this, j6);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f3678c;
        reentrantLock.lock();
        try {
            if (this.f3676a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f3679d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
