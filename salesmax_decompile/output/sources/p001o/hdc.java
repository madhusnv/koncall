package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes2.dex */
public final class hdc {

    /* renamed from: a */
    public final String f26684a;

    public hdc(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f26684a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdc) && sq8.m48644c(this.f26684a, ((hdc) obj).f26684a);
    }

    public int hashCode() {
        return this.f26684a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f26684a + ')';
    }
}
