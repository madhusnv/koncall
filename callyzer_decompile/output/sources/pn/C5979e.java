package pn;

import kotlin.jvm.internal.AbstractC4154l;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pn.e */
/* loaded from: classes3.dex */
public final class C5979e {

    /* renamed from: a */
    public final x1 f29231a;

    public C5979e(x1 callLogsRepository) {
        AbstractC4154l.m8923f(callLogsRepository, "callLogsRepository");
        this.f29231a = callLogsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12010a(java.lang.String r10, j$.time.LocalDateTime r11, int r12, int r13, ww.AbstractC8193c r14) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r14 instanceof pn.C5975a
            if (r0 == 0) goto L13
            r0 = r14
            pn.a r0 = (pn.C5975a) r0
            int r1 = r0.f29221c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29221c = r1
            goto L18
        L13:
            pn.a r0 = new pn.a
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.f29219a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f29221c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r14)     // Catch: java.lang.Exception -> L27
            goto L4e
        L27:
            r0 = move-exception
            r10 = r0
            goto L51
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            og.od.m10798c(r14)
            xm.x1 r8 = r9.f29231a     // Catch: java.lang.Exception -> L27
            r0.f29221c = r3     // Catch: java.lang.Exception -> L27
            yx.d r14 = r8.f40994d     // Catch: java.lang.Exception -> L27
            uw.h r14 = r14.f42488a     // Catch: java.lang.Exception -> L27
            cu.a r2 = new cu.a     // Catch: java.lang.Exception -> L27
            r7 = 0
            r5 = r10
            r6 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L27
            java.lang.Object r14 = tx.c0.m13475K(r14, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r14 != r1) goto L4e
            return r1
        L4e:
            java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Exception -> L27
            return r14
        L51:
            r10.printStackTrace()
            qw.m r10 = og.od.m10796a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.C5979e.m12010a(java.lang.String, j$.time.LocalDateTime, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12011b(zm.EnumC8994d r12, java.lang.String r13, j$.time.LocalDateTime r14, int r15, int r16, ww.AbstractC8193c r17) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof pn.C5976b
            if (r1 == 0) goto L15
            r1 = r0
            pn.b r1 = (pn.C5976b) r1
            int r2 = r1.f29224c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f29224c = r2
            goto L1a
        L15:
            pn.b r1 = new pn.b
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.f29222a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f29224c
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            og.od.m10798c(r0)     // Catch: java.lang.Exception -> L29
            goto L52
        L29:
            r0 = move-exception
            r12 = r0
            goto L55
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            og.od.m10798c(r0)
            xm.x1 r5 = r11.f29231a     // Catch: java.lang.Exception -> L29
            r1.f29224c = r4     // Catch: java.lang.Exception -> L29
            yx.d r0 = r5.f40994d     // Catch: java.lang.Exception -> L29
            uw.h r0 = r0.f42488a     // Catch: java.lang.Exception -> L29
            xm.o0 r3 = new xm.o0     // Catch: java.lang.Exception -> L29
            r10 = 0
            r6 = r12
            r4 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L29
            java.lang.Object r0 = tx.c0.m13475K(r0, r3, r1)     // Catch: java.lang.Exception -> L29
            if (r0 != r2) goto L52
            return r2
        L52:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L29
            return r0
        L55:
            r12.printStackTrace()
            qw.m r12 = og.od.m10796a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.C5979e.m12011b(zm.d, java.lang.String, j$.time.LocalDateTime, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12012c(zm.EnumC8994d r13, java.lang.String r14, java.lang.String r15, j$.time.LocalDateTime r16, int r17, int r18, ww.AbstractC8193c r19) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r19
            boolean r1 = r0 instanceof pn.C5977c
            if (r1 == 0) goto L15
            r1 = r0
            pn.c r1 = (pn.C5977c) r1
            int r2 = r1.f29227c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f29227c = r2
            goto L1a
        L15:
            pn.c r1 = new pn.c
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f29225a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f29227c
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            og.od.m10798c(r0)     // Catch: java.lang.Exception -> L29
            return r0
        L29:
            r0 = move-exception
            r13 = r0
            goto L56
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            og.od.m10798c(r0)
            xm.x1 r6 = r12.f29231a     // Catch: java.lang.Exception -> L29
            r1.f29227c = r4     // Catch: java.lang.Exception -> L29
            yx.d r0 = r6.f40994d     // Catch: java.lang.Exception -> L29
            uw.h r0 = r0.f42488a     // Catch: java.lang.Exception -> L29
            xm.p1 r3 = new xm.p1     // Catch: java.lang.Exception -> L29
            r11 = 0
            r7 = r13
            r4 = r14
            r5 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L29
            java.lang.Object r13 = tx.c0.m13475K(r0, r3, r1)     // Catch: java.lang.Exception -> L29
            if (r13 != r2) goto L55
            return r2
        L55:
            return r13
        L56:
            r13.printStackTrace()
            qw.m r13 = og.od.m10796a(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.C5979e.m12012c(zm.d, java.lang.String, java.lang.String, j$.time.LocalDateTime, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12013d(java.lang.String r12, java.lang.String r13, j$.time.LocalDateTime r14, int r15, int r16, ww.AbstractC8193c r17) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof pn.C5978d
            if (r1 == 0) goto L15
            r1 = r0
            pn.d r1 = (pn.C5978d) r1
            int r2 = r1.f29230c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f29230c = r2
            goto L1a
        L15:
            pn.d r1 = new pn.d
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.f29228a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f29230c
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            og.od.m10798c(r0)     // Catch: java.lang.Exception -> L29
            return r0
        L29:
            r0 = move-exception
            r12 = r0
            goto L53
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            og.od.m10798c(r0)
            xm.x1 r6 = r11.f29231a     // Catch: java.lang.Exception -> L29
            r1.f29230c = r4     // Catch: java.lang.Exception -> L29
            yx.d r0 = r6.f40994d     // Catch: java.lang.Exception -> L29
            uw.h r0 = r0.f42488a     // Catch: java.lang.Exception -> L29
            xm.o0 r3 = new xm.o0     // Catch: java.lang.Exception -> L29
            r10 = 0
            r4 = r12
            r5 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L29
            java.lang.Object r12 = tx.c0.m13475K(r0, r3, r1)     // Catch: java.lang.Exception -> L29
            if (r12 != r2) goto L52
            return r2
        L52:
            return r12
        L53:
            r12.printStackTrace()
            qw.m r12 = og.od.m10796a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.C5979e.m12013d(java.lang.String, java.lang.String, j$.time.LocalDateTime, int, int, ww.c):java.lang.Object");
    }
}
