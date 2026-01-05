package p001o;

import java.util.List;
import java.util.Map;
import p001o.klb;

/* loaded from: classes3.dex */
public final class jqb implements klb {

    /* renamed from: a */
    public final xx7 f30957a;

    /* renamed from: b */
    public final xx7 f30958b;

    /* renamed from: c */
    public final xx7 f30959c;

    public jqb(Map map, Map map2, Map map3) {
        sq8.m48649h(map, "override");
        sq8.m48649h(map2, "append");
        sq8.m48649h(map3, "setMissing");
        this.f30957a = new xx7();
        this.f30958b = new xx7();
        this.f30959c = new xx7();
        for (Map.Entry entry : map.entrySet()) {
            m34282e((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            m34280c((String) entry2.getKey(), (String) entry2.getValue());
        }
        for (Map.Entry entry3 : map3.entrySet()) {
            m34283f((String) entry3.getKey(), (String) entry3.getValue());
        }
    }

    @Override // p001o.klb
    /* renamed from: a */
    public void mo21637a(j7f j7fVar) {
        klb.C14858a.m35837a(this, j7fVar);
    }

    /* renamed from: c */
    public final void m34280c(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        this.f30958b.m59796c(str, str2);
    }

    @Override // p001o.jlb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo21638b(zdc zdcVar, n64 n64Var) {
        for (Map.Entry entry : this.f30958b.m59803k()) {
            ((z38) zdcVar.m59255d()).m58668e().m59797d((String) entry.getKey(), (List) entry.getValue());
        }
        for (Map.Entry entry2 : this.f30957a.m59803k()) {
            ((z38) zdcVar.m59255d()).m58668e().m59810r((String) entry2.getKey(), kh3.r0((List) entry2.getValue()));
        }
        for (Map.Entry entry3 : this.f30959c.m59803k()) {
            String str = (String) entry3.getKey();
            List list = (List) entry3.getValue();
            if (!((z38) zdcVar.m59255d()).m58668e().m59801i(str)) {
                ((z38) zdcVar.m59255d()).m58668e().m59810r(str, kh3.r0(list));
            }
        }
        return zdcVar;
    }

    /* renamed from: e */
    public final void m34282e(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        this.f30957a.m59810r(str, str2);
    }

    /* renamed from: f */
    public final void m34283f(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        this.f30959c.m59796c(str, str2);
    }

    public /* synthetic */ jqb(Map map, Map map2, Map map3, int i, id5 id5Var) {
        this((i & 1) != 0 ? isa.m32681h() : map, (i & 2) != 0 ? isa.m32681h() : map2, (i & 4) != 0 ? isa.m32681h() : map3);
    }
}
