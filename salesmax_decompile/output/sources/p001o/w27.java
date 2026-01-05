package p001o;

import java.util.List;
import p001o.m18;

/* loaded from: classes3.dex */
public abstract class w27 {

    /* renamed from: a */
    public static final List f51311a = ch3.m21249n("x-amz-checksum-crc32c", "x-amz-checksum-crc32", "x-amz-checksum-sha1", "x-amz-checksum-sha256");

    /* renamed from: c */
    public static final List m53810c() {
        return f51311a;
    }

    /* renamed from: d */
    public static final m18 m53811d(m18 m18Var, String str) {
        if (m18Var instanceof m18.AbstractC15197e) {
            h8f from = ((m18.AbstractC15197e) m18Var).readFrom();
            sq8.m48647f(from, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.io.HashingSource");
            return n18.m39985f(new x83(str, (ix7) from), m18Var.getContentLength());
        }
        if (!(m18Var instanceof m18.AbstractC15194b)) {
            throw new xa3("HttpBody type is not supported");
        }
        y6f from2 = ((m18.AbstractC15194b) m18Var).readFrom();
        sq8.m48647f(from2, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.io.HashingByteReadChannel");
        return n18.m39984e(new w83(str, (gx7) from2), m18Var.getContentLength());
    }

    /* renamed from: e */
    public static final void m53812e(String str, String str2) {
        if (sq8.m48644c(str, str2)) {
            return;
        }
        throw new u83("Checksum mismatch. Expected " + str + " but was " + str2);
    }
}
