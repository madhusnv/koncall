package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class cig implements jb3 {
    @Override // p001o.jb3
    /* renamed from: a */
    public long mo21304a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p001o.jb3
    /* renamed from: b */
    public uw7 mo21305b(Looper looper, Handler.Callback callback) {
        return new gig(new Handler(looper, callback));
    }

    @Override // p001o.jb3
    /* renamed from: c */
    public void mo21306c() {
    }

    @Override // p001o.jb3
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // p001o.jb3
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p001o.jb3
    public long nanoTime() {
        return System.nanoTime();
    }
}
