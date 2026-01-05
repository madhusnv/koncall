package qz;

import b00.C0529n;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6389g {

    /* renamed from: a */
    public static final C6386d[] f30818a;

    /* renamed from: b */
    public static final Map f30819b;

    static {
        C6386d c6386d = new C6386d(C6386d.f30799i, "");
        C0529n c0529n = C6386d.f30796f;
        C6386d c6386d2 = new C6386d(c0529n, "GET");
        C6386d c6386d3 = new C6386d(c0529n, "POST");
        C0529n c0529n2 = C6386d.f30797g;
        C6386d c6386d4 = new C6386d(c0529n2, "/");
        C6386d c6386d5 = new C6386d(c0529n2, "/index.html");
        C0529n c0529n3 = C6386d.f30798h;
        C6386d c6386d6 = new C6386d(c0529n3, "http");
        C6386d c6386d7 = new C6386d(c0529n3, "https");
        C0529n c0529n4 = C6386d.f30795e;
        C6386d[] c6386dArr = {c6386d, c6386d2, c6386d3, c6386d4, c6386d5, c6386d6, c6386d7, new C6386d(c0529n4, "200"), new C6386d(c0529n4, "204"), new C6386d(c0529n4, "206"), new C6386d(c0529n4, "304"), new C6386d(c0529n4, "400"), new C6386d(c0529n4, "404"), new C6386d(c0529n4, "500"), new C6386d("accept-charset", ""), new C6386d("accept-encoding", "gzip, deflate"), new C6386d("accept-language", ""), new C6386d("accept-ranges", ""), new C6386d("accept", ""), new C6386d("access-control-allow-origin", ""), new C6386d("age", ""), new C6386d("allow", ""), new C6386d("authorization", ""), new C6386d("cache-control", ""), new C6386d("content-disposition", ""), new C6386d("content-encoding", ""), new C6386d("content-language", ""), new C6386d("content-length", ""), new C6386d("content-location", ""), new C6386d("content-range", ""), new C6386d("content-type", ""), new C6386d("cookie", ""), new C6386d(IMAPStore.ID_DATE, ""), new C6386d(TransferTable.COLUMN_ETAG, ""), new C6386d("expect", ""), new C6386d("expires", ""), new C6386d("from", ""), new C6386d("host", ""), new C6386d("if-match", ""), new C6386d("if-modified-since", ""), new C6386d("if-none-match", ""), new C6386d("if-range", ""), new C6386d("if-unmodified-since", ""), new C6386d("last-modified", ""), new C6386d("link", ""), new C6386d("location", ""), new C6386d("max-forwards", ""), new C6386d("proxy-authenticate", ""), new C6386d("proxy-authorization", ""), new C6386d("range", ""), new C6386d("referer", ""), new C6386d("refresh", ""), new C6386d("retry-after", ""), new C6386d("server", ""), new C6386d("set-cookie", ""), new C6386d("strict-transport-security", ""), new C6386d("transfer-encoding", ""), new C6386d("user-agent", ""), new C6386d("vary", ""), new C6386d("via", ""), new C6386d("www-authenticate", "")};
        f30818a = c6386dArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(c6386dArr[i10].f30800a)) {
                linkedHashMap.put(c6386dArr[i10].f30800a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC4154l.m8922e(mapUnmodifiableMap, "unmodifiableMap(...)");
        f30819b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public static void m12382a(C0529n name) throws IOException {
        AbstractC4154l.m8923f(name, "name");
        int iMo1563d = name.mo1563d();
        for (int i10 = 0; i10 < iMo1563d; i10++) {
            byte bMo1567i = name.mo1567i(i10);
            if (65 <= bMo1567i && bMo1567i < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.m1613r()));
            }
        }
    }
}
