package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class lyg {

    /* renamed from: a */
    public static final C15178a f34520a = new C15178a(null);

    /* renamed from: b */
    public static final List f34521b = ch3.m21249n(C15179b.f34522c, C15180c.f34524c, C15181d.f34526c, C15182e.f34528c);

    /* renamed from: o.lyg$a */
    public static final class C15178a {
        public C15178a() {
        }

        public /* synthetic */ C15178a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final lyg m38105a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1402931637:
                    if (str.equals("completed")) {
                        return C15179b.f34522c;
                    }
                    break;
                case -1347010958:
                    if (str.equals("inProgress")) {
                        return C15181d.f34526c;
                    }
                    break;
                case -1281977283:
                    if (str.equals("failed")) {
                        return C15180c.f34524c;
                    }
                    break;
                case -160710483:
                    if (str.equals("scheduled")) {
                        return C15182e.f34528c;
                    }
                    break;
            }
            return new C15183f(str);
        }
    }

    /* renamed from: o.lyg$b */
    public static final class C15179b extends lyg {

        /* renamed from: c */
        public static final C15179b f34522c = new C15179b();

        /* renamed from: d */
        public static final String f34523d = "completed";

        public C15179b() {
            super(null);
        }

        public String toString() {
            return "Completed";
        }
    }

    /* renamed from: o.lyg$c */
    public static final class C15180c extends lyg {

        /* renamed from: c */
        public static final C15180c f34524c = new C15180c();

        /* renamed from: d */
        public static final String f34525d = "failed";

        public C15180c() {
            super(null);
        }

        public String toString() {
            return "Failed";
        }
    }

    /* renamed from: o.lyg$d */
    public static final class C15181d extends lyg {

        /* renamed from: c */
        public static final C15181d f34526c = new C15181d();

        /* renamed from: d */
        public static final String f34527d = "inProgress";

        public C15181d() {
            super(null);
        }

        public String toString() {
            return "InProgress";
        }
    }

    /* renamed from: o.lyg$e */
    public static final class C15182e extends lyg {

        /* renamed from: c */
        public static final C15182e f34528c = new C15182e();

        /* renamed from: d */
        public static final String f34529d = "scheduled";

        public C15182e() {
            super(null);
        }

        public String toString() {
            return "Scheduled";
        }
    }

    /* renamed from: o.lyg$f */
    public static final class C15183f extends lyg {

        /* renamed from: c */
        public final String f34530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15183f(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f34530c = str;
        }

        /* renamed from: a */
        public String m38106a() {
            return this.f34530c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15183f) && sq8.m48644c(this.f34530c, ((C15183f) obj).f34530c);
        }

        public int hashCode() {
            return this.f34530c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m38106a() + ')';
        }
    }

    public lyg() {
    }

    public /* synthetic */ lyg(id5 id5Var) {
        this();
    }
}
