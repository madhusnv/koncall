package p001o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public abstract class mgj {
    static {
        mgj.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m39038a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m39039b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
