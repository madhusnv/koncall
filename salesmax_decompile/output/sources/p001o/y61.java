package p001o;

import androidx.media3.common.C2181a;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayList;
import p001o.qbg;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class y61 implements tq6 {

    /* renamed from: a */
    public final zwc f54966a;

    /* renamed from: b */
    public final C18342c f54967b;

    /* renamed from: c */
    public final boolean f54968c;

    /* renamed from: d */
    public final qbg.InterfaceC16329a f54969d;

    /* renamed from: e */
    public int f54970e;

    /* renamed from: f */
    public vq6 f54971f;

    /* renamed from: g */
    public z61 f54972g;

    /* renamed from: h */
    public long f54973h;

    /* renamed from: i */
    public o93[] f54974i;

    /* renamed from: j */
    public long f54975j;

    /* renamed from: k */
    public o93 f54976k;

    /* renamed from: l */
    public int f54977l;

    /* renamed from: m */
    public long f54978m;

    /* renamed from: n */
    public long f54979n;

    /* renamed from: o */
    public int f54980o;

    /* renamed from: p */
    public boolean f54981p;

    /* renamed from: o.y61$b */
    public class C18341b implements zaf {

        /* renamed from: a */
        public final long f54982a;

        public C18341b(long j) {
            this.f54982a = j;
        }

        @Override // p001o.zaf
        /* renamed from: e */
        public zaf.C18603a mo25530e(long j) {
            zaf.C18603a c18603aM41801i = y61.this.f54974i[0].m41801i(j);
            for (int i = 1; i < y61.this.f54974i.length; i++) {
                zaf.C18603a c18603aM41801i2 = y61.this.f54974i[i].m41801i(j);
                if (c18603aM41801i2.f56857a.f15878b < c18603aM41801i.f56857a.f15878b) {
                    c18603aM41801i = c18603aM41801i2;
                }
            }
            return c18603aM41801i;
        }

        @Override // p001o.zaf
        public long getDurationUs() {
            return this.f54982a;
        }

        @Override // p001o.zaf
        /* renamed from: h */
        public boolean mo25531h() {
            return true;
        }
    }

    /* renamed from: o.y61$c */
    public static class C18342c {

        /* renamed from: a */
        public int f54984a;

        /* renamed from: b */
        public int f54985b;

        /* renamed from: c */
        public int f54986c;

        public C18342c() {
        }

        /* renamed from: a */
        public void m57307a(zwc zwcVar) {
            this.f54984a = zwcVar.m60040u();
            this.f54985b = zwcVar.m60040u();
            this.f54986c = 0;
        }

        /* renamed from: b */
        public void m57308b(zwc zwcVar) throws byc {
            m57307a(zwcVar);
            if (this.f54984a == 1414744396) {
                this.f54986c = zwcVar.m60040u();
                return;
            }
            throw byc.m19921a("LIST expected, found: " + this.f54984a, null);
        }
    }

    public y61(int i, qbg.InterfaceC16329a interfaceC16329a) {
        this.f54969d = interfaceC16329a;
        this.f54968c = (i & 1) == 0;
        this.f54966a = new zwc(12);
        this.f54967b = new C18342c();
        this.f54971f = new kzb();
        this.f54974i = new o93[0];
        this.f54978m = -1L;
        this.f54979n = -1L;
        this.f54977l = -1;
        this.f54973h = -9223372036854775807L;
    }

    /* renamed from: e */
    public static void m57299e(uq6 uq6Var) {
        if ((uq6Var.getPosition() & 1) == 1) {
            uq6Var.mo40496k(1);
        }
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f54975j = -1L;
        this.f54976k = null;
        for (o93 o93Var : this.f54974i) {
            o93Var.m41807o(j);
        }
        if (j != 0) {
            this.f54970e = 6;
        } else if (this.f54974i.length == 0) {
            this.f54970e = 0;
        } else {
            this.f54970e = 3;
        }
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        uq6Var.mo40498m(this.f54966a.m60024e(), 0, 12);
        this.f54966a.m60017U(0);
        if (this.f54966a.m60040u() != 1179011410) {
            return false;
        }
        this.f54966a.m60018V(4);
        return this.f54966a.m60040u() == 541677121;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f54970e = 0;
        if (this.f54968c) {
            vq6Var = new sbg(vq6Var, this.f54969d);
        }
        this.f54971f = vq6Var;
        this.f54975j = -1L;
    }

    /* renamed from: g */
    public final o93 m57300g(int i) {
        for (o93 o93Var : this.f54974i) {
            if (o93Var.m41802j(i)) {
                return o93Var;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final void m57301h(zwc zwcVar) throws byc {
        fea feaVarM26514c = fea.m26514c(1819436136, zwcVar);
        if (feaVarM26514c.getType() != 1819436136) {
            throw byc.m19921a("Unexpected header list type " + feaVarM26514c.getType(), null);
        }
        z61 z61Var = (z61) feaVarM26514c.m26515b(z61.class);
        if (z61Var == null) {
            throw byc.m19921a("AviHeader not found", null);
        }
        this.f54972g = z61Var;
        this.f54973h = z61Var.f56578c * z61Var.f56576a;
        ArrayList arrayList = new ArrayList();
        q4i it = feaVarM26514c.f23192a.iterator();
        int i = 0;
        while (it.hasNext()) {
            x61 x61Var = (x61) it.next();
            if (x61Var.getType() == 1819440243) {
                int i2 = i + 1;
                o93 o93VarM57304m = m57304m((fea) x61Var, i);
                if (o93VarM57304m != null) {
                    arrayList.add(o93VarM57304m);
                }
                i = i2;
            }
        }
        this.f54974i = (o93[]) arrayList.toArray(new o93[0]);
        this.f54971f.mo32489p();
    }

    /* renamed from: j */
    public final void m57302j(zwc zwcVar) {
        long jM57303l = m57303l(zwcVar);
        while (zwcVar.m60020a() >= 16) {
            int iM60040u = zwcVar.m60040u();
            int iM60040u2 = zwcVar.m60040u();
            long jM60040u = zwcVar.m60040u() + jM57303l;
            zwcVar.m60040u();
            o93 o93VarM57300g = m57300g(iM60040u);
            if (o93VarM57300g != null) {
                if ((iM60040u2 & 16) == 16) {
                    o93VarM57300g.m41795b(jM60040u);
                }
                o93VarM57300g.m41803k();
            }
        }
        for (o93 o93Var : this.f54974i) {
            o93Var.m41796c();
        }
        this.f54981p = true;
        this.f54971f.mo32490r(new C18341b(this.f54973h));
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        if (m57306o(uq6Var, uedVar)) {
            return 1;
        }
        switch (this.f54970e) {
            case 0:
                if (!mo17262c(uq6Var)) {
                    throw byc.m19921a("AVI Header List not found", null);
                }
                uq6Var.mo40496k(12);
                this.f54970e = 1;
                return 0;
            case 1:
                uq6Var.readFully(this.f54966a.m60024e(), 0, 12);
                this.f54966a.m60017U(0);
                this.f54967b.m57308b(this.f54966a);
                C18342c c18342c = this.f54967b;
                if (c18342c.f54986c == 1819436136) {
                    this.f54977l = c18342c.f54985b;
                    this.f54970e = 2;
                    return 0;
                }
                throw byc.m19921a("hdrl expected, found: " + this.f54967b.f54986c, null);
            case 2:
                int i = this.f54977l - 4;
                zwc zwcVar = new zwc(i);
                uq6Var.readFully(zwcVar.m60024e(), 0, i);
                m57301h(zwcVar);
                this.f54970e = 3;
                return 0;
            case 3:
                if (this.f54978m != -1) {
                    long position = uq6Var.getPosition();
                    long j = this.f54978m;
                    if (position != j) {
                        this.f54975j = j;
                        return 0;
                    }
                }
                uq6Var.mo40498m(this.f54966a.m60024e(), 0, 12);
                uq6Var.mo40490c();
                this.f54966a.m60017U(0);
                this.f54967b.m57307a(this.f54966a);
                int iM60040u = this.f54966a.m60040u();
                int i2 = this.f54967b.f54984a;
                if (i2 == 1179011410) {
                    uq6Var.mo40496k(12);
                    return 0;
                }
                if (i2 != 1414744396 || iM60040u != 1769369453) {
                    this.f54975j = uq6Var.getPosition() + this.f54967b.f54985b + 8;
                    return 0;
                }
                long position2 = uq6Var.getPosition();
                this.f54978m = position2;
                this.f54979n = position2 + this.f54967b.f54985b + 8;
                if (!this.f54981p) {
                    if (((z61) op0.m42515e(this.f54972g)).m58835a()) {
                        this.f54970e = 4;
                        this.f54975j = this.f54979n;
                        return 0;
                    }
                    this.f54971f.mo32490r(new zaf.C18604b(this.f54973h));
                    this.f54981p = true;
                }
                this.f54975j = uq6Var.getPosition() + 12;
                this.f54970e = 6;
                return 0;
            case 4:
                uq6Var.readFully(this.f54966a.m60024e(), 0, 8);
                this.f54966a.m60017U(0);
                int iM60040u2 = this.f54966a.m60040u();
                int iM60040u3 = this.f54966a.m60040u();
                if (iM60040u2 == 829973609) {
                    this.f54970e = 5;
                    this.f54980o = iM60040u3;
                } else {
                    this.f54975j = uq6Var.getPosition() + iM60040u3;
                }
                return 0;
            case 5:
                zwc zwcVar2 = new zwc(this.f54980o);
                uq6Var.readFully(zwcVar2.m60024e(), 0, this.f54980o);
                m57302j(zwcVar2);
                this.f54970e = 6;
                this.f54975j = this.f54978m;
                return 0;
            case 6:
                return m57305n(uq6Var);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: l */
    public final long m57303l(zwc zwcVar) {
        if (zwcVar.m60020a() < 16) {
            return 0L;
        }
        int iM60025f = zwcVar.m60025f();
        zwcVar.m60018V(8);
        long jM60040u = zwcVar.m60040u();
        long j = this.f54978m;
        long j2 = jM60040u <= j ? j + 8 : 0L;
        zwcVar.m60017U(iM60025f);
        return j2;
    }

    /* renamed from: m */
    public final o93 m57304m(fea feaVar, int i) {
        a71 a71Var = (a71) feaVar.m26515b(a71.class);
        v6g v6gVar = (v6g) feaVar.m26515b(v6g.class);
        if (a71Var == null) {
            ria.m46824h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (v6gVar == null) {
            ria.m46824h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jM16533a = a71Var.m16533a();
        C2181a c2181a = v6gVar.f49925a;
        C2181a.b bVarM6707a = c2181a.m6707a();
        bVarM6707a.m6763Z(i);
        int i2 = a71Var.f14231f;
        if (i2 != 0) {
            bVarM6707a.f0(i2);
        }
        y6g y6gVar = (y6g) feaVar.m26515b(y6g.class);
        if (y6gVar != null) {
            bVarM6707a.c0(y6gVar.f55006a);
        }
        int iM56181i = xeb.m56181i(c2181a.f7943n);
        if (iM56181i != 1 && iM56181i != 2) {
            return null;
        }
        uth uthVarMo32487f = this.f54971f.mo32487f(i, iM56181i);
        uthVarMo32487f.mo7072b(bVarM6707a.m6748K());
        o93 o93Var = new o93(i, iM56181i, jM16533a, a71Var.f14230e, uthVarMo32487f);
        this.f54973h = jM16533a;
        return o93Var;
    }

    /* renamed from: n */
    public final int m57305n(uq6 uq6Var) {
        if (uq6Var.getPosition() >= this.f54979n) {
            return -1;
        }
        o93 o93Var = this.f54976k;
        if (o93Var == null) {
            m57299e(uq6Var);
            uq6Var.mo40498m(this.f54966a.m60024e(), 0, 12);
            this.f54966a.m60017U(0);
            int iM60040u = this.f54966a.m60040u();
            if (iM60040u == 1414744396) {
                this.f54966a.m60017U(8);
                uq6Var.mo40496k(this.f54966a.m60040u() != 1769369453 ? 8 : 12);
                uq6Var.mo40490c();
                return 0;
            }
            int iM60040u2 = this.f54966a.m60040u();
            if (iM60040u == 1263424842) {
                this.f54975j = uq6Var.getPosition() + iM60040u2 + 8;
                return 0;
            }
            uq6Var.mo40496k(8);
            uq6Var.mo40490c();
            o93 o93VarM57300g = m57300g(iM60040u);
            if (o93VarM57300g == null) {
                this.f54975j = uq6Var.getPosition() + iM60040u2;
                return 0;
            }
            o93VarM57300g.m41806n(iM60040u2);
            this.f54976k = o93VarM57300g;
        } else if (o93Var.m41805m(uq6Var)) {
            this.f54976k = null;
        }
        return 0;
    }

    /* renamed from: o */
    public final boolean m57306o(uq6 uq6Var, ued uedVar) {
        boolean z;
        if (this.f54975j != -1) {
            long position = uq6Var.getPosition();
            long j = this.f54975j;
            if (j < position || j > MediaStatus.COMMAND_STREAM_TRANSFER + position) {
                uedVar.f48772a = j;
                z = true;
            } else {
                uq6Var.mo40496k((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f54975j = -1L;
        return z;
    }

    @Override // p001o.tq6
    public void release() {
    }
}
