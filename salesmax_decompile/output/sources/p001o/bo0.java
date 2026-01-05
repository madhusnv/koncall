package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class bo0 extends rd4 {

    /* renamed from: a */
    public final double[] f16593a;

    /* renamed from: b */
    public C12463a[] f16594b;

    /* renamed from: c */
    public boolean f16595c = true;

    /* renamed from: o.bo0$a */
    public static class C12463a {

        /* renamed from: s */
        public static double[] f16596s = new double[91];

        /* renamed from: a */
        public double[] f16597a;

        /* renamed from: b */
        public double f16598b;

        /* renamed from: c */
        public double f16599c;

        /* renamed from: d */
        public double f16600d;

        /* renamed from: e */
        public double f16601e;

        /* renamed from: f */
        public double f16602f;

        /* renamed from: g */
        public double f16603g;

        /* renamed from: h */
        public double f16604h;

        /* renamed from: i */
        public double f16605i;

        /* renamed from: j */
        public double f16606j;

        /* renamed from: k */
        public double f16607k;

        /* renamed from: l */
        public double f16608l;

        /* renamed from: m */
        public double f16609m;

        /* renamed from: n */
        public double f16610n;

        /* renamed from: o */
        public double f16611o;

        /* renamed from: p */
        public double f16612p;

        /* renamed from: q */
        public boolean f16613q;

        /* renamed from: r */
        public boolean f16614r;

        public C12463a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.f16614r = false;
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (i == 1) {
                this.f16613q = true;
            } else if (i == 4) {
                this.f16613q = d8 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            } else if (i != 5) {
                this.f16613q = false;
            } else {
                this.f16613q = d8 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            this.f16599c = d;
            this.f16600d = d2;
            this.f16605i = 1.0d / (d2 - d);
            if (3 == i) {
                this.f16614r = true;
            }
            if (!this.f16614r && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.f16597a = new double[101];
                boolean z = this.f16613q;
                this.f16606j = d7 * (z ? -1 : 1);
                this.f16607k = d8 * (z ? 1 : -1);
                this.f16608l = z ? d5 : d3;
                this.f16609m = z ? d4 : d6;
                m19479a(d3, d4, d5, d6);
                this.f16610n = this.f16598b * this.f16605i;
                return;
            }
            this.f16614r = true;
            this.f16601e = d3;
            this.f16602f = d5;
            this.f16603g = d4;
            this.f16604h = d6;
            double dHypot = Math.hypot(d8, d7);
            this.f16598b = dHypot;
            this.f16610n = dHypot * this.f16605i;
            double d9 = this.f16600d;
            double d10 = this.f16599c;
            this.f16608l = d7 / (d9 - d10);
            this.f16609m = d8 / (d9 - d10);
        }

        /* renamed from: a */
        public final void m19479a(double d, double d2, double d3, double d4) {
            double dHypot;
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double d7 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d8 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d9 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            while (true) {
                if (i >= f16596s.length) {
                    break;
                }
                double d10 = d7;
                double radians = Math.toRadians((i * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d5;
                double dCos = Math.cos(radians) * d6;
                if (i > 0) {
                    dHypot = Math.hypot(dSin - d8, dCos - d9) + d10;
                    f16596s[i] = dHypot;
                } else {
                    dHypot = d10;
                }
                i++;
                d9 = dCos;
                d7 = dHypot;
                d8 = dSin;
            }
            double d11 = d7;
            this.f16598b = d11;
            int i2 = 0;
            while (true) {
                double[] dArr = f16596s;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] / d11;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.f16597a.length) {
                    return;
                }
                double length = i3 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(f16596s, length);
                if (iBinarySearch >= 0) {
                    this.f16597a[i3] = iBinarySearch / (f16596s.length - 1);
                } else if (iBinarySearch == -1) {
                    this.f16597a[i3] = 0.0d;
                } else {
                    int i4 = -iBinarySearch;
                    int i5 = i4 - 2;
                    double[] dArr2 = f16596s;
                    double d12 = dArr2[i5];
                    this.f16597a[i3] = (i5 + ((length - d12) / (dArr2[i4 - 1] - d12))) / (dArr2.length - 1);
                }
                i3++;
            }
        }

        /* renamed from: b */
        public double m19480b() {
            double d = this.f16606j * this.f16612p;
            double dHypot = this.f16610n / Math.hypot(d, (-this.f16607k) * this.f16611o);
            if (this.f16613q) {
                d = -d;
            }
            return d * dHypot;
        }

        /* renamed from: c */
        public double m19481c() {
            double d = this.f16606j * this.f16612p;
            double d2 = (-this.f16607k) * this.f16611o;
            double dHypot = this.f16610n / Math.hypot(d, d2);
            return this.f16613q ? (-d2) * dHypot : d2 * dHypot;
        }

        /* renamed from: d */
        public double m19482d(double d) {
            return this.f16608l;
        }

        /* renamed from: e */
        public double m19483e(double d) {
            return this.f16609m;
        }

        /* renamed from: f */
        public double m19484f(double d) {
            double d2 = (d - this.f16599c) * this.f16605i;
            double d3 = this.f16601e;
            return d3 + (d2 * (this.f16602f - d3));
        }

        /* renamed from: g */
        public double m19485g(double d) {
            double d2 = (d - this.f16599c) * this.f16605i;
            double d3 = this.f16603g;
            return d3 + (d2 * (this.f16604h - d3));
        }

        /* renamed from: h */
        public double m19486h() {
            return this.f16608l + (this.f16606j * this.f16611o);
        }

        /* renamed from: i */
        public double m19487i() {
            return this.f16609m + (this.f16607k * this.f16612p);
        }

        /* renamed from: j */
        public double m19488j(double d) {
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f16597a;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* renamed from: k */
        public void m19489k(double d) {
            double dM19488j = m19488j((this.f16613q ? this.f16600d - d : d - this.f16599c) * this.f16605i) * 1.5707963267948966d;
            this.f16611o = Math.sin(dM19488j);
            this.f16612p = Math.cos(dM19488j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[PHI: r9
      0x0035: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:6:0x001e, B:12:0x0028, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bo0(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f16593a = dArr;
        this.f16594b = new C12463a[dArr.length - 1];
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            C12463a[] c12463aArr = this.f16594b;
            if (i3 >= c12463aArr.length) {
                return;
            }
            int i4 = iArr[i3];
            int i5 = 3;
            if (i4 == 0) {
                i2 = i5;
            } else if (i4 == 1) {
                i = 1;
                i2 = i;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        i5 = 4;
                        if (i4 != 4) {
                            i5 = 5;
                            if (i4 != 5) {
                            }
                        }
                    } else {
                        if (i == 1) {
                        }
                        i2 = i;
                    }
                }
                i = 2;
                i2 = i;
            }
            double d = dArr[i3];
            int i6 = i3 + 1;
            double d2 = dArr[i6];
            double[] dArr3 = dArr2[i3];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i6];
            c12463aArr[i3] = new C12463a(i2, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i3 = i6;
        }
    }

    @Override // p001o.rd4
    /* renamed from: c */
    public double mo19473c(double d, int i) {
        double dM19485g;
        double dM19483e;
        double dM19487i;
        double dM19481c;
        double dM19485g2;
        double dM19483e2;
        int i2 = 0;
        if (this.f16595c) {
            C12463a[] c12463aArr = this.f16594b;
            C12463a c12463a = c12463aArr[0];
            double d2 = c12463a.f16599c;
            if (d < d2) {
                double d3 = d - d2;
                if (c12463a.f16614r) {
                    if (i == 0) {
                        dM19485g2 = c12463a.m19484f(d2);
                        dM19483e2 = this.f16594b[0].m19482d(d2);
                    } else {
                        dM19485g2 = c12463a.m19485g(d2);
                        dM19483e2 = this.f16594b[0].m19483e(d2);
                    }
                    return dM19485g2 + (d3 * dM19483e2);
                }
                c12463a.m19489k(d2);
                if (i == 0) {
                    dM19487i = this.f16594b[0].m19486h();
                    dM19481c = this.f16594b[0].m19480b();
                } else {
                    dM19487i = this.f16594b[0].m19487i();
                    dM19481c = this.f16594b[0].m19481c();
                }
                return dM19487i + (d3 * dM19481c);
            }
            if (d > c12463aArr[c12463aArr.length - 1].f16600d) {
                double d4 = c12463aArr[c12463aArr.length - 1].f16600d;
                double d5 = d - d4;
                int length = c12463aArr.length - 1;
                if (i == 0) {
                    dM19485g = c12463aArr[length].m19484f(d4);
                    dM19483e = this.f16594b[length].m19482d(d4);
                } else {
                    dM19485g = c12463aArr[length].m19485g(d4);
                    dM19483e = this.f16594b[length].m19483e(d4);
                }
                return dM19485g + (d5 * dM19483e);
            }
        } else {
            C12463a[] c12463aArr2 = this.f16594b;
            double d6 = c12463aArr2[0].f16599c;
            if (d < d6) {
                d = d6;
            } else if (d > c12463aArr2[c12463aArr2.length - 1].f16600d) {
                d = c12463aArr2[c12463aArr2.length - 1].f16600d;
            }
        }
        while (true) {
            C12463a[] c12463aArr3 = this.f16594b;
            if (i2 >= c12463aArr3.length) {
                return Double.NaN;
            }
            C12463a c12463a2 = c12463aArr3[i2];
            if (d <= c12463a2.f16600d) {
                if (c12463a2.f16614r) {
                    return i == 0 ? c12463a2.m19484f(d) : c12463a2.m19485g(d);
                }
                c12463a2.m19489k(d);
                return i == 0 ? this.f16594b[i2].m19486h() : this.f16594b[i2].m19487i();
            }
            i2++;
        }
    }

    @Override // p001o.rd4
    /* renamed from: d */
    public void mo19474d(double d, double[] dArr) {
        if (this.f16595c) {
            C12463a[] c12463aArr = this.f16594b;
            C12463a c12463a = c12463aArr[0];
            double d2 = c12463a.f16599c;
            if (d < d2) {
                double d3 = d - d2;
                if (c12463a.f16614r) {
                    dArr[0] = c12463a.m19484f(d2) + (this.f16594b[0].m19482d(d2) * d3);
                    dArr[1] = this.f16594b[0].m19485g(d2) + (d3 * this.f16594b[0].m19483e(d2));
                    return;
                } else {
                    c12463a.m19489k(d2);
                    dArr[0] = this.f16594b[0].m19486h() + (this.f16594b[0].m19480b() * d3);
                    dArr[1] = this.f16594b[0].m19487i() + (d3 * this.f16594b[0].m19481c());
                    return;
                }
            }
            if (d > c12463aArr[c12463aArr.length - 1].f16600d) {
                double d4 = c12463aArr[c12463aArr.length - 1].f16600d;
                double d5 = d - d4;
                int length = c12463aArr.length - 1;
                C12463a c12463a2 = c12463aArr[length];
                if (c12463a2.f16614r) {
                    dArr[0] = c12463a2.m19484f(d4) + (this.f16594b[length].m19482d(d4) * d5);
                    dArr[1] = this.f16594b[length].m19485g(d4) + (d5 * this.f16594b[length].m19483e(d4));
                    return;
                } else {
                    c12463a2.m19489k(d);
                    dArr[0] = this.f16594b[length].m19486h() + (this.f16594b[length].m19480b() * d5);
                    dArr[1] = this.f16594b[length].m19487i() + (d5 * this.f16594b[length].m19481c());
                    return;
                }
            }
        } else {
            C12463a[] c12463aArr2 = this.f16594b;
            double d6 = c12463aArr2[0].f16599c;
            if (d < d6) {
                d = d6;
            }
            if (d > c12463aArr2[c12463aArr2.length - 1].f16600d) {
                d = c12463aArr2[c12463aArr2.length - 1].f16600d;
            }
        }
        int i = 0;
        while (true) {
            C12463a[] c12463aArr3 = this.f16594b;
            if (i >= c12463aArr3.length) {
                return;
            }
            C12463a c12463a3 = c12463aArr3[i];
            if (d <= c12463a3.f16600d) {
                if (c12463a3.f16614r) {
                    dArr[0] = c12463a3.m19484f(d);
                    dArr[1] = this.f16594b[i].m19485g(d);
                    return;
                } else {
                    c12463a3.m19489k(d);
                    dArr[0] = this.f16594b[i].m19486h();
                    dArr[1] = this.f16594b[i].m19487i();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p001o.rd4
    /* renamed from: e */
    public void mo19475e(double d, float[] fArr) {
        if (this.f16595c) {
            C12463a[] c12463aArr = this.f16594b;
            C12463a c12463a = c12463aArr[0];
            double d2 = c12463a.f16599c;
            if (d < d2) {
                double d3 = d - d2;
                if (c12463a.f16614r) {
                    fArr[0] = (float) (c12463a.m19484f(d2) + (this.f16594b[0].m19482d(d2) * d3));
                    fArr[1] = (float) (this.f16594b[0].m19485g(d2) + (d3 * this.f16594b[0].m19483e(d2)));
                    return;
                } else {
                    c12463a.m19489k(d2);
                    fArr[0] = (float) (this.f16594b[0].m19486h() + (this.f16594b[0].m19480b() * d3));
                    fArr[1] = (float) (this.f16594b[0].m19487i() + (d3 * this.f16594b[0].m19481c()));
                    return;
                }
            }
            if (d > c12463aArr[c12463aArr.length - 1].f16600d) {
                double d4 = c12463aArr[c12463aArr.length - 1].f16600d;
                double d5 = d - d4;
                int length = c12463aArr.length - 1;
                C12463a c12463a2 = c12463aArr[length];
                if (c12463a2.f16614r) {
                    fArr[0] = (float) (c12463a2.m19484f(d4) + (this.f16594b[length].m19482d(d4) * d5));
                    fArr[1] = (float) (this.f16594b[length].m19485g(d4) + (d5 * this.f16594b[length].m19483e(d4)));
                    return;
                } else {
                    c12463a2.m19489k(d);
                    fArr[0] = (float) this.f16594b[length].m19486h();
                    fArr[1] = (float) this.f16594b[length].m19487i();
                    return;
                }
            }
        } else {
            C12463a[] c12463aArr2 = this.f16594b;
            double d6 = c12463aArr2[0].f16599c;
            if (d < d6) {
                d = d6;
            } else if (d > c12463aArr2[c12463aArr2.length - 1].f16600d) {
                d = c12463aArr2[c12463aArr2.length - 1].f16600d;
            }
        }
        int i = 0;
        while (true) {
            C12463a[] c12463aArr3 = this.f16594b;
            if (i >= c12463aArr3.length) {
                return;
            }
            C12463a c12463a3 = c12463aArr3[i];
            if (d <= c12463a3.f16600d) {
                if (c12463a3.f16614r) {
                    fArr[0] = (float) c12463a3.m19484f(d);
                    fArr[1] = (float) this.f16594b[i].m19485g(d);
                    return;
                } else {
                    c12463a3.m19489k(d);
                    fArr[0] = (float) this.f16594b[i].m19486h();
                    fArr[1] = (float) this.f16594b[i].m19487i();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p001o.rd4
    /* renamed from: f */
    public double mo19476f(double d, int i) {
        C12463a[] c12463aArr = this.f16594b;
        int i2 = 0;
        double d2 = c12463aArr[0].f16599c;
        if (d < d2) {
            d = d2;
        }
        if (d > c12463aArr[c12463aArr.length - 1].f16600d) {
            d = c12463aArr[c12463aArr.length - 1].f16600d;
        }
        while (true) {
            C12463a[] c12463aArr2 = this.f16594b;
            if (i2 >= c12463aArr2.length) {
                return Double.NaN;
            }
            C12463a c12463a = c12463aArr2[i2];
            if (d <= c12463a.f16600d) {
                if (c12463a.f16614r) {
                    return i == 0 ? c12463a.m19482d(d) : c12463a.m19483e(d);
                }
                c12463a.m19489k(d);
                return i == 0 ? this.f16594b[i2].m19480b() : this.f16594b[i2].m19481c();
            }
            i2++;
        }
    }

    @Override // p001o.rd4
    /* renamed from: g */
    public void mo19477g(double d, double[] dArr) {
        C12463a[] c12463aArr = this.f16594b;
        double d2 = c12463aArr[0].f16599c;
        if (d < d2) {
            d = d2;
        } else if (d > c12463aArr[c12463aArr.length - 1].f16600d) {
            d = c12463aArr[c12463aArr.length - 1].f16600d;
        }
        int i = 0;
        while (true) {
            C12463a[] c12463aArr2 = this.f16594b;
            if (i >= c12463aArr2.length) {
                return;
            }
            C12463a c12463a = c12463aArr2[i];
            if (d <= c12463a.f16600d) {
                if (c12463a.f16614r) {
                    dArr[0] = c12463a.m19482d(d);
                    dArr[1] = this.f16594b[i].m19483e(d);
                    return;
                } else {
                    c12463a.m19489k(d);
                    dArr[0] = this.f16594b[i].m19480b();
                    dArr[1] = this.f16594b[i].m19481c();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p001o.rd4
    /* renamed from: h */
    public double[] mo19478h() {
        return this.f16593a;
    }
}
