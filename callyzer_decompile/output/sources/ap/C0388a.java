package ap;

import ab.C0084b;
import al.C0182j;
import an.j2;
import android.content.Context;
import android.net.Uri;
import ao.AbstractC0366e;
import ao.C0362a;
import ao.C0363b;
import ao.C0364c;
import ao.C0365d;
import aq.C0406i;
import av.C0459b;
import ay.C0496f;
import ay.ExecutorC0495e;
import bq.C0723c;
import bq.C0737q;
import br.C0738a;
import br.C0740c;
import br.C0742e;
import bv.C0790h;
import c9.C0922q;
import cm.C0983a;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import com.websoptimization.callyzerbiz.data.model.response.lead.AssignEmployeeDetailsResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import com.websoptimization.callyzerbiz.services.CallMonitorService;
import com.websoptimization.callyzerbiz.ui.more.contact_us_form.model.ContactUsForm;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import com.websoptimization.callyzerbiz.workManager.RecordingUploadManager;
import com.websoptimization.callyzerbiz.workManager.SubmitContactUsFormWorkManager;
import com.websoptimization.callyzerbiz.workManager.SyncCallLogNotificationManager;
import cr.C1479a;
import cs.C1483b;
import dq.C1741c;
import dq.C1750l;
import dr.C1770t;
import dr.C1775y;
import en.C2073f;
import ep.C2088f;
import eq.C2100l;
import er.C2104d;
import es.C2128e;
import ex.InterfaceC2141e;
import fo.C2348l;
import fr.C2369a;
import fs.C2371b;
import ft.C2372a;
import g2.ta;
import gp.C2703n;
import gr.C2713i;
import gs.C2715a;
import gs.C2724j;
import gs.C2728n;
import gt.C2729a;
import im.C3302d;
import im.C3303e;
import im.C3305g;
import im.C3306h;
import im.InterfaceC3307i;
import im.j0;
import im.k0;
import im.l0;
import im.m0;
import im.p1;
import ip.C3333c;
import ip.C3342l;
import is.C3348b;
import iv.C3357a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jp.C3830k;
import js.C3850f;
import jt.C3856e;
import k2.w0;
import kk.C4088h;
import kk.C4089i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;
import ks.C4212a;
import ks.C4218g;
import ks.C4223l;
import ks.c0;
import kv.C4252f;
import lm.AbstractC4487b;
import lm.C4486a;
import ln.C4494g;
import lp.C4505g;
import lq.C4507b;
import mm.C4799j;
import mm.C4802m;
import mq.C4839g;
import mq.h0;
import og.hb;
import og.od;
import og.pe;
import og.wc;
import org.bouncycastle.iana.AEADAlgorithm;
import qp.C6265b;
import qp.C6266c;
import qp.C6268e;
import qp.C6274k;
import qr.AbstractC6297u;
import qr.C6294r;
import qr.C6295s;
import qr.C6296t;
import qw.C6361k;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import rw.C6669s;
import s6.C6763b;
import s6.C6765d;
import t8.C7062h;
import t8.EnumC7068n;
import tq.EnumC7204p;
import tx.C7257q;
import tx.InterfaceC7266z;
import tx.b0;
import tx.z0;
import u2.C7323t;
import u8.C7368p;
import uo.C7476a;
import uo.C7481f;
import ur.g0;
import uw.C7560d;
import uw.InterfaceC7559c;
import uw.InterfaceC7561e;
import uw.InterfaceC7562f;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import xm.C8418z;
import xm.y5;
import ym.C8700k;
import yv.C8791f;
import yv.C8801p;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;
import zu.C9084n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ap.a */
/* loaded from: classes3.dex */
public final class C0388a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3081a;

    /* renamed from: b */
    public /* synthetic */ Object f3082b;

    /* renamed from: c */
    public final /* synthetic */ Object f3083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0388a(InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3081a = 5;
        this.f3083c = (AbstractC8199i) interfaceC2141e;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3081a) {
            case 0:
                C0388a c0388a = new C0388a((CallMonitorService) this.f3083c, interfaceC7559c, 0);
                c0388a.f3082b = obj;
                return c0388a;
            case 1:
                return new C0388a((C0737q) this.f3082b, (Integer) this.f3083c, interfaceC7559c, 1);
            case 2:
                return new C0388a((RecordingCompressManager) this.f3082b, (ArrayList) this.f3083c, interfaceC7559c, 2);
            case 3:
                return new C0388a((RecordingUploadManager) this.f3082b, (List) this.f3083c, interfaceC7559c, 3);
            case 4:
                C0388a c0388a2 = new C0388a((SyncCallLogNotificationManager) this.f3083c, interfaceC7559c, 4);
                c0388a2.f3082b = obj;
                return c0388a2;
            case 5:
                C0388a c0388a3 = new C0388a((AbstractC8199i) this.f3083c, interfaceC7559c);
                c0388a3.f3082b = obj;
                return c0388a3;
            case 6:
                C0388a c0388a4 = new C0388a((C0790h) this.f3083c, interfaceC7559c, 6);
                c0388a4.f3082b = obj;
                return c0388a4;
            case 7:
                return new C0388a((C1750l) this.f3082b, (Integer) this.f3083c, interfaceC7559c, 7);
            case 8:
                return new C0388a((InterfaceC7266z) this.f3082b, (ta) this.f3083c, interfaceC7559c, 8);
            case 9:
                return new C0388a((C1775y) this.f3082b, (List) this.f3083c, interfaceC7559c, 9);
            case 10:
                C0388a c0388a5 = new C0388a((C2088f) this.f3083c, interfaceC7559c, 10);
                c0388a5.f3082b = obj;
                return c0388a5;
            case 11:
                return new C0388a((ArrayList) this.f3082b, (C2088f) this.f3083c, interfaceC7559c, 11);
            case 12:
                return new C0388a((InterfaceC3307i) this.f3082b, (C2100l) this.f3083c, interfaceC7559c, 12);
            case 13:
                return new C0388a((C2713i) this.f3082b, (Integer) this.f3083c, interfaceC7559c, 13);
            case 14:
                return new C0388a((C2703n) this.f3082b, (Integer) this.f3083c, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0388a c0388a6 = new C0388a((C2724j) this.f3083c, interfaceC7559c, 15);
                c0388a6.f3082b = obj;
                return c0388a6;
            case 16:
                C0388a c0388a7 = new C0388a((C2728n) this.f3083c, interfaceC7559c, 16);
                c0388a7.f3082b = obj;
                return c0388a7;
            case 17:
                return new C0388a((C2728n) this.f3082b, (hb) this.f3083c, interfaceC7559c, 17);
            case 18:
                return new C0388a((Context) this.f3082b, (PhoneStateReceiver) this.f3083c, interfaceC7559c, 18);
            case 19:
                return new C0388a((C3342l) this.f3082b, (Integer) this.f3083c, interfaceC7559c, 19);
            case 20:
                return new C0388a((h0) this.f3082b, (Integer) this.f3083c, interfaceC7559c, 20);
            case 21:
                return new C0388a((w0) this.f3082b, (C4181k) this.f3083c, interfaceC7559c, 21);
            case 22:
                C0388a c0388a8 = new C0388a((C3856e) this.f3083c, interfaceC7559c, 22);
                c0388a8.f3082b = obj;
                return c0388a8;
            case 23:
                return new C0388a((C3856e) this.f3082b, (ContactUsForm) this.f3083c, interfaceC7559c, 23);
            case 24:
                C0388a c0388a9 = new C0388a((C6765d) this.f3083c, interfaceC7559c, 24);
                c0388a9.f3082b = obj;
                return c0388a9;
            case 25:
                C0388a c0388a10 = new C0388a((C4223l) this.f3083c, interfaceC7559c, 25);
                c0388a10.f3082b = obj;
                return c0388a10;
            case 26:
                return new C0388a((c0) this.f3082b, (List) this.f3083c, interfaceC7559c, 26);
            case 27:
                return new C0388a((List) this.f3082b, (C7323t) this.f3083c, interfaceC7559c, 27);
            case 28:
                C0388a c0388a11 = new C0388a((C4252f) this.f3083c, interfaceC7559c, 28);
                c0388a11.f3082b = obj;
                return c0388a11;
            default:
                return new C0388a((ArrayList) this.f3082b, (C4505g) this.f3083c, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3081a) {
            case 0:
                C0388a c0388a = (C0388a) create((C2073f) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c0388a.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C0388a c0388a2 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c0388a2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                C0388a c0388a3 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c0388a3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                C0388a c0388a4 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c0388a4.invokeSuspend(a0Var4);
                return a0Var4;
            case 4:
                C0388a c0388a5 = (C0388a) create((AbstractC0366e) obj, (InterfaceC7559c) obj2);
                a0 a0Var5 = a0.f30746a;
                c0388a5.invokeSuspend(a0Var5);
                return a0Var5;
            case 5:
                return ((C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 6:
                C0388a c0388a6 = (C0388a) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var6 = a0.f30746a;
                c0388a6.invokeSuspend(a0Var6);
                return a0Var6;
            case 7:
                C0388a c0388a7 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var7 = a0.f30746a;
                c0388a7.invokeSuspend(a0Var7);
                return a0Var7;
            case 8:
                C0388a c0388a8 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var8 = a0.f30746a;
                c0388a8.invokeSuspend(a0Var8);
                return a0Var8;
            case 9:
                C0388a c0388a9 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var9 = a0.f30746a;
                c0388a9.invokeSuspend(a0Var9);
                return a0Var9;
            case 10:
                C0388a c0388a10 = (C0388a) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var10 = a0.f30746a;
                c0388a10.invokeSuspend(a0Var10);
                return a0Var10;
            case 11:
                C0388a c0388a11 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var11 = a0.f30746a;
                c0388a11.invokeSuspend(a0Var11);
                return a0Var11;
            case 12:
                C0388a c0388a12 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var12 = a0.f30746a;
                c0388a12.invokeSuspend(a0Var12);
                return a0Var12;
            case 13:
                C0388a c0388a13 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var13 = a0.f30746a;
                c0388a13.invokeSuspend(a0Var13);
                return a0Var13;
            case 14:
                C0388a c0388a14 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var14 = a0.f30746a;
                c0388a14.invokeSuspend(a0Var14);
                return a0Var14;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0388a c0388a15 = (C0388a) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var15 = a0.f30746a;
                c0388a15.invokeSuspend(a0Var15);
                return a0Var15;
            case 16:
                C0388a c0388a16 = (C0388a) create((m0) obj, (InterfaceC7559c) obj2);
                a0 a0Var16 = a0.f30746a;
                c0388a16.invokeSuspend(a0Var16);
                return a0Var16;
            case 17:
                C0388a c0388a17 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var17 = a0.f30746a;
                c0388a17.invokeSuspend(a0Var17);
                return a0Var17;
            case 18:
                C0388a c0388a18 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var18 = a0.f30746a;
                c0388a18.invokeSuspend(a0Var18);
                return a0Var18;
            case 19:
                C0388a c0388a19 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var19 = a0.f30746a;
                c0388a19.invokeSuspend(a0Var19);
                return a0Var19;
            case 20:
                C0388a c0388a20 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var20 = a0.f30746a;
                c0388a20.invokeSuspend(a0Var20);
                return a0Var20;
            case 21:
                C0388a c0388a21 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var21 = a0.f30746a;
                c0388a21.invokeSuspend(a0Var21);
                return a0Var21;
            case 22:
                C0388a c0388a22 = (C0388a) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var22 = a0.f30746a;
                c0388a22.invokeSuspend(a0Var22);
                return a0Var22;
            case 23:
                C0388a c0388a23 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var23 = a0.f30746a;
                c0388a23.invokeSuspend(a0Var23);
                return a0Var23;
            case 24:
                C0388a c0388a24 = (C0388a) create((C6763b) obj, (InterfaceC7559c) obj2);
                a0 a0Var24 = a0.f30746a;
                c0388a24.invokeSuspend(a0Var24);
                return a0Var24;
            case 25:
                C0388a c0388a25 = (C0388a) create((EnumC7204p) obj, (InterfaceC7559c) obj2);
                a0 a0Var25 = a0.f30746a;
                c0388a25.invokeSuspend(a0Var25);
                return a0Var25;
            case 26:
                C0388a c0388a26 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var26 = a0.f30746a;
                c0388a26.invokeSuspend(a0Var26);
                return a0Var26;
            case 27:
                C0388a c0388a27 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var27 = a0.f30746a;
                c0388a27.invokeSuspend(a0Var27);
                return a0Var27;
            case 28:
                C0388a c0388a28 = (C0388a) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var28 = a0.f30746a;
                c0388a28.invokeSuspend(a0Var28);
                return a0Var28;
            default:
                C0388a c0388a29 = (C0388a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var29 = a0.f30746a;
                c0388a29.invokeSuspend(a0Var29);
                return a0Var29;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9, types: [es.e] */
    /* JADX WARN: Type inference failed for: r9v1, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        C0740c c0740c;
        C0738a c0738a;
        Object obj2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        InterfaceC7559c interfaceC7559c;
        ?? c2128e;
        List<AssignEmployeeDetailsResponse> listM4914a;
        Object obj3;
        Object obj4;
        Object value7;
        C2729a c2729a;
        String str;
        String str2;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        int i10 = this.f3081a;
        int i11 = 6;
        int i12 = 10;
        int i13 = 5;
        boolean z6 = true;
        int i14 = 3;
        int i15 = 0;
        InterfaceC7559c interfaceC7559c2 = null;
        a0 a0Var = a0.f30746a;
        Object obj5 = this.f3083c;
        switch (i10) {
            case 0:
                CallMonitorService callMonitorService = (CallMonitorService) obj5;
                C2073f c2073f = (C2073f) this.f3082b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (c2073f.f9692g) {
                    callMonitorService.m5033c().m16231f("CallMonitorService - stop self");
                    callMonitorService.stopSelf();
                }
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C0737q c0737q = (C0737q) this.f3082b;
                C6274k c6274k = (C6274k) c0737q.f4650o.f39340a.getValue();
                if (!c6274k.f30475j && !c6274k.f30467b && ((Integer) obj5).intValue() >= c6274k.f30466a.size() - 5) {
                    C0496f c0496f = tx.m0.f34659a;
                    tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C0723c(c0737q, null, i14), 3);
                }
                return a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((RecordingCompressManager) this.f3082b).f7454c.f31522d.m15651B(new C3302d((ArrayList) obj5));
                return a0Var;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((RecordingUploadManager) this.f3082b).f7481f.m15308k(new C3302d((List) obj5));
                return a0Var;
            case 4:
                SyncCallLogNotificationManager syncCallLogNotificationManager = (SyncCallLogNotificationManager) obj5;
                C8805t c8805t = syncCallLogNotificationManager.f7509b;
                C8810d c8810d = syncCallLogNotificationManager.f7519l;
                AbstractC0366e abstractC0366e = (AbstractC0366e) this.f3082b;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC0366e instanceof C0362a) {
                    tx.c0.m13502y(c8810d, null, null, new aw.h0(syncCallLogNotificationManager, null), 3);
                } else if (abstractC0366e instanceof C0363b) {
                    tx.c0.m13502y(c8810d, null, null, new aw.h0(syncCallLogNotificationManager, null), 3);
                    c8805t.m16232g("SyncNotificationManager", "fetch callLog error occurs :- " + ((C0363b) abstractC0366e).f2916a);
                } else if (abstractC0366e instanceof C0364c) {
                    tx.c0.m13502y(c8810d, null, null, new aw.h0(syncCallLogNotificationManager, null), 3);
                } else {
                    if (!(abstractC0366e instanceof C0365d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c8805t.m16232g("SyncNotificationManager", "retrieveContact: Progress := " + ((C0365d) abstractC0366e).f2945a);
                }
                return a0Var;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC7562f interfaceC7562fO0 = ((InterfaceC7266z) this.f3082b).mo1865w().o0(C7560d.f36439a);
                AbstractC4154l.m8920c(interfaceC7562fO0);
                InterfaceC7561e interfaceC7561e = (InterfaceC7561e) interfaceC7562fO0;
                C7257q c7257q = new C7257q(true);
                InterfaceC7559c interfaceC7559c3 = null;
                c7257q.m13554M(null);
                tx.c0.m13501x(z0.f34701a, interfaceC7561e, b0.UNDISPATCHED, new C0406i(c7257q, (InterfaceC2141e) obj5, (InterfaceC7559c) null));
                while (!c7257q.m13556O()) {
                    try {
                        return tx.c0.m13468D(interfaceC7561e, new C0084b(c7257q, interfaceC7559c3, i11));
                    } catch (InterruptedException unused) {
                        interfaceC7559c3 = null;
                    }
                }
                return c7257q.m13550C();
            case 6:
                C8801p c8801p = (C8801p) this.f3082b;
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C0790h c0790h = (C0790h) obj5;
                wx.w0 w0Var = c0790h.f5004p;
                m1 m1Var = c0790h.f5003o;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C0459b.m1461a((C0459b) value, null, null, null, null, null, null, false, null, c8801p.f42464a, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -2049, 4095)));
                if (c8801p.f42464a && ((C0459b) w0Var.f39340a.getValue()).f3272L) {
                    if (((C0459b) w0Var.f39340a.getValue()).f3278a.f27207m == null && ((C0459b) w0Var.f39340a.getValue()).f3290m == -1) {
                        c0790h.f4994f.m16232g("NotePopUp", "No SIM Number when internet connected");
                    } else {
                        c0790h.m2119j(C9084n.f43616a);
                    }
                }
                return a0Var;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C1750l c1750l = (C1750l) this.f3082b;
                C6274k c6274k2 = (C6274k) c1750l.f8476o.f39340a.getValue();
                if (!c6274k2.f30475j && !c6274k2.f30467b && ((Integer) obj5).intValue() >= c6274k2.f30466a.size() - 5) {
                    C0496f c0496f2 = tx.m0.f34659a;
                    tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C1741c(c1750l, null, i14), 3);
                }
                return a0Var;
            case 8:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y((InterfaceC7266z) this.f3082b, null, null, new C0084b((ta) obj5, null, 9), 3);
                return a0Var;
            case 9:
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = ((C1775y) this.f3082b).f8635r;
                List list = (List) obj5;
                do {
                    value2 = m1Var2.getValue();
                    c0740c = (C0740c) value2;
                    C0738a c0738a2 = c0740c.f4671e;
                    Object obj6 = list.get(1);
                    AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.contact_detail.ui_model.ContactDetailAnalysisUiModel");
                    c0738a = new C0738a((C1479a) obj6);
                    obj2 = list.get(0);
                    AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.ui.contact_detail.ui_model.ContactDetailSummaryUIModel>");
                } while (!m1Var2.m15397i(value2, C0740c.m2037a(c0740c, false, null, new C0742e((List) obj2), c0738a, null, null, null, null, null, false, null, null, false, 1048549)));
                return a0Var;
            case 10:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f3082b;
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2088f c2088f = (C2088f) obj5;
                tx.c0.m13502y(c2088f.f9767j, null, null, new C1770t(interfaceC3307i, c2088f, interfaceC7559c2, i13), 3);
                return a0Var;
            case 11:
                EnumC7794a enumC7794a12 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ArrayList arrayList = (ArrayList) this.f3082b;
                C2088f c2088f2 = (C2088f) obj5;
                m1 m1Var3 = c2088f2.f9771n;
                int size = arrayList.size();
                int i16 = 0;
                int i17 = 0;
                while (i17 < size) {
                    Object obj7 = arrayList.get(i17);
                    i17++;
                    int i18 = i16 + 1;
                    if (i16 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    AbstractC6297u abstractC6297u = (AbstractC6297u) obj7;
                    abstractC6297u.m12328l();
                    if (abstractC6297u instanceof C6294r) {
                        C6294r c6294r = c2088f2.f9774q;
                        do {
                            value5 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value5, C6265b.m12270a((C6265b) value5, null, c6294r.m12314o().mo14292b(), null, c6294r.m12314o().mo14291a(), null, false, false, 245)));
                    } else if (abstractC6297u instanceof C6295s) {
                        do {
                            value4 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value4, C6265b.m12270a((C6265b) value4, null, null, null, null, null, false, c2088f2.f9773p.m12318o() == g0.YES, 127)));
                    } else if (abstractC6297u instanceof C6296t) {
                        do {
                            value3 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value3, C6265b.m12270a((C6265b) value3, null, null, c2088f2.f9775r.m12322o().f36248a, null, null, false, false, 251)));
                    }
                    i16 = i18;
                }
                return a0Var;
            case 12:
                C2100l c2100l = (C2100l) obj5;
                EnumC7794a enumC7794a13 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC3307i interfaceC3307i2 = (InterfaceC3307i) this.f3082b;
                if ((interfaceC3307i2 instanceof C3303e) || (interfaceC3307i2 instanceof C3305g) || (interfaceC3307i2 instanceof C3306h)) {
                    c2100l.m5806m(true);
                    c2100l.f9842n.m16232g("AnalyticsViewModel", "observerCallLogSyncEvent " + interfaceC3307i2);
                    C2100l.m5802i(c2100l);
                }
                return a0Var;
            case 13:
                EnumC7794a enumC7794a14 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2713i c2713i = (C2713i) this.f3082b;
                C2369a c2369a = (C2369a) c2713i.f15136k.f39340a.getValue();
                Integer num = (Integer) obj5;
                if (!c2369a.f10774d && !c2369a.f10777g && num.intValue() >= c2369a.f10771a.size() - 5) {
                    c2713i.m6713f(C2104d.f9856a);
                }
                return a0Var;
            case 14:
                EnumC7794a enumC7794a15 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2703n c2703n = (C2703n) this.f3082b;
                C6266c c6266c = (C6266c) c2703n.f15095r.f39340a.getValue();
                if (!c6266c.f30385l && !c6266c.f30375b && ((Integer) obj5).intValue() >= c6266c.f30374a.size() - 5) {
                    c2703n.m6711l(C3830k.f19782a);
                }
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C2724j c2724j = (C2724j) obj5;
                m1 m1Var4 = c2724j.f15200i;
                InterfaceC3307i interfaceC3307i3 = (InterfaceC3307i) this.f3082b;
                EnumC7794a enumC7794a16 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if ((interfaceC3307i3 instanceof C3305g) || (interfaceC3307i3 instanceof C3306h)) {
                    C8791f c8791f = C8791f.f42457a;
                    if (C8791f.m16171d((String) m1Var4.getValue())) {
                        m1 m1Var5 = c2724j.f15198g;
                        do {
                            value6 = m1Var5.getValue();
                        } while (!m1Var5.m15397i(value6, C2371b.m6058a((C2371b) value6, true, null, null, null, null, null, false, false, C6668r.f31943a, null, 3070)));
                        Object value12 = m1Var4.getValue();
                        AbstractC4154l.m8920c(value12);
                        c2724j.m6726f((String) value12);
                    }
                }
                return a0Var;
            case 16:
                m0 m0Var = (m0) this.f3082b;
                EnumC7794a enumC7794a17 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (!AbstractC4154l.m8918a(m0Var, j0.f17562a) && !AbstractC4154l.m8918a(m0Var, k0.f17564a)) {
                    if (!(m0Var instanceof l0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C2728n c2728n = (C2728n) obj5;
                    Leads leads = ((l0) m0Var).f17565a;
                    m1 m1Var6 = c2728n.f15224m;
                    while (true) {
                        Object value13 = m1Var6.getValue();
                        C2371b c2371b = (C2371b) value13;
                        C2128e c2128e2 = c2371b.f10792f;
                        if (c2128e2 != null) {
                            List listM4922i = leads.m4922i();
                            boolean zM4915b = leads.m4915b();
                            ?? arrayList2 = C6668r.f31943a;
                            if (!zM4915b && (listM4914a = leads.m4914a()) != null) {
                                arrayList2 = new ArrayList(AbstractC6664n.m12768r(listM4914a, i12));
                                for (AssignEmployeeDetailsResponse assignEmployeeDetailsResponse : listM4914a) {
                                    arrayList2.add(assignEmployeeDetailsResponse.m4902d() + "\n+" + assignEmployeeDetailsResponse.m4899a() + assignEmployeeDetailsResponse.m4901c());
                                    interfaceC7559c2 = interfaceC7559c2;
                                }
                            }
                            interfaceC7559c = interfaceC7559c2;
                            List list2 = arrayList2;
                            C2348l c2348l = c2728n.f15214c;
                            Map mapM4926m = leads.m4926m();
                            c2348l.getClass();
                            ArrayList arrayListM6041a = C2348l.m6041a(mapM4926m);
                            String strM4929p = leads.m4929p();
                            Integer numM4928o = leads.m4928o();
                            boolean zM4915b2 = leads.m4915b();
                            String primaryNumber = leads.m4925l();
                            String leadNumber = leads.m4925l();
                            int iM4916c = leads.m4916c();
                            Boolean boolValueOf = Boolean.valueOf(zM4915b2);
                            String str3 = c2128e2.f9950e;
                            String str4 = c2128e2.f9956k;
                            String str5 = c2128e2.f9957l;
                            String str6 = c2128e2.f9959n;
                            List list3 = c2128e2.f9960o;
                            String serialNumber = c2128e2.f9961p;
                            AbstractC4154l.m8923f(primaryNumber, "primaryNumber");
                            AbstractC4154l.m8923f(leadNumber, "leadNumber");
                            AbstractC4154l.m8923f(serialNumber, "serialNumber");
                            c2128e = new C2128e(leads, primaryNumber, leadNumber, iM4916c, str3, numM4928o, strM4929p, listM4922i, boolValueOf, list2, str4, str5, arrayListM6041a, str6, list3, serialNumber);
                        } else {
                            interfaceC7559c = interfaceC7559c2;
                            c2128e = interfaceC7559c;
                        }
                        String strM4918e = leads.m4918e();
                        String strM4921h = leads.m4921h();
                        if (strM4921h == null) {
                            strM4921h = "";
                        }
                        if (!m1Var6.m15397i(value13, C2371b.m6058a(c2371b, false, null, null, i0.m0.m7379l(strM4918e, " ", strM4921h), c2128e, null, false, false, null, null, 4047))) {
                            interfaceC7559c2 = interfaceC7559c;
                            i12 = 10;
                        }
                    }
                }
                return a0Var;
            case 17:
                EnumC7794a enumC7794a18 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2728n c2728n2 = (C2728n) this.f3082b;
                wx.w0 w0Var2 = c2728n2.f15225n;
                C4494g c4494g = c2728n2.f15217f;
                List list4 = (List) c4494g.m9336a(p1.LEAD_NUMBERS_LIST);
                ArrayList arrayListD0 = list4 != null ? AbstractC6663m.d0(list4) : new ArrayList();
                C4799j c4799j = new C4799j(((C2371b) w0Var2.f39340a.getValue()).f10790d, ((C1483b) ((hb) obj5)).f7561b, c2728n2.f15220i, ((C2371b) w0Var2.f39340a.getValue()).f10791e);
                if (arrayListD0.isEmpty()) {
                    arrayListD0.add(c4799j);
                } else {
                    int size2 = arrayListD0.size();
                    while (i15 < size2) {
                        Object obj8 = arrayListD0.get(i15);
                        i15++;
                        if (AbstractC4154l.m8918a(((C4799j) obj8).f23881a, c4799j.f23881a)) {
                        }
                    }
                    arrayListD0.add(c4799j);
                }
                c4494g.m9337b(p1.LEAD_NUMBERS_LIST, arrayListD0);
                return a0Var;
            case 18:
                EnumC7794a enumC7794a19 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                AtomicBoolean atomicBoolean = AbstractC4487b.f22326a;
                Context context = (Context) this.f3082b;
                PhoneStateReceiver phoneStateReceiver = (PhoneStateReceiver) obj5;
                InterfaceC7266z interfaceC7266zM4601k = phoneStateReceiver.m4601k();
                C8805t c8805tM4605o = phoneStateReceiver.m4605o();
                C7481f c7481f = phoneStateReceiver.f7293m;
                if (c7481f == null) {
                    AbstractC4154l.m8928k("simVerificationUseCase");
                    throw null;
                }
                C7476a c7476a = phoneStateReceiver.f7294n;
                if (c7476a == null) {
                    AbstractC4154l.m8928k("callDetailVerificationUseCase");
                    throw null;
                }
                C8418z c8418zM4599i = phoneStateReceiver.m4599i();
                y5 y5Var = phoneStateReceiver.f7297q;
                if (y5Var != null) {
                    AbstractC4487b.m9333a(context, interfaceC7266zM4601k, new C4486a(c8805tM4605o, c7481f, c7476a, c8418zM4599i, y5Var, new C2715a(phoneStateReceiver, interfaceC7559c2, i11), new j2(18, phoneStateReceiver)));
                    return a0Var;
                }
                AbstractC4154l.m8928k("simDetailRepository");
                throw null;
            case 19:
                EnumC7794a enumC7794a20 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C3342l c3342l = (C3342l) this.f3082b;
                C6266c c6266c2 = (C6266c) c3342l.f17699o.f39340a.getValue();
                if (!c6266c2.f30385l && !c6266c2.f30375b && ((Integer) obj5).intValue() >= c6266c2.f30374a.size() - 5) {
                    C0496f c0496f3 = tx.m0.f34659a;
                    tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C3333c(c3342l, interfaceC7559c2, i14), 3);
                }
                return a0Var;
            case 20:
                EnumC7794a enumC7794a21 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                h0 h0Var = (h0) this.f3082b;
                C4507b c4507b = (C4507b) h0Var.f24253A.f39340a.getValue();
                Integer num2 = (Integer) obj5;
                if (!c4507b.f22419a && num2.intValue() >= 0 && !c4507b.f22423e && num2.intValue() >= c4507b.f22424f - 5) {
                    h0Var.m9801m(C4839g.f24228a);
                }
                return a0Var;
            case 21:
                EnumC7794a enumC7794a22 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0 w0Var3 = (w0) this.f3082b;
                if (w0Var3.getValue() != null) {
                    w0Var3.setValue((C4181k) obj5);
                }
                return a0Var;
            case 22:
                List<C4802m> list5 = (List) this.f3082b;
                EnumC7794a enumC7794a23 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(list5, 10));
                for (C4802m c4802m : list5) {
                    int i19 = c4802m.f23893e;
                    String str7 = c4802m.f23896h;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = c4802m.f23891c;
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList3.add(new C2372a(str7, i19, c4802m.f23892d, str8));
                }
                int size3 = arrayList3.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size3) {
                        obj3 = arrayList3.get(i20);
                        i20++;
                        if (((C2372a) obj3).f10799a == 1) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                C2372a c2372a = (C2372a) obj3;
                if (c2372a == null) {
                    c2372a = (C2372a) AbstractC6663m.m12743G(arrayList3);
                }
                ArrayList arrayListM11031a = wc.m11031a();
                int size4 = arrayListM11031a.size();
                while (true) {
                    if (i15 < size4) {
                        obj4 = arrayListM11031a.get(i15);
                        i15++;
                        if (((C0983a) obj4).f5813b.equals("+" + (c2372a != null ? String.valueOf(c2372a.f10802d) : null))) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                C0983a c0983a = (C0983a) obj4;
                if (c0983a == null) {
                    c0983a = new C0983a("tr", 14, null, null);
                }
                C0983a c0983a2 = c0983a;
                m1 m1Var7 = ((C3856e) obj5).f19853i;
                do {
                    value7 = m1Var7.getValue();
                    c2729a = (C2729a) value7;
                    String str9 = c2372a != null ? c2372a.f10800b : null;
                    str = str9 == null ? "" : str9;
                    str2 = c2372a != null ? c2372a.f10801c : null;
                } while (!m1Var7.m15397i(value7, C2729a.m6728a(c2729a, null, null, false, str, null, false, str2 == null ? "" : str2, null, false, c2372a != null ? c2372a.f10802d : 90, null, null, false, null, false, null, null, null, c0983a2, false, 3145143)));
                return a0Var;
            case 23:
                EnumC7794a enumC7794a24 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C9000c c9000c = ((C3856e) this.f3082b).f19847c;
                c9000c.getClass();
                C4089i c4089i = new C4089i();
                c4089i.m8865b(Uri.class, new C8700k());
                C4088h c4088hM8864a = c4089i.m8864a();
                C0182j c0182j = new C0182j(SubmitContactUsFormWorkManager.class);
                C6361k[] c6361kArr = {new C6361k("formData", c4088hM8864a.m8861h((ContactUsForm) obj5))};
                C7062h c7062h = new C7062h(0);
                C6361k c6361k = c6361kArr[0];
                c7062h.m13359b((String) c6361k.f30755a, c6361k.f30756b);
                ((C0922q) c0182j.f556c).f5626e = c7062h.m13358a();
                c0182j.m410a("submit_feedback");
                C7368p.m13783g(c9000c.f43353a).m13355c("submit_feedback", EnumC7068n.REPLACE, c0182j.m411b());
                return a0Var;
            case 24:
                C6763b c6763b = (C6763b) this.f3082b;
                EnumC7794a enumC7794a25 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c6763b.m12967d((C6765d) obj5);
                return a0Var;
            case 25:
                EnumC7204p enumC7204p = (EnumC7204p) this.f3082b;
                EnumC7794a enumC7794a26 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C4223l c4223l = (C4223l) obj5;
                m1 m1Var8 = c4223l.f21456p;
                if (((C3348b) m1Var8.getValue()).f17722j != enumC7204p) {
                    while (true) {
                        Object value14 = m1Var8.getValue();
                        EnumC7204p enumC7204p2 = enumC7204p;
                        if (m1Var8.m15397i(value14, C3348b.m7669a((C3348b) value14, C6668r.f31943a, false, 0, null, 0, false, false, enumC7204p != EnumC7204p.DEFAULT, null, enumC7204p2, false, null, null, null, null, null, false, C6669s.f31944a, 523642))) {
                            tx.g0 g0Var = c4223l.f21460t;
                            if (g0Var == null) {
                                tx.c0.m13502y(c4223l.f21446f, null, null, new C4218g(i15, c4223l, interfaceC7559c2), 3);
                            } else {
                                g0Var.mo13510j(null);
                                tx.g0 g0Var2 = c4223l.f21460t;
                                if (g0Var2 != null) {
                                    g0Var2.v0(new C4212a(c4223l, 2));
                                }
                            }
                        } else {
                            enumC7204p = enumC7204p2;
                        }
                    }
                }
                return a0Var;
            case 26:
                EnumC7794a enumC7794a27 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0 c0Var = (c0) this.f3082b;
                C8805t c8805t2 = c0Var.f21376q;
                wx.w0 w0Var4 = c0Var.f21361C;
                List<C3850f> listC0 = AbstractC6663m.c0(((C3348b) w0Var4.f39340a.getValue()).f17713a);
                List list6 = (List) obj5;
                ArrayList arrayList4 = new ArrayList(AbstractC6664n.m12768r(list6, 10));
                Iterator it = list6.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((C3850f) it.next()).f19811a);
                }
                if (listC0.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it2 = listC0.iterator();
                    while (it2.hasNext()) {
                        if (arrayList4.contains(((C3850f) it2.next()).f19811a)) {
                        }
                    }
                    z6 = false;
                }
                c8805t2.m16237l("MyLeadViewmodel, hasAnyDuplicateLead:- " + z6 + " , pagination request page:- " + ((C3348b) w0Var4.f39340a.getValue()).f17715c + " , existing list size:- " + listC0.size() + " ");
                if (z6) {
                    for (C3850f c3850f : listC0) {
                        if (arrayList4.contains(c3850f.f19811a)) {
                            c8805t2.m16237l("MyLeadViewModel, duplicate Lead details:- leadID:- " + c3850f.f19811a + " >>> " + c3850f);
                        }
                    }
                    c8805t2.m16236k(new Exception("Duplicate lead found"));
                }
                return a0Var;
            case 27:
                EnumC7794a enumC7794a28 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C7323t c7323t = (C7323t) obj5;
                for (String str10 : (List) this.f3082b) {
                    if (!c7323t.containsKey(str10)) {
                        c7323t.put(str10, "");
                    }
                }
                return a0Var;
            case 28:
                C8801p c8801p2 = (C8801p) this.f3082b;
                EnumC7794a enumC7794a29 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var9 = ((C4252f) obj5).f21623u;
                do {
                    value8 = m1Var9.getValue();
                } while (!m1Var9.m15397i(value8, C3357a.m7671a((C3357a) value8, 0, null, null, null, null, null, null, null, false, false, null, null, null, null, c8801p2.f42464a, false, 49151)));
                return a0Var;
            default:
                EnumC7794a enumC7794a30 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ArrayList arrayList5 = (ArrayList) this.f3082b;
                C4505g c4505g = (C4505g) obj5;
                m1 m1Var10 = c4505g.f22409m;
                int size5 = arrayList5.size();
                int i21 = 0;
                int i22 = 0;
                while (i22 < size5) {
                    Object obj9 = arrayList5.get(i22);
                    i22++;
                    int i23 = i21 + 1;
                    if (i21 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    AbstractC6297u abstractC6297u2 = (AbstractC6297u) obj9;
                    abstractC6297u2.m12328l();
                    if (abstractC6297u2 instanceof C6294r) {
                        C6294r c6294r2 = c4505g.f22412p;
                        do {
                            value11 = m1Var10.getValue();
                        } while (!m1Var10.m15397i(value11, C6268e.m12272a((C6268e) value11, null, null, c6294r2.m12314o().mo14292b(), c6294r2.m12314o().mo14291a(), null, false, false, false, 243)));
                    } else if (abstractC6297u2 instanceof C6295s) {
                        do {
                            value10 = m1Var10.getValue();
                        } while (!m1Var10.m15397i(value10, C6268e.m12272a((C6268e) value10, null, null, null, null, null, false, false, c4505g.f22411o.m12318o() == g0.YES, 127)));
                    } else if (abstractC6297u2 instanceof C6296t) {
                        do {
                            value9 = m1Var10.getValue();
                        } while (!m1Var10.m15397i(value9, C6268e.m12272a((C6268e) value9, null, c4505g.f22413q.m12322o().f36248a, null, null, null, false, false, false, 253)));
                    }
                    i21 = i23;
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0388a(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3081a = i10;
        this.f3082b = obj;
        this.f3083c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0388a(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3081a = i10;
        this.f3083c = obj;
    }
}
