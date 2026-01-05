package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.util.Constants;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzbt extends zzbl {
    static final zzbl zza = new zzbt(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbt(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[PHI: r5
      0x009f: PHI (r5v5 ??) = (r5v3 ??), (r5v4 short[]), (r5v6 byte[]) binds: [B:65:0x0166, B:48:0x0108, B:29:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzbt zzg(int i, Object[] objArr, zzbk zzbkVar) {
        byte[] bArr;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzbt) zza;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzbd.zza(obj2, obj3);
            return new zzbt(null, objArrCopyOf, 1);
        }
        zzba.zzb(i2, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzf = zzbm.zzf(i);
        if (i2 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzbd.zza(obj4, obj5);
            i2 = 1;
        } else {
            int i3 = iZzf - 1;
            if (iZzf <= 128) {
                bArr = new byte[iZzf];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj6 = objArrCopyOf[i7];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i7 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzbd.zza(obj6, obj7);
                    int iZza = zzbe.zza(obj6.hashCode());
                    while (true) {
                        int i8 = iZza & i3;
                        int i9 = bArr[i8] & Constants.MAX_HOST_LENGTH;
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
                                Objects.requireNonNull(obj8);
                                zzbj zzbjVar = new zzbj(obj6, obj7, obj8);
                                objArrCopyOf[i10] = obj7;
                                obj = zzbjVar;
                                break;
                            }
                            iZza = i8 + 1;
                        }
                    }
                }
                obj = i4 == i2 ? bArr : new Object[]{bArr, Integer.valueOf(i4), obj};
            } else if (iZzf <= 32768) {
                bArr = new short[iZzf];
                Arrays.fill(bArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj9 = objArrCopyOf[i14];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArrCopyOf[i14 ^ 1];
                    Objects.requireNonNull(obj10);
                    zzbd.zza(obj9, obj10);
                    int iZza2 = zzbe.zza(obj9.hashCode());
                    while (true) {
                        int i15 = iZza2 & i3;
                        char c = (char) bArr[i15];
                        if (c == 65535) {
                            bArr[i15] = (short) i13;
                            if (i11 < i12) {
                                objArrCopyOf[i13] = obj9;
                                objArrCopyOf[i13 ^ 1] = obj10;
                            }
                            i11++;
                        } else {
                            if (obj9.equals(objArrCopyOf[c])) {
                                int i16 = c ^ 1;
                                Object obj11 = objArrCopyOf[i16];
                                Objects.requireNonNull(obj11);
                                zzbj zzbjVar2 = new zzbj(obj9, obj10, obj11);
                                objArrCopyOf[i16] = obj10;
                                obj = zzbjVar2;
                                break;
                            }
                            iZza2 = i15 + 1;
                        }
                    }
                }
                if (i11 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i11), obj};
                }
            } else {
                bArr = new int[iZzf];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    Object obj12 = objArrCopyOf[i20];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArrCopyOf[i20 ^ 1];
                    Objects.requireNonNull(obj13);
                    zzbd.zza(obj12, obj13);
                    int iZza3 = zzbe.zza(obj12.hashCode());
                    while (true) {
                        int i21 = iZza3 & i3;
                        ?? r14 = bArr[i21];
                        if (r14 == -1) {
                            bArr[i21] = i19;
                            if (i17 < i18) {
                                objArrCopyOf[i19] = obj12;
                                objArrCopyOf[i19 ^ 1] = obj13;
                            }
                            i17++;
                        } else {
                            if (obj12.equals(objArrCopyOf[r14])) {
                                int i22 = r14 ^ 1;
                                Object obj14 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj14);
                                zzbj zzbjVar3 = new zzbj(obj12, obj13, obj14);
                                objArrCopyOf[i22] = obj13;
                                obj = zzbjVar3;
                                break;
                            }
                            iZza3 = i21 + 1;
                        }
                    }
                }
                if (i17 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i17), obj};
                }
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr2 = (Object[]) obj;
            zzbkVar.zzc = (zzbj) objArr2[2];
            Object obj15 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj = obj15;
            i2 = iIntValue;
        }
        return new zzbt(obj, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.maps.zzbl, java.util.Map
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
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iZza = zzbe.zza(obj.hashCode());
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
                        int iZza2 = zzbe.zza(obj.hashCode());
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
                        int iZza3 = zzbe.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.maps.zzbl
    public final zzbf zza() {
        return new zzbs(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbl
    public final zzbm zzd() {
        return new zzbq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbl
    public final zzbm zze() {
        return new zzbr(this, new zzbs(this.zzb, 0, this.zzd));
    }
}
