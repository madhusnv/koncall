package p001o;

/* loaded from: classes2.dex */
public interface zaf {

    /* renamed from: o.zaf$a */
    public static final class C18603a {

        /* renamed from: a */
        public final bbf f56857a;

        /* renamed from: b */
        public final bbf f56858b;

        public C18603a(bbf bbfVar) {
            this(bbfVar, bbfVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C18603a.class != obj.getClass()) {
                return false;
            }
            C18603a c18603a = (C18603a) obj;
            return this.f56857a.equals(c18603a.f56857a) && this.f56858b.equals(c18603a.f56858b);
        }

        public int hashCode() {
            return (this.f56857a.hashCode() * 31) + this.f56858b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f56857a);
            if (this.f56857a.equals(this.f56858b)) {
                str = "";
            } else {
                str = ", " + this.f56858b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C18603a(bbf bbfVar, bbf bbfVar2) {
            this.f56857a = (bbf) op0.m42515e(bbfVar);
            this.f56858b = (bbf) op0.m42515e(bbfVar2);
        }
    }

    /* renamed from: o.zaf$b */
    public static class C18604b implements zaf {

        /* renamed from: a */
        public final long f56859a;

        /* renamed from: b */
        public final C18603a f56860b;

        public C18604b(long j) {
            this(j, 0L);
        }

        @Override // p001o.zaf
        /* renamed from: e */
        public C18603a mo25530e(long j) {
            return this.f56860b;
        }

        @Override // p001o.zaf
        public long getDurationUs() {
            return this.f56859a;
        }

        @Override // p001o.zaf
        /* renamed from: h */
        public boolean mo25531h() {
            return false;
        }

        public C18604b(long j, long j2) {
            this.f56859a = j;
            this.f56860b = new C18603a(j2 == 0 ? bbf.f15876c : new bbf(0L, j2));
        }
    }

    /* renamed from: e */
    C18603a mo25530e(long j);

    long getDurationUs();

    /* renamed from: h */
    boolean mo25531h();
}
