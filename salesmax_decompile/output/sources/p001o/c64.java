package p001o;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class c64 {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* renamed from: o.c64$a */
    public static class C12572a {
        /* renamed from: a */
        public static File m20316a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m20317b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m20318c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: o.c64$b */
    public static class C12573b {
        /* renamed from: a */
        public static int m20319a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static <T> T m20320b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m20321c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: o.c64$c */
    public static class C12574c {
        /* renamed from: a */
        public static Context m20322a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m20323b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m20324c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: o.c64$d */
    public static class C12575d {
        /* renamed from: a */
        public static Intent m20325a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, c64.obtainAndCheckReceiverPermission(context), handler);
        }

        /* renamed from: b */
        public static ComponentName m20326b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: o.c64$e */
    public static class C12576e {
        /* renamed from: a */
        public static Executor m20327a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: o.c64$f */
    public static class C12577f {
        /* renamed from: a */
        public static Context m20328a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* renamed from: b */
        public static String m20329b(Context context) {
            return context.getAttributionTag();
        }

        /* renamed from: c */
        public static Display m20330c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("The context:");
                sb.append(context);
                sb.append(" is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* renamed from: o.c64$g */
    public static class C12578g {
        /* renamed from: a */
        public static Intent m20331a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        s6c.m47912d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : e3c.m24211d(context).m24214a() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? C12577f.m20328a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return C12574c.m20322a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C12577f.m20329b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return C12572a.m20316a(context);
    }

    public static int getColor(Context context, int i) {
        return C12573b.m20319a(context, i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return ppe.m44033d(context.getResources(), i, context.getTheme());
    }

    public static Context getContextForLanguage(Context context) {
        pha phaVarM49885a = tha.m49885a(context);
        if (Build.VERSION.SDK_INT > 32 || phaVarM49885a.m43686e()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        yq3.m58108b(configuration, phaVarM49885a);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return C12574c.m20323b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? C12577f.m20330c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i) {
        return C12572a.m20317b(context, i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? C12576e.m20327a(context) : ol6.m42377a(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return C12572a.m20318c(context);
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) C12573b.m20320b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return C12573b.m20321c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return C12574c.m20324c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (h3d.m29777b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C12575d.m20326b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 33 ? C12578g.m20331a(context, broadcastReceiver, intentFilter, str, handler, i3) : i5 >= 26 ? C12575d.m20325a(context, broadcastReceiver, intentFilter, str, handler, i3) : ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
