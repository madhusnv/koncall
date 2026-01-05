package ai.salesmax.onesignal;

import ai.salesmax.MainActivity;
import ai.salesmax.model.ActiveChatChannelConfig;
import ai.salesmax.onesignal.OneSignalSubscriptionManager;
import ai.salesmax.ui.service.NotificationReceiver;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.OneSignal;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.LogLevel;
import com.onesignal.notifications.IDisplayableNotification;
import com.onesignal.notifications.INotification;
import com.onesignal.notifications.INotificationClickEvent;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationClickResult;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.user.subscriptions.IPushSubscriptionObserver;
import com.onesignal.user.subscriptions.PushSubscriptionChangedState;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONObject;
import p001o.ayh;
import p001o.e66;
import p001o.hq9;
import p001o.i5f;
import p001o.n64;
import p001o.o83;
import p001o.q74;

/* loaded from: classes.dex */
public class OneSignalSubscriptionManager {
    private static final String LOG_TAG = "OneSignalSubscriptionManager";
    static String ONESIGNAL_APP_ID = "ae3776e3-ea29-498d-847a-89696b39c3a7";
    private static OneSignalSubscriptionManager _instance = null;
    private static boolean permissionSet = false;
    private boolean isAlreadyInitialized = false;

    /* renamed from: ai.salesmax.onesignal.OneSignalSubscriptionManager$a */
    public class C0273a implements n64 {
        public C0273a() {
        }

        @Override // p001o.n64
        public q74 getContext() {
            return e66.f21035a;
        }

        @Override // p001o.n64
        public void resumeWith(Object obj) {
            if (obj instanceof Boolean) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                StringBuilder sb = new StringBuilder();
                sb.append("Permission request result: ");
                sb.append(zBooleanValue);
            }
        }
    }

    private OneSignalSubscriptionManager(Context context) {
        initialize(context);
    }

    public static Optional<OneSignalSubscriptionManager> getInstance() {
        return Optional.ofNullable(_instance);
    }

    private void initialize(final Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("Value of onesignal initialization: ");
        sb.append(this.isAlreadyInitialized);
        if (this.isAlreadyInitialized) {
            return;
        }
        OneSignal.getDebug().setLogLevel(LogLevel.VERBOSE);
        OneSignal.initWithContext(context, ONESIGNAL_APP_ID);
        OneSignal.getNotifications().mo68768addClickListener(new INotificationClickListener() { // from class: o.zcc
            @Override // com.onesignal.notifications.INotificationClickListener
            public final void onClick(INotificationClickEvent iNotificationClickEvent) {
                this.f56936a.lambda$initialize$5(context, iNotificationClickEvent);
            }
        });
        OneSignal.getNotifications().mo68769addForegroundLifecycleListener(new INotificationLifecycleListener() { // from class: o.adc
            @Override // com.onesignal.notifications.INotificationLifecycleListener
            public final void onWillDisplay(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
                this.f14538a.lambda$initialize$13(iNotificationWillDisplayEvent);
            }
        });
        this.isAlreadyInitialized = true;
    }

    public static void instance(Context context) {
        if (_instance == null) {
            synchronized (OneSignalSubscriptionManager.class) {
                if (_instance == null) {
                    _instance = new OneSignalSubscriptionManager(context);
                }
            }
        }
    }

    public static boolean isPermissionSet() {
        return permissionSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("addForegroundLifecycleListener - In Notification ");
        sb.append(str);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(335675392);
        intent.putExtra(ImagesContract.URL, str);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$1(String str, Context context, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("calling lead from notification");
        sb.append(str);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(335675392);
        intent.putExtra("lead-id-to-call", str);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$10(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        IDisplayableNotification notification = iNotificationWillDisplayEvent.getNotification();
        iNotificationWillDisplayEvent.preventDefault();
        final JSONObject additionalData = notification.getAdditionalData();
        String strOptString = additionalData.optString("notificationType");
        if (strOptString.equals("INCOMING-CHAT")) {
            if (hq9.m30994a(Optional.ofNullable(additionalData).map(new Function() { // from class: o.ucc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return OneSignalSubscriptionManager.lambda$initialize$6(additionalData, (JSONObject) obj);
                }
            }).filter(new Predicate() { // from class: o.vcc
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return OneSignalSubscriptionManager.lambda$initialize$7((String) obj);
                }
            }))) {
                notification.display();
            }
        } else if (strOptString.equals("INTERNAL-CHAT")) {
            final JSONObject jSONObjectOptJSONObject = additionalData.optJSONObject(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            if (hq9.m30994a(Optional.ofNullable(jSONObjectOptJSONObject).map(new Function() { // from class: o.wcc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return OneSignalSubscriptionManager.lambda$initialize$8(jSONObjectOptJSONObject, (JSONObject) obj);
                }
            }).filter(new Predicate() { // from class: o.xcc
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return OneSignalSubscriptionManager.lambda$initialize$9((String) obj);
                }
            }))) {
                notification.display();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$11(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$12(final INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        ayh.Z2(new o83() { // from class: o.bdc
            @Override // p001o.o83
            public final void run() {
                OneSignalSubscriptionManager.lambda$initialize$10(iNotificationWillDisplayEvent);
            }
        }).q1(new Consumer() { // from class: o.cdc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                OneSignalSubscriptionManager.lambda$initialize$11((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$13(final INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("addForegroundLifecycleListener - In Notification");
        sb.append(iNotificationWillDisplayEvent);
        scheduleTask(new Runnable() { // from class: o.fdc
            @Override // java.lang.Runnable
            public final void run() {
                OneSignalSubscriptionManager.lambda$initialize$12(iNotificationWillDisplayEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$2(INotificationClickEvent iNotificationClickEvent, final Context context) {
        JSONObject additionalData;
        INotification notification = iNotificationClickEvent.getNotification();
        INotificationClickResult result = iNotificationClickEvent.getResult();
        String launchURL = notification.getLaunchURL();
        String actionId = result.getActionId();
        if (actionId == null) {
            Optional.ofNullable(launchURL).ifPresent(new Consumer() { // from class: o.scc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    OneSignalSubscriptionManager.lambda$initialize$0(context, (String) obj);
                }
            });
            return;
        }
        if (!actionId.equals("snooze5")) {
            if (!actionId.equals("callLead") || (additionalData = notification.getAdditionalData()) == null) {
                return;
            }
            try {
                final String strOptString = additionalData.optString("linkedContactId");
                Optional.of(strOptString).ifPresent(new Consumer() { // from class: o.tcc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        OneSignalSubscriptionManager.lambda$initialize$1(strOptString, context, (String) obj);
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, (Class<?>) NotificationReceiver.class);
        intent.putExtra("notificationId", notification.getNotificationId());
        intent.putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, notification.getTitle());
        intent.putExtra(FirebaseAnalytics.Param.CONTENT, notification.getBody());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        long jCurrentTimeMillis = System.currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        if (Build.VERSION.SDK_INT < 31) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        } else if (alarmManager.canScheduleExactAlarms()) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$4(final INotificationClickEvent iNotificationClickEvent, final Context context) {
        ayh.Z2(new o83() { // from class: o.ddc
            @Override // p001o.o83
            public final void run() {
                OneSignalSubscriptionManager.lambda$initialize$2(iNotificationClickEvent, context);
            }
        }).q1(new Consumer() { // from class: o.edc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                OneSignalSubscriptionManager.lambda$initialize$3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$5(final Context context, final INotificationClickEvent iNotificationClickEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("addClickListener - In Notification");
        sb.append(iNotificationClickEvent);
        scheduleTask(new Runnable() { // from class: o.ycc
            @Override // java.lang.Runnable
            public final void run() {
                OneSignalSubscriptionManager.lambda$initialize$4(iNotificationClickEvent, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$initialize$6(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("contactId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initialize$7(String str) {
        return str.equals(ActiveChatChannelConfig.Companion.instance().getContactId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$initialize$8(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("channelId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initialize$9(String str) {
        return str.equals(ActiveChatChannelConfig.Companion.instance().getChannelId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscribe$14(PushSubscriptionChangedState pushSubscriptionChangedState) {
        if (pushSubscriptionChangedState.getPrevious().getOptedIn()) {
            return;
        }
        pushSubscriptionChangedState.getCurrent().getOptedIn();
    }

    private void scheduleTask(Runnable runnable) {
        i5f.m31600d().mo20302c(runnable);
    }

    public static void setPermissionSet(boolean z) {
        permissionSet = z;
    }

    public void subscribe(String str) {
        try {
            if (!OneSignal.getUser().getPushSubscription().getOptedIn()) {
                OneSignal.getNotifications().requestPermission(true, new C0273a());
            }
            OneSignal.setConsentGiven(true);
            if (str != null && !str.isEmpty()) {
                OneSignal.login(str);
            }
            OneSignal.getUser().getPushSubscription().addObserver(new IPushSubscriptionObserver() { // from class: o.gdc
                @Override // com.onesignal.user.subscriptions.IPushSubscriptionObserver
                public final void onPushSubscriptionChange(PushSubscriptionChangedState pushSubscriptionChangedState) {
                    OneSignalSubscriptionManager.lambda$subscribe$14(pushSubscriptionChangedState);
                }
            });
            boolean optedIn = OneSignal.getUser().getPushSubscription().getOptedIn();
            StringBuilder sb = new StringBuilder();
            sb.append("Final subscription status: ");
            sb.append(optedIn);
        } catch (Exception unused) {
        }
    }
}
