package u7;

import android.net.Uri;
import android.view.View;
import b2.y0;
import com.websoptimization.callyzerbiz.data.model.request.DeviceSettingRequest;
import com.websoptimization.callyzerbiz.data.model.request.FetchUpdatedCallLogsNoteRequest;
import com.websoptimization.callyzerbiz.data.model.request.FetchUpdatedCallNoteRequest;
import com.websoptimization.callyzerbiz.data.model.request.GetCallLogsRequest;
import com.websoptimization.callyzerbiz.data.model.request.LeadNumberVerificationRequest;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fn.C2336i;
import ge.C2577i;
import hn.C2987d;
import im.InterfaceC3307i;
import io.C3328c;
import java.util.ArrayList;
import k2.q1;
import kn.C4121a;
import kotlin.jvm.internal.C4168z;
import mm.C4802m;
import mm.C4803n;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import p3.InterfaceC5822t;
import qw.a0;
import tx.InterfaceC7266z;
import uo.C7485j;
import up.C7494g;
import us.C7536c;
import ut.C7546j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import w3.r0;
import w3.y1;
import w4.C7927s;
import wd.C7998f;
import wo.C8134s;
import wp.C8141g;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.k1;
import xd.C8339j;
import xm.C8418z;
import xm.b0;
import xm.s2;
import xm.x1;
import xx.C8518x;
import yv.EnumC8786a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u7.a */
/* loaded from: classes.dex */
public final class C7351a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f34984a;

    /* renamed from: b */
    public int f34985b;

    /* renamed from: c */
    public Object f34986c;

    /* renamed from: d */
    public final /* synthetic */ Object f34987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7351a(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f34984a = i10;
        this.f34986c = obj;
        this.f34987d = obj2;
    }

    /* renamed from: d */
    private final Object m13757d(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f34985b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        C2987d c2987d = ((x1) this.f34986c).f40993c;
        LeadNumberVerificationRequest leadNumberVerificationRequest = (LeadNumberVerificationRequest) this.f34987d;
        this.f34985b = 1;
        Object objM16075h = c2987d.f16127a.m16075h(leadNumberVerificationRequest.m321I(), leadNumberVerificationRequest, this);
        return objM16075h == enumC7794a ? enumC7794a : objM16075h;
    }

    /* renamed from: e */
    private final Object m13758e(Object obj) {
        s2 s2Var;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f34985b;
        if (i10 == 0) {
            od.m10798c(obj);
            s2 s2Var2 = (s2) this.f34987d;
            C2336i c2336i = s2Var2.f40819d;
            this.f34986c = s2Var2;
            this.f34985b = 1;
            Object objM6027g = c2336i.m6027g(this);
            if (objM6027g == enumC7794a) {
                return enumC7794a;
            }
            s2Var = s2Var2;
            obj = objM6027g;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s2Var = (s2) this.f34986c;
            od.m10798c(obj);
        }
        s2Var.f40826k = (EnumC8786a) obj;
        return a0.f30746a;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f34984a) {
            case 0:
                return new C7351a((C7352b) this.f34986c, (Uri) this.f34987d, interfaceC7559c, 0);
            case 1:
                return new C7351a((C3328c) this.f34986c, (GetCallLogsRequest) this.f34987d, interfaceC7559c, 1);
            case 2:
                return new C7351a((C3328c) this.f34986c, (C4802m) this.f34987d, interfaceC7559c, 2);
            case 3:
                return new C7351a((C7485j) this.f34986c, (DeviceSettingRequest) this.f34987d, interfaceC7559c, 3);
            case 4:
                return new C7351a((C7485j) this.f34987d, interfaceC7559c, 4);
            case 5:
                return new C7351a((InterfaceC3307i) this.f34986c, (C7494g) this.f34987d, interfaceC7559c, 5);
            case 6:
                return new C7351a((C7536c) this.f34987d, interfaceC7559c, 6);
            case 7:
                return new C7351a((C7546j) this.f34987d, interfaceC7559c, 7);
            case 8:
                return new C7351a((C8141g) this.f34986c, (InterfaceC2139c) this.f34987d, interfaceC7559c, 8);
            case 9:
                C7351a c7351a = new C7351a((r0) this.f34987d, interfaceC7559c, 9);
                c7351a.f34986c = obj;
                return c7351a;
            case 10:
                return new C7351a((q1) this.f34986c, (View) this.f34987d, interfaceC7559c, 10);
            case 11:
                return new C7351a((k1) this.f34986c, (y1) this.f34987d, interfaceC7559c, 11);
            case 12:
                C7351a c7351a2 = new C7351a((C7927s) this.f34987d, interfaceC7559c, 12);
                c7351a2.f34986c = obj;
                return c7351a2;
            case 13:
                return new C7351a((C7998f) this.f34986c, (C2577i) this.f34987d, interfaceC7559c, 13);
            case 14:
                return new C7351a((C8134s) this.f34986c, (C4802m) this.f34987d, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C7351a((InterfaceC3307i) this.f34986c, (C8141g) this.f34987d, interfaceC7559c, 15);
            case 16:
                C7351a c7351a3 = new C7351a((InterfaceC8209j) this.f34987d, interfaceC7559c, 16);
                c7351a3.f34986c = obj;
                return c7351a3;
            case 17:
                C7351a c7351a4 = new C7351a((C8518x) this.f34987d, interfaceC7559c, 17);
                c7351a4.f34986c = obj;
                return c7351a4;
            case 18:
                return new C7351a((InterfaceC5822t) this.f34986c, (y0) this.f34987d, interfaceC7559c, 18);
            case 19:
                C7351a c7351a5 = new C7351a((C8339j) this.f34987d, interfaceC7559c, 19);
                c7351a5.f34986c = obj;
                return c7351a5;
            case 20:
                return new C7351a((C8418z) this.f34987d, interfaceC7559c, 20);
            case 21:
                return new C7351a((x1) this.f34986c, (C4168z) this.f34987d, interfaceC7559c, 21);
            case 22:
                return new C7351a((x1) this.f34986c, (FetchUpdatedCallNoteRequest) this.f34987d, interfaceC7559c, 22);
            case 23:
                return new C7351a((x1) this.f34986c, (FetchUpdatedCallLogsNoteRequest) this.f34987d, interfaceC7559c, 23);
            case 24:
                return new C7351a((x1) this.f34986c, (ArrayList) this.f34987d, interfaceC7559c, 24);
            case 25:
                return new C7351a((x1) this.f34986c, (C4803n) this.f34987d, interfaceC7559c, 25);
            case 26:
                return new C7351a((x1) this.f34986c, (C4121a) this.f34987d, interfaceC7559c, 26);
            case 27:
                return new C7351a((x1) this.f34986c, (LeadNumberVerificationRequest) this.f34987d, interfaceC7559c, 27);
            case 28:
                return new C7351a((s2) this.f34987d, interfaceC7559c, 28);
            default:
                return new C7351a((b0) this.f34986c, (String) this.f34987d, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34984a) {
        }
        return ((C7351a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:277:0x0541, B:279:0x0545], limit reached: 521 */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0259 A[Catch: Exception -> 0x0205, TryCatch #0 {Exception -> 0x0205, blocks: (B:120:0x01ff, B:138:0x0253, B:140:0x0259, B:142:0x0274, B:143:0x0282, B:145:0x0286, B:146:0x02bb, B:126:0x020e, B:132:0x0227, B:134:0x022f, B:129:0x0217), top: B:510:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0282 A[Catch: Exception -> 0x0205, TryCatch #0 {Exception -> 0x0205, blocks: (B:120:0x01ff, B:138:0x0253, B:140:0x0259, B:142:0x0274, B:143:0x0282, B:145:0x0286, B:146:0x02bb, B:126:0x020e, B:132:0x0227, B:134:0x022f, B:129:0x0217), top: B:510:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x078b A[LOOP:1: B:398:0x078b->B:522:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:529:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:273:0x052b -> B:275:0x052e). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.C7351a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7351a(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f34984a = i10;
        this.f34987d = obj;
    }
}
