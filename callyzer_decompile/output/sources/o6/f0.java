package o6;

import dy.AbstractC1856d;
import dy.C1855c;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 implements InterfaceC5300b {

    /* renamed from: a */
    public final File f26036a;

    /* renamed from: b */
    public final w0 f26037b;

    /* renamed from: c */
    public final j0 f26038c;

    /* renamed from: d */
    public final b0 f26039d;

    /* renamed from: e */
    public final AtomicBoolean f26040e;

    /* renamed from: f */
    public final C1855c f26041f;

    public f0(File file, w0 serializer, j0 coordinator, b0 b0Var) {
        AbstractC4154l.m8923f(serializer, "serializer");
        AbstractC4154l.m8923f(coordinator, "coordinator");
        this.f26036a = file;
        this.f26037b = serializer;
        this.f26038c = coordinator;
        this.f26039d = b0Var;
        this.f26040e = new AtomicBoolean(false);
        this.f26041f = AbstractC1856d.m5490a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [o6.f0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o6.d0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o6.f0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o6.m] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10448a(o6.C5311m r8, ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o6.d0
            if (r0 == 0) goto L13
            r0 = r9
            o6.d0 r0 = (o6.d0) r0
            int r1 = r0.f26021f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26021f = r1
            goto L18
        L13:
            o6.d0 r0 = new o6.d0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f26019d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26021f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r8 = r0.f26018c
            o6.z r1 = r0.f26017b
            o6.f0 r0 = r0.f26016a
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6a
        L2e:
            r9 = move-exception
            goto L83
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            og.od.m10798c(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f26040e
            boolean r9 = r9.get()
            if (r9 != 0) goto L99
            dy.c r9 = r7.f26041f
            boolean r9 = r9.m5489e()
            o6.z r2 = new o6.z     // Catch: java.lang.Throwable -> L8c
            java.io.File r5 = r7.f26036a     // Catch: java.lang.Throwable -> L8c
            o6.w0 r6 = r7.f26037b     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7d
            r0.f26016a = r7     // Catch: java.lang.Throwable -> L7d
            r0.f26017b = r2     // Catch: java.lang.Throwable -> L7d
            r0.f26018c = r9     // Catch: java.lang.Throwable -> L7d
            r0.f26021f = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7d
            if (r8 != r1) goto L65
            return r1
        L65:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6a:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            r1 = r4
            goto L70
        L6f:
            r1 = move-exception
        L70:
            if (r1 != 0) goto L7a
            if (r8 == 0) goto L79
            dy.c r8 = r0.f26041f
            r8.mo1769j(r4)
        L79:
            return r9
        L7a:
            throw r1     // Catch: java.lang.Throwable -> L7b
        L7b:
            r9 = move-exception
            goto L91
        L7d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L83:
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r1 = move-exception
            og.md.m10764a(r9, r1)     // Catch: java.lang.Throwable -> L7b
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L7b
        L8c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L91:
            if (r8 == 0) goto L98
            dy.c r8 = r0.f26041f
            r8.mo1769j(r4)
        L98:
            throw r9
        L99:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StorageConnection has already been disposed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f0.m10448a(o6.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x011d, IOException -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x011f, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:51:0x00fc, B:52:0x011c, B:48:0x00f5, B:59:0x0128, B:66:0x0135, B:65:0x0132), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10449b(aw.f0 r12, ww.AbstractC8193c r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f0.m10449b(aw.f0, ww.c):java.lang.Object");
    }

    @Override // o6.InterfaceC5300b
    public final void close() {
        this.f26040e.set(true);
        this.f26039d.invoke();
    }
}
