package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.g */
/* loaded from: classes.dex */
public final class C5366g extends AbstractC7149a {
    public static final Parcelable.Creator<C5366g> CREATOR = new C5360a(8);

    /* renamed from: a */
    public int f26449a;

    /* renamed from: b */
    public final int f26450b;

    /* renamed from: c */
    public final int f26451c;

    /* renamed from: d */
    public final long f26452d;

    /* renamed from: e */
    public final int f26453e;

    public C5366g(int i10, int i11, int i12, int i13, long j6) {
        this.f26449a = i10;
        this.f26450b = i11;
        this.f26451c = i12;
        this.f26452d = j6;
        this.f26453e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int i11 = this.f26449a;
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f26450b);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f26451c);
        AbstractC5932m.m11785m(parcel, 5, 8);
        parcel.writeLong(this.f26452d);
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(this.f26453e);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
