package ae;

import a9.C0073l;
import android.webkit.MimeTypeMap;
import b00.AbstractC0517b;
import b00.AbstractC0532q;
import b00.a0;
import b00.d0;
import fe.C2278b;
import ge.C2580l;
import ge.EnumC2570b;
import iz.C3370c;
import iz.C3389v;
import iz.C3393z;
import java.io.IOException;
import java.util.Map;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.md;
import p020v.x0;
import qw.C6366p;
import yd.C8632o;
import zd.C8938b;
import zd.C8942f;
import zd.C8943g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.m */
/* loaded from: classes.dex */
public final class C0132m implements InterfaceC0127h {

    /* renamed from: f */
    public static final C3370c f423f = new C3370c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g */
    public static final C3370c f424g = new C3370c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a */
    public final String f425a;

    /* renamed from: b */
    public final C2580l f426b;

    /* renamed from: c */
    public final C6366p f427c;

    /* renamed from: d */
    public final C6366p f428d;

    /* renamed from: e */
    public final boolean f429e;

    public C0132m(String str, C2580l c2580l, C6366p c6366p, C6366p c6366p2, boolean z6) {
        this.f425a = str;
        this.f426b = c2580l;
        this.f427c = c6366p;
        this.f428d = c6366p2;
        this.f429e = z6;
    }

    /* renamed from: d */
    public static String m301d(String str, C3393z c3393z) {
        String strM8841b;
        String str2 = c3393z != null ? c3393z.f18002a : null;
        if ((str2 == null || AbstractC5185w.m10138t(str2, "text/plain", false)) && (strM8841b = AbstractC4066g.m8841b(MimeTypeMap.getSingleton(), str)) != null) {
            return strM8841b;
        }
        if (str2 != null) {
            return AbstractC5178p.d0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0209 A[Catch: Exception -> 0x018d, TryCatch #1 {Exception -> 0x018d, blocks: (B:92:0x01da, B:94:0x01e0, B:96:0x0200, B:98:0x0205, B:97:0x0203, B:100:0x0209, B:101:0x020e, B:68:0x015d, B:71:0x0169, B:73:0x0175, B:75:0x0183, B:79:0x018f, B:81:0x019b, B:83:0x01b6, B:85:0x01bb, B:84:0x01b9, B:87:0x01bf), top: B:110:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: Exception -> 0x00cf, TRY_ENTER, TryCatch #0 {Exception -> 0x00cf, blocks: (B:102:0x020f, B:103:0x0212, B:66:0x0155, B:104:0x0213, B:105:0x0218, B:36:0x0095, B:38:0x009f, B:47:0x00d3, B:49:0x00d7, B:52:0x00f0, B:62:0x013c, B:54:0x0108, B:56:0x0114, B:57:0x011d, B:41:0x00b5, B:43:0x00bf, B:59:0x0127, B:60:0x012e, B:61:0x012f), top: B:109:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:102:0x020f, B:103:0x0212, B:66:0x0155, B:104:0x0213, B:105:0x0218, B:36:0x0095, B:38:0x009f, B:47:0x00d3, B:49:0x00d7, B:52:0x00f0, B:62:0x013c, B:54:0x0108, B:56:0x0114, B:57:0x011d, B:41:0x00b5, B:43:0x00bf, B:59:0x0127, B:60:0x012e, B:61:0x012f), top: B:109:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e0 A[Catch: Exception -> 0x018d, TryCatch #1 {Exception -> 0x018d, blocks: (B:92:0x01da, B:94:0x01e0, B:96:0x0200, B:98:0x0205, B:97:0x0203, B:100:0x0209, B:101:0x020e, B:68:0x015d, B:71:0x0169, B:73:0x0175, B:75:0x0183, B:79:0x018f, B:81:0x019b, B:83:0x01b6, B:85:0x01bb, B:84:0x01b9, B:87:0x01bf), top: B:110:0x015d }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, qw.g] */
    @Override // ae.InterfaceC0127h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo300a(uw.InterfaceC7559c r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.C0132m.mo300a(uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m302b(p020v.x0 r5, ww.AbstractC8193c r6) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.C0132m.m302b(v.x0, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public final AbstractC0532q m303c() {
        Object value = this.f428d.getValue();
        AbstractC4154l.m8920c(value);
        return ((C8943g) value).f42946a;
    }

    /* renamed from: e */
    public final x0 m304e() {
        C0073l c0073l = new C0073l();
        c0073l.m206P(this.f425a);
        C2580l c2580l = this.f426b;
        C3389v headers = c2580l.f14054j;
        EnumC2570b enumC2570b = c2580l.f14058n;
        AbstractC4154l.m8923f(headers, "headers");
        c0073l.f266c = headers.m7789j();
        for (Map.Entry entry : c2580l.f14055k.f14071a.entrySet()) {
            Object key = entry.getKey();
            AbstractC4154l.m8921d(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            c0073l.m204N((Class) key, entry.getValue());
        }
        boolean readEnabled = enumC2570b.getReadEnabled();
        boolean readEnabled2 = c2580l.f14059o.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            c0073l.m220l(C3370c.f17795o);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                c0073l.m220l(f424g);
            }
        } else if (enumC2570b.getWriteEnabled()) {
            c0073l.m220l(C3370c.f17794n);
        } else {
            c0073l.m220l(f423f);
        }
        return new x0(c0073l);
    }

    /* renamed from: f */
    public final C2278b m305f(C8942f c8942f) throws Throwable {
        Throwable th2;
        C2278b c2278b;
        try {
            AbstractC0532q abstractC0532qM303c = m303c();
            C8938b c8938b = c8942f.f42945a;
            if (c8938b.f42923b) {
                throw new IllegalStateException("snapshot is closed");
            }
            d0 d0VarM1524c = AbstractC0517b.m1524c(abstractC0532qM303c.mo1604S((a0) c8938b.f42922a.f42915c.get(0)));
            try {
                c2278b = new C2278b(d0VarM1524c);
                try {
                    d0VarM1524c.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    d0VarM1524c.close();
                } catch (Throwable th5) {
                    md.m10764a(th4, th5);
                }
                th2 = th4;
                c2278b = null;
            }
            if (th2 == null) {
                return c2278b;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final C8632o m306g(C8942f c8942f) {
        C8938b c8938b = c8942f.f42945a;
        if (c8938b.f42923b) {
            throw new IllegalStateException("snapshot is closed");
        }
        a0 a0Var = (a0) c8938b.f42922a.f42915c.get(1);
        AbstractC0532q abstractC0532qM303c = m303c();
        String str = this.f426b.f14053i;
        if (str == null) {
            str = this.f425a;
        }
        return new C8632o(a0Var, abstractC0532qM303c, str, c8942f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zd.C8942f m307h(zd.C8942f r4, p020v.x0 r5, iz.k0 r6, fe.C2278b r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.C0132m.m307h(zd.f, v.x0, iz.k0, fe.b):zd.f");
    }
}
