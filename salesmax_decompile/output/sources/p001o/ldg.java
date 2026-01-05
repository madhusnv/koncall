package p001o;

import java.io.Serializable;
import p001o.ldg;

/* loaded from: classes3.dex */
public abstract class ldg {

    /* renamed from: o.ldg$a */
    public static class C15061a implements hdg, Serializable {

        /* renamed from: a */
        public final hdg f33660a;

        /* renamed from: b */
        public volatile transient boolean f33661b;

        /* renamed from: c */
        public transient Object f33662c;

        public C15061a(hdg hdgVar) {
            this.f33660a = (hdg) dgd.m23062o(hdgVar);
        }

        @Override // p001o.hdg
        public Object get() {
            if (!this.f33661b) {
                synchronized (this) {
                    if (!this.f33661b) {
                        Object obj = this.f33660a.get();
                        this.f33662c = obj;
                        this.f33661b = true;
                        return obj;
                    }
                }
            }
            return c5c.m20250a(this.f33662c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.f33661b) {
                obj = "<supplier that returned " + this.f33662c + ">";
            } else {
                obj = this.f33660a;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.ldg$b */
    public static class C15062b implements hdg {

        /* renamed from: c */
        public static final hdg f33663c = new hdg() { // from class: o.mdg
            @Override // p001o.hdg
            public final Object get() {
                return ldg.C15062b.m36989b();
            }
        };

        /* renamed from: a */
        public volatile hdg f33664a;

        /* renamed from: b */
        public Object f33665b;

        public C15062b(hdg hdgVar) {
            this.f33664a = (hdg) dgd.m23062o(hdgVar);
        }

        /* renamed from: b */
        public static /* synthetic */ Void m36989b() {
            throw new IllegalStateException();
        }

        @Override // p001o.hdg
        public Object get() {
            hdg hdgVar = this.f33664a;
            hdg hdgVar2 = f33663c;
            if (hdgVar != hdgVar2) {
                synchronized (this) {
                    if (this.f33664a != hdgVar2) {
                        Object obj = this.f33664a.get();
                        this.f33665b = obj;
                        this.f33664a = hdgVar2;
                        return obj;
                    }
                }
            }
            return c5c.m20250a(this.f33665b);
        }

        public String toString() {
            Object obj = this.f33664a;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == f33663c) {
                obj = "<supplier that returned " + this.f33665b + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.ldg$c */
    public static class C15063c implements hdg, Serializable {

        /* renamed from: a */
        public final Object f33666a;

        public C15063c(Object obj) {
            this.f33666a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C15063c) {
                return r6c.m46255a(this.f33666a, ((C15063c) obj).f33666a);
            }
            return false;
        }

        @Override // p001o.hdg
        public Object get() {
            return this.f33666a;
        }

        public int hashCode() {
            return r6c.m46256b(this.f33666a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f33666a + ")";
        }
    }

    /* renamed from: a */
    public static hdg m36986a(hdg hdgVar) {
        return ((hdgVar instanceof C15062b) || (hdgVar instanceof C15061a)) ? hdgVar : hdgVar instanceof Serializable ? new C15061a(hdgVar) : new C15062b(hdgVar);
    }

    /* renamed from: b */
    public static hdg m36987b(Object obj) {
        return new C15063c(obj);
    }
}
