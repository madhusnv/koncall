package p001o;

import com.google.android.gms.cast.MediaStatus;

/* loaded from: classes2.dex */
public abstract class ayf {

    /* renamed from: a */
    public static final int[] f15379a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m18023a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f15379a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static zxf m18024b(uq6 uq6Var) {
        return m18025c(uq6Var, true, false);
    }

    /* renamed from: c */
    public static zxf m18025c(uq6 uq6Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        int[] iArr;
        long length = uq6Var.getLength();
        long j = -1;
        long j2 = MediaStatus.COMMAND_EDIT_TRACKS;
        if (length != -1 && length <= MediaStatus.COMMAND_EDIT_TRACKS) {
            j2 = length;
        }
        int i4 = (int) j2;
        zwc zwcVar = new zwc(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            zwcVar.m60013Q(8);
            if (!uq6Var.mo40489a(zwcVar.m60024e(), i5, 8, true)) {
                break;
            }
            long jM60006J = zwcVar.m60006J();
            int iM60036q = zwcVar.m60036q();
            if (jM60006J == 1) {
                uq6Var.mo40498m(zwcVar.m60024e(), 8, 8);
                i2 = 16;
                zwcVar.m60016T(16);
                jM60006J = zwcVar.m59997A();
            } else {
                if (jM60006J == 0) {
                    long length2 = uq6Var.getLength();
                    if (length2 != j) {
                        jM60006J = (length2 - uq6Var.mo40493g()) + 8;
                    }
                }
                i2 = 8;
            }
            long j3 = jM60006J;
            long j4 = i2;
            if (j3 < j4) {
                return new ls0(iM60036q, j3, i2);
            }
            i6 += i2;
            if (iM60036q == 1836019574) {
                i4 += (int) j3;
                if (length != -1 && i4 > length) {
                    i4 = (int) length;
                }
            } else {
                if (iM60036q == 1836019558 || iM60036q == 1836475768) {
                    i = 1;
                    break;
                }
                long j5 = length;
                if (iM60036q == 1835295092) {
                    z4 = true;
                }
                if ((i6 + j3) - j4 >= i4) {
                    i = 0;
                    break;
                }
                int i7 = (int) (j3 - j4);
                i6 += i7;
                if (iM60036q != 1718909296) {
                    i3 = 0;
                    if (i7 != 0) {
                        uq6Var.mo40494h(i7);
                    }
                } else {
                    if (i7 < 8) {
                        return new ls0(iM60036q, i7, 8);
                    }
                    zwcVar.m60013Q(i7);
                    i3 = 0;
                    uq6Var.mo40498m(zwcVar.m60024e(), 0, i7);
                    int iM60036q2 = zwcVar.m60036q();
                    if (m18023a(iM60036q2, z2)) {
                        z4 = true;
                    }
                    zwcVar.m60018V(4);
                    int iM60020a = zwcVar.m60020a() / 4;
                    if (!z4 && iM60020a > 0) {
                        iArr = new int[iM60020a];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= iM60020a) {
                                z3 = z4;
                                break;
                            }
                            int iM60036q3 = zwcVar.m60036q();
                            iArr[i8] = iM60036q3;
                            if (m18023a(iM60036q3, z2)) {
                                z3 = true;
                                break;
                            }
                            i8++;
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        return new e5i(iM60036q2, iArr);
                    }
                    z4 = z3;
                }
                i5 = i3;
                length = j5;
            }
            j = -1;
        }
        i = i5;
        if (!z4) {
            return zyb.f57910a;
        }
        if (z != i) {
            return i != 0 ? rh8.f43635b : rh8.f43636c;
        }
        return null;
    }

    /* renamed from: d */
    public static zxf m18026d(uq6 uq6Var, boolean z) {
        return m18025c(uq6Var, false, z);
    }
}
