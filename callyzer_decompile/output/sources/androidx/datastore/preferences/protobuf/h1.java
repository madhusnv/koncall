package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: f */
    public static final h1 f2338f = new h1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f2339a;

    /* renamed from: b */
    public int[] f2340b;

    /* renamed from: c */
    public Object[] f2341c;

    /* renamed from: d */
    public int f2342d = -1;

    /* renamed from: e */
    public boolean f2343e;

    public h1(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f2339a = i10;
        this.f2340b = iArr;
        this.f2341c = objArr;
        this.f2343e = z6;
    }

    /* renamed from: a */
    public final void m906a(int i10) {
        int[] iArr = this.f2340b;
        if (i10 > iArr.length) {
            int i11 = this.f2339a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f2340b = Arrays.copyOf(iArr, i10);
            this.f2341c = Arrays.copyOf(this.f2341c, i10);
        }
    }

    /* renamed from: b */
    public final int m907b() {
        int iM967l;
        int iM969n;
        int iM967l2;
        int i10 = this.f2342d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f2339a; i12++) {
            int i13 = this.f2340b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f2341c[i12]).getClass();
                    iM967l2 = C0318m.m967l(i14) + 8;
                } else if (i15 == 2) {
                    iM967l2 = C0318m.m965j(i14, (C0312g) this.f2341c[i12]);
                } else if (i15 == 3) {
                    iM967l = C0318m.m967l(i14) * 2;
                    iM969n = ((h1) this.f2341c[i12]).m907b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m804b());
                    }
                    ((Integer) this.f2341c[i12]).getClass();
                    iM967l2 = C0318m.m967l(i14) + 4;
                }
                i11 = iM967l2 + i11;
            } else {
                long jLongValue = ((Long) this.f2341c[i12]).longValue();
                iM967l = C0318m.m967l(i14);
                iM969n = C0318m.m969n(jLongValue);
            }
            i11 = iM969n + iM967l + i11;
        }
        this.f2342d = i11;
        return i11;
    }

    /* renamed from: c */
    public final void m908c(int i10, Object obj) {
        if (!this.f2343e) {
            throw new UnsupportedOperationException();
        }
        m906a(this.f2339a + 1);
        int[] iArr = this.f2340b;
        int i11 = this.f2339a;
        iArr[i11] = i10;
        this.f2341c[i11] = obj;
        this.f2339a = i11 + 1;
    }

    /* renamed from: d */
    public final void m909d(i0 i0Var) throws IOException {
        if (this.f2339a == 0) {
            return;
        }
        i0Var.getClass();
        C0318m c0318m = (C0318m) i0Var.f2353a;
        u1 u1Var = u1.ASCENDING;
        for (int i10 = 0; i10 < this.f2339a; i10++) {
            int i11 = this.f2340b[i10];
            Object obj = this.f2341c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c0318m.m977H(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c0318m.m994x(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                i0Var.m922a(i12, (C0312g) obj);
            } else if (i13 == 3) {
                u1 u1Var2 = u1.ASCENDING;
                c0318m.m974E(i12, 3);
                ((h1) obj).m909d(i0Var);
                c0318m.m974E(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m804b());
                }
                c0318m.m992v(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        int i10 = this.f2339a;
        if (i10 == h1Var.f2339a) {
            int[] iArr = this.f2340b;
            int[] iArr2 = h1Var.f2340b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f2341c;
                    Object[] objArr2 = h1Var.f2341c;
                    int i12 = this.f2339a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f2339a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f2340b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f2341c;
        int i15 = this.f2339a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
