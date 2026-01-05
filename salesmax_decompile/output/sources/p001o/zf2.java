package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import p001o.zt3;

/* loaded from: classes2.dex */
public class zf2 extends r8j {

    /* renamed from: k */
    public ArrayList f57119k;

    /* renamed from: l */
    public int f57120l;

    public zf2(zt3 zt3Var, int i) {
        super(zt3Var);
        this.f57119k = new ArrayList();
        this.f43166f = i;
        m59368q();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // p001o.r8j, p001o.cm5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo19843a(cm5 cm5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f43168h.f21869j && this.f43169i.f21869j) {
            zt3 zt3VarM59835M = this.f43162b.m59835M();
            boolean zV1 = zt3VarM59835M instanceof au3 ? ((au3) zt3VarM59835M).V1() : false;
            int i17 = this.f43169i.f21866g - this.f43168h.f21866g;
            int size = this.f57119k.size();
            int i18 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i18 >= size) {
                    i18 = -1;
                    break;
                } else if (((r8j) this.f57119k.get(i18)).f43162b.m59845X() != 8) {
                    break;
                } else {
                    i18++;
                }
            }
            int i19 = size - 1;
            int i20 = i19;
            while (true) {
                if (i20 < 0) {
                    break;
                }
                if (((r8j) this.f57119k.get(i20)).f43162b.m59845X() != 8) {
                    i = i20;
                    break;
                }
                i20--;
            }
            int i21 = 0;
            while (i21 < 2) {
                int i22 = 0;
                i4 = 0;
                i5 = 0;
                int i23 = 0;
                f = 0.0f;
                while (i22 < size) {
                    r8j r8jVar = (r8j) this.f57119k.get(i22);
                    if (r8jVar.f43162b.m59845X() != i2) {
                        i23++;
                        if (i22 > 0 && i22 >= i18) {
                            i4 += r8jVar.f43168h.f21865f;
                        }
                        gt5 gt5Var = r8jVar.f43165e;
                        int i24 = gt5Var.f21866g;
                        boolean z3 = r8jVar.f43164d != zt3.EnumC18702b.MATCH_CONSTRAINT;
                        if (z3) {
                            int i25 = this.f43166f;
                            if (i25 == 0 && !r8jVar.f43162b.f57645e.f43165e.f21869j) {
                                return;
                            }
                            if (i25 == 1 && !r8jVar.f43162b.f57646f.f43165e.f21869j) {
                                return;
                            } else {
                                i15 = i24;
                            }
                        } else {
                            i15 = i24;
                            if (r8jVar.f43161a == 1 && i21 == 0) {
                                i16 = gt5Var.f25783m;
                                i5++;
                            } else if (gt5Var.f21869j) {
                                i16 = i15;
                            }
                            z3 = true;
                            if (z3) {
                                i5++;
                                float f3 = r8jVar.f43162b.N0[this.f43166f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i4 += i16;
                            }
                            if (i22 >= i19 && i22 < i) {
                                i4 += -r8jVar.f43169i.f21865f;
                            }
                        }
                        i16 = i15;
                        if (z3) {
                        }
                        if (i22 >= i19) {
                        }
                    }
                    i22++;
                    i2 = 8;
                }
                if (i4 < i17 || i5 == 0) {
                    i3 = i23;
                    break;
                } else {
                    i21++;
                    i2 = 8;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i26 = this.f43168h.f21866g;
            if (zV1) {
                i26 = this.f43169i.f21866g;
            }
            if (i4 > i17) {
                i26 = zV1 ? i26 + ((int) (((i4 - i17) / 2.0f) + 0.5f)) : i26 - ((int) (((i4 - i17) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f4 = i17 - i4;
                int i27 = (int) ((f4 / i5) + 0.5f);
                int i28 = 0;
                int i29 = 0;
                while (i28 < size) {
                    r8j r8jVar2 = (r8j) this.f57119k.get(i28);
                    int i30 = i27;
                    int i31 = i4;
                    if (r8jVar2.f43162b.m59845X() != 8 && r8jVar2.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                        gt5 gt5Var2 = r8jVar2.f43165e;
                        if (gt5Var2.f21869j) {
                            z2 = zV1;
                            i10 = i3;
                            i11 = i26;
                            f2 = f4;
                        } else {
                            if (f > 0.0f) {
                                i11 = i26;
                                i12 = (int) (((r8jVar2.f43162b.N0[this.f43166f] * f4) / f) + 0.5f);
                            } else {
                                i11 = i26;
                                i12 = i30;
                            }
                            if (this.f43166f == 0) {
                                zt3 zt3Var = r8jVar2.f43162b;
                                f2 = f4;
                                i14 = zt3Var.f57615A;
                                i13 = zt3Var.f57666z;
                                z2 = zV1;
                            } else {
                                f2 = f4;
                                zt3 zt3Var2 = r8jVar2.f43162b;
                                int i32 = zt3Var2.f57618D;
                                z2 = zV1;
                                i13 = zt3Var2.f57617C;
                                i14 = i32;
                            }
                            i10 = i3;
                            int iMax = Math.max(i13, r8jVar2.f43161a == 1 ? Math.min(i12, gt5Var2.f25783m) : i12);
                            if (i14 > 0) {
                                iMax = Math.min(i14, iMax);
                            }
                            if (iMax != i12) {
                                i29++;
                                i12 = iMax;
                            }
                            r8jVar2.f43165e.mo25285d(i12);
                        }
                    }
                    i28++;
                    i27 = i30;
                    i4 = i31;
                    i26 = i11;
                    f4 = f2;
                    zV1 = z2;
                    i3 = i10;
                }
                z = zV1;
                i6 = i3;
                i7 = i26;
                int i33 = i4;
                if (i29 > 0) {
                    i5 -= i29;
                    int i34 = 0;
                    for (int i35 = 0; i35 < size; i35++) {
                        r8j r8jVar3 = (r8j) this.f57119k.get(i35);
                        if (r8jVar3.f43162b.m59845X() != 8) {
                            if (i35 > 0 && i35 >= i18) {
                                i34 += r8jVar3.f43168h.f21865f;
                            }
                            i34 += r8jVar3.f43165e.f21866g;
                            if (i35 < i19 && i35 < i) {
                                i34 += -r8jVar3.f43169i.f21865f;
                            }
                        }
                    }
                    i4 = i34;
                } else {
                    i4 = i33;
                }
                i9 = 2;
                if (this.f57120l == 2 && i29 == 0) {
                    i8 = 0;
                    this.f57120l = 0;
                } else {
                    i8 = 0;
                }
            } else {
                z = zV1;
                i6 = i3;
                i7 = i26;
                i8 = 0;
                i9 = 2;
            }
            if (i4 > i17) {
                this.f57120l = i9;
            }
            if (i6 > 0 && i5 == 0 && i18 == i) {
                this.f57120l = i9;
            }
            int i36 = this.f57120l;
            if (i36 == 1) {
                int i37 = i6;
                int i38 = i37 > 1 ? (i17 - i4) / (i37 - 1) : i37 == 1 ? (i17 - i4) / 2 : i8;
                if (i5 > 0) {
                    i38 = i8;
                }
                int i39 = i7;
                for (int i40 = i8; i40 < size; i40++) {
                    r8j r8jVar4 = (r8j) this.f57119k.get(z ? size - (i40 + 1) : i40);
                    if (r8jVar4.f43162b.m59845X() == 8) {
                        r8jVar4.f43168h.mo25285d(i39);
                        r8jVar4.f43169i.mo25285d(i39);
                    } else {
                        if (i40 > 0) {
                            i39 = z ? i39 - i38 : i39 + i38;
                        }
                        if (i40 > 0 && i40 >= i18) {
                            i39 = z ? i39 - r8jVar4.f43168h.f21865f : i39 + r8jVar4.f43168h.f21865f;
                        }
                        if (z) {
                            r8jVar4.f43169i.mo25285d(i39);
                        } else {
                            r8jVar4.f43168h.mo25285d(i39);
                        }
                        gt5 gt5Var3 = r8jVar4.f43165e;
                        int i41 = gt5Var3.f21866g;
                        if (r8jVar4.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT && r8jVar4.f43161a == 1) {
                            i41 = gt5Var3.f25783m;
                        }
                        i39 = z ? i39 - i41 : i39 + i41;
                        if (z) {
                            r8jVar4.f43168h.mo25285d(i39);
                        } else {
                            r8jVar4.f43169i.mo25285d(i39);
                        }
                        r8jVar4.f43167g = true;
                        if (i40 < i19 && i40 < i) {
                            i39 = z ? i39 - (-r8jVar4.f43169i.f21865f) : i39 + (-r8jVar4.f43169i.f21865f);
                        }
                    }
                }
                return;
            }
            int i42 = i6;
            if (i36 == 0) {
                int i43 = (i17 - i4) / (i42 + 1);
                if (i5 > 0) {
                    i43 = i8;
                }
                int i44 = i7;
                for (int i45 = i8; i45 < size; i45++) {
                    r8j r8jVar5 = (r8j) this.f57119k.get(z ? size - (i45 + 1) : i45);
                    if (r8jVar5.f43162b.m59845X() == 8) {
                        r8jVar5.f43168h.mo25285d(i44);
                        r8jVar5.f43169i.mo25285d(i44);
                    } else {
                        int i46 = z ? i44 - i43 : i44 + i43;
                        if (i45 > 0 && i45 >= i18) {
                            i46 = z ? i46 - r8jVar5.f43168h.f21865f : i46 + r8jVar5.f43168h.f21865f;
                        }
                        if (z) {
                            r8jVar5.f43169i.mo25285d(i46);
                        } else {
                            r8jVar5.f43168h.mo25285d(i46);
                        }
                        gt5 gt5Var4 = r8jVar5.f43165e;
                        int iMin = gt5Var4.f21866g;
                        if (r8jVar5.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT && r8jVar5.f43161a == 1) {
                            iMin = Math.min(iMin, gt5Var4.f25783m);
                        }
                        i44 = z ? i46 - iMin : i46 + iMin;
                        if (z) {
                            r8jVar5.f43168h.mo25285d(i44);
                        } else {
                            r8jVar5.f43169i.mo25285d(i44);
                        }
                        if (i45 < i19 && i45 < i) {
                            i44 = z ? i44 - (-r8jVar5.f43169i.f21865f) : i44 + (-r8jVar5.f43169i.f21865f);
                        }
                    }
                }
                return;
            }
            if (i36 == 2) {
                float fM59823A = this.f43166f == 0 ? this.f43162b.m59823A() : this.f43162b.m59841T();
                if (z) {
                    fM59823A = 1.0f - fM59823A;
                }
                int i47 = (int) (((i17 - i4) * fM59823A) + 0.5f);
                if (i47 < 0 || i5 > 0) {
                    i47 = i8;
                }
                int i48 = z ? i7 - i47 : i7 + i47;
                for (int i49 = i8; i49 < size; i49++) {
                    r8j r8jVar6 = (r8j) this.f57119k.get(z ? size - (i49 + 1) : i49);
                    if (r8jVar6.f43162b.m59845X() == 8) {
                        r8jVar6.f43168h.mo25285d(i48);
                        r8jVar6.f43169i.mo25285d(i48);
                    } else {
                        if (i49 > 0 && i49 >= i18) {
                            i48 = z ? i48 - r8jVar6.f43168h.f21865f : i48 + r8jVar6.f43168h.f21865f;
                        }
                        if (z) {
                            r8jVar6.f43169i.mo25285d(i48);
                        } else {
                            r8jVar6.f43168h.mo25285d(i48);
                        }
                        gt5 gt5Var5 = r8jVar6.f43165e;
                        int i50 = gt5Var5.f21866g;
                        if (r8jVar6.f43164d == zt3.EnumC18702b.MATCH_CONSTRAINT && r8jVar6.f43161a == 1) {
                            i50 = gt5Var5.f25783m;
                        }
                        i48 = z ? i48 - i50 : i48 + i50;
                        if (z) {
                            r8jVar6.f43168h.mo25285d(i48);
                        } else {
                            r8jVar6.f43169i.mo25285d(i48);
                        }
                        if (i49 < i19 && i49 < i) {
                            i48 = z ? i48 - (-r8jVar6.f43169i.f21865f) : i48 + (-r8jVar6.f43169i.f21865f);
                        }
                    }
                }
            }
        }
    }

    @Override // p001o.r8j
    /* renamed from: d */
    public void mo19844d() {
        Iterator it = this.f57119k.iterator();
        while (it.hasNext()) {
            ((r8j) it.next()).mo19844d();
        }
        int size = this.f57119k.size();
        if (size < 1) {
            return;
        }
        zt3 zt3Var = ((r8j) this.f57119k.get(0)).f43162b;
        zt3 zt3Var2 = ((r8j) this.f57119k.get(size - 1)).f43162b;
        if (this.f43166f == 0) {
            tt3 tt3Var = zt3Var.f57631Q;
            tt3 tt3Var2 = zt3Var2.f57633S;
            em5 em5VarM46357i = m46357i(tt3Var, 0);
            int iM50473f = tt3Var.m50473f();
            zt3 zt3VarM59369r = m59369r();
            if (zt3VarM59369r != null) {
                iM50473f = zt3VarM59369r.f57631Q.m50473f();
            }
            if (em5VarM46357i != null) {
                m46353b(this.f43168h, em5VarM46357i, iM50473f);
            }
            em5 em5VarM46357i2 = m46357i(tt3Var2, 0);
            int iM50473f2 = tt3Var2.m50473f();
            zt3 zt3VarM59370s = m59370s();
            if (zt3VarM59370s != null) {
                iM50473f2 = zt3VarM59370s.f57633S.m50473f();
            }
            if (em5VarM46357i2 != null) {
                m46353b(this.f43169i, em5VarM46357i2, -iM50473f2);
            }
        } else {
            tt3 tt3Var3 = zt3Var.f57632R;
            tt3 tt3Var4 = zt3Var2.f57634T;
            em5 em5VarM46357i3 = m46357i(tt3Var3, 1);
            int iM50473f3 = tt3Var3.m50473f();
            zt3 zt3VarM59369r2 = m59369r();
            if (zt3VarM59369r2 != null) {
                iM50473f3 = zt3VarM59369r2.f57632R.m50473f();
            }
            if (em5VarM46357i3 != null) {
                m46353b(this.f43168h, em5VarM46357i3, iM50473f3);
            }
            em5 em5VarM46357i4 = m46357i(tt3Var4, 1);
            int iM50473f4 = tt3Var4.m50473f();
            zt3 zt3VarM59370s2 = m59370s();
            if (zt3VarM59370s2 != null) {
                iM50473f4 = zt3VarM59370s2.f57634T.m50473f();
            }
            if (em5VarM46357i4 != null) {
                m46353b(this.f43169i, em5VarM46357i4, -iM50473f4);
            }
        }
        this.f43168h.f21860a = this;
        this.f43169i.f21860a = this;
    }

    @Override // p001o.r8j
    /* renamed from: e */
    public void mo19845e() {
        for (int i = 0; i < this.f57119k.size(); i++) {
            ((r8j) this.f57119k.get(i)).mo19845e();
        }
    }

    @Override // p001o.r8j
    /* renamed from: f */
    public void mo19846f() {
        this.f43163c = null;
        Iterator it = this.f57119k.iterator();
        while (it.hasNext()) {
            ((r8j) it.next()).mo19846f();
        }
    }

    @Override // p001o.r8j
    /* renamed from: j */
    public long mo46358j() {
        int size = this.f57119k.size();
        long jMo46358j = 0;
        for (int i = 0; i < size; i++) {
            jMo46358j = jMo46358j + r4.f43168h.f21865f + ((r8j) this.f57119k.get(i)).mo46358j() + r4.f43169i.f21865f;
        }
        return jMo46358j;
    }

    @Override // p001o.r8j
    /* renamed from: m */
    public boolean mo19847m() {
        int size = this.f57119k.size();
        for (int i = 0; i < size; i++) {
            if (!((r8j) this.f57119k.get(i)).mo19847m()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void m59368q() {
        zt3 zt3Var;
        zt3 zt3Var2 = this.f43162b;
        zt3 zt3VarM59836N = zt3Var2.m59836N(this.f43166f);
        while (true) {
            zt3 zt3Var3 = zt3VarM59836N;
            zt3Var = zt3Var2;
            zt3Var2 = zt3Var3;
            if (zt3Var2 == null) {
                break;
            } else {
                zt3VarM59836N = zt3Var2.m59836N(this.f43166f);
            }
        }
        this.f43162b = zt3Var;
        this.f57119k.add(zt3Var.m59838P(this.f43166f));
        zt3 zt3VarM59834L = zt3Var.m59834L(this.f43166f);
        while (zt3VarM59834L != null) {
            this.f57119k.add(zt3VarM59834L.m59838P(this.f43166f));
            zt3VarM59834L = zt3VarM59834L.m59834L(this.f43166f);
        }
        Iterator it = this.f57119k.iterator();
        while (it.hasNext()) {
            r8j r8jVar = (r8j) it.next();
            int i = this.f43166f;
            if (i == 0) {
                r8jVar.f43162b.f57643c = this;
            } else if (i == 1) {
                r8jVar.f43162b.f57644d = this;
            }
        }
        if ((this.f43166f == 0 && ((au3) this.f43162b.m59835M()).V1()) && this.f57119k.size() > 1) {
            ArrayList arrayList = this.f57119k;
            this.f43162b = ((r8j) arrayList.get(arrayList.size() - 1)).f43162b;
        }
        this.f57120l = this.f43166f == 0 ? this.f43162b.m59824B() : this.f43162b.m59842U();
    }

    /* renamed from: r */
    public final zt3 m59369r() {
        for (int i = 0; i < this.f57119k.size(); i++) {
            r8j r8jVar = (r8j) this.f57119k.get(i);
            if (r8jVar.f43162b.m59845X() != 8) {
                return r8jVar.f43162b;
            }
        }
        return null;
    }

    /* renamed from: s */
    public final zt3 m59370s() {
        for (int size = this.f57119k.size() - 1; size >= 0; size--) {
            r8j r8jVar = (r8j) this.f57119k.get(size);
            if (r8jVar.f43162b.m59845X() != 8) {
                return r8jVar.f43162b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f43166f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f57119k.iterator();
        while (it.hasNext()) {
            r8j r8jVar = (r8j) it.next();
            sb.append("<");
            sb.append(r8jVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
