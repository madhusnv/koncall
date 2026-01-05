package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ih extends AbstractC7149a {
    public static final Parcelable.Creator<ih> CREATOR = new C5360a(20);

    /* renamed from: a */
    public final int f26544a;

    /* renamed from: b */
    public final String f26545b;

    /* renamed from: c */
    public final String f26546c;

    /* renamed from: d */
    public final String f26547d;

    public ih(String str, int i10, String str2, String str3) {
        this.f26544a = i10;
        this.f26545b = str;
        this.f26546c = str2;
        this.f26547d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f26544a);
        AbstractC5932m.m11778f(parcel, 2, this.f26545b);
        AbstractC5932m.m11778f(parcel, 3, this.f26546c);
        AbstractC5932m.m11778f(parcel, 4, this.f26547d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
