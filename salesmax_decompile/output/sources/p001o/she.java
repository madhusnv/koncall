package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class she {

    /* renamed from: a */
    public static final C16845b f45444a = new C16845b(null);

    /* renamed from: b */
    public static final List f45445b = bh3.m18963e(C16844a.f45446c);

    /* renamed from: o.she$a */
    public static final class C16844a extends she {

        /* renamed from: c */
        public static final C16844a f45446c = new C16844a();

        /* renamed from: d */
        public static final String f45447d = "CHILD";

        public C16844a() {
            super(null);
        }

        public String toString() {
            return "Child";
        }
    }

    /* renamed from: o.she$b */
    public static final class C16845b {
        public C16845b() {
        }

        public /* synthetic */ C16845b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final she m48353a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "CHILD") ? C16844a.f45446c : new C16846c(str);
        }
    }

    /* renamed from: o.she$c */
    public static final class C16846c extends she {

        /* renamed from: c */
        public final String f45448c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16846c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f45448c = str;
        }

        /* renamed from: a */
        public String m48354a() {
            return this.f45448c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16846c) && sq8.m48644c(this.f45448c, ((C16846c) obj).f45448c);
        }

        public int hashCode() {
            return this.f45448c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m48354a() + ')';
        }
    }

    public she() {
    }

    public /* synthetic */ she(id5 id5Var) {
        this();
    }
}
