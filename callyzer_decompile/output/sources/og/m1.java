package og;

import aq.C0403f;
import aq.C0405h;
import com.amplifyframework.storage.s3.C1230b;
import d7.C1651w;
import d7.EnumC1645q;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kr.C4207v;
import l7.AbstractC4422v;
import l7.C4409i;
import n7.C4968m;
import n7.C4969n;
import n7.C4970o;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import s2.AbstractC6740i;
import sw.C6957a;
import t2.C7006e;
import u2.C7320q;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a */
    public static final /* synthetic */ int f26633a = 0;

    /* renamed from: a */
    public static final void m10757a(C4970o c4970o, InterfaceC3962k interfaceC3962k, int i10) {
        C7320q c7320q;
        C4970o c4970o2 = c4970o;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(294589392);
        if ((((c3966o.m8616i(c4970o2) ? 4 : 2) | i10) & 3) == 2 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C7006e c7006eM10702a = ig.m10702a(c3966o);
            k2.w0 w0VarM8509l = C3953b.m8509l(c4970o2.m9225b().f22080e, c3966o);
            List list = (List) w0VarM8509l.getValue();
            boolean zBooleanValue = ((Boolean) c3966o.m8618k(w3.v1.f38043a)).booleanValue();
            boolean zM8614g = c3966o.m8614g(list);
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            Object obj2 = objM8596M;
            if (zM8614g || objM8596M == obj) {
                C7320q c7320q2 = new C7320q();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (zBooleanValue ? true : ((C4409i) obj3).f22052h.f29901j.f8148c.isAtLeast(EnumC1645q.STARTED)) {
                        arrayList.add(obj3);
                    }
                }
                c7320q2.addAll(arrayList);
                c3966o.j0(c7320q2);
                obj2 = c7320q2;
            }
            C7320q c7320q3 = (C7320q) obj2;
            m10758b(c7320q3, (List) w0VarM8509l.getValue(), c3966o, 0);
            k2.w0 w0VarM8509l2 = C3953b.m8509l(c4970o2.m9225b().f22081f, c3966o);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj) {
                objM8596M2 = new C7320q();
                c3966o.j0(objM8596M2);
            }
            C7320q c7320q4 = (C7320q) objM8596M2;
            c3966o.m8607Y(-367418626);
            ListIterator listIterator = c7320q3.listIterator();
            while (true) {
                C6957a c6957a = (C6957a) listIterator;
                if (!c6957a.hasNext()) {
                    break;
                }
                C4409i c4409i = (C4409i) c6957a.next();
                AbstractC4422v abstractC4422v = c4409i.f22046b;
                AbstractC4154l.m8921d(abstractC4422v, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                C4969n c4969n = (C4969n) abstractC4422v;
                boolean zM8616i = c3966o.m8616i(c4970o2) | c3966o.m8616i(c4409i);
                Object objM8596M3 = c3966o.m8596M();
                if (zM8616i || objM8596M3 == obj) {
                    objM8596M3 = new bt.i0(25, c4970o2, c4409i);
                    c3966o.j0(objM8596M3);
                }
                pg.r6.m11845a((InterfaceC2137a) objM8596M3, c4969n.f24665g, AbstractC6740i.m12902d(1129586364, new C4968m(c4409i, c4970o2, c7006eM10702a, c7320q4, c4969n), c3966o), c3966o, KyberEngine.KyberPolyBytes, 0);
                c4970o2 = c4970o2;
                c7006eM10702a = c7006eM10702a;
                c7320q4 = c7320q4;
            }
            C4970o c4970o3 = c4970o2;
            C7320q c7320q5 = c7320q4;
            c3966o.m8623p(false);
            Set set = (Set) w0VarM8509l2.getValue();
            boolean zM8614g2 = c3966o.m8614g(w0VarM8509l2) | c3966o.m8616i(c4970o3);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g2 || objM8596M4 == obj) {
                c4970o2 = c4970o3;
                c7320q = c7320q5;
                Object c0405h = new C0405h(w0VarM8509l2, c4970o2, c7320q, (InterfaceC7559c) null, 12);
                c3966o.j0(c0405h);
                objM8596M4 = c0405h;
            } else {
                c4970o2 = c4970o3;
                c7320q = c7320q5;
            }
            C3953b.m8504g(set, c7320q, (InterfaceC2141e) objM8596M4, c3966o);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1230b(c4970o2, i10, 19);
        }
    }

    /* renamed from: b */
    public static final void m10758b(List list, Collection collection, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1537894851);
        if ((((c3966o.m8616i(list) ? 4 : 2) | i10 | (c3966o.m8616i(collection) ? 32 : 16)) & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            boolean zBooleanValue = ((Boolean) c3966o.m8618k(w3.v1.f38043a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C4409i c4409i = (C4409i) it.next();
                C1651w c1651w = c4409i.f22052h.f29901j;
                boolean zM8615h = c3966o.m8615h(zBooleanValue) | c3966o.m8616i(list) | c3966o.m8616i(c4409i);
                Object objM8596M = c3966o.m8596M();
                if (zM8615h || objM8596M == C3961j.f20408a) {
                    objM8596M = new C4207v(1, c4409i, list, zBooleanValue);
                    c3966o.j0(objM8596M);
                }
                C3953b.m8500c(c1651w, (InterfaceC2139c) objM8596M, c3966o);
            }
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0403f(list, collection, i10, 24);
        }
    }
}
