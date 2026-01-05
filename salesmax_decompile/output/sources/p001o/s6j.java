package p001o;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes6.dex */
public final class s6j implements Serializable {

    /* renamed from: a */
    public final List f44880a;

    public s6j(List list) {
        sq8.m48649h(list, "days");
        this.f44880a = list;
    }

    /* renamed from: a */
    public final List m47918a() {
        return this.f44880a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(s6j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type com.kizitonwose.calendar.core.Week");
        s6j s6jVar = (s6j) obj;
        return sq8.m48644c(kh3.f0(this.f44880a), kh3.f0(s6jVar.f44880a)) && sq8.m48644c(kh3.r0(this.f44880a), kh3.r0(s6jVar.f44880a));
    }

    public int hashCode() {
        return (((a7j) kh3.f0(this.f44880a)).hashCode() * 31) + ((a7j) kh3.r0(this.f44880a)).hashCode();
    }

    public String toString() {
        return "Week { first = " + kh3.f0(this.f44880a) + ", last = " + kh3.r0(this.f44880a) + " } ";
    }
}
