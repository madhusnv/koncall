package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzbb extends zzat {
    static final zzat zza = new zzbb(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbb(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c A[PHI: r4
      0x018c: PHI (r4v3 ??) = (r4v2 ??), (r4v4 short[]) binds: [B:72:0x018a, B:55:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzbb zzg(int i, Object[] objArr, zzas zzasVar) {
        int iHighestOneBit;
        short[] sArr;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzbb) zza;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArrCopyOf[0];
            obj2.getClass();
            Object obj3 = objArrCopyOf[1];
            obj3.getClass();
            zzah.zza(obj2, obj3);
            return new zzbb(null, objArrCopyOf, 1);
        }
        zzae.zzb(i2, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i2 == 1) {
            Object obj4 = objArrCopyOf[0];
            obj4.getClass();
            Object obj5 = objArrCopyOf[1];
            obj5.getClass();
            zzah.zza(obj4, obj5);
            i2 = 1;
        } else {
            int i3 = iHighestOneBit - 1;
            char c = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj6 = objArrCopyOf[i7];
                    obj6.getClass();
                    Object obj7 = objArrCopyOf[i7 ^ 1];
                    obj7.getClass();
                    zzah.zza(obj6, obj7);
                    int iZza = zzaj.zza(obj6.hashCode());
                    while (true) {
                        int i8 = iZza & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i6;
                            if (i4 < i5) {
                                objArrCopyOf[i6] = obj6;
                                objArrCopyOf[i6 ^ 1] = obj7;
                            }
                            i4++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i9])) {
                                int i10 = i9 ^ 1;
                                Object obj8 = objArrCopyOf[i10];
                                obj8.getClass();
                                zzar zzarVar = new zzar(obj6, obj7, obj8);
                                objArrCopyOf[i10] = obj7;
                                obj = zzarVar;
                                break;
                            }
                            iZza = i8 + 1;
                        }
                    }
                }
                obj = i4 == i2 ? bArr : new Object[]{bArr, Integer.valueOf(i4), obj};
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj9 = objArrCopyOf[i14];
                    obj9.getClass();
                    Object obj10 = objArrCopyOf[i14 ^ 1];
                    obj10.getClass();
                    zzah.zza(obj9, obj10);
                    int iZza2 = zzaj.zza(obj9.hashCode());
                    while (true) {
                        int i15 = iZza2 & i3;
                        char c2 = (char) sArr[i15];
                        if (c2 == 65535) {
                            sArr[i15] = (short) i13;
                            if (i11 < i12) {
                                objArrCopyOf[i13] = obj9;
                                objArrCopyOf[i13 ^ 1] = obj10;
                            }
                            i11++;
                        } else {
                            if (obj9.equals(objArrCopyOf[c2])) {
                                int i16 = c2 ^ 1;
                                Object obj11 = objArrCopyOf[i16];
                                obj11.getClass();
                                zzar zzarVar2 = new zzar(obj9, obj10, obj11);
                                objArrCopyOf[i16] = obj10;
                                obj = zzarVar2;
                                break;
                            }
                            iZza2 = i15 + 1;
                        }
                    }
                }
                obj = i11 == i2 ? sArr : new Object[]{sArr, Integer.valueOf(i11), obj};
            } else {
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i2) {
                    int i19 = i18 + i18;
                    int i20 = i17 + i17;
                    Object obj12 = objArrCopyOf[i20];
                    obj12.getClass();
                    Object obj13 = objArrCopyOf[i20 ^ 1];
                    obj13.getClass();
                    zzah.zza(obj12, obj13);
                    int iZza3 = zzaj.zza(obj12.hashCode());
                    while (true) {
                        int i21 = iZza3 & i3;
                        ?? r15 = sArr[i21];
                        if (r15 == c) {
                            sArr[i21] = i19;
                            if (i18 < i17) {
                                objArrCopyOf[i19] = obj12;
                                objArrCopyOf[i19 ^ 1] = obj13;
                            }
                            i18++;
                        } else {
                            if (obj12.equals(objArrCopyOf[r15])) {
                                int i22 = r15 ^ 1;
                                Object obj14 = objArrCopyOf[i22];
                                obj14.getClass();
                                zzar zzarVar3 = new zzar(obj12, obj13, obj14);
                                objArrCopyOf[i22] = obj13;
                                obj = zzarVar3;
                                break;
                            }
                            iZza3 = i21 + 1;
                            c = 65535;
                        }
                    }
                    i17++;
                    c = 65535;
                }
                if (i18 != i2) {
                    obj = new Object[]{sArr, Integer.valueOf(i18), obj};
                }
            }
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr2 = (Object[]) obj;
            zzar zzarVar4 = (zzar) objArr2[2];
            if (zzasVar == null) {
                throw zzarVar4.zza();
            }
            zzasVar.zzc = zzarVar4;
            Object obj16 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i2 = iIntValue;
        }
        return new zzbb(obj15, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.mlkit_common.zzat, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iZza = zzaj.zza(obj.hashCode());
                        while (true) {
                            int i2 = iZza & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            iZza = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iZza2 = zzaj.zza(obj.hashCode());
                        while (true) {
                            int i4 = iZza2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            iZza2 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iZza3 = zzaj.zza(obj.hashCode());
                        while (true) {
                            int i5 = iZza3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            iZza3 = i5 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    public final zzam zza() {
        return new zzba(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    public final zzau zzd() {
        return new zzay(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    public final zzau zze() {
        return new zzaz(this, new zzba(this.zzb, 0, this.zzd));
    }
}
