package com.onesignal.notifications.internal.display.impl;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.C11591R;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.notifications.internal.channels.INotificationChannelManager;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.e9g;
import p001o.o2c;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationDisplayBuilder implements INotificationDisplayBuilder {
    private final IApplicationService _applicationService;
    private final INotificationChannelManager _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    public static final class OneSignalNotificationBuilder {
        private o2c.C15694f compatBuilder;
        private boolean hasLargeIcon;

        public final o2c.C15694f getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(o2c.C15694f c15694f) {
            this.compatBuilder = c15694f;
        }

        public final void setHasLargeIcon(boolean z) {
            this.hasLargeIcon = z;
        }
    }

    public NotificationDisplayBuilder(IApplicationService iApplicationService, INotificationChannelManager iNotificationChannelManager) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationChannelManager, "_notificationChannelManager");
        this._applicationService = iApplicationService;
        this._notificationChannelManager = iNotificationChannelManager;
        this.notificationDismissedClass = NotificationDismissReceiver.class;
    }

    private final void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            addCustomAlertButtons(jSONObject, list, list2);
        } catch (Throwable th) {
            Logging.error("Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok");
            sq8.m48646e(resourceString);
            list.add(resourceString);
            list2.add(NotificationBundleProcessor.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has("a")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (jSONObject3.has("actionButtons")) {
                JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject4 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject4.optString("text");
                    sq8.m48648g(strOptString, "button.optString(\"text\")");
                    list.add(strOptString);
                    String strOptString2 = jSONObject4.optString(OutcomeConstants.OUTCOME_ID);
                    sq8.m48648g(strOptString2, "button.optString(\"id\")");
                    list2.add(strOptString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i) {
        if (i > 9) {
            return 2;
        }
        if (i > 7) {
            return 1;
        }
        if (i > 4) {
            return 0;
        }
        return i > 2 ? -1 : -2;
    }

    private final BigInteger getAccentColor(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(this._applicationService.getAppContext(), "onesignal_notification_accent_color", null);
            if (resourceString != null) {
                return new BigInteger(resourceString, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(this._applicationService.getAppContext(), "com.onesignal.NotificationAccentColor.DEFAULT");
            if (manifestMeta != null) {
                return new BigInteger(manifestMeta, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = sq8.m48651j(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        return (e9g.m24597K(string, "http://", false, 2, null) || e9g.m24597K(string, "https://", false, 2, null)) ? getBitmapFromURL(string) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmapDecodeStream;
        try {
            Context currentContext = getCurrentContext();
            sq8.m48646e(currentContext);
            bitmapDecodeStream = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    sq8.m48646e(currentContext2);
                    bitmapDecodeStream = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream());
        } catch (Throwable th) {
            Logging.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String str) {
        Resources contextResources = getContextResources();
        sq8.m48646e(contextResources);
        return contextResources.getIdentifier(str, "drawable", getPackageName());
    }

    private final Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = getBitmap(jSONObject.optString("licon"));
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return resizeBitmapForLargeIconArea(bitmap);
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = sq8.m48651j(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(string)) {
            return 0;
        }
        int drawableId = getDrawableId(string);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final int getSmallIconId(JSONObject jSONObject) {
        int resourceIcon = getResourceIcon(jSONObject.optString("sicon", null));
        return resourceIcon != 0 ? resourceIcon : getDefaultSmallIconId();
    }

    private final boolean isSoundEnabled(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("sound", null);
        return (sq8.m48644c("null", strOptString) || sq8.m48644c("nil", strOptString)) ? false : true;
    }

    private final Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Resources contextResources = getContextResources();
            sq8.m48646e(contextResources);
            int dimension = (int) contextResources.getDimension(C11591R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            sq8.m48646e(contextResources2);
            int dimension2 = (int) contextResources2.getDimension(C11591R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private final void setAlertnessOptions(JSONObject jSONObject, o2c.C15694f c15694f) {
        int iConvertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        c15694f.m41431z(iConvertOSToAndroidPriority);
        int i = 0;
        if (iConvertOSToAndroidPriority < 0) {
            return;
        }
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                c15694f.m41426u(new BigInteger(jSONObject.optString("ledc"), 16).intValue(), 2000, 5000);
            } catch (Throwable unused) {
            }
        } else {
            i = 4;
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] vibrationPattern = NotificationHelper.INSTANCE.parseVibrationPattern(jSONObject);
                if (vibrationPattern != null) {
                    c15694f.m41404H(vibrationPattern);
                }
            } else {
                i |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
            Context currentContext = getCurrentContext();
            sq8.m48646e(currentContext);
            Uri soundUri = notificationHelper.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                c15694f.m41400D(soundUri);
            } else {
                i |= 1;
            }
        }
        c15694f.m41419n(i);
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public void addNotificationActionButtons(JSONObject jSONObject, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, o2c.C15694f c15694f, int i, String str) {
        int resourceIcon;
        sq8.m48649h(jSONObject, "fcmJson");
        sq8.m48649h(intentGeneratorForAttachingToNotifications, "intentGenerator");
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent newBaseIntent = intentGeneratorForAttachingToNotifications.getNewBaseIntent(i);
                        newBaseIntent.setAction("" + i2);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject4.put(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, jSONObjectOptJSONObject.optString(OutcomeConstants.OUTCOME_ID));
                        newBaseIntent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject4.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            newBaseIntent.putExtra("grp", jSONObject.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(i, newBaseIntent);
                        if (jSONObjectOptJSONObject.has("icon")) {
                            try {
                                resourceIcon = getResourceIcon(jSONObjectOptJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            resourceIcon = 0;
                        }
                        sq8.m48646e(c15694f);
                        c15694f.m41407a(resourceIcon, jSONObjectOptJSONObject.optString("text"), newActionPendingIntent);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public void addXiaomiSettings(OneSignalNotificationBuilder oneSignalNotificationBuilder, Notification notification) {
        sq8.m48649h(notification, OneSignalDbContract.NotificationTable.TABLE_NAME);
        sq8.m48646e(oneSignalNotificationBuilder);
        if (oneSignalNotificationBuilder.getHasLargeIcon()) {
            try {
                Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public OneSignalNotificationBuilder getBaseOneSignalNotificationBuilder(NotificationGenerationJob notificationGenerationJob) {
        int i;
        sq8.m48649h(notificationGenerationJob, "notificationJob");
        JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
        sq8.m48646e(jsonPayload);
        OneSignalNotificationBuilder oneSignalNotificationBuilder = new OneSignalNotificationBuilder();
        o2c.C15694f c15694f = new o2c.C15694f(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(notificationGenerationJob));
        String strOptString = jsonPayload.optString("alert", null);
        c15694f.m41412g(true).m41399C(getSmallIconId(jsonPayload)).m41401E(new o2c.C15692d().m41377h(strOptString)).m41417l(strOptString).m41402F(strOptString);
        if (!sq8.m48644c(jsonPayload.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE), "")) {
            c15694f.m41418m(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                c15694f.m41414i(accentColor.intValue());
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String strOptString2 = jsonPayload.optString("vis");
                sq8.m48648g(strOptString2, "fcmJson.optString(\"vis\")");
                i = Integer.parseInt(strOptString2);
            } else {
                i = 1;
            }
            c15694f.m41405I(i);
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            oneSignalNotificationBuilder.setHasLargeIcon(true);
            c15694f.m41425t(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            c15694f.m41401E(new o2c.C15691c().m41370i(bitmap).m41371j(strOptString));
        }
        if (notificationGenerationJob.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = notificationGenerationJob.getShownTimeStamp();
                sq8.m48646e(shownTimeStamp);
                c15694f.m41406J(shownTimeStamp.longValue() * 1000);
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, c15694f);
        oneSignalNotificationBuilder.setCompatBuilder(c15694f);
        return oneSignalNotificationBuilder;
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public int getDefaultSmallIconId() {
        int drawableId = getDrawableId("ic_stat_onesignal_default");
        if (drawableId != 0) {
            return drawableId;
        }
        int drawableId2 = getDrawableId("corona_statusbar_icon_default");
        if (drawableId2 != 0) {
            return drawableId2;
        }
        int drawableId3 = getDrawableId("ic_os_notification_fallback_white_24dp");
        return drawableId3 != 0 ? drawableId3 : R.drawable.ic_popup_reminder;
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public Intent getNewBaseDismissIntent(int i) {
        Intent intentPutExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, i).putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, true);
        sq8.m48648g(intentPutExtra, "Intent(currentContext, n…tExtra(\"dismissed\", true)");
        return intentPutExtra;
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public PendingIntent getNewDismissActionPendingIntent(int i, Intent intent) {
        sq8.m48649h(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i, intent, 201326592);
        sq8.m48648g(broadcast, "getBroadcast(\n          …FLAG_IMMUTABLE,\n        )");
        return broadcast;
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public CharSequence getTitle(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "fcmJson");
        String strOptString = jSONObject.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, null);
        if (strOptString != null) {
            return strOptString;
        }
        Context currentContext = getCurrentContext();
        sq8.m48646e(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        sq8.m48646e(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        sq8.m48648g(applicationLabel, "currentContext!!.package…cationInfo,\n            )");
        return applicationLabel;
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayBuilder
    public void removeNotifyOptions(o2c.C15694f c15694f) {
        sq8.m48646e(c15694f);
        c15694f.m41430y(true).m41419n(0).m41400D(null).m41404H(null).m41402F(null);
    }
}
