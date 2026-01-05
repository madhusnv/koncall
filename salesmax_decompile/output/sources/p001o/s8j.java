package p001o;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes2.dex */
public final class s8j {

    /* renamed from: a */
    public final Context f44996a;

    /* renamed from: b */
    public WifiManager.WifiLock f44997b;

    /* renamed from: c */
    public boolean f44998c;

    /* renamed from: d */
    public boolean f44999d;

    public s8j(Context context) {
        this.f44996a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m48025a(boolean z) {
        if (z && this.f44997b == null) {
            WifiManager wifiManager = (WifiManager) this.f44996a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                ria.m46824h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f44997b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f44998c = z;
        m48027c();
    }

    /* renamed from: b */
    public void m48026b(boolean z) {
        this.f44999d = z;
        m48027c();
    }

    /* renamed from: c */
    public final void m48027c() {
        WifiManager.WifiLock wifiLock = this.f44997b;
        if (wifiLock == null) {
            return;
        }
        if (this.f44998c && this.f44999d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
