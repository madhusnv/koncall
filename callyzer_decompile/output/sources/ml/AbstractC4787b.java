package ml;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ml.b */
/* loaded from: classes.dex */
public abstract class AbstractC4787b {

    /* renamed from: a */
    public final C4788c f23823a;

    public AbstractC4787b(C4788c c4788c) {
        this.f23823a = c4788c;
    }

    /* renamed from: a */
    public abstract Object mo9711a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC4787b abstractC4787b = (AbstractC4787b) obj;
        if (this.f23823a != abstractC4787b.f23823a) {
            return false;
        }
        return mo9711a() != null ? mo9711a().equals(abstractC4787b.mo9711a()) : abstractC4787b.mo9711a() == null;
    }

    public final int hashCode() {
        return this.f23823a.f23827b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        return AbstractC1452a.m4564k(sb2, mo9711a() != null ? mo9711a().toString() : null, "]");
    }
}
