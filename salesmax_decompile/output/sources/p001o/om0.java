package p001o;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class om0 {

    /* renamed from: o.om0$a */
    public static class C15836a {
        /* renamed from: a */
        public static <T> T m42400a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        public static int m42401b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        public static int m42402c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        public static String m42403d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: o.om0$b */
    public static class C15837b {
        /* renamed from: a */
        public static int m42404a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        public static String m42405b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        public static AppOpsManager m42406c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m42397a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m42398b(context, str, str2);
        }
        AppOpsManager appOpsManagerM42406c = C15837b.m42406c(context);
        int iM42404a = C15837b.m42404a(appOpsManagerM42406c, str, Binder.getCallingUid(), str2);
        return iM42404a != 0 ? iM42404a : C15837b.m42404a(appOpsManagerM42406c, str, i, C15837b.m42405b(context));
    }

    /* renamed from: b */
    public static int m42398b(Context context, String str, String str2) {
        return C15836a.m42402c((AppOpsManager) C15836a.m42400a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m42399c(String str) {
        return C15836a.m42403d(str);
    }
}
