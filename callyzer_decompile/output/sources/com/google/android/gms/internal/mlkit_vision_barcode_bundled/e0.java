package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e0 {
    static {
        e0.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m3829a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m3830b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC4801l.m9730d(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
