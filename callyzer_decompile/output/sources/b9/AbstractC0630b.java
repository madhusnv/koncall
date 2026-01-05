package b9;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.hardware.camera2.CameraManager;
import android.media.ImageWriter;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
import pg.l8;
import pg.w6;
import t8.C7077w;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b9.b */
/* loaded from: classes.dex */
public abstract class AbstractC0630b {

    /* renamed from: a */
    public static boolean f4100a = true;

    /* renamed from: a */
    public static ContentCaptureSession m1792a(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: b */
    public static String m1793b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static void m1794c(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (w6.m11907a(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z6 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT < 29) {
            l8.m11765f(null);
            return;
        }
        C8656m c8656m = new C8656m();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                SharedPreferences.Editor editorEdit = w6.m11907a(context).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z6) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                context.getPackageName();
            }
            c8656m.m15990q(null);
        } catch (Throwable th2) {
            c8656m.m15990q(null);
            throw th2;
        }
    }

    /* renamed from: d */
    public static boolean m1795d(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            context.getPackageName();
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        Log.isLoggable("FirebaseMessaging", 3);
        return true;
    }

    /* renamed from: e */
    public static ImageWriter m1796e(Surface surface) {
        return ImageWriter.newInstance(surface, 2, 35);
    }

    /* renamed from: f */
    public static Insets m1797f(int i10, int i11, int i12, int i13) {
        return Insets.of(i10, i11, i12, i13);
    }

    /* renamed from: g */
    public static void m1798g(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }

    /* renamed from: h */
    public static void m1799h(Notification.Builder builder, boolean z6) {
        builder.setAllowSystemGeneratedContextualActions(z6);
    }

    /* renamed from: i */
    public static void m1800i(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    /* renamed from: j */
    public static void m1801j(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    /* renamed from: k */
    public static void m1802k(Service service, int i10, Notification notification) {
        service.startForeground(i10, notification, 0);
    }

    /* renamed from: l */
    public static void m1803l(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        systemForegroundService.startForeground(i10, notification, i11);
    }

    /* renamed from: m */
    public static void m1804m(Service service, int i10, Notification notification) {
        service.startForeground(i10, notification, 1073741824);
    }

    /* renamed from: n */
    public static void m1805n(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        try {
            systemForegroundService.startForeground(i10, notification, i11);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            C7077w c7077wM13371a = C7077w.m13371a();
            int i12 = SystemForegroundService.f2890e;
            c7077wM13371a.getClass();
        } catch (SecurityException unused2) {
            C7077w c7077wM13371a2 = C7077w.m13371a();
            int i13 = SystemForegroundService.f2890e;
            c7077wM13371a2.getClass();
        }
    }

    /* renamed from: o */
    public static void m1806o(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z6);
        } else if (f4100a) {
            try {
                viewGroup.suppressLayout(z6);
            } catch (NoSuchMethodError unused) {
                f4100a = false;
            }
        }
    }
}
