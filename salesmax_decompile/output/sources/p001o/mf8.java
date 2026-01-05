package p001o;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mf8 implements Serializable {

    /* renamed from: d */
    public static final mf8 f35340d = new mf8(new int[0]);

    /* renamed from: a */
    public final int[] f35341a;

    /* renamed from: b */
    public final transient int f35342b;

    /* renamed from: c */
    public final int f35343c;

    public mf8(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    /* renamed from: a */
    public static mf8 m38922a(int[] iArr) {
        return iArr.length == 0 ? f35340d : new mf8(Arrays.copyOf(iArr, iArr.length));
    }

    /* renamed from: f */
    public static mf8 m38923f() {
        return f35340d;
    }

    /* renamed from: b */
    public int m38924b(int i) {
        dgd.m23060m(i, m38927e());
        return this.f35341a[this.f35342b + i];
    }

    /* renamed from: c */
    public boolean m38925c() {
        return this.f35343c == this.f35342b;
    }

    /* renamed from: d */
    public final boolean m38926d() {
        return this.f35342b > 0 || this.f35343c < this.f35341a.length;
    }

    /* renamed from: e */
    public int m38927e() {
        return this.f35343c - this.f35342b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mf8)) {
            return false;
        }
        mf8 mf8Var = (mf8) obj;
        if (m38927e() != mf8Var.m38927e()) {
            return false;
        }
        for (int i = 0; i < m38927e(); i++) {
            if (m38924b(i) != mf8Var.m38924b(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public int[] m38928g() {
        return Arrays.copyOfRange(this.f35341a, this.f35342b, this.f35343c);
    }

    /* renamed from: h */
    public mf8 m38929h() {
        return m38926d() ? new mf8(m38928g()) : this;
    }

    public int hashCode() {
        int iM19642i = 1;
        for (int i = this.f35342b; i < this.f35343c; i++) {
            iM19642i = (iM19642i * 31) + br8.m19642i(this.f35341a[i]);
        }
        return iM19642i;
    }

    public Object readResolve() {
        return m38925c() ? f35340d : this;
    }

    public String toString() {
        if (m38925c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(m38927e() * 5);
        sb.append('[');
        sb.append(this.f35341a[this.f35342b]);
        int i = this.f35342b;
        while (true) {
            i++;
            if (i >= this.f35343c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f35341a[i]);
        }
    }

    public Object writeReplace() {
        return m38929h();
    }

    public mf8(int[] iArr, int i, int i2) {
        this.f35341a = iArr;
        this.f35342b = i;
        this.f35343c = i2;
    }
}
