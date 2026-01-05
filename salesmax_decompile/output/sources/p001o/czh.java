package p001o;

import com.google.android.gms.cast.MediaError;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class czh {

    /* renamed from: a */
    public static final HashMap f18887a;

    /* renamed from: b */
    public static final HashMap f18888b;

    /* renamed from: c */
    public static final HashMap f18889c;

    /* renamed from: d */
    public static Class[] f18890d;

    /* renamed from: e */
    public static int f18891e;

    /* renamed from: f */
    public static Integer[] f18892f;

    /* renamed from: g */
    public static String[] f18893g;

    /* renamed from: h */
    public static Integer f18894h;

    /* renamed from: i */
    public static int f18895i;

    /* renamed from: j */
    public static Long[] f18896j;

    /* renamed from: k */
    public static Long f18897k;

    /* renamed from: l */
    public static /* synthetic */ Class f18898l;

    /* renamed from: m */
    public static /* synthetic */ Class f18899m;

    /* renamed from: n */
    public static /* synthetic */ Class f18900n;

    /* renamed from: o */
    public static /* synthetic */ Class f18901o;

    /* renamed from: p */
    public static /* synthetic */ Class f18902p;

    /* renamed from: q */
    public static /* synthetic */ Class f18903q;

    /* renamed from: r */
    public static /* synthetic */ Class f18904r;

    /* renamed from: s */
    public static /* synthetic */ Class f18905s;

    /* renamed from: t */
    public static /* synthetic */ Class f18906t;

    static {
        HashMap map = new HashMap();
        f18887a = map;
        Class cls = Boolean.TYPE;
        map.put("boolean", cls);
        map.put("byte", Byte.TYPE);
        map.put("char", Character.TYPE);
        map.put("double", Double.TYPE);
        Class cls2 = Float.TYPE;
        map.put("float", cls2);
        Class cls3 = Integer.TYPE;
        map.put("int", cls3);
        Class cls4 = Long.TYPE;
        map.put("long", cls4);
        map.put("short", Short.TYPE);
        map.put("void", Void.TYPE);
        map.put("java.lang.Boolean.TYPE", cls);
        map.put("java.lang.Byte.TYPE", Byte.TYPE);
        map.put("java.lang.Character.TYPE", Character.TYPE);
        map.put("java.lang.Double.TYPE", Double.TYPE);
        map.put("java.lang.Float.TYPE", cls2);
        map.put("java.lang.Integer.TYPE", cls3);
        map.put("java.lang.Long.TYPE", cls4);
        map.put("java.lang.Short.TYPE", Short.TYPE);
        map.put("java.lang.Void.TYPE", Void.TYPE);
        Class clsM22139a = f18898l;
        if (clsM22139a == null) {
            clsM22139a = m22139a("java.lang.Boolean");
            f18898l = clsM22139a;
        }
        map.put("java.lang.Boolean", clsM22139a);
        Class clsM22139a2 = f18899m;
        if (clsM22139a2 == null) {
            clsM22139a2 = m22139a("java.lang.Byte");
            f18899m = clsM22139a2;
        }
        map.put("java.lang.Byte", clsM22139a2);
        Class clsM22139a3 = f18900n;
        if (clsM22139a3 == null) {
            clsM22139a3 = m22139a("java.lang.Character");
            f18900n = clsM22139a3;
        }
        map.put("java.lang.Character", clsM22139a3);
        Class clsM22139a4 = f18901o;
        if (clsM22139a4 == null) {
            clsM22139a4 = m22139a("java.lang.Double");
            f18901o = clsM22139a4;
        }
        map.put("java.lang.Double", clsM22139a4);
        Class clsM22139a5 = f18902p;
        if (clsM22139a5 == null) {
            clsM22139a5 = m22139a("java.lang.Float");
            f18902p = clsM22139a5;
        }
        map.put("java.lang.Float", clsM22139a5);
        Class clsM22139a6 = f18903q;
        if (clsM22139a6 == null) {
            clsM22139a6 = m22139a("java.lang.Integer");
            f18903q = clsM22139a6;
        }
        map.put("java.lang.Integer", clsM22139a6);
        Class clsM22139a7 = f18904r;
        if (clsM22139a7 == null) {
            clsM22139a7 = m22139a("java.lang.Long");
            f18904r = clsM22139a7;
        }
        map.put("java.lang.Long", clsM22139a7);
        Class clsM22139a8 = f18905s;
        if (clsM22139a8 == null) {
            clsM22139a8 = m22139a("java.lang.Short");
            f18905s = clsM22139a8;
        }
        map.put("java.lang.Short", clsM22139a8);
        Class clsM22139a9 = f18898l;
        if (clsM22139a9 == null) {
            clsM22139a9 = m22139a("java.lang.Boolean");
            f18898l = clsM22139a9;
        }
        map.put("Boolean", clsM22139a9);
        Class clsM22139a10 = f18899m;
        if (clsM22139a10 == null) {
            clsM22139a10 = m22139a("java.lang.Byte");
            f18899m = clsM22139a10;
        }
        map.put("Byte", clsM22139a10);
        Class clsM22139a11 = f18900n;
        if (clsM22139a11 == null) {
            clsM22139a11 = m22139a("java.lang.Character");
            f18900n = clsM22139a11;
        }
        map.put("Character", clsM22139a11);
        Class clsM22139a12 = f18901o;
        if (clsM22139a12 == null) {
            clsM22139a12 = m22139a("java.lang.Double");
            f18901o = clsM22139a12;
        }
        map.put("Double", clsM22139a12);
        Class clsM22139a13 = f18902p;
        if (clsM22139a13 == null) {
            clsM22139a13 = m22139a("java.lang.Float");
            f18902p = clsM22139a13;
        }
        map.put("Float", clsM22139a13);
        Class clsM22139a14 = f18903q;
        if (clsM22139a14 == null) {
            clsM22139a14 = m22139a("java.lang.Integer");
            f18903q = clsM22139a14;
        }
        map.put("Integer", clsM22139a14);
        Class clsM22139a15 = f18904r;
        if (clsM22139a15 == null) {
            clsM22139a15 = m22139a("java.lang.Long");
            f18904r = clsM22139a15;
        }
        map.put("Long", clsM22139a15);
        Class clsM22139a16 = f18905s;
        if (clsM22139a16 == null) {
            clsM22139a16 = m22139a("java.lang.Short");
            f18905s = clsM22139a16;
        }
        map.put("Short", clsM22139a16);
        map.put(null, Void.TYPE);
        Class clsM22139a17 = f18906t;
        if (clsM22139a17 == null) {
            clsM22139a17 = m22139a("java.lang.String");
            f18906t = clsM22139a17;
        }
        map.put("string", clsM22139a17);
        Class clsM22139a18 = f18906t;
        if (clsM22139a18 == null) {
            clsM22139a18 = m22139a("java.lang.String");
            f18906t = clsM22139a18;
        }
        map.put("String", clsM22139a18);
        Class clsM22139a19 = f18906t;
        if (clsM22139a19 == null) {
            clsM22139a19 = m22139a("java.lang.String");
            f18906t = clsM22139a19;
        }
        map.put("java.lang.String", clsM22139a19);
        HashMap map2 = new HashMap();
        f18888b = map2;
        map2.put(cls, "boolean");
        map2.put(Byte.TYPE, "byte");
        map2.put(Character.TYPE, "char");
        map2.put(Double.TYPE, "double");
        map2.put(cls2, "float");
        map2.put(cls3, "int");
        map2.put(cls4, "long");
        map2.put(Short.TYPE, "short");
        map2.put(Void.TYPE, "void");
        Class clsM22139a20 = f18898l;
        if (clsM22139a20 == null) {
            clsM22139a20 = m22139a("java.lang.Boolean");
            f18898l = clsM22139a20;
        }
        map2.put(clsM22139a20, "java.lang.Boolean");
        Class clsM22139a21 = f18899m;
        if (clsM22139a21 == null) {
            clsM22139a21 = m22139a("java.lang.Byte");
            f18899m = clsM22139a21;
        }
        map2.put(clsM22139a21, "java.lang.Byte");
        Class clsM22139a22 = f18900n;
        if (clsM22139a22 == null) {
            clsM22139a22 = m22139a("java.lang.Character");
            f18900n = clsM22139a22;
        }
        map2.put(clsM22139a22, "java.lang.Character");
        Class clsM22139a23 = f18901o;
        if (clsM22139a23 == null) {
            clsM22139a23 = m22139a("java.lang.Double");
            f18901o = clsM22139a23;
        }
        map2.put(clsM22139a23, "java.lang.Double");
        Class clsM22139a24 = f18902p;
        if (clsM22139a24 == null) {
            clsM22139a24 = m22139a("java.lang.Float");
            f18902p = clsM22139a24;
        }
        map2.put(clsM22139a24, "java.lang.Float");
        Class clsM22139a25 = f18903q;
        if (clsM22139a25 == null) {
            clsM22139a25 = m22139a("java.lang.Integer");
            f18903q = clsM22139a25;
        }
        map2.put(clsM22139a25, "java.lang.Integer");
        Class clsM22139a26 = f18904r;
        if (clsM22139a26 == null) {
            clsM22139a26 = m22139a("java.lang.Long");
            f18904r = clsM22139a26;
        }
        map2.put(clsM22139a26, "java.lang.Long");
        Class clsM22139a27 = f18905s;
        if (clsM22139a27 == null) {
            clsM22139a27 = m22139a("java.lang.Short");
            f18905s = clsM22139a27;
        }
        map2.put(clsM22139a27, "java.lang.Short");
        map2.put(null, "void");
        Class clsM22139a28 = f18906t;
        if (clsM22139a28 == null) {
            clsM22139a28 = m22139a("java.lang.String");
            f18906t = clsM22139a28;
        }
        map2.put(clsM22139a28, "java.lang.String");
        HashMap map3 = new HashMap();
        f18889c = map3;
        try {
            Class<?>[] clsArr = new Class[1];
            Class<?> clsM22139a29 = f18906t;
            if (clsM22139a29 == null) {
                clsM22139a29 = m22139a("java.lang.String");
                f18906t = clsM22139a29;
            }
            clsArr[0] = clsM22139a29;
            Class clsM22139a30 = f18898l;
            if (clsM22139a30 == null) {
                clsM22139a30 = m22139a("java.lang.Boolean");
                f18898l = clsM22139a30;
            }
            map3.put(cls, clsM22139a30.getMethod("valueOf", clsArr));
            Class cls5 = Byte.TYPE;
            Class clsM22139a31 = f18899m;
            if (clsM22139a31 == null) {
                clsM22139a31 = m22139a("java.lang.Byte");
                f18899m = clsM22139a31;
            }
            map3.put(cls5, clsM22139a31.getMethod("valueOf", clsArr));
            Class cls6 = Double.TYPE;
            Class clsM22139a32 = f18901o;
            if (clsM22139a32 == null) {
                clsM22139a32 = m22139a("java.lang.Double");
                f18901o = clsM22139a32;
            }
            map3.put(cls6, clsM22139a32.getMethod("valueOf", clsArr));
            Class clsM22139a33 = f18902p;
            if (clsM22139a33 == null) {
                clsM22139a33 = m22139a("java.lang.Float");
                f18902p = clsM22139a33;
            }
            map3.put(cls2, clsM22139a33.getMethod("valueOf", clsArr));
            Class clsM22139a34 = f18903q;
            if (clsM22139a34 == null) {
                clsM22139a34 = m22139a("java.lang.Integer");
                f18903q = clsM22139a34;
            }
            map3.put(cls3, clsM22139a34.getMethod("valueOf", clsArr));
            Class clsM22139a35 = f18904r;
            if (clsM22139a35 == null) {
                clsM22139a35 = m22139a("java.lang.Long");
                f18904r = clsM22139a35;
            }
            map3.put(cls4, clsM22139a35.getMethod("valueOf", clsArr));
            Class cls7 = Short.TYPE;
            Class clsM22139a36 = f18905s;
            if (clsM22139a36 == null) {
                clsM22139a36 = m22139a("java.lang.Short");
                f18905s = clsM22139a36;
            }
            map3.put(cls7, clsM22139a36.getMethod("valueOf", clsArr));
            Class clsM22139a37 = f18898l;
            if (clsM22139a37 == null) {
                clsM22139a37 = m22139a("java.lang.Boolean");
                f18898l = clsM22139a37;
            }
            Class clsM22139a38 = f18898l;
            if (clsM22139a38 == null) {
                clsM22139a38 = m22139a("java.lang.Boolean");
                f18898l = clsM22139a38;
            }
            map3.put(clsM22139a37, clsM22139a38.getMethod("valueOf", clsArr));
            Class clsM22139a39 = f18899m;
            if (clsM22139a39 == null) {
                clsM22139a39 = m22139a("java.lang.Byte");
                f18899m = clsM22139a39;
            }
            Class clsM22139a40 = f18899m;
            if (clsM22139a40 == null) {
                clsM22139a40 = m22139a("java.lang.Byte");
                f18899m = clsM22139a40;
            }
            map3.put(clsM22139a39, clsM22139a40.getMethod("valueOf", clsArr));
            Class clsM22139a41 = f18901o;
            if (clsM22139a41 == null) {
                clsM22139a41 = m22139a("java.lang.Double");
                f18901o = clsM22139a41;
            }
            Class clsM22139a42 = f18901o;
            if (clsM22139a42 == null) {
                clsM22139a42 = m22139a("java.lang.Double");
                f18901o = clsM22139a42;
            }
            map3.put(clsM22139a41, clsM22139a42.getMethod("valueOf", clsArr));
            Class clsM22139a43 = f18902p;
            if (clsM22139a43 == null) {
                clsM22139a43 = m22139a("java.lang.Float");
                f18902p = clsM22139a43;
            }
            Class clsM22139a44 = f18902p;
            if (clsM22139a44 == null) {
                clsM22139a44 = m22139a("java.lang.Float");
                f18902p = clsM22139a44;
            }
            map3.put(clsM22139a43, clsM22139a44.getMethod("valueOf", clsArr));
            Class clsM22139a45 = f18903q;
            if (clsM22139a45 == null) {
                clsM22139a45 = m22139a("java.lang.Integer");
                f18903q = clsM22139a45;
            }
            Class clsM22139a46 = f18903q;
            if (clsM22139a46 == null) {
                clsM22139a46 = m22139a("java.lang.Integer");
                f18903q = clsM22139a46;
            }
            map3.put(clsM22139a45, clsM22139a46.getMethod("valueOf", clsArr));
            Class clsM22139a47 = f18904r;
            if (clsM22139a47 == null) {
                clsM22139a47 = m22139a("java.lang.Long");
                f18904r = clsM22139a47;
            }
            Class clsM22139a48 = f18904r;
            if (clsM22139a48 == null) {
                clsM22139a48 = m22139a("java.lang.Long");
                f18904r = clsM22139a48;
            }
            map3.put(clsM22139a47, clsM22139a48.getMethod("valueOf", clsArr));
            Class clsM22139a49 = f18905s;
            if (clsM22139a49 == null) {
                clsM22139a49 = m22139a("java.lang.Short");
                f18905s = clsM22139a49;
            }
            Class clsM22139a50 = f18905s;
            if (clsM22139a50 == null) {
                clsM22139a50 = m22139a("java.lang.Short");
                f18905s = clsM22139a50;
            }
            map3.put(clsM22139a49, clsM22139a50.getMethod("valueOf", clsArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Class[] clsArr2 = new Class[1];
        Class clsM22139a51 = f18906t;
        if (clsM22139a51 == null) {
            clsM22139a51 = m22139a("java.lang.String");
            f18906t = clsM22139a51;
        }
        clsArr2[0] = clsM22139a51;
        f18890d = clsArr2;
        int iIntValue = Integer.getInteger("org.mortbay.util.TypeUtil.IntegerCacheSize", MediaError.DetailedErrorCode.TEXT_UNKNOWN).intValue();
        f18891e = iIntValue;
        f18892f = new Integer[iIntValue];
        f18893g = new String[iIntValue];
        f18894h = new Integer(-1);
        int iIntValue2 = Integer.getInteger("org.mortbay.util.TypeUtil.LongCacheSize", 64).intValue();
        f18895i = iIntValue2;
        f18896j = new Long[iIntValue2];
        f18897k = new Long(-1L);
    }

    /* renamed from: a */
    public static /* synthetic */ Class m22139a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* renamed from: b */
    public static byte m22140b(byte b) {
        int i;
        if (b < 48 || b > 57) {
            byte b2 = 97;
            if (b < 97 || b > 102) {
                b2 = 65;
                if (b < 65 || b > 70) {
                    return (byte) 0;
                }
            }
            i = (b - b2) + 10;
        } else {
            i = b - 48;
        }
        return (byte) i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 int, still in use, count: 1, list:
          (r2v2 int) from 0x0023: ARITH (r3v2 int) = (r2v2 int) + (-97 int) (LINE:36)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* renamed from: c */
    public static int m22141c(java.lang.String r5, int r6, int r7, int r8) {
        /*
            if (r7 >= 0) goto L7
            int r7 = r5.length()
            int r7 = r7 - r6
        L7:
            r0 = 0
            r1 = r0
        L9:
            if (r0 >= r7) goto L39
            int r2 = r6 + r0
            char r2 = r5.charAt(r2)
            int r3 = r2 + (-48)
            r4 = 10
            if (r3 < 0) goto L1b
            if (r3 >= r8) goto L1b
            if (r3 < r4) goto L25
        L1b:
            int r2 = r2 + 10
            int r3 = r2 + (-65)
            if (r3 < r4) goto L23
            if (r3 < r8) goto L25
        L23:
            int r3 = r2 + (-97)
        L25:
            if (r3 < 0) goto L2e
            if (r3 >= r8) goto L2e
            int r1 = r1 * r8
            int r1 = r1 + r3
            int r0 = r0 + 1
            goto L9
        L2e:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            int r7 = r7 + r6
            java.lang.String r5 = r5.substring(r6, r7)
            r8.<init>(r5)
            throw r8
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p001o.czh.m22141c(java.lang.String, int, int, int):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 int, still in use, count: 1, list:
          (r2v4 int) from 0x0021: ARITH (r3v2 int) = (r2v4 int) + (-97 int) (LINE:34)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* renamed from: d */
    public static int m22142d(byte[] r5, int r6, int r7, int r8) {
        /*
            if (r7 >= 0) goto L4
            int r7 = r5.length
            int r7 = r7 - r6
        L4:
            r0 = 0
            r1 = r0
        L6:
            if (r0 >= r7) goto L37
            int r2 = r6 + r0
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            int r3 = r2 + (-48)
            r4 = 10
            if (r3 < 0) goto L19
            if (r3 >= r8) goto L19
            if (r3 < r4) goto L23
        L19:
            int r2 = r2 + 10
            int r3 = r2 + (-65)
            if (r3 < r4) goto L21
            if (r3 < r8) goto L23
        L21:
            int r3 = r2 + (-97)
        L23:
            if (r3 < 0) goto L2c
            if (r3 >= r8) goto L2c
            int r1 = r1 * r8
            int r1 = r1 + r3
            int r0 = r0 + 1
            goto L6
        L2c:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r6, r7)
            r8.<init>(r0)
            throw r8
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p001o.czh.m22142d(byte[], int, int, int):int");
    }

    /* renamed from: e */
    public static String m22143e(int i) {
        if (i < 0 || i >= f18891e) {
            return i == -1 ? "-1" : Integer.toString(i);
        }
        String[] strArr = f18893g;
        if (strArr[i] == null) {
            strArr[i] = Integer.toString(i);
        }
        return f18893g[i];
    }
}
