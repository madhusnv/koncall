package jakarta.mail.internet;

import a1.C0005d;
import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.BEncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.QDecoderStream;
import com.sun.mail.util.QEncoderStream;
import com.sun.mail.util.QPDecoderStream;
import com.sun.mail.util.QPEncoderStream;
import com.sun.mail.util.UUDecoderStream;
import com.sun.mail.util.UUEncoderStream;
import jakarta.mail.MessagingException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.bouncycastle.i18n.LocalizedMessage;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.s */
/* loaded from: classes3.dex */
public abstract class AbstractC3670s {

    /* renamed from: a */
    public static final HashMap f19374a = new HashMap();

    /* renamed from: b */
    public static final boolean f19375b = PropUtil.getBooleanSystemProperty("mail.mime.decodetext.strict", true);

    /* renamed from: c */
    public static final boolean f19376c = PropUtil.getBooleanSystemProperty("mail.mime.encodeeol.strict", false);

    /* renamed from: d */
    public static final boolean f19377d = PropUtil.getBooleanSystemProperty("mail.mime.ignoreunknownencoding", false);

    /* renamed from: e */
    public static final boolean f19378e = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);

    /* renamed from: f */
    public static final boolean f19379f = PropUtil.getBooleanSystemProperty("mail.mime.foldencodedwords", false);

    /* renamed from: g */
    public static final boolean f19380g = PropUtil.getBooleanSystemProperty("mail.mime.foldtext", true);

    /* renamed from: h */
    public static String f19381h;

    /* renamed from: i */
    public static String f19382i;

    /* renamed from: j */
    public static final HashMap f19383j;

    /* renamed from: k */
    public static final HashMap f19384k;

    static {
        HashMap map = new HashMap(40);
        f19384k = map;
        HashMap map2 = new HashMap(14);
        f19383j = map2;
        try {
            InputStream resourceAsStream = AbstractC3670s.class.getResourceAsStream("/META-INF/javamail.charset.map");
            if (resourceAsStream != null) {
                try {
                    LineInputStream lineInputStream = new LineInputStream(resourceAsStream);
                    try {
                        m8250n(lineInputStream, map);
                        m8250n(lineInputStream, map2);
                        lineInputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        resourceAsStream = lineInputStream;
                        try {
                            resourceAsStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Exception unused2) {
        }
        HashMap map3 = f19384k;
        if (map3.isEmpty()) {
            map3.put("8859_1", LocalizedMessage.DEFAULT_ENCODING);
            map3.put("iso8859_1", LocalizedMessage.DEFAULT_ENCODING);
            map3.put("iso8859-1", LocalizedMessage.DEFAULT_ENCODING);
            map3.put("8859_2", "ISO-8859-2");
            map3.put("iso8859_2", "ISO-8859-2");
            map3.put("iso8859-2", "ISO-8859-2");
            map3.put("8859_3", "ISO-8859-3");
            map3.put("iso8859_3", "ISO-8859-3");
            map3.put("iso8859-3", "ISO-8859-3");
            map3.put("8859_4", "ISO-8859-4");
            map3.put("iso8859_4", "ISO-8859-4");
            map3.put("iso8859-4", "ISO-8859-4");
            map3.put("8859_5", "ISO-8859-5");
            map3.put("iso8859_5", "ISO-8859-5");
            map3.put("iso8859-5", "ISO-8859-5");
            map3.put("8859_6", "ISO-8859-6");
            map3.put("iso8859_6", "ISO-8859-6");
            map3.put("iso8859-6", "ISO-8859-6");
            map3.put("8859_7", "ISO-8859-7");
            map3.put("iso8859_7", "ISO-8859-7");
            map3.put("iso8859-7", "ISO-8859-7");
            map3.put("8859_8", "ISO-8859-8");
            map3.put("iso8859_8", "ISO-8859-8");
            map3.put("iso8859-8", "ISO-8859-8");
            map3.put("8859_9", "ISO-8859-9");
            map3.put("iso8859_9", "ISO-8859-9");
            map3.put("iso8859-9", "ISO-8859-9");
            map3.put("sjis", "Shift_JIS");
            map3.put("jis", "ISO-2022-JP");
            map3.put("iso2022jp", "ISO-2022-JP");
            map3.put("euc_jp", "euc-jp");
            map3.put("koi8_r", "koi8-r");
            map3.put("euc_cn", "euc-cn");
            map3.put("euc_tw", "euc-tw");
            map3.put("euc_kr", "euc-kr");
        }
        HashMap map4 = f19383j;
        if (map4.isEmpty()) {
            map4.put("iso-2022-cn", "ISO2022CN");
            map4.put("iso-2022-kr", "ISO2022KR");
            map4.put("utf-8", "UTF8");
            map4.put("utf8", "UTF8");
            map4.put("ja_jp.iso2022-7", "ISO2022JP");
            map4.put("ja_jp.eucjp", "EUCJIS");
            map4.put("euc-kr", "KSC5601");
            map4.put("euckr", "KSC5601");
            map4.put("us-ascii", LocalizedMessage.DEFAULT_ENCODING);
            map4.put("x-us-ascii", LocalizedMessage.DEFAULT_ENCODING);
            map4.put("gb2312", "GB18030");
            map4.put("cp936", "GB18030");
            map4.put("ms936", "GB18030");
            map4.put("gbk", "GB18030");
        }
    }

    /* renamed from: a */
    public static int m8237a(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (m8254r(str.charAt(i12))) {
                i10++;
            } else {
                i11++;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i11 > i10 ? 2 : 3;
    }

    /* renamed from: b */
    public static InputStream m8238b(InputStream inputStream, String str) throws MessagingException {
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64DecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("binary") || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit") || f19377d) {
            return inputStream;
        }
        throw new MessagingException("Unknown encoding: ".concat(str));
    }

    /* renamed from: c */
    public static String m8239c(String str) throws IOException {
        int iIndexOf;
        int iIndexOf2;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int iIndexOf3 = str.indexOf("=?", i10);
            if (iIndexOf3 < 0) {
                break;
            }
            sb2.append(str.substring(i10, iIndexOf3));
            int iIndexOf4 = str.indexOf(63, iIndexOf3 + 2);
            if (iIndexOf4 < 0 || (iIndexOf = str.indexOf(63, iIndexOf4 + 1)) < 0 || (iIndexOf2 = str.indexOf("?=", iIndexOf + 1)) < 0) {
                break;
            }
            i10 = iIndexOf2 + 2;
            String strSubstring = str.substring(iIndexOf3, i10);
            try {
                strSubstring = m8241e(strSubstring);
            } catch (ParseException unused) {
            }
            sb2.append(strSubstring);
        }
        if (i10 == 0) {
            return str;
        }
        if (i10 < str.length()) {
            sb2.append(str.substring(i10));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static String m8240d(String str) throws IOException {
        String strM8239c;
        if (str.indexOf("=?") == -1) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " \t\n\r", true);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean zEndsWith = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            char cCharAt = strNextToken.charAt(0);
            if (cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                sb3.append(cCharAt);
            } else {
                try {
                    strM8239c = m8241e(strNextToken);
                    if (!zEndsWith && sb3.length() > 0) {
                        sb2.append((CharSequence) sb3);
                    }
                    zEndsWith = true;
                } catch (ParseException unused) {
                    if (!f19375b) {
                        strM8239c = m8239c(strNextToken);
                        if (strM8239c != strNextToken) {
                            if ((!zEndsWith || !strNextToken.startsWith("=?")) && sb3.length() > 0) {
                                sb2.append((CharSequence) sb3);
                            }
                            zEndsWith = strNextToken.endsWith("?=");
                        } else if (sb3.length() > 0) {
                            sb2.append((CharSequence) sb3);
                        }
                    } else if (sb3.length() > 0) {
                        sb2.append((CharSequence) sb3);
                    }
                    zEndsWith = false;
                }
                strNextToken = strM8239c;
                sb2.append(strNextToken);
                sb3.setLength(0);
            }
        }
        sb2.append((CharSequence) sb3);
        return sb2.toString();
    }

    /* renamed from: e */
    public static String m8241e(String str) throws ParseException, IOException {
        InputStream qDecoderStream;
        if (!str.startsWith("=?")) {
            throw new ParseException("encoded word does not start with \"=?\": ".concat(str));
        }
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == -1) {
            throw new ParseException("encoded word does not include charset: ".concat(str));
        }
        String strSubstring = str.substring(2, iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(42);
        if (iIndexOf2 >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strM8249m = m8249m(strSubstring);
        int i10 = iIndexOf + 1;
        int iIndexOf3 = str.indexOf(63, i10);
        if (iIndexOf3 == -1) {
            throw new ParseException("encoded word does not include encoding: ".concat(str));
        }
        String strSubstring2 = str.substring(i10, iIndexOf3);
        int i11 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf("?=", i11);
        if (iIndexOf4 == -1) {
            throw new ParseException("encoded word does not end with \"?=\": ".concat(str));
        }
        String strSubstring3 = str.substring(i11, iIndexOf4);
        try {
            String str2 = "";
            if (strSubstring3.length() > 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ASCIIUtility.getBytes(strSubstring3));
                if (strSubstring2.equalsIgnoreCase("B")) {
                    qDecoderStream = new BASE64DecoderStream(byteArrayInputStream);
                } else {
                    if (!strSubstring2.equalsIgnoreCase("Q")) {
                        throw new UnsupportedEncodingException("unknown encoding: ".concat(strSubstring2));
                    }
                    qDecoderStream = new QDecoderStream(byteArrayInputStream);
                }
                int iAvailable = byteArrayInputStream.available();
                byte[] bArr = new byte[iAvailable];
                int i12 = qDecoderStream.read(bArr, 0, iAvailable);
                if (i12 > 0) {
                    str2 = new String(bArr, 0, i12, strM8249m);
                }
            }
            int i13 = iIndexOf4 + 2;
            if (i13 >= str.length()) {
                return str2;
            }
            String strSubstring4 = str.substring(i13);
            if (!f19375b) {
                strSubstring4 = m8239c(strSubstring4);
            }
            return str2 + strSubstring4;
        } catch (UnsupportedEncodingException e2) {
            throw e2;
        } catch (IOException e10) {
            throw new ParseException(e10.toString());
        } catch (IllegalArgumentException unused) {
            throw new UnsupportedEncodingException(strM8249m);
        }
    }

    /* renamed from: f */
    public static void m8242f(String str, boolean z6, String str2, int i10, String str3, boolean z10, boolean z11, StringBuilder sb2) throws IOException {
        int length;
        byte[] bytes = str.getBytes(str2);
        if ((z6 ? BEncoderStream.encodedLength(bytes) : QEncoderStream.encodedLength(bytes, z11)) > i10 && (length = str.length()) > 1) {
            int i11 = length / 2;
            if (Character.isHighSurrogate(str.charAt(i11 - 1))) {
                i11--;
            }
            int i12 = i11;
            if (i12 > 0) {
                m8242f(str.substring(0, i12), z6, str2, i10, str3, z10, z11, sb2);
            }
            m8242f(str.substring(i12, length), z6, str2, i10, str3, false, z11, sb2);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream bEncoderStream = z6 ? new BEncoderStream(byteArrayOutputStream) : new QEncoderStream(byteArrayOutputStream, z11);
        try {
            bEncoderStream.write(bytes);
            bEncoderStream.close();
        } catch (IOException unused) {
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!z10) {
            if (f19379f) {
                sb2.append("\r\n ");
            } else {
                sb2.append(" ");
            }
        }
        sb2.append(str3);
        for (byte b10 : byteArray) {
            sb2.append((char) b10);
        }
        sb2.append("?=");
    }

    /* renamed from: g */
    public static OutputStream m8243g(OutputStream outputStream, String str) throws MessagingException {
        if (str != null) {
            if (str.equalsIgnoreCase("base64")) {
                return new BASE64EncoderStream(outputStream);
            }
            if (str.equalsIgnoreCase("quoted-printable")) {
                return new QPEncoderStream(outputStream);
            }
            if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
                return new UUEncoderStream(outputStream);
            }
            if (!str.equalsIgnoreCase("binary") && !str.equalsIgnoreCase("7bit") && !str.equalsIgnoreCase("8bit")) {
                throw new MessagingException("Unknown encoding: ".concat(str));
            }
        }
        return outputStream;
    }

    /* renamed from: h */
    public static String m8244h(String str, String str2, boolean z6) throws IOException {
        String strM8249m;
        int iM8237a = m8237a(str);
        boolean z10 = true;
        if (iM8237a == 1) {
            return str;
        }
        if (str2 == null) {
            strM8249m = m8246j();
            str2 = m8247k();
        } else {
            strM8249m = m8249m(str2);
        }
        String str3 = iM8237a != 3 ? "Q" : "B";
        if (!str3.equalsIgnoreCase("B")) {
            if (!str3.equalsIgnoreCase("Q")) {
                throw new UnsupportedEncodingException("Unknown transfer encoding: ".concat(str3));
            }
            z10 = false;
        }
        boolean z11 = z10;
        StringBuilder sb2 = new StringBuilder();
        m8242f(str, z11, strM8249m, 68 - str2.length(), a1.m14333m("=?", str2, "?", str3, "?"), true, z6, sb2);
        return sb2.toString();
    }

    /* renamed from: i */
    public static String m8245i(int i10, String str) {
        char cCharAt;
        if (!f19380g) {
            return str;
        }
        int length = str.length() - 1;
        while (length >= 0 && ((cCharAt = str.charAt(length)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
            length--;
        }
        if (length != str.length() - 1) {
            str = str.substring(0, length + 1);
        }
        if (str.length() + i10 <= 76) {
            return m8251o(str);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 4);
        char cCharAt2 = 0;
        while (true) {
            if (str.length() + i10 <= 76) {
                break;
            }
            int i11 = 0;
            int i12 = -1;
            while (i11 < str.length() && (i12 == -1 || i10 + i11 <= 76)) {
                char cCharAt3 = str.charAt(i11);
                if ((cCharAt3 == ' ' || cCharAt3 == '\t') && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    i12 = i11;
                }
                i11++;
                cCharAt2 = cCharAt3;
            }
            if (i12 == -1) {
                sb2.append(str);
                str = "";
                break;
            }
            sb2.append(str.substring(0, i12));
            sb2.append("\r\n");
            cCharAt2 = str.charAt(i12);
            sb2.append(cCharAt2);
            str = str.substring(i12 + 1);
            i10 = 1;
        }
        sb2.append(str);
        return m8251o(sb2);
    }

    /* renamed from: j */
    public static String m8246j() {
        String property;
        if (f19381h == null) {
            try {
                property = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
                property = null;
            }
            if (property != null && property.length() > 0) {
                String strM8249m = m8249m(property);
                f19381h = strM8249m;
                return strM8249m;
            }
            try {
                f19381h = System.getProperty("file.encoding", "8859_1");
            } catch (SecurityException unused2) {
                String encoding = new InputStreamReader(new C3669r()).getEncoding();
                f19381h = encoding;
                if (encoding == null) {
                    f19381h = "8859_1";
                }
            }
        }
        return f19381h;
    }

    /* renamed from: k */
    public static String m8247k() {
        if (f19382i == null) {
            try {
                f19382i = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
            }
        }
        if (f19382i == null) {
            f19382i = m8252p(m8246j());
        }
        return f19382i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:29|30|(2:(7:33|(0)(1:39)|52|(2:66|(1:(2:70|(1:68)))(0))(1:75)|(2:118|77)|78|135)(1:36)|(0))(1:40)|(1:47)(2:44|(1:46))|126|48|(1:(1:131)(2:53|134))(2:54|133)|55) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bd, code lost:
    
        if (r14 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
    
        if (r15 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c2, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c6, code lost:
    
        if (r12 > r13) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0 r1 r19
      0x0086: PHI (r0v21 int) = (r0v20 int), (r0v22 int) binds: [B:38:0x0084, B:34:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r1v20 int) = (r1v19 int), (r1v21 int) binds: [B:38:0x0084, B:34:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r19v8 boolean) = (r19v7 boolean), (r19v9 boolean) binds: [B:38:0x0084, B:34:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[EDGE_INSN: B:131:0x00a6->B:51:0x00a6 BREAK  A[LOOP:0: B:23:0x0055->B:56:0x00b7, LOOP_LABEL: LOOP:0: B:23:0x0055->B:56:0x00b7], PHI: r18 r19
      0x00a6: PHI (r18v3 a1.d) = (r18v1 a1.d), (r18v1 a1.d), (r18v4 a1.d) binds: [B:63:0x00c6, B:58:0x00bd, B:131:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r19v3 boolean) = (r19v1 boolean), (r19v1 boolean), (r19v5 boolean) binds: [B:63:0x00c6, B:58:0x00bd, B:131:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m8248l(nw.C5154d r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.AbstractC3670s.m8248l(nw.d):java.lang.String");
    }

    /* renamed from: m */
    public static String m8249m(String str) {
        HashMap map = f19383j;
        if (map == null || str == null) {
            return str;
        }
        String str2 = (String) map.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            try {
                Charset.forName(str2);
            } catch (Exception unused) {
                str2 = null;
            }
        }
        return str2 == null ? str : str2;
    }

    /* renamed from: n */
    public static void m8250n(LineInputStream lineInputStream, HashMap map) {
        while (true) {
            try {
                String line = lineInputStream.readLine();
                if (line == null) {
                    return;
                }
                if (line.startsWith("--") && line.endsWith("--")) {
                    return;
                }
                if (line.trim().length() != 0 && !line.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                    try {
                        String strNextToken = stringTokenizer.nextToken();
                        map.put(strNextToken.toLowerCase(Locale.ENGLISH), stringTokenizer.nextToken());
                    } catch (NoSuchElementException unused) {
                    }
                }
            } catch (IOException unused2) {
                return;
            }
        }
    }

    /* renamed from: o */
    public static String m8251o(CharSequence charSequence) throws IOException {
        char cCharAt;
        int i10 = 0;
        while (i10 < charSequence.length() && (cCharAt = charSequence.charAt(i10)) != '\r' && cCharAt != '\n') {
            i10++;
        }
        if (i10 == charSequence.length()) {
            return charSequence.toString();
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() + 1);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(charSequence.toString()));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                if (line.trim().length() != 0) {
                    if (sb2.length() > 0) {
                        sb2.append("\r\n");
                        char cCharAt2 = line.charAt(0);
                        if (cCharAt2 != ' ' && cCharAt2 != '\t') {
                            sb2.append(' ');
                        }
                    }
                    sb2.append(line);
                }
            } catch (IOException unused) {
                return charSequence.toString();
            }
        }
    }

    /* renamed from: p */
    public static String m8252p(String str) {
        String str2;
        HashMap map = f19384k;
        return (map == null || str == null || (str2 = (String) map.get(str.toLowerCase(Locale.ENGLISH))) == null) ? str : str2;
    }

    /* renamed from: q */
    public static boolean m8253q(C0005d c0005d) throws UnsupportedEncodingException {
        Boolean bool;
        Boolean boolValueOf;
        String strM78w = c0005d.m78w("charset");
        if (strM78w == null) {
            return false;
        }
        String lowerCase = strM78w.toLowerCase(Locale.ENGLISH);
        HashMap map = f19374a;
        synchronized (map) {
            bool = (Boolean) map.get(lowerCase);
        }
        if (bool == null) {
            try {
                byte[] bytes = "\r\n".getBytes(lowerCase);
                boolValueOf = Boolean.valueOf((bytes.length == 2 && bytes[0] == 13 && bytes[1] == 10) ? false : true);
            } catch (UnsupportedEncodingException unused) {
                boolValueOf = Boolean.FALSE;
            } catch (RuntimeException unused2) {
                boolValueOf = Boolean.TRUE;
            }
            bool = boolValueOf;
            HashMap map2 = f19374a;
            synchronized (map2) {
                map2.put(lowerCase, bool);
            }
        }
        return bool.booleanValue();
    }

    /* renamed from: r */
    public static final boolean m8254r(int i10) {
        if (i10 < 127) {
            return (i10 >= 32 || i10 == 13 || i10 == 10 || i10 == 9) ? false : true;
        }
        return true;
    }

    /* renamed from: s */
    public static String m8255s(String str, String str2) {
        char c2 = 0;
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i10 = 0;
        boolean z6 = false;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == '\\' || cCharAt == '\r' || cCharAt == '\n') {
                StringBuilder sb2 = new StringBuilder(length + 3);
                sb2.append('\"');
                sb2.append(str.substring(0, i10));
                while (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if ((cCharAt2 == '\"' || cCharAt2 == '\\' || cCharAt2 == '\r' || cCharAt2 == '\n') && (cCharAt2 != '\n' || c2 != '\r')) {
                        sb2.append('\\');
                    }
                    sb2.append(cCharAt2);
                    i10++;
                    c2 = cCharAt2;
                }
                sb2.append('\"');
                return sb2.toString();
            }
            if (cCharAt < ' ' || ((cCharAt >= 127 && !f19378e) || str2.indexOf(cCharAt) >= 0)) {
                z6 = true;
            }
            i10++;
        }
        if (!z6) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(length + 2);
        sb3.append('\"');
        sb3.append(str);
        sb3.append('\"');
        return sb3.toString();
    }

    /* renamed from: t */
    public static String m8256t(String str) {
        int i10;
        char cCharAt;
        if (!f19380g) {
            return str;
        }
        StringBuilder sb2 = null;
        while (true) {
            try {
                int length = str.length();
                i10 = 0;
                while (i10 < length) {
                    if ("\r\n".indexOf(str.charAt(i10)) >= 0) {
                        break;
                    }
                    i10++;
                }
            } catch (StringIndexOutOfBoundsException unused) {
            }
            i10 = -1;
            if (i10 < 0) {
                break;
            }
            int length2 = str.length();
            int i11 = i10 + 1;
            if (i11 < length2 && str.charAt(i10) == '\r' && str.charAt(i11) == '\n') {
                i11 = i10 + 2;
            }
            if (i10 > 0) {
                int i12 = i10 - 1;
                if (str.charAt(i12) == '\\') {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(str.length());
                    }
                    sb2.append(str.substring(0, i12));
                    sb2.append(str.substring(i10, i11));
                    str = str.substring(i11);
                }
            }
            if (i11 >= length2 || (cCharAt = str.charAt(i11)) == ' ' || cCharAt == '\t') {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length());
                }
                sb2.append(str.substring(0, i10));
                str = str.substring(i11);
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length());
                }
                sb2.append(str.substring(0, i11));
                str = str.substring(i11);
            }
        }
        if (sb2 == null) {
            return str;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
