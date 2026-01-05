package b8;

import aw.C0465e;
import ex.InterfaceC2137a;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import pg.a9;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.f */
/* loaded from: classes.dex */
public final class C0611f implements InterfaceC0607b {

    /* renamed from: a */
    public final C0618m f4014a;

    /* renamed from: b */
    public final C0618m f4015b;

    /* renamed from: c */
    public final ThreadLocal f4016c;

    /* renamed from: d */
    public final AtomicBoolean f4017d;

    /* renamed from: e */
    public final long f4018e;

    public C0611f(C7105p c7105p) {
        this.f4016c = new ThreadLocal();
        this.f4017d = new AtomicBoolean(false);
        int i10 = C5770a.f28335d;
        this.f4018e = bb.m10551g(30, EnumC5772c.SECONDS);
        C0618m c0618m = new C0618m(1, new C0465e(1, c7105p));
        this.f4014a = c0618m;
        this.f4015b = c0618m;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f4017d.compareAndSet(false, true)) {
            this.f4014a.m1773c();
            this.f4015b.m1773c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:63:0x0129, B:68:0x0147, B:70:0x0152, B:84:0x01a7, B:85:0x01ae), top: B:108:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #0 {all -> 0x01a2, blocks: (B:74:0x0185, B:76:0x018b, B:78:0x0197, B:80:0x019b), top: B:106:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7 A[Catch: all -> 0x01a3, TRY_ENTER, TryCatch #1 {all -> 0x01a3, blocks: (B:63:0x0129, B:68:0x0147, B:70:0x0152, B:84:0x01a7, B:85:0x01ae), top: B:108:0x0129 }] */
    @Override // b8.InterfaceC0607b
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1767s(boolean r18, ex.InterfaceC2141e r19, ww.AbstractC8193c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0611f.mo1767s(boolean, ex.e, ww.c):java.lang.Object");
    }

    public C0611f(final C7105p c7105p, final String fileName, int i10) {
        AbstractC4154l.m8923f(fileName, "fileName");
        this.f4016c = new ThreadLocal();
        final int i11 = 0;
        this.f4017d = new AtomicBoolean(false);
        int i12 = C5770a.f28335d;
        this.f4018e = bb.m10551g(30, EnumC5772c.SECONDS);
        if (i10 > 0) {
            this.f4014a = new C0618m(i10, new InterfaceC2137a() { // from class: b8.c
                @Override // ex.InterfaceC2137a
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            InterfaceC4024a interfaceC4024aMo8823s = c7105p.mo8823s(fileName);
                            a9.m11538a(interfaceC4024aMo8823s, "PRAGMA query_only = 1");
                            return interfaceC4024aMo8823s;
                        default:
                            return c7105p.mo8823s(fileName);
                    }
                }
            });
            final int i13 = 1;
            this.f4015b = new C0618m(1, new InterfaceC2137a() { // from class: b8.c
                @Override // ex.InterfaceC2137a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            InterfaceC4024a interfaceC4024aMo8823s = c7105p.mo8823s(fileName);
                            a9.m11538a(interfaceC4024aMo8823s, "PRAGMA query_only = 1");
                            return interfaceC4024aMo8823s;
                        default:
                            return c7105p.mo8823s(fileName);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
