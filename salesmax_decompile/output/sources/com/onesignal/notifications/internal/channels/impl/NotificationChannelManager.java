package com.onesignal.notifications.internal.channels.impl;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.channels.INotificationChannelManager;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.e9g;
import p001o.f2c;
import p001o.id5;
import p001o.n2c;
import p001o.pc7;
import p001o.qc7;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationChannelManager implements INotificationChannelManager {
    private static final String CHANNEL_PREFIX = "OS_";
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private final IApplicationService _applicationService;
    private final ILanguageContext _languageContext;
    private final Pattern hexPattern;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public NotificationChannelManager(IApplicationService iApplicationService, ILanguageContext iLanguageContext) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iLanguageContext, "_languageContext");
        this._applicationService = iApplicationService;
        this._languageContext = iLanguageContext;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        long[] vibrationPattern;
        Object objOpt = jSONObject.opt("chnl");
        if (objOpt instanceof String) {
            jSONObject2 = new JSONObject((String) objOpt);
        } else {
            sq8.m48647f(objOpt, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject2 = (JSONObject) objOpt;
        }
        String strOptString = jSONObject2.optString(OutcomeConstants.OUTCOME_ID, "fcm_fallback_notification_channel");
        String str = sq8.m48644c(strOptString, "miscellaneous") ? "fcm_fallback_notification_channel" : strOptString;
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            jSONObjectOptJSONObject = jSONObject3.has(language) ? jSONObject3.optJSONObject(language) : jSONObject2;
        }
        sq8.m48646e(jSONObjectOptJSONObject);
        String strOptString2 = jSONObjectOptJSONObject.optString("nm", "Miscellaneous");
        int iPriorityToImportance = priorityToImportance(jSONObject.optInt("pri", 6));
        qc7.m45085a();
        NotificationChannel notificationChannelM43335a = pc7.m43335a(str, strOptString2, iPriorityToImportance);
        notificationChannelM43335a.setDescription(jSONObjectOptJSONObject.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
            String strOptString3 = jSONObject2.optString("grp_id");
            String strOptString4 = jSONObjectOptJSONObject.optString("grp_nm");
            sq8.m48648g(strOptString4, "payloadWithText.optString(\"grp_nm\")");
            notificationManager.createNotificationChannelGroup(n2c.m40023a(strOptString3, strOptString4));
            notificationChannelM43335a.setGroup(strOptString3);
        }
        if (jSONObject.has("ledc")) {
            String strOptString5 = jSONObject.optString("ledc");
            if (!this.hexPattern.matcher(strOptString5).matches()) {
                Logging.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                strOptString5 = "FFFFFFFF";
            }
            try {
                notificationChannelM43335a.setLightColor(new BigInteger(strOptString5, 16).intValue());
            } catch (Throwable th) {
                Logging.error("Couldn't convert ARGB Hex value to BigInteger:", th);
            }
        }
        notificationChannelM43335a.enableLights(jSONObject.optInt("led", 1) == 1);
        if (jSONObject.has("vib_pt") && (vibrationPattern = NotificationHelper.INSTANCE.parseVibrationPattern(jSONObject)) != null) {
            notificationChannelM43335a.setVibrationPattern(vibrationPattern);
        }
        notificationChannelM43335a.enableVibration(jSONObject.optInt("vib", 1) == 1);
        if (jSONObject.has("sound")) {
            String strOptString6 = jSONObject.optString("sound", null);
            Uri soundUri = NotificationHelper.INSTANCE.getSoundUri(context, strOptString6);
            if (soundUri != null) {
                notificationChannelM43335a.setSound(soundUri, null);
            } else if (sq8.m48644c("null", strOptString6) || sq8.m48644c("nil", strOptString6)) {
                notificationChannelM43335a.setSound(null, null);
            }
        }
        notificationChannelM43335a.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        notificationChannelM43335a.setShowBadge(jSONObject.optInt("bdg", 1) == 1);
        notificationChannelM43335a.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        Logging.verbose$default("Creating notification channel with channel:\n" + notificationChannelM43335a, null, 2, null);
        try {
            notificationManager.createNotificationChannel(notificationChannelM43335a);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        sq8.m48648g(str, "channelId");
        return str;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        qc7.m45085a();
        NotificationChannel notificationChannelM43335a = pc7.m43335a("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannelM43335a.enableLights(true);
        notificationChannelM43335a.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannelM43335a);
        return "fcm_fallback_notification_channel";
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        qc7.m45085a();
        notificationManager.createNotificationChannel(pc7.m43335a(RESTORE_CHANNEL_ID, "Restored", 2));
        return RESTORE_CHANNEL_ID;
    }

    private final int priorityToImportance(int i) {
        if (i > 9) {
            return 5;
        }
        if (i > 7) {
            return 4;
        }
        if (i > 5) {
            return 3;
        }
        if (i > 3) {
            return 2;
        }
        return i > 1 ? 1 : 0;
    }

    @Override // com.onesignal.notifications.internal.channels.INotificationChannelManager
    public String createNotificationChannel(NotificationGenerationJob notificationGenerationJob) {
        sq8.m48649h(notificationGenerationJob, "notificationJob");
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
        sq8.m48646e(jsonPayload);
        NotificationManager notificationManager = NotificationHelper.INSTANCE.getNotificationManager(appContext);
        if (notificationGenerationJob.isRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String strOptString = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(strOptString) != null) {
                sq8.m48648g(strOptString, "otherChannel");
                return strOptString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e) {
            Logging.error("Could not create notification channel due to JSON payload error!", e);
            return "fcm_fallback_notification_channel";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // com.onesignal.notifications.internal.channels.INotificationChannelManager
    public void processChannelList(JSONArray jSONArray) throws JSONException {
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManager = NotificationHelper.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                sq8.m48648g(jSONObject, "list.getJSONObject(i)");
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e) {
                Logging.error("Could not create notification channel due to JSON payload error!", e);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            ?? notificationChannels = notificationManager.getNotificationChannels();
            sq8.m48648g(notificationChannels, "notificationManager.notificationChannels");
            arrayList = notificationChannels;
        } catch (NullPointerException e2) {
            Logging.error$default("Error when trying to delete notification channel: " + e2.getMessage(), null, 2, null);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String id = f2c.m26012a(it.next()).getId();
            sq8.m48648g(id, OutcomeConstants.OUTCOME_ID);
            if (e9g.m24597K(id, CHANNEL_PREFIX, false, 2, null) && !hashSet.contains(id)) {
                notificationManager.deleteNotificationChannel(id);
            }
        }
    }
}
