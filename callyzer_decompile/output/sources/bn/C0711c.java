package bn;

import an.a1;
import an.q2;
import an.w1;
import com.sun.mail.util.AbstractC1452a;
import e1.C1899a;
import e1.C1900b;
import e1.C1903e;
import gn.s0;
import gn.u1;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import og.qe;
import og.se;
import og.ue;
import qm.C6245a;
import qm.C6247c;
import qm.C6249e;
import yv.C8800o;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bn.c */
/* loaded from: classes3.dex */
public final class C0711c {

    /* renamed from: a */
    public final AbstractC8894w f4517a;

    /* renamed from: b */
    public final q2 f4518b = new q2(7);

    public C0711c(AbstractC8894w abstractC8894w) {
        this.f4517a = abstractC8894w;
    }

    /* renamed from: a */
    public final void m1992a(InterfaceC4024a interfaceC4024a, C1903e c1903e) {
        C1900b c1900b = (C1900b) c1903e.keySet();
        C1903e c1903e2 = c1900b.f8930a;
        if (c1903e2.isEmpty()) {
            return;
        }
        if (c1903e.f9065c > 999) {
            qe.m10860f(c1903e, new C0710b(this, interfaceC4024a, 0));
            return;
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT `id`,`name`,`message_template_document_url`,`message_template_id` FROM `Message_template_documents` WHERE `message_template_id` IN (");
        ue.m10986b(c1903e2.f9065c, sbM4568o);
        sbM4568o.append(")");
        String string = sbM4568o.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        InterfaceC4026c stmt = interfaceC4024a.y0(string);
        Iterator it = c1900b.iterator();
        int i10 = 1;
        while (true) {
            C1899a c1899a = (C1899a) it;
            if (!c1899a.hasNext()) {
                try {
                    break;
                } finally {
                    stmt.close();
                }
            } else {
                stmt.mo1776B(i10, (String) c1899a.next());
                i10++;
            }
        }
        AbstractC4154l.m8923f(stmt, "stmt");
        int iM10914b = se.m10914b(stmt, "message_template_id");
        if (iM10914b == -1) {
            return;
        }
        while (stmt.r0()) {
            List list = (List) c1903e.get(stmt.mo1777W(iM10914b));
            if (list != null) {
                list.add(new C6247c(stmt.mo1777W(1), (int) stmt.getLong(0), stmt.mo1777W(2), stmt.mo1777W(3)));
            }
        }
    }

    /* renamed from: b */
    public final void m1993b(InterfaceC4024a interfaceC4024a, C1903e c1903e) {
        C1900b c1900b = (C1900b) c1903e.keySet();
        C1903e c1903e2 = c1900b.f8930a;
        if (c1903e2.isEmpty()) {
            return;
        }
        if (c1903e.f9065c > 999) {
            qe.m10860f(c1903e, new C0710b(this, interfaceC4024a, 1));
            return;
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT `id`,`message_template_id`,`tag_id` FROM `Message_templateId_tag_Id` WHERE `message_template_id` IN (");
        ue.m10986b(c1903e2.f9065c, sbM4568o);
        sbM4568o.append(")");
        String string = sbM4568o.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        InterfaceC4026c stmt = interfaceC4024a.y0(string);
        Iterator it = c1900b.iterator();
        int i10 = 1;
        while (true) {
            C1899a c1899a = (C1899a) it;
            if (!c1899a.hasNext()) {
                try {
                    break;
                } finally {
                    stmt.close();
                }
            } else {
                stmt.mo1776B(i10, (String) c1899a.next());
                i10++;
            }
        }
        AbstractC4154l.m8923f(stmt, "stmt");
        int iM10914b = se.m10914b(stmt, "message_template_id");
        if (iM10914b == -1) {
            return;
        }
        while (stmt.r0()) {
            List list = (List) c1903e.get(stmt.mo1777W(iM10914b));
            if (list != null) {
                list.add(new C6249e((int) stmt.getLong(0), stmt.mo1777W(1), stmt.mo1777W(2)));
            }
        }
    }

    /* renamed from: c */
    public final void m1994c(InterfaceC4024a interfaceC4024a, C1903e c1903e) {
        C1900b c1900b = (C1900b) c1903e.keySet();
        C1903e c1903e2 = c1900b.f8930a;
        if (c1903e2.isEmpty()) {
            return;
        }
        if (c1903e.f9065c > 999) {
            qe.m10860f(c1903e, new C0710b(this, interfaceC4024a, 2));
            return;
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT `id`,`title`,`description`,`instruction`,`message_sub_template_id`,`message_template_id`,`create_date_time` FROM `message_sub_template` WHERE `message_template_id` IN (");
        ue.m10986b(c1903e2.f9065c, sbM4568o);
        sbM4568o.append(")");
        String string = sbM4568o.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        InterfaceC4026c stmt = interfaceC4024a.y0(string);
        Iterator it = c1900b.iterator();
        int i10 = 1;
        while (true) {
            C1899a c1899a = (C1899a) it;
            if (!c1899a.hasNext()) {
                try {
                    break;
                } catch (Throwable th2) {
                    stmt.close();
                    throw th2;
                }
            }
            stmt.mo1776B(i10, (String) c1899a.next());
            i10++;
        }
        AbstractC4154l.m8923f(stmt, "stmt");
        int iM10914b = se.m10914b(stmt, "message_template_id");
        if (iM10914b == -1) {
            stmt.close();
            return;
        }
        while (stmt.r0()) {
            List list = (List) c1903e.get(stmt.mo1777W(iM10914b));
            if (list != null) {
                int i11 = (int) stmt.getLong(0);
                String strMo1777W = stmt.mo1777W(1);
                String strMo1777W2 = stmt.mo1777W(2);
                LocalDateTime localDateTimeM16183G = null;
                String strMo1777W3 = stmt.isNull(3) ? null : stmt.mo1777W(3);
                String strMo1777W4 = stmt.mo1777W(4);
                String strMo1777W5 = stmt.mo1777W(5);
                String strMo1777W6 = stmt.isNull(6) ? null : stmt.mo1777W(6);
                if (strMo1777W6 != null) {
                    C8800o c8800o = C8800o.f42459a;
                    localDateTimeM16183G = C8800o.m16183G(strMo1777W6);
                }
                LocalDateTime localDateTime = localDateTimeM16183G;
                if (localDateTime == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                }
                list.add(new C6245a(i11, strMo1777W, strMo1777W2, strMo1777W3, strMo1777W4, strMo1777W5, localDateTime));
            }
        }
        stmt.close();
    }

    /* renamed from: d */
    public final Object m1995d(List list, s0 s0Var) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("\n    SELECT DISTINCT mt.*\n    FROM message_template AS mt\n    INNER JOIN Message_templateId_tag_Id AS mtt\n    ON mt.message_template_id = mtt.message_template_id\n    WHERE mtt.tag_id IN (");
        ue.m10986b(list.size(), sbM4568o);
        sbM4568o.append(")  ");
        sbM4568o.append("\n");
        sbM4568o.append("    ORDER BY COALESCE( modify_date_time,create_date_time )DESC");
        return pe.m10839n(s0Var, this.f4517a, true, false, new w1(4, m0.m7381n(sbM4568o, "\n", "toString(...)"), list, this));
    }

    /* renamed from: e */
    public final Object m1996e(List list, String str, u1 u1Var) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("\n    SELECT DISTINCT mt.*\n    FROM message_template AS mt\n    INNER JOIN Message_templateId_tag_Id AS mtt\n    ON mt.message_template_id = mtt.message_template_id\n    WHERE mtt.tag_id IN (");
        return pe.m10839n(u1Var, this.f4517a, true, false, new a1(p020v.a1.m14336p(sbM4568o, "?", " || '%'", "\n", "toString(...)"), list, p020v.a1.m14323c(list, sbM4568o, ")", "\n", "    AND mt.title LIKE '%' || "), str, this, 2));
    }
}
