package pg;

import kotlin.jvm.internal.AbstractC4154l;
import ud.C7418v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a0 {
    /* renamed from: a */
    public static i0.p2 m11530a(i0.n2 type, i0.l2 size, i0.j2 streamUseCase) {
        AbstractC4154l.m8923f(type, "type");
        AbstractC4154l.m8923f(size, "size");
        AbstractC4154l.m8923f(streamUseCase, "streamUseCase");
        return new i0.p2(type, size, streamUseCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i0.p2 m11531b(int r5, android.util.Size r6, i0.C3083n r7, int r8, i0.m2 r9, i0.j2 r10) {
        /*
            java.lang.String r0 = "size"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            java.lang.String r0 = "surfaceSizeDefinition"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r0)
            java.util.HashMap r0 = r7.f16534f
            java.lang.String r1 = "configSource"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r9, r1)
            java.lang.String r1 = "streamUseCase"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r10, r1)
            java.util.LinkedHashMap r1 = i0.p2.f16557h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r2)
            i0.n2 r1 = (i0.n2) r1
            if (r1 != 0) goto L26
            i0.n2 r1 = i0.n2.PRIV
        L26:
            i0.l2 r2 = i0.l2.NOT_SUPPORT
            android.util.Size r3 = p0.AbstractC5787a.f28368a
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r4 = r4 * r3
            r3 = 1
            if (r8 != r3) goto L62
            java.util.HashMap r6 = r7.f16530b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r8)
            android.util.Size r6 = (android.util.Size) r6
            int r6 = p0.AbstractC5787a.m11337a(r6)
            if (r4 > r6) goto L4c
            i0.l2 r2 = i0.l2.S720P_16_9
            goto Led
        L4c:
            java.util.HashMap r6 = r7.f16532d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r6.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            int r5 = p0.AbstractC5787a.m11337a(r5)
            if (r4 > r5) goto Led
            i0.l2 r2 = i0.l2.S1440P_4_3
            goto Led
        L62:
            i0.m2 r3 = i0.m2.FEATURE_COMBINATION_TABLE
            if (r9 != r3) goto L94
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            i0.l2[] r7 = i0.p2.f16555f
            int r8 = r7.length
            r9 = 0
        L74:
            if (r9 >= r8) goto L87
            r0 = r7[r9]
            android.util.Size r3 = r0.getRelatedFixedSize()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L84
            r2 = r0
            goto L87
        L84:
            int r9 = r9 + 1
            goto L74
        L87:
            i0.l2 r7 = i0.l2.NOT_SUPPORT
            if (r2 != r7) goto Led
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto Led
            i0.l2 r2 = i0.l2.MAXIMUM
            goto Led
        L94:
            android.util.Size r6 = r7.f16529a
            int r6 = p0.AbstractC5787a.m11337a(r6)
            if (r4 > r6) goto L9f
            i0.l2 r2 = i0.l2.VGA
            goto Led
        L9f:
            android.util.Size r6 = r7.f16531c
            int r6 = p0.AbstractC5787a.m11337a(r6)
            if (r4 > r6) goto Laa
            i0.l2 r2 = i0.l2.PREVIEW
            goto Led
        Laa:
            android.util.Size r6 = r7.f16533e
            int r6 = p0.AbstractC5787a.m11337a(r6)
            if (r4 > r6) goto Lb5
            i0.l2 r2 = i0.l2.RECORD
            goto Led
        Lb5:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r0.get(r6)
            android.util.Size r6 = (android.util.Size) r6
            java.util.HashMap r7 = r7.f16537i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r7.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            if (r6 == 0) goto Ld8
            int r7 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r7
            if (r4 > r6) goto Lde
        Ld8:
            r6 = 2
            if (r8 == r6) goto Lde
            i0.l2 r2 = i0.l2.MAXIMUM
            goto Led
        Lde:
            if (r5 == 0) goto Led
            int r6 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r6
            if (r4 > r5) goto Led
            i0.l2 r2 = i0.l2.ULTRA_MAXIMUM
        Led:
            i0.p2 r5 = m11530a(r1, r2, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.a0.m11531b(int, android.util.Size, i0.n, int, i0.m2, i0.j2):i0.p2");
    }

    /* renamed from: c */
    public static void m11532c(long j6, int i10, char[] cArr, int i11, int i12) {
        int i13 = 64 - (i10 * 8);
        int i14 = i12 * 2;
        int i15 = 0;
        while (i15 < i14) {
            i13 -= 4;
            cArr[i11] = C7418v.f35216d[(int) ((j6 >> i13) & 15)];
            i15++;
            i11++;
        }
    }
}
