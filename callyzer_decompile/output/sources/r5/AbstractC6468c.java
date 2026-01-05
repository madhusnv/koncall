package r5;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import b9.AbstractC0630b;
import java.util.Objects;
import java.util.concurrent.Executor;
import q5.C6123p;
import rf.ExecutorC6509n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r5.c */
/* loaded from: classes.dex */
public abstract class AbstractC6468c {

    /* renamed from: a */
    public static final Object f31135a = null;

    /* renamed from: a */
    public static int m12450a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new C6123p(context).f29873a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* renamed from: b */
    public static int m12451b(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC0630b.m1793b(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: c */
    public static Executor m12452c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? AbstractC6467b.m12449a(context) : new ExecutorC6509n(new Handler(context.getMainLooper()), 1);
    }

    /* renamed from: d */
    public static void m12453d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            AbstractC6466a.m12447b(context, broadcastReceiver, intentFilter);
        } else if (i10 >= 26) {
            AbstractC6466a.m12446a(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
