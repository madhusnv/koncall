package p001o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p001o.rf1;
import p001o.zt3;

/* loaded from: classes2.dex */
public class dm5 {

    /* renamed from: a */
    public au3 f20222a;

    /* renamed from: d */
    public au3 f20225d;

    /* renamed from: b */
    public boolean f20223b = true;

    /* renamed from: c */
    public boolean f20224c = true;

    /* renamed from: e */
    public ArrayList f20226e = new ArrayList();

    /* renamed from: f */
    public ArrayList f20227f = new ArrayList();

    /* renamed from: g */
    public rf1.InterfaceC16599b f20228g = null;

    /* renamed from: h */
    public rf1.C16598a f20229h = new rf1.C16598a();

    /* renamed from: i */
    public ArrayList f20230i = new ArrayList();

    public dm5(au3 au3Var) {
        this.f20222a = au3Var;
        this.f20225d = au3Var;
    }

    /* renamed from: a */
    public final void m23535a(em5 em5Var, int i, int i2, em5 em5Var2, ArrayList arrayList, ove oveVar) {
        r8j r8jVar = em5Var.f21863d;
        if (r8jVar.f43163c == null) {
            au3 au3Var = this.f20222a;
            if (r8jVar == au3Var.f57645e || r8jVar == au3Var.f57646f) {
                return;
            }
            if (oveVar == null) {
                oveVar = new ove(r8jVar, i2);
                arrayList.add(oveVar);
            }
            r8jVar.f43163c = oveVar;
            oveVar.m42719a(r8jVar);
            for (cm5 cm5Var : r8jVar.f43168h.f21870k) {
                if (cm5Var instanceof em5) {
                    m23535a((em5) cm5Var, i, 0, em5Var2, arrayList, oveVar);
                }
            }
            for (cm5 cm5Var2 : r8jVar.f43169i.f21870k) {
                if (cm5Var2 instanceof em5) {
                    m23535a((em5) cm5Var2, i, 1, em5Var2, arrayList, oveVar);
                }
            }
            if (i == 1 && (r8jVar instanceof bui)) {
                for (cm5 cm5Var3 : ((bui) r8jVar).f16845k.f21870k) {
                    if (cm5Var3 instanceof em5) {
                        m23535a((em5) cm5Var3, i, 2, em5Var2, arrayList, oveVar);
                    }
                }
            }
            for (em5 em5Var3 : r8jVar.f43168h.f21871l) {
                if (em5Var3 == em5Var2) {
                    oveVar.f38971b = true;
                }
                m23535a(em5Var3, i, 0, em5Var2, arrayList, oveVar);
            }
            for (em5 em5Var4 : r8jVar.f43169i.f21871l) {
                if (em5Var4 == em5Var2) {
                    oveVar.f38971b = true;
                }
                m23535a(em5Var4, i, 1, em5Var2, arrayList, oveVar);
            }
            if (i == 1 && (r8jVar instanceof bui)) {
                Iterator it = ((bui) r8jVar).f16845k.f21871l.iterator();
                while (it.hasNext()) {
                    m23535a((em5) it.next(), i, 2, em5Var2, arrayList, oveVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m23536b(au3 au3Var) {
        int iM59846Y;
        zt3.EnumC18702b enumC18702b;
        int iM59866z;
        zt3.EnumC18702b enumC18702b2;
        zt3.EnumC18702b enumC18702b3;
        zt3.EnumC18702b enumC18702b4;
        Iterator it = au3Var.V0.iterator();
        while (it.hasNext()) {
            zt3 zt3Var = (zt3) it.next();
            zt3.EnumC18702b[] enumC18702bArr = zt3Var.b0;
            zt3.EnumC18702b enumC18702b5 = enumC18702bArr[0];
            zt3.EnumC18702b enumC18702b6 = enumC18702bArr[1];
            if (zt3Var.m59845X() == 8) {
                zt3Var.f57641a = true;
            } else {
                if (zt3Var.f57616B < 1.0f && enumC18702b5 == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    zt3Var.f57663w = 2;
                }
                if (zt3Var.f57619E < 1.0f && enumC18702b6 == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    zt3Var.f57664x = 2;
                }
                if (zt3Var.m59864x() > 0.0f) {
                    zt3.EnumC18702b enumC18702b7 = zt3.EnumC18702b.MATCH_CONSTRAINT;
                    if (enumC18702b5 == enumC18702b7 && (enumC18702b6 == zt3.EnumC18702b.WRAP_CONTENT || enumC18702b6 == zt3.EnumC18702b.FIXED)) {
                        zt3Var.f57663w = 3;
                    } else if (enumC18702b6 == enumC18702b7 && (enumC18702b5 == zt3.EnumC18702b.WRAP_CONTENT || enumC18702b5 == zt3.EnumC18702b.FIXED)) {
                        zt3Var.f57664x = 3;
                    } else if (enumC18702b5 == enumC18702b7 && enumC18702b6 == enumC18702b7) {
                        if (zt3Var.f57663w == 0) {
                            zt3Var.f57663w = 3;
                        }
                        if (zt3Var.f57664x == 0) {
                            zt3Var.f57664x = 3;
                        }
                    }
                }
                zt3.EnumC18702b enumC18702b8 = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (enumC18702b5 == enumC18702b8 && zt3Var.f57663w == 1 && (zt3Var.f57631Q.f47687f == null || zt3Var.f57633S.f47687f == null)) {
                    enumC18702b5 = zt3.EnumC18702b.WRAP_CONTENT;
                }
                zt3.EnumC18702b enumC18702b9 = enumC18702b5;
                if (enumC18702b6 == enumC18702b8 && zt3Var.f57664x == 1 && (zt3Var.f57632R.f47687f == null || zt3Var.f57634T.f47687f == null)) {
                    enumC18702b6 = zt3.EnumC18702b.WRAP_CONTENT;
                }
                zt3.EnumC18702b enumC18702b10 = enumC18702b6;
                x08 x08Var = zt3Var.f57645e;
                x08Var.f43164d = enumC18702b9;
                int i = zt3Var.f57663w;
                x08Var.f43161a = i;
                bui buiVar = zt3Var.f57646f;
                buiVar.f43164d = enumC18702b10;
                int i2 = zt3Var.f57664x;
                buiVar.f43161a = i2;
                zt3.EnumC18702b enumC18702b11 = zt3.EnumC18702b.MATCH_PARENT;
                if ((enumC18702b9 == enumC18702b11 || enumC18702b9 == zt3.EnumC18702b.FIXED || enumC18702b9 == zt3.EnumC18702b.WRAP_CONTENT) && (enumC18702b10 == enumC18702b11 || enumC18702b10 == zt3.EnumC18702b.FIXED || enumC18702b10 == zt3.EnumC18702b.WRAP_CONTENT)) {
                    int iM59846Y2 = zt3Var.m59846Y();
                    if (enumC18702b9 == enumC18702b11) {
                        iM59846Y = (au3Var.m59846Y() - zt3Var.f57631Q.f47688g) - zt3Var.f57633S.f47688g;
                        enumC18702b = zt3.EnumC18702b.FIXED;
                    } else {
                        iM59846Y = iM59846Y2;
                        enumC18702b = enumC18702b9;
                    }
                    int iM59866z2 = zt3Var.m59866z();
                    if (enumC18702b10 == enumC18702b11) {
                        iM59866z = (au3Var.m59866z() - zt3Var.f57632R.f47688g) - zt3Var.f57634T.f47688g;
                        enumC18702b2 = zt3.EnumC18702b.FIXED;
                    } else {
                        iM59866z = iM59866z2;
                        enumC18702b2 = enumC18702b10;
                    }
                    m23546l(zt3Var, enumC18702b, iM59846Y, enumC18702b2, iM59866z);
                    zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                    zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                    zt3Var.f57641a = true;
                } else {
                    if (enumC18702b9 == enumC18702b8 && (enumC18702b10 == (enumC18702b4 = zt3.EnumC18702b.WRAP_CONTENT) || enumC18702b10 == zt3.EnumC18702b.FIXED)) {
                        if (i == 3) {
                            if (enumC18702b10 == enumC18702b4) {
                                m23546l(zt3Var, enumC18702b4, 0, enumC18702b4, 0);
                            }
                            int iM59866z3 = zt3Var.m59866z();
                            int i3 = (int) ((iM59866z3 * zt3Var.f0) + 0.5f);
                            zt3.EnumC18702b enumC18702b12 = zt3.EnumC18702b.FIXED;
                            m23546l(zt3Var, enumC18702b12, i3, enumC18702b12, iM59866z3);
                            zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                            zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                            zt3Var.f57641a = true;
                        } else if (i == 1) {
                            m23546l(zt3Var, enumC18702b4, 0, enumC18702b10, 0);
                            zt3Var.f57645e.f43165e.f25783m = zt3Var.m59846Y();
                        } else if (i == 2) {
                            zt3.EnumC18702b enumC18702b13 = au3Var.b0[0];
                            zt3.EnumC18702b enumC18702b14 = zt3.EnumC18702b.FIXED;
                            if (enumC18702b13 == enumC18702b14 || enumC18702b13 == enumC18702b11) {
                                m23546l(zt3Var, enumC18702b14, (int) ((zt3Var.f57616B * au3Var.m59846Y()) + 0.5f), enumC18702b10, zt3Var.m59866z());
                                zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                                zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                                zt3Var.f57641a = true;
                            }
                        } else {
                            tt3[] tt3VarArr = zt3Var.f57639Y;
                            if (tt3VarArr[0].f47687f == null || tt3VarArr[1].f47687f == null) {
                                m23546l(zt3Var, enumC18702b4, 0, enumC18702b10, 0);
                                zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                                zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                                zt3Var.f57641a = true;
                            }
                        }
                    }
                    if (enumC18702b10 == enumC18702b8 && (enumC18702b9 == (enumC18702b3 = zt3.EnumC18702b.WRAP_CONTENT) || enumC18702b9 == zt3.EnumC18702b.FIXED)) {
                        if (i2 == 3) {
                            if (enumC18702b9 == enumC18702b3) {
                                m23546l(zt3Var, enumC18702b3, 0, enumC18702b3, 0);
                            }
                            int iM59846Y3 = zt3Var.m59846Y();
                            float f = zt3Var.f0;
                            if (zt3Var.m59865y() == -1) {
                                f = 1.0f / f;
                            }
                            zt3.EnumC18702b enumC18702b15 = zt3.EnumC18702b.FIXED;
                            m23546l(zt3Var, enumC18702b15, iM59846Y3, enumC18702b15, (int) ((iM59846Y3 * f) + 0.5f));
                            zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                            zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                            zt3Var.f57641a = true;
                        } else if (i2 == 1) {
                            m23546l(zt3Var, enumC18702b9, 0, enumC18702b3, 0);
                            zt3Var.f57646f.f43165e.f25783m = zt3Var.m59866z();
                        } else if (i2 == 2) {
                            zt3.EnumC18702b enumC18702b16 = au3Var.b0[1];
                            zt3.EnumC18702b enumC18702b17 = zt3.EnumC18702b.FIXED;
                            if (enumC18702b16 == enumC18702b17 || enumC18702b16 == enumC18702b11) {
                                m23546l(zt3Var, enumC18702b9, zt3Var.m59846Y(), enumC18702b17, (int) ((zt3Var.f57619E * au3Var.m59866z()) + 0.5f));
                                zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                                zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                                zt3Var.f57641a = true;
                            }
                        } else {
                            tt3[] tt3VarArr2 = zt3Var.f57639Y;
                            if (tt3VarArr2[2].f47687f == null || tt3VarArr2[3].f47687f == null) {
                                m23546l(zt3Var, enumC18702b3, 0, enumC18702b10, 0);
                                zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                                zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                                zt3Var.f57641a = true;
                            }
                        }
                    }
                    if (enumC18702b9 == enumC18702b8 && enumC18702b10 == enumC18702b8) {
                        if (i == 1 || i2 == 1) {
                            zt3.EnumC18702b enumC18702b18 = zt3.EnumC18702b.WRAP_CONTENT;
                            m23546l(zt3Var, enumC18702b18, 0, enumC18702b18, 0);
                            zt3Var.f57645e.f43165e.f25783m = zt3Var.m59846Y();
                            zt3Var.f57646f.f43165e.f25783m = zt3Var.m59866z();
                        } else if (i2 == 2 && i == 2) {
                            zt3.EnumC18702b[] enumC18702bArr2 = au3Var.b0;
                            zt3.EnumC18702b enumC18702b19 = enumC18702bArr2[0];
                            zt3.EnumC18702b enumC18702b20 = zt3.EnumC18702b.FIXED;
                            if (enumC18702b19 == enumC18702b20 && enumC18702bArr2[1] == enumC18702b20) {
                                m23546l(zt3Var, enumC18702b20, (int) ((zt3Var.f57616B * au3Var.m59846Y()) + 0.5f), enumC18702b20, (int) ((zt3Var.f57619E * au3Var.m59866z()) + 0.5f));
                                zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                                zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                                zt3Var.f57641a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m23537c() {
        m23538d(this.f20226e);
        this.f20230i.clear();
        ove.f38969h = 0;
        m23543i(this.f20222a.f57645e, 0, this.f20230i);
        m23543i(this.f20222a.f57646f, 1, this.f20230i);
        this.f20223b = false;
    }

    /* renamed from: d */
    public void m23538d(ArrayList arrayList) {
        arrayList.clear();
        this.f20225d.f57645e.mo19846f();
        this.f20225d.f57646f.mo19846f();
        arrayList.add(this.f20225d.f57645e);
        arrayList.add(this.f20225d.f57646f);
        Iterator it = this.f20225d.V0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            zt3 zt3Var = (zt3) it.next();
            if (zt3Var instanceof rv7) {
                arrayList.add(new sv7(zt3Var));
            } else {
                if (zt3Var.k0()) {
                    if (zt3Var.f57643c == null) {
                        zt3Var.f57643c = new zf2(zt3Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(zt3Var.f57643c);
                } else {
                    arrayList.add(zt3Var.f57645e);
                }
                if (zt3Var.m0()) {
                    if (zt3Var.f57644d == null) {
                        zt3Var.f57644d = new zf2(zt3Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(zt3Var.f57644d);
                } else {
                    arrayList.add(zt3Var.f57646f);
                }
                if (zt3Var instanceof dy7) {
                    arrayList.add(new cy7(zt3Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((r8j) it2.next()).mo19846f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            r8j r8jVar = (r8j) it3.next();
            if (r8jVar.f43162b != this.f20225d) {
                r8jVar.mo19844d();
            }
        }
    }

    /* renamed from: e */
    public final int m23539e(au3 au3Var, int i) {
        int size = this.f20230i.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((ove) this.f20230i.get(i2)).m42720b(au3Var, i));
        }
        return (int) jMax;
    }

    /* renamed from: f */
    public boolean m23540f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f20223b || this.f20224c) {
            Iterator it = this.f20222a.V0.iterator();
            while (it.hasNext()) {
                zt3 zt3Var = (zt3) it.next();
                zt3Var.m59857p();
                zt3Var.f57641a = false;
                zt3Var.f57645e.m55523r();
                zt3Var.f57646f.m19848q();
            }
            this.f20222a.m59857p();
            au3 au3Var = this.f20222a;
            au3Var.f57641a = false;
            au3Var.f57645e.m55523r();
            this.f20222a.f57646f.m19848q();
            this.f20224c = false;
        }
        if (m23536b(this.f20225d)) {
            return false;
        }
        this.f20222a.r1(0);
        this.f20222a.s1(0);
        zt3.EnumC18702b enumC18702bM59863w = this.f20222a.m59863w(0);
        zt3.EnumC18702b enumC18702bM59863w2 = this.f20222a.m59863w(1);
        if (this.f20223b) {
            m23537c();
        }
        int iM59847Z = this.f20222a.m59847Z();
        int iA0 = this.f20222a.a0();
        this.f20222a.f57645e.f43168h.mo25285d(iM59847Z);
        this.f20222a.f57646f.f43168h.mo25285d(iA0);
        m23547m();
        zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.WRAP_CONTENT;
        if (enumC18702bM59863w == enumC18702b || enumC18702bM59863w2 == enumC18702b) {
            if (z4) {
                Iterator it2 = this.f20226e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((r8j) it2.next()).mo19847m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && enumC18702bM59863w == zt3.EnumC18702b.WRAP_CONTENT) {
                this.f20222a.U0(zt3.EnumC18702b.FIXED);
                au3 au3Var2 = this.f20222a;
                au3Var2.p1(m23539e(au3Var2, 0));
                au3 au3Var3 = this.f20222a;
                au3Var3.f57645e.f43165e.mo25285d(au3Var3.m59846Y());
            }
            if (z4 && enumC18702bM59863w2 == zt3.EnumC18702b.WRAP_CONTENT) {
                this.f20222a.l1(zt3.EnumC18702b.FIXED);
                au3 au3Var4 = this.f20222a;
                au3Var4.Q0(m23539e(au3Var4, 1));
                au3 au3Var5 = this.f20222a;
                au3Var5.f57646f.f43165e.mo25285d(au3Var5.m59866z());
            }
        }
        au3 au3Var6 = this.f20222a;
        zt3.EnumC18702b enumC18702b2 = au3Var6.b0[0];
        zt3.EnumC18702b enumC18702b3 = zt3.EnumC18702b.FIXED;
        if (enumC18702b2 == enumC18702b3 || enumC18702b2 == zt3.EnumC18702b.MATCH_PARENT) {
            int iM59846Y = au3Var6.m59846Y() + iM59847Z;
            this.f20222a.f57645e.f43169i.mo25285d(iM59846Y);
            this.f20222a.f57645e.f43165e.mo25285d(iM59846Y - iM59847Z);
            m23547m();
            au3 au3Var7 = this.f20222a;
            zt3.EnumC18702b enumC18702b4 = au3Var7.b0[1];
            if (enumC18702b4 == enumC18702b3 || enumC18702b4 == zt3.EnumC18702b.MATCH_PARENT) {
                int iM59866z = au3Var7.m59866z() + iA0;
                this.f20222a.f57646f.f43169i.mo25285d(iM59866z);
                this.f20222a.f57646f.f43165e.mo25285d(iM59866z - iA0);
            }
            m23547m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = this.f20226e.iterator();
        while (it3.hasNext()) {
            r8j r8jVar = (r8j) it3.next();
            if (r8jVar.f43162b != this.f20222a || r8jVar.f43167g) {
                r8jVar.mo19845e();
            }
        }
        Iterator it4 = this.f20226e.iterator();
        while (it4.hasNext()) {
            r8j r8jVar2 = (r8j) it4.next();
            if (z2 || r8jVar2.f43162b != this.f20222a) {
                if (!r8jVar2.f43168h.f21869j || ((!r8jVar2.f43169i.f21869j && !(r8jVar2 instanceof sv7)) || (!r8jVar2.f43165e.f21869j && !(r8jVar2 instanceof zf2) && !(r8jVar2 instanceof sv7)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f20222a.U0(enumC18702bM59863w);
        this.f20222a.l1(enumC18702bM59863w2);
        return z3;
    }

    /* renamed from: g */
    public boolean m23541g(boolean z) {
        if (this.f20223b) {
            Iterator it = this.f20222a.V0.iterator();
            while (it.hasNext()) {
                zt3 zt3Var = (zt3) it.next();
                zt3Var.m59857p();
                zt3Var.f57641a = false;
                x08 x08Var = zt3Var.f57645e;
                x08Var.f43165e.f21869j = false;
                x08Var.f43167g = false;
                x08Var.m55523r();
                bui buiVar = zt3Var.f57646f;
                buiVar.f43165e.f21869j = false;
                buiVar.f43167g = false;
                buiVar.m19848q();
            }
            this.f20222a.m59857p();
            au3 au3Var = this.f20222a;
            au3Var.f57641a = false;
            x08 x08Var2 = au3Var.f57645e;
            x08Var2.f43165e.f21869j = false;
            x08Var2.f43167g = false;
            x08Var2.m55523r();
            bui buiVar2 = this.f20222a.f57646f;
            buiVar2.f43165e.f21869j = false;
            buiVar2.f43167g = false;
            buiVar2.m19848q();
            m23537c();
        }
        if (m23536b(this.f20225d)) {
            return false;
        }
        this.f20222a.r1(0);
        this.f20222a.s1(0);
        this.f20222a.f57645e.f43168h.mo25285d(0);
        this.f20222a.f57646f.f43168h.mo25285d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m23542h(boolean z, int i) {
        boolean z2;
        zt3.EnumC18702b enumC18702b;
        boolean z3 = true;
        boolean z4 = z & true;
        zt3.EnumC18702b enumC18702bM59863w = this.f20222a.m59863w(0);
        zt3.EnumC18702b enumC18702bM59863w2 = this.f20222a.m59863w(1);
        int iM59847Z = this.f20222a.m59847Z();
        int iA0 = this.f20222a.a0();
        if (z4 && (enumC18702bM59863w == (enumC18702b = zt3.EnumC18702b.WRAP_CONTENT) || enumC18702bM59863w2 == enumC18702b)) {
            Iterator it = this.f20226e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r8j r8jVar = (r8j) it.next();
                if (r8jVar.f43166f == i && !r8jVar.mo19847m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && enumC18702bM59863w == zt3.EnumC18702b.WRAP_CONTENT) {
                    this.f20222a.U0(zt3.EnumC18702b.FIXED);
                    au3 au3Var = this.f20222a;
                    au3Var.p1(m23539e(au3Var, 0));
                    au3 au3Var2 = this.f20222a;
                    au3Var2.f57645e.f43165e.mo25285d(au3Var2.m59846Y());
                }
            } else if (z4 && enumC18702bM59863w2 == zt3.EnumC18702b.WRAP_CONTENT) {
                this.f20222a.l1(zt3.EnumC18702b.FIXED);
                au3 au3Var3 = this.f20222a;
                au3Var3.Q0(m23539e(au3Var3, 1));
                au3 au3Var4 = this.f20222a;
                au3Var4.f57646f.f43165e.mo25285d(au3Var4.m59866z());
            }
        }
        if (i == 0) {
            au3 au3Var5 = this.f20222a;
            zt3.EnumC18702b enumC18702b2 = au3Var5.b0[0];
            if (enumC18702b2 == zt3.EnumC18702b.FIXED || enumC18702b2 == zt3.EnumC18702b.MATCH_PARENT) {
                int iM59846Y = au3Var5.m59846Y() + iM59847Z;
                this.f20222a.f57645e.f43169i.mo25285d(iM59846Y);
                this.f20222a.f57645e.f43165e.mo25285d(iM59846Y - iM59847Z);
                z2 = true;
            }
            z2 = false;
        } else {
            au3 au3Var6 = this.f20222a;
            zt3.EnumC18702b enumC18702b3 = au3Var6.b0[1];
            if (enumC18702b3 == zt3.EnumC18702b.FIXED || enumC18702b3 == zt3.EnumC18702b.MATCH_PARENT) {
                int iM59866z = au3Var6.m59866z() + iA0;
                this.f20222a.f57646f.f43169i.mo25285d(iM59866z);
                this.f20222a.f57646f.f43165e.mo25285d(iM59866z - iA0);
                z2 = true;
            }
            z2 = false;
        }
        m23547m();
        Iterator it2 = this.f20226e.iterator();
        while (it2.hasNext()) {
            r8j r8jVar2 = (r8j) it2.next();
            if (r8jVar2.f43166f == i && (r8jVar2.f43162b != this.f20222a || r8jVar2.f43167g)) {
                r8jVar2.mo19845e();
            }
        }
        Iterator it3 = this.f20226e.iterator();
        while (it3.hasNext()) {
            r8j r8jVar3 = (r8j) it3.next();
            if (r8jVar3.f43166f == i && (z2 || r8jVar3.f43162b != this.f20222a)) {
                if (!r8jVar3.f43168h.f21869j || !r8jVar3.f43169i.f21869j || (!(r8jVar3 instanceof zf2) && !r8jVar3.f43165e.f21869j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f20222a.U0(enumC18702bM59863w);
        this.f20222a.l1(enumC18702bM59863w2);
        return z3;
    }

    /* renamed from: i */
    public final void m23543i(r8j r8jVar, int i, ArrayList arrayList) {
        for (cm5 cm5Var : r8jVar.f43168h.f21870k) {
            if (cm5Var instanceof em5) {
                m23535a((em5) cm5Var, i, 0, r8jVar.f43169i, arrayList, null);
            } else if (cm5Var instanceof r8j) {
                m23535a(((r8j) cm5Var).f43168h, i, 0, r8jVar.f43169i, arrayList, null);
            }
        }
        for (cm5 cm5Var2 : r8jVar.f43169i.f21870k) {
            if (cm5Var2 instanceof em5) {
                m23535a((em5) cm5Var2, i, 1, r8jVar.f43168h, arrayList, null);
            } else if (cm5Var2 instanceof r8j) {
                m23535a(((r8j) cm5Var2).f43169i, i, 1, r8jVar.f43168h, arrayList, null);
            }
        }
        if (i == 1) {
            for (cm5 cm5Var3 : ((bui) r8jVar).f16845k.f21870k) {
                if (cm5Var3 instanceof em5) {
                    m23535a((em5) cm5Var3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: j */
    public void m23544j() {
        this.f20223b = true;
    }

    /* renamed from: k */
    public void m23545k() {
        this.f20224c = true;
    }

    /* renamed from: l */
    public final void m23546l(zt3 zt3Var, zt3.EnumC18702b enumC18702b, int i, zt3.EnumC18702b enumC18702b2, int i2) {
        rf1.C16598a c16598a = this.f20229h;
        c16598a.f43470a = enumC18702b;
        c16598a.f43471b = enumC18702b2;
        c16598a.f43472c = i;
        c16598a.f43473d = i2;
        this.f20228g.mo5626b(zt3Var, c16598a);
        zt3Var.p1(this.f20229h.f43474e);
        zt3Var.Q0(this.f20229h.f43475f);
        zt3Var.P0(this.f20229h.f43477h);
        zt3Var.F0(this.f20229h.f43476g);
    }

    /* renamed from: m */
    public void m23547m() {
        gt5 gt5Var;
        Iterator it = this.f20222a.V0.iterator();
        while (it.hasNext()) {
            zt3 zt3Var = (zt3) it.next();
            if (!zt3Var.f57641a) {
                zt3.EnumC18702b[] enumC18702bArr = zt3Var.b0;
                boolean z = false;
                zt3.EnumC18702b enumC18702b = enumC18702bArr[0];
                zt3.EnumC18702b enumC18702b2 = enumC18702bArr[1];
                int i = zt3Var.f57663w;
                int i2 = zt3Var.f57664x;
                zt3.EnumC18702b enumC18702b3 = zt3.EnumC18702b.WRAP_CONTENT;
                boolean z2 = enumC18702b == enumC18702b3 || (enumC18702b == zt3.EnumC18702b.MATCH_CONSTRAINT && i == 1);
                if (enumC18702b2 == enumC18702b3 || (enumC18702b2 == zt3.EnumC18702b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                gt5 gt5Var2 = zt3Var.f57645e.f43165e;
                boolean z3 = gt5Var2.f21869j;
                gt5 gt5Var3 = zt3Var.f57646f.f43165e;
                boolean z4 = gt5Var3.f21869j;
                if (z3 && z4) {
                    zt3.EnumC18702b enumC18702b4 = zt3.EnumC18702b.FIXED;
                    m23546l(zt3Var, enumC18702b4, gt5Var2.f21866g, enumC18702b4, gt5Var3.f21866g);
                    zt3Var.f57641a = true;
                } else if (z3 && z) {
                    m23546l(zt3Var, zt3.EnumC18702b.FIXED, gt5Var2.f21866g, enumC18702b3, gt5Var3.f21866g);
                    if (enumC18702b2 == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                        zt3Var.f57646f.f43165e.f25783m = zt3Var.m59866z();
                    } else {
                        zt3Var.f57646f.f43165e.mo25285d(zt3Var.m59866z());
                        zt3Var.f57641a = true;
                    }
                } else if (z4 && z2) {
                    m23546l(zt3Var, enumC18702b3, gt5Var2.f21866g, zt3.EnumC18702b.FIXED, gt5Var3.f21866g);
                    if (enumC18702b == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                        zt3Var.f57645e.f43165e.f25783m = zt3Var.m59846Y();
                    } else {
                        zt3Var.f57645e.f43165e.mo25285d(zt3Var.m59846Y());
                        zt3Var.f57641a = true;
                    }
                }
                if (zt3Var.f57641a && (gt5Var = zt3Var.f57646f.f16846l) != null) {
                    gt5Var.mo25285d(zt3Var.m59858r());
                }
            }
        }
    }

    /* renamed from: n */
    public void m23548n(rf1.InterfaceC16599b interfaceC16599b) {
        this.f20228g = interfaceC16599b;
    }
}
