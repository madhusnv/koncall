package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class dh extends AbstractC7149a {
    public static final Parcelable.Creator<dh> CREATOR = new C5360a(13);

    /* renamed from: a */
    public final int f26383a;

    /* renamed from: b */
    public final String[] f26384b;

    public dh(String[] strArr, int i10) {
        this.f26383a = i10;
        this.f26384b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f26383a);
        AbstractC5932m.m11779g(parcel, 2, this.f26384b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
