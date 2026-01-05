package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p001o.fmf;
import p001o.fna;
import p001o.pha;
import p001o.yq3;
import p001o.zj3;

/* loaded from: classes3.dex */
public final class zzrk {
    private static zzad zza;
    private static final zzaf zzb = zzaf.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrd zze;
    private final fmf zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzrk(Context context, final fmf fmfVar, zzrd zzrdVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = zj3.m59506a(context);
        this.zzf = fmfVar;
        this.zze = zzrdVar;
        zzrw.zza();
        this.zzi = str;
        this.zzg = fna.m27126a().m27129b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        fna fnaVarM27126a = fna.m27126a();
        Objects.requireNonNull(fmfVar);
        this.zzh = fnaVarM27126a.m27129b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fmfVar.m27089a();
            }
        });
        zzaf zzafVar = zzb;
        this.zzj = zzafVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzafVar.get(str)) : -1;
    }

    private static synchronized zzad zzd() {
        zzad zzadVar = zza;
        if (zzadVar != null) {
            return zzadVar;
        }
        pha phaVarM58107a = yq3.m58107a(Resources.getSystem().getConfiguration());
        zzaa zzaaVar = new zzaa();
        for (int i = 0; i < phaVarM58107a.m43687f(); i++) {
            zzaaVar.zza(zj3.m59507b(phaVarM58107a.m43685c(i)));
        }
        zzad zzadVarZzb = zzaaVar.zzb();
        zza = zzadVarZzb;
        return zzadVarZzb;
    }

    public final /* synthetic */ String zza() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzrc zzrcVar, zzml zzmlVar, String str) {
        zzrcVar.zza(zzmlVar);
        String strZzc = zzrcVar.zzc();
        zzqc zzqcVar = new zzqc();
        zzqcVar.zzb(this.zzc);
        zzqcVar.zzc(this.zzd);
        zzqcVar.zzh(zzd());
        zzqcVar.zzg(Boolean.TRUE);
        zzqcVar.zzl(strZzc);
        zzqcVar.zzj(str);
        zzqcVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.m27089a());
        zzqcVar.zzd(10);
        zzqcVar.zzk(Integer.valueOf(this.zzj));
        zzrcVar.zzb(zzqcVar);
        this.zze.zza(zzrcVar);
    }

    public final void zzc(final zzrc zzrcVar, final zzml zzmlVar) throws Throwable {
        final String version;
        if (this.zzg.isSuccessful()) {
            version = (String) this.zzg.getResult();
        } else {
            version = LibraryVersion.getInstance().getVersion(this.zzi);
        }
        fna.m27127d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzrcVar, zzmlVar, version);
            }
        });
    }
}
