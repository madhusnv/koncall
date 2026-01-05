package gg;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.Arrays;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC7149a {
    public static final Parcelable.Creator<i0> CREATOR = new C0220a(20);

    /* renamed from: a */
    public final boolean f14113a;

    public i0(boolean z6) {
        this.f14113a = Boolean.valueOf(z6).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && this.f14113a == ((i0) obj).f14113a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14113a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f14113a ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
