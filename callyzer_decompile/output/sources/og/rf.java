package og;

import ai.AbstractC0151h;
import au.C0447k;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.CheckBox;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.DropDownBox;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.InputBox;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.LeadFormResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.Options;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.RadioBox;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g1.C2423c;
import h1.InterfaceC2794y;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import or.C5440c;
import or.C5442e;
import or.C5446i;
import or.C5449l;
import or.C5454q;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import s2.AbstractC6740i;
import s2.C6734c;
import sr.AbstractC6910a;
import sr.C6911b;
import sw.C6957a;
import u2.C7320q;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class rf {
    /* renamed from: a */
    public static final void m10880a(h1.s1 s1Var, InterfaceC7879r interfaceC7879r, InterfaceC2794y interfaceC2794y, InterfaceC2139c interfaceC2139c, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2794y interfaceC2794y2;
        InterfaceC2139c interfaceC2139c2;
        h1.s1 s1Var2 = s1Var;
        AbstractC0151h abstractC0151h = s1Var2.f15588a;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(679005231);
        int i11 = (i10 & 6) == 0 ? (c3966o.m8614g(s1Var2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            interfaceC2794y2 = interfaceC2794y;
            i11 |= c3966o.m8616i(interfaceC2794y2) ? 256 : 128;
        } else {
            interfaceC2794y2 = interfaceC2794y;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? 16384 : 8192;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 9363) != 9362)) {
            C2423c c2423c = C2423c.f10935g;
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            Object obj = objM8596M;
            if (objM8596M == s0Var) {
                C7320q c7320q = new C7320q();
                c7320q.add(abstractC0151h.mo345y());
                c3966o.j0(c7320q);
                obj = c7320q;
            }
            C7320q c7320q2 = (C7320q) obj;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                long[] jArr = e1.r0.f9045a;
                objM8596M2 = new e1.j0();
                c3966o.j0(objM8596M2);
            }
            e1.j0 j0Var = (e1.j0) objM8596M2;
            k2.e1 e1Var = s1Var2.f15591d;
            if (AbstractC4154l.m8918a(abstractC0151h.mo345y(), e1Var.getValue())) {
                c3966o.m8607Y(860925177);
                if (c7320q2.size() == 1 && AbstractC4154l.m8918a(c7320q2.get(0), e1Var.getValue())) {
                    c3966o.m8607Y(861249809);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8607Y(861059531);
                    boolean z6 = (i12 & 14) == 4;
                    Object objM8596M3 = c3966o.m8596M();
                    if (z6 || objM8596M3 == s0Var) {
                        objM8596M3 = new g1.c0(s1Var2, 0);
                        c3966o.j0(objM8596M3);
                    }
                    AbstractC6663m.m12755S(c7320q2, (InterfaceC2139c) objM8596M3);
                    j0Var.m5568a();
                    c3966o.m8623p(false);
                }
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(861255761);
                c3966o.m8623p(false);
            }
            if (j0Var.m5569b(e1Var.getValue())) {
                c3966o.m8607Y(862059281);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(861316428);
                ListIterator listIterator = c7320q2.listIterator();
                int i13 = 0;
                while (true) {
                    C6957a c6957a = (C6957a) listIterator;
                    if (!c6957a.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (AbstractC4154l.m8918a(c6957a.next(), e1Var.getValue())) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 == -1) {
                    c7320q2.add(e1Var.getValue());
                } else {
                    c7320q2.set(i13, e1Var.getValue());
                }
                j0Var.m5568a();
                int size = c7320q2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj2 = c7320q2.get(i14);
                    j0Var.m5579l(obj2, AbstractC6740i.m12902d(-1426421288, new C0447k(s1Var2, interfaceC2794y2, obj2, c6734c, 1), c3966o));
                    i14++;
                    s1Var2 = s1Var;
                    interfaceC2794y2 = interfaceC2794y;
                }
                c3966o.m8623p(false);
            }
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i15 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c3966o.m8607Y(-187474512);
            int size2 = c7320q2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Object obj3 = c7320q2.get(i16);
                c3966o.m8605W(-1081865889, obj3);
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) j0Var.m5574g(obj3);
                if (interfaceC2141e == null) {
                    c3966o.m8607Y(821932266);
                } else {
                    c3966o.m8607Y(-1081864713);
                    interfaceC2141e.invoke(c3966o, 0);
                }
                c3966o.m8623p(false);
                c3966o.m8623p(false);
            }
            c3966o.m8623p(false);
            c3966o.m8623p(true);
            interfaceC2139c2 = c2423c;
        } else {
            c3966o.m8601S();
            interfaceC2139c2 = interfaceC2139c;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g1.e0(s1Var, interfaceC7879r, interfaceC2794y, interfaceC2139c2, c6734c, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10881b(java.lang.Object r14, w2.InterfaceC7879r r15, h1.InterfaceC2794y r16, java.lang.String r17, s2.C6734c r18, k2.InterfaceC3962k r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.rf.m10881b(java.lang.Object, w2.r, h1.y, java.lang.String, s2.c, k2.k, int, int):void");
    }

    /* renamed from: c */
    public static final List m10882c(LeadFormResponse leadFormResponse) {
        AbstractC4154l.m8923f(leadFormResponse, "<this>");
        ArrayList arrayList = new ArrayList();
        for (InputBox inputBox : leadFormResponse.m4971a().m4963c()) {
            int i10 = AbstractC6910a.f33395a[inputBox.m4965a().m4945b().ordinal()];
            if (i10 == 1) {
                arrayList.add(new C5449l(null, null, null, null, null, true, "", "", false, inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), false, 16447));
            } else if (i10 != 2) {
                arrayList.add(new C5446i((Integer) null, (Integer) null, (String) null, (Double) null, (Double) null, true, "", "", false, inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), "", false, 16447));
            } else {
                String strM4969e = inputBox.m4969e();
                String strM4968d = inputBox.m4968d();
                String strM4944a = inputBox.m4965a().m4944a();
                if (strM4944a == null) {
                    strM4944a = "dd-MM-yyyy";
                }
                arrayList.add(new C5442e(strM4944a, "", null, strM4969e, strM4968d, inputBox.m4966b(), "", false, 1030));
            }
        }
        for (CheckBox checkBox : leadFormResponse.m4971a().m4961a()) {
            List<Options> listM4952i = checkBox.m4938a().m4952i();
            ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(listM4952i, 10));
            for (Options options : listM4952i) {
                arrayList2.add(new C5454q(options.m4973a(), options.m4974b(), false));
            }
            arrayList.add(new C5440c(true, "", arrayList2, false, checkBox.m4942e(), checkBox.m4941d(), checkBox.m4939b(), "", false));
        }
        for (RadioBox radioBox : leadFormResponse.m4971a().m4964d()) {
            List<Options> listM4952i2 = radioBox.m4976a().m4952i();
            ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(listM4952i2, 10));
            for (Options options2 : listM4952i2) {
                arrayList3.add(new C5454q(options2.m4973a(), options2.m4974b(), false));
            }
            arrayList.add(new C5440c(true, "", arrayList3, false, radioBox.m4980e(), radioBox.m4979d(), radioBox.m4977b(), "", false));
        }
        for (DropDownBox dropDownBox : leadFormResponse.m4971a().m4962b()) {
            List<Options> listM4952i3 = dropDownBox.m4955a().m4952i();
            ArrayList arrayList4 = new ArrayList(AbstractC6664n.m12768r(listM4952i3, 10));
            for (Options options3 : listM4952i3) {
                arrayList4.add(new C5454q(options3.m4973a(), options3.m4974b(), false));
            }
            arrayList.add(new C5440c(true, "", arrayList4, false, dropDownBox.m4959e(), dropDownBox.m4958d(), dropDownBox.m4956b(), "", false));
        }
        return AbstractC6663m.m12760X(arrayList, new C6911b(0));
    }
}
