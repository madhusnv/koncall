package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.cast.zzbf;
import com.google.android.gms.internal.cast.zzbm;
import com.google.android.gms.internal.cast.zzcx;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class CastContext {
    public static final String OPTIONS_PROVIDER_CLASS_NAME_KEY = "com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME";
    private static final Logger zzb = new Logger("CastContext");
    private static final Object zzc = new Object();
    private static volatile CastContext zzd;

    @VisibleForTesting
    final com.google.android.gms.internal.cast.zzae zza;
    private final Context zze;
    private final zzz zzf;
    private final SessionManager zzg;
    private final zzs zzh;
    private final PrecacheManager zzi;
    private final MediaNotificationManager zzj;
    private final CastOptions zzk;
    private final com.google.android.gms.cast.internal.zzn zzl;
    private final zzbf zzm;
    private final com.google.android.gms.internal.cast.zzay zzn;
    private final List zzo;
    private final zzbm zzp;
    private final zzcx zzq;
    private com.google.android.gms.internal.cast.zzah zzr;
    private CastReasonCodes zzs;

    private CastContext(Context context, CastOptions castOptions, List list, zzbf zzbfVar, final com.google.android.gms.cast.internal.zzn zznVar) {
        this.zze = context;
        this.zzk = castOptions;
        this.zzm = zzbfVar;
        this.zzl = zznVar;
        this.zzo = list;
        com.google.android.gms.internal.cast.zzay zzayVar = new com.google.android.gms.internal.cast.zzay(context);
        this.zzn = zzayVar;
        zzbm zzbmVarZzn = zzbfVar.zzn();
        this.zzp = zzbmVarZzn;
        zzk();
        try {
            zzz zzzVarZza = com.google.android.gms.internal.cast.zzaf.zza(context, castOptions, zzbfVar, zzj());
            this.zzf = zzzVarZza;
            try {
                this.zzh = new zzs(zzzVarZza.zzg());
                try {
                    SessionManager sessionManager = new SessionManager(zzzVarZza.zzh(), context);
                    this.zzg = sessionManager;
                    this.zzj = new MediaNotificationManager(sessionManager);
                    this.zzi = new PrecacheManager(castOptions, sessionManager, zznVar);
                    if (zzbmVarZzn != null) {
                        zzbmVarZzn.zzj(sessionManager);
                    }
                    this.zzq = new zzcx(context);
                    zznVar.zza(new String[]{"com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ENABLE_WIFI_WARNING"}).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzab
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            zzac.zzb((Bundle) obj);
                        }
                    });
                    com.google.android.gms.internal.cast.zzae zzaeVar = new com.google.android.gms.internal.cast.zzae();
                    this.zza = zzaeVar;
                    try {
                        zzzVarZza.zzi(zzaeVar);
                        zzaeVar.zze(zzayVar.zza);
                        if (!castOptions.zza().isEmpty()) {
                            zzb.m13799i("Setting Route Discovery for appIds: ".concat(String.valueOf(castOptions.zza())), new Object[0]);
                            zzayVar.zza(castOptions.zza());
                        }
                        zznVar.zza(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.framework.zzb
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                CastContext castContext = this.zza;
                                com.google.android.gms.internal.cast.zzf.zza(castContext.zze, castContext.zzl, castContext.zzg, castContext.zzp, castContext.zza).zzc((Bundle) obj);
                            }
                        });
                        final String[] strArr = {"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"};
                        zznVar.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.internal.zzh
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.common.api.internal.RemoteCall
                            public final void accept(Object obj, Object obj2) {
                                zzn zznVar2 = zznVar;
                                String[] strArr2 = strArr;
                                ((zzaj) ((zzo) obj).getService()).zzg(new zzm(zznVar2, (TaskCompletionSource) obj2), strArr2);
                            }
                        }).setFeatures(com.google.android.gms.cast.zzax.zzh).setAutoResolveMissingFeatures(false).setMethodKey(8427).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.framework.zzc
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                this.zza.zzh((Bundle) obj);
                            }
                        });
                        try {
                            if (zzzVarZza.zze() >= 224300000) {
                                CastButtonFactory.zzb(new zze(this));
                            }
                        } catch (RemoteException e) {
                            zzb.m13796d(e, "Unable to call %s on %s.", "clientGmsVersion", zzz.class.getSimpleName());
                        }
                    } catch (RemoteException e2) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e2);
                    }
                } catch (RemoteException e3) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e3);
                }
            } catch (RemoteException e4) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e4);
            }
        } catch (RemoteException e5) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e5);
        }
    }

    public static CastContext getSharedInstance() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return zzd;
    }

    public static CastContext zza(Context context) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return getSharedInstance(context);
        } catch (RuntimeException e) {
            zzb.m13797e("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e);
            return null;
        }
    }

    public static /* synthetic */ CastContext zzb(Context context, CastOptions castOptions, OptionsProvider optionsProvider, zzbf zzbfVar, com.google.android.gms.cast.internal.zzn zznVar) {
        synchronized (zzc) {
            if (zzd == null) {
                zzd = new CastContext(context, castOptions, optionsProvider.getAdditionalSessionProviders(context), zzbfVar, zznVar);
            }
        }
        return zzd;
    }

    private static OptionsProvider zzi(Context context) {
        try {
            Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                zzb.m13797e("Bundle is null", new Object[0]);
            }
            String string = bundle.getString(OPTIONS_PROVIDER_CLASS_NAME_KEY);
            if (string != null) {
                return (OptionsProvider) Class.forName(string).asSubclass(OptionsProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    private final Map zzj() {
        HashMap map = new HashMap();
        com.google.android.gms.internal.cast.zzah zzahVar = this.zzr;
        if (zzahVar != null) {
            map.put(zzahVar.getCategory(), zzahVar.zza());
        }
        List<SessionProvider> list = this.zzo;
        if (list != null) {
            for (SessionProvider sessionProvider : list) {
                Preconditions.checkNotNull(sessionProvider, "Additional SessionProvider must not be null.");
                String strCheckNotEmpty = Preconditions.checkNotEmpty(sessionProvider.getCategory(), "Category for SessionProvider must not be null or empty string.");
                Preconditions.checkArgument(!map.containsKey(strCheckNotEmpty), String.format("SessionProvider for category %s already added", strCheckNotEmpty));
                map.put(strCheckNotEmpty, sessionProvider.zza());
            }
        }
        return map;
    }

    private final void zzk() {
        this.zzr = !TextUtils.isEmpty(this.zzk.getReceiverApplicationId()) ? new com.google.android.gms.internal.cast.zzah(this.zze, this.zzk, this.zzm) : null;
    }

    @Deprecated
    public void addAppVisibilityListener(AppVisibilityListener appVisibilityListener) {
    }

    public void addCastStateListener(CastStateListener castStateListener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(castStateListener);
        this.zzg.zzc(castStateListener);
    }

    public void addSessionTransferCallback(SessionTransferCallback sessionTransferCallback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(sessionTransferCallback);
        zzbm zzbmVarZzn = this.zzm.zzn();
        if (zzbmVarZzn != null) {
            zzbmVarZzn.zzm(sessionTransferCallback);
        }
    }

    public CastOptions getCastOptions() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzk;
    }

    public int getCastReasonCodeForCastStatusCode(int i) {
        CastReasonCodes castReasonCodes = this.zzs;
        if (castReasonCodes != null) {
            return castReasonCodes.zza(i);
        }
        zzb.m13802w("castReasonCodes hasn't been initialized yet", new Object[0]);
        return 0;
    }

    public int getCastState() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzg.zza();
    }

    public MediaNotificationManager getMediaNotificationManager() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzj;
    }

    public C2318f getMergedSelector() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return C2318f.m8219d(this.zzf.zzf());
        } catch (RemoteException e) {
            zzb.m13796d(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", zzz.class.getSimpleName());
            return null;
        }
    }

    public PrecacheManager getPrecacheManager() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzi;
    }

    public SessionManager getSessionManager() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzg;
    }

    @Deprecated
    public boolean isAppVisible() {
        return false;
    }

    @Deprecated
    public boolean onDispatchVolumeKeyEventBeforeJellyBean(KeyEvent keyEvent) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return false;
    }

    @Deprecated
    public void removeAppVisibilityListener(AppVisibilityListener appVisibilityListener) {
    }

    public void removeCastStateListener(CastStateListener castStateListener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (castStateListener == null) {
            return;
        }
        this.zzg.zzd(castStateListener);
    }

    public void removeSessionTransferCallback(SessionTransferCallback sessionTransferCallback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(sessionTransferCallback);
        zzbm zzbmVarZzn = this.zzm.zzn();
        if (zzbmVarZzn != null) {
            zzbmVarZzn.zzn(sessionTransferCallback);
        }
    }

    public void setLaunchCredentialsData(CredentialsData credentialsData) {
        LaunchOptions.Builder builder = new LaunchOptions.Builder(this.zzk.getLaunchOptions());
        builder.setCredentialsData(credentialsData);
        this.zzk.zzb(builder.build());
        zzk();
    }

    public void setReceiverApplicationId(String str) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (TextUtils.equals(str, this.zzk.getReceiverApplicationId())) {
            return;
        }
        this.zzk.zzc(str);
        zzk();
        try {
            this.zzf.zzk(str, zzj());
        } catch (RemoteException e) {
            zzb.m13796d(e, "Unable to call %s on %s.", "setReceiverApplicationId", zzz.class.getSimpleName());
        }
        CastButtonFactory.zza(this.zze);
    }

    @ShowFirstParty
    public final zzs zzc() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzh;
    }

    public final zzcx zzf() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzq;
    }

    public final /* synthetic */ void zzh(Bundle bundle) {
        this.zzs = new CastReasonCodes(bundle);
    }

    @Deprecated
    public static CastContext getSharedInstance(Context context) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (zzd == null) {
            synchronized (zzc) {
                if (zzd == null) {
                    Context applicationContext = context.getApplicationContext();
                    OptionsProvider optionsProviderZzi = zzi(applicationContext);
                    CastOptions castOptions = optionsProviderZzi.getCastOptions(applicationContext);
                    com.google.android.gms.cast.internal.zzn zznVar = new com.google.android.gms.cast.internal.zzn(applicationContext);
                    try {
                        zzd = new CastContext(applicationContext, castOptions, optionsProviderZzi.getAdditionalSessionProviders(applicationContext), new zzbf(applicationContext, C2319g.m8234j(applicationContext), castOptions, zznVar), zznVar);
                    } catch (ModuleUnavailableException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return zzd;
    }

    public static Task<CastContext> getSharedInstance(Context context, Executor executor) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (zzd == null) {
            final Context applicationContext = context.getApplicationContext();
            final OptionsProvider optionsProviderZzi = zzi(applicationContext);
            final CastOptions castOptions = optionsProviderZzi.getCastOptions(applicationContext);
            final com.google.android.gms.cast.internal.zzn zznVar = new com.google.android.gms.cast.internal.zzn(applicationContext);
            final zzbf zzbfVar = new zzbf(applicationContext, C2319g.m8234j(applicationContext), castOptions, zznVar);
            return Tasks.call(executor, new Callable() { // from class: com.google.android.gms.cast.framework.zzd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CastContext.zzb(applicationContext, castOptions, optionsProviderZzi, zzbfVar, zznVar);
                }
            });
        }
        return Tasks.forResult(zzd);
    }
}
