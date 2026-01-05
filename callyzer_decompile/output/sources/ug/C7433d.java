package ug;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.d */
/* loaded from: classes.dex */
public final class C7433d extends AbstractC7149a {
    public static final Parcelable.Creator<C7433d> CREATOR = new sf.g0(14);

    /* renamed from: a */
    public final long f35323a;

    /* renamed from: b */
    public final int f35324b;

    /* renamed from: c */
    public final long f35325c;

    public C7433d(int i10, long j6, long j10) {
        this.f35323a = j6;
        this.f35324b = i10;
        this.f35325c = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 8);
        parcel.writeLong(this.f35323a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f35324b);
        AbstractC5932m.m11785m(parcel, 3, 8);
        parcel.writeLong(this.f35325c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
