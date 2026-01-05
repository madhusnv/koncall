package pg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q6 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11829a(vx.InterfaceC7819u r4, ex.InterfaceC2137a r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof vx.C7816r
            if (r0 == 0) goto L13
            r0 = r6
            vx.r r0 = (vx.C7816r) r0
            int r1 = r0.f37526c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37526c = r1
            goto L18
        L13:
            vx.r r0 = new vx.r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37525b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f37526c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ex.a r5 = r0.f37524a
            og.od.m10798c(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            og.od.m10798c(r6)
            uw.h r6 = r0.getContext()
            tx.w r2 = tx.C7263w.f34689b
            uw.f r6 = r6.o0(r2)
            if (r6 != r4) goto L6e
            r0.f37524a = r5     // Catch: java.lang.Throwable -> L29
            r0.f37526c = r3     // Catch: java.lang.Throwable -> L29
            tx.k r6 = new tx.k     // Catch: java.lang.Throwable -> L29
            uw.c r0 = pg.n6.m11797c(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.m13540p()     // Catch: java.lang.Throwable -> L29
            vx.s r0 = new vx.s     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            vx.t r4 = (vx.C7818t) r4     // Catch: java.lang.Throwable -> L29
            r4.l0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.m13539o()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.invoke()
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L6a:
            r5.invoke()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.q6.m11829a(vx.u, ex.a, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static byte[] m11830b(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    /* renamed from: c */
    public static String m11831c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(i10 / 16));
            sb2.append("0123456789abcdef".charAt(i10 % 16));
        }
        return sb2.toString();
    }
}
