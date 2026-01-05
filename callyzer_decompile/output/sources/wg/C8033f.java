package wg;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import sf.C6832r;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wg.f */
/* loaded from: classes.dex */
public final class C8033f extends AbstractC7149a {
    public static final Parcelable.Creator<C8033f> CREATOR = new C8034g(0);

    /* renamed from: a */
    public final int f38556a;

    /* renamed from: b */
    public final C6832r f38557b;

    public C8033f(int i10, C6832r c6832r) {
        this.f38556a = i10;
        this.f38557b = c6832r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f38556a);
        AbstractC5932m.m11777e(parcel, 2, this.f38557b, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
