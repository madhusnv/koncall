package of;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.a */
/* loaded from: classes.dex */
public final class C5346a extends AbstractC7149a {
    public static final Parcelable.Creator<C5346a> CREATOR = new C5348c(0);

    /* renamed from: a */
    public final Intent f26261a;

    public C5346a(Intent intent) {
        this.f26261a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f26261a, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
