package p001o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class h56 {

    /* renamed from: a */
    public final long f26213a;

    /* renamed from: b */
    public final TimeUnit f26214b;

    public h56(long j, TimeUnit timeUnit) {
        sq8.m48649h(timeUnit, "timeUnit");
        this.f26213a = j;
        this.f26214b = timeUnit;
    }

    /* renamed from: a */
    public final long m29820a() {
        return this.f26213a;
    }

    /* renamed from: b */
    public final TimeUnit m29821b() {
        return this.f26214b;
    }

    /* renamed from: c */
    public final j56 m29822c(int i) {
        return new j56(this).m33264c(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h56)) {
            return false;
        }
        h56 h56Var = (h56) obj;
        return this.f26213a == h56Var.f26213a && this.f26214b == h56Var.f26214b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f26213a) * 31) + this.f26214b.hashCode();
    }

    public String toString() {
        return "Emitter(duration=" + this.f26213a + ", timeUnit=" + this.f26214b + ")";
    }
}
