package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p001o.he1;

/* loaded from: classes2.dex */
public class ObservableByte extends he1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new C2043a();

    /* renamed from: b */
    public byte f7207b;

    /* renamed from: androidx.databinding.ObservableByte$a */
    public class C2043a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableByte[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    public ObservableByte(byte b) {
        this.f7207b = b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f7207b);
    }
}
