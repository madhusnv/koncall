package xf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import pf.C5904d;
import pg.AbstractC5931l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xf.c */
/* loaded from: classes.dex */
public final class C8368c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM11754s = AbstractC5931l.m11754s(parcel);
        ArrayList arrayListM11745j = null;
        String strM11741f = null;
        boolean zM11747l = false;
        String strM11741f2 = null;
        while (parcel.dataPosition() < iM11754s) {
            int i10 = parcel.readInt();
            char c2 = (char) i10;
            if (c2 == 1) {
                arrayListM11745j = AbstractC5931l.m11745j(parcel, i10, C5904d.CREATOR);
            } else if (c2 == 2) {
                zM11747l = AbstractC5931l.m11747l(parcel, i10);
            } else if (c2 == 3) {
                strM11741f2 = AbstractC5931l.m11741f(parcel, i10);
            } else if (c2 != 4) {
                AbstractC5931l.m11753r(parcel, i10);
            } else {
                strM11741f = AbstractC5931l.m11741f(parcel, i10);
            }
        }
        AbstractC5931l.m11746k(parcel, iM11754s);
        return new C8366a(arrayListM11745j, zM11747l, strM11741f2, strM11741f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8366a[i10];
    }
}
