package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class dfa implements m48.InterfaceC15219a {
    /* renamed from: e */
    public static final y3i m22986e(efa efaVar, kpb kpbVar) {
        sq8.m48649h(kpbVar, "$this$decodedParameters");
        if (efaVar.m24927b() != null) {
            kpbVar.mo20265E("continuation-token", efaVar.m24927b());
        }
        if (efaVar.m24928c() != null) {
            kpbVar.mo20265E("delimiter", efaVar.m24928c());
        }
        if (efaVar.m24929d() != null) {
            kpbVar.mo20265E("encoding-type", efaVar.m24929d().mo44924a());
        }
        if (efaVar.m24931f() != null) {
            kpbVar.mo20265E("fetch-owner", efaVar.m24931f().toString());
        }
        if (efaVar.m24932g() != null) {
            kpbVar.mo20265E("max-keys", efaVar.m24932g().toString());
        }
        if (efaVar.m24934i() != null) {
            kpbVar.mo20265E("prefix", efaVar.m24934i());
        }
        if (efaVar.m24936k() != null) {
            kpbVar.mo20265E("start-after", efaVar.m24936k());
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, final efa efaVar) {
        boolean z;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(efaVar, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.GET);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        c15036aM58671h.m36767h().m48017n(true);
        c15036aM58671h.m36766g().m20280o().mo20265E("list-type", "2");
        c15036aM58671h.m36766g().m20276k(e3d.f20909h.m24252i(), new xk7() { // from class: o.cfa
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return dfa.m22986e(efaVar, (kpb) obj);
            }
        });
        xx7 xx7VarM58668e = z38Var.m58668e();
        String strM24930e = efaVar.m24930e();
        if (strM24930e == null) {
            z = false;
        } else {
            if (strM24930e.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-expected-bucket-owner", efaVar.m24930e());
        }
        List listM24933h = efaVar.m24933h();
        if (listM24933h != null && (listM24933h.isEmpty() ^ true)) {
            List listM24933h2 = efaVar.m24933h();
            ArrayList arrayList = new ArrayList(dh3.m23088v(listM24933h2, 10));
            Iterator it = listM24933h2.iterator();
            if (it.hasNext()) {
                tq.m50332a(it.next());
                throw null;
            }
            xx7VarM58668e.m59797d("x-amz-optional-object-attributes", arrayList);
        }
        if (efaVar.m24935j() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.REQUESTER_PAYS_HEADER, efaVar.m24935j().mo48558a());
        }
        return z38Var;
    }
}
