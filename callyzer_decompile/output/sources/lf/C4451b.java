package lf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.b */
/* loaded from: classes.dex */
public final class C4451b extends AbstractC7149a {
    public static final Parcelable.Creator<C4451b> CREATOR = new C4462m(1);

    /* renamed from: a */
    public final boolean f22189a;

    /* renamed from: b */
    public final String f22190b;

    public C4451b(boolean z6, String str) {
        if (z6) {
            AbstractC6840z.m13036g(str);
        }
        this.f22189a = z6;
        this.f22190b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4451b)) {
            return false;
        }
        C4451b c4451b = (C4451b) obj;
        return this.f22189a == c4451b.f22189a && AbstractC6840z.m13040k(this.f22190b, c4451b.f22190b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f22189a), this.f22190b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f22189a ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 2, this.f22190b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
