package p001o;

import android.graphics.Matrix;

/* loaded from: classes2.dex */
public abstract class ze0 {
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m59284a(Matrix matrix, float[] fArr) {
        boolean z;
        sq8.m48649h(matrix, "$this$setFrom");
        sq8.m48649h(fArr, "matrix");
        float f = fArr[2];
        if (f == 0.0f) {
            if (fArr[6] == 0.0f) {
                if (fArr[10] == 1.0f) {
                    if (fArr[14] == 0.0f) {
                        if (fArr[8] == 0.0f) {
                            if (fArr[9] == 0.0f) {
                                if (fArr[11] == 0.0f) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f3;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    /* renamed from: b */
    public static final void m59285b(float[] fArr, Matrix matrix) {
        sq8.m48649h(fArr, "$this$setFrom");
        sq8.m48649h(matrix, "matrix");
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }
}
