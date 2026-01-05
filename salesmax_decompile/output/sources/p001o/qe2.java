package p001o;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class qe2 {

    /* renamed from: a */
    public final String f41753a;

    /* renamed from: b */
    public final int f41754b;

    public qe2(String str) {
        sq8.m48649h(str, "s");
        this.f41753a = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        this.f41754b = lowerCase.hashCode();
    }

    /* renamed from: a */
    public final String m45225a() {
        return this.f41753a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof qe2) && e9g.m24606x(((qe2) obj).f41753a, this.f41753a, true);
    }

    public int hashCode() {
        return this.f41754b;
    }

    public String toString() {
        return this.f41753a;
    }
}
