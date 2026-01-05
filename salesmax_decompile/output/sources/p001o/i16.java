package p001o;

import java.util.HashSet;

/* loaded from: classes5.dex */
public class i16 {

    /* renamed from: a */
    public final Object f27909a;

    /* renamed from: b */
    public String f27910b;

    /* renamed from: c */
    public String f27911c;

    /* renamed from: d */
    public HashSet f27912d;

    public i16(Object obj) {
        this.f27909a = obj;
    }

    /* renamed from: e */
    public static i16 m31356e(b99 b99Var) {
        return new i16(b99Var);
    }

    /* renamed from: f */
    public static i16 m31357f(ca9 ca9Var) {
        return new i16(ca9Var);
    }

    /* renamed from: a */
    public i16 m31358a() {
        return new i16(this.f27909a);
    }

    /* renamed from: b */
    public Object m31359b() {
        return this.f27909a;
    }

    /* renamed from: c */
    public boolean m31360c(String str) {
        String str2 = this.f27910b;
        if (str2 == null) {
            this.f27910b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f27911c;
        if (str3 == null) {
            this.f27911c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f27912d == null) {
            HashSet hashSet = new HashSet(16);
            this.f27912d = hashSet;
            hashSet.add(this.f27910b);
            this.f27912d.add(this.f27911c);
        }
        return !this.f27912d.add(str);
    }

    /* renamed from: d */
    public void m31361d() {
        this.f27910b = null;
        this.f27911c = null;
        this.f27912d = null;
    }
}
