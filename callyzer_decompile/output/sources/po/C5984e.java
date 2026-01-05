package po;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import co.C0984a;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.R;
import ix.AbstractC3363d;
import java.util.List;
import kn.EnumC4127g;
import kn.EnumC4131k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import pg.d9;
import pg.f9;
import pg.w9;
import pg.y8;
import q5.C6119l;
import q5.C6123p;
import q5.ServiceConnectionC6122o;
import qw.C6366p;
import rw.C6668r;
import so.C6877c;
import xm.j4;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: po.e */
/* loaded from: classes3.dex */
public final class C5984e {

    /* renamed from: a */
    public final Context f29247a;

    /* renamed from: b */
    public final j4 f29248b;

    /* renamed from: c */
    public final C6877c f29249c;

    /* renamed from: d */
    public final C0984a f29250d = new C0984a();

    /* renamed from: e */
    public final C6366p f29251e = nd.m10782c(new C5983d(this, 0));

    /* renamed from: f */
    public final C6366p f29252f = nd.m10782c(new C5983d(this, 1));

    /* renamed from: g */
    public final C6366p f29253g = nd.m10782c(new C5983d(this, 2));

    /* renamed from: h */
    public final C6366p f29254h = nd.m10782c(new C5983d(this, 3));

    /* renamed from: i */
    public final C6366p f29255i = nd.m10782c(new C5983d(this, 4));

    /* renamed from: j */
    public final C6366p f29256j = nd.m10782c(new C5983d(this, 5));

    public C5984e(Context context, j4 j4Var, C6877c c6877c) {
        this.f29247a = context;
        this.f29248b = j4Var;
        this.f29249c = c6877c;
    }

    /* renamed from: b */
    public static int m12014b() {
        return AbstractC3363d.f17771a.m7677d(2000);
    }

    /* renamed from: d */
    public static void m12015d(C5984e c5984e, EnumC4131k state) {
        Context context = c5984e.f29247a;
        AbstractC4154l.m8923f(state, "state");
        int i10 = AbstractC5980a.f29233b[state.ordinal()];
        if (i10 == 1) {
            m12016g(c5984e, 762, "", f9.m11628b(context, R.string.sync_notification_syncing_call_log), EnumC4127g.Floating, null, true, 0, true, null, 560);
            return;
        }
        if (i10 == 2) {
            m12016g(c5984e, 762, "", f9.m11628b(context, R.string.sync_notification_syncing_call_log), EnumC4127g.Floating, null, true, Integer.valueOf(w9.m11912c(0, 0, 100)), true, null, 560);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c5984e.m12019a(762);
        } else {
            PendingIntent pendingIntentM11947b = y8.m11947b(context, new Intent(context, (Class<?>) MainActivity.class));
            m12016g(c5984e, 762, f9.m11628b(context, R.string.sync_notification_sync_failed), f9.m11628b(context, R.string.sync_notification_sync_error), EnumC4127g.Floating, pendingIntentM11947b, false, 0, false, null, 544);
        }
    }

    /* renamed from: g */
    public static C9097a m12016g(C5984e c5984e, int i10, String contentText, String title, EnumC4127g enumC4127g, PendingIntent pendingIntent, boolean z6, Integer num, boolean z10, List list, int i11) {
        String str;
        int i12;
        Integer numValueOf;
        EnumC4127g type = (i11 & 8) != 0 ? EnumC4127g.Normal : enumC4127g;
        PendingIntent pendingIntent2 = (i11 & 16) != 0 ? null : pendingIntent;
        int i13 = 0;
        boolean z11 = (i11 & 64) != 0 ? false : z6;
        Integer num2 = (i11 & 128) != 0 ? null : num;
        boolean z12 = (i11 & 256) != 0 ? false : z10;
        List list2 = (i11 & 512) != 0 ? C6668r.f31943a : list;
        c5984e.getClass();
        AbstractC4154l.m8923f(contentText, "contentText");
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(type, "type");
        int[] iArr = AbstractC5980a.f29232a;
        int i14 = iArr[type.ordinal()];
        if (i14 == 1) {
            str = (String) c5984e.f29251e.getValue();
        } else if (i14 == 2) {
            str = (String) c5984e.f29252f.getValue();
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = (String) c5984e.f29253g.getValue();
        }
        Uri uri = type == EnumC4127g.Silent ? null : Settings.System.DEFAULT_NOTIFICATION_URI;
        int i15 = iArr[type.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                i13 = -1;
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 1;
            }
        }
        if (!z11 || num2 == null) {
            i12 = i13;
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(num2.intValue() > 0 ? num2.intValue() : -1);
            i12 = i13;
        }
        C9097a c9097a = new C9097a(str, i10, contentText, title, i12, uri, null, null, pendingIntent2, numValueOf, 195824);
        c9097a.f43636h = z12;
        c9097a.f43645q = list2;
        c5984e.m12020c(i10, c9097a.m16507a(c5984e.f29247a));
        return c9097a;
    }

    /* renamed from: i */
    public static void m12017i(C5984e c5984e, int i10, String str, String str2, List list, int i11) {
        List list2 = (i11 & 64) != 0 ? C6668r.f31943a : list;
        c5984e.getClass();
        C9097a c9097a = new C9097a((String) c5984e.f29254h.getValue(), i10, str, str2, 0, null, null, null, null, null, 262128);
        c9097a.f43636h = false;
        c9097a.f43645q = list2;
        c5984e.m12020c(i10, c9097a.m16507a(c5984e.f29247a));
    }

    /* renamed from: j */
    public static C9097a m12018j(C5984e c5984e, int i10, String str, String str2, int i11) {
        String str3 = (i11 & 2) != 0 ? null : str;
        boolean z6 = (i11 & 32) == 0;
        c5984e.getClass();
        C9097a c9097a = new C9097a((String) c5984e.f29256j.getValue(), i10, str3, str2, -1, null, null, new long[]{0}, null, null, 253168);
        c9097a.f43636h = z6;
        c9097a.f43645q = C6668r.f31943a;
        c5984e.m12020c(i10, c9097a.m16507a(c5984e.f29247a));
        return c9097a;
    }

    /* renamed from: a */
    public final void m12019a(int i10) {
        new C6123p(this.f29247a).f29873a.cancel(null, i10);
    }

    /* renamed from: c */
    public final void m12020c(int i10, Notification notification) {
        Context context = this.f29247a;
        C6123p c6123p = new C6123p(context);
        if (Build.VERSION.SDK_INT >= 33 ? d9.m11588a(context, "android.permission.POST_NOTIFICATIONS") : true) {
            NotificationManager notificationManager = c6123p.f29873a;
            Bundle bundle = notification.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                notificationManager.notify(null, i10, notification);
                return;
            }
            C6119l c6119l = new C6119l(context.getPackageName(), i10, notification);
            synchronized (C6123p.f29871e) {
                try {
                    if (C6123p.f29872f == null) {
                        C6123p.f29872f = new ServiceConnectionC6122o(context.getApplicationContext());
                    }
                    C6123p.f29872f.f29865b.obtainMessage(0, c6119l).sendToTarget();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            notificationManager.cancel(null, i10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r3.equals("LEAD_CALL_BACK") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (r3.equals("LEAD_ASSIGNED") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        r4 = r29.getMobileNo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (r4.length() <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0114, code lost:
    
        if (nx.AbstractC5178p.m10116x(r4, "+", false) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        r15 = r29;
        r7.f29234a = r15;
        r7.f29235b = r14;
        r7.f29236c = r4;
        r7.f29237d = r0;
        r7.f29240g = 1;
        r3 = so.C6877c.m13064d(r28.f29249c, r4, null, false, r7, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        if (r3 != r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
    
        r2 = r0;
        r0 = r3;
        r3 = r4;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0141, code lost:
    
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
    
        if (r3.equals("LEAD_SUBSCRIPTION_UPDATE") == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ec A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0202  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12021e(com.websoptimization.callyzerbiz.domain.model.FCMData r29, ww.AbstractC8193c r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.C5984e.m12021e(com.websoptimization.callyzerbiz.domain.model.FCMData, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void m12022f() {
        Uri uri = Uri.parse("callbiz://com_websoptimization/main_screen/lead");
        Context context = this.f29247a;
        PendingIntent pendingIntentM11947b = y8.m11947b(context, new Intent("android.intent.action.VIEW", uri, context, MainActivity.class));
        int iM12014b = m12014b();
        String string = context.getString(R.string.notification_lead_update_description);
        AbstractC4154l.m8922e(string, "getString(...)");
        String string2 = context.getString(R.string.notification_lead_update_title);
        AbstractC4154l.m8922e(string2, "getString(...)");
        m12016g(this, iM12014b, string, string2, EnumC4127g.Floating, pendingIntentM11947b, false, null, false, null, 992);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12023h(com.websoptimization.callyzerbiz.domain.model.FCMData r18, ww.AbstractC8193c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof po.C5982c
            if (r2 == 0) goto L17
            r2 = r1
            po.c r2 = (po.C5982c) r2
            int r3 = r2.f29244d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f29244d = r3
            goto L1c
        L17:
            po.c r2 = new po.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f29242b
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f29244d
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            com.websoptimization.callyzerbiz.domain.model.FCMData r2 = r2.f29241a
            og.od.m10798c(r1)
            goto L50
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            og.od.m10798c(r1)
            java.lang.String r1 = r18.getExtensionCode()
            r4 = r18
            if (r1 == 0) goto L53
            r2.f29241a = r4
            r2.f29244d = r5
            xm.j4 r5 = r0.f29248b
            gn.x2 r5 = r5.f40460a
            java.lang.Object r1 = r5.m6706z(r1, r2)
            if (r1 != r3) goto L4f
            return r3
        L4f:
            r2 = r4
        L50:
            java.lang.String r1 = (java.lang.String) r1
            goto L55
        L53:
            r1 = 0
            r2 = r4
        L55:
            ix.c r3 = ix.AbstractC3363d.f17771a
            r4 = 1000(0x3e8, float:1.401E-42)
            int r7 = r3.m7677d(r4)
            qw.p r3 = r0.f29255i
            java.lang.Object r3 = r3.getValue()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            q5.i r12 = new q5.i
            r12.<init>()
            java.lang.String r3 = r2.getTitle()
            if (r3 != 0) goto L73
            java.lang.String r3 = ""
        L73:
            r9 = r3
            java.lang.String r2 = r2.getBody()
            java.lang.String r3 = " "
            java.lang.String r8 = i0.m0.m7379l(r2, r3, r1)
            zv.a r5 = new zv.a
            r15 = 0
            r16 = 520048(0x7ef70, float:7.28742E-40)
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            android.content.Context r1 = r0.f29247a
            android.app.Notification r1 = r5.m16507a(r1)
            r0.m12020c(r7, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: po.C5984e.m12023h(com.websoptimization.callyzerbiz.domain.model.FCMData, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public final void m12024k() {
        Uri uri = Uri.parse("callbiz://com_websoptimization/settings");
        Context context = this.f29247a;
        PendingIntent pendingIntentM11947b = y8.m11947b(context, new Intent("android.intent.action.VIEW", uri, context, MainActivity.class));
        int iM12014b = m12014b();
        String string = context.getString(R.string.notification_recording_subscription_update_description);
        AbstractC4154l.m8922e(string, "getString(...)");
        String string2 = context.getString(R.string.notification_recording_subscription_update_title);
        AbstractC4154l.m8922e(string2, "getString(...)");
        m12016g(this, iM12014b, string, string2, EnumC4127g.Floating, pendingIntentM11947b, false, null, false, null, 992);
    }

    /* renamed from: l */
    public final void m12025l(C9097a callyzerNotification, boolean z6) {
        AbstractC4154l.m8923f(callyzerNotification, "callyzerNotification");
        m12020c(callyzerNotification.f43630b, C9097a.m16506b(callyzerNotification, z6 ? (String) this.f29256j.getValue() : (String) this.f29254h.getValue(), null, null, false, null, null, 524286).m16507a(this.f29247a));
    }
}
