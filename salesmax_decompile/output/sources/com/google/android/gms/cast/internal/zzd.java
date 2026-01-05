package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.CastStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class zzd extends zzp {
    private final List zzb;

    public zzd(String str, String str2, String str3) {
        super(str, "MediaControlChannel", null);
        this.zzb = Collections.synchronizedList(new ArrayList());
    }

    public final List zza() {
        return this.zzb;
    }

    public final void zzb() {
        synchronized (this.zzb) {
            Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                ((zzav) it.next()).zzc(CastStatusCodes.CANCELED);
            }
        }
    }

    public final void zzc(zzav zzavVar) {
        this.zzb.add(zzavVar);
    }
}
