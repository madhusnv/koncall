package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ame {

    /* renamed from: a */
    public static final C12219a f14997a = new C12219a(null);

    /* renamed from: b */
    public static final List f14998b = bh3.m18963e(C12220b.f14999c);

    /* renamed from: o.ame$a */
    public static final class C12219a {
        public C12219a() {
        }

        public /* synthetic */ C12219a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ame m17462a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "requester") ? C12220b.f14999c : new C12221c(str);
        }
    }

    /* renamed from: o.ame$b */
    public static final class C12220b extends ame {

        /* renamed from: c */
        public static final C12220b f14999c = new C12220b();

        /* renamed from: d */
        public static final String f15000d = "requester";

        public C12220b() {
            super(null);
        }

        public String toString() {
            return "Requester";
        }
    }

    /* renamed from: o.ame$c */
    public static final class C12221c extends ame {

        /* renamed from: c */
        public final String f15001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12221c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f15001c = str;
        }

        /* renamed from: a */
        public String m17463a() {
            return this.f15001c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12221c) && sq8.m48644c(this.f15001c, ((C12221c) obj).f15001c);
        }

        public int hashCode() {
            return this.f15001c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m17463a() + ')';
        }
    }

    public ame() {
    }

    public /* synthetic */ ame(id5 id5Var) {
        this();
    }
}
