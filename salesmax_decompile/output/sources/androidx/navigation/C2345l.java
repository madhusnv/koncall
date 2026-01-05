package androidx.navigation;

import p001o.hve;
import p001o.kge;
import p001o.ob9;
import p001o.sq8;
import p001o.uff;

/* renamed from: androidx.navigation.l */
/* loaded from: classes2.dex */
public final class C2345l {

    /* renamed from: a */
    public final boolean f9640a;

    /* renamed from: b */
    public final boolean f9641b;

    /* renamed from: c */
    public final int f9642c;

    /* renamed from: d */
    public final boolean f9643d;

    /* renamed from: e */
    public final boolean f9644e;

    /* renamed from: f */
    public final int f9645f;

    /* renamed from: g */
    public final int f9646g;

    /* renamed from: h */
    public final int f9647h;

    /* renamed from: i */
    public final int f9648i;

    /* renamed from: j */
    public String f9649j;

    /* renamed from: k */
    public ob9 f9650k;

    /* renamed from: l */
    public Object f9651l;

    /* renamed from: androidx.navigation.l$a */
    public static final class a {

        /* renamed from: a */
        public boolean f9652a;

        /* renamed from: b */
        public boolean f9653b;

        /* renamed from: d */
        public String f9655d;

        /* renamed from: e */
        public ob9 f9656e;

        /* renamed from: f */
        public Object f9657f;

        /* renamed from: g */
        public boolean f9658g;

        /* renamed from: h */
        public boolean f9659h;

        /* renamed from: c */
        public int f9654c = -1;

        /* renamed from: i */
        public int f9660i = -1;

        /* renamed from: j */
        public int f9661j = -1;

        /* renamed from: k */
        public int f9662k = -1;

        /* renamed from: l */
        public int f9663l = -1;

        /* renamed from: k */
        public static /* synthetic */ a m8813k(a aVar, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return aVar.m8820g(i, z, z2);
        }

        /* renamed from: a */
        public final C2345l m8814a() {
            String str = this.f9655d;
            if (str != null) {
                return new C2345l(this.f9652a, this.f9653b, str, this.f9658g, this.f9659h, this.f9660i, this.f9661j, this.f9662k, this.f9663l);
            }
            ob9 ob9Var = this.f9656e;
            if (ob9Var != null) {
                return new C2345l(this.f9652a, this.f9653b, ob9Var, this.f9658g, this.f9659h, this.f9660i, this.f9661j, this.f9662k, this.f9663l);
            }
            Object obj = this.f9657f;
            if (obj == null) {
                return new C2345l(this.f9652a, this.f9653b, this.f9654c, this.f9658g, this.f9659h, this.f9660i, this.f9661j, this.f9662k, this.f9663l);
            }
            boolean z = this.f9652a;
            boolean z2 = this.f9653b;
            sq8.m48646e(obj);
            return new C2345l(z, z2, obj, this.f9658g, this.f9659h, this.f9660i, this.f9661j, this.f9662k, this.f9663l);
        }

        /* renamed from: b */
        public final a m8815b(int i) {
            this.f9660i = i;
            return this;
        }

        /* renamed from: c */
        public final a m8816c(int i) {
            this.f9661j = i;
            return this;
        }

        /* renamed from: d */
        public final a m8817d(boolean z) {
            this.f9652a = z;
            return this;
        }

        /* renamed from: e */
        public final a m8818e(int i) {
            this.f9662k = i;
            return this;
        }

        /* renamed from: f */
        public final a m8819f(int i) {
            this.f9663l = i;
            return this;
        }

        /* renamed from: g */
        public final a m8820g(int i, boolean z, boolean z2) {
            this.f9654c = i;
            this.f9655d = null;
            this.f9658g = z;
            this.f9659h = z2;
            return this;
        }

        /* renamed from: h */
        public final a m8821h(Object obj, boolean z, boolean z2) {
            sq8.m48649h(obj, "route");
            this.f9657f = obj;
            m8820g(hve.m31222b(uff.m51545a(kge.m35689b(obj.getClass()))), z, z2);
            return this;
        }

        /* renamed from: i */
        public final a m8822i(String str, boolean z, boolean z2) {
            this.f9655d = str;
            this.f9654c = -1;
            this.f9658g = z;
            this.f9659h = z2;
            return this;
        }

        /* renamed from: j */
        public final a m8823j(ob9 ob9Var, boolean z, boolean z2) {
            sq8.m48649h(ob9Var, "klass");
            this.f9656e = ob9Var;
            this.f9654c = -1;
            this.f9658g = z;
            this.f9659h = z2;
            return this;
        }

        /* renamed from: l */
        public final a m8824l(boolean z) {
            this.f9653b = z;
            return this;
        }
    }

    public C2345l(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.f9640a = z;
        this.f9641b = z2;
        this.f9642c = i;
        this.f9643d = z3;
        this.f9644e = z4;
        this.f9645f = i2;
        this.f9646g = i3;
        this.f9647h = i4;
        this.f9648i = i5;
    }

    /* renamed from: a */
    public final int m8801a() {
        return this.f9645f;
    }

    /* renamed from: b */
    public final int m8802b() {
        return this.f9646g;
    }

    /* renamed from: c */
    public final int m8803c() {
        return this.f9647h;
    }

    /* renamed from: d */
    public final int m8804d() {
        return this.f9648i;
    }

    /* renamed from: e */
    public final int m8805e() {
        return this.f9642c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2345l)) {
            return false;
        }
        C2345l c2345l = (C2345l) obj;
        return this.f9640a == c2345l.f9640a && this.f9641b == c2345l.f9641b && this.f9642c == c2345l.f9642c && sq8.m48644c(this.f9649j, c2345l.f9649j) && sq8.m48644c(this.f9650k, c2345l.f9650k) && sq8.m48644c(this.f9651l, c2345l.f9651l) && this.f9643d == c2345l.f9643d && this.f9644e == c2345l.f9644e && this.f9645f == c2345l.f9645f && this.f9646g == c2345l.f9646g && this.f9647h == c2345l.f9647h && this.f9648i == c2345l.f9648i;
    }

    /* renamed from: f */
    public final String m8806f() {
        return this.f9649j;
    }

    /* renamed from: g */
    public final ob9 m8807g() {
        return this.f9650k;
    }

    /* renamed from: h */
    public final Object m8808h() {
        return this.f9651l;
    }

    public int hashCode() {
        int i = (((((m8810j() ? 1 : 0) * 31) + (m8812l() ? 1 : 0)) * 31) + this.f9642c) * 31;
        String str = this.f9649j;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        ob9 ob9Var = this.f9650k;
        int iHashCode2 = (iHashCode + (ob9Var != null ? ob9Var.hashCode() : 0)) * 31;
        Object obj = this.f9651l;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (m8809i() ? 1 : 0)) * 31) + (m8811k() ? 1 : 0)) * 31) + this.f9645f) * 31) + this.f9646g) * 31) + this.f9647h) * 31) + this.f9648i;
    }

    /* renamed from: i */
    public final boolean m8809i() {
        return this.f9643d;
    }

    /* renamed from: j */
    public final boolean m8810j() {
        return this.f9640a;
    }

    /* renamed from: k */
    public final boolean m8811k() {
        return this.f9644e;
    }

    /* renamed from: l */
    public final boolean m8812l() {
        return this.f9641b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2345l.class.getSimpleName());
        sb.append("(");
        if (this.f9640a) {
            sb.append("launchSingleTop ");
        }
        if (this.f9641b) {
            sb.append("restoreState ");
        }
        String str = this.f9649j;
        if ((str != null || this.f9642c != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.f9649j;
            if (str2 != null) {
                sb.append(str2);
            } else {
                ob9 ob9Var = this.f9650k;
                if (ob9Var != null) {
                    sb.append(ob9Var);
                } else {
                    Object obj = this.f9651l;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(this.f9642c));
                    }
                }
            }
            if (this.f9643d) {
                sb.append(" inclusive");
            }
            if (this.f9644e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.f9645f != -1 || this.f9646g != -1 || this.f9647h != -1 || this.f9648i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.f9645f));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.f9646g));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.f9647h));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.f9648i));
            sb.append(")");
        }
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }

    public C2345l(boolean z, boolean z2, String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, AbstractC2341h.f9602x.m8774a(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.f9649j = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2345l(boolean z, boolean z2, ob9 ob9Var, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, hve.m31222b(uff.m51545a(ob9Var)), z3, z4, i, i2, i3, i4);
        sq8.m48646e(ob9Var);
        this.f9650k = ob9Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2345l(boolean z, boolean z2, Object obj, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, hve.m31222b(uff.m51545a(kge.m35689b(obj.getClass()))), z3, z4, i, i2, i3, i4);
        sq8.m48649h(obj, "popUpToRouteObject");
        this.f9651l = obj;
    }
}
