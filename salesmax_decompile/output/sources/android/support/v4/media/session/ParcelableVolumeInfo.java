package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C1726a();

    /* renamed from: a */
    public int f5199a;

    /* renamed from: b */
    public int f5200b;

    /* renamed from: c */
    public int f5201c;

    /* renamed from: d */
    public int f5202d;

    /* renamed from: e */
    public int f5203e;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public class C1726a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f5199a = parcel.readInt();
        this.f5201c = parcel.readInt();
        this.f5202d = parcel.readInt();
        this.f5203e = parcel.readInt();
        this.f5200b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5199a);
        parcel.writeInt(this.f5201c);
        parcel.writeInt(this.f5202d);
        parcel.writeInt(this.f5203e);
        parcel.writeInt(this.f5200b);
    }
}
