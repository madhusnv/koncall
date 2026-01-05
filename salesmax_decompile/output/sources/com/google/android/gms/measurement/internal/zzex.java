package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
final class zzex implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzey zzc;

    public zzex(zzey zzeyVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzeyVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzey zzeyVar = this.zzc;
        zzez zzezVar = zzeyVar.zza;
        String str = zzeyVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzezVar.zza.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle bundleZzd = zzbrVar.zzd(bundle);
            if (bundleZzd == null) {
                zzezVar.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundleZzd;
            }
        } catch (Exception e) {
            zzezVar.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzezVar.zza.zzaz().zzg();
        zzfr.zzO();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzezVar.zza.zzay().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzezVar.zza.zzay().zzd().zza("No referrer defined in Install Referrer response");
                } else {
                    zzezVar.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    Bundle bundleZzs = zzezVar.zza.zzv().zzs(Uri.parse("?".concat(string)));
                    if (bundleZzs == null) {
                        zzezVar.zza.zzay().zzd().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = bundleZzs.getString("medium");
                        if (string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) {
                            if (j == zzezVar.zza.zzm().zzd.zza()) {
                                zzezVar.zza.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                            if (zzezVar.zza.zzJ()) {
                                zzezVar.zza.zzm().zzd.zzb(j);
                                zzezVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                bundleZzs.putString("_cis", "referrer API v2");
                                zzezVar.zza.zzq().zzF("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZzs, str);
                            }
                        } else {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzezVar.zza.zzay().zzd().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                bundleZzs.putLong("click_timestamp", j2);
                                if (j == zzezVar.zza.zzm().zzd.zza()) {
                                }
                                if (zzezVar.zza.zzJ()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzezVar.zza.zzau(), serviceConnection);
    }
}
