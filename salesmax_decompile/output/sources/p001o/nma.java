package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class nma {

    /* renamed from: a */
    public final Object f37042a;

    /* renamed from: b */
    public final Throwable f37043b;

    public nma(Object obj) {
        this.f37042a = obj;
        this.f37043b = null;
    }

    /* renamed from: a */
    public Throwable m40787a() {
        return this.f37043b;
    }

    /* renamed from: b */
    public Object m40788b() {
        return this.f37042a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nma)) {
            return false;
        }
        nma nmaVar = (nma) obj;
        if (m40788b() != null && m40788b().equals(nmaVar.m40788b())) {
            return true;
        }
        if (m40787a() == null || nmaVar.m40787a() == null) {
            return false;
        }
        return m40787a().toString().equals(m40787a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m40788b(), m40787a()});
    }

    public nma(Throwable th) {
        this.f37043b = th;
        this.f37042a = null;
    }
}
