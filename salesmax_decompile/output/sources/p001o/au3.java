package p001o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p001o.rf1;
import p001o.zt3;

/* loaded from: classes2.dex */
public class au3 extends o8j {
    public int Y0;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public rf1 W0 = new rf1(this);
    public dm5 X0 = new dm5(this);
    public rf1.InterfaceC16599b Z0 = null;
    public boolean a1 = false;
    public sda b1 = new sda();
    public int g1 = 0;
    public int h1 = 0;
    public yf2[] i1 = new yf2[4];
    public yf2[] j1 = new yf2[4];
    public boolean k1 = false;
    public boolean l1 = false;
    public boolean m1 = false;
    public int n1 = 0;
    public int o1 = 0;
    public int p1 = 257;
    public boolean q1 = false;
    public boolean r1 = false;
    public boolean s1 = false;
    public int t1 = 0;
    public WeakReference u1 = null;
    public WeakReference v1 = null;
    public WeakReference w1 = null;
    public WeakReference x1 = null;
    public HashSet y1 = new HashSet();
    public rf1.C16598a z1 = new rf1.C16598a();

    public static boolean Y1(int i, zt3 zt3Var, rf1.InterfaceC16599b interfaceC16599b, rf1.C16598a c16598a, int i2) {
        int i3;
        int i4;
        if (interfaceC16599b == null) {
            return false;
        }
        if (zt3Var.m59845X() == 8 || (zt3Var instanceof rv7) || (zt3Var instanceof ya1)) {
            c16598a.f43474e = 0;
            c16598a.f43475f = 0;
            return false;
        }
        c16598a.f43470a = zt3Var.m59825C();
        c16598a.f43471b = zt3Var.m59843V();
        c16598a.f43472c = zt3Var.m59846Y();
        c16598a.f43473d = zt3Var.m59866z();
        c16598a.f43478i = false;
        c16598a.f43479j = i2;
        zt3.EnumC18702b enumC18702b = c16598a.f43470a;
        zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.MATCH_CONSTRAINT;
        boolean z = enumC18702b == enumC18702b2;
        boolean z2 = c16598a.f43471b == enumC18702b2;
        boolean z3 = z && zt3Var.f0 > 0.0f;
        boolean z4 = z2 && zt3Var.f0 > 0.0f;
        if (z && zt3Var.c0(0) && zt3Var.f57663w == 0 && !z3) {
            c16598a.f43470a = zt3.EnumC18702b.WRAP_CONTENT;
            if (z2 && zt3Var.f57664x == 0) {
                c16598a.f43470a = zt3.EnumC18702b.FIXED;
            }
            z = false;
        }
        if (z2 && zt3Var.c0(1) && zt3Var.f57664x == 0 && !z4) {
            c16598a.f43471b = zt3.EnumC18702b.WRAP_CONTENT;
            if (z && zt3Var.f57663w == 0) {
                c16598a.f43471b = zt3.EnumC18702b.FIXED;
            }
            z2 = false;
        }
        if (zt3Var.p0()) {
            c16598a.f43470a = zt3.EnumC18702b.FIXED;
            z = false;
        }
        if (zt3Var.q0()) {
            c16598a.f43471b = zt3.EnumC18702b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (zt3Var.f57665y[0] == 4) {
                c16598a.f43470a = zt3.EnumC18702b.FIXED;
            } else if (!z2) {
                zt3.EnumC18702b enumC18702b3 = c16598a.f43471b;
                zt3.EnumC18702b enumC18702b4 = zt3.EnumC18702b.FIXED;
                if (enumC18702b3 == enumC18702b4) {
                    i4 = c16598a.f43473d;
                } else {
                    c16598a.f43470a = zt3.EnumC18702b.WRAP_CONTENT;
                    interfaceC16599b.mo5626b(zt3Var, c16598a);
                    i4 = c16598a.f43475f;
                }
                c16598a.f43470a = enumC18702b4;
                c16598a.f43472c = (int) (zt3Var.m59864x() * i4);
            }
        }
        if (z4) {
            if (zt3Var.f57665y[1] == 4) {
                c16598a.f43471b = zt3.EnumC18702b.FIXED;
            } else if (!z) {
                zt3.EnumC18702b enumC18702b5 = c16598a.f43470a;
                zt3.EnumC18702b enumC18702b6 = zt3.EnumC18702b.FIXED;
                if (enumC18702b5 == enumC18702b6) {
                    i3 = c16598a.f43472c;
                } else {
                    c16598a.f43471b = zt3.EnumC18702b.WRAP_CONTENT;
                    interfaceC16599b.mo5626b(zt3Var, c16598a);
                    i3 = c16598a.f43474e;
                }
                c16598a.f43471b = enumC18702b6;
                if (zt3Var.m59865y() == -1) {
                    c16598a.f43473d = (int) (i3 / zt3Var.m59864x());
                } else {
                    c16598a.f43473d = (int) (zt3Var.m59864x() * i3);
                }
            }
        }
        interfaceC16599b.mo5626b(zt3Var, c16598a);
        zt3Var.p1(c16598a.f43474e);
        zt3Var.Q0(c16598a.f43475f);
        zt3Var.P0(c16598a.f43477h);
        zt3Var.F0(c16598a.f43476g);
        c16598a.f43479j = rf1.C16598a.f43467k;
        return c16598a.f43478i;
    }

    public void A1(zt3 zt3Var, int i) {
        if (i == 0) {
            C1(zt3Var);
        } else if (i == 1) {
            H1(zt3Var);
        }
    }

    public boolean B1(sda sdaVar) {
        boolean zZ1 = Z1(64);
        mo47183g(sdaVar, zZ1);
        int size = this.V0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            zt3 zt3Var = (zt3) this.V0.get(i);
            zt3Var.X0(0, false);
            zt3Var.X0(1, false);
            if (zt3Var instanceof ya1) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                zt3 zt3Var2 = (zt3) this.V0.get(i2);
                if (zt3Var2 instanceof ya1) {
                    ((ya1) zt3Var2).D1();
                }
            }
        }
        this.y1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            zt3 zt3Var3 = (zt3) this.V0.get(i3);
            if (zt3Var3.m59850f()) {
                if (zt3Var3 instanceof x0j) {
                    this.y1.add(zt3Var3);
                } else {
                    zt3Var3.mo47183g(sdaVar, zZ1);
                }
            }
        }
        while (this.y1.size() > 0) {
            int size2 = this.y1.size();
            Iterator it = this.y1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x0j x0jVar = (x0j) ((zt3) it.next());
                if (x0jVar.A1(this.y1)) {
                    x0jVar.mo47183g(sdaVar, zZ1);
                    this.y1.remove(x0jVar);
                    break;
                }
            }
            if (size2 == this.y1.size()) {
                Iterator it2 = this.y1.iterator();
                while (it2.hasNext()) {
                    ((zt3) it2.next()).mo47183g(sdaVar, zZ1);
                }
                this.y1.clear();
            }
        }
        if (sda.f45258s) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                zt3 zt3Var4 = (zt3) this.V0.get(i4);
                if (!zt3Var4.m59850f()) {
                    hashSet.add(zt3Var4);
                }
            }
            m59849e(this, sdaVar, hashSet, m59825C() == zt3.EnumC18702b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                zt3 zt3Var5 = (zt3) it3.next();
                lec.m37038a(this, sdaVar, zt3Var5);
                zt3Var5.mo47183g(sdaVar, zZ1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                zt3 zt3Var6 = (zt3) this.V0.get(i5);
                if (zt3Var6 instanceof au3) {
                    zt3.EnumC18702b[] enumC18702bArr = zt3Var6.b0;
                    zt3.EnumC18702b enumC18702b = enumC18702bArr[0];
                    zt3.EnumC18702b enumC18702b2 = enumC18702bArr[1];
                    zt3.EnumC18702b enumC18702b3 = zt3.EnumC18702b.WRAP_CONTENT;
                    if (enumC18702b == enumC18702b3) {
                        zt3Var6.U0(zt3.EnumC18702b.FIXED);
                    }
                    if (enumC18702b2 == enumC18702b3) {
                        zt3Var6.l1(zt3.EnumC18702b.FIXED);
                    }
                    zt3Var6.mo47183g(sdaVar, zZ1);
                    if (enumC18702b == enumC18702b3) {
                        zt3Var6.U0(enumC18702b);
                    }
                    if (enumC18702b2 == enumC18702b3) {
                        zt3Var6.l1(enumC18702b2);
                    }
                } else {
                    lec.m37038a(this, sdaVar, zt3Var6);
                    if (!zt3Var6.m59850f()) {
                        zt3Var6.mo47183g(sdaVar, zZ1);
                    }
                }
            }
        }
        if (this.g1 > 0) {
            xf2.m56208b(this, sdaVar, null, 0);
        }
        if (this.h1 > 0) {
            xf2.m56208b(this, sdaVar, null, 1);
        }
        return true;
    }

    public final void C1(zt3 zt3Var) {
        int i = this.g1 + 1;
        yf2[] yf2VarArr = this.j1;
        if (i >= yf2VarArr.length) {
            this.j1 = (yf2[]) Arrays.copyOf(yf2VarArr, yf2VarArr.length * 2);
        }
        this.j1[this.g1] = new yf2(zt3Var, 0, V1());
        this.g1++;
    }

    public void D1(tt3 tt3Var) {
        WeakReference weakReference = this.x1;
        if (weakReference == null || weakReference.get() == null || tt3Var.m50472e() > ((tt3) this.x1.get()).m50472e()) {
            this.x1 = new WeakReference(tt3Var);
        }
    }

    public void E1(tt3 tt3Var) {
        WeakReference weakReference = this.v1;
        if (weakReference == null || weakReference.get() == null || tt3Var.m50472e() > ((tt3) this.v1.get()).m50472e()) {
            this.v1 = new WeakReference(tt3Var);
        }
    }

    public final void F1(tt3 tt3Var, fzf fzfVar) {
        this.b1.m48242h(fzfVar, this.b1.m48251q(tt3Var), 0, 5);
    }

    public final void G1(tt3 tt3Var, fzf fzfVar) {
        this.b1.m48242h(this.b1.m48251q(tt3Var), fzfVar, 0, 5);
    }

    public final void H1(zt3 zt3Var) {
        int i = this.h1 + 1;
        yf2[] yf2VarArr = this.i1;
        if (i >= yf2VarArr.length) {
            this.i1 = (yf2[]) Arrays.copyOf(yf2VarArr, yf2VarArr.length * 2);
        }
        this.i1[this.h1] = new yf2(zt3Var, 1, V1());
        this.h1++;
    }

    public void I1(tt3 tt3Var) {
        WeakReference weakReference = this.w1;
        if (weakReference == null || weakReference.get() == null || tt3Var.m50472e() > ((tt3) this.w1.get()).m50472e()) {
            this.w1 = new WeakReference(tt3Var);
        }
    }

    public void J1(tt3 tt3Var) {
        WeakReference weakReference = this.u1;
        if (weakReference == null || weakReference.get() == null || tt3Var.m50472e() > ((tt3) this.u1.get()).m50472e()) {
            this.u1 = new WeakReference(tt3Var);
        }
    }

    public boolean K1(boolean z) {
        return this.X0.m23540f(z);
    }

    public boolean L1(boolean z) {
        return this.X0.m23541g(z);
    }

    public boolean M1(boolean z, int i) {
        return this.X0.m23542h(z, i);
    }

    public void N1(meb mebVar) {
        this.b1.m48255v(mebVar);
    }

    public rf1.InterfaceC16599b O1() {
        return this.Z0;
    }

    public int P1() {
        return this.p1;
    }

    @Override // p001o.zt3
    /* renamed from: Q */
    public void mo17832Q(StringBuilder sb) {
        sb.append(this.f57655o + ":{\n");
        sb.append("  actualWidth:" + this.d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.e0);
        sb.append("\n");
        Iterator it = w1().iterator();
        while (it.hasNext()) {
            ((zt3) it.next()).mo17832Q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public sda Q1() {
        return this.b1;
    }

    public boolean R1() {
        return false;
    }

    public void S1() {
        this.X0.m23544j();
    }

    public void T1() {
        this.X0.m23545k();
    }

    public boolean U1() {
        return this.s1;
    }

    public boolean V1() {
        return this.a1;
    }

    public boolean W1() {
        return this.r1;
    }

    public long X1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.c1 = i8;
        this.d1 = i9;
        return this.W0.m46633d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean Z1(int i) {
        return (this.p1 & i) == i;
    }

    public final void a2() {
        this.g1 = 0;
        this.h1 = 0;
    }

    public void b2(rf1.InterfaceC16599b interfaceC16599b) {
        this.Z0 = interfaceC16599b;
        this.X0.m23548n(interfaceC16599b);
    }

    public void c2(int i) {
        this.p1 = i;
        sda.f45258s = Z1(512);
    }

    public void d2(int i) {
        this.Y0 = i;
    }

    public void e2(boolean z) {
        this.a1 = z;
    }

    public boolean f2(sda sdaVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zZ1 = Z1(64);
        v1(sdaVar, zZ1);
        int size = this.V0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            zt3 zt3Var = (zt3) this.V0.get(i);
            zt3Var.v1(sdaVar, zZ1);
            if (zt3Var.e0()) {
                z = true;
            }
        }
        return z;
    }

    public void g2() {
        this.W0.m46634e(this);
    }

    @Override // p001o.zt3
    public void u1(boolean z, boolean z2) {
        super.u1(z, z2);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((zt3) this.V0.get(i)).u1(z, z2);
        }
    }

    @Override // p001o.o8j, p001o.zt3
    public void v0() {
        this.b1.m48234E();
        this.c1 = 0;
        this.e1 = 0;
        this.d1 = 0;
        this.f1 = 0;
        this.q1 = false;
        super.v0();
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0309 A[PHI: r2 r16
      0x0309: PHI (r2v15 boolean) = (r2v14 boolean), (r2v19 boolean), (r2v19 boolean), (r2v19 boolean) binds: [B:139:0x02ca, B:147:0x02ef, B:148:0x02f1, B:150:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:139:0x02ca, B:147:0x02ef, B:148:0x02f1, B:150:0x02f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p001o.o8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x1() {
        int i;
        int i2;
        boolean z;
        boolean zF2;
        boolean z2;
        ?? r6;
        boolean z3;
        boolean z4;
        int i3;
        zt3.EnumC18702b enumC18702b;
        int i4 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.r1 = false;
        this.s1 = false;
        int size = this.V0.size();
        int iMax = Math.max(0, m59846Y());
        int iMax2 = Math.max(0, m59866z());
        zt3.EnumC18702b[] enumC18702bArr = this.b0;
        zt3.EnumC18702b enumC18702b2 = enumC18702bArr[1];
        zt3.EnumC18702b enumC18702b3 = enumC18702bArr[0];
        if (this.Y0 == 0 && lec.m37039b(this.p1, 1)) {
            ht5.m31107h(this, O1());
            for (int i5 = 0; i5 < size; i5++) {
                zt3 zt3Var = (zt3) this.V0.get(i5);
                if (zt3Var.o0() && !(zt3Var instanceof rv7) && !(zt3Var instanceof ya1) && !(zt3Var instanceof x0j) && !zt3Var.n0()) {
                    zt3.EnumC18702b enumC18702bM59863w = zt3Var.m59863w(0);
                    zt3.EnumC18702b enumC18702bM59863w2 = zt3Var.m59863w(1);
                    zt3.EnumC18702b enumC18702b4 = zt3.EnumC18702b.MATCH_CONSTRAINT;
                    if (!(enumC18702bM59863w == enumC18702b4 && zt3Var.f57663w != 1 && enumC18702bM59863w2 == enumC18702b4 && zt3Var.f57664x != 1)) {
                        Y1(0, zt3Var, this.Z0, new rf1.C16598a(), rf1.C16598a.f43467k);
                    }
                }
            }
        }
        if (size <= 2 || !((enumC18702b3 == (enumC18702b = zt3.EnumC18702b.WRAP_CONTENT) || enumC18702b2 == enumC18702b) && lec.m37039b(this.p1, 1024) && ov7.m42716c(this, O1()))) {
            i = iMax2;
            i2 = iMax;
            z = false;
        } else {
            if (enumC18702b3 == enumC18702b) {
                if (iMax >= m59846Y() || iMax <= 0) {
                    iMax = m59846Y();
                } else {
                    p1(iMax);
                    this.r1 = true;
                }
            }
            if (enumC18702b2 == enumC18702b) {
                if (iMax2 >= m59866z() || iMax2 <= 0) {
                    iMax2 = m59866z();
                } else {
                    Q0(iMax2);
                    this.s1 = true;
                }
            }
            i = iMax2;
            i2 = iMax;
            z = true;
        }
        boolean z5 = Z1(64) || Z1(128);
        sda sdaVar = this.b1;
        sdaVar.f45273i = false;
        sdaVar.f45274j = false;
        if (this.p1 != 0 && z5) {
            sdaVar.f45274j = true;
        }
        ArrayList arrayList = this.V0;
        zt3.EnumC18702b enumC18702bM59825C = m59825C();
        zt3.EnumC18702b enumC18702b5 = zt3.EnumC18702b.WRAP_CONTENT;
        boolean z6 = enumC18702bM59825C == enumC18702b5 || m59843V() == enumC18702b5;
        a2();
        for (int i6 = 0; i6 < size; i6++) {
            zt3 zt3Var2 = (zt3) this.V0.get(i6);
            if (zt3Var2 instanceof o8j) {
                ((o8j) zt3Var2).x1();
            }
        }
        boolean zZ1 = Z1(64);
        boolean z7 = z;
        int i7 = 0;
        boolean zB1 = true;
        while (zB1) {
            int i8 = i7 + 1;
            try {
                this.b1.m48234E();
                a2();
                m59856o(this.b1);
                for (int i9 = i4; i9 < size; i9++) {
                    ((zt3) this.V0.get(i9)).m59856o(this.b1);
                }
                zB1 = B1(this.b1);
                WeakReference weakReference = this.u1;
                if (weakReference != null && weakReference.get() != null) {
                    G1((tt3) this.u1.get(), this.b1.m48251q(this.f57632R));
                    this.u1 = null;
                }
                WeakReference weakReference2 = this.w1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    F1((tt3) this.w1.get(), this.b1.m48251q(this.f57634T));
                    this.w1 = null;
                }
                WeakReference weakReference3 = this.v1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    G1((tt3) this.v1.get(), this.b1.m48251q(this.f57631Q));
                    this.v1 = null;
                }
                WeakReference weakReference4 = this.x1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    F1((tt3) this.x1.get(), this.b1.m48251q(this.f57633S));
                    this.x1 = null;
                }
                if (zB1) {
                    this.b1.m48230A();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (zB1) {
                zF2 = f2(this.b1, lec.f33693a);
            } else {
                v1(this.b1, zZ1);
                for (int i10 = 0; i10 < size; i10++) {
                    ((zt3) this.V0.get(i10)).v1(this.b1, zZ1);
                }
                zF2 = false;
            }
            if (z6 && i8 < 8 && lec.f33693a[2]) {
                int i11 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i11 < size) {
                    zt3 zt3Var3 = (zt3) this.V0.get(i11);
                    iMax4 = Math.max(iMax4, zt3Var3.h0 + zt3Var3.m59846Y());
                    iMax3 = Math.max(iMax3, zt3Var3.i0 + zt3Var3.m59866z());
                    i11++;
                    zF2 = zF2;
                }
                z2 = zF2;
                int iMax5 = Math.max(this.o0, iMax4);
                int iMax6 = Math.max(this.p0, iMax3);
                zt3.EnumC18702b enumC18702b6 = zt3.EnumC18702b.WRAP_CONTENT;
                if (enumC18702b3 == enumC18702b6 && m59846Y() < iMax5) {
                    p1(iMax5);
                    this.b0[0] = enumC18702b6;
                    z7 = true;
                    z2 = true;
                }
                if (enumC18702b2 == enumC18702b6 && m59866z() < iMax6) {
                    Q0(iMax6);
                    this.b0[1] = enumC18702b6;
                    z7 = true;
                    z2 = true;
                }
            } else {
                z2 = zF2;
            }
            int iMax7 = Math.max(this.o0, m59846Y());
            if (iMax7 > m59846Y()) {
                p1(iMax7);
                this.b0[0] = zt3.EnumC18702b.FIXED;
                z7 = true;
                z2 = true;
            }
            int iMax8 = Math.max(this.p0, m59866z());
            if (iMax8 > m59866z()) {
                Q0(iMax8);
                r6 = 1;
                this.b0[1] = zt3.EnumC18702b.FIXED;
                z3 = true;
                z2 = true;
            } else {
                r6 = 1;
                z3 = z7;
            }
            if (!z3) {
                zt3.EnumC18702b enumC18702b7 = this.b0[0];
                zt3.EnumC18702b enumC18702b8 = zt3.EnumC18702b.WRAP_CONTENT;
                if (enumC18702b7 == enumC18702b8 && i2 > 0 && m59846Y() > i2) {
                    this.r1 = r6;
                    this.b0[0] = zt3.EnumC18702b.FIXED;
                    p1(i2);
                    z3 = r6;
                    z2 = z3;
                }
                if (this.b0[r6] != enumC18702b8 || i <= 0 || m59866z() <= i) {
                    z7 = z3;
                    z4 = z2;
                    i3 = 8;
                } else {
                    this.s1 = r6;
                    this.b0[r6] = zt3.EnumC18702b.FIXED;
                    Q0(i);
                    i3 = 8;
                    z4 = true;
                    z7 = true;
                }
            }
            zB1 = i8 > i3 ? false : z4;
            i7 = i8;
            i4 = 0;
        }
        this.V0 = arrayList;
        if (z7) {
            zt3.EnumC18702b[] enumC18702bArr2 = this.b0;
            enumC18702bArr2[0] = enumC18702b3;
            enumC18702bArr2[1] = enumC18702b2;
        }
        z0(this.b1.m48256w());
    }
}
