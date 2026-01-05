package com.onesignal.notifications.internal.common;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotification;
import com.onesignal.notifications.internal.NotificationClickEvent;
import com.onesignal.notifications.internal.NotificationClickResult;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.e3c;
import p001o.o2c;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationHelper {
    public static final int GROUPLESS_SUMMARY_ID = -718463522;
    public static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    private NotificationHelper() {
    }

    public static /* synthetic */ boolean areNotificationsEnabled$default(NotificationHelper notificationHelper, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return notificationHelper.areNotificationsEnabled(context, str);
    }

    public final boolean areNotificationsEnabled(Context context, String str) {
        sq8.m48649h(context, "context");
        try {
            if (!e3c.m24211d(context).m24214a()) {
                return false;
            }
            if (str == null || Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = getNotificationManager(context);
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(str) : null;
            if (notificationChannel != null) {
                return notificationChannel.getImportance() != 0;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> arrayList) {
        sq8.m48649h(arrayList, "grouplessNotifs");
        Iterator<StatusBarNotification> it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, next.getNotification());
            sq8.m48648g(builderRecoverBuilder, "recoverBuilder(context, …uplessNotif.notification)");
            Notification notificationBuild = builderRecoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            sq8.m48648g(notificationBuild, "grouplessNotifBuilder\n  …                 .build()");
            sq8.m48646e(context);
            e3c.m24211d(context).m24217f(next.getId(), notificationBuild);
        }
    }

    public final NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jSONArray, ITime iTime) {
        sq8.m48649h(jSONArray, "jsonArray");
        sq8.m48649h(iTime, InfluenceConstants.TIME);
        int length = jSONArray.length();
        int iOptInt = jSONArray.optJSONObject(0).optInt(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID);
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        JSONObject jSONObject = null;
        String strOptString = null;
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                if (strOptString == null && jSONObject.has(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID)) {
                    strOptString = jSONObject.optString(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, null);
                }
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new com.onesignal.notifications.internal.Notification(jSONObject, iTime));
                }
            } catch (Throwable th) {
                Logging.error("Error parsing JSON item " + i + '/' + length + " for callback.", th);
            }
        }
        sq8.m48646e(jSONObject);
        com.onesignal.notifications.internal.Notification notification = new com.onesignal.notifications.internal.Notification(arrayList, jSONObject, iOptInt, iTime);
        return new NotificationClickEvent(notification, new NotificationClickResult(strOptString, notification.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        sq8.m48649h(context, "context");
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean zIsGroupSummary = isGroupSummary(statusBarNotification);
            boolean z = notification.getGroup() == null || sq8.m48644c(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!zIsGroupSummary && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        sq8.m48649h(context, "context");
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            sq8.m48648g(activeNotifications, "getNotificationManager(c…text).activeNotifications");
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getCampaignNameFromNotification(INotification iNotification) {
        boolean z;
        sq8.m48649h(iNotification, OneSignalDbContract.NotificationTable.TABLE_NAME);
        String templateName = iNotification.getTemplateName();
        boolean z2 = true;
        if (templateName == null) {
            z = false;
        } else {
            if (templateName.length() == 0) {
                z = true;
            }
        }
        if (!z) {
            String templateId = iNotification.getTemplateId();
            if (templateId == null) {
                z2 = false;
                if (!z2) {
                    return iNotification.getTemplateName() + " - " + iNotification.getTemplateId();
                }
            } else {
                if (!(templateId.length() == 0)) {
                }
                if (!z2) {
                }
            }
        }
        if (iNotification.getTitle() == null) {
            return "";
        }
        String title = iNotification.getTitle();
        sq8.m48646e(title);
        String title2 = iNotification.getTitle();
        sq8.m48646e(title2);
        String strSubstring = title.substring(0, Math.min(10, title2.length()));
        sq8.m48648g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "jsonObject");
        return new JSONObject(jSONObject.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
    }

    public final int getGrouplessNotifsCount(Context context) {
        sq8.m48649h(context, "context");
        int i = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if (!o2c.m41352b(statusBarNotification.getNotification()) && sq8.m48644c(GROUPLESS_SUMMARY_KEY, statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return i;
    }

    public final String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
        } catch (JSONException unused) {
            Logging.debug$default("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.", null, 2, null);
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        Logging.debug$default("Not a OneSignal formatted FCM message. No 'i' field in custom.", null, 2, null);
        return null;
    }

    public final NotificationManager getNotificationManager(Context context) {
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        sq8.m48649h(context, "context");
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (AndroidUtils.INSTANCE.isValidResourceName(str) && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + '/' + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + packageName + '/' + identifier2);
    }

    public final boolean isGroupSummary(StatusBarNotification statusBarNotification) {
        sq8.m48649h(statusBarNotification, "notif");
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject jSONObject) {
        JSONArray jSONArray;
        sq8.m48649h(jSONObject, "fcmBundle");
        try {
            Object objOpt = jSONObject.opt("vib_pt");
            if (objOpt instanceof String) {
                jSONArray = new JSONArray((String) objOpt);
            } else {
                sq8.m48647f(objOpt, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray = (JSONArray) objOpt;
            }
            long[] jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }
}
