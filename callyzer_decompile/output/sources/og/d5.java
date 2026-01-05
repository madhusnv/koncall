package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d5 extends AbstractC7149a {
    public static final Parcelable.Creator<d5> CREATOR = new C5360a(12);

    /* renamed from: a */
    public String f26370a;

    /* renamed from: b */
    public String f26371b;

    /* renamed from: c */
    public String f26372c;

    /* renamed from: d */
    public String f26373d;

    /* renamed from: e */
    public String f26374e;

    /* renamed from: f */
    public c4 f26375f;

    /* renamed from: g */
    public c4 f26376g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f26370a);
        AbstractC5932m.m11778f(parcel, 3, this.f26371b);
        AbstractC5932m.m11778f(parcel, 4, this.f26372c);
        AbstractC5932m.m11778f(parcel, 5, this.f26373d);
        AbstractC5932m.m11778f(parcel, 6, this.f26374e);
        AbstractC5932m.m11777e(parcel, 7, this.f26375f, i10);
        AbstractC5932m.m11777e(parcel, 8, this.f26376g, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
