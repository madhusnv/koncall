package com.onesignal.notifications.internal.bundle.impl;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationBundleProcessor implements INotificationBundleProcessor {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final ITime _time;
    private final INotificationGenerationWorkManager _workManager;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public NotificationBundleProcessor(INotificationGenerationWorkManager iNotificationGenerationWorkManager, ITime iTime) {
        sq8.m48649h(iNotificationGenerationWorkManager, "_workManager");
        sq8.m48649h(iTime, "_time");
        this._workManager = iNotificationGenerationWorkManager;
        this._time = iTime;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) throws JSONException {
        JSONObject jSONObject;
        String string;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                    sq8.m48648g(jSONObject, "{\n                    cu…      )\n                }");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string2 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        string = string2;
                    }
                    jSONObject3.put(OutcomeConstants.OUTCOME_ID, string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                        jSONObject3.put("icon", jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                        jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, DEFAULT_ACTION);
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM, jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.onesignal.notifications.internal.bundle.INotificationBundleProcessor
    public INotificationBundleProcessor.ProcessedBundleResult processBundleFromReceiver(Context context, Bundle bundle) throws JSONException {
        sq8.m48649h(context, "context");
        sq8.m48649h(bundle, "bundle");
        INotificationBundleProcessor.ProcessedBundleResult processedBundleResult = new INotificationBundleProcessor.ProcessedBundleResult();
        NotificationFormatHelper notificationFormatHelper = NotificationFormatHelper.INSTANCE;
        if (!notificationFormatHelper.isOneSignalBundle(bundle)) {
            return processedBundleResult;
        }
        processedBundleResult.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject jSONObjectBundleAsJSONObject = JSONUtils.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z = bundle.getBoolean("is_restoring", false);
        String string = bundle.getString("pri", "0");
        sq8.m48648g(string, "bundle.getString(\"pri\", \"0\")");
        boolean z2 = Integer.parseInt(string) > 9;
        String oSNotificationIdFromJson = notificationFormatHelper.getOSNotificationIdFromJson(jSONObjectBundleAsJSONObject);
        int i = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        INotificationGenerationWorkManager iNotificationGenerationWorkManager = this._workManager;
        sq8.m48646e(oSNotificationIdFromJson);
        processedBundleResult.setWorkManagerProcessing(iNotificationGenerationWorkManager.beginEnqueueingWork(context, oSNotificationIdFromJson, i, jSONObjectBundleAsJSONObject, currentTimeMillis, z, z2));
        return processedBundleResult;
    }
}
