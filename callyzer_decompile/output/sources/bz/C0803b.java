package bz;

import f00.AbstractC2175d;
import java.security.SecureRandom;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bz.b */
/* loaded from: classes3.dex */
public final class C0803b implements InterfaceC0804c {

    /* renamed from: a */
    public byte[] f5026a;

    /* renamed from: b */
    public SecureRandom f5027b;

    static {
        AbstractC2175d.m5852b(C0803b.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e A[Catch: all -> 0x000c, TRY_LEAVE, TryCatch #1 {all -> 0x000c, blocks: (B:4:0x0003, B:6:0x0006, B:9:0x000e, B:20:0x002c, B:10:0x000f, B:12:0x0014, B:15:0x001b, B:16:0x0028), top: B:25:0x0003, inners: #0 }] */
    @Override // bz.InterfaceC0804c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void mo2134a(int r3, int r4, byte[] r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto Le
            int r0 = r5.length     // Catch: java.lang.Throwable -> Lc
            if (r4 != r0) goto Le
            java.security.SecureRandom r3 = r2.f5027b     // Catch: java.lang.Throwable -> Lc
            r3.nextBytes(r5)     // Catch: java.lang.Throwable -> Lc
            goto L29
        Lc:
            r3 = move-exception
            goto L2d
        Le:
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lc
            byte[] r0 = r2.f5026a     // Catch: java.lang.Throwable -> L19
            int r0 = r0.length     // Catch: java.lang.Throwable -> L19
            if (r4 <= r0) goto L1b
            byte[] r0 = new byte[r4]     // Catch: java.lang.Throwable -> L19
            r2.f5026a = r0     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r3 = move-exception
            goto L2b
        L1b:
            java.security.SecureRandom r0 = r2.f5027b     // Catch: java.lang.Throwable -> L19
            byte[] r1 = r2.f5026a     // Catch: java.lang.Throwable -> L19
            r0.nextBytes(r1)     // Catch: java.lang.Throwable -> L19
            byte[] r0 = r2.f5026a     // Catch: java.lang.Throwable -> L19
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r5, r3, r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
        L29:
            monitor-exit(r2)
            return
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> Lc
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.C0803b.mo2134a(int, int, byte[]):void");
    }
}
