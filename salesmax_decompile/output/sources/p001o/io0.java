package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.List;

/* loaded from: classes2.dex */
public final class io0 {

    /* renamed from: a */
    public final String f29016a;

    /* renamed from: b */
    public final String f29017b;

    /* renamed from: c */
    public final String f29018c;

    /* renamed from: d */
    public final String f29019d;

    /* renamed from: e */
    public final List f29020e;

    public io0(String str, String str2, String str3, String str4, List list) {
        sq8.m48649h(str, "partition");
        sq8.m48649h(str2, "service");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, "accountId");
        sq8.m48649h(list, "resourceId");
        this.f29016a = str;
        this.f29017b = str2;
        this.f29018c = str3;
        this.f29019d = str4;
        this.f29020e = list;
    }

    /* renamed from: a */
    public final String m32504a() {
        return this.f29019d;
    }

    /* renamed from: b */
    public final String m32505b() {
        return this.f29016a;
    }

    /* renamed from: c */
    public final String m32506c() {
        return this.f29018c;
    }

    /* renamed from: d */
    public final List m32507d() {
        return this.f29020e;
    }

    /* renamed from: e */
    public final String m32508e() {
        return this.f29017b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io0)) {
            return false;
        }
        io0 io0Var = (io0) obj;
        return sq8.m48644c(this.f29016a, io0Var.f29016a) && sq8.m48644c(this.f29017b, io0Var.f29017b) && sq8.m48644c(this.f29018c, io0Var.f29018c) && sq8.m48644c(this.f29019d, io0Var.f29019d) && sq8.m48644c(this.f29020e, io0Var.f29020e);
    }

    public int hashCode() {
        return (((((((this.f29016a.hashCode() * 31) + this.f29017b.hashCode()) * 31) + this.f29018c.hashCode()) * 31) + this.f29019d.hashCode()) * 31) + this.f29020e.hashCode();
    }

    public String toString() {
        return "Arn(partition=" + this.f29016a + ", service=" + this.f29017b + ", region=" + this.f29018c + ", accountId=" + this.f29019d + ", resourceId=" + this.f29020e + ')';
    }
}
