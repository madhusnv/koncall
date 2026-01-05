package tj;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import rj.C6563i;
import ug.C7455z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tj.e */
/* loaded from: classes.dex */
public final class C7169e {

    /* renamed from: d */
    public static final long f34428d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f34429e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C6563i f34430a;

    /* renamed from: b */
    public long f34431b;

    /* renamed from: c */
    public int f34432c;

    public C7169e() {
        if (C7455z.f35978w == null) {
            Pattern pattern = C6563i.f31420c;
            C7455z.f35978w = new C7455z(18);
        }
        C7455z c7455z = C7455z.f35978w;
        if (C6563i.f31421d == null) {
            C6563i.f31421d = new C6563i(c7455z);
        }
        this.f34430a = C6563i.f31421d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m13435a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f34432c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            rj.i r0 = r4.f34430a     // Catch: java.lang.Throwable -> L19
            ug.z r0 = r0.f31422a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f34431b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.C7169e.m13435a():boolean");
    }

    /* renamed from: b */
    public final synchronized void m13436b(int i10) {
        long jMin;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f34432c = 0;
            }
            return;
        }
        this.f34432c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                double dPow = Math.pow(2.0d, this.f34432c);
                this.f34430a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f34429e);
            } else {
                jMin = f34428d;
            }
            this.f34430a.f31422a.getClass();
            this.f34431b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
