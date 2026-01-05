package o6;

import uw.InterfaceC7563g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 implements InterfaceC7563g {

    /* renamed from: a */
    public static final d1 f26022a = new d1();

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:27:0x0075). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10445a(java.io.FileOutputStream r12, ww.AbstractC8193c r13) throws java.io.IOException {
        /*
            boolean r0 = r13 instanceof o6.l0
            if (r0 == 0) goto L13
            r0 = r13
            o6.l0 r0 = (o6.l0) r0
            int r1 = r0.f26085d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26085d = r1
            goto L18
        L13:
            o6.l0 r0 = new o6.l0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f26084c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26085d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r4 = r0.f26083b
            java.io.FileOutputStream r12 = r0.f26082a
            og.od.m10798c(r13)
            r13 = r0
            goto L75
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            og.od.m10798c(r13)
            r4 = 10
            r13 = r0
        L3a:
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
        */
        //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto L7a
            java.nio.channels.FileChannel r6 = r12.getChannel()     // Catch: java.io.IOException -> L58
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L58
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r2)     // Catch: java.io.IOException -> L58
            r1 = r0
            goto L8d
        L58:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L79
            java.lang.String r6 = "Resource deadlock would occur"
            r7 = 0
            boolean r2 = nx.AbstractC5178p.m10116x(r2, r6, r7)
            if (r2 != r3) goto L79
            r13.f26082a = r12
            r13.f26083b = r4
            r13.f26085d = r3
            java.lang.Object r0 = tx.c0.m13489l(r4, r13)
            if (r0 != r1) goto L75
            goto L8d
        L75:
            r0 = 2
            long r6 = (long) r0
            long r4 = r4 * r6
            goto L3a
        L79:
            throw r0
        L7a:
            java.nio.channels.FileChannel r6 = r12.getChannel()
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r1 = r6.lock(r7, r9, r11)
            kotlin.jvm.internal.AbstractC4154l.m8922e(r1, r2)
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.d1.m10445a(java.io.FileOutputStream, ww.c):java.lang.Object");
    }
}
