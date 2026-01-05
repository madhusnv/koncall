package p001o;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public abstract class o8i extends cob {

    /* renamed from: a */
    public static final String f37945a = System.getProperty("org.mortbay.util.UrlEncoding.charset", HTTP.UTF_8);

    /* renamed from: f */
    public static void m41776f(InputStream inputStream, cob cobVar, int i) {
        synchronized (cobVar) {
            StringBuffer stringBuffer = new StringBuffer();
            Object string = null;
            int i2 = 0;
            while (true) {
                int i3 = inputStream.read();
                if (i3 >= 0) {
                    char c = (char) i3;
                    if (c == '%') {
                        int i4 = inputStream.read();
                        int i5 = inputStream.read();
                        if (i4 >= 0 && i5 >= 0) {
                            stringBuffer.append((char) ((czh.m22140b((byte) i4) << 4) + czh.m22140b((byte) i5)));
                        }
                    } else if (c == '&') {
                        String string2 = stringBuffer.length() == 0 ? "" : stringBuffer.toString();
                        stringBuffer.setLength(0);
                        if (string != null) {
                            cobVar.m21555a(string, string2);
                        } else if (string2 != null && string2.length() > 0) {
                            cobVar.m21555a(string2, "");
                        }
                        string = null;
                    } else if (c == '+') {
                        stringBuffer.append(TokenParser.SP);
                    } else if (c == '=' && string == null) {
                        string = stringBuffer.toString();
                        stringBuffer.setLength(0);
                    } else {
                        stringBuffer.append(c);
                    }
                    if (i >= 0 && (i2 = i2 + 1) > i) {
                        throw new IllegalStateException("Form too large");
                    }
                } else if (string != null) {
                    Object string3 = stringBuffer.length() == 0 ? "" : stringBuffer.toString();
                    stringBuffer.setLength(0);
                    cobVar.m21555a(string, string3);
                } else if (stringBuffer.length() > 0) {
                    cobVar.m21555a(stringBuffer.toString(), "");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[Catch: UnsupportedEncodingException -> 0x00d8, LOOP:1: B:25:0x005a->B:49:0x00a4, LOOP_END, TryCatch #1 {UnsupportedEncodingException -> 0x00d8, blocks: (B:10:0x0024, B:16:0x0032, B:17:0x003e, B:56:0x00d2, B:19:0x0045, B:22:0x004b, B:23:0x0057, B:31:0x006a, B:49:0x00a4, B:35:0x0077, B:36:0x0079, B:38:0x0083, B:41:0x0088, B:42:0x008d, B:46:0x009e, B:44:0x0094, B:45:0x0099, B:50:0x00ad, B:52:0x00ba, B:54:0x00c0, B:55:0x00cf, B:61:0x00de, B:64:0x00e5, B:66:0x00eb), top: B:117:0x0024, inners: #0 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m41777g(String str, int i, int i2, String str2) {
        int i3;
        oqi oqiVar = null;
        StringBuffer stringBuffer = null;
        char c = 255;
        int i4 = 0;
        if (str2 == null || s8g.m47996c(str2)) {
            while (i4 < i2) {
                int i5 = i + i4;
                char cCharAt = str.charAt(i5);
                if (cCharAt < 0 || cCharAt > 255) {
                    if (oqiVar == null) {
                        oqiVar = new oqi(i2);
                        oqiVar.m42549c().append(str.substring(i, i5 + 1));
                    } else {
                        oqiVar.m42549c().append(cCharAt);
                    }
                } else if (cCharAt == '+') {
                    if (oqiVar == null) {
                        oqiVar = new oqi(i2);
                        oqiVar.m42549c().append(str.substring(i, i5));
                    }
                    oqiVar.m42549c().append(TokenParser.SP);
                } else if (cCharAt == '%' && i4 + 2 < i2) {
                    if (oqiVar == null) {
                        oqiVar = new oqi(i2);
                        oqiVar.m42549c().append(str.substring(i, i5));
                    }
                    while (cCharAt == '%' && i4 + 2 < i2) {
                        try {
                            oqiVar.m42547a((byte) czh.m22141c(str, i + i4 + 1, 2, 16));
                            i4 += 3;
                        } catch (NumberFormatException unused) {
                            oqiVar.m42549c().append('%');
                            while (true) {
                                i4++;
                                char cCharAt2 = str.charAt(i4 + i);
                                if (cCharAt2 == '%') {
                                    break;
                                }
                                StringBuffer stringBufferM42549c = oqiVar.m42549c();
                                if (cCharAt2 == '+') {
                                    cCharAt2 = ' ';
                                }
                                stringBufferM42549c.append(cCharAt2);
                            }
                        }
                        if (i4 < i2) {
                            cCharAt = str.charAt(i + i4);
                        }
                    }
                    i4--;
                } else if (oqiVar != null) {
                    oqiVar.m42549c().append(cCharAt);
                }
                i4++;
            }
            return oqiVar == null ? (i == 0 && str.length() == i2) ? str : str.substring(i, i2 + i) : oqiVar.toString();
        }
        int i6 = 0;
        while (i6 < i2) {
            int i7 = i + i6;
            try {
                char cCharAt3 = str.charAt(i7);
                if (cCharAt3 < 0 || cCharAt3 > c) {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i2);
                        stringBuffer.append(str.substring(i, i7 + 1));
                    } else {
                        stringBuffer.append(cCharAt3);
                    }
                } else if (cCharAt3 == '+') {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i2);
                        stringBuffer.append(str.substring(i, i7));
                    }
                    stringBuffer.append(TokenParser.SP);
                } else if (cCharAt3 == '%' && i6 + 2 < i2) {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i2);
                        stringBuffer.append(str.substring(i, i7));
                    }
                    byte[] bArr = new byte[i2];
                    int i8 = 0;
                    while (cCharAt3 >= 0 && cCharAt3 <= c) {
                        if (cCharAt3 == '%') {
                            if (i6 + 2 < i2) {
                                int i9 = i8 + 1;
                                try {
                                    bArr[i8] = (byte) czh.m22141c(str, i + i6 + 1, 2, 16);
                                    i6 += 3;
                                } catch (NumberFormatException unused2) {
                                    bArr[i9 - 1] = 37;
                                    while (true) {
                                        i6++;
                                        char cCharAt4 = str.charAt(i6 + i);
                                        if (cCharAt4 == '%') {
                                            break;
                                        }
                                        int i10 = i9 + 1;
                                        if (cCharAt4 == '+') {
                                            cCharAt4 = ' ';
                                        }
                                        bArr[i9] = (byte) cCharAt4;
                                        i9 = i10;
                                    }
                                }
                                i8 = i9;
                                if (i6 < i2) {
                                    break;
                                }
                                cCharAt3 = str.charAt(i + i6);
                                c = 255;
                            } else {
                                i3 = i8 + 1;
                                bArr[i8] = 37;
                            }
                        } else if (cCharAt3 == '+') {
                            i3 = i8 + 1;
                            bArr[i8] = 32;
                        } else {
                            i3 = i8 + 1;
                            bArr[i8] = (byte) cCharAt3;
                        }
                        i6++;
                        i8 = i3;
                        if (i6 < i2) {
                        }
                    }
                    i6--;
                    stringBuffer.append(new String(bArr, 0, i8, str2));
                } else if (stringBuffer != null) {
                    stringBuffer.append(cCharAt3);
                }
                i6++;
                c = 255;
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return stringBuffer == null ? (i == 0 && str.length() == i2) ? str : str.substring(i, i2 + i) : stringBuffer.toString();
    }

    /* renamed from: h */
    public static void m41778h(InputStream inputStream, cob cobVar, String str, int i) throws IOException {
        if (str == null || HTTP.UTF_8.equalsIgnoreCase(str)) {
            m41781t(inputStream, cobVar, i);
            return;
        }
        if (s8g.f44982b.equals(str)) {
            m41776f(inputStream, cobVar, i);
            return;
        }
        if (HTTP.UTF_16.equalsIgnoreCase(str)) {
            m41780s(inputStream, cobVar, i);
            return;
        }
        synchronized (cobVar) {
            vp1 vp1Var = new vp1();
            Object string = null;
            char c = 0;
            byte bM22140b = 0;
            int i2 = 0;
            while (true) {
                int i3 = inputStream.read();
                if (i3 > 0) {
                    char c2 = (char) i3;
                    if (c2 == '%') {
                        c = 2;
                    } else if (c2 == '&') {
                        String string2 = vp1Var.size() == 0 ? "" : vp1Var.toString(str);
                        vp1Var.m53159c(0);
                        if (string != null) {
                            cobVar.m21555a(string, string2);
                        } else if (string2 != null && string2.length() > 0) {
                            cobVar.m21555a(string2, "");
                        }
                        string = null;
                    } else if (c2 == '+') {
                        vp1Var.write(32);
                    } else if (c2 != '=') {
                        if (c == 2) {
                            bM22140b = czh.m22140b((byte) i3);
                            c = 1;
                        } else if (c == 1) {
                            vp1Var.write((bM22140b << 4) + czh.m22140b((byte) i3));
                            c = 0;
                        } else {
                            vp1Var.write(i3);
                        }
                    } else if (string != null) {
                        vp1Var.write(i3);
                    } else {
                        string = vp1Var.size() == 0 ? "" : vp1Var.toString(str);
                        vp1Var.m53159c(0);
                    }
                    i2++;
                    if (i >= 0 && i2 > i) {
                        throw new IllegalStateException("Form too large");
                    }
                } else {
                    int size = vp1Var.size();
                    if (string != null) {
                        Object string3 = size == 0 ? "" : vp1Var.toString(str);
                        vp1Var.m53159c(0);
                        cobVar.m21555a(string, string3);
                    } else if (size > 0) {
                        cobVar.m21555a(vp1Var.toString(str), "");
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m41779k(String str, cob cobVar, String str2) {
        String strM41777g;
        String strM41777g2;
        if (str2 == null) {
            str2 = f37945a;
        }
        synchronized (cobVar) {
            int i = -1;
            String strM41777g3 = null;
            boolean z = false;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '%') {
                    z = true;
                } else {
                    if (cCharAt == '&') {
                        int i3 = (i2 - i) - 1;
                        if (i3 == 0) {
                            strM41777g2 = "";
                        } else {
                            int i4 = i + 1;
                            strM41777g2 = z ? m41777g(str, i4, i3, str2) : str.substring(i4, i2);
                        }
                        if (strM41777g3 != null) {
                            cobVar.m21555a(strM41777g3, strM41777g2);
                        } else if (strM41777g2 != null && strM41777g2.length() > 0) {
                            cobVar.m21555a(strM41777g2, "");
                        }
                    } else if (cCharAt != '+') {
                        strM41777g3 = (cCharAt == '=' && strM41777g3 == null) ? z ? m41777g(str, i + 1, (i2 - i) - 1, str2) : str.substring(i + 1, i2) : null;
                    }
                    z = false;
                    i = i2;
                }
            }
            if (strM41777g3 != null) {
                int length = (str.length() - i) - 1;
                if (length == 0) {
                    strM41777g = "";
                } else {
                    int i5 = i + 1;
                    strM41777g = z ? m41777g(str, i5, length, str2) : str.substring(i5);
                }
                cobVar.m21555a(strM41777g3, strM41777g);
            } else if (i < str.length()) {
                cobVar.m21555a(z ? m41777g(str, i + 1, (str.length() - i) - 1, str2) : str.substring(i + 1), "");
            }
        }
    }

    /* renamed from: s */
    public static void m41780s(InputStream inputStream, cob cobVar, int i) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, HTTP.UTF_16);
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        if (i < 0) {
            i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        while (true) {
            int i3 = inputStreamReader.read();
            if (i3 <= 0) {
                break;
            }
            int i4 = i2 + 1;
            if (i2 >= i) {
                break;
            }
            stringBuffer.append((char) i3);
            i2 = i4;
        }
        m41779k(stringBuffer.toString(), cobVar, f37945a);
    }

    /* renamed from: t */
    public static void m41781t(InputStream inputStream, cob cobVar, int i) {
        synchronized (cobVar) {
            oqi oqiVar = new oqi();
            int i2 = 0;
            Object string = null;
            while (true) {
                int i3 = inputStream.read();
                if (i3 >= 0) {
                    char c = (char) i3;
                    if (c == '%') {
                        int i4 = inputStream.read();
                        int i5 = inputStream.read();
                        if (i4 >= 0 && i5 >= 0) {
                            oqiVar.m42547a((byte) ((czh.m22140b((byte) i4) << 4) + czh.m22140b((byte) i5)));
                        }
                    } else if (c == '&') {
                        String string2 = oqiVar.m42550d() == 0 ? "" : oqiVar.toString();
                        oqiVar.m42551e();
                        if (string != null) {
                            cobVar.m21555a(string, string2);
                        } else if (string2 != null && string2.length() > 0) {
                            cobVar.m21555a(string2, "");
                        }
                        string = null;
                    } else if (c == '+') {
                        oqiVar.m42547a((byte) 32);
                    } else if (c == '=' && string == null) {
                        string = oqiVar.toString();
                        oqiVar.m42551e();
                    } else {
                        oqiVar.m42547a((byte) i3);
                    }
                    if (i >= 0 && (i2 = i2 + 1) > i) {
                        throw new IllegalStateException("Form too large");
                    }
                } else if (string != null) {
                    Object string3 = oqiVar.m42550d() == 0 ? "" : oqiVar.toString();
                    oqiVar.m42551e();
                    cobVar.m21555a(string, string3);
                } else if (oqiVar.m42550d() > 0) {
                    cobVar.m21555a(oqiVar.toString(), "");
                }
            }
        }
    }

    /* renamed from: u */
    public static void m41782u(byte[] bArr, int i, int i2, cob cobVar) {
        m41783y(bArr, i, i2, cobVar, new oqi());
    }

    /* renamed from: y */
    public static void m41783y(byte[] bArr, int i, int i2, cob cobVar, oqi oqiVar) {
        synchronized (cobVar) {
            int i3 = i2 + i;
            String string = null;
            while (i < i3) {
                try {
                    byte b = bArr[i];
                    char c = (char) (b & 255);
                    if (c != '%') {
                        if (c == '&') {
                            String string2 = oqiVar.m42550d() == 0 ? "" : oqiVar.toString();
                            oqiVar.m42551e();
                            if (string != null) {
                                cobVar.m21555a(string, string2);
                            } else if (string2 != null && string2.length() > 0) {
                                cobVar.m21555a(string2, "");
                            }
                            string = null;
                        } else if (c == '+') {
                            oqiVar.m42547a((byte) 32);
                        } else if (c != '=') {
                            oqiVar.m42547a(b);
                        } else if (string != null) {
                            oqiVar.m42547a(b);
                        } else {
                            string = oqiVar.toString();
                            oqiVar.m42551e();
                        }
                    } else if (i + 2 < i3) {
                        int i4 = i + 1;
                        int iM22140b = czh.m22140b(bArr[i4]) << 4;
                        i = i4 + 1;
                        oqiVar.m42547a((byte) (iM22140b + czh.m22140b(bArr[i])));
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (string != null) {
                String string3 = oqiVar.m42550d() == 0 ? "" : oqiVar.toString();
                oqiVar.m42551e();
                cobVar.m21555a(string, string3);
            } else if (oqiVar.m42550d() > 0) {
                cobVar.m21555a(oqiVar.toString(), "");
            }
        }
    }
}
