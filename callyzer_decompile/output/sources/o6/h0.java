package o6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends C5324z {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10450b(java.lang.Object r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o6.g0
            if (r0 == 0) goto L13
            r0 = r8
            o6.g0 r0 = (o6.g0) r0
            int r1 = r0.f26050e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26050e = r1
            goto L18
        L13:
            o6.g0 r0 = new o6.g0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f26048c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26050e
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.io.FileOutputStream r7 = r0.f26047b
            java.io.FileOutputStream r0 = r0.f26046a
            og.od.m10798c(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L6c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            og.od.m10798c(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.f26208c
            boolean r8 = r8.get()
            if (r8 != 0) goto L72
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            java.io.File r2 = r6.f26206a
            r8.<init>(r2)
            o6.w0 r2 = r6.f26207b     // Catch: java.lang.Throwable -> L6a
            b00.j r5 = new b00.j     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L6a
            r0.f26046a = r8     // Catch: java.lang.Throwable -> L6a
            r0.f26047b = r8     // Catch: java.lang.Throwable -> L6a
            r0.f26050e = r4     // Catch: java.lang.Throwable -> L6a
            r2.mo5979c(r7, r5)     // Catch: java.lang.Throwable -> L6a
            if (r3 != r1) goto L5c
            return r1
        L5c:
            r7 = r8
            r0 = r7
        L5e:
            java.io.FileDescriptor r7 = r7.getFD()     // Catch: java.lang.Throwable -> L2d
            r7.sync()     // Catch: java.lang.Throwable -> L2d
            r7 = 0
            og.q1.m10844a(r0, r7)
            return r3
        L6a:
            r7 = move-exception
            r0 = r8
        L6c:
            throw r7     // Catch: java.lang.Throwable -> L6d
        L6d:
            r8 = move-exception
            og.q1.m10844a(r0, r7)
            throw r8
        L72:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This scope has already been closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.h0.m10450b(java.lang.Object, ww.c):java.lang.Object");
    }
}
