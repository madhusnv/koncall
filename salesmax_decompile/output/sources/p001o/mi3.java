package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public abstract class mi3 {

    /* renamed from: a */
    public static final double[][] f35498a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* renamed from: b */
    public static final double[][] f35499b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* renamed from: c */
    public static final double[] f35500c = {95.047d, 100.0d, 108.883d};

    /* renamed from: a */
    public static int m39091a(double d, double d2, double d3) {
        double[] dArr = f35500c;
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = d4 - (d3 / 200.0d);
        return m39095e(m39101k((d2 / 500.0d) + d4) * dArr[0], m39101k(d4) * dArr[1], m39101k(d5) * dArr[2]);
    }

    /* renamed from: b */
    public static int m39092b(double[] dArr) {
        return m39094d(m39097g(dArr[0]), m39097g(dArr[1]), m39097g(dArr[2]));
    }

    /* renamed from: c */
    public static int m39093c(double d) {
        int iM39097g = m39097g(m39108r(d));
        return m39094d(iM39097g, iM39097g, iM39097g);
    }

    /* renamed from: d */
    public static int m39094d(int i, int i2, int i3) {
        return ((i & Constants.MAX_HOST_LENGTH) << 16) | (-16777216) | ((i2 & Constants.MAX_HOST_LENGTH) << 8) | (i3 & Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: e */
    public static int m39095e(double d, double d2, double d3) {
        double[][] dArr = f35499b;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[0] * d) + (dArr2[1] * d2) + (dArr2[2] * d3);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[0] * d) + (dArr3[1] * d2) + (dArr3[2] * d3);
        double[] dArr4 = dArr[2];
        return m39094d(m39097g(d4), m39097g(d5), m39097g((dArr4[0] * d) + (dArr4[1] * d2) + (dArr4[2] * d3)));
    }

    /* renamed from: f */
    public static int m39096f(int i) {
        return i & Constants.MAX_HOST_LENGTH;
    }

    /* renamed from: g */
    public static int m39097g(double d) {
        double d2 = d / 100.0d;
        return nza.m41314b(0, Constants.MAX_HOST_LENGTH, (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    /* renamed from: h */
    public static int m39098h(int i) {
        return (i >> 8) & Constants.MAX_HOST_LENGTH;
    }

    /* renamed from: i */
    public static double m39099i(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    /* renamed from: j */
    public static double[] m39100j(int i) {
        double dM39102l = m39102l(m39105o(i));
        double dM39102l2 = m39102l(m39098h(i));
        double dM39102l3 = m39102l(m39096f(i));
        double[][] dArr = f35498a;
        double[] dArr2 = dArr[0];
        double d = (dArr2[0] * dM39102l) + (dArr2[1] * dM39102l2) + (dArr2[2] * dM39102l3);
        double[] dArr3 = dArr[1];
        double d2 = (dArr3[0] * dM39102l) + (dArr3[1] * dM39102l2) + (dArr3[2] * dM39102l3);
        double[] dArr4 = dArr[2];
        double d3 = (dArr4[0] * dM39102l) + (dArr4[1] * dM39102l2) + (dArr4[2] * dM39102l3);
        double[] dArr5 = f35500c;
        double d4 = d / dArr5[0];
        double d5 = d2 / dArr5[1];
        double d6 = d3 / dArr5[2];
        double dM39099i = m39099i(d4);
        double dM39099i2 = m39099i(d5);
        return new double[]{(116.0d * dM39099i2) - 16.0d, (dM39099i - dM39099i2) * 500.0d, (dM39099i2 - m39099i(d6)) * 200.0d};
    }

    /* renamed from: k */
    public static double m39101k(double d) {
        double d2 = d * d * d;
        return d2 > 0.008856451679035631d ? d2 : ((d * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    /* renamed from: l */
    public static double m39102l(int i) {
        double d = i / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    /* renamed from: m */
    public static double m39103m(int i) {
        return (m39099i(m39107q(i)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    /* renamed from: n */
    public static double m39104n(double d) {
        return (m39099i(d / 100.0d) * 116.0d) - 16.0d;
    }

    /* renamed from: o */
    public static int m39105o(int i) {
        return (i >> 16) & Constants.MAX_HOST_LENGTH;
    }

    /* renamed from: p */
    public static double[] m39106p() {
        return f35500c;
    }

    /* renamed from: q */
    public static double[] m39107q(int i) {
        return nza.m41317e(new double[]{m39102l(m39105o(i)), m39102l(m39098h(i)), m39102l(m39096f(i))}, f35498a);
    }

    /* renamed from: r */
    public static double m39108r(double d) {
        return m39101k((d + 16.0d) / 116.0d) * 100.0d;
    }
}
