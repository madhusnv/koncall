package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.C10903R;
import com.google.android.gms.common.C10907R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import p001o.ktf;
import p001o.yq3;

/* loaded from: classes5.dex */
public final class zac {
    private static final ktf zaa = new ktf();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(C10903R.string.common_google_play_services_enable_button) : resources.getString(C10903R.string.common_google_play_services_update_button) : resources.getString(C10903R.string.common_google_play_services_install_button);
    }

    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i == 1) {
            return resources.getString(C10903R.string.common_google_play_services_install_text, strZaa);
        }
        if (i == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(C10903R.string.common_google_play_services_wear_update_text) : resources.getString(C10903R.string.common_google_play_services_update_text, strZaa);
        }
        if (i == 3) {
            return resources.getString(C10903R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i == 9) {
            return resources.getString(C10903R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(C10903R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(C10907R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static String zad(Context context, int i) {
        return (i == 6 || i == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i);
    }

    public static String zae(Context context, int i) {
        String strZah = i == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i);
        return strZah == null ? context.getResources().getString(C10903R.string.common_google_play_services_notification_ticker) : strZah;
    }

    public static String zaf(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C10903R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C10903R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C10903R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
            case 17:
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zag(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(C10907R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    private static String zah(Context context, String str) {
        ktf ktfVar = zaa;
        synchronized (ktfVar) {
            Locale localeM43685c = yq3.m58107a(context.getResources().getConfiguration()).m43685c(0);
            if (!localeM43685c.equals(zab)) {
                ktfVar.clear();
                zab = localeM43685c;
            }
            String str2 = (String) ktfVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing resource: ");
                sb.append(str);
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                ktfVar.put(str, string);
                return string;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got empty resource: ");
            sb2.append(str);
            return null;
        }
    }
}
