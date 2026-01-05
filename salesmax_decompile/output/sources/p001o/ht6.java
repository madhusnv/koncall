package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class ht6 {

    /* renamed from: a */
    public final List f27516a;

    /* renamed from: o.ht6$a */
    public static final class C14063a extends ht6 {

        /* renamed from: b */
        public final long f27517b;

        /* renamed from: c */
        public final long f27518c;

        /* renamed from: d */
        public final boolean f27519d;

        public /* synthetic */ C14063a(List list, long j, long j2, boolean z, id5 id5Var) {
            this(list, j, j2, z);
        }

        @Override // p001o.ht6
        /* renamed from: b */
        public ht6 mo31110b(jcd jcdVar) {
            sq8.m48649h(jcdVar, "f");
            List listM18961c = bh3.m18961c();
            int size = m31109a().size();
            for (int i = 0; i < size; i++) {
                listM18961c.add(((yc4) m31109a().get(i)).m57505n(jcdVar));
            }
            return new C14063a(bh3.m18959a(listM18961c), gcd.m28442m(this.f27517b, jcdVar), gcd.m28442m(this.f27518c, jcdVar), this.f27519d, null);
        }

        /* renamed from: c */
        public final boolean m31111c() {
            return this.f27519d;
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) f37.m26033f(this.f27517b)) + ", center=" + ((Object) f37.m26033f(this.f27518c)) + ", convex=" + this.f27519d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14063a(List list, long j, long j2, boolean z) {
            super(list);
            sq8.m48649h(list, "cubics");
            this.f27517b = j;
            this.f27518c = j2;
            this.f27519d = z;
        }
    }

    /* renamed from: o.ht6$b */
    public static final class C14064b extends ht6 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14064b(List list) {
            super(list);
            sq8.m48649h(list, "cubics");
        }

        @Override // p001o.ht6
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C14064b mo31110b(jcd jcdVar) {
            sq8.m48649h(jcdVar, "f");
            List listM18961c = bh3.m18961c();
            int size = m31109a().size();
            for (int i = 0; i < size; i++) {
                listM18961c.add(((yc4) m31109a().get(i)).m57505n(jcdVar));
            }
            return new C14064b(bh3.m18959a(listM18961c));
        }

        public String toString() {
            return "Edge";
        }
    }

    public ht6(List list) {
        sq8.m48649h(list, "cubics");
        this.f27516a = list;
    }

    /* renamed from: a */
    public final List m31109a() {
        return this.f27516a;
    }

    /* renamed from: b */
    public abstract ht6 mo31110b(jcd jcdVar);
}
