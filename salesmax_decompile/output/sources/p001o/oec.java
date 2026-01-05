package p001o;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.internal.mlkit_common.zzas;
import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes6.dex */
public abstract class oec {

    /* renamed from: A */
    public static final zzat f38230A;

    /* renamed from: B */
    public static final zzat f38231B;

    /* renamed from: a */
    public static final Feature[] f38232a = new Feature[0];

    /* renamed from: b */
    public static final Feature f38233b;

    /* renamed from: c */
    public static final Feature f38234c;

    /* renamed from: d */
    public static final Feature f38235d;

    /* renamed from: e */
    public static final Feature f38236e;

    /* renamed from: f */
    public static final Feature f38237f;

    /* renamed from: g */
    public static final Feature f38238g;

    /* renamed from: h */
    public static final Feature f38239h;

    /* renamed from: i */
    public static final Feature f38240i;

    /* renamed from: j */
    public static final Feature f38241j;

    /* renamed from: k */
    public static final Feature f38242k;

    /* renamed from: l */
    public static final Feature f38243l;

    /* renamed from: m */
    public static final Feature f38244m;

    /* renamed from: n */
    public static final Feature f38245n;

    /* renamed from: o */
    public static final Feature f38246o;

    /* renamed from: p */
    public static final Feature f38247p;

    /* renamed from: q */
    public static final Feature f38248q;

    /* renamed from: r */
    public static final Feature f38249r;

    /* renamed from: s */
    public static final Feature f38250s;

    /* renamed from: t */
    public static final Feature f38251t;

    /* renamed from: u */
    public static final Feature f38252u;

    /* renamed from: v */
    public static final Feature f38253v;

    /* renamed from: w */
    public static final Feature f38254w;

    /* renamed from: x */
    public static final Feature f38255x;

    /* renamed from: y */
    public static final Feature f38256y;

    /* renamed from: z */
    public static final Feature f38257z;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f38233b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f38234c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f38235d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f38236e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f38237f = feature5;
        f38238g = new Feature("mlkit.ocr.chinese", 1L);
        f38239h = new Feature("mlkit.ocr.common", 1L);
        f38240i = new Feature("mlkit.ocr.devanagari", 1L);
        f38241j = new Feature("mlkit.ocr.japanese", 1L);
        f38242k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f38243l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f38244m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f38245n = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f38246o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f38247p = feature10;
        f38248q = new Feature("mlkit.image.caption", 1L);
        f38249r = new Feature("mlkit.docscan.detect", 1L);
        f38250s = new Feature("mlkit.docscan.crop", 1L);
        f38251t = new Feature("mlkit.docscan.enhance", 1L);
        f38252u = new Feature("mlkit.docscan.ui", 1L);
        f38253v = new Feature("mlkit.docscan.stain", 1L);
        f38254w = new Feature("mlkit.docscan.shadow", 1L);
        f38255x = new Feature("mlkit.quality.aesthetic", 1L);
        f38256y = new Feature("mlkit.quality.technical", 1L);
        f38257z = new Feature("mlkit.segmentation.subject", 1L);
        zzas zzasVar = new zzas();
        zzasVar.zza("barcode", feature);
        zzasVar.zza("custom_ica", feature2);
        zzasVar.zza("face", feature3);
        zzasVar.zza("ica", feature4);
        zzasVar.zza("ocr", feature5);
        zzasVar.zza("langid", feature6);
        zzasVar.zza("nlclassifier", feature7);
        zzasVar.zza("tflite_dynamite", feature8);
        zzasVar.zza("barcode_ui", feature9);
        zzasVar.zza("smart_reply", feature10);
        f38230A = zzasVar.zzb();
        zzas zzasVar2 = new zzas();
        zzasVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzasVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzasVar2.zza("com.google.android.gms.vision.face", feature3);
        zzasVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzasVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzasVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzasVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzasVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzasVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        f38231B = zzasVar2.zzb();
    }

    /* renamed from: a */
    public static void m42132a(Context context, final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: o.wjj
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = oec.f38232a;
                return featureArr;
            }
        }).build()).addOnFailureListener(new OnFailureListener() { // from class: o.zjj
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
            }
        });
    }
}
