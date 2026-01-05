package an;

import og.pe;
import ww.AbstractC8193c;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g5 {

    /* renamed from: a */
    public final AbstractC8894w f862a;

    public g5(AbstractC8894w abstractC8894w) {
        this.f862a = abstractC8894w;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m446b(an.g5 r7, int r8, int r9, ww.AbstractC8193c r10) {
        /*
            boolean r0 = r10 instanceof an.x4
            if (r0 == 0) goto L13
            r0 = r10
            an.x4 r0 = (an.x4) r0
            int r1 = r0.f1544f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1544f = r1
            goto L18
        L13:
            an.x4 r0 = new an.x4
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f1542d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1544f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            og.od.m10798c(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            int r9 = r0.f1541c
            int r8 = r0.f1540b
            an.g5 r7 = r0.f1539a
            og.od.m10798c(r10)
            goto L58
        L3d:
            og.od.m10798c(r10)
            r0.f1539a = r7
            r0.f1540b = r8
            r0.f1541c = r9
            r0.f1544f = r5
            z7.w r10 = r7.f862a
            ad.h r2 = new ad.h
            r6 = 21
            r2.<init>(r6)
            java.lang.Object r10 = og.pe.m10839n(r0, r10, r5, r3, r2)
            if (r10 != r1) goto L58
            goto L71
        L58:
            j$.time.LocalDateTime r10 = (j$.time.LocalDateTime) r10
            r2 = 0
            r0.f1539a = r2
            r0.f1540b = r8
            r0.f1541c = r9
            r0.f1544f = r4
            z7.w r7 = r7.f862a
            an.v4 r2 = new an.v4
            r4 = 2
            r2.<init>(r10, r8, r9, r4)
            java.lang.Object r7 = og.pe.m10839n(r0, r7, r5, r3, r2)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: an.g5.m446b(an.g5, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m447c(an.g5 r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.y4
            if (r0 == 0) goto L13
            r0 = r8
            an.y4 r0 = (an.y4) r0
            int r1 = r0.f1591d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1591d = r1
            goto L18
        L13:
            an.y4 r0 = new an.y4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f1589b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1591d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            og.od.m10798c(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            an.g5 r7 = r0.f1588a
            og.od.m10798c(r8)
            goto L50
        L39:
            og.od.m10798c(r8)
            r0.f1588a = r7
            r0.f1591d = r5
            z7.w r8 = r7.f862a
            ad.h r2 = new ad.h
            r6 = 21
            r2.<init>(r6)
            java.lang.Object r8 = og.pe.m10839n(r0, r8, r5, r3, r2)
            if (r8 != r1) goto L50
            goto L65
        L50:
            j$.time.LocalDateTime r8 = (j$.time.LocalDateTime) r8
            r2 = 0
            r0.f1588a = r2
            r0.f1591d = r4
            z7.w r7 = r7.f862a
            an.x1 r2 = new an.x1
            r4 = 1
            r2.<init>(r4, r8)
            java.lang.Object r7 = og.pe.m10839n(r0, r7, r5, r3, r2)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: an.g5.m447c(an.g5, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m448d(an.g5 r21, java.util.List r22, ww.AbstractC8193c r23) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof an.z4
            if (r1 == 0) goto L17
            r1 = r0
            an.z4 r1 = (an.z4) r1
            int r2 = r1.f1632f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f1632f = r2
            r2 = r21
            goto L1e
        L17:
            an.z4 r1 = new an.z4
            r2 = r21
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f1630d
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r1.f1632f
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L36
            int r2 = r1.f1629c
            java.util.Iterator r4 = r1.f1628b
            an.g5 r7 = r1.f1627a
            og.od.m10798c(r0)
            r0 = r2
            r2 = r7
            r6 = 0
            goto L47
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            og.od.m10798c(r0)
            java.util.Iterator r0 = r22.iterator()
            r4 = r0
            r0 = 0
        L47:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r4.next()
            mm.g r7 = (mm.C4796g) r7
            mm.c r8 = r7.f23872b
            java.lang.String r10 = r8.f23846c
            int r11 = r8.f23847d
            java.lang.String r12 = r8.f23844a
            zm.d r9 = r8.f23848e
            if (r9 == 0) goto L69
            int r9 = r9.getTypeValue()
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r9)
            goto L6a
        L69:
            r13 = 0
        L6a:
            java.lang.Long r15 = r8.f23851h
            java.lang.String r9 = r8.f23850g
            j$.time.LocalDateTime r14 = r8.f23849f
            long r5 = r8.f23852j
            java.lang.String r8 = r7.f23873c
            java.lang.String r7 = r7.f23874d
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            r1.f1627a = r2
            r1.f1628b = r4
            r1.f1629c = r0
            r21 = r0
            r0 = 1
            r1.f1632f = r0
            z7.w r0 = r2.f862a
            r16 = r9
            an.c5 r9 = new an.c5
            r17 = r5
            r20 = r7
            r19 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r20)
            r5 = 1
            r6 = 0
            java.lang.Object r0 = og.pe.m10839n(r1, r0, r6, r5, r9)
            if (r0 != r3) goto L9c
            return r3
        L9c:
            r0 = r21
            goto L47
        L9f:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: an.g5.m448d(an.g5, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0240, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m449e(an.g5 r41, j$.time.LocalDateTime r42, om.C5415q r43, boolean r44, ww.AbstractC8193c r45) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.g5.m449e(an.g5, j$.time.LocalDateTime, om.q, boolean, ww.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object m450a(int i10, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f862a, false, true, new r1(i10, 12));
    }
}
