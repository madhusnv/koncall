package p001o;

import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class u4f {

    /* renamed from: a */
    public long[] f48325a;

    /* renamed from: b */
    public Object[] f48326b;

    /* renamed from: c */
    public Object[] f48327c;

    /* renamed from: d */
    public int f48328d;

    /* renamed from: e */
    public int f48329e;

    public /* synthetic */ u4f(id5 id5Var) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r11 = -1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m50936a(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & Opcodes.LAND;
        int i3 = this.f48328d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f48325a;
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
                if (sq8.m48644c(this.f48326b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r11 = -1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m50937b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & Opcodes.LAND;
        int i3 = this.f48328d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f48325a;
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
                if (sq8.m48644c(this.f48326b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f48327c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* renamed from: c */
    public final int m50938c() {
        return this.f48328d;
    }

    /* renamed from: d */
    public final int m50939d() {
        return this.f48329e;
    }

    /* renamed from: e */
    public final boolean m50940e() {
        return this.f48329e == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u4f)) {
            return false;
        }
        u4f u4fVar = (u4f) obj;
        if (u4fVar.m50939d() != m50939d()) {
            return false;
        }
        Object[] objArr = this.f48326b;
        Object[] objArr2 = this.f48327c;
        long[] jArr = this.f48325a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (u4fVar.m50937b(obj2) != null || !u4fVar.m50936a(obj2)) {
                                    break loop0;
                                }
                            } else if (!sq8.m48644c(obj3, u4fVar.m50937b(obj2))) {
                                return false;
                            }
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
        Object[] objArr = this.f48326b;
        Object[] objArr2 = this.f48327c;
        long[] jArr = this.f48325a;
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
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[PHI: r8
      0x007f: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        if (m50940e()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.f48326b;
        Object[] objArr2 = this.f48327c;
        long[] jArr = this.f48325a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this.f48329e) {
                                sb.append(',');
                                sb.append(TokenParser.SP);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        sq8.m48648g(string, "s.append('}').toString()");
        return string;
    }

    public u4f() {
        this.f48325a = v4f.f49867a;
        Object[] objArr = h14.f26081c;
        this.f48326b = objArr;
        this.f48327c = objArr;
    }
}
