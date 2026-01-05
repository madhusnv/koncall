package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaf {
    private static final Logger zza = new Logger("CastDynamiteModule");

    public static com.google.android.gms.cast.framework.zzz zza(Context context, CastOptions castOptions, zzal zzalVar, Map map) {
        return zzf(context).zze(ObjectWrapper.wrap(context.getApplicationContext()), castOptions, zzalVar, map);
    }

    public static com.google.android.gms.cast.framework.zzac zzb(Context context, CastOptions castOptions, IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.zzw zzwVar) {
        if (iObjectWrapper == null) {
            return null;
        }
        try {
            return zzf(context).zzf(castOptions, iObjectWrapper, zzwVar);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "newCastSessionImpl", zzaj.class.getSimpleName());
            return null;
        }
    }

    public static com.google.android.gms.cast.framework.zzaj zzc(Service service, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        if (iObjectWrapper != null && iObjectWrapper2 != null) {
            try {
                return zzf(service.getApplicationContext()).zzg(ObjectWrapper.wrap(service), iObjectWrapper, iObjectWrapper2);
            } catch (RemoteException | ModuleUnavailableException e) {
                zza.m13796d(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", zzaj.class.getSimpleName());
            }
        }
        return null;
    }

    public static com.google.android.gms.cast.framework.zzam zzd(Context context, String str, String str2, com.google.android.gms.cast.framework.zzau zzauVar) {
        try {
            return zzf(context).zzh(str, str2, zzauVar);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "newSessionImpl", zzaj.class.getSimpleName());
            return null;
        }
    }

    public static com.google.android.gms.cast.framework.media.internal.zzi zze(Context context, AsyncTask asyncTask, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return zzf(context.getApplicationContext()).zzi(ObjectWrapper.wrap(asyncTask), zzkVar, i, i2, false, 2097152L, 5, 333, TransferRecord.MAXIMUM_UPLOAD_PARTS);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", zzaj.class.getSimpleName());
            return null;
        }
    }

    private static zzaj zzf(Context context) throws ModuleUnavailableException {
        try {
            IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cast.framework.dynamite").instantiate("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderInstantiate == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof zzaj ? (zzaj) iInterfaceQueryLocalInterface : new zzai(iBinderInstantiate);
        } catch (DynamiteModule.LoadingException e) {
            throw new ModuleUnavailableException(e);
        }
    }
}
