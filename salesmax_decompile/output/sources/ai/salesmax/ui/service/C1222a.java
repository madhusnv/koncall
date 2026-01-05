package ai.salesmax.ui.service;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;

/* renamed from: ai.salesmax.ui.service.a */
/* loaded from: classes.dex */
public class C1222a {

    /* renamed from: a */
    public Intent f3600a;

    /* renamed from: b */
    public CallStateManagerService f3601b;

    /* renamed from: c */
    public boolean f3602c;

    /* renamed from: d */
    public boolean f3603d;

    /* renamed from: e */
    public boolean f3604e;

    /* renamed from: f */
    public ServiceConnection f3605f;

    /* renamed from: ai.salesmax.ui.service.a$a */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            throw null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1222a.this.f3604e = false;
        }
    }

    public C1222a() {
        this(true, false);
    }

    /* renamed from: b */
    public final boolean m2671b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        return activityManager.isBackgroundRestricted();
    }

    /* renamed from: c */
    public void m2672c(Context context) {
        Intent intent = this.f3600a;
        if (intent != null) {
            try {
                context.stopService(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public void m2673d(Context context) {
        if (context == null) {
            return;
        }
        m2674e(context);
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            context.startService(this.f3600a);
        } else if (i < 31) {
            context.startForegroundService(this.f3600a);
        } else {
            if (m2671b(context)) {
                return;
            }
            context.startForegroundService(this.f3600a);
        }
    }

    /* renamed from: e */
    public final void m2674e(Context context) {
        if (this.f3600a == null) {
            this.f3600a = new Intent(context, (Class<?>) CallStateManagerService.class);
        }
        if (this.f3603d) {
            this.f3600a.setAction("ai.salesmax.callstatemanager.NOTIFICATION_DISMISSED");
        }
    }

    public C1222a(boolean z, boolean z2) {
        this.f3600a = null;
        this.f3601b = null;
        this.f3602c = false;
        this.f3603d = false;
        this.f3604e = false;
        this.f3605f = new a();
        this.f3602c = z;
        this.f3603d = z2;
    }
}
