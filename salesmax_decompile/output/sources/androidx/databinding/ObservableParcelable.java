package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.t7c;

/* loaded from: classes2.dex */
public class ObservableParcelable<T extends Parcelable> extends t7c implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new C2049a();

    /* renamed from: androidx.databinding.ObservableParcelable$a */
    public class C2049a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    public ObservableParcelable(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) get(), 0);
    }
}
