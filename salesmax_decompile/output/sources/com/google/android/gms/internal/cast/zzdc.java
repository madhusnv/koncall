package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdc implements zzcz {
    private static final Logger zzb = new Logger("ConnectivityMonitor");
    private final zzqp zzc;
    private final ConnectivityManager zze;
    private boolean zzh;
    private final Context zzi;
    private final Object zzj = new Object();

    @VisibleForTesting
    public final Set zza = Collections.synchronizedSet(new HashSet());
    private final Map zzf = Collections.synchronizedMap(new HashMap());
    private final List zzg = Collections.synchronizedList(new ArrayList());
    private final ConnectivityManager.NetworkCallback zzd = new zzdb(this);

    @TargetApi(23)
    public zzdc(Context context, zzqp zzqpVar) {
        this.zzc = zzqpVar;
        this.zzi = context;
        this.zze = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static /* bridge */ /* synthetic */ void zzd(zzdc zzdcVar) {
        synchronized (Preconditions.checkNotNull(zzdcVar.zzj)) {
            if (zzdcVar.zzf != null && zzdcVar.zzg != null) {
                zzb.m13795d("all networks are unavailable.", new Object[0]);
                zzdcVar.zzf.clear();
                zzdcVar.zzg.clear();
                zzdcVar.zzh();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zze(zzdc zzdcVar, Network network) {
        synchronized (Preconditions.checkNotNull(zzdcVar.zzj)) {
            if (zzdcVar.zzf != null && zzdcVar.zzg != null) {
                zzb.m13795d("the network is lost", new Object[0]);
                if (zzdcVar.zzg.remove(network)) {
                    zzdcVar.zzf.remove(network);
                }
                zzdcVar.zzh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Network network, LinkProperties linkProperties) {
        synchronized (Preconditions.checkNotNull(this.zzj)) {
            if (this.zzf != null && this.zzg != null) {
                zzb.m13795d("a new network is available", new Object[0]);
                if (this.zzf.containsKey(network)) {
                    this.zzg.remove(network);
                }
                this.zzf.put(network, linkProperties);
                this.zzg.add(network);
                zzh();
            }
        }
    }

    private final void zzh() {
        if (this.zzc == null) {
            return;
        }
        synchronized (this.zza) {
            for (final zzcy zzcyVar : this.zza) {
                if (!this.zzc.isShutdown()) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.cast.zzda
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdc zzdcVar = this.zza;
                            zzcy zzcyVar2 = zzcyVar;
                            zzdcVar.zzf();
                            zzcyVar2.zza();
                        }
                    });
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzcz
    @TargetApi(23)
    public final void zza() {
        LinkProperties linkProperties;
        zzb.m13795d("Start monitoring connectivity changes", new Object[0]);
        if (this.zzh || this.zze == null || !com.google.android.gms.cast.internal.zzas.zza(this.zzi)) {
            return;
        }
        Network activeNetwork = this.zze.getActiveNetwork();
        if (activeNetwork != null && (linkProperties = this.zze.getLinkProperties(activeNetwork)) != null) {
            zzg(activeNetwork, linkProperties);
        }
        this.zze.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), this.zzd);
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.cast.zzcz
    public final boolean zzb() {
        NetworkInfo activeNetworkInfo;
        return this.zze != null && com.google.android.gms.cast.internal.zzas.zza(this.zzi) && (activeNetworkInfo = this.zze.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected();
    }

    public final boolean zzf() {
        List list = this.zzg;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
