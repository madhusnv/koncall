package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzi extends zzc {
    public static final Parcelable.Creator<zzi> CREATOR = new C11542c();

    public zzi(Uri uri, int i) {
        super(uri, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo15797b(), i);
        parcel.writeInt(mo15796a());
    }
}
