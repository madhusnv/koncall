package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import cg.BinderC0969b;
import cg.InterfaceC0968a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1336z extends AbstractBinderC1330t implements a0 {
    public static a0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof a0 ? (a0) iInterfaceQueryLocalInterface : new C1335y(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1330t
    /* renamed from: d */
    public final boolean mo3969d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        InterfaceC0968a interfaceC0968aM2726R = BinderC0969b.m2726R(parcel.readStrongBinder());
        C1331u c1331u = (C1331u) e0.m3829a(parcel, C1331u.CREATOR);
        e0.m3830b(parcel);
        InterfaceC1334x interfaceC1334xNewBarcodeScanner = newBarcodeScanner(interfaceC0968aM2726R, c1331u);
        parcel2.writeNoException();
        if (interfaceC1334xNewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
            return true;
        }
        parcel2.writeStrongBinder(interfaceC1334xNewBarcodeScanner.asBinder());
        return true;
    }
}
