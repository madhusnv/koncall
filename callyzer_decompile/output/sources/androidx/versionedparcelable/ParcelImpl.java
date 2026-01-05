package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import lf.C4462m;
import r8.C6485b;
import r8.InterfaceC6486c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C4462m(23);

    /* renamed from: a */
    public final InterfaceC6486c f2862a;

    public ParcelImpl(Parcel parcel) {
        this.f2862a = new C6485b(parcel).m12492h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new C6485b(parcel).m12495k(this.f2862a);
    }
}
