package sf;

import android.os.Parcel;
import android.os.Parcelable;
import lf.C4462m;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.m */
/* loaded from: classes.dex */
public final class C6827m extends AbstractC7149a {
    public static final Parcelable.Creator<C6827m> CREATOR = new C4462m(28);

    /* renamed from: a */
    public final int f32469a;

    /* renamed from: b */
    public final boolean f32470b;

    /* renamed from: c */
    public final boolean f32471c;

    /* renamed from: d */
    public final int f32472d;

    /* renamed from: e */
    public final int f32473e;

    public C6827m(int i10, boolean z6, boolean z10, int i11, int i12) {
        this.f32469a = i10;
        this.f32470b = z6;
        this.f32471c = z10;
        this.f32472d = i11;
        this.f32473e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f32469a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f32470b ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f32471c ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f32472d);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f32473e);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
