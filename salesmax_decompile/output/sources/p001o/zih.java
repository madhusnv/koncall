package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class zih {

    /* renamed from: a */
    public static final C18654a f57262a = new C18654a(null);

    /* renamed from: b */
    public static final List f57263b = ch3.m21249n(C18655b.f57264c, C18656c.f57266c);

    /* renamed from: o.zih$a */
    public static final class C18654a {
        public C18654a() {
        }

        public /* synthetic */ C18654a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final zih m59501a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "HANDWRITING") ? C18655b.f57264c : sq8.m48644c(str, "PRINTED") ? C18656c.f57266c : new C18657d(str);
        }
    }

    /* renamed from: o.zih$b */
    public static final class C18655b extends zih {

        /* renamed from: c */
        public static final C18655b f57264c = new C18655b();

        /* renamed from: d */
        public static final String f57265d = "HANDWRITING";

        public C18655b() {
            super(null);
        }

        public String toString() {
            return "Handwriting";
        }
    }

    /* renamed from: o.zih$c */
    public static final class C18656c extends zih {

        /* renamed from: c */
        public static final C18656c f57266c = new C18656c();

        /* renamed from: d */
        public static final String f57267d = "PRINTED";

        public C18656c() {
            super(null);
        }

        public String toString() {
            return "Printed";
        }
    }

    /* renamed from: o.zih$d */
    public static final class C18657d extends zih {

        /* renamed from: c */
        public final String f57268c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18657d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f57268c = str;
        }

        /* renamed from: a */
        public String m59502a() {
            return this.f57268c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18657d) && sq8.m48644c(this.f57268c, ((C18657d) obj).f57268c);
        }

        public int hashCode() {
            return this.f57268c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m59502a() + ')';
        }
    }

    public zih() {
    }

    public /* synthetic */ zih(id5 id5Var) {
        this();
    }
}
