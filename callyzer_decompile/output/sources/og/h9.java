package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h9 extends AbstractC7149a {
    public static final Parcelable.Creator<h9> CREATOR = new C5360a(1);

    /* renamed from: a */
    public double f26496a;

    /* renamed from: b */
    public double f26497b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        double d2 = this.f26496a;
        AbstractC5932m.m11785m(parcel, 2, 8);
        parcel.writeDouble(d2);
        double d10 = this.f26497b;
        AbstractC5932m.m11785m(parcel, 3, 8);
        parcel.writeDouble(d10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
