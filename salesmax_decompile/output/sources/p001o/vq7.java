package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHeaders;
import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class vq7 implements m48.InterfaceC15219a {
    /* renamed from: f */
    public static final y3i m53211f(wq7 wq7Var, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(wq7Var.m54815h(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final y3i m53212g(wq7 wq7Var, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (wq7Var.m54816i() != null) {
            kpbVar.mo20265E("partNumber", wq7Var.m54816i().toString());
        }
        if (wq7Var.m54819l() != null) {
            kpbVar.mo20265E("response-cache-control", wq7Var.m54819l());
        }
        if (wq7Var.m54820m() != null) {
            kpbVar.mo20265E("response-content-disposition", wq7Var.m54820m());
        }
        if (wq7Var.m54821n() != null) {
            kpbVar.mo20265E("response-content-encoding", wq7Var.m54821n());
        }
        if (wq7Var.m54822o() != null) {
            kpbVar.mo20265E("response-content-language", wq7Var.m54822o());
        }
        if (wq7Var.m54823p() != null) {
            kpbVar.mo20265E("response-content-type", wq7Var.m54823p());
        }
        if (wq7Var.m54824q() != null) {
            kpbVar.mo20265E("response-expires", wq7Var.m54824q().m28951d(vmh.RFC_5322));
        }
        if (wq7Var.m54828u() != null) {
            kpbVar.mo20265E("versionId", wq7Var.m54828u());
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final wq7 wq7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(wq7Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.GET);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (wq7Var.m54815h() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.tq7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return vq7.m53211f(wq7Var, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20280o().mo20265E("x-id", "GetObject");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.uq7
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return vq7.m53212g(wq7Var, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        wq7Var.m54809b();
        String strM54810c = wq7Var.m54810c();
        boolean z7 = true;
        if (strM54810c == null) {
            z = false;
        } else {
            if (strM54810c.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", wq7Var.m54810c());
        }
        String strM54811d = wq7Var.m54811d();
        if (strM54811d == null) {
            z2 = false;
        } else {
            if (strM54811d.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_MATCH, wq7Var.m54811d());
        }
        if (wq7Var.m54812e() != null) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_MODIFIED_SINCE, wq7Var.m54812e().m28951d(vmh.RFC_5322));
        }
        String strM54813f = wq7Var.m54813f();
        if (strM54813f == null) {
            z3 = false;
        } else {
            if (strM54813f.length() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_NONE_MATCH, wq7Var.m54813f());
        }
        if (wq7Var.m54814g() != null) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_UNMODIFIED_SINCE, wq7Var.m54814g().m28951d(vmh.RFC_5322));
        }
        String strM54817j = wq7Var.m54817j();
        if (strM54817j == null) {
            z4 = false;
        } else {
            if (strM54817j.length() > 0) {
                z4 = true;
            }
        }
        if (z4) {
            xx7VarM58668e.m59796c(HttpHeaders.RANGE, wq7Var.m54817j());
        }
        if (wq7Var.m54818k() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, wq7Var.m54818k().mo48558a());
        }
        String strM54825r = wq7Var.m54825r();
        if (strM54825r == null) {
            z5 = false;
        } else {
            if (strM54825r.length() > 0) {
                z5 = true;
            }
        }
        if (z5) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-algorithm", wq7Var.m54825r());
        }
        String strM54826s = wq7Var.m54826s();
        if (strM54826s == null) {
            z6 = false;
        } else {
            if (strM54826s.length() > 0) {
                z6 = true;
            }
        }
        if (z6) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key", wq7Var.m54826s());
        }
        String strM54827t = wq7Var.m54827t();
        if (strM54827t == null) {
            z7 = false;
        } else {
            if (!(strM54827t.length() > 0)) {
            }
        }
        if (z7) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key-MD5", wq7Var.m54827t());
        }
        return z38Var;
    }
}
