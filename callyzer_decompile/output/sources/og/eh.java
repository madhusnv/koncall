package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class eh extends AbstractC7149a {
    public static final Parcelable.Creator<eh> CREATOR = new C5360a(16);

    /* renamed from: a */
    public final int f26410a;

    /* renamed from: b */
    public final int f26411b;

    /* renamed from: c */
    public final int f26412c;

    /* renamed from: d */
    public final int f26413d;

    /* renamed from: e */
    public final int f26414e;

    /* renamed from: f */
    public final int f26415f;

    /* renamed from: g */
    public final boolean f26416g;

    /* renamed from: h */
    public final String f26417h;

    public eh(String str, int i10, int i11, int i12, int i13, boolean z6, int i14, int i15) {
        this.f26410a = i10;
        this.f26411b = i11;
        this.f26412c = i12;
        this.f26413d = i13;
        this.f26414e = i14;
        this.f26415f = i15;
        this.f26416g = z6;
        this.f26417h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f26410a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f26411b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f26412c);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f26413d);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f26414e);
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(this.f26415f);
        AbstractC5932m.m11785m(parcel, 7, 4);
        parcel.writeInt(this.f26416g ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 8, this.f26417h);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
