package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p001o.js0;
import p001o.qbg;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class fnb implements tq6, zaf {

    /* renamed from: B */
    public static final yq6 f23704B = new yq6() { // from class: o.dnb
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return fnb.m27140v();
        }
    };

    /* renamed from: A */
    public MotionPhotoMetadata f23705A;

    /* renamed from: a */
    public final qbg.InterfaceC16329a f23706a;

    /* renamed from: b */
    public final int f23707b;

    /* renamed from: c */
    public final zwc f23708c;

    /* renamed from: d */
    public final zwc f23709d;

    /* renamed from: e */
    public final zwc f23710e;

    /* renamed from: f */
    public final zwc f23711f;

    /* renamed from: g */
    public final ArrayDeque f23712g;

    /* renamed from: h */
    public final dbf f23713h;

    /* renamed from: i */
    public final List f23714i;

    /* renamed from: j */
    public nf8 f23715j = nf8.m40499E();

    /* renamed from: k */
    public int f23716k;

    /* renamed from: l */
    public int f23717l;

    /* renamed from: m */
    public long f23718m;

    /* renamed from: n */
    public int f23719n;

    /* renamed from: o */
    public zwc f23720o;

    /* renamed from: p */
    public int f23721p;

    /* renamed from: q */
    public int f23722q;

    /* renamed from: r */
    public int f23723r;

    /* renamed from: s */
    public int f23724s;

    /* renamed from: t */
    public boolean f23725t;

    /* renamed from: u */
    public vq6 f23726u;

    /* renamed from: v */
    public C13491a[] f23727v;

    /* renamed from: w */
    public long[][] f23728w;

    /* renamed from: x */
    public int f23729x;

    /* renamed from: y */
    public long f23730y;

    /* renamed from: z */
    public int f23731z;

    /* renamed from: o.fnb$a */
    public static final class C13491a {

        /* renamed from: a */
        public final mth f23732a;

        /* renamed from: b */
        public final vth f23733b;

        /* renamed from: c */
        public final uth f23734c;

        /* renamed from: d */
        public final wxh f23735d;

        /* renamed from: e */
        public int f23736e;

        public C13491a(mth mthVar, vth vthVar, uth uthVar) {
            this.f23732a = mthVar;
            this.f23733b = vthVar;
            this.f23734c = uthVar;
            this.f23735d = "audio/true-hd".equals(mthVar.f35984f.f7943n) ? new wxh() : null;
        }
    }

    public fnb(qbg.InterfaceC16329a interfaceC16329a, int i) {
        this.f23706a = interfaceC16329a;
        this.f23707b = i;
        this.f23716k = (i & 4) != 0 ? 3 : 0;
        this.f23713h = new dbf();
        this.f23714i = new ArrayList();
        this.f23711f = new zwc(16);
        this.f23712g = new ArrayDeque();
        this.f23708c = new zwc(irb.f29113a);
        this.f23709d = new zwc(4);
        this.f23710e = new zwc();
        this.f23721p = -1;
        this.f23726u = vq6.f50715r;
        this.f23727v = new C13491a[0];
    }

    /* renamed from: A */
    public static int m27131A(zwc zwcVar) {
        zwcVar.m60017U(8);
        int iM27136n = m27136n(zwcVar.m60036q());
        if (iM27136n != 0) {
            return iM27136n;
        }
        zwcVar.m60018V(4);
        while (zwcVar.m60020a() > 0) {
            int iM27136n2 = m27136n(zwcVar.m60036q());
            if (iM27136n2 != 0) {
                return iM27136n2;
            }
        }
        return 0;
    }

    /* renamed from: H */
    public static boolean m27132H(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* renamed from: I */
    public static boolean m27133I(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    /* renamed from: n */
    public static int m27136n(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: o */
    public static long[][] m27137o(C13491a[] c13491aArr) {
        long[][] jArr = new long[c13491aArr.length][];
        int[] iArr = new int[c13491aArr.length];
        long[] jArr2 = new long[c13491aArr.length];
        boolean[] zArr = new boolean[c13491aArr.length];
        for (int i = 0; i < c13491aArr.length; i++) {
            jArr[i] = new long[c13491aArr[i].f23733b.f50881b];
            jArr2[i] = c13491aArr[i].f23733b.f50885f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c13491aArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < c13491aArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            vth vthVar = c13491aArr[i3].f23733b;
            j += vthVar.f50883d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = vthVar.f50885f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: s */
    public static int m27138s(vth vthVar, long j) {
        int iM53410a = vthVar.m53410a(j);
        return iM53410a == -1 ? vthVar.m53411b(j) : iM53410a;
    }

    /* renamed from: u */
    public static /* synthetic */ mth m27139u(mth mthVar) {
        return mthVar;
    }

    /* renamed from: v */
    public static /* synthetic */ tq6[] m27140v() {
        return new tq6[]{new fnb(qbg.InterfaceC16329a.f41600a, 16)};
    }

    /* renamed from: w */
    public static long m27141w(vth vthVar, long j, long j2) {
        int iM27138s = m27138s(vthVar, j);
        return iM27138s == -1 ? j2 : Math.min(vthVar.f50882c[iM27138s], j2);
    }

    /* renamed from: B */
    public final void m27142B(js0.C14644a c14644a) {
        Metadata metadata;
        Metadata metadata2;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        boolean z = this.f23731z == 1;
        gn7 gn7Var = new gn7();
        js0.C14645b c14645bM34451g = c14644a.m34451g(1969517665);
        if (c14645bM34451g != null) {
            Metadata metadataM36141C = ks0.m36141C(c14645bM34451g);
            gn7Var.m29150c(metadataM36141C);
            metadata = metadataM36141C;
        } else {
            metadata = null;
        }
        js0.C14644a c14644aM34450f = c14644a.m34450f(1835365473);
        Metadata metadataM36160p = c14644aM34450f != null ? ks0.m36160p(c14644aM34450f) : null;
        Metadata metadata3 = new Metadata(ks0.m36162r(((js0.C14645b) op0.m42515e(c14644a.m34451g(1836476516))).f31022b));
        long j = -9223372036854775807L;
        List listM36140B = ks0.m36140B(c14644a, gn7Var, -9223372036854775807L, null, (this.f23707b & 1) != 0, z, new ol7() { // from class: o.enb
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return fnb.m27139u((mth) obj);
            }
        });
        long jMax = -9223372036854775807L;
        int i3 = 0;
        int i4 = 0;
        int size = -1;
        while (i3 < listM36140B.size()) {
            vth vthVar = (vth) listM36140B.get(i3);
            if (vthVar.f50881b == 0) {
                i = i4;
                metadata2 = metadata;
            } else {
                mth mthVar = vthVar.f50880a;
                metadata2 = metadata;
                Metadata metadata4 = metadataM36160p;
                long j2 = mthVar.f35983e;
                if (j2 == j) {
                    j2 = vthVar.f50887h;
                }
                jMax = Math.max(jMax, j2);
                i = i4 + 1;
                C13491a c13491a = new C13491a(mthVar, vthVar, this.f23726u.mo32487f(i4, mthVar.f35980b));
                int i5 = "audio/true-hd".equals(mthVar.f35984f.f7943n) ? vthVar.f50884e * 16 : vthVar.f50884e + 30;
                C2181a.b bVarM6707a = mthVar.f35984f.m6707a();
                bVarM6707a.f0(i5);
                if (mthVar.f35980b == 2) {
                    if ((this.f23707b & 8) != 0) {
                        bVarM6707a.m0(mthVar.f35984f.f7935f | (size == -1 ? 1 : 2));
                    }
                    if (j2 > 0 && (i2 = vthVar.f50881b) > 0) {
                        bVarM6707a.m6761X(i2 / (j2 / 1000000.0f));
                    }
                }
                aeb.m16964k(mthVar.f35980b, gn7Var, bVarM6707a);
                int i6 = mthVar.f35980b;
                Metadata[] metadataArr = new Metadata[3];
                metadataArr[0] = this.f23714i.isEmpty() ? null : new Metadata(this.f23714i);
                metadataArr[1] = metadata2;
                metadataArr[2] = metadata3;
                metadataM36160p = metadata4;
                aeb.m16965l(i6, metadataM36160p, bVarM6707a, metadataArr);
                c13491a.f23734c.mo7072b(bVarM6707a.m6748K());
                if (mthVar.f35980b == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(c13491a);
            }
            i3++;
            metadata = metadata2;
            i4 = i;
            j = -9223372036854775807L;
        }
        this.f23729x = size;
        this.f23730y = jMax;
        C13491a[] c13491aArr = (C13491a[]) arrayList.toArray(new C13491a[0]);
        this.f23727v = c13491aArr;
        this.f23728w = m27137o(c13491aArr);
        this.f23726u.mo32489p();
        this.f23726u.mo32490r(this);
    }

    /* renamed from: C */
    public final void m27143C(long j) {
        if (this.f23717l == 1836086884) {
            int i = this.f23719n;
            this.f23705A = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + i, this.f23718m - i);
        }
    }

    /* renamed from: D */
    public final boolean m27144D(uq6 uq6Var) throws byc {
        js0.C14644a c14644a;
        if (this.f23719n == 0) {
            if (!uq6Var.mo40492f(this.f23711f.m60024e(), 0, 8, true)) {
                m27156z();
                return false;
            }
            this.f23719n = 8;
            this.f23711f.m60017U(0);
            this.f23718m = this.f23711f.m60006J();
            this.f23717l = this.f23711f.m60036q();
        }
        long j = this.f23718m;
        if (j == 1) {
            uq6Var.readFully(this.f23711f.m60024e(), 8, 8);
            this.f23719n += 8;
            this.f23718m = this.f23711f.m60009M();
        } else if (j == 0) {
            long length = uq6Var.getLength();
            if (length == -1 && (c14644a = (js0.C14644a) this.f23712g.peek()) != null) {
                length = c14644a.f31019b;
            }
            if (length != -1) {
                this.f23718m = (length - uq6Var.getPosition()) + this.f23719n;
            }
        }
        if (this.f23718m < this.f23719n) {
            throw byc.m19924d("Atom size less than header length (unsupported).");
        }
        if (m27132H(this.f23717l)) {
            long position = uq6Var.getPosition();
            long j2 = this.f23718m;
            int i = this.f23719n;
            long j3 = (position + j2) - i;
            if (j2 != i && this.f23717l == 1835365473) {
                m27154x(uq6Var);
            }
            this.f23712g.push(new js0.C14644a(this.f23717l, j3));
            if (this.f23718m == this.f23719n) {
                m27155y(j3);
            } else {
                m27150p();
            }
        } else if (m27133I(this.f23717l)) {
            op0.m42517g(this.f23719n == 8);
            op0.m42517g(this.f23718m <= 2147483647L);
            zwc zwcVar = new zwc((int) this.f23718m);
            System.arraycopy(this.f23711f.m60024e(), 0, zwcVar.m60024e(), 0, 8);
            this.f23720o = zwcVar;
            this.f23716k = 1;
        } else {
            m27143C(uq6Var.getPosition() - this.f23719n);
            this.f23720o = null;
            this.f23716k = 1;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m27145E(uq6 uq6Var, ued uedVar) {
        boolean z;
        long j = this.f23718m - this.f23719n;
        long position = uq6Var.getPosition() + j;
        zwc zwcVar = this.f23720o;
        if (zwcVar != null) {
            uq6Var.readFully(zwcVar.m60024e(), this.f23719n, (int) j);
            if (this.f23717l == 1718909296) {
                this.f23725t = true;
                this.f23731z = m27131A(zwcVar);
            } else if (!this.f23712g.isEmpty()) {
                ((js0.C14644a) this.f23712g.peek()).m34449e(new js0.C14645b(this.f23717l, zwcVar));
            }
        } else {
            if (!this.f23725t && this.f23717l == 1835295092) {
                this.f23731z = 1;
            }
            if (j >= MediaStatus.COMMAND_STREAM_TRANSFER) {
                uedVar.f48772a = uq6Var.getPosition() + j;
                z = true;
                m27155y(position);
                return (z || this.f23716k == 2) ? false : true;
            }
            uq6Var.mo40496k((int) j);
        }
        z = false;
        m27155y(position);
        if (z) {
        }
    }

    /* renamed from: F */
    public final int m27146F(uq6 uq6Var, ued uedVar) throws byc {
        int i;
        ued uedVar2;
        long position = uq6Var.getPosition();
        if (this.f23721p == -1) {
            int iM27153t = m27153t(position);
            this.f23721p = iM27153t;
            if (iM27153t == -1) {
                return -1;
            }
        }
        C13491a c13491a = this.f23727v[this.f23721p];
        uth uthVar = c13491a.f23734c;
        int i2 = c13491a.f23736e;
        vth vthVar = c13491a.f23733b;
        long j = vthVar.f50882c[i2];
        int i3 = vthVar.f50883d[i2];
        wxh wxhVar = c13491a.f23735d;
        long j2 = (j - position) + this.f23722q;
        if (j2 < 0) {
            i = 1;
            uedVar2 = uedVar;
        } else {
            if (j2 < MediaStatus.COMMAND_STREAM_TRANSFER) {
                if (c13491a.f23732a.f35985g == 1) {
                    j2 += 8;
                    i3 -= 8;
                }
                uq6Var.mo40496k((int) j2);
                mth mthVar = c13491a.f23732a;
                if (mthVar.f35988j == 0) {
                    if ("audio/ac4".equals(mthVar.f35984f.f7943n)) {
                        if (this.f23723r == 0) {
                            ja.m33427a(i3, this.f23710e);
                            uthVar.m52027e(this.f23710e, 7);
                            this.f23723r += 7;
                        }
                        i3 += 7;
                    } else if (wxhVar != null) {
                        wxhVar.m55382d(uq6Var);
                    }
                    while (true) {
                        int i4 = this.f23723r;
                        if (i4 >= i3) {
                            break;
                        }
                        int iM52026c = uthVar.m52026c(uq6Var, i3 - i4, false);
                        this.f23722q += iM52026c;
                        this.f23723r += iM52026c;
                        this.f23724s -= iM52026c;
                    }
                } else {
                    byte[] bArrM60024e = this.f23709d.m60024e();
                    bArrM60024e[0] = 0;
                    bArrM60024e[1] = 0;
                    bArrM60024e[2] = 0;
                    int i5 = c13491a.f23732a.f35988j;
                    int i6 = 4 - i5;
                    while (this.f23723r < i3) {
                        int i7 = this.f23724s;
                        if (i7 == 0) {
                            uq6Var.readFully(bArrM60024e, i6, i5);
                            this.f23722q += i5;
                            this.f23709d.m60017U(0);
                            int iM60036q = this.f23709d.m60036q();
                            if (iM60036q < 0) {
                                throw byc.m19921a("Invalid NAL length", null);
                            }
                            this.f23724s = iM60036q;
                            this.f23708c.m60017U(0);
                            uthVar.m52027e(this.f23708c, 4);
                            this.f23723r += 4;
                            i3 += i6;
                        } else {
                            int iM52026c2 = uthVar.m52026c(uq6Var, i7, false);
                            this.f23722q += iM52026c2;
                            this.f23723r += iM52026c2;
                            this.f23724s -= iM52026c2;
                        }
                    }
                }
                int i8 = i3;
                vth vthVar2 = c13491a.f23733b;
                long j3 = vthVar2.f50885f[i2];
                int i9 = vthVar2.f50886g[i2];
                if (wxhVar != null) {
                    wxhVar.m55381c(uthVar, j3, i9, i8, 0, null);
                    if (i2 + 1 == c13491a.f23733b.f50881b) {
                        wxhVar.m55379a(uthVar, null);
                    }
                } else {
                    uthVar.mo7071a(j3, i9, i8, 0, null);
                }
                c13491a.f23736e++;
                this.f23721p = -1;
                this.f23722q = 0;
                this.f23723r = 0;
                this.f23724s = 0;
                return 0;
            }
            uedVar2 = uedVar;
            i = 1;
        }
        uedVar2.f48772a = j;
        return i;
    }

    /* renamed from: G */
    public final int m27147G(uq6 uq6Var, ued uedVar) throws byc {
        int iM22754c = this.f23713h.m22754c(uq6Var, uedVar, this.f23714i);
        if (iM22754c == 1 && uedVar.f48772a == 0) {
            m27150p();
        }
        return iM22754c;
    }

    /* renamed from: J */
    public final void m27148J(C13491a c13491a, long j) {
        vth vthVar = c13491a.f23733b;
        int iM53410a = vthVar.m53410a(j);
        if (iM53410a == -1) {
            iM53410a = vthVar.m53411b(j);
        }
        c13491a.f23736e = iM53410a;
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f23712g.clear();
        this.f23719n = 0;
        this.f23721p = -1;
        this.f23722q = 0;
        this.f23723r = 0;
        this.f23724s = 0;
        if (j == 0) {
            if (this.f23716k != 3) {
                m27150p();
                return;
            } else {
                this.f23713h.m22757g();
                this.f23714i.clear();
                return;
            }
        }
        for (C13491a c13491a : this.f23727v) {
            m27148J(c13491a, j2);
            wxh wxhVar = c13491a.f23735d;
            if (wxhVar != null) {
                wxhVar.m55380b();
            }
        }
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        zxf zxfVarM18026d = ayf.m18026d(uq6Var, (this.f23707b & 2) != 0);
        this.f23715j = zxfVarM18026d != null ? nf8.m40500F(zxfVarM18026d) : nf8.m40499E();
        return zxfVarM18026d == null;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        if ((this.f23707b & 16) == 0) {
            vq6Var = new sbg(vq6Var, this.f23706a);
        }
        this.f23726u = vq6Var;
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        return m27151q(j, -1);
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f23730y;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        while (true) {
            int i = this.f23716k;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m27146F(uq6Var, uedVar);
                    }
                    if (i == 3) {
                        return m27147G(uq6Var, uedVar);
                    }
                    throw new IllegalStateException();
                }
                if (m27145E(uq6Var, uedVar)) {
                    return 1;
                }
            } else if (!m27144D(uq6Var)) {
                return -1;
            }
        }
    }

    /* renamed from: p */
    public final void m27150p() {
        this.f23716k = 0;
        this.f23719n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zaf.C18603a m27151q(long j, int i) {
        long jM27141w;
        long j2;
        long jM27141w2;
        long j3;
        int iM53411b;
        C13491a[] c13491aArr = this.f23727v;
        if (c13491aArr.length == 0) {
            return new zaf.C18603a(bbf.f15876c);
        }
        int i2 = i != -1 ? i : this.f23729x;
        if (i2 != -1) {
            vth vthVar = c13491aArr[i2].f23733b;
            int iM27138s = m27138s(vthVar, j);
            if (iM27138s == -1) {
                return new zaf.C18603a(bbf.f15876c);
            }
            j2 = vthVar.f50885f[iM27138s];
            jM27141w = vthVar.f50882c[iM27138s];
            if (j2 < j && iM27138s < vthVar.f50881b - 1 && (iM53411b = vthVar.m53411b(j)) != -1 && iM53411b != iM27138s) {
                j3 = vthVar.f50885f[iM53411b];
                jM27141w2 = vthVar.f50882c[iM53411b];
            }
            if (i == -1) {
                int i3 = 0;
                while (true) {
                    C13491a[] c13491aArr2 = this.f23727v;
                    if (i3 >= c13491aArr2.length) {
                        break;
                    }
                    if (i3 != this.f23729x) {
                        vth vthVar2 = c13491aArr2[i3].f23733b;
                        jM27141w = m27141w(vthVar2, j2, jM27141w);
                        if (j3 != -9223372036854775807L) {
                            jM27141w2 = m27141w(vthVar2, j3, jM27141w2);
                        }
                    }
                    i3++;
                }
            }
            bbf bbfVar = new bbf(j2, jM27141w);
            return j3 != -9223372036854775807L ? new zaf.C18603a(bbfVar) : new zaf.C18603a(bbfVar, new bbf(j3, jM27141w2));
        }
        jM27141w = Long.MAX_VALUE;
        j2 = j;
        jM27141w2 = -1;
        j3 = -9223372036854775807L;
        if (i == -1) {
        }
        bbf bbfVar2 = new bbf(j2, jM27141w);
        if (j3 != -9223372036854775807L) {
        }
    }

    @Override // p001o.tq6
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public nf8 mo27149i() {
        return this.f23715j;
    }

    @Override // p001o.tq6
    public void release() {
    }

    /* renamed from: t */
    public final int m27153t(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C13491a[] c13491aArr = this.f23727v;
            if (i3 >= c13491aArr.length) {
                break;
            }
            C13491a c13491a = c13491aArr[i3];
            int i4 = c13491a.f23736e;
            vth vthVar = c13491a.f23733b;
            if (i4 != vthVar.f50881b) {
                long j5 = vthVar.f50882c[i4];
                long j6 = ((long[][]) sqi.m48729h(this.f23728w))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= MediaStatus.COMMAND_STREAM_TRANSFER;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* renamed from: x */
    public final void m27154x(uq6 uq6Var) {
        this.f23710e.m60013Q(8);
        uq6Var.mo40498m(this.f23710e.m60024e(), 0, 8);
        ks0.m36150f(this.f23710e);
        uq6Var.mo40496k(this.f23710e.m60025f());
        uq6Var.mo40490c();
    }

    /* renamed from: y */
    public final void m27155y(long j) {
        while (!this.f23712g.isEmpty() && ((js0.C14644a) this.f23712g.peek()).f31019b == j) {
            js0.C14644a c14644a = (js0.C14644a) this.f23712g.pop();
            if (c14644a.f31018a == 1836019574) {
                m27142B(c14644a);
                this.f23712g.clear();
                this.f23716k = 2;
            } else if (!this.f23712g.isEmpty()) {
                ((js0.C14644a) this.f23712g.peek()).m34448d(c14644a);
            }
        }
        if (this.f23716k != 2) {
            m27150p();
        }
    }

    /* renamed from: z */
    public final void m27156z() {
        if (this.f23731z != 2 || (this.f23707b & 2) == 0) {
            return;
        }
        this.f23726u.mo32487f(0, 4).mo7072b(new C2181a.b().h0(this.f23705A == null ? null : new Metadata(this.f23705A)).m6748K());
        this.f23726u.mo32489p();
        this.f23726u.mo32490r(new zaf.C18604b(-9223372036854775807L));
    }
}
