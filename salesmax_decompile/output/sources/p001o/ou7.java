package p001o;

import android.graphics.Color;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import p001o.ka9;

/* loaded from: classes3.dex */
public class ou7 implements wri {

    /* renamed from: a */
    public int f38936a;

    public ou7(int i) {
        this.f38936a = i;
    }

    /* renamed from: b */
    public final void m42701b(lu7 lu7Var, List list) {
        int i = this.f38936a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = ((Float) list.get(i)).floatValue();
            } else {
                dArr2[i2] = ((Float) list.get(i)).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < lu7Var.m37895c(); i3++) {
            int i4 = lu7Var.m37893a()[i3];
            lu7Var.m37893a()[i3] = Color.argb(m42702c(lu7Var.m37894b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    /* renamed from: c */
    public final int m42702c(double d, double[] dArr, double[] dArr2) {
        double dM59355j;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                dM59355j = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d2 = dArr[i2];
            double d3 = dArr[i];
            if (d3 >= d) {
                dM59355j = zeb.m59355j(dArr2[i2], dArr2[i], zeb.m59347b((d - d2) / (d3 - d2), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d));
                break;
            }
            i++;
        }
        return (int) (dM59355j * 255.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    @Override // p001o.wri
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lu7 mo23422a(ka9 ka9Var, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_ARRAY;
        if (z) {
            ka9Var.mo22731c();
        }
        while (ka9Var.mo22735h()) {
            arrayList.add(Float.valueOf((float) ka9Var.mo22737o()));
        }
        if (z) {
            ka9Var.mo22733f();
        }
        if (this.f38936a == -1) {
            this.f38936a = arrayList.size() / 4;
        }
        int i = this.f38936a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f38936a * 4; i4++) {
            int i5 = i4 / 4;
            double dFloatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 2) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 3) {
                    iArr[i5] = Color.argb(Constants.MAX_HOST_LENGTH, i2, i3, (int) (dFloatValue * 255.0d));
                }
            } else if (i5 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i5 - 1] >= f2) {
                    fArr[i5] = f2 + 0.01f;
                } else {
                    fArr[i5] = (float) dFloatValue;
                }
            }
        }
        lu7 lu7Var = new lu7(fArr, iArr);
        m42701b(lu7Var, arrayList);
        return lu7Var;
    }
}
