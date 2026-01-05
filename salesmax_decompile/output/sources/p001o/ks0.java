package p001o;

import android.util.Pair;
import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.objectweb.asm.Opcodes;
import p001o.js0;
import p001o.ph3;
import p001o.w5;
import p001o.z17;

/* loaded from: classes2.dex */
public abstract class ks0 {

    /* renamed from: a */
    public static final byte[] f32613a = sqi.t0("OpusHead");

    /* renamed from: o.ks0$a */
    public static final class C14911a {

        /* renamed from: a */
        public final int f32614a;

        /* renamed from: b */
        public int f32615b;

        /* renamed from: c */
        public int f32616c;

        /* renamed from: d */
        public long f32617d;

        /* renamed from: e */
        public final boolean f32618e;

        /* renamed from: f */
        public final zwc f32619f;

        /* renamed from: g */
        public final zwc f32620g;

        /* renamed from: h */
        public int f32621h;

        /* renamed from: i */
        public int f32622i;

        public C14911a(zwc zwcVar, zwc zwcVar2, boolean z) throws byc {
            this.f32620g = zwcVar;
            this.f32619f = zwcVar2;
            this.f32618e = z;
            zwcVar2.m60017U(12);
            this.f32614a = zwcVar2.m60008L();
            zwcVar.m60017U(12);
            this.f32622i = zwcVar.m60008L();
            wq6.m54803a(zwcVar.m60036q() == 1, "first_chunk must be 1");
            this.f32615b = -1;
        }

        /* renamed from: a */
        public boolean m36171a() {
            int i = this.f32615b + 1;
            this.f32615b = i;
            if (i == this.f32614a) {
                return false;
            }
            this.f32617d = this.f32618e ? this.f32619f.m60009M() : this.f32619f.m60006J();
            if (this.f32615b == this.f32621h) {
                this.f32616c = this.f32620g.m60008L();
                this.f32620g.m60018V(4);
                int i2 = this.f32622i - 1;
                this.f32622i = i2;
                this.f32621h = i2 > 0 ? this.f32620g.m60008L() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: o.ks0$b */
    public static final class C14912b {

        /* renamed from: a */
        public final String f32623a;

        /* renamed from: b */
        public final byte[] f32624b;

        /* renamed from: c */
        public final long f32625c;

        /* renamed from: d */
        public final long f32626d;

        public C14912b(String str, byte[] bArr, long j, long j2) {
            this.f32623a = str;
            this.f32624b = bArr;
            this.f32625c = j;
            this.f32626d = j2;
        }
    }

    /* renamed from: o.ks0$c */
    public interface InterfaceC14913c {
        /* renamed from: a */
        int mo36176a();

        /* renamed from: b */
        int mo36177b();

        /* renamed from: c */
        int mo36178c();
    }

    /* renamed from: o.ks0$d */
    public static final class C14914d {

        /* renamed from: a */
        public final nth[] f32627a;

        /* renamed from: b */
        public C2181a f32628b;

        /* renamed from: c */
        public int f32629c;

        /* renamed from: d */
        public int f32630d = 0;

        public C14914d(int i) {
            this.f32627a = new nth[i];
        }
    }

    /* renamed from: o.ks0$e */
    public static final class C14915e implements InterfaceC14913c {

        /* renamed from: a */
        public final int f32631a;

        /* renamed from: b */
        public final int f32632b;

        /* renamed from: c */
        public final zwc f32633c;

        public C14915e(js0.C14645b c14645b, C2181a c2181a) {
            zwc zwcVar = c14645b.f31022b;
            this.f32633c = zwcVar;
            zwcVar.m60017U(12);
            int iM60008L = zwcVar.m60008L();
            if ("audio/raw".equals(c2181a.f7943n)) {
                int iI0 = sqi.i0(c2181a.f7921D, c2181a.f7919B);
                if (iM60008L == 0 || iM60008L % iI0 != 0) {
                    ria.m46824h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iI0 + ", stsz sample size: " + iM60008L);
                    iM60008L = iI0;
                }
            }
            this.f32631a = iM60008L == 0 ? -1 : iM60008L;
            this.f32632b = zwcVar.m60008L();
        }

        @Override // p001o.ks0.InterfaceC14913c
        /* renamed from: a */
        public int mo36176a() {
            int i = this.f32631a;
            return i == -1 ? this.f32633c.m60008L() : i;
        }

        @Override // p001o.ks0.InterfaceC14913c
        /* renamed from: b */
        public int mo36177b() {
            return this.f32631a;
        }

        @Override // p001o.ks0.InterfaceC14913c
        /* renamed from: c */
        public int mo36178c() {
            return this.f32632b;
        }
    }

    /* renamed from: o.ks0$f */
    public static final class C14916f implements InterfaceC14913c {

        /* renamed from: a */
        public final zwc f32634a;

        /* renamed from: b */
        public final int f32635b;

        /* renamed from: c */
        public final int f32636c;

        /* renamed from: d */
        public int f32637d;

        /* renamed from: e */
        public int f32638e;

        public C14916f(js0.C14645b c14645b) {
            zwc zwcVar = c14645b.f31022b;
            this.f32634a = zwcVar;
            zwcVar.m60017U(12);
            this.f32636c = zwcVar.m60008L() & Constants.MAX_HOST_LENGTH;
            this.f32635b = zwcVar.m60008L();
        }

        @Override // p001o.ks0.InterfaceC14913c
        /* renamed from: a */
        public int mo36176a() {
            int i = this.f32636c;
            if (i == 8) {
                return this.f32634a.m60004H();
            }
            if (i == 16) {
                return this.f32634a.m60010N();
            }
            int i2 = this.f32637d;
            this.f32637d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f32638e & 15;
            }
            int iM60004H = this.f32634a.m60004H();
            this.f32638e = iM60004H;
            return (iM60004H & 240) >> 4;
        }

        @Override // p001o.ks0.InterfaceC14913c
        /* renamed from: b */
        public int mo36177b() {
            return -1;
        }

        @Override // p001o.ks0.InterfaceC14913c
        /* renamed from: c */
        public int mo36178c() {
            return this.f32635b;
        }
    }

    /* renamed from: o.ks0$g */
    public static final class C14917g {

        /* renamed from: a */
        public final int f32639a;

        /* renamed from: b */
        public final long f32640b;

        /* renamed from: c */
        public final int f32641c;

        public C14917g(int i, long j, int i2) {
            this.f32639a = i;
            this.f32640b = j;
            this.f32641c = i2;
        }
    }

    /* renamed from: A */
    public static mth m36139A(js0.C14644a c14644a, js0.C14645b c14645b, long j, DrmInitData drmInitData, boolean z, boolean z2) throws byc {
        js0.C14645b c14645b2;
        long j2;
        long[] jArr;
        long[] jArr2;
        js0.C14644a c14644aM34450f;
        Pair pairM36154j;
        js0.C14644a c14644a2 = (js0.C14644a) op0.m42515e(c14644a.m34450f(1835297121));
        int iM36149e = m36149e(m36157m(((js0.C14645b) op0.m42515e(c14644a2.m34451g(1751411826))).f31022b));
        if (iM36149e == -1) {
            return null;
        }
        C14917g c14917gM36170z = m36170z(((js0.C14645b) op0.m42515e(c14644a.m34451g(1953196132))).f31022b);
        if (j == -9223372036854775807L) {
            c14645b2 = c14645b;
            j2 = c14917gM36170z.f32640b;
        } else {
            c14645b2 = c14645b;
            j2 = j;
        }
        long j3 = m36162r(c14645b2.f31022b).f8085c;
        long jA1 = j2 != -9223372036854775807L ? sqi.a1(j2, 1000000L, j3) : -9223372036854775807L;
        js0.C14644a c14644a3 = (js0.C14644a) op0.m42515e(((js0.C14644a) op0.m42515e(c14644a2.m34450f(1835626086))).m34450f(1937007212));
        Pair pairM36159o = m36159o(((js0.C14645b) op0.m42515e(c14644a2.m34451g(1835296868))).f31022b);
        js0.C14645b c14645bM34451g = c14644a3.m34451g(1937011556);
        if (c14645bM34451g == null) {
            throw byc.m19921a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        C14914d c14914dM36168x = m36168x(c14645bM34451g.f31022b, c14917gM36170z.f32639a, c14917gM36170z.f32641c, (String) pairM36159o.second, drmInitData, z2);
        if (z || (c14644aM34450f = c14644a.m34450f(1701082227)) == null || (pairM36154j = m36154j(c14644aM34450f)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM36154j.first;
            jArr2 = (long[]) pairM36154j.second;
            jArr = jArr3;
        }
        if (c14914dM36168x.f32628b == null) {
            return null;
        }
        return new mth(c14917gM36170z.f32639a, iM36149e, ((Long) pairM36159o.first).longValue(), j3, jA1, c14914dM36168x.f32628b, c14914dM36168x.f32630d, c14914dM36168x.f32627a, c14914dM36168x.f32629c, jArr, jArr2);
    }

    /* renamed from: B */
    public static List m36140B(js0.C14644a c14644a, gn7 gn7Var, long j, DrmInitData drmInitData, boolean z, boolean z2, ol7 ol7Var) {
        mth mthVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c14644a.f31021d.size(); i++) {
            js0.C14644a c14644a2 = (js0.C14644a) c14644a.f31021d.get(i);
            if (c14644a2.f31018a == 1953653099 && (mthVar = (mth) ol7Var.apply(m36139A(c14644a2, (js0.C14645b) op0.m42515e(c14644a.m34451g(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(m36167w(mthVar, (js0.C14644a) op0.m42515e(((js0.C14644a) op0.m42515e(((js0.C14644a) op0.m42515e(c14644a2.m34450f(1835297121))).m34450f(1835626086))).m34450f(1937007212)), gn7Var));
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public static Metadata m36141C(js0.C14645b c14645b) {
        zwc zwcVar = c14645b.f31022b;
        zwcVar.m60017U(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (zwcVar.m60020a() >= 8) {
            int iM60025f = zwcVar.m60025f();
            int iM60036q = zwcVar.m60036q();
            int iM60036q2 = zwcVar.m60036q();
            if (iM60036q2 == 1835365473) {
                zwcVar.m60017U(iM60025f);
                metadata = metadata.m6694b(m36142D(zwcVar, iM60025f + iM60036q));
            } else if (iM60036q2 == 1936553057) {
                zwcVar.m60017U(iM60025f);
                metadata = metadata.m6694b(uwf.m52089b(zwcVar, iM60025f + iM60036q));
            } else if (iM60036q2 == -1451722374) {
                metadata = metadata.m6694b(m36144F(zwcVar));
            }
            zwcVar.m60017U(iM60025f + iM60036q);
        }
        return metadata;
    }

    /* renamed from: D */
    public static Metadata m36142D(zwc zwcVar, int i) {
        zwcVar.m60018V(8);
        m36150f(zwcVar);
        while (zwcVar.m60025f() < i) {
            int iM60025f = zwcVar.m60025f();
            int iM60036q = zwcVar.m60036q();
            if (zwcVar.m60036q() == 1768715124) {
                zwcVar.m60017U(iM60025f);
                return m36158n(zwcVar, iM60025f + iM60036q);
            }
            zwcVar.m60017U(iM60025f + iM60036q);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.List] */
    /* renamed from: E */
    public static void m36143E(zwc zwcVar, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C14914d c14914d, int i6) throws byc {
        DrmInitData drmInitData2;
        int i7;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12 = i2;
        int i13 = i3;
        DrmInitData drmInitDataM6683c = drmInitData;
        C14914d c14914d2 = c14914d;
        int i14 = 8;
        zwcVar.m60017U(i12 + 8 + 8);
        zwcVar.m60018V(16);
        int iM60010N = zwcVar.m60010N();
        int iM60010N2 = zwcVar.m60010N();
        zwcVar.m60018V(50);
        int iM60025f = zwcVar.m60025f();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairM36165u = m36165u(zwcVar, i12, i13);
            if (pairM36165u != null) {
                iIntValue = ((Integer) pairM36165u.first).intValue();
                drmInitDataM6683c = drmInitDataM6683c == null ? null : drmInitDataM6683c.m6683c(((nth) pairM36165u.second).f37300b);
                c14914d2.f32627a[i6] = (nth) pairM36165u.second;
            }
            zwcVar.m60017U(iM60025f);
        }
        String str2 = "video/3gpp";
        float fM36163s = 1.0f;
        nf8 nf8VarM40500F = null;
        String str3 = null;
        byte[] bArrM36164t = null;
        int i15 = -1;
        int i16 = -1;
        int iM43661j = -1;
        int i17 = -1;
        int iM43662k = -1;
        ByteBuffer byteBuffer = null;
        C14912b c14912bM36155k = null;
        boolean z = false;
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i18 = iM60025f;
        int i19 = 8;
        while (i18 - i12 < i13) {
            zwcVar.m60017U(i18);
            int iM60025f2 = zwcVar.m60025f();
            int iM60036q = zwcVar.m60036q();
            if (iM60036q == 0 && zwcVar.m60025f() - i12 == i13) {
                break;
            }
            wq6.m54803a(iM60036q > 0, "childAtomSize must be positive");
            int iM60036q2 = zwcVar.m60036q();
            if (iM60036q2 == 1635148611) {
                wq6.m54803a(str4 == null, null);
                zwcVar.m60017U(iM60025f2 + 8);
                w61 w61VarM54001b = w61.m54001b(zwcVar);
                ?? r6 = w61VarM54001b.f51523a;
                c14914d2.f32629c = w61VarM54001b.f51524b;
                if (!z) {
                    fM36163s = w61VarM54001b.f51533k;
                }
                String str5 = w61VarM54001b.f51534l;
                int i20 = w61VarM54001b.f51532j;
                int i21 = w61VarM54001b.f51529g;
                int i22 = w61VarM54001b.f51530h;
                int i23 = w61VarM54001b.f51531i;
                int i24 = w61VarM54001b.f51527e;
                drmInitData2 = drmInitDataM6683c;
                i16 = i20;
                i9 = iIntValue;
                str = str2;
                iM43661j = i21;
                i17 = i22;
                iM43662k = i23;
                str4 = "video/avc";
                nf8VarM40500F = r6;
                str3 = str5;
                i19 = w61VarM54001b.f51528f;
                i14 = i24;
            } else {
                if (iM60036q2 == 1752589123) {
                    wq6.m54803a(str4 == null, null);
                    zwcVar.m60017U(iM60025f2 + 8);
                    ey7 ey7VarM25845a = ey7.m25845a(zwcVar);
                    ?? r2 = ey7VarM25845a.f22382a;
                    c14914d2.f32629c = ey7VarM25845a.f22383b;
                    if (!z) {
                        fM36163s = ey7VarM25845a.f22391j;
                    }
                    int i25 = ey7VarM25845a.f22392k;
                    String str6 = ey7VarM25845a.f22393l;
                    nf8VarM40500F = r2;
                    drmInitData2 = drmInitDataM6683c;
                    i16 = i25;
                    iM43661j = ey7VarM25845a.f22388g;
                    i9 = iIntValue;
                    str = str2;
                    i17 = ey7VarM25845a.f22389h;
                    iM43662k = ey7VarM25845a.f22390i;
                    str4 = "video/hevc";
                    i14 = ey7VarM25845a.f22386e;
                    str3 = str6;
                    i19 = ey7VarM25845a.f22387f;
                } else {
                    if (iM60036q2 == 1685480259 || iM60036q2 == 1685485123) {
                        drmInitData2 = drmInitDataM6683c;
                        i7 = i14;
                        i8 = i19;
                        i9 = iIntValue;
                        str = str2;
                        i10 = iM43661j;
                        i11 = iM43662k;
                        sw5 sw5VarM48957a = sw5.m48957a(zwcVar);
                        if (sw5VarM48957a != null) {
                            str4 = "video/dolby-vision";
                            str3 = sw5VarM48957a.f46019c;
                        }
                    } else {
                        if (iM60036q2 == 1987076931) {
                            wq6.m54803a(str4 == null, null);
                            String str7 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            zwcVar.m60017U(iM60025f2 + 12);
                            zwcVar.m60018V(2);
                            int iM60004H = zwcVar.m60004H();
                            i14 = iM60004H >> 4;
                            boolean z2 = (iM60004H & 1) != 0;
                            int iM60004H2 = zwcVar.m60004H();
                            int iM60004H3 = zwcVar.m60004H();
                            iM43661j = ph3.m43661j(iM60004H2);
                            i17 = z2 ? 1 : 2;
                            iM43662k = ph3.m43662k(iM60004H3);
                            str4 = str7;
                            drmInitData2 = drmInitDataM6683c;
                            i19 = i14;
                        } else if (iM60036q2 == 1635135811) {
                            int i26 = iM60036q - 8;
                            byte[] bArr = new byte[i26];
                            zwcVar.m60031l(bArr, 0, i26);
                            nf8VarM40500F = nf8.m40500F(bArr);
                            zwcVar.m60017U(iM60025f2 + 8);
                            ph3 ph3VarM36152h = m36152h(zwcVar);
                            int i27 = ph3VarM36152h.f40076e;
                            i19 = ph3VarM36152h.f40077f;
                            int i28 = ph3VarM36152h.f40072a;
                            int i29 = ph3VarM36152h.f40073b;
                            str4 = "video/av01";
                            iM43662k = ph3VarM36152h.f40074c;
                            i14 = i27;
                            drmInitData2 = drmInitDataM6683c;
                            iM43661j = i28;
                            i9 = iIntValue;
                            str = str2;
                            i17 = i29;
                        } else if (iM60036q2 == 1668050025) {
                            ByteBuffer byteBufferM36145a = byteBuffer == null ? m36145a() : byteBuffer;
                            byteBufferM36145a.position(21);
                            byteBufferM36145a.putShort(zwcVar.m60000D());
                            byteBufferM36145a.putShort(zwcVar.m60000D());
                            byteBuffer = byteBufferM36145a;
                            drmInitData2 = drmInitDataM6683c;
                        } else if (iM60036q2 == 1835295606) {
                            ByteBuffer byteBufferM36145a2 = byteBuffer == null ? m36145a() : byteBuffer;
                            short sM60000D = zwcVar.m60000D();
                            short sM60000D2 = zwcVar.m60000D();
                            short sM60000D3 = zwcVar.m60000D();
                            i9 = iIntValue;
                            short sM60000D4 = zwcVar.m60000D();
                            str = str2;
                            short sM60000D5 = zwcVar.m60000D();
                            short sM60000D6 = zwcVar.m60000D();
                            int i30 = i19;
                            short sM60000D7 = zwcVar.m60000D();
                            int i31 = i14;
                            short sM60000D8 = zwcVar.m60000D();
                            long jM60006J = zwcVar.m60006J();
                            long jM60006J2 = zwcVar.m60006J();
                            drmInitData2 = drmInitDataM6683c;
                            byteBufferM36145a2.position(1);
                            byteBufferM36145a2.putShort(sM60000D5);
                            byteBufferM36145a2.putShort(sM60000D6);
                            byteBufferM36145a2.putShort(sM60000D);
                            byteBufferM36145a2.putShort(sM60000D2);
                            byteBufferM36145a2.putShort(sM60000D3);
                            byteBufferM36145a2.putShort(sM60000D4);
                            byteBufferM36145a2.putShort(sM60000D7);
                            byteBufferM36145a2.putShort(sM60000D8);
                            byteBufferM36145a2.putShort((short) (jM60006J / 10000));
                            byteBufferM36145a2.putShort((short) (jM60006J2 / 10000));
                            byteBuffer = byteBufferM36145a2;
                            i19 = i30;
                            i14 = i31;
                        } else {
                            drmInitData2 = drmInitDataM6683c;
                            i7 = i14;
                            i8 = i19;
                            i9 = iIntValue;
                            str = str2;
                            if (iM60036q2 == 1681012275) {
                                wq6.m54803a(str4 == null, null);
                                str4 = str;
                            } else if (iM60036q2 == 1702061171) {
                                wq6.m54803a(str4 == null, null);
                                c14912bM36155k = m36155k(zwcVar, iM60025f2);
                                String str8 = c14912bM36155k.f32623a;
                                byte[] bArr2 = c14912bM36155k.f32624b;
                                if (bArr2 != null) {
                                    nf8VarM40500F = nf8.m40500F(bArr2);
                                }
                                str4 = str8;
                            } else if (iM60036q2 == 1885434736) {
                                fM36163s = m36163s(zwcVar, iM60025f2);
                                i19 = i8;
                                i14 = i7;
                                z = true;
                                i18 += iM60036q;
                                i12 = i2;
                                i13 = i3;
                                c14914d2 = c14914d;
                                iIntValue = i9;
                                str2 = str;
                                drmInitDataM6683c = drmInitData2;
                            } else if (iM60036q2 == 1937126244) {
                                bArrM36164t = m36164t(zwcVar, iM60025f2, iM60036q);
                            } else if (iM60036q2 == 1936995172) {
                                int iM60004H4 = zwcVar.m60004H();
                                zwcVar.m60018V(3);
                                if (iM60004H4 == 0) {
                                    int iM60004H5 = zwcVar.m60004H();
                                    if (iM60004H5 == 0) {
                                        i15 = 0;
                                    } else if (iM60004H5 == 1) {
                                        i15 = 1;
                                    } else if (iM60004H5 == 2) {
                                        i15 = 2;
                                    } else if (iM60004H5 == 3) {
                                        i15 = 3;
                                    }
                                }
                            } else {
                                i10 = iM43661j;
                                if (iM60036q2 == 1668246642) {
                                    i11 = iM43662k;
                                    if (i10 == -1 && i11 == -1) {
                                        int iM60036q3 = zwcVar.m60036q();
                                        if (iM60036q3 == 1852009592 || iM60036q3 == 1852009571) {
                                            int iM60010N3 = zwcVar.m60010N();
                                            int iM60010N4 = zwcVar.m60010N();
                                            zwcVar.m60018V(2);
                                            boolean z3 = iM60036q == 19 && (zwcVar.m60004H() & 128) != 0;
                                            iM43661j = ph3.m43661j(iM60010N3);
                                            i17 = z3 ? 1 : 2;
                                            iM43662k = ph3.m43662k(iM60010N4);
                                            i19 = i8;
                                            i14 = i7;
                                        } else {
                                            ria.m46824h("AtomParsers", "Unsupported color type: " + js0.m34445a(iM60036q3));
                                        }
                                    }
                                    i18 += iM60036q;
                                    i12 = i2;
                                    i13 = i3;
                                    c14914d2 = c14914d;
                                    iIntValue = i9;
                                    str2 = str;
                                    drmInitDataM6683c = drmInitData2;
                                } else {
                                    i11 = iM43662k;
                                }
                            }
                            i19 = i8;
                            i14 = i7;
                        }
                        i9 = iIntValue;
                        str = str2;
                    }
                    iM43662k = i11;
                    iM43661j = i10;
                    i19 = i8;
                    i14 = i7;
                    i18 += iM60036q;
                    i12 = i2;
                    i13 = i3;
                    c14914d2 = c14914d;
                    iIntValue = i9;
                    str2 = str;
                    drmInitDataM6683c = drmInitData2;
                }
                i18 += iM60036q;
                i12 = i2;
                i13 = i3;
                c14914d2 = c14914d;
                iIntValue = i9;
                str2 = str;
                drmInitDataM6683c = drmInitData2;
            }
            i18 += iM60036q;
            i12 = i2;
            i13 = i3;
            c14914d2 = c14914d;
            iIntValue = i9;
            str2 = str;
            drmInitDataM6683c = drmInitData2;
        }
        DrmInitData drmInitData3 = drmInitDataM6683c;
        int i32 = i14;
        int i33 = i19;
        int i34 = iM43661j;
        int i35 = iM43662k;
        if (str4 == null) {
            return;
        }
        C2181a.b bVarM6753P = new C2181a.b().m6763Z(i4).o0(str4).m6752O(str3).v0(iM60010N).m6762Y(iM60010N2).k0(fM36163s).n0(i5).l0(bArrM36164t).r0(i15).b0(nf8VarM40500F).g0(i16).m6758U(drmInitData3).m6753P(new ph3.C16113b().m43672d(i34).m43671c(i17).m43673e(i35).m43674f(byteBuffer != null ? byteBuffer.array() : null).m43675g(i32).m43670b(i33).m43669a());
        if (c14912bM36155k != null) {
            bVarM6753P.m6750M(br8.m19645l(c14912bM36155k.f32625c)).j0(br8.m19645l(c14912bM36155k.f32626d));
        }
        c14914d.f32628b = bVarM6753P.m6748K();
    }

    /* renamed from: F */
    public static Metadata m36144F(zwc zwcVar) {
        short sM60000D = zwcVar.m60000D();
        zwcVar.m60018V(2);
        String strM60001E = zwcVar.m60001E(sM60000D);
        int iMax = Math.max(strM60001E.lastIndexOf(43), strM60001E.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(strM60001E.substring(0, iMax)), Float.parseFloat(strM60001E.substring(iMax, strM60001E.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m36145a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: b */
    public static boolean m36146b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[sqi.m48736o(4, 0, length)] && jArr[sqi.m48736o(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    /* renamed from: c */
    public static boolean m36147c(int i) {
        return i != 1;
    }

    /* renamed from: d */
    public static int m36148d(zwc zwcVar, int i, int i2, int i3) throws byc {
        int iM60025f = zwcVar.m60025f();
        wq6.m54803a(iM60025f >= i2, null);
        while (iM60025f - i2 < i3) {
            zwcVar.m60017U(iM60025f);
            int iM60036q = zwcVar.m60036q();
            wq6.m54803a(iM60036q > 0, "childAtomSize must be positive");
            if (zwcVar.m60036q() == i) {
                return iM60025f;
            }
            iM60025f += iM60036q;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m36149e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: f */
    public static void m36150f(zwc zwcVar) {
        int iM60025f = zwcVar.m60025f();
        zwcVar.m60018V(4);
        if (zwcVar.m60036q() != 1751411826) {
            iM60025f += 4;
        }
        zwcVar.m60017U(iM60025f);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m36151g(zwc zwcVar, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, C14914d c14914d, int i5) throws byc {
        int iM60010N;
        int iM60010N2;
        int iM60005I;
        int iM60036q;
        int i6;
        String str2;
        String str3;
        char c;
        int i7 = i2;
        int i8 = i3;
        DrmInitData drmInitDataM6683c = drmInitData;
        zwcVar.m60017U(i7 + 8 + 8);
        if (z) {
            iM60010N = zwcVar.m60010N();
            zwcVar.m60018V(6);
        } else {
            zwcVar.m60018V(8);
            iM60010N = 0;
        }
        if (iM60010N == 0 || iM60010N == 1) {
            iM60010N2 = zwcVar.m60010N();
            zwcVar.m60018V(6);
            iM60005I = zwcVar.m60005I();
            zwcVar.m60017U(zwcVar.m60025f() - 4);
            iM60036q = zwcVar.m60036q();
            if (iM60010N == 1) {
                zwcVar.m60018V(16);
            }
            i6 = -1;
        } else {
            if (iM60010N != 2) {
                return;
            }
            zwcVar.m60018V(16);
            iM60005I = (int) Math.round(zwcVar.m60034o());
            iM60010N2 = zwcVar.m60008L();
            zwcVar.m60018V(4);
            int iM60008L = zwcVar.m60008L();
            int iM60008L2 = zwcVar.m60008L();
            boolean z2 = (iM60008L2 & 1) != 0;
            boolean z3 = (iM60008L2 & 2) != 0;
            if (z2) {
                if (iM60008L == 32) {
                    i6 = 4;
                }
                zwcVar.m60018V(8);
                iM60036q = 0;
            } else {
                i6 = iM60008L == 8 ? 3 : iM60008L == 16 ? z3 ? 268435456 : 2 : iM60008L == 24 ? z3 ? 1342177280 : 21 : iM60008L == 32 ? z3 ? 1610612736 : 22 : -1;
                zwcVar.m60018V(8);
                iM60036q = 0;
            }
        }
        int iM60025f = zwcVar.m60025f();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            Pair pairM36165u = m36165u(zwcVar, i7, i8);
            if (pairM36165u != null) {
                iIntValue = ((Integer) pairM36165u.first).intValue();
                drmInitDataM6683c = drmInitDataM6683c == null ? null : drmInitDataM6683c.m6683c(((nth) pairM36165u.second).f37300b);
                c14914d.f32627a[i5] = (nth) pairM36165u.second;
            }
            zwcVar.m60017U(iM60025f);
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                i6 = 268435456;
            } else if (iIntValue != 1819304813) {
                str2 = (iIntValue == 778924082 || iIntValue == 778924083) ? "audio/mpeg" : iIntValue == 1835557169 ? "audio/mha1" : iIntValue == 1835560241 ? "audio/mhm1" : iIntValue == 1634492771 ? "audio/alac" : iIntValue == 1634492791 ? "audio/g711-alaw" : iIntValue == 1970037111 ? "audio/g711-mlaw" : iIntValue == 1332770163 ? "audio/opus" : iIntValue == 1716281667 ? "audio/flac" : iIntValue == 1835823201 ? "audio/true-hd" : null;
            } else if (i6 == -1) {
                str2 = "audio/raw";
                i6 = 2;
            } else {
                str2 = "audio/raw";
            }
        }
        int i9 = i6;
        List listM40500F = null;
        String str5 = null;
        C14912b c14912bM36155k = null;
        while (iM60025f - i7 < i8) {
            zwcVar.m60017U(iM60025f);
            int iM60036q2 = zwcVar.m60036q();
            wq6.m54803a(iM60036q2 > 0, "childAtomSize must be positive");
            int iM60036q3 = zwcVar.m60036q();
            if (iM60036q3 == 1835557187) {
                zwcVar.m60017U(iM60025f + 8);
                zwcVar.m60018V(1);
                int iM60004H = zwcVar.m60004H();
                zwcVar.m60018V(1);
                str5 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iM60004H)) : String.format("mha1.%02X", Integer.valueOf(iM60004H));
                int iM60010N3 = zwcVar.m60010N();
                byte[] bArr = new byte[iM60010N3];
                str3 = str4;
                zwcVar.m60031l(bArr, 0, iM60010N3);
                listM40500F = listM40500F == null ? nf8.m40500F(bArr) : nf8.m40501G(bArr, (byte[]) listM40500F.get(0));
            } else {
                str3 = str4;
                if (iM60036q3 == 1835557200) {
                    zwcVar.m60017U(iM60025f + 8);
                    int iM60004H2 = zwcVar.m60004H();
                    if (iM60004H2 > 0) {
                        byte[] bArr2 = new byte[iM60004H2];
                        zwcVar.m60031l(bArr2, 0, iM60004H2);
                        listM40500F = listM40500F == null ? nf8.m40500F(bArr2) : nf8.m40501G((byte[]) listM40500F.get(0), bArr2);
                    }
                } else {
                    if (iM60036q3 == 1702061171 || (z && iM60036q3 == 2002876005)) {
                        int iM36148d = iM60036q3 == 1702061171 ? iM60025f : m36148d(zwcVar, 1702061171, iM60025f, iM60036q2);
                        if (iM36148d != -1) {
                            c14912bM36155k = m36155k(zwcVar, iM36148d);
                            str2 = c14912bM36155k.f32623a;
                            byte[] bArr3 = c14912bM36155k.f32624b;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    listM40500F = p2j.m42926e(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        w5.C17781b c17781bM53967f = w5.m53967f(bArr3);
                                        int i10 = c17781bM53967f.f51494a;
                                        int i11 = c17781bM53967f.f51495b;
                                        str5 = c17781bM53967f.f51496c;
                                        iM60005I = i10;
                                        iM60010N2 = i11;
                                    }
                                    listM40500F = nf8.m40500F(bArr3);
                                }
                            }
                        }
                    } else {
                        if (iM60036q3 == 1684103987) {
                            zwcVar.m60017U(iM60025f + 8);
                            c14914d.f32628b = fa.m26325d(zwcVar, Integer.toString(i4), str, drmInitDataM6683c);
                        } else if (iM60036q3 == 1684366131) {
                            zwcVar.m60017U(iM60025f + 8);
                            c14914d.f32628b = fa.m26329h(zwcVar, Integer.toString(i4), str, drmInitDataM6683c);
                        } else if (iM60036q3 == 1684103988) {
                            zwcVar.m60017U(iM60025f + 8);
                            c14914d.f32628b = ja.m33428b(zwcVar, Integer.toString(i4), str, drmInitDataM6683c);
                        } else if (iM60036q3 == 1684892784) {
                            if (iM60036q <= 0) {
                                throw byc.m19921a("Invalid sample rate for Dolby TrueHD MLP stream: " + iM60036q, null);
                            }
                            iM60005I = iM60036q;
                            iM60010N2 = 2;
                        } else if (iM60036q3 == 1684305011 || iM60036q3 == 1969517683) {
                            c = 24931;
                            c14914d.f32628b = new C2181a.b().m6763Z(i4).o0(str2).m6751N(iM60010N2).p0(iM60005I).m6758U(drmInitDataM6683c).e0(str).m6748K();
                        } else if (iM60036q3 == 1682927731) {
                            int i12 = iM60036q2 - 8;
                            byte[] bArr4 = f32613a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i12);
                            zwcVar.m60017U(iM60025f + 8);
                            zwcVar.m60031l(bArrCopyOf, bArr4.length, i12);
                            listM40500F = vec.m52664a(bArrCopyOf);
                        } else if (iM60036q3 == 1684425825) {
                            int i13 = iM60036q2 - 12;
                            byte[] bArr5 = new byte[i13 + 4];
                            bArr5[0] = 102;
                            bArr5[1] = 76;
                            bArr5[2] = 97;
                            bArr5[3] = 67;
                            zwcVar.m60017U(iM60025f + 12);
                            zwcVar.m60031l(bArr5, 4, i13);
                            listM40500F = nf8.m40500F(bArr5);
                        } else {
                            c = 24931;
                            if (iM60036q3 == 1634492771) {
                                int i14 = iM60036q2 - 12;
                                byte[] bArr6 = new byte[i14];
                                zwcVar.m60017U(iM60025f + 12);
                                zwcVar.m60031l(bArr6, 0, i14);
                                Pair pairM30324g = hf3.m30324g(bArr6);
                                int iIntValue2 = ((Integer) pairM30324g.first).intValue();
                                iM60010N2 = ((Integer) pairM30324g.second).intValue();
                                listM40500F = nf8.m40500F(bArr6);
                                iM60005I = iIntValue2;
                            }
                        }
                        c = 24931;
                    }
                    iM60025f += iM60036q2;
                    i7 = i2;
                    i8 = i3;
                    str4 = str3;
                }
            }
            iM60025f += iM60036q2;
            i7 = i2;
            i8 = i3;
            str4 = str3;
        }
        if (c14914d.f32628b != null || str2 == null) {
            return;
        }
        C2181a.b bVarE0 = new C2181a.b().m6763Z(i4).o0(str2).m6752O(str5).m6751N(iM60010N2).p0(iM60005I).i0(i9).b0(listM40500F).m6758U(drmInitDataM6683c).e0(str);
        if (c14912bM36155k != null) {
            bVarE0.m6750M(br8.m19645l(c14912bM36155k.f32625c)).j0(br8.m19645l(c14912bM36155k.f32626d));
        }
        c14914d.f32628b = bVarE0.m6748K();
    }

    /* renamed from: h */
    public static ph3 m36152h(zwc zwcVar) {
        ph3.C16113b c16113b = new ph3.C16113b();
        ywc ywcVar = new ywc(zwcVar.m60024e());
        ywcVar.m58452p(zwcVar.m60025f() * 8);
        ywcVar.m58455s(1);
        int iM58444h = ywcVar.m58444h(3);
        ywcVar.m58454r(6);
        boolean zM58443g = ywcVar.m58443g();
        boolean zM58443g2 = ywcVar.m58443g();
        if (iM58444h == 2 && zM58443g) {
            c16113b.m43675g(zM58443g2 ? 12 : 10);
            c16113b.m43670b(zM58443g2 ? 12 : 10);
        } else if (iM58444h <= 2) {
            c16113b.m43675g(zM58443g ? 10 : 8);
            c16113b.m43670b(zM58443g ? 10 : 8);
        }
        ywcVar.m58454r(13);
        ywcVar.m58453q();
        int iM58444h2 = ywcVar.m58444h(4);
        if (iM58444h2 != 1) {
            ria.m46822f("AtomParsers", "Unsupported obu_type: " + iM58444h2);
            return c16113b.m43669a();
        }
        if (ywcVar.m58443g()) {
            ria.m46822f("AtomParsers", "Unsupported obu_extension_flag");
            return c16113b.m43669a();
        }
        boolean zM58443g3 = ywcVar.m58443g();
        ywcVar.m58453q();
        if (zM58443g3 && ywcVar.m58444h(8) > 127) {
            ria.m46822f("AtomParsers", "Excessive obu_size");
            return c16113b.m43669a();
        }
        int iM58444h3 = ywcVar.m58444h(3);
        ywcVar.m58453q();
        if (ywcVar.m58443g()) {
            ria.m46822f("AtomParsers", "Unsupported reduced_still_picture_header");
            return c16113b.m43669a();
        }
        if (ywcVar.m58443g()) {
            ria.m46822f("AtomParsers", "Unsupported timing_info_present_flag");
            return c16113b.m43669a();
        }
        if (ywcVar.m58443g()) {
            ria.m46822f("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return c16113b.m43669a();
        }
        int iM58444h4 = ywcVar.m58444h(5);
        boolean z = false;
        for (int i = 0; i <= iM58444h4; i++) {
            ywcVar.m58454r(12);
            if (ywcVar.m58444h(5) > 7) {
                ywcVar.m58453q();
            }
        }
        int iM58444h5 = ywcVar.m58444h(4);
        int iM58444h6 = ywcVar.m58444h(4);
        ywcVar.m58454r(iM58444h5 + 1);
        ywcVar.m58454r(iM58444h6 + 1);
        if (ywcVar.m58443g()) {
            ywcVar.m58454r(7);
        }
        ywcVar.m58454r(7);
        boolean zM58443g4 = ywcVar.m58443g();
        if (zM58443g4) {
            ywcVar.m58454r(2);
        }
        if ((ywcVar.m58443g() ? 2 : ywcVar.m58444h(1)) > 0 && !ywcVar.m58443g()) {
            ywcVar.m58454r(1);
        }
        if (zM58443g4) {
            ywcVar.m58454r(3);
        }
        ywcVar.m58454r(3);
        boolean zM58443g5 = ywcVar.m58443g();
        if (iM58444h3 == 2 && zM58443g5) {
            ywcVar.m58453q();
        }
        if (iM58444h3 != 1 && ywcVar.m58443g()) {
            z = true;
        }
        if (ywcVar.m58443g()) {
            int iM58444h7 = ywcVar.m58444h(8);
            int iM58444h8 = ywcVar.m58444h(8);
            c16113b.m43672d(ph3.m43661j(iM58444h7)).m43671c(((z || iM58444h7 != 1 || iM58444h8 != 13 || ywcVar.m58444h(8) != 0) ? ywcVar.m58444h(1) : 1) != 1 ? 2 : 1).m43673e(ph3.m43662k(iM58444h8));
        }
        return c16113b.m43669a();
    }

    /* renamed from: i */
    public static Pair m36153i(zwc zwcVar, int i, int i2) throws byc {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String strM60001E = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            zwcVar.m60017U(i3);
            int iM60036q = zwcVar.m60036q();
            int iM60036q2 = zwcVar.m60036q();
            if (iM60036q2 == 1718775137) {
                numValueOf = Integer.valueOf(zwcVar.m60036q());
            } else if (iM60036q2 == 1935894637) {
                zwcVar.m60018V(4);
                strM60001E = zwcVar.m60001E(4);
            } else if (iM60036q2 == 1935894633) {
                i4 = i3;
                i5 = iM60036q;
            }
            i3 += iM60036q;
        }
        if (!"cenc".equals(strM60001E) && !"cbc1".equals(strM60001E) && !"cens".equals(strM60001E) && !"cbcs".equals(strM60001E)) {
            return null;
        }
        wq6.m54803a(numValueOf != null, "frma atom is mandatory");
        wq6.m54803a(i4 != -1, "schi atom is mandatory");
        nth nthVarM36166v = m36166v(zwcVar, i4, i5, strM60001E);
        wq6.m54803a(nthVarM36166v != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (nth) sqi.m48729h(nthVarM36166v));
    }

    /* renamed from: j */
    public static Pair m36154j(js0.C14644a c14644a) {
        js0.C14645b c14645bM34451g = c14644a.m34451g(1701606260);
        if (c14645bM34451g == null) {
            return null;
        }
        zwc zwcVar = c14645bM34451g.f31022b;
        zwcVar.m60017U(8);
        int iM34447c = js0.m34447c(zwcVar.m60036q());
        int iM60008L = zwcVar.m60008L();
        long[] jArr = new long[iM60008L];
        long[] jArr2 = new long[iM60008L];
        for (int i = 0; i < iM60008L; i++) {
            jArr[i] = iM34447c == 1 ? zwcVar.m60009M() : zwcVar.m60006J();
            jArr2[i] = iM34447c == 1 ? zwcVar.m59997A() : zwcVar.m60036q();
            if (zwcVar.m60000D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zwcVar.m60018V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: k */
    public static C14912b m36155k(zwc zwcVar, int i) {
        zwcVar.m60017U(i + 8 + 4);
        zwcVar.m60018V(1);
        m36156l(zwcVar);
        zwcVar.m60018V(2);
        int iM60004H = zwcVar.m60004H();
        if ((iM60004H & 128) != 0) {
            zwcVar.m60018V(2);
        }
        if ((iM60004H & 64) != 0) {
            zwcVar.m60018V(zwcVar.m60004H());
        }
        if ((iM60004H & 32) != 0) {
            zwcVar.m60018V(2);
        }
        zwcVar.m60018V(1);
        m36156l(zwcVar);
        String strM56178f = xeb.m56178f(zwcVar.m60004H());
        if ("audio/mpeg".equals(strM56178f) || "audio/vnd.dts".equals(strM56178f) || "audio/vnd.dts.hd".equals(strM56178f)) {
            return new C14912b(strM56178f, null, -1L, -1L);
        }
        zwcVar.m60018V(4);
        long jM60006J = zwcVar.m60006J();
        long jM60006J2 = zwcVar.m60006J();
        zwcVar.m60018V(1);
        int iM36156l = m36156l(zwcVar);
        byte[] bArr = new byte[iM36156l];
        zwcVar.m60031l(bArr, 0, iM36156l);
        return new C14912b(strM56178f, bArr, jM60006J2 > 0 ? jM60006J2 : -1L, jM60006J > 0 ? jM60006J : -1L);
    }

    /* renamed from: l */
    public static int m36156l(zwc zwcVar) {
        int iM60004H = zwcVar.m60004H();
        int i = iM60004H & Opcodes.LAND;
        while ((iM60004H & 128) == 128) {
            iM60004H = zwcVar.m60004H();
            i = (i << 7) | (iM60004H & Opcodes.LAND);
        }
        return i;
    }

    /* renamed from: m */
    public static int m36157m(zwc zwcVar) {
        zwcVar.m60017U(16);
        return zwcVar.m60036q();
    }

    /* renamed from: n */
    public static Metadata m36158n(zwc zwcVar, int i) {
        zwcVar.m60018V(8);
        ArrayList arrayList = new ArrayList();
        while (zwcVar.m60025f() < i) {
            Metadata.Entry entryM16956c = aeb.m16956c(zwcVar);
            if (entryM16956c != null) {
                arrayList.add(entryM16956c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: o */
    public static Pair m36159o(zwc zwcVar) {
        zwcVar.m60017U(8);
        int iM34447c = js0.m34447c(zwcVar.m60036q());
        zwcVar.m60018V(iM34447c == 0 ? 8 : 16);
        long jM60006J = zwcVar.m60006J();
        zwcVar.m60018V(iM34447c == 0 ? 4 : 8);
        int iM60010N = zwcVar.m60010N();
        return Pair.create(Long.valueOf(jM60006J), "" + ((char) (((iM60010N >> 10) & 31) + 96)) + ((char) (((iM60010N >> 5) & 31) + 96)) + ((char) ((iM60010N & 31) + 96)));
    }

    /* renamed from: p */
    public static Metadata m36160p(js0.C14644a c14644a) {
        js0.C14645b c14645bM34451g = c14644a.m34451g(1751411826);
        js0.C14645b c14645bM34451g2 = c14644a.m34451g(1801812339);
        js0.C14645b c14645bM34451g3 = c14644a.m34451g(1768715124);
        if (c14645bM34451g == null || c14645bM34451g2 == null || c14645bM34451g3 == null || m36157m(c14645bM34451g.f31022b) != 1835299937) {
            return null;
        }
        zwc zwcVar = c14645bM34451g2.f31022b;
        zwcVar.m60017U(12);
        int iM60036q = zwcVar.m60036q();
        String[] strArr = new String[iM60036q];
        for (int i = 0; i < iM60036q; i++) {
            int iM60036q2 = zwcVar.m60036q();
            zwcVar.m60018V(4);
            strArr[i] = zwcVar.m60001E(iM60036q2 - 8);
        }
        zwc zwcVar2 = c14645bM34451g3.f31022b;
        zwcVar2.m60017U(8);
        ArrayList arrayList = new ArrayList();
        while (zwcVar2.m60020a() > 8) {
            int iM60025f = zwcVar2.m60025f();
            int iM60036q3 = zwcVar2.m60036q();
            int iM60036q4 = zwcVar2.m60036q() - 1;
            if (iM60036q4 < 0 || iM60036q4 >= iM60036q) {
                ria.m46824h("AtomParsers", "Skipped metadata with unknown key index: " + iM60036q4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryM16961h = aeb.m16961h(zwcVar2, iM60025f + iM60036q3, strArr[iM60036q4]);
                if (mdtaMetadataEntryM16961h != null) {
                    arrayList.add(mdtaMetadataEntryM16961h);
                }
            }
            zwcVar2.m60017U(iM60025f + iM60036q3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: q */
    public static void m36161q(zwc zwcVar, int i, int i2, int i3, C14914d c14914d) {
        zwcVar.m60017U(i2 + 8 + 8);
        if (i == 1835365492) {
            zwcVar.m59998B();
            String strM59998B = zwcVar.m59998B();
            if (strM59998B != null) {
                c14914d.f32628b = new C2181a.b().m6763Z(i3).o0(strM59998B).m6748K();
            }
        }
    }

    /* renamed from: r */
    public static Mp4TimestampData m36162r(zwc zwcVar) {
        long jM59997A;
        long jM59997A2;
        zwcVar.m60017U(8);
        if (js0.m34447c(zwcVar.m60036q()) == 0) {
            jM59997A = zwcVar.m60006J();
            jM59997A2 = zwcVar.m60006J();
        } else {
            jM59997A = zwcVar.m59997A();
            jM59997A2 = zwcVar.m59997A();
        }
        return new Mp4TimestampData(jM59997A, jM59997A2, zwcVar.m60006J());
    }

    /* renamed from: s */
    public static float m36163s(zwc zwcVar, int i) {
        zwcVar.m60017U(i + 8);
        return zwcVar.m60008L() / zwcVar.m60008L();
    }

    /* renamed from: t */
    public static byte[] m36164t(zwc zwcVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            zwcVar.m60017U(i3);
            int iM60036q = zwcVar.m60036q();
            if (zwcVar.m60036q() == 1886547818) {
                return Arrays.copyOfRange(zwcVar.m60024e(), i3, iM60036q + i3);
            }
            i3 += iM60036q;
        }
        return null;
    }

    /* renamed from: u */
    public static Pair m36165u(zwc zwcVar, int i, int i2) throws byc {
        Pair pairM36153i;
        int iM60025f = zwcVar.m60025f();
        while (iM60025f - i < i2) {
            zwcVar.m60017U(iM60025f);
            int iM60036q = zwcVar.m60036q();
            wq6.m54803a(iM60036q > 0, "childAtomSize must be positive");
            if (zwcVar.m60036q() == 1936289382 && (pairM36153i = m36153i(zwcVar, iM60025f, iM60036q)) != null) {
                return pairM36153i;
            }
            iM60025f += iM60036q;
        }
        return null;
    }

    /* renamed from: v */
    public static nth m36166v(zwc zwcVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            zwcVar.m60017U(i5);
            int iM60036q = zwcVar.m60036q();
            if (zwcVar.m60036q() == 1952804451) {
                int iM34447c = js0.m34447c(zwcVar.m60036q());
                zwcVar.m60018V(1);
                if (iM34447c == 0) {
                    zwcVar.m60018V(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iM60004H = zwcVar.m60004H();
                    i3 = iM60004H & 15;
                    i4 = (iM60004H & 240) >> 4;
                }
                boolean z = zwcVar.m60004H() == 1;
                int iM60004H2 = zwcVar.m60004H();
                byte[] bArr2 = new byte[16];
                zwcVar.m60031l(bArr2, 0, 16);
                if (z && iM60004H2 == 0) {
                    int iM60004H3 = zwcVar.m60004H();
                    bArr = new byte[iM60004H3];
                    zwcVar.m60031l(bArr, 0, iM60004H3);
                }
                return new nth(z, str, iM60004H2, bArr2, i4, i3, bArr);
            }
            i5 += iM60036q;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0428 A[EDGE_INSN: B:214:0x0428->B:169:0x0428 BREAK  A[LOOP:2: B:152:0x03c7->B:168:0x0421], SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vth m36167w(mth mthVar, js0.C14644a c14644a, gn7 gn7Var) throws byc {
        InterfaceC14913c c14916f;
        boolean z;
        int iM60008L;
        int iM60008L2;
        int iM60008L3;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        mth mthVar2;
        int i7;
        long[] jArr;
        int[] iArr;
        int i8;
        long j;
        long[] jArr2;
        int[] iArr2;
        int iM60036q;
        int i9;
        int i10;
        int i11;
        long[] jArr3;
        int i12;
        boolean z4;
        int i13;
        long[] jArr4;
        int i14;
        long[] jArr5;
        int[] iArr3;
        int i15;
        boolean z5;
        int i16;
        int i17;
        js0.C14645b c14645bM34451g = c14644a.m34451g(1937011578);
        if (c14645bM34451g != null) {
            c14916f = new C14915e(c14645bM34451g, mthVar.f35984f);
        } else {
            js0.C14645b c14645bM34451g2 = c14644a.m34451g(1937013298);
            if (c14645bM34451g2 == null) {
                throw byc.m19921a("Track has no sample table size information", null);
            }
            c14916f = new C14916f(c14645bM34451g2);
        }
        int iMo36178c = c14916f.mo36178c();
        if (iMo36178c == 0) {
            return new vth(mthVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        js0.C14645b c14645bM34451g3 = c14644a.m34451g(1937007471);
        if (c14645bM34451g3 == null) {
            c14645bM34451g3 = (js0.C14645b) op0.m42515e(c14644a.m34451g(1668232756));
            z = true;
        } else {
            z = false;
        }
        zwc zwcVar = c14645bM34451g3.f31022b;
        zwc zwcVar2 = ((js0.C14645b) op0.m42515e(c14644a.m34451g(1937011555))).f31022b;
        zwc zwcVar3 = ((js0.C14645b) op0.m42515e(c14644a.m34451g(1937011827))).f31022b;
        js0.C14645b c14645bM34451g4 = c14644a.m34451g(1937011571);
        zwc zwcVar4 = c14645bM34451g4 != null ? c14645bM34451g4.f31022b : null;
        js0.C14645b c14645bM34451g5 = c14644a.m34451g(1668576371);
        zwc zwcVar5 = c14645bM34451g5 != null ? c14645bM34451g5.f31022b : null;
        C14911a c14911a = new C14911a(zwcVar2, zwcVar, z);
        zwcVar3.m60017U(12);
        int iM60008L4 = zwcVar3.m60008L() - 1;
        int iM60008L5 = zwcVar3.m60008L();
        int iM60008L6 = zwcVar3.m60008L();
        if (zwcVar5 != null) {
            zwcVar5.m60017U(12);
            iM60008L = zwcVar5.m60008L();
        } else {
            iM60008L = 0;
        }
        if (zwcVar4 != null) {
            zwcVar4.m60017U(12);
            iM60008L3 = zwcVar4.m60008L();
            if (iM60008L3 > 0) {
                iM60008L2 = zwcVar4.m60008L() - 1;
            } else {
                iM60008L2 = -1;
                zwcVar4 = null;
            }
        } else {
            iM60008L2 = -1;
            iM60008L3 = 0;
        }
        int iMo36177b = c14916f.mo36177b();
        String str = mthVar.f35984f.f7943n;
        if (iMo36177b == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iM60008L4 == 0 && iM60008L == 0 && iM60008L3 == 0)) {
            i = iM60008L3;
            z2 = false;
        } else {
            i = iM60008L3;
            z2 = true;
        }
        if (z2) {
            int i18 = c14911a.f32614a;
            long[] jArr6 = new long[i18];
            int[] iArr4 = new int[i18];
            while (c14911a.m36171a()) {
                int i19 = c14911a.f32615b;
                jArr6[i19] = c14911a.f32617d;
                iArr4[i19] = c14911a.f32616c;
            }
            z17.C18542b c18542bM58638a = z17.m58638a(iMo36177b, jArr6, iArr4, iM60008L6);
            long[] jArr7 = c18542bM58638a.f56395a;
            int[] iArr5 = c18542bM58638a.f56396b;
            int i20 = c18542bM58638a.f56397c;
            long[] jArr8 = c18542bM58638a.f56398d;
            int[] iArr6 = c18542bM58638a.f56399e;
            long j2 = c18542bM58638a.f56400f;
            mthVar2 = mthVar;
            i7 = iMo36178c;
            jArr = jArr7;
            iArr = iArr5;
            i8 = i20;
            iArr2 = iArr6;
            j = j2;
            jArr2 = jArr8;
        } else {
            long[] jArrCopyOf = new long[iMo36178c];
            int[] iArrCopyOf = new int[iMo36178c];
            long[] jArrCopyOf2 = new long[iMo36178c];
            int[] iArrCopyOf2 = new int[iMo36178c];
            int iM60008L7 = iM60008L2;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int iM60036q2 = 0;
            int iM60008L8 = 0;
            long j3 = 0;
            long j4 = 0;
            int i24 = iM60008L;
            int i25 = iM60008L6;
            int i26 = iM60008L5;
            int i27 = iM60008L4;
            int i28 = i;
            while (true) {
                i2 = i27;
                if (i21 >= iMo36178c) {
                    i3 = i26;
                    i4 = i23;
                    i5 = iM60036q2;
                    break;
                }
                long j5 = j4;
                int i29 = i23;
                boolean zM36171a = true;
                while (i29 == 0) {
                    zM36171a = c14911a.m36171a();
                    if (!zM36171a) {
                        break;
                    }
                    int i30 = i26;
                    long j6 = c14911a.f32617d;
                    i29 = c14911a.f32616c;
                    j5 = j6;
                    i26 = i30;
                    i25 = i25;
                    iMo36178c = iMo36178c;
                }
                int i31 = iMo36178c;
                i3 = i26;
                int i32 = i25;
                if (!zM36171a) {
                    ria.m46824h("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i21);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i21);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i21);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i21);
                    iMo36178c = i21;
                    i5 = iM60036q2;
                    i4 = i29;
                    break;
                }
                if (zwcVar5 != null) {
                    while (iM60008L8 == 0 && i24 > 0) {
                        iM60008L8 = zwcVar5.m60008L();
                        iM60036q2 = zwcVar5.m60036q();
                        i24--;
                    }
                    iM60008L8--;
                }
                int i33 = iM60036q2;
                jArrCopyOf[i21] = j5;
                int iMo36176a = c14916f.mo36176a();
                iArrCopyOf[i21] = iMo36176a;
                if (iMo36176a > i22) {
                    i22 = iMo36176a;
                }
                jArrCopyOf2[i21] = j3 + i33;
                iArrCopyOf2[i21] = zwcVar4 == null ? 1 : 0;
                if (i21 == iM60008L7) {
                    iArrCopyOf2[i21] = 1;
                    i28--;
                    if (i28 > 0) {
                        iM60008L7 = ((zwc) op0.m42515e(zwcVar4)).m60008L() - 1;
                    }
                }
                int i34 = iM60008L7;
                j3 += i32;
                int iM60008L9 = i3 - 1;
                if (iM60008L9 != 0 || i2 <= 0) {
                    iM60036q = i32;
                    i9 = i2;
                } else {
                    iM60008L9 = zwcVar3.m60008L();
                    iM60036q = zwcVar3.m60036q();
                    i9 = i2 - 1;
                }
                int i35 = iM60008L9;
                long j7 = j5 + iArrCopyOf[i21];
                int i36 = i29 - 1;
                i21++;
                j4 = j7;
                iM60008L7 = i34;
                i25 = iM60036q;
                i23 = i36;
                iMo36178c = i31;
                iM60036q2 = i33;
                i27 = i9;
                i26 = i35;
            }
            long j8 = j3 + i5;
            if (zwcVar5 != null) {
                while (i24 > 0) {
                    if (zwcVar5.m60008L() != 0) {
                        z3 = false;
                        break;
                    }
                    zwcVar5.m60036q();
                    i24--;
                }
                z3 = true;
                if (i28 != 0 && i3 == 0 && i4 == 0 && i2 == 0) {
                    i6 = iM60008L8;
                    if (i6 == 0 && z3) {
                        mthVar2 = mthVar;
                    }
                    i7 = iMo36178c;
                    jArr = jArrCopyOf;
                    iArr = iArrCopyOf;
                    i8 = i22;
                    j = j8;
                    jArr2 = jArrCopyOf2;
                    iArr2 = iArrCopyOf2;
                } else {
                    i6 = iM60008L8;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                mthVar2 = mthVar;
                sb.append(mthVar2.f35979a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i28);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i3);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i4);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i2);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i6);
                sb.append(z3 ? ", ctts invalid" : "");
                ria.m46824h("AtomParsers", sb.toString());
                i7 = iMo36178c;
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                i8 = i22;
                j = j8;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
            } else {
                z3 = true;
                if (i28 != 0) {
                    i6 = iM60008L8;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Inconsistent stbl box for track ");
                    mthVar2 = mthVar;
                    sb2.append(mthVar2.f35979a);
                    sb2.append(": remainingSynchronizationSamples ");
                    sb2.append(i28);
                    sb2.append(", remainingSamplesAtTimestampDelta ");
                    sb2.append(i3);
                    sb2.append(", remainingSamplesInChunk ");
                    sb2.append(i4);
                    sb2.append(", remainingTimestampDeltaChanges ");
                    sb2.append(i2);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i6);
                    sb2.append(z3 ? ", ctts invalid" : "");
                    ria.m46824h("AtomParsers", sb2.toString());
                    i7 = iMo36178c;
                    jArr = jArrCopyOf;
                    iArr = iArrCopyOf;
                    i8 = i22;
                    j = j8;
                    jArr2 = jArrCopyOf2;
                    iArr2 = iArrCopyOf2;
                }
            }
        }
        long jA1 = sqi.a1(j, 1000000L, mthVar2.f35981c);
        long[] jArr9 = mthVar2.f35986h;
        if (jArr9 == null) {
            sqi.c1(jArr2, 1000000L, mthVar2.f35981c);
            return new vth(mthVar, jArr, iArr, i8, jArr2, iArr2, jA1);
        }
        if (jArr9.length == 1 && mthVar2.f35980b == 1 && jArr2.length >= 2) {
            long j9 = ((long[]) op0.m42515e(mthVar2.f35987i))[0];
            long jA12 = j9 + sqi.a1(mthVar2.f35986h[0], mthVar2.f35981c, mthVar2.f35982d);
            i10 = i7;
            if (m36146b(jArr2, j, j9, jA12)) {
                long jA13 = sqi.a1(j9 - jArr2[0], mthVar2.f35984f.f7920C, mthVar2.f35981c);
                i11 = i8;
                long jA14 = sqi.a1(j - jA12, mthVar2.f35984f.f7920C, mthVar2.f35981c);
                if ((jA13 != 0 || jA14 != 0) && jA13 <= 2147483647L && jA14 <= 2147483647L) {
                    gn7Var.f25554a = (int) jA13;
                    gn7Var.f25555b = (int) jA14;
                    sqi.c1(jArr2, 1000000L, mthVar2.f35981c);
                    return new vth(mthVar, jArr, iArr, i11, jArr2, iArr2, sqi.a1(mthVar2.f35986h[0], 1000000L, mthVar2.f35982d));
                }
            }
            jArr3 = mthVar2.f35986h;
            if (jArr3.length != 1 && jArr3[0] == 0) {
                long j10 = ((long[]) op0.m42515e(mthVar2.f35987i))[0];
                for (int i37 = 0; i37 < jArr2.length; i37++) {
                    jArr2[i37] = sqi.a1(jArr2[i37] - j10, 1000000L, mthVar2.f35981c);
                }
                return new vth(mthVar, jArr, iArr, i11, jArr2, iArr2, sqi.a1(j - j10, 1000000L, mthVar2.f35981c));
            }
            boolean z6 = mthVar2.f35980b != 1;
            int[] iArr7 = new int[jArr3.length];
            int[] iArr8 = new int[jArr3.length];
            long[] jArr10 = (long[]) op0.m42515e(mthVar2.f35987i);
            i12 = 0;
            z4 = false;
            int i38 = 0;
            i13 = 0;
            while (true) {
                jArr4 = mthVar2.f35986h;
                if (i12 < jArr4.length) {
                    break;
                }
                long[] jArr11 = jArr;
                int[] iArr9 = iArr;
                long j11 = jArr10[i12];
                if (j11 != -1) {
                    int i39 = i13;
                    boolean z7 = z4;
                    int i40 = i38;
                    long jA15 = sqi.a1(jArr4[i12], mthVar2.f35981c, mthVar2.f35982d);
                    iArr7[i12] = sqi.m48728g(jArr2, j11, true, true);
                    iArr8[i12] = sqi.m48725d(jArr2, j11 + jA15, z6, false);
                    while (true) {
                        i17 = iArr7[i12];
                        i16 = iArr8[i12];
                        if (i17 >= i16 || (iArr2[i17] & 1) != 0) {
                            break;
                        }
                        iArr7[i12] = i17 + 1;
                    }
                    i38 = i40 + (i16 - i17);
                    z5 = z7 | (i39 != i17);
                } else {
                    z5 = z4;
                    i16 = i13;
                }
                i12++;
                z4 = z5;
                i13 = i16;
                jArr = jArr11;
                iArr = iArr9;
            }
            long[] jArr12 = jArr;
            int[] iArr10 = iArr;
            boolean z8 = z4;
            i14 = 0;
            boolean z9 = z8 | (i38 != i10);
            long[] jArr13 = !z9 ? new long[i38] : jArr12;
            int[] iArr11 = !z9 ? new int[i38] : iArr10;
            int i41 = !z9 ? 0 : i11;
            int[] iArr12 = !z9 ? new int[i38] : iArr2;
            long[] jArr14 = new long[i38];
            int i42 = i41;
            int[] iArr13 = iArr10;
            long j12 = 0;
            int i43 = 0;
            while (i14 < mthVar2.f35986h.length) {
                long j13 = mthVar2.f35987i[i14];
                int i44 = iArr7[i14];
                int[] iArr14 = iArr7;
                int i45 = iArr8[i14];
                int[] iArr15 = iArr8;
                if (z9) {
                    int i46 = i45 - i44;
                    System.arraycopy(jArr12, i44, jArr13, i43, i46);
                    jArr5 = jArr12;
                    iArr3 = iArr13;
                    System.arraycopy(iArr3, i44, iArr11, i43, i46);
                    System.arraycopy(iArr2, i44, iArr12, i43, i46);
                } else {
                    jArr5 = jArr12;
                    iArr3 = iArr13;
                }
                int i47 = i42;
                while (i44 < i45) {
                    int i48 = i47;
                    int i49 = i45;
                    long jA16 = sqi.a1(j12, 1000000L, mthVar2.f35982d);
                    long[] jArr15 = jArr2;
                    int[] iArr16 = iArr2;
                    long jA17 = sqi.a1(jArr2[i44] - j13, 1000000L, mthVar2.f35981c);
                    int[] iArr17 = iArr12;
                    long j14 = j12;
                    if (m36147c(mthVar2.f35980b)) {
                        jA17 = Math.max(0L, jA17);
                    }
                    jArr14[i43] = jA16 + jA17;
                    if (z9) {
                        i15 = i48;
                        if (iArr11[i43] > i15) {
                            i47 = iArr3[i44];
                        }
                        i43++;
                        i44++;
                        i45 = i49;
                        jArr2 = jArr15;
                        iArr2 = iArr16;
                        j12 = j14;
                        iArr12 = iArr17;
                    } else {
                        i15 = i48;
                    }
                    i47 = i15;
                    i43++;
                    i44++;
                    i45 = i49;
                    jArr2 = jArr15;
                    iArr2 = iArr16;
                    j12 = j14;
                    iArr12 = iArr17;
                }
                long[] jArr16 = jArr2;
                long j15 = j12 + mthVar2.f35986h[i14];
                i14++;
                i42 = i47;
                iArr13 = iArr3;
                j12 = j15;
                iArr7 = iArr14;
                jArr2 = jArr16;
                iArr2 = iArr2;
                iArr8 = iArr15;
                jArr12 = jArr5;
                iArr12 = iArr12;
            }
            return new vth(mthVar, jArr13, iArr11, i42, jArr14, iArr12, sqi.a1(j12, 1000000L, mthVar2.f35982d));
        }
        i10 = i7;
        i11 = i8;
        jArr3 = mthVar2.f35986h;
        if (jArr3.length != 1) {
        }
        if (mthVar2.f35980b != 1) {
        }
        int[] iArr72 = new int[jArr3.length];
        int[] iArr82 = new int[jArr3.length];
        long[] jArr102 = (long[]) op0.m42515e(mthVar2.f35987i);
        i12 = 0;
        z4 = false;
        int i382 = 0;
        i13 = 0;
        while (true) {
            jArr4 = mthVar2.f35986h;
            if (i12 < jArr4.length) {
            }
            i12++;
            z4 = z5;
            i13 = i16;
            jArr = jArr11;
            iArr = iArr9;
        }
        long[] jArr122 = jArr;
        int[] iArr102 = iArr;
        boolean z82 = z4;
        i14 = 0;
        boolean z92 = z82 | (i382 != i10);
        if (!z92) {
        }
        if (!z92) {
        }
        if (!z92) {
        }
        if (!z92) {
        }
        long[] jArr142 = new long[i382];
        int i422 = i41;
        int[] iArr132 = iArr102;
        long j122 = 0;
        int i432 = 0;
        while (i14 < mthVar2.f35986h.length) {
        }
        return new vth(mthVar, jArr13, iArr11, i422, jArr142, iArr12, sqi.a1(j122, 1000000L, mthVar2.f35982d));
    }

    /* renamed from: x */
    public static C14914d m36168x(zwc zwcVar, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws byc {
        int i3;
        zwcVar.m60017U(12);
        int iM60036q = zwcVar.m60036q();
        C14914d c14914d = new C14914d(iM60036q);
        for (int i4 = 0; i4 < iM60036q; i4++) {
            int iM60025f = zwcVar.m60025f();
            int iM60036q2 = zwcVar.m60036q();
            wq6.m54803a(iM60036q2 > 0, "childAtomSize must be positive");
            int iM60036q3 = zwcVar.m60036q();
            if (iM60036q3 == 1635148593 || iM60036q3 == 1635148595 || iM60036q3 == 1701733238 || iM60036q3 == 1831958048 || iM60036q3 == 1836070006 || iM60036q3 == 1752589105 || iM60036q3 == 1751479857 || iM60036q3 == 1932670515 || iM60036q3 == 1211250227 || iM60036q3 == 1987063864 || iM60036q3 == 1987063865 || iM60036q3 == 1635135537 || iM60036q3 == 1685479798 || iM60036q3 == 1685479729 || iM60036q3 == 1685481573 || iM60036q3 == 1685481521) {
                i3 = iM60025f;
                m36143E(zwcVar, iM60036q3, i3, iM60036q2, i, i2, drmInitData, c14914d, i4);
            } else if (iM60036q3 == 1836069985 || iM60036q3 == 1701733217 || iM60036q3 == 1633889587 || iM60036q3 == 1700998451 || iM60036q3 == 1633889588 || iM60036q3 == 1835823201 || iM60036q3 == 1685353315 || iM60036q3 == 1685353317 || iM60036q3 == 1685353320 || iM60036q3 == 1685353324 || iM60036q3 == 1685353336 || iM60036q3 == 1935764850 || iM60036q3 == 1935767394 || iM60036q3 == 1819304813 || iM60036q3 == 1936684916 || iM60036q3 == 1953984371 || iM60036q3 == 778924082 || iM60036q3 == 778924083 || iM60036q3 == 1835557169 || iM60036q3 == 1835560241 || iM60036q3 == 1634492771 || iM60036q3 == 1634492791 || iM60036q3 == 1970037111 || iM60036q3 == 1332770163 || iM60036q3 == 1716281667) {
                i3 = iM60025f;
                m36151g(zwcVar, iM60036q3, iM60025f, iM60036q2, i, str, z, drmInitData, c14914d, i4);
            } else {
                if (iM60036q3 == 1414810956 || iM60036q3 == 1954034535 || iM60036q3 == 2004251764 || iM60036q3 == 1937010800 || iM60036q3 == 1664495672) {
                    m36169y(zwcVar, iM60036q3, iM60025f, iM60036q2, i, str, c14914d);
                } else if (iM60036q3 == 1835365492) {
                    m36161q(zwcVar, iM60036q3, iM60025f, i, c14914d);
                } else if (iM60036q3 == 1667329389) {
                    c14914d.f32628b = new C2181a.b().m6763Z(i).o0("application/x-camera-motion").m6748K();
                }
                i3 = iM60025f;
            }
            zwcVar.m60017U(i3 + iM60036q2);
        }
        return c14914d;
    }

    /* renamed from: y */
    public static void m36169y(zwc zwcVar, int i, int i2, int i3, int i4, String str, C14914d c14914d) {
        zwcVar.m60017U(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        nf8 nf8VarM40500F = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                zwcVar.m60031l(bArr, 0, i5);
                nf8VarM40500F = nf8.m40500F(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else {
                if (i != 1664495672) {
                    throw new IllegalStateException();
                }
                c14914d.f32630d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        c14914d.f32628b = new C2181a.b().m6763Z(i4).o0(str2).e0(str).s0(j).b0(nf8VarM40500F).m6748K();
    }

    /* renamed from: z */
    public static C14917g m36170z(zwc zwcVar) {
        boolean z;
        zwcVar.m60017U(8);
        int iM34447c = js0.m34447c(zwcVar.m60036q());
        zwcVar.m60018V(iM34447c == 0 ? 8 : 16);
        int iM60036q = zwcVar.m60036q();
        zwcVar.m60018V(4);
        int iM60025f = zwcVar.m60025f();
        int i = iM34447c == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            }
            if (zwcVar.m60024e()[iM60025f + i3] != -1) {
                z = false;
                break;
            }
            i3++;
        }
        long j = -9223372036854775807L;
        if (z) {
            zwcVar.m60018V(i);
        } else {
            long jM60006J = iM34447c == 0 ? zwcVar.m60006J() : zwcVar.m60009M();
            if (jM60006J != 0) {
                j = jM60006J;
            }
        }
        zwcVar.m60018V(16);
        int iM60036q2 = zwcVar.m60036q();
        int iM60036q3 = zwcVar.m60036q();
        zwcVar.m60018V(4);
        int iM60036q4 = zwcVar.m60036q();
        int iM60036q5 = zwcVar.m60036q();
        if (iM60036q2 == 0 && iM60036q3 == 65536 && iM60036q4 == -65536 && iM60036q5 == 0) {
            i2 = 90;
        } else if (iM60036q2 == 0 && iM60036q3 == -65536 && iM60036q4 == 65536 && iM60036q5 == 0) {
            i2 = 270;
        } else if (iM60036q2 == -65536 && iM60036q3 == 0 && iM60036q4 == 0 && iM60036q5 == -65536) {
            i2 = Opcodes.GETFIELD;
        }
        return new C14917g(iM60036q, j, i2);
    }
}
