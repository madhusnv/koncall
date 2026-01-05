package com.google.mlkit.vision.documentscanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import java.util.List;

/* loaded from: classes6.dex */
final class zze extends zza {
    public static final Parcelable.Creator<zze> CREATOR = new C11540a();

    public zze(List list, GmsDocumentScanningResult.Pdf pdf) {
        super(list, pdf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(mo15793b());
        parcel.writeParcelable(mo15794c(), i);
    }
}
