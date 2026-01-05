package p001o;

import com.google.api.Service;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.bdj;
import p001o.bt8;
import p001o.mo0;
import p001o.mra;
import p001o.xn8;
import p001o.yq1;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class ycb implements o5f {

    /* renamed from: r */
    public static final int[] f55217r = new int[0];

    /* renamed from: s */
    public static final Unsafe f55218s = a5i.m16447B();

    /* renamed from: a */
    public final int[] f55219a;

    /* renamed from: b */
    public final Object[] f55220b;

    /* renamed from: c */
    public final int f55221c;

    /* renamed from: d */
    public final int f55222d;

    /* renamed from: e */
    public final rcb f55223e;

    /* renamed from: f */
    public final boolean f55224f;

    /* renamed from: g */
    public final boolean f55225g;

    /* renamed from: h */
    public final boolean f55226h;

    /* renamed from: i */
    public final boolean f55227i;

    /* renamed from: j */
    public final int[] f55228j;

    /* renamed from: k */
    public final int f55229k;

    /* renamed from: l */
    public final int f55230l;

    /* renamed from: m */
    public final mub f55231m;

    /* renamed from: n */
    public final oea f55232n;

    /* renamed from: o */
    public final k4i f55233o;

    /* renamed from: p */
    public final sp6 f55234p;

    /* renamed from: q */
    public final rra f55235q;

    public ycb(int[] iArr, Object[] objArr, int i, int i2, rcb rcbVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, mub mubVar, oea oeaVar, k4i k4iVar, sp6 sp6Var, rra rraVar) {
        this.f55219a = iArr;
        this.f55220b = objArr;
        this.f55221c = i;
        this.f55222d = i2;
        this.f55225g = rcbVar instanceof vn7;
        this.f55226h = z;
        this.f55224f = sp6Var != null && sp6Var.mo48607e(rcbVar);
        this.f55227i = z2;
        this.f55228j = iArr2;
        this.f55229k = i3;
        this.f55230l = i4;
        this.f55231m = mubVar;
        this.f55232n = oeaVar;
        this.f55233o = k4iVar;
        this.f55234p = sp6Var;
        this.f55223e = rcbVar;
        this.f55235q = rraVar;
    }

    /* renamed from: A */
    public static boolean m57522A(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: D */
    public static boolean m57523D(Object obj, int i, o5f o5fVar) {
        return o5fVar.mo16906c(a5i.m16446A(obj, m57530U(i)));
    }

    /* renamed from: I */
    public static boolean m57524I(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: J */
    public static List m57525J(Object obj, long j) {
        return (List) a5i.m16446A(obj, j);
    }

    /* renamed from: K */
    public static long m57526K(Object obj, long j) {
        return a5i.m16487y(obj, j);
    }

    /* renamed from: Q */
    public static ycb m57527Q(Class cls, ocb ocbVar, mub mubVar, oea oeaVar, k4i k4iVar, sp6 sp6Var, rra rraVar) {
        if (ocbVar instanceof hce) {
            return m57529S((hce) ocbVar, mubVar, oeaVar, k4iVar, sp6Var, rraVar);
        }
        tq.m50332a(ocbVar);
        return m57528R(null, mubVar, oeaVar, k4iVar, sp6Var, rraVar);
    }

    /* renamed from: R */
    public static ycb m57528R(o9g o9gVar, mub mubVar, oea oeaVar, k4i k4iVar, sp6 sp6Var, rra rraVar) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039e  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ycb m57529S(hce hceVar, mub mubVar, oea oeaVar, k4i k4iVar, sp6 sp6Var, rra rraVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        boolean z;
        int i15;
        int[] iArr2;
        int i16;
        int i17;
        String str;
        Class<?> cls;
        int i18;
        int i19;
        int i20;
        int iObjectFieldOffset;
        int i21;
        int i22;
        Field fieldM0;
        int i23;
        char cCharAt9;
        int i24;
        int i25;
        Object obj;
        Field fieldM02;
        Object obj2;
        Field fieldM03;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        char cCharAt14;
        int i30 = 0;
        boolean z2 = hceVar.mo30237c() == u1e.PROTO3;
        String strM30239e = hceVar.m30239e();
        int length = strM30239e.length();
        int iCharAt4 = strM30239e.charAt(0);
        if (iCharAt4 >= 55296) {
            int i31 = iCharAt4 & 8191;
            int i32 = 1;
            int i33 = 13;
            while (true) {
                i = i32 + 1;
                cCharAt14 = strM30239e.charAt(i32);
                if (cCharAt14 < 55296) {
                    break;
                }
                i31 |= (cCharAt14 & 8191) << i33;
                i33 += 13;
                i32 = i;
            }
            iCharAt4 = i31 | (cCharAt14 << i33);
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int iCharAt5 = strM30239e.charAt(i);
        if (iCharAt5 >= 55296) {
            int i35 = iCharAt5 & 8191;
            int i36 = 13;
            while (true) {
                i29 = i34 + 1;
                cCharAt13 = strM30239e.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i29;
            }
            iCharAt5 = i35 | (cCharAt13 << i36);
            i34 = i29;
        }
        if (iCharAt5 == 0) {
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            iCharAt3 = 0;
            iArr = f55217r;
            i3 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt6 = strM30239e.charAt(i34);
            if (iCharAt6 >= 55296) {
                int i38 = iCharAt6 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    cCharAt8 = strM30239e.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                iCharAt6 = i38 | (cCharAt8 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            int iCharAt7 = strM30239e.charAt(i37);
            if (iCharAt7 >= 55296) {
                int i41 = iCharAt7 & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    cCharAt7 = strM30239e.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                iCharAt7 = i41 | (cCharAt7 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int iCharAt8 = strM30239e.charAt(i40);
            if (iCharAt8 >= 55296) {
                int i44 = iCharAt8 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    cCharAt6 = strM30239e.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                iCharAt8 = i44 | (cCharAt6 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            iCharAt = strM30239e.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    cCharAt5 = strM30239e.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                iCharAt = i47 | (cCharAt5 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            iCharAt2 = strM30239e.charAt(i46);
            if (iCharAt2 >= 55296) {
                int i50 = iCharAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    cCharAt4 = strM30239e.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                iCharAt2 = i50 | (cCharAt4 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int iCharAt9 = strM30239e.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    cCharAt3 = strM30239e.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                iCharAt9 = i53 | (cCharAt3 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            int iCharAt10 = strM30239e.charAt(i52);
            if (iCharAt10 >= 55296) {
                int i56 = iCharAt10 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt2 = strM30239e.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                iCharAt10 = i56 | (cCharAt2 << i57);
                i55 = i6;
            }
            int i58 = i55 + 1;
            iCharAt3 = strM30239e.charAt(i55);
            if (iCharAt3 >= 55296) {
                int i59 = iCharAt3 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i5 = i60 + 1;
                    cCharAt = strM30239e.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i60 = i5;
                }
                iCharAt3 = i59 | (cCharAt << i61);
                i58 = i5;
            }
            int[] iArr3 = new int[iCharAt3 + iCharAt9 + iCharAt10];
            i2 = (iCharAt6 * 2) + iCharAt7;
            i3 = iCharAt6;
            i34 = i58;
            int i62 = iCharAt9;
            iArr = iArr3;
            i30 = iCharAt8;
            i4 = i62;
        }
        Unsafe unsafe = f55218s;
        Object[] objArrM30238d = hceVar.m30238d();
        Class<?> cls2 = hceVar.mo30236b().getClass();
        int[] iArr4 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 * 2];
        int i63 = iCharAt3 + i4;
        int i64 = iCharAt3;
        int i65 = i63;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int iCharAt11 = strM30239e.charAt(i34);
            int i69 = length;
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    cCharAt12 = strM30239e.charAt(i71);
                    i13 = iCharAt3;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    iCharAt3 = i13;
                }
                iCharAt11 = i70 | (cCharAt12 << i72);
                i14 = i28;
            } else {
                i13 = iCharAt3;
                i14 = i68;
            }
            int i73 = i14 + 1;
            int iCharAt12 = strM30239e.charAt(i14);
            if (iCharAt12 >= 55296) {
                int i74 = iCharAt12 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i27 = i75 + 1;
                    cCharAt11 = strM30239e.charAt(i75);
                    z = z2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i27;
                    z2 = z;
                }
                iCharAt12 = i74 | (cCharAt11 << i76);
                i15 = i27;
            } else {
                z = z2;
                i15 = i73;
            }
            int i77 = iCharAt12 & Constants.MAX_HOST_LENGTH;
            int i78 = iCharAt;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i79 = i66;
            if (i77 >= 51) {
                int i80 = i15 + 1;
                int iCharAt13 = strM30239e.charAt(i15);
                char c = 55296;
                if (iCharAt13 >= 55296) {
                    int i81 = iCharAt13 & 8191;
                    int i82 = 13;
                    while (true) {
                        i26 = i80 + 1;
                        cCharAt10 = strM30239e.charAt(i80);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i80 = i26;
                        c = 55296;
                    }
                    iCharAt13 = i81 | (cCharAt10 << i82);
                    i80 = i26;
                }
                int i83 = i77 - 51;
                int i84 = i80;
                if (i83 == 9 || i83 == 17) {
                    i25 = i2 + 1;
                    objArr[((i67 / 3) * 2) + 1] = objArrM30238d[i2];
                } else {
                    if (i83 == 12 && (iCharAt4 & 1) == 1) {
                        i25 = i2 + 1;
                        objArr[((i67 / 3) * 2) + 1] = objArrM30238d[i2];
                    }
                    int i85 = iCharAt13 * 2;
                    obj = objArrM30238d[i85];
                    if (obj instanceof Field) {
                        fieldM02 = m0(cls2, (String) obj);
                        objArrM30238d[i85] = fieldM02;
                    } else {
                        fieldM02 = (Field) obj;
                    }
                    iArr2 = iArr4;
                    i16 = iCharAt11;
                    int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM02);
                    int i86 = i85 + 1;
                    obj2 = objArrM30238d[i86];
                    if (obj2 instanceof Field) {
                        fieldM03 = m0(cls2, (String) obj2);
                        objArrM30238d[i86] = fieldM03;
                    } else {
                        fieldM03 = (Field) obj2;
                    }
                    str = strM30239e;
                    cls = cls2;
                    i18 = iCharAt4;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM03);
                    i22 = iObjectFieldOffset2;
                    i19 = i77;
                    i34 = i84;
                    i21 = 0;
                }
                i2 = i25;
                int i852 = iCharAt13 * 2;
                obj = objArrM30238d[i852];
                if (obj instanceof Field) {
                }
                iArr2 = iArr4;
                i16 = iCharAt11;
                int iObjectFieldOffset22 = (int) unsafe.objectFieldOffset(fieldM02);
                int i862 = i852 + 1;
                obj2 = objArrM30238d[i862];
                if (obj2 instanceof Field) {
                }
                str = strM30239e;
                cls = cls2;
                i18 = iCharAt4;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM03);
                i22 = iObjectFieldOffset22;
                i19 = i77;
                i34 = i84;
                i21 = 0;
            } else {
                iArr2 = iArr4;
                i16 = iCharAt11;
                int i87 = i2 + 1;
                Field fieldM04 = m0(cls2, (String) objArrM30238d[i2]);
                if (i77 == 9 || i77 == 17) {
                    objArr[((i67 / 3) * 2) + 1] = fieldM04.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i24 = i87 + 1;
                        objArr[((i67 / 3) * 2) + 1] = objArrM30238d[i87];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if ((iCharAt4 & 1) == 1) {
                            i24 = i87 + 1;
                            objArr[((i67 / 3) * 2) + 1] = objArrM30238d[i87];
                        }
                    } else if (i77 == 50) {
                        int i88 = i64 + 1;
                        iArr[i64] = i67;
                        int i89 = (i67 / 3) * 2;
                        int i90 = i87 + 1;
                        objArr[i89] = objArrM30238d[i87];
                        if ((iCharAt12 & 2048) != 0) {
                            i87 = i90 + 1;
                            objArr[i89 + 1] = objArrM30238d[i90];
                            i64 = i88;
                        } else {
                            i64 = i88;
                            i87 = i90;
                        }
                    }
                    i17 = i77;
                    i87 = i24;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM04);
                    if ((iCharAt4 & 1) != 1) {
                        i19 = i17;
                        if (i19 <= 17) {
                            i20 = i15 + 1;
                            int iCharAt14 = strM30239e.charAt(i15);
                            if (iCharAt14 >= 55296) {
                                int i91 = iCharAt14 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i23 = i20 + 1;
                                    cCharAt9 = strM30239e.charAt(i20);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i91 |= (cCharAt9 & 8191) << i92;
                                    i92 += 13;
                                    i20 = i23;
                                }
                                iCharAt14 = i91 | (cCharAt9 << i92);
                                i20 = i23;
                            }
                            int i93 = (i3 * 2) + (iCharAt14 / 32);
                            Object obj3 = objArrM30238d[i93];
                            str = strM30239e;
                            if (obj3 instanceof Field) {
                                fieldM0 = (Field) obj3;
                            } else {
                                fieldM0 = m0(cls2, (String) obj3);
                                objArrM30238d[i93] = fieldM0;
                            }
                            cls = cls2;
                            i18 = iCharAt4;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM0);
                            i21 = iCharAt14 % 32;
                            if (i19 >= 18 && i19 <= 49) {
                                iArr[i65] = iObjectFieldOffset3;
                                i65++;
                            }
                            int i94 = i20;
                            i2 = i87;
                            i22 = iObjectFieldOffset3;
                            i34 = i94;
                        } else {
                            str = strM30239e;
                            cls = cls2;
                            i18 = iCharAt4;
                        }
                    } else {
                        str = strM30239e;
                        cls = cls2;
                        i18 = iCharAt4;
                        i19 = i17;
                    }
                    i20 = i15;
                    iObjectFieldOffset = 0;
                    i21 = 0;
                    if (i19 >= 18) {
                        iArr[i65] = iObjectFieldOffset3;
                        i65++;
                    }
                    int i942 = i20;
                    i2 = i87;
                    i22 = iObjectFieldOffset3;
                    i34 = i942;
                }
                i17 = i77;
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldM04);
                if ((iCharAt4 & 1) != 1) {
                }
                i20 = i15;
                iObjectFieldOffset = 0;
                i21 = 0;
                if (i19 >= 18) {
                }
                int i9422 = i20;
                i2 = i87;
                i22 = iObjectFieldOffset32;
                i34 = i9422;
            }
            int i95 = i67 + 1;
            iArr2[i67] = i16;
            int i96 = i95 + 1;
            int i97 = i18;
            iArr2[i95] = ((iCharAt12 & 512) != 0 ? 536870912 : 0) | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | (i19 << 20) | i22;
            int i98 = i96 + 1;
            iArr2[i96] = (i21 << 20) | iObjectFieldOffset;
            iArr4 = iArr2;
            cls2 = cls;
            iCharAt4 = i97;
            iCharAt = i78;
            length = i69;
            iCharAt3 = i13;
            z2 = z;
            i66 = i79;
            i67 = i98;
            strM30239e = str;
        }
        return new ycb(iArr4, objArr, i30, iCharAt, hceVar.mo30236b(), z2, false, iArr, iCharAt3, i63, mubVar, oeaVar, k4iVar, sp6Var, rraVar);
    }

    /* renamed from: U */
    public static long m57530U(int i) {
        return i & 1048575;
    }

    /* renamed from: V */
    public static boolean m57531V(Object obj, long j) {
        return ((Boolean) a5i.m16446A(obj, j)).booleanValue();
    }

    /* renamed from: W */
    public static double m57532W(Object obj, long j) {
        return ((Double) a5i.m16446A(obj, j)).doubleValue();
    }

    /* renamed from: X */
    public static float m57533X(Object obj, long j) {
        return ((Float) a5i.m16446A(obj, j)).floatValue();
    }

    /* renamed from: Y */
    public static int m57534Y(Object obj, long j) {
        return ((Integer) a5i.m16446A(obj, j)).intValue();
    }

    /* renamed from: Z */
    public static long m57535Z(Object obj, long j) {
        return ((Long) a5i.m16446A(obj, j)).longValue();
    }

    /* renamed from: l */
    public static boolean m57536l(Object obj, long j) {
        return a5i.m16478p(obj, j);
    }

    public static Field m0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: n */
    public static double m57537n(Object obj, long j) {
        return a5i.m16484v(obj, j);
    }

    public static int q0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: r */
    public static float m57538r(Object obj, long j) {
        return a5i.m16485w(obj, j);
    }

    /* renamed from: v */
    public static m4i m57539v(Object obj) {
        vn7 vn7Var = (vn7) obj;
        m4i m4iVar = vn7Var.unknownFields;
        if (m4iVar != m4i.m38362e()) {
            return m4iVar;
        }
        m4i m4iVarM38366l = m4i.m38366l();
        vn7Var.unknownFields = m4iVarM38366l;
        return m4iVarM38366l;
    }

    /* renamed from: z */
    public static int m57540z(Object obj, long j) {
        return a5i.m16486x(obj, j);
    }

    /* renamed from: B */
    public final boolean m57541B(Object obj, int i) {
        if (!this.f55226h) {
            int iH0 = h0(i);
            return (a5i.m16486x(obj, (long) (iH0 & 1048575)) & (1 << (iH0 >>> 20))) != 0;
        }
        int iR0 = r0(i);
        long jM57530U = m57530U(iR0);
        switch (q0(iR0)) {
            case 0:
                return a5i.m16484v(obj, jM57530U) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 1:
                return a5i.m16485w(obj, jM57530U) != 0.0f;
            case 2:
                return a5i.m16487y(obj, jM57530U) != 0;
            case 3:
                return a5i.m16487y(obj, jM57530U) != 0;
            case 4:
                return a5i.m16486x(obj, jM57530U) != 0;
            case 5:
                return a5i.m16487y(obj, jM57530U) != 0;
            case 6:
                return a5i.m16486x(obj, jM57530U) != 0;
            case 7:
                return a5i.m16478p(obj, jM57530U);
            case 8:
                Object objM16446A = a5i.m16446A(obj, jM57530U);
                if (objM16446A instanceof String) {
                    return !((String) objM16446A).isEmpty();
                }
                if (objM16446A instanceof yq1) {
                    return !yq1.f55802b.equals(objM16446A);
                }
                throw new IllegalArgumentException();
            case 9:
                return a5i.m16446A(obj, jM57530U) != null;
            case 10:
                return !yq1.f55802b.equals(a5i.m16446A(obj, jM57530U));
            case 11:
                return a5i.m16486x(obj, jM57530U) != 0;
            case 12:
                return a5i.m16486x(obj, jM57530U) != 0;
            case 13:
                return a5i.m16486x(obj, jM57530U) != 0;
            case 14:
                return a5i.m16487y(obj, jM57530U) != 0;
            case 15:
                return a5i.m16486x(obj, jM57530U) != 0;
            case 16:
                return a5i.m16487y(obj, jM57530U) != 0;
            case 17:
                return a5i.m16446A(obj, jM57530U) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: C */
    public final boolean m57542C(Object obj, int i, int i2, int i3) {
        return this.f55226h ? m57541B(obj, i) : (i2 & i3) != 0;
    }

    /* renamed from: E */
    public final boolean m57543E(Object obj, int i, int i2) {
        List list = (List) a5i.m16446A(obj, m57530U(i));
        if (list.isEmpty()) {
            return true;
        }
        o5f o5fVarM57560u = m57560u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!o5fVarM57560u.mo16906c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m57544F(Object obj, int i, int i2) {
        if (this.f55235q.mo47097e(a5i.m16446A(obj, m57530U(i))).isEmpty()) {
            return true;
        }
        this.f55235q.mo47094b(m57559t(i2));
        throw null;
    }

    /* renamed from: G */
    public final boolean m57545G(Object obj, Object obj2, int i) {
        long jH0 = h0(i) & 1048575;
        return a5i.m16486x(obj, jH0) == a5i.m16486x(obj2, jH0);
    }

    /* renamed from: H */
    public final boolean m57546H(Object obj, int i, int i2) {
        return a5i.m16486x(obj, (long) (h0(i2) & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r0 = r16.f55229k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r0 >= r16.f55230l) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r13 = m57556p(r19, r16.f55228j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r17.mo34985o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        return;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m57547L(k4i k4iVar, sp6 sp6Var, Object obj, nce nceVar, pp6 pp6Var) {
        Object objM57556p = null;
        gu6 gu6VarMo48606d = null;
        while (true) {
            try {
                int iMo37107z = nceVar.mo37107z();
                int iF0 = f0(iMo37107z);
                if (iF0 >= 0) {
                    int iR0 = r0(iF0);
                    try {
                        switch (q0(iR0)) {
                            case 0:
                                a5i.m16456K(obj, m57530U(iR0), nceVar.readDouble());
                                n0(obj, iF0);
                                break;
                            case 1:
                                a5i.m16457L(obj, m57530U(iR0), nceVar.readFloat());
                                n0(obj, iF0);
                                break;
                            case 2:
                                a5i.m16459N(obj, m57530U(iR0), nceVar.mo37068G());
                                n0(obj, iF0);
                                break;
                            case 3:
                                a5i.m16459N(obj, m57530U(iR0), nceVar.mo37100s());
                                n0(obj, iF0);
                                break;
                            case 4:
                                a5i.m16458M(obj, m57530U(iR0), nceVar.mo37097p());
                                n0(obj, iF0);
                                break;
                            case 5:
                                a5i.m16459N(obj, m57530U(iR0), nceVar.mo37082a());
                                n0(obj, iF0);
                                break;
                            case 6:
                                a5i.m16458M(obj, m57530U(iR0), nceVar.mo37102u());
                                n0(obj, iF0);
                                break;
                            case 7:
                                a5i.m16450E(obj, m57530U(iR0), nceVar.mo37086e());
                                n0(obj, iF0);
                                break;
                            case 8:
                                k0(obj, iR0, nceVar);
                                n0(obj, iF0);
                                break;
                            case 9:
                                if (m57541B(obj, iF0)) {
                                    a5i.m16460O(obj, m57530U(iR0), xn8.m56506h(a5i.m16446A(obj, m57530U(iR0)), nceVar.mo37072K(m57560u(iF0), pp6Var)));
                                    break;
                                } else {
                                    a5i.m16460O(obj, m57530U(iR0), nceVar.mo37072K(m57560u(iF0), pp6Var));
                                    n0(obj, iF0);
                                    break;
                                }
                            case 10:
                                a5i.m16460O(obj, m57530U(iR0), nceVar.mo37096o());
                                n0(obj, iF0);
                                break;
                            case 11:
                                a5i.m16458M(obj, m57530U(iR0), nceVar.mo37089h());
                                n0(obj, iF0);
                                break;
                            case 12:
                                int iMo37092k = nceVar.mo37092k();
                                xn8.InterfaceC18195c interfaceC18195cM57558s = m57558s(iF0);
                                if (interfaceC18195cM57558s != null && !interfaceC18195cM57558s.isInRange(iMo37092k)) {
                                    objM57556p = z5f.m58791K(iMo37107z, iMo37092k, objM57556p, k4iVar);
                                    break;
                                } else {
                                    a5i.m16458M(obj, m57530U(iR0), iMo37092k);
                                    n0(obj, iF0);
                                    break;
                                }
                                break;
                            case 13:
                                a5i.m16458M(obj, m57530U(iR0), nceVar.mo37065D());
                                n0(obj, iF0);
                                break;
                            case 14:
                                a5i.m16459N(obj, m57530U(iR0), nceVar.mo37087f());
                                n0(obj, iF0);
                                break;
                            case 15:
                                a5i.m16458M(obj, m57530U(iR0), nceVar.mo37093l());
                                n0(obj, iF0);
                                break;
                            case 16:
                                a5i.m16459N(obj, m57530U(iR0), nceVar.mo37106y());
                                n0(obj, iF0);
                                break;
                            case 17:
                                if (m57541B(obj, iF0)) {
                                    a5i.m16460O(obj, m57530U(iR0), xn8.m56506h(a5i.m16446A(obj, m57530U(iR0)), nceVar.mo37073L(m57560u(iF0), pp6Var)));
                                    break;
                                } else {
                                    a5i.m16460O(obj, m57530U(iR0), nceVar.mo37073L(m57560u(iF0), pp6Var));
                                    n0(obj, iF0);
                                    break;
                                }
                            case 18:
                                nceVar.mo37067F(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 19:
                                nceVar.mo37063B(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 20:
                                nceVar.mo37090i(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 21:
                                nceVar.mo37088g(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 22:
                                nceVar.mo37104w(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 23:
                                nceVar.mo37098q(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 24:
                                nceVar.mo37105x(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 25:
                                nceVar.mo37094m(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 26:
                                l0(obj, iR0, nceVar);
                                break;
                            case 27:
                                j0(obj, iR0, nceVar, m57560u(iF0), pp6Var);
                                break;
                            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                nceVar.mo37066E(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                nceVar.mo37101t(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 30:
                                List listMo42126e = this.f55232n.mo42126e(obj, m57530U(iR0));
                                nceVar.mo37091j(listMo42126e);
                                objM57556p = z5f.m58832z(iMo37107z, listMo42126e, m57558s(iF0), objM57556p, k4iVar);
                                break;
                            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                nceVar.mo37084c(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 32:
                                nceVar.mo37103v(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 33:
                                nceVar.mo37099r(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                nceVar.mo37085d(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 35:
                                nceVar.mo37067F(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                nceVar.mo37063B(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 37:
                                nceVar.mo37090i(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 38:
                                nceVar.mo37088g(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                nceVar.mo37104w(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 40:
                                nceVar.mo37098q(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                nceVar.mo37105x(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                nceVar.mo37094m(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case SignatureVisitor.EXTENDS /* 43 */:
                                nceVar.mo37101t(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                List listMo42126e2 = this.f55232n.mo42126e(obj, m57530U(iR0));
                                nceVar.mo37091j(listMo42126e2);
                                objM57556p = z5f.m58832z(iMo37107z, listMo42126e2, m57558s(iF0), objM57556p, k4iVar);
                                break;
                            case 45:
                                nceVar.mo37084c(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 46:
                                nceVar.mo37103v(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 47:
                                nceVar.mo37099r(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 48:
                                nceVar.mo37085d(this.f55232n.mo42126e(obj, m57530U(iR0)));
                                break;
                            case 49:
                                i0(obj, m57530U(iR0), nceVar, m57560u(iF0), pp6Var);
                                break;
                            case 50:
                                m57548M(obj, iF0, m57559t(iF0), pp6Var, nceVar);
                                break;
                            case 51:
                                a5i.m16460O(obj, m57530U(iR0), Double.valueOf(nceVar.readDouble()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 52:
                                a5i.m16460O(obj, m57530U(iR0), Float.valueOf(nceVar.readFloat()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 53:
                                a5i.m16460O(obj, m57530U(iR0), Long.valueOf(nceVar.mo37068G()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 54:
                                a5i.m16460O(obj, m57530U(iR0), Long.valueOf(nceVar.mo37100s()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 55:
                                a5i.m16460O(obj, m57530U(iR0), Integer.valueOf(nceVar.mo37097p()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 56:
                                a5i.m16460O(obj, m57530U(iR0), Long.valueOf(nceVar.mo37082a()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 57:
                                a5i.m16460O(obj, m57530U(iR0), Integer.valueOf(nceVar.mo37102u()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 58:
                                a5i.m16460O(obj, m57530U(iR0), Boolean.valueOf(nceVar.mo37086e()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case Opcodes.V15 /* 59 */:
                                k0(obj, iR0, nceVar);
                                o0(obj, iMo37107z, iF0);
                                break;
                            case Opcodes.V16 /* 60 */:
                                if (m57546H(obj, iMo37107z, iF0)) {
                                    a5i.m16460O(obj, m57530U(iR0), xn8.m56506h(a5i.m16446A(obj, m57530U(iR0)), nceVar.mo37072K(m57560u(iF0), pp6Var)));
                                } else {
                                    a5i.m16460O(obj, m57530U(iR0), nceVar.mo37072K(m57560u(iF0), pp6Var));
                                    n0(obj, iF0);
                                }
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 61:
                                a5i.m16460O(obj, m57530U(iR0), nceVar.mo37096o());
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 62:
                                a5i.m16460O(obj, m57530U(iR0), Integer.valueOf(nceVar.mo37089h()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 63:
                                int iMo37092k2 = nceVar.mo37092k();
                                xn8.InterfaceC18195c interfaceC18195cM57558s2 = m57558s(iF0);
                                if (interfaceC18195cM57558s2 != null && !interfaceC18195cM57558s2.isInRange(iMo37092k2)) {
                                    objM57556p = z5f.m58791K(iMo37107z, iMo37092k2, objM57556p, k4iVar);
                                    break;
                                } else {
                                    a5i.m16460O(obj, m57530U(iR0), Integer.valueOf(iMo37092k2));
                                    o0(obj, iMo37107z, iF0);
                                    break;
                                }
                                break;
                            case 64:
                                a5i.m16460O(obj, m57530U(iR0), Integer.valueOf(nceVar.mo37065D()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case 65:
                                a5i.m16460O(obj, m57530U(iR0), Long.valueOf(nceVar.mo37087f()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                                a5i.m16460O(obj, m57530U(iR0), Integer.valueOf(nceVar.mo37093l()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case TypeReference.INSTANCEOF /* 67 */:
                                a5i.m16460O(obj, m57530U(iR0), Long.valueOf(nceVar.mo37106y()));
                                o0(obj, iMo37107z, iF0);
                                break;
                            case TypeReference.NEW /* 68 */:
                                a5i.m16460O(obj, m57530U(iR0), nceVar.mo37073L(m57560u(iF0), pp6Var));
                                o0(obj, iMo37107z, iF0);
                                break;
                            default:
                                if (objM57556p == null) {
                                    objM57556p = k4iVar.mo34984n();
                                }
                                if (!k4iVar.m34983m(objM57556p, nceVar)) {
                                    for (int i = this.f55229k; i < this.f55230l; i++) {
                                        objM57556p = m57556p(obj, this.f55228j[i], objM57556p, k4iVar);
                                    }
                                    if (objM57556p != null) {
                                        k4iVar.mo34985o(obj, objM57556p);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (bt8.C12491a unused) {
                        if (!k4iVar.mo34987q(nceVar)) {
                            if (objM57556p == null) {
                                objM57556p = k4iVar.mo34976f(obj);
                            }
                            if (!k4iVar.m34983m(objM57556p, nceVar)) {
                                for (int i2 = this.f55229k; i2 < this.f55230l; i2++) {
                                    objM57556p = m57556p(obj, this.f55228j[i2], objM57556p, k4iVar);
                                }
                                if (objM57556p != null) {
                                    k4iVar.mo34985o(obj, objM57556p);
                                    return;
                                }
                                return;
                            }
                        } else if (!nceVar.mo37064C()) {
                            for (int i3 = this.f55229k; i3 < this.f55230l; i3++) {
                                objM57556p = m57556p(obj, this.f55228j[i3], objM57556p, k4iVar);
                            }
                            if (objM57556p != null) {
                                k4iVar.mo34985o(obj, objM57556p);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iMo37107z == Integer.MAX_VALUE) {
                        for (int i4 = this.f55229k; i4 < this.f55230l; i4++) {
                            objM57556p = m57556p(obj, this.f55228j[i4], objM57556p, k4iVar);
                        }
                        if (objM57556p != null) {
                            k4iVar.mo34985o(obj, objM57556p);
                            return;
                        }
                        return;
                    }
                    Object objMo48604b = !this.f55224f ? null : sp6Var.mo48604b(pp6Var, this.f55223e, iMo37107z);
                    if (objMo48604b != null) {
                        if (gu6VarMo48606d == null) {
                            gu6VarMo48606d = sp6Var.mo48606d(obj);
                        }
                        objM57556p = sp6Var.mo48609g(nceVar, objMo48604b, pp6Var, gu6VarMo48606d, objM57556p, k4iVar);
                    } else if (!k4iVar.mo34987q(nceVar)) {
                        if (objM57556p == null) {
                            objM57556p = k4iVar.mo34976f(obj);
                        }
                        if (k4iVar.m34983m(objM57556p, nceVar)) {
                        }
                    } else if (nceVar.mo37064C()) {
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f55229k; i5 < this.f55230l; i5++) {
                    objM57556p = m57556p(obj, this.f55228j[i5], objM57556p, k4iVar);
                }
                if (objM57556p != null) {
                    k4iVar.mo34985o(obj, objM57556p);
                }
                throw th;
            }
        }
    }

    /* renamed from: M */
    public final void m57548M(Object obj, int i, Object obj2, pp6 pp6Var, nce nceVar) {
        long jM57530U = m57530U(r0(i));
        Object objM16446A = a5i.m16446A(obj, jM57530U);
        if (objM16446A == null) {
            objM16446A = this.f55235q.mo47096d(obj2);
            a5i.m16460O(obj, jM57530U, objM16446A);
        } else if (this.f55235q.mo47100h(objM16446A)) {
            Object objMo47096d = this.f55235q.mo47096d(obj2);
            this.f55235q.mo47093a(objMo47096d, objM16446A);
            a5i.m16460O(obj, jM57530U, objMo47096d);
            objM16446A = objMo47096d;
        }
        Map mapMo47095c = this.f55235q.mo47095c(objM16446A);
        this.f55235q.mo47094b(obj2);
        nceVar.mo37074M(mapMo47095c, null, pp6Var);
    }

    /* renamed from: N */
    public final void m57549N(Object obj, Object obj2, int i) {
        long jM57530U = m57530U(r0(i));
        if (m57541B(obj2, i)) {
            Object objM16446A = a5i.m16446A(obj, jM57530U);
            Object objM16446A2 = a5i.m16446A(obj2, jM57530U);
            if (objM16446A != null && objM16446A2 != null) {
                a5i.m16460O(obj, jM57530U, xn8.m56506h(objM16446A, objM16446A2));
                n0(obj, i);
            } else if (objM16446A2 != null) {
                a5i.m16460O(obj, jM57530U, objM16446A2);
                n0(obj, i);
            }
        }
    }

    /* renamed from: O */
    public final void m57550O(Object obj, Object obj2, int i) {
        int iR0 = r0(i);
        int iM57552T = m57552T(i);
        long jM57530U = m57530U(iR0);
        if (m57546H(obj2, iM57552T, i)) {
            Object objM16446A = a5i.m16446A(obj, jM57530U);
            Object objM16446A2 = a5i.m16446A(obj2, jM57530U);
            if (objM16446A != null && objM16446A2 != null) {
                a5i.m16460O(obj, jM57530U, xn8.m56506h(objM16446A, objM16446A2));
                o0(obj, iM57552T, i);
            } else if (objM16446A2 != null) {
                a5i.m16460O(obj, jM57530U, objM16446A2);
                o0(obj, iM57552T, i);
            }
        }
    }

    /* renamed from: P */
    public final void m57551P(Object obj, Object obj2, int i) {
        int iR0 = r0(i);
        long jM57530U = m57530U(iR0);
        int iM57552T = m57552T(i);
        switch (q0(iR0)) {
            case 0:
                if (m57541B(obj2, i)) {
                    a5i.m16456K(obj, jM57530U, a5i.m16484v(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 1:
                if (m57541B(obj2, i)) {
                    a5i.m16457L(obj, jM57530U, a5i.m16485w(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 2:
                if (m57541B(obj2, i)) {
                    a5i.m16459N(obj, jM57530U, a5i.m16487y(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 3:
                if (m57541B(obj2, i)) {
                    a5i.m16459N(obj, jM57530U, a5i.m16487y(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 4:
                if (m57541B(obj2, i)) {
                    a5i.m16458M(obj, jM57530U, a5i.m16486x(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 5:
                if (m57541B(obj2, i)) {
                    a5i.m16459N(obj, jM57530U, a5i.m16487y(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 6:
                if (m57541B(obj2, i)) {
                    a5i.m16458M(obj, jM57530U, a5i.m16486x(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 7:
                if (m57541B(obj2, i)) {
                    a5i.m16450E(obj, jM57530U, a5i.m16478p(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 8:
                if (m57541B(obj2, i)) {
                    a5i.m16460O(obj, jM57530U, a5i.m16446A(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 9:
                m57549N(obj, obj2, i);
                break;
            case 10:
                if (m57541B(obj2, i)) {
                    a5i.m16460O(obj, jM57530U, a5i.m16446A(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 11:
                if (m57541B(obj2, i)) {
                    a5i.m16458M(obj, jM57530U, a5i.m16486x(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 12:
                if (m57541B(obj2, i)) {
                    a5i.m16458M(obj, jM57530U, a5i.m16486x(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 13:
                if (m57541B(obj2, i)) {
                    a5i.m16458M(obj, jM57530U, a5i.m16486x(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 14:
                if (m57541B(obj2, i)) {
                    a5i.m16459N(obj, jM57530U, a5i.m16487y(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 15:
                if (m57541B(obj2, i)) {
                    a5i.m16458M(obj, jM57530U, a5i.m16486x(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 16:
                if (m57541B(obj2, i)) {
                    a5i.m16459N(obj, jM57530U, a5i.m16487y(obj2, jM57530U));
                    n0(obj, i);
                    break;
                }
                break;
            case 17:
                m57549N(obj, obj2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 30:
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 35:
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case 37:
            case 38:
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case SignatureVisitor.EXTENDS /* 43 */:
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f55232n.mo42125d(obj, obj2, jM57530U);
                break;
            case 50:
                z5f.m58785E(this.f55235q, obj, obj2, jM57530U);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case Opcodes.V15 /* 59 */:
                if (m57546H(obj2, iM57552T, i)) {
                    a5i.m16460O(obj, jM57530U, a5i.m16446A(obj2, jM57530U));
                    o0(obj, iM57552T, i);
                    break;
                }
                break;
            case Opcodes.V16 /* 60 */:
                m57550O(obj, obj2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
            case TypeReference.INSTANCEOF /* 67 */:
                if (m57546H(obj2, iM57552T, i)) {
                    a5i.m16460O(obj, jM57530U, a5i.m16446A(obj2, jM57530U));
                    o0(obj, iM57552T, i);
                    break;
                }
                break;
            case TypeReference.NEW /* 68 */:
                m57550O(obj, obj2, i);
                break;
        }
    }

    /* renamed from: T */
    public final int m57552T(int i) {
        return this.f55219a[i];
    }

    @Override // p001o.o5f
    /* renamed from: a */
    public void mo16904a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f55219a.length; i += 3) {
            m57551P(obj, obj2, i);
        }
        z5f.m58786F(this.f55233o, obj, obj2);
        if (this.f55224f) {
            z5f.m58784D(this.f55234p, obj, obj2);
        }
    }

    public final int a0(Object obj, byte[] bArr, int i, int i2, int i3, long j, mo0.C15370a c15370a) {
        Unsafe unsafe = f55218s;
        Object objM57559t = m57559t(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f55235q.mo47100h(object)) {
            Object objMo47096d = this.f55235q.mo47096d(objM57559t);
            this.f55235q.mo47093a(objMo47096d, object);
            unsafe.putObject(obj, j, objMo47096d);
            object = objMo47096d;
        }
        this.f55235q.mo47094b(objM57559t);
        return m57554m(bArr, i, i2, null, this.f55235q.mo47095c(object), c15370a);
    }

    @Override // p001o.o5f
    /* renamed from: b */
    public void mo16905b(Object obj) {
        int i;
        int i2 = this.f55229k;
        while (true) {
            i = this.f55230l;
            if (i2 >= i) {
                break;
            }
            long jM57530U = m57530U(r0(this.f55228j[i2]));
            Object objM16446A = a5i.m16446A(obj, jM57530U);
            if (objM16446A != null) {
                a5i.m16460O(obj, jM57530U, this.f55235q.mo47098f(objM16446A));
            }
            i2++;
        }
        int length = this.f55228j.length;
        while (i < length) {
            this.f55232n.mo42124c(obj, this.f55228j[i]);
            i++;
        }
        this.f55233o.mo34980j(obj);
        if (this.f55224f) {
            this.f55234p.mo48608f(obj);
        }
    }

    public final int b0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, mo0.C15370a c15370a) throws bt8 {
        Unsafe unsafe = f55218s;
        long j2 = this.f55219a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(mo0.m39420d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(mo0.m39427k(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iM39415K = mo0.m39415K(bArr, i, c15370a);
                    unsafe.putObject(obj, j, Long.valueOf(c15370a.f35765b));
                    unsafe.putInt(obj, j2, i4);
                    return iM39415K;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int iM39412H = mo0.m39412H(bArr, i, c15370a);
                    unsafe.putObject(obj, j, Integer.valueOf(c15370a.f35764a));
                    unsafe.putInt(obj, j2, i4);
                    return iM39412H;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(mo0.m39425i(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(mo0.m39423g(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int iM39415K2 = mo0.m39415K(bArr, i, c15370a);
                    unsafe.putObject(obj, j, Boolean.valueOf(c15370a.f35765b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iM39415K2;
                }
                break;
            case Opcodes.V15 /* 59 */:
                if (i5 == 2) {
                    int iM39412H2 = mo0.m39412H(bArr, i, c15370a);
                    int i13 = c15370a.f35764a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !iqi.m32572n(bArr, iM39412H2, iM39412H2 + i13)) {
                            throw bt8.m19718c();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iM39412H2, i13, xn8.f53956a));
                        iM39412H2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM39412H2;
                }
                break;
            case Opcodes.V16 /* 60 */:
                if (i5 == 2) {
                    int iM39431o = mo0.m39431o(m57560u(i8), bArr, i, i2, c15370a);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, c15370a.f35766c);
                    } else {
                        unsafe.putObject(obj, j, xn8.m56506h(object, c15370a.f35766c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM39431o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int iM39418b = mo0.m39418b(bArr, i, c15370a);
                    unsafe.putObject(obj, j, c15370a.f35766c);
                    unsafe.putInt(obj, j2, i4);
                    return iM39418b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int iM39412H3 = mo0.m39412H(bArr, i, c15370a);
                    int i14 = c15370a.f35764a;
                    xn8.InterfaceC18195c interfaceC18195cM57558s = m57558s(i8);
                    if (interfaceC18195cM57558s == null || interfaceC18195cM57558s.isInRange(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        m57539v(obj).m38374n(i3, Long.valueOf(i14));
                    }
                    return iM39412H3;
                }
                break;
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                if (i5 == 0) {
                    int iM39412H4 = mo0.m39412H(bArr, i, c15370a);
                    unsafe.putObject(obj, j, Integer.valueOf(if3.m32006b(c15370a.f35764a)));
                    unsafe.putInt(obj, j2, i4);
                    return iM39412H4;
                }
                break;
            case TypeReference.INSTANCEOF /* 67 */:
                if (i5 == 0) {
                    int iM39415K3 = mo0.m39415K(bArr, i, c15370a);
                    unsafe.putObject(obj, j, Long.valueOf(if3.m32007c(c15370a.f35765b)));
                    unsafe.putInt(obj, j2, i4);
                    return iM39415K3;
                }
                break;
            case TypeReference.NEW /* 68 */:
                if (i5 == 3) {
                    int iM39429m = mo0.m39429m(m57560u(i8), bArr, i, i2, (i3 & (-8)) | 4, c15370a);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, c15370a.f35766c);
                    } else {
                        unsafe.putObject(obj, j, xn8.m56506h(object2, c15370a.f35766c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM39429m;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // p001o.o5f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo16906c(Object obj) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f55229k; i4++) {
            int i5 = this.f55228j[i4];
            int iM57552T = m57552T(i5);
            int iR0 = r0(i5);
            if (this.f55226h) {
                i = 0;
            } else {
                int i6 = this.f55219a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = f55218s.getInt(obj, i7);
                    i2 = i7;
                }
            }
            if (m57524I(iR0) && !m57542C(obj, i5, i3, i)) {
                return false;
            }
            int iQ0 = q0(iR0);
            if (iQ0 == 9 || iQ0 == 17) {
                if (m57542C(obj, i5, i3, i) && !m57523D(obj, iR0, m57560u(i5))) {
                    return false;
                }
            } else if (iQ0 == 27) {
                if (!m57543E(obj, iR0, i5)) {
                    return false;
                }
            } else if (iQ0 == 60 || iQ0 == 68) {
                if (m57546H(obj, iM57552T, i5) && !m57523D(obj, iR0, m57560u(i5))) {
                    return false;
                }
            } else if (iQ0 != 49) {
                if (iQ0 == 50 && !m57544F(obj, iR0, i5)) {
                    return false;
                }
            }
        }
        return !this.f55224f || this.f55234p.mo48605c(obj).m29495e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0359, code lost:
    
        if (r0 != r11) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x035b, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r1 = r17;
        r3 = r18;
        r7 = r19;
        r2 = r20;
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03a2, code lost:
    
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03c5, code lost:
    
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03c8, code lost:
    
        r2 = r0;
        r8 = r18;
        r0 = r35;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c0(Object obj, byte[] bArr, int i, int i2, int i3, mo0.C15370a c15370a) {
        Unsafe unsafe;
        int i4;
        ycb ycbVar;
        Object obj2;
        int i5;
        int iM39411G;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c;
        int i16;
        int i17;
        int i18;
        int iM39415K;
        int i19;
        ycb ycbVar2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i20 = i2;
        int i21 = i3;
        mo0.C15370a c15370a2 = c15370a;
        Unsafe unsafe2 = f55218s;
        int iM39410F = i;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        int i26 = -1;
        while (true) {
            if (iM39410F < i20) {
                int i27 = iM39410F + 1;
                byte b = bArr2[iM39410F];
                if (b < 0) {
                    iM39411G = mo0.m39411G(b, bArr2, i27, c15370a2);
                    i5 = c15370a2.f35764a;
                } else {
                    i5 = b;
                    iM39411G = i27;
                }
                int i28 = i5 >>> 3;
                int i29 = i5 & 7;
                int iG0 = i28 > i25 ? ycbVar2.g0(i28, i22 / 3) : ycbVar2.f0(i28);
                if (iG0 == -1) {
                    i6 = i28;
                    i7 = iM39411G;
                    i8 = i5;
                    i9 = i24;
                    i10 = i26;
                    unsafe = unsafe2;
                    i11 = i21;
                    i12 = 0;
                } else {
                    int i30 = ycbVar2.f55219a[iG0 + 1];
                    int iQ0 = q0(i30);
                    long jM57530U = m57530U(i30);
                    int i31 = i5;
                    if (iQ0 <= 17) {
                        int i32 = ycbVar2.f55219a[iG0 + 2];
                        int i33 = 1 << (i32 >>> 20);
                        int i34 = i32 & 1048575;
                        if (i34 != i26) {
                            c = 65535;
                            i15 = iG0;
                            if (i26 != -1) {
                                unsafe2.putInt(obj3, i26, i24);
                            }
                            i24 = unsafe2.getInt(obj3, i34);
                            i26 = i34;
                        } else {
                            i15 = iG0;
                            c = 65535;
                        }
                        switch (iQ0) {
                            case 0:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i17 = iM39411G;
                                i18 = i31;
                                if (i29 == 1) {
                                    a5i.m16456K(obj3, jM57530U, mo0.m39420d(bArr2, i17));
                                    iM39410F = i17 + 8;
                                    i24 |= i33;
                                    i21 = i3;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    break;
                                } else {
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 1:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i17 = iM39411G;
                                i18 = i31;
                                if (i29 == 5) {
                                    a5i.m16457L(obj3, jM57530U, mo0.m39427k(bArr2, i17));
                                    iM39410F = i17 + 4;
                                    i24 |= i33;
                                    i21 = i3;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    break;
                                } else {
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i17 = iM39411G;
                                i18 = i31;
                                if (i29 == 0) {
                                    iM39415K = mo0.m39415K(bArr2, i17, c15370a2);
                                    unsafe2.putLong(obj, jM57530U, c15370a2.f35765b);
                                    i24 |= i33;
                                    i22 = i16;
                                    iM39410F = iM39415K;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i17 = iM39411G;
                                i18 = i31;
                                if (i29 == 0) {
                                    iM39410F = mo0.m39412H(bArr2, i17, c15370a2);
                                    unsafe2.putInt(obj3, jM57530U, c15370a2.f35764a);
                                    i24 |= i33;
                                    i21 = i3;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    break;
                                } else {
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 5:
                            case 14:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i18 = i31;
                                if (i29 == 1) {
                                    i17 = iM39411G;
                                    unsafe2.putLong(obj, jM57530U, mo0.m39425i(bArr2, iM39411G));
                                    iM39410F = i17 + 8;
                                    i24 |= i33;
                                    i21 = i3;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i19 = i2;
                                i18 = i31;
                                if (i29 == 5) {
                                    unsafe2.putInt(obj3, jM57530U, mo0.m39423g(bArr2, iM39411G));
                                    iM39410F = iM39411G + 4;
                                    i24 |= i33;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i19;
                                    i21 = i3;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 7:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i19 = i2;
                                i18 = i31;
                                if (i29 == 0) {
                                    iM39410F = mo0.m39415K(bArr2, iM39411G, c15370a2);
                                    a5i.m16450E(obj3, jM57530U, c15370a2.f35765b != 0);
                                    i24 |= i33;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i19;
                                    i21 = i3;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 8:
                                i16 = i15;
                                i6 = i28;
                                bArr2 = bArr;
                                i19 = i2;
                                i18 = i31;
                                if (i29 == 2) {
                                    iM39410F = (i30 & 536870912) == 0 ? mo0.m39406B(bArr2, iM39411G, c15370a2) : mo0.m39409E(bArr2, iM39411G, c15370a2);
                                    unsafe2.putObject(obj3, jM57530U, c15370a2.f35766c);
                                    i24 |= i33;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i19;
                                    i21 = i3;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 9:
                                i16 = i15;
                                i18 = i31;
                                i6 = i28;
                                bArr2 = bArr;
                                if (i29 == 2) {
                                    i19 = i2;
                                    iM39410F = mo0.m39431o(ycbVar2.m57560u(i16), bArr2, iM39411G, i19, c15370a2);
                                    if ((i24 & i33) == 0) {
                                        unsafe2.putObject(obj3, jM57530U, c15370a2.f35766c);
                                    } else {
                                        unsafe2.putObject(obj3, jM57530U, xn8.m56506h(unsafe2.getObject(obj3, jM57530U), c15370a2.f35766c));
                                    }
                                    i24 |= i33;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i19;
                                    i21 = i3;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 10:
                                i16 = i15;
                                i18 = i31;
                                i6 = i28;
                                bArr2 = bArr;
                                if (i29 == 2) {
                                    iM39410F = mo0.m39418b(bArr2, iM39411G, c15370a2);
                                    unsafe2.putObject(obj3, jM57530U, c15370a2.f35766c);
                                    i24 |= i33;
                                    i21 = i3;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 12:
                                i16 = i15;
                                i18 = i31;
                                i6 = i28;
                                bArr2 = bArr;
                                if (i29 != 0) {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                } else {
                                    iM39410F = mo0.m39412H(bArr2, iM39411G, c15370a2);
                                    int i35 = c15370a2.f35764a;
                                    xn8.InterfaceC18195c interfaceC18195cM57558s = ycbVar2.m57558s(i16);
                                    if (interfaceC18195cM57558s == null || interfaceC18195cM57558s.isInRange(i35)) {
                                        unsafe2.putInt(obj3, jM57530U, i35);
                                        i24 |= i33;
                                        i21 = i3;
                                        i22 = i16;
                                        i23 = i18;
                                        i25 = i6;
                                        i20 = i2;
                                        break;
                                    } else {
                                        m57539v(obj).m38374n(i18, Long.valueOf(i35));
                                        i21 = i3;
                                        i22 = i16;
                                        i23 = i18;
                                        i25 = i6;
                                        i20 = i2;
                                    }
                                }
                                break;
                            case 15:
                                i16 = i15;
                                i18 = i31;
                                i6 = i28;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    iM39410F = mo0.m39412H(bArr2, iM39411G, c15370a2);
                                    unsafe2.putInt(obj3, jM57530U, if3.m32006b(c15370a2.f35764a));
                                    i24 |= i33;
                                    i21 = i3;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 16:
                                i16 = i15;
                                i18 = i31;
                                i6 = i28;
                                if (i29 == 0) {
                                    bArr2 = bArr;
                                    iM39415K = mo0.m39415K(bArr2, iM39411G, c15370a2);
                                    unsafe2.putLong(obj, jM57530U, if3.m32007c(c15370a2.f35765b));
                                    i24 |= i33;
                                    i22 = i16;
                                    iM39410F = iM39415K;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            case 17:
                                if (i29 == 3) {
                                    int i36 = i15;
                                    i16 = i36;
                                    i6 = i28;
                                    i18 = i31;
                                    iM39410F = mo0.m39429m(ycbVar2.m57560u(i36), bArr, iM39411G, i2, (i28 << 3) | 4, c15370a);
                                    if ((i24 & i33) == 0) {
                                        unsafe2.putObject(obj3, jM57530U, c15370a2.f35766c);
                                    } else {
                                        unsafe2.putObject(obj3, jM57530U, xn8.m56506h(unsafe2.getObject(obj3, jM57530U), c15370a2.f35766c));
                                    }
                                    i24 |= i33;
                                    bArr2 = bArr;
                                    i21 = i3;
                                    i22 = i16;
                                    i23 = i18;
                                    i25 = i6;
                                    i20 = i2;
                                    break;
                                } else {
                                    i16 = i15;
                                    i18 = i31;
                                    i6 = i28;
                                    i17 = iM39411G;
                                    i11 = i3;
                                    i9 = i24;
                                    i10 = i26;
                                    i12 = i16;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i8 = i18;
                                    break;
                                }
                            default:
                                i17 = iM39411G;
                                i16 = i15;
                                i6 = i28;
                                i18 = i31;
                                i11 = i3;
                                i9 = i24;
                                i10 = i26;
                                i12 = i16;
                                unsafe = unsafe2;
                                i7 = i17;
                                i8 = i18;
                                break;
                        }
                    } else {
                        i6 = i28;
                        bArr2 = bArr;
                        int i37 = iM39411G;
                        if (iQ0 != 27) {
                            i12 = iG0;
                            i9 = i24;
                            if (iQ0 <= 49) {
                                i10 = i26;
                                unsafe = unsafe2;
                                i14 = i31;
                                iM39410F = e0(obj, bArr, i37, i2, i31, i6, i29, i12, i30, iQ0, jM57530U, c15370a);
                            } else {
                                unsafe = unsafe2;
                                i13 = i37;
                                i14 = i31;
                                i10 = i26;
                                if (iQ0 != 50) {
                                    iM39410F = b0(obj, bArr, i13, i2, i14, i6, i29, i30, iQ0, jM57530U, i12, c15370a);
                                } else if (i29 == 2) {
                                    iM39410F = a0(obj, bArr, i13, i2, i12, jM57530U, c15370a);
                                }
                            }
                        } else if (i29 == 2) {
                            xn8.InterfaceC18196d interfaceC18196dMo56352a = (xn8.InterfaceC18196d) unsafe2.getObject(obj3, jM57530U);
                            if (!interfaceC18196dMo56352a.mo29976k()) {
                                int size = interfaceC18196dMo56352a.size();
                                interfaceC18196dMo56352a = interfaceC18196dMo56352a.mo56352a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, jM57530U, interfaceC18196dMo56352a);
                            }
                            iM39410F = mo0.m39432p(ycbVar2.m57560u(iG0), i31, bArr, i37, i2, interfaceC18196dMo56352a, c15370a);
                            i21 = i3;
                            i23 = i31;
                            i25 = i6;
                            i22 = iG0;
                            i24 = i24;
                            i20 = i2;
                        } else {
                            i12 = iG0;
                            i9 = i24;
                            i10 = i26;
                            unsafe = unsafe2;
                            i13 = i37;
                            i14 = i31;
                        }
                        i11 = i3;
                        i7 = i13;
                        i8 = i14;
                    }
                }
                if (i8 != i11 || i11 == 0) {
                    int i38 = i11;
                    iM39410F = (!this.f55224f || c15370a.f35767d == pp6.m44004b()) ? mo0.m39410F(i8, bArr, i7, i2, m57539v(obj), c15370a) : mo0.m39422f(i8, bArr, i7, i2, obj, this.f55223e, this.f55233o, c15370a);
                    obj3 = obj;
                    bArr2 = bArr;
                    i20 = i2;
                    i23 = i8;
                    ycbVar2 = this;
                    c15370a2 = c15370a;
                    i25 = i6;
                    i26 = i10;
                    i22 = i12;
                    i24 = i9;
                    i21 = i38;
                    unsafe2 = unsafe;
                } else {
                    ycbVar = this;
                    i4 = i11;
                    iM39410F = i7;
                    i23 = i8;
                    i26 = i10;
                    i24 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i21;
                ycbVar = ycbVar2;
            }
        }
        if (i26 != -1) {
            obj2 = obj;
            unsafe.putInt(obj2, i26, i24);
        } else {
            obj2 = obj;
        }
        m4i m4iVar = null;
        for (int i39 = ycbVar.f55229k; i39 < ycbVar.f55230l; i39++) {
            m4iVar = (m4i) ycbVar.m57556p(obj2, ycbVar.f55228j[i39], m4iVar, ycbVar.f55233o);
        }
        if (m4iVar != null) {
            ycbVar.f55233o.mo34985o(obj2, m4iVar);
        }
        if (i4 == 0) {
            if (iM39410F != i2) {
                throw bt8.m19722g();
            }
        } else if (iM39410F > i2 || i23 != i4) {
            throw bt8.m19722g();
        }
        return iM39410F;
    }

    @Override // p001o.o5f
    /* renamed from: d */
    public int mo16907d(Object obj) {
        return this.f55226h ? m57562x(obj) : m57561w(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x022b, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01de, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020c, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x005c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d0(Object obj, byte[] bArr, int i, int i2, mo0.C15370a c15370a) throws bt8 {
        int i3;
        int iM39411G;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM39415K;
        ycb ycbVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i10 = i2;
        mo0.C15370a c15370a2 = c15370a;
        Unsafe unsafe2 = f55218s;
        int i11 = -1;
        int iM39410F = i;
        int i12 = -1;
        int i13 = 0;
        while (iM39410F < i10) {
            int i14 = iM39410F + 1;
            byte b = bArr2[iM39410F];
            if (b < 0) {
                iM39411G = mo0.m39411G(b, bArr2, i14, c15370a2);
                i3 = c15370a2.f35764a;
            } else {
                i3 = b;
                iM39411G = i14;
            }
            int i15 = i3 >>> 3;
            int i16 = i3 & 7;
            int iG0 = i15 > i12 ? ycbVar.g0(i15, i13 / 3) : ycbVar.f0(i15);
            if (iG0 == i11) {
                i4 = i15;
                i5 = iM39411G;
                unsafe = unsafe2;
                i6 = i11;
                i7 = 0;
            } else {
                int i17 = ycbVar.f55219a[iG0 + 1];
                int iQ0 = q0(i17);
                long jM57530U = m57530U(i17);
                if (iQ0 <= 17) {
                    switch (iQ0) {
                        case 0:
                            i9 = iG0;
                            if (i16 != 1) {
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i7 = i9;
                                i6 = -1;
                                break;
                            } else {
                                a5i.m16456K(obj2, jM57530U, mo0.m39420d(bArr2, iM39411G));
                                iM39410F = iM39411G + 8;
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        case 1:
                            i9 = iG0;
                            if (i16 != 5) {
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i7 = i9;
                                i6 = -1;
                                break;
                            } else {
                                a5i.m16457L(obj2, jM57530U, mo0.m39427k(bArr2, iM39411G));
                                iM39410F = iM39411G + 4;
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i9 = iG0;
                            if (i16 != 0) {
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i7 = i9;
                                i6 = -1;
                                break;
                            } else {
                                iM39415K = mo0.m39415K(bArr2, iM39411G, c15370a2);
                                unsafe2.putLong(obj, jM57530U, c15370a2.f35765b);
                                iM39410F = iM39415K;
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            i9 = iG0;
                            if (i16 != 0) {
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i7 = i9;
                                i6 = -1;
                                break;
                            } else {
                                iM39410F = mo0.m39412H(bArr2, iM39411G, c15370a2);
                                unsafe2.putInt(obj2, jM57530U, c15370a2.f35764a);
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            if (i16 != 1) {
                                i7 = iG0;
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                i9 = iG0;
                                unsafe2.putLong(obj, jM57530U, mo0.m39425i(bArr2, iM39411G));
                                iM39410F = iM39411G + 8;
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i16 != 5) {
                                i7 = iG0;
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, jM57530U, mo0.m39423g(bArr2, iM39411G));
                                iM39410F = iM39411G + 4;
                                i13 = iG0;
                                i12 = i15;
                                i11 = -1;
                                break;
                            }
                        case 7:
                            if (i16 != 0) {
                                i7 = iG0;
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                int iM39415K2 = mo0.m39415K(bArr2, iM39411G, c15370a2);
                                a5i.m16450E(obj2, jM57530U, c15370a2.f35765b != 0);
                                iM39410F = iM39415K2;
                                i13 = iG0;
                                i12 = i15;
                                i11 = -1;
                                break;
                            }
                        case 8:
                            if (i16 != 2) {
                                i7 = iG0;
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM39410F = (536870912 & i17) == 0 ? mo0.m39406B(bArr2, iM39411G, c15370a2) : mo0.m39409E(bArr2, iM39411G, c15370a2);
                                unsafe2.putObject(obj2, jM57530U, c15370a2.f35766c);
                                i13 = iG0;
                                i12 = i15;
                                i11 = -1;
                                break;
                            }
                        case 9:
                            if (i16 != 2) {
                                i7 = iG0;
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM39410F = mo0.m39431o(ycbVar.m57560u(iG0), bArr2, iM39411G, i10, c15370a2);
                                Object object = unsafe2.getObject(obj2, jM57530U);
                                if (object == null) {
                                    unsafe2.putObject(obj2, jM57530U, c15370a2.f35766c);
                                } else {
                                    unsafe2.putObject(obj2, jM57530U, xn8.m56506h(object, c15370a2.f35766c));
                                }
                                i13 = iG0;
                                i12 = i15;
                                i11 = -1;
                                break;
                            }
                        case 10:
                            if (i16 != 2) {
                                i7 = iG0;
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM39410F = mo0.m39418b(bArr2, iM39411G, c15370a2);
                                unsafe2.putObject(obj2, jM57530U, c15370a2.f35766c);
                                i13 = iG0;
                                i12 = i15;
                                i11 = -1;
                                break;
                            }
                        case 12:
                            i9 = iG0;
                            if (i16 != 0) {
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i7 = i9;
                                i6 = -1;
                                break;
                            } else {
                                iM39410F = mo0.m39412H(bArr2, iM39411G, c15370a2);
                                unsafe2.putInt(obj2, jM57530U, c15370a2.f35764a);
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        case 15:
                            i9 = iG0;
                            if (i16 != 0) {
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i7 = i9;
                                i6 = -1;
                                break;
                            } else {
                                iM39410F = mo0.m39412H(bArr2, iM39411G, c15370a2);
                                unsafe2.putInt(obj2, jM57530U, if3.m32006b(c15370a2.f35764a));
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        case 16:
                            if (i16 != 0) {
                                i7 = iG0;
                                i4 = i15;
                                i8 = iM39411G;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM39415K = mo0.m39415K(bArr2, iM39411G, c15370a2);
                                i9 = iG0;
                                unsafe2.putLong(obj, jM57530U, if3.m32007c(c15370a2.f35765b));
                                iM39410F = iM39415K;
                                i12 = i15;
                                i13 = i9;
                                i11 = -1;
                                break;
                            }
                        default:
                            i7 = iG0;
                            i4 = i15;
                            i8 = iM39411G;
                            unsafe = unsafe2;
                            i6 = -1;
                            break;
                    }
                } else if (iQ0 != 27) {
                    i7 = iG0;
                    if (iQ0 <= 49) {
                        i4 = i15;
                        int i18 = iM39411G;
                        unsafe = unsafe2;
                        i6 = -1;
                        iM39410F = e0(obj, bArr, iM39411G, i2, i3, i15, i16, i7, i17, iQ0, jM57530U, c15370a);
                    } else {
                        i4 = i15;
                        i8 = iM39411G;
                        unsafe = unsafe2;
                        i6 = -1;
                        if (iQ0 != 50) {
                            iM39410F = b0(obj, bArr, i8, i2, i3, i4, i16, i17, iQ0, jM57530U, i7, c15370a);
                        } else if (i16 == 2) {
                            iM39410F = a0(obj, bArr, i8, i2, i7, jM57530U, c15370a);
                        }
                    }
                    ycbVar = this;
                    obj2 = obj;
                    bArr2 = bArr;
                    i10 = i2;
                    c15370a2 = c15370a;
                    unsafe2 = unsafe;
                    i13 = i7;
                    i12 = i4;
                    i11 = i6;
                } else if (i16 == 2) {
                    xn8.InterfaceC18196d interfaceC18196dMo56352a = (xn8.InterfaceC18196d) unsafe2.getObject(obj2, jM57530U);
                    if (!interfaceC18196dMo56352a.mo29976k()) {
                        int size = interfaceC18196dMo56352a.size();
                        interfaceC18196dMo56352a = interfaceC18196dMo56352a.mo56352a(size == 0 ? 10 : size * 2);
                        unsafe2.putObject(obj2, jM57530U, interfaceC18196dMo56352a);
                    }
                    iM39410F = mo0.m39432p(ycbVar.m57560u(iG0), i3, bArr, iM39411G, i2, interfaceC18196dMo56352a, c15370a);
                    i12 = i15;
                    i13 = iG0;
                    i11 = -1;
                } else {
                    i7 = iG0;
                    i4 = i15;
                    i8 = iM39411G;
                    unsafe = unsafe2;
                    i6 = -1;
                }
                i5 = i8;
            }
            iM39410F = mo0.m39410F(i3, bArr, i5, i2, m57539v(obj), c15370a);
            ycbVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i10 = i2;
            c15370a2 = c15370a;
            unsafe2 = unsafe;
            i13 = i7;
            i12 = i4;
            i11 = i6;
        }
        if (iM39410F == i10) {
            return iM39410F;
        }
        throw bt8.m19722g();
    }

    @Override // p001o.o5f
    /* renamed from: e */
    public Object mo16908e() {
        return this.f55231m.mo39700a(this.f55223e);
    }

    public final int e0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, mo0.C15370a c15370a) throws bt8 {
        int iM39413I;
        Unsafe unsafe = f55218s;
        xn8.InterfaceC18196d interfaceC18196dMo56352a = (xn8.InterfaceC18196d) unsafe.getObject(obj, j2);
        if (!interfaceC18196dMo56352a.mo29976k()) {
            int size = interfaceC18196dMo56352a.size();
            interfaceC18196dMo56352a = interfaceC18196dMo56352a.mo56352a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, interfaceC18196dMo56352a);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return mo0.m39434r(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 1) {
                    return mo0.m39421e(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 19:
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    return mo0.m39437u(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 5) {
                    return mo0.m39428l(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return mo0.m39441y(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 0) {
                    return mo0.m39416L(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 22:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case SignatureVisitor.EXTENDS /* 43 */:
                if (i5 == 2) {
                    return mo0.m39440x(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 0) {
                    return mo0.m39413I(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return mo0.m39436t(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 1) {
                    return mo0.m39426j(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 24:
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 45:
                if (i5 == 2) {
                    return mo0.m39435s(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 5) {
                    return mo0.m39424h(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 25:
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    return mo0.m39433q(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 0) {
                    return mo0.m39417a(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? mo0.m39407C(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a) : mo0.m39408D(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return mo0.m39432p(m57560u(i6), i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (i5 == 2) {
                    return mo0.m39419c(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 30:
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 == 2) {
                    iM39413I = mo0.m39440x(bArr, i, interfaceC18196dMo56352a, c15370a);
                } else if (i5 == 0) {
                    iM39413I = mo0.m39413I(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                vn7 vn7Var = (vn7) obj;
                m4i m4iVar = vn7Var.unknownFields;
                if (m4iVar == m4i.m38362e()) {
                    m4iVar = null;
                }
                m4i m4iVar2 = (m4i) z5f.m58832z(i4, interfaceC18196dMo56352a, m57558s(i6), m4iVar, this.f55233o);
                if (m4iVar2 != null) {
                    vn7Var.unknownFields = m4iVar2;
                }
                return iM39413I;
            case 33:
            case 47:
                if (i5 == 2) {
                    return mo0.m39438v(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 0) {
                    return mo0.m39442z(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 48:
                if (i5 == 2) {
                    return mo0.m39439w(bArr, i, interfaceC18196dMo56352a, c15370a);
                }
                if (i5 == 0) {
                    return mo0.m39405A(i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return mo0.m39430n(m57560u(i6), i3, bArr, i, i2, interfaceC18196dMo56352a, c15370a);
                }
                break;
        }
        return i;
    }

    @Override // p001o.o5f
    /* renamed from: f */
    public int mo16909f(Object obj) {
        int i;
        int iM56504f;
        int length = this.f55219a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iR0 = r0(i3);
            int iM57552T = m57552T(i3);
            long jM57530U = m57530U(iR0);
            int iHashCode = 37;
            switch (q0(iR0)) {
                case 0:
                    i = i2 * 53;
                    iM56504f = xn8.m56504f(Double.doubleToLongBits(a5i.m16484v(obj, jM57530U)));
                    i2 = i + iM56504f;
                    break;
                case 1:
                    i = i2 * 53;
                    iM56504f = Float.floatToIntBits(a5i.m16485w(obj, jM57530U));
                    i2 = i + iM56504f;
                    break;
                case 2:
                    i = i2 * 53;
                    iM56504f = xn8.m56504f(a5i.m16487y(obj, jM57530U));
                    i2 = i + iM56504f;
                    break;
                case 3:
                    i = i2 * 53;
                    iM56504f = xn8.m56504f(a5i.m16487y(obj, jM57530U));
                    i2 = i + iM56504f;
                    break;
                case 4:
                    i = i2 * 53;
                    iM56504f = a5i.m16486x(obj, jM57530U);
                    i2 = i + iM56504f;
                    break;
                case 5:
                    i = i2 * 53;
                    iM56504f = xn8.m56504f(a5i.m16487y(obj, jM57530U));
                    i2 = i + iM56504f;
                    break;
                case 6:
                    i = i2 * 53;
                    iM56504f = a5i.m16486x(obj, jM57530U);
                    i2 = i + iM56504f;
                    break;
                case 7:
                    i = i2 * 53;
                    iM56504f = xn8.m56501c(a5i.m16478p(obj, jM57530U));
                    i2 = i + iM56504f;
                    break;
                case 8:
                    i = i2 * 53;
                    iM56504f = ((String) a5i.m16446A(obj, jM57530U)).hashCode();
                    i2 = i + iM56504f;
                    break;
                case 9:
                    Object objM16446A = a5i.m16446A(obj, jM57530U);
                    if (objM16446A != null) {
                        iHashCode = objM16446A.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM56504f = a5i.m16446A(obj, jM57530U).hashCode();
                    i2 = i + iM56504f;
                    break;
                case 11:
                    i = i2 * 53;
                    iM56504f = a5i.m16486x(obj, jM57530U);
                    i2 = i + iM56504f;
                    break;
                case 12:
                    i = i2 * 53;
                    iM56504f = a5i.m16486x(obj, jM57530U);
                    i2 = i + iM56504f;
                    break;
                case 13:
                    i = i2 * 53;
                    iM56504f = a5i.m16486x(obj, jM57530U);
                    i2 = i + iM56504f;
                    break;
                case 14:
                    i = i2 * 53;
                    iM56504f = xn8.m56504f(a5i.m16487y(obj, jM57530U));
                    i2 = i + iM56504f;
                    break;
                case 15:
                    i = i2 * 53;
                    iM56504f = a5i.m16486x(obj, jM57530U);
                    i2 = i + iM56504f;
                    break;
                case 16:
                    i = i2 * 53;
                    iM56504f = xn8.m56504f(a5i.m16487y(obj, jM57530U));
                    i2 = i + iM56504f;
                    break;
                case 17:
                    Object objM16446A2 = a5i.m16446A(obj, jM57530U);
                    if (objM16446A2 != null) {
                        iHashCode = objM16446A2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case SignatureVisitor.EXTENDS /* 43 */:
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iM56504f = a5i.m16446A(obj, jM57530U).hashCode();
                    i2 = i + iM56504f;
                    break;
                case 50:
                    i = i2 * 53;
                    iM56504f = a5i.m16446A(obj, jM57530U).hashCode();
                    i2 = i + iM56504f;
                    break;
                case 51:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = xn8.m56504f(Double.doubleToLongBits(m57532W(obj, jM57530U)));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = Float.floatToIntBits(m57533X(obj, jM57530U));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = xn8.m56504f(m57535Z(obj, jM57530U));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = xn8.m56504f(m57535Z(obj, jM57530U));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = m57534Y(obj, jM57530U);
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = xn8.m56504f(m57535Z(obj, jM57530U));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = m57534Y(obj, jM57530U);
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = xn8.m56501c(m57531V(obj, jM57530U));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = ((String) a5i.m16446A(obj, jM57530U)).hashCode();
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = a5i.m16446A(obj, jM57530U).hashCode();
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = a5i.m16446A(obj, jM57530U).hashCode();
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = m57534Y(obj, jM57530U);
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = m57534Y(obj, jM57530U);
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = m57534Y(obj, jM57530U);
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = xn8.m56504f(m57535Z(obj, jM57530U));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = m57534Y(obj, jM57530U);
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = xn8.m56504f(m57535Z(obj, jM57530U));
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        i = i2 * 53;
                        iM56504f = a5i.m16446A(obj, jM57530U).hashCode();
                        i2 = i + iM56504f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.f55233o.mo34977g(obj).hashCode();
        return this.f55224f ? (iHashCode2 * 53) + this.f55234p.mo48605c(obj).hashCode() : iHashCode2;
    }

    public final int f0(int i) {
        if (i < this.f55221c || i > this.f55222d) {
            return -1;
        }
        return p0(i, 0);
    }

    @Override // p001o.o5f
    /* renamed from: g */
    public boolean mo16910g(Object obj, Object obj2) {
        int length = this.f55219a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m57555o(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.f55233o.mo34977g(obj).equals(this.f55233o.mo34977g(obj2))) {
            return false;
        }
        if (this.f55224f) {
            return this.f55234p.mo48605c(obj).equals(this.f55234p.mo48605c(obj2));
        }
        return true;
    }

    public final int g0(int i, int i2) {
        if (i < this.f55221c || i > this.f55222d) {
            return -1;
        }
        return p0(i, i2);
    }

    @Override // p001o.o5f
    /* renamed from: h */
    public void mo16911h(Object obj, byte[] bArr, int i, int i2, mo0.C15370a c15370a) throws bt8 {
        if (this.f55226h) {
            d0(obj, bArr, i, i2, c15370a);
        } else {
            c0(obj, bArr, i, i2, 0, c15370a);
        }
    }

    public final int h0(int i) {
        return this.f55219a[i + 2];
    }

    @Override // p001o.o5f
    /* renamed from: i */
    public void mo16912i(Object obj, bdj bdjVar) {
        if (bdjVar.mo18720t() == bdj.EnumC12361a.DESCENDING) {
            u0(obj, bdjVar);
        } else if (this.f55226h) {
            t0(obj, bdjVar);
        } else {
            s0(obj, bdjVar);
        }
    }

    public final void i0(Object obj, long j, nce nceVar, o5f o5fVar, pp6 pp6Var) {
        nceVar.mo37071J(this.f55232n.mo42126e(obj, j), o5fVar, pp6Var);
    }

    @Override // p001o.o5f
    /* renamed from: j */
    public void mo16913j(Object obj, nce nceVar, pp6 pp6Var) {
        pp6Var.getClass();
        m57547L(this.f55233o, this.f55234p, obj, nceVar, pp6Var);
    }

    public final void j0(Object obj, int i, nce nceVar, o5f o5fVar, pp6 pp6Var) {
        nceVar.mo37070I(this.f55232n.mo42126e(obj, m57530U(i)), o5fVar, pp6Var);
    }

    /* renamed from: k */
    public final boolean m57553k(Object obj, Object obj2, int i) {
        return m57541B(obj, i) == m57541B(obj2, i);
    }

    public final void k0(Object obj, int i, nce nceVar) {
        if (m57522A(i)) {
            a5i.m16460O(obj, m57530U(i), nceVar.mo37069H());
        } else if (this.f55225g) {
            a5i.m16460O(obj, m57530U(i), nceVar.readString());
        } else {
            a5i.m16460O(obj, m57530U(i), nceVar.mo37096o());
        }
    }

    public final void l0(Object obj, int i, nce nceVar) {
        if (m57522A(i)) {
            nceVar.mo37095n(this.f55232n.mo42126e(obj, m57530U(i)));
        } else {
            nceVar.mo37062A(this.f55232n.mo42126e(obj, m57530U(i)));
        }
    }

    /* renamed from: m */
    public final int m57554m(byte[] bArr, int i, int i2, mra.C15407a c15407a, Map map, mo0.C15370a c15370a) throws bt8 {
        int iM39412H = mo0.m39412H(bArr, i, c15370a);
        int i3 = c15370a.f35764a;
        if (i3 < 0 || i3 > i2 - iM39412H) {
            throw bt8.m19724j();
        }
        throw null;
    }

    public final void n0(Object obj, int i) {
        if (this.f55226h) {
            return;
        }
        int iH0 = h0(i);
        long j = iH0 & 1048575;
        a5i.m16458M(obj, j, a5i.m16486x(obj, j) | (1 << (iH0 >>> 20)));
    }

    /* renamed from: o */
    public final boolean m57555o(Object obj, Object obj2, int i) {
        int iR0 = r0(i);
        long jM57530U = m57530U(iR0);
        switch (q0(iR0)) {
            case 0:
                if (m57553k(obj, obj2, i) && Double.doubleToLongBits(a5i.m16484v(obj, jM57530U)) == Double.doubleToLongBits(a5i.m16484v(obj2, jM57530U))) {
                    break;
                }
                break;
            case 1:
                if (m57553k(obj, obj2, i) && Float.floatToIntBits(a5i.m16485w(obj, jM57530U)) == Float.floatToIntBits(a5i.m16485w(obj2, jM57530U))) {
                    break;
                }
                break;
            case 2:
                if (m57553k(obj, obj2, i) && a5i.m16487y(obj, jM57530U) == a5i.m16487y(obj2, jM57530U)) {
                    break;
                }
                break;
            case 3:
                if (m57553k(obj, obj2, i) && a5i.m16487y(obj, jM57530U) == a5i.m16487y(obj2, jM57530U)) {
                    break;
                }
                break;
            case 4:
                if (m57553k(obj, obj2, i) && a5i.m16486x(obj, jM57530U) == a5i.m16486x(obj2, jM57530U)) {
                    break;
                }
                break;
            case 5:
                if (m57553k(obj, obj2, i) && a5i.m16487y(obj, jM57530U) == a5i.m16487y(obj2, jM57530U)) {
                    break;
                }
                break;
            case 6:
                if (m57553k(obj, obj2, i) && a5i.m16486x(obj, jM57530U) == a5i.m16486x(obj2, jM57530U)) {
                    break;
                }
                break;
            case 7:
                if (m57553k(obj, obj2, i) && a5i.m16478p(obj, jM57530U) == a5i.m16478p(obj2, jM57530U)) {
                    break;
                }
                break;
            case 8:
                if (m57553k(obj, obj2, i) && z5f.m58790J(a5i.m16446A(obj, jM57530U), a5i.m16446A(obj2, jM57530U))) {
                    break;
                }
                break;
            case 9:
                if (m57553k(obj, obj2, i) && z5f.m58790J(a5i.m16446A(obj, jM57530U), a5i.m16446A(obj2, jM57530U))) {
                    break;
                }
                break;
            case 10:
                if (m57553k(obj, obj2, i) && z5f.m58790J(a5i.m16446A(obj, jM57530U), a5i.m16446A(obj2, jM57530U))) {
                    break;
                }
                break;
            case 11:
                if (m57553k(obj, obj2, i) && a5i.m16486x(obj, jM57530U) == a5i.m16486x(obj2, jM57530U)) {
                    break;
                }
                break;
            case 12:
                if (m57553k(obj, obj2, i) && a5i.m16486x(obj, jM57530U) == a5i.m16486x(obj2, jM57530U)) {
                    break;
                }
                break;
            case 13:
                if (m57553k(obj, obj2, i) && a5i.m16486x(obj, jM57530U) == a5i.m16486x(obj2, jM57530U)) {
                    break;
                }
                break;
            case 14:
                if (m57553k(obj, obj2, i) && a5i.m16487y(obj, jM57530U) == a5i.m16487y(obj2, jM57530U)) {
                    break;
                }
                break;
            case 15:
                if (m57553k(obj, obj2, i) && a5i.m16486x(obj, jM57530U) == a5i.m16486x(obj2, jM57530U)) {
                    break;
                }
                break;
            case 16:
                if (m57553k(obj, obj2, i) && a5i.m16487y(obj, jM57530U) == a5i.m16487y(obj2, jM57530U)) {
                    break;
                }
                break;
            case 17:
                if (m57553k(obj, obj2, i) && z5f.m58790J(a5i.m16446A(obj, jM57530U), a5i.m16446A(obj2, jM57530U))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case Opcodes.V15 /* 59 */:
            case Opcodes.V16 /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
            case TypeReference.INSTANCEOF /* 67 */:
            case TypeReference.NEW /* 68 */:
                if (m57545G(obj, obj2, i) && z5f.m58790J(a5i.m16446A(obj, jM57530U), a5i.m16446A(obj2, jM57530U))) {
                    break;
                }
                break;
        }
        return true;
    }

    public final void o0(Object obj, int i, int i2) {
        a5i.m16458M(obj, h0(i2) & 1048575, i);
    }

    /* renamed from: p */
    public final Object m57556p(Object obj, int i, Object obj2, k4i k4iVar) {
        xn8.InterfaceC18195c interfaceC18195cM57558s;
        int iM57552T = m57552T(i);
        Object objM16446A = a5i.m16446A(obj, m57530U(r0(i)));
        return (objM16446A == null || (interfaceC18195cM57558s = m57558s(i)) == null) ? obj2 : m57557q(i, iM57552T, this.f55235q.mo47095c(objM16446A), interfaceC18195cM57558s, obj2, k4iVar);
    }

    public final int p0(int i, int i2) {
        int length = (this.f55219a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iM57552T = m57552T(i4);
            if (i == iM57552T) {
                return i4;
            }
            if (i < iM57552T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final Object m57557q(int i, int i2, Map map, xn8.InterfaceC18195c interfaceC18195c, Object obj, k4i k4iVar) {
        this.f55235q.mo47094b(m57559t(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!interfaceC18195c.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = k4iVar.mo34984n();
                }
                yq1.C18459h c18459hM58083x = yq1.m58083x(mra.m39524a(null, entry.getKey(), entry.getValue()));
                try {
                    mra.m39525b(c18459hM58083x.m58105b(), null, entry.getKey(), entry.getValue());
                    k4iVar.mo34974d(obj, i2, c18459hM58083x.m58104a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    public final int r0(int i) {
        return this.f55219a[i + 1];
    }

    /* renamed from: s */
    public final xn8.InterfaceC18195c m57558s(int i) {
        return (xn8.InterfaceC18195c) this.f55220b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(Object obj, bdj bdjVar) {
        Iterator itM29496f;
        Map.Entry entry;
        Map.Entry entry2;
        int i;
        if (this.f55224f) {
            gu6 gu6VarMo48605c = this.f55234p.mo48605c(obj);
            if (gu6VarMo48605c.m29494d()) {
                itM29496f = null;
                entry = null;
            } else {
                itM29496f = gu6VarMo48605c.m29496f();
                entry = (Map.Entry) itM29496f.next();
            }
        }
        int length = this.f55219a.length;
        Unsafe unsafe = f55218s;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iR0 = r0(i3);
            int iM57552T = m57552T(i3);
            int iQ0 = q0(iR0);
            if (this.f55226h || iQ0 > 17) {
                entry2 = entry;
                i = 0;
            } else {
                int i5 = this.f55219a[i3 + 2];
                int i6 = i5 & 1048575;
                Map.Entry entry3 = entry;
                if (i6 != i2) {
                    i4 = unsafe.getInt(obj, i6);
                    i2 = i6;
                }
                i = 1 << (i5 >>> 20);
                entry2 = entry3;
            }
            while (entry2 != null && this.f55234p.mo48603a(entry2) <= iM57552T) {
                this.f55234p.mo48612j(bdjVar, entry2);
                entry2 = itM29496f.hasNext() ? (Map.Entry) itM29496f.next() : null;
            }
            Map.Entry entry4 = entry2;
            int i7 = length;
            long jM57530U = m57530U(iR0);
            switch (iQ0) {
                case 0:
                    if ((i & i4) != 0) {
                        bdjVar.mo18716p(iM57552T, m57537n(obj, jM57530U));
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 1:
                    if ((i & i4) != 0) {
                        bdjVar.mo18687B(iM57552T, m57538r(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 2:
                    if ((i & i4) != 0) {
                        bdjVar.mo18721u(iM57552T, unsafe.getLong(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 3:
                    if ((i & i4) != 0) {
                        bdjVar.mo18706f(iM57552T, unsafe.getLong(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 4:
                    if ((i & i4) != 0) {
                        bdjVar.mo18708h(iM57552T, unsafe.getInt(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 5:
                    if ((i & i4) != 0) {
                        bdjVar.mo18719s(iM57552T, unsafe.getLong(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 6:
                    if ((i & i4) != 0) {
                        bdjVar.mo18703c(iM57552T, unsafe.getInt(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 7:
                    if ((i & i4) != 0) {
                        bdjVar.mo18722v(iM57552T, m57536l(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 8:
                    if ((i & i4) != 0) {
                        w0(iM57552T, unsafe.getObject(obj, jM57530U), bdjVar);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 9:
                    if ((i & i4) != 0) {
                        bdjVar.mo18696K(iM57552T, unsafe.getObject(obj, jM57530U), m57560u(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 10:
                    if ((i & i4) != 0) {
                        bdjVar.mo18695J(iM57552T, (yq1) unsafe.getObject(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 11:
                    if ((i & i4) != 0) {
                        bdjVar.mo18715o(iM57552T, unsafe.getInt(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 12:
                    if ((i & i4) != 0) {
                        bdjVar.mo18690E(iM57552T, unsafe.getInt(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 13:
                    if ((i & i4) != 0) {
                        bdjVar.mo18723w(iM57552T, unsafe.getInt(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 14:
                    if ((i & i4) != 0) {
                        bdjVar.mo18709i(iM57552T, unsafe.getLong(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 15:
                    if ((i & i4) != 0) {
                        bdjVar.mo18693H(iM57552T, unsafe.getInt(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 16:
                    if ((i & i4) != 0) {
                        bdjVar.mo18713m(iM57552T, unsafe.getLong(obj, jM57530U));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 17:
                    if ((i & i4) != 0) {
                        bdjVar.mo18698M(iM57552T, unsafe.getObject(obj, jM57530U), m57560u(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 18:
                    z5f.m58795O(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 19:
                    z5f.m58799S(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 20:
                    z5f.m58802V(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 21:
                    z5f.d0(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 22:
                    z5f.m58801U(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 23:
                    z5f.m58798R(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 24:
                    z5f.m58797Q(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 25:
                    z5f.m58793M(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 26:
                    z5f.b0(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar);
                    break;
                case 27:
                    z5f.m58803W(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, m57560u(i3));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    z5f.m58794N(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    z5f.c0(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 30:
                    z5f.m58796P(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z5f.m58804X(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 32:
                    z5f.m58805Y(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 33:
                    z5f.m58806Z(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z5f.a0(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                case 35:
                    z5f.m58795O(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    z5f.m58799S(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 37:
                    z5f.m58802V(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 38:
                    z5f.d0(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    z5f.m58801U(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 40:
                    z5f.m58798R(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    z5f.m58797Q(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    z5f.m58793M(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    z5f.c0(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    z5f.m58796P(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 45:
                    z5f.m58804X(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 46:
                    z5f.m58805Y(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 47:
                    z5f.m58806Z(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 48:
                    z5f.a0(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, true);
                    break;
                case 49:
                    z5f.m58800T(m57552T(i3), (List) unsafe.getObject(obj, jM57530U), bdjVar, m57560u(i3));
                    break;
                case 50:
                    v0(bdjVar, iM57552T, unsafe.getObject(obj, jM57530U), i3);
                    break;
                case 51:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18716p(iM57552T, m57532W(obj, jM57530U));
                        break;
                    }
                    break;
                case 52:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18687B(iM57552T, m57533X(obj, jM57530U));
                        break;
                    }
                    break;
                case 53:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18721u(iM57552T, m57535Z(obj, jM57530U));
                        break;
                    }
                    break;
                case 54:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18706f(iM57552T, m57535Z(obj, jM57530U));
                        break;
                    }
                    break;
                case 55:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18708h(iM57552T, m57534Y(obj, jM57530U));
                        break;
                    }
                    break;
                case 56:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18719s(iM57552T, m57535Z(obj, jM57530U));
                        break;
                    }
                    break;
                case 57:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18703c(iM57552T, m57534Y(obj, jM57530U));
                        break;
                    }
                    break;
                case 58:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18722v(iM57552T, m57531V(obj, jM57530U));
                        break;
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        w0(iM57552T, unsafe.getObject(obj, jM57530U), bdjVar);
                        break;
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18696K(iM57552T, unsafe.getObject(obj, jM57530U), m57560u(i3));
                        break;
                    }
                    break;
                case 61:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18695J(iM57552T, (yq1) unsafe.getObject(obj, jM57530U));
                        break;
                    }
                    break;
                case 62:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18715o(iM57552T, m57534Y(obj, jM57530U));
                        break;
                    }
                    break;
                case 63:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18690E(iM57552T, m57534Y(obj, jM57530U));
                        break;
                    }
                    break;
                case 64:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18723w(iM57552T, m57534Y(obj, jM57530U));
                        break;
                    }
                    break;
                case 65:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18709i(iM57552T, m57535Z(obj, jM57530U));
                        break;
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18693H(iM57552T, m57534Y(obj, jM57530U));
                        break;
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18713m(iM57552T, m57535Z(obj, jM57530U));
                        break;
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (m57546H(obj, iM57552T, i3)) {
                        bdjVar.mo18698M(iM57552T, unsafe.getObject(obj, jM57530U), m57560u(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            length = i7;
            entry = entry4;
        }
        while (entry != null) {
            this.f55234p.mo48612j(bdjVar, entry);
            entry = itM29496f.hasNext() ? (Map.Entry) itM29496f.next() : null;
        }
        x0(this.f55233o, obj, bdjVar);
    }

    /* renamed from: t */
    public final Object m57559t(int i) {
        return this.f55220b[(i / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(Object obj, bdj bdjVar) {
        Iterator itM29496f;
        Map.Entry entry;
        if (this.f55224f) {
            gu6 gu6VarMo48605c = this.f55234p.mo48605c(obj);
            if (gu6VarMo48605c.m29494d()) {
                itM29496f = null;
                entry = null;
            } else {
                itM29496f = gu6VarMo48605c.m29496f();
                entry = (Map.Entry) itM29496f.next();
            }
        }
        int length = this.f55219a.length;
        for (int i = 0; i < length; i += 3) {
            int iR0 = r0(i);
            int iM57552T = m57552T(i);
            while (entry != null && this.f55234p.mo48603a(entry) <= iM57552T) {
                this.f55234p.mo48612j(bdjVar, entry);
                entry = itM29496f.hasNext() ? (Map.Entry) itM29496f.next() : null;
            }
            switch (q0(iR0)) {
                case 0:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18716p(iM57552T, m57537n(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18687B(iM57552T, m57538r(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18721u(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18706f(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18708h(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18719s(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18703c(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18722v(iM57552T, m57536l(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m57541B(obj, i)) {
                        w0(iM57552T, a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18696K(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18695J(iM57552T, (yq1) a5i.m16446A(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18715o(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18690E(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18723w(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18709i(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18693H(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18713m(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m57541B(obj, i)) {
                        bdjVar.mo18698M(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z5f.m58795O(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 19:
                    z5f.m58799S(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 20:
                    z5f.m58802V(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 21:
                    z5f.d0(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 22:
                    z5f.m58801U(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 23:
                    z5f.m58798R(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 24:
                    z5f.m58797Q(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 25:
                    z5f.m58793M(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 26:
                    z5f.b0(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                    break;
                case 27:
                    z5f.m58803W(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, m57560u(i));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    z5f.m58794N(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    z5f.c0(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 30:
                    z5f.m58796P(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z5f.m58804X(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 32:
                    z5f.m58805Y(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 33:
                    z5f.m58806Z(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z5f.a0(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 35:
                    z5f.m58795O(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    z5f.m58799S(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 37:
                    z5f.m58802V(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 38:
                    z5f.d0(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    z5f.m58801U(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 40:
                    z5f.m58798R(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    z5f.m58797Q(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    z5f.m58793M(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    z5f.c0(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    z5f.m58796P(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 45:
                    z5f.m58804X(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 46:
                    z5f.m58805Y(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 47:
                    z5f.m58806Z(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 48:
                    z5f.a0(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 49:
                    z5f.m58800T(m57552T(i), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, m57560u(i));
                    break;
                case 50:
                    v0(bdjVar, iM57552T, a5i.m16446A(obj, m57530U(iR0)), i);
                    break;
                case 51:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18716p(iM57552T, m57532W(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18687B(iM57552T, m57533X(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18721u(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18706f(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18708h(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18719s(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18703c(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18722v(iM57552T, m57531V(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m57546H(obj, iM57552T, i)) {
                        w0(iM57552T, a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18696K(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18695J(iM57552T, (yq1) a5i.m16446A(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18715o(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18690E(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18723w(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18709i(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18693H(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18713m(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m57546H(obj, iM57552T, i)) {
                        bdjVar.mo18698M(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        while (entry != null) {
            this.f55234p.mo48612j(bdjVar, entry);
            entry = itM29496f.hasNext() ? (Map.Entry) itM29496f.next() : null;
        }
        x0(this.f55233o, obj, bdjVar);
    }

    /* renamed from: u */
    public final o5f m57560u(int i) {
        int i2 = (i / 3) * 2;
        o5f o5fVar = (o5f) this.f55220b[i2];
        if (o5fVar != null) {
            return o5fVar;
        }
        o5f o5fVarM53802c = w1e.m53800a().m53802c((Class) this.f55220b[i2 + 1]);
        this.f55220b[i2] = o5fVarM53802c;
        return o5fVarM53802c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(Object obj, bdj bdjVar) {
        Iterator itM29491a;
        Map.Entry entry;
        x0(this.f55233o, obj, bdjVar);
        if (this.f55224f) {
            gu6 gu6VarMo48605c = this.f55234p.mo48605c(obj);
            if (gu6VarMo48605c.m29494d()) {
                itM29491a = null;
                entry = null;
            } else {
                itM29491a = gu6VarMo48605c.m29491a();
                entry = (Map.Entry) itM29491a.next();
            }
        }
        for (int length = this.f55219a.length - 3; length >= 0; length -= 3) {
            int iR0 = r0(length);
            int iM57552T = m57552T(length);
            while (entry != null && this.f55234p.mo48603a(entry) > iM57552T) {
                this.f55234p.mo48612j(bdjVar, entry);
                entry = itM29491a.hasNext() ? (Map.Entry) itM29491a.next() : null;
            }
            switch (q0(iR0)) {
                case 0:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18716p(iM57552T, m57537n(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18687B(iM57552T, m57538r(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18721u(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18706f(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18708h(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18719s(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18703c(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18722v(iM57552T, m57536l(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m57541B(obj, length)) {
                        w0(iM57552T, a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18696K(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(length));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18695J(iM57552T, (yq1) a5i.m16446A(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18715o(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18690E(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18723w(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18709i(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18693H(iM57552T, m57540z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18713m(iM57552T, m57526K(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m57541B(obj, length)) {
                        bdjVar.mo18698M(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(length));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z5f.m58795O(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 19:
                    z5f.m58799S(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 20:
                    z5f.m58802V(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 21:
                    z5f.d0(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 22:
                    z5f.m58801U(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 23:
                    z5f.m58798R(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 24:
                    z5f.m58797Q(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 25:
                    z5f.m58793M(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 26:
                    z5f.b0(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                    break;
                case 27:
                    z5f.m58803W(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, m57560u(length));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    z5f.m58794N(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    z5f.c0(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 30:
                    z5f.m58796P(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z5f.m58804X(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 32:
                    z5f.m58805Y(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 33:
                    z5f.m58806Z(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z5f.a0(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, false);
                    break;
                case 35:
                    z5f.m58795O(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    z5f.m58799S(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 37:
                    z5f.m58802V(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 38:
                    z5f.d0(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    z5f.m58801U(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 40:
                    z5f.m58798R(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    z5f.m58797Q(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    z5f.m58793M(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    z5f.c0(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    z5f.m58796P(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 45:
                    z5f.m58804X(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 46:
                    z5f.m58805Y(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 47:
                    z5f.m58806Z(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 48:
                    z5f.a0(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, true);
                    break;
                case 49:
                    z5f.m58800T(m57552T(length), (List) a5i.m16446A(obj, m57530U(iR0)), bdjVar, m57560u(length));
                    break;
                case 50:
                    v0(bdjVar, iM57552T, a5i.m16446A(obj, m57530U(iR0)), length);
                    break;
                case 51:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18716p(iM57552T, m57532W(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18687B(iM57552T, m57533X(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18721u(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18706f(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18708h(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18719s(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18703c(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18722v(iM57552T, m57531V(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m57546H(obj, iM57552T, length)) {
                        w0(iM57552T, a5i.m16446A(obj, m57530U(iR0)), bdjVar);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18696K(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(length));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18695J(iM57552T, (yq1) a5i.m16446A(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18715o(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18690E(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18723w(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18709i(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18693H(iM57552T, m57534Y(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18713m(iM57552T, m57535Z(obj, m57530U(iR0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m57546H(obj, iM57552T, length)) {
                        bdjVar.mo18698M(iM57552T, a5i.m16446A(obj, m57530U(iR0)), m57560u(length));
                        break;
                    } else {
                        break;
                    }
            }
        }
        while (entry != null) {
            this.f55234p.mo48612j(bdjVar, entry);
            entry = itM29491a.hasNext() ? (Map.Entry) itM29491a.next() : null;
        }
    }

    public final void v0(bdj bdjVar, int i, Object obj, int i2) {
        if (obj != null) {
            this.f55235q.mo47094b(m57559t(i2));
            bdjVar.mo18700O(i, null, this.f55235q.mo47097e(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: w */
    public final int m57561w(Object obj) {
        int i;
        int i2;
        int iM38894h;
        int iM38890d;
        int iM38870B;
        boolean z;
        int iM58812f;
        int iM58815i;
        int iM38880L;
        int iM38882N;
        Unsafe unsafe = f55218s;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.f55219a.length) {
            int iR0 = r0(i4);
            int iM57552T = m57552T(i4);
            int iQ0 = q0(iR0);
            if (iQ0 <= 17) {
                i = this.f55219a[i4 + 2];
                int i7 = 1048575 & i;
                int i8 = 1 << (i >>> 20);
                if (i7 != i3) {
                    i6 = unsafe.getInt(obj, i7);
                    i3 = i7;
                }
                i2 = i8;
            } else {
                i = (!this.f55227i || iQ0 < iu6.DOUBLE_LIST_PACKED.id() || iQ0 > iu6.SINT64_LIST_PACKED.id()) ? 0 : this.f55219a[i4 + 2] & 1048575;
                i2 = 0;
            }
            long jM57530U = m57530U(iR0);
            int i9 = i3;
            switch (iQ0) {
                case 0:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        iM38894h = mf3.m38894h(iM57552T, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i5 += iM38894h;
                        break;
                    }
                case 1:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        iM38894h = mf3.m38902p(iM57552T, 0.0f);
                        i5 += iM38894h;
                        break;
                    }
                case 2:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        iM38894h = mf3.m38908v(iM57552T, unsafe.getLong(obj, jM57530U));
                        i5 += iM38894h;
                        break;
                    }
                case 3:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        iM38894h = mf3.m38883O(iM57552T, unsafe.getLong(obj, jM57530U));
                        i5 += iM38894h;
                        break;
                    }
                case 4:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        iM38894h = mf3.m38906t(iM57552T, unsafe.getInt(obj, jM57530U));
                        i5 += iM38894h;
                        break;
                    }
                case 5:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        iM38894h = mf3.m38900n(iM57552T, 0L);
                        i5 += iM38894h;
                        break;
                    }
                case 6:
                    if ((i6 & i2) != 0) {
                        iM38894h = mf3.m38898l(iM57552T, 0);
                        i5 += iM38894h;
                        break;
                    }
                    break;
                case 7:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38890d(iM57552T, true);
                        i5 += iM38890d;
                    }
                    break;
                case 8:
                    if ((i6 & i2) != 0) {
                        Object object = unsafe.getObject(obj, jM57530U);
                        iM38890d = object instanceof yq1 ? mf3.m38892f(iM57552T, (yq1) object) : mf3.m38878J(iM57552T, (String) object);
                        i5 += iM38890d;
                    }
                    break;
                case 9:
                    if ((i6 & i2) != 0) {
                        iM38890d = z5f.m58821o(iM57552T, unsafe.getObject(obj, jM57530U), m57560u(i4));
                        i5 += iM38890d;
                    }
                    break;
                case 10:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38892f(iM57552T, (yq1) unsafe.getObject(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 11:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38881M(iM57552T, unsafe.getInt(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 12:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38896j(iM57552T, unsafe.getInt(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 13:
                    if ((i6 & i2) != 0) {
                        iM38870B = mf3.m38870B(iM57552T, 0);
                        i5 += iM38870B;
                    }
                    break;
                case 14:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38872D(iM57552T, 0L);
                        i5 += iM38890d;
                    }
                    break;
                case 15:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38874F(iM57552T, unsafe.getInt(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 16:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38876H(iM57552T, unsafe.getLong(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 17:
                    if ((i6 & i2) != 0) {
                        iM38890d = mf3.m38904r(iM57552T, (rcb) unsafe.getObject(obj, jM57530U), m57560u(i4));
                        i5 += iM38890d;
                    }
                    break;
                case 18:
                    iM38890d = z5f.m58814h(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM38890d;
                    break;
                case 19:
                    z = false;
                    iM58812f = z5f.m58812f(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 20:
                    z = false;
                    iM58812f = z5f.m58819m(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 21:
                    z = false;
                    iM58812f = z5f.m58830x(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 22:
                    z = false;
                    iM58812f = z5f.m58817k(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 23:
                    z = false;
                    iM58812f = z5f.m58814h(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 24:
                    z = false;
                    iM58812f = z5f.m58812f(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 25:
                    z = false;
                    iM58812f = z5f.m58807a(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 26:
                    iM38890d = z5f.m58827u(iM57552T, (List) unsafe.getObject(obj, jM57530U));
                    i5 += iM38890d;
                    break;
                case 27:
                    iM38890d = z5f.m58822p(iM57552T, (List) unsafe.getObject(obj, jM57530U), m57560u(i4));
                    i5 += iM38890d;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iM38890d = z5f.m58809c(iM57552T, (List) unsafe.getObject(obj, jM57530U));
                    i5 += iM38890d;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iM38890d = z5f.m58828v(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM38890d;
                    break;
                case 30:
                    z = false;
                    iM58812f = z5f.m58810d(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z = false;
                    iM58812f = z5f.m58812f(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 32:
                    z = false;
                    iM58812f = z5f.m58814h(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 33:
                    z = false;
                    iM58812f = z5f.m58823q(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z = false;
                    iM58812f = z5f.m58825s(iM57552T, (List) unsafe.getObject(obj, jM57530U), false);
                    i5 += iM58812f;
                    break;
                case 35:
                    iM58815i = z5f.m58815i((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iM58815i = z5f.m58813g((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 37:
                    iM58815i = z5f.m58820n((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 38:
                    iM58815i = z5f.m58831y((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iM58815i = z5f.m58818l((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 40:
                    iM58815i = z5f.m58815i((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iM58815i = z5f.m58813g((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iM58815i = z5f.m58808b((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    iM58815i = z5f.m58829w((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iM58815i = z5f.m58811e((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 45:
                    iM58815i = z5f.m58813g((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 46:
                    iM58815i = z5f.m58815i((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 47:
                    iM58815i = z5f.m58824r((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 48:
                    iM58815i = z5f.m58826t((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i > 0) {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38870B = iM38880L + iM38882N + iM58815i;
                        i5 += iM38870B;
                    }
                    break;
                case 49:
                    iM38890d = z5f.m58816j(iM57552T, (List) unsafe.getObject(obj, jM57530U), m57560u(i4));
                    i5 += iM38890d;
                    break;
                case 50:
                    iM38890d = this.f55235q.mo47099g(iM57552T, unsafe.getObject(obj, jM57530U), m57559t(i4));
                    i5 += iM38890d;
                    break;
                case 51:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38894h(iM57552T, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i5 += iM38890d;
                    }
                    break;
                case 52:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38902p(iM57552T, 0.0f);
                        i5 += iM38890d;
                    }
                    break;
                case 53:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38908v(iM57552T, m57535Z(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 54:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38883O(iM57552T, m57535Z(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 55:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38906t(iM57552T, m57534Y(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 56:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38900n(iM57552T, 0L);
                        i5 += iM38890d;
                    }
                    break;
                case 57:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38870B = mf3.m38898l(iM57552T, 0);
                        i5 += iM38870B;
                    }
                    break;
                case 58:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38890d(iM57552T, true);
                        i5 += iM38890d;
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (m57546H(obj, iM57552T, i4)) {
                        Object object2 = unsafe.getObject(obj, jM57530U);
                        iM38890d = object2 instanceof yq1 ? mf3.m38892f(iM57552T, (yq1) object2) : mf3.m38878J(iM57552T, (String) object2);
                        i5 += iM38890d;
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = z5f.m58821o(iM57552T, unsafe.getObject(obj, jM57530U), m57560u(i4));
                        i5 += iM38890d;
                    }
                    break;
                case 61:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38892f(iM57552T, (yq1) unsafe.getObject(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 62:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38881M(iM57552T, m57534Y(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 63:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38896j(iM57552T, m57534Y(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case 64:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38870B = mf3.m38870B(iM57552T, 0);
                        i5 += iM38870B;
                    }
                    break;
                case 65:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38872D(iM57552T, 0L);
                        i5 += iM38890d;
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38874F(iM57552T, m57534Y(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38876H(iM57552T, m57535Z(obj, jM57530U));
                        i5 += iM38890d;
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (m57546H(obj, iM57552T, i4)) {
                        iM38890d = mf3.m38904r(iM57552T, (rcb) unsafe.getObject(obj, jM57530U), m57560u(i4));
                        i5 += iM38890d;
                    }
                    break;
            }
            i4 += 3;
            i3 = i9;
        }
        int iM57563y = i5 + m57563y(this.f55233o, obj);
        return this.f55224f ? iM57563y + this.f55234p.mo48605c(obj).m29493c() : iM57563y;
    }

    public final void w0(int i, Object obj, bdj bdjVar) {
        if (obj instanceof String) {
            bdjVar.mo18705e(i, (String) obj);
        } else {
            bdjVar.mo18695J(i, (yq1) obj);
        }
    }

    /* renamed from: x */
    public final int m57562x(Object obj) {
        int iM38894h;
        int iM58815i;
        int iM38880L;
        int iM38882N;
        Unsafe unsafe = f55218s;
        int i = 0;
        for (int i2 = 0; i2 < this.f55219a.length; i2 += 3) {
            int iR0 = r0(i2);
            int iQ0 = q0(iR0);
            int iM57552T = m57552T(i2);
            long jM57530U = m57530U(iR0);
            int i3 = (iQ0 < iu6.DOUBLE_LIST_PACKED.id() || iQ0 > iu6.SINT64_LIST_PACKED.id()) ? 0 : this.f55219a[i2 + 2] & 1048575;
            switch (iQ0) {
                case 0:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38894h(iM57552T, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38902p(iM57552T, 0.0f);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38908v(iM57552T, a5i.m16487y(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38883O(iM57552T, a5i.m16487y(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38906t(iM57552T, a5i.m16486x(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38900n(iM57552T, 0L);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38898l(iM57552T, 0);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38890d(iM57552T, true);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m57541B(obj, i2)) {
                        Object objM16446A = a5i.m16446A(obj, jM57530U);
                        iM38894h = objM16446A instanceof yq1 ? mf3.m38892f(iM57552T, (yq1) objM16446A) : mf3.m38878J(iM57552T, (String) objM16446A);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m57541B(obj, i2)) {
                        iM38894h = z5f.m58821o(iM57552T, a5i.m16446A(obj, jM57530U), m57560u(i2));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38892f(iM57552T, (yq1) a5i.m16446A(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38881M(iM57552T, a5i.m16486x(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38896j(iM57552T, a5i.m16486x(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38870B(iM57552T, 0);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38872D(iM57552T, 0L);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38874F(iM57552T, a5i.m16486x(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38876H(iM57552T, a5i.m16487y(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m57541B(obj, i2)) {
                        iM38894h = mf3.m38904r(iM57552T, (rcb) a5i.m16446A(obj, jM57530U), m57560u(i2));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iM38894h = z5f.m58814h(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 19:
                    iM38894h = z5f.m58812f(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 20:
                    iM38894h = z5f.m58819m(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 21:
                    iM38894h = z5f.m58830x(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 22:
                    iM38894h = z5f.m58817k(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 23:
                    iM38894h = z5f.m58814h(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 24:
                    iM38894h = z5f.m58812f(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 25:
                    iM38894h = z5f.m58807a(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 26:
                    iM38894h = z5f.m58827u(iM57552T, m57525J(obj, jM57530U));
                    i += iM38894h;
                    break;
                case 27:
                    iM38894h = z5f.m58822p(iM57552T, m57525J(obj, jM57530U), m57560u(i2));
                    i += iM38894h;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iM38894h = z5f.m58809c(iM57552T, m57525J(obj, jM57530U));
                    i += iM38894h;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iM38894h = z5f.m58828v(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 30:
                    iM38894h = z5f.m58810d(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM38894h = z5f.m58812f(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 32:
                    iM38894h = z5f.m58814h(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 33:
                    iM38894h = z5f.m58823q(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iM38894h = z5f.m58825s(iM57552T, m57525J(obj, jM57530U), false);
                    i += iM38894h;
                    break;
                case 35:
                    iM58815i = z5f.m58815i((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iM58815i = z5f.m58813g((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 37:
                    iM58815i = z5f.m58820n((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 38:
                    iM58815i = z5f.m58831y((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iM58815i = z5f.m58818l((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 40:
                    iM58815i = z5f.m58815i((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iM58815i = z5f.m58813g((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iM58815i = z5f.m58808b((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case SignatureVisitor.EXTENDS /* 43 */:
                    iM58815i = z5f.m58829w((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iM58815i = z5f.m58811e((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 45:
                    iM58815i = z5f.m58813g((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 46:
                    iM58815i = z5f.m58815i((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 47:
                    iM58815i = z5f.m58824r((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 48:
                    iM58815i = z5f.m58826t((List) unsafe.getObject(obj, jM57530U));
                    if (iM58815i <= 0) {
                        break;
                    } else {
                        if (this.f55227i) {
                            unsafe.putInt(obj, i3, iM58815i);
                        }
                        iM38880L = mf3.m38880L(iM57552T);
                        iM38882N = mf3.m38882N(iM58815i);
                        iM38894h = iM38880L + iM38882N + iM58815i;
                        i += iM38894h;
                        break;
                    }
                case 49:
                    iM38894h = z5f.m58816j(iM57552T, m57525J(obj, jM57530U), m57560u(i2));
                    i += iM38894h;
                    break;
                case 50:
                    iM38894h = this.f55235q.mo47099g(iM57552T, a5i.m16446A(obj, jM57530U), m57559t(i2));
                    i += iM38894h;
                    break;
                case 51:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38894h(iM57552T, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38902p(iM57552T, 0.0f);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38908v(iM57552T, m57535Z(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38883O(iM57552T, m57535Z(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38906t(iM57552T, m57534Y(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38900n(iM57552T, 0L);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38898l(iM57552T, 0);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38890d(iM57552T, true);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m57546H(obj, iM57552T, i2)) {
                        Object objM16446A2 = a5i.m16446A(obj, jM57530U);
                        iM38894h = objM16446A2 instanceof yq1 ? mf3.m38892f(iM57552T, (yq1) objM16446A2) : mf3.m38878J(iM57552T, (String) objM16446A2);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = z5f.m58821o(iM57552T, a5i.m16446A(obj, jM57530U), m57560u(i2));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38892f(iM57552T, (yq1) a5i.m16446A(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38881M(iM57552T, m57534Y(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38896j(iM57552T, m57534Y(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38870B(iM57552T, 0);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38872D(iM57552T, 0L);
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38874F(iM57552T, m57534Y(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38876H(iM57552T, m57535Z(obj, jM57530U));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m57546H(obj, iM57552T, i2)) {
                        iM38894h = mf3.m38904r(iM57552T, (rcb) a5i.m16446A(obj, jM57530U), m57560u(i2));
                        i += iM38894h;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + m57563y(this.f55233o, obj);
    }

    public final void x0(k4i k4iVar, Object obj, bdj bdjVar) {
        k4iVar.mo34990t(k4iVar.mo34977g(obj), bdjVar);
    }

    /* renamed from: y */
    public final int m57563y(k4i k4iVar, Object obj) {
        return k4iVar.mo34978h(k4iVar.mo34977g(obj));
    }
}
