package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHeaders;
import p001o.l8i;
import p001o.m18;
import p001o.m48;

/* loaded from: classes3.dex */
public final class r3e implements m48.InterfaceC15219a {
    /* renamed from: e */
    public static final y3i m46196e(s3e s3eVar, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(s3eVar.m47612x(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final s3e s3eVar) {
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
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(s3eVar, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.PUT);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (s3eVar.m47612x() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.q3e
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return r3e.m46196e(s3eVar, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20280o().mo20265E("x-id", "PutObject");
        xx7 xx7VarM58668e = z38Var.m58668e();
        if (s3eVar.m47589a() != null) {
            xx7VarM58668e.m59796c("x-amz-acl", s3eVar.m47589a().mo29837b());
        }
        if (s3eVar.m47592d() != null) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-bucket-key-enabled", s3eVar.m47592d().toString());
        }
        String strM47593e = s3eVar.m47593e();
        boolean z23 = true;
        if (strM47593e == null) {
            z = false;
        } else if (strM47593e.length() > 0) {
            z = true;
        }
        if (z) {
            xx7VarM58668e.m59796c("Cache-Control", s3eVar.m47593e());
        }
        if (s3eVar.m47594f() != null) {
            xx7VarM58668e.m59796c("x-amz-sdk-checksum-algorithm", s3eVar.m47594f().mo49556a());
        }
        String strM47595g = s3eVar.m47595g();
        if (strM47595g == null) {
            z2 = false;
        } else if (strM47595g.length() > 0) {
            z2 = true;
        }
        if (z2) {
            xx7VarM58668e.m59796c("x-amz-checksum-crc32", s3eVar.m47595g());
        }
        String strM47596h = s3eVar.m47596h();
        if (strM47596h == null) {
            z3 = false;
        } else if (strM47596h.length() > 0) {
            z3 = true;
        }
        if (z3) {
            xx7VarM58668e.m59796c("x-amz-checksum-crc32c", s3eVar.m47596h());
        }
        String strM47597i = s3eVar.m47597i();
        if (strM47597i == null) {
            z4 = false;
        } else if (strM47597i.length() > 0) {
            z4 = true;
        }
        if (z4) {
            xx7VarM58668e.m59796c("x-amz-checksum-sha1", s3eVar.m47597i());
        }
        String strM47598j = s3eVar.m47598j();
        if (strM47598j == null) {
            z5 = false;
        } else if (strM47598j.length() > 0) {
            z5 = true;
        }
        if (z5) {
            xx7VarM58668e.m59796c("x-amz-checksum-sha256", s3eVar.m47598j());
        }
        String strM47599k = s3eVar.m47599k();
        if (strM47599k == null) {
            z6 = false;
        } else if (strM47599k.length() > 0) {
            z6 = true;
        }
        if (z6) {
            xx7VarM58668e.m59796c(ObjectMetadata.CONTENT_DISPOSITION, s3eVar.m47599k());
        }
        String strM47600l = s3eVar.m47600l();
        if (strM47600l == null) {
            z7 = false;
        } else if (strM47600l.length() > 0) {
            z7 = true;
        }
        if (z7) {
            xx7VarM58668e.m59796c("Content-Encoding", s3eVar.m47600l());
        }
        String strM47601m = s3eVar.m47601m();
        if (strM47601m == null) {
            z8 = false;
        } else if (strM47601m.length() > 0) {
            z8 = true;
        }
        if (z8) {
            xx7VarM58668e.m59796c(HttpHeaders.CONTENT_LANGUAGE, s3eVar.m47601m());
        }
        if (s3eVar.m47602n() != null) {
            xx7VarM58668e.m59796c("Content-Length", s3eVar.m47602n().toString());
        }
        String strM47603o = s3eVar.m47603o();
        if (strM47603o == null) {
            z9 = false;
        } else if (strM47603o.length() > 0) {
            z9 = true;
        }
        if (z9) {
            xx7VarM58668e.m59796c("Content-MD5", s3eVar.m47603o());
        }
        String strM47604p = s3eVar.m47604p();
        if (strM47604p == null) {
            z10 = false;
        } else if (strM47604p.length() > 0) {
            z10 = true;
        }
        if (z10) {
            xx7VarM58668e.m59796c("Content-Type", s3eVar.m47604p());
        }
        String strM47605q = s3eVar.m47605q();
        if (strM47605q == null) {
            z11 = false;
        } else if (strM47605q.length() > 0) {
            z11 = true;
        }
        if (z11) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", s3eVar.m47605q());
        }
        if (s3eVar.m47606r() != null) {
            xx7VarM58668e.m59796c(HttpHeaders.EXPIRES, s3eVar.m47606r().m28951d(vmh.RFC_5322));
        }
        String strM47607s = s3eVar.m47607s();
        if (strM47607s == null) {
            z12 = false;
        } else if (strM47607s.length() > 0) {
            z12 = true;
        }
        if (z12) {
            xx7VarM58668e.m59796c("x-amz-grant-full-control", s3eVar.m47607s());
        }
        String strM47608t = s3eVar.m47608t();
        if (strM47608t == null) {
            z13 = false;
        } else if (strM47608t.length() > 0) {
            z13 = true;
        }
        if (z13) {
            xx7VarM58668e.m59796c("x-amz-grant-read", s3eVar.m47608t());
        }
        String strM47609u = s3eVar.m47609u();
        if (strM47609u == null) {
            z14 = false;
        } else if (strM47609u.length() > 0) {
            z14 = true;
        }
        if (z14) {
            xx7VarM58668e.m59796c("x-amz-grant-read-acp", s3eVar.m47609u());
        }
        String strM47610v = s3eVar.m47610v();
        if (strM47610v == null) {
            z15 = false;
        } else if (strM47610v.length() > 0) {
            z15 = true;
        }
        if (z15) {
            xx7VarM58668e.m59796c("x-amz-grant-write-acp", s3eVar.m47610v());
        }
        String strM47611w = s3eVar.m47611w();
        if (strM47611w == null) {
            z16 = false;
        } else if (strM47611w.length() > 0) {
            z16 = true;
        }
        if (z16) {
            xx7VarM58668e.m59796c(HttpHeaders.IF_NONE_MATCH, s3eVar.m47611w());
        }
        if (s3eVar.m47614z() != null) {
            xx7VarM58668e.m59796c("x-amz-object-lock-legal-hold", s3eVar.m47614z().mo38411a());
        }
        if (s3eVar.m47576A() != null) {
            xx7VarM58668e.m59796c("x-amz-object-lock-mode", s3eVar.m47576A().mo40144a());
        }
        if (s3eVar.m47577B() != null) {
            xx7VarM58668e.m59796c("x-amz-object-lock-retain-until-date", s3eVar.m47577B().m28951d(vmh.ISO_8601));
        }
        if (s3eVar.m47578C() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, s3eVar.m47578C().mo48558a());
        }
        String strM47580E = s3eVar.m47580E();
        if (strM47580E == null) {
            z17 = false;
        } else if (strM47580E.length() > 0) {
            z17 = true;
        }
        if (z17) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-algorithm", s3eVar.m47580E());
        }
        String strM47581F = s3eVar.m47581F();
        if (strM47581F == null) {
            z18 = false;
        } else if (strM47581F.length() > 0) {
            z18 = true;
        }
        if (z18) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key", s3eVar.m47581F());
        }
        String strM47582G = s3eVar.m47582G();
        if (strM47582G == null) {
            z19 = false;
        } else if (strM47582G.length() > 0) {
            z19 = true;
        }
        if (z19) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key-MD5", s3eVar.m47582G());
        }
        String strM47583H = s3eVar.m47583H();
        if (strM47583H == null) {
            z20 = false;
        } else if (strM47583H.length() > 0) {
            z20 = true;
        }
        if (z20) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-context", s3eVar.m47583H());
        }
        String strM47584I = s3eVar.m47584I();
        if (strM47584I == null) {
            z21 = false;
        } else if (strM47584I.length() > 0) {
            z21 = true;
        }
        if (z21) {
            xx7VarM58668e.m59796c(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID, s3eVar.m47584I());
        }
        if (s3eVar.m47579D() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.SERVER_SIDE_ENCRYPTION, s3eVar.m47579D().mo23074a());
        }
        if (s3eVar.m47585J() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.STORAGE_CLASS, s3eVar.m47585J().mo29844a());
        }
        String strM47586K = s3eVar.m47586K();
        if (strM47586K == null) {
            z22 = false;
        } else if (strM47586K.length() > 0) {
            z22 = true;
        }
        if (z22) {
            xx7VarM58668e.m59796c(ObjectMetadata.S3_TAGGING, s3eVar.m47586K());
        }
        String strM47587L = s3eVar.m47587L();
        if (strM47587L == null) {
            z23 = false;
        } else if (!(strM47587L.length() > 0)) {
        }
        if (z23) {
            xx7VarM58668e.m59796c(ObjectMetadata.REDIRECT_LOCATION, s3eVar.m47587L());
        }
        if (s3eVar.m47588M() != null) {
            xx7VarM58668e.m59796c("x-amz-write-offset-bytes", s3eVar.m47588M().toString());
        }
        Map mapM47613y = s3eVar.m47613y();
        if (mapM47613y != null) {
            for (Map.Entry entry : mapM47613y.entrySet()) {
                String str = (String) entry.getKey();
                xx7VarM58668e.m59796c("x-amz-meta-" + str, (String) entry.getValue());
            }
        }
        if (s3eVar.m47590b() != null) {
            z38Var.m58672i(n18.m39983d(s3eVar.m47590b()));
        }
        if (!(z38Var.m58667d() instanceof m18.C15196d)) {
            z38Var.m58668e().m59811s("Content-Type", "application/octet-stream");
        }
        return z38Var;
    }
}
