package og;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import s1.C6729x;
import s4.EnumC6757m;
import t1.C6982g;
import t1.C6990o;
import w2.C7870i;
import w2.InterfaceC7865d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class eg {
    /* renamed from: a */
    public static final boolean m10634a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !AbstractC4154l.m8918a(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!m10634a((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!AbstractC6662l.m12714d((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final int m10635b(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iM10635b = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iM10635b = (iM10635b * 31) + (obj instanceof Bundle ? m10635b((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return iM10635b;
    }

    /* renamed from: c */
    public static final C6982g m10636c(C6729x c6729x, int i10, long j6, C6990o c6990o, long j10, k1.x0 x0Var, InterfaceC7865d interfaceC7865d, C7870i c7870i, EnumC6757m enumC6757m, boolean z6, int i11) {
        return new C6982g(i10, i11, c6729x.m12875b(i10, j6), j10, c6990o.mo12102b(i10), x0Var, interfaceC7865d, c7870i, enumC6757m, z6);
    }
}
