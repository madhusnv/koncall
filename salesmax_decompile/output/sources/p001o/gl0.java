package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.C10773c;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class gl0 {

    /* renamed from: a */
    public static final gl0 f25394a = new gl0();

    /* renamed from: a */
    public static final void m28967a() {
    }

    /* renamed from: b */
    public static final void m28968b() {
    }

    /* renamed from: c */
    public static final String m28969c() {
        Context contextM13019l = C10773c.m13019l();
        try {
            String str = contextM13019l.getPackageManager().getPackageInfo(contextM13019l.getPackageName(), 0).versionName;
            sq8.m48648g(str, "{\n      val packageInfo …ageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static final View m28970d(Activity activity) {
        if (a94.m16694d(gl0.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, gl0.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m28971e() {
        String str = Build.FINGERPRINT;
        sq8.m48648g(str, "FINGERPRINT");
        if (!e9g.m24597K(str, "generic", false, 2, null)) {
            sq8.m48648g(str, "FINGERPRINT");
            if (!e9g.m24597K(str, "unknown", false, 2, null)) {
                String str2 = Build.MODEL;
                sq8.m48648g(str2, "MODEL");
                if (!f9g.m26306P(str2, "google_sdk", false, 2, null)) {
                    sq8.m48648g(str2, "MODEL");
                    if (!f9g.m26306P(str2, "Emulator", false, 2, null)) {
                        sq8.m48648g(str2, "MODEL");
                        if (!f9g.m26306P(str2, "Android SDK built for x86", false, 2, null)) {
                            String str3 = Build.MANUFACTURER;
                            sq8.m48648g(str3, "MANUFACTURER");
                            if (!f9g.m26306P(str3, "Genymotion", false, 2, null)) {
                                String str4 = Build.BRAND;
                                sq8.m48648g(str4, "BRAND");
                                if (e9g.m24597K(str4, "generic", false, 2, null)) {
                                    String str5 = Build.DEVICE;
                                    sq8.m48648g(str5, "DEVICE");
                                    if (!e9g.m24597K(str5, "generic", false, 2, null)) {
                                        if (!sq8.m48644c("google_sdk", Build.PRODUCT)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public static final double m28972f(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            return NumberFormat.getNumberInstance(cri.m21642B()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }
}
