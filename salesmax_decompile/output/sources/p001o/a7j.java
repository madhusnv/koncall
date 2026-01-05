package p001o;

import j$.time.LocalDate;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class a7j implements Serializable {

    /* renamed from: a */
    public final LocalDate f14264a;

    /* renamed from: b */
    public final c7j f14265b;

    public a7j(LocalDate localDate, c7j c7jVar) {
        sq8.m48649h(localDate, "date");
        sq8.m48649h(c7jVar, "position");
        this.f14264a = localDate;
        this.f14265b = c7jVar;
    }

    /* renamed from: a */
    public final LocalDate m16579a() {
        return this.f14264a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7j)) {
            return false;
        }
        a7j a7jVar = (a7j) obj;
        return sq8.m48644c(this.f14264a, a7jVar.f14264a) && this.f14265b == a7jVar.f14265b;
    }

    public int hashCode() {
        return (this.f14264a.hashCode() * 31) + this.f14265b.hashCode();
    }

    public String toString() {
        return "WeekDay(date=" + this.f14264a + ", position=" + this.f14265b + ")";
    }
}
