package p001o;

import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.SM;
import org.objectweb.asm.Opcodes;
import p001o.cre;
import p001o.qec;
import p001o.xle;
import p001o.zq1;

/* loaded from: classes6.dex */
public abstract class ggj {

    /* renamed from: a */
    public static final byte[] f25141a;

    /* renamed from: b */
    public static final qec f25142b;

    /* renamed from: c */
    public static final wx7 f25143c;

    /* renamed from: d */
    public static final xle f25144d;

    /* renamed from: e */
    public static final cre f25145e;

    static {
        byte[] bArr = new byte[0];
        f25141a = bArr;
        qec.C16365a c16365a = qec.f41791d;
        zq1.C18692a c18692a = zq1.f57497d;
        f25142b = c16365a.m45290d(c18692a.m59705a("efbbbf"), c18692a.m59705a("feff"), c18692a.m59705a("fffe"), c18692a.m59705a("0000ffff"), c18692a.m59705a("ffff0000"));
        f25143c = wx7.f52834b.m55345b(new String[0]);
        f25144d = xle.C18181a.m56458h(xle.f53902a, bArr, null, 0, 0, 7, null);
        f25145e = cre.C12729b.m21621d(cre.f18529b, bArr, null, 1, null);
    }

    /* renamed from: A */
    public static final int m28612A(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: B */
    public static final int m28613B(im1 im1Var) {
        sq8.m48649h(im1Var, "<this>");
        return m28622b(im1Var.readByte(), Constants.MAX_HOST_LENGTH) | (m28622b(im1Var.readByte(), Constants.MAX_HOST_LENGTH) << 16) | (m28622b(im1Var.readByte(), Constants.MAX_HOST_LENGTH) << 8);
    }

    /* renamed from: C */
    public static final int m28614C(rl1 rl1Var, byte b) throws EOFException {
        sq8.m48649h(rl1Var, "<this>");
        int i = 0;
        while (!rl1Var.mo32311n() && rl1Var.m46918s(0L) == b) {
            i++;
            rl1Var.readByte();
        }
        return i;
    }

    /* renamed from: D */
    public static final long m28615D(String str, long j) {
        sq8.m48649h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: E */
    public static final int m28616E(String str, int i) throws NumberFormatException {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: F */
    public static final String m28617F(String str, int i, int i2) {
        sq8.m48649h(str, "<this>");
        int iM28638r = m28638r(str, i, i2);
        String strSubstring = str.substring(iM28638r, m28640t(str, iM28638r, i2));
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: G */
    public static /* synthetic */ String m28618G(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m28617F(str, i, i2);
    }

    /* renamed from: H */
    public static final Throwable m28619H(Exception exc, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(exc, "<this>");
        sq8.m48649h(list, "suppressed");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cl6.m21376a(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: I */
    public static final void m28620I(gm1 gm1Var, int i) {
        sq8.m48649h(gm1Var, "<this>");
        gm1Var.T1((i >>> 16) & Constants.MAX_HOST_LENGTH);
        gm1Var.T1((i >>> 8) & Constants.MAX_HOST_LENGTH);
        gm1Var.T1(i & Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: a */
    public static final void m28621a(List list, Object obj) {
        sq8.m48649h(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public static final int m28622b(byte b, int i) {
        return b & i;
    }

    /* renamed from: c */
    public static final int m28623c(short s, int i) {
        return s & i;
    }

    /* renamed from: d */
    public static final long m28624d(int i, long j) {
        return i & j;
    }

    /* renamed from: e */
    public static final void m28625e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
        }
    }

    /* renamed from: f */
    public static final void m28626f(Closeable closeable) throws IOException {
        sq8.m48649h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static final String[] m28627g(String[] strArr, String str) {
        sq8.m48649h(strArr, "<this>");
        sq8.m48649h(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        sq8.m48648g(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[gp0.c0(strArr2)] = str;
        return strArr2;
    }

    /* renamed from: h */
    public static final int m28628h(String str, char c, int i, int i2) {
        sq8.m48649h(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: i */
    public static final int m28629i(String str, String str2, int i, int i2) {
        sq8.m48649h(str, "<this>");
        sq8.m48649h(str2, "delimiters");
        while (i < i2) {
            if (f9g.m26305O(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: j */
    public static /* synthetic */ int m28630j(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m28628h(str, c, i, i2);
    }

    /* renamed from: k */
    public static final wx7 m28631k() {
        return f25143c;
    }

    /* renamed from: l */
    public static final xle m28632l() {
        return f25144d;
    }

    /* renamed from: m */
    public static final cre m28633m() {
        return f25145e;
    }

    /* renamed from: n */
    public static final qec m28634n() {
        return f25142b;
    }

    /* renamed from: o */
    public static final boolean m28635o(String[] strArr, String[] strArr2, Comparator comparator) {
        sq8.m48649h(strArr, "<this>");
        sq8.m48649h(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    Iterator itM45707a = qo0.m45707a(strArr2);
                    while (itM45707a.hasNext()) {
                        if (comparator.compare(str, (String) itM45707a.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public static final int m28636p(String[] strArr, String str, Comparator comparator) {
        sq8.m48649h(strArr, "<this>");
        sq8.m48649h(str, "value");
        sq8.m48649h(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public static final int m28637q(String str) {
        sq8.m48649h(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (sq8.m48651j(cCharAt, 31) <= 0 || sq8.m48651j(cCharAt, Opcodes.LAND) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public static final int m28638r(String str, int i, int i2) {
        sq8.m48649h(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: s */
    public static /* synthetic */ int m28639s(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m28638r(str, i, i2);
    }

    /* renamed from: t */
    public static final int m28640t(String str, int i, int i2) {
        sq8.m48649h(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static /* synthetic */ int m28641u(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m28640t(str, i, i2);
    }

    /* renamed from: v */
    public static final int m28642v(String str, int i) {
        sq8.m48649h(str, "<this>");
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* renamed from: w */
    public static final List m28643w(Iterable iterable, Iterable iterable2) {
        sq8.m48649h(iterable, "a");
        sq8.m48649h(iterable2, "b");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        List listM18961c = bh3.m18961c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return bh3.m18959a(listM18961c);
            }
            if (it.hasNext()) {
                listM18961c.add(it.next());
            }
            if (it2.hasNext()) {
                listM18961c.add(it2.next());
            }
        }
    }

    /* renamed from: x */
    public static final String[] m28644x(String[] strArr, String[] strArr2, Comparator comparator) {
        sq8.m48649h(strArr, "<this>");
        sq8.m48649h(strArr2, "other");
        sq8.m48649h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: y */
    public static final boolean m28645y(String str) {
        sq8.m48649h(str, "name");
        return e9g.m24606x(str, "Authorization", true) || e9g.m24606x(str, SM.COOKIE, true) || e9g.m24606x(str, "Proxy-Authorization", true) || e9g.m24606x(str, SM.SET_COOKIE, true);
    }

    /* renamed from: z */
    public static final jta m28646z(mge mgeVar, CharSequence charSequence, int i) {
        sq8.m48649h(mgeVar, "<this>");
        sq8.m48649h(charSequence, "input");
        jta jtaVarM38992b = mgeVar.m38992b(charSequence, i);
        if (jtaVarM38992b != null && jtaVarM38992b.getRange().m32260e() == i) {
            return jtaVarM38992b;
        }
        return null;
    }
}
