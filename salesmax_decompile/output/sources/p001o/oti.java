package p001o;

import com.google.android.gms.cast.MediaTrack;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class oti implements Comparable {

    /* renamed from: f */
    public static final C15894a f38921f = new C15894a(null);

    /* renamed from: g */
    public static final oti f38922g = new oti(0, 0, 0, "");

    /* renamed from: h */
    public static final oti f38923h = new oti(0, 1, 0, "");

    /* renamed from: q */
    public static final oti f38924q;

    /* renamed from: s */
    public static final oti f38925s;

    /* renamed from: a */
    public final int f38926a;

    /* renamed from: b */
    public final int f38927b;

    /* renamed from: c */
    public final int f38928c;

    /* renamed from: d */
    public final String f38929d;

    /* renamed from: e */
    public final gi9 f38930e;

    /* renamed from: o.oti$a */
    public static final class C15894a {
        public C15894a() {
        }

        public /* synthetic */ C15894a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final oti m42695a() {
            return oti.f38923h;
        }

        /* renamed from: b */
        public final oti m42696b(String str) {
            if (str == null || f9g.d0(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
            sq8.m48648g(strGroup4, MediaTrack.ROLE_DESCRIPTION);
            return new oti(iIntValue, iIntValue2, iIntValue3, strGroup4, null);
        }
    }

    /* renamed from: o.oti$b */
    public static final class C15895b extends kf9 implements uk7 {
        public C15895b() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(oti.this.m42692e()).shiftLeft(32).or(BigInteger.valueOf(oti.this.m42693g())).shiftLeft(32).or(BigInteger.valueOf(oti.this.m42694h()));
        }
    }

    static {
        oti otiVar = new oti(1, 0, 0, "");
        f38924q = otiVar;
        f38925s = otiVar;
    }

    public /* synthetic */ oti(int i, int i2, int i3, String str, id5 id5Var) {
        this(i, i2, i3, str);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(oti otiVar) {
        sq8.m48649h(otiVar, "other");
        return m42691d().compareTo(otiVar.m42691d());
    }

    /* renamed from: d */
    public final BigInteger m42691d() {
        Object value = this.f38930e.getValue();
        sq8.m48648g(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    /* renamed from: e */
    public final int m42692e() {
        return this.f38926a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof oti)) {
            return false;
        }
        oti otiVar = (oti) obj;
        return this.f38926a == otiVar.f38926a && this.f38927b == otiVar.f38927b && this.f38928c == otiVar.f38928c;
    }

    /* renamed from: g */
    public final int m42693g() {
        return this.f38927b;
    }

    /* renamed from: h */
    public final int m42694h() {
        return this.f38928c;
    }

    public int hashCode() {
        return ((((527 + this.f38926a) * 31) + this.f38927b) * 31) + this.f38928c;
    }

    public String toString() {
        return this.f38926a + '.' + this.f38927b + '.' + this.f38928c + (f9g.d0(this.f38929d) ^ true ? sq8.m48658q("-", this.f38929d) : "");
    }

    public oti(int i, int i2, int i3, String str) {
        this.f38926a = i;
        this.f38927b = i2;
        this.f38928c = i3;
        this.f38929d = str;
        this.f38930e = si9.m48360a(new C15895b());
    }
}
