package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p001o.he1;

/* loaded from: classes2.dex */
public class ObservableDouble extends he1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new C2045a();

    /* renamed from: b */
    public double f7209b;

    /* renamed from: androidx.databinding.ObservableDouble$a */
    public class C2045a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableDouble[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    public ObservableDouble(double d) {
        this.f7209b = d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f7209b);
    }
}
