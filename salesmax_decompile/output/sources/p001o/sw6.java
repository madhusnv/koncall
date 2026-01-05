package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes2.dex */
public final class sw6 {

    /* renamed from: a */
    public final int f46020a;

    /* renamed from: b */
    public final String f46021b;

    public sw6(int i, String str) {
        sq8.m48649h(str, FirebaseAnalytics.Param.CONTENT);
        this.f46020a = i;
        this.f46021b = str;
    }

    /* renamed from: a */
    public final String m48958a() {
        return this.f46021b;
    }

    /* renamed from: b */
    public final int m48959b() {
        return this.f46020a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw6)) {
            return false;
        }
        sw6 sw6Var = (sw6) obj;
        return this.f46020a == sw6Var.f46020a && sq8.m48644c(this.f46021b, sw6Var.f46021b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f46020a) * 31) + this.f46021b.hashCode();
    }

    public String toString() {
        return "FileLine(lineNumber=" + this.f46020a + ", content=" + this.f46021b + ')';
    }
}
