package o6;

import dy.AbstractC1856d;
import dy.C1855c;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.C6366p;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vx.EnumC7799a;
import ww.AbstractC8193c;
import wx.C8204e;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements j0 {

    /* renamed from: a */
    public final InterfaceC7564h f26125a;

    /* renamed from: b */
    public final File f26126b;

    /* renamed from: c */
    public final C8204e f26127c;

    /* renamed from: d */
    public final String f26128d;

    /* renamed from: e */
    public final String f26129e;

    /* renamed from: f */
    public final String f26130f;

    /* renamed from: g */
    public final C1855c f26131g;

    /* renamed from: h */
    public final C6366p f26132h;

    /* renamed from: i */
    public final C6366p f26133i;

    public q0(InterfaceC7564h context, File file) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(file, "file");
        this.f26125a = context;
        this.f26126b = file;
        Object obj = t0.f26159b;
        this.f26127c = new C8204e(new s0(file, (InterfaceC7559c) null, 0), C7565i.f36440a, -2, EnumC7799a.SUSPEND);
        this.f26128d = ".lock";
        this.f26129e = ".version";
        this.f26130f = "fcntl failed: EAGAIN";
        this.f26131g = AbstractC1856d.m5490a();
        this.f26132h = nd.m10782c(new n0(this, 2));
        this.f26133i = nd.m10782c(new n0(this, 1));
    }

    /* renamed from: f */
    public static final void m10452f(q0 q0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, vw.a] */
    @Override // o6.j0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10440a(ex.InterfaceC2139c r9, ww.AbstractC8193c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.q0.mo10440a(ex.c, ww.c):java.lang.Object");
    }

    @Override // o6.j0
    /* renamed from: b */
    public final Object mo10441b(aw.f0 f0Var) {
        C6366p c6366p = this.f26133i;
        if (c6366p.isInitialized()) {
            return new Integer(x0.f26194b.nativeIncrementAndGetCounterValue(((x0) c6366p.getValue()).f26195a));
        }
        return tx.c0.m13475K(this.f26125a, new m0(this, null, 1), f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Type inference failed for: r2v0, types: [ex.e] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o6.p0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // o6.j0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10442c(ex.InterfaceC2141e r19, ww.AbstractC8193c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.q0.mo10442c(ex.e, ww.c):java.lang.Object");
    }

    @Override // o6.j0
    /* renamed from: d */
    public final InterfaceC8209j mo10443d() {
        return this.f26127c;
    }

    @Override // o6.j0
    /* renamed from: e */
    public final Object mo10444e(AbstractC8193c abstractC8193c) {
        C6366p c6366p = this.f26133i;
        if (c6366p.isInitialized()) {
            return new Integer(x0.f26194b.nativeGetCounterValue(((x0) c6366p.getValue()).f26195a));
        }
        return tx.c0.m13475K(this.f26125a, new m0(this, null, 0), abstractC8193c);
    }
}
