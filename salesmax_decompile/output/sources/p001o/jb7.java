package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class jb7 {

    /* renamed from: a */
    public final List f30080a;

    /* renamed from: b */
    public final char f30081b;

    /* renamed from: c */
    public final double f30082c;

    /* renamed from: d */
    public final double f30083d;

    /* renamed from: e */
    public final String f30084e;

    /* renamed from: f */
    public final String f30085f;

    public jb7(List list, char c, double d, double d2, String str, String str2) {
        this.f30080a = list;
        this.f30081b = c;
        this.f30082c = d;
        this.f30083d = d2;
        this.f30084e = str;
        this.f30085f = str2;
    }

    /* renamed from: c */
    public static int m33463c(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List m33464a() {
        return this.f30080a;
    }

    /* renamed from: b */
    public double m33465b() {
        return this.f30083d;
    }

    public int hashCode() {
        return m33463c(this.f30081b, this.f30085f, this.f30084e);
    }
}
