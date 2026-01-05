package og;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.b */
/* loaded from: classes.dex */
public final class C5361b extends AbstractC7149a {
    public static final Parcelable.Creator<C5361b> CREATOR = new C5360a(7);

    /* renamed from: a */
    public int f26326a;

    /* renamed from: b */
    public boolean f26327b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5361b)) {
            return false;
        }
        C5361b c5361b = (C5361b) obj;
        return this.f26326a == c5361b.f26326a && AbstractC6840z.m13040k(Boolean.valueOf(this.f26327b), Boolean.valueOf(c5361b.f26327b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26326a), Boolean.valueOf(this.f26327b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int i11 = this.f26326a;
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(i11);
        boolean z6 = this.f26327b;
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(z6 ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
