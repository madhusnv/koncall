package p001o;

import android.content.Intent;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzaa;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlm;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzln;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlo;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzlq;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class sij {
    /* renamed from: a */
    public static zzlq m48365a(Intent intent) {
        zzlm zzlmVar = new zzlm();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("uri_array_extra_initial_image_uris");
        if (parcelableArrayListExtra != null) {
            zzlmVar.zzg(Integer.valueOf(parcelableArrayListExtra.size()));
        }
        int intExtra = intent.getIntExtra("int_extra_default_capture_mode", -1);
        zzlmVar.zzb(intExtra != 1 ? intExtra != 2 ? zzln.MODE_UNKNOWN : zzln.MODE_MANUAL : zzln.MODE_AUTO);
        zzlmVar.zze(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_flash_mode_change_allowed", false)));
        zzlmVar.zzf(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_gallery_import_allowed", false)));
        zzlmVar.zzh(Boolean.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1) != 1));
        zzlmVar.zzj(Integer.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1)));
        zzlmVar.zzc(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_all_new_features_by_default", false)));
        zzlmVar.zzd(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_filter_allowed", false)));
        zzlmVar.zzl(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_shadow_removal_allowed", false)));
        zzlmVar.zzm(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_stain_removal_allowed", false)));
        zzaa zzaaVar = new zzaa();
        int[] intArrayExtra = intent.getIntArrayExtra("int_array_extra_result_formats");
        if (intArrayExtra != null) {
            for (int i : intArrayExtra) {
                zzaaVar.zza(m48367c(i));
            }
        }
        zzlmVar.zzk(zzaaVar.zzb());
        zzlmVar.zzi(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_page_edit_listener_enabled", false)));
        return zzlmVar.zzo();
    }

    /* renamed from: b */
    public static zzlq m48366b(xt7 xt7Var) {
        zzlm zzlmVar = new zzlm();
        zzlmVar.zzb(zzln.MODE_AUTO);
        zzlmVar.zze(Boolean.TRUE);
        zzlmVar.zzf(Boolean.valueOf(xt7Var.m56816d()));
        zzlmVar.zzj(Integer.valueOf(xt7Var.m56813a()));
        zzlmVar.zzc(Boolean.valueOf(xt7Var.m56814b()));
        zzlmVar.zzd(Boolean.valueOf(xt7Var.m56815c()));
        zzlmVar.zzl(Boolean.valueOf(xt7Var.m56817e()));
        zzlmVar.zzm(Boolean.valueOf(xt7Var.m56818f()));
        zzaa zzaaVar = new zzaa();
        for (int i : xt7Var.m56819g()) {
            zzaaVar.zza(m48367c(i));
        }
        zzlmVar.zzk(zzaaVar.zzb());
        zzlmVar.zzi(Boolean.FALSE);
        return zzlmVar.zzo();
    }

    /* renamed from: c */
    public static zzlo m48367c(int i) {
        return i != 101 ? i != 102 ? zzlo.FORMAT_UNKNOWN : zzlo.FORMAT_PDF : zzlo.FORMAT_JPEG;
    }
}
