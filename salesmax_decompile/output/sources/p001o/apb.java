package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class apb extends i37 {
    public apb(int i) {
        super(i, null);
    }

    /* renamed from: h */
    public final boolean m17637h(float f) {
        m17638i(this.f27982b + 1);
        float[] fArr = this.f27981a;
        int i = this.f27982b;
        fArr[i] = f;
        this.f27982b = i + 1;
        return true;
    }

    /* renamed from: i */
    public final void m17638i(int i) {
        float[] fArr = this.f27981a;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            sq8.m48648g(fArrCopyOf, "copyOf(this, newSize)");
            this.f27981a = fArrCopyOf;
        }
    }
}
