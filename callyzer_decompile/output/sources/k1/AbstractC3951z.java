package k1;

import p3.AbstractC5818p;
import p3.C5812j;
import p3.C5819q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.z */
/* loaded from: classes.dex */
public abstract class AbstractC3951z {

    /* renamed from: a */
    public static final float f20334a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (c3.C0847b.m2271b(p3.AbstractC5818p.m11403g(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:22:0x0065). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8482a(p3.f0 r17, long r18, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.AbstractC3951z.m8482a(p3.f0, long, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8483b(p3.f0 r9, long r10, ww.AbstractC8193c r12) {
        /*
            boolean r0 = r12 instanceof k1.C3945t
            if (r0 == 0) goto L13
            r0 = r12
            k1.t r0 = (k1.C3945t) r0
            int r1 = r0.f20234e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20234e = r1
            goto L18
        L13:
            k1.t r0 = new k1.t
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f20233d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20234e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.jvm.internal.v r9 = r0.f20232c
            kotlin.jvm.internal.z r10 = r0.f20231b
            p3.q r11 = r0.f20230a
            og.od.m10798c(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            goto L99
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            og.od.m10798c(r12)
            p3.h0 r12 = r9.f28444f
            p3.j r12 = r12.f28461w
            boolean r12 = m8485d(r12, r10)
            if (r12 == 0) goto L44
            goto La5
        L44:
            p3.h0 r12 = r9.f28444f
            p3.j r12 = r12.f28461w
            java.lang.Object r12 = r12.f28467a
            int r2 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            p3.q r7 = (p3.C5819q) r7
            long r7 = r7.f28476a
            boolean r7 = p3.AbstractC5818p.m11400d(r7, r10)
            if (r7 == 0) goto L61
            goto L65
        L61:
            int r5 = r5 + 1
            goto L4f
        L64:
            r6 = r4
        L65:
            r11 = r6
            p3.q r11 = (p3.C5819q) r11
            if (r11 != 0) goto L6b
            goto La5
        L6b:
            kotlin.jvm.internal.z r10 = new kotlin.jvm.internal.z
            r10.<init>()
            kotlin.jvm.internal.z r12 = new kotlin.jvm.internal.z
            r12.<init>()
            r12.f21164a = r11
            w3.t2 r2 = r9.m11386d()
            long r5 = r2.mo14529b()
            kotlin.jvm.internal.v r2 = new kotlin.jvm.internal.v     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            r2.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            k1.u r7 = new k1.u     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            r0.f20230a = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            r0.f20231b = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            r0.f20232c = r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            r0.f20234e = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            java.lang.Object r9 = r9.m11387h(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            if (r9 != r1) goto L98
            return r1
        L98:
            r9 = r2
        L99:
            boolean r9 = r9.f21160a     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            if (r9 == 0) goto La5
            java.lang.Object r9 = r10.f21164a     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            p3.q r9 = (p3.C5819q) r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La6
            if (r9 != 0) goto La4
            return r11
        La4:
            return r9
        La5:
            return r4
        La6:
            java.lang.Object r9 = r10.f21164a
            p3.q r9 = (p3.C5819q) r9
            if (r9 != 0) goto Lad
            goto Lae
        Lad:
            r11 = r9
        Lae:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.AbstractC3951z.m8483b(p3.f0, long, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8484c(p3.f0 r4, long r5, ex.InterfaceC2139c r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof k1.C3950y
            if (r0 == 0) goto L13
            r0 = r8
            k1.y r0 = (k1.C3950y) r0
            int r1 = r0.f20324d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20324d = r1
            goto L18
        L13:
            k1.y r0 = new k1.y
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20323c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20324d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ex.c r4 = r0.f20322b
            p3.f0 r5 = r0.f20321a
            og.od.m10798c(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            og.od.m10798c(r8)
        L38:
            r0.f20321a = r4
            r0.f20322b = r7
            r0.f20324d = r3
            java.lang.Object r8 = m8482a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            p3.q r8 = (p3.C5819q) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = p3.AbstractC5818p.m11399c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f28476a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.AbstractC3951z.m8484c(p3.f0, long, ex.c, ww.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: d */
    public static final boolean m8485d(C5812j c5812j, long j6) {
        Object obj;
        ?? r62 = c5812j.f28467a;
        int size = r62.size();
        boolean z6 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i10);
            if (AbstractC5818p.m11400d(((C5819q) obj).f28476a, j6)) {
                break;
            }
            i10++;
        }
        C5819q c5819q = (C5819q) obj;
        if (c5819q != null && c5819q.f28479d) {
            z6 = true;
        }
        return true ^ z6;
    }
}
