package tq;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import sf.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.e */
/* loaded from: classes3.dex */
public final class C7193e extends AbstractC7201m {

    /* renamed from: e */
    public static final C7193e f34483e = new C7193e(R.string.download, R.drawable.ic_recording_download, 4, false);
    public static final Parcelable.Creator<C7193e> CREATOR = new g0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7193e);
    }

    public final int hashCode() {
        return -765829206;
    }

    public final String toString() {
        return "CallRecordingDownload";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
