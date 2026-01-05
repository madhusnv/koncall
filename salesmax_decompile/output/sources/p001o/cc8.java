package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes3.dex */
public final class cc8 implements hu6 {

    /* renamed from: a */
    public final String f17828a;

    public cc8(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f17828a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc8) && sq8.m48644c(this.f17828a, ((cc8) obj).f17828a);
    }

    public int hashCode() {
        return this.f17828a.hashCode();
    }

    public String toString() {
        return "IgnoreKey(key=" + this.f17828a + ')';
    }
}
