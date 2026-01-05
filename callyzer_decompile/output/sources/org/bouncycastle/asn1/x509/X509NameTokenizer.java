package org.bouncycastle.asn1.x509;

/* loaded from: classes3.dex */
public class X509NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X509NameTokenizer(String str) {
        this(str, ',');
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i10 = this.index + 1;
        this.buf.setLength(0);
        boolean z6 = false;
        boolean z10 = false;
        while (i10 != this.value.length()) {
            char cCharAt = this.value.charAt(i10);
            if (cCharAt != '\"') {
                if (!z6 && !z10) {
                    if (cCharAt == '\\') {
                        this.buf.append(cCharAt);
                        z6 = true;
                    } else {
                        if (cCharAt == this.separator) {
                            break;
                        }
                        this.buf.append(cCharAt);
                    }
                }
                i10++;
            } else if (!z6) {
                z10 = !z10;
            }
            this.buf.append(cCharAt);
            z6 = false;
            i10++;
        }
        this.index = i10;
        return this.buf.toString();
    }

    public X509NameTokenizer(String str, char c2) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.separator = c2;
    }
}
