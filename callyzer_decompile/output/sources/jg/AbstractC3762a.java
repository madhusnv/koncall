package jg;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jg.a */
/* loaded from: classes.dex */
public abstract class AbstractC3762a {

    /* renamed from: a */
    public static final /* synthetic */ int f19640a = 0;

    static {
        AbstractC3762a.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m8285a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m8286b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC4801l.m9730d(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* renamed from: c */
    public static void m8287c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
