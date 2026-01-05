package sf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import bg.C0658c;
import com.websoptimization.callyzerbiz.R;
import e1.u0;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import pf.AbstractC5907g;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.p */
/* loaded from: classes.dex */
public abstract class AbstractC6830p {

    /* renamed from: a */
    public static final u0 f32478a = new u0(0);

    /* renamed from: b */
    public static Locale f32479b;

    /* renamed from: a */
    public static String m13021a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) C0658c.m1928a(context).f4200a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m13022b(Context context, int i10) {
        Resources resources = context.getResources();
        String strM13021a = m13021a(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM13021a);
        }
        if (i10 == 2) {
            return AbstractC8947b.m16430g(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM13021a);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM13021a);
        }
        if (i10 == 5) {
            return m13024d(context, "common_google_play_services_invalid_account_text", strM13021a);
        }
        if (i10 == 7) {
            return m13024d(context, "common_google_play_services_network_error_text", strM13021a);
        }
        if (i10 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM13021a);
        }
        if (i10 == 20) {
            return m13024d(context, "common_google_play_services_restricted_profile_text", strM13021a);
        }
        switch (i10) {
            case 16:
                return m13024d(context, "common_google_play_services_api_unavailable_text", strM13021a);
            case 17:
                return m13024d(context, "common_google_play_services_sign_in_failed_text", strM13021a);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM13021a);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM13021a);
        }
    }

    /* renamed from: c */
    public static String m13023c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i10 == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i10 == 5) {
            return m13025e(context, "common_google_play_services_invalid_account_title");
        }
        if (i10 == 7) {
            return m13025e(context, "common_google_play_services_network_error_title");
        }
        if (i10 == 17) {
            return m13025e(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i10 != 20) {
            return null;
        }
        return m13025e(context, "common_google_play_services_restricted_profile_title");
    }

    /* renamed from: d */
    public static String m13024d(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strM13025e = m13025e(context, str);
        if (strM13025e == null) {
            strM13025e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM13025e, str2);
    }

    /* renamed from: e */
    public static String m13025e(Context context, String str) {
        Resources resourcesForApplication;
        u0 u0Var = f32478a;
        synchronized (u0Var) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f32479b)) {
                    u0Var.clear();
                    f32479b = locale;
                }
                String str2 = (String) u0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = AbstractC5907g.f28749a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f32478a.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
