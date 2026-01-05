package wj;

import ag.ThreadFactoryC0141a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p020v.RunnableC7606p;
import p020v.b0;
import yf.C8643a;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements ServiceConnection {

    /* renamed from: a */
    public final Context f38684a;

    /* renamed from: b */
    public final Intent f38685b;

    /* renamed from: c */
    public final ScheduledThreadPoolExecutor f38686c;

    /* renamed from: d */
    public final ArrayDeque f38687d;

    /* renamed from: e */
    public BinderC8099y f38688e;

    /* renamed from: f */
    public boolean f38689f;

    public a0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0141a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f38687d = new ArrayDeque();
        this.f38689f = false;
        Context applicationContext = context.getApplicationContext();
        this.f38684a = applicationContext;
        this.f38685b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f38686c = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public final synchronized void m15215a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.f38687d.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                BinderC8099y binderC8099y = this.f38688e;
                if (binderC8099y == null || !binderC8099y.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.f38689f) {
                        this.f38689f = true;
                        if (!C8643a.m15964b().m15965a(this.f38684a, this.f38685b, this, 65)) {
                            this.f38689f = false;
                            ArrayDeque arrayDeque = this.f38687d;
                            while (!arrayDeque.isEmpty()) {
                                ((C8100z) arrayDeque.poll()).f38767b.m15971d(null);
                            }
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.f38688e.m15284a((C8100z) this.f38687d.poll());
            }
        } finally {
        }
    }

    /* renamed from: b */
    public final synchronized C8656m m15216b(Intent intent) {
        C8100z c8100z;
        Log.isLoggable("FirebaseMessaging", 3);
        c8100z = new C8100z(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f38686c;
        c8100z.f38767b.f41930a.m15975b(scheduledThreadPoolExecutor, new b0(8, scheduledThreadPoolExecutor.schedule(new RunnableC7606p(9, c8100z), 20L, TimeUnit.SECONDS)));
        this.f38687d.add(c8100z);
        m15215a();
        return c8100z.f38767b.f41930a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f38689f = false;
            if (iBinder instanceof BinderC8099y) {
                this.f38688e = (BinderC8099y) iBinder;
                m15215a();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.f38687d;
                while (!arrayDeque.isEmpty()) {
                    ((C8100z) arrayDeque.poll()).f38767b.m15971d(null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        m15215a();
    }
}
