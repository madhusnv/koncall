package com.onesignal.inAppMessages.internal.preview;

import android.app.Activity;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.startup.IBootstrapService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.notifications.internal.INotificationActivityOpener;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class InAppMessagePreviewHandler implements IBootstrapService, INotificationLifecycleCallback {
    private final IApplicationService _applicationService;
    private final IInAppDisplayer _iamDisplayer;
    private final INotificationActivityOpener _notificationActivityOpener;
    private final INotificationDisplayer _notificationDisplayer;
    private final INotificationLifecycleService _notificationLifeCycle;
    private final InAppStateService _state;
    private final ITime _time;

    @l75(m36647c = "com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler", m36648f = "InAppMessagePreviewHandler.kt", m36649l = {58, 61}, m36650m = "canOpenNotification")
    /* renamed from: com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler$canOpenNotification$1 */
    public static final class C116921 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116921(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagePreviewHandler.this.canOpenNotification(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler", m36648f = "InAppMessagePreviewHandler.kt", m36649l = {40, 46}, m36650m = "canReceiveNotification")
    /* renamed from: com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler$canReceiveNotification$1 */
    public static final class C116931 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116931(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagePreviewHandler.this.canReceiveNotification(null, this);
        }
    }

    public InAppMessagePreviewHandler(IInAppDisplayer iInAppDisplayer, IApplicationService iApplicationService, INotificationDisplayer iNotificationDisplayer, INotificationActivityOpener iNotificationActivityOpener, INotificationLifecycleService iNotificationLifecycleService, InAppStateService inAppStateService, ITime iTime) {
        sq8.m48649h(iInAppDisplayer, "_iamDisplayer");
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationDisplayer, "_notificationDisplayer");
        sq8.m48649h(iNotificationActivityOpener, "_notificationActivityOpener");
        sq8.m48649h(iNotificationLifecycleService, "_notificationLifeCycle");
        sq8.m48649h(inAppStateService, "_state");
        sq8.m48649h(iTime, "_time");
        this._iamDisplayer = iInAppDisplayer;
        this._applicationService = iApplicationService;
        this._notificationDisplayer = iNotificationDisplayer;
        this._notificationActivityOpener = iNotificationActivityOpener;
        this._notificationLifeCycle = iNotificationLifecycleService;
        this._state = inAppStateService;
        this._time = iTime;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject customJSONObject = NotificationHelper.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has("a") && (jSONObjectOptJSONObject = customJSONObject.optJSONObject("a")) != null && jSONObjectOptJSONObject.has(NotificationConstants.IAM_PREVIEW_KEY)) {
                return jSONObjectOptJSONObject.optString(NotificationConstants.IAM_PREVIEW_KEY);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.onesignal.core.internal.startup.IBootstrapService
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, n64 n64Var) {
        C116921 c116921;
        String strInAppPreviewPushUUID;
        InAppMessagePreviewHandler inAppMessagePreviewHandler;
        if (n64Var instanceof C116921) {
            c116921 = (C116921) n64Var;
            int i = c116921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116921.label = i - Integer.MIN_VALUE;
            } else {
                c116921 = new C116921(n64Var);
            }
        }
        Object objDisplayPreviewMessage = c116921.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116921.label;
        if (i2 == 0) {
            wre.m54934b(objDisplayPreviewMessage);
            strInAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
            if (strInAppPreviewPushUUID == null) {
                return ml1.m39301a(true);
            }
            INotificationActivityOpener iNotificationActivityOpener = this._notificationActivityOpener;
            JSONArray jSONArrayPut = new JSONArray().put(jSONObject);
            sq8.m48648g(jSONArrayPut, "JSONArray().put(jsonData)");
            c116921.L$0 = this;
            c116921.L$1 = strInAppPreviewPushUUID;
            c116921.label = 1;
            if (iNotificationActivityOpener.openDestinationActivity(activity, jSONArrayPut, c116921) == objM51918f) {
                return objM51918f;
            }
            inAppMessagePreviewHandler = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inAppMessagePreviewHandler = (InAppMessagePreviewHandler) c116921.L$0;
                wre.m54934b(objDisplayPreviewMessage);
                if (!((Boolean) objDisplayPreviewMessage).booleanValue()) {
                    inAppMessagePreviewHandler._state.setInAppMessageIdShowing(null);
                }
                return ml1.m39301a(false);
            }
            String str = (String) c116921.L$1;
            InAppMessagePreviewHandler inAppMessagePreviewHandler2 = (InAppMessagePreviewHandler) c116921.L$0;
            wre.m54934b(objDisplayPreviewMessage);
            strInAppPreviewPushUUID = str;
            inAppMessagePreviewHandler = inAppMessagePreviewHandler2;
        }
        inAppMessagePreviewHandler._state.setInAppMessageIdShowing(strInAppPreviewPushUUID);
        IInAppDisplayer iInAppDisplayer = inAppMessagePreviewHandler._iamDisplayer;
        c116921.L$0 = inAppMessagePreviewHandler;
        c116921.L$1 = null;
        c116921.label = 2;
        objDisplayPreviewMessage = iInAppDisplayer.displayPreviewMessage(strInAppPreviewPushUUID, c116921);
        if (objDisplayPreviewMessage == objM51918f) {
            return objM51918f;
        }
        if (!((Boolean) objDisplayPreviewMessage).booleanValue()) {
        }
        return ml1.m39301a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, n64 n64Var) {
        C116931 c116931;
        InAppMessagePreviewHandler inAppMessagePreviewHandler;
        if (n64Var instanceof C116931) {
            c116931 = (C116931) n64Var;
            int i = c116931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116931.label = i - Integer.MIN_VALUE;
            } else {
                c116931 = new C116931(n64Var);
            }
        }
        Object objDisplayPreviewMessage = c116931.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116931.label;
        if (i2 == 0) {
            wre.m54934b(objDisplayPreviewMessage);
            String strInAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
            if (strInAppPreviewPushUUID == null) {
                return ml1.m39301a(true);
            }
            if (this._applicationService.isInForeground()) {
                this._state.setInAppMessageIdShowing(strInAppPreviewPushUUID);
                IInAppDisplayer iInAppDisplayer = this._iamDisplayer;
                c116931.L$0 = this;
                c116931.label = 1;
                objDisplayPreviewMessage = iInAppDisplayer.displayPreviewMessage(strInAppPreviewPushUUID, c116931);
                if (objDisplayPreviewMessage == objM51918f) {
                    return objM51918f;
                }
                inAppMessagePreviewHandler = this;
                if (!((Boolean) objDisplayPreviewMessage).booleanValue()) {
                }
            } else {
                NotificationGenerationJob notificationGenerationJob = new NotificationGenerationJob(jSONObject, this._time);
                INotificationDisplayer iNotificationDisplayer = this._notificationDisplayer;
                c116931.label = 2;
                if (iNotificationDisplayer.displayNotification(notificationGenerationJob, c116931) == objM51918f) {
                    return objM51918f;
                }
            }
        } else if (i2 == 1) {
            inAppMessagePreviewHandler = (InAppMessagePreviewHandler) c116931.L$0;
            wre.m54934b(objDisplayPreviewMessage);
            if (!((Boolean) objDisplayPreviewMessage).booleanValue()) {
                inAppMessagePreviewHandler._state.setInAppMessageIdShowing(null);
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objDisplayPreviewMessage);
        }
        return ml1.m39301a(false);
    }
}
