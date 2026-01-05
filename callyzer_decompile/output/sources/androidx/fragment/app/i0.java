package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new h0(0);

    /* renamed from: a */
    public final Bundle f2558a;

    public i0(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f2558a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f2558a);
    }
}
