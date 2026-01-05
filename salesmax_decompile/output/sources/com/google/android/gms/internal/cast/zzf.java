package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import p001o.cxh;
import p001o.dvh;
import p001o.fr1;
import p001o.n76;
import p001o.owh;
import p001o.xj6;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzf {

    @VisibleForTesting
    owh zza;
    private final Context zzb;
    private final com.google.android.gms.cast.internal.zzn zzc;
    private final SessionManager zzd;
    private final zzbm zze;
    private final zzae zzf;
    private int zzh = 1;
    private final String zzg = UUID.randomUUID().toString();

    private zzf(Context context, com.google.android.gms.cast.internal.zzn zznVar, SessionManager sessionManager, zzbm zzbmVar, zzae zzaeVar) {
        this.zzb = context;
        this.zzc = zznVar;
        this.zzd = sessionManager;
        this.zze = zzbmVar;
        this.zzf = zzaeVar;
    }

    public static zzf zza(Context context, com.google.android.gms.cast.internal.zzn zznVar, SessionManager sessionManager, zzbm zzbmVar, zzae zzaeVar) {
        return new zzf(context, zznVar, sessionManager, zzbmVar, zzaeVar);
    }

    public final /* synthetic */ void zzb(String str, SharedPreferences sharedPreferences, Bundle bundle) {
        Preconditions.checkNotNull(this.zzd);
        SessionManager sessionManager = this.zzd;
        zzbm zzbmVar = this.zze;
        zzk zzkVar = new zzk(sharedPreferences, this, bundle, str);
        this.zzf.zze(zzkVar.zzc());
        sessionManager.addSessionManagerListener(new zzi(zzkVar), CastSession.class);
        if (zzbmVar != null) {
            zzbmVar.zzm(new zzj(zzkVar));
        }
    }

    public final void zzc(Bundle bundle) {
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (z || z2) {
            final String packageName = this.zzb.getPackageName();
            String str = String.format(Locale.ROOT, "%s.%s", packageName, "client_cast_analytics_data");
            this.zzh = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            cxh.m22043f(this.zzb);
            this.zza = cxh.m22041c().m22047g(fr1.f23957g).mo47214a("CAST_SENDER_SDK", zzmq.class, n76.m40202b("proto"), new dvh() { // from class: com.google.android.gms.internal.cast.zze
                @Override // p001o.dvh
                public final Object apply(Object obj) {
                    zzmq zzmqVar = (zzmq) obj;
                    try {
                        int iZzt = zzmqVar.zzt();
                        byte[] bArr = new byte[iZzt];
                        zzru zzruVarZzz = zzru.zzz(bArr, 0, iZzt);
                        zzmqVar.zzI(zzruVarZzz);
                        zzruVarZzz.zzA();
                        return bArr;
                    } catch (IOException e) {
                        throw new RuntimeException("Serializing " + zzmqVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                    }
                }
            });
            final SharedPreferences sharedPreferences = this.zzb.getApplicationContext().getSharedPreferences(str, 0);
            if (z) {
                final com.google.android.gms.cast.internal.zzn zznVar = this.zzc;
                final String[] strArr = {"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
                zznVar.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.internal.zzf
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        zzn zznVar2 = zznVar;
                        String[] strArr2 = strArr;
                        ((zzaj) ((zzo) obj).getService()).zzh(new zzl(zznVar2, (TaskCompletionSource) obj2), strArr2);
                    }
                }).setFeatures(com.google.android.gms.cast.zzax.zzg).setAutoResolveMissingFeatures(false).setMethodKey(8426).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzd
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.zza.zzb(packageName, sharedPreferences, (Bundle) obj);
                    }
                });
            }
            if (z2) {
                Preconditions.checkNotNull(sharedPreferences);
                zzr.zza(sharedPreferences, this, packageName).zze();
                zzr.zzd(zzln.CAST_CONTEXT);
            }
            zzp.zzg(this, packageName);
        }
    }

    public final void zzd(zzmq zzmqVar, int i) {
        zzmp zzmpVarZzd = zzmq.zzd(zzmqVar);
        zzmpVarZzd.zzk(this.zzg);
        zzmpVarZzd.zzf(this.zzg);
        zzmq zzmqVar2 = (zzmq) zzmpVarZzd.zzp();
        int i2 = this.zzh;
        int i3 = i2 - 1;
        xj6 xj6VarM56378f = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            xj6VarM56378f = xj6.m56378f(i - 1, zzmqVar2);
        } else if (i3 == 1) {
            xj6VarM56378f = xj6.m56376d(i - 1, zzmqVar2);
        }
        Preconditions.checkNotNull(xj6VarM56378f);
        owh owhVar = this.zza;
        if (owhVar != null) {
            owhVar.mo42730a(xj6VarM56378f);
        }
    }
}
