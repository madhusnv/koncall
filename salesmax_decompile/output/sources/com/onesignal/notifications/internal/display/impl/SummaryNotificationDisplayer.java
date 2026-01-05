package com.onesignal.notifications.internal.display.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.TokenParser;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
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
public final class SummaryNotificationDisplayer implements ISummaryNotificationDisplayer {
    private final IApplicationService _applicationService;
    private final INotificationRepository _dataController;
    private final INotificationDisplayBuilder _notificationDisplayBuilder;

    @l75(m36647c = "com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer", m36648f = "SummaryNotificationDisplayer.kt", m36649l = {267}, m36650m = "createGrouplessSummaryNotification")
    /* renamed from: com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer$createGrouplessSummaryNotification$1 */
    public static final class C117631 extends o64 {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C117631(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SummaryNotificationDisplayer.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer", m36648f = "SummaryNotificationDisplayer.kt", m36649l = {Opcodes.DDIV, 116, Opcodes.DNEG}, m36650m = "createSummaryNotification")
    /* renamed from: com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer$createSummaryNotification$1 */
    public static final class C117641 extends o64 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C117641(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SummaryNotificationDisplayer.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public SummaryNotificationDisplayer(IApplicationService iApplicationService, INotificationRepository iNotificationRepository, INotificationDisplayBuilder iNotificationDisplayBuilder) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationRepository, "_dataController");
        sq8.m48649h(iNotificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = iApplicationService;
        this._dataController = iNotificationRepository;
        this._notificationDisplayBuilder = iNotificationDisplayBuilder;
    }

    private final Intent createBaseSummaryIntent(int i, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String str) {
        Intent intentPutExtra = intentGeneratorForAttachingToNotifications.getNewBaseIntent(i).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("summary", str);
        sq8.m48648g(intentPutExtra, "intentGenerator.getNewBa…utExtra(\"summary\", group)");
        return intentPutExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public void createGenericPendingIntentsForGroup(o2c.C15694f c15694f, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String str, int i) {
        sq8.m48649h(intentGeneratorForAttachingToNotifications, "intentGenerator");
        sq8.m48649h(jSONObject, "gcmBundle");
        sq8.m48649h(str, "group");
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = intentGeneratorForAttachingToNotifications.getNewBaseIntent(i).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("grp", str);
        sq8.m48648g(intentPutExtra, "intentGenerator.getNewBa…)).putExtra(\"grp\", group)");
        PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(iNextInt, intentPutExtra);
        sq8.m48646e(c15694f);
        c15694f.m41416k(newActionPendingIntent);
        INotificationDisplayBuilder iNotificationDisplayBuilder = this._notificationDisplayBuilder;
        int iNextInt2 = secureRandom.nextInt();
        Intent intentPutExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i).putExtra("grp", str);
        sq8.m48648g(intentPutExtra2, "_notificationDisplayBuil…d).putExtra(\"grp\", group)");
        c15694f.m41420o(iNotificationDisplayBuilder.getNewDismissActionPendingIntent(iNextInt2, intentPutExtra2));
        c15694f.m41422q(str);
        try {
            c15694f.m41423r(this._notificationDisplayBuilder.getGroupAlertBehavior());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(NotificationGenerationJob notificationGenerationJob, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, int i, int i2, n64 n64Var) {
        C117631 c117631;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        SummaryNotificationDisplayer summaryNotificationDisplayer;
        String str2;
        NotificationGenerationJob notificationGenerationJob2;
        int i3;
        if (n64Var instanceof C117631) {
            c117631 = (C117631) n64Var;
            int i4 = c117631.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c117631.label = i4 - Integer.MIN_VALUE;
            } else {
                c117631 = new C117631(n64Var);
            }
        }
        Object obj = c117631.result;
        Object objM51918f = uq8.m51918f();
        int i5 = c117631.label;
        if (i5 == 0) {
            wre.m54934b(obj);
            jsonPayload = notificationGenerationJob.getJsonPayload();
            sq8.m48646e(jsonPayload);
            secureRandom = new SecureRandom();
            str = i + " new messages";
            INotificationRepository iNotificationRepository = this._dataController;
            c117631.L$0 = this;
            c117631.L$1 = notificationGenerationJob;
            c117631.L$2 = intentGeneratorForAttachingToNotifications;
            c117631.L$3 = jsonPayload;
            c117631.L$4 = secureRandom;
            c117631.L$5 = NotificationHelper.GROUPLESS_SUMMARY_KEY;
            c117631.L$6 = str;
            c117631.I$0 = i;
            c117631.I$1 = i2;
            c117631.I$2 = NotificationHelper.GROUPLESS_SUMMARY_ID;
            c117631.label = 1;
            if (iNotificationRepository.createSummaryNotification(NotificationHelper.GROUPLESS_SUMMARY_ID, NotificationHelper.GROUPLESS_SUMMARY_KEY, c117631) == objM51918f) {
                return objM51918f;
            }
            summaryNotificationDisplayer = this;
            str2 = NotificationHelper.GROUPLESS_SUMMARY_KEY;
            notificationGenerationJob2 = notificationGenerationJob;
            i3 = -718463522;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c117631.I$2;
            i2 = c117631.I$1;
            i = c117631.I$0;
            String str3 = (String) c117631.L$6;
            str2 = (String) c117631.L$5;
            secureRandom = (SecureRandom) c117631.L$4;
            jsonPayload = (JSONObject) c117631.L$3;
            IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2 = (IntentGeneratorForAttachingToNotifications) c117631.L$2;
            notificationGenerationJob2 = (NotificationGenerationJob) c117631.L$1;
            summaryNotificationDisplayer = (SummaryNotificationDisplayer) c117631.L$0;
            wre.m54934b(obj);
            str = str3;
            intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications2;
        }
        PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), summaryNotificationDisplayer.createBaseSummaryIntent(i3, intentGeneratorForAttachingToNotifications, jsonPayload, str2));
        INotificationDisplayBuilder iNotificationDisplayBuilder = summaryNotificationDisplayer._notificationDisplayBuilder;
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = summaryNotificationDisplayer._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        sq8.m48648g(intentPutExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
        PendingIntent newDismissActionPendingIntent = iNotificationDisplayBuilder.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
        o2c.C15694f compatBuilder = summaryNotificationDisplayer._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob2).getCompatBuilder();
        if (notificationGenerationJob2.getOverriddenSound() != null) {
            sq8.m48646e(compatBuilder);
            compatBuilder.m41400D(notificationGenerationJob2.getOverriddenSound());
        }
        if (notificationGenerationJob2.getOverriddenFlags() != null) {
            sq8.m48646e(compatBuilder);
            Integer overriddenFlags = notificationGenerationJob2.getOverriddenFlags();
            sq8.m48646e(overriddenFlags);
            compatBuilder.m41419n(overriddenFlags.intValue());
        }
        sq8.m48646e(compatBuilder);
        o2c.C15694f c15694fM41420o = compatBuilder.m41416k(newActionPendingIntent).m41420o(newDismissActionPendingIntent);
        Context currentContext = summaryNotificationDisplayer.getCurrentContext();
        sq8.m48646e(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = summaryNotificationDisplayer.getCurrentContext();
        sq8.m48646e(currentContext2);
        c15694fM41420o.m41418m(packageManager.getApplicationLabel(currentContext2.getApplicationInfo())).m41417l(str).m41428w(i).m41399C(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultSmallIconId()).m41425t(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultLargeIcon()).m41430y(true).m41412g(false).m41422q(str2).m41424s(true);
        try {
            compatBuilder.m41423r(i2);
        } catch (Throwable unused) {
        }
        o2c.C15696h c15696h = new o2c.C15696h();
        c15696h.m41438i(str);
        compatBuilder.m41401E(c15696h);
        Notification notificationM41409c = compatBuilder.m41409c();
        sq8.m48648g(notificationM41409c, "summaryBuilder.build()");
        Context currentContext3 = summaryNotificationDisplayer.getCurrentContext();
        sq8.m48646e(currentContext3);
        e3c.m24211d(currentContext3).m24217f(i3, notificationM41409c);
        return y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public Notification createSingleNotificationBeforeSummaryBuilder(NotificationGenerationJob notificationGenerationJob, o2c.C15694f c15694f) {
        sq8.m48649h(notificationGenerationJob, "notificationJob");
        sq8.m48646e(c15694f);
        Notification notificationM41409c = c15694f.m41409c();
        sq8.m48648g(notificationM41409c, "notifBuilder!!.build()");
        return notificationM41409c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0247 A[EDGE_INSN: B:114:0x0247->B:54:0x0247 BREAK  A[LOOP:0: B:35:0x01ca->B:53:0x023e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(NotificationGenerationJob notificationGenerationJob, NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder, int i, n64 n64Var) {
        C117641 c117641;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications;
        PendingIntent newDismissActionPendingIntent;
        NotificationGenerationJob notificationGenerationJob2;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder2;
        int i2;
        JSONObject jSONObject;
        boolean z;
        SecureRandom secureRandom;
        String str;
        SummaryNotificationDisplayer summaryNotificationDisplayer;
        PendingIntent pendingIntent;
        SecureRandom secureRandom2;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder3;
        JSONObject jSONObject2;
        String str2;
        NotificationGenerationJob notificationGenerationJob3;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2;
        Integer num;
        int i3;
        JSONObject jSONObject3;
        NotificationGenerationJob notificationGenerationJob4;
        String str3;
        Integer num2;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications3;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder4;
        boolean z2;
        SummaryNotificationDisplayer summaryNotificationDisplayer2;
        int i4;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder5;
        Iterator it;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder6;
        String str4;
        int i5;
        PendingIntent pendingIntent2;
        PendingIntent newActionPendingIntent;
        Notification notificationM41409c;
        String str5;
        String string;
        int i6;
        PendingIntent pendingIntent3;
        if (n64Var instanceof C117641) {
            c117641 = (C117641) n64Var;
            int i7 = c117641.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c117641.label = i7 - Integer.MIN_VALUE;
            } else {
                c117641 = new C117641(n64Var);
            }
        }
        Object objListNotificationsForGroup = c117641.result;
        Object objM51918f = uq8.m51918f();
        int i8 = c117641.label;
        if (i8 == 0) {
            wre.m54934b(objListNotificationsForGroup);
            boolean zIsRestoring = notificationGenerationJob.isRestoring();
            JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
            sq8.m48646e(jsonPayload);
            Context currentContext = getCurrentContext();
            sq8.m48646e(currentContext);
            intentGeneratorForAttachingToNotifications = new IntentGeneratorForAttachingToNotifications(currentContext);
            String strOptString = jsonPayload.optString("grp", null);
            SecureRandom secureRandom3 = new SecureRandom();
            INotificationDisplayBuilder iNotificationDisplayBuilder = this._notificationDisplayBuilder;
            int iNextInt = secureRandom3.nextInt();
            Intent intentPutExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", strOptString);
            sq8.m48648g(intentPutExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
            newDismissActionPendingIntent = iNotificationDisplayBuilder.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
            INotificationRepository iNotificationRepository = this._dataController;
            sq8.m48648g(strOptString, "group");
            c117641.L$0 = this;
            notificationGenerationJob2 = notificationGenerationJob;
            c117641.L$1 = notificationGenerationJob2;
            oneSignalNotificationBuilder2 = oneSignalNotificationBuilder;
            c117641.L$2 = oneSignalNotificationBuilder2;
            c117641.L$3 = jsonPayload;
            c117641.L$4 = intentGeneratorForAttachingToNotifications;
            c117641.L$5 = strOptString;
            c117641.L$6 = secureRandom3;
            c117641.L$7 = newDismissActionPendingIntent;
            i2 = i;
            c117641.I$0 = i2;
            c117641.Z$0 = zIsRestoring;
            c117641.label = 1;
            Object androidIdForGroup = iNotificationRepository.getAndroidIdForGroup(strOptString, true, c117641);
            if (androidIdForGroup == objM51918f) {
                return objM51918f;
            }
            jSONObject = jsonPayload;
            z = zIsRestoring;
            objListNotificationsForGroup = androidIdForGroup;
            secureRandom = secureRandom3;
            str = strOptString;
            summaryNotificationDisplayer = this;
        } else {
            if (i8 != 1) {
                if (i8 == 2) {
                    z = c117641.Z$0;
                    i3 = c117641.I$0;
                    num2 = (Integer) c117641.L$8;
                    newDismissActionPendingIntent = (PendingIntent) c117641.L$7;
                    secureRandom = (SecureRandom) c117641.L$6;
                    str3 = (String) c117641.L$5;
                    intentGeneratorForAttachingToNotifications3 = (IntentGeneratorForAttachingToNotifications) c117641.L$4;
                    jSONObject3 = (JSONObject) c117641.L$3;
                    oneSignalNotificationBuilder4 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) c117641.L$2;
                    notificationGenerationJob4 = (NotificationGenerationJob) c117641.L$1;
                    summaryNotificationDisplayer = (SummaryNotificationDisplayer) c117641.L$0;
                    wre.m54934b(objListNotificationsForGroup);
                    oneSignalNotificationBuilder3 = oneSignalNotificationBuilder4;
                    num = num2;
                    notificationGenerationJob3 = notificationGenerationJob4;
                    JSONObject jSONObject4 = jSONObject3;
                    i2 = i3;
                    pendingIntent = newDismissActionPendingIntent;
                    secureRandom2 = secureRandom;
                    str2 = str3;
                    intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications3;
                    jSONObject2 = jSONObject4;
                    INotificationRepository iNotificationRepository2 = summaryNotificationDisplayer._dataController;
                    sq8.m48648g(str2, "group");
                    c117641.L$0 = summaryNotificationDisplayer;
                    c117641.L$1 = notificationGenerationJob3;
                    c117641.L$2 = oneSignalNotificationBuilder3;
                    c117641.L$3 = jSONObject2;
                    c117641.L$4 = intentGeneratorForAttachingToNotifications2;
                    c117641.L$5 = str2;
                    c117641.L$6 = secureRandom2;
                    c117641.L$7 = pendingIntent;
                    c117641.L$8 = num;
                    c117641.I$0 = i2;
                    c117641.Z$0 = z;
                    c117641.label = 3;
                    objListNotificationsForGroup = iNotificationRepository2.listNotificationsForGroup(str2, c117641);
                    if (objListNotificationsForGroup == objM51918f) {
                        return objM51918f;
                    }
                    z2 = z;
                    summaryNotificationDisplayer2 = summaryNotificationDisplayer;
                    i4 = i2;
                    oneSignalNotificationBuilder5 = oneSignalNotificationBuilder3;
                    ArrayList arrayList = new ArrayList();
                    it = ((List) objListNotificationsForGroup).iterator();
                    String fullData = null;
                    while (true) {
                        oneSignalNotificationBuilder6 = oneSignalNotificationBuilder5;
                        str4 = "";
                        if (it.hasNext()) {
                        }
                        oneSignalNotificationBuilder5 = oneSignalNotificationBuilder6;
                        it = it;
                        i4 = i6;
                        pendingIntent = pendingIntent3;
                    }
                    i5 = i4;
                    pendingIntent2 = pendingIntent;
                    int iNextInt2 = secureRandom2.nextInt();
                    sq8.m48646e(num);
                    int iIntValue = num.intValue();
                    sq8.m48648g(str2, "group");
                    newActionPendingIntent = intentGeneratorForAttachingToNotifications2.getNewActionPendingIntent(iNextInt2, summaryNotificationDisplayer2.createBaseSummaryIntent(iIntValue, intentGeneratorForAttachingToNotifications2, jSONObject2, str2));
                    if (z2 != 0) {
                        sq8.m48646e(oneSignalNotificationBuilder6);
                        o2c.C15694f compatBuilder = oneSignalNotificationBuilder6.getCompatBuilder();
                        sq8.m48646e(compatBuilder);
                        compatBuilder.f37619b.clear();
                        summaryNotificationDisplayer2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, intentGeneratorForAttachingToNotifications2, compatBuilder, num.intValue(), str2);
                        compatBuilder.m41416k(newActionPendingIntent).m41420o(pendingIntent2).m41430y(z2).m41412g(false).m41422q(str2).m41424s(true);
                        compatBuilder.m41423r(i5);
                        notificationM41409c = compatBuilder.m41409c();
                        sq8.m48648g(notificationM41409c, "summaryBuilder.build()");
                        summaryNotificationDisplayer2._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder6, notificationM41409c);
                    } else {
                        sq8.m48646e(oneSignalNotificationBuilder6);
                        o2c.C15694f compatBuilder2 = oneSignalNotificationBuilder6.getCompatBuilder();
                        sq8.m48646e(compatBuilder2);
                        compatBuilder2.f37619b.clear();
                        summaryNotificationDisplayer2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, intentGeneratorForAttachingToNotifications2, compatBuilder2, num.intValue(), str2);
                        compatBuilder2.m41416k(newActionPendingIntent).m41420o(pendingIntent2).m41430y(z2).m41412g(false).m41422q(str2).m41424s(true);
                        compatBuilder2.m41423r(i5);
                        notificationM41409c = compatBuilder2.m41409c();
                        sq8.m48648g(notificationM41409c, "summaryBuilder.build()");
                        summaryNotificationDisplayer2._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder6, notificationM41409c);
                    }
                    Context currentContext2 = summaryNotificationDisplayer2.getCurrentContext();
                    sq8.m48646e(currentContext2);
                    e3c.m24211d(currentContext2).m24217f(num.intValue(), notificationM41409c);
                    return y3i.f54824a;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z3 = c117641.Z$0;
                i4 = c117641.I$0;
                num = (Integer) c117641.L$8;
                pendingIntent = (PendingIntent) c117641.L$7;
                secureRandom2 = (SecureRandom) c117641.L$6;
                str2 = (String) c117641.L$5;
                intentGeneratorForAttachingToNotifications2 = (IntentGeneratorForAttachingToNotifications) c117641.L$4;
                jSONObject2 = (JSONObject) c117641.L$3;
                oneSignalNotificationBuilder5 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) c117641.L$2;
                notificationGenerationJob3 = (NotificationGenerationJob) c117641.L$1;
                summaryNotificationDisplayer2 = (SummaryNotificationDisplayer) c117641.L$0;
                wre.m54934b(objListNotificationsForGroup);
                z2 = z3;
                ArrayList arrayList2 = new ArrayList();
                it = ((List) objListNotificationsForGroup).iterator();
                String fullData2 = null;
                while (true) {
                    oneSignalNotificationBuilder6 = oneSignalNotificationBuilder5;
                    str4 = "";
                    if (it.hasNext()) {
                        break;
                    }
                    INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                    Iterator it2 = it;
                    if (z2 == 0) {
                        i6 = i4;
                        if (notificationData.getAndroidId() == notificationGenerationJob3.getAndroidId()) {
                            pendingIntent3 = pendingIntent;
                        }
                        oneSignalNotificationBuilder5 = oneSignalNotificationBuilder6;
                        it = it2;
                        i4 = i6;
                        pendingIntent = pendingIntent3;
                    } else {
                        i6 = i4;
                    }
                    String title = notificationData.getTitle();
                    if (title != null) {
                        str4 = title + TokenParser.SP;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    pendingIntent3 = pendingIntent;
                    sb.append(notificationData.getMessage());
                    SpannableString spannableString = new SpannableString(sb.toString());
                    if (str4.length() > 0) {
                        spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 0);
                    }
                    arrayList2.add(spannableString);
                    if (fullData2 == null) {
                        fullData2 = notificationData.getFullData();
                    }
                    oneSignalNotificationBuilder5 = oneSignalNotificationBuilder6;
                    it = it2;
                    i4 = i6;
                    pendingIntent = pendingIntent3;
                }
                i5 = i4;
                pendingIntent2 = pendingIntent;
                int iNextInt22 = secureRandom2.nextInt();
                sq8.m48646e(num);
                int iIntValue2 = num.intValue();
                sq8.m48648g(str2, "group");
                newActionPendingIntent = intentGeneratorForAttachingToNotifications2.getNewActionPendingIntent(iNextInt22, summaryNotificationDisplayer2.createBaseSummaryIntent(iIntValue2, intentGeneratorForAttachingToNotifications2, jSONObject2, str2));
                if ((z2 != 0 || arrayList2.size() <= 1) && (z2 != 0 || arrayList2.size() <= 0)) {
                    sq8.m48646e(oneSignalNotificationBuilder6);
                    o2c.C15694f compatBuilder22 = oneSignalNotificationBuilder6.getCompatBuilder();
                    sq8.m48646e(compatBuilder22);
                    compatBuilder22.f37619b.clear();
                    summaryNotificationDisplayer2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, intentGeneratorForAttachingToNotifications2, compatBuilder22, num.intValue(), str2);
                    compatBuilder22.m41416k(newActionPendingIntent).m41420o(pendingIntent2).m41430y(z2).m41412g(false).m41422q(str2).m41424s(true);
                    try {
                        compatBuilder22.m41423r(i5);
                    } catch (Throwable unused) {
                    }
                    notificationM41409c = compatBuilder22.m41409c();
                    sq8.m48648g(notificationM41409c, "summaryBuilder.build()");
                    summaryNotificationDisplayer2._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder6, notificationM41409c);
                } else {
                    int size = arrayList2.size() + (!z2);
                    String strSafeString = JSONObjectExtensionsKt.safeString(jSONObject2, "grp_msg");
                    if (strSafeString != null) {
                        String strM24593G = e9g.m24593G(strSafeString, "$[notif_count]", "" + size, false, 4, null);
                        if (strM24593G == null) {
                            strM24593G = size + " new messages";
                        }
                        o2c.C15694f compatBuilder3 = summaryNotificationDisplayer2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob3).getCompatBuilder();
                        if (z2 != 0) {
                            summaryNotificationDisplayer2._notificationDisplayBuilder.removeNotifyOptions(compatBuilder3);
                        } else {
                            if (notificationGenerationJob3.getOverriddenSound() != null) {
                                sq8.m48646e(compatBuilder3);
                                compatBuilder3.m41400D(notificationGenerationJob3.getOverriddenSound());
                            }
                            if (notificationGenerationJob3.getOverriddenFlags() != null) {
                                sq8.m48646e(compatBuilder3);
                                Integer overriddenFlags = notificationGenerationJob3.getOverriddenFlags();
                                sq8.m48646e(overriddenFlags);
                                compatBuilder3.m41419n(overriddenFlags.intValue());
                            }
                        }
                        sq8.m48646e(compatBuilder3);
                        o2c.C15694f c15694fM41420o = compatBuilder3.m41416k(newActionPendingIntent).m41420o(pendingIntent2);
                        Context currentContext3 = summaryNotificationDisplayer2.getCurrentContext();
                        sq8.m48646e(currentContext3);
                        PackageManager packageManager = currentContext3.getPackageManager();
                        Context currentContext4 = summaryNotificationDisplayer2.getCurrentContext();
                        sq8.m48646e(currentContext4);
                        c15694fM41420o.m41418m(packageManager.getApplicationLabel(currentContext4.getApplicationInfo())).m41417l(strM24593G).m41428w(size).m41399C(summaryNotificationDisplayer2._notificationDisplayBuilder.getDefaultSmallIconId()).m41425t(summaryNotificationDisplayer2._notificationDisplayBuilder.getDefaultLargeIcon()).m41430y(z2).m41412g(false).m41422q(str2).m41424s(true);
                        try {
                            compatBuilder3.m41423r(i5);
                        } catch (Throwable unused2) {
                        }
                        if (z2 == 0) {
                            compatBuilder3.m41402F(strM24593G);
                        }
                        o2c.C15696h c15696h = new o2c.C15696h();
                        if (z2 == 0) {
                            String strValueOf = notificationGenerationJob3.getTitle() != null ? String.valueOf(notificationGenerationJob3.getTitle()) : null;
                            if (strValueOf == null) {
                                str5 = "";
                            } else {
                                str5 = strValueOf + TokenParser.SP;
                            }
                            CharSequence body = notificationGenerationJob3.getBody();
                            if (body != null && (string = body.toString()) != null) {
                                str4 = string;
                            }
                            SpannableString spannableString2 = new SpannableString(str5 + str4);
                            if (str5.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, str5.length(), 0);
                            }
                            c15696h.m41437h(spannableString2);
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            c15696h.m41437h((SpannableString) it3.next());
                        }
                        c15696h.m41438i(strM24593G);
                        compatBuilder3.m41401E(c15696h);
                        notificationM41409c = compatBuilder3.m41409c();
                        sq8.m48648g(notificationM41409c, "summaryBuilder.build()");
                    }
                }
                Context currentContext22 = summaryNotificationDisplayer2.getCurrentContext();
                sq8.m48646e(currentContext22);
                e3c.m24211d(currentContext22).m24217f(num.intValue(), notificationM41409c);
                return y3i.f54824a;
            }
            z = c117641.Z$0;
            int i9 = c117641.I$0;
            PendingIntent pendingIntent4 = (PendingIntent) c117641.L$7;
            SecureRandom secureRandom4 = (SecureRandom) c117641.L$6;
            str = (String) c117641.L$5;
            IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications4 = (IntentGeneratorForAttachingToNotifications) c117641.L$4;
            JSONObject jSONObject5 = (JSONObject) c117641.L$3;
            NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder7 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) c117641.L$2;
            NotificationGenerationJob notificationGenerationJob5 = (NotificationGenerationJob) c117641.L$1;
            SummaryNotificationDisplayer summaryNotificationDisplayer3 = (SummaryNotificationDisplayer) c117641.L$0;
            wre.m54934b(objListNotificationsForGroup);
            i2 = i9;
            intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications4;
            newDismissActionPendingIntent = pendingIntent4;
            summaryNotificationDisplayer = summaryNotificationDisplayer3;
            secureRandom = secureRandom4;
            jSONObject = jSONObject5;
            oneSignalNotificationBuilder2 = oneSignalNotificationBuilder7;
            notificationGenerationJob2 = notificationGenerationJob5;
        }
        Integer num3 = (Integer) objListNotificationsForGroup;
        if (num3 == null) {
            Integer numM39304d = ml1.m39304d(secureRandom.nextInt());
            INotificationRepository iNotificationRepository3 = summaryNotificationDisplayer._dataController;
            int iIntValue3 = numM39304d.intValue();
            sq8.m48648g(str, "group");
            c117641.L$0 = summaryNotificationDisplayer;
            c117641.L$1 = notificationGenerationJob2;
            c117641.L$2 = oneSignalNotificationBuilder2;
            c117641.L$3 = jSONObject;
            c117641.L$4 = intentGeneratorForAttachingToNotifications;
            c117641.L$5 = str;
            c117641.L$6 = secureRandom;
            c117641.L$7 = newDismissActionPendingIntent;
            c117641.L$8 = numM39304d;
            c117641.I$0 = i2;
            c117641.Z$0 = z;
            c117641.label = 2;
            if (iNotificationRepository3.createSummaryNotification(iIntValue3, str, c117641) == objM51918f) {
                return objM51918f;
            }
            i3 = i2;
            jSONObject3 = jSONObject;
            notificationGenerationJob4 = notificationGenerationJob2;
            str3 = str;
            num2 = numM39304d;
            NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder8 = oneSignalNotificationBuilder2;
            intentGeneratorForAttachingToNotifications3 = intentGeneratorForAttachingToNotifications;
            oneSignalNotificationBuilder4 = oneSignalNotificationBuilder8;
            oneSignalNotificationBuilder3 = oneSignalNotificationBuilder4;
            num = num2;
            notificationGenerationJob3 = notificationGenerationJob4;
            JSONObject jSONObject42 = jSONObject3;
            i2 = i3;
            pendingIntent = newDismissActionPendingIntent;
            secureRandom2 = secureRandom;
            str2 = str3;
            intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications3;
            jSONObject2 = jSONObject42;
            INotificationRepository iNotificationRepository22 = summaryNotificationDisplayer._dataController;
            sq8.m48648g(str2, "group");
            c117641.L$0 = summaryNotificationDisplayer;
            c117641.L$1 = notificationGenerationJob3;
            c117641.L$2 = oneSignalNotificationBuilder3;
            c117641.L$3 = jSONObject2;
            c117641.L$4 = intentGeneratorForAttachingToNotifications2;
            c117641.L$5 = str2;
            c117641.L$6 = secureRandom2;
            c117641.L$7 = pendingIntent;
            c117641.L$8 = num;
            c117641.I$0 = i2;
            c117641.Z$0 = z;
            c117641.label = 3;
            objListNotificationsForGroup = iNotificationRepository22.listNotificationsForGroup(str2, c117641);
            if (objListNotificationsForGroup == objM51918f) {
            }
        } else {
            pendingIntent = newDismissActionPendingIntent;
            secureRandom2 = secureRandom;
            oneSignalNotificationBuilder3 = oneSignalNotificationBuilder2;
            jSONObject2 = jSONObject;
            str2 = str;
            notificationGenerationJob3 = notificationGenerationJob2;
            intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications;
            num = num3;
            INotificationRepository iNotificationRepository222 = summaryNotificationDisplayer._dataController;
            sq8.m48648g(str2, "group");
            c117641.L$0 = summaryNotificationDisplayer;
            c117641.L$1 = notificationGenerationJob3;
            c117641.L$2 = oneSignalNotificationBuilder3;
            c117641.L$3 = jSONObject2;
            c117641.L$4 = intentGeneratorForAttachingToNotifications2;
            c117641.L$5 = str2;
            c117641.L$6 = secureRandom2;
            c117641.L$7 = pendingIntent;
            c117641.L$8 = num;
            c117641.I$0 = i2;
            c117641.Z$0 = z;
            c117641.label = 3;
            objListNotificationsForGroup = iNotificationRepository222.listNotificationsForGroup(str2, c117641);
            if (objListNotificationsForGroup == objM51918f) {
            }
        }
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public Object updateSummaryNotification(NotificationGenerationJob notificationGenerationJob, n64 n64Var) {
        Object objCreateSummaryNotification = createSummaryNotification(notificationGenerationJob, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), n64Var);
        return objCreateSummaryNotification == uq8.m51918f() ? objCreateSummaryNotification : y3i.f54824a;
    }
}
