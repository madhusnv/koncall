package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jtf {

    /* renamed from: a */
    public int[] f31080a;

    /* renamed from: b */
    public Object[] f31081b;

    /* renamed from: c */
    public int f31082c;

    public jtf(int i) {
        if (i == 0) {
            this.f31080a = g14.f24382a;
            this.f31081b = g14.f24383b;
        } else {
            this.f31080a = new int[i];
            this.f31081b = new Object[i << 1];
        }
        this.f31082c = 0;
    }

    /* renamed from: a */
    public final boolean m34501a(Object obj) {
        return m34504d(obj) >= 0;
    }

    /* renamed from: b */
    public final Object m34502b(Object obj) {
        int iM34504d = m34504d(obj);
        if (iM34504d >= 0) {
            return this.f31081b[(iM34504d << 1) + 1];
        }
        return null;
    }

    /* renamed from: c */
    public final int m34503c(Object obj, int i) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        int i2 = this.f31082c;
        if (i2 == 0) {
            return -1;
        }
        int iM27901a = g14.m27901a(this.f31080a, i2, i);
        if (iM27901a < 0 || sq8.m48644c(obj, this.f31081b[iM27901a << 1])) {
            return iM27901a;
        }
        int i3 = iM27901a + 1;
        while (i3 < i2 && this.f31080a[i3] == i) {
            if (sq8.m48644c(obj, this.f31081b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM27901a - 1; i4 >= 0 && this.f31080a[i4] == i; i4--) {
            if (sq8.m48644c(obj, this.f31081b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: d */
    public final int m34504d(Object obj) {
        return obj == null ? m34505e() : m34503c(obj, obj.hashCode());
    }

    /* renamed from: e */
    public final int m34505e() {
        int i = this.f31082c;
        if (i == 0) {
            return -1;
        }
        int iM27901a = g14.m27901a(this.f31080a, i, 0);
        if (iM27901a < 0 || this.f31081b[iM27901a << 1] == null) {
            return iM27901a;
        }
        int i2 = iM27901a + 1;
        while (i2 < i && this.f31080a[i2] == 0) {
            if (this.f31081b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM27901a - 1; i3 >= 0 && this.f31080a[i3] == 0; i3--) {
            if (this.f31081b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof jtf) {
                jtf jtfVar = (jtf) obj;
                int i = this.f31082c;
                if (i != jtfVar.f31082c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM34507g = m34507g(i2);
                    Object objM34508h = m34508h(i2);
                    Object objM34502b = jtfVar.m34502b(objM34507g);
                    if (objM34508h == null) {
                        if (objM34502b != null || !jtfVar.m34501a(objM34507g)) {
                            return false;
                        }
                    } else if (!sq8.m48644c(objM34508h, objM34502b)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f31082c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f31082c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM34507g2 = m34507g(i4);
                Object objM34508h2 = m34508h(i4);
                Object obj2 = ((Map) obj).get(objM34507g2);
                if (objM34508h2 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(objM34507g2)) {
                        return false;
                    }
                } else if (!sq8.m48644c(objM34508h2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m34506f() {
        return this.f31082c <= 0;
    }

    /* renamed from: g */
    public final Object m34507g(int i) {
        return this.f31081b[i << 1];
    }

    /* renamed from: h */
    public final Object m34508h(int i) {
        return this.f31081b[(i << 1) + 1];
    }

    public int hashCode() {
        int[] iArr = this.f31080a;
        Object[] objArr = this.f31081b;
        int i = this.f31082c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (m34506f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f31082c * 28);
        sb.append('{');
        int i = this.f31082c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM34507g = m34507g(i2);
            if (objM34507g != this) {
                sb.append(objM34507g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM34508h = m34508h(i2);
            if (objM34508h != this) {
                sb.append(objM34508h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        sq8.m48648g(string, "buffer.toString()");
        return string;
    }

    public /* synthetic */ jtf(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
