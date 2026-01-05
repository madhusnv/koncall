package of;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5931l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.c */
/* loaded from: classes.dex */
public final class C5348c implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f26272a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f26272a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        AbstractC5931l.m11753r(parcel, i10);
                    } else {
                        intent = (Intent) AbstractC5931l.m11740e(parcel, i10, Intent.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new C5346a(intent);
            default:
                return new C5352g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f26272a) {
            case 0:
                return new C5346a[i10];
            default:
                return new C5352g[i10];
        }
    }
}
