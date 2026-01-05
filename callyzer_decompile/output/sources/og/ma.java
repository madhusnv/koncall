package og;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ma {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007e -> B:25:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0081 -> B:25:0x0061). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10759a(java.util.List r6, o6.C5307i r7, ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof o6.C5303e
            if (r0 == 0) goto L13
            r0 = r8
            o6.e r0 = (o6.C5303e) r0
            int r1 = r0.f26026d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26026d = r1
            goto L18
        L13:
            o6.e r0 = new o6.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26025c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26026d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f26024b
            java.io.Serializable r7 = r0.f26023a
            kotlin.jvm.internal.z r7 = (kotlin.jvm.internal.C4168z) r7
            og.od.m10798c(r8)     // Catch: java.lang.Throwable -> L30
            goto L61
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f26023a
            java.util.List r6 = (java.util.List) r6
            og.od.m10798c(r8)
            goto L58
        L42:
            java.util.ArrayList r8 = i0.m0.m7386s(r8)
            bs.g r2 = new bs.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f26023a = r8
            r0.f26026d = r4
            java.lang.Object r6 = r7.m10451a(r2, r0)
            if (r6 != r1) goto L57
            goto L8f
        L57:
            r6 = r8
        L58:
            kotlin.jvm.internal.z r7 = new kotlin.jvm.internal.z
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r6.next()
            ex.c r8 = (ex.InterfaceC2139c) r8
            r0.f26023a = r7     // Catch: java.lang.Throwable -> L30
            r0.f26024b = r6     // Catch: java.lang.Throwable -> L30
            r0.f26026d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L61
            goto L8f
        L7a:
            java.lang.Object r2 = r7.f21164a
            if (r2 != 0) goto L81
            r7.f21164a = r8
            goto L61
        L81:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            og.md.m10764a(r2, r8)
            goto L61
        L87:
            java.lang.Object r6 = r7.f21164a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L90
            qw.a0 r1 = qw.a0.f30746a
        L8f:
            return r1
        L90:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og.ma.m10759a(java.util.List, o6.i, ww.c):java.lang.Object");
    }
}
