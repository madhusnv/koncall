package xm;

import a1.C0011j;
import ak.C0165d;
import ak.C0166e;
import ak.C0171j;
import ak.CallableC0163b;
import bk.C0675f;
import bk.C0676g;
import bk.C0681l;
import fn.C2336i;
import java.util.HashMap;
import java.util.Map;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import org.json.JSONException;
import org.json.JSONObject;
import pg.l8;
import qw.C6361k;
import ri.EnumC6551i;
import rw.AbstractC6674x;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o4 {

    /* renamed from: a */
    public final C2336i f40671a;

    /* renamed from: b */
    public final C8810d f40672b;

    /* renamed from: c */
    public final C8805t f40673c;

    /* renamed from: d */
    public final C0165d f40674d;

    public o4(C2336i dataStore, C8805t c8805t, C8810d c8810d) {
        AbstractC4154l.m8923f(dataStore, "dataStore");
        this.f40671a = dataStore;
        this.f40672b = c8810d;
        this.f40673c = c8805t;
        C0165d c0165dM386a = ((C0171j) C3773g.m8291c().m8294b(C0171j.class)).m386a();
        AbstractC4154l.m8922e(c0165dM386a, "getInstance(...)");
        this.f40674d = c0165dM386a;
        C0166e c0166e = new C0166e();
        int[] iArr = C0681l.f4276j;
        c0166e.f515a = 86400L;
        C0166e c0166e2 = new C0166e();
        c0166e2.f515a = c0166e.f515a;
        l8.m11762c(c0165dM386a.f506b, new CallableC0163b(0, c0165dM386a, c0166e2));
        Map mapM12778f = AbstractC6674x.m12778f(new C6361k("CALLYZER_QUICK_CALL_EXTENSION_LINK", "https://play.google.com/store/apps/details?id=com.websoptimization.callyzerbiz&hl=en_IN"), new C6361k("BIZ_CONTACT_US_SUPPORT_EMAIL_ID", "support@callyzer.co"), new C6361k("BIZ_CONTACT_US_SENDER_EMAIL_SMTP_USERNAME", "no-reply@delawarebuick.com"), new C6361k("BIZ_CONTACT_US_SENDER_EMAIL_SMTP_PASSWORD", "swqwgnbncgueqoxw"));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapM12778f.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map.put((String) entry.getKey(), value.toString());
            }
        }
        try {
            C0675f c0675fM1953c = C0676g.m1953c();
            c0675fM1953c.f4251b = new JSONObject(map);
            c0165dM386a.f509e.m1950d(c0675fM1953c.m1951a()).m15986m(EnumC6551i.INSTANCE, new C0011j(7));
        } catch (JSONException unused) {
            l8.m11765f(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15598a(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof xm.k4
            if (r0 == 0) goto L13
            r0 = r8
            xm.k4 r0 = (xm.k4) r0
            int r1 = r0.f40495d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40495d = r1
            goto L18
        L13:
            xm.k4 r0 = new xm.k4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f40493b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40495d
            java.lang.String r3 = "RemoteConfigRepository"
            yv.t r4 = r7.f40673c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            java.lang.Boolean r0 = r0.f40492a
            og.od.m10798c(r8)     // Catch: java.lang.Exception -> L30
            goto L64
        L30:
            r8 = move-exception
            goto L73
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            og.od.m10798c(r8)     // Catch: java.lang.Exception -> L30
            goto L50
        L3e:
            og.od.m10798c(r8)
            ak.d r8 = r7.f40674d     // Catch: java.lang.Exception -> L30
            yg.m r8 = r8.m382a()     // Catch: java.lang.Exception -> L30
            r0.f40495d = r6     // Catch: java.lang.Exception -> L30
            java.lang.Object r8 = og.he.m10686c(r8, r0)     // Catch: java.lang.Exception -> L30
            if (r8 != r1) goto L50
            goto L62
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L30
            boolean r2 = r8.booleanValue()     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L66
            r0.f40492a = r8     // Catch: java.lang.Exception -> L30
            r0.f40495d = r5     // Catch: java.lang.Exception -> L30
            java.lang.Object r0 = r7.m15600c(r0)     // Catch: java.lang.Exception -> L30
            if (r0 != r1) goto L63
        L62:
            return r1
        L63:
            r0 = r8
        L64:
            r8 = r0
            goto L6b
        L66:
            java.lang.String r0 = "Remote config not updated (cached values used)."
            r4.m16232g(r3, r0)     // Catch: java.lang.Exception -> L30
        L6b:
            kotlin.jvm.internal.AbstractC4154l.m8920c(r8)     // Catch: java.lang.Exception -> L30
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> L30
            goto L7d
        L73:
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "Error fetching remote config: "
            p020v.a1.m14346z(r0, r8, r4, r3)
            r8 = 0
        L7d:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.o4.m15598a(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15599b(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof xm.l4
            if (r0 == 0) goto L13
            r0 = r9
            xm.l4 r0 = (xm.l4) r0
            int r1 = r0.f40542e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40542e = r1
            goto L18
        L13:
            xm.l4 r0 = new xm.l4
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f40540c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40542e
            r3 = 3
            r4 = 2
            r5 = 1
            fn.i r6 = r8.f40671a
            if (r2 == 0) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.String r1 = r0.f40539b
            java.lang.String r0 = r0.f40538a
            og.od.m10798c(r9)
            goto L9a
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            java.lang.String r2 = r0.f40538a
            og.od.m10798c(r9)
            goto L78
        L42:
            og.od.m10798c(r9)
            goto L58
        L46:
            og.od.m10798c(r9)
            r0.f40542e = r5
            km.a r9 = r6.f10585a
            java.lang.String r2 = "contact_form_support_email"
            km.o r9 = (km.C4120o) r9
            java.lang.Object r9 = r9.m8886h(r2, r0)
            if (r9 != r1) goto L58
            goto L96
        L58:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r2 = r9.length()
            if (r2 != 0) goto L62
            java.lang.String r9 = "support@callyzer.co"
        L62:
            java.lang.String r9 = (java.lang.String) r9
            r0.f40538a = r9
            r0.f40542e = r4
            km.a r2 = r6.f10585a
            java.lang.String r4 = "contact_form_sender_email"
            km.o r2 = (km.C4120o) r2
            java.lang.Object r2 = r2.m8886h(r4, r0)
            if (r2 != r1) goto L75
            goto L96
        L75:
            r7 = r2
            r2 = r9
            r9 = r7
        L78:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r4 = r9.length()
            if (r4 != 0) goto L82
            java.lang.String r9 = "no-reply@delawarebuick.com"
        L82:
            java.lang.String r9 = (java.lang.String) r9
            r0.f40538a = r2
            r0.f40539b = r9
            r0.f40542e = r3
            km.a r3 = r6.f10585a
            java.lang.String r4 = "contact_form_email_password"
            km.o r3 = (km.C4120o) r3
            java.lang.Object r0 = r3.m8886h(r4, r0)
            if (r0 != r1) goto L97
        L96:
            return r1
        L97:
            r1 = r9
            r9 = r0
            r0 = r2
        L9a:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r2 = r9.length()
            if (r2 != 0) goto La4
            java.lang.String r9 = "swqwgnbncgueqoxw"
        La4:
            java.lang.String r9 = (java.lang.String) r9
            nm.c r2 = new nm.c
            r2.<init>(r0, r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.o4.m15599b(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[PHI: r2
      0x00c1: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v8 java.lang.String) binds: [B:38:0x00be, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15600c(ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.o4.m15600c(ww.c):java.lang.Object");
    }
}
