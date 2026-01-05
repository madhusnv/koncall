package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHeaders;
import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class px7 implements m48.InterfaceC15219a {
    /* renamed from: f */
    public static final y3i m44266f(qx7 qx7Var, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(qx7Var.m45911h(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final y3i m44267g(qx7 qx7Var, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (qx7Var.m45912i() != null) {
            kpbVar.mo20265E("partNumber", qx7Var.m45912i().toString());
        }
        if (qx7Var.m45915l() != null) {
            kpbVar.mo20265E("response-cache-control", qx7Var.m45915l());
        }
        if (qx7Var.m45916m() != null) {
            kpbVar.mo20265E("response-content-disposition", qx7Var.m45916m());
        }
        if (qx7Var.m45917n() != null) {
            kpbVar.mo20265E("response-content-encoding", qx7Var.m45917n());
        }
        if (qx7Var.m45918o() != null) {
            kpbVar.mo20265E("response-content-language", qx7Var.m45918o());
        }
        if (qx7Var.m45919p() != null) {
            kpbVar.mo20265E("response-content-type", qx7Var.m45919p());
        }
        if (qx7Var.m45920q() != null) {
            kpbVar.mo20265E("response-expires", qx7Var.m45920q().m28951d(vmh.RFC_5322));
        }
        if (qx7Var.m45924u() != null) {
            kpbVar.mo20265E("versionId", qx7Var.m45924u());
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final qx7 qx7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(qx7Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.HEAD);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (qx7Var.m45911h() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.nx7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return px7.m44266f(qx7Var, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.ox7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return px7.m44267g(qx7Var, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        qx7Var.m45905b();
        String strM45906c = qx7Var.m45906c();
        boolean z7 = true;
        if (strM45906c == null) {
            z = false;
        } else {
            if (strM45906c.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", qx7Var.m45906c());
        }
        String strM45907d = qx7Var.m45907d();
        if (strM45907d == null) {
            z2 = false;
        } else {
            if (strM45907d.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_MATCH, qx7Var.m45907d());
        }
        if (qx7Var.m45908e() != null) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_MODIFIED_SINCE, qx7Var.m45908e().m28951d(vmh.RFC_5322));
        }
        String strM45909f = qx7Var.m45909f();
        if (strM45909f == null) {
            z3 = false;
        } else {
            if (strM45909f.length() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_NONE_MATCH, qx7Var.m45909f());
        }
        if (qx7Var.m45910g() != null) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_UNMODIFIED_SINCE, qx7Var.m45910g().m28951d(vmh.RFC_5322));
        }
        String strM45913j = qx7Var.m45913j();
        if (strM45913j == null) {
            z4 = false;
        } else {
            if (strM45913j.length() > 0) {
                z4 = true;
            }
        }
        if (z4) {
            xx7VarM58668e.m59796c(HttpHeaders.RANGE, qx7Var.m45913j());
        }
        if (qx7Var.m45914k() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, qx7Var.m45914k().mo48558a());
        }
        String strM45921r = qx7Var.m45921r();
        if (strM45921r == null) {
            z5 = false;
        } else {
            if (strM45921r.length() > 0) {
                z5 = true;
            }
        }
        if (z5) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-algorithm", qx7Var.m45921r());
        }
        String strM45922s = qx7Var.m45922s();
        if (strM45922s == null) {
            z6 = false;
        } else {
            if (strM45922s.length() > 0) {
                z6 = true;
            }
        }
        if (z6) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key", qx7Var.m45922s());
        }
        String strM45923t = qx7Var.m45923t();
        if (strM45923t == null) {
            z7 = false;
        } else {
            if (!(strM45923t.length() > 0)) {
            }
        }
        if (z7) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key-MD5", qx7Var.m45923t());
        }
        return z38Var;
    }
}
