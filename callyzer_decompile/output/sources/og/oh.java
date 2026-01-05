package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class oh extends AbstractC7149a {
    public static final Parcelable.Creator<oh> CREATOR = new C5360a(26);

    /* renamed from: a */
    public final String f26711a;

    /* renamed from: b */
    public final String f26712b;

    /* renamed from: c */
    public final int f26713c;

    public oh(String str, String str2, int i10) {
        this.f26711a = str;
        this.f26712b = str2;
        this.f26713c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f26711a);
        AbstractC5932m.m11778f(parcel, 2, this.f26712b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f26713c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
