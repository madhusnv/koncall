package ac;

import au.AbstractC0453q;
import au.C0450n;
import aws.smithy.kotlin.runtime.C0488a;
import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.SdkBaseException;
import aws.smithy.kotlin.runtime.ServiceException;
import bq.C0737q;
import dq.C1750l;
import ec.C2005c;
import ed.C2026b;
import ed.C2032h;
import ed.EnumC2030f;
import ep.C2088f;
import eq.C2100l;
import er.AbstractC2111k;
import ex.InterfaceC2139c;
import fc.C2256d;
import fc.C2261i;
import gr.C2713i;
import hv.AbstractC3049n;
import i0.m0;
import ip.C3342l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import kv.C4252f;
import mq.AbstractC4854v;
import mq.a1;
import mq.h0;
import mq.s0;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.pe;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import sd.InterfaceC6811e;
import ta.C7083a;
import ur.AbstractC7523p;
import uw.InterfaceC7559c;
import zb.AbstractC8912f;
import zb.C8910d;
import zb.C8911e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ac.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0088a extends AbstractC4152j implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0088a(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f339a = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r4v13, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        ?? r17;
        Object next;
        int i10 = this.f339a;
        boolean z6 = false;
        a0 a0Var = a0.f30746a;
        switch (i10) {
            case 0:
                String p02 = (String) obj;
                AbstractC4154l.m8923f(p02, "p0");
                ((C8910d) this.receiver).getClass();
                C8911e c8911e = C8911e.f42877h;
                C8911e c8911e2 = C8911e.f42876g;
                C8911e c8911e3 = C8911e.f42875f;
                C8911e c8911e4 = C8911e.f42874e;
                List<String> listM10112W = AbstractC5178p.m10112W(AbstractC5178p.g0(p02).toString(), new String[]{"|"}, 6);
                ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10112W, 10));
                for (String str : listM10112W) {
                    AbstractC8912f[] abstractC8912fArr = new AbstractC8912f[4];
                    abstractC8912fArr[z6 ? 1 : 0] = c8911e4;
                    abstractC8912fArr[1] = c8911e3;
                    abstractC8912fArr[2] = c8911e2;
                    abstractC8912fArr[3] = c8911e;
                    Iterator it = pe.m10834i(abstractC8912fArr).iterator();
                    boolean z10 = z6;
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            r17 = z10;
                            if (!AbstractC5185w.m10130l(str, ((AbstractC8912f) next).toString(), true)) {
                                z10 = r17 == true ? 1 : 0;
                            }
                        } else {
                            r17 = z10;
                            next = null;
                        }
                    }
                    AbstractC8912f abstractC8912f = (AbstractC8912f) next;
                    if (abstractC8912f == null) {
                        StringBuilder sbM7383p = m0.m7383p("Log mode ", str, " is not supported, should be one or more of: ");
                        AbstractC8912f[] abstractC8912fArr2 = new AbstractC8912f[4];
                        abstractC8912fArr2[r17] = c8911e4;
                        abstractC8912fArr2[1] = c8911e3;
                        abstractC8912fArr2[2] = c8911e2;
                        abstractC8912fArr2[3] = c8911e;
                        sbM7383p.append(AbstractC6663m.m12748L(pe.m10834i(abstractC8912fArr2), ", ", null, null, null, 62));
                        throw new ClientException(sbM7383p.toString());
                    }
                    arrayList.add(abstractC8912f);
                    z6 = r17;
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it2.next();
                while (it2.hasNext()) {
                    AbstractC8912f mode = (AbstractC8912f) it2.next();
                    AbstractC8912f abstractC8912f2 = (AbstractC8912f) next2;
                    abstractC8912f2.getClass();
                    AbstractC4154l.m8923f(mode, "mode");
                    next2 = new C8911e(abstractC8912f2.f42880a | mode.f42880a, 5);
                }
                return (AbstractC8912f) next2;
            case 1:
                String p03 = (String) obj;
                AbstractC4154l.m8923f(p03, "p0");
                return ((InterfaceC6811e) this.receiver).mo12984a(p03);
            case 2:
                String p04 = (String) obj;
                AbstractC4154l.m8923f(p04, "p0");
                return ((InterfaceC6811e) this.receiver).mo12984a(p04);
            case 3:
                String p05 = (String) obj;
                AbstractC4154l.m8923f(p05, "p0");
                return ((InterfaceC6811e) this.receiver).mo12984a(p05);
            case 4:
                String p06 = (String) obj;
                AbstractC4154l.m8923f(p06, "p0");
                return ((InterfaceC6811e) this.receiver).mo12984a(p06);
            case 5:
                String p07 = (String) obj;
                AbstractC4154l.m8923f(p07, "p0");
                return ((InterfaceC6811e) this.receiver).mo12985b(p07);
            case 6:
                String p08 = (String) obj;
                AbstractC4154l.m8923f(p08, "p0");
                return ((InterfaceC6811e) this.receiver).mo12985b(p08);
            case 7:
                String p09 = (String) obj;
                AbstractC4154l.m8923f(p09, "p0");
                return ((InterfaceC6811e) this.receiver).mo12984a(p09);
            case 8:
                String p010 = (String) obj;
                AbstractC4154l.m8923f(p010, "p0");
                return ((InterfaceC6811e) this.receiver).mo12985b(p010);
            case 9:
                String p011 = (String) obj;
                AbstractC4154l.m8923f(p011, "p0");
                return ((InterfaceC6811e) this.receiver).mo12984a(p011);
            case 10:
                String p012 = (String) obj;
                AbstractC4154l.m8923f(p012, "p0");
                return ((InterfaceC6811e) this.receiver).mo12985b(p012);
            case 11:
                String p013 = (String) obj;
                AbstractC4154l.m8923f(p013, "p0");
                return ((InterfaceC6811e) this.receiver).mo12985b(p013);
            case 12:
                AbstractC7523p p014 = (AbstractC7523p) obj;
                AbstractC4154l.m8923f(p014, "p0");
                ((C0737q) this.receiver).mo2033e(p014);
                return a0Var;
            case 13:
                AbstractC0453q p015 = (AbstractC0453q) obj;
                AbstractC4154l.m8923f(p015, "p0");
                ((C0450n) this.receiver).m1458f(p015);
                return a0Var;
            case 14:
                AbstractC7523p p016 = (AbstractC7523p) obj;
                AbstractC4154l.m8923f(p016, "p0");
                ((C2100l) this.receiver).mo2033e(p016);
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                AbstractC7523p p017 = (AbstractC7523p) obj;
                AbstractC4154l.m8923f(p017, "p0");
                ((C1750l) this.receiver).mo2033e(p017);
                return a0Var;
            case 16:
                return C7083a.m13373j((C7083a) this.receiver, (InterfaceC7559c) obj);
            case 17:
                AbstractC7523p p018 = (AbstractC7523p) obj;
                AbstractC4154l.m8923f(p018, "p0");
                ((C2088f) this.receiver).mo2033e(p018);
                return a0Var;
            case 18:
                Throwable p019 = (Throwable) obj;
                AbstractC4154l.m8923f(p019, "p0");
                return ((C2032h) this.receiver).mo5751a(p019);
            case 19:
                ServiceException p020 = (ServiceException) obj;
                AbstractC4154l.m8923f(p020, "p0");
                ((C2032h) this.receiver).getClass();
                C0489b c0489bMo1480b = p020.mo1480b();
                boolean zM1482a = c0489bMo1480b.m1482a();
                C2005c c2005c = c0489bMo1480b.f3503a;
                if (zM1482a) {
                    ServiceException.EnumC0487a enumC0487a = (ServiceException.EnumC0487a) c2005c.mo1864e(C0489b.f3506g);
                    if (enumC0487a == null) {
                        enumC0487a = ServiceException.EnumC0487a.Unknown;
                    }
                    if (enumC0487a == ServiceException.EnumC0487a.Server) {
                        return new C2026b(EnumC2030f.ServerSide);
                    }
                }
                if (!c0489bMo1480b.m1482a()) {
                    return null;
                }
                ServiceException.EnumC0487a enumC0487a2 = (ServiceException.EnumC0487a) c2005c.mo1864e(C0489b.f3506g);
                if (enumC0487a2 == null) {
                    enumC0487a2 = ServiceException.EnumC0487a.Unknown;
                }
                if (enumC0487a2 == ServiceException.EnumC0487a.Client) {
                    return new C2026b(EnumC2030f.ClientSide);
                }
                return null;
            case 20:
                ClientException p021 = (ClientException) obj;
                AbstractC4154l.m8923f(p021, "p0");
                ((C2032h) this.receiver).getClass();
                if (p021.f3498a.m1482a()) {
                    return new C2026b(EnumC2030f.ClientSide);
                }
                return null;
            case 21:
                SdkBaseException p022 = (SdkBaseException) obj;
                AbstractC4154l.m8923f(p022, "p0");
                ((C2032h) this.receiver).getClass();
                C0488a c0488aMo1480b = p022.mo1480b();
                Boolean bool = (Boolean) c0488aMo1480b.f3503a.mo1864e(C0488a.f3502d);
                if (bool != null ? bool.booleanValue() : false) {
                    return new C2026b(EnumC2030f.Throttling);
                }
                if (c0488aMo1480b.m1482a()) {
                    return new C2026b(EnumC2030f.Transient);
                }
                return null;
            case 22:
                AbstractC2111k p023 = (AbstractC2111k) obj;
                AbstractC4154l.m8923f(p023, "p0");
                ((C2713i) this.receiver).m6713f(p023);
                return a0Var;
            case 23:
                Map.Entry p024 = (Map.Entry) obj;
                AbstractC4154l.m8923f(p024, "p0");
                C2261i c2261i = (C2261i) this.receiver;
                return new C2256d(p024, c2261i.f10268b, c2261i.f10272f, c2261i.f10273g);
            case 24:
                Map.Entry p025 = (Map.Entry) obj;
                AbstractC4154l.m8923f(p025, "p0");
                C2261i c2261i2 = (C2261i) this.receiver;
                return new C2256d(p025, c2261i2.f10269c, c2261i2.f10273g, c2261i2.f10272f);
            case 25:
                AbstractC3049n p026 = (AbstractC3049n) obj;
                AbstractC4154l.m8923f(p026, "p0");
                ((C4252f) this.receiver).m8982g(p026);
                return a0Var;
            case 26:
                AbstractC7523p p027 = (AbstractC7523p) obj;
                AbstractC4154l.m8923f(p027, "p0");
                ((C3342l) this.receiver).mo2033e(p027);
                return a0Var;
            case 27:
                AbstractC4854v p028 = (AbstractC4854v) obj;
                AbstractC4154l.m8923f(p028, "p0");
                ((h0) this.receiver).m9801m(p028);
                return a0Var;
            default:
                s0 p029 = (s0) obj;
                AbstractC4154l.m8923f(p029, "p0");
                ((a1) this.receiver).m9792i(p029);
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088a(int i10, Object obj) {
        super(1, 0, C2713i.class, obj, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/contacts/ContactEvent;)V");
        this.f339a = i10;
        switch (i10) {
            case 27:
                super(1, 0, h0.class, obj, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/callHistory/viewmodel/CallHistoryTabViewModel$TabEvent;)V");
                break;
            default:
                break;
        }
    }
}
