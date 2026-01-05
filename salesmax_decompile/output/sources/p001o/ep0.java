package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class ep0 extends dp0 {
    /* renamed from: c */
    public static final boolean m25405c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!m25405c((Object[]) obj, (Object[]) obj2)) {
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
                } else if ((obj instanceof xzh) && (obj2 instanceof xzh)) {
                    if (!vzh.m53637c(((xzh) obj).m57061J(), ((xzh) obj2).m57061J())) {
                        return false;
                    }
                } else if ((obj instanceof e1i) && (obj2 instanceof e1i)) {
                    if (!vzh.m53635a(((e1i) obj).m24132J(), ((e1i) obj2).m24132J())) {
                        return false;
                    }
                } else if ((obj instanceof l0i) && (obj2 instanceof l0i)) {
                    if (!vzh.m53636b(((l0i) obj).m36437J(), ((l0i) obj2).m36437J())) {
                        return false;
                    }
                } else if ((obj instanceof q0i) && (obj2 instanceof q0i)) {
                    if (!vzh.m53638d(((q0i) obj).m44642J(), ((q0i) obj2).m44642J())) {
                        return false;
                    }
                } else if (!sq8.m48644c(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
