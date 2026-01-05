package xm;

import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import pg.o6;
import ub.C7393i;
import vx.C7806h;
import ww.AbstractC8193c;
import wx.C8203d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w2 {

    /* renamed from: b */
    public static final C7806h f40960b;

    /* renamed from: c */
    public static final C8203d f40961c;

    /* renamed from: a */
    public final gn.x2 f40962a;

    static {
        C7806h c7806hM11805a = o6.m11805a(0, null, new C7393i(17), 3);
        f40960b = c7806hM11805a;
        f40961c = wx.c1.m15389t(c7806hM11805a);
    }

    public w2(gn.x2 localDataSource) {
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        this.f40962a = localDataSource;
    }

    /* renamed from: a */
    public final Object m15635a(int i10, int i11, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f40962a.f14943c.f1509a, true, false, new an.u4(i10, i11, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15636b(final java.util.ArrayList r21, final boolean r22, final j$.time.LocalDateTime r23, final j$.time.LocalDateTime r24, final java.lang.String r25, boolean r26, final int r27, final int r28, final java.lang.String r29, final int r30, ww.AbstractC8193c r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.w2.m15636b(java.util.ArrayList, boolean, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, boolean, int, int, java.lang.String, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15637c(final java.util.ArrayList r19, final boolean r20, final j$.time.LocalDateTime r21, final j$.time.LocalDateTime r22, final java.lang.String r23, boolean r24, final java.lang.String r25, final int r26, ww.AbstractC8193c r27) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.w2.m15637c(java.util.ArrayList, boolean, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, boolean, java.lang.String, int, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public final Object m15638d(int i10, int i11, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f40962a.f14943c.f1509a, true, false, new an.u4(i10, i11, 0));
    }

    /* renamed from: e */
    public final Object m15639e(String str, int i10, int i11, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f40962a.f14943c.f1509a, true, false, new an.v4(str, i10, i11, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r3.a0(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15640f(java.util.List r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xm.v2
            if (r0 == 0) goto L13
            r0 = r8
            xm.v2 r0 = (xm.v2) r0
            int r1 = r0.f40934d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40934d = r1
            goto L18
        L13:
            xm.v2 r0 = new xm.v2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f40932b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40934d
            gn.x2 r3 = r6.f40962a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            java.util.List r7 = r0.f40931a
            og.od.m10798c(r8)
            goto L55
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.util.List r7 = r0.f40931a
            og.od.m10798c(r8)
            goto L4a
        L3c:
            og.od.m10798c(r8)
            r0.f40931a = r7
            r0.f40934d = r5
            java.lang.Object r8 = r3.m6685e(r0)
            if (r8 != r1) goto L4a
            goto L54
        L4a:
            r0.f40931a = r7
            r0.f40934d = r4
            java.lang.Object r8 = r3.a0(r7, r0)
            if (r8 != r1) goto L55
        L54:
            return r1
        L55:
            ay.f r8 = tx.m0.f34659a
            ay.e r8 = ay.ExecutorC0495e.f3538c
            yx.d r8 = tx.c0.m13479b(r8)
            k9.f r0 = new k9.f
            r1 = 24
            r2 = 0
            r0.<init>(r7, r2, r1)
            r7 = 3
            tx.c0.m13502y(r8, r2, r2, r0, r7)
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.w2.m15640f(java.util.List, ww.c):java.lang.Object");
    }
}
