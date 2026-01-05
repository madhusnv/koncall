package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class pti {

    /* renamed from: e */
    public static final int[] f40559e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final pti[] f40560f = m44163a();

    /* renamed from: a */
    public final int f40561a;

    /* renamed from: b */
    public final int[] f40562b;

    /* renamed from: c */
    public final C16190b[] f40563c;

    /* renamed from: d */
    public final int f40564d;

    /* renamed from: o.pti$a */
    public static final class C16189a {

        /* renamed from: a */
        public final int f40565a;

        /* renamed from: b */
        public final int f40566b;

        public C16189a(int i, int i2) {
            this.f40565a = i;
            this.f40566b = i2;
        }

        /* renamed from: a */
        public int m44169a() {
            return this.f40565a;
        }

        /* renamed from: b */
        public int m44170b() {
            return this.f40566b;
        }
    }

    /* renamed from: o.pti$b */
    public static final class C16190b {

        /* renamed from: a */
        public final int f40567a;

        /* renamed from: b */
        public final C16189a[] f40568b;

        public C16190b(int i, C16189a... c16189aArr) {
            this.f40567a = i;
            this.f40568b = c16189aArr;
        }

        /* renamed from: a */
        public C16189a[] m44171a() {
            return this.f40568b;
        }

        /* renamed from: b */
        public int m44172b() {
            return this.f40567a;
        }

        /* renamed from: c */
        public int m44173c() {
            int iM44169a = 0;
            for (C16189a c16189a : this.f40568b) {
                iM44169a += c16189a.m44169a();
            }
            return iM44169a;
        }

        /* renamed from: d */
        public int m44174d() {
            return this.f40567a * m44173c();
        }
    }

    public pti(int i, int[] iArr, C16190b... c16190bArr) {
        this.f40561a = i;
        this.f40562b = iArr;
        this.f40563c = c16190bArr;
        int iM44172b = c16190bArr[0].m44172b();
        int iM44169a = 0;
        for (C16189a c16189a : c16190bArr[0].m44171a()) {
            iM44169a += c16189a.m44169a() * (c16189a.m44170b() + iM44172b);
        }
        this.f40564d = iM44169a;
    }

    /* renamed from: a */
    public static pti[] m44163a() {
        return new pti[]{new pti(1, new int[0], new C16190b(7, new C16189a(1, 19)), new C16190b(10, new C16189a(1, 16)), new C16190b(13, new C16189a(1, 13)), new C16190b(17, new C16189a(1, 9))), new pti(2, new int[]{6, 18}, new C16190b(10, new C16189a(1, 34)), new C16190b(16, new C16189a(1, 28)), new C16190b(22, new C16189a(1, 22)), new C16190b(28, new C16189a(1, 16))), new pti(3, new int[]{6, 22}, new C16190b(15, new C16189a(1, 55)), new C16190b(26, new C16189a(1, 44)), new C16190b(18, new C16189a(2, 17)), new C16190b(22, new C16189a(2, 13))), new pti(4, new int[]{6, 26}, new C16190b(20, new C16189a(1, 80)), new C16190b(18, new C16189a(2, 32)), new C16190b(26, new C16189a(2, 24)), new C16190b(16, new C16189a(4, 9))), new pti(5, new int[]{6, 30}, new C16190b(26, new C16189a(1, 108)), new C16190b(24, new C16189a(2, 43)), new C16190b(18, new C16189a(2, 15), new C16189a(2, 16)), new C16190b(22, new C16189a(2, 11), new C16189a(2, 12))), new pti(6, new int[]{6, 34}, new C16190b(18, new C16189a(2, 68)), new C16190b(16, new C16189a(4, 27)), new C16190b(24, new C16189a(4, 19)), new C16190b(28, new C16189a(4, 15))), new pti(7, new int[]{6, 22, 38}, new C16190b(20, new C16189a(2, 78)), new C16190b(18, new C16189a(4, 31)), new C16190b(18, new C16189a(2, 14), new C16189a(4, 15)), new C16190b(26, new C16189a(4, 13), new C16189a(1, 14))), new pti(8, new int[]{6, 24, 42}, new C16190b(24, new C16189a(2, 97)), new C16190b(22, new C16189a(2, 38), new C16189a(2, 39)), new C16190b(22, new C16189a(4, 18), new C16189a(2, 19)), new C16190b(26, new C16189a(4, 14), new C16189a(2, 15))), new pti(9, new int[]{6, 26, 46}, new C16190b(30, new C16189a(2, 116)), new C16190b(22, new C16189a(3, 36), new C16189a(2, 37)), new C16190b(20, new C16189a(4, 16), new C16189a(4, 17)), new C16190b(24, new C16189a(4, 12), new C16189a(4, 13))), new pti(10, new int[]{6, 28, 50}, new C16190b(18, new C16189a(2, 68), new C16189a(2, 69)), new C16190b(26, new C16189a(4, 43), new C16189a(1, 44)), new C16190b(24, new C16189a(6, 19), new C16189a(2, 20)), new C16190b(28, new C16189a(6, 15), new C16189a(2, 16))), new pti(11, new int[]{6, 30, 54}, new C16190b(20, new C16189a(4, 81)), new C16190b(30, new C16189a(1, 50), new C16189a(4, 51)), new C16190b(28, new C16189a(4, 22), new C16189a(4, 23)), new C16190b(24, new C16189a(3, 12), new C16189a(8, 13))), new pti(12, new int[]{6, 32, 58}, new C16190b(24, new C16189a(2, 92), new C16189a(2, 93)), new C16190b(22, new C16189a(6, 36), new C16189a(2, 37)), new C16190b(26, new C16189a(4, 20), new C16189a(6, 21)), new C16190b(28, new C16189a(7, 14), new C16189a(4, 15))), new pti(13, new int[]{6, 34, 62}, new C16190b(26, new C16189a(4, Opcodes.DMUL)), new C16190b(22, new C16189a(8, 37), new C16189a(1, 38)), new C16190b(24, new C16189a(8, 20), new C16189a(4, 21)), new C16190b(22, new C16189a(12, 11), new C16189a(4, 12))), new pti(14, new int[]{6, 26, 46, 66}, new C16190b(30, new C16189a(3, Opcodes.DREM), new C16189a(1, 116)), new C16190b(24, new C16189a(4, 40), new C16189a(5, 41)), new C16190b(20, new C16189a(11, 16), new C16189a(5, 17)), new C16190b(24, new C16189a(11, 12), new C16189a(5, 13))), new pti(15, new int[]{6, 26, 48, 70}, new C16190b(22, new C16189a(5, 87), new C16189a(1, 88)), new C16190b(24, new C16189a(5, 41), new C16189a(5, 42)), new C16190b(30, new C16189a(5, 24), new C16189a(7, 25)), new C16190b(24, new C16189a(11, 12), new C16189a(7, 13))), new pti(16, new int[]{6, 26, 50, 74}, new C16190b(24, new C16189a(5, 98), new C16189a(1, 99)), new C16190b(28, new C16189a(7, 45), new C16189a(3, 46)), new C16190b(24, new C16189a(15, 19), new C16189a(2, 20)), new C16190b(30, new C16189a(3, 15), new C16189a(13, 16))), new pti(17, new int[]{6, 30, 54, 78}, new C16190b(28, new C16189a(1, Opcodes.DMUL), new C16189a(5, 108)), new C16190b(28, new C16189a(10, 46), new C16189a(1, 47)), new C16190b(28, new C16189a(1, 22), new C16189a(15, 23)), new C16190b(28, new C16189a(2, 14), new C16189a(17, 15))), new pti(18, new int[]{6, 30, 56, 82}, new C16190b(30, new C16189a(5, 120), new C16189a(1, Opcodes.LSHL)), new C16190b(26, new C16189a(9, 43), new C16189a(4, 44)), new C16190b(28, new C16189a(17, 22), new C16189a(1, 23)), new C16190b(28, new C16189a(2, 14), new C16189a(19, 15))), new pti(19, new int[]{6, 30, 58, 86}, new C16190b(28, new C16189a(3, Opcodes.LREM), new C16189a(4, Opcodes.FREM)), new C16190b(26, new C16189a(3, 44), new C16189a(11, 45)), new C16190b(26, new C16189a(17, 21), new C16189a(4, 22)), new C16190b(26, new C16189a(9, 13), new C16189a(16, 14))), new pti(20, new int[]{6, 34, 62, 90}, new C16190b(28, new C16189a(3, Opcodes.DMUL), new C16189a(5, 108)), new C16190b(26, new C16189a(3, 41), new C16189a(13, 42)), new C16190b(30, new C16189a(15, 24), new C16189a(5, 25)), new C16190b(28, new C16189a(15, 15), new C16189a(10, 16))), new pti(21, new int[]{6, 28, 50, 72, 94}, new C16190b(28, new C16189a(4, 116), new C16189a(4, Opcodes.LNEG)), new C16190b(26, new C16189a(17, 42)), new C16190b(28, new C16189a(17, 22), new C16189a(6, 23)), new C16190b(30, new C16189a(19, 16), new C16189a(6, 17))), new pti(22, new int[]{6, 26, 50, 74, 98}, new C16190b(28, new C16189a(2, Opcodes.DDIV), new C16189a(7, 112)), new C16190b(28, new C16189a(17, 46)), new C16190b(30, new C16189a(7, 24), new C16189a(16, 25)), new C16190b(24, new C16189a(34, 13))), new pti(23, new int[]{6, 30, 54, 78, 102}, new C16190b(30, new C16189a(4, Opcodes.LSHL), new C16189a(5, 122)), new C16190b(28, new C16189a(4, 47), new C16189a(14, 48)), new C16190b(30, new C16189a(11, 24), new C16189a(14, 25)), new C16190b(30, new C16189a(16, 15), new C16189a(14, 16))), new pti(24, new int[]{6, 28, 54, 80, Opcodes.FMUL}, new C16190b(30, new C16189a(6, Opcodes.LNEG), new C16189a(4, Opcodes.FNEG)), new C16190b(28, new C16189a(6, 45), new C16189a(14, 46)), new C16190b(30, new C16189a(11, 24), new C16189a(16, 25)), new C16190b(30, new C16189a(30, 16), new C16189a(2, 17))), new pti(25, new int[]{6, 32, 58, 84, 110}, new C16190b(26, new C16189a(8, Opcodes.FMUL), new C16189a(4, Opcodes.DMUL)), new C16190b(28, new C16189a(8, 47), new C16189a(13, 48)), new C16190b(30, new C16189a(7, 24), new C16189a(22, 25)), new C16190b(30, new C16189a(22, 15), new C16189a(13, 16))), new pti(26, new int[]{6, 30, 58, 86, Opcodes.FREM}, new C16190b(28, new C16189a(10, Opcodes.FREM), new C16189a(2, Opcodes.DREM)), new C16190b(28, new C16189a(19, 46), new C16189a(4, 47)), new C16190b(28, new C16189a(28, 22), new C16189a(6, 23)), new C16190b(30, new C16189a(33, 16), new C16189a(4, 17))), new pti(27, new int[]{6, 34, 62, 90, Opcodes.FNEG}, new C16190b(30, new C16189a(8, 122), new C16189a(4, Opcodes.LSHR)), new C16190b(28, new C16189a(22, 45), new C16189a(3, 46)), new C16190b(30, new C16189a(8, 23), new C16189a(26, 24)), new C16190b(30, new C16189a(12, 15), new C16189a(28, 16))), new pti(28, new int[]{6, 26, 50, 74, 98, 122}, new C16190b(30, new C16189a(3, Opcodes.LNEG), new C16189a(10, Opcodes.FNEG)), new C16190b(28, new C16189a(3, 45), new C16189a(23, 46)), new C16190b(30, new C16189a(4, 24), new C16189a(31, 25)), new C16190b(30, new C16189a(11, 15), new C16189a(31, 16))), new pti(29, new int[]{6, 30, 54, 78, 102, 126}, new C16190b(30, new C16189a(7, 116), new C16189a(7, Opcodes.LNEG)), new C16190b(28, new C16189a(21, 45), new C16189a(7, 46)), new C16190b(30, new C16189a(1, 23), new C16189a(37, 24)), new C16190b(30, new C16189a(19, 15), new C16189a(26, 16))), new pti(30, new int[]{6, 26, 52, 78, 104, 130}, new C16190b(30, new C16189a(5, Opcodes.DREM), new C16189a(10, 116)), new C16190b(28, new C16189a(19, 47), new C16189a(10, 48)), new C16190b(30, new C16189a(15, 24), new C16189a(25, 25)), new C16190b(30, new C16189a(23, 15), new C16189a(25, 16))), new pti(31, new int[]{6, 30, 56, 82, 108, Opcodes.I2F}, new C16190b(30, new C16189a(13, Opcodes.DREM), new C16189a(3, 116)), new C16190b(28, new C16189a(2, 46), new C16189a(29, 47)), new C16190b(30, new C16189a(42, 24), new C16189a(1, 25)), new C16190b(30, new C16189a(23, 15), new C16189a(28, 16))), new pti(32, new int[]{6, 34, 60, 86, 112, Opcodes.L2D}, new C16190b(30, new C16189a(17, Opcodes.DREM)), new C16190b(28, new C16189a(10, 46), new C16189a(23, 47)), new C16190b(30, new C16189a(10, 24), new C16189a(35, 25)), new C16190b(30, new C16189a(19, 15), new C16189a(35, 16))), new pti(33, new int[]{6, 30, 58, 86, Opcodes.FREM, Opcodes.D2I}, new C16190b(30, new C16189a(17, Opcodes.DREM), new C16189a(1, 116)), new C16190b(28, new C16189a(14, 46), new C16189a(21, 47)), new C16190b(30, new C16189a(29, 24), new C16189a(19, 25)), new C16190b(30, new C16189a(11, 15), new C16189a(46, 16))), new pti(34, new int[]{6, 34, 62, 90, Opcodes.FNEG, Opcodes.I2C}, new C16190b(30, new C16189a(13, Opcodes.DREM), new C16189a(6, 116)), new C16190b(28, new C16189a(14, 46), new C16189a(23, 47)), new C16190b(30, new C16189a(44, 24), new C16189a(7, 25)), new C16190b(30, new C16189a(59, 16), new C16189a(1, 17))), new pti(35, new int[]{6, 30, 54, 78, 102, 126, Opcodes.FCMPG}, new C16190b(30, new C16189a(12, Opcodes.LSHL), new C16189a(7, 122)), new C16190b(28, new C16189a(12, 47), new C16189a(26, 48)), new C16190b(30, new C16189a(39, 24), new C16189a(14, 25)), new C16190b(30, new C16189a(22, 15), new C16189a(41, 16))), new pti(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C16190b(30, new C16189a(6, Opcodes.LSHL), new C16189a(14, 122)), new C16190b(28, new C16189a(6, 47), new C16189a(34, 48)), new C16190b(30, new C16189a(46, 24), new C16189a(10, 25)), new C16190b(30, new C16189a(2, 15), new C16189a(64, 16))), new pti(37, new int[]{6, 28, 54, 80, Opcodes.FMUL, Opcodes.IINC, 158}, new C16190b(30, new C16189a(17, 122), new C16189a(4, Opcodes.LSHR)), new C16190b(28, new C16189a(29, 46), new C16189a(14, 47)), new C16190b(30, new C16189a(49, 24), new C16189a(10, 25)), new C16190b(30, new C16189a(24, 15), new C16189a(46, 16))), new pti(38, new int[]{6, 32, 58, 84, 110, Opcodes.L2I, Opcodes.IF_ICMPGE}, new C16190b(30, new C16189a(4, 122), new C16189a(18, Opcodes.LSHR)), new C16190b(28, new C16189a(13, 46), new C16189a(32, 47)), new C16190b(30, new C16189a(48, 24), new C16189a(14, 25)), new C16190b(30, new C16189a(42, 15), new C16189a(32, 16))), new pti(39, new int[]{6, 26, 54, 82, 110, Opcodes.L2D, Opcodes.IF_ACMPNE}, new C16190b(30, new C16189a(20, Opcodes.LNEG), new C16189a(4, Opcodes.FNEG)), new C16190b(28, new C16189a(40, 47), new C16189a(7, 48)), new C16190b(30, new C16189a(43, 24), new C16189a(22, 25)), new C16190b(30, new C16189a(10, 15), new C16189a(67, 16))), new pti(40, new int[]{6, 30, 58, 86, Opcodes.FREM, Opcodes.D2I, Opcodes.TABLESWITCH}, new C16190b(30, new C16189a(19, Opcodes.FNEG), new C16189a(6, Opcodes.DNEG)), new C16190b(28, new C16189a(18, 47), new C16189a(31, 48)), new C16190b(30, new C16189a(34, 24), new C16189a(34, 25)), new C16190b(30, new C16189a(20, 15), new C16189a(61, 16)))};
    }

    /* renamed from: e */
    public static pti m44164e(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return f40560f[i - 1];
    }

    /* renamed from: b */
    public int m44165b() {
        return (this.f40561a * 4) + 17;
    }

    /* renamed from: c */
    public C16190b m44166c(hj6 hj6Var) {
        return this.f40563c[hj6Var.ordinal()];
    }

    /* renamed from: d */
    public int m44167d() {
        return this.f40564d;
    }

    /* renamed from: f */
    public int m44168f() {
        return this.f40561a;
    }

    public String toString() {
        return String.valueOf(this.f40561a);
    }
}
