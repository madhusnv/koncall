package bt;

import a2.AbstractC0030c;
import ab.C0084b;
import an.j2;
import android.content.Context;
import android.net.Uri;
import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import b3.InterfaceC0579k;
import ca.C0929a;
import ca.C0930b;
import ca.C0931c;
import ca.C0932d;
import ca.C0933e;
import ca.C0934f;
import ca.C0939k;
import com.amplifyframework.auth.cognito.CredentialStoreClient;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import dc.InterfaceC1681a;
import dt.C1813s;
import dt.C1818x;
import dv.C1848i;
import dv.C1849j;
import es.C2127d;
import et.C2135g;
import ev.C2136a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import fv.C2386k;
import fy.C2402b;
import fy.C2403c;
import hr.C3025d;
import hy.C3052c;
import hy.C3060k;
import hy.InterfaceC3055f;
import i9.C3208z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import jt.C3856e;
import jy.C3883t;
import jy.C3884u;
import kb.C4042f;
import kb.C4043g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.C4278j;
import ky.C4289u;
import ky.InterfaceC4288t;
import l7.C4409i;
import l7.C4412l;
import ly.AbstractC4585i;
import mm.C4798i;
import ms.C4866a;
import n7.C4970o;
import nt.C5139c;
import nx.C5176n;
import og.f2;
import og.la;
import om.C5414p;
import org.bouncycastle.iana.AEADAlgorithm;
import os.C5731i;
import p7.C5836g;
import pg.AbstractC5941v;
import pg.c9;
import rs.C6613c;
import rw.C6669s;
import ss.C6924m;
import ss.e1;
import ss.z0;
import us.C7536c;
import uw.C7565i;
import zp.C9008h;
import zs.C9048m;
import zs.C9061z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4849a;

    /* renamed from: b */
    public final /* synthetic */ Object f4850b;

    /* renamed from: c */
    public final /* synthetic */ Object f4851c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.f4849a = i10;
        this.f4850b = obj;
        this.f4851c = obj2;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        String str;
        String[] strArrNames;
        switch (this.f4849a) {
            case 0:
                l7.a0 a0Var = (l7.a0) this.f4850b;
                C1813s c1813s = (C1813s) this.f4851c;
                a0Var.m9188g();
                c1813s.m5479f(new C9048m(false));
                return qw.a0.f30746a;
            case 1:
                C1818x c1818x = (C1818x) this.f4851c;
                l7.a0 a0Var2 = (l7.a0) this.f4850b;
                c1818x.m5481f(C9061z.f43571a);
                a0Var2.m9188g();
                return qw.a0.f30746a;
            case 2:
                return CredentialStoreClient.listenForResult$lambda$2((CredentialStoreClient) this.f4850b, (CredentialStoreEvent) this.f4851c);
            case 3:
                InterfaceC0579k interfaceC0579k = (InterfaceC0579k) this.f4850b;
                k2.w0 w0Var = (k2.w0) this.f4851c;
                InterfaceC0579k.m1742a(interfaceC0579k);
                w0Var.setValue(Boolean.TRUE);
                return qw.a0.f30746a;
            case 4:
                C2386k c2386k = (C2386k) this.f4850b;
                k2.w0 w0Var2 = (k2.w0) this.f4851c;
                c2386k.m6074s(new C1848i((String) w0Var2.getValue(), (String) w0Var2.getValue()));
                return qw.a0.f30746a;
            case 5:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f4850b;
                C2136a c2136a = (C2136a) this.f4851c;
                C5414p c5414p = c2136a.f9969a;
                String str2 = c5414p.f27189f;
                String str3 = c5414p.f27194l;
                String str4 = c2136a.f9982n;
                StringBuilder sbM127r = AbstractC0030c.m127r("lead_details_screen/note/", str2, "/", str3, "/");
                sbM127r.append(str4);
                interfaceC2139c.invoke(sbM127r.toString());
                return qw.a0.f30746a;
            case 6:
                InterfaceC0579k interfaceC0579k2 = (InterfaceC0579k) this.f4850b;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f4851c;
                InterfaceC0579k.m1742a(interfaceC0579k2);
                interfaceC2137a.invoke();
                return qw.a0.f30746a;
            case 7:
                InterfaceC0579k interfaceC0579k3 = (InterfaceC0579k) this.f4850b;
                C2386k c2386k2 = (C2386k) this.f4851c;
                InterfaceC0579k.m1742a(interfaceC0579k3);
                c2386k2.m6074s(C1849j.f8828b);
                return qw.a0.f30746a;
            case 8:
                return "resolved region (" + ((String) this.f4850b) + ") from " + ((InterfaceC1681a) this.f4851c) + ' ';
            case 9:
                InterfaceC1681a interfaceC1681a = (InterfaceC1681a) this.f4850b;
                Exception exc = (Exception) this.f4851c;
                StringBuilder sb2 = new StringBuilder("unable to load region from ");
                sb2.append(interfaceC1681a);
                sb2.append(": ");
                return AbstractC0030c.m117h(exc, sb2);
            case 10:
                ((InterfaceC2139c) this.f4850b).invoke((C2127d) this.f4851c);
                return qw.a0.f30746a;
            case 11:
                l7.a0 a0Var3 = (l7.a0) this.f4850b;
                C4798i c4798i = (C4798i) this.f4851c;
                l7.a0.m9181f(a0Var3, c9.m11574c(c4798i.f23879d, c4798i.f23877b, c4798i.f23878c));
                return qw.a0.f30746a;
            case 12:
                return AbstractC5941v.m11888b((String) this.f4850b, C3052c.f16387b, new InterfaceC3055f[0], new C2402b((C2403c) this.f4851c, 0));
            case 13:
                List list = (List) this.f4850b;
                C3025d c3025d = (C3025d) this.f4851c;
                list.clear();
                c3025d.getClass();
                list.addAll((List) tx.c0.m13468D(C7565i.f36440a, new C0084b(c3025d, null, 20)));
                return qw.a0.f30746a;
            case 14:
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) this.f4850b;
                InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) this.f4851c;
                interfaceC2137a2.invoke();
                interfaceC2137a3.invoke();
                return qw.a0.f30746a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((InterfaceC2139c) this.f4850b).invoke((Uri) this.f4851c);
                return qw.a0.f30746a;
            case 16:
                ((C3856e) this.f4850b).m8402g(new C2135g((Context) this.f4851c));
                return qw.a0.f30746a;
            case 17:
                C3208z c3208z = (C3208z) this.f4850b;
                C0939k c0939k = (C0939k) this.f4851c;
                StringBuilder sb3 = new StringBuilder("Resolving credentials from ");
                la laVar = c0939k.f5693a;
                c3208z.getClass();
                if (laVar instanceof C0931c) {
                    str = "named source " + ((C0931c) laVar).f5679a;
                } else if (laVar instanceof C0929a) {
                    str = "static credentials";
                } else if (laVar instanceof C0934f) {
                    str = "web identity token";
                } else if (laVar instanceof C0933e) {
                    str = "single sign-on (session)";
                } else if (laVar instanceof C0930b) {
                    str = "single sign-on (legacy)";
                } else {
                    if (!(laVar instanceof C0932d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "process";
                }
                sb3.append(str);
                return sb3.toString();
            case 18:
                return "IMDS error: statusCode=" + ((jc.h0) this.f4850b) + "; " + ((EC2MetadataError) ((Throwable) this.f4851c)).getMessage();
            case 19:
                C3884u c3884u = (C3884u) this.f4850b;
                String str5 = (String) this.f4851c;
                C3883t c3883t = (C3883t) c3884u.f19969c;
                if (c3883t == null) {
                    Enum[] enumArr = (Enum[]) c3884u.f19968b;
                    c3883t = new C3883t(str5, enumArr.length);
                    for (Enum r02 : enumArr) {
                        c3883t.m8428k(r02.name(), false);
                    }
                }
                return c3883t;
            case 20:
                return AbstractC5941v.m11888b((String) this.f4850b, C3060k.f16416e, new InterfaceC3055f[0], new j2(24, (C3884u) this.f4851c));
            case 21:
                return "Credentials for " + ((C4042f) this.f4850b).f20879a + " are expiring in " + ((C4043g) this.f4851c).f20881a.f20878b + " and are within their refresh window, performing asynchronous refresh...";
            case 22:
                InterfaceC2142f interfaceC2142f = (InterfaceC2142f) this.f4850b;
                C5139c c5139c = (C5139c) this.f4851c;
                interfaceC2142f.invoke(c5139c.f25178c, c5139c.f25177b, Integer.valueOf(c5139c.f25176a));
                return qw.a0.f30746a;
            case 23:
                ((C5731i) this.f4850b).m11284h(new C4866a(((e1) this.f4851c).f33426a));
                return qw.a0.f30746a;
            case 24:
                InterfaceC3055f interfaceC3055f = (InterfaceC3055f) this.f4850b;
                AbstractC4271c abstractC4271c = (AbstractC4271c) this.f4851c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C4278j c4278j = abstractC4271c.f21667a;
                C4289u c4289uM9434o = AbstractC4585i.m9434o(interfaceC3055f, abstractC4271c);
                int iMo7281f = interfaceC3055f.mo7281f();
                for (int i10 = 0; i10 < iMo7281f; i10++) {
                    List listMo7283h = interfaceC3055f.mo7283h(i10);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listMo7283h) {
                        if (obj instanceof InterfaceC4288t) {
                            arrayList.add(obj);
                        }
                    }
                    InterfaceC4288t interfaceC4288t = (InterfaceC4288t) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (interfaceC4288t != null && (strArrNames = interfaceC4288t.names()) != null) {
                        for (String str6 : strArrNames) {
                            AbstractC4585i.m9425f(linkedHashMap, interfaceC3055f, str6, i10);
                        }
                    }
                    String strM8994a = c4289uM9434o != null ? c4289uM9434o.m8994a(interfaceC3055f, interfaceC3055f.mo7282g(i10)) : null;
                    if (strM8994a != null) {
                        AbstractC4585i.m9425f(linkedHashMap, interfaceC3055f, strM8994a, i10);
                    }
                }
                return linkedHashMap.isEmpty() ? C6669s.f31944a : linkedHashMap;
            case 25:
                ((C4970o) this.f4850b).mo9231i((C4409i) this.f4851c, false);
                return qw.a0.f30746a;
            case 26:
                C5176n c5176n = (C5176n) this.f4850b;
                CharSequence input = (CharSequence) this.f4851c;
                AbstractC4154l.m8923f(input, "input");
                Matcher matcher = c5176n.f25285a.matcher(input);
                AbstractC4154l.m8922e(matcher, "matcher(...)");
                return f2.m10640a(matcher, 0, input);
            case 27:
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f4850b;
                C9008h c9008h = (C9008h) this.f4851c;
                interfaceC2141e.invoke(String.valueOf(c9008h.f43400f), c9008h.f43401g);
                return qw.a0.f30746a;
            case 28:
                C4412l c4412l = (C4412l) this.f4850b;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f4851c;
                for (C4409i c4409i : (Iterable) c4412l.f22081f.f39340a.getValue()) {
                    if (C5836g.m11410n()) {
                        Objects.toString(c4409i);
                        Objects.toString(j0Var);
                    }
                    c4412l.m9217c(c4409i);
                }
                return qw.a0.f30746a;
            default:
                z0 z0Var = (z0) this.f4850b;
                C7536c c7536c = (C7536c) this.f4851c;
                z0Var.m13196s(C6924m.f33459a);
                c7536c.m14297e(C6613c.f31768a);
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ i0(C1818x c1818x, l7.a0 a0Var) {
        this.f4849a = 1;
        this.f4851c = c1818x;
        this.f4850b = a0Var;
    }

    public /* synthetic */ i0(C4409i c4409i, C4412l c4412l, C5836g c5836g, androidx.fragment.app.j0 j0Var) {
        this.f4849a = 28;
        this.f4850b = c4412l;
        this.f4851c = j0Var;
    }
}
