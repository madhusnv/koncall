package bn;

import an.a2;
import an.q2;
import com.sun.mail.util.AbstractC1452a;
import gn.C2670m;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import og.ue;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bn.g */
/* loaded from: classes3.dex */
public final class C0715g {

    /* renamed from: a */
    public final AbstractC8894w f4525a;

    /* renamed from: b */
    public final q2 f4526b = new q2(11);

    public C0715g(AbstractC8894w abstractC8894w) {
        this.f4525a = abstractC8894w;
    }

    /* renamed from: a */
    public final Object m1997a(List list, C2670m c2670m) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("DELETE FROM message_template_tag WHERE tag_name IN (");
        ue.m10986b(list.size(), sbM4568o);
        sbM4568o.append(")");
        String string = sbM4568o.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return pe.m10839n(c2670m, this.f4525a, false, true, new a2(4, string, list));
    }
}
