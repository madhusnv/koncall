package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(Context context) {
        return initialize(context, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: RemoteException -> 0x0053, all -> 0x0073, TryCatch #0 {RemoteException -> 0x0053, blocks: (B:20:0x0042, B:22:0x0048, B:23:0x004c), top: B:40:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0018, B:9:0x001e, B:10:0x0022, B:12:0x0031, B:14:0x0036, B:20:0x0042, B:22:0x0048, B:23:0x004c, B:24:0x0053, B:26:0x0060, B:30:0x0068, B:31:0x006d, B:33:0x006f), top: B:42:0x0003, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int initialize(Context context, Renderer renderer, OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        Preconditions.checkNotNull(context, "Context is null");
        "preferredRenderer: ".concat(String.valueOf(renderer));
        if (!zzb) {
            try {
                com.google.android.gms.maps.internal.zzf zzfVarZza = zzcc.zza(context, renderer);
                try {
                    CameraUpdateFactory.zza(zzfVarZza.zze());
                    BitmapDescriptorFactory.zza(zzfVarZza.zzj());
                    int i = 1;
                    zzb = true;
                    if (renderer == null) {
                        i = 0;
                        try {
                            if (zzfVarZza.zzd() == 2) {
                                zzc = Renderer.LATEST;
                            }
                            zzfVarZza.zzl(ObjectWrapper.wrap(context), i);
                        } catch (RemoteException unused) {
                        }
                        "loadedRenderer: ".concat(String.valueOf(zzc));
                        if (onMapsSdkInitializedCallback != null) {
                            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                        }
                    } else {
                        int iOrdinal = renderer.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                i = 2;
                            }
                        }
                        if (zzfVarZza.zzd() == 2) {
                        }
                        zzfVarZza.zzl(ObjectWrapper.wrap(context), i);
                        "loadedRenderer: ".concat(String.valueOf(zzc));
                        if (onMapsSdkInitializedCallback != null) {
                        }
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.errorCode;
            }
        } else if (onMapsSdkInitializedCallback != null) {
            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
        }
        return 0;
    }
}
