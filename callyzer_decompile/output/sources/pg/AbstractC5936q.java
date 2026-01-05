package pg;

import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.DynamicFieldResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import com.websoptimization.callyzerbiz.data.model.response.lead.LeadResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js.C3845a;
import js.C3846b;
import js.C3850f;
import js.C3851g;
import kk.C4088h;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import nx.AbstractC5178p;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.q */
/* loaded from: classes.dex */
public abstract class AbstractC5936q {

    /* renamed from: a */
    public static final /* synthetic */ int f29029a = 0;

    /* renamed from: a */
    public static final ArrayList m11827a(Map jsonMap) {
        AbstractC4154l.m8923f(jsonMap, "jsonMap");
        ArrayList arrayList = new ArrayList();
        for (String str : jsonMap.keySet()) {
            DynamicFieldResponse dynamicFieldResponse = (DynamicFieldResponse) jsonMap.get(str);
            Object objM4860b = dynamicFieldResponse != null ? dynamicFieldResponse.m4860b() : null;
            if (objM4860b instanceof String) {
                if (!AbstractC5178p.m10101L((CharSequence) objM4860b)) {
                    DynamicFieldResponse dynamicFieldResponse2 = (DynamicFieldResponse) jsonMap.get(str);
                    arrayList.add(new C3845a(dynamicFieldResponse2 != null ? dynamicFieldResponse2.m4859a() : null, (String) objM4860b));
                }
            } else if (objM4860b instanceof List) {
                C4088h c4088h = new C4088h();
                ArrayList arrayList2 = new ArrayList();
                if (!((Collection) objM4860b).isEmpty()) {
                    Iterator it = ((Iterable) objM4860b).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((DynamicFieldResponse) c4088h.m8855b(DynamicFieldResponse.class, c4088h.m8861h(it.next()))).m4859a());
                    }
                    DynamicFieldResponse dynamicFieldResponse3 = (DynamicFieldResponse) jsonMap.get(str);
                    arrayList.add(new C3845a(dynamicFieldResponse3 != null ? dynamicFieldResponse3.m4859a() : null, AbstractC6663m.m12748L(arrayList2, ",", null, null, null, 62)));
                }
            } else {
                DynamicFieldResponse dynamicFieldResponse4 = (DynamicFieldResponse) new C4088h().m8855b(DynamicFieldResponse.class, new C4088h().m8861h(objM4860b));
                if (!AbstractC5178p.m10101L(dynamicFieldResponse4.m4859a())) {
                    DynamicFieldResponse dynamicFieldResponse5 = (DynamicFieldResponse) jsonMap.get(str);
                    arrayList.add(new C3845a(dynamicFieldResponse5 != null ? dynamicFieldResponse5.m4859a() : null, dynamicFieldResponse4.m4859a()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C3851g m11828b(LeadResponse leadResponse, List connectedLeadSIM) {
        String strM16188L;
        String str = "<this>";
        AbstractC4154l.m8923f(leadResponse, "<this>");
        AbstractC4154l.m8923f(connectedLeadSIM, "connectedLeadSIM");
        List<Leads> listM4912a = leadResponse.m4912a();
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM4912a, 10));
        for (Leads leads : listM4912a) {
            AbstractC4154l.m8923f(leads, str);
            String strM4919f = leads.m4919f();
            String strM4918e = leads.m4918e();
            String strM4921h = leads.m4921h();
            if (strM4921h == null) {
                strM4921h = "";
            }
            String string = AbstractC5178p.g0(strM4918e + " " + strM4921h).toString();
            String strM4925l = leads.m4925l();
            int iM4916c = leads.m4916c();
            String strM4929p = leads.m4929p();
            Integer numM4928o = leads.m4928o();
            String strM4930q = leads.m4930q();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : connectedLeadSIM) {
                String str2 = str;
                if (AbstractC6663m.m12767z(leads.m4931r(), ((C4802m) obj).f23891c)) {
                    arrayList2.add(obj);
                }
                str = str2;
            }
            String str3 = str;
            ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((C4802m) obj2).f23893e));
            }
            List listM4931r = leads.m4931r();
            String strM4932s = leads.m4932s();
            LocalDateTime localDateTimeM4927n = leads.m4927n();
            String strM4910h = null;
            if (localDateTimeM4927n != null) {
                C8800o c8800o = C8800o.f42459a;
                strM16188L = C8800o.m16188L(localDateTimeM4927n);
            } else {
                strM16188L = null;
            }
            int iM4924k = leads.m4924k();
            LocalDateTime localDateTimeM4917d = leads.m4917d();
            LocalDateTime localDateTimeM4923j = leads.m4923j();
            List listM4922i = leads.m4922i();
            LastCallDetails lastCallDetailsM4920g = leads.m4920g();
            C3846b c3846b = lastCallDetailsM4920g != null ? new C3846b(lastCallDetailsM4920g) : null;
            ArrayList arrayListM11827a = m11827a(leads.m4926m());
            LastCallDetails lastCallDetailsM4920g2 = leads.m4920g();
            if (lastCallDetailsM4920g2 != null) {
                strM4910h = lastCallDetailsM4920g2.m4910h();
            }
            arrayList.add(new C3850f(strM4919f, string, strM4925l, iM4916c, strM4929p, numM4928o, strM4930q, arrayList3, listM4931r, strM4932s, strM16188L, iM4924k, localDateTimeM4917d, localDateTimeM4923j, listM4922i, c3846b, arrayListM11827a, strM4910h, leads.m4915b()));
            str = str3;
        }
        return new C3851g(leadResponse.m4913b(), arrayList);
    }
}
