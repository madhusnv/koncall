package p001o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class yq1 implements Iterable, Serializable {

    /* renamed from: b */
    public static final yq1 f55802b = new C18461j(xn8.f53958c);

    /* renamed from: c */
    public static final InterfaceC18457f f55803c;

    /* renamed from: d */
    public static final Comparator f55804d;

    /* renamed from: a */
    public int f55805a = 0;

    /* renamed from: o.yq1$a */
    public class C18452a extends AbstractC18454c {

        /* renamed from: a */
        public int f55806a = 0;

        /* renamed from: b */
        public final int f55807b;

        public C18452a() {
            this.f55807b = yq1.this.size();
        }

        @Override // p001o.yq1.InterfaceC18458g
        /* renamed from: d */
        public byte mo58099d() {
            int i = this.f55806a;
            if (i >= this.f55807b) {
                throw new NoSuchElementException();
            }
            this.f55806a = i + 1;
            return yq1.this.mo58094p(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55806a < this.f55807b;
        }
    }

    /* renamed from: o.yq1$b */
    public class C18453b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(yq1 yq1Var, yq1 yq1Var2) {
            InterfaceC18458g it = yq1Var.iterator();
            InterfaceC18458g it2 = yq1Var2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(yq1.m58074F(it.mo58099d()), yq1.m58074F(it2.mo58099d()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(yq1Var.size(), yq1Var2.size());
        }
    }

    /* renamed from: o.yq1$c */
    public static abstract class AbstractC18454c implements InterfaceC18458g {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo58099d());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.yq1$d */
    public static final class C18455d implements InterfaceC18457f {
        public C18455d() {
        }

        public /* synthetic */ C18455d(C18452a c18452a) {
            this();
        }

        @Override // p001o.yq1.InterfaceC18457f
        /* renamed from: a */
        public byte[] mo58102a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: o.yq1$e */
    public static final class C18456e extends C18461j {

        /* renamed from: f */
        public final int f55809f;

        /* renamed from: g */
        public final int f55810g;

        public C18456e(byte[] bArr, int i, int i2) {
            super(bArr);
            yq1.m58079i(i, i + i2, bArr.length);
            this.f55809f = i;
            this.f55810g = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // p001o.yq1.C18461j
        /* renamed from: R */
        public int mo58103R() {
            return this.f55809f;
        }

        @Override // p001o.yq1.C18461j, p001o.yq1
        /* renamed from: d */
        public byte mo58092d(int i) {
            yq1.m58078e(i, size());
            return this.f55813e[this.f55809f + i];
        }

        @Override // p001o.yq1.C18461j, p001o.yq1
        /* renamed from: o */
        public void mo58093o(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f55813e, mo58103R() + i, bArr, i2, i3);
        }

        @Override // p001o.yq1.C18461j, p001o.yq1
        /* renamed from: p */
        public byte mo58094p(int i) {
            return this.f55813e[this.f55809f + i];
        }

        @Override // p001o.yq1.C18461j, p001o.yq1
        public int size() {
            return this.f55810g;
        }

        public Object writeReplace() {
            return yq1.m58075M(m58086E());
        }
    }

    /* renamed from: o.yq1$f */
    public interface InterfaceC18457f {
        /* renamed from: a */
        byte[] mo58102a(byte[] bArr, int i, int i2);
    }

    /* renamed from: o.yq1$g */
    public interface InterfaceC18458g extends Iterator {
        /* renamed from: d */
        byte mo58099d();
    }

    /* renamed from: o.yq1$h */
    public static final class C18459h {

        /* renamed from: a */
        public final mf3 f55811a;

        /* renamed from: b */
        public final byte[] f55812b;

        public /* synthetic */ C18459h(int i, C18452a c18452a) {
            this(i);
        }

        /* renamed from: a */
        public yq1 m58104a() {
            this.f55811a.m38919c();
            return new C18461j(this.f55812b);
        }

        /* renamed from: b */
        public mf3 m58105b() {
            return this.f55811a;
        }

        public C18459h(int i) {
            byte[] bArr = new byte[i];
            this.f55812b = bArr;
            this.f55811a = mf3.m38887U(bArr);
        }
    }

    /* renamed from: o.yq1$i */
    public static abstract class AbstractC18460i extends yq1 {
    }

    /* renamed from: o.yq1$j */
    public static class C18461j extends AbstractC18460i {

        /* renamed from: e */
        public final byte[] f55813e;

        public C18461j(byte[] bArr) {
            bArr.getClass();
            this.f55813e = bArr;
        }

        @Override // p001o.yq1
        /* renamed from: B */
        public final yq1 mo58085B(int i, int i2) {
            int iM58079i = yq1.m58079i(i, i2, size());
            return iM58079i == 0 ? yq1.f55802b : new C18456e(this.f55813e, mo58103R() + i, iM58079i);
        }

        @Override // p001o.yq1
        /* renamed from: I */
        public final String mo58088I(Charset charset) {
            return new String(this.f55813e, mo58103R(), size(), charset);
        }

        @Override // p001o.yq1
        /* renamed from: O */
        public final void mo58091O(kq1 kq1Var) {
            kq1Var.mo36045a(this.f55813e, mo58103R(), size());
        }

        /* renamed from: P */
        public final boolean m58106P(yq1 yq1Var, int i, int i2) {
            if (i2 > yq1Var.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > yq1Var.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + yq1Var.size());
            }
            if (!(yq1Var instanceof C18461j)) {
                return yq1Var.mo58085B(i, i3).equals(mo58085B(0, i2));
            }
            C18461j c18461j = (C18461j) yq1Var;
            byte[] bArr = this.f55813e;
            byte[] bArr2 = c18461j.f55813e;
            int iMo58103R = mo58103R() + i2;
            int iMo58103R2 = mo58103R();
            int iMo58103R3 = c18461j.mo58103R() + i;
            while (iMo58103R2 < iMo58103R) {
                if (bArr[iMo58103R2] != bArr2[iMo58103R3]) {
                    return false;
                }
                iMo58103R2++;
                iMo58103R3++;
            }
            return true;
        }

        /* renamed from: R */
        public int mo58103R() {
            return 0;
        }

        @Override // p001o.yq1
        /* renamed from: d */
        public byte mo58092d(int i) {
            return this.f55813e[i];
        }

        @Override // p001o.yq1
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof yq1) || size() != ((yq1) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C18461j)) {
                return obj.equals(this);
            }
            C18461j c18461j = (C18461j) obj;
            int iM58084A = m58084A();
            int iM58084A2 = c18461j.m58084A();
            if (iM58084A == 0 || iM58084A2 == 0 || iM58084A == iM58084A2) {
                return m58106P(c18461j, 0, size());
            }
            return false;
        }

        @Override // p001o.yq1
        /* renamed from: o */
        public void mo58093o(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f55813e, i, bArr, i2, i3);
        }

        @Override // p001o.yq1
        /* renamed from: p */
        public byte mo58094p(int i) {
            return this.f55813e[i];
        }

        @Override // p001o.yq1
        /* renamed from: q */
        public final boolean mo58095q() {
            int iMo58103R = mo58103R();
            return iqi.m32572n(this.f55813e, iMo58103R, size() + iMo58103R);
        }

        @Override // p001o.yq1
        public int size() {
            return this.f55813e.length;
        }

        @Override // p001o.yq1
        /* renamed from: y */
        public final if3 mo58097y() {
            return if3.m32010h(this.f55813e, mo58103R(), size(), true);
        }

        @Override // p001o.yq1
        /* renamed from: z */
        public final int mo58098z(int i, int i2, int i3) {
            return xn8.m56507i(i, this.f55813e, mo58103R() + i2, i3);
        }
    }

    /* renamed from: o.yq1$k */
    public static final class C18462k implements InterfaceC18457f {
        public C18462k() {
        }

        public /* synthetic */ C18462k(C18452a c18452a) {
            this();
        }

        @Override // p001o.yq1.InterfaceC18457f
        /* renamed from: a */
        public byte[] mo58102a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        C18452a c18452a = null;
        f55803c = cd0.m20878c() ? new C18462k(c18452a) : new C18455d(c18452a);
        f55804d = new C18453b();
    }

    /* renamed from: F */
    public static int m58074F(byte b) {
        return b & 255;
    }

    /* renamed from: M */
    public static yq1 m58075M(byte[] bArr) {
        return new C18461j(bArr);
    }

    /* renamed from: N */
    public static yq1 m58076N(byte[] bArr, int i, int i2) {
        return new C18456e(bArr, i, i2);
    }

    /* renamed from: e */
    public static void m58078e(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* renamed from: i */
    public static int m58079i(int i, int i2, int i3) {
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

    /* renamed from: j */
    public static yq1 m58080j(byte[] bArr) {
        return m58081l(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static yq1 m58081l(byte[] bArr, int i, int i2) {
        m58079i(i, i + i2, bArr.length);
        return new C18461j(f55803c.mo58102a(bArr, i, i2));
    }

    /* renamed from: m */
    public static yq1 m58082m(String str) {
        return new C18461j(str.getBytes(xn8.f53956a));
    }

    /* renamed from: x */
    public static C18459h m58083x(int i) {
        return new C18459h(i, null);
    }

    /* renamed from: A */
    public final int m58084A() {
        return this.f55805a;
    }

    /* renamed from: B */
    public abstract yq1 mo58085B(int i, int i2);

    /* renamed from: E */
    public final byte[] m58086E() {
        int size = size();
        if (size == 0) {
            return xn8.f53958c;
        }
        byte[] bArr = new byte[size];
        mo58093o(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: G */
    public final String m58087G(Charset charset) {
        return size() == 0 ? "" : mo58088I(charset);
    }

    /* renamed from: I */
    public abstract String mo58088I(Charset charset);

    /* renamed from: J */
    public final String m58089J() {
        return m58087G(xn8.f53956a);
    }

    /* renamed from: L */
    public final String m58090L() {
        if (size() <= 50) {
            return hhh.m30604a(this);
        }
        return hhh.m30604a(mo58085B(0, 47)) + "...";
    }

    /* renamed from: O */
    public abstract void mo58091O(kq1 kq1Var);

    /* renamed from: d */
    public abstract byte mo58092d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo58098z = this.f55805a;
        if (iMo58098z == 0) {
            int size = size();
            iMo58098z = mo58098z(size, 0, size);
            if (iMo58098z == 0) {
                iMo58098z = 1;
            }
            this.f55805a = iMo58098z;
        }
        return iMo58098z;
    }

    /* renamed from: o */
    public abstract void mo58093o(byte[] bArr, int i, int i2, int i3);

    /* renamed from: p */
    public abstract byte mo58094p(int i);

    /* renamed from: q */
    public abstract boolean mo58095q();

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public InterfaceC18458g iterator() {
        return new C18452a();
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m58090L());
    }

    /* renamed from: y */
    public abstract if3 mo58097y();

    /* renamed from: z */
    public abstract int mo58098z(int i, int i2, int i3);
}
