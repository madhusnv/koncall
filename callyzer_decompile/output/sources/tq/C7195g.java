package tq;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import sf.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.g */
/* loaded from: classes3.dex */
public final class C7195g extends AbstractC7201m {

    /* renamed from: e */
    public static final C7195g f34485e = new C7195g(R.string.play, R.drawable.ic_recording_play, 4, false);
    public static final Parcelable.Creator<C7195g> CREATOR = new g0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7195g);
    }

    public final int hashCode() {
        return 1854997334;
    }

    public final String toString() {
        return "CallRecordingPlay";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
