package p001o;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public interface crf {

    /* renamed from: o.crf$a */
    public static class C12730a implements crf {

        /* renamed from: a */
        public final Random f18535a;

        /* renamed from: b */
        public final int[] f18536b;

        /* renamed from: c */
        public final int[] f18537c;

        public C12730a(int i) {
            this(i, new Random());
        }

        /* renamed from: h */
        public static int[] m21632h(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // p001o.crf
        /* renamed from: a */
        public crf mo21625a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f18536b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f18536b;
                if (i4 >= iArr2.length) {
                    return new C12730a(iArr, new Random(this.f18535a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // p001o.crf
        /* renamed from: b */
        public int mo21626b(int i) {
            int i2 = this.f18537c[i] - 1;
            if (i2 >= 0) {
                return this.f18536b[i2];
            }
            return -1;
        }

        @Override // p001o.crf
        /* renamed from: c */
        public int mo21627c(int i) {
            int i2 = this.f18537c[i] + 1;
            int[] iArr = this.f18536b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p001o.crf
        /* renamed from: d */
        public int mo21628d() {
            int[] iArr = this.f18536b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p001o.crf
        /* renamed from: e */
        public crf mo21629e() {
            return new C12730a(0, new Random(this.f18535a.nextLong()));
        }

        @Override // p001o.crf
        /* renamed from: f */
        public int mo21630f() {
            int[] iArr = this.f18536b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p001o.crf
        /* renamed from: g */
        public crf mo21631g(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f18535a.nextInt(this.f18536b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f18535a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f18536b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f18536b;
                if (i3 >= iArr4.length + i2) {
                    return new C12730a(iArr3, new Random(this.f18535a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= i) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // p001o.crf
        public int getLength() {
            return this.f18536b.length;
        }

        public C12730a(int i, Random random) {
            this(m21632h(i, random), random);
        }

        public C12730a(int[] iArr, Random random) {
            this.f18536b = iArr;
            this.f18535a = random;
            this.f18537c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f18537c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: a */
    crf mo21625a(int i, int i2);

    /* renamed from: b */
    int mo21626b(int i);

    /* renamed from: c */
    int mo21627c(int i);

    /* renamed from: d */
    int mo21628d();

    /* renamed from: e */
    crf mo21629e();

    /* renamed from: f */
    int mo21630f();

    /* renamed from: g */
    crf mo21631g(int i, int i2);

    int getLength();
}
