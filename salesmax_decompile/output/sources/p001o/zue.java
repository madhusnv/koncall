package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class zue {

    /* renamed from: e */
    public static final C18710a f57721e = new C18710a(null);

    /* renamed from: a */
    public final List f57722a;

    /* renamed from: b */
    public final float f57723b;

    /* renamed from: c */
    public final float f57724c;

    /* renamed from: d */
    public final List f57725d;

    /* renamed from: o.zue$a */
    public static final class C18710a {
        public C18710a() {
        }

        public /* synthetic */ C18710a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zue(List list, float f, float f2) {
        List listM21252q;
        List listM21252q2;
        yc4 yc4Var;
        List listM31109a;
        sq8.m48649h(list, "features");
        this.f57722a = list;
        this.f57723b = f;
        this.f57724c = f2;
        List listM18961c = bh3.m18961c();
        int i = 0;
        yc4 yc4Var2 = null;
        if (list.size() <= 0 || ((ht6) list.get(0)).m31109a().size() != 3) {
            listM21252q = null;
            listM21252q2 = null;
        } else {
            hwc hwcVarM57504m = ((yc4) ((ht6) list.get(0)).m31109a().get(1)).m57504m(0.5f);
            yc4 yc4Var3 = (yc4) hwcVarM57504m.m31227a();
            yc4 yc4Var4 = (yc4) hwcVarM57504m.m31228b();
            listM21252q2 = ch3.m21252q(((ht6) list.get(0)).m31109a().get(0), yc4Var3);
            listM21252q = ch3.m21252q(yc4Var4, ((ht6) list.get(0)).m31109a().get(2));
        }
        int size = list.size();
        if (size >= 0) {
            int i2 = 0;
            yc4 yc4Var5 = null;
            while (true) {
                if (i2 == 0 && listM21252q != null) {
                    listM31109a = listM21252q;
                } else if (i2 != this.f57722a.size()) {
                    listM31109a = ((ht6) this.f57722a.get(i2)).m31109a();
                } else if (listM21252q2 == null) {
                    break;
                } else {
                    listM31109a = listM21252q2;
                }
                int size2 = listM31109a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    yc4 yc4Var6 = (yc4) listM31109a.get(i3);
                    if (!yc4Var6.m57507p()) {
                        if (yc4Var5 != null) {
                            listM18961c.add(yc4Var5);
                        }
                        if (yc4Var2 == null) {
                            yc4Var2 = yc4Var6;
                            yc4Var5 = yc4Var2;
                        } else {
                            yc4Var5 = yc4Var6;
                        }
                    } else if (yc4Var5 != null) {
                        yc4Var5.m57501j()[6] = yc4Var6.m57495d();
                        yc4Var5.m57501j()[7] = yc4Var6.m57496e();
                    }
                }
                if (i2 == size) {
                    break;
                } else {
                    i2++;
                }
            }
            yc4Var = yc4Var2;
            yc4Var2 = yc4Var5;
        } else {
            yc4Var = null;
        }
        if (yc4Var2 != null && yc4Var != null) {
            listM18961c.add(ad4.m16894a(yc4Var2.m57493b(), yc4Var2.m57494c(), yc4Var2.m57497f(), yc4Var2.m57498g(), yc4Var2.m57499h(), yc4Var2.m57500i(), yc4Var.m57493b(), yc4Var.m57494c()));
        }
        List listM18959a = bh3.m18959a(listM18961c);
        this.f57725d = listM18959a;
        Object obj = listM18959a.get(listM18959a.size() - 1);
        int size3 = listM18959a.size();
        while (i < size3) {
            yc4 yc4Var7 = (yc4) this.f57725d.get(i);
            yc4 yc4Var8 = (yc4) obj;
            if (Math.abs(yc4Var7.m57493b() - yc4Var8.m57495d()) > 1.0E-4f || Math.abs(yc4Var7.m57494c() - yc4Var8.m57496e()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i++;
            obj = yc4Var7;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ float[] m59944c(zue zueVar, float[] fArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return zueVar.m59946b(fArr, z);
    }

    /* renamed from: a */
    public final float[] m59945a(float[] fArr) {
        sq8.m48649h(fArr, "bounds");
        return m59944c(this, fArr, false, 2, null);
    }

    /* renamed from: b */
    public final float[] m59946b(float[] fArr, boolean z) {
        sq8.m48649h(fArr, "bounds");
        if (!(fArr.length >= 4)) {
            throw new IllegalArgumentException("Required bounds size of 4".toString());
        }
        int size = this.f57725d.size();
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            ((yc4) this.f57725d.get(i)).m57492a(fArr, z);
            fMin = Math.min(fMin, fArr[0]);
            fMin2 = Math.min(fMin2, fArr[1]);
            fMax = Math.max(fMax, fArr[2]);
            fMax2 = Math.max(fMax2, fArr[3]);
        }
        fArr[0] = fMin;
        fArr[1] = fMin2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
        return fArr;
    }

    /* renamed from: d */
    public final float[] m59947d(float[] fArr) {
        sq8.m48649h(fArr, "bounds");
        if (!(fArr.length >= 4)) {
            throw new IllegalArgumentException("Required bounds size of 4".toString());
        }
        int size = this.f57725d.size();
        float fMax = 0.0f;
        for (int i = 0; i < size; i++) {
            yc4 yc4Var = (yc4) this.f57725d.get(i);
            float fM29418e = gri.m29418e(yc4Var.m57493b() - this.f57723b, yc4Var.m57494c() - this.f57724c);
            long jM57502k = yc4Var.m57502k(0.5f);
            fMax = Math.max(fMax, Math.max(fM29418e, gri.m29418e(gcd.m28436g(jM57502k) - this.f57723b, gcd.m28437h(jM57502k) - this.f57724c)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        float f = this.f57723b;
        fArr[0] = f - fSqrt;
        float f2 = this.f57724c;
        fArr[1] = f2 - fSqrt;
        fArr[2] = f + fSqrt;
        fArr[3] = f2 + fSqrt;
        return fArr;
    }

    /* renamed from: e */
    public final float m59948e() {
        return this.f57723b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zue) {
            return sq8.m48644c(this.f57722a, ((zue) obj).f57722a);
        }
        return false;
    }

    /* renamed from: f */
    public final float m59949f() {
        return this.f57724c;
    }

    /* renamed from: g */
    public final List m59950g() {
        return this.f57722a;
    }

    /* renamed from: h */
    public final zue m59951h(jcd jcdVar) {
        sq8.m48649h(jcdVar, "f");
        long jM28442m = gcd.m28442m(f37.m26029b(this.f57723b, this.f57724c), jcdVar);
        List listM18961c = bh3.m18961c();
        int size = this.f57722a.size();
        for (int i = 0; i < size; i++) {
            listM18961c.add(((ht6) this.f57722a.get(i)).mo31110b(jcdVar));
        }
        return new zue(bh3.m18959a(listM18961c), gcd.m28436g(jM28442m), gcd.m28437h(jM28442m));
    }

    public int hashCode() {
        return this.f57722a.hashCode();
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + kh3.p0(this.f57725d, null, null, null, 0, null, null, 63, null) + " || Features = " + kh3.p0(this.f57722a, null, null, null, 0, null, null, 63, null) + " || Center = (" + this.f57723b + ", " + this.f57724c + ")]";
    }
}
