package w7;

import android.content.pm.PackageInfo;
import com.sun.mail.util.AbstractC1452a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w7.c */
/* loaded from: classes.dex */
public abstract class AbstractC7945c {

    /* renamed from: a */
    public static final byte[] f38218a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f38219b = {112, 114, 109, 0};

    /* renamed from: c */
    public static final byte[] f38220c = {48, 49, 53, 0};

    /* renamed from: d */
    public static final byte[] f38221d = {48, 49, 48, 0};

    /* renamed from: e */
    public static final byte[] f38222e = {48, 48, 57, 0};

    /* renamed from: f */
    public static final byte[] f38223f = {48, 48, 53, 0};

    /* renamed from: g */
    public static final byte[] f38224g = {48, 48, 49, 0};

    /* renamed from: h */
    public static final byte[] f38225h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f38226i = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m15098a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    /* renamed from: b */
    public static byte[] m15099b(C7943a[] c7943aArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (C7943a c7943a : c7943aArr) {
            length += ((((c7943a.f38215g * 2) + 7) & (-8)) / 8) + (c7943a.f38213e * 2) + m15101d(bArr, c7943a.f38209a, c7943a.f38210b).getBytes(StandardCharsets.UTF_8).length + 16 + c7943a.f38214f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f38222e)) {
            int length2 = c7943aArr.length;
            while (i10 < length2) {
                C7943a c7943a2 = c7943aArr[i10];
                m15114q(byteArrayOutputStream, c7943a2, m15101d(bArr, c7943a2.f38209a, c7943a2.f38210b));
                m15113p(byteArrayOutputStream, c7943a2);
                i10++;
            }
        } else {
            for (C7943a c7943a3 : c7943aArr) {
                m15114q(byteArrayOutputStream, c7943a3, m15101d(bArr, c7943a3.f38209a, c7943a3.f38210b));
            }
            int length3 = c7943aArr.length;
            while (i10 < length3) {
                m15113p(byteArrayOutputStream, c7943aArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* renamed from: c */
    public static boolean m15100c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : fileArrListFiles) {
            z6 = m15100c(file2) && z6;
        }
        return z6;
    }

    /* renamed from: d */
    public static String m15101d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f38224g;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f38223f;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC1452a.m4564k(AbstractC1452a.m4568o(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* renamed from: e */
    public static void m15102e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m15103f(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(AbstractC4801l.m9730d(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m15104g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iM15110m = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM15110m += (int) m15110m(byteArrayInputStream, 2);
            iArr[i11] = iM15110m;
        }
        return iArr;
    }

    /* renamed from: h */
    public static byte[] m15105h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[NewHope.SENDB_BYTES];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i12 == i10) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: i */
    public static C7943a[] m15106i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C7943a[] c7943aArr) throws IOException {
        byte[] bArr3 = f38225h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f38226i)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM15110m = (int) m15110m(fileInputStream, 2);
            byte[] bArrM15105h = m15105h(fileInputStream, (int) m15110m(fileInputStream, 4), (int) m15110m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM15105h);
            try {
                C7943a[] c7943aArrM15108k = m15108k(byteArrayInputStream, bArr2, iM15110m, c7943aArr);
                byteArrayInputStream.close();
                return c7943aArrM15108k;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f38220c, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM15110m2 = (int) m15110m(fileInputStream, 1);
        byte[] bArrM15105h2 = m15105h(fileInputStream, (int) m15110m(fileInputStream, 4), (int) m15110m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM15105h2);
        try {
            C7943a[] c7943aArrM15107j = m15107j(byteArrayInputStream2, iM15110m2, c7943aArr);
            byteArrayInputStream2.close();
            return c7943aArrM15107j;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* renamed from: j */
    public static C7943a[] m15107j(ByteArrayInputStream byteArrayInputStream, int i10, C7943a[] c7943aArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C7943a[0];
        }
        if (i10 != c7943aArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM15110m = (int) m15110m(byteArrayInputStream, 2);
            iArr[i11] = (int) m15110m(byteArrayInputStream, 2);
            strArr[i11] = new String(m15103f(byteArrayInputStream, iM15110m), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C7943a c7943a = c7943aArr[i12];
            if (!c7943a.f38210b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            c7943a.f38213e = i13;
            c7943a.f38216h = m15104g(byteArrayInputStream, i13);
        }
        return c7943aArr;
    }

    /* renamed from: k */
    public static C7943a[] m15108k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, C7943a[] c7943aArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C7943a[0];
        }
        if (i10 != c7943aArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m15110m(byteArrayInputStream, 2);
            String str = new String(m15103f(byteArrayInputStream, (int) m15110m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM15110m = m15110m(byteArrayInputStream, 4);
            int iM15110m = (int) m15110m(byteArrayInputStream, 2);
            C7943a c7943a = null;
            if (c7943aArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= c7943aArr.length) {
                        break;
                    }
                    if (c7943aArr[i12].f38210b.equals(strSubstring)) {
                        c7943a = c7943aArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (c7943a == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c7943a.f38212d = jM15110m;
            int[] iArrM15104g = m15104g(byteArrayInputStream, iM15110m);
            if (Arrays.equals(bArr, f38224g)) {
                c7943a.f38213e = iM15110m;
                c7943a.f38216h = iArrM15104g;
            }
        }
        return c7943aArr;
    }

    /* renamed from: l */
    public static C7943a[] m15109l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f38221d)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM15110m = (int) m15110m(fileInputStream, 1);
        byte[] bArrM15105h = m15105h(fileInputStream, (int) m15110m(fileInputStream, 4), (int) m15110m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM15105h);
        try {
            C7943a[] c7943aArrM15111n = m15111n(byteArrayInputStream, str, iM15110m);
            byteArrayInputStream.close();
            return c7943aArrM15111n;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: m */
    public static long m15110m(InputStream inputStream, int i10) throws IOException {
        byte[] bArrM15103f = m15103f(inputStream, i10);
        long j6 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j6 += (bArrM15103f[i11] & 255) << (i11 * 8);
        }
        return j6;
    }

    /* renamed from: n */
    public static C7943a[] m15111n(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C7943a[0];
        }
        C7943a[] c7943aArr = new C7943a[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int iM15110m = (int) m15110m(byteArrayInputStream, 2);
            int iM15110m2 = (int) m15110m(byteArrayInputStream, 2);
            c7943aArr[i12] = new C7943a(str, new String(m15103f(byteArrayInputStream, iM15110m), StandardCharsets.UTF_8), m15110m(byteArrayInputStream, 4), iM15110m2, (int) m15110m(byteArrayInputStream, 4), (int) m15110m(byteArrayInputStream, 4), new int[iM15110m2], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            C7943a c7943a = c7943aArr[i13];
            int iAvailable = byteArrayInputStream.available();
            int i14 = c7943a.f38214f;
            int i15 = c7943a.f38215g;
            TreeMap treeMap = c7943a.f38217i;
            int i16 = iAvailable - i14;
            int iM15110m3 = i11;
            while (byteArrayInputStream.available() > i16) {
                iM15110m3 += (int) m15110m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM15110m3), 1);
                int iM15110m4 = (int) m15110m(byteArrayInputStream, 2);
                while (iM15110m4 > 0) {
                    m15110m(byteArrayInputStream, 2);
                    int iM15110m5 = (int) m15110m(byteArrayInputStream, 1);
                    if (iM15110m5 != 6 && iM15110m5 != 7) {
                        while (iM15110m5 > 0) {
                            m15110m(byteArrayInputStream, 1);
                            int i17 = i11;
                            int i18 = i13;
                            for (int iM15110m6 = (int) m15110m(byteArrayInputStream, 1); iM15110m6 > 0; iM15110m6--) {
                                m15110m(byteArrayInputStream, 2);
                            }
                            iM15110m5--;
                            i11 = i17;
                            i13 = i18;
                        }
                    }
                    iM15110m4--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i19 = i11;
            int i20 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c7943a.f38216h = m15104g(byteArrayInputStream, c7943a.f38213e);
            BitSet bitSetValueOf = BitSet.valueOf(m15103f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i15; i21++) {
                int i22 = bitSetValueOf.get(i21) ? 2 : i19;
                if (bitSetValueOf.get(i21 + i15)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | numValueOf.intValue()));
                }
            }
            i13 = i20 + 1;
            i11 = i19;
        }
        return c7943aArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m15112o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C7943a[] c7943aArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f38220c;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f38221d;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM15099b = m15099b(c7943aArr, bArr3);
                m15117t(byteArrayOutputStream, c7943aArr.length, 1);
                m15117t(byteArrayOutputStream, bArrM15099b.length, 4);
                byte[] bArrM15098a = m15098a(bArrM15099b);
                m15117t(byteArrayOutputStream, bArrM15098a.length, 4);
                byteArrayOutputStream.write(bArrM15098a);
                return true;
            }
            byte[] bArr4 = f38223f;
            if (Arrays.equals(bArr, bArr4)) {
                m15117t(byteArrayOutputStream, c7943aArr.length, 1);
                for (C7943a c7943a : c7943aArr) {
                    int size = c7943a.f38217i.size() * 4;
                    String strM15101d = m15101d(bArr4, c7943a.f38209a, c7943a.f38210b);
                    Charset charset = StandardCharsets.UTF_8;
                    m15118u(byteArrayOutputStream, strM15101d.getBytes(charset).length);
                    m15118u(byteArrayOutputStream, c7943a.f38216h.length);
                    m15117t(byteArrayOutputStream, size, 4);
                    m15117t(byteArrayOutputStream, c7943a.f38211c, 4);
                    byteArrayOutputStream.write(strM15101d.getBytes(charset));
                    Iterator it = c7943a.f38217i.keySet().iterator();
                    while (it.hasNext()) {
                        m15118u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m15118u(byteArrayOutputStream, 0);
                    }
                    for (int i11 : c7943a.f38216h) {
                        m15118u(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f38222e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM15099b2 = m15099b(c7943aArr, bArr5);
                m15117t(byteArrayOutputStream, c7943aArr.length, 1);
                m15117t(byteArrayOutputStream, bArrM15099b2.length, 4);
                byte[] bArrM15098a2 = m15098a(bArrM15099b2);
                m15117t(byteArrayOutputStream, bArrM15098a2.length, 4);
                byteArrayOutputStream.write(bArrM15098a2);
                return true;
            }
            byte[] bArr6 = f38224g;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m15118u(byteArrayOutputStream, c7943aArr.length);
            for (C7943a c7943a2 : c7943aArr) {
                String str = c7943a2.f38209a;
                TreeMap treeMap = c7943a2.f38217i;
                String strM15101d2 = m15101d(bArr6, str, c7943a2.f38210b);
                Charset charset2 = StandardCharsets.UTF_8;
                m15118u(byteArrayOutputStream, strM15101d2.getBytes(charset2).length);
                m15118u(byteArrayOutputStream, treeMap.size());
                m15118u(byteArrayOutputStream, c7943a2.f38216h.length);
                m15117t(byteArrayOutputStream, c7943a2.f38211c, 4);
                byteArrayOutputStream.write(strM15101d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m15118u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : c7943a2.f38216h) {
                    m15118u(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m15118u(byteArrayOutputStream2, c7943aArr.length);
            int i13 = 2;
            int i14 = 2;
            for (C7943a c7943a3 : c7943aArr) {
                m15117t(byteArrayOutputStream2, c7943a3.f38211c, 4);
                m15117t(byteArrayOutputStream2, c7943a3.f38212d, 4);
                m15117t(byteArrayOutputStream2, c7943a3.f38215g, 4);
                String strM15101d3 = m15101d(bArr2, c7943a3.f38209a, c7943a3.f38210b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM15101d3.getBytes(charset3).length;
                m15118u(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strM15101d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            C7949g c7949g = new C7949g(EnumC7944b.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c7949g);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            for (int i16 = 0; i16 < c7943aArr.length; i16++) {
                try {
                    C7943a c7943a4 = c7943aArr[i16];
                    m15118u(byteArrayOutputStream3, i16);
                    m15118u(byteArrayOutputStream3, c7943a4.f38213e);
                    i15 = i15 + 4 + (c7943a4.f38213e * i13);
                    int[] iArr = c7943a4.f38216h;
                    int length3 = iArr.length;
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < length3) {
                        int i19 = iArr[i17];
                        m15118u(byteArrayOutputStream3, i19 - i18);
                        i17++;
                        i13 = i13;
                        i18 = i19;
                    }
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            C7949g c7949g2 = new C7949g(EnumC7944b.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c7949g2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < c7943aArr.length) {
                try {
                    C7943a c7943a5 = c7943aArr[i20];
                    Iterator it3 = c7943a5.f38217i.entrySet().iterator();
                    int iIntValue = i10;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m15115r(byteArrayOutputStream4, iIntValue, c7943a5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m15116s(byteArrayOutputStream4, c7943a5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m15118u(byteArrayOutputStream3, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m15117t(byteArrayOutputStream3, length4, 4);
                            m15118u(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i22 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                            i10 = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            C7949g c7949g3 = new C7949g(EnumC7944b.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c7949g3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + (arrayList2.size() * 16);
            m15117t(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                C7949g c7949g4 = (C7949g) arrayList2.get(i23);
                EnumC7944b enumC7944b = c7949g4.f38234a;
                byte[] bArr7 = c7949g4.f38235b;
                m15117t(byteArrayOutputStream, enumC7944b.getValue(), 4);
                m15117t(byteArrayOutputStream, size2, 4);
                if (c7949g4.f38236c) {
                    long length5 = bArr7.length;
                    byte[] bArrM15098a3 = m15098a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM15098a3);
                    m15117t(byteArrayOutputStream, bArrM15098a3.length, 4);
                    m15117t(byteArrayOutputStream, length5, 4);
                    length = bArrM15098a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m15117t(byteArrayOutputStream, bArr7.length, 4);
                    m15117t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    /* renamed from: p */
    public static void m15113p(ByteArrayOutputStream byteArrayOutputStream, C7943a c7943a) throws IOException {
        m15116s(byteArrayOutputStream, c7943a);
        int i10 = c7943a.f38215g;
        int[] iArr = c7943a.f38216h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            m15118u(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c7943a.f38217i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: q */
    public static void m15114q(ByteArrayOutputStream byteArrayOutputStream, C7943a c7943a, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m15118u(byteArrayOutputStream, str.getBytes(charset).length);
        m15118u(byteArrayOutputStream, c7943a.f38213e);
        m15117t(byteArrayOutputStream, c7943a.f38214f, 4);
        m15117t(byteArrayOutputStream, c7943a.f38211c, 4);
        m15117t(byteArrayOutputStream, c7943a.f38215g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: r */
    public static void m15115r(ByteArrayOutputStream byteArrayOutputStream, int i10, C7943a c7943a) throws IOException {
        int i11 = c7943a.f38215g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : c7943a.f38217i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: s */
    public static void m15116s(ByteArrayOutputStream byteArrayOutputStream, C7943a c7943a) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : c7943a.f38217i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m15118u(byteArrayOutputStream, iIntValue - i10);
                m15118u(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* renamed from: t */
    public static void m15117t(ByteArrayOutputStream byteArrayOutputStream, long j6, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j6 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: u */
    public static void m15118u(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        m15117t(byteArrayOutputStream, i10, 2);
    }
}
