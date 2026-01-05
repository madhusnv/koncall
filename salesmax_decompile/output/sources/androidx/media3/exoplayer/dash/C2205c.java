package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import androidx.media3.exoplayer.dash.C2206d;
import androidx.media3.exoplayer.dash.InterfaceC2203a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p001o.a8i;
import p001o.abf;
import p001o.bh1;
import p001o.dr4;
import p001o.dz4;
import p001o.ef1;
import p001o.gf1;
import p001o.i14;
import p001o.iz4;
import p001o.j1b;
import p001o.j28;
import p001o.jbd;
import p001o.jn1;
import p001o.jr4;
import p001o.juh;
import p001o.k1b;
import p001o.k93;
import p001o.ki8;
import p001o.ko6;
import p001o.kr4;
import p001o.l93;
import p001o.lr4;
import p001o.m93;
import p001o.n93;
import p001o.oe3;
import p001o.of8;
import p001o.op0;
import p001o.pe3;
import p001o.qbg;
import p001o.ruf;
import p001o.sga;
import p001o.sqi;
import p001o.tle;
import p001o.tv;
import p001o.xeb;
import p001o.zbe;
import p001o.zd1;
import p001o.zga;

/* renamed from: androidx.media3.exoplayer.dash.c */
/* loaded from: classes2.dex */
public class C2205c implements InterfaceC2203a {

    /* renamed from: a */
    public final zga f8247a;

    /* renamed from: b */
    public final gf1 f8248b;

    /* renamed from: c */
    public final int[] f8249c;

    /* renamed from: d */
    public final int f8250d;

    /* renamed from: e */
    public final dz4 f8251e;

    /* renamed from: f */
    public final long f8252f;

    /* renamed from: g */
    public final int f8253g;

    /* renamed from: h */
    public final C2206d.c f8254h;

    /* renamed from: i */
    public final b[] f8255i;

    /* renamed from: j */
    public ko6 f8256j;

    /* renamed from: k */
    public dr4 f8257k;

    /* renamed from: l */
    public int f8258l;

    /* renamed from: m */
    public IOException f8259m;

    /* renamed from: n */
    public boolean f8260n;

    /* renamed from: o */
    public long f8261o = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.dash.c$a */
    public static final class a implements InterfaceC2203a.a {

        /* renamed from: a */
        public final dz4.InterfaceC13064a f8262a;

        /* renamed from: b */
        public final int f8263b;

        /* renamed from: c */
        public final l93.InterfaceC15042a f8264c;

        public a(dz4.InterfaceC13064a interfaceC13064a) {
            this(interfaceC13064a, 1);
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC2203a.a
        /* renamed from: c */
        public C2181a mo6976c(C2181a c2181a) {
            return this.f8264c.mo34116c(c2181a);
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC2203a.a
        /* renamed from: d */
        public InterfaceC2203a mo6977d(zga zgaVar, dr4 dr4Var, gf1 gf1Var, int i, int[] iArr, ko6 ko6Var, int i2, long j, boolean z, List list, C2206d.c cVar, juh juhVar, jbd jbdVar, oe3 oe3Var) {
            dz4 dz4VarMo23962a = this.f8262a.mo23962a();
            if (juhVar != null) {
                dz4VarMo23962a.mo23961j(juhVar);
            }
            return new C2205c(this.f8264c, zgaVar, dr4Var, gf1Var, i, iArr, ko6Var, i2, dz4VarMo23962a, j, this.f8263b, z, list, cVar, jbdVar, oe3Var);
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC2203a.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo6975b(boolean z) {
            this.f8264c.mo34115b(z);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC2203a.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo6974a(qbg.InterfaceC16329a interfaceC16329a) {
            this.f8264c.mo34114a(interfaceC16329a);
            return this;
        }

        public a(dz4.InterfaceC13064a interfaceC13064a, int i) {
            this(jn1.f30756s, interfaceC13064a, i);
        }

        public a(l93.InterfaceC15042a interfaceC15042a, dz4.InterfaceC13064a interfaceC13064a, int i) {
            this.f8264c = interfaceC15042a;
            this.f8262a = interfaceC13064a;
            this.f8263b = i;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$b */
    public static final class b {

        /* renamed from: a */
        public final l93 f8265a;

        /* renamed from: b */
        public final tle f8266b;

        /* renamed from: c */
        public final ef1 f8267c;

        /* renamed from: d */
        public final jr4 f8268d;

        /* renamed from: e */
        public final long f8269e;

        /* renamed from: f */
        public final long f8270f;

        public b(long j, tle tleVar, ef1 ef1Var, l93 l93Var, long j2, jr4 jr4Var) {
            this.f8269e = j;
            this.f8266b = tleVar;
            this.f8267c = ef1Var;
            this.f8270f = j2;
            this.f8265a = l93Var;
            this.f8268d = jr4Var;
        }

        /* renamed from: b */
        public b m7040b(long j, tle tleVar) throws bh1 {
            long jMo34368g;
            long jMo34368g2;
            jr4 jr4VarMo50166l = this.f8266b.mo50166l();
            jr4 jr4VarMo50166l2 = tleVar.mo50166l();
            if (jr4VarMo50166l == null) {
                return new b(j, tleVar, this.f8267c, this.f8265a, this.f8270f, jr4VarMo50166l);
            }
            if (!jr4VarMo50166l.mo34370i()) {
                return new b(j, tleVar, this.f8267c, this.f8265a, this.f8270f, jr4VarMo50166l2);
            }
            long jMo34369h = jr4VarMo50166l.mo34369h(j);
            if (jMo34369h == 0) {
                return new b(j, tleVar, this.f8267c, this.f8265a, this.f8270f, jr4VarMo50166l2);
            }
            op0.m42519i(jr4VarMo50166l2);
            long jMo34371j = jr4VarMo50166l.mo34371j();
            long jMo34363b = jr4VarMo50166l.mo34363b(jMo34371j);
            long j2 = (jMo34369h + jMo34371j) - 1;
            long jMo34363b2 = jr4VarMo50166l.mo34363b(j2) + jr4VarMo50166l.mo34364c(j2, j);
            long jMo34371j2 = jr4VarMo50166l2.mo34371j();
            long jMo34363b3 = jr4VarMo50166l2.mo34363b(jMo34371j2);
            long j3 = this.f8270f;
            if (jMo34363b2 == jMo34363b3) {
                jMo34368g = j2 + 1;
            } else {
                if (jMo34363b2 < jMo34363b3) {
                    throw new bh1();
                }
                if (jMo34363b3 < jMo34363b) {
                    jMo34368g2 = j3 - (jr4VarMo50166l2.mo34368g(jMo34363b, j) - jMo34371j);
                    return new b(j, tleVar, this.f8267c, this.f8265a, jMo34368g2, jr4VarMo50166l2);
                }
                jMo34368g = jr4VarMo50166l.mo34368g(jMo34363b3, j);
            }
            jMo34368g2 = j3 + (jMo34368g - jMo34371j2);
            return new b(j, tleVar, this.f8267c, this.f8265a, jMo34368g2, jr4VarMo50166l2);
        }

        /* renamed from: c */
        public b m7041c(jr4 jr4Var) {
            return new b(this.f8269e, this.f8266b, this.f8267c, this.f8265a, this.f8270f, jr4Var);
        }

        /* renamed from: d */
        public b m7042d(ef1 ef1Var) {
            return new b(this.f8269e, this.f8266b, ef1Var, this.f8265a, this.f8270f, this.f8268d);
        }

        /* renamed from: e */
        public long m7043e(long j) {
            return ((jr4) op0.m42519i(this.f8268d)).mo34365d(this.f8269e, j) + this.f8270f;
        }

        /* renamed from: f */
        public long m7044f() {
            return ((jr4) op0.m42519i(this.f8268d)).mo34371j() + this.f8270f;
        }

        /* renamed from: g */
        public long m7045g(long j) {
            return (m7043e(j) + ((jr4) op0.m42519i(this.f8268d)).mo34372k(this.f8269e, j)) - 1;
        }

        /* renamed from: h */
        public long m7046h() {
            return ((jr4) op0.m42519i(this.f8268d)).mo34369h(this.f8269e);
        }

        /* renamed from: i */
        public long m7047i(long j) {
            return m7049k(j) + ((jr4) op0.m42519i(this.f8268d)).mo34364c(j - this.f8270f, this.f8269e);
        }

        /* renamed from: j */
        public long m7048j(long j) {
            return ((jr4) op0.m42519i(this.f8268d)).mo34368g(j, this.f8269e) + this.f8270f;
        }

        /* renamed from: k */
        public long m7049k(long j) {
            return ((jr4) op0.m42519i(this.f8268d)).mo34363b(j - this.f8270f);
        }

        /* renamed from: l */
        public zbe m7050l(long j) {
            return ((jr4) op0.m42519i(this.f8268d)).mo34367f(j - this.f8270f);
        }

        /* renamed from: m */
        public boolean m7051m(long j, long j2) {
            return ((jr4) op0.m42519i(this.f8268d)).mo34370i() || j2 == -9223372036854775807L || m7047i(j) <= j2;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$c */
    public static final class c extends zd1 {

        /* renamed from: e */
        public final b f8271e;

        /* renamed from: f */
        public final long f8272f;

        public c(b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.f8271e = bVar;
            this.f8272f = j3;
        }

        @Override // p001o.k1b
        /* renamed from: a */
        public long mo7052a() {
            m59216c();
            return this.f8271e.m7049k(m59217d());
        }

        @Override // p001o.k1b
        /* renamed from: b */
        public long mo7053b() {
            m59216c();
            return this.f8271e.m7047i(m59217d());
        }
    }

    public C2205c(l93.InterfaceC15042a interfaceC15042a, zga zgaVar, dr4 dr4Var, gf1 gf1Var, int i, int[] iArr, ko6 ko6Var, int i2, dz4 dz4Var, long j, int i3, boolean z, List list, C2206d.c cVar, jbd jbdVar, oe3 oe3Var) {
        this.f8247a = zgaVar;
        this.f8257k = dr4Var;
        this.f8248b = gf1Var;
        this.f8249c = iArr;
        this.f8256j = ko6Var;
        this.f8250d = i2;
        this.f8251e = dz4Var;
        this.f8258l = i;
        this.f8252f = j;
        this.f8253g = i3;
        this.f8254h = cVar;
        long jM23694g = dr4Var.m23694g(i);
        ArrayList arrayListM7032o = m7032o();
        this.f8255i = new b[ko6Var.length()];
        int i4 = 0;
        while (i4 < this.f8255i.length) {
            tle tleVar = (tle) arrayListM7032o.get(ko6Var.mo22950f(i4));
            ef1 ef1VarM28547j = gf1Var.m28547j(tleVar.f47376c);
            b[] bVarArr = this.f8255i;
            if (ef1VarM28547j == null) {
                ef1VarM28547j = (ef1) tleVar.f47376c.get(0);
            }
            int i5 = i4;
            bVarArr[i5] = new b(jM23694g, tleVar, ef1VarM28547j, interfaceC15042a.mo34117d(i2, tleVar.f47375b, z, list, cVar, jbdVar), 0L, tleVar.mo50166l());
            i4 = i5 + 1;
        }
    }

    @Override // p001o.q93
    /* renamed from: a */
    public void mo7021a() throws IOException {
        IOException iOException = this.f8259m;
        if (iOException != null) {
            throw iOException;
        }
        this.f8247a.mo6966a();
    }

    @Override // androidx.media3.exoplayer.dash.InterfaceC2203a
    /* renamed from: b */
    public void mo6972b(ko6 ko6Var) {
        this.f8256j = ko6Var;
    }

    @Override // androidx.media3.exoplayer.dash.InterfaceC2203a
    /* renamed from: c */
    public void mo6973c(dr4 dr4Var, int i) {
        try {
            this.f8257k = dr4Var;
            this.f8258l = i;
            long jM23694g = dr4Var.m23694g(i);
            ArrayList arrayListM7032o = m7032o();
            for (int i2 = 0; i2 < this.f8255i.length; i2++) {
                tle tleVar = (tle) arrayListM7032o.get(this.f8256j.mo22950f(i2));
                b[] bVarArr = this.f8255i;
                bVarArr[i2] = bVarArr[i2].m7040b(jM23694g, tleVar);
            }
        } catch (bh1 e) {
            this.f8259m = e;
        }
    }

    @Override // p001o.q93
    /* renamed from: e */
    public long mo7022e(long j, abf abfVar) {
        for (b bVar : this.f8255i) {
            if (bVar.f8268d != null) {
                long jM7046h = bVar.m7046h();
                if (jM7046h != 0) {
                    long jM7048j = bVar.m7048j(j);
                    long jM7049k = bVar.m7049k(jM7048j);
                    return abfVar.m16823a(j, jM7049k, (jM7049k >= j || (jM7046h != -1 && jM7048j >= (bVar.m7044f() + jM7046h) - 1)) ? jM7049k : bVar.m7049k(jM7048j + 1));
                }
            }
        }
        return j;
    }

    @Override // p001o.q93
    /* renamed from: f */
    public boolean mo7023f(k93 k93Var, boolean z, sga.C16838c c16838c, sga sgaVar) {
        sga.C16837b c16837bMo48311b;
        if (!z) {
            return false;
        }
        C2206d.c cVar = this.f8254h;
        if (cVar != null && cVar.m7078j(k93Var)) {
            return true;
        }
        if (!this.f8257k.f20433d && (k93Var instanceof j1b)) {
            IOException iOException = c16838c.f45397c;
            if ((iOException instanceof j28) && ((j28) iOException).f29628d == 404) {
                b bVar = this.f8255i[this.f8256j.mo22948b(k93Var.f31662d)];
                long jM7046h = bVar.m7046h();
                if (jM7046h != -1 && jM7046h != 0) {
                    if (((j1b) k93Var).mo31352e() > (bVar.m7044f() + jM7046h) - 1) {
                        this.f8260n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f8255i[this.f8256j.mo22948b(k93Var.f31662d)];
        ef1 ef1VarM28547j = this.f8248b.m28547j(bVar2.f8266b.f47376c);
        if (ef1VarM28547j != null && !bVar2.f8267c.equals(ef1VarM28547j)) {
            return true;
        }
        sga.C16836a c16836aM7028k = m7028k(this.f8256j, bVar2.f8266b.f47376c);
        if ((!c16836aM7028k.m48314a(2) && !c16836aM7028k.m48314a(1)) || (c16837bMo48311b = sgaVar.mo48311b(c16836aM7028k, c16838c)) == null || !c16836aM7028k.m48314a(c16837bMo48311b.f45393a)) {
            return false;
        }
        int i = c16837bMo48311b.f45393a;
        if (i == 2) {
            ko6 ko6Var = this.f8256j;
            return ko6Var.mo22951g(ko6Var.mo22948b(k93Var.f31662d), c16837bMo48311b.f45394b);
        }
        if (i != 1) {
            return false;
        }
        this.f8248b.m28544e(bVar2.f8267c, c16837bMo48311b.f45394b);
        return true;
    }

    @Override // p001o.q93
    /* renamed from: g */
    public boolean mo7024g(long j, k93 k93Var, List list) {
        if (this.f8259m != null) {
            return false;
        }
        return this.f8256j.mo35979c(j, k93Var, list);
    }

    @Override // p001o.q93
    /* renamed from: h */
    public void mo7025h(k93 k93Var) {
        n93 n93VarMo34111c;
        if (k93Var instanceof ki8) {
            int iMo22948b = this.f8256j.mo22948b(((ki8) k93Var).f31662d);
            b bVar = this.f8255i[iMo22948b];
            if (bVar.f8268d == null && (n93VarMo34111c = ((l93) op0.m42519i(bVar.f8265a)).mo34111c()) != null) {
                this.f8255i[iMo22948b] = bVar.m7041c(new lr4(n93VarMo34111c, bVar.f8266b.f47377d));
            }
        }
        C2206d.c cVar = this.f8254h;
        if (cVar != null) {
            cVar.m7077i(k93Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // p001o.q93
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7026i(C2213j c2213j, long j, List list, m93 m93Var) {
        boolean z;
        boolean z2;
        ?? r10;
        int i;
        int i2;
        k1b[] k1bVarArr;
        long j2;
        long j3;
        if (this.f8259m != null) {
            return;
        }
        long j4 = c2213j.f8421a;
        long j5 = j - j4;
        long jO0 = sqi.O0(this.f8257k.f20430a) + sqi.O0(this.f8257k.m23691d(this.f8258l).f24527b) + j;
        C2206d.c cVar = this.f8254h;
        if (cVar != null && cVar.m7076h(jO0)) {
            return;
        }
        long jO02 = sqi.O0(sqi.f0(this.f8252f));
        long jM7031n = m7031n(jO02);
        j1b j1bVar = list.isEmpty() ? null : (j1b) list.get(list.size() - 1);
        int length = this.f8256j.length();
        k1b[] k1bVarArr2 = new k1b[length];
        int i3 = 0;
        while (i3 < length) {
            b bVar = this.f8255i[i3];
            if (bVar.f8268d == null) {
                k1bVarArr2[i3] = k1b.f31372a;
                i = i3;
                i2 = length;
                k1bVarArr = k1bVarArr2;
                j2 = j5;
                j3 = jO02;
            } else {
                long jM7043e = bVar.m7043e(jO02);
                long jM7045g = bVar.m7045g(jO02);
                i = i3;
                i2 = length;
                k1bVarArr = k1bVarArr2;
                j2 = j5;
                j3 = jO02;
                long jM7033p = m7033p(bVar, j1bVar, j, jM7043e, jM7045g);
                if (jM7033p < jM7043e) {
                    k1bVarArr[i] = k1b.f31372a;
                } else {
                    k1bVarArr[i] = new c(m7036s(i), jM7033p, jM7045g, jM7031n);
                }
            }
            i3 = i + 1;
            jO02 = j3;
            k1bVarArr2 = k1bVarArr;
            length = i2;
            j5 = j2;
        }
        long j6 = j5;
        long j7 = jO02;
        this.f8256j.mo16359k(j4, j6, m7029l(j7, j4), list, k1bVarArr2);
        int iMo16357d = this.f8256j.mo16357d();
        this.f8261o = SystemClock.elapsedRealtime();
        b bVarM7036s = m7036s(iMo16357d);
        l93 l93Var = bVarM7036s.f8265a;
        if (l93Var != null) {
            tle tleVar = bVarM7036s.f8266b;
            zbe zbeVarM50168n = l93Var.mo34112d() == null ? tleVar.m50168n() : null;
            zbe zbeVarMo50167m = bVarM7036s.f8268d == null ? tleVar.mo50167m() : null;
            if (zbeVarM50168n != null || zbeVarMo50167m != null) {
                m93Var.f35002a = m7034q(bVarM7036s, this.f8251e, this.f8256j.mo22955q(), this.f8256j.mo16360r(), this.f8256j.mo16358i(), zbeVarM50168n, zbeVarMo50167m, null);
                return;
            }
        }
        long j8 = bVarM7036s.f8269e;
        dr4 dr4Var = this.f8257k;
        if (dr4Var.f20433d) {
            z = true;
            r10 = 1;
            if (this.f8258l == dr4Var.m23692e() - 1) {
                z2 = true;
            }
            boolean z3 = (z2 || j8 != -9223372036854775807L) ? r10 : false;
            if (bVarM7036s.m7046h() != 0) {
                m93Var.f35003b = z3;
                return;
            }
            long jM7043e2 = bVarM7036s.m7043e(j7);
            long jM7045g2 = bVarM7036s.m7045g(j7);
            if (z2) {
                long jM7047i = bVarM7036s.m7047i(jM7045g2);
                z3 &= jM7047i + (jM7047i - bVarM7036s.m7049k(jM7045g2)) >= j8 ? r10 : false;
            }
            boolean z4 = z3;
            long jM7033p2 = m7033p(bVarM7036s, j1bVar, j, jM7043e2, jM7045g2);
            if (jM7033p2 < jM7043e2) {
                this.f8259m = new bh1();
                return;
            }
            if (jM7033p2 > jM7045g2 || (this.f8260n && jM7033p2 >= jM7045g2)) {
                m93Var.f35003b = z4;
                return;
            }
            if (z4 && bVarM7036s.m7049k(jM7033p2) >= j8) {
                m93Var.f35003b = r10;
                return;
            }
            int iMin = (int) Math.min(this.f8253g, (jM7045g2 - jM7033p2) + 1);
            if (j8 != -9223372036854775807L) {
                while (iMin > r10 && bVarM7036s.m7049k((iMin + jM7033p2) - 1) >= j8) {
                    iMin--;
                }
            }
            m93Var.f35002a = m7035r(bVarM7036s, this.f8251e, this.f8250d, this.f8256j.mo22955q(), this.f8256j.mo16360r(), this.f8256j.mo16358i(), jM7033p2, iMin, list.isEmpty() ? j : -9223372036854775807L, jM7031n, null);
            return;
        }
        z = true;
        z2 = false;
        r10 = z;
        if (z2) {
        }
        if (bVarM7036s.m7046h() != 0) {
        }
    }

    @Override // p001o.q93
    /* renamed from: j */
    public int mo7027j(long j, List list) {
        return (this.f8259m != null || this.f8256j.length() < 2) ? list.size() : this.f8256j.mo19892o(j, list);
    }

    /* renamed from: k */
    public final sga.C16836a m7028k(ko6 ko6Var, List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = ko6Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (ko6Var.mo22947a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int iM28541f = gf1.m28541f(list);
        return new sga.C16836a(iM28541f, iM28541f - this.f8248b.m28545g(list), length, i);
    }

    /* renamed from: l */
    public final long m7029l(long j, long j2) {
        if (!this.f8257k.f20433d || this.f8255i[0].m7046h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m7031n(j), this.f8255i[0].m7047i(this.f8255i[0].m7045g(j))) - j2);
    }

    /* renamed from: m */
    public final Pair m7030m(long j, zbe zbeVar, b bVar) {
        long j2 = j + 1;
        if (j2 >= bVar.m7046h()) {
            return null;
        }
        zbe zbeVarM7050l = bVar.m7050l(j2);
        String strM16683a = a8i.m16683a(zbeVar.m59163b(bVar.f8267c.f21518a), zbeVarM7050l.m59163b(bVar.f8267c.f21518a));
        String str = zbeVarM7050l.f56911a + "-";
        if (zbeVarM7050l.f56912b != -1) {
            str = str + (zbeVarM7050l.f56911a + zbeVarM7050l.f56912b);
        }
        return new Pair(strM16683a, str);
    }

    /* renamed from: n */
    public final long m7031n(long j) {
        dr4 dr4Var = this.f8257k;
        long j2 = dr4Var.f20430a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - sqi.O0(j2 + dr4Var.m23691d(this.f8258l).f24527b);
    }

    /* renamed from: o */
    public final ArrayList m7032o() {
        List list = this.f8257k.m23691d(this.f8258l).f24528c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f8249c) {
            arrayList.addAll(((tv) list.get(i)).f47942c);
        }
        return arrayList;
    }

    /* renamed from: p */
    public final long m7033p(b bVar, j1b j1bVar, long j, long j2, long j3) {
        return j1bVar != null ? j1bVar.mo31352e() : sqi.m48737p(bVar.m7048j(j), j2, j3);
    }

    /* renamed from: q */
    public k93 m7034q(b bVar, dz4 dz4Var, C2181a c2181a, int i, Object obj, zbe zbeVar, zbe zbeVar2, pe3.C16078a c16078a) {
        tle tleVar = bVar.f8266b;
        if (zbeVar != null) {
            zbe zbeVarM59162a = zbeVar.m59162a(zbeVar2, bVar.f8267c.f21518a);
            if (zbeVarM59162a != null) {
                zbeVar = zbeVarM59162a;
            }
        } else {
            zbeVar = (zbe) op0.m42515e(zbeVar2);
        }
        iz4 iz4VarM36117a = kr4.m36117a(tleVar, bVar.f8267c.f21518a, zbeVar, 0, of8.m42180r());
        if (c16078a != null) {
            iz4VarM36117a = c16078a.m43511f("i").m43507a().m43505a(iz4VarM36117a);
        }
        return new ki8(dz4Var, iz4VarM36117a, c2181a, i, obj, bVar.f8265a);
    }

    /* renamed from: r */
    public k93 m7035r(b bVar, dz4 dz4Var, int i, C2181a c2181a, int i2, Object obj, long j, int i3, long j2, long j3, pe3.C16078a c16078a) {
        iz4 iz4VarM43505a;
        tle tleVar = bVar.f8266b;
        long jM7049k = bVar.m7049k(j);
        zbe zbeVarM7050l = bVar.m7050l(j);
        if (bVar.f8265a == null) {
            long jM7047i = bVar.m7047i(j);
            iz4 iz4VarM36117a = kr4.m36117a(tleVar, bVar.f8267c.f21518a, zbeVarM7050l, bVar.m7051m(j, j3) ? 0 : 8, of8.m42180r());
            if (c16078a != null) {
                c16078a.m43508c(jM7047i - jM7049k).m43511f(pe3.C16078a.m43506b(this.f8256j));
                Pair pairM7030m = m7030m(j, zbeVarM7050l, bVar);
                if (pairM7030m != null) {
                    c16078a.m43509d((String) pairM7030m.first).m43510e((String) pairM7030m.second);
                }
                iz4VarM43505a = c16078a.m43507a().m43505a(iz4VarM36117a);
            } else {
                iz4VarM43505a = iz4VarM36117a;
            }
            return new ruf(dz4Var, iz4VarM43505a, c2181a, i2, obj, jM7049k, jM7047i, j, i, c2181a);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            zbe zbeVarM59162a = zbeVarM7050l.m59162a(bVar.m7050l(i4 + j), bVar.f8267c.f21518a);
            if (zbeVarM59162a == null) {
                break;
            }
            i5++;
            i4++;
            zbeVarM7050l = zbeVarM59162a;
        }
        long j4 = (i5 + j) - 1;
        long jM7047i2 = bVar.m7047i(j4);
        long j5 = bVar.f8269e;
        long j6 = -9223372036854775807L;
        if (j5 != -9223372036854775807L && j5 <= jM7047i2) {
            j6 = j5;
        }
        iz4 iz4VarM36117a2 = kr4.m36117a(tleVar, bVar.f8267c.f21518a, zbeVarM7050l, bVar.m7051m(j4, j3) ? 0 : 8, of8.m42180r());
        if (c16078a != null) {
            c16078a.m43508c(jM7047i2 - jM7049k).m43511f(pe3.C16078a.m43506b(this.f8256j));
            Pair pairM7030m2 = m7030m(j, zbeVarM7050l, bVar);
            if (pairM7030m2 != null) {
                c16078a.m43509d((String) pairM7030m2.first).m43510e((String) pairM7030m2.second);
            }
            iz4VarM36117a2 = c16078a.m43507a().m43505a(iz4VarM36117a2);
        }
        iz4 iz4Var = iz4VarM36117a2;
        long j7 = -tleVar.f47377d;
        if (xeb.m56186n(c2181a.f7943n)) {
            j7 += jM7049k;
        }
        return new i14(dz4Var, iz4Var, c2181a, i2, obj, jM7049k, jM7047i2, j2, j6, j, i5, j7, bVar.f8265a);
    }

    @Override // p001o.q93
    public void release() {
        for (b bVar : this.f8255i) {
            l93 l93Var = bVar.f8265a;
            if (l93Var != null) {
                l93Var.release();
            }
        }
    }

    /* renamed from: s */
    public final b m7036s(int i) {
        b bVar = this.f8255i[i];
        ef1 ef1VarM28547j = this.f8248b.m28547j(bVar.f8266b.f47376c);
        if (ef1VarM28547j == null || ef1VarM28547j.equals(bVar.f8267c)) {
            return bVar;
        }
        b bVarM7042d = bVar.m7042d(ef1VarM28547j);
        this.f8255i[i] = bVarM7042d;
        return bVarM7042d;
    }
}
