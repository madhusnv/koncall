package p001o;

import j$.time.LocalDate;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class ps1 implements Serializable {

    /* renamed from: a */
    public final LocalDate f40466a;

    /* renamed from: b */
    public final d05 f40467b;

    public ps1(LocalDate localDate, d05 d05Var) {
        sq8.m48649h(localDate, "date");
        sq8.m48649h(d05Var, "position");
        this.f40466a = localDate;
        this.f40467b = d05Var;
    }

    /* renamed from: a */
    public final LocalDate m44102a() {
        return this.f40466a;
    }

    /* renamed from: b */
    public final d05 m44103b() {
        return this.f40467b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps1)) {
            return false;
        }
        ps1 ps1Var = (ps1) obj;
        return sq8.m48644c(this.f40466a, ps1Var.f40466a) && this.f40467b == ps1Var.f40467b;
    }

    public int hashCode() {
        return (this.f40466a.hashCode() * 31) + this.f40467b.hashCode();
    }

    public String toString() {
        return "CalendarDay(date=" + this.f40466a + ", position=" + this.f40467b + ")";
    }
}
