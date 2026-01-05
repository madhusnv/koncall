package ny;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import net.schmizz.sshj.common.C5033m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ny.c */
/* loaded from: classes3.dex */
public final class C5189c {

    /* renamed from: a */
    public final InterfaceC2173b f25290a;

    /* renamed from: b */
    public final String f25291b;

    /* renamed from: c */
    public final InterfaceC5188b f25292c;

    /* renamed from: d */
    public final ReentrantLock f25293d;

    /* renamed from: e */
    public final Condition f25294e;

    /* renamed from: f */
    public Object f25295f;

    /* renamed from: g */
    public Throwable f25296g;

    public C5189c(String str, InterfaceC5188b interfaceC5188b, ReentrantLock reentrantLock, C5033m c5033m) {
        this.f25291b = str;
        this.f25292c = interfaceC5188b;
        reentrantLock = reentrantLock == null ? new ReentrantLock() : reentrantLock;
        this.f25293d = reentrantLock;
        c5033m.getClass();
        this.f25290a = AbstractC2175d.m5852b(C5189c.class);
        this.f25294e = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public final void m10146a() {
        ReentrantLock reentrantLock = this.f25293d;
        reentrantLock.lock();
        try {
            this.f25296g = null;
            this.f25290a.mo5849y(this.f25291b, "Clearing <<{}>>");
            this.f25295f = null;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final void m10147b(Object obj) {
        ReentrantLock reentrantLock = this.f25293d;
        reentrantLock.lock();
        try {
            this.f25290a.mo5828d("Setting <<{}>> to `{}`", this.f25291b, obj);
            this.f25295f = obj;
            this.f25294e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final void m10148c(IOException iOException) {
        ReentrantLock reentrantLock = this.f25293d;
        reentrantLock.lock();
        try {
            this.f25296g = this.f25292c.mo394c(iOException);
            this.f25294e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final Object m10149d(long j6) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC5188b interfaceC5188b = this.f25292c;
        String str = this.f25291b;
        InterfaceC2173b interfaceC2173b = this.f25290a;
        ReentrantLock reentrantLock = this.f25293d;
        reentrantLock.lock();
        try {
            try {
                Throwable th2 = this.f25296g;
                if (th2 != null) {
                    throw th2;
                }
                Object obj = this.f25295f;
                if (obj != null) {
                    reentrantLock.unlock();
                } else {
                    interfaceC2173b.mo5849y(str, "Awaiting <<{}>>");
                    Condition condition = this.f25294e;
                    if (j6 == 0) {
                        while (this.f25295f == null && this.f25296g == null) {
                            condition.await();
                        }
                    } else if (!condition.await(j6, timeUnit)) {
                        reentrantLock.unlock();
                        obj = null;
                    }
                    Throwable th3 = this.f25296g;
                    if (th3 != null) {
                        interfaceC2173b.mo5837m("<<{}>> woke to: {}", str, th3.toString());
                        throw this.f25296g;
                    }
                    obj = this.f25295f;
                    reentrantLock.unlock();
                }
                if (obj != null) {
                    return obj;
                }
                throw interfaceC5188b.mo394c(new TimeoutException("Timeout expired: " + j6 + " " + timeUnit));
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw interfaceC5188b.mo394c(e2);
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    public final String toString() {
        return this.f25291b;
    }
}
