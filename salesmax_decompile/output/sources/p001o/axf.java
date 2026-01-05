package p001o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class axf implements Iterable, sb9 {

    /* renamed from: e */
    public static final C12266a f15344e = new C12266a(null);

    /* renamed from: f */
    public static final axf f15345f = new axf(0, 0, 0, null);

    /* renamed from: a */
    public final long f15346a;

    /* renamed from: b */
    public final long f15347b;

    /* renamed from: c */
    public final int f15348c;

    /* renamed from: d */
    public final int[] f15349d;

    /* renamed from: o.axf$a */
    public static final class C12266a {
        public C12266a() {
        }

        public /* synthetic */ C12266a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final axf m17959a() {
            return axf.f15345f;
        }
    }

    /* renamed from: o.axf$b */
    public static final class C12267b extends qre implements nl7 {

        /* renamed from: b */
        public Object f15350b;

        /* renamed from: c */
        public int f15351c;

        /* renamed from: d */
        public int f15352d;

        /* renamed from: e */
        public int f15353e;

        /* renamed from: f */
        public /* synthetic */ Object f15354f;

        public C12267b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12267b c12267b = axf.this.new C12267b(n64Var);
            c12267b.f15354f = obj;
            return c12267b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kef kefVar, n64 n64Var) {
            return ((C12267b) create(kefVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:31:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:31:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kef kefVar;
            C12267b c12267b;
            kef kefVar2;
            int length;
            int[] iArr;
            int i;
            kef kefVar3;
            int i2;
            kef kefVar4;
            C12267b c12267b2;
            int i3;
            Object objM51918f = uq8.m51918f();
            int i4 = this.f15353e;
            if (i4 == 0) {
                wre.m54934b(obj);
                kefVar = (kef) this.f15354f;
                int[] iArr2 = axf.this.f15349d;
                if (iArr2 == null) {
                    c12267b = this;
                    if (axf.this.f15347b != 0) {
                    }
                    if (axf.this.f15346a != 0) {
                    }
                    return y3i.f54824a;
                }
                c12267b = this;
                kefVar2 = kefVar;
                length = iArr2.length;
                iArr = iArr2;
                i = 0;
                if (i < length) {
                }
            } else if (i4 == 1) {
                length = this.f15352d;
                i = this.f15351c;
                iArr = (int[]) this.f15350b;
                kefVar2 = (kef) this.f15354f;
                wre.m54934b(obj);
                c12267b = this;
                i++;
                if (i < length) {
                    Integer numM39304d = ml1.m39304d(iArr[i]);
                    c12267b.f15354f = kefVar2;
                    c12267b.f15350b = iArr;
                    c12267b.f15351c = i;
                    c12267b.f15352d = length;
                    c12267b.f15353e = 1;
                    if (kefVar2.mo33661f(numM39304d, c12267b) == objM51918f) {
                        return objM51918f;
                    }
                    i++;
                    if (i < length) {
                        kefVar = kefVar2;
                        if (axf.this.f15347b != 0) {
                            kefVar3 = kefVar;
                            i2 = 0;
                            if (i2 >= 64) {
                            }
                        }
                        if (axf.this.f15346a != 0) {
                        }
                        return y3i.f54824a;
                    }
                }
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.f15351c;
                    kefVar4 = (kef) this.f15354f;
                    wre.m54934b(obj);
                    i3 = i5;
                    c12267b2 = this;
                    i3++;
                    if (i3 < 64) {
                        if ((axf.this.f15346a & (1 << i3)) != 0) {
                            Integer numM39304d2 = ml1.m39304d(i3 + 64 + axf.this.f15348c);
                            c12267b2.f15354f = kefVar4;
                            c12267b2.f15350b = null;
                            c12267b2.f15351c = i3;
                            c12267b2.f15353e = 3;
                            if (kefVar4.mo33661f(numM39304d2, c12267b2) == objM51918f) {
                                return objM51918f;
                            }
                        }
                        i3++;
                        if (i3 < 64) {
                        }
                    }
                    return y3i.f54824a;
                }
                i2 = this.f15351c;
                kefVar3 = (kef) this.f15354f;
                wre.m54934b(obj);
                c12267b = this;
                i2++;
                if (i2 >= 64) {
                    kefVar = kefVar3;
                    if (axf.this.f15346a != 0) {
                        kefVar4 = kefVar;
                        c12267b2 = c12267b;
                        i3 = 0;
                        if (i3 < 64) {
                        }
                    }
                    return y3i.f54824a;
                }
                if ((axf.this.f15347b & (1 << i2)) != 0) {
                    Integer numM39304d3 = ml1.m39304d(axf.this.f15348c + i2);
                    c12267b.f15354f = kefVar3;
                    c12267b.f15350b = null;
                    c12267b.f15351c = i2;
                    c12267b.f15353e = 2;
                    if (kefVar3.mo33661f(numM39304d3, c12267b) == objM51918f) {
                        return objM51918f;
                    }
                }
                i2++;
                if (i2 >= 64) {
                }
            }
        }
    }

    public axf(long j, long j2, int i, int[] iArr) {
        this.f15346a = j;
        this.f15347b = j2;
        this.f15348c = i;
        this.f15349d = iArr;
    }

    /* renamed from: A */
    public final axf m17953A(int i) {
        int i2;
        int[] iArrP0;
        int i3 = this.f15348c;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.f15347b;
            if ((j3 & j2) == 0) {
                return new axf(this.f15346a, j3 | j2, i3, this.f15349d);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.f15346a;
            if ((j5 & j4) == 0) {
                return new axf(j5 | j4, this.f15347b, i3, this.f15349d);
            }
        } else if (i4 < 128) {
            int[] iArr = this.f15349d;
            if (iArr == null) {
                return new axf(this.f15346a, this.f15347b, i3, new int[]{i});
            }
            int iM19914b = bxf.m19914b(iArr, i);
            if (iM19914b < 0) {
                int i5 = -(iM19914b + 1);
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                fp0.m27258g(iArr, iArr2, 0, 0, i5);
                fp0.m27258g(iArr, iArr2, i5 + 1, i5, length - 1);
                iArr2[i5] = i;
                return new axf(this.f15346a, this.f15347b, this.f15348c, iArr2);
            }
        } else if (!m17956v(i)) {
            long j6 = this.f15346a;
            long j7 = this.f15347b;
            int i6 = this.f15348c;
            int i7 = ((i + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i6 >= i7) {
                    i2 = i6;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f15349d;
                        if (iArr3 != null) {
                            for (int i8 : iArr3) {
                                arrayList.add(Integer.valueOf(i8));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i6));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    i2 = i7;
                    j8 = j;
                    break;
                }
                i6 += 64;
                j8 = j9;
                j9 = j;
            }
            if (arrayList == null || (iArrP0 = kh3.P0(arrayList)) == null) {
                iArrP0 = this.f15349d;
            }
            return new axf(j9, j8, i2, iArrP0).m17953A(i);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return mef.m38854b(new C12267b(null)).iterator();
    }

    /* renamed from: p */
    public final axf m17954p(axf axfVar) {
        sq8.m48649h(axfVar, "bits");
        axf axfVar2 = f15345f;
        if (axfVar == axfVar2) {
            return this;
        }
        if (this == axfVar2) {
            return axfVar2;
        }
        int i = axfVar.f15348c;
        int i2 = this.f15348c;
        if (i == i2) {
            int[] iArr = axfVar.f15349d;
            int[] iArr2 = this.f15349d;
            if (iArr == iArr2) {
                return new axf(this.f15346a & (~axfVar.f15346a), this.f15347b & (~axfVar.f15347b), i2, iArr2);
            }
        }
        Iterator it = axfVar.iterator();
        axf axfVarM17955r = this;
        while (it.hasNext()) {
            axfVarM17955r = axfVarM17955r.m17955r(((Number) it.next()).intValue());
        }
        return axfVarM17955r;
    }

    /* renamed from: r */
    public final axf m17955r(int i) {
        int[] iArr;
        int iM19914b;
        int i2 = this.f15348c;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.f15347b;
            if ((j2 & j) != 0) {
                return new axf(this.f15346a, j2 & (~j), i2, this.f15349d);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f15346a;
            if ((j4 & j3) != 0) {
                return new axf(j4 & (~j3), this.f15347b, i2, this.f15349d);
            }
        } else if (i3 < 0 && (iArr = this.f15349d) != null && (iM19914b = bxf.m19914b(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new axf(this.f15346a, this.f15347b, this.f15348c, null);
            }
            int[] iArr2 = new int[length];
            if (iM19914b > 0) {
                fp0.m27258g(iArr, iArr2, 0, 0, iM19914b);
            }
            if (iM19914b < length) {
                fp0.m27258g(iArr, iArr2, iM19914b, iM19914b + 1, length + 1);
            }
            return new axf(this.f15346a, this.f15347b, this.f15348c, iArr2);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(dh3.m23088v(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(ofa.m42199d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v */
    public final boolean m17956v(int i) {
        int[] iArr;
        int i2 = i - this.f15348c;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.f15347b) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.f15346a) != 0;
        }
        if (i2 <= 0 && (iArr = this.f15349d) != null) {
            return bxf.m19914b(iArr, i) >= 0;
        }
        return false;
    }

    /* renamed from: w */
    public final int m17957w(int i) {
        int[] iArr = this.f15349d;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f15347b;
        if (j != 0) {
            return this.f15348c + bxf.m19915c(j);
        }
        long j2 = this.f15346a;
        return j2 != 0 ? this.f15348c + 64 + bxf.m19915c(j2) : i;
    }

    /* renamed from: y */
    public final axf m17958y(axf axfVar) {
        sq8.m48649h(axfVar, "bits");
        axf axfVar2 = f15345f;
        if (axfVar == axfVar2) {
            return this;
        }
        if (this == axfVar2) {
            return axfVar;
        }
        int i = axfVar.f15348c;
        int i2 = this.f15348c;
        if (i == i2) {
            int[] iArr = axfVar.f15349d;
            int[] iArr2 = this.f15349d;
            if (iArr == iArr2) {
                return new axf(this.f15346a | axfVar.f15346a, this.f15347b | axfVar.f15347b, i2, iArr2);
            }
        }
        if (this.f15349d == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                axfVar = axfVar.m17953A(((Number) it.next()).intValue());
            }
            return axfVar;
        }
        Iterator it2 = axfVar.iterator();
        axf axfVarM17953A = this;
        while (it2.hasNext()) {
            axfVarM17953A = axfVarM17953A.m17953A(((Number) it2.next()).intValue());
        }
        return axfVarM17953A;
    }
}
