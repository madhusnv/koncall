package sf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import lf.C4462m;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.n */
/* loaded from: classes.dex */
public final class C6828n extends AbstractC7149a {
    public static final Parcelable.Creator<C6828n> CREATOR = new C4462m(24);

    /* renamed from: a */
    public final int f32474a;

    /* renamed from: b */
    public List f32475b;

    public C6828n(List list, int i10) {
        this.f32474a = i10;
        this.f32475b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f32474a);
        AbstractC5932m.m11782j(parcel, 2, this.f32475b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
