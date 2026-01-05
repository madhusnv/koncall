package gs;

import aq.C0407j;
import c0.d1;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import ex.InterfaceC2141e;
import g2.ta;
import hc.AbstractC2880c;
import ik.C3280d;
import im.C3304f;
import im.C3305g;
import im.C3306h;
import im.EnumC3316r;
import im.InterfaceC3307i;
import ip.C3342l;
import is.C3348b;
import java.io.File;
import jr.C3844b;
import k1.a1;
import k1.x1;
import km.C4120o;
import kn.C4124d;
import kn.C4125e;
import kotlin.jvm.internal.C4164v;
import ks.c0;
import ks.q0;
import lp.C4505g;
import lv.C4531c;
import m1.C4626h;
import m1.C4627i;
import m1.InterfaceC4630l;
import nn.C5113e;
import og.hb;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.a0;
import s6.C6763b;
import s6.C6765d;
import tb.C7105p;
import tr.AbstractC7213i;
import tr.C7210f;
import tx.InterfaceC7266z;
import tx.e1;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.InterfaceC7810l;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.m1;
import wx.w0;
import xm.y5;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.a */
/* loaded from: classes3.dex */
public final class C2715a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15146a;

    /* renamed from: b */
    public int f15147b;

    /* renamed from: c */
    public Object f15148c;

    /* renamed from: d */
    public /* synthetic */ Object f15149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2715a(C2721g c2721g, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f15146a = 1;
        this.f15148c = c2721g;
    }

    /* renamed from: d */
    private final Object m6714d(Object obj) {
        String str = (String) this.f15149d;
        C4124d c4124d = (C4124d) this.f15148c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15147b;
        if (i10 == 0) {
            od.m10798c(obj);
            y5 y5Var = c4124d.f21070a;
            this.f15147b = 1;
            if (y5Var.m15703s(str, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        c4124d.f21071b.m16232g("DeviceDeleteManagerImp", "start update simList for ".concat(str));
        return a0.f30746a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r3.m15687F(r1, r27) == r4) goto L25;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m6715e(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            java.lang.Object r1 = r0.f15149d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f15148c
            kn.e r2 = (kn.C4125e) r2
            xm.y5 r3 = r2.f21072a
            vw.a r4 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r5 = r0.f15147b
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L2b
            if (r5 == r7) goto L25
            if (r5 != r6) goto L1d
            og.od.m10798c(r28)
            goto Lba
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            og.od.m10798c(r28)
            r5 = r28
            goto L38
        L2b:
            og.od.m10798c(r28)
            r0.f15147b = r7
            java.io.Serializable r5 = r3.m15694j(r0)
            if (r5 != r4) goto L38
            goto Lb9
        L38:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r5.next()
            r8 = r7
            mm.m r8 = (mm.C4802m) r8
            java.lang.String r8 = r8.f23891c
            boolean r8 = kotlin.jvm.internal.AbstractC4154l.m8918a(r8, r1)
            if (r8 == 0) goto L3e
            goto L55
        L54:
            r7 = 0
        L55:
            r8 = r7
            mm.m r8 = (mm.C4802m) r8
            if (r8 != 0) goto L8f
            yv.t r2 = r2.f21073b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "LeadSubscriptionExpireManager >>> sim number "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = " not connected"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.m16231f(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "sim number "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " null"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "LeadSubscriptionExpireManager"
            int r1 = android.util.Log.e(r2, r1)
            ww.AbstractC8196f.m15349b(r1)
            goto Lba
        L8f:
            r25 = 0
            r26 = 8380415(0x7fdfff, float:1.1743463E-38)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            mm.m r1 = mm.C4802m.m9753a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.f15147b = r6
            java.lang.Object r1 = r3.m15687F(r1, r0)
            if (r1 != r4) goto Lba
        Lb9:
            return r4
        Lba:
            qw.a0 r1 = qw.a0.f30746a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.C2715a.m6715e(java.lang.Object):java.lang.Object");
    }

    /* renamed from: g */
    private final Object m6716g(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15147b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8203d c8203d = ((C4505g) this.f15148c).f36255e;
            C0407j c0407j = new C0407j((l7.a0) this.f15149d, 4);
            this.f15147b = 1;
            if (c8203d.collect(c0407j, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return a0.f30746a;
    }

    /* renamed from: h */
    private final Object m6717h(Object obj) {
        Object value;
        c0 c0Var = (c0) this.f15149d;
        w0 w0Var = c0Var.f21361C;
        C8801p c8801p = (C8801p) this.f15148c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15147b;
        if (i10 == 0) {
            od.m10798c(obj);
            if (c8801p.f42464a && ((C3348b) w0Var.f39340a.getValue()).f17713a.isEmpty() && c0Var.f21360B == null) {
                C4531c c4531c = c0Var.f21364F;
                this.f15148c = null;
                this.f15147b = 1;
                if (c4531c.m9378b(this) == enumC7794a) {
                    return enumC7794a;
                }
            } else if (((C3348b) w0Var.f39340a.getValue()).f17713a.isEmpty()) {
                m1 m1Var = c0Var.f21359A;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, false, 0, null, 0, false, ((C3348b) w0Var.f39340a.getValue()).f17713a.isEmpty(), false, null, null, false, null, null, null, null, null, false, null, 1048511)));
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return a0.f30746a;
    }

    /* renamed from: i */
    private final Object m6718i(Object obj) {
        c0 c0Var = (c0) this.f15149d;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15147b;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f15148c;
                if ((interfaceC3307i instanceof C3305g) || (interfaceC3307i instanceof C3306h)) {
                    this.f15147b = 1;
                    if (c0.m8950k(c0Var, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else if (interfaceC3307i instanceof C3304f) {
                    c0.m8949j(c0Var, (C3304f) interfaceC3307i);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
        } catch (Exception e2) {
            c0Var.f21376q.m16234i(c0Var.f21378s, e2);
        }
        return a0.f30746a;
    }

    /* renamed from: j */
    private final Object m6719j(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15147b;
        a0 a0Var = a0.f30746a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return a0Var;
        }
        od.m10798c(obj);
        C5113e c5113e = ((c0) this.f15148c).f21368i;
        EnumC3316r enumC3316r = (EnumC3316r) this.f15149d;
        this.f15147b = 1;
        Object objM6034n = c5113e.f25030a.f41069a.m6034n("lead_sorting", enumC3316r.getParams(), this);
        if (objM6034n != enumC7794a) {
            objM6034n = a0Var;
        }
        if (objM6034n != enumC7794a) {
            objM6034n = a0Var;
        }
        return objM6034n == enumC7794a ? enumC7794a : a0Var;
    }

    /* renamed from: k */
    private final Object m6720k(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f15147b;
        a0 a0Var = a0.f30746a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return a0Var;
        }
        od.m10798c(obj);
        C7105p c7105p = ((c0) this.f15148c).f21373n;
        boolean zBooleanValue = ((Boolean) ((C7210f) ((AbstractC7213i) this.f15149d)).f34504a.f30755a).booleanValue();
        this.f15147b = 1;
        Object objM6031k = ((C5113e) c7105p.f34290b).f25030a.f41069a.m6031k("lead_not_connected_call", zBooleanValue, this);
        if (objM6031k != enumC7794a) {
            objM6031k = a0Var;
        }
        if (objM6031k != enumC7794a) {
            objM6031k = a0Var;
        }
        if (objM6031k != enumC7794a) {
            objM6031k = a0Var;
        }
        return objM6031k == enumC7794a ? enumC7794a : a0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15146a) {
            case 0:
                return new C2715a((C2721g) this.f15148c, (C4164v) this.f15149d, interfaceC7559c, 0);
            case 1:
                C2715a c2715a = new C2715a((C2721g) this.f15148c, interfaceC7559c);
                c2715a.f15149d = obj;
                return c2715a;
            case 2:
                return new C2715a((C2724j) this.f15148c, (String) this.f15149d, interfaceC7559c, 2);
            case 3:
                return new C2715a((C2728n) this.f15148c, (Leads) this.f15149d, interfaceC7559c, 3);
            case 4:
                return new C2715a((C2728n) this.f15148c, (hb) this.f15149d, interfaceC7559c, 4);
            case 5:
                return new C2715a((AbstractC2880c) this.f15148c, (File) this.f15149d, interfaceC7559c, 5);
            case 6:
                C2715a c2715a2 = new C2715a((PhoneStateReceiver) this.f15149d, interfaceC7559c, 6);
                c2715a2.f15148c = obj;
                return c2715a2;
            case 7:
                return new C2715a((C3342l) this.f15148c, (l7.a0) this.f15149d, interfaceC7559c, 7);
            case 8:
                return new C2715a((ta) this.f15148c, (String) this.f15149d, interfaceC7559c, 8);
            case 9:
                return new C2715a((InterfaceC4630l) this.f15148c, (C4626h) this.f15149d, interfaceC7559c, 9);
            case 10:
                return new C2715a((InterfaceC4630l) this.f15148c, (C4627i) this.f15149d, interfaceC7559c, 10);
            case 11:
                C2715a c2715a3 = new C2715a((C3280d) this.f15149d, interfaceC7559c, 11);
                c2715a3.f15148c = obj;
                return c2715a3;
            case 12:
                return new C2715a((InterfaceC3307i) this.f15148c, (C3342l) this.f15149d, interfaceC7559c, 12);
            case 13:
                C2715a c2715a4 = new C2715a((C3342l) this.f15149d, interfaceC7559c, 13);
                c2715a4.f15148c = obj;
                return c2715a4;
            case 14:
                return new C2715a((C3844b) this.f15148c, (l7.a0) this.f15149d, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C2715a c2715a5 = new C2715a((C3844b) this.f15149d, interfaceC7559c, 15);
                c2715a5.f15148c = obj;
                return c2715a5;
            case 16:
                C2715a c2715a6 = new C2715a((InterfaceC7810l) this.f15149d, interfaceC7559c, 16);
                c2715a6.f15148c = obj;
                return c2715a6;
            case 17:
                C2715a c2715a7 = new C2715a((d1) this.f15149d, interfaceC7559c, 17);
                c2715a7.f15148c = obj;
                return c2715a7;
            case 18:
                return new C2715a((x1) this.f15148c, (InterfaceC2141e) this.f15149d, interfaceC7559c, 18);
            case 19:
                return new C2715a((e1) this.f15148c, (a1) this.f15149d, interfaceC7559c, 19);
            case 20:
                return new C2715a((C4120o) this.f15148c, (String) this.f15149d, interfaceC7559c, 20);
            case 21:
                C2715a c2715a8 = new C2715a((C6765d) this.f15149d, this.f15147b, interfaceC7559c);
                c2715a8.f15148c = obj;
                return c2715a8;
            case 22:
                return new C2715a((C4124d) this.f15148c, (String) this.f15149d, interfaceC7559c, 22);
            case 23:
                return new C2715a((C4125e) this.f15148c, (String) this.f15149d, interfaceC7559c, 23);
            case 24:
                return new C2715a((C4505g) this.f15148c, (l7.a0) this.f15149d, interfaceC7559c, 24);
            case 25:
                C2715a c2715a9 = new C2715a((c0) this.f15149d, interfaceC7559c, 25);
                c2715a9.f15148c = obj;
                return c2715a9;
            case 26:
                return new C2715a((InterfaceC3307i) this.f15148c, (c0) this.f15149d, interfaceC7559c, 26);
            case 27:
                return new C2715a((c0) this.f15148c, (EnumC3316r) this.f15149d, interfaceC7559c, 27);
            case 28:
                return new C2715a((c0) this.f15148c, (AbstractC7213i) this.f15149d, interfaceC7559c, 28);
            default:
                return new C2715a((q0) this.f15149d, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.f15146a) {
            case 21:
                C2715a c2715a = (C2715a) create((C6763b) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2715a.invokeSuspend(a0Var);
                break;
        }
        return ((C2715a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:607:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:612:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Type inference failed for: r1v108, types: [int] */
    /* JADX WARN: Type inference failed for: r1v109, types: [tx.e1] */
    /* JADX WARN: Type inference failed for: r1v113, types: [tx.e1] */
    /* JADX WARN: Type inference failed for: r1v161 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.concurrent.CancellationException, uw.c] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x027b -> B:142:0x023d). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.C2715a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2715a(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15146a = i10;
        this.f15148c = obj;
        this.f15149d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2715a(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15146a = i10;
        this.f15149d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2715a(C6765d c6765d, int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f15146a = 21;
        this.f15149d = c6765d;
        this.f15147b = i10;
    }
}
