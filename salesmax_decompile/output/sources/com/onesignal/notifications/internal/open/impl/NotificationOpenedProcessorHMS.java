package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.JSONUtils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.TypeReference;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationOpenedProcessorHMS implements INotificationOpenedProcessorHMS {
    private final INotificationLifecycleService _lifecycleService;

    @l75(m36647c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessorHMS", m36648f = "NotificationOpenedProcessorHMS.kt", m36649l = {62, TypeReference.EXCEPTION_PARAMETER}, m36650m = "handleProcessJsonOpenData")
    /* renamed from: com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1 */
    public static final class C117921 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C117921(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationOpenedProcessorHMS.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public NotificationOpenedProcessorHMS(INotificationLifecycleService iNotificationLifecycleService) {
        sq8.m48649h(iNotificationLifecycleService, "_lifecycleService");
        this._lifecycleService = iNotificationLifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) throws JSONException {
        if (!NotificationFormatHelper.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        sq8.m48646e(intent);
        Bundle extras = intent.getExtras();
        JSONUtils jSONUtils = JSONUtils.INSTANCE;
        sq8.m48646e(extras);
        JSONObject jSONObjectBundleAsJSONObject = jSONUtils.bundleAsJSONObject(extras);
        reformatButtonClickAction(jSONObjectBundleAsJSONObject);
        return jSONObjectBundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, n64 n64Var) {
        C117921 c117921;
        NotificationOpenedProcessorHMS notificationOpenedProcessorHMS;
        if (n64Var instanceof C117921) {
            c117921 = (C117921) n64Var;
            int i = c117921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117921.label = i - Integer.MIN_VALUE;
            } else {
                c117921 = new C117921(n64Var);
            }
        }
        Object objCanOpenNotification = c117921.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117921.label;
        if (i2 == 0) {
            wre.m54934b(objCanOpenNotification);
            INotificationLifecycleService iNotificationLifecycleService = this._lifecycleService;
            c117921.L$0 = this;
            c117921.L$1 = activity;
            c117921.L$2 = jSONObject;
            c117921.label = 1;
            objCanOpenNotification = iNotificationLifecycleService.canOpenNotification(activity, jSONObject, c117921);
            if (objCanOpenNotification == objM51918f) {
                return objM51918f;
            }
            notificationOpenedProcessorHMS = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objCanOpenNotification);
                return y3i.f54824a;
            }
            jSONObject = (JSONObject) c117921.L$2;
            activity = (Activity) c117921.L$1;
            notificationOpenedProcessorHMS = (NotificationOpenedProcessorHMS) c117921.L$0;
            wre.m54934b(objCanOpenNotification);
        }
        if (!((Boolean) objCanOpenNotification).booleanValue()) {
            return y3i.f54824a;
        }
        INotificationLifecycleService iNotificationLifecycleService2 = notificationOpenedProcessorHMS._lifecycleService;
        JSONArray jSONArrayWrapInJsonArray = JSONUtils.INSTANCE.wrapInJsonArray(jSONObject);
        c117921.L$0 = null;
        c117921.L$1 = null;
        c117921.L$2 = null;
        c117921.label = 2;
        if (iNotificationLifecycleService2.notificationOpened(activity, jSONArrayWrapInJsonArray, c117921) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    private final void reformatButtonClickAction(JSONObject jSONObject) throws JSONException {
        try {
            String str = (String) NotificationHelper.INSTANCE.getCustomJSONObject(jSONObject).remove(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID);
            if (str == null) {
                return;
            }
            jSONObject.put(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, n64 n64Var) throws JSONException {
        if (intent == null) {
            return y3i.f54824a;
        }
        JSONObject jSONObjectCovertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (jSONObjectCovertHMSOpenIntentToJson == null) {
            return y3i.f54824a;
        }
        Object objHandleProcessJsonOpenData = handleProcessJsonOpenData(activity, jSONObjectCovertHMSOpenIntentToJson, n64Var);
        return objHandleProcessJsonOpenData == uq8.m51918f() ? objHandleProcessJsonOpenData : y3i.f54824a;
    }
}
