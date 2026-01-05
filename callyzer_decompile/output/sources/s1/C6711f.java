package s1;

import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.f */
/* loaded from: classes.dex */
public final class C6711f implements Parcelable {
    public static final Parcelable.Creator<C6711f> CREATOR = new C6710e();

    /* renamed from: a */
    public final int f32064a;

    public C6711f(int i10) {
        this.f32064a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6711f) && this.f32064a == ((C6711f) obj).f32064a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32064a);
    }

    public final String toString() {
        return AbstractC1452a.m4563j(new StringBuilder("DefaultLazyKey(index="), this.f32064a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32064a);
    }
}
