package tq;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import sf.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.d */
/* loaded from: classes3.dex */
public final class C7192d extends AbstractC7201m {

    /* renamed from: e */
    public static final C7192d f34482e = new C7192d(R.string.deleted, R.drawable.ic_call_recording_delete, 4, false);
    public static final Parcelable.Creator<C7192d> CREATOR = new g0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7192d);
    }

    public final int hashCode() {
        return 925510839;
    }

    public final String toString() {
        return "CallRecordingDeleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
