package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.Iterator;
import java.util.List;
import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class d6 implements m48.InterfaceC15219a {
    /* renamed from: f */
    public static final y3i m22343f(e6 e6Var, List list) {
        sq8.m48649h(list, "$this$encodedSegments");
        Iterator it = f9g.D0(e6Var.m24355d(), new String[]{"/"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            list.add(e3d.f20909h.m24252i().mo24241a((String) it.next()));
        }
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static final y3i m22344g(e6 e6Var, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (e6Var.m24357f() != null) {
            kpbVar.mo20265E("uploadId", e6Var.m24357f());
        }
        return y3i.f54824a;
    }

    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public z38 mo16700b(jl6 jl6Var, final e6 e6Var) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(e6Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.DELETE);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        if (e6Var.m24355d() == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null".toString());
        }
        c15036aM58671h.m36767h().m48007d(new xk7() { // from class: o.b6
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return d6.m22343f(e6Var, (List) obj);
            }
        });
        c15036aM58671h.m36766g().m20280o().mo20265E("x-id", "AbortMultipartUpload");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.c6
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return d6.m22344g(e6Var, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        String strM24353b = e6Var.m24353b();
        boolean z = false;
        if (strM24353b != null) {
            if (strM24353b.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", e6Var.m24353b());
        }
        if (e6Var.m24354c() != null) {
            xx7VarM58668e.m59796c("x-amz-if-match-initiated-time", e6Var.m24354c().m28951d(vmh.RFC_5322));
        }
        if (e6Var.m24356e() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, e6Var.m24356e().mo48558a());
        }
        return z38Var;
    }
}
