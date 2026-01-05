package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p001o.he1;

/* loaded from: classes2.dex */
public class ObservableChar extends he1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new C2044a();

    /* renamed from: b */
    public char f7208b;

    /* renamed from: androidx.databinding.ObservableChar$a */
    public class C2044a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    public ObservableChar(char c) {
        this.f7208b = c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7208b);
    }
}
