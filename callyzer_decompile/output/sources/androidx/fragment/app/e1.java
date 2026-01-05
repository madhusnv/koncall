package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 implements Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new C0220a(11);

    /* renamed from: a */
    public String f2503a;

    /* renamed from: b */
    public int f2504b;

    public e1(String str, int i10) {
        this.f2503a = str;
        this.f2504b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2503a);
        parcel.writeInt(this.f2504b);
    }
}
