package ia;

import android.content.SharedPreferences;
import android.os.Handler;
import java.util.LinkedHashMap;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import qi.RunnableC6224g;
import sc.InterfaceC6796p;
import td.C7124a;
import u8.C7361i;
import ud.C7410n;
import ud.InterfaceC7411o;
import ug.d1;
import ug.h4;
import ug.n1;
import zb.C8911e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.l */
/* loaded from: classes.dex */
public final class C3220l implements InterfaceC6796p {

    /* renamed from: a */
    public long f17354a;

    /* renamed from: b */
    public Object f17355b;

    /* renamed from: c */
    public Object f17356c;

    /* renamed from: d */
    public Object f17357d;

    /* renamed from: e */
    public Object f17358e;

    public /* synthetic */ C3220l(h4 h4Var) {
        this.f17358e = h4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011f A[Catch: all -> 0x017e, TryCatch #1 {all -> 0x017e, blocks: (B:41:0x0113, B:43:0x011f, B:45:0x0129, B:60:0x0182, B:61:0x0189, B:62:0x018a, B:66:0x0199, B:67:0x019e), top: B:75:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:21:0x0057, B:49:0x0146, B:51:0x014a, B:56:0x0176, B:57:0x017d), top: B:74:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {all -> 0x005c, blocks: (B:21:0x0057, B:49:0x0146, B:51:0x014a, B:56:0x0176, B:57:0x017d), top: B:74:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a A[Catch: all -> 0x017e, TryCatch #1 {all -> 0x017e, blocks: (B:41:0x0113, B:43:0x011f, B:45:0x0129, B:60:0x0182, B:61:0x0189, B:62:0x018a, B:66:0x0199, B:67:0x019e), top: B:75:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7560a(ia.C3220l r14, td.C7124a r15, sc.C6802v r16, ww.AbstractC8193c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C3220l.m7560a(ia.l, td.a, sc.v, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public void m7562c(C7361i token) {
        Runnable runnable;
        AbstractC4154l.m8923f(token, "token");
        synchronized (this.f17357d) {
            runnable = (Runnable) ((LinkedHashMap) this.f17358e).remove(token);
        }
        if (runnable != null) {
            ((Handler) ((C4001v) this.f17355b).f20704b).removeCallbacks(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sc.InterfaceC6796p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7561b(sc.C6802v r7, uw.InterfaceC7559c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ia.C3219k
            if (r0 == 0) goto L13
            r0 = r8
            ia.k r0 = (ia.C3219k) r0
            int r1 = r0.f17353d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17353d = r1
            goto L1a
        L13:
            ia.k r0 = new ia.k
            ww.c r8 = (ww.AbstractC8193c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.f17351b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17353d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            sc.v r7 = r0.f17350a
            og.od.m10798c(r8)
            goto L4c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            og.od.m10798c(r8)
            java.lang.Object r8 = r6.f17358e
            ud.c r8 = (ud.C7399c) r8
            an.b3 r2 = new an.b3
            r4 = 0
            r5 = 7
            r2.<init>(r6, r7, r4, r5)
            r0.f17350a = r7
            r0.f17353d = r3
            java.lang.Object r8 = r8.m13805h(r2, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            ia.i r8 = (ia.C3217i) r8
            java.lang.Object r0 = r7.f32332b
            tc.b r0 = (tc.C7117b) r0
            jc.i r0 = r0.f34312c
            byte[] r8 = r8.f17340a
            java.lang.String r8 = nx.AbstractC5185w.m10126h(r8)
            java.lang.String r1 = "x-aws-ec2-metadata-token"
            r0.m336p(r8, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C3220l.mo7561b(sc.v, uw.c):java.lang.Object");
    }

    /* renamed from: e */
    public void m7564e(C7361i token) {
        AbstractC4154l.m8923f(token, "token");
        RunnableC6224g runnableC6224g = new RunnableC6224g(16, this, token);
        synchronized (this.f17357d) {
        }
        C4001v c4001v = (C4001v) this.f17355b;
        ((Handler) c4001v.f20704b).postDelayed(runnableC6224g, this.f17354a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m7565f(long r11, com.google.android.gms.internal.measurement.c3 r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f17357d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f17357d = r0
        Ld:
            java.lang.Object r0 = r10.f17356c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f17356c = r0
        L1a:
            java.lang.Object r0 = r10.f17357d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.Object r0 = r10.f17357d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.c3 r0 = (com.google.android.gms.internal.measurement.c3) r0
            long r2 = r0.m3203u()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.m3203u()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.f17354a
            int r0 = r13.m3342k()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.f17358e
            ug.h4 r0 = (ug.h4) r0
            ug.g r4 = r0.e0()
            ug.e0 r5 = ug.f0.f44805d1
            r6 = 0
            boolean r4 = r4.m13889W(r6, r5)
            if (r4 == 0) goto L81
            java.lang.Object r4 = r10.f17357d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.e0()
            ug.e0 r4 = ug.f0.f35415j
            java.lang.Object r4 = r4.m13872a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            goto L9a
        L81:
            r0.e0()
            ug.e0 r4 = ug.f0.f35415j
            java.lang.Object r4 = r4.m13872a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9a
            goto Lcc
        L9a:
            r10.f17354a = r2
            java.lang.Object r2 = r10.f17357d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.lang.Object r13 = r10.f17356c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.f17357d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.e0()
            ug.e0 r12 = ug.f0.f35416k
            java.lang.Object r12 = r12.m13872a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C3220l.m7565f(long, com.google.android.gms.internal.measurement.c3):boolean");
    }

    /* renamed from: g */
    public void m7566g() {
        d1 d1Var = (d1) this.f17358e;
        d1Var.mo325M();
        ((n1) d1Var.f482a).f35674l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = d1Var.m13861Q().edit();
        editorEdit.remove((String) this.f17356c);
        editorEdit.remove((String) this.f17357d);
        editorEdit.putLong((String) this.f17355b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public C3220l() {
        int i10 = C5770a.f28335d;
        this.f17354a = bb.m10551g(21600, EnumC5772c.SECONDS);
        this.f17355b = C8911e.f42873d;
        this.f17357d = C7124a.f34340a;
        InterfaceC7411o.f35200a.getClass();
        this.f17358e = C7410n.f35199b;
    }
}
