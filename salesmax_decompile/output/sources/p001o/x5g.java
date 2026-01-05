package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class x5g extends q26 {

    /* renamed from: d */
    public olb f53248d;

    public x5g(String str) {
        this.f41165a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.f53248d = m55663d(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: d */
    public static olb m55663d(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = i * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        olb olbVar = new olb(dArr3, dArr2);
        System.out.println(" 0 " + olbVar.mo19473c(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0));
        System.out.println(" 1 " + olbVar.mo19473c(1.0d, 0));
        return olbVar;
    }

    @Override // p001o.q26
    /* renamed from: a */
    public double mo20345a(double d) {
        return this.f53248d.mo19473c(d, 0);
    }

    @Override // p001o.q26
    /* renamed from: b */
    public double mo20346b(double d) {
        return this.f53248d.mo19476f(d, 0);
    }
}
