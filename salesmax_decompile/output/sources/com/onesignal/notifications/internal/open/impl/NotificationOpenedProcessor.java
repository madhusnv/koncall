package com.onesignal.notifications.internal.open.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.e3c;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationOpenedProcessor implements INotificationOpenedProcessor {
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationLifecycleService _lifecycleService;
    private final INotificationSummaryManager _summaryManager;

    @l75(m36647c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", m36648f = "NotificationOpenedProcessor.kt", m36649l = {Opcodes.PUTSTATIC}, m36650m = "addChildNotifications")
    /* renamed from: com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor$addChildNotifications$1 */
    public static final class C117881 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117881(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationOpenedProcessor.this.addChildNotifications(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", m36648f = "NotificationOpenedProcessor.kt", m36649l = {Opcodes.ATHROW, Opcodes.CHECKCAST}, m36650m = "markNotificationsConsumed")
    /* renamed from: com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor$markNotificationsConsumed$1 */
    public static final class C117891 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C117891(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationOpenedProcessor.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", m36648f = "NotificationOpenedProcessor.kt", m36649l = {Opcodes.DMUL, Opcodes.LREM, Opcodes.DNEG, 130}, m36650m = "processIntent")
    /* renamed from: com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor$processIntent$1 */
    public static final class C117901 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C117901(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationOpenedProcessor.this.processIntent(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", m36648f = "NotificationOpenedProcessor.kt", m36649l = {Opcodes.FCMPG, Opcodes.RET}, m36650m = "processToOpenIntent")
    /* renamed from: com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor$processToOpenIntent$1 */
    public static final class C117911 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C117911(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationOpenedProcessor.this.processToOpenIntent(null, null, null, this);
        }
    }

    public NotificationOpenedProcessor(INotificationSummaryManager iNotificationSummaryManager, INotificationRepository iNotificationRepository, ConfigModelStore configModelStore, INotificationLifecycleService iNotificationLifecycleService) {
        sq8.m48649h(iNotificationSummaryManager, "_summaryManager");
        sq8.m48649h(iNotificationRepository, "_dataController");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iNotificationLifecycleService, "_lifecycleService");
        this._summaryManager = iNotificationSummaryManager;
        this._dataController = iNotificationRepository;
        this._configModelStore = configModelStore;
        this._lifecycleService = iNotificationLifecycleService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addChildNotifications(JSONArray jSONArray, String str, n64 n64Var) {
        C117881 c117881;
        if (n64Var instanceof C117881) {
            c117881 = (C117881) n64Var;
            int i = c117881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117881.label = i - Integer.MIN_VALUE;
            } else {
                c117881 = new C117881(n64Var);
            }
        }
        Object objListNotificationsForGroup = c117881.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117881.label;
        if (i2 == 0) {
            wre.m54934b(objListNotificationsForGroup);
            INotificationRepository iNotificationRepository = this._dataController;
            c117881.L$0 = jSONArray;
            c117881.label = 1;
            objListNotificationsForGroup = iNotificationRepository.listNotificationsForGroup(str, c117881);
            if (objListNotificationsForGroup == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray = (JSONArray) c117881.L$0;
            wre.m54934b(objListNotificationsForGroup);
        }
        Iterator it = ((List) objListNotificationsForGroup).iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((INotificationRepository.NotificationData) it.next()).getFullData()));
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, n64 n64Var) {
        if (str != null) {
            Object objClearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, n64Var);
            return objClearNotificationOnSummaryClick == uq8.m51918f() ? objClearNotificationOnSummaryClick : y3i.f54824a;
        }
        NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
        if (notificationHelper.getGrouplessNotifsCount(context) < 1) {
            notificationHelper.getNotificationManager(context).cancel(NotificationHelper.GROUPLESS_SUMMARY_ID);
        }
        return y3i.f54824a;
    }

    @SuppressLint({"MissingPermission"})
    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            sq8.m48646e(context);
            e3c.m24211d(context).m24215b(intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA) || intent.hasExtra("summary") || intent.hasExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z, n64 n64Var) {
        C117891 c117891;
        NotificationOpenedProcessor notificationOpenedProcessor;
        boolean z2;
        String str;
        if (n64Var instanceof C117891) {
            c117891 = (C117891) n64Var;
            int i = c117891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117891.label = i - Integer.MIN_VALUE;
            } else {
                c117891 = new C117891(n64Var);
            }
        }
        C117891 c1178912 = c117891;
        Object obj = c1178912.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1178912.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            String stringExtra = intent.getStringExtra("summary");
            c1178912.L$0 = this;
            c1178912.L$1 = intent;
            c1178912.L$2 = stringExtra;
            c1178912.Z$0 = z;
            c1178912.label = 1;
            if (clearStatusBarNotifications(context, stringExtra, c1178912) == objM51918f) {
                return objM51918f;
            }
            notificationOpenedProcessor = this;
            z2 = z;
            str = stringExtra;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            boolean z3 = c1178912.Z$0;
            String str2 = (String) c1178912.L$2;
            intent = (Intent) c1178912.L$1;
            notificationOpenedProcessor = (NotificationOpenedProcessor) c1178912.L$0;
            wre.m54934b(obj);
            str = str2;
            z2 = z3;
        }
        INotificationRepository iNotificationRepository = notificationOpenedProcessor._dataController;
        int intExtra = intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0);
        boolean clearGroupOnSummaryClick = notificationOpenedProcessor._configModelStore.getModel().getClearGroupOnSummaryClick();
        c1178912.L$0 = null;
        c1178912.L$1 = null;
        c1178912.L$2 = null;
        c1178912.label = 2;
        if (iNotificationRepository.markAsConsumed(intExtra, z2, str, clearGroupOnSummaryClick, c1178912) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, false)) {
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, (Integer) 1);
        } else {
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, (Integer) 1);
        }
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, n64 n64Var) throws JSONException {
        C117901 c117901;
        String stringExtra;
        boolean booleanExtra;
        NotificationOpenedProcessor notificationOpenedProcessor;
        NotificationIntentExtras notificationIntentExtras;
        Object objProcessToOpenIntent;
        NotificationOpenedProcessor notificationOpenedProcessor2;
        Context context2;
        boolean z;
        String str;
        Intent intent2;
        NotificationIntentExtras notificationIntentExtras2;
        String stringExtra2;
        INotificationSummaryManager iNotificationSummaryManager;
        Intent intent3;
        Context context3;
        NotificationOpenedProcessor notificationOpenedProcessor3;
        if (n64Var instanceof C117901) {
            c117901 = (C117901) n64Var;
            int i = c117901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117901.label = i - Integer.MIN_VALUE;
            } else {
                c117901 = new C117901(n64Var);
            }
        }
        Object obj = c117901.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117901.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            stringExtra = intent.getStringExtra("summary");
            booleanExtra = intent.getBooleanExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, false);
            if (booleanExtra) {
                notificationOpenedProcessor = this;
                notificationIntentExtras = null;
                c117901.L$0 = notificationOpenedProcessor;
                c117901.L$1 = context;
                c117901.L$2 = intent;
                c117901.L$3 = stringExtra;
                c117901.L$4 = notificationIntentExtras;
                c117901.Z$0 = booleanExtra;
                c117901.label = 2;
                if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, c117901) != objM51918f) {
                    return objM51918f;
                }
                notificationOpenedProcessor2 = notificationOpenedProcessor;
                context2 = context;
                z = booleanExtra;
                str = stringExtra;
                NotificationIntentExtras notificationIntentExtras3 = notificationIntentExtras;
                intent2 = intent;
                notificationIntentExtras2 = notificationIntentExtras3;
                if (str == null) {
                    iNotificationSummaryManager = notificationOpenedProcessor2._summaryManager;
                    c117901.L$0 = notificationOpenedProcessor2;
                    c117901.L$1 = context2;
                    c117901.L$2 = intent2;
                    c117901.L$3 = notificationIntentExtras2;
                    c117901.L$4 = null;
                    c117901.Z$0 = z;
                    c117901.label = 3;
                    if (iNotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(stringExtra2, z, c117901) != objM51918f) {
                    }
                }
                Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                if (intent2.getExtras() != null) {
                }
                if (!z) {
                }
                return y3i.f54824a;
            }
            c117901.L$0 = this;
            c117901.L$1 = context;
            c117901.L$2 = intent;
            c117901.L$3 = stringExtra;
            c117901.Z$0 = booleanExtra;
            c117901.label = 1;
            objProcessToOpenIntent = processToOpenIntent(context, intent, stringExtra, c117901);
            if (objProcessToOpenIntent == objM51918f) {
                return objM51918f;
            }
            notificationOpenedProcessor = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    z = c117901.Z$0;
                    notificationIntentExtras2 = (NotificationIntentExtras) c117901.L$4;
                    str = (String) c117901.L$3;
                    intent2 = (Intent) c117901.L$2;
                    context2 = (Context) c117901.L$1;
                    notificationOpenedProcessor2 = (NotificationOpenedProcessor) c117901.L$0;
                    wre.m54934b(obj);
                    if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                        iNotificationSummaryManager = notificationOpenedProcessor2._summaryManager;
                        c117901.L$0 = notificationOpenedProcessor2;
                        c117901.L$1 = context2;
                        c117901.L$2 = intent2;
                        c117901.L$3 = notificationIntentExtras2;
                        c117901.L$4 = null;
                        c117901.Z$0 = z;
                        c117901.label = 3;
                        if (iNotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(stringExtra2, z, c117901) != objM51918f) {
                            return objM51918f;
                        }
                        intent3 = intent2;
                        context3 = context2;
                        notificationOpenedProcessor3 = notificationOpenedProcessor2;
                        context2 = context3;
                        notificationOpenedProcessor2 = notificationOpenedProcessor3;
                        intent2 = intent3;
                    }
                    Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                    }
                    if (!z) {
                    }
                    return y3i.f54824a;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                z = c117901.Z$0;
                notificationIntentExtras2 = (NotificationIntentExtras) c117901.L$3;
                intent3 = (Intent) c117901.L$2;
                context3 = (Context) c117901.L$1;
                notificationOpenedProcessor3 = (NotificationOpenedProcessor) c117901.L$0;
                wre.m54934b(obj);
                context2 = context3;
                notificationOpenedProcessor2 = notificationOpenedProcessor3;
                intent2 = intent3;
                Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                if (intent2.getExtras() != null) {
                    Logging.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                }
                if (!z) {
                    if (context2 instanceof Activity) {
                        sq8.m48646e(notificationIntentExtras2);
                        JSONArray dataArray = notificationIntentExtras2.getDataArray();
                        c117901.L$0 = null;
                        c117901.L$1 = null;
                        c117901.L$2 = null;
                        c117901.L$3 = null;
                        c117901.L$4 = null;
                        c117901.label = 4;
                        if (notificationOpenedProcessor2._lifecycleService.notificationOpened((Activity) context2, dataArray, c117901) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    Logging.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                }
                return y3i.f54824a;
            }
            boolean z2 = c117901.Z$0;
            String str2 = (String) c117901.L$3;
            Intent intent4 = (Intent) c117901.L$2;
            Context context4 = (Context) c117901.L$1;
            notificationOpenedProcessor = (NotificationOpenedProcessor) c117901.L$0;
            wre.m54934b(obj);
            booleanExtra = z2;
            context = context4;
            objProcessToOpenIntent = obj;
            stringExtra = str2;
            intent = intent4;
        }
        notificationIntentExtras = (NotificationIntentExtras) objProcessToOpenIntent;
        if (notificationIntentExtras == null) {
            return y3i.f54824a;
        }
        c117901.L$0 = notificationOpenedProcessor;
        c117901.L$1 = context;
        c117901.L$2 = intent;
        c117901.L$3 = stringExtra;
        c117901.L$4 = notificationIntentExtras;
        c117901.Z$0 = booleanExtra;
        c117901.label = 2;
        if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, c117901) != objM51918f) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, n64 n64Var) throws JSONException {
        C117911 c117911;
        NotificationOpenedProcessor notificationOpenedProcessor;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArrayWrapInJsonArray;
        if (n64Var instanceof C117911) {
            c117911 = (C117911) n64Var;
            int i = c117911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117911.label = i - Integer.MIN_VALUE;
            } else {
                c117911 = new C117911(n64Var);
            }
        }
        Object obj = c117911.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117911.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            try {
                jSONObject2 = new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA));
                try {
                } catch (JSONException e) {
                    e = e;
                    notificationOpenedProcessor = this;
                    jSONObject = jSONObject2;
                    e.printStackTrace();
                    jSONArrayWrapInJsonArray = null;
                    if (str != null) {
                    }
                    sq8.m48646e(jSONArrayWrapInJsonArray);
                    sq8.m48646e(jSONObject);
                    return new NotificationIntentExtras(jSONArrayWrapInJsonArray, jSONObject);
                }
            } catch (JSONException e2) {
                e = e2;
                notificationOpenedProcessor = this;
                jSONObject = null;
            }
            if (!(context instanceof Activity)) {
                Logging.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                notificationOpenedProcessor = this;
                jSONObject = jSONObject2;
                jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
                intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
                jSONArrayWrapInJsonArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
                if (str != null) {
                    sq8.m48646e(jSONArrayWrapInJsonArray);
                    c117911.L$0 = jSONArrayWrapInJsonArray;
                    c117911.L$1 = jSONObject;
                    c117911.L$2 = null;
                    c117911.L$3 = null;
                    c117911.label = 2;
                    if (notificationOpenedProcessor.addChildNotifications(jSONArrayWrapInJsonArray, str, c117911) == objM51918f) {
                        return objM51918f;
                    }
                }
                sq8.m48646e(jSONArrayWrapInJsonArray);
                sq8.m48646e(jSONObject);
                return new NotificationIntentExtras(jSONArrayWrapInJsonArray, jSONObject);
            }
            c117911.L$0 = this;
            c117911.L$1 = intent;
            c117911.L$2 = str;
            c117911.L$3 = jSONObject2;
            c117911.label = 1;
            Object objCanOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, c117911);
            if (objCanOpenNotification == objM51918f) {
                return objM51918f;
            }
            notificationOpenedProcessor = this;
            obj = objCanOpenNotification;
            jSONObject = jSONObject2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject = (JSONObject) c117911.L$1;
                jSONArrayWrapInJsonArray = (JSONArray) c117911.L$0;
                wre.m54934b(obj);
                sq8.m48646e(jSONArrayWrapInJsonArray);
                sq8.m48646e(jSONObject);
                return new NotificationIntentExtras(jSONArrayWrapInJsonArray, jSONObject);
            }
            jSONObject = (JSONObject) c117911.L$3;
            str = (String) c117911.L$2;
            intent = (Intent) c117911.L$1;
            notificationOpenedProcessor = (NotificationOpenedProcessor) c117911.L$0;
            try {
                wre.m54934b(obj);
            } catch (JSONException e3) {
                e = e3;
                e.printStackTrace();
                jSONArrayWrapInJsonArray = null;
                if (str != null) {
                }
                sq8.m48646e(jSONArrayWrapInJsonArray);
                sq8.m48646e(jSONObject);
                return new NotificationIntentExtras(jSONArrayWrapInJsonArray, jSONObject);
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
        intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
        jSONArrayWrapInJsonArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
        if (str != null) {
        }
        sq8.m48646e(jSONArrayWrapInJsonArray);
        sq8.m48646e(jSONObject);
        return new NotificationIntentExtras(jSONArrayWrapInJsonArray, jSONObject);
    }

    @Override // com.onesignal.notifications.internal.open.INotificationOpenedProcessor
    public Object processFromContext(Context context, Intent intent, n64 n64Var) throws JSONException {
        if (!isOneSignalIntent(intent)) {
            return y3i.f54824a;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object objProcessIntent = processIntent(context, intent, n64Var);
        return objProcessIntent == uq8.m51918f() ? objProcessIntent : y3i.f54824a;
    }
}
