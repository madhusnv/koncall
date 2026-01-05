package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.Data;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public class ParcelableUpdateRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableUpdateRequest> CREATOR = new Parcelable.Creator<ParcelableUpdateRequest>() { // from class: androidx.work.multiprocess.parcelable.ParcelableUpdateRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableUpdateRequest createFromParcel(Parcel parcel) {
            return new ParcelableUpdateRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableUpdateRequest[] newArray(int i) {
            return new ParcelableUpdateRequest[i];
        }
    };
    private final String mId;
    private final ParcelableData mParcelableData;

    public ParcelableUpdateRequest(UUID uuid, Data data) {
        this.mId = uuid.toString();
        this.mParcelableData = new ParcelableData(data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Data getData() {
        return this.mParcelableData.getData();
    }

    public String getId() {
        return this.mId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        this.mParcelableData.writeToParcel(parcel, i);
    }

    public ParcelableUpdateRequest(Parcel parcel) {
        this.mId = parcel.readString();
        this.mParcelableData = new ParcelableData(parcel);
    }
}
