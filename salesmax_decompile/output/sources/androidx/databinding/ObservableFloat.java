package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p001o.he1;

/* loaded from: classes2.dex */
public class ObservableFloat extends he1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new C2046a();

    /* renamed from: b */
    public float f7210b;

    /* renamed from: androidx.databinding.ObservableFloat$a */
    public class C2046a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    public ObservableFloat(float f) {
        this.f7210b = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7210b);
    }
}
