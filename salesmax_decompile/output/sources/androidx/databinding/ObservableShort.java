package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p001o.he1;

/* loaded from: classes2.dex */
public class ObservableShort extends he1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new C2050a();

    /* renamed from: b */
    public short f7213b;

    /* renamed from: androidx.databinding.ObservableShort$a */
    public class C2050a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableShort[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    public ObservableShort(short s) {
        this.f7213b = s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7213b);
    }
}
