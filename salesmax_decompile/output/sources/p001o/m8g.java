package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class m8g extends AbstractMap implements Externalizable {

    /* renamed from: a */
    public int f34978a;

    /* renamed from: b */
    public C15252a f34979b;

    /* renamed from: c */
    public boolean f34980c;

    /* renamed from: d */
    public C15253b f34981d;

    /* renamed from: e */
    public Object f34982e;

    /* renamed from: f */
    public HashSet f34983f;

    /* renamed from: g */
    public Set f34984g;

    /* renamed from: o.m8g$a */
    public static class C15252a implements Map.Entry {

        /* renamed from: a */
        public char[] f34985a;

        /* renamed from: b */
        public char[] f34986b;

        /* renamed from: c */
        public C15252a f34987c;

        /* renamed from: d */
        public C15252a[] f34988d;

        /* renamed from: e */
        public String f34989e;

        /* renamed from: f */
        public Object f34990f;

        public C15252a() {
        }

        public C15252a(boolean z, String str, int i) {
            int length = str.length() - i;
            this.f34985a = new char[length];
            this.f34986b = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i + i2);
                this.f34985a[i2] = cCharAt;
                if (z) {
                    if (Character.isUpperCase(cCharAt)) {
                        cCharAt = Character.toLowerCase(cCharAt);
                    } else if (Character.isLowerCase(cCharAt)) {
                        cCharAt = Character.toUpperCase(cCharAt);
                    }
                    this.f34986b[i2] = cCharAt;
                }
            }
        }

        /* renamed from: a */
        public C15252a m38570a(m8g m8gVar, int i) {
            C15252a c15252a = new C15252a();
            char[] cArr = this.f34985a;
            int length = cArr.length - i;
            this.f34985a = new char[i];
            c15252a.f34985a = new char[length];
            System.arraycopy(cArr, 0, this.f34985a, 0, i);
            System.arraycopy(cArr, i, c15252a.f34985a, 0, length);
            char[] cArr2 = this.f34986b;
            if (cArr2 != null) {
                this.f34986b = new char[i];
                c15252a.f34986b = new char[length];
                System.arraycopy(cArr2, 0, this.f34986b, 0, i);
                System.arraycopy(cArr2, i, c15252a.f34986b, 0, length);
            }
            c15252a.f34989e = this.f34989e;
            c15252a.f34990f = this.f34990f;
            this.f34989e = null;
            this.f34990f = null;
            if (m8gVar.f34983f.remove(this)) {
                m8gVar.f34983f.add(c15252a);
            }
            c15252a.f34988d = this.f34988d;
            int i2 = m8gVar.f34978a;
            C15252a[] c15252aArr = new C15252a[i2];
            this.f34988d = c15252aArr;
            c15252aArr[c15252a.f34985a[0] % i2] = c15252a;
            char[] cArr3 = c15252a.f34986b;
            if (cArr3 != null) {
                char c = cArr3[0];
                if (c15252aArr[c % i2] != c15252a) {
                    c15252aArr[c % i2] = c15252a;
                }
            }
            return c15252a;
        }

        /* renamed from: b */
        public final void m38571b(StringBuffer stringBuffer) {
            stringBuffer.append("{[");
            if (this.f34985a != null) {
                int i = 0;
                while (true) {
                    char[] cArr = this.f34985a;
                    if (i >= cArr.length) {
                        break;
                    }
                    stringBuffer.append(cArr[i]);
                    i++;
                }
            } else {
                stringBuffer.append('-');
            }
            stringBuffer.append(':');
            stringBuffer.append(this.f34989e);
            stringBuffer.append('=');
            stringBuffer.append(this.f34990f);
            stringBuffer.append(']');
            if (this.f34988d != null) {
                for (int i2 = 0; i2 < this.f34988d.length; i2++) {
                    stringBuffer.append('|');
                    C15252a c15252a = this.f34988d[i2];
                    if (c15252a != null) {
                        c15252a.m38571b(stringBuffer);
                    } else {
                        stringBuffer.append("-");
                    }
                }
            }
            stringBuffer.append('}');
            if (this.f34987c != null) {
                stringBuffer.append(",\n");
                this.f34987c.m38571b(stringBuffer);
            }
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f34989e;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f34990f;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f34990f;
            this.f34990f = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            synchronized (stringBuffer) {
                m38571b(stringBuffer);
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: o.m8g$b */
    public class C15253b implements Map.Entry {
        public C15253b() {
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return null;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return m8g.this.f34982e;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            m8g m8gVar = m8g.this;
            Object obj2 = m8gVar.f34982e;
            m8gVar.f34982e = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[:null=");
            stringBuffer.append(m8g.this.f34982e);
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    public m8g() {
        this.f34978a = 17;
        this.f34979b = new C15252a();
        this.f34980c = false;
        this.f34981d = null;
        this.f34982e = null;
        HashSet hashSet = new HashSet(3);
        this.f34983f = hashSet;
        this.f34984g = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Object m38564a(String str) {
        if (str == null) {
            return this.f34982e;
        }
        Map.Entry entryM38566d = m38566d(str, 0, str.length());
        if (entryM38566d == null) {
            return null;
        }
        return entryM38566d.getValue();
    }

    /* renamed from: c */
    public Map.Entry m38565c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return this.f34981d;
        }
        C15252a c15252a = this.f34979b;
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            char c = (char) bArr[i + i4];
            if (i3 == -1) {
                C15252a[] c15252aArr = c15252a.f34988d;
                C15252a c15252a2 = c15252aArr == null ? null : c15252aArr[c % this.f34978a];
                if (c15252a2 == null && i4 > 0) {
                    return c15252a;
                }
                c15252a = c15252a2;
                i3 = 0;
            }
            while (c15252a != null) {
                char[] cArr = c15252a.f34985a;
                if (cArr[i3] == c || (this.f34980c && c15252a.f34986b[i3] == c)) {
                    i3++;
                    if (i3 == cArr.length) {
                        i3 = -1;
                    }
                } else {
                    if (i3 > 0) {
                        return null;
                    }
                    c15252a = c15252a.f34987c;
                }
            }
            return null;
        }
        if (i3 > 0) {
            return null;
        }
        if (c15252a == null || c15252a.f34989e != null) {
            return c15252a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f34979b = new C15252a();
        this.f34981d = null;
        this.f34982e = null;
        this.f34983f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return obj == null ? this.f34981d != null : m38566d(obj.toString(), 0, obj.toString().length()) != null;
    }

    /* renamed from: d */
    public Map.Entry m38566d(String str, int i, int i2) {
        if (str == null) {
            return this.f34981d;
        }
        C15252a c15252a = this.f34979b;
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            char cCharAt = str.charAt(i + i4);
            if (i3 == -1) {
                C15252a[] c15252aArr = c15252a.f34988d;
                c15252a = c15252aArr == null ? null : c15252aArr[cCharAt % this.f34978a];
                i3 = 0;
            }
            while (c15252a != null) {
                char[] cArr = c15252a.f34985a;
                if (cArr[i3] == cCharAt || (this.f34980c && c15252a.f34986b[i3] == cCharAt)) {
                    i3++;
                    if (i3 == cArr.length) {
                        i3 = -1;
                    }
                } else {
                    if (i3 > 0) {
                        return null;
                    }
                    c15252a = c15252a.f34987c;
                }
            }
            return null;
        }
        if (i3 > 0) {
            return null;
        }
        if (c15252a == null || c15252a.f34989e != null) {
            return c15252a;
        }
        return null;
    }

    /* renamed from: e */
    public Object m38567e(String str, Object obj) {
        if (str == null) {
            Object obj2 = this.f34982e;
            this.f34982e = obj;
            if (this.f34981d == null) {
                C15253b c15253b = new C15253b();
                this.f34981d = c15253b;
                this.f34983f.add(c15253b);
            }
            return obj2;
        }
        C15252a c15252a = this.f34979b;
        C15252a c15252a2 = null;
        C15252a c15252a3 = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (i2 == -1) {
                C15252a[] c15252aArr = c15252a.f34988d;
                c15252a2 = null;
                c15252a3 = c15252a;
                c15252a = c15252aArr == null ? null : c15252aArr[cCharAt % this.f34978a];
                i2 = 0;
            }
            while (c15252a != null) {
                char[] cArr = c15252a.f34985a;
                if (cArr[i2] == cCharAt || (this.f34980c && c15252a.f34986b[i2] == cCharAt)) {
                    i2++;
                    if (i2 == cArr.length) {
                        c15252a2 = null;
                        i2 = -1;
                        i++;
                    } else {
                        c15252a2 = null;
                        i++;
                    }
                } else if (i2 == 0) {
                    c15252a2 = c15252a;
                    c15252a = c15252a.f34987c;
                } else {
                    c15252a.m38570a(this, i2);
                    i--;
                    i2 = -1;
                    i++;
                }
            }
            c15252a = new C15252a(this.f34980c, str, i);
            if (c15252a2 != null) {
                c15252a2.f34987c = c15252a;
            } else if (c15252a3 != null) {
                if (c15252a3.f34988d == null) {
                    c15252a3.f34988d = new C15252a[this.f34978a];
                }
                C15252a[] c15252aArr2 = c15252a3.f34988d;
                int i3 = this.f34978a;
                c15252aArr2[cCharAt % i3] = c15252a;
                char[] cArr2 = c15252a.f34986b;
                int i4 = cArr2[0] % i3;
                if (cArr2 != null && c15252a.f34985a[0] % i3 != i4) {
                    C15252a c15252a4 = c15252aArr2[i4];
                    if (c15252a4 == null) {
                        c15252aArr2[i4] = c15252a;
                    } else {
                        while (true) {
                            C15252a c15252a5 = c15252a4.f34987c;
                            if (c15252a5 == null) {
                                break;
                            }
                            c15252a4 = c15252a5;
                        }
                        c15252a4.f34987c = c15252a;
                    }
                }
            } else {
                this.f34979b = c15252a;
            }
        }
        if (c15252a == null) {
            return null;
        }
        if (i2 > 0) {
            c15252a.m38570a(this, i2);
        }
        Object obj3 = c15252a.f34990f;
        c15252a.f34989e = str;
        c15252a.f34990f = obj;
        this.f34983f.add(c15252a);
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return this.f34984g;
    }

    /* renamed from: f */
    public Object m38568f(String str) {
        if (str == null) {
            Object obj = this.f34982e;
            C15253b c15253b = this.f34981d;
            if (c15253b != null) {
                this.f34983f.remove(c15253b);
                this.f34981d = null;
                this.f34982e = null;
            }
            return obj;
        }
        C15252a c15252a = this.f34979b;
        int i = -1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (i == -1) {
                C15252a[] c15252aArr = c15252a.f34988d;
                c15252a = c15252aArr == null ? null : c15252aArr[cCharAt % this.f34978a];
                i = 0;
            }
            while (c15252a != null) {
                char[] cArr = c15252a.f34985a;
                if (cArr[i] == cCharAt || (this.f34980c && c15252a.f34986b[i] == cCharAt)) {
                    i++;
                    if (i == cArr.length) {
                        i = -1;
                    }
                } else {
                    if (i > 0) {
                        return null;
                    }
                    c15252a = c15252a.f34987c;
                }
            }
            return null;
        }
        if (i > 0) {
            return null;
        }
        if (c15252a != null && c15252a.f34989e == null) {
            return null;
        }
        Object obj2 = c15252a.f34990f;
        this.f34983f.remove(c15252a);
        c15252a.f34990f = null;
        c15252a.f34989e = null;
        return obj2;
    }

    /* renamed from: g */
    public void m38569g(boolean z) {
        if (this.f34979b.f34988d != null) {
            throw new IllegalStateException("Must be set before first put");
        }
        this.f34980c = z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return obj == null ? this.f34982e : obj instanceof String ? m38564a((String) obj) : m38564a(obj.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f34983f.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return obj == null ? m38567e(null, obj2) : m38567e(obj.toString(), obj2);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        boolean z = objectInput.readBoolean();
        HashMap map = (HashMap) objectInput.readObject();
        m38569g(z);
        putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return obj == null ? m38568f(null) : m38568f(obj.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f34983f.size();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        HashMap map = new HashMap(this);
        objectOutput.writeBoolean(this.f34980c);
        objectOutput.writeObject(map);
    }

    public m8g(boolean z) {
        this();
        this.f34980c = z;
    }
}
