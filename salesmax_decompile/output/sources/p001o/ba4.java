package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHeaders;
import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class ba4 implements m48.InterfaceC15219a {
    /* renamed from: e */
    public static final y3i m18504e(ca4 ca4Var, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(ca4Var.m20567p(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015a  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final ca4 ca4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(ca4Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.POST);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (ca4Var.m20567p() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.aa4
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return ba4.m18504e(ca4Var, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20280o().mo20265E("uploads", "");
        xx7 xx7VarM58668e = z38Var.m58668e();
        if (ca4Var.m20552a() != null) {
            xx7VarM58668e.m59796c("x-amz-acl", ca4Var.m20552a().mo29837b());
        }
        if (ca4Var.m20554c() != null) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-bucket-key-enabled", ca4Var.m20554c().toString());
        }
        String strM20555d = ca4Var.m20555d();
        boolean z17 = true;
        if (strM20555d == null) {
            z = false;
        } else if (strM20555d.length() > 0) {
            z = true;
        }
        if (z) {
            xx7VarM58668e.m59796c("Cache-Control", ca4Var.m20555d());
        }
        if (ca4Var.m20556e() != null) {
            xx7VarM58668e.m59796c("x-amz-checksum-algorithm", ca4Var.m20556e().mo49556a());
        }
        String strM20557f = ca4Var.m20557f();
        if (strM20557f == null) {
            z2 = false;
        } else if (strM20557f.length() > 0) {
            z2 = true;
        }
        if (z2) {
            xx7VarM58668e.m59796c(ObjectMetadata.CONTENT_DISPOSITION, ca4Var.m20557f());
        }
        String strM20558g = ca4Var.m20558g();
        if (strM20558g == null) {
            z3 = false;
        } else if (strM20558g.length() > 0) {
            z3 = true;
        }
        if (z3) {
            xx7VarM58668e.m59796c("Content-Encoding", ca4Var.m20558g());
        }
        String strM20559h = ca4Var.m20559h();
        if (strM20559h == null) {
            z4 = false;
        } else if (strM20559h.length() > 0) {
            z4 = true;
        }
        if (z4) {
            xx7VarM58668e.m59796c(HttpHeaders.CONTENT_LANGUAGE, ca4Var.m20559h());
        }
        String strM20560i = ca4Var.m20560i();
        if (strM20560i == null) {
            z5 = false;
        } else if (strM20560i.length() > 0) {
            z5 = true;
        }
        if (z5) {
            xx7VarM58668e.m59796c("Content-Type", ca4Var.m20560i());
        }
        String strM20561j = ca4Var.m20561j();
        if (strM20561j == null) {
            z6 = false;
        } else if (strM20561j.length() > 0) {
            z6 = true;
        }
        if (z6) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", ca4Var.m20561j());
        }
        if (ca4Var.m20562k() != null) {
            xx7VarM58668e.m59796c(HttpHeaders.EXPIRES, ca4Var.m20562k().m28951d(vmh.RFC_5322));
        }
        String strM20563l = ca4Var.m20563l();
        if (strM20563l == null) {
            z7 = false;
        } else if (strM20563l.length() > 0) {
            z7 = true;
        }
        if (z7) {
            xx7VarM58668e.m59796c("x-amz-grant-full-control", ca4Var.m20563l());
        }
        String strM20564m = ca4Var.m20564m();
        if (strM20564m == null) {
            z8 = false;
        } else if (strM20564m.length() > 0) {
            z8 = true;
        }
        if (z8) {
            xx7VarM58668e.m59796c("x-amz-grant-read", ca4Var.m20564m());
        }
        String strM20565n = ca4Var.m20565n();
        if (strM20565n == null) {
            z9 = false;
        } else if (strM20565n.length() > 0) {
            z9 = true;
        }
        if (z9) {
            xx7VarM58668e.m59796c("x-amz-grant-read-acp", ca4Var.m20565n());
        }
        String strM20566o = ca4Var.m20566o();
        if (strM20566o == null) {
            z10 = false;
        } else if (strM20566o.length() > 0) {
            z10 = true;
        }
        if (z10) {
            xx7VarM58668e.m59796c("x-amz-grant-write-acp", ca4Var.m20566o());
        }
        if (ca4Var.m20569r() != null) {
            xx7VarM58668e.m59796c("x-amz-object-lock-legal-hold", ca4Var.m20569r().mo38411a());
        }
        if (ca4Var.m20570s() != null) {
            xx7VarM58668e.m59796c("x-amz-object-lock-mode", ca4Var.m20570s().mo40144a());
        }
        if (ca4Var.m20571t() != null) {
            xx7VarM58668e.m59796c("x-amz-object-lock-retain-until-date", ca4Var.m20571t().m28951d(vmh.ISO_8601));
        }
        if (ca4Var.m20572u() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, ca4Var.m20572u().mo48558a());
        }
        String strM20574w = ca4Var.m20574w();
        if (strM20574w == null) {
            z11 = false;
        } else if (strM20574w.length() > 0) {
            z11 = true;
        }
        if (z11) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-algorithm", ca4Var.m20574w());
        }
        String strM20575x = ca4Var.m20575x();
        if (strM20575x == null) {
            z12 = false;
        } else if (strM20575x.length() > 0) {
            z12 = true;
        }
        if (z12) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key", ca4Var.m20575x());
        }
        String strM20576y = ca4Var.m20576y();
        if (strM20576y == null) {
            z13 = false;
        } else if (strM20576y.length() > 0) {
            z13 = true;
        }
        if (z13) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key-MD5", ca4Var.m20576y());
        }
        String strM20577z = ca4Var.m20577z();
        if (strM20577z == null) {
            z14 = false;
        } else if (strM20577z.length() > 0) {
            z14 = true;
        }
        if (z14) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-context", ca4Var.m20577z());
        }
        String strM20548A = ca4Var.m20548A();
        if (strM20548A == null) {
            z15 = false;
        } else if (strM20548A.length() > 0) {
            z15 = true;
        }
        if (z15) {
            xx7VarM58668e.m59796c(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID, ca4Var.m20548A());
        }
        if (ca4Var.m20573v() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.SERVER_SIDE_ENCRYPTION, ca4Var.m20573v().mo23074a());
        }
        if (ca4Var.m20549B() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.STORAGE_CLASS, ca4Var.m20549B().mo29844a());
        }
        String strM20550C = ca4Var.m20550C();
        if (strM20550C == null) {
            z16 = false;
        } else if (strM20550C.length() > 0) {
            z16 = true;
        }
        if (z16) {
            xx7VarM58668e.m59796c(ObjectMetadata.S3_TAGGING, ca4Var.m20550C());
        }
        String strM20551D = ca4Var.m20551D();
        if (strM20551D == null) {
            z17 = false;
        } else if (!(strM20551D.length() > 0)) {
        }
        if (z17) {
            xx7VarM58668e.m59796c(ObjectMetadata.REDIRECT_LOCATION, ca4Var.m20551D());
        }
        Map mapM20568q = ca4Var.m20568q();
        if (mapM20568q != null) {
            for (Map.Entry entry : mapM20568q.entrySet()) {
                String str = (String) entry.getKey();
                xx7VarM58668e.m59796c("x-amz-meta-" + str, (String) entry.getValue());
            }
        }
        return z38Var;
    }
}
