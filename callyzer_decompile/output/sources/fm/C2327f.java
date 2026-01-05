package fm;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fm.f */
/* loaded from: classes.dex */
public final class C2327f {

    /* renamed from: a */
    public final /* synthetic */ int f10556a;

    /* renamed from: b */
    public Hashtable f10557b;

    public /* synthetic */ C2327f(int i10) {
        this.f10556a = i10;
    }

    /* renamed from: a */
    public static boolean m6017a(char c2) {
        return c2 > ' ' && c2 < 127 && "()<>@,;:/[]?=\\\"".indexOf(c2) < 0;
    }

    /* renamed from: d */
    public static int m6018d(int i10, String str) {
        int length = str.length();
        while (i10 < length && Character.isWhitespace(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    /* renamed from: b */
    public void m6019b(BufferedReader bufferedReader) throws IOException {
        String strSubstring;
        String line;
        loop0: while (true) {
            strSubstring = null;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                if (strSubstring != null) {
                    line = strSubstring.concat(line);
                }
                int length = line.length();
                if (line.length() > 0) {
                    int i10 = length - 1;
                    if (line.charAt(i10) == '\\') {
                        strSubstring = line.substring(0, i10);
                    }
                }
            }
            m6020c(line);
        }
        if (strSubstring != null) {
            m6020c(strSubstring);
        }
    }

    /* renamed from: c */
    public void m6020c(String str) {
        Hashtable hashtable = this.f10557b;
        String strTrim = str.trim();
        if (strTrim.length() == 0 || strTrim.charAt(0) == '#') {
            return;
        }
        if (strTrim.indexOf(61) <= 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(strTrim);
            if (stringTokenizer.countTokens() == 0) {
                return;
            }
            String strNextToken = stringTokenizer.nextToken();
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken2 = stringTokenizer.nextToken();
                C2326e c2326e = new C2326e(strNextToken, strNextToken2);
                hashtable.put(strNextToken2, c2326e);
                if (AbstractC2323b.m6004a()) {
                    AbstractC2323b.m6005b("Added: " + c2326e.toString());
                }
            }
            return;
        }
        C2322a c2322a = new C2322a(0);
        c2322a.f10540e = new Vector();
        c2322a.f10537b = 0;
        c2322a.f10539d = strTrim;
        c2322a.f10538c = strTrim.length();
        String str2 = null;
        while (c2322a.m5993c()) {
            String strM6001k = c2322a.m6001k();
            String strM6001k2 = (c2322a.m5993c() && c2322a.m6001k().equals("=") && c2322a.m5993c()) ? c2322a.m6001k() : null;
            if (strM6001k2 == null) {
                if (AbstractC2323b.m6004a()) {
                    AbstractC2323b.m6005b("Bad .mime.types entry: ".concat(strTrim));
                    return;
                }
                return;
            } else if (strM6001k.equals(TransferTable.COLUMN_TYPE)) {
                str2 = strM6001k2;
            } else if (strM6001k.equals("exts")) {
                StringTokenizer stringTokenizer2 = new StringTokenizer(strM6001k2, ",");
                while (stringTokenizer2.hasMoreTokens()) {
                    String strNextToken3 = stringTokenizer2.nextToken();
                    C2326e c2326e2 = new C2326e(str2, strNextToken3);
                    hashtable.put(strNextToken3, c2326e2);
                    if (AbstractC2323b.m6004a()) {
                        AbstractC2323b.m6005b("Added: " + c2326e2.toString());
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.f10556a) {
            case 1:
                StringBuffer stringBuffer = new StringBuffer();
                Hashtable hashtable = this.f10557b;
                stringBuffer.ensureCapacity(hashtable.size() * 16);
                Enumeration enumerationKeys = hashtable.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String str = (String) enumerationKeys.nextElement();
                    stringBuffer.append("; ");
                    stringBuffer.append(str);
                    stringBuffer.append('=');
                    String string = (String) hashtable.get(str);
                    int length = string.length();
                    boolean z6 = false;
                    for (int i10 = 0; i10 < length && !z6; i10++) {
                        z6 = !m6017a(string.charAt(i10));
                    }
                    if (z6) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.ensureCapacity((int) (length * 1.5d));
                        stringBuffer2.append('\"');
                        for (int i11 = 0; i11 < length; i11++) {
                            char cCharAt = string.charAt(i11);
                            if (cCharAt == '\\' || cCharAt == '\"') {
                                stringBuffer2.append('\\');
                            }
                            stringBuffer2.append(cCharAt);
                        }
                        stringBuffer2.append('\"');
                        string = stringBuffer2.toString();
                    }
                    stringBuffer.append(string);
                }
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public C2327f(InputStream inputStream) throws IOException {
        this.f10556a = 0;
        this.f10557b = new Hashtable();
        m6019b(new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1")));
    }
}
