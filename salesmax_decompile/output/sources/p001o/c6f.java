package p001o;

/* loaded from: classes2.dex */
public class c6f extends q26 {

    /* renamed from: d */
    public double f17412d;

    /* renamed from: e */
    public double f17413e;

    public c6f(String str) {
        this.f41165a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f17412d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.f17413e = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // p001o.q26
    /* renamed from: a */
    public double mo20345a(double d) {
        return m20348e(d);
    }

    @Override // p001o.q26
    /* renamed from: b */
    public double mo20346b(double d) {
        return m20347d(d);
    }

    /* renamed from: d */
    public final double m20347d(double d) {
        double d2 = this.f17413e;
        if (d < d2) {
            double d3 = this.f17412d;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f17412d;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    /* renamed from: e */
    public final double m20348e(double d) {
        double d2 = this.f17413e;
        return d < d2 ? (d2 * d) / (d + (this.f17412d * (d2 - d))) : ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f17412d * (d2 - d)));
    }
}
