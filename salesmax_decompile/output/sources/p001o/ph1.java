package p001o;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p001o.ct8;
import p001o.fbj;
import p001o.nra;

/* loaded from: classes6.dex */
public abstract class ph1 implements mce {

    /* renamed from: o.ph1$a */
    public static /* synthetic */ class C16110a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40056a;

        static {
            int[] iArr = new int[fbj.EnumC13396b.values().length];
            f40056a = iArr;
            try {
                iArr[fbj.EnumC13396b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40056a[fbj.EnumC13396b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40056a[fbj.EnumC13396b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40056a[fbj.EnumC13396b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40056a[fbj.EnumC13396b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40056a[fbj.EnumC13396b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40056a[fbj.EnumC13396b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40056a[fbj.EnumC13396b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40056a[fbj.EnumC13396b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40056a[fbj.EnumC13396b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40056a[fbj.EnumC13396b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40056a[fbj.EnumC13396b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40056a[fbj.EnumC13396b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40056a[fbj.EnumC13396b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40056a[fbj.EnumC13396b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40056a[fbj.EnumC13396b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f40056a[fbj.EnumC13396b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: o.ph1$b */
    public static final class C16111b extends ph1 {

        /* renamed from: a */
        public final boolean f40057a;

        /* renamed from: b */
        public final byte[] f40058b;

        /* renamed from: c */
        public int f40059c;

        /* renamed from: d */
        public final int f40060d;

        /* renamed from: e */
        public int f40061e;

        /* renamed from: f */
        public int f40062f;

        /* renamed from: g */
        public int f40063g;

        public C16111b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f40057a = z;
            this.f40058b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f40059c = iArrayOffset;
            this.f40060d = iArrayOffset;
            this.f40061e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // p001o.mce
        /* renamed from: A */
        public void mo35570A(List list) throws ct8.C12741a {
            a0(list, false);
        }

        @Override // p001o.mce
        /* renamed from: B */
        public void mo35571B(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof b37)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 2) {
                    int iB0 = b0();
                    l0(iB0);
                    int i3 = this.f40059c + iB0;
                    while (this.f40059c < i3) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m43646V())));
                    }
                    return;
                }
                if (iM26426b != 5) {
                    throw ct8.m21767e();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            b37 b37Var = (b37) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 2) {
                int iB02 = b0();
                l0(iB02);
                int i4 = this.f40059c + iB02;
                while (this.f40059c < i4) {
                    b37Var.m18130i(Float.intBitsToFloat(m43646V()));
                }
                return;
            }
            if (iM26426b2 != 5) {
                throw ct8.m21767e();
            }
            do {
                b37Var.m18130i(readFloat());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        @Override // p001o.mce
        /* renamed from: C */
        public boolean mo35572C() throws ct8 {
            int i;
            if (m43641Q() || (i = this.f40062f) == this.f40063g) {
                return false;
            }
            int iM26426b = fbj.m26426b(i);
            if (iM26426b == 0) {
                j0();
                return true;
            }
            if (iM26426b == 1) {
                h0(8);
                return true;
            }
            if (iM26426b == 2) {
                h0(b0());
                return true;
            }
            if (iM26426b == 3) {
                i0();
                return true;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            h0(4);
            return true;
        }

        @Override // p001o.mce
        /* renamed from: D */
        public int mo35573D() throws ct8.C12741a {
            g0(5);
            return m43645U();
        }

        @Override // p001o.mce
        /* renamed from: E */
        public void mo35574E(List list) throws ct8.C12741a {
            int i;
            if (fbj.m26426b(this.f40062f) != 2) {
                throw ct8.m21767e();
            }
            do {
                list.add(mo35607o());
                if (m43641Q()) {
                    return;
                } else {
                    i = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i;
        }

        @Override // p001o.mce
        /* renamed from: F */
        public void mo35575F(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof ax5)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (m43641Q()) {
                            return;
                        } else {
                            i = this.f40059c;
                        }
                    } while (b0() == this.f40062f);
                    this.f40059c = i;
                    return;
                }
                if (iM26426b != 2) {
                    throw ct8.m21767e();
                }
                int iB0 = b0();
                m0(iB0);
                int i3 = this.f40059c + iB0;
                while (this.f40059c < i3) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m43648X())));
                }
                return;
            }
            ax5 ax5Var = (ax5) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 1) {
                do {
                    ax5Var.m2(readDouble());
                    if (m43641Q()) {
                        return;
                    } else {
                        i2 = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i2;
                return;
            }
            if (iM26426b2 != 2) {
                throw ct8.m21767e();
            }
            int iB02 = b0();
            m0(iB02);
            int i4 = this.f40059c + iB02;
            while (this.f40059c < i4) {
                ax5Var.m2(Double.longBitsToDouble(m43648X()));
            }
        }

        @Override // p001o.mce
        /* renamed from: G */
        public long mo35576G() throws ct8.C12741a {
            g0(0);
            return c0();
        }

        @Override // p001o.mce
        /* renamed from: H */
        public String mo35577H() {
            return m43650Z(true);
        }

        @Override // p001o.mce
        /* renamed from: I */
        public Object mo35578I(n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
            g0(3);
            return m43644T(n5fVar, qp6Var);
        }

        @Override // p001o.mce
        /* renamed from: J */
        public void mo35579J(Map map, nra.C15645a c15645a, qp6 qp6Var) throws ct8 {
            g0(2);
            int iB0 = b0();
            e0(iB0);
            int i = this.f40061e;
            this.f40061e = this.f40059c + iB0;
            try {
                Object objM43643S = c15645a.f37206b;
                Object objM43643S2 = c15645a.f37208d;
                while (true) {
                    int iMo35618z = mo35618z();
                    if (iMo35618z == Integer.MAX_VALUE) {
                        map.put(objM43643S, objM43643S2);
                        return;
                    }
                    if (iMo35618z == 1) {
                        objM43643S = m43643S(c15645a.f37205a, null, null);
                    } else if (iMo35618z != 2) {
                        try {
                            if (!mo35572C()) {
                                throw new ct8("Unable to parse map entry.");
                            }
                        } catch (ct8.C12741a unused) {
                            if (!mo35572C()) {
                                throw new ct8("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objM43643S2 = m43643S(c15645a.f37207c, c15645a.f37208d.getClass(), qp6Var);
                    }
                }
            } finally {
                this.f40061e = i;
            }
        }

        @Override // p001o.mce
        /* renamed from: K */
        public Object mo35580K(n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
            g0(2);
            return m43649Y(n5fVar, qp6Var);
        }

        @Override // p001o.mce
        /* renamed from: L */
        public Object mo35581L(Class cls, qp6 qp6Var) throws ct8.C12741a {
            g0(2);
            return m43649Y(v1e.m52231a().m52234d(cls), qp6Var);
        }

        @Override // p001o.mce
        /* renamed from: M */
        public Object mo35582M(Class cls, qp6 qp6Var) throws ct8.C12741a {
            g0(3);
            return m43644T(v1e.m52231a().m52234d(cls), qp6Var);
        }

        @Override // p001o.mce
        /* renamed from: N */
        public void mo35583N(List list, n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
            int i;
            if (fbj.m26426b(this.f40062f) != 2) {
                throw ct8.m21767e();
            }
            int i2 = this.f40062f;
            do {
                list.add(m43649Y(n5fVar, qp6Var));
                if (m43641Q()) {
                    return;
                } else {
                    i = this.f40059c;
                }
            } while (b0() == i2);
            this.f40059c = i;
        }

        @Override // p001o.mce
        /* renamed from: O */
        public void mo35584O(List list, n5f n5fVar, qp6 qp6Var) throws ct8.C12741a {
            int i;
            if (fbj.m26426b(this.f40062f) != 3) {
                throw ct8.m21767e();
            }
            int i2 = this.f40062f;
            do {
                list.add(m43644T(n5fVar, qp6Var));
                if (m43641Q()) {
                    return;
                } else {
                    i = this.f40059c;
                }
            } while (b0() == i2);
            this.f40059c = i;
        }

        /* renamed from: Q */
        public final boolean m43641Q() {
            return this.f40059c == this.f40061e;
        }

        /* renamed from: R */
        public final byte m43642R() throws ct8 {
            int i = this.f40059c;
            if (i == this.f40061e) {
                throw ct8.m21773m();
            }
            byte[] bArr = this.f40058b;
            this.f40059c = i + 1;
            return bArr[i];
        }

        /* renamed from: S */
        public final Object m43643S(fbj.EnumC13396b enumC13396b, Class cls, qp6 qp6Var) {
            switch (C16110a.f40056a[enumC13396b.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo35597e());
                case 2:
                    return mo35607o();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo35603k());
                case 5:
                    return Integer.valueOf(mo35613u());
                case 6:
                    return Long.valueOf(mo35593a());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo35608p());
                case 9:
                    return Long.valueOf(mo35576G());
                case 10:
                    return mo35581L(cls, qp6Var);
                case 11:
                    return Integer.valueOf(mo35573D());
                case 12:
                    return Long.valueOf(mo35598f());
                case 13:
                    return Integer.valueOf(mo35604l());
                case 14:
                    return Long.valueOf(mo35617y());
                case 15:
                    return mo35577H();
                case 16:
                    return Integer.valueOf(mo35600h());
                case 17:
                    return Long.valueOf(mo35611s());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: T */
        public final Object m43644T(n5f n5fVar, qp6 qp6Var) {
            int i = this.f40063g;
            this.f40063g = fbj.m26427c(fbj.m26425a(this.f40062f), 4);
            try {
                Object objMo40126e = n5fVar.mo40126e();
                n5fVar.mo40129h(objMo40126e, this, qp6Var);
                n5fVar.mo40123b(objMo40126e);
                if (this.f40062f == this.f40063g) {
                    return objMo40126e;
                }
                throw ct8.m21770h();
            } finally {
                this.f40063g = i;
            }
        }

        /* renamed from: U */
        public final int m43645U() throws ct8 {
            e0(4);
            return m43646V();
        }

        /* renamed from: V */
        public final int m43646V() {
            int i = this.f40059c;
            byte[] bArr = this.f40058b;
            this.f40059c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: W */
        public final long m43647W() throws ct8 {
            e0(8);
            return m43648X();
        }

        /* renamed from: X */
        public final long m43648X() {
            int i = this.f40059c;
            byte[] bArr = this.f40058b;
            this.f40059c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* renamed from: Y */
        public final Object m43649Y(n5f n5fVar, qp6 qp6Var) throws ct8 {
            int iB0 = b0();
            e0(iB0);
            int i = this.f40061e;
            int i2 = this.f40059c + iB0;
            this.f40061e = i2;
            try {
                Object objMo40126e = n5fVar.mo40126e();
                n5fVar.mo40129h(objMo40126e, this, qp6Var);
                n5fVar.mo40123b(objMo40126e);
                if (this.f40059c == i2) {
                    return objMo40126e;
                }
                throw ct8.m21770h();
            } finally {
                this.f40061e = i;
            }
        }

        /* renamed from: Z */
        public String m43650Z(boolean z) throws ct8 {
            g0(2);
            int iB0 = b0();
            if (iB0 == 0) {
                return "";
            }
            e0(iB0);
            if (z) {
                byte[] bArr = this.f40058b;
                int i = this.f40059c;
                if (!jqi.m34303t(bArr, i, i + iB0)) {
                    throw ct8.m21766d();
                }
            }
            String str = new String(this.f40058b, this.f40059c, iB0, yn8.f55724a);
            this.f40059c += iB0;
            return str;
        }

        @Override // p001o.mce
        /* renamed from: a */
        public long mo35593a() throws ct8.C12741a {
            g0(1);
            return m43647W();
        }

        public void a0(List list, boolean z) throws ct8.C12741a {
            int i;
            int i2;
            if (fbj.m26426b(this.f40062f) != 2) {
                throw ct8.m21767e();
            }
            if (!(list instanceof yi9) || z) {
                do {
                    list.add(m43650Z(z));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            yi9 yi9Var = (yi9) list;
            do {
                yi9Var.z0(mo35607o());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        @Override // p001o.mce
        /* renamed from: b */
        public int mo35594b() {
            return this.f40062f;
        }

        public final int b0() throws ct8 {
            int i;
            int i2 = this.f40059c;
            int i3 = this.f40061e;
            if (i3 == i2) {
                throw ct8.m21773m();
            }
            byte[] bArr = this.f40058b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f40059c = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) d0();
            }
            int i5 = i4 + 1;
            int i6 = b ^ (bArr[i4] << 7);
            if (i6 < 0) {
                i = i6 ^ (-128);
            } else {
                int i7 = i5 + 1;
                int i8 = i6 ^ (bArr[i5] << 14);
                if (i8 >= 0) {
                    i = i8 ^ 16256;
                } else {
                    i5 = i7 + 1;
                    int i9 = i8 ^ (bArr[i7] << 21);
                    if (i9 < 0) {
                        i = i9 ^ (-2080896);
                    } else {
                        i7 = i5 + 1;
                        byte b2 = bArr[i5];
                        i = (i9 ^ (b2 << 28)) ^ 266354560;
                        if (b2 < 0) {
                            i5 = i7 + 1;
                            if (bArr[i7] < 0) {
                                i7 = i5 + 1;
                                if (bArr[i5] < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                throw ct8.m21768f();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i5 = i7;
            }
            this.f40059c = i5;
            return i;
        }

        @Override // p001o.mce
        /* renamed from: c */
        public void mo35595c(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof zk8)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 2) {
                    int iB0 = b0();
                    l0(iB0);
                    int i3 = this.f40059c + iB0;
                    while (this.f40059c < i3) {
                        list.add(Integer.valueOf(m43646V()));
                    }
                    return;
                }
                if (iM26426b != 5) {
                    throw ct8.m21767e();
                }
                do {
                    list.add(Integer.valueOf(mo35573D()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            zk8 zk8Var = (zk8) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 2) {
                int iB02 = b0();
                l0(iB02);
                int i4 = this.f40059c + iB02;
                while (this.f40059c < i4) {
                    zk8Var.R1(m43646V());
                }
                return;
            }
            if (iM26426b2 != 5) {
                throw ct8.m21767e();
            }
            do {
                zk8Var.R1(mo35573D());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        public long c0() throws ct8 {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f40059c;
            int i3 = this.f40061e;
            if (i3 == i2) {
                throw ct8.m21773m();
            }
            byte[] bArr = this.f40058b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f40059c = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return d0();
            }
            int i5 = i4 + 1;
            int i6 = b ^ (bArr[i4] << 7);
            if (i6 >= 0) {
                int i7 = i5 + 1;
                int i8 = i6 ^ (bArr[i5] << 14);
                if (i8 >= 0) {
                    i5 = i7;
                    j = i8 ^ 16256;
                } else {
                    i5 = i7 + 1;
                    int i9 = i8 ^ (bArr[i7] << 21);
                    if (i9 < 0) {
                        i = i9 ^ (-2080896);
                    } else {
                        long j4 = i9;
                        int i10 = i5 + 1;
                        long j5 = j4 ^ (bArr[i5] << 28);
                        if (j5 >= 0) {
                            j3 = 266354560;
                        } else {
                            i5 = i10 + 1;
                            long j6 = j5 ^ (bArr[i10] << 35);
                            if (j6 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i10 = i5 + 1;
                                j5 = j6 ^ (bArr[i5] << 42);
                                if (j5 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i5 = i10 + 1;
                                    j6 = j5 ^ (bArr[i10] << 49);
                                    if (j6 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        int i11 = i5 + 1;
                                        long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                        if (j7 < 0) {
                                            i5 = i11 + 1;
                                            if (bArr[i11] < 0) {
                                                throw ct8.m21768f();
                                            }
                                        } else {
                                            i5 = i11;
                                        }
                                        j = j7;
                                    }
                                }
                            }
                            j = j6 ^ j2;
                        }
                        j = j5 ^ j3;
                        i5 = i10;
                    }
                }
                this.f40059c = i5;
                return j;
            }
            i = i6 ^ (-128);
            j = i;
            this.f40059c = i5;
            return j;
        }

        @Override // p001o.mce
        /* renamed from: d */
        public void mo35596d(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof dla)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b != 0) {
                    if (iM26426b != 2) {
                        throw ct8.m21767e();
                    }
                    int iB0 = this.f40059c + b0();
                    while (this.f40059c < iB0) {
                        list.add(Long.valueOf(jf3.m33682c(c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo35617y()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            dla dlaVar = (dla) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 != 0) {
                if (iM26426b2 != 2) {
                    throw ct8.m21767e();
                }
                int iB02 = this.f40059c + b0();
                while (this.f40059c < iB02) {
                    dlaVar.Z1(jf3.m33682c(c0()));
                }
                return;
            }
            do {
                dlaVar.Z1(mo35617y());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        public final long d0() throws ct8 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & 127) << i;
                if ((m43642R() & 128) == 0) {
                    return j;
                }
            }
            throw ct8.m21768f();
        }

        @Override // p001o.mce
        /* renamed from: e */
        public boolean mo35597e() throws ct8.C12741a {
            g0(0);
            return b0() != 0;
        }

        public final void e0(int i) throws ct8 {
            if (i < 0 || i > this.f40061e - this.f40059c) {
                throw ct8.m21773m();
            }
        }

        @Override // p001o.mce
        /* renamed from: f */
        public long mo35598f() throws ct8.C12741a {
            g0(1);
            return m43647W();
        }

        public final void f0(int i) throws ct8 {
            if (this.f40059c != i) {
                throw ct8.m21773m();
            }
        }

        @Override // p001o.mce
        /* renamed from: g */
        public void mo35599g(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof dla)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 0) {
                    do {
                        list.add(Long.valueOf(mo35611s()));
                        if (m43641Q()) {
                            return;
                        } else {
                            i = this.f40059c;
                        }
                    } while (b0() == this.f40062f);
                    this.f40059c = i;
                    return;
                }
                if (iM26426b != 2) {
                    throw ct8.m21767e();
                }
                int iB0 = this.f40059c + b0();
                while (this.f40059c < iB0) {
                    list.add(Long.valueOf(c0()));
                }
                f0(iB0);
                return;
            }
            dla dlaVar = (dla) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 0) {
                do {
                    dlaVar.Z1(mo35611s());
                    if (m43641Q()) {
                        return;
                    } else {
                        i2 = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i2;
                return;
            }
            if (iM26426b2 != 2) {
                throw ct8.m21767e();
            }
            int iB02 = this.f40059c + b0();
            while (this.f40059c < iB02) {
                dlaVar.Z1(c0());
            }
            f0(iB02);
        }

        public final void g0(int i) throws ct8.C12741a {
            if (fbj.m26426b(this.f40062f) != i) {
                throw ct8.m21767e();
            }
        }

        @Override // p001o.mce
        /* renamed from: h */
        public int mo35600h() throws ct8.C12741a {
            g0(0);
            return b0();
        }

        public final void h0(int i) throws ct8 {
            e0(i);
            this.f40059c += i;
        }

        @Override // p001o.mce
        /* renamed from: i */
        public void mo35601i(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof dla)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 0) {
                    do {
                        list.add(Long.valueOf(mo35576G()));
                        if (m43641Q()) {
                            return;
                        } else {
                            i = this.f40059c;
                        }
                    } while (b0() == this.f40062f);
                    this.f40059c = i;
                    return;
                }
                if (iM26426b != 2) {
                    throw ct8.m21767e();
                }
                int iB0 = this.f40059c + b0();
                while (this.f40059c < iB0) {
                    list.add(Long.valueOf(c0()));
                }
                f0(iB0);
                return;
            }
            dla dlaVar = (dla) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 0) {
                do {
                    dlaVar.Z1(mo35576G());
                    if (m43641Q()) {
                        return;
                    } else {
                        i2 = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i2;
                return;
            }
            if (iM26426b2 != 2) {
                throw ct8.m21767e();
            }
            int iB02 = this.f40059c + b0();
            while (this.f40059c < iB02) {
                dlaVar.Z1(c0());
            }
            f0(iB02);
        }

        public final void i0() throws ct8 {
            int i = this.f40063g;
            this.f40063g = fbj.m26427c(fbj.m26425a(this.f40062f), 4);
            while (mo35618z() != Integer.MAX_VALUE && mo35572C()) {
            }
            if (this.f40062f != this.f40063g) {
                throw ct8.m21770h();
            }
            this.f40063g = i;
        }

        @Override // p001o.mce
        /* renamed from: j */
        public void mo35602j(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof zk8)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b != 0) {
                    if (iM26426b != 2) {
                        throw ct8.m21767e();
                    }
                    int iB0 = this.f40059c + b0();
                    while (this.f40059c < iB0) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo35603k()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            zk8 zk8Var = (zk8) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 != 0) {
                if (iM26426b2 != 2) {
                    throw ct8.m21767e();
                }
                int iB02 = this.f40059c + b0();
                while (this.f40059c < iB02) {
                    zk8Var.R1(b0());
                }
                return;
            }
            do {
                zk8Var.R1(mo35603k());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        public final void j0() throws ct8 {
            int i = this.f40061e;
            int i2 = this.f40059c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f40058b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f40059c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            k0();
        }

        @Override // p001o.mce
        /* renamed from: k */
        public int mo35603k() throws ct8.C12741a {
            g0(0);
            return b0();
        }

        public final void k0() throws ct8 {
            for (int i = 0; i < 10; i++) {
                if (m43642R() >= 0) {
                    return;
                }
            }
            throw ct8.m21768f();
        }

        @Override // p001o.mce
        /* renamed from: l */
        public int mo35604l() throws ct8.C12741a {
            g0(0);
            return jf3.m33681b(b0());
        }

        public final void l0(int i) throws ct8 {
            e0(i);
            if ((i & 3) != 0) {
                throw ct8.m21770h();
            }
        }

        @Override // p001o.mce
        /* renamed from: m */
        public void mo35605m(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof dk1)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b != 0) {
                    if (iM26426b != 2) {
                        throw ct8.m21767e();
                    }
                    int iB0 = this.f40059c + b0();
                    while (this.f40059c < iB0) {
                        list.add(Boolean.valueOf(b0() != 0));
                    }
                    f0(iB0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(mo35597e()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            dk1 dk1Var = (dk1) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 != 0) {
                if (iM26426b2 != 2) {
                    throw ct8.m21767e();
                }
                int iB02 = this.f40059c + b0();
                while (this.f40059c < iB02) {
                    dk1Var.m23347j(b0() != 0);
                }
                f0(iB02);
                return;
            }
            do {
                dk1Var.m23347j(mo35597e());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        public final void m0(int i) throws ct8 {
            e0(i);
            if ((i & 7) != 0) {
                throw ct8.m21770h();
            }
        }

        @Override // p001o.mce
        /* renamed from: n */
        public void mo35606n(List list) throws ct8.C12741a {
            a0(list, true);
        }

        @Override // p001o.mce
        /* renamed from: o */
        public xq1 mo35607o() throws ct8 {
            g0(2);
            int iB0 = b0();
            if (iB0 == 0) {
                return xq1.f54049b;
            }
            e0(iB0);
            xq1 xq1VarM56581S = this.f40057a ? xq1.m56581S(this.f40058b, this.f40059c, iB0) : xq1.m56588p(this.f40058b, this.f40059c, iB0);
            this.f40059c += iB0;
            return xq1VarM56581S;
        }

        @Override // p001o.mce
        /* renamed from: p */
        public int mo35608p() throws ct8.C12741a {
            g0(0);
            return b0();
        }

        @Override // p001o.mce
        /* renamed from: q */
        public void mo35609q(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof dla)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 1) {
                    do {
                        list.add(Long.valueOf(mo35593a()));
                        if (m43641Q()) {
                            return;
                        } else {
                            i = this.f40059c;
                        }
                    } while (b0() == this.f40062f);
                    this.f40059c = i;
                    return;
                }
                if (iM26426b != 2) {
                    throw ct8.m21767e();
                }
                int iB0 = b0();
                m0(iB0);
                int i3 = this.f40059c + iB0;
                while (this.f40059c < i3) {
                    list.add(Long.valueOf(m43648X()));
                }
                return;
            }
            dla dlaVar = (dla) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 1) {
                do {
                    dlaVar.Z1(mo35593a());
                    if (m43641Q()) {
                        return;
                    } else {
                        i2 = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i2;
                return;
            }
            if (iM26426b2 != 2) {
                throw ct8.m21767e();
            }
            int iB02 = b0();
            m0(iB02);
            int i4 = this.f40059c + iB02;
            while (this.f40059c < i4) {
                dlaVar.Z1(m43648X());
            }
        }

        @Override // p001o.mce
        /* renamed from: r */
        public void mo35610r(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof zk8)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b != 0) {
                    if (iM26426b != 2) {
                        throw ct8.m21767e();
                    }
                    int iB0 = this.f40059c + b0();
                    while (this.f40059c < iB0) {
                        list.add(Integer.valueOf(jf3.m33681b(b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo35604l()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            zk8 zk8Var = (zk8) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 != 0) {
                if (iM26426b2 != 2) {
                    throw ct8.m21767e();
                }
                int iB02 = this.f40059c + b0();
                while (this.f40059c < iB02) {
                    zk8Var.R1(jf3.m33681b(b0()));
                }
                return;
            }
            do {
                zk8Var.R1(mo35604l());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        @Override // p001o.mce
        public double readDouble() throws ct8.C12741a {
            g0(1);
            return Double.longBitsToDouble(m43647W());
        }

        @Override // p001o.mce
        public float readFloat() throws ct8.C12741a {
            g0(5);
            return Float.intBitsToFloat(m43645U());
        }

        @Override // p001o.mce
        public String readString() {
            return m43650Z(false);
        }

        @Override // p001o.mce
        /* renamed from: s */
        public long mo35611s() throws ct8.C12741a {
            g0(0);
            return c0();
        }

        @Override // p001o.mce
        /* renamed from: t */
        public void mo35612t(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof zk8)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b != 0) {
                    if (iM26426b != 2) {
                        throw ct8.m21767e();
                    }
                    int iB0 = this.f40059c + b0();
                    while (this.f40059c < iB0) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo35600h()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            zk8 zk8Var = (zk8) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 != 0) {
                if (iM26426b2 != 2) {
                    throw ct8.m21767e();
                }
                int iB02 = this.f40059c + b0();
                while (this.f40059c < iB02) {
                    zk8Var.R1(b0());
                }
                return;
            }
            do {
                zk8Var.R1(mo35600h());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        @Override // p001o.mce
        /* renamed from: u */
        public int mo35613u() throws ct8.C12741a {
            g0(5);
            return m43645U();
        }

        @Override // p001o.mce
        /* renamed from: v */
        public void mo35614v(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof dla)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 1) {
                    do {
                        list.add(Long.valueOf(mo35598f()));
                        if (m43641Q()) {
                            return;
                        } else {
                            i = this.f40059c;
                        }
                    } while (b0() == this.f40062f);
                    this.f40059c = i;
                    return;
                }
                if (iM26426b != 2) {
                    throw ct8.m21767e();
                }
                int iB0 = b0();
                m0(iB0);
                int i3 = this.f40059c + iB0;
                while (this.f40059c < i3) {
                    list.add(Long.valueOf(m43648X()));
                }
                return;
            }
            dla dlaVar = (dla) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 1) {
                do {
                    dlaVar.Z1(mo35598f());
                    if (m43641Q()) {
                        return;
                    } else {
                        i2 = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i2;
                return;
            }
            if (iM26426b2 != 2) {
                throw ct8.m21767e();
            }
            int iB02 = b0();
            m0(iB02);
            int i4 = this.f40059c + iB02;
            while (this.f40059c < i4) {
                dlaVar.Z1(m43648X());
            }
        }

        @Override // p001o.mce
        /* renamed from: w */
        public void mo35615w(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof zk8)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 0) {
                    do {
                        list.add(Integer.valueOf(mo35608p()));
                        if (m43641Q()) {
                            return;
                        } else {
                            i = this.f40059c;
                        }
                    } while (b0() == this.f40062f);
                    this.f40059c = i;
                    return;
                }
                if (iM26426b != 2) {
                    throw ct8.m21767e();
                }
                int iB0 = this.f40059c + b0();
                while (this.f40059c < iB0) {
                    list.add(Integer.valueOf(b0()));
                }
                f0(iB0);
                return;
            }
            zk8 zk8Var = (zk8) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 0) {
                do {
                    zk8Var.R1(mo35608p());
                    if (m43641Q()) {
                        return;
                    } else {
                        i2 = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i2;
                return;
            }
            if (iM26426b2 != 2) {
                throw ct8.m21767e();
            }
            int iB02 = this.f40059c + b0();
            while (this.f40059c < iB02) {
                zk8Var.R1(b0());
            }
            f0(iB02);
        }

        @Override // p001o.mce
        /* renamed from: x */
        public void mo35616x(List list) throws ct8 {
            int i;
            int i2;
            if (!(list instanceof zk8)) {
                int iM26426b = fbj.m26426b(this.f40062f);
                if (iM26426b == 2) {
                    int iB0 = b0();
                    l0(iB0);
                    int i3 = this.f40059c + iB0;
                    while (this.f40059c < i3) {
                        list.add(Integer.valueOf(m43646V()));
                    }
                    return;
                }
                if (iM26426b != 5) {
                    throw ct8.m21767e();
                }
                do {
                    list.add(Integer.valueOf(mo35613u()));
                    if (m43641Q()) {
                        return;
                    } else {
                        i = this.f40059c;
                    }
                } while (b0() == this.f40062f);
                this.f40059c = i;
                return;
            }
            zk8 zk8Var = (zk8) list;
            int iM26426b2 = fbj.m26426b(this.f40062f);
            if (iM26426b2 == 2) {
                int iB02 = b0();
                l0(iB02);
                int i4 = this.f40059c + iB02;
                while (this.f40059c < i4) {
                    zk8Var.R1(m43646V());
                }
                return;
            }
            if (iM26426b2 != 5) {
                throw ct8.m21767e();
            }
            do {
                zk8Var.R1(mo35613u());
                if (m43641Q()) {
                    return;
                } else {
                    i2 = this.f40059c;
                }
            } while (b0() == this.f40062f);
            this.f40059c = i2;
        }

        @Override // p001o.mce
        /* renamed from: y */
        public long mo35617y() throws ct8.C12741a {
            g0(0);
            return jf3.m33682c(c0());
        }

        @Override // p001o.mce
        /* renamed from: z */
        public int mo35618z() throws ct8 {
            if (m43641Q()) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int iB0 = b0();
            this.f40062f = iB0;
            return iB0 == this.f40063g ? Api.BaseClientBuilder.API_PRIORITY_OTHER : fbj.m26425a(iB0);
        }
    }

    public ph1() {
    }

    public /* synthetic */ ph1(C16110a c16110a) {
        this();
    }

    /* renamed from: P */
    public static ph1 m43640P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C16111b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
