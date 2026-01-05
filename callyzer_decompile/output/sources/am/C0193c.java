package am;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import og.pe;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: am.c */
/* loaded from: classes.dex */
public final class C0193c {

    /* renamed from: b */
    public static final C0192b f576b = new C0192b();

    /* renamed from: c */
    public static final C6366p f577c = nd.m10782c(C0191a.f575a);

    /* renamed from: a */
    public final List f578a = pe.m10834i("com.asus.mobilemanager", "com.miui.securitycenter", "com.letv.android.letvsafe", "com.huawei.systemmanager", "com.coloros.safecenter", "com.oppo.safe", "com.iqoo.secure", "com.vivo.permissionmanager", "com.evenwell.powersaving.g3", "com.huawei.systemmanager", "com.samsung.android.lool", "com.oneplus.security");

    /* renamed from: a */
    public static boolean m434a(Context context, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m437e(context, (Intent) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m435b(Context context, List list, List list2, boolean z6) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
                AbstractC4154l.m8922e(installedApplications, "pm.getInstalledApplications(0)");
                Iterator<ApplicationInfo> it2 = installedApplications.iterator();
                while (it2.hasNext()) {
                    if (AbstractC4154l.m8918a(it2.next().packageName, str)) {
                        return z6 ? m438f(context, list2) : m434a(context, list2);
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static Intent m436d(String str, String str2, boolean z6) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        if (z6) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    /* renamed from: e */
    public static boolean m437e(Context context, Intent intent) {
        AbstractC4154l.m8922e(context.getPackageManager().queryIntentActivities(intent, 65536), "context.packageManager.queryIntentActivities(\n            intent, PackageManager.MATCH_DEFAULT_ONLY\n        )");
        return !r1.isEmpty();
    }

    /* renamed from: f */
    public static boolean m438f(Context context, List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Intent intent = (Intent) it.next();
            if (m437e(context, intent)) {
                try {
                    context.startActivity(intent);
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    throw e2;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m439c(Context context, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(context, "context");
        String BRAND = Build.BRAND;
        AbstractC4154l.m8922e(BRAND, "BRAND");
        Locale ROOT = Locale.ROOT;
        AbstractC4154l.m8922e(ROOT, "ROOT");
        String lowerCase = BRAND.toLowerCase(ROOT);
        AbstractC4154l.m8922e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (lowerCase.equals("asus")) {
            return m435b(context, pe.m10833h("com.asus.mobilemanager"), pe.m10834i(m436d("com.asus.mobilemanager", "com.asus.mobilemanager.powersaver.PowerSaverSettings", z10), m436d("com.asus.mobilemanager", "com.asus.mobilemanager.autostart.AutoStartActivity", z10)), z6);
        }
        if (lowerCase.equals("xiaomi") ? true : lowerCase.equals("poco") ? true : lowerCase.equals("redmi")) {
            return m435b(context, pe.m10833h("com.miui.securitycenter"), pe.m10833h(m436d("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity", z10)), z6);
        }
        if (lowerCase.equals("letv")) {
            return m435b(context, pe.m10833h("com.letv.android.letvsafe"), pe.m10833h(m436d("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity", z10)), z6);
        }
        if (lowerCase.equals("honor")) {
            return m435b(context, pe.m10833h("com.huawei.systemmanager"), pe.m10833h(m436d("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity", z10)), z6);
        }
        if (lowerCase.equals("huawei")) {
            return m435b(context, pe.m10833h("com.huawei.systemmanager"), pe.m10834i(m436d("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity", z10), m436d("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity", z10)), z6);
        }
        if (!lowerCase.equals("oppo")) {
            if (lowerCase.equals("vivo")) {
                return m435b(context, pe.m10834i("com.iqoo.secure", "com.vivo.permissionmanager"), pe.m10834i(m436d("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity", z10), m436d("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity", z10), m436d("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager", z10)), z6);
            }
            if (lowerCase.equals("nokia")) {
                return m435b(context, pe.m10833h("com.evenwell.powersaving.g3"), pe.m10833h(m436d("com.evenwell.powersaving.g3", "com.evenwell.powersaving.g3.exception.PowerSaverExceptionActivity", z10)), z6);
            }
            if (lowerCase.equals("samsung")) {
                return m435b(context, pe.m10833h("com.samsung.android.lool"), pe.m10834i(m436d("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity", z10), m436d("com.samsung.android.lool", "com.samsung.android.sm.battery.ui.usage.CheckableAppListActivity", z10), m436d("com.samsung.android.lool", "com.samsung.android.sm.battery.ui.BatteryActivity", z10)), z6);
            }
            if (lowerCase.equals("oneplus")) {
                if (!m435b(context, pe.m10833h("com.oneplus.security"), pe.m10833h(m436d("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity", z10)), z6)) {
                    Intent intent = new Intent();
                    intent.setAction("com.android.settings.action.BACKGROUND_OPTIMIZE");
                    if (z10) {
                        intent.addFlags(268435456);
                    }
                    List listM10833h = pe.m10833h(intent);
                    if (z6 ? m438f(context, listM10833h) : m434a(context, listM10833h)) {
                    }
                }
            }
            return false;
        }
        if (!m435b(context, pe.m10834i("com.coloros.safecenter", "com.oppo.safe"), pe.m10834i(m436d("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity", z10), m436d("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity", z10), m436d("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity", z10)), z6)) {
            try {
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.setData(Uri.parse("package:" + ((Object) context.getPackageName())));
                if (!z6) {
                    return m437e(context, intent2);
                }
                context.startActivity(intent2);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
