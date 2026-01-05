package yv;

import a2.AbstractC0030c;
import al.C0182j;
import android.content.Context;
import c9.C0922q;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import com.websoptimization.callyzerbiz.workManager.RecordingUploadManager;
import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import d9.C1664i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.mg;
import rw.AbstractC6663m;
import t8.C7059e;
import t8.C7064j;
import t8.C7079y;
import t8.EnumC7055a;
import t8.EnumC7068n;
import t8.EnumC7078x;
import t8.e0;
import t8.f0;
import u8.C7368p;
import uv.AbstractC7548a;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.d */
/* loaded from: classes3.dex */
public final class C8789d {

    /* renamed from: a */
    public static final C8789d f42453a = new C8789d();

    /* renamed from: a */
    public static int m16154a(int i10, long j6) {
        return (int) ((i10 == 0 || j6 == 0) ? DefinitionKt.NO_Float_VALUE : (float) Math.rint(j6 / i10));
    }

    /* renamed from: b */
    public static String m16155b(EnumC8994d enumC8994d, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o;
        int i10;
        int i11;
        AbstractC4154l.m8923f(enumC8994d, "<this>");
        int i12 = AbstractC8788c.f42452a[enumC8994d.ordinal()];
        if (i12 == 1) {
            c3966o = (C3966o) interfaceC3962k;
            i10 = R.string.incoming;
            i11 = -800037787;
        } else if (i12 == 2) {
            c3966o = (C3966o) interfaceC3962k;
            i10 = R.string.outgoing;
            i11 = -800035835;
        } else if (i12 == 3) {
            c3966o = (C3966o) interfaceC3962k;
            i10 = R.string.missed;
            i11 = -800034011;
        } else {
            if (i12 != 4) {
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                c3966o2.m8607Y(-800039493);
                c3966o2.m8623p(false);
                throw new NoWhenBranchMatchedException();
            }
            c3966o = (C3966o) interfaceC3962k;
            i10 = R.string.rejected;
            i11 = -800032059;
        }
        return AbstractC1452a.m4565l(c3966o, i11, i10, c3966o, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m16156c(java.lang.String r6) throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            nx.n r0 = new nx.n
            java.lang.String r1 = "(\\d+)([hms])"
            r0.<init>(r1)
            int r1 = r6.length()
            if (r1 < 0) goto L88
            bt.i0 r1 = new bt.i0
            r2 = 26
            r1.<init>(r2, r0, r6)
            nx.m r6 = nx.C5175m.f25284a
            bx.i r0 = new bx.i
            r2 = 1
            r0.<init>(r2, r1, r6)
            e1.h0 r6 = new e1.h0
            r6.<init>(r0)
            r0 = 0
        L28:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r6.next()
            nx.l r2 = (nx.C5174l) r2
            java.util.List r3 = r2.m10082a()
            r4 = 1
            nx.j r3 = (nx.C5172j) r3
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            java.util.List r2 = r2.m10082a()
            r4 = 2
            nx.j r2 = (nx.C5172j) r2
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r2.hashCode()
            r5 = 104(0x68, float:1.46E-43)
            if (r4 == r5) goto L78
            r5 = 109(0x6d, float:1.53E-43)
            if (r4 == r5) goto L6c
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L63
            goto L80
        L63:
            java.lang.String r4 = "s"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L84
            goto L80
        L6c:
            java.lang.String r4 = "m"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L75
            goto L80
        L75:
            int r3 = r3 * 60
            goto L84
        L78:
            java.lang.String r4 = "h"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L82
        L80:
            r3 = 0
            goto L84
        L82:
            int r3 = r3 * 3600
        L84:
            long r2 = (long) r3
            long r0 = r0 + r2
            goto L28
        L87:
            return r0
        L88:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Start index out of bounds: 0, input length: "
            r1.<init>(r2)
            int r6 = r6.length()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.C8789d.m16156c(java.lang.String):long");
    }

    /* renamed from: d */
    public static long m16157d(EnumC8994d enumC8994d) {
        int i10 = enumC8994d == null ? -1 : AbstractC8788c.f42452a[enumC8994d.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? AbstractC7548a.f36340M : AbstractC7548a.f36343P : AbstractC7548a.f36342O : AbstractC7548a.f36341N : AbstractC7548a.f36340M;
    }

    /* renamed from: e */
    public static int m16158e(EnumC8994d enumC8994d) {
        AbstractC4154l.m8923f(enumC8994d, "<this>");
        int i10 = AbstractC8788c.f42452a[enumC8994d.ordinal()];
        if (i10 == 1) {
            return R.drawable.ic_tab_incoming_outlined;
        }
        if (i10 == 2) {
            return R.drawable.ic_tab_outgoing_outlined;
        }
        if (i10 == 3) {
            return R.drawable.ic_tab_missed_outline;
        }
        if (i10 == 4) {
            return R.drawable.ic_tab_rejected_outlined;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    public static String m16159f(int i10) {
        int i11 = i10 / 3600;
        int i12 = i10 % 3600;
        return String.format("%2d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1)) + "h " + String.format("%2d", Arrays.copyOf(new Object[]{Integer.valueOf(i12 / 60)}, 1)) + "m " + (i12 % 60) + "s";
    }

    /* renamed from: g */
    public static String m16160g(boolean z6, long j6) {
        if (!z6) {
            long j10 = 3600;
            long j11 = j6 / j10;
            long j12 = j6 % j10;
            long j13 = 60;
            long j14 = j12 / j13;
            long j15 = j12 % j13;
            String str = String.format("%2d", Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
            String str2 = String.format("%2d", Arrays.copyOf(new Object[]{Long.valueOf(j14)}, 1));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("h ");
            sb2.append(str2);
            sb2.append("m ");
            return AbstractC0030c.m116g(j15, "s", sb2);
        }
        long j16 = 3600000;
        long j17 = j6 / j16;
        long j18 = 60000;
        long j19 = IMAPStore.RESPONSE;
        return String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j17)}, 1)) + "h " + String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((j6 % j16) / j18)}, 1)) + "m " + String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((j6 % j18) / j19)}, 1)) + "s " + (j6 % j19) + "ms";
    }

    /* renamed from: i */
    public static C7079y m16162i(String str, boolean z6, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isSubscriptionLogs", Boolean.valueOf(z6));
        linkedHashMap.put("isSubscriptionInIdle", Boolean.FALSE);
        linkedHashMap.put("isSubscriptionNotifications", Boolean.valueOf(z10));
        linkedHashMap.put("simInSubscriptionUpdate", str);
        C7064j c7064j = new C7064j(linkedHashMap);
        mg.m10769b(c7064j);
        EnumC7078x enumC7078x = EnumC7078x.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EnumC7078x networkType = EnumC7078x.CONNECTED;
        AbstractC4154l.m8923f(networkType, "networkType");
        C7059e c7059e = new C7059e(new C1664i(null), networkType, false, false, false, false, -1L, -1L, AbstractC6663m.g0(linkedHashSet));
        C0182j c0182j = new C0182j(RetrieveWebSubscriptionWorkManager.class);
        ((C0922q) c0182j.f556c).f5631j = c7059e;
        c0182j.m410a("SubscriptionWork");
        ((C0922q) c0182j.f556c).f5626e = c7064j;
        EnumC7055a enumC7055a = EnumC7055a.LINEAR;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0182j.m423n(enumC7055a);
        return c0182j.m411b();
    }

    /* renamed from: j */
    public static C7079y m16163j(String str, boolean z6, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isSubscriptionLogs", Boolean.valueOf(z6));
        linkedHashMap.put("isSubscriptionInIdle", Boolean.TRUE);
        linkedHashMap.put("isSubscriptionNotifications", Boolean.valueOf(z10));
        linkedHashMap.put("simInSubscriptionUpdate", str);
        C7064j c7064j = new C7064j(linkedHashMap);
        mg.m10769b(c7064j);
        EnumC7078x enumC7078x = EnumC7078x.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EnumC7078x networkType = EnumC7078x.CONNECTED;
        AbstractC4154l.m8923f(networkType, "networkType");
        C7059e c7059e = new C7059e(new C1664i(null), networkType, false, true, false, false, -1L, -1L, AbstractC6663m.g0(linkedHashSet));
        C0182j c0182j = new C0182j(RetrieveWebSubscriptionWorkManager.class);
        ((C0922q) c0182j.f556c).f5631j = c7059e;
        c0182j.m410a("SubscriptionWorkIdle");
        ((C0922q) c0182j.f556c).f5626e = c7064j;
        return c0182j.m411b();
    }

    /* renamed from: k */
    public static boolean m16164k(Context context, String str) {
        AbstractC4154l.m8923f(context, "context");
        List list = (List) C7368p.m13783g(context).m13785h(str).f39850b.get();
        if (list == null || list.isEmpty() || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e0 e0Var = ((f0) it.next()).f34141b;
            if (e0Var == e0.ENQUEUED || e0Var == e0.RUNNING || e0Var == e0.BLOCKED) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static EnumC8994d m16165o(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        switch (str.hashCode()) {
            case -1990013253:
                if (str.equals("Missed")) {
                    return EnumC8994d.MISSED;
                }
                return null;
            case -543852386:
                if (str.equals("Rejected")) {
                    return EnumC8994d.REJECTED;
                }
                return null;
            case 126326668:
                if (str.equals("Outgoing")) {
                    return EnumC8994d.OUTGOING;
                }
                return null;
            case 157441094:
                if (str.equals("Incoming")) {
                    return EnumC8994d.INCOMING;
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: l */
    public synchronized void m16166l(Context context) {
        C7368p c7368pM13783g = C7368p.m13783g(context);
        C0182j c0182j = new C0182j(RecordingCompressManager.class);
        c0182j.m410a("CompressWork");
        EnumC7055a enumC7055a = EnumC7055a.EXPONENTIAL;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0182j.m423n(enumC7055a);
        c7368pM13783g.m13354b(c0182j.m411b());
    }

    /* renamed from: m */
    public synchronized void m16167m(Context context, String str, boolean z6, boolean z10) {
        try {
            C7368p.m13783g(context).m13355c("SubscriptionWork", str == null ? EnumC7068n.KEEP : EnumC7068n.APPEND_OR_REPLACE, m16162i(str, z10, z6));
            C7368p.m13783g(context).m13355c("SubscriptionWork_IDLE", str == null ? EnumC7068n.KEEP : EnumC7068n.APPEND_OR_REPLACE, m16163j(str, z10, z6));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: n */
    public synchronized void m16168n(Context context) {
        AbstractC4154l.m8923f(context, "context");
        C7368p c7368pM13783g = C7368p.m13783g(context);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("needRequest", Boolean.TRUE);
        C7064j c7064j = new C7064j(linkedHashMap);
        mg.m10769b(c7064j);
        C0182j c0182j = new C0182j(RecordingUploadManager.class);
        c0182j.m410a("UploadWork");
        c0182j.m425p(c7064j);
        EnumC7055a enumC7055a = EnumC7055a.LINEAR;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0182j.m423n(enumC7055a);
        c7368pM13783g.m13354b(c0182j.m411b());
    }
}
