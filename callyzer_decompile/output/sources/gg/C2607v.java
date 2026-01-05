package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.v */
/* loaded from: classes.dex */
public final class C2607v extends AbstractC7149a {
    public static final Parcelable.Creator<C2607v> CREATOR = new b0(9);

    /* renamed from: a */
    public final int f14144a;

    /* renamed from: b */
    public final short f14145b;

    /* renamed from: c */
    public final short f14146c;

    public C2607v(int i10, short s5, short s10) {
        this.f14144a = i10;
        this.f14145b = s5;
        this.f14146c = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2607v)) {
            return false;
        }
        C2607v c2607v = (C2607v) obj;
        return this.f14144a == c2607v.f14144a && this.f14145b == c2607v.f14145b && this.f14146c == c2607v.f14146c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14144a), Short.valueOf(this.f14145b), Short.valueOf(this.f14146c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f14144a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f14145b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f14146c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
