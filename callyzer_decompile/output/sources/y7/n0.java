package y7;

import android.os.Parcel;
import android.os.Parcelable;
import l6.AbstractC4400b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends AbstractC4400b {
    public static final Parcelable.Creator<n0> CREATOR = new androidx.fragment.app.h0(8);

    /* renamed from: c */
    public Parcelable f41723c;

    public n0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f41723c = parcel.readParcelable(classLoader == null ? f0.class.getClassLoader() : classLoader);
    }

    @Override // l6.AbstractC4400b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f41723c, 0);
    }
}
