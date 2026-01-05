package kz;

import b00.C0526k;
import b00.C0541z;
import b00.InterfaceC0528m;
import e1.x0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kz.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4297c {

    /* renamed from: a */
    public static final byte[] f21703a = new byte[0];

    /* renamed from: b */
    public static final C0541z f21704b;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kz.AbstractC4297c.<clinit>():void");
    }

    /* renamed from: a */
    public static final void m8997a(long j6, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j6 || j6 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("length=" + j6 + ", offset=" + j10 + ", count=" + j10);
        }
    }

    /* renamed from: b */
    public static final void m8998b(Closeable closeable) throws IOException {
        AbstractC4154l.m8923f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static final int m8999c(String str, char c2, int i10, int i11) {
        AbstractC4154l.m8923f(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c2) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: d */
    public static final int m9000d(String str, int i10, int i11, String str2) {
        AbstractC4154l.m8923f(str, "<this>");
        while (i10 < i11) {
            if (AbstractC5178p.m10117y(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: e */
    public static final boolean m9001e(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC4154l.m8923f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                x0 x0VarM8925h = AbstractC4154l.m8925h(strArr2);
                while (x0VarM8925h.hasNext()) {
                    if (comparator.compare(str, (String) x0VarM8925h.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final int m9002f(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC4154l.m8924g(cCharAt, 31) <= 0 || AbstractC4154l.m8924g(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static final int m9003g(int i10, int i11, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: h */
    public static final int m9004h(int i10, int i11, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    /* renamed from: i */
    public static final String[] m9005i(String[] strArr, String[] other, Comparator comparator) {
        AbstractC4154l.m8923f(strArr, "<this>");
        AbstractC4154l.m8923f(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: j */
    public static final boolean m9006j(String name) {
        AbstractC4154l.m8923f(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    /* renamed from: k */
    public static final int m9007k(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    /* renamed from: l */
    public static final int m9008l(InterfaceC0528m interfaceC0528m) {
        AbstractC4154l.m8923f(interfaceC0528m, "<this>");
        return (interfaceC0528m.readByte() & 255) | ((interfaceC0528m.readByte() & 255) << 16) | ((interfaceC0528m.readByte() & 255) << 8);
    }

    /* renamed from: m */
    public static final int m9009m(C0526k c0526k) throws EOFException {
        int i10 = 0;
        while (!c0526k.mo1545e() && c0526k.m1587H(0L) == 61) {
            i10++;
            c0526k.readByte();
        }
        return i10;
    }

    /* renamed from: n */
    public static final int m9010n(int i10, String str) throws NumberFormatException {
        if (str == null) {
            return i10;
        }
        try {
            long j6 = Long.parseLong(str);
            if (j6 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j6 < 0) {
                return 0;
            }
            return (int) j6;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* renamed from: o */
    public static final String m9011o(int i10, int i11, String str) {
        int iM9003g = m9003g(i10, i11, str);
        String strSubstring = str.substring(iM9003g, m9004h(iM9003g, i11, str));
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }
}
