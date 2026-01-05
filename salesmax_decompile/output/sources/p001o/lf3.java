package p001o;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;
import p001o.bt8;
import p001o.mra;

/* loaded from: classes4.dex */
public final class lf3 implements nce {

    /* renamed from: a */
    public final if3 f33706a;

    /* renamed from: b */
    public int f33707b;

    /* renamed from: c */
    public int f33708c;

    /* renamed from: d */
    public int f33709d = 0;

    public lf3(if3 if3Var) {
        if3 if3Var2 = (if3) xn8.m56500b(if3Var, "input");
        this.f33706a = if3Var2;
        if3Var2.f28579d = this;
    }

    /* renamed from: N */
    public static lf3 m37061N(if3 if3Var) {
        lf3 lf3Var = if3Var.f28579d;
        return lf3Var != null ? lf3Var : new lf3(if3Var);
    }

    @Override // p001o.nce
    /* renamed from: A */
    public void mo37062A(List list) throws bt8.C12491a {
        m37077Q(list, false);
    }

    @Override // p001o.nce
    /* renamed from: B */
    public void mo37063B(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof c37)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 2) {
                int iMo32011A = this.f33706a.mo32011A();
                m37080T(iMo32011A);
                int iMo32015d = this.f33706a.mo32015d() + iMo32011A;
                do {
                    list.add(Float.valueOf(this.f33706a.mo32025q()));
                } while (this.f33706a.mo32015d() < iMo32015d);
                return;
            }
            if (iM24742b != 5) {
                throw bt8.m19719d();
            }
            do {
                list.add(Float.valueOf(this.f33706a.mo32025q()));
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z = this.f33706a.mo32034z();
                }
            } while (iMo32034z == this.f33707b);
            this.f33709d = iMo32034z;
            return;
        }
        c37 c37Var = (c37) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 2) {
            int iMo32011A2 = this.f33706a.mo32011A();
            m37080T(iMo32011A2);
            int iMo32015d2 = this.f33706a.mo32015d() + iMo32011A2;
            do {
                c37Var.m20164d(this.f33706a.mo32025q());
            } while (this.f33706a.mo32015d() < iMo32015d2);
            return;
        }
        if (iM24742b2 != 5) {
            throw bt8.m19719d();
        }
        do {
            c37Var.m20164d(this.f33706a.mo32025q());
            if (this.f33706a.mo32016e()) {
                return;
            } else {
                iMo32034z2 = this.f33706a.mo32034z();
            }
        } while (iMo32034z2 == this.f33707b);
        this.f33709d = iMo32034z2;
    }

    @Override // p001o.nce
    /* renamed from: C */
    public boolean mo37064C() {
        int i;
        if (this.f33706a.mo32016e() || (i = this.f33707b) == this.f33708c) {
            return false;
        }
        return this.f33706a.mo32013C(i);
    }

    @Override // p001o.nce
    /* renamed from: D */
    public int mo37065D() throws bt8.C12491a {
        m37079S(5);
        return this.f33706a.mo32028t();
    }

    @Override // p001o.nce
    /* renamed from: E */
    public void mo37066E(List list) throws bt8.C12491a {
        int iMo32034z;
        if (ebj.m24742b(this.f33707b) != 2) {
            throw bt8.m19719d();
        }
        do {
            list.add(mo37096o());
            if (this.f33706a.mo32016e()) {
                return;
            } else {
                iMo32034z = this.f33706a.mo32034z();
            }
        } while (iMo32034z == this.f33707b);
        this.f33709d = iMo32034z;
    }

    @Override // p001o.nce
    /* renamed from: F */
    public void mo37067F(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof bx5)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 1) {
                do {
                    list.add(Double.valueOf(this.f33706a.mo32021m()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32011A = this.f33706a.mo32011A();
            m37081U(iMo32011A);
            int iMo32015d = this.f33706a.mo32015d() + iMo32011A;
            do {
                list.add(Double.valueOf(this.f33706a.mo32021m()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            return;
        }
        bx5 bx5Var = (bx5) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 1) {
            do {
                bx5Var.m2(this.f33706a.mo32021m());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32011A2 = this.f33706a.mo32011A();
        m37081U(iMo32011A2);
        int iMo32015d2 = this.f33706a.mo32015d() + iMo32011A2;
        do {
            bx5Var.m2(this.f33706a.mo32021m());
        } while (this.f33706a.mo32015d() < iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: G */
    public long mo37068G() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32027s();
    }

    @Override // p001o.nce
    /* renamed from: H */
    public String mo37069H() throws bt8.C12491a {
        m37079S(2);
        return this.f33706a.mo32033y();
    }

    @Override // p001o.nce
    /* renamed from: I */
    public void mo37070I(List list, o5f o5fVar, pp6 pp6Var) throws bt8.C12491a {
        int iMo32034z;
        if (ebj.m24742b(this.f33707b) != 2) {
            throw bt8.m19719d();
        }
        int i = this.f33707b;
        do {
            list.add(m37076P(o5fVar, pp6Var));
            if (this.f33706a.mo32016e() || this.f33709d != 0) {
                return;
            } else {
                iMo32034z = this.f33706a.mo32034z();
            }
        } while (iMo32034z == i);
        this.f33709d = iMo32034z;
    }

    @Override // p001o.nce
    /* renamed from: J */
    public void mo37071J(List list, o5f o5fVar, pp6 pp6Var) throws bt8.C12491a {
        int iMo32034z;
        if (ebj.m24742b(this.f33707b) != 3) {
            throw bt8.m19719d();
        }
        int i = this.f33707b;
        do {
            list.add(m37075O(o5fVar, pp6Var));
            if (this.f33706a.mo32016e() || this.f33709d != 0) {
                return;
            } else {
                iMo32034z = this.f33706a.mo32034z();
            }
        } while (iMo32034z == i);
        this.f33709d = iMo32034z;
    }

    @Override // p001o.nce
    /* renamed from: K */
    public Object mo37072K(o5f o5fVar, pp6 pp6Var) throws bt8.C12491a {
        m37079S(2);
        return m37076P(o5fVar, pp6Var);
    }

    @Override // p001o.nce
    /* renamed from: L */
    public Object mo37073L(o5f o5fVar, pp6 pp6Var) throws bt8.C12491a {
        m37079S(3);
        return m37075O(o5fVar, pp6Var);
    }

    @Override // p001o.nce
    /* renamed from: M */
    public void mo37074M(Map map, mra.C15407a c15407a, pp6 pp6Var) throws bt8.C12491a {
        m37079S(2);
        this.f33706a.mo32018j(this.f33706a.mo32011A());
        throw null;
    }

    /* renamed from: O */
    public final Object m37075O(o5f o5fVar, pp6 pp6Var) {
        int i = this.f33708c;
        this.f33708c = ebj.m24743c(ebj.m24741a(this.f33707b), 4);
        try {
            Object objMo16908e = o5fVar.mo16908e();
            o5fVar.mo16913j(objMo16908e, this, pp6Var);
            o5fVar.mo16905b(objMo16908e);
            if (this.f33707b == this.f33708c) {
                return objMo16908e;
            }
            throw bt8.m19722g();
        } finally {
            this.f33708c = i;
        }
    }

    /* renamed from: P */
    public final Object m37076P(o5f o5fVar, pp6 pp6Var) throws bt8 {
        int iMo32011A = this.f33706a.mo32011A();
        if3 if3Var = this.f33706a;
        if (if3Var.f28576a >= if3Var.f28577b) {
            throw bt8.m19723h();
        }
        int iMo32018j = if3Var.mo32018j(iMo32011A);
        Object objMo16908e = o5fVar.mo16908e();
        this.f33706a.f28576a++;
        o5fVar.mo16913j(objMo16908e, this, pp6Var);
        o5fVar.mo16905b(objMo16908e);
        this.f33706a.mo32014a(0);
        r5.f28576a--;
        this.f33706a.mo32017i(iMo32018j);
        return objMo16908e;
    }

    /* renamed from: Q */
    public void m37077Q(List list, boolean z) throws bt8.C12491a {
        int iMo32034z;
        int iMo32034z2;
        if (ebj.m24742b(this.f33707b) != 2) {
            throw bt8.m19719d();
        }
        if (!(list instanceof zi9) || z) {
            do {
                list.add(z ? mo37069H() : readString());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z = this.f33706a.mo32034z();
                }
            } while (iMo32034z == this.f33707b);
            this.f33709d = iMo32034z;
            return;
        }
        zi9 zi9Var = (zi9) list;
        do {
            zi9Var.P1(mo37096o());
            if (this.f33706a.mo32016e()) {
                return;
            } else {
                iMo32034z2 = this.f33706a.mo32034z();
            }
        } while (iMo32034z2 == this.f33707b);
        this.f33709d = iMo32034z2;
    }

    /* renamed from: R */
    public final void m37078R(int i) throws bt8 {
        if (this.f33706a.mo32015d() != i) {
            throw bt8.m19724j();
        }
    }

    /* renamed from: S */
    public final void m37079S(int i) throws bt8.C12491a {
        if (ebj.m24742b(this.f33707b) != i) {
            throw bt8.m19719d();
        }
    }

    /* renamed from: T */
    public final void m37080T(int i) throws bt8 {
        if ((i & 3) != 0) {
            throw bt8.m19722g();
        }
    }

    /* renamed from: U */
    public final void m37081U(int i) throws bt8 {
        if ((i & 7) != 0) {
            throw bt8.m19722g();
        }
    }

    @Override // p001o.nce
    /* renamed from: a */
    public long mo37082a() throws bt8.C12491a {
        m37079S(1);
        return this.f33706a.mo32024p();
    }

    @Override // p001o.nce
    /* renamed from: b */
    public int mo37083b() {
        return this.f33707b;
    }

    @Override // p001o.nce
    /* renamed from: c */
    public void mo37084c(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof al8)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 2) {
                int iMo32011A = this.f33706a.mo32011A();
                m37080T(iMo32011A);
                int iMo32015d = this.f33706a.mo32015d() + iMo32011A;
                do {
                    list.add(Integer.valueOf(this.f33706a.mo32028t()));
                } while (this.f33706a.mo32015d() < iMo32015d);
                return;
            }
            if (iM24742b != 5) {
                throw bt8.m19719d();
            }
            do {
                list.add(Integer.valueOf(this.f33706a.mo32028t()));
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z = this.f33706a.mo32034z();
                }
            } while (iMo32034z == this.f33707b);
            this.f33709d = iMo32034z;
            return;
        }
        al8 al8Var = (al8) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 2) {
            int iMo32011A2 = this.f33706a.mo32011A();
            m37080T(iMo32011A2);
            int iMo32015d2 = this.f33706a.mo32015d() + iMo32011A2;
            do {
                al8Var.R1(this.f33706a.mo32028t());
            } while (this.f33706a.mo32015d() < iMo32015d2);
            return;
        }
        if (iM24742b2 != 5) {
            throw bt8.m19719d();
        }
        do {
            al8Var.R1(this.f33706a.mo32028t());
            if (this.f33706a.mo32016e()) {
                return;
            } else {
                iMo32034z2 = this.f33706a.mo32034z();
            }
        } while (iMo32034z2 == this.f33707b);
        this.f33709d = iMo32034z2;
    }

    @Override // p001o.nce
    /* renamed from: d */
    public void mo37085d(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof ela)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Long.valueOf(this.f33706a.mo32031w()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Long.valueOf(this.f33706a.mo32031w()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        ela elaVar = (ela) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                elaVar.Z1(this.f33706a.mo32031w());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            elaVar.Z1(this.f33706a.mo32031w());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: e */
    public boolean mo37086e() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32019k();
    }

    @Override // p001o.nce
    /* renamed from: f */
    public long mo37087f() throws bt8.C12491a {
        m37079S(1);
        return this.f33706a.mo32029u();
    }

    @Override // p001o.nce
    /* renamed from: g */
    public void mo37088g(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof ela)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Long.valueOf(this.f33706a.mo32012B()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Long.valueOf(this.f33706a.mo32012B()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        ela elaVar = (ela) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                elaVar.Z1(this.f33706a.mo32012B());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            elaVar.Z1(this.f33706a.mo32012B());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: h */
    public int mo37089h() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32011A();
    }

    @Override // p001o.nce
    /* renamed from: i */
    public void mo37090i(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof ela)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Long.valueOf(this.f33706a.mo32027s()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Long.valueOf(this.f33706a.mo32027s()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        ela elaVar = (ela) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                elaVar.Z1(this.f33706a.mo32027s());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            elaVar.Z1(this.f33706a.mo32027s());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: j */
    public void mo37091j(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof al8)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Integer.valueOf(this.f33706a.mo32022n()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Integer.valueOf(this.f33706a.mo32022n()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        al8 al8Var = (al8) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                al8Var.R1(this.f33706a.mo32022n());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            al8Var.R1(this.f33706a.mo32022n());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: k */
    public int mo37092k() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32022n();
    }

    @Override // p001o.nce
    /* renamed from: l */
    public int mo37093l() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32030v();
    }

    @Override // p001o.nce
    /* renamed from: m */
    public void mo37094m(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof ek1)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f33706a.mo32019k()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Boolean.valueOf(this.f33706a.mo32019k()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        ek1 ek1Var = (ek1) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                ek1Var.m25184d(this.f33706a.mo32019k());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            ek1Var.m25184d(this.f33706a.mo32019k());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: n */
    public void mo37095n(List list) throws bt8.C12491a {
        m37077Q(list, true);
    }

    @Override // p001o.nce
    /* renamed from: o */
    public yq1 mo37096o() throws bt8.C12491a {
        m37079S(2);
        return this.f33706a.mo32020l();
    }

    @Override // p001o.nce
    /* renamed from: p */
    public int mo37097p() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32026r();
    }

    @Override // p001o.nce
    /* renamed from: q */
    public void mo37098q(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof ela)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 1) {
                do {
                    list.add(Long.valueOf(this.f33706a.mo32024p()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32011A = this.f33706a.mo32011A();
            m37081U(iMo32011A);
            int iMo32015d = this.f33706a.mo32015d() + iMo32011A;
            do {
                list.add(Long.valueOf(this.f33706a.mo32024p()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            return;
        }
        ela elaVar = (ela) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 1) {
            do {
                elaVar.Z1(this.f33706a.mo32024p());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32011A2 = this.f33706a.mo32011A();
        m37081U(iMo32011A2);
        int iMo32015d2 = this.f33706a.mo32015d() + iMo32011A2;
        do {
            elaVar.Z1(this.f33706a.mo32024p());
        } while (this.f33706a.mo32015d() < iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: r */
    public void mo37099r(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof al8)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Integer.valueOf(this.f33706a.mo32030v()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Integer.valueOf(this.f33706a.mo32030v()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        al8 al8Var = (al8) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                al8Var.R1(this.f33706a.mo32030v());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            al8Var.R1(this.f33706a.mo32030v());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    public double readDouble() throws bt8.C12491a {
        m37079S(1);
        return this.f33706a.mo32021m();
    }

    @Override // p001o.nce
    public float readFloat() throws bt8.C12491a {
        m37079S(5);
        return this.f33706a.mo32025q();
    }

    @Override // p001o.nce
    public String readString() throws bt8.C12491a {
        m37079S(2);
        return this.f33706a.mo32032x();
    }

    @Override // p001o.nce
    /* renamed from: s */
    public long mo37100s() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32012B();
    }

    @Override // p001o.nce
    /* renamed from: t */
    public void mo37101t(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof al8)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Integer.valueOf(this.f33706a.mo32011A()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Integer.valueOf(this.f33706a.mo32011A()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        al8 al8Var = (al8) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                al8Var.R1(this.f33706a.mo32011A());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            al8Var.R1(this.f33706a.mo32011A());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: u */
    public int mo37102u() throws bt8.C12491a {
        m37079S(5);
        return this.f33706a.mo32023o();
    }

    @Override // p001o.nce
    /* renamed from: v */
    public void mo37103v(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof ela)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 1) {
                do {
                    list.add(Long.valueOf(this.f33706a.mo32029u()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32011A = this.f33706a.mo32011A();
            m37081U(iMo32011A);
            int iMo32015d = this.f33706a.mo32015d() + iMo32011A;
            do {
                list.add(Long.valueOf(this.f33706a.mo32029u()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            return;
        }
        ela elaVar = (ela) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 1) {
            do {
                elaVar.Z1(this.f33706a.mo32029u());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32011A2 = this.f33706a.mo32011A();
        m37081U(iMo32011A2);
        int iMo32015d2 = this.f33706a.mo32015d() + iMo32011A2;
        do {
            elaVar.Z1(this.f33706a.mo32029u());
        } while (this.f33706a.mo32015d() < iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: w */
    public void mo37104w(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof al8)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 0) {
                do {
                    list.add(Integer.valueOf(this.f33706a.mo32026r()));
                    if (this.f33706a.mo32016e()) {
                        return;
                    } else {
                        iMo32034z = this.f33706a.mo32034z();
                    }
                } while (iMo32034z == this.f33707b);
                this.f33709d = iMo32034z;
                return;
            }
            if (iM24742b != 2) {
                throw bt8.m19719d();
            }
            int iMo32015d = this.f33706a.mo32015d() + this.f33706a.mo32011A();
            do {
                list.add(Integer.valueOf(this.f33706a.mo32026r()));
            } while (this.f33706a.mo32015d() < iMo32015d);
            m37078R(iMo32015d);
            return;
        }
        al8 al8Var = (al8) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 0) {
            do {
                al8Var.R1(this.f33706a.mo32026r());
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z2 = this.f33706a.mo32034z();
                }
            } while (iMo32034z2 == this.f33707b);
            this.f33709d = iMo32034z2;
            return;
        }
        if (iM24742b2 != 2) {
            throw bt8.m19719d();
        }
        int iMo32015d2 = this.f33706a.mo32015d() + this.f33706a.mo32011A();
        do {
            al8Var.R1(this.f33706a.mo32026r());
        } while (this.f33706a.mo32015d() < iMo32015d2);
        m37078R(iMo32015d2);
    }

    @Override // p001o.nce
    /* renamed from: x */
    public void mo37105x(List list) throws bt8 {
        int iMo32034z;
        int iMo32034z2;
        if (!(list instanceof al8)) {
            int iM24742b = ebj.m24742b(this.f33707b);
            if (iM24742b == 2) {
                int iMo32011A = this.f33706a.mo32011A();
                m37080T(iMo32011A);
                int iMo32015d = this.f33706a.mo32015d() + iMo32011A;
                do {
                    list.add(Integer.valueOf(this.f33706a.mo32023o()));
                } while (this.f33706a.mo32015d() < iMo32015d);
                return;
            }
            if (iM24742b != 5) {
                throw bt8.m19719d();
            }
            do {
                list.add(Integer.valueOf(this.f33706a.mo32023o()));
                if (this.f33706a.mo32016e()) {
                    return;
                } else {
                    iMo32034z = this.f33706a.mo32034z();
                }
            } while (iMo32034z == this.f33707b);
            this.f33709d = iMo32034z;
            return;
        }
        al8 al8Var = (al8) list;
        int iM24742b2 = ebj.m24742b(this.f33707b);
        if (iM24742b2 == 2) {
            int iMo32011A2 = this.f33706a.mo32011A();
            m37080T(iMo32011A2);
            int iMo32015d2 = this.f33706a.mo32015d() + iMo32011A2;
            do {
                al8Var.R1(this.f33706a.mo32023o());
            } while (this.f33706a.mo32015d() < iMo32015d2);
            return;
        }
        if (iM24742b2 != 5) {
            throw bt8.m19719d();
        }
        do {
            al8Var.R1(this.f33706a.mo32023o());
            if (this.f33706a.mo32016e()) {
                return;
            } else {
                iMo32034z2 = this.f33706a.mo32034z();
            }
        } while (iMo32034z2 == this.f33707b);
        this.f33709d = iMo32034z2;
    }

    @Override // p001o.nce
    /* renamed from: y */
    public long mo37106y() throws bt8.C12491a {
        m37079S(0);
        return this.f33706a.mo32031w();
    }

    @Override // p001o.nce
    /* renamed from: z */
    public int mo37107z() {
        int i = this.f33709d;
        if (i != 0) {
            this.f33707b = i;
            this.f33709d = 0;
        } else {
            this.f33707b = this.f33706a.mo32034z();
        }
        int i2 = this.f33707b;
        return (i2 == 0 || i2 == this.f33708c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : ebj.m24741a(i2);
    }
}
