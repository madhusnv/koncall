package mg;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a */
    public final String f23664a;

    /* renamed from: b */
    public final char[] f23665b;

    /* renamed from: c */
    public final int f23666c;

    /* renamed from: d */
    public final int f23667d;

    /* renamed from: e */
    public final int f23668e;

    /* renamed from: f */
    public final int f23669f;

    /* renamed from: g */
    public final byte[] f23670g;

    /* renamed from: h */
    public final boolean f23671h;

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c2 = cArr[i10];
            if (!(c2 < 128)) {
                throw new IllegalArgumentException(AbstractC4723b.m9601c("Non-ASCII character: %s", Character.valueOf(c2)));
            }
            if (!(bArr[c2] == -1)) {
                throw new IllegalArgumentException(AbstractC4723b.m9601c("Duplicate character: %s", Character.valueOf(c2)));
            }
            bArr[c2] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f23671h == l0Var.f23671h && Arrays.equals(this.f23665b, l0Var.f23665b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23665b) + (true != this.f23671h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f23664a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l0(java.lang.String r4, char[] r5, byte[] r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            r3.f23664a = r4
            r5.getClass()
            r3.f23665b = r5
            int r4 = r5.length     // Catch: java.lang.ArithmeticException -> L73
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L73
            if (r4 <= 0) goto L7d
            int[] r1 = mg.p0.f23687a     // Catch: java.lang.ArithmeticException -> L73
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L73
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L73
            switch(r0) {
                case 1: goto L38;
                case 2: goto L3d;
                case 3: goto L3d;
                case 4: goto L2f;
                case 5: goto L2f;
                case 6: goto L20;
                case 7: goto L20;
                case 8: goto L20;
                default: goto L1a;
            }     // Catch: java.lang.ArithmeticException -> L73
        L1a:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L73
            r4.<init>()     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L20:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L73
            r1 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r1 = r1 >>> r0
            int r0 = 31 - r0
            int r1 = r1 - r4
            int r1 = r1 >>> 31
            int r0 = r0 + r1
            goto L43
        L2f:
            int r0 = r4 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L73
            int r0 = 32 - r0
            goto L43
        L38:
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 != 0) goto L75
        L3d:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L73
            int r0 = 31 - r0
        L43:
            r3.f23667d = r0     // Catch: java.lang.ArithmeticException -> L73
            int r5 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r1 = 3 - r5
            r2 = 1
            int r1 = r2 << r1
            r3.f23668e = r1
            int r5 = r0 >> r5
            r3.f23669f = r5
            int r4 = r4 + (-1)
            r3.f23666c = r4
            r3.f23670g = r6
            boolean[] r4 = new boolean[r1]
            r5 = 0
        L5d:
            int r6 = r3.f23669f
            if (r5 >= r6) goto L70
            int r6 = r5 * 8
            int r0 = r3.f23667d
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            int r6 = mg.AbstractC4723b.m9599a(r6, r0)
            r4[r6] = r2
            int r5 = r5 + 1
            goto L5d
        L70:
            r3.f23671h = r7
            return
        L73:
            r4 = move-exception
            goto L85
        L75:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L73
            java.lang.String r6 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r6)     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L7d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L73
            java.lang.String r6 = "x (0) must be > 0"
            r4.<init>(r6)     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L85:
            int r5 = r5.length
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Illegal alphabet length "
            java.lang.String r5 = mm.AbstractC4801l.m9730d(r5, r7)
            r6.<init>(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.l0.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
