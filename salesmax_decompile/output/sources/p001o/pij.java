package p001o;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class pij extends yhj implements tij {
    public static tij M0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return iInterfaceQueryLocalInterface instanceof tij ? (tij) iInterfaceQueryLocalInterface : new iij(iBinder);
    }
}
