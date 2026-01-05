package p001o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class dsb {
    /* renamed from: a */
    public static Intent m23763a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM23765c = m23765c(activity);
        if (strM23765c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM23765c);
        try {
            return m23766d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(strM23765c);
            sb.append("' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m23764b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM23766d = m23766d(context, componentName);
        if (strM23766d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM23766d);
        return m23766d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m23765c(Activity activity) {
        try {
            return m23766d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m23766d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m23767e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* renamed from: f */
    public static boolean m23768f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
