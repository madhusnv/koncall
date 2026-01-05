package com.amplifyframework.storage.s3;

import ai.AbstractC0151h;
import android.content.Intent;
import com.websoptimization.callyzerbiz.data.model.response.ExcludeNumber;
import com.websoptimization.callyzerbiz.domain.model.Announce;
import cs.C1488g;
import d7.EnumC1644p;
import d7.InterfaceC1649u;
import ds.AbstractC1777a;
import eb.i3;
import er.AbstractC2101a;
import es.C2127d;
import ex.InterfaceC2141e;
import fs.C2370a;
import gp.C2703n;
import gs.C2721g;
import gs.C2724j;
import gs.C2728n;
import gt.C2729a;
import hp.AbstractC2994a;
import hq.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.C3733i;
import jp.C3831l;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kp.AbstractC4169a;
import kq.C4181k;
import lu.AbstractC4527m;
import mm.C4798i;
import mp.AbstractC4832a;
import mq.C4848p;
import mq.h0;
import n7.C4970o;
import nq.AbstractC5133e;
import nx.AbstractC5178p;
import og.ac;
import og.je;
import og.kf;
import op.AbstractC5432a;
import or.C5454q;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5937r;
import pu.C6040h;
import qp.C6268e;
import qp.C6269f;
import qp.C6270g;
import rp.AbstractC6598a;
import rr.C6610j;
import rw.AbstractC6663m;
import rw.C6668r;
import rw.C6670t;
import sq.b1;
import sq.g2;
import ss.C6914c;
import ss.z0;
import tc.C7117b;
import w2.InterfaceC7879r;
import wx.m1;
import zp.C9005e;
import zp.C9012l;
import zp.C9017q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1230b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f5910a;

    /* renamed from: b */
    public final /* synthetic */ Object f5911b;

    public /* synthetic */ C1230b(int i10, Object obj) {
        this.f5910a = i10;
        this.f5911b = obj;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        switch (this.f5910a) {
            case 0:
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5465e((C2127d) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 2:
                C2728n c2728n = (C2728n) this.f5911b;
                EnumC1644p event = (EnumC1644p) obj2;
                AbstractC4154l.m8923f((InterfaceC1649u) obj, "<unused var>");
                AbstractC4154l.m8923f(event, "event");
                if (event == EnumC1644p.ON_STOP) {
                    c2728n.m6727e(C1488g.f7568a);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5471k((C2724j) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 4:
                AbstractC0151h abstractC0151h = (AbstractC0151h) this.f5911b;
                String name = (String) obj;
                List values = (List) obj2;
                AbstractC4154l.m8923f(name, "name");
                AbstractC4154l.m8923f(values, "values");
                abstractC0151h.m338r(name, values);
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC2101a.m5809c((C4798i) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 6:
                C2703n c2703n = (C2703n) this.f5911b;
                int iIntValue = ((Integer) obj).intValue();
                String number = (String) obj2;
                AbstractC4154l.m8923f(number, "number");
                c2703n.m6711l(new C3831l(iIntValue, number));
                break;
            case 7:
                ((Integer) obj2).getClass();
                kf.m10737b((ArrayList) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 8:
                m1 m1Var = ((C2721g) this.f5911b).f15184l;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (((Integer) obj2).intValue() == 0) {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C2370a.m6057a((C2370a) value2, false, C6668r.f31943a, null, 0, false, false, 893)));
                }
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C2370a.m6057a((C2370a) value, zBooleanValue, null, null, 0, false, false, 1022)));
            case 9:
                ((Integer) obj2).getClass();
                AbstractC2994a.m7248a((C9005e) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 10:
                h0 h0Var = (h0) this.f5911b;
                String msg = (String) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC4154l.m8923f(msg, "msg");
                h0Var.m9801m(new C4848p(msg, zBooleanValue2));
                break;
            case 11:
                ((Integer) obj2).getClass();
                a0.m7263i((C4181k) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 12:
                C2729a c2729a = (C2729a) this.f5911b;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC5937r.m11839c(AbstractC5178p.g0(c2729a.f15239k).toString().length() + "/5000", c2729a.f15240l, c2729a.f15241m, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 13:
                C7117b c7117b = (C7117b) this.f5911b;
                String key = (String) obj;
                List values2 = (List) obj2;
                AbstractC4154l.m8923f(key, "key");
                AbstractC4154l.m8923f(values2, "values");
                C3733i c3733i = c7117b.f34312c;
                c3733i.getClass();
                List list = (List) ((Map) c3733i.f482a).get(key);
                Set setG0 = list != null ? AbstractC6663m.g0(list) : C6670t.f31945a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : values2) {
                    if (!setG0.contains(obj3)) {
                        arrayList.add(obj3);
                    }
                }
                c3733i.m338r(key, arrayList);
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC4169a.m8930a((C6268e) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C5454q c5454q = (C5454q) this.f5911b;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b1.m13113q(c5454q.f27491a, null, 0L, null, null, 0, 0, 0L, null, null, c3966o2, 0, 1022);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC4527m.m9370a((InterfaceC7879r) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(7));
                break;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC4527m.m9375f((C6040h) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC4832a.m9785a((C6269f) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                og.m1.m10757a((C4970o) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC5133e.m10054b((Intent) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 21:
                char[] cArr = (char[]) this.f5911b;
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                AbstractC4154l.m8923f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iM10100K = AbstractC5178p.m10100K(DelimitedRangesSequence, cArr, iIntValue4, false);
                if (iM10100K >= 0) {
                    break;
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC5432a.m11140e((C6270g) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 23:
                i3 i3Var = (i3) this.f5911b;
                String key2 = (String) obj;
                List values3 = (List) obj2;
                AbstractC4154l.m8923f(key2, "key");
                AbstractC4154l.m8923f(values3, "values");
                Iterator it = values3.iterator();
                while (it.hasNext()) {
                    i3Var.m5726d(key2, (String) it.next());
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                ac.m10525a((ExcludeNumber) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 25:
                z0 z0Var = (z0) this.f5911b;
                EnumC1644p event2 = (EnumC1644p) obj2;
                AbstractC4154l.m8923f((InterfaceC1649u) obj, "<unused var>");
                AbstractC4154l.m8923f(event2, "event");
                if (event2 == EnumC1644p.ON_RESUME) {
                    z0Var.m13196s(C6914c.f33414a);
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC6598a.m12656c((C9012l) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                je.m10718b((C9017q) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 28:
                C6610j c6610j = (C6610j) this.f5911b;
                String name2 = (String) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                AbstractC4154l.m8923f(name2, "name");
                c6610j.m12667a(name2, zBooleanValue3);
                break;
            default:
                ((Integer) obj2).getClass();
                g2.m13152d((Announce) this.f5911b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C1230b(Object obj, int i10, int i11) {
        this.f5910a = i11;
        this.f5911b = obj;
    }
}
