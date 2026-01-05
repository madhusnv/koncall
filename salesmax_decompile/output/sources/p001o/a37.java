package p001o;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public class a37 implements TypeEvaluator {

    /* renamed from: a */
    public float[] f14090a;

    public a37(float[] fArr) {
        this.f14090a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f14090a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
