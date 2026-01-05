package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzg extends zzb {
    public static final Parcelable.Creator<zzg> CREATOR = new C11541b();

    public zzg(Uri uri) {
        super(uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo15795a(), i);
    }
}
