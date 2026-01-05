package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public final class C0338c implements Parcelable {
    public static final Parcelable.Creator<C0338c> CREATOR = new C0220a(10);

    /* renamed from: a */
    public final ArrayList f2480a;

    /* renamed from: b */
    public final ArrayList f2481b;

    public C0338c(ArrayList arrayList, ArrayList arrayList2) {
        this.f2480a = arrayList;
        this.f2481b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2480a);
        parcel.writeTypedList(this.f2481b);
    }

    public C0338c(Parcel parcel) {
        this.f2480a = parcel.createStringArrayList();
        this.f2481b = parcel.createTypedArrayList(C0337b.CREATOR);
    }
}
