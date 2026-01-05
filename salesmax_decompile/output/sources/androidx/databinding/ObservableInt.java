package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p001o.he1;

/* loaded from: classes2.dex */
public class ObservableInt extends he1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new C2047a();

    /* renamed from: b */
    public int f7211b;

    /* renamed from: androidx.databinding.ObservableInt$a */
    public class C2047a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableInt[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    public ObservableInt(int i) {
        this.f7211b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7211b);
    }
}
