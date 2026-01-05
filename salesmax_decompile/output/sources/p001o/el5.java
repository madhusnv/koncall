package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHeaders;
import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class el5 implements m48.InterfaceC15219a {
    /* renamed from: f */
    public static final y3i m25200f(fl5 fl5Var, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(fl5Var.m26998g(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final y3i m25201g(fl5 fl5Var, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (fl5Var.m27001j() != null) {
            kpbVar.mo20265E("versionId", fl5Var.m27001j());
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final fl5 fl5Var) {
        boolean z;
        boolean z2;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(fl5Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.DELETE);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (fl5Var.m26998g() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.cl5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return el5.m25200f(fl5Var, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20280o().mo20265E("x-id", "DeleteObject");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.dl5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return el5.m25201g(fl5Var, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        if (fl5Var.m26993b() != null) {
            xx7VarM58668e.m59796c("x-amz-bypass-governance-retention", fl5Var.m26993b().toString());
        }
        String strM26994c = fl5Var.m26994c();
        boolean z3 = true;
        if (strM26994c == null) {
            z = false;
        } else {
            if (strM26994c.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", fl5Var.m26994c());
        }
        String strM26995d = fl5Var.m26995d();
        if (strM26995d == null) {
            z2 = false;
        } else {
            if (strM26995d.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_MATCH, fl5Var.m26995d());
        }
        if (fl5Var.m26996e() != null) {
            xx7VarM58668e.m59796c("x-amz-if-match-last-modified-time", fl5Var.m26996e().m28951d(vmh.RFC_5322));
        }
        if (fl5Var.m26997f() != null) {
            xx7VarM58668e.m59796c("x-amz-if-match-size", fl5Var.m26997f().toString());
        }
        String strM26999h = fl5Var.m26999h();
        if (strM26999h == null) {
            z3 = false;
        } else {
            if (!(strM26999h.length() > 0)) {
            }
        }
        if (z3) {
            xx7VarM58668e.m59796c("x-amz-mfa", fl5Var.m26999h());
        }
        if (fl5Var.m27000i() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, fl5Var.m27000i().mo48558a());
        }
        return z38Var;
    }
}
