package gg;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.y */
/* loaded from: classes.dex */
public final class C2610y extends AbstractC7149a {
    public static final Parcelable.Creator<C2610y> CREATOR = new C0220a(24);

    /* renamed from: a */
    public final String f14149a;

    public C2610y(String str) {
        AbstractC6840z.m13036g(str);
        this.f14149a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2610y) {
            return this.f14149a.equals(((C2610y) obj).f14149a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14149a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f14149a);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
