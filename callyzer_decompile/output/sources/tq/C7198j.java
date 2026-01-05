package tq;

import android.os.Parcel;
import android.os.Parcelable;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import sf.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.j */
/* loaded from: classes3.dex */
public final class C7198j extends AbstractC7201m {

    /* renamed from: e */
    public static final C7198j f34488e = new C7198j(R.string.message, R.drawable.ic_messanger, 6, false);
    public static final Parcelable.Creator<C7198j> CREATOR = new g0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7198j);
    }

    public final int hashCode() {
        return 1727082262;
    }

    public final String toString() {
        return "Message";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(1);
    }
}
