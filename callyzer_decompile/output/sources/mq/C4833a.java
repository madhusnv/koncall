package mq;

import a2.AbstractC0030c;
import android.content.Context;
import android.os.Bundle;
import aq.C0410m;
import b0.C0512d;
import c0.C0829v;
import c6.C0885o;
import c9.C0917l;
import c9.CallableC0924s;
import ec.InterfaceC2017o;
import el.C2066a;
import ex.InterfaceC2139c;
import im.p1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import l8.InterfaceC4427a;
import lq.C4507b;
import mb.C4685a;
import mb.C4703s;
import mb.n3;
import nc.AbstractC4995f;
import nt.C5138b;
import nx.C5173k;
import o9.C5326a;
import og.q1;
import oj.C5396h;
import org.bouncycastle.iana.AEADAlgorithm;
import p7.C5836g;
import q1.C6080h;
import qv.C6334i;
import r1.C6431p;
import rw.AbstractC6651a;
import rw.AbstractC6655e;
import s2.C6734c;
import s4.InterfaceC6747c;
import s6.C6763b;
import s6.C6765d;
import sq.C6908y;
import sq.i2;
import tb.AbstractC7103n;
import tb.C7096g;
import tv.C7230d;
import tv.C7231e;
import tx.f1;
import vu.C7788a;
import wm.C8114j;
import wx.m1;
import z7.AbstractC8894w;
import z7.C8873b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4833a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f24129a;

    /* renamed from: b */
    public final /* synthetic */ Object f24130b;

    public /* synthetic */ C4833a(int i10, Object obj) {
        this.f24129a = i10;
        this.f24130b = obj;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f24129a) {
            case 0:
                h0 h0Var = (h0) this.f24130b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m1 m1Var = h0Var.f24285z;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C4507b.m9340a((C4507b) value, zBooleanValue, null, null, false, false, 0, null, null, null, 2046)));
                return qw.a0.f30746a;
            case 1:
                l7.a0 a0VarM10845b = q1.m10845b((Context) this.f24130b);
                a0VarM10845b.m9189i((Bundle) obj);
                return a0VarM10845b;
            case 2:
                f1 f1Var = (f1) this.f24130b;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    f1Var.mo13566p(tx.c0.m13478a(th2.getMessage(), th2));
                }
                return qw.a0.f30746a;
            case 3:
                ((tx.o0) this.f24130b).dispose();
                return qw.a0.f30746a;
            case 4:
                ((AbstractC4995f) this.f24130b).mo9904h();
                return qw.a0.f30746a;
            case 5:
                return ((C5173k) this.f24130b).m10081h(((Integer) obj).intValue());
            case 6:
                C5396h c5396h = (C5396h) this.f24130b;
                C6763b c6763b = (C6763b) obj;
                C6765d c6765d = C5396h.f27083c;
                long j6 = 0;
                for (Map.Entry entry : c6763b.m12964a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        C6765d c6765d2 = (C6765d) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strM11115b = c5396h.m11115b(System.currentTimeMillis());
                        if (set.contains(strM11115b)) {
                            Object[] objArr = {strM11115b};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException(AbstractC0030c.m118i(obj2, "duplicate element: "));
                            }
                            c6763b.m12968e(c6765d2, Collections.unmodifiableSet(hashSet));
                            j6++;
                        } else {
                            c6763b.m12967d(c6765d2);
                        }
                    }
                }
                if (j6 == 0) {
                    c6763b.m12967d(c6765d);
                    return null;
                }
                c6763b.m12968e(c6765d, Long.valueOf(j6));
                return null;
            case 7:
                C5836g c5836g = (C5836g) this.f24130b;
                C4409i entry2 = (C4409i) obj;
                AbstractC4154l.m8923f(entry2, "entry");
                return new C0885o(2, c5836g, entry2);
            case 8:
                C5326a c5326a = (C5326a) this.f24130b;
                InterfaceC2017o decodedParameters = (InterfaceC2017o) obj;
                AbstractC4154l.m8923f(decodedParameters, "$this$decodedParameters");
                String str = c5326a.f26215b;
                if (str != null) {
                    decodedParameters.mo266g(str, "account_id");
                }
                String str2 = c5326a.f26216c;
                if (str2 != null) {
                    decodedParameters.mo266g(str2, "role_name");
                }
                return qw.a0.f30746a;
            case 9:
                C4685a c4685a = (C4685a) this.f24130b;
                InterfaceC2017o decodedParameters2 = (InterfaceC2017o) obj;
                AbstractC4154l.m8923f(decodedParameters2, "$this$decodedParameters");
                String str3 = c4685a.f23159c;
                if (str3 != null) {
                    decodedParameters2.mo266g(str3, "uploadId");
                }
                return qw.a0.f30746a;
            case 10:
                C4703s c4703s = (C4703s) this.f24130b;
                InterfaceC2017o decodedParameters3 = (InterfaceC2017o) obj;
                AbstractC4154l.m8923f(decodedParameters3, "$this$decodedParameters");
                String str4 = c4703s.f23450d;
                if (str4 != null) {
                    decodedParameters3.mo266g(str4, "uploadId");
                }
                return qw.a0.f30746a;
            case 11:
                mb.e0 e0Var = (mb.e0) this.f24130b;
                AbstractC4154l.m8923f((InterfaceC2017o) obj, "$this$decodedParameters");
                e0Var.getClass();
                return qw.a0.f30746a;
            case 12:
                mb.k0 k0Var = (mb.k0) this.f24130b;
                AbstractC4154l.m8923f((InterfaceC2017o) obj, "$this$decodedParameters");
                k0Var.getClass();
                return qw.a0.f30746a;
            case 13:
                mb.o0 o0Var = (mb.o0) this.f24130b;
                AbstractC4154l.m8923f((InterfaceC2017o) obj, "$this$decodedParameters");
                o0Var.getClass();
                return qw.a0.f30746a;
            case 14:
                mb.v0 v0Var = (mb.v0) this.f24130b;
                InterfaceC2017o decodedParameters4 = (InterfaceC2017o) obj;
                AbstractC4154l.m8923f(decodedParameters4, "$this$decodedParameters");
                String str5 = v0Var.f23498b;
                if (str5 != null) {
                    decodedParameters4.mo266g(str5, "continuation-token");
                }
                String str6 = v0Var.f23499c;
                if (str6 != null) {
                    decodedParameters4.mo266g(str6, "delimiter");
                }
                Integer num = v0Var.f23500d;
                if (num != null) {
                    decodedParameters4.mo266g(num.toString(), "max-keys");
                }
                String str7 = v0Var.f23501e;
                if (str7 != null) {
                    decodedParameters4.mo266g(str7, "prefix");
                }
                return qw.a0.f30746a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n3 n3Var = (n3) this.f24130b;
                InterfaceC2017o decodedParameters5 = (InterfaceC2017o) obj;
                AbstractC4154l.m8923f(decodedParameters5, "$this$decodedParameters");
                Integer num2 = n3Var.f23365d;
                if (num2 != null) {
                    decodedParameters5.mo266g(num2.toString(), "partNumber");
                }
                String str8 = n3Var.f23366e;
                if (str8 != null) {
                    decodedParameters5.mo266g(str8, "uploadId");
                }
                return qw.a0.f30746a;
            case 16:
                return Boolean.valueOf(((C5138b) obj).f25169a == ((C5138b) this.f24130b).f25169a);
            case 17:
                C7230d c7230d = (C7230d) this.f24130b;
                String dcc = (String) obj;
                AbstractC4154l.m8923f(dcc, "dcc");
                String upperCase = dcc.toUpperCase(Locale.ROOT);
                AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
                c7230d.m13457g(new C7231e(upperCase));
                return qw.a0.f30746a;
            case 18:
                return obj == ((AbstractC6651a) this.f24130b) ? "(this Collection)" : String.valueOf(obj);
            case 19:
                AbstractC6655e abstractC6655e = (AbstractC6655e) this.f24130b;
                Map.Entry it = (Map.Entry) obj;
                AbstractC4154l.m8923f(it, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = it.getKey();
                sb2.append(key == abstractC6655e ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value2 = it.getValue();
                sb2.append(value2 != abstractC6655e ? String.valueOf(value2) : "(this Map)");
                return sb2.toString();
            case 20:
                return Boolean.valueOf(((Collection) this.f24130b).contains(obj));
            case 21:
                InterfaceC6747c interfaceC6747c = (InterfaceC6747c) this.f24130b;
                ((Integer) obj).intValue();
                return Integer.valueOf(-interfaceC6747c.e0(40));
            case 22:
                C7096g c7096g = (C7096g) this.f24130b;
                Map.Entry it2 = (Map.Entry) obj;
                AbstractC4154l.m8923f(it2, "it");
                String str9 = (String) it2.getKey();
                Set set2 = AbstractC7103n.f34279a;
                String lowerCase = str9.toLowerCase(Locale.ROOT);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                return Boolean.valueOf(!set2.contains(lowerCase) && ((Boolean) c7096g.f34242d.invoke(str9)).booleanValue());
            case 23:
                C0917l c0917l = (C0917l) this.f24130b;
                Iterator it3 = ((List) obj).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        String strMo5989t = ((C2066a) it3.next()).f9678a.mo5989t();
                        if (strMo5989t != null && strMo5989t.length() != 0) {
                            ((C6334i) c0917l.f5594b).invoke(strMo5989t);
                        }
                    }
                }
                return qw.a0.f30746a;
            case 24:
                C7788a c7788a = (C7788a) this.f24130b;
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                List list = c7788a.f37452a;
                LazyColumn.m12099p(list.size(), new C6431p(13, new i2(24), list), new C6908y(list, 9), new C6734c(new C0410m(list, 5), true, -1091073711));
                return qw.a0.f30746a;
            case 25:
                C8114j c8114j = (C8114j) this.f24130b;
                AbstractC4154l.m8923f((Context) obj, "it");
                c8114j.f38838m.m9337b(p1.STOP_CALL_MONITOR_SERVICE, Boolean.TRUE);
                return qw.a0.f30746a;
            case 26:
                return ((C0829v) this.f24130b).f5239m;
            case 27:
                CallableC0924s callableC0924s = (CallableC0924s) this.f24130b;
                AbstractC4154l.m8923f((InterfaceC4024a) obj, "it");
                return callableC0924s.call();
            case 28:
                C0512d c0512d = (C0512d) this.f24130b;
                InterfaceC4427a db2 = (InterfaceC4427a) obj;
                AbstractC4154l.m8923f(db2, "db");
                c0512d.f3580g = db2;
                return qw.a0.f30746a;
            default:
                AbstractC8894w abstractC8894w = (AbstractC8894w) this.f24130b;
                C8873b config = (C8873b) obj;
                AbstractC4154l.m8923f(config, "config");
                return abstractC8894w.mo1374g(config);
        }
    }
}
