package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes3.dex */
public final class eej implements hu6 {

    /* renamed from: d */
    public static final C13170a f21507d = new C13170a(null);

    /* renamed from: e */
    public static final eej f21508e = new eej("entry", TransferTable.COLUMN_KEY, "value");

    /* renamed from: a */
    public final String f21509a;

    /* renamed from: b */
    public final String f21510b;

    /* renamed from: c */
    public final String f21511c;

    /* renamed from: o.eej$a */
    public static final class C13170a {
        public C13170a() {
        }

        public /* synthetic */ C13170a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final eej m24887a() {
            return eej.f21508e;
        }
    }

    public eej(String str, String str2, String str3) {
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        sq8.m48649h(str3, "value");
        this.f21509a = str;
        this.f21510b = str2;
        this.f21511c = str3;
    }

    /* renamed from: b */
    public final String m24884b() {
        return this.f21509a;
    }

    /* renamed from: c */
    public final String m24885c() {
        return this.f21510b;
    }

    /* renamed from: d */
    public final String m24886d() {
        return this.f21511c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eej)) {
            return false;
        }
        eej eejVar = (eej) obj;
        return sq8.m48644c(this.f21509a, eejVar.f21509a) && sq8.m48644c(this.f21510b, eejVar.f21510b) && sq8.m48644c(this.f21511c, eejVar.f21511c);
    }

    public int hashCode() {
        String str = this.f21509a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f21510b.hashCode()) * 31) + this.f21511c.hashCode();
    }

    public String toString() {
        return "XmlMapName(entry=" + this.f21509a + ", key=" + this.f21510b + ", value=" + this.f21511c + ')';
    }
}
