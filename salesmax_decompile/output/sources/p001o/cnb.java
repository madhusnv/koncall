package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.math.RoundingMode;
import org.objectweb.asm.Opcodes;
import p001o.cbf;
import p001o.inb;
import p001o.ua8;

/* loaded from: classes2.dex */
public final class cnb implements tq6 {

    /* renamed from: u */
    public static final yq6 f18387u = new yq6() { // from class: o.anb
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return cnb.m21462r();
        }
    };

    /* renamed from: v */
    public static final ua8.InterfaceC17345a f18388v = new ua8.InterfaceC17345a() { // from class: o.bnb
        @Override // p001o.ua8.InterfaceC17345a
        /* renamed from: a */
        public final boolean mo19449a(int i, int i2, int i3, int i4, int i5) {
            return cnb.m21463s(i, i2, i3, i4, i5);
        }
    };

    /* renamed from: a */
    public final int f18389a;

    /* renamed from: b */
    public final long f18390b;

    /* renamed from: c */
    public final zwc f18391c;

    /* renamed from: d */
    public final inb.C14334a f18392d;

    /* renamed from: e */
    public final gn7 f18393e;

    /* renamed from: f */
    public final va8 f18394f;

    /* renamed from: g */
    public final uth f18395g;

    /* renamed from: h */
    public vq6 f18396h;

    /* renamed from: i */
    public uth f18397i;

    /* renamed from: j */
    public uth f18398j;

    /* renamed from: k */
    public int f18399k;

    /* renamed from: l */
    public Metadata f18400l;

    /* renamed from: m */
    public long f18401m;

    /* renamed from: n */
    public long f18402n;

    /* renamed from: o */
    public long f18403o;

    /* renamed from: p */
    public int f18404p;

    /* renamed from: q */
    public cbf f18405q;

    /* renamed from: r */
    public boolean f18406r;

    /* renamed from: s */
    public boolean f18407s;

    /* renamed from: t */
    public long f18408t;

    public cnb() {
        this(0);
    }

    /* renamed from: o */
    public static long m21459o(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int iM6697e = metadata.m6697e();
        for (int i = 0; i < iM6697e; i++) {
            Metadata.Entry entryM6696d = metadata.m6696d(i);
            if (entryM6696d instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryM6696d;
                if (textInformationFrame.f8684a.equals("TLEN")) {
                    return sqi.O0(Long.parseLong((String) textInformationFrame.f8697d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: p */
    public static int m21460p(zwc zwcVar, int i) {
        if (zwcVar.m60026g() >= i + 4) {
            zwcVar.m60017U(i);
            int iM60036q = zwcVar.m60036q();
            if (iM60036q == 1483304551 || iM60036q == 1231971951) {
                return iM60036q;
            }
        }
        if (zwcVar.m60026g() < 40) {
            return 0;
        }
        zwcVar.m60017U(36);
        return zwcVar.m60036q() == 1447187017 ? 1447187017 : 0;
    }

    /* renamed from: q */
    public static boolean m21461q(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* renamed from: r */
    public static /* synthetic */ tq6[] m21462r() {
        return new tq6[]{new cnb()};
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m21463s(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: t */
    public static ngb m21464t(Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int iM6697e = metadata.m6697e();
        for (int i = 0; i < iM6697e; i++) {
            Metadata.Entry entryM6696d = metadata.m6696d(i);
            if (entryM6696d instanceof MlltFrame) {
                return ngb.m40542a(j, (MlltFrame) entryM6696d, m21459o(metadata));
            }
        }
        return null;
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f18399k = 0;
        this.f18401m = -9223372036854775807L;
        this.f18402n = 0L;
        this.f18404p = 0;
        this.f18408t = j2;
        cbf cbfVar = this.f18405q;
        if (!(cbfVar instanceof xh8) || ((xh8) cbfVar).m56311a(j2)) {
            return;
        }
        this.f18407s = true;
        this.f18398j = this.f18395g;
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        return m21475y(uq6Var, true);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f18396h = vq6Var;
        uth uthVarMo32487f = vq6Var.mo32487f(0, 1);
        this.f18397i = uthVarMo32487f;
        this.f18398j = uthVarMo32487f;
        this.f18396h.mo32489p();
    }

    /* renamed from: g */
    public final void m21465g() {
        op0.m42519i(this.f18397i);
        sqi.m48729h(this.f18396h);
    }

    /* renamed from: h */
    public final cbf m21466h(uq6 uq6Var) {
        long jM21459o;
        long jMo20726g;
        cbf cbfVarM21471u = m21471u(uq6Var);
        ngb ngbVarM21464t = m21464t(this.f18400l, uq6Var.getPosition());
        if (this.f18406r) {
            return new cbf.C12623a();
        }
        if ((this.f18389a & 4) != 0) {
            if (ngbVarM21464t != null) {
                jM21459o = ngbVarM21464t.getDurationUs();
                jMo20726g = ngbVarM21464t.mo20726g();
            } else if (cbfVarM21471u != null) {
                jM21459o = cbfVarM21471u.getDurationUs();
                jMo20726g = cbfVarM21471u.mo20726g();
            } else {
                jM21459o = m21459o(this.f18400l);
                jMo20726g = -1;
            }
            cbfVarM21471u = new xh8(jM21459o, uq6Var.getPosition(), jMo20726g);
        } else if (ngbVarM21464t != null) {
            cbfVarM21471u = ngbVarM21464t;
        } else if (cbfVarM21471u == null) {
            cbfVarM21471u = null;
        }
        if (cbfVarM21471u == null || !(cbfVarM21471u.mo25531h() || (this.f18389a & 1) == 0)) {
            return m21470n(uq6Var, (this.f18389a & 2) != 0);
        }
        return cbfVarM21471u;
    }

    /* renamed from: j */
    public final long m21467j(long j) {
        return this.f18401m + ((j * 1000000) / this.f18392d.f28966d);
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        m21465g();
        int iM21473w = m21473w(uq6Var);
        if (iM21473w == -1 && (this.f18405q instanceof xh8)) {
            long jM21467j = m21467j(this.f18402n);
            if (this.f18405q.getDurationUs() != jM21467j) {
                ((xh8) this.f18405q).m56313d(jM21467j);
                this.f18396h.mo32490r(this.f18405q);
            }
        }
        return iM21473w;
    }

    /* renamed from: l */
    public void m21468l() {
        this.f18406r = true;
    }

    /* renamed from: m */
    public final cbf m21469m(long j, pdj pdjVar, long j2) {
        long j3;
        long j4;
        long jM43495a = pdjVar.m43495a();
        if (jM43495a == -9223372036854775807L) {
            return null;
        }
        long j5 = pdjVar.f39934c;
        if (j5 != -1) {
            long j6 = j + j5;
            j3 = j5 - pdjVar.f39932a.f28965c;
            j4 = j6;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - pdjVar.f39932a.f28965c;
            j4 = j2;
        }
        long j7 = j3;
        return new qt3(j4, j + pdjVar.f39932a.f28965c, br8.m19637d(sqi.d1(j7, 8000000L, jM43495a, RoundingMode.HALF_UP)), br8.m19637d(kla.m35834b(j7, pdjVar.f39933b, RoundingMode.HALF_UP)), false);
    }

    /* renamed from: n */
    public final cbf m21470n(uq6 uq6Var, boolean z) {
        uq6Var.mo40498m(this.f18391c.m60024e(), 0, 4);
        this.f18391c.m60017U(0);
        this.f18392d.m32454a(this.f18391c.m60036q());
        return new qt3(uq6Var.getLength(), uq6Var.getPosition(), this.f18392d, z);
    }

    @Override // p001o.tq6
    public void release() {
    }

    /* renamed from: u */
    public final cbf m21471u(uq6 uq6Var) {
        int i;
        int i2;
        zwc zwcVar = new zwc(this.f18392d.f28965c);
        uq6Var.mo40498m(zwcVar.m60024e(), 0, this.f18392d.f28965c);
        inb.C14334a c14334a = this.f18392d;
        int i3 = 21;
        if ((c14334a.f28963a & 1) != 0) {
            if (c14334a.f28967e != 1) {
                i3 = 36;
            }
        } else if (c14334a.f28967e == 1) {
            i3 = 13;
        }
        int iM21460p = m21460p(zwcVar, i3);
        if (iM21460p != 1231971951) {
            if (iM21460p == 1447187017) {
                esi esiVarM25529a = esi.m25529a(uq6Var.getLength(), uq6Var.getPosition(), this.f18392d, zwcVar);
                uq6Var.mo40496k(this.f18392d.f28965c);
                return esiVarM25529a;
            }
            if (iM21460p != 1483304551) {
                uq6Var.mo40490c();
                return null;
            }
        }
        pdj pdjVarM43494b = pdj.m43494b(this.f18392d, zwcVar);
        if (!this.f18393e.m29148a() && (i = pdjVarM43494b.f39935d) != -1 && (i2 = pdjVarM43494b.f39936e) != -1) {
            gn7 gn7Var = this.f18393e;
            gn7Var.f25554a = i;
            gn7Var.f25555b = i2;
        }
        long position = uq6Var.getPosition();
        if (uq6Var.getLength() != -1 && pdjVarM43494b.f39934c != -1 && uq6Var.getLength() != pdjVarM43494b.f39934c + position) {
            ria.m46822f("Mp3Extractor", "Data size mismatch between stream (" + uq6Var.getLength() + ") and Xing frame (" + (pdjVarM43494b.f39934c + position) + "), using Xing value.");
        }
        uq6Var.mo40496k(this.f18392d.f28965c);
        return iM21460p == 1483304551 ? qdj.m45209a(pdjVarM43494b, position) : m21469m(position, pdjVarM43494b, uq6Var.getLength());
    }

    /* renamed from: v */
    public final boolean m21472v(uq6 uq6Var) {
        cbf cbfVar = this.f18405q;
        if (cbfVar != null) {
            long jMo20726g = cbfVar.mo20726g();
            if (jMo20726g != -1 && uq6Var.mo40493g() > jMo20726g - 4) {
                return true;
            }
        }
        try {
            return !uq6Var.mo40489a(this.f18391c.m60024e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: w */
    public final int m21473w(uq6 uq6Var) throws byc {
        if (this.f18399k == 0) {
            try {
                m21475y(uq6Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f18405q == null) {
            cbf cbfVarM21466h = m21466h(uq6Var);
            this.f18405q = cbfVarM21466h;
            this.f18396h.mo32490r(cbfVarM21466h);
            C2181a.b bVarH0 = new C2181a.b().o0(this.f18392d.f28964b).f0(4096).m6751N(this.f18392d.f28967e).p0(this.f18392d.f28966d).m6759V(this.f18393e.f25554a).m6760W(this.f18393e.f25555b).h0((this.f18389a & 8) != 0 ? null : this.f18400l);
            if (this.f18405q.mo20727j() != -2147483647) {
                bVarH0.m6750M(this.f18405q.mo20727j());
            }
            this.f18398j.mo7072b(bVarH0.m6748K());
            this.f18403o = uq6Var.getPosition();
        } else if (this.f18403o != 0) {
            long position = uq6Var.getPosition();
            long j = this.f18403o;
            if (position < j) {
                uq6Var.mo40496k((int) (j - position));
            }
        }
        return m21474x(uq6Var);
    }

    /* renamed from: x */
    public final int m21474x(uq6 uq6Var) {
        if (this.f18404p == 0) {
            uq6Var.mo40490c();
            if (m21472v(uq6Var)) {
                return -1;
            }
            this.f18391c.m60017U(0);
            int iM60036q = this.f18391c.m60036q();
            if (!m21461q(iM60036q, this.f18399k) || inb.m32450j(iM60036q) == -1) {
                uq6Var.mo40496k(1);
                this.f18399k = 0;
                return 0;
            }
            this.f18392d.m32454a(iM60036q);
            if (this.f18401m == -9223372036854775807L) {
                this.f18401m = this.f18405q.mo20725b(uq6Var.getPosition());
                if (this.f18390b != -9223372036854775807L) {
                    this.f18401m += this.f18390b - this.f18405q.mo20725b(0L);
                }
            }
            this.f18404p = this.f18392d.f28965c;
            cbf cbfVar = this.f18405q;
            if (cbfVar instanceof xh8) {
                xh8 xh8Var = (xh8) cbfVar;
                xh8Var.m56312c(m21467j(this.f18402n + r0.f28969g), uq6Var.getPosition() + this.f18392d.f28965c);
                if (this.f18407s && xh8Var.m56311a(this.f18408t)) {
                    this.f18407s = false;
                    this.f18398j = this.f18397i;
                }
            }
        }
        int iM52026c = this.f18398j.m52026c(uq6Var, this.f18404p, true);
        if (iM52026c == -1) {
            return -1;
        }
        int i = this.f18404p - iM52026c;
        this.f18404p = i;
        if (i > 0) {
            return 0;
        }
        this.f18398j.mo7071a(m21467j(this.f18402n), 1, this.f18392d.f28965c, 0, null);
        this.f18402n += this.f18392d.f28969g;
        this.f18404p = 0;
        return 0;
    }

    /* renamed from: y */
    public final boolean m21475y(uq6 uq6Var, boolean z) throws EOFException, byc {
        int iMo40493g;
        int i;
        int iM32450j;
        int i2 = z ? 32768 : Opcodes.ACC_DEPRECATED;
        uq6Var.mo40490c();
        if (uq6Var.getPosition() == 0) {
            Metadata metadataM52494a = this.f18394f.m52494a(uq6Var, (this.f18389a & 8) == 0 ? null : f18388v);
            this.f18400l = metadataM52494a;
            if (metadataM52494a != null) {
                this.f18393e.m29150c(metadataM52494a);
            }
            iMo40493g = (int) uq6Var.mo40493g();
            if (!z) {
                uq6Var.mo40496k(iMo40493g);
            }
            i = 0;
        } else {
            iMo40493g = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!m21472v(uq6Var)) {
                this.f18391c.m60017U(0);
                int iM60036q = this.f18391c.m60036q();
                if ((i == 0 || m21461q(iM60036q, i)) && (iM32450j = inb.m32450j(iM60036q)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.f18392d.m32454a(iM60036q);
                        i = iM60036q;
                    }
                    uq6Var.mo40494h(iM32450j - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw byc.m19921a("Searched too many bytes.", null);
                    }
                    if (z) {
                        uq6Var.mo40490c();
                        uq6Var.mo40494h(iMo40493g + i5);
                    } else {
                        uq6Var.mo40496k(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            uq6Var.mo40496k(iMo40493g + i4);
        } else {
            uq6Var.mo40490c();
        }
        this.f18399k = i;
        return true;
    }

    public cnb(int i) {
        this(i, -9223372036854775807L);
    }

    public cnb(int i, long j) {
        this.f18389a = (i & 2) != 0 ? i | 1 : i;
        this.f18390b = j;
        this.f18391c = new zwc(10);
        this.f18392d = new inb.C14334a();
        this.f18393e = new gn7();
        this.f18401m = -9223372036854775807L;
        this.f18394f = new va8();
        nt5 nt5Var = new nt5();
        this.f18395g = nt5Var;
        this.f18398j = nt5Var;
    }
}
