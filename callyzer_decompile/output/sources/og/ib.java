package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ib extends AbstractC7149a {
    public static final Parcelable.Creator<ib> CREATOR = new C5360a(3);

    /* renamed from: a */
    public int f26539a;

    /* renamed from: b */
    public String f26540b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int i11 = this.f26539a;
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC5932m.m11778f(parcel, 3, this.f26540b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
