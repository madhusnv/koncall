package l6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.h0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l6.b */
/* loaded from: classes.dex */
public abstract class AbstractC4400b implements Parcelable {

    /* renamed from: a */
    public final Parcelable f21992a;

    /* renamed from: b */
    public static final C4399a f21991b = new C4399a();
    public static final Parcelable.Creator<AbstractC4400b> CREATOR = new h0(3);

    public AbstractC4400b() {
        this.f21992a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f21992a, i10);
    }

    public AbstractC4400b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f21992a = parcelable == f21991b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC4400b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f21992a = parcelable == null ? f21991b : parcelable;
    }
}
