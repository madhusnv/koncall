package ab;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import au.C0450n;
import b3.C0592x;
import c0.d1;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.broadcastReceivers.RebootReceiver;
import com.websoptimization.callyzerbiz.services.CallMonitorService;
import com.websoptimization.callyzerbiz.services.CallRecordingNotificationActionService;
import com.websoptimization.callyzerbiz.workManager.LogFileUploadManager;
import com.websoptimization.callyzerbiz.workManager.RecordingUploadManager;
import cu.C1504b;
import dt.C1818x;
import ex.InterfaceC2141e;
import g2.C2460n;
import g2.ta;
import g2.u1;
import g2.uc;
import gb.C2554d;
import gj.C2619a;
import h1.x0;
import hr.C3025d;
import hu.C3035a;
import i1.C3147z;
import i1.a0;
import i1.f0;
import i1.w0;
import jr.C3844b;
import k4.C3982c;
import org.bouncycastle.iana.AEADAlgorithm;
import tx.C7257q;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ab.b */
/* loaded from: classes.dex */
public final class C0084b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f311a;

    /* renamed from: b */
    public int f312b;

    /* renamed from: c */
    public /* synthetic */ Object f313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0084b(int i10, InterfaceC7559c interfaceC7559c) {
        super(i10, interfaceC7559c);
        this.f311a = 27;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f311a) {
            case 0:
                return new C0084b((C0083a) this.f313c, interfaceC7559c, 0);
            case 1:
                return new C0084b((CallMonitorService) this.f313c, interfaceC7559c, 1);
            case 2:
                return new C0084b((CallRecordingNotificationActionService) this.f313c, interfaceC7559c, 2);
            case 3:
                return new C0084b((C0450n) this.f313c, interfaceC7559c, 3);
            case 4:
                return new C0084b((LogFileUploadManager) this.f313c, interfaceC7559c, 4);
            case 5:
                return new C0084b((RecordingUploadManager) this.f313c, interfaceC7559c, 5);
            case 6:
                return new C0084b((C7257q) this.f313c, interfaceC7559c, 6);
            case 7:
                return new C0084b((C0592x) this.f313c, interfaceC7559c, 7);
            case 8:
                return new C0084b((C1504b) this.f313c, interfaceC7559c, 8);
            case 9:
                return new C0084b((ta) this.f313c, interfaceC7559c, 9);
            case 10:
                return new C0084b((C1818x) this.f313c, interfaceC7559c, 10);
            case 11:
                return new C0084b((ConstraintTrackingWorker) this.f313c, interfaceC7559c, 11);
            case 12:
                return new C0084b((u1) this.f313c, interfaceC7559c, 12);
            case 13:
                return new C0084b((C2460n) this.f313c, interfaceC7559c, 13);
            case 14:
                return new C0084b((uc) this.f313c, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C0084b((C2554d) this.f313c, interfaceC7559c, 15);
            case 16:
                return new C0084b((C2619a) this.f313c, interfaceC7559c, 16);
            case 17:
                return new C0084b((MainActivity) this.f313c, interfaceC7559c, 17);
            case 18:
                return new C0084b((x0) this.f313c, interfaceC7559c, 18);
            case 19:
                return new C0084b((RebootReceiver) this.f313c, interfaceC7559c, 19);
            case 20:
                return new C0084b((C3025d) this.f313c, interfaceC7559c, 20);
            case 21:
                return new C0084b((C3035a) this.f313c, interfaceC7559c, 21);
            case 22:
                return new C0084b((C3147z) this.f313c, interfaceC7559c, 22);
            case 23:
                return new C0084b((a0) this.f313c, interfaceC7559c, 23);
            case 24:
                return new C0084b((f0) this.f313c, interfaceC7559c, 24);
            case 25:
                return new C0084b((w0) this.f313c, interfaceC7559c, 25);
            case 26:
                return new C0084b((C3844b) this.f313c, interfaceC7559c, 26);
            case 27:
                C0084b c0084b = new C0084b(2, interfaceC7559c);
                c0084b.f313c = obj;
                return c0084b;
            case 28:
                return new C0084b((d1) this.f313c, interfaceC7559c, 28);
            default:
                return new C0084b((C3982c) this.f313c, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f311a) {
        }
        return ((C0084b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:360:0x0619, code lost:
    
        if (tx.c0.m13475K(r4, r9, r22) == r2) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011c, code lost:
    
        if (k2.C3953b.m8515r(getContext()).mo8536u(new h1.j1(1, r2), r22) == r1) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:59:0x00fa, B:62:0x0103], limit reached: 623 */
    /* JADX WARN: Path cross not found for [B:62:0x0103, B:59:0x00fa], limit reached: 623 */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:614:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0105 -> B:57:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x011c -> B:67:0x011f). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.C0084b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0084b(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f311a = i10;
        this.f313c = obj;
    }
}
