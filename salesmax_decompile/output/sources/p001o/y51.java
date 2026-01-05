package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public final class y51 extends kth {

    /* renamed from: a */
    public final List f54900a;

    public y51(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f54900a = list;
    }

    @Override // p001o.kth
    /* renamed from: d */
    public List mo36232d() {
        return this.f54900a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kth) {
            return this.f54900a.equals(((kth) obj).mo36232d());
        }
        return false;
    }

    public int hashCode() {
        return this.f54900a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Tracestate{entries=" + this.f54900a + "}";
    }
}
