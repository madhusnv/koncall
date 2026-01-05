package pg;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ga implements Closeable {

    /* renamed from: f */
    public static final HashMap f28907f = new HashMap();

    /* renamed from: a */
    public int f28908a;

    /* renamed from: b */
    public long f28909b;

    /* renamed from: c */
    public long f28910c;

    /* renamed from: d */
    public long f28911d = 2147483647L;

    /* renamed from: e */
    public long f28912e = -2147483648L;

    public ga(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j6 = this.f28909b;
        if (j6 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        mo11638n(j6);
    }

    /* renamed from: h */
    public void mo11636h() {
        this.f28909b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    /* renamed from: j */
    public void mo11637j(long j6) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f28910c;
        if (j10 != 0 && jElapsedRealtimeNanos - j10 >= 1000000) {
            this.f28908a = 0;
            this.f28909b = 0L;
            this.f28911d = 2147483647L;
            this.f28912e = -2147483648L;
        }
        this.f28910c = jElapsedRealtimeNanos;
        this.f28908a++;
        this.f28911d = Math.min(this.f28911d, j6);
        this.f28912e = Math.max(this.f28912e, j6);
        if (this.f28908a % 50 == 0) {
            Locale locale = Locale.US;
            oa.m11812b();
        }
        if (this.f28908a % 500 == 0) {
            this.f28908a = 0;
            this.f28909b = 0L;
            this.f28911d = 2147483647L;
            this.f28912e = -2147483648L;
        }
    }

    /* renamed from: n */
    public void mo11638n(long j6) {
        mo11637j((SystemClock.elapsedRealtimeNanos() / 1000) - j6);
    }
}
