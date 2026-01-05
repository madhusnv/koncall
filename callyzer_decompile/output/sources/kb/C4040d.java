package kb;

import gb.C2552b;
import gb.InterfaceC2556f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import nd.InterfaceC5016g;
import nd.InterfaceC5018i;
import og.bb;
import og.gf;
import ox.C5770a;
import ox.C5775f;
import ox.EnumC5772c;
import ox.InterfaceC5776g;
import pg.x5;
import sb.InterfaceC6775b;
import td.C7124a;
import tx.C7265y;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7564h;
import wc.b0;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kb.d */
/* loaded from: classes.dex */
public final class C4040d extends b0 implements InterfaceC6775b, InterfaceC7266z {

    /* renamed from: b */
    public final InterfaceC5776g f20872b;

    /* renamed from: c */
    public final C7124a f20873c;

    /* renamed from: d */
    public final C8849i f20874d;

    /* renamed from: e */
    public final long f20875e;

    /* renamed from: f */
    public final InterfaceC7564h f20876f;

    public C4040d() {
        C8849i c8849i = new C8849i(3);
        int i10 = C5770a.f28335d;
        long jM10551g = bb.m10551g(1, EnumC5772c.MINUTES);
        this.f20872b = C5775f.f28341a;
        this.f20873c = C7124a.f34340a;
        this.f20874d = c8849i;
        this.f20875e = jM10551g;
        this.f20876f = x5.m11928d(c0.m13480c(), new C7265y("DefaultS3ExpressCredentialsProvider"));
    }

    /* renamed from: n */
    public static InterfaceC5016g m8831n(InterfaceC2556f interfaceC2556f) {
        AbstractC4154l.m8923f(interfaceC2556f, "<this>");
        InterfaceC5018i interfaceC5018iMo9308d = ((C2552b) interfaceC2556f).f13884a.f13926C.mo9308d();
        String strM8913b = a0.m8901a(C4040d.class).m8913b();
        if (strM8913b != null) {
            return interfaceC5018iMo9308d.mo9905a(strM8913b);
        }
        throw new IllegalArgumentException("getLogger<T> cannot be used on an anonymous object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c0.m13486i(this.f20876f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8832j(kb.C4042f r19, gb.InterfaceC2556f r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.C4040d.m8832j(kb.f, gb.f, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (r1 != r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // vc.InterfaceC7700c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(ec.InterfaceC2004b r13, uw.InterfaceC7559c r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.C4040d.resolve(ec.b, uw.c):java.lang.Object");
    }

    public final String toString() {
        return gf.m10673a(this);
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f20876f;
    }
}
