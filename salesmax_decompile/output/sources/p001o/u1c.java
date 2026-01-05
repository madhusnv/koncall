package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class u1c {

    /* renamed from: b */
    public static final u1c f48178b = new u1c(null);

    /* renamed from: a */
    public final Object f48179a;

    public u1c(Object obj) {
        this.f48179a = obj;
    }

    /* renamed from: a */
    public static u1c m50847a() {
        return f48178b;
    }

    /* renamed from: b */
    public static u1c m50848b(Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new u1c(d3c.error(th));
    }

    /* renamed from: c */
    public static u1c m50849c(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        return new u1c(obj);
    }

    /* renamed from: d */
    public Throwable m50850d() {
        Object obj = this.f48179a;
        if (d3c.isError(obj)) {
            return d3c.getError(obj);
        }
        return null;
    }

    /* renamed from: e */
    public Object m50851e() {
        Object obj = this.f48179a;
        if (obj == null || d3c.isError(obj)) {
            return null;
        }
        return this.f48179a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u1c) {
            return Objects.equals(this.f48179a, ((u1c) obj).f48179a);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m50852f() {
        return this.f48179a == null;
    }

    /* renamed from: g */
    public boolean m50853g() {
        return d3c.isError(this.f48179a);
    }

    public int hashCode() {
        Object obj = this.f48179a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f48179a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (d3c.isError(obj)) {
            return "OnErrorNotification[" + d3c.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f48179a + "]";
    }
}
