package com.google.android.gms.internal.cast;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzae extends com.google.android.gms.cast.framework.zzt {

    @VisibleForTesting
    public final Set zza = Collections.synchronizedSet(new HashSet());

    @Override // com.google.android.gms.cast.framework.zzu
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this);
    }

    @Override // com.google.android.gms.cast.framework.zzu
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzad) it.next()).zza();
        }
    }

    @Override // com.google.android.gms.cast.framework.zzu
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzad) it.next()).zzb();
        }
    }

    public final void zze(zzad zzadVar) {
        this.zza.add(zzadVar);
    }
}
