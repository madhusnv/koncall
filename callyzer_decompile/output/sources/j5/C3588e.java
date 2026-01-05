package j5;

import b6.C0602c;
import c9.C0919n;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Arrays;
import k5.C4010e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j5.e */
/* loaded from: classes.dex */
public final class C3588e {

    /* renamed from: o */
    public static int f19169o = 1000;

    /* renamed from: p */
    public static boolean f19170p = true;

    /* renamed from: b */
    public final C3590g f19172b;

    /* renamed from: e */
    public C3586c[] f19175e;

    /* renamed from: k */
    public final C0919n f19181k;

    /* renamed from: n */
    public C3586c f19184n;

    /* renamed from: a */
    public int f19171a = 0;

    /* renamed from: c */
    public int f19173c = 32;

    /* renamed from: d */
    public int f19174d = 32;

    /* renamed from: f */
    public boolean f19176f = false;

    /* renamed from: g */
    public boolean[] f19177g = new boolean[32];

    /* renamed from: h */
    public int f19178h = 1;

    /* renamed from: i */
    public int f19179i = 0;

    /* renamed from: j */
    public int f19180j = 32;

    /* renamed from: l */
    public C3592i[] f19182l = new C3592i[f19169o];

    /* renamed from: m */
    public int f19183m = 0;

    public C3588e() {
        this.f19175e = null;
        this.f19175e = new C3586c[32];
        m8147q();
        C0919n c0919n = new C0919n();
        c0919n.f5598a = new C0602c((byte) 0, 1);
        c0919n.f5599b = new C0602c((byte) 0, 1);
        c0919n.f5600c = new C0602c((byte) 0, 1);
        c0919n.f5601d = new C3592i[32];
        this.f19181k = c0919n;
        C3590g c3590g = new C3590g(c0919n);
        c3590g.f19187f = new C3592i[128];
        c3590g.f19188g = new C3592i[128];
        c3590g.f19189h = 0;
        c3590g.f19190i = new C3589f(c3590g);
        this.f19172b = c3590g;
        if (f19170p) {
            this.f19184n = new C3587d(c0919n);
        } else {
            this.f19184n = new C3586c(c0919n);
        }
    }

    /* renamed from: m */
    public static int m8131m(Object obj) {
        C3592i c3592i = ((C4010e) obj).f20730g;
        if (c3592i != null) {
            return (int) (c3592i.f19195e + 0.5f);
        }
        return 0;
    }

    /* renamed from: a */
    public final C3592i m8132a(EnumC3591h enumC3591h) {
        C3592i c3592i = (C3592i) ((C0602c) this.f19181k.f5600c).mo1762a();
        if (c3592i == null) {
            c3592i = new C3592i(enumC3591h);
            c3592i.f19199i = enumC3591h;
        } else {
            c3592i.m8153c();
            c3592i.f19199i = enumC3591h;
        }
        int i10 = this.f19183m;
        int i11 = f19169o;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f19169o = i12;
            this.f19182l = (C3592i[]) Arrays.copyOf(this.f19182l, i12);
        }
        C3592i[] c3592iArr = this.f19182l;
        int i13 = this.f19183m;
        this.f19183m = i13 + 1;
        c3592iArr[i13] = c3592i;
        return c3592i;
    }

    /* renamed from: b */
    public final void m8133b(C3592i c3592i, C3592i c3592i2, int i10, float f6, C3592i c3592i3, C3592i c3592i4, int i11, int i12) {
        C3586c c3586cM8142k = m8142k();
        if (c3592i2 == c3592i3) {
            c3586cM8142k.f19167d.mo8113f(c3592i, 1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i4, 1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i2, -2.0f);
        } else if (f6 == 0.5f) {
            c3586cM8142k.f19167d.mo8113f(c3592i, 1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i2, -1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i3, -1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                c3586cM8142k.f19165b = (-i10) + i11;
            }
        } else if (f6 <= DefinitionKt.NO_Float_VALUE) {
            c3586cM8142k.f19167d.mo8113f(c3592i, -1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i2, 1.0f);
            c3586cM8142k.f19165b = i10;
        } else if (f6 >= 1.0f) {
            c3586cM8142k.f19167d.mo8113f(c3592i4, -1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i3, 1.0f);
            c3586cM8142k.f19165b = -i11;
        } else {
            float f10 = 1.0f - f6;
            c3586cM8142k.f19167d.mo8113f(c3592i, f10 * 1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i2, f10 * (-1.0f));
            c3586cM8142k.f19167d.mo8113f(c3592i3, (-1.0f) * f6);
            c3586cM8142k.f19167d.mo8113f(c3592i4, 1.0f * f6);
            if (i10 > 0 || i11 > 0) {
                c3586cM8142k.f19165b = (i11 * f6) + ((-i10) * f10);
            }
        }
        if (i12 != 8) {
            c3586cM8142k.m8123a(this, i12);
        }
        m8134c(c3586cM8142k);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8134c(j5.C3586c r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.C3588e.m8134c(j5.c):void");
    }

    /* renamed from: d */
    public final void m8135d(C3592i c3592i, int i10) {
        int i11 = c3592i.f19193c;
        if (i11 == -1) {
            c3592i.f19195e = i10;
            c3592i.f19196f = true;
            int i12 = c3592i.f19201k;
            for (int i13 = 0; i13 < i12; i13++) {
                c3592i.f19200j[i13].m8129g(c3592i, false);
            }
            c3592i.f19201k = 0;
            return;
        }
        if (i11 == -1) {
            C3586c c3586cM8142k = m8142k();
            c3586cM8142k.f19164a = c3592i;
            float f6 = i10;
            c3592i.f19195e = f6;
            c3586cM8142k.f19165b = f6;
            c3586cM8142k.f19168e = true;
            m8134c(c3586cM8142k);
            return;
        }
        C3586c c3586c = this.f19175e[i11];
        if (c3586c.f19168e) {
            c3586c.f19165b = i10;
            return;
        }
        if (c3586c.f19167d.mo8109b() == 0) {
            c3586c.f19168e = true;
            c3586c.f19165b = i10;
            return;
        }
        C3586c c3586cM8142k2 = m8142k();
        if (i10 < 0) {
            c3586cM8142k2.f19165b = i10 * (-1);
            c3586cM8142k2.f19167d.mo8113f(c3592i, 1.0f);
        } else {
            c3586cM8142k2.f19165b = i10;
            c3586cM8142k2.f19167d.mo8113f(c3592i, -1.0f);
        }
        m8134c(c3586cM8142k2);
    }

    /* renamed from: e */
    public final void m8136e(C3592i c3592i, C3592i c3592i2, int i10, int i11) {
        boolean z6 = false;
        if (i11 == 8 && c3592i2.f19196f && c3592i.f19193c == -1) {
            c3592i.f19195e = c3592i2.f19195e + i10;
            c3592i.f19196f = true;
            int i12 = c3592i.f19201k;
            for (int i13 = 0; i13 < i12; i13++) {
                c3592i.f19200j[i13].m8129g(c3592i, false);
            }
            c3592i.f19201k = 0;
            return;
        }
        C3586c c3586cM8142k = m8142k();
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            c3586cM8142k.f19165b = i10;
        }
        if (z6) {
            c3586cM8142k.f19167d.mo8113f(c3592i, 1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i2, -1.0f);
        } else {
            c3586cM8142k.f19167d.mo8113f(c3592i, -1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592i2, 1.0f);
        }
        if (i11 != 8) {
            c3586cM8142k.m8123a(this, i11);
        }
        m8134c(c3586cM8142k);
    }

    /* renamed from: f */
    public final void m8137f(C3592i c3592i, C3592i c3592i2, int i10, int i11) {
        C3586c c3586cM8142k = m8142k();
        C3592i c3592iM8143l = m8143l();
        c3592iM8143l.f19194d = 0;
        c3586cM8142k.m8124b(c3592i, c3592i2, c3592iM8143l, i10);
        if (i11 != 8) {
            c3586cM8142k.f19167d.mo8113f(m8140i(i11), (int) (c3586cM8142k.f19167d.mo8110c(c3592iM8143l) * (-1.0f)));
        }
        m8134c(c3586cM8142k);
    }

    /* renamed from: g */
    public final void m8138g(C3592i c3592i, C3592i c3592i2, int i10, int i11) {
        C3586c c3586cM8142k = m8142k();
        C3592i c3592iM8143l = m8143l();
        c3592iM8143l.f19194d = 0;
        c3586cM8142k.m8125c(c3592i, c3592i2, c3592iM8143l, i10);
        if (i11 != 8) {
            c3586cM8142k.f19167d.mo8113f(m8140i(i11), (int) (c3586cM8142k.f19167d.mo8110c(c3592iM8143l) * (-1.0f)));
        }
        m8134c(c3586cM8142k);
    }

    /* renamed from: h */
    public final void m8139h(C3586c c3586c) {
        boolean z6 = f19170p;
        C0919n c0919n = this.f19181k;
        if (z6) {
            C3586c c3586c2 = this.f19175e[this.f19179i];
            if (c3586c2 != null) {
                ((C0602c) c0919n.f5598a).m1763b(c3586c2);
            }
        } else {
            C3586c c3586c3 = this.f19175e[this.f19179i];
            if (c3586c3 != null) {
                ((C0602c) c0919n.f5599b).m1763b(c3586c3);
            }
        }
        C3586c[] c3586cArr = this.f19175e;
        int i10 = this.f19179i;
        c3586cArr[i10] = c3586c;
        C3592i c3592i = c3586c.f19164a;
        c3592i.f19193c = i10;
        this.f19179i = i10 + 1;
        c3592i.m8154d(c3586c);
    }

    /* renamed from: i */
    public final C3592i m8140i(int i10) {
        if (this.f19178h + 1 >= this.f19174d) {
            m8144n();
        }
        C3592i c3592iM8132a = m8132a(EnumC3591h.ERROR);
        float[] fArr = c3592iM8132a.f19198h;
        int i11 = this.f19171a + 1;
        this.f19171a = i11;
        this.f19178h++;
        c3592iM8132a.f19192b = i11;
        c3592iM8132a.f19194d = i10;
        ((C3592i[]) this.f19181k.f5601d)[i11] = c3592iM8132a;
        C3590g c3590g = this.f19172b;
        c3590g.f19190i.f19185a = c3592iM8132a;
        Arrays.fill(fArr, DefinitionKt.NO_Float_VALUE);
        fArr[c3592iM8132a.f19194d] = 1.0f;
        c3590g.m8149i(c3592iM8132a);
        return c3592iM8132a;
    }

    /* renamed from: j */
    public final C3592i m8141j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f19178h + 1 >= this.f19174d) {
            m8144n();
        }
        if (!(obj instanceof C4010e)) {
            return null;
        }
        C4010e c4010e = (C4010e) obj;
        C3592i c3592i = c4010e.f20730g;
        if (c3592i == null) {
            c4010e.m8792f();
            c3592i = c4010e.f20730g;
        }
        int i10 = c3592i.f19192b;
        C0919n c0919n = this.f19181k;
        if (i10 != -1 && i10 <= this.f19171a && ((C3592i[]) c0919n.f5601d)[i10] != null) {
            return c3592i;
        }
        if (i10 != -1) {
            c3592i.m8153c();
        }
        int i11 = this.f19171a + 1;
        this.f19171a = i11;
        this.f19178h++;
        c3592i.f19192b = i11;
        c3592i.f19199i = EnumC3591h.UNRESTRICTED;
        ((C3592i[]) c0919n.f5601d)[i11] = c3592i;
        return c3592i;
    }

    /* renamed from: k */
    public final C3586c m8142k() {
        boolean z6 = f19170p;
        C0919n c0919n = this.f19181k;
        if (z6) {
            C3586c c3586c = (C3586c) ((C0602c) c0919n.f5598a).mo1762a();
            if (c3586c == null) {
                return new C3587d(c0919n);
            }
            c3586c.f19164a = null;
            c3586c.f19167d.clear();
            c3586c.f19165b = DefinitionKt.NO_Float_VALUE;
            c3586c.f19168e = false;
            return c3586c;
        }
        C3586c c3586c2 = (C3586c) ((C0602c) c0919n.f5599b).mo1762a();
        if (c3586c2 == null) {
            return new C3586c(c0919n);
        }
        c3586c2.f19164a = null;
        c3586c2.f19167d.clear();
        c3586c2.f19165b = DefinitionKt.NO_Float_VALUE;
        c3586c2.f19168e = false;
        return c3586c2;
    }

    /* renamed from: l */
    public final C3592i m8143l() {
        if (this.f19178h + 1 >= this.f19174d) {
            m8144n();
        }
        C3592i c3592iM8132a = m8132a(EnumC3591h.SLACK);
        int i10 = this.f19171a + 1;
        this.f19171a = i10;
        this.f19178h++;
        c3592iM8132a.f19192b = i10;
        ((C3592i[]) this.f19181k.f5601d)[i10] = c3592iM8132a;
        return c3592iM8132a;
    }

    /* renamed from: n */
    public final void m8144n() {
        int i10 = this.f19173c * 2;
        this.f19173c = i10;
        this.f19175e = (C3586c[]) Arrays.copyOf(this.f19175e, i10);
        C0919n c0919n = this.f19181k;
        c0919n.f5601d = (C3592i[]) Arrays.copyOf((C3592i[]) c0919n.f5601d, this.f19173c);
        int i11 = this.f19173c;
        this.f19177g = new boolean[i11];
        this.f19174d = i11;
        this.f19180j = i11;
    }

    /* renamed from: o */
    public final void m8145o(C3590g c3590g) {
        C0919n c0919n;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f19179i) {
                break;
            }
            C3586c c3586c = this.f19175e[i10];
            if (c3586c.f19164a.f19199i != EnumC3591h.UNRESTRICTED) {
                float f6 = c3586c.f19165b;
                float f10 = DefinitionKt.NO_Float_VALUE;
                if (f6 < DefinitionKt.NO_Float_VALUE) {
                    boolean z6 = false;
                    int i11 = 0;
                    while (!z6) {
                        int i12 = 1;
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            int i17 = this.f19179i;
                            c0919n = this.f19181k;
                            if (i15 >= i17) {
                                break;
                            }
                            C3586c c3586c2 = this.f19175e[i15];
                            if (c3586c2.f19164a.f19199i != EnumC3591h.UNRESTRICTED && !c3586c2.f19168e && c3586c2.f19165b < f10) {
                                int i18 = i12;
                                while (i18 < this.f19178h) {
                                    C3592i c3592i = ((C3592i[]) c0919n.f5601d)[i18];
                                    float fMo8110c = c3586c2.f19167d.mo8110c(c3592i);
                                    if (fMo8110c > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f12 = c3592i.f19197g[i19] / fMo8110c;
                                            if ((f12 < f11 && i19 == i16) || i19 > i16) {
                                                i16 = i19;
                                                f11 = f12;
                                                i13 = i15;
                                                i14 = i18;
                                            }
                                        }
                                    }
                                    i18++;
                                    f10 = DefinitionKt.NO_Float_VALUE;
                                }
                            }
                            i15++;
                            f10 = DefinitionKt.NO_Float_VALUE;
                            i12 = 1;
                        }
                        if (i13 != -1) {
                            C3586c c3586c3 = this.f19175e[i13];
                            c3586c3.f19164a.f19193c = -1;
                            c3586c3.m8128f(((C3592i[]) c0919n.f5601d)[i14]);
                            C3592i c3592i2 = c3586c3.f19164a;
                            c3592i2.f19193c = i13;
                            c3592i2.m8154d(c3586c3);
                        } else {
                            z6 = true;
                        }
                        if (i11 > this.f19178h / 2) {
                            z6 = true;
                        }
                        f10 = DefinitionKt.NO_Float_VALUE;
                    }
                }
            }
            i10++;
        }
        m8146p(c3590g);
        for (int i20 = 0; i20 < this.f19179i; i20++) {
            C3586c c3586c4 = this.f19175e[i20];
            c3586c4.f19164a.f19195e = c3586c4.f19165b;
        }
    }

    /* renamed from: p */
    public final void m8146p(C3586c c3586c) {
        for (int i10 = 0; i10 < this.f19178h; i10++) {
            this.f19177g[i10] = false;
        }
        boolean z6 = false;
        int i11 = 0;
        while (!z6) {
            i11++;
            if (i11 >= this.f19178h * 2) {
                return;
            }
            C3592i c3592i = c3586c.f19164a;
            if (c3592i != null) {
                this.f19177g[c3592i.f19192b] = true;
            }
            C3592i c3592iMo8126d = c3586c.mo8126d(this.f19177g);
            if (c3592iMo8126d != null) {
                boolean[] zArr = this.f19177g;
                int i12 = c3592iMo8126d.f19192b;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (c3592iMo8126d != null) {
                float f6 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f19179i; i14++) {
                    C3586c c3586c2 = this.f19175e[i14];
                    if (c3586c2.f19164a.f19199i != EnumC3591h.UNRESTRICTED && !c3586c2.f19168e && c3586c2.f19167d.mo8108a(c3592iMo8126d)) {
                        float fMo8110c = c3586c2.f19167d.mo8110c(c3592iMo8126d);
                        if (fMo8110c < DefinitionKt.NO_Float_VALUE) {
                            float f10 = (-c3586c2.f19165b) / fMo8110c;
                            if (f10 < f6) {
                                i13 = i14;
                                f6 = f10;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C3586c c3586c3 = this.f19175e[i13];
                    c3586c3.f19164a.f19193c = -1;
                    c3586c3.m8128f(c3592iMo8126d);
                    C3592i c3592i2 = c3586c3.f19164a;
                    c3592i2.f19193c = i13;
                    c3592i2.m8154d(c3586c3);
                }
            } else {
                z6 = true;
            }
        }
    }

    /* renamed from: q */
    public final void m8147q() {
        boolean z6 = f19170p;
        C0919n c0919n = this.f19181k;
        int i10 = 0;
        if (z6) {
            while (true) {
                C3586c[] c3586cArr = this.f19175e;
                if (i10 >= c3586cArr.length) {
                    return;
                }
                C3586c c3586c = c3586cArr[i10];
                if (c3586c != null) {
                    ((C0602c) c0919n.f5598a).m1763b(c3586c);
                }
                this.f19175e[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                C3586c[] c3586cArr2 = this.f19175e;
                if (i10 >= c3586cArr2.length) {
                    return;
                }
                C3586c c3586c2 = c3586cArr2[i10];
                if (c3586c2 != null) {
                    ((C0602c) c0919n.f5599b).m1763b(c3586c2);
                }
                this.f19175e[i10] = null;
                i10++;
            }
        }
    }

    /* renamed from: r */
    public final void m8148r() {
        C0919n c0919n;
        int i10 = 0;
        while (true) {
            c0919n = this.f19181k;
            C3592i[] c3592iArr = (C3592i[]) c0919n.f5601d;
            if (i10 >= c3592iArr.length) {
                break;
            }
            C3592i c3592i = c3592iArr[i10];
            if (c3592i != null) {
                c3592i.m8153c();
            }
            i10++;
        }
        C0602c c0602c = (C0602c) c0919n.f5600c;
        C3592i[] c3592iArr2 = this.f19182l;
        int length = this.f19183m;
        c0602c.getClass();
        if (length > c3592iArr2.length) {
            length = c3592iArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            C3592i c3592i2 = c3592iArr2[i11];
            int i12 = c0602c.f3989c;
            Object[] objArr = c0602c.f3988b;
            if (i12 < objArr.length) {
                objArr[i12] = c3592i2;
                c0602c.f3989c = i12 + 1;
            }
        }
        this.f19183m = 0;
        Arrays.fill((C3592i[]) c0919n.f5601d, (Object) null);
        this.f19171a = 0;
        C3590g c3590g = this.f19172b;
        c3590g.f19189h = 0;
        c3590g.f19165b = DefinitionKt.NO_Float_VALUE;
        this.f19178h = 1;
        for (int i13 = 0; i13 < this.f19179i; i13++) {
            this.f19175e[i13].getClass();
        }
        m8147q();
        this.f19179i = 0;
        if (f19170p) {
            this.f19184n = new C3587d(c0919n);
        } else {
            this.f19184n = new C3586c(c0919n);
        }
    }
}
