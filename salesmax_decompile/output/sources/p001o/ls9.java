package p001o;

import ai.salesmax.model.LeadFilter;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ls9 extends e07 {

    /* renamed from: g */
    public static Map f34338g;

    /* renamed from: f */
    public LeadFilter f34339f = new LeadFilter();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f34338g = linkedHashMap;
        linkedHashMap.put("Banker", "BANKER");
        f34338g.put("Client", "ContactType");
        f34338g.put("Employee", "EMPLOYEE");
        f34338g.put("Referrer", "REFERRER");
        f34338g.put("Vendor", "VENDOR");
        f34338g.put("Other", "OTHER");
    }

    @Override // p001o.e07
    /* renamed from: f */
    public boolean mo24031f() {
        return super.mo24031f() && this.f34339f.isEmpty();
    }

    /* renamed from: i */
    public LeadFilter m37859i() {
        return this.f34339f;
    }

    /* renamed from: j */
    public void m37860j(LeadFilter leadFilter) {
        this.f34339f = leadFilter;
    }
}
