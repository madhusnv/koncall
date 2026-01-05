package p001o;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.fhh;

/* loaded from: classes6.dex */
public final class ne3 extends fhh {

    /* renamed from: b */
    public static final List f36742b = Collections.singletonList("X-Cloud-Trace-Context");

    /* renamed from: c */
    public static final cth f36743c = cth.m21796a().m21801b(true).m21800a();

    /* renamed from: d */
    public static final cth f36744d = cth.f18634b;

    /* renamed from: e */
    public static final int f36745e = 3;

    /* renamed from: f */
    public static final kth f36746f = kth.m36230b().m36234b();

    /* renamed from: b */
    public static long m40412b(tzf tzfVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(tzfVar.m50812d());
        return byteBufferAllocate.getLong(0);
    }

    @Override // p001o.fhh
    /* renamed from: a */
    public void mo26709a(szf szfVar, Object obj, fhh.AbstractC13435c abstractC13435c) {
        dgd.m23063p(szfVar, "spanContext");
        dgd.m23063p(abstractC13435c, "setter");
        dgd.m23063p(obj, "carrier");
        StringBuilder sb = new StringBuilder();
        sb.append(szfVar.m49107b().m19787d());
        sb.append('/');
        sb.append(d5i.m22337d(m40412b(szfVar.m49106a())));
        sb.append(";o=");
        sb.append(szfVar.m49108c().m21799d() ? "1" : "0");
        abstractC13435c.put(obj, "X-Cloud-Trace-Context", sb.toString());
    }
}
