package ry;

import a2.AbstractC0030c;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.connection.ConnectionException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ry.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6690f {

    /* renamed from: a */
    public final InterfaceC2173b f31994a;

    /* renamed from: b */
    public final Object f31995b = new Object();

    /* renamed from: c */
    public final int f31996c;

    /* renamed from: d */
    public long f31997d;

    public AbstractC6690f(long j6, int i10, C5033m c5033m) {
        this.f31997d = j6;
        this.f31996c = i10;
        Class<?> cls = getClass();
        c5033m.getClass();
        this.f31994a = AbstractC2175d.m5852b(cls);
    }

    /* renamed from: a */
    public void mo12826a(long j6) {
        synchronized (this.f31995b) {
            try {
                this.f31997d -= j6;
                this.f31994a.mo5828d("Consuming by {} down to {}", Long.valueOf(j6), Long.valueOf(this.f31997d));
                if (this.f31997d < 0) {
                    throw new ConnectionException("Window consumed to below 0");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m12827b(long j6) {
        synchronized (this.f31995b) {
            this.f31997d += j6;
            this.f31994a.mo5828d("Increasing by {} up to {}", Long.valueOf(j6), Long.valueOf(this.f31997d));
            this.f31995b.notifyAll();
        }
    }

    public final String toString() {
        return AbstractC0030c.m116g(this.f31997d, "]", new StringBuilder("[winSize="));
    }
}
