package ug;

import ag.ThreadFactoryC0141a;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l0.RunnableC4307g;
import rf.C6514s;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35260a = 1;

    /* renamed from: b */
    public final long f35261b;

    /* renamed from: c */
    public final Object f35262c;

    /* renamed from: d */
    public final Object f35263d;

    public a3(b3 b3Var, x2 x2Var, long j6) {
        this.f35262c = x2Var;
        this.f35261b = j6;
        Objects.requireNonNull(b3Var);
        this.f35263d = b3Var;
    }

    /* renamed from: a */
    public boolean m13829a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f35263d).f7162b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    public boolean m13830b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f35263d).m4480a() == null) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e2.getMessage();
                return false;
            }
            if (e2.getMessage() == null) {
                return false;
            }
            throw e2;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35260a) {
            case 0:
                b3 b3Var = (b3) this.f35263d;
                b3Var.m13840Q((x2) this.f35262c, false, this.f35261b);
                b3Var.f35291e = null;
                k3 k3VarM14093p = ((n1) b3Var.f482a).m14093p();
                k3VarM14093p.mo325M();
                k3VarM14093p.m13936N();
                k3VarM14093p.a0(new RunnableC4307g(k3VarM14093p, null));
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f35262c;
                C8090p c8090pM15225t = C8090p.m15225t();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f35263d;
                if (c8090pM15225t.m15235L(firebaseMessaging.f7162b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f7169i = true;
                        }
                        if (!firebaseMessaging.f7168h.m12864d()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f7169i = false;
                            }
                            if (!C8090p.m15225t().m15235L(firebaseMessaging.f7162b)) {
                                return;
                            }
                        } else if (!C8090p.m15225t().m15234K(firebaseMessaging.f7162b) || m13829a()) {
                            if (m13830b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f7169i = false;
                                }
                            } else {
                                firebaseMessaging.m4484g(this.f35261b);
                            }
                            if (!C8090p.m15225t().m15235L(firebaseMessaging.f7162b)) {
                                return;
                            }
                        } else {
                            C6514s c6514s = new C6514s();
                            c6514s.f31273c = this;
                            c6514s.m12544a();
                            if (!C8090p.m15225t().m15235L(firebaseMessaging.f7162b)) {
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        e2.getMessage();
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f7169i = false;
                            if (!C8090p.m15225t().m15235L(firebaseMessaging.f7162b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (C8090p.m15225t().m15235L(firebaseMessaging.f7162b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
        }
    }

    public a3(FirebaseMessaging firebaseMessaging, long j6) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0141a("firebase-iid-executor"));
        this.f35263d = firebaseMessaging;
        this.f35261b = j6;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f7162b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f35262c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
