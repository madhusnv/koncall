package lf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.d */
/* loaded from: classes.dex */
public final class C4453d extends AbstractC7149a {
    public static final Parcelable.Creator<C4453d> CREATOR = new C4462m(3);

    /* renamed from: a */
    public final boolean f22194a;

    public C4453d(boolean z6) {
        this.f22194a = z6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4453d) && this.f22194a == ((C4453d) obj).f22194a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f22194a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f22194a ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
