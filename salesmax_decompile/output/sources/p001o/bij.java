package p001o;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzaa;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzd;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlq;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzml;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrn;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;

/* loaded from: classes6.dex */
public final class bij implements wt7 {

    /* renamed from: f */
    public static boolean f16409f;

    /* renamed from: g */
    public static int f16410g;

    /* renamed from: a */
    public final xt7 f16411a;

    /* renamed from: b */
    public final Feature[] f16412b;

    /* renamed from: c */
    public final zzlq f16413c;

    /* renamed from: d */
    public final zzrk f16414d;

    /* renamed from: e */
    public final zzrm f16415e;

    public bij(xt7 xt7Var) {
        zzrk zzrkVarZzb = zzrv.zzb("play-services-mlkit-document-scanner");
        zzrm zzrmVarZza = zzrm.zza(kgb.m35683c().m35687b());
        this.f16411a = xt7Var;
        this.f16413c = sij.m48366b(xt7Var);
        this.f16415e = zzrmVarZza;
        this.f16414d = zzrkVarZzb;
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza(oec.f38252u);
        if (xt7Var.m56817e()) {
            zzaaVar.zza(oec.f38254w);
        }
        if (xt7Var.m56818f()) {
            zzaaVar.zza(oec.f38253v);
        }
        this.f16412b = (Feature[]) zzaaVar.zzb().toArray(new Feature[0]);
    }

    /* renamed from: b */
    public static void m19217b(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x003e  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // p001o.wt7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task mo19218a(Activity activity) throws Throwable {
        ?? r14;
        Task taskForException;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context applicationContext = activity.getApplicationContext();
        zzmm zzmmVar = new zzmm();
        zznu zznuVar = new zznu();
        zznuVar.zze(this.f16413c);
        zzmmVar.zzc(zznuVar.zzg());
        this.f16414d.zzc(zzrn.zze(zzmmVar), zzml.ON_DEVICE_DOCUMENT_SCANNER_UI_CREATE);
        ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
        if (activityManager == null) {
            boolean z = true;
            if (!f16409f) {
                oec.m42132a(applicationContext, this.f16412b);
                f16409f = true;
            }
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext);
            m19217b("gmsVersion=" + apkVersion);
            if (apkVersion < 233900000) {
                m19219c(zzmk.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, jElapsedRealtime, jCurrentTimeMillis);
                taskForException = Tasks.forException(new lgb("Feature not available in the current version of the Google Play services", 14));
                r14 = z;
            } else {
                boolean z2 = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT").resolveActivity(applicationContext.getPackageManager()) != null;
                m19217b("isDocScanActivityAvailable=" + z2);
                if (z2) {
                    taskForException = null;
                    r14 = z;
                }
            }
        } else {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            float f = memoryInfo.totalMem;
            StringBuilder sb = new StringBuilder();
            sb.append("total RAM (GB) = ");
            float f2 = ((f / 1024.0f) / 1024.0f) / 1024.0f;
            sb.append(f2);
            m19217b(sb.toString());
            if (f2 < 1.7f) {
                r14 = 1;
                m19219c(zzmk.LOW_MEMORY, jElapsedRealtime, jCurrentTimeMillis);
                taskForException = Tasks.forException(new lgb("Device RAM is below the minimal requirement for this feature: 1.7 GB", 18));
            }
        }
        if (taskForException != null) {
            return taskForException;
        }
        phj phjVar = new phj(this);
        Bundle bundle = new Bundle();
        bundle.putBinder("bundle_binder_extra_callbacks", phjVar);
        Intent intentPutExtra = new Intent(activity, (Class<?>) GmsDocumentScanningDelegateActivity.class).putExtra("boolean_extra_request_uris_in_result_intent", (boolean) r14);
        xt7 xt7Var = this.f16411a;
        Intent intentPutExtra2 = intentPutExtra.putExtras(new Intent().putParcelableArrayListExtra("uri_array_extra_initial_image_uris", null).putExtra("int_extra_default_capture_mode", (int) r14).putExtra("boolean_extra_flash_mode_change_allowed", (boolean) r14).putExtra("boolean_extra_gallery_import_allowed", xt7Var.m56816d()).putExtra("int_extra_page_limit_max", xt7Var.m56813a()).putExtra("boolean_extra_page_edit_listener_enabled", false).putExtra("int_array_extra_result_formats", xt7Var.m56819g()).putExtra("boolean_extra_enable_all_new_features_by_default", xt7Var.m56814b()).putExtra("boolean_extra_filter_allowed", xt7Var.m56815c()).putExtra("boolean_extra_shadow_removal_allowed", xt7Var.m56817e()).putExtra("boolean_extra_stain_removal_allowed", xt7Var.m56818f())).setFlags(r14).putExtra("bundle_binder_extra_callbacks", bundle);
        if (applicationContext.getPackageName().equals("com.google.android.gms")) {
            intentPutExtra2 = GmsDocumentScanningDelegateActivity.y0(applicationContext, intentPutExtra2).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.mlkit.docscan.ui.DocumentScanningActivity"));
        }
        int i = f16410g;
        f16410g = i + 1;
        PendingIntent pendingIntentZza = zzd.zza(activity, i, intentPutExtra2, 67108864, 0);
        if (pendingIntentZza != null) {
            return Tasks.forResult(pendingIntentZza.getIntentSender());
        }
        m19219c(zzmk.UNKNOWN_ERROR, jElapsedRealtime, jCurrentTimeMillis);
        return Tasks.forException(new lgb("Failed to create IntentSender", 13));
    }

    /* renamed from: c */
    public final void m19219c(zzmk zzmkVar, long j, long j2) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzmm zzmmVar = new zzmm();
        zznu zznuVar = new zznu();
        zznuVar.zzc(Long.valueOf(jElapsedRealtime - j));
        zznuVar.zzd(zzmkVar);
        zznuVar.zze(this.f16413c);
        zzmmVar.zzd(zznuVar.zzg());
        this.f16414d.zzc(zzrn.zze(zzmmVar), zzml.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f16415e.zzc(24335, zzmkVar.zza(), j2, jCurrentTimeMillis);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f16412b;
    }
}
