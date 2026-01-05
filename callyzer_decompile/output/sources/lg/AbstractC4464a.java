package lg;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lg.a */
/* loaded from: classes.dex */
public abstract class AbstractC4464a {

    /* renamed from: a */
    public static final /* synthetic */ int f22226a = 0;

    static {
        AbstractC4464a.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m9309a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m9310b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC4801l.m9730d(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* renamed from: c */
    public static void m9311c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
