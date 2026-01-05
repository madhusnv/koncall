package p001o;

import java.math.RoundingMode;
import p001o.kb5;

/* loaded from: classes2.dex */
public class sb5 implements kb5.InterfaceC14767e {

    /* renamed from: b */
    public final int f45107b;

    /* renamed from: c */
    public final int f45108c;

    /* renamed from: d */
    public final int f45109d;

    /* renamed from: e */
    public final int f45110e;

    /* renamed from: f */
    public final int f45111f;

    /* renamed from: g */
    public final int f45112g;

    /* renamed from: h */
    public final int f45113h;

    /* renamed from: o.sb5$a */
    public static class C16793a {

        /* renamed from: a */
        public int f45114a = 250000;

        /* renamed from: b */
        public int f45115b = 750000;

        /* renamed from: c */
        public int f45116c = 4;

        /* renamed from: d */
        public int f45117d = 250000;

        /* renamed from: e */
        public int f45118e = 50000000;

        /* renamed from: f */
        public int f45119f = 2;

        /* renamed from: g */
        public int f45120g = 4;

        /* renamed from: h */
        public sb5 m48118h() {
            return new sb5(this);
        }
    }

    public sb5(C16793a c16793a) {
        this.f45107b = c16793a.f45114a;
        this.f45108c = c16793a.f45115b;
        this.f45109d = c16793a.f45116c;
        this.f45110e = c16793a.f45117d;
        this.f45111f = c16793a.f45118e;
        this.f45112g = c16793a.f45119f;
        this.f45113h = c16793a.f45120g;
    }

    /* renamed from: b */
    public static int m48105b(int i, int i2, int i3) {
        return br8.m19637d(((i * i2) * i3) / 1000000);
    }

    /* renamed from: d */
    public static int m48106d(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // p001o.kb5.InterfaceC14767e
    /* renamed from: a */
    public int mo35305a(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (m48107c(i, i2, i3, i4, i5, i6) * d)) + i4) - 1) / i4) * i4;
    }

    /* renamed from: c */
    public int m48107c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return m48110g(i, i5, i4);
        }
        if (i3 == 1) {
            return m48108e(i2);
        }
        if (i3 == 2) {
            return m48109f(i2, i6);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public int m48108e(int i) {
        return br8.m19637d((this.f45111f * m48106d(i)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m48109f(int i, int i2) {
        int i3;
        int i4 = this.f45110e;
        if (i != 5) {
            if (i == 8) {
                i3 = this.f45113h;
            }
            return br8.m19637d((i4 * (i2 == -1 ? fl8.m27018b(i2, 8, RoundingMode.CEILING) : m48106d(i))) / 1000000);
        }
        i3 = this.f45112g;
        i4 *= i3;
        return br8.m19637d((i4 * (i2 == -1 ? fl8.m27018b(i2, 8, RoundingMode.CEILING) : m48106d(i))) / 1000000);
    }

    /* renamed from: g */
    public int m48110g(int i, int i2, int i3) {
        return sqi.m48736o(i * this.f45109d, m48105b(this.f45107b, i2, i3), m48105b(this.f45108c, i2, i3));
    }
}
