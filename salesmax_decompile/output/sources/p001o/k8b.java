package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class k8b {

    /* renamed from: a */
    public final Handler f31629a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Runnable f31630b;

    /* renamed from: c */
    public long f31631c;

    /* renamed from: d */
    public long f31632d;

    /* renamed from: e */
    public boolean f31633e;

    public k8b(Runnable runnable) {
        this.f31630b = runnable;
    }

    /* renamed from: a */
    public boolean m35167a() {
        if (this.f31633e) {
            long j = this.f31631c;
            if (j > 0) {
                this.f31629a.postDelayed(this.f31630b, j);
            }
        }
        return this.f31633e;
    }

    /* renamed from: b */
    public void m35168b(boolean z, long j) {
        if (z) {
            long j2 = this.f31632d;
            if (j2 - j >= 30000) {
                return;
            }
            this.f31631c = Math.max(this.f31631c, (j + 30000) - j2);
            this.f31633e = true;
        }
    }

    /* renamed from: c */
    public void m35169c() {
        this.f31631c = 0L;
        this.f31633e = false;
        this.f31632d = SystemClock.elapsedRealtime();
        this.f31629a.removeCallbacks(this.f31630b);
    }
}
