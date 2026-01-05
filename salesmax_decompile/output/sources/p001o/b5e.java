package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes3.dex */
public final class b5e implements hu6 {

    /* renamed from: a */
    public final String f15562a;

    /* renamed from: b */
    public final String f15563b;

    public b5e(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        this.f15562a = str;
        this.f15563b = str2;
    }

    /* renamed from: a */
    public final String m18171a() {
        return this.f15562a;
    }

    /* renamed from: b */
    public final String m18172b() {
        return this.f15563b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5e)) {
            return false;
        }
        b5e b5eVar = (b5e) obj;
        return sq8.m48644c(this.f15562a, b5eVar.f15562a) && sq8.m48644c(this.f15563b, b5eVar.f15563b);
    }

    public int hashCode() {
        return (this.f15562a.hashCode() * 31) + this.f15563b.hashCode();
    }

    public String toString() {
        return "QueryLiteral(key=" + this.f15562a + ", value=" + this.f15563b + ')';
    }
}
