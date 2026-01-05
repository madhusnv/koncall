package p001o;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class n5e extends StringTokenizer {

    /* renamed from: a */
    public String f36407a;

    /* renamed from: b */
    public String f36408b;

    /* renamed from: c */
    public boolean f36409c;

    /* renamed from: d */
    public boolean f36410d;

    /* renamed from: e */
    public StringBuffer f36411e;

    /* renamed from: f */
    public boolean f36412f;

    /* renamed from: g */
    public int f36413g;

    /* renamed from: h */
    public int f36414h;

    /* renamed from: i */
    public boolean f36415i;

    /* renamed from: j */
    public boolean f36416j;

    public n5e(String str, String str2, boolean z, boolean z2) {
        super("");
        this.f36408b = "\t\n\r";
        this.f36409c = false;
        this.f36410d = false;
        this.f36412f = false;
        this.f36413g = 0;
        this.f36414h = 0;
        this.f36415i = true;
        this.f36416j = true;
        this.f36407a = str;
        if (str2 != null) {
            this.f36408b = str2;
        }
        this.f36410d = z;
        this.f36409c = z2;
        if (this.f36408b.indexOf(39) < 0 && this.f36408b.indexOf(34) < 0) {
            this.f36411e = new StringBuffer(this.f36407a.length() > 1024 ? 512 : this.f36407a.length() / 2);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Can't use quotes as delimiters: ");
        stringBuffer.append(this.f36408b);
        throw new Error(stringBuffer.toString());
    }

    /* renamed from: a */
    public static String m40119a(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "\"\"";
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt == '\'' || Character.isWhitespace(cCharAt) || str2.indexOf(cCharAt) >= 0) {
                StringBuffer stringBuffer = new StringBuffer(str.length() + 8);
                m40120b(stringBuffer, str);
                return stringBuffer.toString();
            }
        }
        return str;
    }

    /* renamed from: b */
    public static void m40120b(StringBuffer stringBuffer, String str) {
        char[] charArray;
        synchronized (stringBuffer) {
            stringBuffer.append(TokenParser.DQUOTE);
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\f') {
                        charArray = str.toCharArray();
                        stringBuffer.append(charArray, 0, i);
                        stringBuffer.append("\\f");
                    } else if (cCharAt == '\r') {
                        charArray = str.toCharArray();
                        stringBuffer.append(charArray, 0, i);
                        stringBuffer.append("\\r");
                    } else if (cCharAt == '\"') {
                        charArray = str.toCharArray();
                        stringBuffer.append(charArray, 0, i);
                        stringBuffer.append("\\\"");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                charArray = str.toCharArray();
                                stringBuffer.append(charArray, 0, i);
                                stringBuffer.append("\\b");
                                break;
                            case '\t':
                                charArray = str.toCharArray();
                                stringBuffer.append(charArray, 0, i);
                                stringBuffer.append("\\t");
                                break;
                            case '\n':
                                charArray = str.toCharArray();
                                stringBuffer.append(charArray, 0, i);
                                stringBuffer.append("\\n");
                                break;
                            default:
                                i++;
                        }
                    } else {
                        charArray = str.toCharArray();
                        stringBuffer.append(charArray, 0, i);
                        stringBuffer.append("\\\\");
                    }
                } else {
                    charArray = null;
                }
            }
            if (charArray == null) {
                stringBuffer.append(str);
            } else {
                while (true) {
                    i++;
                    if (i < str.length()) {
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 == '\f') {
                            stringBuffer.append("\\f");
                        } else if (cCharAt2 == '\r') {
                            stringBuffer.append("\\r");
                        } else if (cCharAt2 == '\"') {
                            stringBuffer.append("\\\"");
                        } else if (cCharAt2 != '\\') {
                            switch (cCharAt2) {
                                case '\b':
                                    stringBuffer.append("\\b");
                                    break;
                                case '\t':
                                    stringBuffer.append("\\t");
                                    break;
                                case '\n':
                                    stringBuffer.append("\\n");
                                    break;
                                default:
                                    stringBuffer.append(cCharAt2);
                                    break;
                            }
                        } else {
                            stringBuffer.append("\\\\");
                        }
                    }
                }
            }
            stringBuffer.append(TokenParser.DQUOTE);
        }
    }

    /* renamed from: c */
    public static String m40121c(String str) {
        char cCharAt;
        String string;
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || (cCharAt = str.charAt(0)) != str.charAt(str.length() - 1) || (cCharAt != '\"' && cCharAt != '\'')) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() - 2);
        synchronized (stringBuffer) {
            boolean z = false;
            int i = 1;
            while (i < str.length() - 1) {
                char cCharAt2 = str.charAt(i);
                if (z) {
                    if (cCharAt2 == 'b') {
                        stringBuffer.append('\b');
                    } else if (cCharAt2 == 'f') {
                        stringBuffer.append('\f');
                    } else if (cCharAt2 == 'n') {
                        stringBuffer.append('\n');
                    } else if (cCharAt2 == 'r') {
                        stringBuffer.append(TokenParser.CR);
                    } else if (cCharAt2 == 't') {
                        stringBuffer.append('\t');
                    } else if (cCharAt2 != 'u') {
                        stringBuffer.append(cCharAt2);
                    } else {
                        int i2 = i + 1;
                        int i3 = i2 + 1;
                        int iM22140b = (czh.m22140b((byte) str.charAt(i)) << 24) + (czh.m22140b((byte) str.charAt(i2)) << 16);
                        int i4 = i3 + 1;
                        int iM22140b2 = iM22140b + (czh.m22140b((byte) str.charAt(i3)) << 8);
                        int i5 = i4 + 1;
                        stringBuffer.append((char) (iM22140b2 + czh.m22140b((byte) str.charAt(i4))));
                        z = false;
                        i = i5;
                    }
                    z = false;
                } else if (cCharAt2 == '\\') {
                    z = true;
                } else {
                    stringBuffer.append(cCharAt2);
                }
                i++;
            }
            string = stringBuffer.toString();
        }
        return string;
    }

    @Override // java.util.StringTokenizer
    public int countTokens() {
        return -1;
    }

    @Override // java.util.StringTokenizer, java.util.Enumeration
    public boolean hasMoreElements() {
        return hasMoreTokens();
    }

    @Override // java.util.StringTokenizer
    public boolean hasMoreTokens() {
        if (this.f36412f) {
            return true;
        }
        this.f36414h = this.f36413g;
        char c = 0;
        boolean z = false;
        while (this.f36413g < this.f36407a.length()) {
            String str = this.f36407a;
            int i = this.f36413g;
            this.f36413g = i + 1;
            char cCharAt = str.charAt(i);
            if (c != 0) {
                if (c == 1) {
                    this.f36412f = true;
                    if (this.f36408b.indexOf(cCharAt) >= 0) {
                        if (this.f36410d) {
                            this.f36413g--;
                        }
                        return this.f36412f;
                    }
                    if (cCharAt == '\'' && this.f36416j) {
                        if (this.f36409c) {
                            this.f36411e.append(cCharAt);
                        }
                        c = 2;
                    } else if (cCharAt == '\"' && this.f36415i) {
                        if (this.f36409c) {
                            this.f36411e.append(cCharAt);
                        }
                        c = 3;
                    } else {
                        this.f36411e.append(cCharAt);
                    }
                } else if (c == 2) {
                    this.f36412f = true;
                    if (z) {
                        this.f36411e.append(cCharAt);
                        z = false;
                    } else if (cCharAt == '\'') {
                        if (this.f36409c) {
                            this.f36411e.append(cCharAt);
                        }
                        c = 1;
                    } else if (cCharAt == '\\') {
                        if (this.f36409c) {
                            this.f36411e.append(cCharAt);
                        }
                        z = true;
                    } else {
                        this.f36411e.append(cCharAt);
                    }
                } else if (c == 3) {
                    this.f36412f = true;
                    if (z) {
                        this.f36411e.append(cCharAt);
                        z = false;
                    } else if (cCharAt == '\"') {
                        if (this.f36409c) {
                            this.f36411e.append(cCharAt);
                        }
                        c = 1;
                    } else if (cCharAt == '\\') {
                        if (this.f36409c) {
                            this.f36411e.append(cCharAt);
                        }
                        z = true;
                    } else {
                        this.f36411e.append(cCharAt);
                    }
                }
            } else if (this.f36408b.indexOf(cCharAt) >= 0) {
                if (this.f36410d) {
                    this.f36411e.append(cCharAt);
                    this.f36412f = true;
                    return true;
                }
            } else if (cCharAt == '\'' && this.f36416j) {
                if (this.f36409c) {
                    this.f36411e.append(cCharAt);
                }
                c = 2;
            } else if (cCharAt == '\"' && this.f36415i) {
                if (this.f36409c) {
                    this.f36411e.append(cCharAt);
                }
                c = 3;
            } else {
                this.f36411e.append(cCharAt);
                this.f36412f = true;
                c = 1;
            }
        }
        return this.f36412f;
    }

    @Override // java.util.StringTokenizer, java.util.Enumeration
    public Object nextElement() {
        return nextToken();
    }

    @Override // java.util.StringTokenizer
    public String nextToken() {
        StringBuffer stringBuffer;
        if (!hasMoreTokens() || (stringBuffer = this.f36411e) == null) {
            throw new NoSuchElementException();
        }
        String string = stringBuffer.toString();
        this.f36411e.setLength(0);
        this.f36412f = false;
        return string;
    }

    @Override // java.util.StringTokenizer
    public String nextToken(String str) {
        this.f36408b = str;
        this.f36413g = this.f36414h;
        this.f36411e.setLength(0);
        this.f36412f = false;
        return nextToken();
    }

    public n5e(String str, String str2) {
        this(str, str2, false, false);
    }
}
