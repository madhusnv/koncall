package i1;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1592t;
import d4.C1573a;
import d4.C1582j;
import d4.C1589q;
import ex.InterfaceC2139c;
import g4.C2492h;
import java.util.List;
import java.util.function.Consumer;
import org.bouncycastle.iana.AEADAlgorithm;
import u4.AbstractC7338a;
import w3.o2;
import y2.ViewOnAttachStateChangeListenerC8534d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.j */
/* loaded from: classes.dex */
public abstract class AbstractC3131j {
    /* renamed from: a */
    public static EdgeEffect m7511a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public static void m7512b(ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        o2 o2Var;
        C1589q c1589q;
        InterfaceC2139c interfaceC2139c;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jKeyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (o2Var = (o2) viewOnAttachStateChangeListenerC8534d.m15800c().m5595b((int) jKeyAt)) != null && (c1589q = o2Var.f37907a) != null) {
                Object objM5574g = c1589q.f7879d.f7868a.m5574g(C1582j.f7852k);
                if (objM5574g == null) {
                    objM5574g = null;
                }
                C1573a c1573a = (C1573a) objM5574g;
                if (c1573a != null && (interfaceC2139c = (InterfaceC2139c) c1573a.f7826b) != null) {
                }
            }
        }
    }

    /* renamed from: c */
    public static float m7513c(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return DefinitionKt.NO_Float_VALUE;
        }
    }

    /* renamed from: d */
    public static int m7514d(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i10 = SystemJobService.f2885e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return stopReason;
            default:
                return -512;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m7515e() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L12
            java.lang.String r0 = "Spreadtrum"
            java.lang.String r1 = w3.C7892j.m14965i()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L5a
        L12:
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = r0.toLowerCase(r1)
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r2, r3)
            java.lang.String r4 = "ums"
            r5 = 0
            boolean r2 = nx.AbstractC5185w.m10138t(r2, r4, r5)
            if (r2 != 0) goto L5a
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "MANUFACTURER"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r2, r4)
            java.lang.String r4 = "Itel"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 != 0) goto L49
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r6 = "BRAND"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r2, r6)
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L59
        L49:
            java.lang.String r0 = r0.toLowerCase(r1)
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r3)
            java.lang.String r1 = "sp"
            boolean r0 = nx.AbstractC5185w.m10138t(r0, r1, r5)
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r5
        L5a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC3131j.m7515e():boolean");
    }

    /* renamed from: f */
    public static void m7516f(ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d, long[] jArr, Consumer consumer) {
        C1589q c1589q;
        String strM13729a;
        for (long j6 : jArr) {
            o2 o2Var = (o2) viewOnAttachStateChangeListenerC8534d.m15800c().m5595b((int) j6);
            if (o2Var != null && (c1589q = o2Var.f37907a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(viewOnAttachStateChangeListenerC8534d.f41462a.getAutofillId(), c1589q.f7882g);
                Object objM5574g = c1589q.f7879d.f7868a.m5574g(AbstractC1592t.f7942z);
                if (objM5574g == null) {
                    objM5574g = null;
                }
                List list = (List) objM5574g;
                if (list != null && (strM13729a = AbstractC7338a.m13729a(list, "\n", null, 62)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C2492h(strM13729a)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    /* renamed from: g */
    public static float m7517g(EdgeEffect edgeEffect, float f6, float f10) {
        try {
            return edgeEffect.onPullDistance(f6, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f10);
            return DefinitionKt.NO_Float_VALUE;
        }
    }

    /* renamed from: h */
    public static void m7518h(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
