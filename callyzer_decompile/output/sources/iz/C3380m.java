package iz;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import oz.AbstractC5779b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.m */
/* loaded from: classes3.dex */
public final class C3380m {

    /* renamed from: k */
    public static final Pattern f17943k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l */
    public static final Pattern f17944l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m */
    public static final Pattern f17945m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final Pattern f17946n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f17947a;

    /* renamed from: b */
    public final String f17948b;

    /* renamed from: c */
    public final long f17949c;

    /* renamed from: d */
    public final String f17950d;

    /* renamed from: e */
    public final String f17951e;

    /* renamed from: f */
    public final boolean f17952f;

    /* renamed from: g */
    public final boolean f17953g;

    /* renamed from: h */
    public final boolean f17954h;

    /* renamed from: i */
    public final boolean f17955i;

    /* renamed from: j */
    public final String f17956j;

    public C3380m(String str, String str2, long j6, String str3, String str4, boolean z6, boolean z10, boolean z11, boolean z12, String str5) {
        this.f17947a = str;
        this.f17948b = str2;
        this.f17949c = j6;
        this.f17950d = str3;
        this.f17951e = str4;
        this.f17952f = z6;
        this.f17953g = z10;
        this.f17954h = z11;
        this.f17955i = z12;
        this.f17956j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3380m)) {
            return false;
        }
        C3380m c3380m = (C3380m) obj;
        return AbstractC4154l.m8918a(c3380m.f17947a, this.f17947a) && AbstractC4154l.m8918a(c3380m.f17948b, this.f17948b) && c3380m.f17949c == this.f17949c && AbstractC4154l.m8918a(c3380m.f17950d, this.f17950d) && AbstractC4154l.m8918a(c3380m.f17951e, this.f17951e) && c3380m.f17952f == this.f17952f && c3380m.f17953g == this.f17953g && c3380m.f17954h == this.f17954h && c3380m.f17955i == this.f17955i && AbstractC4154l.m8918a(c3380m.f17956j, this.f17956j);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4557d(AbstractC0030c.m113d(AbstractC0030c.m113d(527, 31, this.f17947a), 31, this.f17948b), 31, this.f17949c), 31, this.f17950d), 31, this.f17951e), 31, this.f17952f), 31, this.f17953g), 31, this.f17954h), 31, this.f17955i);
        String str = this.f17956j;
        return iM4558e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17947a);
        sb2.append('=');
        sb2.append(this.f17948b);
        if (this.f17954h) {
            long j6 = this.f17949c;
            if (j6 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = ((DateFormat) AbstractC5779b.f28345a.get()).format(new Date(j6));
                AbstractC4154l.m8922e(str, "format(...)");
                sb2.append(str);
            }
        }
        if (!this.f17955i) {
            sb2.append("; domain=");
            sb2.append(this.f17950d);
        }
        sb2.append("; path=");
        sb2.append(this.f17951e);
        if (this.f17952f) {
            sb2.append("; secure");
        }
        if (this.f17953g) {
            sb2.append("; httponly");
        }
        String str2 = this.f17956j;
        if (str2 != null) {
            sb2.append("; samesite=");
            sb2.append(str2);
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
