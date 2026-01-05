package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import p001o.l8i;
import p001o.m18;
import p001o.m48;

/* loaded from: classes3.dex */
public final class b7i implements m48.InterfaceC15219a {
    /* renamed from: f */
    public static final y3i m18260f(c7i c7iVar, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(c7iVar.m20387k(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final y3i m18261g(c7i c7iVar, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (c7iVar.m20388l() != null) {
            kpbVar.mo20265E("partNumber", c7iVar.m20388l().toString());
        }
        if (c7iVar.m20393q() != null) {
            kpbVar.mo20265E("uploadId", c7iVar.m20393q());
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final c7i c7iVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(c7iVar, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.PUT);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (c7iVar.m20387k() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.z6i
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return b7i.m18260f(c7iVar, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20280o().mo20265E("x-id", "UploadPart");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.a7i
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return b7i.m18261g(c7iVar, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        if (c7iVar.m20379c() != null) {
            xx7VarM58668e.m59796c("x-amz-sdk-checksum-algorithm", c7iVar.m20379c().mo49556a());
        }
        String strM20380d = c7iVar.m20380d();
        boolean z9 = true;
        if (strM20380d == null) {
            z = false;
        } else {
            if (strM20380d.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-checksum-crc32", c7iVar.m20380d());
        }
        String strM20381e = c7iVar.m20381e();
        if (strM20381e == null) {
            z2 = false;
        } else {
            if (strM20381e.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            xx7VarM58668e.m59796c("x-amz-checksum-crc32c", c7iVar.m20381e());
        }
        String strM20382f = c7iVar.m20382f();
        if (strM20382f == null) {
            z3 = false;
        } else {
            if (strM20382f.length() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            xx7VarM58668e.m59796c("x-amz-checksum-sha1", c7iVar.m20382f());
        }
        String strM20383g = c7iVar.m20383g();
        if (strM20383g == null) {
            z4 = false;
        } else {
            if (strM20383g.length() > 0) {
                z4 = true;
            }
        }
        if (z4) {
            xx7VarM58668e.m59796c("x-amz-checksum-sha256", c7iVar.m20383g());
        }
        if (c7iVar.m20384h() != null) {
            xx7VarM58668e.m59796c("Content-Length", c7iVar.m20384h().toString());
        }
        String strM20385i = c7iVar.m20385i();
        if (strM20385i == null) {
            z5 = false;
        } else {
            if (strM20385i.length() > 0) {
                z5 = true;
            }
        }
        if (z5) {
            xx7VarM58668e.m59796c("Content-MD5", c7iVar.m20385i());
        }
        String strM20386j = c7iVar.m20386j();
        if (strM20386j == null) {
            z6 = false;
        } else {
            if (strM20386j.length() > 0) {
                z6 = true;
            }
        }
        if (z6) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", c7iVar.m20386j());
        }
        if (c7iVar.m20389m() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, c7iVar.m20389m().mo48558a());
        }
        String strM20390n = c7iVar.m20390n();
        if (strM20390n == null) {
            z7 = false;
        } else {
            if (strM20390n.length() > 0) {
                z7 = true;
            }
        }
        if (z7) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-algorithm", c7iVar.m20390n());
        }
        String strM20391o = c7iVar.m20391o();
        if (strM20391o == null) {
            z8 = false;
        } else {
            if (strM20391o.length() > 0) {
                z8 = true;
            }
        }
        if (z8) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key", c7iVar.m20391o());
        }
        String strM20392p = c7iVar.m20392p();
        if (strM20392p == null) {
            z9 = false;
        } else {
            if (!(strM20392p.length() > 0)) {
            }
        }
        if (z9) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-customer-key-MD5", c7iVar.m20392p());
        }
        if (c7iVar.m20377a() != null) {
            z38Var.m58672i(n18.m39983d(c7iVar.m20377a()));
        }
        if (!(z38Var.m58667d() instanceof m18.C15196d)) {
            z38Var.m58668e().m59811s("Content-Type", "application/octet-stream");
        }
        return z38Var;
    }
}
