package zi;

import android.os.Build;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a */
    public final int f43194a;

    /* renamed from: b */
    public final int f43195b;

    /* renamed from: c */
    public final long f43196c;

    /* renamed from: d */
    public final long f43197d;

    /* renamed from: e */
    public final boolean f43198e;

    /* renamed from: f */
    public final int f43199f;

    public m1(int i10, int i11, long j6, long j10, boolean z6, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f43194a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f43195b = i11;
        this.f43196c = j6;
        this.f43197d = j10;
        this.f43198e = z6;
        this.f43199f = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f43194a != m1Var.f43194a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f43195b != m1Var.f43195b || this.f43196c != m1Var.f43196c || this.f43197d != m1Var.f43197d || this.f43198e != m1Var.f43198e || this.f43199f != m1Var.f43199f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f43194a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f43195b) * 1000003;
        long j6 = this.f43196c;
        int i10 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f43197d;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f43198e ? 1231 : 1237)) * 1000003) ^ this.f43199f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f43194a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f43195b);
        sb2.append(", totalRam=");
        sb2.append(this.f43196c);
        sb2.append(", diskSpace=");
        sb2.append(this.f43197d);
        sb2.append(", isEmulator=");
        sb2.append(this.f43198e);
        sb2.append(", state=");
        sb2.append(this.f43199f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return AbstractC1452a.m4564k(sb2, Build.PRODUCT, "}");
    }
}
