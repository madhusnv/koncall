package ug;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.i */
/* loaded from: classes.dex */
public final class C7438i extends AbstractC7149a {
    public static final Parcelable.Creator<C7438i> CREATOR = new sf.g0(16);

    /* renamed from: a */
    public final Bundle f35509a;

    public C7438i(Bundle bundle) {
        this.f35509a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11774b(parcel, 1, this.f35509a);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
