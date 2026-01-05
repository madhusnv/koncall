package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Looper;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzay extends C2319g.a {
    private static final Logger zzb = new Logger("MRDiscoveryCallback");
    private final zzax zzf;
    private final Map zzd = Collections.synchronizedMap(new HashMap());
    private final LinkedHashSet zze = new LinkedHashSet();
    private final Set zzc = Collections.synchronizedSet(new LinkedHashSet());
    public final zzaw zza = new zzaw(this);

    public zzay(Context context) {
        this.zzf = new zzax(context);
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
        zzb.m13795d("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
        zzb.m13795d("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
        zzb.m13795d("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        zzf(hVar, false);
    }

    public final void zza(List list) {
        zzb.m13795d("SetRouteDiscovery for " + list.size() + " IDs", new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(zzen.zza((String) it.next()));
        }
        zzb.m13795d("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        HashMap map = new HashMap();
        synchronized (this.zzd) {
            for (String str : linkedHashSet) {
                zzav zzavVar = (zzav) this.zzd.get(zzen.zza(str));
                if (zzavVar != null) {
                    map.put(str, zzavVar);
                }
            }
            this.zzd.clear();
            this.zzd.putAll(map);
        }
        zzb.m13795d("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        synchronized (this.zze) {
            this.zze.clear();
            this.zze.addAll(linkedHashSet);
        }
        zzb();
    }

    public final void zzb() {
        Logger logger = zzb;
        logger.m13795d("Starting RouteDiscovery with " + this.zze.size() + " IDs", new Object[0]);
        logger.m13795d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzc();
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzau
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final void zzc() {
        this.zzf.zzb(this);
        synchronized (this.zze) {
            Iterator it = this.zze.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C2318f c2318fM8230d = new C2318f.a().m8228b(CastMediaControlIntent.categoryForCast(str)).m8230d();
                if (((zzav) this.zzd.get(str)) == null) {
                    this.zzd.put(str, new zzav(c2318fM8230d));
                }
                zzb.m13795d("Adding mediaRouter callback for control category " + CastMediaControlIntent.categoryForCast(str), new Object[0]);
                this.zzf.zza().m8239b(c2318fM8230d, this, 4);
            }
        }
        zzb.m13795d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
    }

    public final void zzd() {
        zzb.m13795d("Stopping RouteDiscovery.", new Object[0]);
        this.zzd.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zzf.zzb(this);
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzat
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze();
                }
            });
        }
    }

    public final void zze() {
        this.zzf.zzb(this);
    }

    @VisibleForTesting
    public final void zzf(C2319g.h hVar, boolean z) {
        boolean z2;
        boolean zRemove;
        Logger logger = zzb;
        logger.m13795d("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), hVar);
        synchronized (this.zzd) {
            logger.m13795d("appIdToRouteInfo has these appId route keys: " + String.valueOf(this.zzd.keySet()), new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.zzd.entrySet()) {
                String str = (String) entry.getKey();
                zzav zzavVar = (zzav) entry.getValue();
                if (hVar.m8339E(zzavVar.zzb)) {
                    if (z) {
                        Logger logger2 = zzb;
                        logger2.m13795d("Adding/updating route for appId " + str, new Object[0]);
                        zRemove = zzavVar.zza.add(hVar);
                        if (!zRemove) {
                            logger2.m13802w("Route " + String.valueOf(hVar) + " already exists for appId " + str, new Object[0]);
                        }
                    } else {
                        Logger logger3 = zzb;
                        logger3.m13795d("Removing route for appId " + str, new Object[0]);
                        zRemove = zzavVar.zza.remove(hVar);
                        if (!zRemove) {
                            logger3.m13802w("Route " + String.valueOf(hVar) + " already removed from appId " + str, new Object[0]);
                        }
                    }
                    z2 = zRemove;
                }
            }
        }
        if (z2) {
            zzb.m13795d("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.zzc) {
                HashMap map = new HashMap();
                synchronized (this.zzd) {
                    for (String str2 : this.zzd.keySet()) {
                        zzav zzavVar2 = (zzav) this.zzd.get(zzen.zza(str2));
                        zzfl zzflVarZzk = zzavVar2 == null ? zzfl.zzk() : zzfl.zzj(zzavVar2.zza);
                        if (!zzflVarZzk.isEmpty()) {
                            map.put(str2, zzflVarZzk);
                        }
                    }
                }
                zzfk.zzc(map.entrySet());
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.cast.framework.zzaw) it.next()).zza();
                }
            }
        }
    }
}
