package com.google.android.gms.internal.cast;

import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class zzp {
    private static final Logger zza = new Logger("DialogDiscovery");
    private static final String zzb = "21.3.0";
    private static zzp zzc;
    private final zzf zzd;
    private final String zze;
    private String zzi;
    private final Map zzg = Collections.synchronizedMap(new HashMap());
    private int zzp = 1;
    private long zzj = 1;
    private long zzk = 1;
    private long zzl = -1;
    private int zzm = -1;
    private int zzn = 0;
    private int zzo = 0;
    private final zzn zzf = new zzn(this);
    private final Clock zzh = DefaultClock.getInstance();

    private zzp(zzf zzfVar, String str) {
        this.zzd = zzfVar;
        this.zze = str;
    }

    public static zzv zza() {
        zzp zzpVar = zzc;
        if (zzpVar == null) {
            return null;
        }
        return zzpVar.zzf;
    }

    public static void zzg(zzf zzfVar, String str) {
        if (zzc == null) {
            zzc = new zzp(zzfVar, str);
        }
    }

    private final long zzh() {
        return this.zzh.currentTimeMillis();
    }

    private final zzo zzi(C2319g.h hVar) {
        String deviceId;
        String strZzc;
        CastDevice fromBundle = CastDevice.getFromBundle(hVar.m8355i());
        if (fromBundle == null || fromBundle.getDeviceId() == null) {
            int i = this.zzn;
            this.zzn = i + 1;
            deviceId = "UNKNOWN_DEVICE_ID" + i;
        } else {
            deviceId = fromBundle.getDeviceId();
        }
        if (fromBundle == null || fromBundle.zzc() == null) {
            int i2 = this.zzo;
            this.zzo = i2 + 1;
            strZzc = "UNKNOWN_RECEIVER_METRICS_ID" + i2;
        } else {
            strZzc = fromBundle.zzc();
        }
        if (!deviceId.startsWith("UNKNOWN_DEVICE_ID") && this.zzg.containsKey(deviceId)) {
            return (zzo) this.zzg.get(deviceId);
        }
        zzo zzoVar = new zzo((String) Preconditions.checkNotNull(strZzc), zzh());
        this.zzg.put(deviceId, zzoVar);
        return zzoVar;
    }

    private final zzmq zzj(zzmt zzmtVar) {
        zzmf zzmfVarZza = zzmg.zza();
        zzmfVarZza.zzb(zzb);
        zzmfVarZza.zza(this.zze);
        zzmg zzmgVar = (zzmg) zzmfVarZza.zzp();
        zzmp zzmpVarZzc = zzmq.zzc();
        zzmpVarZzc.zzb(zzmgVar);
        if (zzmtVar != null) {
            CastContext sharedInstance = CastContext.getSharedInstance();
            boolean z = false;
            if (sharedInstance != null && sharedInstance.getCastOptions().zze()) {
                z = true;
            }
            zzmtVar.zzh(z);
            zzmtVar.zzd(this.zzj);
            zzmpVarZzc.zzg(zzmtVar);
        }
        return (zzmq) zzmpVarZzc.zzp();
    }

    private final void zzk() {
        this.zzg.clear();
        this.zzi = "";
        this.zzj = -1L;
        this.zzk = -1L;
        this.zzl = -1L;
        this.zzm = -1;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzl(int i) {
        zzk();
        this.zzi = UUID.randomUUID().toString();
        this.zzj = zzh();
        this.zzm = 1;
        this.zzp = 2;
        zzmt zzmtVarZza = zzmu.zza();
        zzmtVarZza.zzg(this.zzi);
        zzmtVarZza.zzd(this.zzj);
        zzmtVarZza.zzb(1);
        this.zzd.zzd(zzj(zzmtVarZza), 351);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(C2319g.h hVar) {
        if (this.zzp == 1) {
            this.zzd.zzd(zzj(null), 353);
            return;
        }
        this.zzp = 4;
        zzmt zzmtVarZza = zzmu.zza();
        zzmtVarZza.zzg(this.zzi);
        zzmtVarZza.zzd(this.zzj);
        zzmtVarZza.zze(this.zzk);
        zzmtVarZza.zzf(this.zzl);
        zzmtVarZza.zzb(this.zzm);
        zzmtVarZza.zzc(zzh());
        ArrayList arrayList = new ArrayList();
        for (zzo zzoVar : this.zzg.values()) {
            zzmr zzmrVarZza = zzms.zza();
            zzmrVarZza.zzb(zzoVar.zza);
            zzmrVarZza.zza(zzoVar.zzb);
            arrayList.add((zzms) zzmrVarZza.zzp());
        }
        zzmtVarZza.zza(arrayList);
        if (hVar != null) {
            zzmtVarZza.zzi(zzi(hVar).zza);
        }
        zzmq zzmqVarZzj = zzj(zzmtVarZza);
        zzk();
        zza.m13795d("logging ClientDiscoverySessionSummary. Device Count: " + this.zzg.size(), new Object[0]);
        this.zzd.zzd(zzmqVarZzj, 353);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzn(List list) {
        if (this.zzp != 2) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzi((C2319g.h) it.next());
        }
        if (this.zzl < 0) {
            this.zzl = zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzo() {
        if (this.zzp != 2) {
            this.zzd.zzd(zzj(null), 352);
            return;
        }
        this.zzk = zzh();
        this.zzp = 3;
        zzmt zzmtVarZza = zzmu.zza();
        zzmtVarZza.zzg(this.zzi);
        zzmtVarZza.zze(this.zzk);
        this.zzd.zzd(zzj(zzmtVarZza), 352);
    }
}
