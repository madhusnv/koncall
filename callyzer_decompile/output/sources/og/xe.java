package og;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5179q;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class xe {
    /* renamed from: a */
    public static final long m11044a(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    /* renamed from: b */
    public static final boolean m11045b(String current, String str) {
        AbstractC4154l.m8923f(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < current.length()) {
                    char cCharAt = current.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != current.length() - 1) {
                        break;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                    return AbstractC4154l.m8918a(AbstractC5178p.g0(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final String m11046c(Collection collection) {
        AbstractC4154l.m8923f(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return AbstractC5179q.m10120b(AbstractC6663m.m12748L(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    /* renamed from: d */
    public static final long m11047d(long j6, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + ((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    /* renamed from: e */
    public static final long m11048e(long j6) {
        return (Math.round(Float.intBitsToFloat((int) (j6 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j6 >> 32))) << 32);
    }
}
