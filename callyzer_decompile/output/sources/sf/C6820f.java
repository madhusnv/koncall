package sf;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.f */
/* loaded from: classes.dex */
public final class C6820f extends AbstractC7149a {
    public static final Parcelable.Creator<C6820f> CREATOR = new g0(0);

    /* renamed from: a */
    public final C6827m f32404a;

    /* renamed from: b */
    public final boolean f32405b;

    /* renamed from: c */
    public final boolean f32406c;

    /* renamed from: d */
    public final int[] f32407d;

    /* renamed from: e */
    public final int f32408e;

    /* renamed from: f */
    public final int[] f32409f;

    public C6820f(C6827m c6827m, boolean z6, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f32404a = c6827m;
        this.f32405b = z6;
        this.f32406c = z10;
        this.f32407d = iArr;
        this.f32408e = i10;
        this.f32409f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f32404a, i10);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f32405b ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f32406c ? 1 : 0);
        int[] iArr = this.f32407d;
        if (iArr != null) {
            int iM11783k2 = AbstractC5932m.m11783k(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC5932m.m11784l(parcel, iM11783k2);
        }
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f32408e);
        int[] iArr2 = this.f32409f;
        if (iArr2 != null) {
            int iM11783k3 = AbstractC5932m.m11783k(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC5932m.m11784l(parcel, iM11783k3);
        }
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
