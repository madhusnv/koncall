package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final class zzbr {
    public static PendingResult zza(Task task, final zzbq zzbqVar, final zzbq zzbqVar2) {
        final zzbp zzbpVar = new zzbp(zzbqVar2);
        task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzbn
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                zzbp zzbpVar2 = zzbpVar;
                int i = CastSession.zza;
                zzbpVar2.setResult(new Status(0));
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast.zzbo
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzbp zzbpVar2 = zzbpVar;
                Status status = new Status(8, "unknown error");
                if (exc instanceof ApiException) {
                    ApiException apiException = (ApiException) exc;
                    status = new Status(apiException.getStatusCode(), apiException.getMessage());
                }
                int i = CastSession.zza;
                zzbpVar2.setResult(status);
            }
        });
        return zzbpVar;
    }
}
