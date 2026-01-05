package p001o;

/* loaded from: classes2.dex */
public interface rzh extends p4g {
    /* renamed from: c */
    boolean mo47364c();

    /* renamed from: o.rzh$a */
    public static final class C16695a implements rzh {

        /* renamed from: a */
        public final Object f44344a;

        /* renamed from: b */
        public final boolean f44345b;

        public C16695a(Object obj, boolean z) {
            sq8.m48649h(obj, "value");
            this.f44344a = obj;
            this.f44345b = z;
        }

        @Override // p001o.rzh
        /* renamed from: c */
        public boolean mo47364c() {
            return this.f44345b;
        }

        @Override // p001o.p4g
        public Object getValue() {
            return this.f44344a;
        }

        public /* synthetic */ C16695a(Object obj, boolean z, int i, id5 id5Var) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}
