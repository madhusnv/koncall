package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzfl extends zzfd implements Set {
    private transient zzfh zza;

    public static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfl zzj(Collection collection) {
        Object[] array = collection.toArray();
        return zzm(array.length, array);
    }

    public static zzfl zzk() {
        return zzfu.zza;
    }

    private static zzfl zzm(int i, Object... objArr) {
        if (i == 0) {
            return zzfu.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzfw(obj);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzfn.zza(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iZza = zzfa.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfw(obj4);
        }
        if (zzh(i4) < iZzh / 2) {
            return zzm(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzfu(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfl) && zzl() && ((zzfl) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfv.zza(this);
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public zzfh zzd() {
        zzfh zzfhVar = this.zza;
        if (zzfhVar != null) {
            return zzfhVar;
        }
        zzfh zzfhVarZzi = zzi();
        this.zza = zzfhVarZzi;
        return zzfhVarZzi;
    }

    @Override // com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfx iterator();

    public zzfh zzi() {
        Object[] array = toArray();
        int i = zzfh.zzd;
        return zzfh.zzi(array, array.length);
    }

    public boolean zzl() {
        return false;
    }
}
