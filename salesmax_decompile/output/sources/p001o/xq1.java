package p001o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public abstract class xq1 implements Iterable, Serializable {

    /* renamed from: b */
    public static final xq1 f54049b = new C18219j(yn8.f55726c);

    /* renamed from: c */
    public static final InterfaceC18215f f54050c;

    /* renamed from: d */
    public static final Comparator f54051d;

    /* renamed from: a */
    public int f54052a = 0;

    /* renamed from: o.xq1$a */
    public class C18210a extends AbstractC18212c {

        /* renamed from: a */
        public int f54053a = 0;

        /* renamed from: b */
        public final int f54054b;

        public C18210a() {
            this.f54054b = xq1.this.size();
        }

        @Override // p001o.xq1.InterfaceC18216g
        /* renamed from: d */
        public byte mo56596d() {
            int i = this.f54053a;
            if (i >= this.f54054b) {
                throw new NoSuchElementException();
            }
            this.f54053a = i + 1;
            return xq1.this.mo53613x(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54053a < this.f54054b;
        }
    }

    /* renamed from: o.xq1$b */
    public static class C18211b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(xq1 xq1Var, xq1 xq1Var2) {
            InterfaceC18216g interfaceC18216gM56595z = xq1Var.m56595z();
            InterfaceC18216g interfaceC18216gM56595z2 = xq1Var2.m56595z();
            while (interfaceC18216gM56595z.hasNext() && interfaceC18216gM56595z2.hasNext()) {
                int iCompare = Integer.compare(xq1.m56578J(interfaceC18216gM56595z.mo56596d()), xq1.m56578J(interfaceC18216gM56595z2.mo56596d()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(xq1Var.size(), xq1Var2.size());
        }
    }

    /* renamed from: o.xq1$c */
    public static abstract class AbstractC18212c implements InterfaceC18216g {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo56596d());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.xq1$d */
    public static final class C18213d implements InterfaceC18215f {
        public C18213d() {
        }

        public /* synthetic */ C18213d(C18210a c18210a) {
            this();
        }

        @Override // p001o.xq1.InterfaceC18215f
        /* renamed from: a */
        public byte[] mo56599a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: o.xq1$e */
    public static final class C18214e extends C18219j {

        /* renamed from: f */
        public final int f54056f;

        /* renamed from: g */
        public final int f54057g;

        public C18214e(byte[] bArr, int i, int i2) {
            super(bArr);
            xq1.m56584j(i, i + i2, bArr.length);
            this.f54056f = i;
            this.f54057g = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // p001o.xq1.C18219j
        /* renamed from: V */
        public int mo56600V() {
            return this.f54056f;
        }

        @Override // p001o.xq1.C18219j, p001o.xq1
        /* renamed from: e */
        public byte mo53611e(int i) {
            xq1.m56583i(i, size());
            return this.f54060e[this.f54056f + i];
        }

        @Override // p001o.xq1.C18219j, p001o.xq1
        /* renamed from: r */
        public void mo53612r(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f54060e, mo56600V() + i, bArr, i2, i3);
        }

        @Override // p001o.xq1.C18219j, p001o.xq1
        public int size() {
            return this.f54057g;
        }

        public Object writeReplace() {
            return xq1.m56580R(m56591I());
        }

        @Override // p001o.xq1.C18219j, p001o.xq1
        /* renamed from: x */
        public byte mo53613x(int i) {
            return this.f54060e[this.f54056f + i];
        }
    }

    /* renamed from: o.xq1$f */
    public interface InterfaceC18215f {
        /* renamed from: a */
        byte[] mo56599a(byte[] bArr, int i, int i2);
    }

    /* renamed from: o.xq1$g */
    public interface InterfaceC18216g extends Iterator {
        /* renamed from: d */
        byte mo56596d();
    }

    /* renamed from: o.xq1$h */
    public static final class C18217h {

        /* renamed from: a */
        public final nf3 f54058a;

        /* renamed from: b */
        public final byte[] f54059b;

        public /* synthetic */ C18217h(int i, C18210a c18210a) {
            this(i);
        }

        /* renamed from: a */
        public xq1 m56601a() {
            this.f54058a.m40487d();
            return new C18219j(this.f54059b);
        }

        /* renamed from: b */
        public nf3 m56602b() {
            return this.f54058a;
        }

        public C18217h(int i) {
            byte[] bArr = new byte[i];
            this.f54059b = bArr;
            this.f54058a = nf3.e0(bArr);
        }
    }

    /* renamed from: o.xq1$i */
    public static abstract class AbstractC18218i extends xq1 {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.m56595z();
        }
    }

    /* renamed from: o.xq1$j */
    public static class C18219j extends AbstractC18218i {

        /* renamed from: e */
        public final byte[] f54060e;

        public C18219j(byte[] bArr) {
            bArr.getClass();
            this.f54060e = bArr;
        }

        @Override // p001o.xq1
        /* renamed from: B */
        public final jf3 mo53604B() {
            return jf3.m33689l(this.f54060e, mo56600V(), size(), true);
        }

        @Override // p001o.xq1
        /* renamed from: E */
        public final int mo53605E(int i, int i2, int i3) {
            return yn8.m58020i(i, this.f54060e, mo56600V() + i2, i3);
        }

        @Override // p001o.xq1
        /* renamed from: G */
        public final xq1 mo53606G(int i, int i2) {
            int iM56584j = xq1.m56584j(i, i2, size());
            return iM56584j == 0 ? xq1.f54049b : new C18214e(this.f54060e, mo56600V() + i, iM56584j);
        }

        @Override // p001o.xq1
        /* renamed from: M */
        public final String mo53607M(Charset charset) {
            return new String(this.f54060e, mo56600V(), size(), charset);
        }

        @Override // p001o.xq1
        /* renamed from: T */
        public final void mo53608T(jq1 jq1Var) {
            jq1Var.mo34213b(this.f54060e, mo56600V(), size());
        }

        /* renamed from: U */
        public final boolean m56603U(xq1 xq1Var, int i, int i2) {
            if (i2 > xq1Var.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > xq1Var.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + xq1Var.size());
            }
            if (!(xq1Var instanceof C18219j)) {
                return xq1Var.mo53606G(i, i3).equals(mo53606G(0, i2));
            }
            C18219j c18219j = (C18219j) xq1Var;
            byte[] bArr = this.f54060e;
            byte[] bArr2 = c18219j.f54060e;
            int iMo56600V = mo56600V() + i2;
            int iMo56600V2 = mo56600V();
            int iMo56600V3 = c18219j.mo56600V() + i;
            while (iMo56600V2 < iMo56600V) {
                if (bArr[iMo56600V2] != bArr2[iMo56600V3]) {
                    return false;
                }
                iMo56600V2++;
                iMo56600V3++;
            }
            return true;
        }

        /* renamed from: V */
        public int mo56600V() {
            return 0;
        }

        @Override // p001o.xq1
        /* renamed from: d */
        public final ByteBuffer mo53610d() {
            return ByteBuffer.wrap(this.f54060e, mo56600V(), size()).asReadOnlyBuffer();
        }

        @Override // p001o.xq1
        /* renamed from: e */
        public byte mo53611e(int i) {
            return this.f54060e[i];
        }

        @Override // p001o.xq1
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof xq1) || size() != ((xq1) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C18219j)) {
                return obj.equals(this);
            }
            C18219j c18219j = (C18219j) obj;
            int iM56590F = m56590F();
            int iM56590F2 = c18219j.m56590F();
            if (iM56590F == 0 || iM56590F2 == 0 || iM56590F == iM56590F2) {
                return m56603U(c18219j, 0, size());
            }
            return false;
        }

        @Override // p001o.xq1
        /* renamed from: r */
        public void mo53612r(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f54060e, i, bArr, i2, i3);
        }

        @Override // p001o.xq1
        public int size() {
            return this.f54060e.length;
        }

        @Override // p001o.xq1
        /* renamed from: x */
        public byte mo53613x(int i) {
            return this.f54060e[i];
        }

        @Override // p001o.xq1
        /* renamed from: y */
        public final boolean mo53614y() {
            int iMo56600V = mo56600V();
            return jqi.m34303t(this.f54060e, iMo56600V, size() + iMo56600V);
        }
    }

    /* renamed from: o.xq1$k */
    public static final class C18220k implements InterfaceC18215f {
        public C18220k() {
        }

        public /* synthetic */ C18220k(C18210a c18210a) {
            this();
        }

        @Override // p001o.xq1.InterfaceC18215f
        /* renamed from: a */
        public byte[] mo56599a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        C18210a c18210a = null;
        f54050c = bd0.m18627c() ? new C18220k(c18210a) : new C18213d(c18210a);
        f54051d = new C18211b();
    }

    /* renamed from: A */
    public static C18217h m56577A(int i) {
        return new C18217h(i, null);
    }

    /* renamed from: J */
    public static int m56578J(byte b) {
        return b & 255;
    }

    /* renamed from: P */
    public static xq1 m56579P(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new vyb(byteBuffer);
        }
        return m56581S(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: R */
    public static xq1 m56580R(byte[] bArr) {
        return new C18219j(bArr);
    }

    /* renamed from: S */
    public static xq1 m56581S(byte[] bArr, int i, int i2) {
        return new C18214e(bArr, i, i2);
    }

    /* renamed from: i */
    public static void m56583i(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* renamed from: j */
    public static int m56584j(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    /* renamed from: l */
    public static xq1 m56585l(ByteBuffer byteBuffer) {
        return m56586m(byteBuffer, byteBuffer.remaining());
    }

    /* renamed from: m */
    public static xq1 m56586m(ByteBuffer byteBuffer, int i) {
        m56584j(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C18219j(bArr);
    }

    /* renamed from: o */
    public static xq1 m56587o(byte[] bArr) {
        return m56588p(bArr, 0, bArr.length);
    }

    /* renamed from: p */
    public static xq1 m56588p(byte[] bArr, int i, int i2) {
        m56584j(i, i + i2, bArr.length);
        return new C18219j(f54050c.mo56599a(bArr, i, i2));
    }

    /* renamed from: q */
    public static xq1 m56589q(String str) {
        return new C18219j(str.getBytes(yn8.f55724a));
    }

    /* renamed from: B */
    public abstract jf3 mo53604B();

    /* renamed from: E */
    public abstract int mo53605E(int i, int i2, int i3);

    /* renamed from: F */
    public final int m56590F() {
        return this.f54052a;
    }

    /* renamed from: G */
    public abstract xq1 mo53606G(int i, int i2);

    /* renamed from: I */
    public final byte[] m56591I() {
        int size = size();
        if (size == 0) {
            return yn8.f55726c;
        }
        byte[] bArr = new byte[size];
        mo53612r(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: L */
    public final String m56592L(Charset charset) {
        return size() == 0 ? "" : mo53607M(charset);
    }

    /* renamed from: M */
    public abstract String mo53607M(Charset charset);

    /* renamed from: N */
    public final String m56593N() {
        return m56592L(yn8.f55724a);
    }

    /* renamed from: O */
    public final String m56594O() {
        if (size() <= 50) {
            return ghh.m28724a(this);
        }
        return ghh.m28724a(mo53606G(0, 47)) + "...";
    }

    /* renamed from: T */
    public abstract void mo53608T(jq1 jq1Var);

    /* renamed from: d */
    public abstract ByteBuffer mo53610d();

    /* renamed from: e */
    public abstract byte mo53611e(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo53605E = this.f54052a;
        if (iMo53605E == 0) {
            int size = size();
            iMo53605E = mo53605E(size, 0, size);
            if (iMo53605E == 0) {
                iMo53605E = 1;
            }
            this.f54052a = iMo53605E;
        }
        return iMo53605E;
    }

    /* renamed from: r */
    public abstract void mo53612r(byte[] bArr, int i, int i2, int i3);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m56594O());
    }

    /* renamed from: x */
    public abstract byte mo53613x(int i);

    /* renamed from: y */
    public abstract boolean mo53614y();

    /* renamed from: z */
    public InterfaceC18216g m56595z() {
        return new C18210a();
    }
}
