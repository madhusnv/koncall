package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g8 extends AbstractC7149a {
    public static final Parcelable.Creator<g8> CREATOR = new C5360a(0);

    /* renamed from: a */
    public int f26463a;

    /* renamed from: b */
    public String f26464b;

    /* renamed from: c */
    public String f26465c;

    /* renamed from: d */
    public String f26466d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int i11 = this.f26463a;
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC5932m.m11778f(parcel, 3, this.f26464b);
        AbstractC5932m.m11778f(parcel, 4, this.f26465c);
        AbstractC5932m.m11778f(parcel, 5, this.f26466d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
