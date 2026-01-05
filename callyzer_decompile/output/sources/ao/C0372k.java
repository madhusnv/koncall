package ao;

import aq.C0407j;
import b8.C0627v;
import bq.C0737q;
import bs.C0751i;
import bv.C0790h;
import c4.C0859i;
import c4.ScrollCaptureCallbackC0854d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest;
import com.websoptimization.callyzerbiz.services.CallRecordingNotificationActionService;
import com.websoptimization.callyzerbiz.services.FCMMessageService;
import com.websoptimization.callyzerbiz.workManager.CallNotesTemplatesWorkManager;
import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import ct.C1502a;
import dp.C1737d;
import dq.C1750l;
import dr.C1775y;
import dt.C1813s;
import ep.C2088f;
import eq.C2100l;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import im.C3303e;
import im.C3305g;
import im.C3306h;
import im.InterfaceC3307i;
import java.util.ArrayList;
import k2.e1;
import kotlin.jvm.internal.C4168z;
import lv.C4531c;
import mm.C4791b;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import qn.C6263l;
import qp.C6274k;
import rt.C6617a;
import tx.InterfaceC7266z;
import ur.AbstractC7523p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8089o;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.m1;
import zu.AbstractC9092v;
import zu.C9082l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.k */
/* loaded from: classes3.dex */
public final class C0372k extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f2959a;

    /* renamed from: b */
    public int f2960b;

    /* renamed from: c */
    public Object f2961c;

    /* renamed from: d */
    public final /* synthetic */ Object f2962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0372k(int i10, C1813s c1813s, String str, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f2959a = 14;
        this.f2961c = c1813s;
        this.f2960b = i10;
        this.f2962d = str;
    }

    /* renamed from: d */
    private final Object m1408d(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        qw.a0 a0Var = qw.a0.f30746a;
        if (i10 == 0) {
            od.m10798c(obj);
            C6263l c6263l = ((C0790h) this.f2961c).f4992d;
            int i11 = ((C9082l) ((AbstractC9092v) this.f2962d)).f43614a;
            this.f2960b = 1;
            Object objM6678X = c6263l.f30351a.f40530a.m6678X(i11, this);
            if (objM6678X != enumC7794a) {
                objM6678X = a0Var;
            }
            if (objM6678X != enumC7794a) {
                objM6678X = a0Var;
            }
            if (objM6678X == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r2.mo14775g(zu.C9093w.f43625a, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r2.mo14775g(zu.C9094x.f43626a, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return r1;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1409e(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2961c
            bv.h r0 = (bv.C0790h) r0
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r5.f2960b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            og.od.m10798c(r6)
            goto L51
        L1d:
            og.od.m10798c(r6)
            wx.w0 r6 = r0.f5004p
            vx.h r2 = r0.f5001m
            wx.k1 r6 = r6.f39340a
            java.lang.Object r6 = r6.getValue()
            av.b r6 = (av.C0459b) r6
            boolean r6 = r6.f3277Q
            if (r6 == 0) goto L46
            ln.g r6 = r0.f4999k
            im.p1 r0 = im.p1.MESSAGE_TEMPLATE_CALL_LOG_DATA
            java.lang.Object r3 = r5.f2962d
            rt.a r3 = (rt.C6617a) r3
            r6.m9337b(r0, r3)
            r5.f2960b = r4
            zu.w r6 = zu.C9093w.f43625a
            java.lang.Object r6 = r2.mo14775g(r6, r5)
            if (r6 != r1) goto L51
            goto L50
        L46:
            r5.f2960b = r3
            zu.x r6 = zu.C9094x.f43626a
            java.lang.Object r6 = r2.mo14775g(r6, r5)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C0372k.m1409e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x05ff, code lost:
    
        if (tx.c0.m13489l(1000, r50) == r2) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0202, code lost:
    
        if (bv.C0790h.m2114e(r1, r50) == r2) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0206  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1410g(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 1629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C0372k.m1410g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r3 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0136, code lost:
    
        if (r3 == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1411h(java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C0372k.m1411h(java.lang.Object):java.lang.Object");
    }

    /* renamed from: i */
    private final Object m1412i(Object obj) {
        ScrollCaptureCallbackC0854d scrollCaptureCallbackC0854d = (ScrollCaptureCallbackC0854d) this.f2961c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        qw.a0 a0Var = qw.a0.f30746a;
        if (i10 == 0) {
            od.m10798c(obj);
            C0859i c0859i = scrollCaptureCallbackC0854d.f5388f;
            this.f2960b = 1;
            Object objM2299b = c0859i.m2299b(DefinitionKt.NO_Float_VALUE - c0859i.f5399b, this);
            if (objM2299b != enumC7794a) {
                objM2299b = a0Var;
            }
            if (objM2299b == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        ((e1) scrollCaptureCallbackC0854d.f5385c.f5403b).setValue(Boolean.FALSE);
        ((Runnable) this.f2962d).run();
        return a0Var;
    }

    /* renamed from: j */
    private final Object m1413j(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8203d c8203d = ((C2100l) this.f2961c).f36255e;
            C0407j c0407j = new C0407j((l7.a0) this.f2962d, 1);
            this.f2960b = 1;
            if (c8203d.collect(c0407j, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: k */
    private final Object m1414k(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8203d c8203d = ((C1750l) this.f2961c).f36255e;
            C0407j c0407j = new C0407j((l7.a0) this.f2962d, 2);
            this.f2960b = 1;
            if (c8203d.collect(c0407j, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: l */
    private final Object m1415l(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        if (i10 == 0) {
            od.m10798c(obj);
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f2961c;
            InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f2962d;
            this.f2960b = 1;
            if (interfaceC2141e.invoke(interfaceC7266z, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: m */
    private final Object m1416m(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8203d c8203d = ((C2088f) this.f2961c).f36255e;
            C1737d c1737d = new C1737d(0, (InterfaceC2139c) this.f2962d);
            this.f2960b = 1;
            if (c8203d.collect(c1737d, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: n */
    private final Object m1417n(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        if (i10 == 0) {
            od.m10798c(obj);
            InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f2961c;
            if ((interfaceC3307i instanceof C3306h) || (interfaceC3307i instanceof C3305g) || (interfaceC3307i instanceof C3303e)) {
                C4531c c4531c = ((C1750l) this.f2962d).f8477p;
                this.f2960b = 1;
                if (c4531c.m9380d(this) == enumC7794a) {
                    return enumC7794a;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: o */
    private final Object m1418o(Object obj) {
        Object value;
        C1750l c1750l = (C1750l) this.f2962d;
        Throwable th2 = (Throwable) this.f2961c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f2960b;
        if (i10 == 0) {
            od.m10798c(obj);
            c1750l.f8470i.m16235j(th2);
            this.f2961c = null;
            this.f2960b = 1;
            if (tx.c0.m13489l(200L, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        m1 m1Var = c1750l.f8475n;
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C6274k.m12278a((C6274k) value, null, false, null, null, null, null, false, false, false, false, false, false, 0, false, true, 129535)));
        return qw.a0.f30746a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r1.mo14775g(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r1.mo14775g(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return r2;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1419p(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2961c
            dr.y r0 = (dr.C1775y) r0
            vx.h r1 = r0.f8640w
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r6.f2960b
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            og.od.m10798c(r7)
            goto L51
        L1f:
            og.od.m10798c(r7)
            wx.w0 r7 = r0.f8636s
            wx.k1 r7 = r7.f39340a
            java.lang.Object r7 = r7.getValue()
            br.c r7 = (br.C0740c) r7
            boolean r7 = r7.f4686t
            if (r7 == 0) goto L46
            ln.g r7 = r0.f8633p
            im.p1 r0 = im.p1.MESSAGE_TEMPLATE_CALL_LOG_DATA
            java.lang.Object r3 = r6.f2962d
            rt.a r3 = (rt.C6617a) r3
            r7.m9337b(r0, r3)
            iq.a r7 = iq.EnumC3343a.NavigateToMessageTemplate
            r6.f2960b = r5
            java.lang.Object r7 = r1.mo14775g(r7, r6)
            if (r7 != r2) goto L51
            goto L50
        L46:
            iq.a r7 = iq.EnumC3343a.SubscriptionExpaired
            r6.f2960b = r4
            java.lang.Object r7 = r1.mo14775g(r7, r6)
            if (r7 != r2) goto L51
        L50:
            return r2
        L51:
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C0372k.m1419p(java.lang.Object):java.lang.Object");
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f2959a) {
            case 0:
                C0372k c0372k = new C0372k((Exception) this.f2962d, interfaceC7559c, 0);
                c0372k.f2961c = obj;
                return c0372k;
            case 1:
                return new C0372k((C4791b) this.f2961c, (CallRecordingNotificationActionService) this.f2962d, interfaceC7559c, 1);
            case 2:
                return new C0372k((FCMMessageService) this.f2961c, (C8089o) this.f2962d, interfaceC7559c, 2);
            case 3:
                return new C0372k((C0737q) this.f2961c, (l7.a0) this.f2962d, interfaceC7559c, 3);
            case 4:
                return new C0372k((CallNotesTemplatesWorkManager) this.f2961c, (C4168z) this.f2962d, interfaceC7559c, 4);
            case 5:
                C0372k c0372k2 = new C0372k((RetrieveWebSubscriptionWorkManager) this.f2962d, interfaceC7559c, 5);
                c0372k2.f2961c = obj;
                return c0372k2;
            case 6:
                return new C0372k((InterfaceC2141e) this.f2961c, (C0627v) this.f2962d, interfaceC7559c, 6);
            case 7:
                return new C0372k((InterfaceC2141e) this.f2961c, (C4168z) this.f2962d, interfaceC7559c, 7);
            case 8:
                return new C0372k((InterfaceC3307i) this.f2961c, (C0737q) this.f2962d, interfaceC7559c, 8);
            case 9:
                C0372k c0372k3 = new C0372k((C0737q) this.f2962d, interfaceC7559c, 9);
                c0372k3.f2961c = obj;
                return c0372k3;
            case 10:
                C0372k c0372k4 = new C0372k((C0751i) this.f2962d, interfaceC7559c, 10);
                c0372k4.f2961c = obj;
                return c0372k4;
            case 11:
                return new C0372k((C0751i) this.f2961c, (ArrayList) this.f2962d, interfaceC7559c, 11);
            case 12:
                return new C0372k((C0751i) this.f2961c, (SaveLeadRequest) this.f2962d, interfaceC7559c, 12);
            case 13:
                return new C0372k((C1813s) this.f2961c, (l7.a0) this.f2962d, interfaceC7559c, 13);
            case 14:
                return new C0372k(this.f2960b, (C1813s) this.f2961c, (String) this.f2962d, interfaceC7559c);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0372k c0372k5 = new C0372k((C0790h) this.f2962d, interfaceC7559c, 15);
                c0372k5.f2961c = obj;
                return c0372k5;
            case 16:
                return new C0372k((C0790h) this.f2961c, (AbstractC9092v) this.f2962d, interfaceC7559c, 16);
            case 17:
                return new C0372k((C0790h) this.f2961c, (C6617a) this.f2962d, interfaceC7559c, 17);
            case 18:
                return new C0372k((C0790h) this.f2962d, interfaceC7559c, 18);
            case 19:
                return new C0372k((C0790h) this.f2961c, (C1502a) this.f2962d, interfaceC7559c, 19);
            case 20:
                return new C0372k((C0790h) this.f2962d, interfaceC7559c, 20);
            case 21:
                return new C0372k((ScrollCaptureCallbackC0854d) this.f2961c, (Runnable) this.f2962d, interfaceC7559c, 21);
            case 22:
                return new C0372k((C2100l) this.f2961c, (l7.a0) this.f2962d, interfaceC7559c, 22);
            case 23:
                return new C0372k((C1750l) this.f2961c, (l7.a0) this.f2962d, interfaceC7559c, 23);
            case 24:
                C0372k c0372k6 = new C0372k((InterfaceC2141e) this.f2962d, interfaceC7559c, 24);
                c0372k6.f2961c = obj;
                return c0372k6;
            case 25:
                return new C0372k((C2088f) this.f2961c, (InterfaceC2139c) this.f2962d, interfaceC7559c, 25);
            case 26:
                return new C0372k((InterfaceC3307i) this.f2961c, (C1750l) this.f2962d, interfaceC7559c, 26);
            case 27:
                C0372k c0372k7 = new C0372k((C1750l) this.f2962d, interfaceC7559c, 27);
                c0372k7.f2961c = obj;
                return c0372k7;
            case 28:
                return new C0372k((C1775y) this.f2961c, (C6617a) this.f2962d, interfaceC7559c, 28);
            default:
                return new C0372k((C1775y) this.f2961c, (AbstractC7523p) this.f2962d, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2959a) {
            case 14:
                C0372k c0372k = (C0372k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c0372k.invokeSuspend(a0Var);
                break;
        }
        return ((C0372k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x07ed, code lost:
    
        if (tx.c0.m13489l(1000, r94) != r11) goto L116;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r95) {
        /*
            Method dump skipped, instructions count: 3116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C0372k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0372k(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f2959a = i10;
        this.f2961c = obj;
        this.f2962d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0372k(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f2959a = i10;
        this.f2962d = obj;
    }
}
