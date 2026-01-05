package p001o;

/* loaded from: classes5.dex */
public final class gec {

    /* renamed from: a */
    public static final gec f25038a = new gec();

    /* renamed from: a */
    public static final void m28513a(gna gnaVar, gna gnaVar2) {
        if (a94.m16694d(gec.class)) {
            return;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            sq8.m48649h(gnaVar2, "b");
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            int iM29152b3 = gnaVar.m29152b(2);
            float[] fArrM29151a = gnaVar.m29151a();
            float[] fArrM29151a2 = gnaVar2.m29151a();
            for (int i = 0; i < iM29152b; i++) {
                for (int i2 = 0; i2 < iM29152b2; i2++) {
                    for (int i3 = 0; i3 < iM29152b3; i3++) {
                        int i4 = (i * iM29152b2 * iM29152b3) + (i2 * iM29152b3) + i3;
                        fArrM29151a[i4] = fArrM29151a[i4] + fArrM29151a2[i3];
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
        }
    }

    /* renamed from: b */
    public static final gna m28514b(gna[] gnaVarArr) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVarArr, "tensors");
            int iM29152b = gnaVarArr[0].m29152b(0);
            int iM29152b2 = 0;
            for (gna gnaVar : gnaVarArr) {
                iM29152b2 += gnaVar.m29152b(1);
            }
            gna gnaVar2 = new gna(new int[]{iM29152b, iM29152b2});
            float[] fArrM29151a = gnaVar2.m29151a();
            for (int i = 0; i < iM29152b; i++) {
                int i2 = i * iM29152b2;
                int length = gnaVarArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    float[] fArrM29151a2 = gnaVarArr[i3].m29151a();
                    int iM29152b3 = gnaVarArr[i3].m29152b(1);
                    System.arraycopy(fArrM29151a2, i * iM29152b3, fArrM29151a, i2, iM29152b3);
                    i2 += iM29152b3;
                }
            }
            return gnaVar2;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final gna m28515c(gna gnaVar, gna gnaVar2) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            sq8.m48649h(gnaVar2, "w");
            int i = 0;
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            int iM29152b3 = gnaVar.m29152b(2);
            int iM29152b4 = gnaVar2.m29152b(0);
            int i2 = (iM29152b2 - iM29152b4) + 1;
            int iM29152b5 = gnaVar2.m29152b(2);
            gna gnaVar3 = new gna(new int[]{iM29152b, i2, iM29152b5});
            float[] fArrM29151a = gnaVar.m29151a();
            float[] fArrM29151a2 = gnaVar3.m29151a();
            float[] fArrM29151a3 = gnaVar2.m29151a();
            int i3 = 0;
            while (i3 < iM29152b) {
                int i4 = i;
                while (i4 < iM29152b5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < iM29152b4) {
                            for (int i6 = 0; i6 < iM29152b3; i6++) {
                                f += fArrM29151a[(iM29152b2 * iM29152b3 * i3) + ((i + i5) * iM29152b3) + i6] * fArrM29151a3[(((i * iM29152b3) + i6) * iM29152b5) + i4];
                            }
                            i++;
                        }
                        fArrM29151a2[(i2 * iM29152b5 * i3) + (i5 * iM29152b5) + i4] = f;
                        i5++;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return gnaVar3;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final gna m28516d(gna gnaVar, gna gnaVar2, gna gnaVar3) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            sq8.m48649h(gnaVar2, "w");
            sq8.m48649h(gnaVar3, "b");
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar3.m29152b(0);
            gna gnaVarM28520h = m28520h(gnaVar, gnaVar2);
            float[] fArrM29151a = gnaVar3.m29151a();
            float[] fArrM29151a2 = gnaVarM28520h.m29151a();
            for (int i = 0; i < iM29152b; i++) {
                for (int i2 = 0; i2 < iM29152b2; i2++) {
                    int i3 = (i * iM29152b2) + i2;
                    fArrM29151a2[i3] = fArrM29151a2[i3] + fArrM29151a[i2];
                }
            }
            return gnaVarM28520h;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final gna m28517e(String[] strArr, int i, gna gnaVar) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(strArr, "texts");
            sq8.m48649h(gnaVar, "w");
            int length = strArr.length;
            int iM29152b = gnaVar.m29152b(1);
            gna gnaVar2 = new gna(new int[]{length, i, iM29152b});
            float[] fArrM29151a = gnaVar2.m29151a();
            float[] fArrM29151a2 = gnaVar.m29151a();
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArrM32651d = iri.f29171a.m32651d(strArr[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(fArrM29151a2, iArrM32651d[i3] * iM29152b, fArrM29151a, (iM29152b * i * i2) + (iM29152b * i3), iM29152b);
                }
            }
            return gnaVar2;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m28518f(gna gnaVar, int i) {
        if (a94.m16694d(gec.class)) {
            return;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            if (i >= gnaVar.m29153c()) {
                return;
            }
            int iM29153c = gnaVar.m29153c();
            int iM29152b = 1;
            for (int i2 = i; i2 < iM29153c; i2++) {
                iM29152b *= gnaVar.m29152b(i2);
            }
            int[] iArr = new int[i + 1];
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = gnaVar.m29152b(i3);
            }
            iArr[i] = iM29152b;
            gnaVar.m29154d(iArr);
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
        }
    }

    /* renamed from: g */
    public static final gna m28519g(gna gnaVar, int i) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            int i2 = 0;
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            int iM29152b3 = gnaVar.m29152b(2);
            int i3 = (iM29152b2 - i) + 1;
            gna gnaVar2 = new gna(new int[]{iM29152b, i3, iM29152b3});
            float[] fArrM29151a = gnaVar.m29151a();
            float[] fArrM29151a2 = gnaVar2.m29151a();
            int i4 = 0;
            while (i4 < iM29152b) {
                int i5 = i2;
                while (i5 < iM29152b3) {
                    int i6 = i2;
                    while (i6 < i3) {
                        int i7 = i6 * iM29152b3;
                        int i8 = (i4 * i3 * iM29152b3) + i7 + i5;
                        int i9 = (i4 * iM29152b2 * iM29152b3) + i7 + i5;
                        fArrM29151a2[i8] = Float.MIN_VALUE;
                        for (int i10 = i2; i10 < i; i10++) {
                            fArrM29151a2[i8] = Math.max(fArrM29151a2[i8], fArrM29151a[i9 + (i10 * iM29152b3)]);
                        }
                        i6++;
                        i2 = 0;
                    }
                    i5++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            return gnaVar2;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final gna m28520h(gna gnaVar, gna gnaVar2) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            sq8.m48649h(gnaVar2, "w");
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar2.m29152b(0);
            int iM29152b3 = gnaVar2.m29152b(1);
            gna gnaVar3 = new gna(new int[]{iM29152b, iM29152b3});
            float[] fArrM29151a = gnaVar.m29151a();
            float[] fArrM29151a2 = gnaVar2.m29151a();
            float[] fArrM29151a3 = gnaVar3.m29151a();
            for (int i = 0; i < iM29152b; i++) {
                for (int i2 = 0; i2 < iM29152b3; i2++) {
                    int i3 = (i * iM29152b3) + i2;
                    fArrM29151a3[i3] = 0.0f;
                    for (int i4 = 0; i4 < iM29152b2; i4++) {
                        fArrM29151a3[i3] = fArrM29151a3[i3] + (fArrM29151a[(i * iM29152b2) + i4] * fArrM29151a2[(i4 * iM29152b3) + i2]);
                    }
                }
            }
            return gnaVar3;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final void m28521i(gna gnaVar) {
        if (a94.m16694d(gec.class)) {
            return;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            float[] fArrM29151a = gnaVar.m29151a();
            int length = fArrM29151a.length;
            for (int i = 0; i < length; i++) {
                if (fArrM29151a[i] < 0.0f) {
                    fArrM29151a[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
        }
    }

    /* renamed from: j */
    public static final void m28522j(gna gnaVar) {
        if (a94.m16694d(gec.class)) {
            return;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            float[] fArrM29151a = gnaVar.m29151a();
            for (int i = 0; i < iM29152b; i++) {
                int i2 = i * iM29152b2;
                int i3 = i2 + iM29152b2;
                float f = Float.MIN_VALUE;
                for (int i4 = i2; i4 < i3; i4++) {
                    float f2 = fArrM29151a[i4];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = 0.0f;
                for (int i5 = i2; i5 < i3; i5++) {
                    float fExp = (float) Math.exp(fArrM29151a[i5] - f);
                    fArrM29151a[i5] = fExp;
                    f3 += fExp;
                }
                while (i2 < i3) {
                    fArrM29151a[i2] = fArrM29151a[i2] / f3;
                    i2++;
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
        }
    }

    /* renamed from: k */
    public static final gna m28523k(gna gnaVar) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            gna gnaVar2 = new gna(new int[]{iM29152b2, iM29152b});
            float[] fArrM29151a = gnaVar.m29151a();
            float[] fArrM29151a2 = gnaVar2.m29151a();
            for (int i = 0; i < iM29152b; i++) {
                for (int i2 = 0; i2 < iM29152b2; i2++) {
                    fArrM29151a2[(i2 * iM29152b) + i] = fArrM29151a[(i * iM29152b2) + i2];
                }
            }
            return gnaVar2;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }

    /* renamed from: l */
    public static final gna m28524l(gna gnaVar) {
        if (a94.m16694d(gec.class)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVar, "x");
            int iM29152b = gnaVar.m29152b(0);
            int iM29152b2 = gnaVar.m29152b(1);
            int iM29152b3 = gnaVar.m29152b(2);
            gna gnaVar2 = new gna(new int[]{iM29152b3, iM29152b2, iM29152b});
            float[] fArrM29151a = gnaVar.m29151a();
            float[] fArrM29151a2 = gnaVar2.m29151a();
            for (int i = 0; i < iM29152b; i++) {
                for (int i2 = 0; i2 < iM29152b2; i2++) {
                    for (int i3 = 0; i3 < iM29152b3; i3++) {
                        fArrM29151a2[(i3 * iM29152b * iM29152b2) + (i2 * iM29152b) + i] = fArrM29151a[(i * iM29152b2 * iM29152b3) + (i2 * iM29152b3) + i3];
                    }
                }
            }
            return gnaVar2;
        } catch (Throwable th) {
            a94.m16692b(th, gec.class);
            return null;
        }
    }
}
