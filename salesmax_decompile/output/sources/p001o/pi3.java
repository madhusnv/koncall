package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.Serializable;
import p001o.q74;

/* loaded from: classes6.dex */
public final class pi3 implements q74, Serializable {

    /* renamed from: a */
    public final q74 f40126a;

    /* renamed from: b */
    public final q74.InterfaceC16311b f40127b;

    /* renamed from: o.pi3$a */
    public static final class C16119a implements Serializable {

        /* renamed from: b */
        public static final a f40128b = new a(null);

        /* renamed from: a */
        public final q74[] f40129a;

        /* renamed from: o.pi3$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C16119a(q74[] q74VarArr) {
            sq8.m48649h(q74VarArr, "elements");
            this.f40129a = q74VarArr;
        }

        private final Object readResolve() {
            q74[] q74VarArr = this.f40129a;
            q74 q74VarPlus = e66.f21035a;
            for (q74 q74Var : q74VarArr) {
                q74VarPlus = q74VarPlus.plus(q74Var);
            }
            return q74VarPlus;
        }
    }

    /* renamed from: o.pi3$b */
    public static final class C16120b extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C16120b f40130a = new C16120b();

        public C16120b() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, q74.InterfaceC16311b interfaceC16311b) {
            sq8.m48649h(str, "acc");
            sq8.m48649h(interfaceC16311b, "element");
            if (str.length() == 0) {
                return interfaceC16311b.toString();
            }
            return str + ", " + interfaceC16311b;
        }
    }

    /* renamed from: o.pi3$c */
    public static final class C16121c extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ q74[] f40131a;

        /* renamed from: b */
        public final /* synthetic */ ege f40132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16121c(q74[] q74VarArr, ege egeVar) {
            super(2);
            this.f40131a = q74VarArr;
            this.f40132b = egeVar;
        }

        /* renamed from: a */
        public final void m43722a(y3i y3iVar, q74.InterfaceC16311b interfaceC16311b) {
            sq8.m48649h(y3iVar, "<anonymous parameter 0>");
            sq8.m48649h(interfaceC16311b, "element");
            q74[] q74VarArr = this.f40131a;
            ege egeVar = this.f40132b;
            int i = egeVar.f21602a;
            egeVar.f21602a = i + 1;
            q74VarArr[i] = interfaceC16311b;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m43722a((y3i) obj, (q74.InterfaceC16311b) obj2);
            return y3i.f54824a;
        }
    }

    public pi3(q74 q74Var, q74.InterfaceC16311b interfaceC16311b) {
        sq8.m48649h(q74Var, "left");
        sq8.m48649h(interfaceC16311b, "element");
        this.f40126a = q74Var;
        this.f40127b = interfaceC16311b;
    }

    private final Object writeReplace() {
        int iM43720g = m43720g();
        q74[] q74VarArr = new q74[iM43720g];
        ege egeVar = new ege();
        fold(y3i.f54824a, new C16121c(q74VarArr, egeVar));
        if (egeVar.f21602a == iM43720g) {
            return new C16119a(q74VarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final boolean m43718b(q74.InterfaceC16311b interfaceC16311b) {
        return sq8.m48644c(get(interfaceC16311b.getKey()), interfaceC16311b);
    }

    /* renamed from: e */
    public final boolean m43719e(pi3 pi3Var) {
        while (m43718b(pi3Var.f40127b)) {
            q74 q74Var = pi3Var.f40126a;
            if (!(q74Var instanceof pi3)) {
                sq8.m48647f(q74Var, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m43718b((q74.InterfaceC16311b) q74Var);
            }
            pi3Var = (pi3) q74Var;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pi3) {
                pi3 pi3Var = (pi3) obj;
                if (pi3Var.m43720g() != m43720g() || !pi3Var.m43719e(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        sq8.m48649h(nl7Var, "operation");
        return nl7Var.invoke(this.f40126a.fold(obj, nl7Var), this.f40127b);
    }

    /* renamed from: g */
    public final int m43720g() {
        int i = 2;
        pi3 pi3Var = this;
        while (true) {
            q74 q74Var = pi3Var.f40126a;
            pi3Var = q74Var instanceof pi3 ? (pi3) q74Var : null;
            if (pi3Var == null) {
                return i;
            }
            i++;
        }
    }

    @Override // p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
        pi3 pi3Var = this;
        while (true) {
            q74.InterfaceC16311b interfaceC16311b = pi3Var.f40127b.get(interfaceC16312c);
            if (interfaceC16311b != null) {
                return interfaceC16311b;
            }
            q74 q74Var = pi3Var.f40126a;
            if (!(q74Var instanceof pi3)) {
                return q74Var.get(interfaceC16312c);
            }
            pi3Var = (pi3) q74Var;
        }
    }

    public int hashCode() {
        return this.f40126a.hashCode() + this.f40127b.hashCode();
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
        if (this.f40127b.get(interfaceC16312c) != null) {
            return this.f40126a;
        }
        q74 q74VarMinusKey = this.f40126a.minusKey(interfaceC16312c);
        return q74VarMinusKey == this.f40126a ? this : q74VarMinusKey == e66.f21035a ? this.f40127b : new pi3(q74VarMinusKey, this.f40127b);
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return q74.C16310a.m44918a(this, q74Var);
    }

    public String toString() {
        return '[' + ((String) fold("", C16120b.f40130a)) + ']';
    }
}
