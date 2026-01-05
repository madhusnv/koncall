package tq;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import sf.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.i */
/* loaded from: classes3.dex */
public final class C7197i extends AbstractC7201m {

    /* renamed from: e */
    public static final C7197i f34487e = new C7197i(R.string.copy, R.drawable.ic_copy, 5, false);
    public static final Parcelable.Creator<C7197i> CREATOR = new g0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7197i);
    }

    public final int hashCode() {
        return 2081583814;
    }

    public final String toString() {
        return "Copy";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
