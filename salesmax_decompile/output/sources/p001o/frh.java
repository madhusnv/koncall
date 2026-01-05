package p001o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class frh {

    /* renamed from: a */
    public Map f23989a = new HashMap();

    /* renamed from: b */
    public jx7 f23990b;

    /* renamed from: c */
    public double f23991c;

    /* renamed from: d */
    public double f23992d;

    /* renamed from: o.frh$a */
    public static final class C13538a {

        /* renamed from: a */
        public final double f23993a;

        /* renamed from: b */
        public final double f23994b;

        /* renamed from: c */
        public final Map f23995c = new HashMap();

        public C13538a(double d, double d2) {
            this.f23993a = d;
            this.f23994b = d2;
        }

        /* renamed from: a */
        public jx7 m27406a() {
            int i = 100;
            int i2 = 0;
            while (i2 < i) {
                int i3 = (i2 + i) / 2;
                int i4 = i3 + 1;
                boolean z = m27407b(i3) < m27407b(i4);
                if (m27407b(i3) >= this.f23994b - 0.01d) {
                    if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                        i = i3;
                    } else {
                        if (i2 == i3) {
                            return jx7.m34651a(this.f23993a, this.f23994b, i2);
                        }
                        i2 = i3;
                    }
                } else if (z) {
                    i2 = i4;
                } else {
                    i = i3;
                }
            }
            return jx7.m34651a(this.f23993a, this.f23994b, i2);
        }

        /* renamed from: b */
        public final double m27407b(int i) {
            Double dValueOf;
            if (this.f23995c.get(Integer.valueOf(i)) == null && (dValueOf = Double.valueOf(jx7.m34651a(this.f23993a, 200.0d, i).m34653c())) != null) {
                this.f23995c.put(Integer.valueOf(i), dValueOf);
            }
            return ((Double) this.f23995c.get(Integer.valueOf(i))).doubleValue();
        }
    }

    public frh(double d, double d2, jx7 jx7Var) {
        this.f23991c = d;
        this.f23992d = d2;
        this.f23990b = jx7Var;
    }

    /* renamed from: a */
    public static frh m27401a(jx7 jx7Var) {
        return new frh(jx7Var.m34654d(), jx7Var.m34653c(), jx7Var);
    }

    /* renamed from: b */
    public static frh m27402b(double d, double d2) {
        return new frh(d, d2, new C13538a(d, d2).m27406a());
    }

    /* renamed from: c */
    public double m27403c() {
        return this.f23992d;
    }

    /* renamed from: d */
    public jx7 m27404d(double d) {
        return jx7.m34651a(this.f23991c, this.f23992d, d);
    }

    /* renamed from: e */
    public double m27405e() {
        return this.f23991c;
    }
}
