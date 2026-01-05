package sf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import lf.C4462m;
import pf.C5904d;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC7149a {
    public static final Parcelable.Creator<f0> CREATOR = new C4462m(29);

    /* renamed from: a */
    public Bundle f32410a;

    /* renamed from: b */
    public C5904d[] f32411b;

    /* renamed from: c */
    public int f32412c;

    /* renamed from: d */
    public C6820f f32413d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11774b(parcel, 1, this.f32410a);
        AbstractC5932m.m11781i(parcel, 2, this.f32411b, i10);
        int i11 = this.f32412c;
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(i11);
        AbstractC5932m.m11777e(parcel, 4, this.f32413d, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
