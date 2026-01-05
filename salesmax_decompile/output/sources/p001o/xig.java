package p001o;

/* loaded from: classes3.dex */
public abstract class xig {

    /* renamed from: o.xig$a */
    public static final class C18168a extends xig {

        /* renamed from: a */
        public final aj9 f53831a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18168a(aj9 aj9Var) {
            super(null);
            sq8.m48649h(aj9Var, "lazyTagWriter");
            this.f53831a = aj9Var;
        }

        /* renamed from: a */
        public final aj9 m56365a() {
            return this.f53831a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18168a) && sq8.m48644c(this.f53831a, ((C18168a) obj).f53831a);
        }

        public int hashCode() {
            return this.f53831a.hashCode();
        }

        public String toString() {
            return "Tag(lazyTagWriter=" + this.f53831a + ')';
        }
    }

    /* renamed from: o.xig$b */
    public static final class C18169b extends xig {

        /* renamed from: a */
        public final String f53832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18169b(String str) {
            super(null);
            sq8.m48649h(str, "text");
            this.f53832a = str;
        }

        /* renamed from: a */
        public final String m56366a() {
            return this.f53832a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18169b) && sq8.m48644c(this.f53832a, ((C18169b) obj).f53832a);
        }

        public int hashCode() {
            return this.f53832a.hashCode();
        }

        public String toString() {
            return "Text(text=" + this.f53832a + ')';
        }
    }

    public xig() {
    }

    public /* synthetic */ xig(id5 id5Var) {
        this();
    }
}
