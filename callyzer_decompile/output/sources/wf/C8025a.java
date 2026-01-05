package wf;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import sf.g0;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wf.a */
/* loaded from: classes.dex */
public final class C8025a extends AbstractC7149a {
    public static final Parcelable.Creator<C8025a> CREATOR = new g0(25);

    /* renamed from: a */
    public final boolean f38542a;

    /* renamed from: b */
    public final int f38543b;

    public C8025a(boolean z6, int i10) {
        this.f38542a = z6;
        this.f38543b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f38542a ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f38543b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
