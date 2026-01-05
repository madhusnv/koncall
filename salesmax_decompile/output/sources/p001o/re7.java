package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes3.dex */
public final class re7 implements hu6 {

    /* renamed from: c */
    public static final C16594a f43439c = new C16594a(null);

    /* renamed from: d */
    public static final re7 f43440d = new re7(TransferTable.COLUMN_KEY, "value");

    /* renamed from: a */
    public final String f43441a;

    /* renamed from: b */
    public final String f43442b;

    /* renamed from: o.re7$a */
    public static final class C16594a {
        public C16594a() {
        }

        public /* synthetic */ C16594a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final re7 m46579a() {
            return re7.f43440d;
        }
    }

    public re7(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        this.f43441a = str;
        this.f43442b = str2;
    }

    /* renamed from: b */
    public final String m46577b() {
        return this.f43441a;
    }

    /* renamed from: c */
    public final String m46578c() {
        return this.f43442b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re7)) {
            return false;
        }
        re7 re7Var = (re7) obj;
        return sq8.m48644c(this.f43441a, re7Var.f43441a) && sq8.m48644c(this.f43442b, re7Var.f43442b);
    }

    public int hashCode() {
        return (this.f43441a.hashCode() * 31) + this.f43442b.hashCode();
    }

    public String toString() {
        return "FormUrlMapName(key=" + this.f43441a + ", value=" + this.f43442b + ')';
    }
}
