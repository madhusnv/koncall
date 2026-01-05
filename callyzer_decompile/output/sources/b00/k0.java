package b00;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class k0 {

    /* renamed from: d */
    public static final j0 f3639d = new j0();

    /* renamed from: a */
    public boolean f3640a;

    /* renamed from: b */
    public long f3641b;

    /* renamed from: c */
    public long f3642c;

    /* renamed from: a */
    public k0 mo1596a() {
        this.f3640a = false;
        return this;
    }

    /* renamed from: b */
    public k0 mo1597b() {
        this.f3642c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo1598c() {
        if (this.f3640a) {
            return this.f3641b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public k0 mo1583d(long j6) {
        this.f3640a = true;
        this.f3641b = j6;
        return this;
    }

    /* renamed from: e */
    public boolean mo1599e() {
        return this.f3640a;
    }

    /* renamed from: f */
    public void mo1584f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3640a && this.f3641b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public k0 mo1585g(long j6) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        AbstractC4154l.m8923f(unit, "unit");
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("timeout < 0: ", j6).toString());
        }
        this.f3642c = unit.toNanos(j6);
        return this;
    }
}
