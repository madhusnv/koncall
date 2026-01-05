package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e6 extends AbstractC7149a {
    public static final Parcelable.Creator<e6> CREATOR = new C5360a(14);

    /* renamed from: a */
    public ha f26398a;

    /* renamed from: b */
    public String f26399b;

    /* renamed from: c */
    public String f26400c;

    /* renamed from: d */
    public ib[] f26401d;

    /* renamed from: e */
    public g8[] f26402e;

    /* renamed from: f */
    public String[] f26403f;

    /* renamed from: g */
    public b3[] f26404g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 2, this.f26398a, i10);
        AbstractC5932m.m11778f(parcel, 3, this.f26399b);
        AbstractC5932m.m11778f(parcel, 4, this.f26400c);
        AbstractC5932m.m11781i(parcel, 5, this.f26401d, i10);
        AbstractC5932m.m11781i(parcel, 6, this.f26402e, i10);
        AbstractC5932m.m11779g(parcel, 7, this.f26403f);
        AbstractC5932m.m11781i(parcel, 8, this.f26404g, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
