package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.config.CookieSpecs;
import org.json.JSONException;
import p001o.c64;
import p001o.o2c;
import p001o.pc7;
import p001o.wj3;

/* loaded from: classes5.dex */
public final class CommonNotificationBuilder {
    private static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {
        public final int id;
        public final o2c.C15694f notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(o2c.C15694f c15694f, String str, int i) {
            this.notificationBuilder = c15694f;
            this.tag = str;
            this.id = i;
        }
    }

    private CommonNotificationBuilder() {
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent intentCreateTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (intentCreateTargetIntent == null) {
            return null;
        }
        intentCreateTargetIntent.addFlags(67108864);
        intentCreateTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            intentCreateTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), intentCreateTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent(ACTION_MESSAGING_EVENT).setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), getPendingIntentFlags(1073741824));
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) throws PackageManager.NameNotFoundException {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(link);
        return intent2;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
            }
        }
        int i = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(c64.getColor(context, i));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r0 = z;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r0 = (z ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? r0 | 4 : r0;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't get own application info: ");
            sb.append(e);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                notificationManager.createNotificationChannel(pc7.m43335a(FCM_FALLBACK_NOTIFICATION_CHANNEL, identifier == 0 ? FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE : context.getString(identifier), 3));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i) {
        return i | 67108864;
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
        }
        int i = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i == 0 || !isValidIcon(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't get own application info: ");
                sb2.append(e);
            }
        }
        return (i == 0 || !isValidIcon(resources, i)) ? android.R.drawable.sym_def_app_icon : i;
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if (CookieSpecs.DEFAULT.equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean isValidIcon(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!wj3.m54620a(resources.getDrawable(i, null))) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean shouldUploadMetrics(NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) throws JSONException {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        o2c.C15694f c15694f = new o2c.C15694f(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            c15694f.m41418m(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            c15694f.m41417l(possiblyLocalizedString2);
            c15694f.m41401E(new o2c.C15692d().m41377h(possiblyLocalizedString2));
        }
        c15694f.m41399C(getSmallIcon(packageManager, resources, packageName, notificationParams.getString(Constants.MessageNotificationKeys.ICON), bundle));
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            c15694f.m41400D(sound);
        }
        c15694f.m41416k(createContentIntent(context, notificationParams, packageName, packageManager));
        PendingIntent pendingIntentCreateDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (pendingIntentCreateDeleteIntent != null) {
            c15694f.m41420o(pendingIntentCreateDeleteIntent);
        }
        Integer color = getColor(context2, notificationParams.getString(Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            c15694f.m41414i(color.intValue());
        }
        c15694f.m41412g(!notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY));
        c15694f.m41427v(notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY));
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            c15694f.m41402F(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            c15694f.m41431z(notificationPriority.intValue());
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            c15694f.m41405I(visibility.intValue());
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            c15694f.m41428w(notificationCount.intValue());
        }
        Long l = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l != null) {
            c15694f.m41398B(true);
            c15694f.m41406J(l.longValue());
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            c15694f.m41404H(vibrateTimings);
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            c15694f.m41426u(lightSettings[0], lightSettings[1], lightSettings[2]);
        }
        c15694f.m41419n(getConsolidatedDefaults(notificationParams));
        return new DisplayNotificationInfo(c15694f, getTag(notificationParams), 0);
    }
}
