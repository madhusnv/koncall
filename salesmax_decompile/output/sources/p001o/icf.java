package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class icf {

    /* renamed from: a */
    public static final C14253a f28459a = new C14253a(null);

    /* renamed from: b */
    public static final List f28460b = ch3.m21249n(C14254b.f28461c, C14256d.f28464c);

    /* renamed from: o.icf$a */
    public static final class C14253a {
        public C14253a() {
        }

        public /* synthetic */ C14253a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final icf m31909a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "NOT_SELECTED") ? C14254b.f28461c : sq8.m48644c(str, "SELECTED") ? C14256d.f28464c : new C14255c(str);
        }
    }

    /* renamed from: o.icf$b */
    public static final class C14254b extends icf {

        /* renamed from: c */
        public static final C14254b f28461c = new C14254b();

        /* renamed from: d */
        public static final String f28462d = "NOT_SELECTED";

        public C14254b() {
            super(null);
        }

        public String toString() {
            return "NotSelected";
        }
    }

    /* renamed from: o.icf$c */
    public static final class C14255c extends icf {

        /* renamed from: c */
        public final String f28463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14255c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f28463c = str;
        }

        /* renamed from: a */
        public String m31910a() {
            return this.f28463c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14255c) && sq8.m48644c(this.f28463c, ((C14255c) obj).f28463c);
        }

        public int hashCode() {
            return this.f28463c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m31910a() + ')';
        }
    }

    /* renamed from: o.icf$d */
    public static final class C14256d extends icf {

        /* renamed from: c */
        public static final C14256d f28464c = new C14256d();

        /* renamed from: d */
        public static final String f28465d = "SELECTED";

        public C14256d() {
            super(null);
        }

        public String toString() {
            return "Selected";
        }
    }

    public icf() {
    }

    public /* synthetic */ icf(id5 id5Var) {
        this();
    }
}
