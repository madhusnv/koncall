package p001o;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class pz4 {

    /* renamed from: o */
    public static long f40745o = 3600;

    /* renamed from: a */
    public String f40746a;

    /* renamed from: b */
    public String f40747b;

    /* renamed from: c */
    public SimpleDateFormat f40748c;

    /* renamed from: d */
    public String f40749d;

    /* renamed from: e */
    public SimpleDateFormat f40750e;

    /* renamed from: f */
    public String f40751f;

    /* renamed from: g */
    public String f40752g;

    /* renamed from: h */
    public String f40753h;

    /* renamed from: i */
    public long f40754i;

    /* renamed from: j */
    public long f40755j;

    /* renamed from: k */
    public int f40756k;

    /* renamed from: l */
    public String f40757l;

    /* renamed from: m */
    public Locale f40758m;

    /* renamed from: n */
    public DateFormatSymbols f40759n;

    public pz4(String str) {
        this.f40754i = -1L;
        this.f40755j = -1L;
        this.f40756k = -1;
        this.f40757l = null;
        this.f40758m = null;
        this.f40759n = null;
        this.f40746a = str;
        m44360e(TimeZone.getDefault());
    }

    /* renamed from: a */
    public synchronized String m44356a(long j) {
        String string;
        long j2 = j / 1000;
        long j3 = this.f40755j;
        if (j2 >= j3 && (j3 <= 0 || j2 <= f40745o + j3)) {
            if (j3 == j2) {
                return this.f40757l;
            }
            Date date = new Date(j);
            long j4 = j2 / 60;
            if (this.f40754i != j4) {
                this.f40754i = j4;
                String str = this.f40750e.format(date);
                this.f40751f = str;
                int iIndexOf = str.indexOf("ss");
                this.f40752g = this.f40751f.substring(0, iIndexOf);
                this.f40753h = this.f40751f.substring(iIndexOf + 2);
            }
            this.f40755j = j2;
            StringBuffer stringBuffer = new StringBuffer(this.f40751f.length());
            synchronized (stringBuffer) {
                stringBuffer.append(this.f40752g);
                int i = (int) (j2 % 60);
                if (i < 10) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(i);
                stringBuffer.append(this.f40753h);
                string = stringBuffer.toString();
                this.f40757l = string;
            }
            return string;
        }
        return this.f40748c.format(new Date(j));
    }

    /* renamed from: b */
    public int m44357b() {
        return this.f40756k;
    }

    /* renamed from: c */
    public String m44358c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f40756k = (int) (jCurrentTimeMillis % 1000);
        return m44356a(jCurrentTimeMillis);
    }

    /* renamed from: d */
    public final void m44359d() {
        if (this.f40747b.indexOf("ss.SSS") >= 0) {
            throw new IllegalStateException("ms not supported");
        }
        int iIndexOf = this.f40747b.indexOf("ss");
        String strSubstring = this.f40747b.substring(0, iIndexOf);
        String strSubstring2 = this.f40747b.substring(iIndexOf + 2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strSubstring);
        stringBuffer.append("'ss'");
        stringBuffer.append(strSubstring2);
        this.f40749d = stringBuffer.toString();
    }

    /* renamed from: e */
    public void m44360e(TimeZone timeZone) {
        m44361f(timeZone);
        if (this.f40758m != null) {
            this.f40748c = new SimpleDateFormat(this.f40747b, this.f40758m);
            this.f40750e = new SimpleDateFormat(this.f40749d, this.f40758m);
        } else if (this.f40759n != null) {
            this.f40748c = new SimpleDateFormat(this.f40747b, this.f40759n);
            this.f40750e = new SimpleDateFormat(this.f40749d, this.f40759n);
        } else {
            this.f40748c = new SimpleDateFormat(this.f40747b);
            this.f40750e = new SimpleDateFormat(this.f40749d);
        }
        this.f40748c.setTimeZone(timeZone);
        this.f40750e.setTimeZone(timeZone);
        this.f40755j = -1L;
        this.f40754i = -1L;
    }

    /* renamed from: f */
    public final void m44361f(TimeZone timeZone) {
        int iIndexOf = this.f40746a.indexOf("ZZZ");
        if (iIndexOf >= 0) {
            String strSubstring = this.f40746a.substring(0, iIndexOf);
            String strSubstring2 = this.f40746a.substring(iIndexOf + 3);
            int rawOffset = timeZone.getRawOffset();
            StringBuffer stringBuffer = new StringBuffer(this.f40746a.length() + 10);
            stringBuffer.append(strSubstring);
            stringBuffer.append("'");
            if (rawOffset >= 0) {
                stringBuffer.append('+');
            } else {
                rawOffset = -rawOffset;
                stringBuffer.append('-');
            }
            int i = rawOffset / 60000;
            int i2 = i / 60;
            int i3 = i % 60;
            if (i2 < 10) {
                stringBuffer.append('0');
            }
            stringBuffer.append(i2);
            if (i3 < 10) {
                stringBuffer.append('0');
            }
            stringBuffer.append(i3);
            stringBuffer.append('\'');
            stringBuffer.append(strSubstring2);
            this.f40747b = stringBuffer.toString();
        } else {
            this.f40747b = this.f40746a;
        }
        m44359d();
    }

    public pz4(String str, Locale locale) {
        this.f40754i = -1L;
        this.f40755j = -1L;
        this.f40756k = -1;
        this.f40757l = null;
        this.f40759n = null;
        this.f40746a = str;
        this.f40758m = locale;
        m44360e(TimeZone.getDefault());
    }
}
