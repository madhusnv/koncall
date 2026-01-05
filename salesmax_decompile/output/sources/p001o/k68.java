package p001o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public interface k68 extends IInterface {

    /* renamed from: o.k68$a */
    public static abstract class AbstractBinderC14718a extends lgj implements k68 {

        /* renamed from: o.k68$a$a */
        public static class a extends kgj implements k68 {
            public a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p001o.k68
            /* renamed from: u */
            public final Bundle mo35035u(Bundle bundle) {
                Parcel parcelL0 = L0();
                mgj.m39039b(parcelL0, bundle);
                Parcel parcelM0 = M0(parcelL0);
                Bundle bundle2 = (Bundle) mgj.m39038a(parcelM0, Bundle.CREATOR);
                parcelM0.recycle();
                return bundle2;
            }
        }

        public static k68 L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof k68 ? (k68) iInterfaceQueryLocalInterface : new a(iBinder);
        }
    }

    /* renamed from: u */
    Bundle mo35035u(Bundle bundle);
}
