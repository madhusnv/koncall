package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHeaders;
import p001o.l8i;
import p001o.m18;
import p001o.m48;

/* loaded from: classes3.dex */
public final class zl3 implements m48.InterfaceC15219a {
    /* renamed from: f */
    public static final y3i m59582f(am3 am3Var, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(am3Var.m17410h(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final y3i m59583g(am3 am3Var, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (am3Var.m17416n() != null) {
            kpbVar.mo20265E("uploadId", am3Var.m17416n());
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final am3 am3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(am3Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.POST);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (am3Var.m17410h() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.xl3
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return zl3.m59582f(am3Var, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.yl3
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return zl3.m59583g(am3Var, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        String strM17404b = am3Var.m17404b();
        boolean z9 = true;
        if (strM17404b == null) {
            z = false;
        } else {
            if (strM17404b.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-checksum-crc32", am3Var.m17404b());
        }
        String strM17405c = am3Var.m17405c();
        if (strM17405c == null) {
            z2 = false;
        } else {
            if (strM17405c.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            xx7VarM58668e.m59796c("x-amz-checksum-crc32c", am3Var.m17405c());
        }
        String strM17406d = am3Var.m17406d();
        if (strM17406d == null) {
            z3 = false;
        } else {
            if (strM17406d.length() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            xx7VarM58668e.m59796c("x-amz-checksum-sha1", am3Var.m17406d());
        }
        String strM17407e = am3Var.m17407e();
        if (strM17407e == null) {
            z4 = false;
        } else {
            if (strM17407e.length() > 0) {
                z4 = true;
            }
        }
        if (z4) {
            xx7VarM58668e.m59796c("x-amz-checksum-sha256", am3Var.m17407e());
        }
        String strM17408f = am3Var.m17408f();
        if (strM17408f == null) {
            z5 = false;
        } else {
            if (strM17408f.length() > 0) {
                z5 = true;
            }
        }
        if (z5) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", am3Var.m17408f());
        }
        String strM17409g = am3Var.m17409g();
        if (strM17409g == null) {
            z6 = false;
        } else {
            if (strM17409g.length() > 0) {
                z6 = true;
            }
        }
        if (z6) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_NONE_MATCH, am3Var.m17409g());
        }
        if (am3Var.m17412j() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, am3Var.m17412j().mo48558a());
        }
        String strM17413k = am3Var.m17413k();
        if (strM17413k == null) {
            z7 = false;
        } else {
            if (strM17413k.length() > 0) {
                z7 = true;
            }
        }
        if (z7) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-algorithm", am3Var.m17413k());
        }
        String strM17414l = am3Var.m17414l();
        if (strM17414l == null) {
            z8 = false;
        } else {
            if (strM17414l.length() > 0) {
                z8 = true;
            }
        }
        if (z8) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key", am3Var.m17414l());
        }
        String strM17415m = am3Var.m17415m();
        if (strM17415m == null) {
            z9 = false;
        } else {
            if (!(strM17415m.length() > 0)) {
            }
        }
        if (z9) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key-MD5", am3Var.m17415m());
        }
        if (am3Var.m17411i() != null) {
            z38Var.m58672i(m18.Companion.m38178a(nm3.m40782a(am3Var.m17411i())));
        }
        if (!(z38Var.m58667d() instanceof m18.C15196d)) {
            z38Var.m58668e().m59811s("Content-Type", "application/xml");
        }
        return z38Var;
    }
}
