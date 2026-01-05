package wf;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import sf.g0;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wf.b */
/* loaded from: classes.dex */
public final class C8026b extends AbstractC7149a {
    public static final Parcelable.Creator<C8026b> CREATOR = new g0(26);

    /* renamed from: a */
    public final PendingIntent f38544a;

    public C8026b(PendingIntent pendingIntent) {
        this.f38544a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f38544a, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
