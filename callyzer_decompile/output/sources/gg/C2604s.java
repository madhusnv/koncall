package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.s */
/* loaded from: classes.dex */
public final class C2604s extends AbstractC7149a {
    public static final Parcelable.Creator<C2604s> CREATOR = new b0(6);

    /* renamed from: a */
    public final boolean f14142a;

    public C2604s(boolean z6) {
        this.f14142a = z6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2604s) && this.f14142a == ((C2604s) obj).f14142a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14142a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f14142a ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
