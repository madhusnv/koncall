package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c4 extends AbstractC7149a {
    public static final Parcelable.Creator<c4> CREATOR = new C5360a(11);

    /* renamed from: a */
    public int f26347a;

    /* renamed from: b */
    public int f26348b;

    /* renamed from: c */
    public int f26349c;

    /* renamed from: d */
    public int f26350d;

    /* renamed from: e */
    public int f26351e;

    /* renamed from: f */
    public int f26352f;

    /* renamed from: g */
    public boolean f26353g;

    /* renamed from: h */
    public String f26354h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int i11 = this.f26347a;
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f26348b;
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f26349c;
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.f26350d;
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f26351e;
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f26352f;
        AbstractC5932m.m11785m(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z6 = this.f26353g;
        AbstractC5932m.m11785m(parcel, 8, 4);
        parcel.writeInt(z6 ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 9, this.f26354h);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
