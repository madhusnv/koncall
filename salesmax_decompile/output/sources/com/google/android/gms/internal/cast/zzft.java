package com.google.android.gms.internal.cast;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.util.Constants;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzft extends zzfk {
    static final zzfk zza = new zzft(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzft(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[PHI: r5
      0x009e: PHI (r5v5 ??) = (r5v3 ??), (r5v4 short[]), (r5v6 byte[]) binds: [B:65:0x0165, B:48:0x0107, B:29:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzft zzh(int i, Object[] objArr, zzfj zzfjVar) {
        byte[] bArr;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzft) zza;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArrCopyOf[0];
            obj2.getClass();
            Object obj3 = objArrCopyOf[1];
            obj3.getClass();
            zzey.zza(obj2, obj3);
            return new zzft(null, objArrCopyOf, 1);
        }
        zzeu.zzb(i2, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzh = zzfl.zzh(i);
        if (i2 == 1) {
            Object obj4 = objArrCopyOf[0];
            obj4.getClass();
            Object obj5 = objArrCopyOf[1];
            obj5.getClass();
            zzey.zza(obj4, obj5);
        } else {
            int i3 = iZzh - 1;
            if (iZzh <= 128) {
                bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj6 = objArrCopyOf[i7];
                    obj6.getClass();
                    Object obj7 = objArrCopyOf[i7 ^ 1];
                    obj7.getClass();
                    zzey.zza(obj6, obj7);
                    int iZza = zzfa.zza(obj6.hashCode());
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
                                obj8.getClass();
                                zzfi zzfiVar = new zzfi(obj6, obj7, obj8);
                                objArrCopyOf[i10] = obj7;
                                obj = zzfiVar;
                                break;
                            }
                            iZza = i8 + 1;
                        }
                    }
                }
                obj = i4 == i2 ? bArr : new Object[]{bArr, Integer.valueOf(i4), obj};
            } else if (iZzh <= 32768) {
                bArr = new short[iZzh];
                Arrays.fill(bArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj9 = objArrCopyOf[i14];
                    obj9.getClass();
                    Object obj10 = objArrCopyOf[i14 ^ 1];
                    obj10.getClass();
                    zzey.zza(obj9, obj10);
                    int iZza2 = zzfa.zza(obj9.hashCode());
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
                                obj11.getClass();
                                zzfi zzfiVar2 = new zzfi(obj9, obj10, obj11);
                                objArrCopyOf[i16] = obj10;
                                obj = zzfiVar2;
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
                bArr = new int[iZzh];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    Object obj12 = objArrCopyOf[i20];
                    obj12.getClass();
                    Object obj13 = objArrCopyOf[i20 ^ 1];
                    obj13.getClass();
                    zzey.zza(obj12, obj13);
                    int iZza3 = zzfa.zza(obj12.hashCode());
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
                                obj14.getClass();
                                zzfi zzfiVar3 = new zzfi(obj12, obj13, obj14);
                                objArrCopyOf[i22] = obj13;
                                obj = zzfiVar3;
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
            zzfjVar.zzc = (zzfi) objArr2[2];
            Object obj15 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj = obj15;
            i2 = iIntValue;
        }
        return new zzft(obj, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.cast.zzfk, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i = this.zzd;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int iZza = zzfa.zza(obj.hashCode());
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
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzfa.zza(obj.hashCode());
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
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzfa.zza(obj.hashCode());
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
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.cast.zzfk
    public final zzfd zza() {
        return new zzfs(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzfk
    public final zzfl zze() {
        return new zzfq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzfk
    public final zzfl zzf() {
        return new zzfr(this, new zzfs(this.zzb, 0, this.zzd));
    }
}
