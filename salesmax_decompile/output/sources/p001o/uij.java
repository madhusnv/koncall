package p001o;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class uij extends yhj implements zij {
    public uij() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // p001o.yhj
    public final boolean L0(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Bundle bundle = (Bundle) dij.m23321a(parcel, Bundle.CREATOR);
            dij.m23322b(parcel);
            s0(bundle);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) dij.m23321a(parcel, Bundle.CREATOR);
        dij.m23322b(parcel);
        zzb(bundle2);
        return true;
    }
}
