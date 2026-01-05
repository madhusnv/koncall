package b5;

import java.util.Arrays;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b5.a */
/* loaded from: classes.dex */
public final class C0599a {

    /* renamed from: a */
    public int[] f3976a;

    /* renamed from: b */
    public int[] f3977b;

    /* renamed from: c */
    public int f3978c;

    /* renamed from: d */
    public int[] f3979d;

    /* renamed from: e */
    public float[] f3980e;

    /* renamed from: f */
    public int f3981f;

    /* renamed from: g */
    public int[] f3982g;

    /* renamed from: h */
    public String[] f3983h;

    /* renamed from: i */
    public int f3984i;

    /* renamed from: a */
    public final void m1759a(float f6, int i10) {
        int i11 = this.f3981f;
        int[] iArr = this.f3979d;
        if (i11 >= iArr.length) {
            this.f3979d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3980e;
            this.f3980e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f3979d;
        int i12 = this.f3981f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f3980e;
        this.f3981f = i12 + 1;
        fArr2[i12] = f6;
    }

    /* renamed from: b */
    public final void m1760b(int i10, int i11) {
        int i12 = this.f3978c;
        int[] iArr = this.f3976a;
        if (i12 >= iArr.length) {
            this.f3976a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3977b;
            this.f3977b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3976a;
        int i13 = this.f3978c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f3977b;
        this.f3978c = i13 + 1;
        iArr4[i13] = i11;
    }

    /* renamed from: c */
    public final void m1761c(int i10, String str) {
        int i11 = this.f3984i;
        int[] iArr = this.f3982g;
        if (i11 >= iArr.length) {
            this.f3982g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f3983h;
            this.f3983h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3982g;
        int i12 = this.f3984i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f3983h;
        this.f3984i = i12 + 1;
        strArr2[i12] = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypedBundle{mCountInt=");
        sb2.append(this.f3978c);
        sb2.append(", mCountFloat=");
        sb2.append(this.f3981f);
        sb2.append(", mCountString=");
        return AbstractC5601a.m11233d(this.f3984i, ", mCountBoolean=0}", sb2);
    }
}
