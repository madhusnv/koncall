package p001o;

/* loaded from: classes3.dex */
public final class icd implements hcd {
    @Override // p001o.hcd
    /* renamed from: a */
    public double mo30232a(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    @Override // p001o.hcd
    /* renamed from: b */
    public int mo30233b(double[] dArr) {
        return mi3.m39091a(dArr[0], dArr[1], dArr[2]);
    }

    @Override // p001o.hcd
    /* renamed from: c */
    public double[] mo30234c(int i) {
        double[] dArrM39100j = mi3.m39100j(i);
        return new double[]{dArrM39100j[0], dArrM39100j[1], dArrM39100j[2]};
    }
}
