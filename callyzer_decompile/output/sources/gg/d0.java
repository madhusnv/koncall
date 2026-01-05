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
public final class d0 extends AbstractC7149a {
    public static final Parcelable.Creator<d0> CREATOR = new b0(13);

    /* renamed from: a */
    public final u0 f14094a;

    /* renamed from: b */
    public final u0 f14095b;

    public d0(u0 u0Var, u0 u0Var2) {
        this.f14094a = u0Var;
        this.f14095b = u0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return AbstractC6840z.m13040k(this.f14094a, d0Var.f14094a) && AbstractC6840z.m13040k(this.f14095b, d0Var.f14095b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14094a, this.f14095b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        u0 u0Var = this.f14094a;
        AbstractC5932m.m11775c(parcel, 1, u0Var == null ? null : u0Var.m9652m());
        u0 u0Var2 = this.f14095b;
        AbstractC5932m.m11775c(parcel, 2, u0Var2 != null ? u0Var2.m9652m() : null);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
