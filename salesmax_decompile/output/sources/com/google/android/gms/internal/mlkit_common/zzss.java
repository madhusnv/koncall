package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p001o.fmf;
import p001o.fna;
import p001o.hie;
import p001o.ikb;
import p001o.pha;
import p001o.yq3;
import p001o.zj3;

/* loaded from: classes3.dex */
public final class zzss {
    private static zzaq zza;
    private static final zzat zzb = zzat.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzsk zze;
    private final fmf zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzss(Context context, final fmf fmfVar, zzsk zzskVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = zj3.m59506a(context);
        this.zzf = fmfVar;
        this.zze = zzskVar;
        zztg.zza();
        this.zzi = str;
        this.zzg = fna.m27126a().m27129b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        fna fnaVarM27126a = fna.m27126a();
        fmfVar.getClass();
        this.zzh = fnaVarM27126a.m27129b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fmfVar.m27089a();
            }
        });
        zzat zzatVar = zzb;
        this.zzj = zzatVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzatVar.get(str)) : -1;
    }

    private static synchronized zzaq zzh() {
        zzaq zzaqVar = zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        pha phaVarM58107a = yq3.m58107a(Resources.getSystem().getConfiguration());
        zzan zzanVar = new zzan();
        for (int i = 0; i < phaVarM58107a.m43687f(); i++) {
            zzanVar.zzb(zj3.m59507b(phaVarM58107a.m43685c(i)));
        }
        zzaq zzaqVarZzc = zzanVar.zzc();
        zza = zzaqVarZzc;
        return zzaqVarZzc;
    }

    private final zzre zzi(String str, String str2) {
        zzre zzreVar = new zzre();
        zzreVar.zzb(this.zzc);
        zzreVar.zzc(this.zzd);
        zzreVar.zzh(zzh());
        zzreVar.zzg(Boolean.TRUE);
        zzreVar.zzl(str);
        zzreVar.zzj(str2);
        zzreVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.m27089a());
        zzreVar.zzd(10);
        zzreVar.zzk(Integer.valueOf(this.zzj));
        return zzreVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ String zza() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzsj zzsjVar, zzng zzngVar, String str) {
        zzsjVar.zza(zzngVar);
        zzsjVar.zzc(zzi(zzsjVar.zzd(), str));
        this.zze.zza(zzsjVar);
    }

    public final /* synthetic */ void zzc(zzsj zzsjVar, zzsu zzsuVar, hie hieVar) {
        zzsjVar.zza(zzng.MODEL_DOWNLOAD);
        zzsjVar.zzc(zzi(zzsuVar.zze(), zzj()));
        zzsjVar.zzb(zzte.zza(hieVar, this.zzf, zzsuVar));
        this.zze.zza(zzsjVar);
    }

    public final void zzd(final zzsj zzsjVar, final zzng zzngVar) {
        final String strZzj = zzj();
        fna.m27127d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzso
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzsjVar, zzngVar, strZzj);
            }
        });
    }

    public final void zze(zzsj zzsjVar, hie hieVar, boolean z, int i) {
        zzsu.zzh().zzf(false);
        throw null;
    }

    public final void zzf(zzsj zzsjVar, hie hieVar, zznf zznfVar, boolean z, ikb ikbVar, zznl zznlVar) {
        zzst zzstVarZzh = zzsu.zzh();
        zzstVarZzh.zzf(z);
        zzstVarZzh.zzd(ikbVar);
        zzstVarZzh.zzb(zznfVar);
        zzstVarZzh.zza(zznlVar);
        zzg(zzsjVar, hieVar, zzstVarZzh.zzh());
    }

    public final void zzg(final zzsj zzsjVar, final hie hieVar, final zzsu zzsuVar) {
        fna.m27127d().execute(new Runnable(zzsjVar, zzsuVar, hieVar) { // from class: com.google.android.gms.internal.mlkit_common.zzsr
            public final /* synthetic */ zzsj zzb;
            public final /* synthetic */ zzsu zzc;
            public final /* synthetic */ hie zzd;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb, this.zzc, null);
            }
        });
    }
}
