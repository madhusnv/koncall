package xm;

import android.content.Context;
import com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import tx.C7251k;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import yn.C8716n;
import yt.C8769a;
import yt.C8774f;
import z1.C8843c;
import z1.C8850j;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40802a;

    /* renamed from: b */
    public int f40803b;

    /* renamed from: c */
    public Object f40804c;

    /* renamed from: d */
    public Object f40805d;

    /* renamed from: e */
    public final /* synthetic */ Object f40806e;

    /* renamed from: f */
    public final /* synthetic */ Object f40807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40802a = i10;
        this.f40805d = obj;
        this.f40806e = obj2;
        this.f40807f = obj3;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40802a) {
            case 0:
                return new s1((x1) this.f40806e, (SyncCallLogRequest) this.f40807f, interfaceC7559c, 0);
            case 1:
                return new s1((C8774f) this.f40804c, (l7.a0) this.f40805d, (k2.h2) this.f40806e, (Context) this.f40807f, interfaceC7559c);
            case 2:
                return new s1((C8716n) this.f40806e, (String) this.f40807f, interfaceC7559c, 2);
            case 3:
                s1 s1Var = new s1((InterfaceC2139c) this.f40805d, (C8843c) this.f40806e, (C8850j) this.f40807f, interfaceC7559c, 3);
                s1Var.f40804c = obj;
                return s1Var;
            case 4:
                s1 s1Var2 = new s1((AbstractC8894w) this.f40805d, (C7251k) this.f40806e, (C8769a) this.f40807f, interfaceC7559c, 4);
                s1Var2.f40804c = obj;
                return s1Var2;
            default:
                s1 s1Var3 = new s1((z7.n0) this.f40805d, (int[]) this.f40806e, (String[]) this.f40807f, interfaceC7559c, 5);
                s1Var3.f40804c = obj;
                return s1Var3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40802a) {
            case 0:
                return ((s1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((s1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((s1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 3:
                return ((s1) create((w3.r0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 4:
                return ((s1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((s1) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r1.m10466a(r11, r21) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020f A[Catch: Exception -> 0x0171, TryCatch #1 {Exception -> 0x0171, blocks: (B:65:0x0168, B:108:0x01fe, B:110:0x0214, B:72:0x017e, B:104:0x01ee, B:75:0x0188, B:91:0x01b8, B:93:0x01bc, B:95:0x01ca, B:97:0x01d2, B:99:0x01d8, B:100:0x01de, B:109:0x020f, B:77:0x018f, B:83:0x01a1, B:85:0x01a5, B:88:0x01ab, B:111:0x0240, B:80:0x0198), top: B:211:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc A[Catch: Exception -> 0x0171, TryCatch #1 {Exception -> 0x0171, blocks: (B:65:0x0168, B:108:0x01fe, B:110:0x0214, B:72:0x017e, B:104:0x01ee, B:75:0x0188, B:91:0x01b8, B:93:0x01bc, B:95:0x01ca, B:97:0x01d2, B:99:0x01d8, B:100:0x01de, B:109:0x020f, B:77:0x018f, B:83:0x01a1, B:85:0x01a5, B:88:0x01ab, B:111:0x0240, B:80:0x0198), top: B:211:0x0156 }] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40802a = i10;
        this.f40806e = obj;
        this.f40807f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(C8774f c8774f, l7.a0 a0Var, k2.h2 h2Var, Context context, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f40802a = 1;
        this.f40804c = c8774f;
        this.f40805d = a0Var;
        this.f40806e = h2Var;
        this.f40807f = context;
    }
}
