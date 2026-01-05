package j$.time.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class DecimalStyle {

    /* renamed from: d */
    public static final DecimalStyle f18126d = new DecimalStyle('0', '-', '.');

    /* renamed from: e */
    public static final ConcurrentMap f18127e = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    public final char f18128a;

    /* renamed from: b */
    public final char f18129b;

    /* renamed from: c */
    public final char f18130c;

    public static DecimalStyle of(Locale locale) {
        DecimalStyle decimalStyle;
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f18127e;
        DecimalStyle decimalStyle2 = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle2 != null) {
            return decimalStyle2;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        if (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') {
            decimalStyle = f18126d;
        } else {
            decimalStyle = new DecimalStyle(zeroDigit, minusSign, decimalSeparator);
        }
        concurrentHashMap.putIfAbsent(locale, decimalStyle);
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    public DecimalStyle(char c2, char c10, char c11) {
        this.f18128a = c2;
        this.f18129b = c10;
        this.f18130c = c11;
    }

    /* renamed from: a */
    public final String m7949a(String str) {
        char c2 = this.f18128a;
        if (c2 == '0') {
            return str;
        }
        int i10 = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i11 = 0; i11 < charArray.length; i11++) {
            charArray[i11] = (char) (charArray[i11] + i10);
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.f18128a == decimalStyle.f18128a && this.f18129b == decimalStyle.f18129b && this.f18130c == decimalStyle.f18130c;
    }

    public final int hashCode() {
        return this.f18128a + '+' + this.f18129b + this.f18130c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.f18128a + '+' + this.f18129b + this.f18130c + "]";
    }
}
