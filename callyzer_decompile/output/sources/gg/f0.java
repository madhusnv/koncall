package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mg.u0;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC7149a {
    public static final Parcelable.Creator<f0> CREATOR = new b0(20);

    /* renamed from: a */
    public final long f14107a;

    /* renamed from: b */
    public final u0 f14108b;

    /* renamed from: c */
    public final u0 f14109c;

    /* renamed from: d */
    public final u0 f14110d;

    public f0(long j6, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AbstractC6840z.m13036g(bArr);
        u0 u0VarM9650k = u0.m9650k(bArr.length, bArr);
        AbstractC6840z.m13036g(bArr2);
        u0 u0VarM9650k2 = u0.m9650k(bArr2.length, bArr2);
        AbstractC6840z.m13036g(bArr3);
        u0 u0VarM9650k3 = u0.m9650k(bArr3.length, bArr3);
        this.f14107a = j6;
        this.f14108b = u0VarM9650k;
        this.f14109c = u0VarM9650k2;
        this.f14110d = u0VarM9650k3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f14107a == f0Var.f14107a && AbstractC6840z.m13040k(this.f14108b, f0Var.f14108b) && AbstractC6840z.m13040k(this.f14109c, f0Var.f14109c) && AbstractC6840z.m13040k(this.f14110d, f0Var.f14110d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14107a), this.f14108b, this.f14109c, this.f14110d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 8);
        parcel.writeLong(this.f14107a);
        AbstractC5932m.m11775c(parcel, 2, this.f14108b.m9652m());
        AbstractC5932m.m11775c(parcel, 3, this.f14109c.m9652m());
        AbstractC5932m.m11775c(parcel, 4, this.f14110d.m9652m());
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
