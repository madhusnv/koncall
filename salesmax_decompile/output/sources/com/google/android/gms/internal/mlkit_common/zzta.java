package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import p001o.cxh;
import p001o.dvh;
import p001o.fr1;
import p001o.n76;
import p001o.owh;
import p001o.rwh;
import p001o.xj6;

/* loaded from: classes3.dex */
public final class zzta implements zzsk {
    private Provider zza;
    private final Provider zzb;
    private final zzsm zzc;

    public zzta(Context context, zzsm zzsmVar) {
        this.zzc = zzsmVar;
        fr1 fr1Var = fr1.f23957g;
        cxh.m22043f(context);
        final rwh rwhVarM22047g = cxh.m22041c().m22047g(fr1Var);
        if (fr1Var.mo18214a().contains(n76.m40202b("json"))) {
            this.zza = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsx
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return rwhVarM22047g.mo47214a("FIREBASE_ML_SDK", byte[].class, n76.m40202b("json"), new dvh() { // from class: com.google.android.gms.internal.mlkit_common.zzsz
                        @Override // p001o.dvh
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsy
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return rwhVarM22047g.mo47214a("FIREBASE_ML_SDK", byte[].class, n76.m40202b("proto"), new dvh() { // from class: com.google.android.gms.internal.mlkit_common.zzsw
                    @Override // p001o.dvh
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static xj6 zzb(zzsm zzsmVar, zzsj zzsjVar) {
        return xj6.m56379g(zzsjVar.zze(zzsmVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsk
    public final void zza(zzsj zzsjVar) {
        if (this.zzc.zza() != 0) {
            ((owh) this.zzb.get()).mo42730a(zzb(this.zzc, zzsjVar));
            return;
        }
        Provider provider = this.zza;
        if (provider != null) {
            ((owh) provider.get()).mo42730a(zzb(this.zzc, zzsjVar));
        }
    }
}
