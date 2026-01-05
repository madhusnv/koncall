package b00;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 implements i0 {

    /* renamed from: a */
    public final InterfaceC0528m f3588a;

    /* renamed from: b */
    public final C0526k f3589b;

    /* renamed from: c */
    public e0 f3590c;

    /* renamed from: d */
    public int f3591d;

    /* renamed from: e */
    public boolean f3592e;

    /* renamed from: f */
    public long f3593f;

    public b0(InterfaceC0528m interfaceC0528m) {
        this.f3588a = interfaceC0528m;
        C0526k c0526kMo1544a = interfaceC0528m.mo1544a();
        this.f3589b = c0526kMo1544a;
        e0 e0Var = c0526kMo1544a.f3637a;
        this.f3590c = e0Var;
        this.f3591d = e0Var != null ? e0Var.f3608b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3592e = true;
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f3588a.mo1532f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f3608b) goto L15;
     */
    @Override // b00.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g0(b00.C0526k r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f3592e
            if (r3 != 0) goto L63
            b00.e0 r3 = r8.f3590c
            b00.k r4 = r8.f3589b
            if (r3 == 0) goto L2b
            b00.e0 r5 = r4.f3637a
            if (r3 != r5) goto L23
            int r3 = r8.f3591d
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            int r5 = r5.f3608b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f3593f
            r2 = 1
            long r0 = r0 + r2
            b00.m r2 = r8.f3588a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            b00.e0 r0 = r8.f3590c
            if (r0 != 0) goto L4c
            b00.e0 r0 = r4.f3637a
            if (r0 == 0) goto L4c
            r8.f3590c = r0
            int r0 = r0.f3608b
            r8.f3591d = r0
        L4c:
            long r0 = r4.f3638b
            long r2 = r8.f3593f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            b00.k r2 = r8.f3589b
            long r4 = r8.f3593f
            r3 = r9
            r2.m1586A(r3, r4, r6)
            long r9 = r8.f3593f
            long r9 = r9 + r6
            r8.f3593f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p020v.a1.m14330j(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.b0.g0(b00.k, long):long");
    }
}
