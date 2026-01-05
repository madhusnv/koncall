package p001o;

import android.util.Rational;

/* loaded from: classes2.dex */
public final class eyi {

    /* renamed from: a */
    public int f22414a;

    /* renamed from: b */
    public Rational f22415b;

    /* renamed from: c */
    public int f22416c;

    /* renamed from: d */
    public int f22417d;

    /* renamed from: o.eyi$a */
    public static final class C13288a {

        /* renamed from: b */
        public final Rational f22419b;

        /* renamed from: c */
        public final int f22420c;

        /* renamed from: a */
        public int f22418a = 1;

        /* renamed from: d */
        public int f22421d = 0;

        public C13288a(Rational rational, int i) {
            this.f22419b = rational;
            this.f22420c = i;
        }

        /* renamed from: a */
        public eyi m25859a() {
            fgd.m26664h(this.f22419b, "The crop aspect ratio must be set.");
            return new eyi(this.f22418a, this.f22419b, this.f22420c, this.f22421d);
        }

        /* renamed from: b */
        public C13288a m25860b(int i) {
            this.f22421d = i;
            return this;
        }

        /* renamed from: c */
        public C13288a m25861c(int i) {
            this.f22418a = i;
            return this;
        }
    }

    public eyi(int i, Rational rational, int i2, int i3) {
        this.f22414a = i;
        this.f22415b = rational;
        this.f22416c = i2;
        this.f22417d = i3;
    }

    /* renamed from: a */
    public Rational m25855a() {
        return this.f22415b;
    }

    /* renamed from: b */
    public int m25856b() {
        return this.f22417d;
    }

    /* renamed from: c */
    public int m25857c() {
        return this.f22416c;
    }

    /* renamed from: d */
    public int m25858d() {
        return this.f22414a;
    }
}
