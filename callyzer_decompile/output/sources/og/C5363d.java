package og;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import cg.BinderC0969b;
import com.google.android.gms.internal.measurement.AbstractC1308x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.d */
/* loaded from: classes.dex */
public final class C5363d extends AbstractC1308x implements InterfaceC5365f {
    /* renamed from: U */
    public final C5362c m10594U(BinderC0969b binderC0969b, C5361b c5361b) {
        C5362c c5362c;
        Parcel parcelM3750Q = m3750Q();
        int i10 = AbstractC5377r.f26775a;
        parcelM3750Q.writeStrongBinder(binderC0969b);
        parcelM3750Q.writeInt(1);
        c5361b.writeToParcel(parcelM3750Q, 0);
        Parcel parcelM3751R = m3751R(parcelM3750Q, 1);
        IBinder strongBinder = parcelM3751R.readStrongBinder();
        if (strongBinder == null) {
            c5362c = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c5362c = iInterfaceQueryLocalInterface instanceof C5362c ? (C5362c) iInterfaceQueryLocalInterface : new C5362c(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 4);
        }
        parcelM3751R.recycle();
        return c5362c;
    }
}
