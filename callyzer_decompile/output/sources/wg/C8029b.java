package wg;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import pg.AbstractC5932m;
import qf.InterfaceC6211j;
import sf.g0;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wg.b */
/* loaded from: classes.dex */
public final class C8029b extends AbstractC7149a implements InterfaceC6211j {
    public static final Parcelable.Creator<C8029b> CREATOR = new g0(28);

    /* renamed from: a */
    public final int f38551a;

    /* renamed from: b */
    public final int f38552b;

    /* renamed from: c */
    public final Intent f38553c;

    public C8029b(int i10, int i11, Intent intent) {
        this.f38551a = i10;
        this.f38552b = i11;
        this.f38553c = intent;
    }

    @Override // qf.InterfaceC6211j
    /* renamed from: a */
    public final Status mo3091a() {
        return this.f38552b == 0 ? Status.f6002e : Status.f6006j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f38551a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f38552b);
        AbstractC5932m.m11777e(parcel, 3, this.f38553c, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
