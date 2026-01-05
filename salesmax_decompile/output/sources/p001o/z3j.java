package p001o;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes2.dex */
public final class z3j {

    /* renamed from: a */
    public final Context f56472a;

    /* renamed from: b */
    public PowerManager.WakeLock f56473b;

    /* renamed from: c */
    public boolean f56474c;

    /* renamed from: d */
    public boolean f56475d;

    public z3j(Context context) {
        this.f56472a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m58679a(boolean z) {
        if (z && this.f56473b == null) {
            PowerManager powerManager = (PowerManager) this.f56472a.getSystemService("power");
            if (powerManager == null) {
                ria.m46824h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f56473b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f56474c = z;
        m58681c();
    }

    /* renamed from: b */
    public void m58680b(boolean z) {
        this.f56475d = z;
        m58681c();
    }

    /* renamed from: c */
    public final void m58681c() {
        PowerManager.WakeLock wakeLock = this.f56473b;
        if (wakeLock == null) {
            return;
        }
        if (this.f56474c && this.f56475d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
