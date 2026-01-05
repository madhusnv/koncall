package com.onesignal.notifications.internal.display.impl;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.MainThreadException;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.C11728R;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.c64;
import p001o.e3c;
import p001o.e9g;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o2c;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationDisplayer implements INotificationDisplayer {
    private final IApplicationService _applicationService;
    private final INotificationDisplayBuilder _notificationDisplayBuilder;
    private final INotificationLimitManager _notificationLimitManager;
    private final ISummaryNotificationDisplayer _summaryNotificationDisplayer;

    @l75(m36647c = "com.onesignal.notifications.internal.display.impl.NotificationDisplayer", m36648f = "NotificationDisplayer.kt", m36649l = {Opcodes.FNEG, Opcodes.I2L, Opcodes.F2L}, m36650m = "showNotification")
    /* renamed from: com.onesignal.notifications.internal.display.impl.NotificationDisplayer$showNotification$1 */
    public static final class C117621 extends o64 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C117621(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationDisplayer.this.showNotification(null, this);
        }
    }

    public NotificationDisplayer(IApplicationService iApplicationService, INotificationLimitManager iNotificationLimitManager, ISummaryNotificationDisplayer iSummaryNotificationDisplayer, INotificationDisplayBuilder iNotificationDisplayBuilder) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationLimitManager, "_notificationLimitManager");
        sq8.m48649h(iSummaryNotificationDisplayer, "_summaryNotificationDisplayer");
        sq8.m48649h(iNotificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = iApplicationService;
        this._notificationLimitManager = iNotificationLimitManager;
        this._summaryNotificationDisplayer = iSummaryNotificationDisplayer;
        this._notificationDisplayBuilder = iNotificationDisplayBuilder;
    }

    private final void addBackgroundImage(JSONObject jSONObject, o2c.C15694f c15694f) throws JSONException, Resources.NotFoundException {
        Bitmap bitmapFromAssetsOrResourceName;
        JSONObject jSONObject2;
        String string;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Logging.verbose$default("Cannot use background images in notifications for device on version: " + i, null, 2, null);
            return;
        }
        String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            jSONObject2 = new JSONObject(strOptString);
            bitmapFromAssetsOrResourceName = getBitmap(jSONObject2.optString("img", null));
        } else {
            bitmapFromAssetsOrResourceName = null;
            jSONObject2 = null;
        }
        if (bitmapFromAssetsOrResourceName == null) {
            bitmapFromAssetsOrResourceName = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmapFromAssetsOrResourceName != null) {
            Context currentContext = getCurrentContext();
            sq8.m48646e(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), C11728R.layout.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(C11728R.id.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(jSONObject));
            remoteViews.setTextViewText(C11728R.id.os_bgimage_notif_body, jSONObject.optString("alert"));
            JSONObject jSONObject3 = jSONObject2;
            setTextColor(remoteViews, jSONObject3, C11728R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject3, C11728R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                sq8.m48646e(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    sq8.m48646e(contextResources2);
                    string = contextResources2.getString(identifier);
                } else {
                    string = null;
                }
            } else {
                string = jSONObject2.getString("img_align");
            }
            if (sq8.m48644c("right", string)) {
                remoteViews.setViewPadding(C11728R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(C11728R.id.os_bgimage_notif_bgimage_right_aligned, bitmapFromAssetsOrResourceName);
                remoteViews.setViewVisibility(C11728R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(C11728R.id.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(C11728R.id.os_bgimage_notif_bgimage, bitmapFromAssetsOrResourceName);
            }
            sq8.m48646e(c15694f);
            c15694f.m41415j(remoteViews);
            c15694f.m41401E(null);
        }
    }

    private final void applyNotificationExtender(NotificationGenerationJob notificationGenerationJob, o2c.C15694f c15694f) {
        if (notificationGenerationJob.hasExtender()) {
            try {
                Field declaredField = o2c.C15694f.class.getDeclaredField("S");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(c15694f);
                sq8.m48647f(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                notificationGenerationJob.setOrgFlags(Integer.valueOf(notification.flags));
                notificationGenerationJob.setOrgSound(notification.sound);
                sq8.m48646e(c15694f);
                com.onesignal.notifications.internal.Notification notification2 = notificationGenerationJob.getNotification();
                sq8.m48646e(notification2);
                o2c.InterfaceC15695g notificationExtender = notification2.getNotificationExtender();
                sq8.m48646e(notificationExtender);
                c15694f.m41410d(notificationExtender);
                Object obj2 = declaredField.get(c15694f);
                sq8.m48647f(obj2, "null cannot be cast to non-null type android.app.Notification");
                Notification notification3 = (Notification) obj2;
                Field declaredField2 = o2c.C15694f.class.getDeclaredField("f");
                declaredField2.setAccessible(true);
                CharSequence charSequence = (CharSequence) declaredField2.get(c15694f);
                Field declaredField3 = o2c.C15694f.class.getDeclaredField("e");
                declaredField3.setAccessible(true);
                CharSequence charSequence2 = (CharSequence) declaredField3.get(c15694f);
                notificationGenerationJob.setOverriddenBodyFromExtender(charSequence);
                notificationGenerationJob.setOverriddenTitleFromExtender(charSequence2);
                if (notificationGenerationJob.isRestoring()) {
                    return;
                }
                notificationGenerationJob.setOverriddenFlags(Integer.valueOf(notification3.flags));
                notificationGenerationJob.setOverriddenSound(notification3.sound);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(o2c.C15694f c15694f, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, int i) {
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = intentGeneratorForAttachingToNotifications.getNewBaseIntent(i).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
        sq8.m48648g(intentPutExtra, "intentGenerator.getNewBa…TA, gcmBundle.toString())");
        PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(iNextInt, intentPutExtra);
        sq8.m48646e(c15694f);
        c15694f.m41416k(newActionPendingIntent);
        c15694f.m41420o(this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i)));
        Notification notificationM41409c = c15694f.m41409c();
        sq8.m48648g(notificationM41409c, "notifBuilder.build()");
        return notificationM41409c;
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

    private final Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i, String str, String str2) {
        Integer numSafeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (numSafeGetColorFromHex != null) {
            remoteViews.setTextColor(i, numSafeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        sq8.m48646e(contextResources);
        int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i, c64.getColor(getCurrentContext(), identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(NotificationGenerationJob notificationGenerationJob, n64 n64Var) {
        C117621 c117621;
        JSONObject jsonPayload;
        String str;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder;
        ArrayList<StatusBarNotification> arrayList;
        NotificationDisplayer notificationDisplayer;
        NotificationGenerationJob notificationGenerationJob2;
        int i;
        o2c.C15694f c15694f;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications;
        Notification notificationCreateGenericPendingIntentsForNotif;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder2;
        NotificationDisplayer notificationDisplayer2;
        if (n64Var instanceof C117621) {
            c117621 = (C117621) n64Var;
            int i2 = c117621.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c117621.label = i2 - Integer.MIN_VALUE;
            } else {
                c117621 = new C117621(n64Var);
            }
        }
        C117621 c1176212 = c117621;
        Object obj = c1176212.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c1176212.label;
        boolean zAreNotificationsEnabled = true;
        if (i3 == 0) {
            wre.m54934b(obj);
            int androidId = notificationGenerationJob.getAndroidId();
            jsonPayload = notificationGenerationJob.getJsonPayload();
            sq8.m48646e(jsonPayload);
            String strSafeString = JSONObjectExtensionsKt.safeString(jsonPayload, "grp");
            IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2 = new IntentGeneratorForAttachingToNotifications(getCurrentContext());
            new ArrayList();
            NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
            ArrayList<StatusBarNotification> activeGrouplessNotifications = notificationHelper.getActiveGrouplessNotifications(getCurrentContext());
            if (strSafeString != null || activeGrouplessNotifications.size() < 3) {
                str = strSafeString;
            } else {
                notificationHelper.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
                str = NotificationHelper.GROUPLESS_SUMMARY_KEY;
            }
            NotificationDisplayBuilder.OneSignalNotificationBuilder baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob);
            o2c.C15694f compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
            this._notificationDisplayBuilder.addNotificationActionButtons(jsonPayload, intentGeneratorForAttachingToNotifications2, compatBuilder, androidId, null);
            try {
                addBackgroundImage(jsonPayload, compatBuilder);
            } catch (Throwable th) {
                Logging.error("Could not set background notification image!", th);
            }
            applyNotificationExtender(notificationGenerationJob, compatBuilder);
            if (notificationGenerationJob.isRestoring()) {
                this._notificationDisplayBuilder.removeNotifyOptions(compatBuilder);
            }
            int i4 = str == null ? 1 : 2;
            INotificationLimitManager iNotificationLimitManager = this._notificationLimitManager;
            c1176212.L$0 = this;
            c1176212.L$1 = notificationGenerationJob;
            c1176212.L$2 = jsonPayload;
            c1176212.L$3 = str;
            c1176212.L$4 = intentGeneratorForAttachingToNotifications2;
            c1176212.L$5 = activeGrouplessNotifications;
            c1176212.L$6 = baseOneSignalNotificationBuilder;
            c1176212.L$7 = compatBuilder;
            c1176212.I$0 = androidId;
            c1176212.label = 1;
            if (iNotificationLimitManager.clearOldestOverLimit(i4, c1176212) == objM51918f) {
                return objM51918f;
            }
            oneSignalNotificationBuilder = baseOneSignalNotificationBuilder;
            arrayList = activeGrouplessNotifications;
            notificationDisplayer = this;
            notificationGenerationJob2 = notificationGenerationJob;
            i = androidId;
            c15694f = compatBuilder;
            intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications2;
        } else {
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c1176212.I$0;
                notificationCreateGenericPendingIntentsForNotif = (Notification) c1176212.L$2;
                oneSignalNotificationBuilder2 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) c1176212.L$1;
                notificationDisplayer2 = (NotificationDisplayer) c1176212.L$0;
                wre.m54934b(obj);
                oneSignalNotificationBuilder = oneSignalNotificationBuilder2;
                notificationDisplayer = notificationDisplayer2;
                notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, notificationCreateGenericPendingIntentsForNotif);
                Context currentContext = notificationDisplayer.getCurrentContext();
                sq8.m48646e(currentContext);
                e3c.m24211d(currentContext).m24217f(i, notificationCreateGenericPendingIntentsForNotif);
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationHelper notificationHelper2 = NotificationHelper.INSTANCE;
                    Context currentContext2 = notificationDisplayer.getCurrentContext();
                    sq8.m48646e(currentContext2);
                    zAreNotificationsEnabled = notificationHelper2.areNotificationsEnabled(currentContext2, notificationCreateGenericPendingIntentsForNotif.getChannelId());
                }
                return ml1.m39301a(zAreNotificationsEnabled);
            }
            i = c1176212.I$0;
            c15694f = (o2c.C15694f) c1176212.L$7;
            NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder3 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) c1176212.L$6;
            ArrayList<StatusBarNotification> arrayList2 = (ArrayList) c1176212.L$5;
            intentGeneratorForAttachingToNotifications = (IntentGeneratorForAttachingToNotifications) c1176212.L$4;
            str = (String) c1176212.L$3;
            jsonPayload = (JSONObject) c1176212.L$2;
            NotificationGenerationJob notificationGenerationJob3 = (NotificationGenerationJob) c1176212.L$1;
            NotificationDisplayer notificationDisplayer3 = (NotificationDisplayer) c1176212.L$0;
            wre.m54934b(obj);
            oneSignalNotificationBuilder = oneSignalNotificationBuilder3;
            arrayList = arrayList2;
            notificationDisplayer = notificationDisplayer3;
            notificationGenerationJob2 = notificationGenerationJob3;
        }
        if (str == null) {
            notificationCreateGenericPendingIntentsForNotif = notificationDisplayer.createGenericPendingIntentsForNotif(c15694f, intentGeneratorForAttachingToNotifications, jsonPayload, i);
            notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, notificationCreateGenericPendingIntentsForNotif);
            Context currentContext3 = notificationDisplayer.getCurrentContext();
            sq8.m48646e(currentContext3);
            e3c.m24211d(currentContext3).m24217f(i, notificationCreateGenericPendingIntentsForNotif);
            if (Build.VERSION.SDK_INT >= 26) {
            }
            return ml1.m39301a(zAreNotificationsEnabled);
        }
        notificationDisplayer._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(c15694f, intentGeneratorForAttachingToNotifications, jsonPayload, str, i);
        Notification notificationCreateSingleNotificationBeforeSummaryBuilder = notificationDisplayer._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(notificationGenerationJob2, c15694f);
        if (sq8.m48644c(str, NotificationHelper.GROUPLESS_SUMMARY_KEY)) {
            ISummaryNotificationDisplayer iSummaryNotificationDisplayer = notificationDisplayer._summaryNotificationDisplayer;
            int size = arrayList.size() + 1;
            int groupAlertBehavior = notificationDisplayer._notificationDisplayBuilder.getGroupAlertBehavior();
            c1176212.L$0 = notificationDisplayer;
            c1176212.L$1 = oneSignalNotificationBuilder;
            c1176212.L$2 = notificationCreateSingleNotificationBeforeSummaryBuilder;
            c1176212.L$3 = null;
            c1176212.L$4 = null;
            c1176212.L$5 = null;
            c1176212.L$6 = null;
            c1176212.L$7 = null;
            c1176212.I$0 = i;
            c1176212.label = 2;
            if (iSummaryNotificationDisplayer.createGrouplessSummaryNotification(notificationGenerationJob2, intentGeneratorForAttachingToNotifications, size, groupAlertBehavior, c1176212) == objM51918f) {
                return objM51918f;
            }
        } else {
            ISummaryNotificationDisplayer iSummaryNotificationDisplayer2 = notificationDisplayer._summaryNotificationDisplayer;
            int groupAlertBehavior2 = notificationDisplayer._notificationDisplayBuilder.getGroupAlertBehavior();
            c1176212.L$0 = notificationDisplayer;
            c1176212.L$1 = oneSignalNotificationBuilder;
            c1176212.L$2 = notificationCreateSingleNotificationBeforeSummaryBuilder;
            c1176212.L$3 = null;
            c1176212.L$4 = null;
            c1176212.L$5 = null;
            c1176212.L$6 = null;
            c1176212.L$7 = null;
            c1176212.I$0 = i;
            c1176212.label = 3;
            if (iSummaryNotificationDisplayer2.createSummaryNotification(notificationGenerationJob2, oneSignalNotificationBuilder, groupAlertBehavior2, c1176212) == objM51918f) {
                return objM51918f;
            }
        }
        oneSignalNotificationBuilder2 = oneSignalNotificationBuilder;
        notificationDisplayer2 = notificationDisplayer;
        notificationCreateGenericPendingIntentsForNotif = notificationCreateSingleNotificationBeforeSummaryBuilder;
        oneSignalNotificationBuilder = oneSignalNotificationBuilder2;
        notificationDisplayer = notificationDisplayer2;
        notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, notificationCreateGenericPendingIntentsForNotif);
        Context currentContext32 = notificationDisplayer.getCurrentContext();
        sq8.m48646e(currentContext32);
        e3c.m24211d(currentContext32).m24217f(i, notificationCreateGenericPendingIntentsForNotif);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        return ml1.m39301a(zAreNotificationsEnabled);
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayer
    public Object displayNotification(NotificationGenerationJob notificationGenerationJob, n64 n64Var) {
        isRunningOnMainThreadCheck();
        return showNotification(notificationGenerationJob, n64Var);
    }

    public final y3i isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new MainThreadException("Process for showing a notification should never been done on Main Thread!");
        }
        return y3i.f54824a;
    }
}
