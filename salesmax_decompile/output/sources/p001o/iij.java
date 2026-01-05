package p001o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class iij extends lhj implements tij {
    public iij(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.tij
    public final void x0(String str, Bundle bundle, zij zijVar) {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        dij.m23323c(parcelL0, bundle);
        parcelL0.writeStrongBinder(zijVar);
        M0(2, parcelL0);
    }
}
