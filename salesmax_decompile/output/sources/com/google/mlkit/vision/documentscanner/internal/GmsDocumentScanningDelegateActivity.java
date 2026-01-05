package com.google.mlkit.vision.documentscanner.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlq;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzml;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrn;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzrv;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;
import java.util.List;
import p001o.kgb;
import p001o.ns;
import p001o.sij;
import p001o.us;
import p001o.ws;

/* loaded from: classes6.dex */
public class GmsDocumentScanningDelegateActivity extends ComponentActivity {

    /* renamed from: a */
    public final zzrk f13442a = zzrv.zzb("play-services-mlkit-document-scanner");

    /* renamed from: b */
    public final zzrm f13443b = zzrm.zza(kgb.m35683c().m35687b());

    /* renamed from: c */
    public zzlq f13444c;

    /* renamed from: d */
    public long f13445d;

    /* renamed from: e */
    public long f13446e;

    public static Intent y0(Context context, Intent intent) {
        Intent action = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return action.putExtra("string_extra_calling_app_name", i != 0 ? context.getString(i) : context.getPackageManager().getApplicationLabel(applicationInfo).toString()).putExtras(intent).setFlags(1);
    }

    public final /* synthetic */ void A0(Exception exc) throws Throwable {
        B0();
    }

    public final void B0() throws Throwable {
        setResult(0);
        C0(zzmk.CANCELLED, 0);
        finish();
    }

    public final void C0(zzmk zzmkVar, int i) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzmm zzmmVar = new zzmm();
        zznu zznuVar = new zznu();
        zznuVar.zzc(Long.valueOf(jElapsedRealtime - this.f13445d));
        zznuVar.zzd(zzmkVar);
        zznuVar.zze(this.f13444c);
        zznuVar.zzf(Integer.valueOf(i));
        zzmmVar.zzd(zznuVar.zzg());
        this.f13442a.zzc(zzrn.zze(zzmmVar), zzml.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f13443b.zzc(24335, zzmkVar.zza(), this.f13446e, jCurrentTimeMillis);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.f13444c = sij.m48365a(getIntent());
        ws wsVarRegisterForActivityResult = registerForActivityResult(new us(), new ns() { // from class: o.oij
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                final GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity = this.f38428a;
                ActivityResult activityResult = (ActivityResult) obj;
                cjj.m21327c(gmsDocumentScanningDelegateActivity.getApplicationContext()).m21330b(activityResult.m3726b(), activityResult.m3725a()).addOnSuccessListener(new OnSuccessListener() { // from class: o.gij
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj2) throws Throwable {
                        gmsDocumentScanningDelegateActivity.z0((GmsDocumentScanningResult) obj2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: o.lij
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) throws Throwable {
                        gmsDocumentScanningDelegateActivity.A0(exc);
                    }
                });
            }
        });
        if (bundle != null) {
            this.f13445d = bundle.getLong("elapsedStartTimeMsKey");
            this.f13446e = bundle.getLong("epochStartTimeMsKey");
            return;
        }
        this.f13445d = SystemClock.elapsedRealtime();
        this.f13446e = System.currentTimeMillis();
        zzrk zzrkVar = this.f13442a;
        zzmm zzmmVar = new zzmm();
        zznu zznuVar = new zznu();
        zznuVar.zze(this.f13444c);
        zzmmVar.zze(zznuVar.zzg());
        zzrkVar.zzc(zzrn.zze(zzmmVar), zzml.ON_DEVICE_DOCUMENT_SCANNER_UI_START);
        wsVarRegisterForActivityResult.m54945b(y0(this, getIntent()));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("elapsedStartTimeMsKey", this.f13445d);
        bundle.putLong("epochStartTimeMsKey", this.f13446e);
    }

    public final /* synthetic */ void z0(GmsDocumentScanningResult gmsDocumentScanningResult) throws Throwable {
        if (gmsDocumentScanningResult == null) {
            B0();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_scanning_result", gmsDocumentScanningResult);
        setResult(-1, intent);
        List listMo15793b = gmsDocumentScanningResult.mo15793b();
        GmsDocumentScanningResult.Pdf pdfMo15794c = gmsDocumentScanningResult.mo15794c();
        C0(zzmk.NO_ERROR, listMo15793b != null ? listMo15793b.size() : pdfMo15794c != null ? pdfMo15794c.mo15796a() : 0);
        finish();
    }
}
