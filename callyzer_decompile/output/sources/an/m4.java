package an;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import og.ue;
import ph.C5950e;
import ww.AbstractC8193c;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m4 {

    /* renamed from: a */
    public final AbstractC8894w f1106a;

    /* renamed from: c */
    public final C5950e f1108c = new C5950e(7);

    /* renamed from: b */
    public final q2 f1107b = new q2(this);

    /* renamed from: d */
    public final r2 f1109d = new r2(this);

    public m4(AbstractC8894w abstractC8894w) {
        this.f1106a = abstractC8894w;
    }

    /* renamed from: a */
    public static Object m491a(m4 m4Var, AbstractC8193c abstractC8193c) {
        return pe.m10839n(abstractC8193c, m4Var.f1106a, true, false, new k4(m4Var, 0));
    }

    /* renamed from: b */
    public final Object m492b(List list, gn.s1 s1Var) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("DELETE FROM CallNoteTemplate  WHERE note_template_id IN (");
        ue.m10986b(list.size(), sbM4568o);
        sbM4568o.append(")");
        String string = sbM4568o.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return pe.m10839n(s1Var, this.f1106a, false, true, new a2(3, string, list));
    }
}
