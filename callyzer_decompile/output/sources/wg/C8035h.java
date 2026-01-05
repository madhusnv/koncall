package wg;

import android.os.Parcel;
import android.os.Parcelable;
import pf.C5902b;
import pg.AbstractC5932m;
import sf.C6833s;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wg.h */
/* loaded from: classes.dex */
public final class C8035h extends AbstractC7149a {
    public static final Parcelable.Creator<C8035h> CREATOR = new C8034g(1);

    /* renamed from: a */
    public final int f38559a;

    /* renamed from: b */
    public final C5902b f38560b;

    /* renamed from: c */
    public final C6833s f38561c;

    public C8035h(int i10, C5902b c5902b, C6833s c6833s) {
        this.f38559a = i10;
        this.f38560b = c5902b;
        this.f38561c = c6833s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f38559a);
        AbstractC5932m.m11777e(parcel, 2, this.f38560b, i10);
        AbstractC5932m.m11777e(parcel, 3, this.f38561c, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
