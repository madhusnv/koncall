package sq;

import android.os.Handler;
import android.os.Looper;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.google.i18n.phonenumbers.C1404a;
import dy.AbstractC1856d;
import ex.InterfaceC2137a;
import ia.C3211c;
import ia.C3220l;
import java.io.File;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.C3953b;
import n4.AbstractC4954c;
import n4.C4952a;
import org.bouncycastle.iana.AEADAlgorithm;
import si.C6847c;
import uv.C7549b;
import vb.C7696c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f33087a;

    public /* synthetic */ n2(int i10) {
        this.f33087a = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() throws ClassNotFoundException {
        int i10 = this.f33087a;
        qw.a0 a0Var = qw.a0.f30746a;
        boolean z6 = false;
        switch (i10) {
            case 0:
                return C3953b.m8517t(Boolean.FALSE);
            case 1:
                return C3953b.m8517t(Boolean.FALSE);
            case 2:
                return new C3211c(new C3220l());
            case 3:
                return new Handler(Looper.getMainLooper());
            case 4:
                try {
                    Class.forName("android.os.Build");
                    z6 = true;
                } catch (ClassNotFoundException unused) {
                }
                return Boolean.valueOf(z6);
            case 5:
                return File.separator;
            case 6:
                return C1404a.m4499e();
            case 7:
                C0496f c0496f = tx.m0.f34659a;
                return tx.c0.m13479b(ExecutorC0495e.f3538c);
            case 8:
                return C3953b.m8517t(Boolean.FALSE);
            case 9:
                return new C7549b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, 0L, -1, 1023);
            case 10:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7696c.f37197b;
                return "Error while parsing \"Date\" header from service response";
            case 11:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7696c.f37197b;
                return "service did not return \"Date\" header, skipping skew calculation";
            case 12:
                return new iz.d0();
            case 13:
                return null;
            case 14:
                return AbstractC1856d.m5490a();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return wx.c1.m15390u(wx.c1.m15389t(xm.l2.f40528f), xm.l2.f40527e);
            case 16:
                return a0Var;
            case 17:
                return C3953b.m8517t(Boolean.FALSE);
            case 18:
                return a0Var;
            case 19:
                return C3953b.m8517t(Boolean.FALSE);
            case 20:
                throw new IllegalStateException("CompositionLocal MainActivity not present");
            case 21:
                return ((C4952a) AbstractC4954c.f24641a.m9144x().f24639a.get(0)).f24637a.getLanguage();
            case 22:
                return C6847c.m13044a();
            case 23:
                return Boolean.TRUE;
            case 24:
                return 3;
            case 25:
                return C3953b.m8517t(Boolean.FALSE);
            default:
                return C3953b.m8517t(Boolean.FALSE);
        }
    }
}
