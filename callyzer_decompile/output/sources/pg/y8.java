package pg;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import android.widget.Toast;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class y8 {
    /* renamed from: a */
    public static final String m11946a(Context context) {
        AbstractC4154l.m8923f(context, "<this>");
        Object systemService = context.getSystemService("telecom");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
        return ((TelecomManager) systemService).getDefaultDialerPackage();
    }

    /* renamed from: b */
    public static final PendingIntent m11947b(Context context, Intent intent) {
        AbstractC4154l.m8923f(context, "<this>");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        AbstractC4154l.m8922e(activity, "getActivity(...)");
        return activity;
    }

    /* renamed from: c */
    public static final boolean m11948c(Context context) {
        boolean zEqualsIgnoreCase;
        AbstractC4154l.m8923f(context, "<this>");
        String strM11946a = m11946a(context);
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16171d(strM11946a)) {
            if (strM11946a != null) {
                zEqualsIgnoreCase = strM11946a.equalsIgnoreCase("com.google.android.dialer");
            } else if (strM11946a != "com.google.android.dialer") {
                if (strM11946a != null && strM11946a.length() == 25) {
                    int length = strM11946a.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        if (og.d2.m10601d(strM11946a.charAt(i10), "com.google.android.dialer".charAt(i10), true)) {
                        }
                    }
                    zEqualsIgnoreCase = true;
                }
                zEqualsIgnoreCase = false;
                break;
            } else {
                zEqualsIgnoreCase = true;
            }
            if (zEqualsIgnoreCase) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final void m11949d(Context context, int i10) {
        AbstractC4154l.m8923f(context, "<this>");
        Toast.makeText(context, i10, 1).show();
    }

    /* renamed from: e */
    public static final void m11950e(Context context, String str) {
        AbstractC4154l.m8923f(context, "<this>");
        Toast.makeText(context, str, 1).show();
    }

    /* renamed from: f */
    public static final void m11951f(Context context, int i10) {
        AbstractC4154l.m8923f(context, "<this>");
        Toast.makeText(context, i10, 0).show();
    }

    /* renamed from: g */
    public static final void m11952g(Context context, String message) {
        AbstractC4154l.m8923f(context, "<this>");
        AbstractC4154l.m8923f(message, "message");
        Toast.makeText(context, message, 0).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11953h(int r6, java.lang.Object r7, k4.a0 r8, k4.C3998s r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            k4.s r0 = r8.f20647b
            boolean r0 = kotlin.jvm.internal.AbstractC4154l.m8918a(r0, r9)
            if (r0 != 0) goto L29
            k4.s r0 = k4.C3998s.f20694d
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            k4.s r3 = r8.f20647b
            int r3 = r3.f20701a
            int r0 = r0.f20701a
            int r0 = kotlin.jvm.internal.AbstractC4154l.m8924g(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.f20701a
            goto L66
        L62:
            k4.s r9 = r8.f20647b
            int r9 = r9.f20701a
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = c6.AbstractC0879i.m2389a(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.y8.m11953h(int, java.lang.Object, k4.a0, k4.s, int):java.lang.Object");
    }
}
