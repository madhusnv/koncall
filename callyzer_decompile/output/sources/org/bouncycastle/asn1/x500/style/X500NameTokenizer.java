package org.bouncycastle.asn1.x500.style;

/* loaded from: classes3.dex */
public class X500NameTokenizer {
    private int index;
    private final char separator;
    private final String value;

    public X500NameTokenizer(String str) {
        this(str, ',');
    }

    public boolean hasMoreTokens() {
        return this.index < this.value.length();
    }

    public String nextToken() {
        if (this.index >= this.value.length()) {
            return null;
        }
        int i10 = this.index + 1;
        boolean z6 = false;
        boolean z10 = false;
        while (true) {
            int i11 = this.index + 1;
            this.index = i11;
            if (i11 < this.value.length()) {
                char cCharAt = this.value.charAt(this.index);
                if (z6) {
                    z6 = false;
                } else if (cCharAt == '\"') {
                    z10 = !z10;
                } else if (z10) {
                    continue;
                } else if (cCharAt == '\\') {
                    z6 = true;
                } else if (cCharAt == this.separator) {
                    break;
                }
            } else if (z6 || z10) {
                throw new IllegalArgumentException("badly formatted directory string");
            }
        }
        return this.value.substring(i10, this.index);
    }

    public X500NameTokenizer(String str, char c2) {
        str.getClass();
        if (c2 == '\"' || c2 == '\\') {
            throw new IllegalArgumentException("reserved separator character");
        }
        this.value = str;
        this.separator = c2;
        this.index = str.length() < 1 ? 0 : -1;
    }
}
