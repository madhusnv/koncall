package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.m8b;

/* loaded from: classes3.dex */
public final class zzbf extends zzak {
    private static final Logger zza = new Logger("MediaRouterProxy");
    private final C2319g zzb;
    private final CastOptions zzc;
    private final Map zzd = new HashMap();
    private zzbm zze;
    private boolean zzf;

    public zzbf(Context context, C2319g c2319g, final CastOptions castOptions, com.google.android.gms.cast.internal.zzn zznVar) {
        this.zzb = c2319g;
        this.zzc = castOptions;
        if (Build.VERSION.SDK_INT <= 32) {
            zza.m13799i("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        zza.m13795d("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.zze = new zzbm(castOptions);
        Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        boolean z = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.zzf = z;
        if (z) {
            zzr.zzd(zzln.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        zznVar.zza(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.cast.zzbd
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzp(castOptions, task);
            }
        });
    }

    private final void zzt(C2318f c2318f, int i) {
        Set set = (Set) this.zzd.get(c2318f);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.m8239b(c2318f, (C2319g.a) it.next(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzq(C2318f c2318f) {
        Set set = (Set) this.zzd.get(c2318f);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.m8249s((C2319g.a) it.next());
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final Bundle zzb(String str) {
        for (C2319g.h hVar : this.zzb.m8246m()) {
            if (hVar.m8357k().equals(str)) {
                return hVar.m8355i();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final String zzc() {
        return this.zzb.m8247n().m8357k();
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzd(Bundle bundle, final int i) {
        final C2318f c2318fM8219d = C2318f.m8219d(bundle);
        if (c2318fM8219d == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzt(c2318fM8219d, i);
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(c2318fM8219d, i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zze(Bundle bundle, zzan zzanVar) {
        C2318f c2318fM8219d = C2318f.m8219d(bundle);
        if (c2318fM8219d == null) {
            return;
        }
        if (!this.zzd.containsKey(c2318fM8219d)) {
            this.zzd.put(c2318fM8219d, new HashSet());
        }
        ((Set) this.zzd.get(c2318fM8219d)).add(new zzas(zzanVar));
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzf() {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                this.zzb.m8249s((C2319g.a) it2.next());
            }
        }
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzg(Bundle bundle) {
        final C2318f c2318fM8219d = C2318f.m8219d(bundle);
        if (c2318fM8219d == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzq(c2318fM8219d);
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(c2318fM8219d);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzh() {
        C2319g c2319g = this.zzb;
        c2319g.m8251u(c2319g.m8243g());
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzi(String str) {
        zza.m13795d("select route with routeId = %s", str);
        for (C2319g.h hVar : this.zzb.m8246m()) {
            if (hVar.m8357k().equals(str)) {
                zza.m13795d("media route is found and selected", new Object[0]);
                this.zzb.m8251u(hVar);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzj(int i) {
        this.zzb.m8256z(i);
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final boolean zzk() {
        C2319g.h hVarM8242f = this.zzb.m8242f();
        return hVarM8242f != null && this.zzb.m8247n().m8357k().equals(hVarM8242f.m8357k());
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final boolean zzl() {
        C2319g.h hVarM8243g = this.zzb.m8243g();
        return hVarM8243g != null && this.zzb.m8247n().m8357k().equals(hVarM8243g.m8357k());
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final boolean zzm(Bundle bundle, int i) {
        C2318f c2318fM8219d = C2318f.m8219d(bundle);
        if (c2318fM8219d == null) {
            return false;
        }
        return this.zzb.m8248q(c2318fM8219d, i);
    }

    public final zzbm zzn() {
        return this.zze;
    }

    public final /* synthetic */ void zzo(C2318f c2318f, int i) {
        synchronized (this.zzd) {
            zzt(c2318f, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zzp(CastOptions castOptions, Task task) {
        boolean z;
        CastOptions castOptions2;
        boolean z2 = false;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z3 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            Logger logger = zza;
            Object[] objArr = new Object[1];
            objArr[0] = true != z3 ? "not existed" : "existed";
            logger.m13795d("The module-to-client output switcher flag %s", objArr);
            if (z3) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            }
        } else {
            z = true;
        }
        Logger logger2 = zza;
        logger2.m13799i("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(castOptions.zzh()));
        if (z && castOptions.zzh()) {
            z2 = true;
        }
        C2319g c2319g = this.zzb;
        if (c2319g == null || (castOptions2 = this.zzc) == null) {
            return;
        }
        boolean zZzf = castOptions2.zzf();
        boolean zZzd = castOptions2.zzd();
        c2319g.m8254x(new m8b.C15251a().m38561b(z2).m38563d(zZzf).m38562c(zZzd).m38560a());
        logger2.m13799i("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(this.zzf), Boolean.valueOf(z2), Boolean.valueOf(zZzf), Boolean.valueOf(zZzd));
        if (zZzf) {
            this.zzb.m8253w(new zzbb((zzbm) Preconditions.checkNotNull(this.zze)));
            zzr.zzd(zzln.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    public final void zzr(MediaSessionCompat mediaSessionCompat) {
        this.zzb.m8252v(mediaSessionCompat);
    }

    public final boolean zzs() {
        return this.zzf;
    }
}
