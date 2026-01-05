package p001o;

import com.google.firebase.messaging.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class zq1 implements Serializable, Comparable {

    /* renamed from: d */
    public static final C18692a f57497d = new C18692a(null);

    /* renamed from: e */
    public static final zq1 f57498e = new zq1(new byte[0]);

    /* renamed from: a */
    public final byte[] f57499a;

    /* renamed from: b */
    public transient int f57500b;

    /* renamed from: c */
    public transient String f57501c;

    /* renamed from: o.zq1$a */
    public static final class C18692a {
        public C18692a() {
        }

        public /* synthetic */ C18692a(id5 id5Var) {
            this();
        }

        /* renamed from: f */
        public static /* synthetic */ zq1 m59704f(C18692a c18692a, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = AbstractC13298f.m25886c();
            }
            return c18692a.m59709e(bArr, i, i2);
        }

        /* renamed from: a */
        public final zq1 m59705a(String str) {
            sq8.m48649h(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((AbstractC12520c.m19990e(str.charAt(i2)) << 4) + AbstractC12520c.m19990e(str.charAt(i2 + 1)));
            }
            return new zq1(bArr);
        }

        /* renamed from: b */
        public final zq1 m59706b(String str, Charset charset) {
            sq8.m48649h(str, "<this>");
            sq8.m48649h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            sq8.m48648g(bytes, "getBytes(...)");
            return new zq1(bytes);
        }

        /* renamed from: c */
        public final zq1 m59707c(String str) {
            sq8.m48649h(str, "<this>");
            zq1 zq1Var = new zq1(xfj.m56226a(str));
            zq1Var.m59691H(str);
            return zq1Var;
        }

        /* renamed from: d */
        public final zq1 m59708d(byte... bArr) {
            sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            sq8.m48648g(bArrCopyOf, "copyOf(...)");
            return new zq1(bArrCopyOf);
        }

        /* renamed from: e */
        public final zq1 m59709e(byte[] bArr, int i, int i2) {
            sq8.m48649h(bArr, "<this>");
            int iM25889f = AbstractC13298f.m25889f(bArr, i2);
            AbstractC13298f.m25885b(bArr.length, i, iM25889f);
            return new zq1(fp0.m27265n(bArr, i, iM25889f + i));
        }

        /* renamed from: g */
        public final zq1 m59710g(InputStream inputStream, int i) throws IOException {
            sq8.m48649h(inputStream, "<this>");
            int i2 = 0;
            if (!(i >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
            }
            byte[] bArr = new byte[i];
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new EOFException();
                }
                i2 += i3;
            }
            return new zq1(bArr);
        }
    }

    public zq1(byte[] bArr) {
        sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f57499a = bArr;
    }

    /* renamed from: C */
    public static /* synthetic */ int m59685C(zq1 zq1Var, zq1 zq1Var2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = AbstractC13298f.m25886c();
        }
        return zq1Var.m59689A(zq1Var2, i);
    }

    /* renamed from: O */
    public static /* synthetic */ zq1 m59686O(zq1 zq1Var, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = AbstractC13298f.m25886c();
        }
        return zq1Var.mo38687N(i, i2);
    }

    /* renamed from: e */
    public static final zq1 m59687e(String str) {
        return f57497d.m59707c(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, SecurityException, IllegalArgumentException {
        zq1 zq1VarM59710g = f57497d.m59710g(objectInputStream, objectInputStream.readInt());
        Field declaredField = zq1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, zq1VarM59710g.f57499a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f57499a.length);
        objectOutputStream.write(this.f57499a);
    }

    /* renamed from: x */
    public static /* synthetic */ int m59688x(zq1 zq1Var, zq1 zq1Var2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return zq1Var.m59703t(zq1Var2, i);
    }

    /* renamed from: A */
    public final int m59689A(zq1 zq1Var, int i) {
        sq8.m48649h(zq1Var, "other");
        return mo38684B(zq1Var.mo38699y(), i);
    }

    /* renamed from: B */
    public int mo38684B(byte[] bArr, int i) {
        sq8.m48649h(bArr, "other");
        for (int iMin = Math.min(AbstractC13298f.m25888e(this, i), m59700j().length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC13298f.m25884a(m59700j(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public boolean mo38685E(int i, zq1 zq1Var, int i2, int i3) {
        sq8.m48649h(zq1Var, "other");
        return zq1Var.mo38686F(i2, m59700j(), i, i3);
    }

    /* renamed from: F */
    public boolean mo38686F(int i, byte[] bArr, int i2, int i3) {
        sq8.m48649h(bArr, "other");
        return i >= 0 && i <= m59700j().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AbstractC13298f.m25884a(m59700j(), i, bArr, i2, i3);
    }

    /* renamed from: G */
    public final void m59690G(int i) {
        this.f57500b = i;
    }

    /* renamed from: H */
    public final void m59691H(String str) {
        this.f57501c = str;
    }

    /* renamed from: I */
    public final zq1 m59692I() {
        return mo38695d("SHA-1");
    }

    /* renamed from: J */
    public final zq1 m59693J() {
        return mo38695d("SHA-256");
    }

    /* renamed from: L */
    public final int m59694L() {
        return mo38696o();
    }

    /* renamed from: M */
    public final boolean m59695M(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "prefix");
        return mo38685E(0, zq1Var, 0, zq1Var.m59694L());
    }

    /* renamed from: N */
    public zq1 mo38687N(int i, int i2) {
        int iM25888e = AbstractC13298f.m25888e(this, i2);
        if (!(i >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iM25888e <= m59700j().length) {
            if (iM25888e - i >= 0) {
                return (i == 0 && iM25888e == m59700j().length) ? this : new zq1(fp0.m27265n(m59700j(), i, iM25888e));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + m59700j().length + ')').toString());
    }

    /* renamed from: P */
    public zq1 mo38688P() {
        for (int i = 0; i < m59700j().length; i++) {
            byte b = m59700j()[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrM59700j = m59700j();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM59700j, bArrM59700j.length);
                sq8.m48648g(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new zq1(bArrCopyOf);
            }
        }
        return this;
    }

    /* renamed from: Q */
    public byte[] mo38689Q() {
        byte[] bArrM59700j = m59700j();
        byte[] bArrCopyOf = Arrays.copyOf(bArrM59700j, bArrM59700j.length);
        sq8.m48648g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* renamed from: R */
    public String m59696R() {
        String strM59702r = m59702r();
        if (strM59702r != null) {
            return strM59702r;
        }
        String strM56228c = xfj.m56228c(mo38699y());
        m59691H(strM56228c);
        return strM56228c;
    }

    /* renamed from: S */
    public void mo38690S(rl1 rl1Var, int i, int i2) {
        sq8.m48649h(rl1Var, "buffer");
        AbstractC12520c.m19989d(this, rl1Var, i, i2);
    }

    /* renamed from: a */
    public String mo38694a() {
        return AbstractC12072a.m16285b(m59700j(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "other");
        int iM59694L = m59694L();
        int iM59694L2 = zq1Var.m59694L();
        int iMin = Math.min(iM59694L, iM59694L2);
        for (int i = 0; i < iMin; i++) {
            int iM59699h = m59699h(i) & 255;
            int iM59699h2 = zq1Var.m59699h(i) & 255;
            if (iM59699h == iM59699h2) {
            }
        }
        if (iM59694L == iM59694L2) {
            return 0;
        }
    }

    /* renamed from: d */
    public zq1 mo38695d(String str) throws NoSuchAlgorithmException {
        sq8.m48649h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f57499a, 0, m59694L());
        byte[] bArrDigest = messageDigest.digest();
        sq8.m48646e(bArrDigest);
        return new zq1(bArrDigest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zq1) {
            zq1 zq1Var = (zq1) obj;
            if (zq1Var.m59694L() == m59700j().length && zq1Var.mo38686F(0, m59700j(), 0, m59700j().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m59698g(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "suffix");
        return mo38685E(m59694L() - zq1Var.m59694L(), zq1Var, 0, zq1Var.m59694L());
    }

    /* renamed from: h */
    public final byte m59699h(int i) {
        return mo38700z(i);
    }

    public int hashCode() {
        int iM59701m = m59701m();
        if (iM59701m != 0) {
            return iM59701m;
        }
        int iHashCode = Arrays.hashCode(m59700j());
        m59690G(iHashCode);
        return iHashCode;
    }

    /* renamed from: j */
    public final byte[] m59700j() {
        return this.f57499a;
    }

    /* renamed from: m */
    public final int m59701m() {
        return this.f57500b;
    }

    /* renamed from: o */
    public int mo38696o() {
        return m59700j().length;
    }

    /* renamed from: r */
    public final String m59702r() {
        return this.f57501c;
    }

    /* renamed from: s */
    public String mo38697s() {
        char[] cArr = new char[m59700j().length * 2];
        int i = 0;
        for (byte b : m59700j()) {
            int i2 = i + 1;
            cArr[i] = AbstractC12520c.m19991f()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = AbstractC12520c.m19991f()[b & 15];
        }
        return e9g.m24598p(cArr);
    }

    /* renamed from: t */
    public final int m59703t(zq1 zq1Var, int i) {
        sq8.m48649h(zq1Var, "other");
        return mo38698u(zq1Var.mo38699y(), i);
    }

    public String toString() {
        String str;
        if (m59700j().length == 0) {
            str = "[size=0]";
        } else {
            int iM19988c = AbstractC12520c.m19988c(m59700j(), 64);
            if (iM19988c != -1) {
                String strM59696R = m59696R();
                String strSubstring = strM59696R.substring(0, iM19988c);
                sq8.m48648g(strSubstring, "substring(...)");
                String strM24593G = e9g.m24593G(e9g.m24593G(e9g.m24593G(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iM19988c >= strM59696R.length()) {
                    return "[text=" + strM24593G + ']';
                }
                return "[size=" + m59700j().length + " text=" + strM24593G + "…]";
            }
            if (m59700j().length > 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(m59700j().length);
                sb.append(" hex=");
                int iM25888e = AbstractC13298f.m25888e(this, 64);
                if (iM25888e <= m59700j().length) {
                    if (!(iM25888e + 0 >= 0)) {
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    sb.append((iM25888e == m59700j().length ? this : new zq1(fp0.m27265n(m59700j(), 0, iM25888e))).mo38697s());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + m59700j().length + ')').toString());
            }
            str = "[hex=" + mo38697s() + ']';
        }
        return str;
    }

    /* renamed from: u */
    public int mo38698u(byte[] bArr, int i) {
        sq8.m48649h(bArr, "other");
        int length = m59700j().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax <= length) {
            while (!AbstractC13298f.m25884a(m59700j(), iMax, bArr, 0, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    /* renamed from: y */
    public byte[] mo38699y() {
        return m59700j();
    }

    /* renamed from: z */
    public byte mo38700z(int i) {
        return m59700j()[i];
    }
}
