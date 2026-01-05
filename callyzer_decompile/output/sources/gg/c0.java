package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC7149a {
    public static final Parcelable.Creator<c0> CREATOR = new b0(3);

    /* renamed from: a */
    public final String f14092a;

    public c0(String str) {
        this.f14092a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return AbstractC6840z.m13040k(this.f14092a, ((c0) obj).f14092a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14092a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f14092a);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
