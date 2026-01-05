package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class qec extends e8 implements RandomAccess {

    /* renamed from: d */
    public static final C16365a f41791d = new C16365a(null);

    /* renamed from: b */
    public final zq1[] f41792b;

    /* renamed from: c */
    public final int[] f41793c;

    /* renamed from: o.qec$a */
    public static final class C16365a {
        public C16365a() {
        }

        public /* synthetic */ C16365a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m45287b(C16365a c16365a, long j, rl1 rl1Var, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            c16365a.m45288a((i4 & 1) != 0 ? 0L : j, rl1Var, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: a */
        public final void m45288a(long j, rl1 rl1Var, int i, List list, int i2, int i3, List list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            rl1 rl1Var2;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(((zq1) list.get(i9)).m59694L() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            zq1 zq1Var = (zq1) list.get(i2);
            zq1 zq1Var2 = (zq1) list.get(i3 - 1);
            int i10 = -1;
            if (i8 == zq1Var.m59694L()) {
                int iIntValue = ((Number) list2.get(i2)).intValue();
                int i11 = i2 + 1;
                zq1 zq1Var3 = (zq1) list.get(i11);
                i4 = i11;
                i5 = iIntValue;
                zq1Var = zq1Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (zq1Var.m59699h(i8) == zq1Var2.m59699h(i8)) {
                int iMin = Math.min(zq1Var.m59694L(), zq1Var2.m59694L());
                int i12 = 0;
                for (int i13 = i8; i13 < iMin && zq1Var.m59699h(i13) == zq1Var2.m59699h(i13); i13++) {
                    i12++;
                }
                long jM45289c = j + m45289c(rl1Var) + 2 + i12 + 1;
                rl1Var.mo29023I(-i12);
                rl1Var.mo29023I(i5);
                int i14 = i8 + i12;
                while (i8 < i14) {
                    rl1Var.mo29023I(zq1Var.m59699h(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (!(i14 == ((zq1) list.get(i4)).m59694L())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    rl1Var.mo29023I(((Number) list2.get(i4)).intValue());
                    return;
                } else {
                    rl1 rl1Var3 = new rl1();
                    rl1Var.mo29023I(((int) (m45289c(rl1Var3) + jM45289c)) * (-1));
                    m45288a(jM45289c, rl1Var3, i14, list, i4, i3, list2);
                    rl1Var.p0(rl1Var3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (((zq1) list.get(i16 - 1)).m59699h(i8) != ((zq1) list.get(i16)).m59699h(i8)) {
                    i15++;
                }
            }
            long jM45289c2 = j + m45289c(rl1Var) + 2 + (i15 * 2);
            rl1Var.mo29023I(i15);
            rl1Var.mo29023I(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte bM59699h = ((zq1) list.get(i17)).m59699h(i8);
                if (i17 == i4 || bM59699h != ((zq1) list.get(i17 - 1)).m59699h(i8)) {
                    rl1Var.mo29023I(bM59699h & 255);
                }
            }
            rl1 rl1Var4 = new rl1();
            while (i4 < i3) {
                byte bM59699h2 = ((zq1) list.get(i4)).m59699h(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bM59699h2 != ((zq1) list.get(i19)).m59699h(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == ((zq1) list.get(i4)).m59694L()) {
                    rl1Var.mo29023I(((Number) list2.get(i4)).intValue());
                    i7 = i6;
                    rl1Var2 = rl1Var4;
                } else {
                    rl1Var.mo29023I(((int) (jM45289c2 + m45289c(rl1Var4))) * i10);
                    i7 = i6;
                    rl1Var2 = rl1Var4;
                    m45288a(jM45289c2, rl1Var4, i8 + 1, list, i4, i6, list2);
                }
                rl1Var4 = rl1Var2;
                i4 = i7;
                i10 = -1;
            }
            rl1Var.p0(rl1Var4);
        }

        /* renamed from: c */
        public final long m45289c(rl1 rl1Var) {
            return rl1Var.f0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
        
            continue;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final qec m45290d(zq1... zq1VarArr) {
            sq8.m48649h(zq1VarArr, "byteStrings");
            id5 id5Var = null;
            if (zq1VarArr.length == 0) {
                return new qec(new zq1[0], new int[]{0, -1}, id5Var);
            }
            List listI0 = gp0.I0(zq1VarArr);
            gh3.m28656y(listI0);
            int size = listI0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(-1);
            }
            int length = zq1VarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                arrayList.set(ch3.m21245j(listI0, zq1VarArr[i2], 0, 0, 6, null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (!(((zq1) listI0.get(0)).m59694L() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < listI0.size()) {
                zq1 zq1Var = (zq1) listI0.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < listI0.size()) {
                    zq1 zq1Var2 = (zq1) listI0.get(i6);
                    if (zq1Var2.m59695M(zq1Var)) {
                        if (!(zq1Var2.m59694L() != zq1Var.m59694L())) {
                            throw new IllegalArgumentException(("duplicate option: " + zq1Var2).toString());
                        }
                        if (((Number) arrayList.get(i6)).intValue() > ((Number) arrayList.get(i4)).intValue()) {
                            listI0.remove(i6);
                            arrayList.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                }
                i4 = i5;
            }
            rl1 rl1Var = new rl1();
            m45287b(this, 0L, rl1Var, 0, listI0, 0, 0, arrayList, 53, null);
            int iM45289c = (int) m45289c(rl1Var);
            int[] iArr = new int[iM45289c];
            for (int i7 = 0; i7 < iM45289c; i7++) {
                iArr[i7] = rl1Var.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(zq1VarArr, zq1VarArr.length);
            sq8.m48648g(objArrCopyOf, "copyOf(...)");
            return new qec((zq1[]) objArrCopyOf, iArr, id5Var);
        }
    }

    public /* synthetic */ qec(zq1[] zq1VarArr, int[] iArr, id5 id5Var) {
        this(zq1VarArr, iArr);
    }

    /* renamed from: A */
    public static final qec m45280A(zq1... zq1VarArr) {
        return f41791d.m45290d(zq1VarArr);
    }

    @Override // p001o.b7, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof zq1) {
            return m45281e((zq1) obj);
        }
        return false;
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f41792b.length;
    }

    /* renamed from: e */
    public /* bridge */ boolean m45281e(zq1 zq1Var) {
        return super.contains(zq1Var);
    }

    @Override // p001o.e8, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof zq1) {
            return m45285r((zq1) obj);
        }
        return -1;
    }

    @Override // p001o.e8, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public zq1 get(int i) {
        return this.f41792b[i];
    }

    @Override // p001o.e8, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof zq1) {
            return m45286y((zq1) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public final zq1[] m45283o() {
        return this.f41792b;
    }

    /* renamed from: p */
    public final int[] m45284p() {
        return this.f41793c;
    }

    /* renamed from: r */
    public /* bridge */ int m45285r(zq1 zq1Var) {
        return super.indexOf(zq1Var);
    }

    /* renamed from: y */
    public /* bridge */ int m45286y(zq1 zq1Var) {
        return super.lastIndexOf(zq1Var);
    }

    public qec(zq1[] zq1VarArr, int[] iArr) {
        this.f41792b = zq1VarArr;
        this.f41793c = iArr;
    }
}
