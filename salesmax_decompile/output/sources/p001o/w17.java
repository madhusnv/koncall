package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w17 {

    /* renamed from: c */
    public boolean f51276c;

    /* renamed from: d */
    public boolean f51277d;

    /* renamed from: f */
    public int f51279f;

    /* renamed from: a */
    public C17740a f51274a = new C17740a();

    /* renamed from: b */
    public C17740a f51275b = new C17740a();

    /* renamed from: e */
    public long f51278e = -9223372036854775807L;

    /* renamed from: o.w17$a */
    public static final class C17740a {

        /* renamed from: a */
        public long f51280a;

        /* renamed from: b */
        public long f51281b;

        /* renamed from: c */
        public long f51282c;

        /* renamed from: d */
        public long f51283d;

        /* renamed from: e */
        public long f51284e;

        /* renamed from: f */
        public long f51285f;

        /* renamed from: g */
        public final boolean[] f51286g = new boolean[15];

        /* renamed from: h */
        public int f51287h;

        /* renamed from: c */
        public static int m53786c(long j) {
            return (int) (j % 15);
        }

        /* renamed from: a */
        public long m53787a() {
            long j = this.f51284e;
            if (j == 0) {
                return 0L;
            }
            return this.f51285f / j;
        }

        /* renamed from: b */
        public long m53788b() {
            return this.f51285f;
        }

        /* renamed from: d */
        public boolean m53789d() {
            long j = this.f51283d;
            if (j == 0) {
                return false;
            }
            return this.f51286g[m53786c(j - 1)];
        }

        /* renamed from: e */
        public boolean m53790e() {
            return this.f51283d > 15 && this.f51287h == 0;
        }

        /* renamed from: f */
        public void m53791f(long j) {
            long j2 = this.f51283d;
            if (j2 == 0) {
                this.f51280a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f51280a;
                this.f51281b = j3;
                this.f51285f = j3;
                this.f51284e = 1L;
            } else {
                long j4 = j - this.f51282c;
                int iM53786c = m53786c(j2);
                if (Math.abs(j4 - this.f51281b) <= 1000000) {
                    this.f51284e++;
                    this.f51285f += j4;
                    boolean[] zArr = this.f51286g;
                    if (zArr[iM53786c]) {
                        zArr[iM53786c] = false;
                        this.f51287h--;
                    }
                } else {
                    boolean[] zArr2 = this.f51286g;
                    if (!zArr2[iM53786c]) {
                        zArr2[iM53786c] = true;
                        this.f51287h++;
                    }
                }
            }
            this.f51283d++;
            this.f51282c = j;
        }

        /* renamed from: g */
        public void m53792g() {
            this.f51283d = 0L;
            this.f51284e = 0L;
            this.f51285f = 0L;
            this.f51287h = 0;
            Arrays.fill(this.f51286g, false);
        }
    }

    /* renamed from: a */
    public long m53779a() {
        if (m53783e()) {
            return this.f51274a.m53787a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float m53780b() {
        if (m53783e()) {
            return (float) (1.0E9d / this.f51274a.m53787a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int m53781c() {
        return this.f51279f;
    }

    /* renamed from: d */
    public long m53782d() {
        if (m53783e()) {
            return this.f51274a.m53788b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m53783e() {
        return this.f51274a.m53790e();
    }

    /* renamed from: f */
    public void m53784f(long j) {
        this.f51274a.m53791f(j);
        if (this.f51274a.m53790e() && !this.f51277d) {
            this.f51276c = false;
        } else if (this.f51278e != -9223372036854775807L) {
            if (!this.f51276c || this.f51275b.m53789d()) {
                this.f51275b.m53792g();
                this.f51275b.m53791f(this.f51278e);
            }
            this.f51276c = true;
            this.f51275b.m53791f(j);
        }
        if (this.f51276c && this.f51275b.m53790e()) {
            C17740a c17740a = this.f51274a;
            this.f51274a = this.f51275b;
            this.f51275b = c17740a;
            this.f51276c = false;
            this.f51277d = false;
        }
        this.f51278e = j;
        this.f51279f = this.f51274a.m53790e() ? 0 : this.f51279f + 1;
    }

    /* renamed from: g */
    public void m53785g() {
        this.f51274a.m53792g();
        this.f51275b.m53792g();
        this.f51276c = false;
        this.f51278e = -9223372036854775807L;
        this.f51279f = 0;
    }
}
