package p001o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class j1g {

    /* renamed from: a */
    public final String f29572a;

    /* renamed from: b */
    public final int f29573b;

    /* renamed from: c */
    public final Integer f29574c;

    /* renamed from: d */
    public final Integer f29575d;

    /* renamed from: e */
    public final float f29576e;

    /* renamed from: f */
    public final boolean f29577f;

    /* renamed from: g */
    public final boolean f29578g;

    /* renamed from: h */
    public final boolean f29579h;

    /* renamed from: i */
    public final boolean f29580i;

    /* renamed from: j */
    public final int f29581j;

    /* renamed from: o.j1g$a */
    public static final class C14430a {

        /* renamed from: a */
        public final int f29582a;

        /* renamed from: b */
        public final int f29583b;

        /* renamed from: c */
        public final int f29584c;

        /* renamed from: d */
        public final int f29585d;

        /* renamed from: e */
        public final int f29586e;

        /* renamed from: f */
        public final int f29587f;

        /* renamed from: g */
        public final int f29588g;

        /* renamed from: h */
        public final int f29589h;

        /* renamed from: i */
        public final int f29590i;

        /* renamed from: j */
        public final int f29591j;

        /* renamed from: k */
        public final int f29592k;

        public C14430a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f29582a = i;
            this.f29583b = i2;
            this.f29584c = i3;
            this.f29585d = i4;
            this.f29586e = i5;
            this.f29587f = i6;
            this.f29588g = i7;
            this.f29589h = i8;
            this.f29590i = i9;
            this.f29591j = i10;
            this.f29592k = i11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C14430a m33080a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                String strM35995e = kp0.m35995e(strArrSplit[i11].trim());
                strM35995e.hashCode();
                switch (strM35995e) {
                    case "italic":
                        i7 = i11;
                        break;
                    case "underline":
                        i8 = i11;
                        break;
                    case "strikeout":
                        i9 = i11;
                        break;
                    case "primarycolour":
                        i3 = i11;
                        break;
                    case "bold":
                        i6 = i11;
                        break;
                    case "name":
                        i = i11;
                        break;
                    case "fontsize":
                        i5 = i11;
                        break;
                    case "borderstyle":
                        i10 = i11;
                        break;
                    case "alignment":
                        i2 = i11;
                        break;
                    case "outlinecolour":
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new C14430a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    /* renamed from: o.j1g$b */
    public static final class C14431b {

        /* renamed from: c */
        public static final Pattern f29593c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        public static final Pattern f29594d = Pattern.compile(sqi.m48702G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        public static final Pattern f29595e = Pattern.compile(sqi.m48702G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        public static final Pattern f29596f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f29597a;

        /* renamed from: b */
        public final PointF f29598b;

        public C14431b(int i, PointF pointF) {
            this.f29597a = i;
            this.f29598b = pointF;
        }

        /* renamed from: a */
        public static int m33081a(String str) {
            Matcher matcher = f29596f.matcher(str);
            if (matcher.find()) {
                return j1g.m33075e((String) op0.m42515e(matcher.group(1)));
            }
            return -1;
        }

        /* renamed from: b */
        public static C14431b m33082b(String str) {
            Matcher matcher = f29593c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) op0.m42515e(matcher.group(1));
                try {
                    PointF pointFM33083c = m33083c(str2);
                    if (pointFM33083c != null) {
                        pointF = pointFM33083c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iM33081a = m33081a(str2);
                    if (iM33081a != -1) {
                        i = iM33081a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C14431b(i, pointF);
        }

        /* renamed from: c */
        public static PointF m33083c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f29594d.matcher(str);
            Matcher matcher2 = f29595e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    ria.m46822f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) op0.m42515e(strGroup)).trim()), Float.parseFloat(((String) op0.m42515e(strGroup2)).trim()));
        }

        /* renamed from: d */
        public static String m33084d(String str) {
            return f29593c.matcher(str).replaceAll("");
        }
    }

    public j1g(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f29572a = str;
        this.f29573b = i;
        this.f29574c = num;
        this.f29575d = num2;
        this.f29576e = f;
        this.f29577f = z;
        this.f29578g = z2;
        this.f29579h = z3;
        this.f29580i = z4;
        this.f29581j = i2;
    }

    /* renamed from: b */
    public static j1g m33072b(String str, C14430a c14430a) {
        op0.m42511a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = c14430a.f29592k;
        if (length != i) {
            ria.m46824h("SsaStyle", sqi.m48702G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[c14430a.f29582a].trim();
            int i2 = c14430a.f29583b;
            int iM33075e = i2 != -1 ? m33075e(strArrSplit[i2].trim()) : -1;
            int i3 = c14430a.f29584c;
            Integer numM33078h = i3 != -1 ? m33078h(strArrSplit[i3].trim()) : null;
            int i4 = c14430a.f29585d;
            Integer numM33078h2 = i4 != -1 ? m33078h(strArrSplit[i4].trim()) : null;
            int i5 = c14430a.f29586e;
            float fM33079i = i5 != -1 ? m33079i(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = c14430a.f29587f;
            boolean z = i6 != -1 && m33076f(strArrSplit[i6].trim());
            int i7 = c14430a.f29588g;
            boolean z2 = i7 != -1 && m33076f(strArrSplit[i7].trim());
            int i8 = c14430a.f29589h;
            boolean z3 = i8 != -1 && m33076f(strArrSplit[i8].trim());
            int i9 = c14430a.f29590i;
            boolean z4 = i9 != -1 && m33076f(strArrSplit[i9].trim());
            int i10 = c14430a.f29591j;
            return new j1g(strTrim, iM33075e, numM33078h, numM33078h2, fM33079i, z, z2, z3, z4, i10 != -1 ? m33077g(strArrSplit[i10].trim()) : -1);
        } catch (RuntimeException e) {
            ria.m46825i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m33073c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static boolean m33074d(int i) {
        return i == 1 || i == 3;
    }

    /* renamed from: e */
    public static int m33075e(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str.trim());
            if (m33073c(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        ria.m46824h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: f */
    public static boolean m33076f(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            ria.m46825i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: g */
    public static int m33077g(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str.trim());
            if (m33074d(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        ria.m46824h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    /* renamed from: h */
    public static Integer m33078h(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            op0.m42511a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(br8.m19637d(((j >> 24) & 255) ^ 255), br8.m19637d(j & 255), br8.m19637d((j >> 8) & 255), br8.m19637d((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            ria.m46825i("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: i */
    public static float m33079i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            ria.m46825i("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
