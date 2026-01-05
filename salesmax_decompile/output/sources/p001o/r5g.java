package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.net.ProtocolException;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class r5g {

    /* renamed from: d */
    public static final C16544a f43038d = new C16544a(null);

    /* renamed from: a */
    public final a2e f43039a;

    /* renamed from: b */
    public final int f43040b;

    /* renamed from: c */
    public final String f43041c;

    /* renamed from: o.r5g$a */
    public static final class C16544a {
        public C16544a() {
        }

        public /* synthetic */ C16544a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final r5g m46248a(String str) throws ProtocolException {
            a2e a2eVar;
            int i;
            String strSubstring;
            sq8.m48649h(str, "statusLine");
            if (e9g.m24597K(str, "HTTP/1.", false, 2, null)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    a2eVar = a2e.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    a2eVar = a2e.HTTP_1_1;
                }
            } else if (e9g.m24597K(str, "ICY ", false, 2, null)) {
                a2eVar = a2e.HTTP_1_0;
                i = 4;
            } else {
                if (!e9g.m24597K(str, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                a2eVar = a2e.HTTP_1_1;
                i = 12;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            String strSubstring2 = str.substring(i, i2);
            sq8.m48648g(strSubstring2, "substring(...)");
            Integer numM22638l = d9g.m22638l(strSubstring2);
            if (numM22638l == null) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iIntValue = numM22638l.intValue();
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i + 4);
                sq8.m48648g(strSubstring, "substring(...)");
            }
            return new r5g(a2eVar, iIntValue, strSubstring);
        }
    }

    public r5g(a2e a2eVar, int i, String str) {
        sq8.m48649h(a2eVar, "protocol");
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.f43039a = a2eVar;
        this.f43040b = i;
        this.f43041c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f43039a == a2e.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(TokenParser.SP);
        sb.append(this.f43040b);
        sb.append(TokenParser.SP);
        sb.append(this.f43041c);
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
