package p001o;

import java.util.List;

/* loaded from: classes5.dex */
public final class x31 extends wf1 {

    /* renamed from: a */
    public final List f53129a;

    public x31(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f53129a = list;
    }

    @Override // p001o.wf1
    /* renamed from: c */
    public List mo54286c() {
        return this.f53129a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wf1) {
            return this.f53129a.equals(((wf1) obj).mo54286c());
        }
        return false;
    }

    public int hashCode() {
        return this.f53129a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f53129a + "}";
    }
}
