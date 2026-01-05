package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.zznz;
import java.util.HashSet;
import java.util.Iterator;
import p001o.vo0;

/* loaded from: classes3.dex */
final class zzx extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzek zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaaVar, String str, int i, com.google.android.gms.internal.measurement.zzek zzekVar) {
        super(str, i);
        this.zza = zzaaVar;
        this.zzh = zzekVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(Long l, Long l2, com.google.android.gms.internal.measurement.zzft zzftVar, long j, zzas zzasVar, boolean z) {
        Boolean boolZzi;
        zznz.zzc();
        boolean zZzs = this.zza.zzt.zzf().zzs(this.zzb, zzdu.zzW);
        long j2 = this.zzh.zzn() ? zzasVar.zze : j;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(this.zza.zzt.zzay().zzq(), 2)) {
            this.zza.zzt.zzay().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null, this.zza.zzt.zzj().zzd(this.zzh.zzg()));
            this.zza.zzt.zzay().zzj().zzb("Filter definition", this.zza.zzf.zzu().zzo(this.zzh));
        }
        if (!this.zzh.zzp() || this.zzh.zzb() > 256) {
            this.zza.zzt.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzeh.zzn(this.zzb), String.valueOf(this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null));
            return false;
        }
        Object[] objArr = this.zzh.zzk() || this.zzh.zzm() || this.zzh.zzn();
        if (z && objArr != true) {
            this.zza.zzt.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzek zzekVar = this.zzh;
        String strZzh = zzftVar.zzh();
        if (!zzekVar.zzo()) {
            HashSet hashSet = new HashSet();
            Iterator it = zzekVar.zzh().iterator();
            while (true) {
                if (!it.hasNext()) {
                    vo0 vo0Var = new vo0();
                    Iterator it2 = zzftVar.zzi().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            Iterator it3 = zzekVar.zzh().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzem zzemVar = (com.google.android.gms.internal.measurement.zzem) it3.next();
                                boolean z2 = zzemVar.zzh() && zzemVar.zzg();
                                String strZze = zzemVar.zze();
                                if (strZze.isEmpty()) {
                                    this.zza.zzt.zzay().zzk().zzb("Event has empty param name. event", this.zza.zzt.zzj().zzd(strZzh));
                                    break;
                                }
                                Object obj = vo0Var.get(strZze);
                                if (obj instanceof Long) {
                                    if (!zzemVar.zzi()) {
                                        this.zza.zzt.zzay().zzk().zzc("No number filter for long param. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                        break;
                                    }
                                    Boolean boolZzh = zzy.zzh(((Long) obj).longValue(), zzemVar.zzc());
                                    if (boolZzh == null) {
                                        break;
                                    }
                                    if (boolZzh.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj instanceof Double) {
                                    if (!zzemVar.zzi()) {
                                        this.zza.zzt.zzay().zzk().zzc("No number filter for double param. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                        break;
                                    }
                                    Boolean boolZzg = zzy.zzg(((Double) obj).doubleValue(), zzemVar.zzc());
                                    if (boolZzg == null) {
                                        break;
                                    }
                                    if (boolZzg.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj instanceof String) {
                                    if (!zzemVar.zzk()) {
                                        if (!zzemVar.zzi()) {
                                            this.zza.zzt.zzay().zzk().zzc("No filter for String param. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                            break;
                                        }
                                        String str = (String) obj;
                                        if (!zzkv.zzx(str)) {
                                            this.zza.zzt.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                            break;
                                        }
                                        boolZzi = zzy.zzi(str, zzemVar.zzc());
                                    } else {
                                        boolZzi = zzy.zzf((String) obj, zzemVar.zzd(), this.zza.zzt.zzay());
                                    }
                                    if (boolZzi == null) {
                                        break;
                                    }
                                    if (boolZzi.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj == null) {
                                    this.zza.zzt.zzay().zzj().zzc("Missing param for filter. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                    bool = Boolean.FALSE;
                                } else {
                                    this.zza.zzt.zzay().zzk().zzc("Unknown param type. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                }
                            }
                        } else {
                            com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                            if (hashSet.contains(zzfxVar.zzg())) {
                                if (!zzfxVar.zzw()) {
                                    if (!zzfxVar.zzu()) {
                                        if (!zzfxVar.zzy()) {
                                            this.zza.zzt.zzay().zzk().zzc("Unknown value for param. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(zzfxVar.zzg()));
                                            break;
                                        }
                                        vo0Var.put(zzfxVar.zzg(), zzfxVar.zzh());
                                    } else {
                                        vo0Var.put(zzfxVar.zzg(), zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                                    }
                                } else {
                                    vo0Var.put(zzfxVar.zzg(), zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                                }
                            }
                        }
                    }
                } else {
                    com.google.android.gms.internal.measurement.zzem zzemVar2 = (com.google.android.gms.internal.measurement.zzem) it.next();
                    if (zzemVar2.zze().isEmpty()) {
                        this.zza.zzt.zzay().zzk().zzb("null or empty param name in filter. event", this.zza.zzt.zzj().zzd(strZzh));
                        break;
                    }
                    hashSet.add(zzemVar2.zze());
                }
            }
        } else {
            Boolean boolZzh2 = zzy.zzh(j2, zzekVar.zzf());
            if (boolZzh2 != null) {
                if (!boolZzh2.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
        }
        this.zza.zzt.zzay().zzj().zzb("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zze = bool2;
        if (objArr != false && zzftVar.zzu()) {
            Long lValueOf = Long.valueOf(zzftVar.zzd());
            if (this.zzh.zzm()) {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf = l;
                }
                this.zzg = lValueOf;
            } else {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf = l2;
                }
                this.zzf = lValueOf;
            }
        }
        return true;
    }
}
