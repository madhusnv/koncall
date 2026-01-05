package p001o;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;
import p001o.ct8;
import p001o.fbj;
import p001o.nra;

/* loaded from: classes6.dex */
public final class kf3 implements mce {

    /* renamed from: a */
    public final jf3 f32135a;

    /* renamed from: b */
    public int f32136b;

    /* renamed from: c */
    public int f32137c;

    /* renamed from: d */
    public int f32138d = 0;

    /* renamed from: o.kf3$a */
    public static /* synthetic */ class C14823a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32139a;

        static {
            int[] iArr = new int[fbj.EnumC13396b.values().length];
            f32139a = iArr;
            try {
                iArr[fbj.EnumC13396b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32139a[fbj.EnumC13396b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32139a[fbj.EnumC13396b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32139a[fbj.EnumC13396b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32139a[fbj.EnumC13396b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32139a[fbj.EnumC13396b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32139a[fbj.EnumC13396b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32139a[fbj.EnumC13396b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32139a[fbj.EnumC13396b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32139a[fbj.EnumC13396b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32139a[fbj.EnumC13396b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32139a[fbj.EnumC13396b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32139a[fbj.EnumC13396b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32139a[fbj.EnumC13396b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32139a[fbj.EnumC13396b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32139a[fbj.EnumC13396b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32139a[fbj.EnumC13396b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public kf3(jf3 jf3Var) {
        jf3 jf3Var2 = (jf3) yn8.m58013b(jf3Var, "input");
        this.f32135a = jf3Var2;
        jf3Var2.f30310d = this;
    }

    /* renamed from: P */
    public static kf3 m35569P(jf3 jf3Var) {
        kf3 kf3Var = jf3Var.f30310d;
        return kf3Var != null ? kf3Var : new kf3(jf3Var);
    }

    @Override // p001o.mce
    /* renamed from: A */
    public void mo35570A(List list) throws ct8.C12741a {
        m35588T(list, false);
    }

    @Override // p001o.mce
    /* renamed from: B */
    public void mo35571B(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof b37)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 2) {
                int iMo33696F = this.f32135a.mo33696F();
                m35591W(iMo33696F);
                int iMo33700d = this.f32135a.mo33700d() + iMo33696F;
                do {
                    list.add(Float.valueOf(this.f32135a.mo33710u()));
                } while (this.f32135a.mo33700d() < iMo33700d);
                return;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            do {
                list.add(Float.valueOf(this.f32135a.mo33710u()));
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E = this.f32135a.mo33695E();
                }
            } while (iMo33695E == this.f32136b);
            this.f32138d = iMo33695E;
            return;
        }
        b37 b37Var = (b37) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 2) {
            int iMo33696F2 = this.f32135a.mo33696F();
            m35591W(iMo33696F2);
            int iMo33700d2 = this.f32135a.mo33700d() + iMo33696F2;
            do {
                b37Var.m18130i(this.f32135a.mo33710u());
            } while (this.f32135a.mo33700d() < iMo33700d2);
            return;
        }
        if (iM26426b2 != 5) {
            throw ct8.m21767e();
        }
        do {
            b37Var.m18130i(this.f32135a.mo33710u());
            if (this.f32135a.mo33701e()) {
                return;
            } else {
                iMo33695E2 = this.f32135a.mo33695E();
            }
        } while (iMo33695E2 == this.f32136b);
        this.f32138d = iMo33695E2;
    }

    @Override // p001o.mce
    /* renamed from: C */
    public boolean mo35572C() {
        int i;
        if (this.f32135a.mo33701e() || (i = this.f32136b) == this.f32137c) {
            return false;
        }
        return this.f32135a.mo33698H(i);
    }

    @Override // p001o.mce
    /* renamed from: D */
    public int mo35573D() throws ct8.C12741a {
        m35590V(5);
        return this.f32135a.mo33713y();
    }

    @Override // p001o.mce
    /* renamed from: E */
    public void mo35574E(List list) throws ct8.C12741a {
        int iMo33695E;
        if (fbj.m26426b(this.f32136b) != 2) {
            throw ct8.m21767e();
        }
        do {
            list.add(mo35607o());
            if (this.f32135a.mo33701e()) {
                return;
            } else {
                iMo33695E = this.f32135a.mo33695E();
            }
        } while (iMo33695E == this.f32136b);
        this.f32138d = iMo33695E;
    }

    @Override // p001o.mce
    /* renamed from: F */
    public void mo35575F(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof ax5)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 1) {
                do {
                    list.add(Double.valueOf(this.f32135a.mo33706q()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33696F = this.f32135a.mo33696F();
            m35592X(iMo33696F);
            int iMo33700d = this.f32135a.mo33700d() + iMo33696F;
            do {
                list.add(Double.valueOf(this.f32135a.mo33706q()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            return;
        }
        ax5 ax5Var = (ax5) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 1) {
            do {
                ax5Var.m2(this.f32135a.mo33706q());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33696F2 = this.f32135a.mo33696F();
        m35592X(iMo33696F2);
        int iMo33700d2 = this.f32135a.mo33700d() + iMo33696F2;
        do {
            ax5Var.m2(this.f32135a.mo33706q());
        } while (this.f32135a.mo33700d() < iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: G */
    public long mo35576G() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33712w();
    }

    @Override // p001o.mce
    /* renamed from: H */
    public String mo35577H() throws ct8.C12741a {
        m35590V(2);
        return this.f32135a.mo33694D();
    }

    @Override // p001o.mce
    /* renamed from: I */
    public Object mo35578I(n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
        m35590V(3);
        return m35586R(n5fVar, qp6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return;
     */
    @Override // p001o.mce
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo35579J(Map map, nra.C15645a c15645a, qp6 qp6Var) throws ct8.C12741a {
        m35590V(2);
        int iMo33703n = this.f32135a.mo33703n(this.f32135a.mo33696F());
        Object objM35585Q = c15645a.f37206b;
        Object objM35585Q2 = c15645a.f37208d;
        while (true) {
            try {
                int iMo35618z = mo35618z();
                if (iMo35618z == Integer.MAX_VALUE || this.f32135a.mo33701e()) {
                    break;
                }
                if (iMo35618z == 1) {
                    objM35585Q = m35585Q(c15645a.f37205a, null, null);
                } else if (iMo35618z != 2) {
                    try {
                        if (!mo35572C()) {
                            throw new ct8("Unable to parse map entry.");
                        }
                    } catch (ct8.C12741a unused) {
                        if (!mo35572C()) {
                            throw new ct8("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM35585Q2 = m35585Q(c15645a.f37207c, c15645a.f37208d.getClass(), qp6Var);
                }
            } finally {
                this.f32135a.mo33702m(iMo33703n);
            }
        }
    }

    @Override // p001o.mce
    /* renamed from: K */
    public Object mo35580K(n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
        m35590V(2);
        return m35587S(n5fVar, qp6Var);
    }

    @Override // p001o.mce
    /* renamed from: L */
    public Object mo35581L(Class cls, qp6 qp6Var) throws ct8.C12741a {
        m35590V(2);
        return m35587S(v1e.m52231a().m52234d(cls), qp6Var);
    }

    @Override // p001o.mce
    /* renamed from: M */
    public Object mo35582M(Class cls, qp6 qp6Var) throws ct8.C12741a {
        m35590V(3);
        return m35586R(v1e.m52231a().m52234d(cls), qp6Var);
    }

    @Override // p001o.mce
    /* renamed from: N */
    public void mo35583N(List list, n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
        int iMo33695E;
        if (fbj.m26426b(this.f32136b) != 2) {
            throw ct8.m21767e();
        }
        int i = this.f32136b;
        do {
            list.add(m35587S(n5fVar, qp6Var));
            if (this.f32135a.mo33701e() || this.f32138d != 0) {
                return;
            } else {
                iMo33695E = this.f32135a.mo33695E();
            }
        } while (iMo33695E == i);
        this.f32138d = iMo33695E;
    }

    @Override // p001o.mce
    /* renamed from: O */
    public void mo35584O(List list, n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
        int iMo33695E;
        if (fbj.m26426b(this.f32136b) != 3) {
            throw ct8.m21767e();
        }
        int i = this.f32136b;
        do {
            list.add(m35586R(n5fVar, qp6Var));
            if (this.f32135a.mo33701e() || this.f32138d != 0) {
                return;
            } else {
                iMo33695E = this.f32135a.mo33695E();
            }
        } while (iMo33695E == i);
        this.f32138d = iMo33695E;
    }

    /* renamed from: Q */
    public final Object m35585Q(fbj.EnumC13396b enumC13396b, Class cls, qp6 qp6Var) {
        switch (C14823a.f32139a[enumC13396b.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo35597e());
            case 2:
                return mo35607o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo35603k());
            case 5:
                return Integer.valueOf(mo35613u());
            case 6:
                return Long.valueOf(mo35593a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo35608p());
            case 9:
                return Long.valueOf(mo35576G());
            case 10:
                return mo35581L(cls, qp6Var);
            case 11:
                return Integer.valueOf(mo35573D());
            case 12:
                return Long.valueOf(mo35598f());
            case 13:
                return Integer.valueOf(mo35604l());
            case 14:
                return Long.valueOf(mo35617y());
            case 15:
                return mo35577H();
            case 16:
                return Integer.valueOf(mo35600h());
            case 17:
                return Long.valueOf(mo35611s());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: R */
    public final Object m35586R(n5f n5fVar, qp6 qp6Var) {
        int i = this.f32137c;
        this.f32137c = fbj.m26427c(fbj.m26425a(this.f32136b), 4);
        try {
            Object objMo40126e = n5fVar.mo40126e();
            n5fVar.mo40129h(objMo40126e, this, qp6Var);
            n5fVar.mo40123b(objMo40126e);
            if (this.f32136b == this.f32137c) {
                return objMo40126e;
            }
            throw ct8.m21770h();
        } finally {
            this.f32137c = i;
        }
    }

    /* renamed from: S */
    public final Object m35587S(n5f n5fVar, qp6 qp6Var) throws ct8 {
        int iMo33696F = this.f32135a.mo33696F();
        jf3 jf3Var = this.f32135a;
        if (jf3Var.f30307a >= jf3Var.f30308b) {
            throw ct8.m21771i();
        }
        int iMo33703n = jf3Var.mo33703n(iMo33696F);
        Object objMo40126e = n5fVar.mo40126e();
        this.f32135a.f30307a++;
        n5fVar.mo40129h(objMo40126e, this, qp6Var);
        n5fVar.mo40123b(objMo40126e);
        this.f32135a.mo33699a(0);
        r5.f30307a--;
        this.f32135a.mo33702m(iMo33703n);
        return objMo40126e;
    }

    /* renamed from: T */
    public void m35588T(List list, boolean z) throws ct8.C12741a {
        int iMo33695E;
        int iMo33695E2;
        if (fbj.m26426b(this.f32136b) != 2) {
            throw ct8.m21767e();
        }
        if (!(list instanceof yi9) || z) {
            do {
                list.add(z ? mo35577H() : readString());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E = this.f32135a.mo33695E();
                }
            } while (iMo33695E == this.f32136b);
            this.f32138d = iMo33695E;
            return;
        }
        yi9 yi9Var = (yi9) list;
        do {
            yi9Var.z0(mo35607o());
            if (this.f32135a.mo33701e()) {
                return;
            } else {
                iMo33695E2 = this.f32135a.mo33695E();
            }
        } while (iMo33695E2 == this.f32136b);
        this.f32138d = iMo33695E2;
    }

    /* renamed from: U */
    public final void m35589U(int i) throws ct8 {
        if (this.f32135a.mo33700d() != i) {
            throw ct8.m21773m();
        }
    }

    /* renamed from: V */
    public final void m35590V(int i) throws ct8.C12741a {
        if (fbj.m26426b(this.f32136b) != i) {
            throw ct8.m21767e();
        }
    }

    /* renamed from: W */
    public final void m35591W(int i) throws ct8 {
        if ((i & 3) != 0) {
            throw ct8.m21770h();
        }
    }

    /* renamed from: X */
    public final void m35592X(int i) throws ct8 {
        if ((i & 7) != 0) {
            throw ct8.m21770h();
        }
    }

    @Override // p001o.mce
    /* renamed from: a */
    public long mo35593a() throws ct8.C12741a {
        m35590V(1);
        return this.f32135a.mo33709t();
    }

    @Override // p001o.mce
    /* renamed from: b */
    public int mo35594b() {
        return this.f32136b;
    }

    @Override // p001o.mce
    /* renamed from: c */
    public void mo35595c(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof zk8)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 2) {
                int iMo33696F = this.f32135a.mo33696F();
                m35591W(iMo33696F);
                int iMo33700d = this.f32135a.mo33700d() + iMo33696F;
                do {
                    list.add(Integer.valueOf(this.f32135a.mo33713y()));
                } while (this.f32135a.mo33700d() < iMo33700d);
                return;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            do {
                list.add(Integer.valueOf(this.f32135a.mo33713y()));
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E = this.f32135a.mo33695E();
                }
            } while (iMo33695E == this.f32136b);
            this.f32138d = iMo33695E;
            return;
        }
        zk8 zk8Var = (zk8) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 2) {
            int iMo33696F2 = this.f32135a.mo33696F();
            m35591W(iMo33696F2);
            int iMo33700d2 = this.f32135a.mo33700d() + iMo33696F2;
            do {
                zk8Var.R1(this.f32135a.mo33713y());
            } while (this.f32135a.mo33700d() < iMo33700d2);
            return;
        }
        if (iM26426b2 != 5) {
            throw ct8.m21767e();
        }
        do {
            zk8Var.R1(this.f32135a.mo33713y());
            if (this.f32135a.mo33701e()) {
                return;
            } else {
                iMo33695E2 = this.f32135a.mo33695E();
            }
        } while (iMo33695E2 == this.f32136b);
        this.f32138d = iMo33695E2;
    }

    @Override // p001o.mce
    /* renamed from: d */
    public void mo35596d(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof dla)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Long.valueOf(this.f32135a.mo33692B()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Long.valueOf(this.f32135a.mo33692B()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        dla dlaVar = (dla) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                dlaVar.Z1(this.f32135a.mo33692B());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            dlaVar.Z1(this.f32135a.mo33692B());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: e */
    public boolean mo35597e() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33704o();
    }

    @Override // p001o.mce
    /* renamed from: f */
    public long mo35598f() throws ct8.C12741a {
        m35590V(1);
        return this.f32135a.mo33714z();
    }

    @Override // p001o.mce
    /* renamed from: g */
    public void mo35599g(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof dla)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Long.valueOf(this.f32135a.mo33697G()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Long.valueOf(this.f32135a.mo33697G()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        dla dlaVar = (dla) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                dlaVar.Z1(this.f32135a.mo33697G());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            dlaVar.Z1(this.f32135a.mo33697G());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: h */
    public int mo35600h() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33696F();
    }

    @Override // p001o.mce
    /* renamed from: i */
    public void mo35601i(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof dla)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Long.valueOf(this.f32135a.mo33712w()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Long.valueOf(this.f32135a.mo33712w()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        dla dlaVar = (dla) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                dlaVar.Z1(this.f32135a.mo33712w());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            dlaVar.Z1(this.f32135a.mo33712w());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: j */
    public void mo35602j(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof zk8)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Integer.valueOf(this.f32135a.mo33707r()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Integer.valueOf(this.f32135a.mo33707r()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        zk8 zk8Var = (zk8) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                zk8Var.R1(this.f32135a.mo33707r());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            zk8Var.R1(this.f32135a.mo33707r());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: k */
    public int mo35603k() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33707r();
    }

    @Override // p001o.mce
    /* renamed from: l */
    public int mo35604l() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33691A();
    }

    @Override // p001o.mce
    /* renamed from: m */
    public void mo35605m(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof dk1)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f32135a.mo33704o()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Boolean.valueOf(this.f32135a.mo33704o()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        dk1 dk1Var = (dk1) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                dk1Var.m23347j(this.f32135a.mo33704o());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            dk1Var.m23347j(this.f32135a.mo33704o());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: n */
    public void mo35606n(List list) throws ct8.C12741a {
        m35588T(list, true);
    }

    @Override // p001o.mce
    /* renamed from: o */
    public xq1 mo35607o() throws ct8.C12741a {
        m35590V(2);
        return this.f32135a.mo33705p();
    }

    @Override // p001o.mce
    /* renamed from: p */
    public int mo35608p() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33711v();
    }

    @Override // p001o.mce
    /* renamed from: q */
    public void mo35609q(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof dla)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 1) {
                do {
                    list.add(Long.valueOf(this.f32135a.mo33709t()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33696F = this.f32135a.mo33696F();
            m35592X(iMo33696F);
            int iMo33700d = this.f32135a.mo33700d() + iMo33696F;
            do {
                list.add(Long.valueOf(this.f32135a.mo33709t()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            return;
        }
        dla dlaVar = (dla) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 1) {
            do {
                dlaVar.Z1(this.f32135a.mo33709t());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33696F2 = this.f32135a.mo33696F();
        m35592X(iMo33696F2);
        int iMo33700d2 = this.f32135a.mo33700d() + iMo33696F2;
        do {
            dlaVar.Z1(this.f32135a.mo33709t());
        } while (this.f32135a.mo33700d() < iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: r */
    public void mo35610r(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof zk8)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Integer.valueOf(this.f32135a.mo33691A()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Integer.valueOf(this.f32135a.mo33691A()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        zk8 zk8Var = (zk8) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                zk8Var.R1(this.f32135a.mo33691A());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            zk8Var.R1(this.f32135a.mo33691A());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    public double readDouble() throws ct8.C12741a {
        m35590V(1);
        return this.f32135a.mo33706q();
    }

    @Override // p001o.mce
    public float readFloat() throws ct8.C12741a {
        m35590V(5);
        return this.f32135a.mo33710u();
    }

    @Override // p001o.mce
    public String readString() throws ct8.C12741a {
        m35590V(2);
        return this.f32135a.mo33693C();
    }

    @Override // p001o.mce
    /* renamed from: s */
    public long mo35611s() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33697G();
    }

    @Override // p001o.mce
    /* renamed from: t */
    public void mo35612t(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof zk8)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Integer.valueOf(this.f32135a.mo33696F()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Integer.valueOf(this.f32135a.mo33696F()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        zk8 zk8Var = (zk8) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                zk8Var.R1(this.f32135a.mo33696F());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            zk8Var.R1(this.f32135a.mo33696F());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: u */
    public int mo35613u() throws ct8.C12741a {
        m35590V(5);
        return this.f32135a.mo33708s();
    }

    @Override // p001o.mce
    /* renamed from: v */
    public void mo35614v(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof dla)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 1) {
                do {
                    list.add(Long.valueOf(this.f32135a.mo33714z()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33696F = this.f32135a.mo33696F();
            m35592X(iMo33696F);
            int iMo33700d = this.f32135a.mo33700d() + iMo33696F;
            do {
                list.add(Long.valueOf(this.f32135a.mo33714z()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            return;
        }
        dla dlaVar = (dla) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 1) {
            do {
                dlaVar.Z1(this.f32135a.mo33714z());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33696F2 = this.f32135a.mo33696F();
        m35592X(iMo33696F2);
        int iMo33700d2 = this.f32135a.mo33700d() + iMo33696F2;
        do {
            dlaVar.Z1(this.f32135a.mo33714z());
        } while (this.f32135a.mo33700d() < iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: w */
    public void mo35615w(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof zk8)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 0) {
                do {
                    list.add(Integer.valueOf(this.f32135a.mo33711v()));
                    if (this.f32135a.mo33701e()) {
                        return;
                    } else {
                        iMo33695E = this.f32135a.mo33695E();
                    }
                } while (iMo33695E == this.f32136b);
                this.f32138d = iMo33695E;
                return;
            }
            if (iM26426b != 2) {
                throw ct8.m21767e();
            }
            int iMo33700d = this.f32135a.mo33700d() + this.f32135a.mo33696F();
            do {
                list.add(Integer.valueOf(this.f32135a.mo33711v()));
            } while (this.f32135a.mo33700d() < iMo33700d);
            m35589U(iMo33700d);
            return;
        }
        zk8 zk8Var = (zk8) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 0) {
            do {
                zk8Var.R1(this.f32135a.mo33711v());
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E2 = this.f32135a.mo33695E();
                }
            } while (iMo33695E2 == this.f32136b);
            this.f32138d = iMo33695E2;
            return;
        }
        if (iM26426b2 != 2) {
            throw ct8.m21767e();
        }
        int iMo33700d2 = this.f32135a.mo33700d() + this.f32135a.mo33696F();
        do {
            zk8Var.R1(this.f32135a.mo33711v());
        } while (this.f32135a.mo33700d() < iMo33700d2);
        m35589U(iMo33700d2);
    }

    @Override // p001o.mce
    /* renamed from: x */
    public void mo35616x(List list) throws ct8 {
        int iMo33695E;
        int iMo33695E2;
        if (!(list instanceof zk8)) {
            int iM26426b = fbj.m26426b(this.f32136b);
            if (iM26426b == 2) {
                int iMo33696F = this.f32135a.mo33696F();
                m35591W(iMo33696F);
                int iMo33700d = this.f32135a.mo33700d() + iMo33696F;
                do {
                    list.add(Integer.valueOf(this.f32135a.mo33708s()));
                } while (this.f32135a.mo33700d() < iMo33700d);
                return;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            do {
                list.add(Integer.valueOf(this.f32135a.mo33708s()));
                if (this.f32135a.mo33701e()) {
                    return;
                } else {
                    iMo33695E = this.f32135a.mo33695E();
                }
            } while (iMo33695E == this.f32136b);
            this.f32138d = iMo33695E;
            return;
        }
        zk8 zk8Var = (zk8) list;
        int iM26426b2 = fbj.m26426b(this.f32136b);
        if (iM26426b2 == 2) {
            int iMo33696F2 = this.f32135a.mo33696F();
            m35591W(iMo33696F2);
            int iMo33700d2 = this.f32135a.mo33700d() + iMo33696F2;
            do {
                zk8Var.R1(this.f32135a.mo33708s());
            } while (this.f32135a.mo33700d() < iMo33700d2);
            return;
        }
        if (iM26426b2 != 5) {
            throw ct8.m21767e();
        }
        do {
            zk8Var.R1(this.f32135a.mo33708s());
            if (this.f32135a.mo33701e()) {
                return;
            } else {
                iMo33695E2 = this.f32135a.mo33695E();
            }
        } while (iMo33695E2 == this.f32136b);
        this.f32138d = iMo33695E2;
    }

    @Override // p001o.mce
    /* renamed from: y */
    public long mo35617y() throws ct8.C12741a {
        m35590V(0);
        return this.f32135a.mo33692B();
    }

    @Override // p001o.mce
    /* renamed from: z */
    public int mo35618z() {
        int i = this.f32138d;
        if (i != 0) {
            this.f32136b = i;
            this.f32138d = 0;
        } else {
            this.f32136b = this.f32135a.mo33695E();
        }
        int i2 = this.f32136b;
        return (i2 == 0 || i2 == this.f32137c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : fbj.m26425a(i2);
    }
}
