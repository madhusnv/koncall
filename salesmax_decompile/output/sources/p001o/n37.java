package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class n37 {

    /* renamed from: a */
    public long[] f36307a;

    /* renamed from: b */
    public float[] f36308b;

    /* renamed from: c */
    public int f36309c;

    /* renamed from: d */
    public int f36310d;

    public /* synthetic */ n37(id5 id5Var) {
        this();
    }

    /* renamed from: d */
    public static /* synthetic */ String m40034d(n37 n37Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        return n37Var.m40037c(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        r10 = -1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m40035a(float f) {
        int iNumberOfTrailingZeros;
        int iHashCode = Float.hashCode(f) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & Opcodes.LAND;
        int i3 = this.f36309c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f36307a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (i2 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (!(j3 != 0)) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.f36308b[iNumberOfTrailingZeros] == f) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* renamed from: b */
    public final int m40036b() {
        return this.f36309c;
    }

    /* renamed from: c */
    public final String m40037c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f36308b;
        long[] jArr = this.f36307a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i2 << 3) + i6];
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(f);
                            i3++;
                        }
                        j >>= 8;
                        i6++;
                        i4 = 8;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            sb.append(charSequence3);
        } else {
            sb.append(charSequence3);
        }
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n37)) {
            return false;
        }
        n37 n37Var = (n37) obj;
        if (n37Var.f36310d != this.f36310d) {
            return false;
        }
        float[] fArr = this.f36308b;
        long[] jArr = this.f36307a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (((255 & j) < 128) && !n37Var.m40035a(fArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        float[] fArr = this.f36308b;
        long[] jArr = this.f36307a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            iHashCode += Float.hashCode(fArr[(i2 << 3) + i4]);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    i = iHashCode;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public String toString() {
        return m40034d(this, null, "[", "]", 0, null, 25, null);
    }

    public n37() {
        this.f36307a = v4f.f49867a;
        this.f36308b = o37.m41495a();
    }
}
