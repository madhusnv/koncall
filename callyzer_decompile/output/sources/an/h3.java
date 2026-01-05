package an;

import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mm.C4791b;
import mm.C4803n;
import og.pe;
import pg.ea;
import ww.AbstractC8193c;
import xm.C8394b;
import z7.AbstractC8894w;
import zm.EnumC8991a;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h3 {

    /* renamed from: a */
    public final AbstractC8894w f899a;

    /* renamed from: b */
    public final q2 f900b;

    /* renamed from: c */
    public final r2 f901c;

    /* renamed from: d */
    public final r2 f902d = new r2(1);

    public h3(AbstractC8894w abstractC8894w) {
        this.f899a = abstractC8894w;
        int i10 = 0;
        this.f900b = new q2(i10);
        this.f901c = new r2(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m451A(an.h3 r6, int r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.k0
            if (r0 == 0) goto L13
            r0 = r8
            an.k0 r0 = (an.k0) r0
            int r1 = r0.f996c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f996c = r1
            goto L18
        L13:
            an.k0 r0 = new an.k0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f994a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f996c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            og.od.m10798c(r8)
            goto L46
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            og.od.m10798c(r8)
            zm.a r8 = zm.EnumC8991a.SYNC_CALL_RECORDING_UPDATE
            r0.f996c = r4
            z7.w r6 = r6.f899a
            an.b1 r2 = new an.b1
            r5 = 0
            r2.<init>(r8, r7, r5)
            java.lang.Object r8 = og.pe.m10839n(r0, r6, r3, r4, r2)
            if (r8 != r1) goto L46
            return r1
        L46:
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r8.intValue()
            if (r6 <= 0) goto L4f
            r3 = r4
        L4f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m451A(an.h3, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m452B(an.h3 r11, nm.C5107b r12, ww.AbstractC8193c r13) {
        /*
            boolean r0 = r13 instanceof an.l0
            if (r0 == 0) goto L13
            r0 = r13
            an.l0 r0 = (an.l0) r0
            int r1 = r0.f1032c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1032c = r1
            goto L18
        L13:
            an.l0 r0 = new an.l0
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f1030a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1032c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            og.od.m10798c(r13)
            goto L55
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            og.od.m10798c(r13)
            java.lang.String r7 = r12.f25010a
            java.lang.String r8 = r12.f25011b
            zm.d r10 = r12.m10037a()
            yv.o r13 = yv.C8800o.f42459a
            java.lang.String r12 = r12.f25012c
            j$.time.LocalDateTime r9 = yv.C8800o.m16183G(r12)
            zm.a r6 = zm.EnumC8991a.SYNC_CALL_RECORDING_UPDATE
            r0.f1032c = r4
            z7.w r11 = r11.f899a
            an.b2 r5 = new an.b2
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = og.pe.m10839n(r0, r11, r3, r4, r5)
            if (r13 != r1) goto L55
            return r1
        L55:
            java.lang.Number r13 = (java.lang.Number) r13
            int r11 = r13.intValue()
            if (r11 <= 0) goto L5e
            r3 = r4
        L5e:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m452B(an.h3, nm.b, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m453C(an.h3 r6, int r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.m0
            if (r0 == 0) goto L13
            r0 = r8
            an.m0 r0 = (an.m0) r0
            int r1 = r0.f1079c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1079c = r1
            goto L18
        L13:
            an.m0 r0 = new an.m0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f1077a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1079c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            og.od.m10798c(r8)
            goto L46
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            og.od.m10798c(r8)
            zm.a r8 = zm.EnumC8991a.SYNC_NOTE_UPDATE
            r0.f1079c = r4
            z7.w r6 = r6.f899a
            an.b1 r2 = new an.b1
            r5 = 0
            r2.<init>(r8, r7, r5)
            java.lang.Object r8 = og.pe.m10839n(r0, r6, r3, r4, r2)
            if (r8 != r1) goto L46
            return r1
        L46:
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r8.intValue()
            if (r6 <= 0) goto L4f
            r3 = r4
        L4f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m453C(an.h3, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m454D(an.h3 r12, java.lang.String r13, java.lang.String r14, zm.EnumC8994d r15, j$.time.LocalDateTime r16, ww.AbstractC8193c r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof an.n0
            if (r1 == 0) goto L15
            r1 = r0
            an.n0 r1 = (an.n0) r1
            int r2 = r1.f1125c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f1125c = r2
            goto L1a
        L15:
            an.n0 r1 = new an.n0
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f1123a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f1125c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2a
            og.od.m10798c(r0)
            goto L4c
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            og.od.m10798c(r0)
            zm.a r7 = zm.EnumC8991a.SYNC_NOTE_UPDATE
            r1.f1125c = r5
            z7.w r12 = r12.f899a
            an.b2 r6 = new an.b2
            r8 = r13
            r9 = r14
            r11 = r15
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r0 = og.pe.m10839n(r1, r12, r4, r5, r6)
            if (r0 != r2) goto L4c
            return r2
        L4c:
            java.lang.Number r0 = (java.lang.Number) r0
            int r12 = r0.intValue()
            if (r12 <= 0) goto L55
            r4 = r5
        L55:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m454D(an.h3, java.lang.String, java.lang.String, zm.d, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* renamed from: E */
    public static int m455E(EnumSet enumSet, boolean z6, boolean z10) {
        enumSet.remove(EnumC8991a.SYNC_NEW);
        enumSet.add(EnumC8991a.SYNC_DONE);
        if (z6) {
            EnumC8991a enumC8991a = EnumC8991a.SYNC_NOTE_UPDATE;
            if (enumSet.contains(enumC8991a)) {
                enumSet.remove(enumC8991a);
            }
        }
        if (z10) {
            EnumC8991a enumC8991a2 = EnumC8991a.SYNC_CALL_RECORDING_UPDATE;
            if (enumSet.contains(enumC8991a2)) {
                enumSet.remove(enumC8991a2);
            }
        }
        return ea.m11608c(enumSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m456F(an.h3 r5, int r6, boolean r7, boolean r8, ww.AbstractC8193c r9) {
        /*
            boolean r0 = r9 instanceof an.p0
            if (r0 == 0) goto L13
            r0 = r9
            an.p0 r0 = (an.p0) r0
            int r1 = r0.f1223g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1223g = r1
            goto L18
        L13:
            an.p0 r0 = new an.p0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f1221e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1223g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r9)
            goto L70
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            boolean r8 = r0.f1220d
            boolean r7 = r0.f1219c
            int r6 = r0.f1218b
            an.h3 r5 = r0.f1217a
            og.od.m10798c(r9)
            goto L52
        L3e:
            og.od.m10798c(r9)
            r0.f1217a = r5
            r0.f1218b = r6
            r0.f1219c = r7
            r0.f1220d = r8
            r0.f1223g = r4
            java.lang.Object r9 = r5.m483i(r6, r0)
            if (r9 != r1) goto L52
            goto L6f
        L52:
            mm.b r9 = (mm.C4791b) r9
            if (r9 == 0) goto L7f
            java.util.EnumSet r2 = r9.f23835d
            r5.getClass()
            m455E(r2, r7, r8)
            r2 = 0
            r0.f1217a = r2
            r0.f1218b = r6
            r0.f1219c = r7
            r0.f1220d = r8
            r0.f1223g = r3
            java.lang.Object r9 = r5.m487y(r9, r0)
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.Number r9 = (java.lang.Number) r9
            int r5 = r9.intValue()
            if (r5 <= 0) goto L79
            goto L7a
        L79:
            r4 = 0
        L7a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L7f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m456F(an.h3, int, boolean, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m457G(an.h3 r9, nm.C5107b r10, ww.AbstractC8193c r11) {
        /*
            boolean r0 = r11 instanceof an.o0
            if (r0 == 0) goto L14
            r0 = r11
            an.o0 r0 = (an.o0) r0
            int r1 = r0.f1173d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1173d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            an.o0 r0 = new an.o0
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f1171b
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f1173d
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L3a
            if (r1 == r8) goto L34
            if (r1 != r7) goto L2c
            og.od.m10798c(r11)
            goto L76
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            an.h3 r9 = r6.f1170a
            og.od.m10798c(r11)
            goto L5a
        L3a:
            og.od.m10798c(r11)
            java.lang.String r2 = r10.f25010a
            java.lang.String r3 = r10.f25011b
            zm.d r4 = r10.m10037a()
            yv.o r11 = yv.C8800o.f42459a
            java.lang.String r10 = r10.f25012c
            j$.time.LocalDateTime r5 = yv.C8800o.m16183G(r10)
            r6.f1170a = r9
            r6.f1173d = r8
            r1 = r9
            java.lang.Object r11 = r1.m484j(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L59
            goto L75
        L59:
            r9 = r1
        L5a:
            mm.b r11 = (mm.C4791b) r11
            if (r11 == 0) goto L85
            java.util.EnumSet r10 = r11.f23835d
            zm.a r1 = zm.EnumC8991a.SYNC_NEW
            r10.remove(r1)
            zm.a r1 = zm.EnumC8991a.SYNC_DONE
            r10.add(r1)
            r10 = 0
            r6.f1170a = r10
            r6.f1173d = r7
            java.lang.Object r11 = r9.m487y(r11, r6)
            if (r11 != r0) goto L76
        L75:
            return r0
        L76:
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r11.intValue()
            if (r9 <= 0) goto L7f
            goto L80
        L7f:
            r8 = 0
        L80:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            return r9
        L85:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m457G(an.h3, nm.b, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m458H(an.h3 r5, int r6, zm.EnumC8993c r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.q0
            if (r0 == 0) goto L13
            r0 = r8
            an.q0 r0 = (an.q0) r0
            int r1 = r0.f1269f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1269f = r1
            goto L18
        L13:
            an.q0 r0 = new an.q0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1267d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1269f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r6 = r0.f1266c
            zm.c r7 = r0.f1265b
            an.h3 r5 = r0.f1264a
            og.od.m10798c(r8)
            goto L4e
        L3c:
            og.od.m10798c(r8)
            r0.f1264a = r5
            r0.f1265b = r7
            r0.f1266c = r6
            r0.f1269f = r4
            java.lang.Object r8 = r5.m483i(r6, r0)
            if (r8 != r1) goto L4e
            goto L69
        L4e:
            mm.b r8 = (mm.C4791b) r8
            if (r8 == 0) goto L79
            r8.f23836e = r7
            r5.getClass()
            m461K(r8)
            r7 = 0
            r0.f1264a = r7
            r0.f1265b = r7
            r0.f1266c = r6
            r0.f1269f = r3
            java.lang.Object r8 = r5.m487y(r8, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r8.intValue()
            if (r5 <= 0) goto L73
            goto L74
        L73:
            r4 = 0
        L74:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L79:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m458H(an.h3, int, zm.c, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m459I(an.h3 r5, int r6, java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.r0
            if (r0 == 0) goto L13
            r0 = r8
            an.r0 r0 = (an.r0) r0
            int r1 = r0.f1310f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1310f = r1
            goto L18
        L13:
            an.r0 r0 = new an.r0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1308d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1310f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r6 = r0.f1307c
            java.lang.String r7 = r0.f1306b
            an.h3 r5 = r0.f1305a
            og.od.m10798c(r8)
            goto L4e
        L3c:
            og.od.m10798c(r8)
            r0.f1305a = r5
            r0.f1306b = r7
            r0.f1307c = r6
            r0.f1310f = r4
            java.lang.Object r8 = r5.m483i(r6, r0)
            if (r8 != r1) goto L4e
            goto L63
        L4e:
            mm.b r8 = (mm.C4791b) r8
            if (r8 == 0) goto L6d
            r8.f23838g = r7
            r7 = 0
            r0.f1305a = r7
            r0.f1306b = r7
            r0.f1307c = r6
            r0.f1310f = r3
            java.lang.Object r8 = r5.m487y(r8, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r8.intValue()
            ww.AbstractC8196f.m15349b(r5)
        L6d:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m459I(an.h3, int, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m460J(an.h3 r5, int r6, java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.s0
            if (r0 == 0) goto L13
            r0 = r8
            an.s0 r0 = (an.s0) r0
            int r1 = r0.f1344f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1344f = r1
            goto L18
        L13:
            an.s0 r0 = new an.s0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1342d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1344f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r6 = r0.f1341c
            java.lang.String r7 = r0.f1340b
            an.h3 r5 = r0.f1339a
            og.od.m10798c(r8)
            goto L4e
        L3c:
            og.od.m10798c(r8)
            r0.f1339a = r5
            r0.f1340b = r7
            r0.f1341c = r6
            r0.f1344f = r4
            java.lang.Object r8 = r5.m483i(r6, r0)
            if (r8 != r1) goto L4e
            goto L63
        L4e:
            mm.b r8 = (mm.C4791b) r8
            if (r8 == 0) goto L6d
            r8.f23837f = r7
            r7 = 0
            r0.f1339a = r7
            r0.f1340b = r7
            r0.f1341c = r6
            r0.f1344f = r3
            java.lang.Object r8 = r5.m487y(r8, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r8.intValue()
            ww.AbstractC8196f.m15349b(r5)
        L6d:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m460J(an.h3, int, java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: K */
    public static void m461K(C4791b c4791b) {
        EnumC8993c enumC8993c = c4791b.f23836e;
        EnumSet enumSet = c4791b.f23835d;
        switch (enumC8993c == null ? -1 : AbstractC0215v.f1448a[enumC8993c.ordinal()]) {
            case -1:
                enumSet.remove(EnumC8991a.SYNC_CALL_RECORDING_UPDATE);
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                enumSet.remove(EnumC8991a.SYNC_DONE);
                enumSet.add(EnumC8991a.SYNC_CALL_RECORDING_UPDATE);
                return;
            case 10:
            case 11:
            case 12:
                return;
        }
    }

    /* renamed from: a */
    public static String m462a(EnumC8993c enumC8993c) {
        switch (s2.f1348a[enumC8993c.ordinal()]) {
            case 1:
                return "NOT_FOUND";
            case 2:
                return "CON_COM_FAILED";
            case 3:
                return "DEVICE_OUT_OF_SPACE";
            case 4:
                return "LARGE_SIZE";
            case 5:
                return "SPACE_GET_FAILED";
            case 6:
                return "UPLOAD_FAILED";
            case 7:
                return "SPACE_UPDATE_FAILED";
            case 8:
                return "SUCCESS";
            case 9:
                return "DELETED";
            case 10:
                return "OUT_OF_SPACE";
            case 11:
                return "UPLOAD_IN_PROGRESS";
            case 12:
                return "COMPRESS_IN_PROGRESS";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: b */
    public static EnumC8993c m463b(String str) {
        switch (str.hashCode()) {
            case -2026521607:
                if (str.equals("DELETED")) {
                    return EnumC8993c.DELETED;
                }
                break;
            case -1990365125:
                if (str.equals("UPLOAD_FAILED")) {
                    return EnumC8993c.UPLOAD_FAILED;
                }
                break;
            case -1769293111:
                if (str.equals("UPLOAD_IN_PROGRESS")) {
                    return EnumC8993c.UPLOAD_IN_PROGRESS;
                }
                break;
            case -1740077403:
                if (str.equals("LARGE_SIZE")) {
                    return EnumC8993c.LARGE_SIZE;
                }
                break;
            case -1732422438:
                if (str.equals("SPACE_UPDATE_FAILED")) {
                    return EnumC8993c.SPACE_UPDATE_FAILED;
                }
                break;
            case -1149187101:
                if (str.equals("SUCCESS")) {
                    return EnumC8993c.SUCCESS;
                }
                break;
            case 429157816:
                if (str.equals("DEVICE_OUT_OF_SPACE")) {
                    return EnumC8993c.DEVICE_OUT_OF_SPACE;
                }
                break;
            case 696523375:
                if (str.equals("OUT_OF_SPACE")) {
                    return EnumC8993c.OUT_OF_SPACE;
                }
                break;
            case 722045610:
                if (str.equals("COMPRESS_IN_PROGRESS")) {
                    return EnumC8993c.COMPRESS_IN_PROGRESS;
                }
                break;
            case 964917855:
                if (str.equals("SPACE_GET_FAILED")) {
                    return EnumC8993c.SPACE_GET_FAILED;
                }
                break;
            case 1023286998:
                if (str.equals("NOT_FOUND")) {
                    return EnumC8993c.NOT_FOUND;
                }
                break;
            case 1545887704:
                if (str.equals("CON_COM_FAILED")) {
                    return EnumC8993c.CON_COM_FAILED;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m464e(an.h3 r6, java.lang.String r7, java.lang.String r8, zm.EnumC8994d r9, j$.time.LocalDateTime r10, boolean r11, ww.AbstractC8193c r12) {
        /*
            boolean r0 = r12 instanceof an.C0216w
            if (r0 == 0) goto L13
            r0 = r12
            an.w r0 = (an.C0216w) r0
            int r1 = r0.f1484j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1484j = r1
            goto L18
        L13:
            an.w r0 = new an.w
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.f1482g
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f1484j
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            og.od.m10798c(r12)
            goto L8e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            boolean r11 = r0.f1481f
            j$.time.LocalDateTime r10 = r0.f1480e
            zm.d r9 = r0.f1479d
            java.lang.String r8 = r0.f1478c
            java.lang.String r7 = r0.f1477b
            an.h3 r6 = r0.f1476a
            og.od.m10798c(r12)
            goto L64
        L43:
            og.od.m10798c(r12)
            if (r11 == 0) goto L6e
            r0.f1476a = r6
            r0.f1477b = r7
            r0.f1478c = r8
            r0.f1479d = r9
            r0.f1480e = r10
            r0.f1481f = r11
            r0.f1484j = r5
            z7.w r12 = r6.f899a
            an.k1 r2 = new an.k1
            r2.<init>(r7, r8, r9, r10)
            java.lang.Object r12 = og.pe.m10839n(r0, r12, r4, r5, r2)
            if (r12 != r1) goto L64
            goto L8d
        L64:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 <= 0) goto L6e
            r12 = r5
            goto L6f
        L6e:
            r12 = r4
        L6f:
            if (r12 != 0) goto L96
            r12 = 0
            r0.f1476a = r12
            r0.f1477b = r12
            r0.f1478c = r12
            r0.f1479d = r12
            r0.f1480e = r12
            r0.f1481f = r11
            r0.f1484j = r3
            z7.w r6 = r6.f899a
            an.k1 r11 = new an.k1
            r11.<init>(r10, r9, r7, r8)
            java.lang.Object r12 = og.pe.m10839n(r0, r6, r4, r5, r11)
            if (r12 != r1) goto L8e
        L8d:
            return r1
        L8e:
            java.lang.Number r12 = (java.lang.Number) r12
            int r6 = r12.intValue()
            if (r6 <= 0) goto L97
        L96:
            r4 = r5
        L97:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m464e(an.h3, java.lang.String, java.lang.String, zm.d, j$.time.LocalDateTime, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m465m(an.h3 r21, final j$.time.LocalDateTime r22, om.C5415q r23, ww.AbstractC8193c r24) {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            boolean r3 = r2 instanceof an.C0217x
            if (r3 == 0) goto L19
            r3 = r2
            an.x r3 = (an.C0217x) r3
            int r4 = r3.f1513c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f1513c = r4
            goto L1e
        L19:
            an.x r3 = new an.x
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f1511a
            vw.a r4 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r5 = r3.f1513c
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            og.od.m10798c(r2)
            goto L82
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            og.od.m10798c(r2)
            java.lang.String r2 = r1.f27207m
            kotlin.jvm.internal.AbstractC4154l.m8920c(r2)
            java.lang.String r8 = r1.f27201g
            zm.d r11 = r1.f27203i
            kotlin.jvm.internal.AbstractC4154l.m8920c(r11)
            j$.time.LocalDateTime r12 = r1.f27204j
            int r9 = r1.f27202h
            long r13 = r1.f27196b
            java.lang.Long r5 = r1.f27205k
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            long r15 = r5.longValue()
            java.lang.String r10 = r1.f27200f
            boolean r1 = r1.f27198d
            zm.a r5 = zm.EnumC8991a.SYNC_NEW
            java.util.EnumSet r5 = java.util.EnumSet.of(r5)
            java.lang.String r7 = "of(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r7)
            int r20 = pg.ea.m11608c(r5)
            r3.f1513c = r6
            z7.w r0 = r0.f899a
            an.t1 r7 = new an.t1
            r17 = r15
            r15 = r13
            r13 = r17
            r19 = r22
            r18 = r1
            r17 = r2
            r7.<init>()
            r1 = 0
            java.lang.Object r2 = og.pe.m10839n(r3, r0, r1, r6, r7)
            if (r2 != r4) goto L82
            return r4
        L82:
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m465m(an.h3, j$.time.LocalDateTime, om.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:21|(1:54)|22|50|23|24|48|25|52|26|27|56|28|(1:30)(5:31|32|45|19|(2:46|47)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:21|54|22|50|23|24|48|25|52|26|27|56|28|(1:30)(5:31|32|45|19|(2:46|47)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        r6 = r2;
        r2 = r7;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        r26 = r1;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        r8.append("\n");
        r8.append("Call-log insert query failed here, callLog details:- " + r9 + "\n");
        r8.append(og.md.m10766c(r0));
        r0.printStackTrace();
        r9 = "Call-log insert query failed here, callLog details:- " + r9;
        kotlin.jvm.internal.AbstractC4154l.m8923f(r9, "message");
        si.C6847c.m13044a().m13045b(r9);
        si.C6847c.m13044a().m13046c(r0);
        r0 = r8;
        r7 = r2;
        r2 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:32:0x00c2). Please report as a decompilation issue!!! */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m466n(an.h3 r26, java.util.List r27, java.lang.StringBuilder r28, ww.AbstractC8193c r29) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m466n(an.h3, java.util.List, java.lang.StringBuilder, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0082 -> B:20:0x0085). Please report as a decompilation issue!!! */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m467o(an.h3 r20, java.util.List r21, ww.AbstractC8193c r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof an.C0219z
            if (r1 == 0) goto L17
            r1 = r0
            an.z r1 = (an.C0219z) r1
            int r2 = r1.f1597f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f1597f = r2
            r2 = r20
            goto L1e
        L17:
            an.z r1 = new an.z
            r2 = r20
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f1595d
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r1.f1597f
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            int r2 = r1.f1594c
            java.util.Iterator r4 = r1.f1593b
            an.h3 r7 = r1.f1592a
            og.od.m10798c(r0)
            r0 = r2
            r2 = r7
            r6 = 0
            r7 = r5
            goto L85
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            og.od.m10798c(r0)
            java.util.Iterator r0 = r21.iterator()
            r4 = r0
            r0 = 0
        L48:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L87
            java.lang.Object r7 = r4.next()
            mm.h r7 = (mm.C4797h) r7
            mm.c r7 = r7.f23875a
            java.lang.String r9 = r7.f23846c
            java.lang.String r11 = r7.f23844a
            zm.d r12 = r7.f23848e
            j$.time.LocalDateTime r13 = r7.f23849f
            java.lang.Long r14 = r7.f23851h
            long r5 = r7.f23852j
            java.lang.String r8 = r7.f23850g
            int r10 = r7.f23847d
            r1.f1592a = r2
            r1.f1593b = r4
            r1.f1594c = r0
            r7 = 1
            r1.f1597f = r7
            z7.w r15 = r2.f899a
            r17 = r8
            an.c2 r8 = new an.c2
            r18 = r5
            r5 = r15
            r15 = r18
            r8.<init>()
            r6 = 0
            java.lang.Object r5 = og.pe.m10839n(r1, r5, r6, r7, r8)
            if (r5 != r3) goto L85
            return r3
        L85:
            r5 = r7
            goto L48
        L87:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m467o(an.h3, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m468p(an.h3 r24, java.util.List r25, ww.AbstractC8193c r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof an.a0
            if (r1 == 0) goto L17
            r1 = r0
            an.a0 r1 = (an.a0) r1
            int r2 = r1.f595f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f595f = r2
            r2 = r24
            goto L1e
        L17:
            an.a0 r1 = new an.a0
            r2 = r24
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f593d
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r1.f595f
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L36
            int r2 = r1.f592c
            java.util.Iterator r4 = r1.f591b
            an.h3 r7 = r1.f590a
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
            java.util.Iterator r0 = r25.iterator()
            r4 = r0
            r0 = 0
        L47:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lab
            java.lang.Object r7 = r4.next()
            mm.n r7 = (mm.C4803n) r7
            mm.c r8 = r7.f23913b
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
            j$.time.LocalDateTime r8 = r7.f23915d
            kotlin.jvm.internal.AbstractC4154l.m8920c(r8)
            r17 = r5
            java.lang.String r5 = r7.f23916e
            java.lang.String r6 = r7.f23917f
            r20 = r5
            java.lang.String r5 = r7.f23918g
            java.util.EnumSet r7 = r7.f23914c
            r1.f590a = r2
            r1.f591b = r4
            r1.f592c = r0
            r24 = r0
            r0 = 1
            r1.f595f = r0
            z7.w r0 = r2.f899a
            r16 = r9
            an.h2 r9 = new an.h2
            r22 = r5
            r21 = r6
            r23 = r7
            r19 = r8
            r9.<init>()
            r5 = 1
            r6 = 0
            java.lang.Object r0 = og.pe.m10839n(r1, r0, r6, r5, r9)
            if (r0 != r3) goto La8
            return r3
        La8:
            r0 = r24
            goto L47
        Lab:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m468p(an.h3, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m469q(an.h3 r6, om.C5415q r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.b0
            if (r0 == 0) goto L13
            r0 = r8
            an.b0 r0 = (an.b0) r0
            int r1 = r0.f643c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f643c = r1
            goto L18
        L13:
            an.b0 r0 = new an.b0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f641a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f643c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            og.od.m10798c(r8)
            goto L48
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            og.od.m10798c(r8)
            java.lang.String r8 = r7.f27197c
            int r7 = r7.f27195a
            r0.f643c = r4
            z7.w r6 = r6.f899a
            an.s1 r2 = new an.s1
            r5 = 0
            r2.<init>(r8, r7, r5)
            java.lang.Object r8 = og.pe.m10839n(r0, r6, r3, r4, r2)
            if (r8 != r1) goto L48
            return r1
        L48:
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r8.intValue()
            if (r6 <= 0) goto L51
            r3 = r4
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m469q(an.h3, om.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m470r(an.h3 r5, int r6, j$.time.LocalDateTime r7, java.lang.String r8, j$.time.LocalDateTime r9, ww.AbstractC8193c r10) {
        /*
            boolean r0 = r10 instanceof an.c0
            if (r0 == 0) goto L13
            r0 = r10
            an.c0 r0 = (an.c0) r0
            int r1 = r0.f683h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f683h = r1
            goto L18
        L13:
            an.c0 r0 = new an.c0
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f681f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f683h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r10)
            goto L74
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r6 = r0.f680e
            j$.time.LocalDateTime r9 = r0.f679d
            java.lang.String r8 = r0.f678c
            j$.time.LocalDateTime r7 = r0.f677b
            an.h3 r5 = r0.f676a
            og.od.m10798c(r10)
            goto L56
        L40:
            og.od.m10798c(r10)
            r0.f676a = r5
            r0.f677b = r7
            r0.f678c = r8
            r0.f679d = r9
            r0.f680e = r6
            r0.f683h = r4
            java.lang.Object r10 = r5.m483i(r6, r0)
            if (r10 != r1) goto L56
            goto L73
        L56:
            mm.b r10 = (mm.C4791b) r10
            if (r10 == 0) goto L83
            r10.f23841j = r8
            r10.f23834c = r7
            r10.f23843l = r9
            r7 = 0
            r0.f676a = r7
            r0.f677b = r7
            r0.f678c = r7
            r0.f679d = r7
            r0.f680e = r6
            r0.f683h = r3
            java.lang.Object r10 = r5.m487y(r10, r0)
            if (r10 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.Number r10 = (java.lang.Number) r10
            int r5 = r10.intValue()
            if (r5 <= 0) goto L7d
            goto L7e
        L7d:
            r4 = 0
        L7e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L83:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m470r(an.h3, int, j$.time.LocalDateTime, java.lang.String, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m471s(an.h3 r6, om.C5415q r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof an.d0
            if (r0 == 0) goto L13
            r0 = r8
            an.d0 r0 = (an.d0) r0
            int r1 = r0.f728c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f728c = r1
            goto L18
        L13:
            an.d0 r0 = new an.d0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f726a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f728c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            og.od.m10798c(r8)
            goto L48
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            og.od.m10798c(r8)
            java.lang.String r8 = r7.f27197c
            int r7 = r7.f27195a
            r0.f728c = r4
            z7.w r6 = r6.f899a
            an.s1 r2 = new an.s1
            r5 = 0
            r2.<init>(r8, r7, r5)
            java.lang.Object r8 = og.pe.m10839n(r0, r6, r3, r4, r2)
            if (r8 != r1) goto L48
            return r1
        L48:
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r8.intValue()
            if (r6 <= 0) goto L51
            r3 = r4
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m471s(an.h3, om.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m472t(an.h3 r5, int r6, j$.time.LocalDateTime r7, java.lang.String r8, j$.time.LocalDateTime r9, ww.AbstractC8193c r10) {
        /*
            boolean r0 = r10 instanceof an.e0
            if (r0 == 0) goto L13
            r0 = r10
            an.e0 r0 = (an.e0) r0
            int r1 = r0.f765h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f765h = r1
            goto L18
        L13:
            an.e0 r0 = new an.e0
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f763f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f765h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r10)
            goto L80
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r6 = r0.f762e
            j$.time.LocalDateTime r9 = r0.f761d
            java.lang.String r8 = r0.f760c
            j$.time.LocalDateTime r7 = r0.f759b
            an.h3 r5 = r0.f758a
            og.od.m10798c(r10)
            goto L56
        L40:
            og.od.m10798c(r10)
            r0.f758a = r5
            r0.f759b = r7
            r0.f760c = r8
            r0.f761d = r9
            r0.f762e = r6
            r0.f765h = r4
            java.lang.Object r10 = r5.m483i(r6, r0)
            if (r10 != r1) goto L56
            goto L7f
        L56:
            mm.b r10 = (mm.C4791b) r10
            if (r10 == 0) goto L8f
            r10.f23841j = r8
            r10.f23834c = r7
            r10.f23843l = r9
            java.util.EnumSet r7 = r10.f23835d
            zm.a r8 = zm.EnumC8991a.SYNC_DONE
            r7.remove(r8)
            zm.a r8 = zm.EnumC8991a.SYNC_NOTE_UPDATE
            r7.add(r8)
            r7 = 0
            r0.f758a = r7
            r0.f759b = r7
            r0.f760c = r7
            r0.f761d = r7
            r0.f762e = r6
            r0.f765h = r3
            java.lang.Object r10 = r5.m487y(r10, r0)
            if (r10 != r1) goto L80
        L7f:
            return r1
        L80:
            java.lang.Number r10 = (java.lang.Number) r10
            int r5 = r10.intValue()
            if (r5 <= 0) goto L89
            goto L8a
        L89:
            r4 = 0
        L8a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L8f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m472t(an.h3, int, j$.time.LocalDateTime, java.lang.String, j$.time.LocalDateTime, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        if (r3.m487y(r0, r5) == r7) goto L44;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m473u(an.h3 r23, nm.C5107b r24, java.lang.String r25, ww.AbstractC8193c r26) throws com.websoptimization.callyzerbiz.common.exception.DataNotFoundException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m473u(an.h3, nm.b, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (r2.m487y(r0, r5) == r7) goto L44;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m474v(an.h3 r21, nm.C5107b r22, ww.AbstractC8193c r23) throws com.websoptimization.callyzerbiz.common.exception.DataNotFoundException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m474v(an.h3, nm.b, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        if (r0 == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m475w(an.h3 r29, int r30, boolean r31, boolean r32, boolean r33, ww.AbstractC8193c r34) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m475w(an.h3, int, boolean, boolean, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m476x(an.h3 r29, nm.C5107b r30, boolean r31, ww.AbstractC8193c r32) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m476x(an.h3, nm.b, boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m477z(an.h3 r5, kn.C4121a r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof an.j0
            if (r0 == 0) goto L13
            r0 = r7
            an.j0 r0 = (an.j0) r0
            int r1 = r0.f960e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f960e = r1
            goto L18
        L13:
            an.j0 r0 = new an.j0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f958c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f960e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r7)
            goto L82
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kn.a r6 = r0.f957b
            an.h3 r5 = r0.f956a
            og.od.m10798c(r7)
            goto L4e
        L3a:
            og.od.m10798c(r7)
            mm.b r7 = r6.f21054a
            int r7 = r7.f23832a
            r0.f956a = r5
            r0.f957b = r6
            r0.f960e = r4
            java.lang.Object r7 = r5.m483i(r7, r0)
            if (r7 != r1) goto L4e
            goto L81
        L4e:
            mm.b r7 = (mm.C4791b) r7
            if (r7 == 0) goto L91
            java.lang.String r2 = r6.f21058e
            r7.f23837f = r2
            java.lang.String r2 = r6.f21059f
            r7.f23838g = r2
            java.lang.String r2 = r6.f21060g
            r7.f23839h = r2
            mm.b r2 = r6.f21054a
            zm.c r2 = r2.f23836e
            r7.f23836e = r2
            java.lang.String r6 = r6.f21062i
            r7.f23840i = r6
            j$.time.LocalDateTime r6 = j$.time.LocalDateTime.now()
            r7.f23834c = r6
            r5.getClass()
            m461K(r7)
            r6 = 0
            r0.f956a = r6
            r0.f957b = r6
            r0.f960e = r3
            java.lang.Object r7 = r5.m487y(r7, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r7.intValue()
            if (r5 <= 0) goto L8b
            goto L8c
        L8b:
            r4 = 0
        L8c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L91:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: an.h3.m477z(an.h3, kn.a, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public final Object m478c(List list, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6, int i10, int i11, int i12, C8394b c8394b) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT id,name,phone_number,date_time,duration,sim_number,call_type,country_code FROM ViewCallLogContactUserSim WHERE  call_type IN (");
        int iM14323c = p020v.a1.m14323c(list, sbM4568o, ") AND duration > ", "?", " AND date_time BETWEEN ");
        p020v.a1.m14319B(sbM4568o, "?", " AND ", "?", "  ORDER BY CASE WHEN ");
        p020v.a1.m14319B(sbM4568o, "?", " = 1 THEN date_time END ASC, CASE WHEN ", "?", " = 0 THEN date_time END DESC LIMIT ");
        return pe.m10839n(c8394b, this.f899a, true, false, new u0(p020v.a1.m14336p(sbM4568o, "?", " OFFSET ", "?", "toString(...)"), list, iM14323c, i10, localDateTime, localDateTime2, z6, i11, i12, 2));
    }

    /* renamed from: d */
    public final Object m479d(List list, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6, int i10, int i11, int i12, C8394b c8394b) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT id,name,phone_number,date_time,duration,sim_number,call_type,country_code FROM ViewCallLogContactUserSim WHERE  call_type IN (");
        int iM14323c = p020v.a1.m14323c(list, sbM4568o, ") AND duration > ", "?", " AND date_time BETWEEN ");
        p020v.a1.m14319B(sbM4568o, "?", " AND ", "?", "  ORDER BY CASE WHEN ");
        p020v.a1.m14319B(sbM4568o, "?", " = 1 THEN duration END ASC, CASE WHEN ", "?", " = 0 THEN duration END DESC LIMIT ");
        return pe.m10839n(c8394b, this.f899a, true, false, new u0(p020v.a1.m14336p(sbM4568o, "?", " OFFSET ", "?", "toString(...)"), list, iM14323c, i10, localDateTime, localDateTime2, z6, i11, i12, 3));
    }

    /* renamed from: f */
    public final Object m480f(C4803n c4803n, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f899a, false, true, new o1(4, this, c4803n));
    }

    /* renamed from: g */
    public final Object m481g(int i10, int i11, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, List list, AbstractC8193c abstractC8193c, boolean z6) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT name,Count(phone_number) AS count ,phone_number,country_code,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND phone_number NOT IN (");
        int iM14323c = p020v.a1.m14323c(list, sbM4568o, ") AND date_time BETWEEN ", "?", " AND  ");
        p020v.a1.m14319B(sbM4568o, "?", " GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN new_duration END ASC, CASE WHEN ");
        p020v.a1.m14319B(sbM4568o, "?", " = 0 THEN new_duration END DESC LIMIT ", "?", " OFFSET ");
        return pe.m10839n(abstractC8193c, this.f899a, true, false, new y0(iM14323c, i10, i11, 2, i0.m0.m7381n(sbM4568o, "?", "toString(...)"), str, localDateTime, localDateTime2, list, z6));
    }

    /* renamed from: h */
    public final Object m482h(LocalDateTime localDateTime, LocalDateTime localDateTime2, List list, int i10, int i11, boolean z6, AbstractC8193c abstractC8193c) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT name ,Count(phone_number) AS count ,phone_number,country_code,date_time,SUM(duration)AS new_duration FROM ViewCallLogContactUserSim WHERE phone_number NOT IN (");
        int iM14323c = p020v.a1.m14323c(list, sbM4568o, ") AND date_time BETWEEN ", "?", " AND  ");
        p020v.a1.m14319B(sbM4568o, "?", " GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN new_duration END ASC, CASE WHEN ");
        p020v.a1.m14319B(sbM4568o, "?", " = 0 THEN new_duration END DESC LIMIT ", "?", " OFFSET ");
        return pe.m10839n(abstractC8193c, this.f899a, true, false, new v0(iM14323c, i10, i11, 0, i0.m0.m7381n(sbM4568o, "?", "toString(...)"), localDateTime, localDateTime2, list, z6));
    }

    /* renamed from: i */
    public final Object m483i(int i10, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f899a, true, false, new r1(i10, 4));
    }

    /* renamed from: j */
    public final Object m484j(String str, String str2, EnumC8994d enumC8994d, LocalDateTime localDateTime, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f899a, true, false, new k1(localDateTime, str, str2, enumC8994d, 3));
    }

    /* renamed from: k */
    public final Object m485k(int i10, int i11, int i12, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, List list, AbstractC8193c abstractC8193c, boolean z6) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? AND sim_number = ? AND phone_number NOT IN (");
        int iM14323c = p020v.a1.m14323c(list, sbM4568o, ") GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN new_duration END ASC, CASE WHEN ");
        p020v.a1.m14319B(sbM4568o, "?", " = 0 THEN new_duration END DESC LIMIT ", "?", " OFFSET ");
        return pe.m10839n(abstractC8193c, this.f899a, true, false, new f1(i0.m0.m7381n(sbM4568o, "?", "toString(...)"), localDateTime, localDateTime2, i10, str, list, iM14323c, z6, i11, i12, 5));
    }

    /* renamed from: l */
    public final Object m486l(LocalDateTime localDateTime, LocalDateTime localDateTime2, List list, int i10, boolean z6, int i11, int i12, AbstractC8193c abstractC8193c) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? AND phone_number NOT IN (");
        int iM14323c = p020v.a1.m14323c(list, sbM4568o, ") GROUP BY phone_number ORDER BY CASE WHEN ", "?", " = 1 THEN new_duration END ASC, CASE WHEN ");
        p020v.a1.m14319B(sbM4568o, "?", " = 0 THEN new_duration END DESC LIMIT ", "?", " OFFSET ");
        return pe.m10839n(abstractC8193c, this.f899a, true, false, new u0(i0.m0.m7381n(sbM4568o, "?", "toString(...)"), localDateTime, localDateTime2, i10, list, iM14323c, z6, i11, i12, 5));
    }

    /* renamed from: y */
    public final Object m487y(C4791b c4791b, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, this.f899a, false, true, new o1(3, this, c4791b));
    }
}
