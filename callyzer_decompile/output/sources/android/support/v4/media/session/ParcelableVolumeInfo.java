package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0220a(7);

    /* renamed from: a */
    public int f1652a;

    /* renamed from: b */
    public int f1653b;

    /* renamed from: c */
    public int f1654c;

    /* renamed from: d */
    public int f1655d;

    /* renamed from: e */
    public int f1656e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1652a);
        parcel.writeInt(this.f1654c);
        parcel.writeInt(this.f1655d);
        parcel.writeInt(this.f1656e);
        parcel.writeInt(this.f1653b);
    }
}
