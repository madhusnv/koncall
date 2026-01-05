package p001o;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.cd4;

/* loaded from: classes2.dex */
public final class xe2 extends bf2 {

    /* renamed from: i */
    public final int f53586i;

    /* renamed from: j */
    public final int f53587j;

    /* renamed from: k */
    public final int f53588k;

    /* renamed from: l */
    public final long f53589l;

    /* renamed from: o */
    public List f53592o;

    /* renamed from: p */
    public List f53593p;

    /* renamed from: q */
    public int f53594q;

    /* renamed from: r */
    public int f53595r;

    /* renamed from: s */
    public boolean f53596s;

    /* renamed from: t */
    public boolean f53597t;

    /* renamed from: u */
    public byte f53598u;

    /* renamed from: v */
    public byte f53599v;

    /* renamed from: x */
    public boolean f53601x;

    /* renamed from: y */
    public long f53602y;

    /* renamed from: z */
    public static final int[] f53584z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A */
    public static final int[] f53577A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B */
    public static final int[] f53578B = {-1, -16711936, -16776961, -16711681, Opcodes.V_PREVIEW, -256, -65281};

    /* renamed from: C */
    public static final int[] f53579C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, Opcodes.FMUL, Opcodes.DMUL, 108, Opcodes.LDIV, 110, Opcodes.DDIV, 112, Opcodes.LREM, Opcodes.FREM, Opcodes.DREM, 116, Opcodes.LNEG, Opcodes.FNEG, Opcodes.DNEG, 120, Opcodes.LSHL, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D */
    public static final int[] f53580D = {Opcodes.FRETURN, Opcodes.ARETURN, Opcodes.ANEWARRAY, Opcodes.ATHROW, 8482, Opcodes.IF_ICMPGE, Opcodes.IF_ICMPGT, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E */
    public static final int[] f53581E = {Opcodes.INSTANCEOF, 201, 211, 218, 220, 252, 8216, Opcodes.IF_ICMPLT, 42, 39, 8212, Opcodes.RET, 8480, 8226, 8220, 8221, Opcodes.CHECKCAST, Opcodes.MONITORENTER, Opcodes.IFNONNULL, 200, 202, 203, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, 239, 212, 217, 249, 219, Opcodes.LOOKUPSWITCH, Opcodes.NEW};

    /* renamed from: F */
    public static final int[] f53582F = {Opcodes.MONITOREXIT, 227, HttpStatus.SC_RESET_CONTENT, 204, 236, 210, 242, 213, 245, Opcodes.LSHR, Opcodes.LUSHR, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, Opcodes.IF_ACMPEQ, Opcodes.IF_ICMPLE, 9474, Opcodes.MULTIANEWARRAY, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G */
    public static final boolean[] f53583G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h */
    public final zwc f53585h = new zwc();

    /* renamed from: m */
    public final ArrayList f53590m = new ArrayList();

    /* renamed from: n */
    public C18121a f53591n = new C18121a(0, 4);

    /* renamed from: w */
    public int f53600w = 0;

    /* renamed from: o.xe2$a */
    public static final class C18121a {

        /* renamed from: a */
        public final List f53603a = new ArrayList();

        /* renamed from: b */
        public final List f53604b = new ArrayList();

        /* renamed from: c */
        public final StringBuilder f53605c = new StringBuilder();

        /* renamed from: d */
        public int f53606d;

        /* renamed from: e */
        public int f53607e;

        /* renamed from: f */
        public int f53608f;

        /* renamed from: g */
        public int f53609g;

        /* renamed from: h */
        public int f53610h;

        /* renamed from: o.xe2$a$a */
        public static class a {

            /* renamed from: a */
            public final int f53611a;

            /* renamed from: b */
            public final boolean f53612b;

            /* renamed from: c */
            public int f53613c;

            public a(int i, boolean z, int i2) {
                this.f53611a = i;
                this.f53612b = z;
                this.f53613c = i2;
            }
        }

        public C18121a(int i, int i2) {
            m56142j(i);
            this.f53610h = i2;
        }

        /* renamed from: n */
        public static void m56134n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        /* renamed from: o */
        public static void m56135o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: q */
        public static void m56136q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: e */
        public void m56137e(char c) {
            if (this.f53605c.length() < 32) {
                this.f53605c.append(c);
            }
        }

        /* renamed from: f */
        public void m56138f() {
            int length = this.f53605c.length();
            if (length > 0) {
                this.f53605c.delete(length - 1, length);
                for (int size = this.f53603a.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f53603a.get(size);
                    int i = aVar.f53613c;
                    if (i != length) {
                        return;
                    }
                    aVar.f53613c = i - 1;
                }
            }
        }

        /* renamed from: g */
        public cd4 m56139g(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.f53604b.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.f53604b.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m56140h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.f53607e + this.f53608f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f53609g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.f53609g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.f53606d;
            if (i5 > 7) {
                i5 = (i5 - 15) - 2;
            } else if (this.f53609g == 1) {
                i5 -= this.f53610h - 1;
            }
            return new cd4.C12641b().m20933o(spannableStringBuilder).m20934p(Layout.Alignment.ALIGN_NORMAL).m20926h(i5, 1).m20929k(f).m20930l(i).m20919a();
        }

        /* renamed from: h */
        public final SpannableString m56140h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f53605c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f53603a.size()) {
                a aVar = (a) this.f53603a.get(i5);
                boolean z2 = aVar.f53612b;
                int i7 = aVar.f53611a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = xe2.f53578B[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f53613c;
                i5++;
                if (i8 != (i5 < this.f53603a.size() ? ((a) this.f53603a.get(i5)).f53613c : length)) {
                    if (i != -1 && !z2) {
                        m56136q(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        m56135o(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        m56134n(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                m56136q(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                m56135o(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                m56134n(spannableStringBuilder, i6, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: i */
        public boolean m56141i() {
            return this.f53603a.isEmpty() && this.f53604b.isEmpty() && this.f53605c.length() == 0;
        }

        /* renamed from: j */
        public void m56142j(int i) {
            this.f53609g = i;
            this.f53603a.clear();
            this.f53604b.clear();
            this.f53605c.setLength(0);
            this.f53606d = 15;
            this.f53607e = 0;
            this.f53608f = 0;
        }

        /* renamed from: k */
        public void m56143k() {
            this.f53604b.add(m56140h());
            this.f53605c.setLength(0);
            this.f53603a.clear();
            int iMin = Math.min(this.f53610h, this.f53606d);
            while (this.f53604b.size() >= iMin) {
                this.f53604b.remove(0);
            }
        }

        /* renamed from: l */
        public void m56144l(int i) {
            this.f53609g = i;
        }

        /* renamed from: m */
        public void m56145m(int i) {
            this.f53610h = i;
        }

        /* renamed from: p */
        public void m56146p(int i, boolean z) {
            this.f53603a.add(new a(i, z, this.f53605c.length()));
        }
    }

    public xe2(String str, int i, long j) {
        if (j != -9223372036854775807L) {
            op0.m42511a(j >= 16000);
            this.f53589l = j * 1000;
        } else {
            this.f53589l = -9223372036854775807L;
        }
        this.f53586i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f53588k = 0;
            this.f53587j = 0;
        } else if (i == 2) {
            this.f53588k = 1;
            this.f53587j = 0;
        } else if (i == 3) {
            this.f53588k = 0;
            this.f53587j = 1;
        } else if (i != 4) {
            ria.m46824h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f53588k = 0;
            this.f53587j = 0;
        } else {
            this.f53588k = 1;
            this.f53587j = 1;
        }
        m56123O(0);
        m56122N();
        this.f53601x = true;
        this.f53602y = -9223372036854775807L;
    }

    /* renamed from: B */
    public static boolean m56102B(byte b) {
        return (b & 224) == 0;
    }

    /* renamed from: C */
    public static boolean m56103C(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: D */
    public static boolean m56104D(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: E */
    public static boolean m56105E(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: F */
    public static boolean m56106F(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: G */
    public static boolean m56107G(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: I */
    public static boolean m56108I(byte b) {
        return (b & 246) == 20;
    }

    /* renamed from: J */
    public static boolean m56109J(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: K */
    public static boolean m56110K(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: L */
    public static boolean m56111L(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: r */
    public static char m56113r(byte b) {
        return (char) f53579C[(b & 127) - 32];
    }

    /* renamed from: s */
    public static int m56114s(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: u */
    public static char m56115u(byte b) {
        return (char) f53581E[b & 31];
    }

    /* renamed from: v */
    public static char m56116v(byte b) {
        return (char) f53582F[b & 31];
    }

    /* renamed from: w */
    public static char m56117w(byte b, byte b2) {
        return (b & 1) == 0 ? m56115u(b2) : m56116v(b2);
    }

    /* renamed from: x */
    public static char m56118x(byte b) {
        return (char) f53580D[b & 15];
    }

    /* renamed from: A */
    public final void m56119A(byte b, byte b2) {
        int i = f53584z[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f53591n.f53606d) {
            if (this.f53594q != 1 && !this.f53591n.m56141i()) {
                C18121a c18121a = new C18121a(this.f53594q, this.f53595r);
                this.f53591n = c18121a;
                this.f53590m.add(c18121a);
            }
            this.f53591n.f53606d = i;
        }
        boolean z = (b2 & 16) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.f53591n.m56146p(z ? 8 : i2, z2);
        if (z) {
            this.f53591n.f53607e = f53577A[i2];
        }
    }

    /* renamed from: H */
    public final boolean m56120H(boolean z, byte b, byte b2) {
        if (!z || !m56107G(b)) {
            this.f53597t = false;
        } else {
            if (this.f53597t && this.f53598u == b && this.f53599v == b2) {
                this.f53597t = false;
                return true;
            }
            this.f53597t = true;
            this.f53598u = b;
            this.f53599v = b2;
        }
        return false;
    }

    /* renamed from: M */
    public final void m56121M(byte b, byte b2) {
        if (m56111L(b)) {
            this.f53601x = false;
            return;
        }
        if (m56108I(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        break;
                    default:
                        switch (b2) {
                            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case SignatureVisitor.EXTENDS /* 43 */:
                                this.f53601x = false;
                                break;
                        }
                }
            }
            this.f53601x = true;
        }
    }

    /* renamed from: N */
    public final void m56122N() {
        this.f53591n.m56142j(this.f53594q);
        this.f53590m.clear();
        this.f53590m.add(this.f53591n);
    }

    /* renamed from: O */
    public final void m56123O(int i) {
        int i2 = this.f53594q;
        if (i2 == i) {
            return;
        }
        this.f53594q = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f53590m.size(); i3++) {
                ((C18121a) this.f53590m.get(i3)).m56144l(i);
            }
            return;
        }
        m56122N();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f53592o = Collections.emptyList();
        }
    }

    /* renamed from: P */
    public final void m56124P(int i) {
        this.f53595r = i;
        this.f53591n.m56145m(i);
    }

    /* renamed from: Q */
    public final boolean m56125Q() {
        return (this.f53589l == -9223372036854775807L || this.f53602y == -9223372036854775807L || m18823l() - this.f53602y < this.f53589l) ? false : true;
    }

    /* renamed from: R */
    public final boolean m56126R(byte b) {
        if (m56102B(b)) {
            this.f53600w = m56114s(b);
        }
        return this.f53600w == this.f53588k;
    }

    @Override // p001o.bf2, p001o.hbg
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo18814b(long j) {
        super.mo18814b(j);
    }

    @Override // p001o.bf2, p001o.x75
    public void flush() {
        super.flush();
        this.f53592o = null;
        this.f53593p = null;
        m56123O(0);
        m56124P(4);
        m56122N();
        this.f53596s = false;
        this.f53597t = false;
        this.f53598u = (byte) 0;
        this.f53599v = (byte) 0;
        this.f53600w = 0;
        this.f53601x = true;
        this.f53602y = -9223372036854775807L;
    }

    @Override // p001o.bf2
    /* renamed from: g */
    public gbg mo18818g() {
        List list = this.f53592o;
        this.f53593p = list;
        return new cf2((List) op0.m42515e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // p001o.bf2
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo18819h(mbg mbgVar) {
        ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(mbgVar.f14282d);
        this.f53585h.m60015S(byteBuffer.array(), byteBuffer.limit());
        boolean z = false;
        while (true) {
            int iM60020a = this.f53585h.m60020a();
            int i = this.f53586i;
            if (iM60020a < i) {
                break;
            }
            int iM60004H = i == 2 ? -4 : this.f53585h.m60004H();
            int iM60004H2 = this.f53585h.m60004H();
            int iM60004H3 = this.f53585h.m60004H();
            if ((iM60004H & 2) == 0 && (iM60004H & 1) == this.f53587j) {
                byte b = (byte) (iM60004H2 & Opcodes.LAND);
                byte b2 = (byte) (iM60004H3 & Opcodes.LAND);
                if (b != 0 || b2 != 0) {
                    boolean z2 = this.f53596s;
                    if ((iM60004H & 4) == 4) {
                        boolean[] zArr = f53583G;
                        boolean z3 = zArr[iM60004H2] && zArr[iM60004H3];
                        this.f53596s = z3;
                        if (!m56120H(z3, b, b2)) {
                            if (this.f53596s) {
                                m56121M(b, b2);
                                if (this.f53601x && m56126R(b)) {
                                    if (!m56102B(b)) {
                                        this.f53591n.m56137e(m56113r(b));
                                        if ((b2 & 224) != 0) {
                                            this.f53591n.m56137e(m56113r(b2));
                                        }
                                    } else if (m56109J(b, b2)) {
                                        this.f53591n.m56137e(m56118x(b2));
                                    } else if (m56103C(b, b2)) {
                                        this.f53591n.m56138f();
                                        this.f53591n.m56137e(m56117w(b, b2));
                                    } else if (m56104D(b, b2)) {
                                        m56128y(b2);
                                    } else if (m56106F(b, b2)) {
                                        m56119A(b, b2);
                                    } else if (m56110K(b, b2)) {
                                        this.f53591n.f53608f = b2 - 32;
                                    } else if (m56105E(b, b2)) {
                                        m56129z(b2);
                                    }
                                    z = true;
                                }
                            } else if (z2) {
                                m56122N();
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            int i2 = this.f53594q;
            if (i2 == 1 || i2 == 3) {
                this.f53592o = m56127t();
                this.f53602y = m18823l();
            }
        }
    }

    @Override // p001o.bf2
    /* renamed from: i */
    public /* bridge */ /* synthetic */ mbg mo18817e() {
        return super.mo18817e();
    }

    @Override // p001o.bf2, p001o.x75
    /* renamed from: j */
    public nbg mo16896a() {
        nbg nbgVarM18822k;
        nbg nbgVarMo16896a = super.mo16896a();
        if (nbgVarMo16896a != null) {
            return nbgVarMo16896a;
        }
        if (!m56125Q() || (nbgVarM18822k = m18822k()) == null) {
            return null;
        }
        this.f53592o = Collections.emptyList();
        this.f53602y = -9223372036854775807L;
        nbgVarM18822k.m40292v(m18823l(), mo18818g(), Long.MAX_VALUE);
        return nbgVarM18822k;
    }

    @Override // p001o.bf2
    /* renamed from: m */
    public boolean mo18824m() {
        return this.f53592o != this.f53593p;
    }

    @Override // p001o.bf2
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void mo18815c(mbg mbgVar) {
        super.mo18815c(mbgVar);
    }

    @Override // p001o.bf2, p001o.x75
    public void release() {
    }

    /* renamed from: t */
    public final List m56127t() {
        int size = this.f53590m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            cd4 cd4VarM56139g = ((C18121a) this.f53590m.get(i)).m56139g(Integer.MIN_VALUE);
            arrayList.add(cd4VarM56139g);
            if (cd4VarM56139g != null) {
                iMin = Math.min(iMin, cd4VarM56139g.f17905i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            cd4 cd4Var = (cd4) arrayList.get(i2);
            if (cd4Var != null) {
                if (cd4Var.f17905i != iMin) {
                    cd4Var = (cd4) op0.m42515e(((C18121a) this.f53590m.get(i2)).m56139g(iMin));
                }
                arrayList2.add(cd4Var);
            }
        }
        return arrayList2;
    }

    /* renamed from: y */
    public final void m56128y(byte b) {
        this.f53591n.m56137e(TokenParser.SP);
        this.f53591n.m56146p((b >> 1) & 7, (b & 1) == 1);
    }

    /* renamed from: z */
    public final void m56129z(byte b) {
        if (b == 32) {
            m56123O(2);
            return;
        }
        if (b == 41) {
            m56123O(3);
            return;
        }
        switch (b) {
            case 37:
                m56123O(1);
                m56124P(2);
                break;
            case 38:
                m56123O(1);
                m56124P(3);
                break;
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                m56123O(1);
                m56124P(4);
                break;
            default:
                int i = this.f53594q;
                if (i != 0) {
                    if (b == 33) {
                        this.f53591n.m56138f();
                        break;
                    } else {
                        switch (b) {
                            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                this.f53592o = Collections.emptyList();
                                int i2 = this.f53594q;
                                if (i2 == 1 || i2 == 3) {
                                    m56122N();
                                    break;
                                }
                            case 45:
                                if (i == 1 && !this.f53591n.m56141i()) {
                                    this.f53591n.m56143k();
                                    break;
                                }
                                break;
                            case 46:
                                m56122N();
                                break;
                            case 47:
                                this.f53592o = m56127t();
                                m56122N();
                                break;
                        }
                    }
                }
                break;
        }
    }
}
