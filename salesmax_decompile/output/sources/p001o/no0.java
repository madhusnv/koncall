package p001o;

import org.objectweb.asm.Opcodes;
import p001o.fbj;
import p001o.wn7;
import p001o.yn8;

/* loaded from: classes6.dex */
public abstract class no0 {

    /* renamed from: o.no0$a */
    public static /* synthetic */ class C15616a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37085a;

        static {
            int[] iArr = new int[fbj.EnumC13396b.values().length];
            f37085a = iArr;
            try {
                iArr[fbj.EnumC13396b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37085a[fbj.EnumC13396b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37085a[fbj.EnumC13396b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37085a[fbj.EnumC13396b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37085a[fbj.EnumC13396b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37085a[fbj.EnumC13396b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37085a[fbj.EnumC13396b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37085a[fbj.EnumC13396b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37085a[fbj.EnumC13396b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37085a[fbj.EnumC13396b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37085a[fbj.EnumC13396b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37085a[fbj.EnumC13396b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37085a[fbj.EnumC13396b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37085a[fbj.EnumC13396b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37085a[fbj.EnumC13396b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37085a[fbj.EnumC13396b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37085a[fbj.EnumC13396b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37085a[fbj.EnumC13396b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: o.no0$b */
    public static final class C15617b {

        /* renamed from: a */
        public int f37086a;

        /* renamed from: b */
        public long f37087b;

        /* renamed from: c */
        public Object f37088c;

        /* renamed from: d */
        public final qp6 f37089d;

        public C15617b(qp6 qp6Var) {
            qp6Var.getClass();
            this.f37089d = qp6Var;
        }
    }

    /* renamed from: A */
    public static int m40817A(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        zk8 zk8Var = (zk8) interfaceC18446j;
        int iM40825I = m40825I(bArr, i2, c15617b);
        zk8Var.R1(jf3.m33681b(c15617b.f37086a));
        while (iM40825I < i3) {
            int iM40825I2 = m40825I(bArr, iM40825I, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40825I = m40825I(bArr, iM40825I2, c15617b);
            zk8Var.R1(jf3.m33681b(c15617b.f37086a));
        }
        return iM40825I;
    }

    /* renamed from: B */
    public static int m40818B(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        dla dlaVar = (dla) interfaceC18446j;
        int iM40828L = m40828L(bArr, i2, c15617b);
        dlaVar.Z1(jf3.m33682c(c15617b.f37087b));
        while (iM40828L < i3) {
            int iM40825I = m40825I(bArr, iM40828L, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40828L = m40828L(bArr, iM40825I, c15617b);
            dlaVar.Z1(jf3.m33682c(c15617b.f37087b));
        }
        return iM40828L;
    }

    /* renamed from: C */
    public static int m40819C(byte[] bArr, int i, C15617b c15617b) throws ct8 {
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a;
        if (i2 < 0) {
            throw ct8.m21769g();
        }
        if (i2 == 0) {
            c15617b.f37088c = "";
            return iM40825I;
        }
        c15617b.f37088c = new String(bArr, iM40825I, i2, yn8.f55724a);
        return iM40825I + i2;
    }

    /* renamed from: D */
    public static int m40820D(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        int iM40825I = m40825I(bArr, i2, c15617b);
        int i4 = c15617b.f37086a;
        if (i4 < 0) {
            throw ct8.m21769g();
        }
        if (i4 == 0) {
            interfaceC18446j.add("");
        } else {
            interfaceC18446j.add(new String(bArr, iM40825I, i4, yn8.f55724a));
            iM40825I += i4;
        }
        while (iM40825I < i3) {
            int iM40825I2 = m40825I(bArr, iM40825I, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40825I = m40825I(bArr, iM40825I2, c15617b);
            int i5 = c15617b.f37086a;
            if (i5 < 0) {
                throw ct8.m21769g();
            }
            if (i5 == 0) {
                interfaceC18446j.add("");
            } else {
                interfaceC18446j.add(new String(bArr, iM40825I, i5, yn8.f55724a));
                iM40825I += i5;
            }
        }
        return iM40825I;
    }

    /* renamed from: E */
    public static int m40821E(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        int iM40825I = m40825I(bArr, i2, c15617b);
        int i4 = c15617b.f37086a;
        if (i4 < 0) {
            throw ct8.m21769g();
        }
        if (i4 == 0) {
            interfaceC18446j.add("");
        } else {
            int i5 = iM40825I + i4;
            if (!jqi.m34303t(bArr, iM40825I, i5)) {
                throw ct8.m21766d();
            }
            interfaceC18446j.add(new String(bArr, iM40825I, i4, yn8.f55724a));
            iM40825I = i5;
        }
        while (iM40825I < i3) {
            int iM40825I2 = m40825I(bArr, iM40825I, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40825I = m40825I(bArr, iM40825I2, c15617b);
            int i6 = c15617b.f37086a;
            if (i6 < 0) {
                throw ct8.m21769g();
            }
            if (i6 == 0) {
                interfaceC18446j.add("");
            } else {
                int i7 = iM40825I + i6;
                if (!jqi.m34303t(bArr, iM40825I, i7)) {
                    throw ct8.m21766d();
                }
                interfaceC18446j.add(new String(bArr, iM40825I, i6, yn8.f55724a));
                iM40825I = i7;
            }
        }
        return iM40825I;
    }

    /* renamed from: F */
    public static int m40822F(byte[] bArr, int i, C15617b c15617b) throws ct8 {
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a;
        if (i2 < 0) {
            throw ct8.m21769g();
        }
        if (i2 == 0) {
            c15617b.f37088c = "";
            return iM40825I;
        }
        c15617b.f37088c = jqi.m34291h(bArr, iM40825I, i2);
        return iM40825I + i2;
    }

    /* renamed from: G */
    public static int m40823G(int i, byte[] bArr, int i2, int i3, l4i l4iVar, C15617b c15617b) throws ct8 {
        if (fbj.m26425a(i) == 0) {
            throw ct8.m21765c();
        }
        int iM26426b = fbj.m26426b(i);
        if (iM26426b == 0) {
            int iM40828L = m40828L(bArr, i2, c15617b);
            l4iVar.m36580q(i, Long.valueOf(c15617b.f37087b));
            return iM40828L;
        }
        if (iM26426b == 1) {
            l4iVar.m36580q(i, Long.valueOf(m40840j(bArr, i2)));
            return i2 + 8;
        }
        if (iM26426b == 2) {
            int iM40825I = m40825I(bArr, i2, c15617b);
            int i4 = c15617b.f37086a;
            if (i4 < 0) {
                throw ct8.m21769g();
            }
            if (i4 > bArr.length - iM40825I) {
                throw ct8.m21773m();
            }
            if (i4 == 0) {
                l4iVar.m36580q(i, xq1.f54049b);
            } else {
                l4iVar.m36580q(i, xq1.m56588p(bArr, iM40825I, i4));
            }
            return iM40825I + i4;
        }
        if (iM26426b != 3) {
            if (iM26426b != 5) {
                throw ct8.m21765c();
            }
            l4iVar.m36580q(i, Integer.valueOf(m40838h(bArr, i2)));
            return i2 + 4;
        }
        l4i l4iVarM36566n = l4i.m36566n();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM40825I2 = m40825I(bArr, i2, c15617b);
            int i7 = c15617b.f37086a;
            if (i7 == i5) {
                i6 = i7;
                i2 = iM40825I2;
                break;
            }
            i6 = i7;
            i2 = m40823G(i7, bArr, iM40825I2, i3, l4iVarM36566n, c15617b);
        }
        if (i2 > i3 || i6 != i5) {
            throw ct8.m21770h();
        }
        l4iVar.m36580q(i, l4iVarM36566n);
        return i2;
    }

    /* renamed from: H */
    public static int m40824H(int i, byte[] bArr, int i2, C15617b c15617b) {
        int i3 = i & Opcodes.LAND;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c15617b.f37086a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c15617b.f37086a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c15617b.f37086a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c15617b.f37086a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c15617b.f37086a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: I */
    public static int m40825I(byte[] bArr, int i, C15617b c15617b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m40824H(b, bArr, i2, c15617b);
        }
        c15617b.f37086a = b;
        return i2;
    }

    /* renamed from: J */
    public static int m40826J(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        zk8 zk8Var = (zk8) interfaceC18446j;
        int iM40825I = m40825I(bArr, i2, c15617b);
        zk8Var.R1(c15617b.f37086a);
        while (iM40825I < i3) {
            int iM40825I2 = m40825I(bArr, iM40825I, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40825I = m40825I(bArr, iM40825I2, c15617b);
            zk8Var.R1(c15617b.f37086a);
        }
        return iM40825I;
    }

    /* renamed from: K */
    public static int m40827K(long j, byte[] bArr, int i, C15617b c15617b) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= (b2 & 127) << i3;
            i2 = i4;
            b = b2;
        }
        c15617b.f37087b = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m40828L(byte[] bArr, int i, C15617b c15617b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return m40827K(j, bArr, i2, c15617b);
        }
        c15617b.f37087b = j;
        return i2;
    }

    /* renamed from: M */
    public static int m40829M(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        dla dlaVar = (dla) interfaceC18446j;
        int iM40828L = m40828L(bArr, i2, c15617b);
        dlaVar.Z1(c15617b.f37087b);
        while (iM40828L < i3) {
            int iM40825I = m40825I(bArr, iM40828L, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40828L = m40828L(bArr, iM40825I, c15617b);
            dlaVar.Z1(c15617b.f37087b);
        }
        return iM40828L;
    }

    /* renamed from: N */
    public static int m40830N(int i, byte[] bArr, int i2, int i3, C15617b c15617b) throws ct8 {
        if (fbj.m26425a(i) == 0) {
            throw ct8.m21765c();
        }
        int iM26426b = fbj.m26426b(i);
        if (iM26426b == 0) {
            return m40828L(bArr, i2, c15617b);
        }
        if (iM26426b == 1) {
            return i2 + 8;
        }
        if (iM26426b == 2) {
            return m40825I(bArr, i2, c15617b) + c15617b.f37086a;
        }
        if (iM26426b != 3) {
            if (iM26426b == 5) {
                return i2 + 4;
            }
            throw ct8.m21765c();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = m40825I(bArr, i2, c15617b);
            i5 = c15617b.f37086a;
            if (i5 == i4) {
                break;
            }
            i2 = m40830N(i5, bArr, i2, i3, c15617b);
        }
        if (i2 > i3 || i5 != i4) {
            throw ct8.m21770h();
        }
        return i2;
    }

    /* renamed from: a */
    public static int m40831a(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        dk1 dk1Var = (dk1) interfaceC18446j;
        int iM40828L = m40828L(bArr, i2, c15617b);
        dk1Var.m23347j(c15617b.f37087b != 0);
        while (iM40828L < i3) {
            int iM40825I = m40825I(bArr, iM40828L, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40828L = m40828L(bArr, iM40825I, c15617b);
            dk1Var.m23347j(c15617b.f37087b != 0);
        }
        return iM40828L;
    }

    /* renamed from: b */
    public static int m40832b(byte[] bArr, int i, C15617b c15617b) throws ct8 {
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a;
        if (i2 < 0) {
            throw ct8.m21769g();
        }
        if (i2 > bArr.length - iM40825I) {
            throw ct8.m21773m();
        }
        if (i2 == 0) {
            c15617b.f37088c = xq1.f54049b;
            return iM40825I;
        }
        c15617b.f37088c = xq1.m56588p(bArr, iM40825I, i2);
        return iM40825I + i2;
    }

    /* renamed from: c */
    public static int m40833c(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        int iM40825I = m40825I(bArr, i2, c15617b);
        int i4 = c15617b.f37086a;
        if (i4 < 0) {
            throw ct8.m21769g();
        }
        if (i4 > bArr.length - iM40825I) {
            throw ct8.m21773m();
        }
        if (i4 == 0) {
            interfaceC18446j.add(xq1.f54049b);
        } else {
            interfaceC18446j.add(xq1.m56588p(bArr, iM40825I, i4));
            iM40825I += i4;
        }
        while (iM40825I < i3) {
            int iM40825I2 = m40825I(bArr, iM40825I, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40825I = m40825I(bArr, iM40825I2, c15617b);
            int i5 = c15617b.f37086a;
            if (i5 < 0) {
                throw ct8.m21769g();
            }
            if (i5 > bArr.length - iM40825I) {
                throw ct8.m21773m();
            }
            if (i5 == 0) {
                interfaceC18446j.add(xq1.f54049b);
            } else {
                interfaceC18446j.add(xq1.m56588p(bArr, iM40825I, i5));
                iM40825I += i5;
            }
        }
        return iM40825I;
    }

    /* renamed from: d */
    public static double m40834d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m40840j(bArr, i));
    }

    /* renamed from: e */
    public static int m40835e(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        ax5 ax5Var = (ax5) interfaceC18446j;
        ax5Var.m2(m40834d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM40825I = m40825I(bArr, i4, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            ax5Var.m2(m40834d(bArr, iM40825I));
            i4 = iM40825I + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public static int m40836f(int i, byte[] bArr, int i2, int i3, wn7.AbstractC17937d abstractC17937d, wn7.C17939f c17939f, j4i j4iVar, C15617b c15617b) throws ct8 {
        Object objM27502i;
        fu6 fu6Var = abstractC17937d.extensions;
        int i4 = i >>> 3;
        if (c17939f.f52387d.mo27516k() && c17939f.f52387d.isPacked()) {
            switch (C15616a.f37085a[c17939f.m54741c().ordinal()]) {
                case 1:
                    ax5 ax5Var = new ax5();
                    int iM40849s = m40849s(bArr, i2, ax5Var, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, ax5Var);
                    return iM40849s;
                case 2:
                    b37 b37Var = new b37();
                    int iM40852v = m40852v(bArr, i2, b37Var, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, b37Var);
                    return iM40852v;
                case 3:
                case 4:
                    dla dlaVar = new dla();
                    int iM40856z = m40856z(bArr, i2, dlaVar, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, dlaVar);
                    return iM40856z;
                case 5:
                case 6:
                    zk8 zk8Var = new zk8();
                    int iM40855y = m40855y(bArr, i2, zk8Var, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, zk8Var);
                    return iM40855y;
                case 7:
                case 8:
                    dla dlaVar2 = new dla();
                    int iM40851u = m40851u(bArr, i2, dlaVar2, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, dlaVar2);
                    return iM40851u;
                case 9:
                case 10:
                    zk8 zk8Var2 = new zk8();
                    int iM40850t = m40850t(bArr, i2, zk8Var2, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, zk8Var2);
                    return iM40850t;
                case 11:
                    dk1 dk1Var = new dk1();
                    int iM40848r = m40848r(bArr, i2, dk1Var, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, dk1Var);
                    return iM40848r;
                case 12:
                    zk8 zk8Var3 = new zk8();
                    int iM40853w = m40853w(bArr, i2, zk8Var3, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, zk8Var3);
                    return iM40853w;
                case 13:
                    dla dlaVar3 = new dla();
                    int iM40854x = m40854x(bArr, i2, dlaVar3, c15617b);
                    fu6Var.m27513x(c17939f.f52387d, dlaVar3);
                    return iM40854x;
                case 14:
                    zk8 zk8Var4 = new zk8();
                    int iM40855y2 = m40855y(bArr, i2, zk8Var4, c15617b);
                    l4i l4iVar = abstractC17937d.unknownFields;
                    l4i l4iVar2 = (l4i) y5f.m57293z(i4, zk8Var4, c17939f.f52387d.m54739c(), l4iVar != l4i.m36562c() ? l4iVar : null, j4iVar);
                    if (l4iVar2 != null) {
                        abstractC17937d.unknownFields = l4iVar2;
                    }
                    fu6Var.m27513x(c17939f.f52387d, zk8Var4);
                    return iM40855y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c17939f.f52387d.mo27517l());
            }
        }
        if (c17939f.m54741c() != fbj.EnumC13396b.ENUM) {
            switch (C15616a.f37085a[c17939f.m54741c().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(m40834d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(m40842l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = m40828L(bArr, i2, c15617b);
                    objValueOf = Long.valueOf(c15617b.f37087b);
                    break;
                case 5:
                case 6:
                    i2 = m40825I(bArr, i2, c15617b);
                    objValueOf = Integer.valueOf(c15617b.f37086a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(m40840j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(m40838h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = m40828L(bArr, i2, c15617b);
                    objValueOf = Boolean.valueOf(c15617b.f37087b != 0);
                    break;
                case 12:
                    i2 = m40825I(bArr, i2, c15617b);
                    objValueOf = Integer.valueOf(jf3.m33681b(c15617b.f37086a));
                    break;
                case 13:
                    i2 = m40828L(bArr, i2, c15617b);
                    objValueOf = Long.valueOf(jf3.m33682c(c15617b.f37087b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = m40832b(bArr, i2, c15617b);
                    objValueOf = c15617b.f37088c;
                    break;
                case 16:
                    i2 = m40819C(bArr, i2, c15617b);
                    objValueOf = c15617b.f37088c;
                    break;
                case 17:
                    i2 = m40844n(v1e.m52231a().m52234d(c17939f.m54742d().getClass()), bArr, i2, i3, (i4 << 3) | 4, c15617b);
                    objValueOf = c15617b.f37088c;
                    break;
                case 18:
                    i2 = m40846p(v1e.m52231a().m52234d(c17939f.m54742d().getClass()), bArr, i2, i3, c15617b);
                    objValueOf = c15617b.f37088c;
                    break;
            }
        } else {
            i2 = m40825I(bArr, i2, c15617b);
            if (c17939f.f52387d.m54739c().findValueByNumber(c15617b.f37086a) == null) {
                l4i l4iVarM36566n = abstractC17937d.unknownFields;
                if (l4iVarM36566n == l4i.m36562c()) {
                    l4iVarM36566n = l4i.m36566n();
                    abstractC17937d.unknownFields = l4iVarM36566n;
                }
                y5f.m57253L(i4, c15617b.f37086a, l4iVarM36566n, j4iVar);
                return i2;
            }
            objValueOf = Integer.valueOf(c15617b.f37086a);
        }
        if (c17939f.m54744f()) {
            fu6Var.m27499a(c17939f.f52387d, objValueOf);
        } else {
            int i5 = C15616a.f37085a[c17939f.m54741c().ordinal()];
            if ((i5 == 17 || i5 == 18) && (objM27502i = fu6Var.m27502i(c17939f.f52387d)) != null) {
                objValueOf = yn8.m58019h(objM27502i, objValueOf);
            }
            fu6Var.m27513x(c17939f.f52387d, objValueOf);
        }
        return i2;
    }

    /* renamed from: g */
    public static int m40837g(int i, byte[] bArr, int i2, int i3, Object obj, scb scbVar, j4i j4iVar, C15617b c15617b) {
        wn7.C17939f c17939fM45752b = c15617b.f37089d.m45752b(scbVar, i >>> 3);
        if (c17939fM45752b == null) {
            return m40823G(i, bArr, i2, i3, xcb.m55996w(obj), c15617b);
        }
        wn7.AbstractC17937d abstractC17937d = (wn7.AbstractC17937d) obj;
        abstractC17937d.m54737g();
        return m40836f(i, bArr, i2, i3, abstractC17937d, c17939fM45752b, j4iVar, c15617b);
    }

    /* renamed from: h */
    public static int m40838h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m40839i(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        zk8 zk8Var = (zk8) interfaceC18446j;
        zk8Var.R1(m40838h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM40825I = m40825I(bArr, i4, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            zk8Var.R1(m40838h(bArr, iM40825I));
            i4 = iM40825I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m40840j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: k */
    public static int m40841k(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        dla dlaVar = (dla) interfaceC18446j;
        dlaVar.Z1(m40840j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM40825I = m40825I(bArr, i4, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            dlaVar.Z1(m40840j(bArr, iM40825I));
            i4 = iM40825I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m40842l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m40838h(bArr, i));
    }

    /* renamed from: m */
    public static int m40843m(int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        b37 b37Var = (b37) interfaceC18446j;
        b37Var.m18130i(m40842l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM40825I = m40825I(bArr, i4, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            b37Var.m18130i(m40842l(bArr, iM40825I));
            i4 = iM40825I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m40844n(n5f n5fVar, byte[] bArr, int i, int i2, int i3, C15617b c15617b) {
        xcb xcbVar = (xcb) n5fVar;
        Object objMo40126e = xcbVar.mo40126e();
        int iD0 = xcbVar.d0(objMo40126e, bArr, i, i2, i3, c15617b);
        xcbVar.mo40123b(objMo40126e);
        c15617b.f37088c = objMo40126e;
        return iD0;
    }

    /* renamed from: o */
    public static int m40845o(n5f n5fVar, int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) {
        int i4 = (i & (-8)) | 4;
        int iM40844n = m40844n(n5fVar, bArr, i2, i3, i4, c15617b);
        interfaceC18446j.add(c15617b.f37088c);
        while (iM40844n < i3) {
            int iM40825I = m40825I(bArr, iM40844n, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40844n = m40844n(n5fVar, bArr, iM40825I, i3, i4, c15617b);
            interfaceC18446j.add(c15617b.f37088c);
        }
        return iM40844n;
    }

    /* renamed from: p */
    public static int m40846p(n5f n5fVar, byte[] bArr, int i, int i2, C15617b c15617b) throws ct8 {
        int iM40824H = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM40824H = m40824H(i3, bArr, iM40824H, c15617b);
            i3 = c15617b.f37086a;
        }
        int i4 = iM40824H;
        if (i3 < 0 || i3 > i2 - i4) {
            throw ct8.m21773m();
        }
        Object objMo40126e = n5fVar.mo40126e();
        int i5 = i3 + i4;
        n5fVar.mo40130i(objMo40126e, bArr, i4, i5, c15617b);
        n5fVar.mo40123b(objMo40126e);
        c15617b.f37088c = objMo40126e;
        return i5;
    }

    /* renamed from: q */
    public static int m40847q(n5f n5fVar, int i, byte[] bArr, int i2, int i3, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        int iM40846p = m40846p(n5fVar, bArr, i2, i3, c15617b);
        interfaceC18446j.add(c15617b.f37088c);
        while (iM40846p < i3) {
            int iM40825I = m40825I(bArr, iM40846p, c15617b);
            if (i != c15617b.f37086a) {
                break;
            }
            iM40846p = m40846p(n5fVar, bArr, iM40825I, i3, c15617b);
            interfaceC18446j.add(c15617b.f37088c);
        }
        return iM40846p;
    }

    /* renamed from: r */
    public static int m40848r(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        dk1 dk1Var = (dk1) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            iM40825I = m40828L(bArr, iM40825I, c15617b);
            dk1Var.m23347j(c15617b.f37087b != 0);
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: s */
    public static int m40849s(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        ax5 ax5Var = (ax5) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            ax5Var.m2(m40834d(bArr, iM40825I));
            iM40825I += 8;
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: t */
    public static int m40850t(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        zk8 zk8Var = (zk8) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            zk8Var.R1(m40838h(bArr, iM40825I));
            iM40825I += 4;
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: u */
    public static int m40851u(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        dla dlaVar = (dla) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            dlaVar.Z1(m40840j(bArr, iM40825I));
            iM40825I += 8;
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: v */
    public static int m40852v(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        b37 b37Var = (b37) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            b37Var.m18130i(m40842l(bArr, iM40825I));
            iM40825I += 4;
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: w */
    public static int m40853w(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        zk8 zk8Var = (zk8) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            iM40825I = m40825I(bArr, iM40825I, c15617b);
            zk8Var.R1(jf3.m33681b(c15617b.f37086a));
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: x */
    public static int m40854x(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        dla dlaVar = (dla) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            iM40825I = m40828L(bArr, iM40825I, c15617b);
            dlaVar.Z1(jf3.m33682c(c15617b.f37087b));
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: y */
    public static int m40855y(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        zk8 zk8Var = (zk8) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            iM40825I = m40825I(bArr, iM40825I, c15617b);
            zk8Var.R1(c15617b.f37086a);
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }

    /* renamed from: z */
    public static int m40856z(byte[] bArr, int i, yn8.InterfaceC18446j interfaceC18446j, C15617b c15617b) throws ct8 {
        dla dlaVar = (dla) interfaceC18446j;
        int iM40825I = m40825I(bArr, i, c15617b);
        int i2 = c15617b.f37086a + iM40825I;
        while (iM40825I < i2) {
            iM40825I = m40828L(bArr, iM40825I, c15617b);
            dlaVar.Z1(c15617b.f37087b);
        }
        if (iM40825I == i2) {
            return iM40825I;
        }
        throw ct8.m21773m();
    }
}
