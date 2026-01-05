package lf;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import gg.b0;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.f */
/* loaded from: classes.dex */
public final class C4455f extends AbstractC7149a {
    public static final Parcelable.Creator<C4455f> CREATOR = new b0(28);

    /* renamed from: a */
    public final PendingIntent f22203a;

    public C4455f(PendingIntent pendingIntent) {
        AbstractC6840z.m13036g(pendingIntent);
        this.f22203a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f22203a, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
