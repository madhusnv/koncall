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
import p001o.cdj;
import p001o.ct8;
import p001o.fbj;
import p001o.no0;
import p001o.nra;
import p001o.xq1;
import p001o.yn8;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public final class xcb implements n5f {

    /* renamed from: r */
    public static final int[] f53504r = new int[0];

    /* renamed from: s */
    public static final Unsafe f53505s = z4i.m58696H();

    /* renamed from: a */
    public final int[] f53506a;

    /* renamed from: b */
    public final Object[] f53507b;

    /* renamed from: c */
    public final int f53508c;

    /* renamed from: d */
    public final int f53509d;

    /* renamed from: e */
    public final scb f53510e;

    /* renamed from: f */
    public final boolean f53511f;

    /* renamed from: g */
    public final boolean f53512g;

    /* renamed from: h */
    public final boolean f53513h;

    /* renamed from: i */
    public final boolean f53514i;

    /* renamed from: j */
    public final int[] f53515j;

    /* renamed from: k */
    public final int f53516k;

    /* renamed from: l */
    public final int f53517l;

    /* renamed from: m */
    public final lub f53518m;

    /* renamed from: n */
    public final pea f53519n;

    /* renamed from: o */
    public final j4i f53520o;

    /* renamed from: p */
    public final rp6 f53521p;

    /* renamed from: q */
    public final qra f53522q;

    /* renamed from: o.xcb$a */
    public static /* synthetic */ class C18113a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53523a;

        static {
            int[] iArr = new int[fbj.EnumC13396b.values().length];
            f53523a = iArr;
            try {
                iArr[fbj.EnumC13396b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53523a[fbj.EnumC13396b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53523a[fbj.EnumC13396b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53523a[fbj.EnumC13396b.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53523a[fbj.EnumC13396b.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53523a[fbj.EnumC13396b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53523a[fbj.EnumC13396b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53523a[fbj.EnumC13396b.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53523a[fbj.EnumC13396b.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f53523a[fbj.EnumC13396b.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f53523a[fbj.EnumC13396b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f53523a[fbj.EnumC13396b.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f53523a[fbj.EnumC13396b.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f53523a[fbj.EnumC13396b.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f53523a[fbj.EnumC13396b.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f53523a[fbj.EnumC13396b.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f53523a[fbj.EnumC13396b.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public xcb(int[] iArr, Object[] objArr, int i, int i2, scb scbVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, lub lubVar, pea peaVar, j4i j4iVar, rp6 rp6Var, qra qraVar) {
        this.f53506a = iArr;
        this.f53507b = objArr;
        this.f53508c = i;
        this.f53509d = i2;
        this.f53512g = scbVar instanceof wn7;
        this.f53513h = z;
        this.f53511f = rp6Var != null && rp6Var.mo47058e(scbVar);
        this.f53514i = z2;
        this.f53515j = iArr2;
        this.f53516k = i3;
        this.f53517l = i4;
        this.f53518m = lubVar;
        this.f53519n = peaVar;
        this.f53520o = j4iVar;
        this.f53521p = rp6Var;
        this.f53510e = scbVar;
        this.f53522q = qraVar;
    }

    /* renamed from: A */
    public static int m55979A(Object obj, long j) {
        return z4i.m58691C(obj, j);
    }

    /* renamed from: B */
    public static boolean m55980B(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: E */
    public static boolean m55981E(Object obj, int i, n5f n5fVar) {
        return n5fVar.mo40124c(z4i.m58695G(obj, m55988V(i)));
    }

    /* renamed from: J */
    public static boolean m55982J(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: K */
    public static List m55983K(Object obj, long j) {
        return (List) z4i.m58695G(obj, j);
    }

    /* renamed from: L */
    public static long m55984L(Object obj, long j) {
        return z4i.m58693E(obj, j);
    }

    /* renamed from: R */
    public static xcb m55985R(Class cls, ncb ncbVar, lub lubVar, pea peaVar, j4i j4iVar, rp6 rp6Var, qra qraVar) {
        if (ncbVar instanceof gce) {
            return m55987T((gce) ncbVar, lubVar, peaVar, j4iVar, rp6Var, qraVar);
        }
        tq.m50332a(ncbVar);
        return m55986S(null, lubVar, peaVar, j4iVar, rp6Var, qraVar);
    }

    /* renamed from: S */
    public static xcb m55986S(n9g n9gVar, lub lubVar, pea peaVar, j4i j4iVar, rp6 rp6Var, qra qraVar) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x036d  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xcb m55987T(gce gceVar, lub lubVar, pea peaVar, j4i j4iVar, rp6 rp6Var, qra qraVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        int i17;
        int iObjectFieldOffset;
        String str;
        boolean z2;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        Field fieldN0;
        char cCharAt9;
        int i20;
        int i21;
        Object obj;
        Field fieldN02;
        Object obj2;
        Field fieldN03;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        boolean z3 = gceVar.mo28445c() == t1e.PROTO3;
        String strM28447e = gceVar.m28447e();
        int length = strM28447e.length();
        char c = 55296;
        if (strM28447e.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (strM28447e.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int iCharAt6 = strM28447e.charAt(i);
        if (iCharAt6 >= 55296) {
            int i28 = iCharAt6 & 8191;
            int i29 = 13;
            while (true) {
                i25 = i27 + 1;
                cCharAt13 = strM28447e.charAt(i27);
                if (cCharAt13 < 55296) {
                    break;
                }
                i28 |= (cCharAt13 & 8191) << i29;
                i29 += 13;
                i27 = i25;
            }
            iCharAt6 = i28 | (cCharAt13 << i29);
            i27 = i25;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i2 = 0;
            iArr = f53504r;
            i3 = 0;
        } else {
            int i30 = i27 + 1;
            int iCharAt7 = strM28447e.charAt(i27);
            if (iCharAt7 >= 55296) {
                int i31 = iCharAt7 & 8191;
                int i32 = 13;
                while (true) {
                    i11 = i30 + 1;
                    cCharAt8 = strM28447e.charAt(i30);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i31 |= (cCharAt8 & 8191) << i32;
                    i32 += 13;
                    i30 = i11;
                }
                iCharAt7 = i31 | (cCharAt8 << i32);
                i30 = i11;
            }
            int i33 = i30 + 1;
            int iCharAt8 = strM28447e.charAt(i30);
            if (iCharAt8 >= 55296) {
                int i34 = iCharAt8 & 8191;
                int i35 = 13;
                while (true) {
                    i10 = i33 + 1;
                    cCharAt7 = strM28447e.charAt(i33);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt7 & 8191) << i35;
                    i35 += 13;
                    i33 = i10;
                }
                iCharAt8 = i34 | (cCharAt7 << i35);
                i33 = i10;
            }
            int i36 = i33 + 1;
            iCharAt = strM28447e.charAt(i33);
            if (iCharAt >= 55296) {
                int i37 = iCharAt & 8191;
                int i38 = 13;
                while (true) {
                    i9 = i36 + 1;
                    cCharAt6 = strM28447e.charAt(i36);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt6 & 8191) << i38;
                    i38 += 13;
                    i36 = i9;
                }
                iCharAt = i37 | (cCharAt6 << i38);
                i36 = i9;
            }
            int i39 = i36 + 1;
            iCharAt2 = strM28447e.charAt(i36);
            if (iCharAt2 >= 55296) {
                int i40 = iCharAt2 & 8191;
                int i41 = 13;
                while (true) {
                    i8 = i39 + 1;
                    cCharAt5 = strM28447e.charAt(i39);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt5 & 8191) << i41;
                    i41 += 13;
                    i39 = i8;
                }
                iCharAt2 = i40 | (cCharAt5 << i41);
                i39 = i8;
            }
            int i42 = i39 + 1;
            iCharAt3 = strM28447e.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i7 = i42 + 1;
                    cCharAt4 = strM28447e.charAt(i42);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt4 & 8191) << i44;
                    i44 += 13;
                    i42 = i7;
                }
                iCharAt3 = i43 | (cCharAt4 << i44);
                i42 = i7;
            }
            int i45 = i42 + 1;
            iCharAt4 = strM28447e.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i6 = i45 + 1;
                    cCharAt3 = strM28447e.charAt(i45);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt3 & 8191) << i47;
                    i47 += 13;
                    i45 = i6;
                }
                iCharAt4 = i46 | (cCharAt3 << i47);
                i45 = i6;
            }
            int i48 = i45 + 1;
            int iCharAt9 = strM28447e.charAt(i45);
            if (iCharAt9 >= 55296) {
                int i49 = iCharAt9 & 8191;
                int i50 = 13;
                while (true) {
                    i5 = i48 + 1;
                    cCharAt2 = strM28447e.charAt(i48);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt2 & 8191) << i50;
                    i50 += 13;
                    i48 = i5;
                }
                iCharAt9 = i49 | (cCharAt2 << i50);
                i48 = i5;
            }
            int i51 = i48 + 1;
            iCharAt5 = strM28447e.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i4 = i51 + 1;
                    cCharAt = strM28447e.charAt(i51);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i52 |= (cCharAt & 8191) << i53;
                    i53 += 13;
                    i51 = i4;
                }
                iCharAt5 = i52 | (cCharAt << i53);
                i51 = i4;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i2 = (iCharAt7 * 2) + iCharAt8;
            i3 = iCharAt7;
            i27 = i51;
        }
        Unsafe unsafe = f53505s;
        Object[] objArrM28446d = gceVar.m28446d();
        Class<?> cls = gceVar.mo28444b().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i54 = iCharAt5 + iCharAt4;
        int i55 = iCharAt5;
        int i56 = i54;
        int i57 = 0;
        int i58 = 0;
        while (i27 < length) {
            int i59 = i27 + 1;
            int iCharAt10 = strM28447e.charAt(i27);
            if (iCharAt10 >= c) {
                int i60 = iCharAt10 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i24 = i61 + 1;
                    cCharAt12 = strM28447e.charAt(i61);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i60 |= (cCharAt12 & 8191) << i62;
                    i62 += 13;
                    i61 = i24;
                }
                iCharAt10 = i60 | (cCharAt12 << i62);
                i12 = i24;
            } else {
                i12 = i59;
            }
            int i63 = i12 + 1;
            int iCharAt11 = strM28447e.charAt(i12);
            if (iCharAt11 >= c) {
                int i64 = iCharAt11 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i23 = i65 + 1;
                    cCharAt11 = strM28447e.charAt(i65);
                    i13 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt11 & 8191) << i66;
                    i66 += 13;
                    i65 = i23;
                    length = i13;
                }
                iCharAt11 = i64 | (cCharAt11 << i66);
                i14 = i23;
            } else {
                i13 = length;
                i14 = i63;
            }
            int i67 = iCharAt11 & Constants.MAX_HOST_LENGTH;
            int i68 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i57] = i58;
                i57++;
            }
            int i69 = i57;
            if (i67 >= 51) {
                int i70 = i14 + 1;
                int iCharAt12 = strM28447e.charAt(i14);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i71 = iCharAt12 & 8191;
                    int i72 = 13;
                    while (true) {
                        i22 = i70 + 1;
                        cCharAt10 = strM28447e.charAt(i70);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i71 |= (cCharAt10 & 8191) << i72;
                        i72 += 13;
                        i70 = i22;
                        c2 = 55296;
                    }
                    iCharAt12 = i71 | (cCharAt10 << i72);
                    i70 = i22;
                }
                int i73 = i67 - 51;
                int i74 = i70;
                if (i73 == 9 || i73 == 17) {
                    i21 = i2 + 1;
                    objArr[((i58 / 3) * 2) + 1] = objArrM28446d[i2];
                } else {
                    if (i73 == 12 && !z3) {
                        i21 = i2 + 1;
                        objArr[((i58 / 3) * 2) + 1] = objArrM28446d[i2];
                    }
                    int i75 = iCharAt12 * 2;
                    obj = objArrM28446d[i75];
                    if (obj instanceof Field) {
                        fieldN02 = n0(cls, (String) obj);
                        objArrM28446d[i75] = fieldN02;
                    } else {
                        fieldN02 = (Field) obj;
                    }
                    i15 = iCharAt;
                    i16 = iCharAt2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN02);
                    int i76 = i75 + 1;
                    obj2 = objArrM28446d[i76];
                    if (obj2 instanceof Field) {
                        fieldN03 = n0(cls, (String) obj2);
                        objArrM28446d[i76] = fieldN03;
                    } else {
                        fieldN03 = (Field) obj2;
                    }
                    str = strM28447e;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN03);
                    z2 = z3;
                    i18 = i74;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i19 = 0;
                }
                i2 = i21;
                int i752 = iCharAt12 * 2;
                obj = objArrM28446d[i752];
                if (obj instanceof Field) {
                }
                i15 = iCharAt;
                i16 = iCharAt2;
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldN02);
                int i762 = i752 + 1;
                obj2 = objArrM28446d[i762];
                if (obj2 instanceof Field) {
                }
                str = strM28447e;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN03);
                z2 = z3;
                i18 = i74;
                iObjectFieldOffset = iObjectFieldOffset32;
                i19 = 0;
            } else {
                i15 = iCharAt;
                i16 = iCharAt2;
                int i77 = i2 + 1;
                Field fieldN04 = n0(cls, (String) objArrM28446d[i2]);
                if (i67 == 9 || i67 == 17) {
                    z = true;
                    objArr[((i58 / 3) * 2) + 1] = fieldN04.getType();
                } else {
                    if (i67 == 27 || i67 == 49) {
                        z = true;
                        i20 = i77 + 1;
                        objArr[((i58 / 3) * 2) + 1] = objArrM28446d[i77];
                    } else {
                        if (i67 == 12 || i67 == 30 || i67 == 44) {
                            if (!z3) {
                                z = true;
                                i20 = i77 + 1;
                                objArr[((i58 / 3) * 2) + 1] = objArrM28446d[i77];
                            }
                        } else if (i67 == 50) {
                            int i78 = i55 + 1;
                            iArr[i55] = i58;
                            int i79 = (i58 / 3) * 2;
                            int i80 = i77 + 1;
                            objArr[i79] = objArrM28446d[i77];
                            if ((iCharAt11 & 2048) != 0) {
                                i77 = i80 + 1;
                                objArr[i79 + 1] = objArrM28446d[i80];
                                i55 = i78;
                            } else {
                                i55 = i78;
                                i17 = i80;
                                z = true;
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN04);
                                int i81 = i17;
                                if (!((iCharAt11 & 4096) == 4096 ? z : false) || i67 > 17) {
                                    str = strM28447e;
                                    z2 = z3;
                                    iObjectFieldOffset2 = 1048575;
                                    i18 = i14;
                                    i19 = 0;
                                } else {
                                    int i82 = i14 + 1;
                                    int iCharAt13 = strM28447e.charAt(i14);
                                    if (iCharAt13 >= 55296) {
                                        int i83 = iCharAt13 & 8191;
                                        int i84 = 13;
                                        while (true) {
                                            i18 = i82 + 1;
                                            cCharAt9 = strM28447e.charAt(i82);
                                            if (cCharAt9 < 55296) {
                                                break;
                                            }
                                            i83 |= (cCharAt9 & 8191) << i84;
                                            i84 += 13;
                                            i82 = i18;
                                        }
                                        iCharAt13 = i83 | (cCharAt9 << i84);
                                    } else {
                                        i18 = i82;
                                    }
                                    int i85 = (i3 * 2) + (iCharAt13 / 32);
                                    Object obj3 = objArrM28446d[i85];
                                    str = strM28447e;
                                    if (obj3 instanceof Field) {
                                        fieldN0 = (Field) obj3;
                                    } else {
                                        fieldN0 = n0(cls, (String) obj3);
                                        objArrM28446d[i85] = fieldN0;
                                    }
                                    z2 = z3;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN0);
                                    i19 = iCharAt13 % 32;
                                }
                                if (i67 >= 18 && i67 <= 49) {
                                    iArr[i56] = iObjectFieldOffset;
                                    i56++;
                                }
                                i2 = i81;
                            }
                        }
                        z = true;
                    }
                    i17 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN04);
                    int i812 = i17;
                    if ((iCharAt11 & 4096) == 4096 ? z : false) {
                        str = strM28447e;
                        z2 = z3;
                        iObjectFieldOffset2 = 1048575;
                        i18 = i14;
                        i19 = 0;
                        if (i67 >= 18) {
                            iArr[i56] = iObjectFieldOffset;
                            i56++;
                        }
                        i2 = i812;
                    }
                }
                i17 = i77;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN04);
                int i8122 = i17;
                if ((iCharAt11 & 4096) == 4096 ? z : false) {
                }
            }
            int i86 = i58 + 1;
            iArr2[i58] = iCharAt10;
            int i87 = i86 + 1;
            iArr2[i86] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i67 << 20) | iObjectFieldOffset;
            i58 = i87 + 1;
            iArr2[i87] = (i19 << 20) | iObjectFieldOffset2;
            z3 = z2;
            iCharAt = i15;
            iCharAt5 = i68;
            length = i13;
            i27 = i18;
            i57 = i69;
            strM28447e = str;
            iCharAt2 = i16;
            c = 55296;
        }
        return new xcb(iArr2, objArr, iCharAt, iCharAt2, gceVar.mo28444b(), z3, false, iArr, iCharAt5, i54, lubVar, peaVar, j4iVar, rp6Var, qraVar);
    }

    /* renamed from: V */
    public static long m55988V(int i) {
        return i & 1048575;
    }

    /* renamed from: W */
    public static boolean m55989W(Object obj, long j) {
        return ((Boolean) z4i.m58695G(obj, j)).booleanValue();
    }

    /* renamed from: X */
    public static double m55990X(Object obj, long j) {
        return ((Double) z4i.m58695G(obj, j)).doubleValue();
    }

    /* renamed from: Y */
    public static float m55991Y(Object obj, long j) {
        return ((Float) z4i.m58695G(obj, j)).floatValue();
    }

    /* renamed from: Z */
    public static int m55992Z(Object obj, long j) {
        return ((Integer) z4i.m58695G(obj, j)).intValue();
    }

    public static long a0(Object obj, long j) {
        return ((Long) z4i.m58695G(obj, j)).longValue();
    }

    /* renamed from: l */
    public static boolean m55993l(Object obj, long j) {
        return z4i.m58732t(obj, j);
    }

    public static Field n0(Class cls, String str) {
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

    /* renamed from: o */
    public static double m55994o(Object obj, long j) {
        return z4i.m58689A(obj, j);
    }

    public static int r0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: s */
    public static float m55995s(Object obj, long j) {
        return z4i.m58690B(obj, j);
    }

    /* renamed from: w */
    public static l4i m55996w(Object obj) {
        wn7 wn7Var = (wn7) obj;
        l4i l4iVar = wn7Var.unknownFields;
        if (l4iVar != l4i.m36562c()) {
            return l4iVar;
        }
        l4i l4iVarM36566n = l4i.m36566n();
        wn7Var.unknownFields = l4iVarM36566n;
        return l4iVarM36566n;
    }

    /* renamed from: C */
    public final boolean m55997C(Object obj, int i) {
        int iI0 = i0(i);
        long j = 1048575 & iI0;
        if (j != 1048575) {
            return (z4i.m58691C(obj, j) & (1 << (iI0 >>> 20))) != 0;
        }
        int iS0 = s0(i);
        long jM55988V = m55988V(iS0);
        switch (r0(iS0)) {
            case 0:
                return z4i.m58689A(obj, jM55988V) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 1:
                return z4i.m58690B(obj, jM55988V) != 0.0f;
            case 2:
                return z4i.m58693E(obj, jM55988V) != 0;
            case 3:
                return z4i.m58693E(obj, jM55988V) != 0;
            case 4:
                return z4i.m58691C(obj, jM55988V) != 0;
            case 5:
                return z4i.m58693E(obj, jM55988V) != 0;
            case 6:
                return z4i.m58691C(obj, jM55988V) != 0;
            case 7:
                return z4i.m58732t(obj, jM55988V);
            case 8:
                Object objM58695G = z4i.m58695G(obj, jM55988V);
                if (objM58695G instanceof String) {
                    return !((String) objM58695G).isEmpty();
                }
                if (objM58695G instanceof xq1) {
                    return !xq1.f54049b.equals(objM58695G);
                }
                throw new IllegalArgumentException();
            case 9:
                return z4i.m58695G(obj, jM55988V) != null;
            case 10:
                return !xq1.f54049b.equals(z4i.m58695G(obj, jM55988V));
            case 11:
                return z4i.m58691C(obj, jM55988V) != 0;
            case 12:
                return z4i.m58691C(obj, jM55988V) != 0;
            case 13:
                return z4i.m58691C(obj, jM55988V) != 0;
            case 14:
                return z4i.m58693E(obj, jM55988V) != 0;
            case 15:
                return z4i.m58691C(obj, jM55988V) != 0;
            case 16:
                return z4i.m58693E(obj, jM55988V) != 0;
            case 17:
                return z4i.m58695G(obj, jM55988V) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: D */
    public final boolean m55998D(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m55997C(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: F */
    public final boolean m55999F(Object obj, int i, int i2) {
        List list = (List) z4i.m58695G(obj, m55988V(i));
        if (list.isEmpty()) {
            return true;
        }
        n5f n5fVarM56017v = m56017v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!n5fVarM56017v.mo40124c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m56000G(Object obj, int i, int i2) {
        Map mapMo45810e = this.f53522q.mo45810e(z4i.m58695G(obj, m55988V(i)));
        if (mapMo45810e.isEmpty()) {
            return true;
        }
        if (this.f53522q.mo45807b(m56016u(i2)).f37207c.getJavaType() != fbj.EnumC13397c.MESSAGE) {
            return true;
        }
        n5f n5fVarM52234d = null;
        for (Object obj2 : mapMo45810e.values()) {
            if (n5fVarM52234d == null) {
                n5fVarM52234d = v1e.m52231a().m52234d(obj2.getClass());
            }
            if (!n5fVarM52234d.mo40124c(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m56001H(Object obj, Object obj2, int i) {
        long jI0 = i0(i) & 1048575;
        return z4i.m58691C(obj, jI0) == z4i.m58691C(obj2, jI0);
    }

    /* renamed from: I */
    public final boolean m56002I(Object obj, int i, int i2) {
        return z4i.m58691C(obj, (long) (i0(i2) & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r0 = r16.f53516k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r0 >= r16.f53517l) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r13 = m56013q(r19, r16.f53515j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r17.mo33256o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        return;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m56003M(j4i j4iVar, rp6 rp6Var, Object obj, mce mceVar, qp6 qp6Var) {
        Object objM56013q = null;
        fu6 fu6VarMo47057d = null;
        while (true) {
            try {
                int iMo35618z = mceVar.mo35618z();
                int iG0 = g0(iMo35618z);
                if (iG0 >= 0) {
                    int iS0 = s0(iG0);
                    try {
                        switch (r0(iS0)) {
                            case 0:
                                z4i.m58706R(obj, m55988V(iS0), mceVar.readDouble());
                                o0(obj, iG0);
                                break;
                            case 1:
                                z4i.m58707S(obj, m55988V(iS0), mceVar.readFloat());
                                o0(obj, iG0);
                                break;
                            case 2:
                                z4i.m58709U(obj, m55988V(iS0), mceVar.mo35576G());
                                o0(obj, iG0);
                                break;
                            case 3:
                                z4i.m58709U(obj, m55988V(iS0), mceVar.mo35611s());
                                o0(obj, iG0);
                                break;
                            case 4:
                                z4i.m58708T(obj, m55988V(iS0), mceVar.mo35608p());
                                o0(obj, iG0);
                                break;
                            case 5:
                                z4i.m58709U(obj, m55988V(iS0), mceVar.mo35593a());
                                o0(obj, iG0);
                                break;
                            case 6:
                                z4i.m58708T(obj, m55988V(iS0), mceVar.mo35613u());
                                o0(obj, iG0);
                                break;
                            case 7:
                                z4i.m58700L(obj, m55988V(iS0), mceVar.mo35597e());
                                o0(obj, iG0);
                                break;
                            case 8:
                                l0(obj, iS0, mceVar);
                                o0(obj, iG0);
                                break;
                            case 9:
                                if (m55997C(obj, iG0)) {
                                    z4i.m58710V(obj, m55988V(iS0), yn8.m58019h(z4i.m58695G(obj, m55988V(iS0)), mceVar.mo35580K(m56017v(iG0), qp6Var)));
                                    break;
                                } else {
                                    z4i.m58710V(obj, m55988V(iS0), mceVar.mo35580K(m56017v(iG0), qp6Var));
                                    o0(obj, iG0);
                                    break;
                                }
                            case 10:
                                z4i.m58710V(obj, m55988V(iS0), mceVar.mo35607o());
                                o0(obj, iG0);
                                break;
                            case 11:
                                z4i.m58708T(obj, m55988V(iS0), mceVar.mo35600h());
                                o0(obj, iG0);
                                break;
                            case 12:
                                int iMo35603k = mceVar.mo35603k();
                                yn8.InterfaceC18441e interfaceC18441eM56015t = m56015t(iG0);
                                if (interfaceC18441eM56015t != null && !interfaceC18441eM56015t.isInRange(iMo35603k)) {
                                    objM56013q = y5f.m57253L(iMo35618z, iMo35603k, objM56013q, j4iVar);
                                    break;
                                } else {
                                    z4i.m58708T(obj, m55988V(iS0), iMo35603k);
                                    o0(obj, iG0);
                                    break;
                                }
                                break;
                            case 13:
                                z4i.m58708T(obj, m55988V(iS0), mceVar.mo35573D());
                                o0(obj, iG0);
                                break;
                            case 14:
                                z4i.m58709U(obj, m55988V(iS0), mceVar.mo35598f());
                                o0(obj, iG0);
                                break;
                            case 15:
                                z4i.m58708T(obj, m55988V(iS0), mceVar.mo35604l());
                                o0(obj, iG0);
                                break;
                            case 16:
                                z4i.m58709U(obj, m55988V(iS0), mceVar.mo35617y());
                                o0(obj, iG0);
                                break;
                            case 17:
                                if (m55997C(obj, iG0)) {
                                    z4i.m58710V(obj, m55988V(iS0), yn8.m58019h(z4i.m58695G(obj, m55988V(iS0)), mceVar.mo35578I(m56017v(iG0), qp6Var)));
                                    break;
                                } else {
                                    z4i.m58710V(obj, m55988V(iS0), mceVar.mo35578I(m56017v(iG0), qp6Var));
                                    o0(obj, iG0);
                                    break;
                                }
                            case 18:
                                mceVar.mo35575F(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 19:
                                mceVar.mo35571B(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 20:
                                mceVar.mo35601i(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 21:
                                mceVar.mo35599g(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 22:
                                mceVar.mo35615w(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 23:
                                mceVar.mo35609q(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 24:
                                mceVar.mo35616x(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 25:
                                mceVar.mo35605m(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 26:
                                m0(obj, iS0, mceVar);
                                break;
                            case 27:
                                k0(obj, iS0, mceVar, m56017v(iG0), qp6Var);
                                break;
                            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                mceVar.mo35574E(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                mceVar.mo35612t(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 30:
                                List listMo43523e = this.f53519n.mo43523e(obj, m55988V(iS0));
                                mceVar.mo35602j(listMo43523e);
                                objM56013q = y5f.m57242A(iMo35618z, listMo43523e, m56015t(iG0), objM56013q, j4iVar);
                                break;
                            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                mceVar.mo35595c(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 32:
                                mceVar.mo35614v(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 33:
                                mceVar.mo35610r(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                mceVar.mo35596d(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 35:
                                mceVar.mo35575F(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                mceVar.mo35571B(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 37:
                                mceVar.mo35601i(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 38:
                                mceVar.mo35599g(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                mceVar.mo35615w(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 40:
                                mceVar.mo35609q(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                mceVar.mo35616x(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                mceVar.mo35605m(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case SignatureVisitor.EXTENDS /* 43 */:
                                mceVar.mo35612t(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                List listMo43523e2 = this.f53519n.mo43523e(obj, m55988V(iS0));
                                mceVar.mo35602j(listMo43523e2);
                                objM56013q = y5f.m57242A(iMo35618z, listMo43523e2, m56015t(iG0), objM56013q, j4iVar);
                                break;
                            case 45:
                                mceVar.mo35595c(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 46:
                                mceVar.mo35614v(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 47:
                                mceVar.mo35610r(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 48:
                                mceVar.mo35596d(this.f53519n.mo43523e(obj, m55988V(iS0)));
                                break;
                            case 49:
                                j0(obj, m55988V(iS0), mceVar, m56017v(iG0), qp6Var);
                                break;
                            case 50:
                                m56004N(obj, iG0, m56016u(iG0), qp6Var, mceVar);
                                break;
                            case 51:
                                z4i.m58710V(obj, m55988V(iS0), Double.valueOf(mceVar.readDouble()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 52:
                                z4i.m58710V(obj, m55988V(iS0), Float.valueOf(mceVar.readFloat()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 53:
                                z4i.m58710V(obj, m55988V(iS0), Long.valueOf(mceVar.mo35576G()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 54:
                                z4i.m58710V(obj, m55988V(iS0), Long.valueOf(mceVar.mo35611s()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 55:
                                z4i.m58710V(obj, m55988V(iS0), Integer.valueOf(mceVar.mo35608p()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 56:
                                z4i.m58710V(obj, m55988V(iS0), Long.valueOf(mceVar.mo35593a()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 57:
                                z4i.m58710V(obj, m55988V(iS0), Integer.valueOf(mceVar.mo35613u()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 58:
                                z4i.m58710V(obj, m55988V(iS0), Boolean.valueOf(mceVar.mo35597e()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case Opcodes.V15 /* 59 */:
                                l0(obj, iS0, mceVar);
                                p0(obj, iMo35618z, iG0);
                                break;
                            case Opcodes.V16 /* 60 */:
                                if (m56002I(obj, iMo35618z, iG0)) {
                                    z4i.m58710V(obj, m55988V(iS0), yn8.m58019h(z4i.m58695G(obj, m55988V(iS0)), mceVar.mo35580K(m56017v(iG0), qp6Var)));
                                } else {
                                    z4i.m58710V(obj, m55988V(iS0), mceVar.mo35580K(m56017v(iG0), qp6Var));
                                    o0(obj, iG0);
                                }
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 61:
                                z4i.m58710V(obj, m55988V(iS0), mceVar.mo35607o());
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 62:
                                z4i.m58710V(obj, m55988V(iS0), Integer.valueOf(mceVar.mo35600h()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 63:
                                int iMo35603k2 = mceVar.mo35603k();
                                yn8.InterfaceC18441e interfaceC18441eM56015t2 = m56015t(iG0);
                                if (interfaceC18441eM56015t2 != null && !interfaceC18441eM56015t2.isInRange(iMo35603k2)) {
                                    objM56013q = y5f.m57253L(iMo35618z, iMo35603k2, objM56013q, j4iVar);
                                    break;
                                } else {
                                    z4i.m58710V(obj, m55988V(iS0), Integer.valueOf(iMo35603k2));
                                    p0(obj, iMo35618z, iG0);
                                    break;
                                }
                                break;
                            case 64:
                                z4i.m58710V(obj, m55988V(iS0), Integer.valueOf(mceVar.mo35573D()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case 65:
                                z4i.m58710V(obj, m55988V(iS0), Long.valueOf(mceVar.mo35598f()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                                z4i.m58710V(obj, m55988V(iS0), Integer.valueOf(mceVar.mo35604l()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case TypeReference.INSTANCEOF /* 67 */:
                                z4i.m58710V(obj, m55988V(iS0), Long.valueOf(mceVar.mo35617y()));
                                p0(obj, iMo35618z, iG0);
                                break;
                            case TypeReference.NEW /* 68 */:
                                z4i.m58710V(obj, m55988V(iS0), mceVar.mo35578I(m56017v(iG0), qp6Var));
                                p0(obj, iMo35618z, iG0);
                                break;
                            default:
                                if (objM56013q == null) {
                                    objM56013q = j4iVar.mo33255n();
                                }
                                if (!j4iVar.m33254m(objM56013q, mceVar)) {
                                    for (int i = this.f53516k; i < this.f53517l; i++) {
                                        objM56013q = m56013q(obj, this.f53515j[i], objM56013q, j4iVar);
                                    }
                                    if (objM56013q != null) {
                                        j4iVar.mo33256o(obj, objM56013q);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (ct8.C12741a unused) {
                        if (!j4iVar.mo33258q(mceVar)) {
                            if (objM56013q == null) {
                                objM56013q = j4iVar.mo33247f(obj);
                            }
                            if (!j4iVar.m33254m(objM56013q, mceVar)) {
                                for (int i2 = this.f53516k; i2 < this.f53517l; i2++) {
                                    objM56013q = m56013q(obj, this.f53515j[i2], objM56013q, j4iVar);
                                }
                                if (objM56013q != null) {
                                    j4iVar.mo33256o(obj, objM56013q);
                                    return;
                                }
                                return;
                            }
                        } else if (!mceVar.mo35572C()) {
                            for (int i3 = this.f53516k; i3 < this.f53517l; i3++) {
                                objM56013q = m56013q(obj, this.f53515j[i3], objM56013q, j4iVar);
                            }
                            if (objM56013q != null) {
                                j4iVar.mo33256o(obj, objM56013q);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iMo35618z == Integer.MAX_VALUE) {
                        for (int i4 = this.f53516k; i4 < this.f53517l; i4++) {
                            objM56013q = m56013q(obj, this.f53515j[i4], objM56013q, j4iVar);
                        }
                        if (objM56013q != null) {
                            j4iVar.mo33256o(obj, objM56013q);
                            return;
                        }
                        return;
                    }
                    Object objMo47055b = !this.f53511f ? null : rp6Var.mo47055b(qp6Var, this.f53510e, iMo35618z);
                    if (objMo47055b != null) {
                        if (fu6VarMo47057d == null) {
                            fu6VarMo47057d = rp6Var.mo47057d(obj);
                        }
                        objM56013q = rp6Var.mo47060g(mceVar, objMo47055b, qp6Var, fu6VarMo47057d, objM56013q, j4iVar);
                    } else if (!j4iVar.mo33258q(mceVar)) {
                        if (objM56013q == null) {
                            objM56013q = j4iVar.mo33247f(obj);
                        }
                        if (j4iVar.m33254m(objM56013q, mceVar)) {
                        }
                    } else if (mceVar.mo35572C()) {
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f53516k; i5 < this.f53517l; i5++) {
                    objM56013q = m56013q(obj, this.f53515j[i5], objM56013q, j4iVar);
                }
                if (objM56013q != null) {
                    j4iVar.mo33256o(obj, objM56013q);
                }
                throw th;
            }
        }
    }

    /* renamed from: N */
    public final void m56004N(Object obj, int i, Object obj2, qp6 qp6Var, mce mceVar) {
        long jM55988V = m55988V(s0(i));
        Object objM58695G = z4i.m58695G(obj, jM55988V);
        if (objM58695G == null) {
            objM58695G = this.f53522q.mo45809d(obj2);
            z4i.m58710V(obj, jM55988V, objM58695G);
        } else if (this.f53522q.mo45813h(objM58695G)) {
            Object objMo45809d = this.f53522q.mo45809d(obj2);
            this.f53522q.mo45806a(objMo45809d, objM58695G);
            z4i.m58710V(obj, jM55988V, objMo45809d);
            objM58695G = objMo45809d;
        }
        mceVar.mo35579J(this.f53522q.mo45808c(objM58695G), this.f53522q.mo45807b(obj2), qp6Var);
    }

    /* renamed from: O */
    public final void m56005O(Object obj, Object obj2, int i) {
        long jM55988V = m55988V(s0(i));
        if (m55997C(obj2, i)) {
            Object objM58695G = z4i.m58695G(obj, jM55988V);
            Object objM58695G2 = z4i.m58695G(obj2, jM55988V);
            if (objM58695G != null && objM58695G2 != null) {
                z4i.m58710V(obj, jM55988V, yn8.m58019h(objM58695G, objM58695G2));
                o0(obj, i);
            } else if (objM58695G2 != null) {
                z4i.m58710V(obj, jM55988V, objM58695G2);
                o0(obj, i);
            }
        }
    }

    /* renamed from: P */
    public final void m56006P(Object obj, Object obj2, int i) {
        int iS0 = s0(i);
        int iM56008U = m56008U(i);
        long jM55988V = m55988V(iS0);
        if (m56002I(obj2, iM56008U, i)) {
            Object objM58695G = m56002I(obj, iM56008U, i) ? z4i.m58695G(obj, jM55988V) : null;
            Object objM58695G2 = z4i.m58695G(obj2, jM55988V);
            if (objM58695G != null && objM58695G2 != null) {
                z4i.m58710V(obj, jM55988V, yn8.m58019h(objM58695G, objM58695G2));
                p0(obj, iM56008U, i);
            } else if (objM58695G2 != null) {
                z4i.m58710V(obj, jM55988V, objM58695G2);
                p0(obj, iM56008U, i);
            }
        }
    }

    /* renamed from: Q */
    public final void m56007Q(Object obj, Object obj2, int i) {
        int iS0 = s0(i);
        long jM55988V = m55988V(iS0);
        int iM56008U = m56008U(i);
        switch (r0(iS0)) {
            case 0:
                if (m55997C(obj2, i)) {
                    z4i.m58706R(obj, jM55988V, z4i.m58689A(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 1:
                if (m55997C(obj2, i)) {
                    z4i.m58707S(obj, jM55988V, z4i.m58690B(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 2:
                if (m55997C(obj2, i)) {
                    z4i.m58709U(obj, jM55988V, z4i.m58693E(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 3:
                if (m55997C(obj2, i)) {
                    z4i.m58709U(obj, jM55988V, z4i.m58693E(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 4:
                if (m55997C(obj2, i)) {
                    z4i.m58708T(obj, jM55988V, z4i.m58691C(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 5:
                if (m55997C(obj2, i)) {
                    z4i.m58709U(obj, jM55988V, z4i.m58693E(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 6:
                if (m55997C(obj2, i)) {
                    z4i.m58708T(obj, jM55988V, z4i.m58691C(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 7:
                if (m55997C(obj2, i)) {
                    z4i.m58700L(obj, jM55988V, z4i.m58732t(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 8:
                if (m55997C(obj2, i)) {
                    z4i.m58710V(obj, jM55988V, z4i.m58695G(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 9:
                m56005O(obj, obj2, i);
                break;
            case 10:
                if (m55997C(obj2, i)) {
                    z4i.m58710V(obj, jM55988V, z4i.m58695G(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 11:
                if (m55997C(obj2, i)) {
                    z4i.m58708T(obj, jM55988V, z4i.m58691C(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 12:
                if (m55997C(obj2, i)) {
                    z4i.m58708T(obj, jM55988V, z4i.m58691C(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 13:
                if (m55997C(obj2, i)) {
                    z4i.m58708T(obj, jM55988V, z4i.m58691C(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 14:
                if (m55997C(obj2, i)) {
                    z4i.m58709U(obj, jM55988V, z4i.m58693E(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 15:
                if (m55997C(obj2, i)) {
                    z4i.m58708T(obj, jM55988V, z4i.m58691C(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 16:
                if (m55997C(obj2, i)) {
                    z4i.m58709U(obj, jM55988V, z4i.m58693E(obj2, jM55988V));
                    o0(obj, i);
                    break;
                }
                break;
            case 17:
                m56005O(obj, obj2, i);
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
                this.f53519n.mo43522d(obj, obj2, jM55988V);
                break;
            case 50:
                y5f.m57247F(this.f53522q, obj, obj2, jM55988V);
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
                if (m56002I(obj2, iM56008U, i)) {
                    z4i.m58710V(obj, jM55988V, z4i.m58695G(obj2, jM55988V));
                    p0(obj, iM56008U, i);
                    break;
                }
                break;
            case Opcodes.V16 /* 60 */:
                m56006P(obj, obj2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
            case TypeReference.INSTANCEOF /* 67 */:
                if (m56002I(obj2, iM56008U, i)) {
                    z4i.m58710V(obj, jM55988V, z4i.m58695G(obj2, jM55988V));
                    p0(obj, iM56008U, i);
                    break;
                }
                break;
            case TypeReference.NEW /* 68 */:
                m56006P(obj, obj2, i);
                break;
        }
    }

    /* renamed from: U */
    public final int m56008U(int i) {
        return this.f53506a[i];
    }

    @Override // p001o.n5f
    /* renamed from: a */
    public void mo40122a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f53506a.length; i += 3) {
            m56007Q(obj, obj2, i);
        }
        y5f.m57248G(this.f53520o, obj, obj2);
        if (this.f53511f) {
            y5f.m57246E(this.f53521p, obj, obj2);
        }
    }

    @Override // p001o.n5f
    /* renamed from: b */
    public void mo40123b(Object obj) {
        int i;
        int i2 = this.f53516k;
        while (true) {
            i = this.f53517l;
            if (i2 >= i) {
                break;
            }
            long jM55988V = m55988V(s0(this.f53515j[i2]));
            Object objM58695G = z4i.m58695G(obj, jM55988V);
            if (objM58695G != null) {
                z4i.m58710V(obj, jM55988V, this.f53522q.mo45811f(objM58695G));
            }
            i2++;
        }
        int length = this.f53515j.length;
        while (i < length) {
            this.f53519n.mo43521c(obj, this.f53515j[i]);
            i++;
        }
        this.f53520o.mo33251j(obj);
        if (this.f53511f) {
            this.f53521p.mo47059f(obj);
        }
    }

    public final int b0(Object obj, byte[] bArr, int i, int i2, int i3, long j, no0.C15617b c15617b) {
        Unsafe unsafe = f53505s;
        Object objM56016u = m56016u(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f53522q.mo45813h(object)) {
            Object objMo45809d = this.f53522q.mo45809d(objM56016u);
            this.f53522q.mo45806a(objMo45809d, object);
            unsafe.putObject(obj, j, objMo45809d);
            object = objMo45809d;
        }
        return m56010m(bArr, i, i2, this.f53522q.mo45807b(objM56016u), this.f53522q.mo45808c(object), c15617b);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // p001o.n5f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo40124c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f53516k) {
            int i6 = this.f53515j[i5];
            int iM56008U = m56008U(i6);
            int iS0 = s0(i6);
            int i7 = this.f53506a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f53505s.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (m55982J(iS0) && !m55998D(obj, i6, i, i2, i9)) {
                return false;
            }
            int iR0 = r0(iS0);
            if (iR0 == 9 || iR0 == 17) {
                if (m55998D(obj, i6, i, i2, i9) && !m55981E(obj, iS0, m56017v(i6))) {
                    return false;
                }
            } else if (iR0 == 27) {
                if (!m55999F(obj, iS0, i6)) {
                    return false;
                }
            } else if (iR0 == 60 || iR0 == 68) {
                if (m56002I(obj, iM56008U, i6) && !m55981E(obj, iS0, m56017v(i6))) {
                    return false;
                }
            } else if (iR0 != 49) {
                if (iR0 == 50 && !m56000G(obj, iS0, i6)) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.f53511f || this.f53521p.mo47056c(obj).m27508p();
    }

    public final int c0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, no0.C15617b c15617b) throws ct8 {
        Unsafe unsafe = f53505s;
        long j2 = this.f53506a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(no0.m40834d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(no0.m40842l(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iM40828L = no0.m40828L(bArr, i, c15617b);
                    unsafe.putObject(obj, j, Long.valueOf(c15617b.f37087b));
                    unsafe.putInt(obj, j2, i4);
                    return iM40828L;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int iM40825I = no0.m40825I(bArr, i, c15617b);
                    unsafe.putObject(obj, j, Integer.valueOf(c15617b.f37086a));
                    unsafe.putInt(obj, j2, i4);
                    return iM40825I;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(no0.m40840j(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(no0.m40838h(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int iM40828L2 = no0.m40828L(bArr, i, c15617b);
                    unsafe.putObject(obj, j, Boolean.valueOf(c15617b.f37087b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iM40828L2;
                }
                break;
            case Opcodes.V15 /* 59 */:
                if (i5 == 2) {
                    int iM40825I2 = no0.m40825I(bArr, i, c15617b);
                    int i13 = c15617b.f37086a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !jqi.m34303t(bArr, iM40825I2, iM40825I2 + i13)) {
                            throw ct8.m21766d();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iM40825I2, i13, yn8.f55724a));
                        iM40825I2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM40825I2;
                }
                break;
            case Opcodes.V16 /* 60 */:
                if (i5 == 2) {
                    int iM40846p = no0.m40846p(m56017v(i8), bArr, i, i2, c15617b);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, c15617b.f37088c);
                    } else {
                        unsafe.putObject(obj, j, yn8.m58019h(object, c15617b.f37088c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM40846p;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int iM40832b = no0.m40832b(bArr, i, c15617b);
                    unsafe.putObject(obj, j, c15617b.f37088c);
                    unsafe.putInt(obj, j2, i4);
                    return iM40832b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int iM40825I3 = no0.m40825I(bArr, i, c15617b);
                    int i14 = c15617b.f37086a;
                    yn8.InterfaceC18441e interfaceC18441eM56015t = m56015t(i8);
                    if (interfaceC18441eM56015t == null || interfaceC18441eM56015t.isInRange(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        m55996w(obj).m36580q(i3, Long.valueOf(i14));
                    }
                    return iM40825I3;
                }
                break;
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                if (i5 == 0) {
                    int iM40825I4 = no0.m40825I(bArr, i, c15617b);
                    unsafe.putObject(obj, j, Integer.valueOf(jf3.m33681b(c15617b.f37086a)));
                    unsafe.putInt(obj, j2, i4);
                    return iM40825I4;
                }
                break;
            case TypeReference.INSTANCEOF /* 67 */:
                if (i5 == 0) {
                    int iM40828L3 = no0.m40828L(bArr, i, c15617b);
                    unsafe.putObject(obj, j, Long.valueOf(jf3.m33682c(c15617b.f37087b)));
                    unsafe.putInt(obj, j2, i4);
                    return iM40828L3;
                }
                break;
            case TypeReference.NEW /* 68 */:
                if (i5 == 3) {
                    int iM40844n = no0.m40844n(m56017v(i8), bArr, i, i2, (i3 & (-8)) | 4, c15617b);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, c15617b.f37088c);
                    } else {
                        unsafe.putObject(obj, j, yn8.m58019h(object2, c15617b.f37088c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM40844n;
                }
                break;
        }
        return i;
    }

    @Override // p001o.n5f
    /* renamed from: d */
    public int mo40125d(Object obj) {
        return this.f53513h ? m56019y(obj) : m56018x(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008d. Please report as an issue. */
    public int d0(Object obj, byte[] bArr, int i, int i2, int i3, no0.C15617b c15617b) {
        Unsafe unsafe;
        int i4;
        xcb xcbVar;
        int i5;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj3;
        Object obj4;
        int i15;
        Object obj5;
        int i16;
        int i17;
        xcb xcbVar2 = this;
        Object obj6 = obj;
        byte[] bArr2 = bArr;
        int i18 = i2;
        int i19 = i3;
        no0.C15617b c15617b2 = c15617b;
        Unsafe unsafe2 = f53505s;
        int iM40823G = i;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 1048575;
        while (true) {
            if (iM40823G < i18) {
                int i25 = iM40823G + 1;
                byte b = bArr2[iM40823G];
                if (b < 0) {
                    int iM40824H = no0.m40824H(b, bArr2, i25, c15617b2);
                    i6 = c15617b2.f37086a;
                    i25 = iM40824H;
                } else {
                    i6 = b;
                }
                int i26 = i6 >>> 3;
                int i27 = i6 & 7;
                int iH0 = i26 > i23 ? xcbVar2.h0(i26, i20 / 3) : xcbVar2.g0(i26);
                if (iH0 == -1) {
                    i7 = i26;
                    i8 = i25;
                    i9 = i6;
                    i10 = i22;
                    i11 = i24;
                    unsafe = unsafe2;
                    i4 = i19;
                    i12 = 0;
                } else {
                    int i28 = xcbVar2.f53506a[iH0 + 1];
                    int iR0 = r0(i28);
                    long jM55988V = m55988V(i28);
                    int i29 = i6;
                    if (iR0 <= 17) {
                        int i30 = xcbVar2.f53506a[iH0 + 2];
                        int i31 = 1 << (i30 >>> 20);
                        int i32 = i30 & 1048575;
                        if (i32 != i24) {
                            if (i24 != 1048575) {
                                unsafe2.putInt(obj6, i24, i22);
                            }
                            i22 = unsafe2.getInt(obj6, i32);
                            i11 = i32;
                        } else {
                            i11 = i24;
                        }
                        int i33 = i22;
                        switch (iR0) {
                            case 0:
                                obj3 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 1) {
                                    z4i.m58706R(obj3, jM55988V, no0.m40834d(bArr2, i25));
                                    iM40823G = i25 + 8;
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    obj6 = obj3;
                                    i20 = i13;
                                    i21 = i14;
                                    i23 = i7;
                                    i24 = i11;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 1:
                                obj3 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 5) {
                                    z4i.m58707S(obj3, jM55988V, no0.m40842l(bArr2, i25));
                                    iM40823G = i25 + 4;
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    obj6 = obj3;
                                    i20 = i13;
                                    i21 = i14;
                                    i23 = i7;
                                    i24 = i11;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 2:
                            case 3:
                                Object obj7 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 0) {
                                    int iM40828L = no0.m40828L(bArr2, i25, c15617b2);
                                    obj4 = obj7;
                                    unsafe2.putLong(obj, jM55988V, c15617b2.f37087b);
                                    i22 = i33 | i31;
                                    i20 = i13;
                                    iM40823G = iM40828L;
                                    i21 = i14;
                                    obj6 = obj4;
                                    i23 = i7;
                                    i24 = i11;
                                    i18 = i2;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 4:
                            case 11:
                                obj3 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 0) {
                                    iM40823G = no0.m40825I(bArr2, i25, c15617b2);
                                    unsafe2.putInt(obj3, jM55988V, c15617b2.f37086a);
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    obj6 = obj3;
                                    i20 = i13;
                                    i21 = i14;
                                    i23 = i7;
                                    i24 = i11;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 5:
                            case 14:
                                Object obj8 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 1) {
                                    obj4 = obj8;
                                    unsafe2.putLong(obj, jM55988V, no0.m40840j(bArr2, i25));
                                    iM40823G = i25 + 8;
                                    i22 = i33 | i31;
                                    i20 = i13;
                                    i21 = i14;
                                    obj6 = obj4;
                                    i23 = i7;
                                    i24 = i11;
                                    i18 = i2;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = i2;
                                obj5 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 5) {
                                    unsafe2.putInt(obj5, jM55988V, no0.m40838h(bArr2, i25));
                                    iM40823G = i25 + 4;
                                    int i34 = i33 | i31;
                                    obj6 = obj5;
                                    i18 = i15;
                                    i20 = i13;
                                    i21 = i14;
                                    i24 = i11;
                                    i19 = i3;
                                    i22 = i34;
                                    i23 = i7;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 7:
                                i15 = i2;
                                obj5 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 0) {
                                    iM40823G = no0.m40828L(bArr2, i25, c15617b2);
                                    z4i.m58700L(obj5, jM55988V, c15617b2.f37087b != 0);
                                    int i342 = i33 | i31;
                                    obj6 = obj5;
                                    i18 = i15;
                                    i20 = i13;
                                    i21 = i14;
                                    i24 = i11;
                                    i19 = i3;
                                    i22 = i342;
                                    i23 = i7;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 8:
                                i15 = i2;
                                obj5 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                bArr2 = bArr;
                                i14 = i29;
                                if (i27 == 2) {
                                    iM40823G = (i28 & 536870912) == 0 ? no0.m40819C(bArr2, i25, c15617b2) : no0.m40822F(bArr2, i25, c15617b2);
                                    unsafe2.putObject(obj5, jM55988V, c15617b2.f37088c);
                                    int i3422 = i33 | i31;
                                    obj6 = obj5;
                                    i18 = i15;
                                    i20 = i13;
                                    i21 = i14;
                                    i24 = i11;
                                    i19 = i3;
                                    i22 = i3422;
                                    i23 = i7;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 9:
                                obj5 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                i14 = i29;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    i15 = i2;
                                    iM40823G = no0.m40846p(xcbVar2.m56017v(i13), bArr2, i25, i15, c15617b2);
                                    if ((i33 & i31) == 0) {
                                        unsafe2.putObject(obj5, jM55988V, c15617b2.f37088c);
                                    } else {
                                        unsafe2.putObject(obj5, jM55988V, yn8.m58019h(unsafe2.getObject(obj5, jM55988V), c15617b2.f37088c));
                                    }
                                    int i34222 = i33 | i31;
                                    obj6 = obj5;
                                    i18 = i15;
                                    i20 = i13;
                                    i21 = i14;
                                    i24 = i11;
                                    i19 = i3;
                                    i22 = i34222;
                                    i23 = i7;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 10:
                                obj3 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                i14 = i29;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    iM40823G = no0.m40832b(bArr2, i25, c15617b2);
                                    unsafe2.putObject(obj3, jM55988V, c15617b2.f37088c);
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    obj6 = obj3;
                                    i20 = i13;
                                    i21 = i14;
                                    i23 = i7;
                                    i24 = i11;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 12:
                                obj3 = obj6;
                                i13 = iH0;
                                i7 = i26;
                                i14 = i29;
                                bArr2 = bArr;
                                if (i27 != 0) {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                } else {
                                    iM40823G = no0.m40825I(bArr2, i25, c15617b2);
                                    int i35 = c15617b2.f37086a;
                                    yn8.InterfaceC18441e interfaceC18441eM56015t = xcbVar2.m56015t(i13);
                                    if (interfaceC18441eM56015t == null || interfaceC18441eM56015t.isInRange(i35)) {
                                        unsafe2.putInt(obj3, jM55988V, i35);
                                        i22 = i33 | i31;
                                        i18 = i2;
                                        obj6 = obj3;
                                        i20 = i13;
                                        i21 = i14;
                                        i23 = i7;
                                        i24 = i11;
                                        i19 = i3;
                                        break;
                                    } else {
                                        m55996w(obj).m36580q(i14, Long.valueOf(i35));
                                        i18 = i2;
                                        obj6 = obj3;
                                        i22 = i33;
                                        i20 = i13;
                                        i21 = i14;
                                        i23 = i7;
                                        i24 = i11;
                                        i19 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i13 = iH0;
                                i14 = i29;
                                bArr2 = bArr;
                                i7 = i26;
                                if (i27 == 0) {
                                    iM40823G = no0.m40825I(bArr2, i25, c15617b2);
                                    obj3 = obj;
                                    unsafe2.putInt(obj3, jM55988V, jf3.m33681b(c15617b2.f37086a));
                                    i22 = i33 | i31;
                                    i18 = i2;
                                    obj6 = obj3;
                                    i20 = i13;
                                    i21 = i14;
                                    i23 = i7;
                                    i24 = i11;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 16:
                                i13 = iH0;
                                i7 = i26;
                                if (i27 == 0) {
                                    bArr2 = bArr;
                                    int iM40828L2 = no0.m40828L(bArr2, i25, c15617b2);
                                    i14 = i29;
                                    unsafe2.putLong(obj, jM55988V, jf3.m33682c(c15617b2.f37087b));
                                    i22 = i33 | i31;
                                    obj6 = obj;
                                    i18 = i2;
                                    i20 = i13;
                                    iM40823G = iM40828L2;
                                    i21 = i14;
                                    i23 = i7;
                                    i24 = i11;
                                    i19 = i3;
                                    break;
                                } else {
                                    i14 = i29;
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            case 17:
                                if (i27 == 3) {
                                    iM40823G = no0.m40844n(xcbVar2.m56017v(iH0), bArr, i25, i2, (i26 << 3) | 4, c15617b);
                                    if ((i33 & i31) == 0) {
                                        unsafe2.putObject(obj6, jM55988V, c15617b2.f37088c);
                                    } else {
                                        unsafe2.putObject(obj6, jM55988V, yn8.m58019h(unsafe2.getObject(obj6, jM55988V), c15617b2.f37088c));
                                    }
                                    i22 = i33 | i31;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i3;
                                    i20 = iH0;
                                    i21 = i29;
                                    i23 = i26;
                                    i24 = i11;
                                    break;
                                } else {
                                    i13 = iH0;
                                    i7 = i26;
                                    i14 = i29;
                                    i4 = i3;
                                    i8 = i25;
                                    i10 = i33;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    break;
                                }
                            default:
                                i13 = iH0;
                                i14 = i29;
                                i7 = i26;
                                i4 = i3;
                                i8 = i25;
                                i10 = i33;
                                i12 = i13;
                                unsafe = unsafe2;
                                i9 = i14;
                                break;
                        }
                    } else {
                        i7 = i26;
                        Object obj9 = obj6;
                        bArr2 = bArr;
                        if (iR0 != 27) {
                            i12 = iH0;
                            i10 = i22;
                            i11 = i24;
                            if (iR0 <= 49) {
                                int i36 = i25;
                                unsafe = unsafe2;
                                i17 = i29;
                                iM40823G = f0(obj, bArr, i25, i2, i29, i7, i27, i12, i28, iR0, jM55988V, c15617b);
                                if (iM40823G != i36) {
                                    xcbVar2 = this;
                                    obj6 = obj;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i3;
                                    c15617b2 = c15617b;
                                    i23 = i7;
                                    i21 = i17;
                                    i20 = i12;
                                    i22 = i10;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i8 = iM40823G;
                                    i9 = i17;
                                }
                            } else {
                                i16 = i25;
                                unsafe = unsafe2;
                                i17 = i29;
                                if (iR0 != 50) {
                                    iM40823G = c0(obj, bArr, i16, i2, i17, i7, i27, i28, iR0, jM55988V, i12, c15617b);
                                    if (iM40823G != i16) {
                                        xcbVar2 = this;
                                        obj6 = obj;
                                        bArr2 = bArr;
                                        i18 = i2;
                                        i19 = i3;
                                        c15617b2 = c15617b;
                                        i23 = i7;
                                        i21 = i17;
                                        i20 = i12;
                                        i22 = i10;
                                        i24 = i11;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i8 = iM40823G;
                                        i9 = i17;
                                    }
                                } else if (i27 == 2) {
                                    iM40823G = b0(obj, bArr, i16, i2, i12, jM55988V, c15617b);
                                    if (iM40823G != i16) {
                                        xcbVar2 = this;
                                        obj6 = obj;
                                        bArr2 = bArr;
                                        i18 = i2;
                                        i19 = i3;
                                        c15617b2 = c15617b;
                                        i23 = i7;
                                        i21 = i17;
                                        i20 = i12;
                                        i22 = i10;
                                        i24 = i11;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i8 = iM40823G;
                                        i9 = i17;
                                    }
                                }
                            }
                        } else if (i27 == 2) {
                            yn8.InterfaceC18446j interfaceC18446jMo17923a = (yn8.InterfaceC18446j) unsafe2.getObject(obj9, jM55988V);
                            if (!interfaceC18446jMo17923a.mo28212k()) {
                                int size = interfaceC18446jMo17923a.size();
                                interfaceC18446jMo17923a = interfaceC18446jMo17923a.mo17923a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj9, jM55988V, interfaceC18446jMo17923a);
                            }
                            i11 = i24;
                            iM40823G = no0.m40847q(xcbVar2.m56017v(iH0), i29, bArr, i25, i2, interfaceC18446jMo17923a, c15617b);
                            obj6 = obj;
                            i18 = i2;
                            i21 = i29;
                            i23 = i7;
                            i20 = iH0;
                            i22 = i22;
                            i24 = i11;
                            i19 = i3;
                        } else {
                            i12 = iH0;
                            i10 = i22;
                            i11 = i24;
                            i16 = i25;
                            unsafe = unsafe2;
                            i17 = i29;
                        }
                        i4 = i3;
                        i8 = i16;
                        i9 = i17;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    iM40823G = (!this.f53511f || c15617b.f37089d == qp6.m45750c()) ? no0.m40823G(i9, bArr, i8, i2, m55996w(obj), c15617b) : no0.m40837g(i9, bArr, i8, i2, obj, this.f53510e, this.f53520o, c15617b);
                    obj6 = obj;
                    bArr2 = bArr;
                    i18 = i2;
                    i21 = i9;
                    xcbVar2 = this;
                    c15617b2 = c15617b;
                    i23 = i7;
                    i20 = i12;
                    i22 = i10;
                    i24 = i11;
                    unsafe2 = unsafe;
                    i19 = i4;
                } else {
                    i5 = 1048575;
                    xcbVar = this;
                    iM40823G = i8;
                    i21 = i9;
                    i22 = i10;
                    i24 = i11;
                }
            } else {
                unsafe = unsafe2;
                i4 = i19;
                xcbVar = xcbVar2;
                i5 = 1048575;
            }
        }
        if (i24 != i5) {
            obj2 = obj;
            unsafe.putInt(obj2, i24, i22);
        } else {
            obj2 = obj;
        }
        l4i l4iVar = null;
        for (int i37 = xcbVar.f53516k; i37 < xcbVar.f53517l; i37++) {
            l4iVar = (l4i) xcbVar.m56013q(obj2, xcbVar.f53515j[i37], l4iVar, xcbVar.f53520o);
        }
        if (l4iVar != null) {
            xcbVar.f53520o.mo33256o(obj2, l4iVar);
        }
        if (i4 == 0) {
            if (iM40823G != i2) {
                throw ct8.m21770h();
            }
        } else if (iM40823G > i2 || i21 != i4) {
            throw ct8.m21770h();
        }
        return iM40823G;
    }

    @Override // p001o.n5f
    /* renamed from: e */
    public Object mo40126e() {
        return this.f53518m.mo37898a(this.f53510e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x029a, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x029c, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r19;
        r6 = r23;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02df, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0302, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0305, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0085. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e0(Object obj, byte[] bArr, int i, int i2, no0.C15617b c15617b) throws ct8 {
        int i3;
        int iM40824H;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int iM40828L;
        int iM40846p;
        int i10;
        int i11;
        int i12;
        xcb xcbVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        no0.C15617b c15617b2 = c15617b;
        Unsafe unsafe2 = f53505s;
        int i14 = -1;
        int iM40823G = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iM40823G < i13) {
            int i19 = iM40823G + 1;
            byte b = bArr2[iM40823G];
            if (b < 0) {
                iM40824H = no0.m40824H(b, bArr2, i19, c15617b2);
                i3 = c15617b2.f37086a;
            } else {
                i3 = b;
                iM40824H = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            int iH0 = i20 > i15 ? xcbVar.h0(i20, i16 / 3) : xcbVar.g0(i20);
            if (iH0 == i14) {
                i4 = iM40824H;
                i5 = i20;
                i6 = i14;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i22 = xcbVar.f53506a[iH0 + 1];
                int iR0 = r0(i22);
                long jM55988V = m55988V(i22);
                if (iR0 <= 17) {
                    int i23 = xcbVar.f53506a[iH0 + 2];
                    int i24 = 1 << (i23 >>> 20);
                    int i25 = 1048575;
                    int i26 = i23 & 1048575;
                    if (i26 != i18) {
                        if (i18 != 1048575) {
                            unsafe2.putInt(obj2, i18, i17);
                            i25 = 1048575;
                        }
                        if (i26 != i25) {
                            i17 = unsafe2.getInt(obj2, i26);
                        }
                        i18 = i26;
                    }
                    switch (iR0) {
                        case 0:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            i9 = i17;
                            if (i21 != 1) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                z4i.m58706R(obj2, jM55988V, no0.m40834d(bArr2, iM40824H));
                                iM40823G = iM40824H + 8;
                                i17 = i9 | i24;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 1:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i9 = i17;
                            i8 = iH0;
                            if (i21 != 5) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                z4i.m58707S(obj2, jM55988V, no0.m40842l(bArr2, iM40824H));
                                iM40823G = iM40824H + 4;
                                i17 = i9 | i24;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            i9 = i17;
                            if (i21 != 0) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM40828L = no0.m40828L(bArr2, iM40824H, c15617b2);
                                unsafe2.putLong(obj, jM55988V, c15617b2.f37087b);
                                i17 = i9 | i24;
                                i16 = i8;
                                iM40823G = iM40828L;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            i9 = i17;
                            if (i21 != 0) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM40823G = no0.m40825I(bArr2, iM40824H, c15617b2);
                                unsafe2.putInt(obj2, jM55988V, c15617b2.f37086a);
                                i17 = i9 | i24;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            i9 = i17;
                            if (i21 != 1) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putLong(obj, jM55988V, no0.m40840j(bArr2, iM40824H));
                                iM40823G = iM40824H + 8;
                                i17 = i9 | i24;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i9 = i17;
                            i8 = iH0;
                            if (i21 != 5) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, jM55988V, no0.m40838h(bArr2, iM40824H));
                                iM40823G = iM40824H + 4;
                                i17 = i9 | i24;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 7:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            boolean z = true;
                            i9 = i17;
                            if (i21 != 0) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                int iM40828L2 = no0.m40828L(bArr2, iM40824H, c15617b2);
                                if (c15617b2.f37087b == 0) {
                                    z = false;
                                }
                                z4i.m58700L(obj2, jM55988V, z);
                                i17 = i9 | i24;
                                iM40823G = iM40828L2;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 8:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            i9 = i17;
                            if (i21 != 2) {
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM40823G = (536870912 & i22) == 0 ? no0.m40819C(bArr2, iM40824H, c15617b2) : no0.m40822F(bArr2, iM40824H, c15617b2);
                                unsafe2.putObject(obj2, jM55988V, c15617b2.f37088c);
                                i17 = i9 | i24;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 9:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            if (i21 != 2) {
                                i9 = i17;
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM40846p = no0.m40846p(xcbVar.m56017v(i8), bArr2, iM40824H, i13, c15617b2);
                                Object object = unsafe2.getObject(obj2, jM55988V);
                                if (object == null) {
                                    unsafe2.putObject(obj2, jM55988V, c15617b2.f37088c);
                                } else {
                                    unsafe2.putObject(obj2, jM55988V, yn8.m58019h(object, c15617b2.f37088c));
                                }
                                i17 |= i24;
                                iM40823G = iM40846p;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 10:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            if (i21 != 2) {
                                i9 = i17;
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM40846p = no0.m40832b(bArr2, iM40824H, c15617b2);
                                unsafe2.putObject(obj2, jM55988V, c15617b2.f37088c);
                                i17 |= i24;
                                iM40823G = iM40846p;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 12:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            if (i21 != 0) {
                                i9 = i17;
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM40846p = no0.m40825I(bArr2, iM40824H, c15617b2);
                                unsafe2.putInt(obj2, jM55988V, c15617b2.f37086a);
                                i17 |= i24;
                                iM40823G = iM40846p;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 15:
                            i5 = i20;
                            c15617b2 = c15617b;
                            i8 = iH0;
                            if (i21 != 0) {
                                i9 = i17;
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                iM40823G = no0.m40825I(bArr2, iM40824H, c15617b2);
                                unsafe2.putInt(obj2, jM55988V, jf3.m33681b(c15617b2.f37086a));
                                i17 |= i24;
                                i16 = i8;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        case 16:
                            if (i21 != 0) {
                                i5 = i20;
                                i8 = iH0;
                                i9 = i17;
                                i17 = i9;
                                i4 = iM40824H;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                c15617b2 = c15617b;
                                iM40828L = no0.m40828L(bArr2, iM40824H, c15617b2);
                                i8 = iH0;
                                i5 = i20;
                                unsafe2.putLong(obj, jM55988V, jf3.m33682c(c15617b2.f37087b));
                                i17 |= i24;
                                i16 = i8;
                                iM40823G = iM40828L;
                                i15 = i5;
                                i14 = -1;
                                break;
                            }
                        default:
                            i5 = i20;
                            i8 = iH0;
                            i9 = i17;
                            i17 = i9;
                            i4 = iM40824H;
                            i7 = i8;
                            unsafe = unsafe2;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i20;
                    int i27 = i17;
                    c15617b2 = c15617b;
                    if (iR0 == 27) {
                        if (i21 == 2) {
                            yn8.InterfaceC18446j interfaceC18446jMo17923a = (yn8.InterfaceC18446j) unsafe2.getObject(obj2, jM55988V);
                            if (!interfaceC18446jMo17923a.mo28212k()) {
                                int size = interfaceC18446jMo17923a.size();
                                interfaceC18446jMo17923a = interfaceC18446jMo17923a.mo17923a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj2, jM55988V, interfaceC18446jMo17923a);
                            }
                            iM40823G = no0.m40847q(xcbVar.m56017v(iH0), i3, bArr, iM40824H, i2, interfaceC18446jMo17923a, c15617b);
                            i16 = iH0;
                            i17 = i27;
                            i15 = i5;
                            i14 = -1;
                            xcbVar = this;
                        } else {
                            i12 = iM40824H;
                            i10 = i18;
                            i7 = iH0;
                            unsafe = unsafe2;
                            i11 = i27;
                            i6 = -1;
                        }
                    } else if (iR0 <= 49) {
                        i11 = i27;
                        int i28 = iM40824H;
                        i10 = i18;
                        i7 = iH0;
                        i6 = -1;
                        unsafe = unsafe2;
                        iM40823G = f0(obj, bArr, iM40824H, i2, i3, i5, i21, iH0, i22, iR0, jM55988V, c15617b);
                    } else {
                        i10 = i18;
                        i7 = iH0;
                        unsafe = unsafe2;
                        i11 = i27;
                        i6 = -1;
                        i12 = iM40824H;
                        if (iR0 != 50) {
                            iM40823G = c0(obj, bArr, i12, i2, i3, i5, i21, i22, iR0, jM55988V, i7, c15617b);
                        } else if (i21 == 2) {
                            iM40823G = b0(obj, bArr, i12, i2, i7, jM55988V, c15617b);
                        }
                    }
                    i4 = i12;
                    i17 = i11;
                    i18 = i10;
                }
                i14 = i6;
                unsafe2 = unsafe;
            }
            iM40823G = no0.m40823G(i3, bArr, i4, i2, m55996w(obj), c15617b);
            xcbVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            c15617b2 = c15617b;
            i15 = i5;
            i16 = i7;
            i14 = i6;
            unsafe2 = unsafe;
        }
        int i29 = i17;
        Unsafe unsafe3 = unsafe2;
        if (i18 != 1048575) {
            unsafe3.putInt(obj, i18, i29);
        }
        if (iM40823G == i2) {
            return iM40823G;
        }
        throw ct8.m21770h();
    }

    @Override // p001o.n5f
    /* renamed from: f */
    public int mo40127f(Object obj) {
        int i;
        int iM58017f;
        int length = this.f53506a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iS0 = s0(i3);
            int iM56008U = m56008U(i3);
            long jM55988V = m55988V(iS0);
            int iHashCode = 37;
            switch (r0(iS0)) {
                case 0:
                    i = i2 * 53;
                    iM58017f = yn8.m58017f(Double.doubleToLongBits(z4i.m58689A(obj, jM55988V)));
                    i2 = i + iM58017f;
                    break;
                case 1:
                    i = i2 * 53;
                    iM58017f = Float.floatToIntBits(z4i.m58690B(obj, jM55988V));
                    i2 = i + iM58017f;
                    break;
                case 2:
                    i = i2 * 53;
                    iM58017f = yn8.m58017f(z4i.m58693E(obj, jM55988V));
                    i2 = i + iM58017f;
                    break;
                case 3:
                    i = i2 * 53;
                    iM58017f = yn8.m58017f(z4i.m58693E(obj, jM55988V));
                    i2 = i + iM58017f;
                    break;
                case 4:
                    i = i2 * 53;
                    iM58017f = z4i.m58691C(obj, jM55988V);
                    i2 = i + iM58017f;
                    break;
                case 5:
                    i = i2 * 53;
                    iM58017f = yn8.m58017f(z4i.m58693E(obj, jM55988V));
                    i2 = i + iM58017f;
                    break;
                case 6:
                    i = i2 * 53;
                    iM58017f = z4i.m58691C(obj, jM55988V);
                    i2 = i + iM58017f;
                    break;
                case 7:
                    i = i2 * 53;
                    iM58017f = yn8.m58014c(z4i.m58732t(obj, jM55988V));
                    i2 = i + iM58017f;
                    break;
                case 8:
                    i = i2 * 53;
                    iM58017f = ((String) z4i.m58695G(obj, jM55988V)).hashCode();
                    i2 = i + iM58017f;
                    break;
                case 9:
                    Object objM58695G = z4i.m58695G(obj, jM55988V);
                    if (objM58695G != null) {
                        iHashCode = objM58695G.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM58017f = z4i.m58695G(obj, jM55988V).hashCode();
                    i2 = i + iM58017f;
                    break;
                case 11:
                    i = i2 * 53;
                    iM58017f = z4i.m58691C(obj, jM55988V);
                    i2 = i + iM58017f;
                    break;
                case 12:
                    i = i2 * 53;
                    iM58017f = z4i.m58691C(obj, jM55988V);
                    i2 = i + iM58017f;
                    break;
                case 13:
                    i = i2 * 53;
                    iM58017f = z4i.m58691C(obj, jM55988V);
                    i2 = i + iM58017f;
                    break;
                case 14:
                    i = i2 * 53;
                    iM58017f = yn8.m58017f(z4i.m58693E(obj, jM55988V));
                    i2 = i + iM58017f;
                    break;
                case 15:
                    i = i2 * 53;
                    iM58017f = z4i.m58691C(obj, jM55988V);
                    i2 = i + iM58017f;
                    break;
                case 16:
                    i = i2 * 53;
                    iM58017f = yn8.m58017f(z4i.m58693E(obj, jM55988V));
                    i2 = i + iM58017f;
                    break;
                case 17:
                    Object objM58695G2 = z4i.m58695G(obj, jM55988V);
                    if (objM58695G2 != null) {
                        iHashCode = objM58695G2.hashCode();
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
                    iM58017f = z4i.m58695G(obj, jM55988V).hashCode();
                    i2 = i + iM58017f;
                    break;
                case 50:
                    i = i2 * 53;
                    iM58017f = z4i.m58695G(obj, jM55988V).hashCode();
                    i2 = i + iM58017f;
                    break;
                case 51:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = yn8.m58017f(Double.doubleToLongBits(m55990X(obj, jM55988V)));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = Float.floatToIntBits(m55991Y(obj, jM55988V));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = yn8.m58017f(a0(obj, jM55988V));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = yn8.m58017f(a0(obj, jM55988V));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = m55992Z(obj, jM55988V);
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = yn8.m58017f(a0(obj, jM55988V));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = m55992Z(obj, jM55988V);
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = yn8.m58014c(m55989W(obj, jM55988V));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = ((String) z4i.m58695G(obj, jM55988V)).hashCode();
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = z4i.m58695G(obj, jM55988V).hashCode();
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = z4i.m58695G(obj, jM55988V).hashCode();
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = m55992Z(obj, jM55988V);
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = m55992Z(obj, jM55988V);
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = m55992Z(obj, jM55988V);
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = yn8.m58017f(a0(obj, jM55988V));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = m55992Z(obj, jM55988V);
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = yn8.m58017f(a0(obj, jM55988V));
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m56002I(obj, iM56008U, i3)) {
                        i = i2 * 53;
                        iM58017f = z4i.m58695G(obj, jM55988V).hashCode();
                        i2 = i + iM58017f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.f53520o.mo33248g(obj).hashCode();
        return this.f53511f ? (iHashCode2 * 53) + this.f53521p.mo47056c(obj).hashCode() : iHashCode2;
    }

    public final int f0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, no0.C15617b c15617b) throws ct8 {
        int iM40826J;
        Unsafe unsafe = f53505s;
        yn8.InterfaceC18446j interfaceC18446jMo17923a = (yn8.InterfaceC18446j) unsafe.getObject(obj, j2);
        if (!interfaceC18446jMo17923a.mo28212k()) {
            int size = interfaceC18446jMo17923a.size();
            interfaceC18446jMo17923a = interfaceC18446jMo17923a.mo17923a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, interfaceC18446jMo17923a);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return no0.m40849s(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 1) {
                    return no0.m40835e(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 19:
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    return no0.m40852v(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 5) {
                    return no0.m40843m(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return no0.m40856z(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 0) {
                    return no0.m40829M(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 22:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case SignatureVisitor.EXTENDS /* 43 */:
                if (i5 == 2) {
                    return no0.m40855y(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 0) {
                    return no0.m40826J(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return no0.m40851u(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 1) {
                    return no0.m40841k(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 24:
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 45:
                if (i5 == 2) {
                    return no0.m40850t(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 5) {
                    return no0.m40839i(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 25:
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    return no0.m40848r(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 0) {
                    return no0.m40831a(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? no0.m40820D(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b) : no0.m40821E(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return no0.m40847q(m56017v(i6), i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (i5 == 2) {
                    return no0.m40833c(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 30:
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 == 2) {
                    iM40826J = no0.m40855y(bArr, i, interfaceC18446jMo17923a, c15617b);
                } else if (i5 == 0) {
                    iM40826J = no0.m40826J(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                wn7 wn7Var = (wn7) obj;
                l4i l4iVar = wn7Var.unknownFields;
                if (l4iVar == l4i.m36562c()) {
                    l4iVar = null;
                }
                l4i l4iVar2 = (l4i) y5f.m57242A(i4, interfaceC18446jMo17923a, m56015t(i6), l4iVar, this.f53520o);
                if (l4iVar2 != null) {
                    wn7Var.unknownFields = l4iVar2;
                }
                return iM40826J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return no0.m40853w(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 0) {
                    return no0.m40817A(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 48:
                if (i5 == 2) {
                    return no0.m40854x(bArr, i, interfaceC18446jMo17923a, c15617b);
                }
                if (i5 == 0) {
                    return no0.m40818B(i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return no0.m40845o(m56017v(i6), i3, bArr, i, i2, interfaceC18446jMo17923a, c15617b);
                }
                break;
        }
        return i;
    }

    @Override // p001o.n5f
    /* renamed from: g */
    public boolean mo40128g(Object obj, Object obj2) {
        int length = this.f53506a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m56012p(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.f53520o.mo33248g(obj).equals(this.f53520o.mo33248g(obj2))) {
            return false;
        }
        if (this.f53511f) {
            return this.f53521p.mo47056c(obj).equals(this.f53521p.mo47056c(obj2));
        }
        return true;
    }

    public final int g0(int i) {
        if (i < this.f53508c || i > this.f53509d) {
            return -1;
        }
        return q0(i, 0);
    }

    @Override // p001o.n5f
    /* renamed from: h */
    public void mo40129h(Object obj, mce mceVar, qp6 qp6Var) {
        qp6Var.getClass();
        m56003M(this.f53520o, this.f53521p, obj, mceVar, qp6Var);
    }

    public final int h0(int i, int i2) {
        if (i < this.f53508c || i > this.f53509d) {
            return -1;
        }
        return q0(i, i2);
    }

    @Override // p001o.n5f
    /* renamed from: i */
    public void mo40130i(Object obj, byte[] bArr, int i, int i2, no0.C15617b c15617b) throws ct8 {
        if (this.f53513h) {
            e0(obj, bArr, i, i2, c15617b);
        } else {
            d0(obj, bArr, i, i2, 0, c15617b);
        }
    }

    public final int i0(int i) {
        return this.f53506a[i + 2];
    }

    @Override // p001o.n5f
    /* renamed from: j */
    public void mo40131j(Object obj, cdj cdjVar) {
        if (cdjVar.mo21025t() == cdj.EnumC12647a.DESCENDING) {
            v0(obj, cdjVar);
        } else if (this.f53513h) {
            u0(obj, cdjVar);
        } else {
            t0(obj, cdjVar);
        }
    }

    public final void j0(Object obj, long j, mce mceVar, n5f n5fVar, qp6 qp6Var) {
        mceVar.mo35584O(this.f53519n.mo43523e(obj, j), n5fVar, qp6Var);
    }

    /* renamed from: k */
    public final boolean m56009k(Object obj, Object obj2, int i) {
        return m55997C(obj, i) == m55997C(obj2, i);
    }

    public final void k0(Object obj, int i, mce mceVar, n5f n5fVar, qp6 qp6Var) {
        mceVar.mo35583N(this.f53519n.mo43523e(obj, m55988V(i)), n5fVar, qp6Var);
    }

    public final void l0(Object obj, int i, mce mceVar) {
        if (m55980B(i)) {
            z4i.m58710V(obj, m55988V(i), mceVar.mo35577H());
        } else if (this.f53512g) {
            z4i.m58710V(obj, m55988V(i), mceVar.readString());
        } else {
            z4i.m58710V(obj, m55988V(i), mceVar.mo35607o());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* renamed from: m */
    public final int m56010m(byte[] bArr, int i, int i2, nra.C15645a c15645a, Map map, no0.C15617b c15617b) throws ct8 {
        int iM40824H;
        int iM40825I = no0.m40825I(bArr, i, c15617b);
        int i3 = c15617b.f37086a;
        if (i3 < 0 || i3 > i2 - iM40825I) {
            throw ct8.m21773m();
        }
        int i4 = iM40825I + i3;
        Object obj = c15645a.f37206b;
        Object obj2 = c15645a.f37208d;
        while (iM40825I < i4) {
            int i5 = iM40825I + 1;
            byte b = bArr[iM40825I];
            if (b < 0) {
                iM40824H = no0.m40824H(b, bArr, i5, c15617b);
                b = c15617b.f37086a;
            } else {
                iM40824H = i5;
            }
            int i6 = b >>> 3;
            int i7 = b & 7;
            if (i6 != 1) {
                if (i6 == 2 && i7 == c15645a.f37207c.getWireType()) {
                    iM40825I = m56011n(bArr, iM40824H, i2, c15645a.f37207c, c15645a.f37208d.getClass(), c15617b);
                    obj2 = c15617b.f37088c;
                } else {
                    iM40825I = no0.m40830N(b, bArr, iM40824H, i2, c15617b);
                }
            } else if (i7 == c15645a.f37205a.getWireType()) {
                iM40825I = m56011n(bArr, iM40824H, i2, c15645a.f37205a, null, c15617b);
                obj = c15617b.f37088c;
            } else {
                iM40825I = no0.m40830N(b, bArr, iM40824H, i2, c15617b);
            }
        }
        if (iM40825I != i4) {
            throw ct8.m21770h();
        }
        map.put(obj, obj2);
        return i4;
    }

    public final void m0(Object obj, int i, mce mceVar) {
        if (m55980B(i)) {
            mceVar.mo35606n(this.f53519n.mo43523e(obj, m55988V(i)));
        } else {
            mceVar.mo35570A(this.f53519n.mo43523e(obj, m55988V(i)));
        }
    }

    /* renamed from: n */
    public final int m56011n(byte[] bArr, int i, int i2, fbj.EnumC13396b enumC13396b, Class cls, no0.C15617b c15617b) {
        switch (C18113a.f53523a[enumC13396b.ordinal()]) {
            case 1:
                int iM40828L = no0.m40828L(bArr, i, c15617b);
                c15617b.f37088c = Boolean.valueOf(c15617b.f37087b != 0);
                return iM40828L;
            case 2:
                return no0.m40832b(bArr, i, c15617b);
            case 3:
                c15617b.f37088c = Double.valueOf(no0.m40834d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                c15617b.f37088c = Integer.valueOf(no0.m40838h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                c15617b.f37088c = Long.valueOf(no0.m40840j(bArr, i));
                return i + 8;
            case 8:
                c15617b.f37088c = Float.valueOf(no0.m40842l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iM40825I = no0.m40825I(bArr, i, c15617b);
                c15617b.f37088c = Integer.valueOf(c15617b.f37086a);
                return iM40825I;
            case 12:
            case 13:
                int iM40828L2 = no0.m40828L(bArr, i, c15617b);
                c15617b.f37088c = Long.valueOf(c15617b.f37087b);
                return iM40828L2;
            case 14:
                return no0.m40846p(v1e.m52231a().m52234d(cls), bArr, i, i2, c15617b);
            case 15:
                int iM40825I2 = no0.m40825I(bArr, i, c15617b);
                c15617b.f37088c = Integer.valueOf(jf3.m33681b(c15617b.f37086a));
                return iM40825I2;
            case 16:
                int iM40828L3 = no0.m40828L(bArr, i, c15617b);
                c15617b.f37088c = Long.valueOf(jf3.m33682c(c15617b.f37087b));
                return iM40828L3;
            case 17:
                return no0.m40822F(bArr, i, c15617b);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final void o0(Object obj, int i) {
        int iI0 = i0(i);
        long j = 1048575 & iI0;
        if (j == 1048575) {
            return;
        }
        z4i.m58708T(obj, j, (1 << (iI0 >>> 20)) | z4i.m58691C(obj, j));
    }

    /* renamed from: p */
    public final boolean m56012p(Object obj, Object obj2, int i) {
        int iS0 = s0(i);
        long jM55988V = m55988V(iS0);
        switch (r0(iS0)) {
            case 0:
                if (m56009k(obj, obj2, i) && Double.doubleToLongBits(z4i.m58689A(obj, jM55988V)) == Double.doubleToLongBits(z4i.m58689A(obj2, jM55988V))) {
                    break;
                }
                break;
            case 1:
                if (m56009k(obj, obj2, i) && Float.floatToIntBits(z4i.m58690B(obj, jM55988V)) == Float.floatToIntBits(z4i.m58690B(obj2, jM55988V))) {
                    break;
                }
                break;
            case 2:
                if (m56009k(obj, obj2, i) && z4i.m58693E(obj, jM55988V) == z4i.m58693E(obj2, jM55988V)) {
                    break;
                }
                break;
            case 3:
                if (m56009k(obj, obj2, i) && z4i.m58693E(obj, jM55988V) == z4i.m58693E(obj2, jM55988V)) {
                    break;
                }
                break;
            case 4:
                if (m56009k(obj, obj2, i) && z4i.m58691C(obj, jM55988V) == z4i.m58691C(obj2, jM55988V)) {
                    break;
                }
                break;
            case 5:
                if (m56009k(obj, obj2, i) && z4i.m58693E(obj, jM55988V) == z4i.m58693E(obj2, jM55988V)) {
                    break;
                }
                break;
            case 6:
                if (m56009k(obj, obj2, i) && z4i.m58691C(obj, jM55988V) == z4i.m58691C(obj2, jM55988V)) {
                    break;
                }
                break;
            case 7:
                if (m56009k(obj, obj2, i) && z4i.m58732t(obj, jM55988V) == z4i.m58732t(obj2, jM55988V)) {
                    break;
                }
                break;
            case 8:
                if (m56009k(obj, obj2, i) && y5f.m57252K(z4i.m58695G(obj, jM55988V), z4i.m58695G(obj2, jM55988V))) {
                    break;
                }
                break;
            case 9:
                if (m56009k(obj, obj2, i) && y5f.m57252K(z4i.m58695G(obj, jM55988V), z4i.m58695G(obj2, jM55988V))) {
                    break;
                }
                break;
            case 10:
                if (m56009k(obj, obj2, i) && y5f.m57252K(z4i.m58695G(obj, jM55988V), z4i.m58695G(obj2, jM55988V))) {
                    break;
                }
                break;
            case 11:
                if (m56009k(obj, obj2, i) && z4i.m58691C(obj, jM55988V) == z4i.m58691C(obj2, jM55988V)) {
                    break;
                }
                break;
            case 12:
                if (m56009k(obj, obj2, i) && z4i.m58691C(obj, jM55988V) == z4i.m58691C(obj2, jM55988V)) {
                    break;
                }
                break;
            case 13:
                if (m56009k(obj, obj2, i) && z4i.m58691C(obj, jM55988V) == z4i.m58691C(obj2, jM55988V)) {
                    break;
                }
                break;
            case 14:
                if (m56009k(obj, obj2, i) && z4i.m58693E(obj, jM55988V) == z4i.m58693E(obj2, jM55988V)) {
                    break;
                }
                break;
            case 15:
                if (m56009k(obj, obj2, i) && z4i.m58691C(obj, jM55988V) == z4i.m58691C(obj2, jM55988V)) {
                    break;
                }
                break;
            case 16:
                if (m56009k(obj, obj2, i) && z4i.m58693E(obj, jM55988V) == z4i.m58693E(obj2, jM55988V)) {
                    break;
                }
                break;
            case 17:
                if (m56009k(obj, obj2, i) && y5f.m57252K(z4i.m58695G(obj, jM55988V), z4i.m58695G(obj2, jM55988V))) {
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
                if (m56001H(obj, obj2, i) && y5f.m57252K(z4i.m58695G(obj, jM55988V), z4i.m58695G(obj2, jM55988V))) {
                    break;
                }
                break;
        }
        return true;
    }

    public final void p0(Object obj, int i, int i2) {
        z4i.m58708T(obj, i0(i2) & 1048575, i);
    }

    /* renamed from: q */
    public final Object m56013q(Object obj, int i, Object obj2, j4i j4iVar) {
        yn8.InterfaceC18441e interfaceC18441eM56015t;
        int iM56008U = m56008U(i);
        Object objM58695G = z4i.m58695G(obj, m55988V(s0(i)));
        return (objM58695G == null || (interfaceC18441eM56015t = m56015t(i)) == null) ? obj2 : m56014r(i, iM56008U, this.f53522q.mo45808c(objM58695G), interfaceC18441eM56015t, obj2, j4iVar);
    }

    public final int q0(int i, int i2) {
        int length = (this.f53506a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iM56008U = m56008U(i4);
            if (i == iM56008U) {
                return i4;
            }
            if (i < iM56008U) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final Object m56014r(int i, int i2, Map map, yn8.InterfaceC18441e interfaceC18441e, Object obj, j4i j4iVar) {
        nra.C15645a c15645aMo45807b = this.f53522q.mo45807b(m56016u(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!interfaceC18441e.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = j4iVar.mo33255n();
                }
                xq1.C18217h c18217hM56577A = xq1.m56577A(nra.m41004b(c15645aMo45807b, entry.getKey(), entry.getValue()));
                try {
                    nra.m41006e(c18217hM56577A.m56602b(), c15645aMo45807b, entry.getKey(), entry.getValue());
                    j4iVar.mo33245d(obj, i2, c18217hM56577A.m56601a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    public final int s0(int i) {
        return this.f53506a[i + 1];
    }

    /* renamed from: t */
    public final yn8.InterfaceC18441e m56015t(int i) {
        return (yn8.InterfaceC18441e) this.f53507b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(Object obj, cdj cdjVar) {
        Iterator itM27509s;
        Map.Entry entry;
        int i;
        if (this.f53511f) {
            fu6 fu6VarMo47056c = this.f53521p.mo47056c(obj);
            if (fu6VarMo47056c.m27506n()) {
                itM27509s = null;
                entry = null;
            } else {
                itM27509s = fu6VarMo47056c.m27509s();
                entry = (Map.Entry) itM27509s.next();
            }
        }
        int length = this.f53506a.length;
        Unsafe unsafe = f53505s;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iS0 = s0(i4);
            int iM56008U = m56008U(i4);
            int iR0 = r0(iS0);
            if (iR0 <= 17) {
                int i6 = this.f53506a[i4 + 2];
                int i7 = i6 & i2;
                if (i7 != i3) {
                    i5 = unsafe.getInt(obj, i7);
                    i3 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && this.f53521p.mo47054a(entry) <= iM56008U) {
                this.f53521p.mo47063j(cdjVar, entry);
                entry = itM27509s.hasNext() ? (Map.Entry) itM27509s.next() : null;
            }
            long jM55988V = m55988V(iS0);
            switch (iR0) {
                case 0:
                    if ((i & i5) != 0) {
                        cdjVar.mo21021p(iM56008U, m55994o(obj, jM55988V));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i & i5) != 0) {
                        cdjVar.mo20992B(iM56008U, m55995s(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i & i5) != 0) {
                        cdjVar.mo21026u(iM56008U, unsafe.getLong(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i & i5) != 0) {
                        cdjVar.mo21011f(iM56008U, unsafe.getLong(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i & i5) != 0) {
                        cdjVar.mo21013h(iM56008U, unsafe.getInt(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 5:
                    if ((i & i5) != 0) {
                        cdjVar.mo21024s(iM56008U, unsafe.getLong(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 6:
                    if ((i & i5) != 0) {
                        cdjVar.mo21008c(iM56008U, unsafe.getInt(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 7:
                    if ((i & i5) != 0) {
                        cdjVar.mo21027v(iM56008U, m55993l(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 8:
                    if ((i & i5) != 0) {
                        x0(iM56008U, unsafe.getObject(obj, jM55988V), cdjVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i & i5) != 0) {
                        cdjVar.mo21002L(iM56008U, unsafe.getObject(obj, jM55988V), m56017v(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i & i5) != 0) {
                        cdjVar.mo21003M(iM56008U, (xq1) unsafe.getObject(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 11:
                    if ((i & i5) != 0) {
                        cdjVar.mo21020o(iM56008U, unsafe.getInt(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i & i5) != 0) {
                        cdjVar.mo20995E(iM56008U, unsafe.getInt(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i & i5) != 0) {
                        cdjVar.mo21028w(iM56008U, unsafe.getInt(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i & i5) != 0) {
                        cdjVar.mo21014i(iM56008U, unsafe.getLong(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i & i5) != 0) {
                        cdjVar.mo20998H(iM56008U, unsafe.getInt(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i & i5) != 0) {
                        cdjVar.mo21018m(iM56008U, unsafe.getLong(obj, jM55988V));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i & i5) != 0) {
                        cdjVar.mo21000J(iM56008U, unsafe.getObject(obj, jM55988V), m56017v(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 18:
                    y5f.m57257P(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 19:
                    y5f.m57261T(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 20:
                    y5f.m57264W(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 21:
                    y5f.e0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 22:
                    y5f.m57263V(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 23:
                    y5f.m57260S(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 24:
                    y5f.m57259R(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 25:
                    y5f.m57255N(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 26:
                    y5f.c0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar);
                    break;
                case 27:
                    y5f.m57265X(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, m56017v(i4));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    y5f.m57256O(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    y5f.d0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 30:
                    y5f.m57258Q(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    y5f.m57266Y(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 32:
                    y5f.m57267Z(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 33:
                    y5f.a0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    y5f.b0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 35:
                    y5f.m57257P(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    y5f.m57261T(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 37:
                    y5f.m57264W(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 38:
                    y5f.e0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    y5f.m57263V(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 40:
                    y5f.m57260S(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    y5f.m57259R(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    y5f.m57255N(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    y5f.d0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    y5f.m57258Q(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 45:
                    y5f.m57266Y(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 46:
                    y5f.m57267Z(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 47:
                    y5f.a0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 48:
                    y5f.b0(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, true);
                    break;
                case 49:
                    y5f.m57262U(m56008U(i4), (List) unsafe.getObject(obj, jM55988V), cdjVar, m56017v(i4));
                    break;
                case 50:
                    w0(cdjVar, iM56008U, unsafe.getObject(obj, jM55988V), i4);
                    break;
                case 51:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21021p(iM56008U, m55990X(obj, jM55988V));
                        break;
                    }
                    break;
                case 52:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo20992B(iM56008U, m55991Y(obj, jM55988V));
                        break;
                    }
                    break;
                case 53:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21026u(iM56008U, a0(obj, jM55988V));
                        break;
                    }
                    break;
                case 54:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21011f(iM56008U, a0(obj, jM55988V));
                        break;
                    }
                    break;
                case 55:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21013h(iM56008U, m55992Z(obj, jM55988V));
                        break;
                    }
                    break;
                case 56:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21024s(iM56008U, a0(obj, jM55988V));
                        break;
                    }
                    break;
                case 57:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21008c(iM56008U, m55992Z(obj, jM55988V));
                        break;
                    }
                    break;
                case 58:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21027v(iM56008U, m55989W(obj, jM55988V));
                        break;
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (m56002I(obj, iM56008U, i4)) {
                        x0(iM56008U, unsafe.getObject(obj, jM55988V), cdjVar);
                        break;
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21002L(iM56008U, unsafe.getObject(obj, jM55988V), m56017v(i4));
                        break;
                    }
                    break;
                case 61:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21003M(iM56008U, (xq1) unsafe.getObject(obj, jM55988V));
                        break;
                    }
                    break;
                case 62:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21020o(iM56008U, m55992Z(obj, jM55988V));
                        break;
                    }
                    break;
                case 63:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo20995E(iM56008U, m55992Z(obj, jM55988V));
                        break;
                    }
                    break;
                case 64:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21028w(iM56008U, m55992Z(obj, jM55988V));
                        break;
                    }
                    break;
                case 65:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21014i(iM56008U, a0(obj, jM55988V));
                        break;
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo20998H(iM56008U, m55992Z(obj, jM55988V));
                        break;
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21018m(iM56008U, a0(obj, jM55988V));
                        break;
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (m56002I(obj, iM56008U, i4)) {
                        cdjVar.mo21000J(iM56008U, unsafe.getObject(obj, jM55988V), m56017v(i4));
                        break;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        while (entry != null) {
            this.f53521p.mo47063j(cdjVar, entry);
            entry = itM27509s.hasNext() ? (Map.Entry) itM27509s.next() : null;
        }
        y0(this.f53520o, obj, cdjVar);
    }

    /* renamed from: u */
    public final Object m56016u(int i) {
        return this.f53507b[(i / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(Object obj, cdj cdjVar) {
        Iterator itM27509s;
        Map.Entry entry;
        if (this.f53511f) {
            fu6 fu6VarMo47056c = this.f53521p.mo47056c(obj);
            if (fu6VarMo47056c.m27506n()) {
                itM27509s = null;
                entry = null;
            } else {
                itM27509s = fu6VarMo47056c.m27509s();
                entry = (Map.Entry) itM27509s.next();
            }
        }
        int length = this.f53506a.length;
        for (int i = 0; i < length; i += 3) {
            int iS0 = s0(i);
            int iM56008U = m56008U(i);
            while (entry != null && this.f53521p.mo47054a(entry) <= iM56008U) {
                this.f53521p.mo47063j(cdjVar, entry);
                entry = itM27509s.hasNext() ? (Map.Entry) itM27509s.next() : null;
            }
            switch (r0(iS0)) {
                case 0:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21021p(iM56008U, m55994o(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m55997C(obj, i)) {
                        cdjVar.mo20992B(iM56008U, m55995s(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21026u(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21011f(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21013h(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21024s(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21008c(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21027v(iM56008U, m55993l(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m55997C(obj, i)) {
                        x0(iM56008U, z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21002L(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21003M(iM56008U, (xq1) z4i.m58695G(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21020o(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m55997C(obj, i)) {
                        cdjVar.mo20995E(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21028w(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21014i(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m55997C(obj, i)) {
                        cdjVar.mo20998H(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21018m(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m55997C(obj, i)) {
                        cdjVar.mo21000J(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    y5f.m57257P(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 19:
                    y5f.m57261T(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 20:
                    y5f.m57264W(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 21:
                    y5f.e0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 22:
                    y5f.m57263V(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 23:
                    y5f.m57260S(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 24:
                    y5f.m57259R(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 25:
                    y5f.m57255N(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 26:
                    y5f.c0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                    break;
                case 27:
                    y5f.m57265X(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, m56017v(i));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    y5f.m57256O(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    y5f.d0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 30:
                    y5f.m57258Q(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    y5f.m57266Y(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 32:
                    y5f.m57267Z(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 33:
                    y5f.a0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    y5f.b0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 35:
                    y5f.m57257P(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    y5f.m57261T(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 37:
                    y5f.m57264W(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 38:
                    y5f.e0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    y5f.m57263V(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 40:
                    y5f.m57260S(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    y5f.m57259R(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    y5f.m57255N(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    y5f.d0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    y5f.m57258Q(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 45:
                    y5f.m57266Y(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 46:
                    y5f.m57267Z(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 47:
                    y5f.a0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 48:
                    y5f.b0(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 49:
                    y5f.m57262U(m56008U(i), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, m56017v(i));
                    break;
                case 50:
                    w0(cdjVar, iM56008U, z4i.m58695G(obj, m55988V(iS0)), i);
                    break;
                case 51:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21021p(iM56008U, m55990X(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo20992B(iM56008U, m55991Y(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21026u(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21011f(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21013h(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21024s(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21008c(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21027v(iM56008U, m55989W(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m56002I(obj, iM56008U, i)) {
                        x0(iM56008U, z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21002L(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21003M(iM56008U, (xq1) z4i.m58695G(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21020o(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo20995E(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21028w(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21014i(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo20998H(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21018m(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m56002I(obj, iM56008U, i)) {
                        cdjVar.mo21000J(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        while (entry != null) {
            this.f53521p.mo47063j(cdjVar, entry);
            entry = itM27509s.hasNext() ? (Map.Entry) itM27509s.next() : null;
        }
        y0(this.f53520o, obj, cdjVar);
    }

    /* renamed from: v */
    public final n5f m56017v(int i) {
        int i2 = (i / 3) * 2;
        n5f n5fVar = (n5f) this.f53507b[i2];
        if (n5fVar != null) {
            return n5fVar;
        }
        n5f n5fVarM52234d = v1e.m52231a().m52234d((Class) this.f53507b[i2 + 1]);
        this.f53507b[i2] = n5fVarM52234d;
        return n5fVarM52234d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(Object obj, cdj cdjVar) {
        Iterator itM27501g;
        Map.Entry entry;
        y0(this.f53520o, obj, cdjVar);
        if (this.f53511f) {
            fu6 fu6VarMo47056c = this.f53521p.mo47056c(obj);
            if (fu6VarMo47056c.m27506n()) {
                itM27501g = null;
                entry = null;
            } else {
                itM27501g = fu6VarMo47056c.m27501g();
                entry = (Map.Entry) itM27501g.next();
            }
        }
        for (int length = this.f53506a.length - 3; length >= 0; length -= 3) {
            int iS0 = s0(length);
            int iM56008U = m56008U(length);
            while (entry != null && this.f53521p.mo47054a(entry) > iM56008U) {
                this.f53521p.mo47063j(cdjVar, entry);
                entry = itM27501g.hasNext() ? (Map.Entry) itM27501g.next() : null;
            }
            switch (r0(iS0)) {
                case 0:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21021p(iM56008U, m55994o(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m55997C(obj, length)) {
                        cdjVar.mo20992B(iM56008U, m55995s(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21026u(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21011f(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21013h(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21024s(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21008c(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21027v(iM56008U, m55993l(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m55997C(obj, length)) {
                        x0(iM56008U, z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21002L(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(length));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21003M(iM56008U, (xq1) z4i.m58695G(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21020o(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m55997C(obj, length)) {
                        cdjVar.mo20995E(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21028w(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21014i(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m55997C(obj, length)) {
                        cdjVar.mo20998H(iM56008U, m55979A(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21018m(iM56008U, m55984L(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m55997C(obj, length)) {
                        cdjVar.mo21000J(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(length));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    y5f.m57257P(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 19:
                    y5f.m57261T(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 20:
                    y5f.m57264W(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 21:
                    y5f.e0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 22:
                    y5f.m57263V(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 23:
                    y5f.m57260S(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 24:
                    y5f.m57259R(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 25:
                    y5f.m57255N(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 26:
                    y5f.c0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                    break;
                case 27:
                    y5f.m57265X(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, m56017v(length));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    y5f.m57256O(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    y5f.d0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 30:
                    y5f.m57258Q(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    y5f.m57266Y(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 32:
                    y5f.m57267Z(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 33:
                    y5f.a0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    y5f.b0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, false);
                    break;
                case 35:
                    y5f.m57257P(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    y5f.m57261T(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 37:
                    y5f.m57264W(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 38:
                    y5f.e0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    y5f.m57263V(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 40:
                    y5f.m57260S(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    y5f.m57259R(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    y5f.m57255N(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    y5f.d0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    y5f.m57258Q(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 45:
                    y5f.m57266Y(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 46:
                    y5f.m57267Z(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 47:
                    y5f.a0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 48:
                    y5f.b0(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, true);
                    break;
                case 49:
                    y5f.m57262U(m56008U(length), (List) z4i.m58695G(obj, m55988V(iS0)), cdjVar, m56017v(length));
                    break;
                case 50:
                    w0(cdjVar, iM56008U, z4i.m58695G(obj, m55988V(iS0)), length);
                    break;
                case 51:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21021p(iM56008U, m55990X(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo20992B(iM56008U, m55991Y(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21026u(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21011f(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21013h(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21024s(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21008c(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21027v(iM56008U, m55989W(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m56002I(obj, iM56008U, length)) {
                        x0(iM56008U, z4i.m58695G(obj, m55988V(iS0)), cdjVar);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21002L(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(length));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21003M(iM56008U, (xq1) z4i.m58695G(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21020o(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo20995E(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21028w(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21014i(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo20998H(iM56008U, m55992Z(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21018m(iM56008U, a0(obj, m55988V(iS0)));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m56002I(obj, iM56008U, length)) {
                        cdjVar.mo21000J(iM56008U, z4i.m58695G(obj, m55988V(iS0)), m56017v(length));
                        break;
                    } else {
                        break;
                    }
            }
        }
        while (entry != null) {
            this.f53521p.mo47063j(cdjVar, entry);
            entry = itM27501g.hasNext() ? (Map.Entry) itM27501g.next() : null;
        }
    }

    public final void w0(cdj cdjVar, int i, Object obj, int i2) {
        if (obj != null) {
            cdjVar.mo21005O(i, this.f53522q.mo45807b(m56016u(i2)), this.f53522q.mo45810e(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: x */
    public final int m56018x(Object obj) {
        int i;
        int i2;
        int iM40470j;
        int iM40465e;
        int iM40447J;
        boolean z;
        int iM57273f;
        int iM57276i;
        int iM40457T;
        int iM40459V;
        Unsafe unsafe = f53505s;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f53506a.length) {
            int iS0 = s0(i5);
            int iM56008U = m56008U(i5);
            int iR0 = r0(iS0);
            if (iR0 <= 17) {
                i = this.f53506a[i5 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
            } else {
                i = (!this.f53514i || iR0 < ju6.DOUBLE_LIST_PACKED.id() || iR0 > ju6.SINT64_LIST_PACKED.id()) ? 0 : this.f53506a[i5 + 2] & i3;
                i2 = 0;
            }
            long jM55988V = m55988V(iS0);
            switch (iR0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        iM40470j = nf3.m40470j(iM56008U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 += iM40470j;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        iM40470j = nf3.m40478r(iM56008U, 0.0f);
                        i6 += iM40470j;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        iM40470j = nf3.m40485y(iM56008U, unsafe.getLong(obj, jM55988V));
                        i6 += iM40470j;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        iM40470j = nf3.m40460W(iM56008U, unsafe.getLong(obj, jM55988V));
                        i6 += iM40470j;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        iM40470j = nf3.m40483w(iM56008U, unsafe.getInt(obj, jM55988V));
                        i6 += iM40470j;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        iM40470j = nf3.m40476p(iM56008U, 0L);
                        i6 += iM40470j;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        iM40470j = nf3.m40474n(iM56008U, 0);
                        i6 += iM40470j;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40465e(iM56008U, true);
                        i6 += iM40465e;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(obj, jM55988V);
                        iM40465e = object instanceof xq1 ? nf3.m40468h(iM56008U, (xq1) object) : nf3.m40455R(iM56008U, (String) object);
                        i6 += iM40465e;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        iM40465e = y5f.m57282o(iM56008U, unsafe.getObject(obj, jM55988V), m56017v(i5));
                        i6 += iM40465e;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40468h(iM56008U, (xq1) unsafe.getObject(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40458U(iM56008U, unsafe.getInt(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40472l(iM56008U, unsafe.getInt(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        iM40447J = nf3.m40447J(iM56008U, 0);
                        i6 += iM40447J;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40449L(iM56008U, 0L);
                        i6 += iM40465e;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40451N(iM56008U, unsafe.getInt(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40453P(iM56008U, unsafe.getLong(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        iM40465e = nf3.m40480t(iM56008U, (scb) unsafe.getObject(obj, jM55988V), m56017v(i5));
                        i6 += iM40465e;
                    }
                    break;
                case 18:
                    iM40465e = y5f.m57275h(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM40465e;
                    break;
                case 19:
                    z = false;
                    iM57273f = y5f.m57273f(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 20:
                    z = false;
                    iM57273f = y5f.m57280m(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 21:
                    z = false;
                    iM57273f = y5f.m57291x(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 22:
                    z = false;
                    iM57273f = y5f.m57278k(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 23:
                    z = false;
                    iM57273f = y5f.m57275h(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 24:
                    z = false;
                    iM57273f = y5f.m57273f(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 25:
                    z = false;
                    iM57273f = y5f.m57268a(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 26:
                    iM40465e = y5f.m57288u(iM56008U, (List) unsafe.getObject(obj, jM55988V));
                    i6 += iM40465e;
                    break;
                case 27:
                    iM40465e = y5f.m57283p(iM56008U, (List) unsafe.getObject(obj, jM55988V), m56017v(i5));
                    i6 += iM40465e;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iM40465e = y5f.m57270c(iM56008U, (List) unsafe.getObject(obj, jM55988V));
                    i6 += iM40465e;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iM40465e = y5f.m57289v(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM40465e;
                    break;
                case 30:
                    z = false;
                    iM57273f = y5f.m57271d(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z = false;
                    iM57273f = y5f.m57273f(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 32:
                    z = false;
                    iM57273f = y5f.m57275h(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 33:
                    z = false;
                    iM57273f = y5f.m57284q(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z = false;
                    iM57273f = y5f.m57286s(iM56008U, (List) unsafe.getObject(obj, jM55988V), false);
                    i6 += iM57273f;
                    break;
                case 35:
                    iM57276i = y5f.m57276i((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iM57276i = y5f.m57274g((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 37:
                    iM57276i = y5f.m57281n((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 38:
                    iM57276i = y5f.m57292y((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iM57276i = y5f.m57279l((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 40:
                    iM57276i = y5f.m57276i((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iM57276i = y5f.m57274g((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iM57276i = y5f.m57269b((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    iM57276i = y5f.m57290w((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iM57276i = y5f.m57272e((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 45:
                    iM57276i = y5f.m57274g((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 46:
                    iM57276i = y5f.m57276i((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 47:
                    iM57276i = y5f.m57285r((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 48:
                    iM57276i = y5f.m57287t((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i > 0) {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40447J = iM40457T + iM40459V + iM57276i;
                        i6 += iM40447J;
                    }
                    break;
                case 49:
                    iM40465e = y5f.m57277j(iM56008U, (List) unsafe.getObject(obj, jM55988V), m56017v(i5));
                    i6 += iM40465e;
                    break;
                case 50:
                    iM40465e = this.f53522q.mo45812g(iM56008U, unsafe.getObject(obj, jM55988V), m56016u(i5));
                    i6 += iM40465e;
                    break;
                case 51:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40470j(iM56008U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 += iM40465e;
                    }
                    break;
                case 52:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40478r(iM56008U, 0.0f);
                        i6 += iM40465e;
                    }
                    break;
                case 53:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40485y(iM56008U, a0(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 54:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40460W(iM56008U, a0(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 55:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40483w(iM56008U, m55992Z(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 56:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40476p(iM56008U, 0L);
                        i6 += iM40465e;
                    }
                    break;
                case 57:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40447J = nf3.m40474n(iM56008U, 0);
                        i6 += iM40447J;
                    }
                    break;
                case 58:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40465e(iM56008U, true);
                        i6 += iM40465e;
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (m56002I(obj, iM56008U, i5)) {
                        Object object2 = unsafe.getObject(obj, jM55988V);
                        iM40465e = object2 instanceof xq1 ? nf3.m40468h(iM56008U, (xq1) object2) : nf3.m40455R(iM56008U, (String) object2);
                        i6 += iM40465e;
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = y5f.m57282o(iM56008U, unsafe.getObject(obj, jM55988V), m56017v(i5));
                        i6 += iM40465e;
                    }
                    break;
                case 61:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40468h(iM56008U, (xq1) unsafe.getObject(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 62:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40458U(iM56008U, m55992Z(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 63:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40472l(iM56008U, m55992Z(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case 64:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40447J = nf3.m40447J(iM56008U, 0);
                        i6 += iM40447J;
                    }
                    break;
                case 65:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40449L(iM56008U, 0L);
                        i6 += iM40465e;
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40451N(iM56008U, m55992Z(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40453P(iM56008U, a0(obj, jM55988V));
                        i6 += iM40465e;
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (m56002I(obj, iM56008U, i5)) {
                        iM40465e = nf3.m40480t(iM56008U, (scb) unsafe.getObject(obj, jM55988V), m56017v(i5));
                        i6 += iM40465e;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int iM56020z = i6 + m56020z(this.f53520o, obj);
        return this.f53511f ? iM56020z + this.f53521p.mo47056c(obj).m27505l() : iM56020z;
    }

    public final void x0(int i, Object obj, cdj cdjVar) {
        if (obj instanceof String) {
            cdjVar.mo21010e(i, (String) obj);
        } else {
            cdjVar.mo21003M(i, (xq1) obj);
        }
    }

    /* renamed from: y */
    public final int m56019y(Object obj) {
        int iM40470j;
        int iM57276i;
        int iM40457T;
        int iM40459V;
        Unsafe unsafe = f53505s;
        int i = 0;
        for (int i2 = 0; i2 < this.f53506a.length; i2 += 3) {
            int iS0 = s0(i2);
            int iR0 = r0(iS0);
            int iM56008U = m56008U(i2);
            long jM55988V = m55988V(iS0);
            int i3 = (iR0 < ju6.DOUBLE_LIST_PACKED.id() || iR0 > ju6.SINT64_LIST_PACKED.id()) ? 0 : this.f53506a[i2 + 2] & 1048575;
            switch (iR0) {
                case 0:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40470j(iM56008U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40478r(iM56008U, 0.0f);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40485y(iM56008U, z4i.m58693E(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40460W(iM56008U, z4i.m58693E(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40483w(iM56008U, z4i.m58691C(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40476p(iM56008U, 0L);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40474n(iM56008U, 0);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40465e(iM56008U, true);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m55997C(obj, i2)) {
                        Object objM58695G = z4i.m58695G(obj, jM55988V);
                        iM40470j = objM58695G instanceof xq1 ? nf3.m40468h(iM56008U, (xq1) objM58695G) : nf3.m40455R(iM56008U, (String) objM58695G);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m55997C(obj, i2)) {
                        iM40470j = y5f.m57282o(iM56008U, z4i.m58695G(obj, jM55988V), m56017v(i2));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40468h(iM56008U, (xq1) z4i.m58695G(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40458U(iM56008U, z4i.m58691C(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40472l(iM56008U, z4i.m58691C(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40447J(iM56008U, 0);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40449L(iM56008U, 0L);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40451N(iM56008U, z4i.m58691C(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40453P(iM56008U, z4i.m58693E(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m55997C(obj, i2)) {
                        iM40470j = nf3.m40480t(iM56008U, (scb) z4i.m58695G(obj, jM55988V), m56017v(i2));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iM40470j = y5f.m57275h(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 19:
                    iM40470j = y5f.m57273f(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 20:
                    iM40470j = y5f.m57280m(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 21:
                    iM40470j = y5f.m57291x(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 22:
                    iM40470j = y5f.m57278k(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 23:
                    iM40470j = y5f.m57275h(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 24:
                    iM40470j = y5f.m57273f(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 25:
                    iM40470j = y5f.m57268a(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 26:
                    iM40470j = y5f.m57288u(iM56008U, m55983K(obj, jM55988V));
                    i += iM40470j;
                    break;
                case 27:
                    iM40470j = y5f.m57283p(iM56008U, m55983K(obj, jM55988V), m56017v(i2));
                    i += iM40470j;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iM40470j = y5f.m57270c(iM56008U, m55983K(obj, jM55988V));
                    i += iM40470j;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    iM40470j = y5f.m57289v(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 30:
                    iM40470j = y5f.m57271d(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM40470j = y5f.m57273f(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 32:
                    iM40470j = y5f.m57275h(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 33:
                    iM40470j = y5f.m57284q(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iM40470j = y5f.m57286s(iM56008U, m55983K(obj, jM55988V), false);
                    i += iM40470j;
                    break;
                case 35:
                    iM57276i = y5f.m57276i((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iM57276i = y5f.m57274g((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 37:
                    iM57276i = y5f.m57281n((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 38:
                    iM57276i = y5f.m57292y((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iM57276i = y5f.m57279l((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 40:
                    iM57276i = y5f.m57276i((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iM57276i = y5f.m57274g((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iM57276i = y5f.m57269b((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case SignatureVisitor.EXTENDS /* 43 */:
                    iM57276i = y5f.m57290w((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iM57276i = y5f.m57272e((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 45:
                    iM57276i = y5f.m57274g((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 46:
                    iM57276i = y5f.m57276i((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 47:
                    iM57276i = y5f.m57285r((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 48:
                    iM57276i = y5f.m57287t((List) unsafe.getObject(obj, jM55988V));
                    if (iM57276i <= 0) {
                        break;
                    } else {
                        if (this.f53514i) {
                            unsafe.putInt(obj, i3, iM57276i);
                        }
                        iM40457T = nf3.m40457T(iM56008U);
                        iM40459V = nf3.m40459V(iM57276i);
                        iM40470j = iM40457T + iM40459V + iM57276i;
                        i += iM40470j;
                        break;
                    }
                case 49:
                    iM40470j = y5f.m57277j(iM56008U, m55983K(obj, jM55988V), m56017v(i2));
                    i += iM40470j;
                    break;
                case 50:
                    iM40470j = this.f53522q.mo45812g(iM56008U, z4i.m58695G(obj, jM55988V), m56016u(i2));
                    i += iM40470j;
                    break;
                case 51:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40470j(iM56008U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40478r(iM56008U, 0.0f);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40485y(iM56008U, a0(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40460W(iM56008U, a0(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40483w(iM56008U, m55992Z(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40476p(iM56008U, 0L);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40474n(iM56008U, 0);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40465e(iM56008U, true);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (m56002I(obj, iM56008U, i2)) {
                        Object objM58695G2 = z4i.m58695G(obj, jM55988V);
                        iM40470j = objM58695G2 instanceof xq1 ? nf3.m40468h(iM56008U, (xq1) objM58695G2) : nf3.m40455R(iM56008U, (String) objM58695G2);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = y5f.m57282o(iM56008U, z4i.m58695G(obj, jM55988V), m56017v(i2));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40468h(iM56008U, (xq1) z4i.m58695G(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40458U(iM56008U, m55992Z(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40472l(iM56008U, m55992Z(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40447J(iM56008U, 0);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40449L(iM56008U, 0L);
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40451N(iM56008U, m55992Z(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40453P(iM56008U, a0(obj, jM55988V));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (m56002I(obj, iM56008U, i2)) {
                        iM40470j = nf3.m40480t(iM56008U, (scb) z4i.m58695G(obj, jM55988V), m56017v(i2));
                        i += iM40470j;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + m56020z(this.f53520o, obj);
    }

    public final void y0(j4i j4iVar, Object obj, cdj cdjVar) {
        j4iVar.mo33261t(j4iVar.mo33248g(obj), cdjVar);
    }

    /* renamed from: z */
    public final int m56020z(j4i j4iVar, Object obj) {
        return j4iVar.mo33249h(j4iVar.mo33248g(obj));
    }
}
