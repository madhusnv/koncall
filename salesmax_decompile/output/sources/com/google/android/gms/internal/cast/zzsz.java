package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class zzsz extends zztd {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzsz(zzsy zzsyVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast.zztd
    public final void zza(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzvb.zzf(obj, j);
        if (list instanceof zzsx) {
            objUnmodifiableList = ((zzsx) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zztw) && (list instanceof zzsp)) {
                zzsp zzspVar = (zzsp) list;
                if (zzspVar.zzc()) {
                    zzspVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzvb.zzs(obj, j, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.zztd
    public final void zzb(Object obj, Object obj2, long j) {
        zzsw zzswVar;
        List list = (List) zzvb.zzf(obj2, j);
        int size = list.size();
        List listZzg = (List) zzvb.zzf(obj, j);
        if (listZzg.isEmpty()) {
            listZzg = listZzg instanceof zzsx ? new zzsw(size) : ((listZzg instanceof zztw) && (listZzg instanceof zzsp)) ? ((zzsp) listZzg).zzg(size) : new ArrayList(size);
            zzvb.zzs(obj, j, listZzg);
        } else {
            if (zza.isAssignableFrom(listZzg.getClass())) {
                ArrayList arrayList = new ArrayList(listZzg.size() + size);
                arrayList.addAll(listZzg);
                zzvb.zzs(obj, j, arrayList);
                zzswVar = arrayList;
            } else if (listZzg instanceof zzuw) {
                zzsw zzswVar2 = new zzsw(listZzg.size() + size);
                zzswVar2.addAll(zzswVar2.size(), (zzuw) listZzg);
                zzvb.zzs(obj, j, zzswVar2);
                zzswVar = zzswVar2;
            } else if ((listZzg instanceof zztw) && (listZzg instanceof zzsp)) {
                zzsp zzspVar = (zzsp) listZzg;
                if (!zzspVar.zzc()) {
                    listZzg = zzspVar.zzg(listZzg.size() + size);
                    zzvb.zzs(obj, j, listZzg);
                }
            }
            listZzg = zzswVar;
        }
        int size2 = listZzg.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzg.addAll(list);
        }
        if (size2 > 0) {
            list = listZzg;
        }
        zzvb.zzs(obj, j, list);
    }

    private zzsz() {
        super(null);
    }
}
