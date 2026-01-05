package tq;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import sf.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.h */
/* loaded from: classes3.dex */
public final class C7196h extends AbstractC7201m {

    /* renamed from: e */
    public static final C7196h f34486e = new C7196h(R.string.uploading, R.drawable.ic_gif_uploading, 4, true);
    public static final Parcelable.Creator<C7196h> CREATOR = new g0(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7196h);
    }

    public final int hashCode() {
        return 1955498847;
    }

    public final String toString() {
        return "CallRecordingUploading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
