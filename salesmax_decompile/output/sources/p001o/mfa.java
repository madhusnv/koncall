package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class mfa {

    /* renamed from: c */
    public static final C15308b f35348c = new C15308b(null);

    /* renamed from: a */
    public final String f35349a;

    /* renamed from: b */
    public final List f35350b;

    /* renamed from: o.mfa$a */
    public static final class C15307a {

        /* renamed from: a */
        public String f35351a;

        /* renamed from: b */
        public List f35352b;

        /* renamed from: a */
        public final mfa m38930a() {
            return new mfa(this, null);
        }

        /* renamed from: b */
        public final C15307a m38931b() {
            return this;
        }

        /* renamed from: c */
        public final String m38932c() {
            return this.f35351a;
        }

        /* renamed from: d */
        public final List m38933d() {
            return this.f35352b;
        }

        /* renamed from: e */
        public final void m38934e(String str) {
            this.f35351a = str;
        }

        /* renamed from: f */
        public final void m38935f(List list) {
            this.f35352b = list;
        }
    }

    /* renamed from: o.mfa$b */
    public static final class C15308b {
        public C15308b() {
        }

        public /* synthetic */ C15308b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mfa(C15307a c15307a, id5 id5Var) {
        this(c15307a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mfa.class != obj.getClass()) {
            return false;
        }
        mfa mfaVar = (mfa) obj;
        return sq8.m48644c(this.f35349a, mfaVar.f35349a) && sq8.m48644c(this.f35350b, mfaVar.f35350b);
    }

    public int hashCode() {
        String str = this.f35349a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f35350b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListSpeechSynthesisTasksResponse(");
        sb.append("nextToken=" + this.f35349a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("synthesisTasks=");
        sb2.append(this.f35350b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mfa(C15307a c15307a) {
        this.f35349a = c15307a.m38932c();
        this.f35350b = c15307a.m38933d();
    }
}
