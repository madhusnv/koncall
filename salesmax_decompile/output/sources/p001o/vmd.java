package p001o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class vmd {

    /* renamed from: a */
    public static final byte[] f50560a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f50561b = {112, 114, 109, 0};

    /* renamed from: A */
    public static void m52983A(byte[] bArr, int i, int i2, or5 or5Var) {
        int iM53012m = m53012m(i, i2, or5Var.f38787g);
        int i3 = iM53012m / 8;
        bArr[i3] = (byte) ((1 << (iM53012m % 8)) | bArr[i3]);
    }

    /* renamed from: B */
    public static void m52984B(InputStream inputStream) {
        o76.m41667h(inputStream);
        int iM41669j = o76.m41669j(inputStream);
        if (iM41669j == 6 || iM41669j == 7) {
            return;
        }
        while (iM41669j > 0) {
            o76.m41669j(inputStream);
            for (int iM41669j2 = o76.m41669j(inputStream); iM41669j2 > 0; iM41669j2--) {
                o76.m41667h(inputStream);
            }
            iM41669j--;
        }
    }

    /* renamed from: C */
    public static boolean m52985C(OutputStream outputStream, byte[] bArr, or5[] or5VarArr) throws IOException {
        if (Arrays.equals(bArr, wmd.f52350a)) {
            m52998P(outputStream, or5VarArr);
            return true;
        }
        if (Arrays.equals(bArr, wmd.f52351b)) {
            m52997O(outputStream, or5VarArr);
            return true;
        }
        if (Arrays.equals(bArr, wmd.f52353d)) {
            m52995M(outputStream, or5VarArr);
            return true;
        }
        if (Arrays.equals(bArr, wmd.f52352c)) {
            m52996N(outputStream, or5VarArr);
            return true;
        }
        if (!Arrays.equals(bArr, wmd.f52354e)) {
            return false;
        }
        m52994L(outputStream, or5VarArr);
        return true;
    }

    /* renamed from: D */
    public static void m52986D(OutputStream outputStream, or5 or5Var) throws IOException {
        int iIntValue = 0;
        for (int i : or5Var.f38788h) {
            Integer numValueOf = Integer.valueOf(i);
            o76.m41675p(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    /* renamed from: E */
    public static ycj m52987E(or5[] or5VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            o76.m41675p(byteArrayOutputStream, or5VarArr.length);
            int i = 2;
            for (or5 or5Var : or5VarArr) {
                o76.m41676q(byteArrayOutputStream, or5Var.f38783c);
                o76.m41676q(byteArrayOutputStream, or5Var.f38784d);
                o76.m41676q(byteArrayOutputStream, or5Var.f38787g);
                String strM53009j = m53009j(or5Var.f38781a, or5Var.f38782b, wmd.f52350a);
                int iM41670k = o76.m41670k(strM53009j);
                o76.m41675p(byteArrayOutputStream, iM41670k);
                i = i + 4 + 4 + 4 + 2 + (iM41670k * 1);
                o76.m41673n(byteArrayOutputStream, strM53009j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                ycj ycjVar = new ycj(jz6.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return ycjVar;
            }
            throw o76.m41662c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: F */
    public static void m52988F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f50560a);
        outputStream.write(bArr);
    }

    /* renamed from: G */
    public static void m52989G(OutputStream outputStream, or5 or5Var) throws IOException {
        m52993K(outputStream, or5Var);
        m52986D(outputStream, or5Var);
        m52991I(outputStream, or5Var);
    }

    /* renamed from: H */
    public static void m52990H(OutputStream outputStream, or5 or5Var, String str) throws IOException {
        o76.m41675p(outputStream, o76.m41670k(str));
        o76.m41675p(outputStream, or5Var.f38785e);
        o76.m41676q(outputStream, or5Var.f38786f);
        o76.m41676q(outputStream, or5Var.f38783c);
        o76.m41676q(outputStream, or5Var.f38787g);
        o76.m41673n(outputStream, str);
    }

    /* renamed from: I */
    public static void m52991I(OutputStream outputStream, or5 or5Var) throws IOException {
        byte[] bArr = new byte[m53010k(or5Var.f38787g)];
        for (Map.Entry entry : or5Var.f38789i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                m52983A(bArr, 2, iIntValue, or5Var);
            }
            if ((iIntValue2 & 4) != 0) {
                m52983A(bArr, 4, iIntValue, or5Var);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: J */
    public static void m52992J(OutputStream outputStream, int i, or5 or5Var) throws IOException {
        byte[] bArr = new byte[m53011l(i, or5Var.f38787g)];
        for (Map.Entry entry : or5Var.f38789i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i2 = 0;
            for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                if (i3 != 1 && (i3 & i) != 0) {
                    if ((i3 & iIntValue2) == i3) {
                        int i4 = (or5Var.f38787g * i2) + iIntValue;
                        int i5 = i4 / 8;
                        bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
                    }
                    i2++;
                }
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: K */
    public static void m52993K(OutputStream outputStream, or5 or5Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : or5Var.f38789i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                o76.m41675p(outputStream, iIntValue - i);
                o76.m41675p(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* renamed from: L */
    public static void m52994L(OutputStream outputStream, or5[] or5VarArr) throws IOException {
        o76.m41675p(outputStream, or5VarArr.length);
        for (or5 or5Var : or5VarArr) {
            String strM53009j = m53009j(or5Var.f38781a, or5Var.f38782b, wmd.f52354e);
            o76.m41675p(outputStream, o76.m41670k(strM53009j));
            o76.m41675p(outputStream, or5Var.f38789i.size());
            o76.m41675p(outputStream, or5Var.f38788h.length);
            o76.m41676q(outputStream, or5Var.f38783c);
            o76.m41673n(outputStream, strM53009j);
            Iterator it = or5Var.f38789i.keySet().iterator();
            while (it.hasNext()) {
                o76.m41675p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i : or5Var.f38788h) {
                o76.m41675p(outputStream, i);
            }
        }
    }

    /* renamed from: M */
    public static void m52995M(OutputStream outputStream, or5[] or5VarArr) throws IOException {
        o76.m41677r(outputStream, or5VarArr.length);
        for (or5 or5Var : or5VarArr) {
            int size = or5Var.f38789i.size() * 4;
            String strM53009j = m53009j(or5Var.f38781a, or5Var.f38782b, wmd.f52353d);
            o76.m41675p(outputStream, o76.m41670k(strM53009j));
            o76.m41675p(outputStream, or5Var.f38788h.length);
            o76.m41676q(outputStream, size);
            o76.m41676q(outputStream, or5Var.f38783c);
            o76.m41673n(outputStream, strM53009j);
            Iterator it = or5Var.f38789i.keySet().iterator();
            while (it.hasNext()) {
                o76.m41675p(outputStream, ((Integer) it.next()).intValue());
                o76.m41675p(outputStream, 0);
            }
            for (int i : or5Var.f38788h) {
                o76.m41675p(outputStream, i);
            }
        }
    }

    /* renamed from: N */
    public static void m52996N(OutputStream outputStream, or5[] or5VarArr) throws IOException {
        byte[] bArrM53001b = m53001b(or5VarArr, wmd.f52352c);
        o76.m41677r(outputStream, or5VarArr.length);
        o76.m41672m(outputStream, bArrM53001b);
    }

    /* renamed from: O */
    public static void m52997O(OutputStream outputStream, or5[] or5VarArr) throws IOException {
        byte[] bArrM53001b = m53001b(or5VarArr, wmd.f52351b);
        o76.m41677r(outputStream, or5VarArr.length);
        o76.m41672m(outputStream, bArrM53001b);
    }

    /* renamed from: P */
    public static void m52998P(OutputStream outputStream, or5[] or5VarArr) throws IOException {
        m52999Q(outputStream, or5VarArr);
    }

    /* renamed from: Q */
    public static void m52999Q(OutputStream outputStream, or5[] or5VarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m52987E(or5VarArr));
        arrayList.add(m53002c(or5VarArr));
        arrayList.add(m53003d(or5VarArr));
        long length2 = wmd.f52350a.length + f50560a.length + 4 + (arrayList.size() * 16);
        o76.m41676q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            ycj ycjVar = (ycj) arrayList.get(i);
            o76.m41676q(outputStream, ycjVar.f55277a.getValue());
            o76.m41676q(outputStream, length2);
            if (ycjVar.f55280d) {
                byte[] bArr = ycjVar.f55279c;
                long length3 = bArr.length;
                byte[] bArrM41661b = o76.m41661b(bArr);
                arrayList2.add(bArrM41661b);
                o76.m41676q(outputStream, bArrM41661b.length);
                o76.m41676q(outputStream, length3);
                length = bArrM41661b.length;
            } else {
                arrayList2.add(ycjVar.f55279c);
                o76.m41676q(outputStream, ycjVar.f55279c.length);
                o76.m41676q(outputStream, 0L);
                length = ycjVar.f55279c.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    /* renamed from: a */
    public static int m53000a(or5 or5Var) {
        Iterator it = or5Var.f38789i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    /* renamed from: b */
    public static byte[] m53001b(or5[] or5VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int iM41670k = 0;
        for (or5 or5Var : or5VarArr) {
            iM41670k += o76.m41670k(m53009j(or5Var.f38781a, or5Var.f38782b, bArr)) + 16 + (or5Var.f38785e * 2) + or5Var.f38786f + m53010k(or5Var.f38787g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM41670k);
        if (Arrays.equals(bArr, wmd.f52352c)) {
            int length = or5VarArr.length;
            while (i < length) {
                or5 or5Var2 = or5VarArr[i];
                m52990H(byteArrayOutputStream, or5Var2, m53009j(or5Var2.f38781a, or5Var2.f38782b, bArr));
                m52989G(byteArrayOutputStream, or5Var2);
                i++;
            }
        } else {
            for (or5 or5Var3 : or5VarArr) {
                m52990H(byteArrayOutputStream, or5Var3, m53009j(or5Var3.f38781a, or5Var3.f38782b, bArr));
            }
            int length2 = or5VarArr.length;
            while (i < length2) {
                m52989G(byteArrayOutputStream, or5VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iM41670k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw o76.m41662c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM41670k);
    }

    /* renamed from: c */
    public static ycj m53002c(or5[] or5VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < or5VarArr.length; i2++) {
            try {
                or5 or5Var = or5VarArr[i2];
                o76.m41675p(byteArrayOutputStream, i2);
                o76.m41675p(byteArrayOutputStream, or5Var.f38785e);
                i = i + 2 + 2 + (or5Var.f38785e * 2);
                m52986D(byteArrayOutputStream, or5Var);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            ycj ycjVar = new ycj(jz6.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return ycjVar;
        }
        throw o76.m41662c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: d */
    public static ycj m53003d(or5[] or5VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < or5VarArr.length; i2++) {
            try {
                or5 or5Var = or5VarArr[i2];
                int iM53000a = m53000a(or5Var);
                byte[] bArrM53004e = m53004e(iM53000a, or5Var);
                byte[] bArrM53005f = m53005f(or5Var);
                o76.m41675p(byteArrayOutputStream, i2);
                int length = bArrM53004e.length + 2 + bArrM53005f.length;
                o76.m41676q(byteArrayOutputStream, length);
                o76.m41675p(byteArrayOutputStream, iM53000a);
                byteArrayOutputStream.write(bArrM53004e);
                byteArrayOutputStream.write(bArrM53005f);
                i = i + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            ycj ycjVar = new ycj(jz6.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return ycjVar;
        }
        throw o76.m41662c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: e */
    public static byte[] m53004e(int i, or5 or5Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m52992J(byteArrayOutputStream, i, or5Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static byte[] m53005f(or5 or5Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m52993K(byteArrayOutputStream, or5Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public static String m53006g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* renamed from: h */
    public static String m53007h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    /* renamed from: i */
    public static or5 m53008i(or5[] or5VarArr, String str) {
        if (or5VarArr.length <= 0) {
            return null;
        }
        String strM53007h = m53007h(str);
        for (int i = 0; i < or5VarArr.length; i++) {
            if (or5VarArr[i].f38782b.equals(strM53007h)) {
                return or5VarArr[i];
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m53009j(String str, String str2, byte[] bArr) {
        String strM54714a = wmd.m54714a(bArr);
        if (str.length() <= 0) {
            return m53006g(str2, strM54714a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m53006g(str2, strM54714a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + wmd.m54714a(bArr) + str2;
    }

    /* renamed from: k */
    public static int m53010k(int i) {
        return m53025z(i * 2) / 8;
    }

    /* renamed from: l */
    public static int m53011l(int i, int i2) {
        return m53025z(Integer.bitCount(i & (-2)) * i2) / 8;
    }

    /* renamed from: m */
    public static int m53012m(int i, int i2, int i3) {
        if (i == 1) {
            throw o76.m41662c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw o76.m41662c("Unexpected flag: " + i);
    }

    /* renamed from: n */
    public static int[] m53013n(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iM41667h = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM41667h += o76.m41667h(inputStream);
            iArr[i2] = iM41667h;
        }
        return iArr;
    }

    /* renamed from: o */
    public static int m53014o(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(m53012m(2, i, i2)) ? 2 : 0;
        return bitSet.get(m53012m(4, i, i2)) ? i3 | 4 : i3;
    }

    /* renamed from: p */
    public static byte[] m53015p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, o76.m41663d(inputStream, bArr.length))) {
            return o76.m41663d(inputStream, wmd.f52351b.length);
        }
        throw o76.m41662c("Invalid magic");
    }

    /* renamed from: q */
    public static void m53016q(InputStream inputStream, or5 or5Var) {
        int iAvailable = inputStream.available() - or5Var.f38786f;
        int iM41667h = 0;
        while (inputStream.available() > iAvailable) {
            iM41667h += o76.m41667h(inputStream);
            or5Var.f38789i.put(Integer.valueOf(iM41667h), 1);
            for (int iM41667h2 = o76.m41667h(inputStream); iM41667h2 > 0; iM41667h2--) {
                m52984B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw o76.m41662c("Read too much data during profile line parse");
        }
    }

    /* renamed from: r */
    public static or5[] m53017r(InputStream inputStream, byte[] bArr, byte[] bArr2, or5[] or5VarArr) {
        if (Arrays.equals(bArr, wmd.f52355f)) {
            if (Arrays.equals(wmd.f52350a, bArr2)) {
                throw o76.m41662c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m53018s(inputStream, bArr, or5VarArr);
        }
        if (Arrays.equals(bArr, wmd.f52356g)) {
            return m53020u(inputStream, bArr2, or5VarArr);
        }
        throw o76.m41662c("Unsupported meta version");
    }

    /* renamed from: s */
    public static or5[] m53018s(InputStream inputStream, byte[] bArr, or5[] or5VarArr) throws IOException {
        if (!Arrays.equals(bArr, wmd.f52355f)) {
            throw o76.m41662c("Unsupported meta version");
        }
        int iM41669j = o76.m41669j(inputStream);
        byte[] bArrM41664e = o76.m41664e(inputStream, (int) o76.m41668i(inputStream), (int) o76.m41668i(inputStream));
        if (inputStream.read() > 0) {
            throw o76.m41662c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM41664e);
        try {
            or5[] or5VarArrM53019t = m53019t(byteArrayInputStream, iM41669j, or5VarArr);
            byteArrayInputStream.close();
            return or5VarArrM53019t;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public static or5[] m53019t(InputStream inputStream, int i, or5[] or5VarArr) {
        if (inputStream.available() == 0) {
            return new or5[0];
        }
        if (i != or5VarArr.length) {
            throw o76.m41662c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM41667h = o76.m41667h(inputStream);
            iArr[i2] = o76.m41667h(inputStream);
            strArr[i2] = o76.m41665f(inputStream, iM41667h);
        }
        for (int i3 = 0; i3 < i; i3++) {
            or5 or5Var = or5VarArr[i3];
            if (!or5Var.f38782b.equals(strArr[i3])) {
                throw o76.m41662c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            or5Var.f38785e = i4;
            or5Var.f38788h = m53013n(inputStream, i4);
        }
        return or5VarArr;
    }

    /* renamed from: u */
    public static or5[] m53020u(InputStream inputStream, byte[] bArr, or5[] or5VarArr) throws IOException {
        int iM41667h = o76.m41667h(inputStream);
        byte[] bArrM41664e = o76.m41664e(inputStream, (int) o76.m41668i(inputStream), (int) o76.m41668i(inputStream));
        if (inputStream.read() > 0) {
            throw o76.m41662c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM41664e);
        try {
            or5[] or5VarArrM53021v = m53021v(byteArrayInputStream, bArr, iM41667h, or5VarArr);
            byteArrayInputStream.close();
            return or5VarArrM53021v;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: v */
    public static or5[] m53021v(InputStream inputStream, byte[] bArr, int i, or5[] or5VarArr) {
        if (inputStream.available() == 0) {
            return new or5[0];
        }
        if (i != or5VarArr.length) {
            throw o76.m41662c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            o76.m41667h(inputStream);
            String strM41665f = o76.m41665f(inputStream, o76.m41667h(inputStream));
            long jM41668i = o76.m41668i(inputStream);
            int iM41667h = o76.m41667h(inputStream);
            or5 or5VarM53008i = m53008i(or5VarArr, strM41665f);
            if (or5VarM53008i == null) {
                throw o76.m41662c("Missing profile key: " + strM41665f);
            }
            or5VarM53008i.f38784d = jM41668i;
            int[] iArrM53013n = m53013n(inputStream, iM41667h);
            if (Arrays.equals(bArr, wmd.f52354e)) {
                or5VarM53008i.f38785e = iM41667h;
                or5VarM53008i.f38788h = iArrM53013n;
            }
        }
        return or5VarArr;
    }

    /* renamed from: w */
    public static void m53022w(InputStream inputStream, or5 or5Var) {
        BitSet bitSetValueOf = BitSet.valueOf(o76.m41663d(inputStream, o76.m41660a(or5Var.f38787g * 2)));
        int i = 0;
        while (true) {
            int i2 = or5Var.f38787g;
            if (i >= i2) {
                return;
            }
            int iM53014o = m53014o(bitSetValueOf, i, i2);
            if (iM53014o != 0) {
                Integer num = (Integer) or5Var.f38789i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                or5Var.f38789i.put(Integer.valueOf(i), Integer.valueOf(iM53014o | num.intValue()));
            }
            i++;
        }
    }

    /* renamed from: x */
    public static or5[] m53023x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, wmd.f52351b)) {
            throw o76.m41662c("Unsupported version");
        }
        int iM41669j = o76.m41669j(inputStream);
        byte[] bArrM41664e = o76.m41664e(inputStream, (int) o76.m41668i(inputStream), (int) o76.m41668i(inputStream));
        if (inputStream.read() > 0) {
            throw o76.m41662c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM41664e);
        try {
            or5[] or5VarArrM53024y = m53024y(byteArrayInputStream, str, iM41669j);
            byteArrayInputStream.close();
            return or5VarArrM53024y;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: y */
    public static or5[] m53024y(InputStream inputStream, String str, int i) {
        if (inputStream.available() == 0) {
            return new or5[0];
        }
        or5[] or5VarArr = new or5[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM41667h = o76.m41667h(inputStream);
            int iM41667h2 = o76.m41667h(inputStream);
            or5VarArr[i2] = new or5(str, o76.m41665f(inputStream, iM41667h), o76.m41668i(inputStream), 0L, iM41667h2, (int) o76.m41668i(inputStream), (int) o76.m41668i(inputStream), new int[iM41667h2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            or5 or5Var = or5VarArr[i3];
            m53016q(inputStream, or5Var);
            or5Var.f38788h = m53013n(inputStream, or5Var.f38785e);
            m53022w(inputStream, or5Var);
        }
        return or5VarArr;
    }

    /* renamed from: z */
    public static int m53025z(int i) {
        return ((i + 8) - 1) & (-8);
    }
}
