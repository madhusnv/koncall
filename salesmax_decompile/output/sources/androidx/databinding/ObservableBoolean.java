package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import p001o.he1;

/* loaded from: classes2.dex */
public class ObservableBoolean extends he1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new C2042a();

    /* renamed from: b */
    public boolean f7206b;

    /* renamed from: androidx.databinding.ObservableBoolean$a */
    public class C2042a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            return new ObservableBoolean(parcel.readInt() == 1);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    public ObservableBoolean(boolean z) {
        this.f7206b = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public boolean m5959i() {
        return this.f7206b;
    }

    /* renamed from: j */
    public void m5960j(boolean z) {
        if (z != this.f7206b) {
            this.f7206b = z;
            m28508g();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7206b ? 1 : 0);
    }
}
