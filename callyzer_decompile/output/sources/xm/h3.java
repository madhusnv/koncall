package xm;

import android.content.Context;
import b3.C0592x;
import com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest;
import com.websoptimization.callyzerbiz.data.model.request.GetCallLogsRequest;
import com.websoptimization.callyzerbiz.data.model.request.LeadCallLogDetailsRequest;
import com.websoptimization.callyzerbiz.data.model.request.LeadNoteSaveRequest;
import com.websoptimization.callyzerbiz.data.model.request.LeadNumberVerificationRequest;
import com.websoptimization.callyzerbiz.data.model.request.RecentNotesRequest;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import im.EnumC3318t;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.iana.AEADAlgorithm;
import q1.C6097y;
import t1.AbstractC7000y;
import th.C7151a;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vx.InterfaceC7819u;
import ws.AbstractC8175p;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;
import xs.C8449k;
import xv.C8489p;
import xx.AbstractC8499e;
import xx.AbstractC8502h;
import xx.C8516v;
import y8.C8595d;
import yp.C8735o;
import yq.C8741f;
import yt.C8774f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h3 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40376a;

    /* renamed from: b */
    public int f40377b;

    /* renamed from: c */
    public Object f40378c;

    /* renamed from: d */
    public final /* synthetic */ Object f40379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40376a = i10;
        this.f40378c = obj;
        this.f40379d = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40376a) {
            case 0:
                return new h3((r3) this.f40378c, (LeadCallLogDetailsRequest) this.f40379d, interfaceC7559c, 0);
            case 1:
                return new h3((r3) this.f40378c, (RecentNotesRequest) this.f40379d, interfaceC7559c, 1);
            case 2:
                return new h3((r3) this.f40378c, (LeadNumberVerificationRequest) this.f40379d, interfaceC7559c, 2);
            case 3:
                return new h3((r3) this.f40378c, (LeadNoteSaveRequest) this.f40379d, interfaceC7559c, 3);
            case 4:
                return new h3((q4) this.f40379d, interfaceC7559c, 4);
            case 5:
                return new h3((q4) this.f40378c, this.f40379d, interfaceC7559c, 5);
            case 6:
                return new h3((q4) this.f40378c, (List) this.f40379d, interfaceC7559c, 6);
            case 7:
                return new h3((y5) this.f40378c, (AddDeviceRequest) this.f40379d, interfaceC7559c, 7);
            case 8:
                return new h3((y5) this.f40378c, (GetCallLogsRequest) this.f40379d, interfaceC7559c, 8);
            case 9:
                return new h3((y5) this.f40378c, (List) this.f40379d, interfaceC7559c, 9);
            case 10:
                return new h3((y5) this.f40378c, (EnumC3318t) this.f40379d, interfaceC7559c, 10);
            case 11:
                return new h3((AbstractC7000y) this.f40378c, (C8735o) this.f40379d, interfaceC7559c, 11);
            case 12:
                return new h3((C6097y) this.f40378c, (C8741f) this.f40379d, interfaceC7559c, 12);
            case 13:
                return new h3((C8741f) this.f40378c, (Context) this.f40379d, interfaceC7559c, 13);
            case 14:
                return new h3((C8449k) this.f40378c, (AbstractC8175p) this.f40379d, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new h3((C8774f) this.f40378c, (Context) this.f40379d, interfaceC7559c, 15);
            case 16:
                return new h3((C0592x) this.f40378c, (w3.p2) this.f40379d, interfaceC7559c, 16);
            case 17:
                return new h3((k2.w0) this.f40378c, (InterfaceC2139c) this.f40379d, interfaceC7559c, 17);
            case 18:
                return new h3((C8489p) this.f40378c, (l7.a0) this.f40379d, interfaceC7559c, 18);
            case 19:
                return new h3((C8489p) this.f40379d, interfaceC7559c, 19);
            case 20:
                return new h3((C8489p) this.f40378c, (C7151a) this.f40379d, interfaceC7559c, 20);
            case 21:
                return new h3((C8489p) this.f40379d, interfaceC7559c, 21);
            case 22:
                h3 h3Var = new h3((C8489p) this.f40379d, interfaceC7559c, 22);
                h3Var.f40378c = obj;
                return h3Var;
            case 23:
                h3 h3Var2 = new h3((AbstractC8499e) this.f40379d, interfaceC7559c, 23);
                h3Var2.f40378c = obj;
                return h3Var2;
            case 24:
                h3 h3Var3 = new h3((AbstractC8502h) this.f40379d, interfaceC7559c, 24);
                h3Var3.f40378c = obj;
                return h3Var3;
            case 25:
                return new h3((InterfaceC8209j) this.f40378c, (C8516v) this.f40379d, interfaceC7559c, 25);
            case 26:
                h3 h3Var4 = new h3((InterfaceC8210k) this.f40379d, interfaceC7559c, 26);
                h3Var4.f40378c = obj;
                return h3Var4;
            case 27:
                return new h3((C8595d) this.f40378c, (InterfaceC7819u) this.f40379d, interfaceC7559c, 27);
            case 28:
                return new h3((ArrayList) this.f40378c, (C8735o) this.f40379d, interfaceC7559c, 28);
            default:
                h3 h3Var5 = new h3((C8741f) this.f40379d, interfaceC7559c, 29);
                h3Var5.f40378c = obj;
                return h3Var5;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40376a) {
        }
        return ((h3) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b4, code lost:
    
        if (r2 == r1) goto L186;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:455:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 2256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.h3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40376a = i10;
        this.f40379d = obj;
    }
}
