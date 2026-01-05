package lf;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.i */
/* loaded from: classes.dex */
public final class C4458i extends AbstractC7149a {
    public static final Parcelable.Creator<C4458i> CREATOR = new C4462m(5);

    /* renamed from: a */
    public final PendingIntent f22213a;

    public C4458i(PendingIntent pendingIntent) {
        AbstractC6840z.m13036g(pendingIntent);
        this.f22213a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4458i) {
            return AbstractC6840z.m13040k(this.f22213a, ((C4458i) obj).f22213a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22213a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f22213a, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
