package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import p001o.h3d;

/* loaded from: classes3.dex */
final class zzg extends zzq {
    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzq
    public final int zza(Context context, zzp zzpVar, boolean z) {
        return (zzpVar.zza.getAuthority().lastIndexOf(64) < 0 || h3d.m29777b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
