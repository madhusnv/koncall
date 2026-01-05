package aw;

import android.content.Context;
import aq.C0409l;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import d7.AbstractC1646r;
import d7.d1;
import ex.InterfaceC2139c;
import java.util.List;
import k2.b1;
import kn.C4121a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4166x;
import l0.RunnableC4307g;
import mq.C4834b;
import mw.C4899g;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import q1.C6080h;
import rn.C6574c;
import s2.C6734c;
import tx.AbstractC7262v;
import tx.C7251k;
import tx.m0;
import uw.C7565i;
import uw.InterfaceC7559c;
import xm.s2;
import yv.C8791f;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.i */
/* loaded from: classes3.dex */
public final class C0469i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3376a;

    /* renamed from: b */
    public final /* synthetic */ Object f3377b;

    /* renamed from: c */
    public final /* synthetic */ Object f3378c;

    /* renamed from: d */
    public final /* synthetic */ Object f3379d;

    public /* synthetic */ C0469i(int i10, Object obj, Object obj2, Object obj3) {
        this.f3376a = i10;
        this.f3377b = obj;
        this.f3378c = obj2;
        this.f3379d = obj3;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f3376a;
        C7565i c7565i = C7565i.f36440a;
        int i11 = 1;
        InterfaceC7559c interfaceC7559c = null;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj2 = this.f3377b;
        Object obj3 = this.f3378c;
        Object obj4 = this.f3379d;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                C8791f c8791f = C8791f.f42457a;
                RecordingCompressManager recordingCompressManager = (RecordingCompressManager) obj4;
                C8805t c8805t = recordingCompressManager.f7453b;
                C4121a c4121a = (C4121a) obj3;
                if (th2 != null) {
                    recordingCompressManager.m5047f("CompressManager >>> compress coroutine canceled,callRecord:=" + c4121a, null);
                    c8805t.m16238m("CompressManager >>> compress coroutine canceled,callRecord:=" + c4121a, new Exception(th2));
                } else {
                    recordingCompressManager.m5047f("CompressManager >>> compress coroutine cancelled and no cause found,callRecord:=" + c4121a, null);
                    c8805t.m16237l("CompressManager >>> compress coroutine cancelled and no cause found,callRecord:=" + c4121a);
                }
                ((C7251k) obj2).resumeWith(c4121a);
                break;
            case 1:
                d1 d1Var = (d1) obj4;
                AbstractC1646r abstractC1646r = (AbstractC1646r) obj3;
                AbstractC7262v abstractC7262v = (AbstractC7262v) obj2;
                if (!abstractC7262v.D0(c7565i)) {
                    abstractC1646r.mo5346d(d1Var);
                    break;
                } else {
                    abstractC7262v.B0(c7565i, new RunnableC4307g(4, abstractC1646r, d1Var));
                    break;
                }
            case 2:
                int iIntValue = ((Number) obj).intValue();
                Context context = (Context) obj3;
                if (!((Boolean) tx.c0.m13468D(c7565i, new C4834b((mq.h0) obj2, interfaceC7559c, 2))).booleanValue()) {
                    AbstractC5601a.m11254y(context, R.string.call_recording_subscription_expired_notification_title, "getString(...)", context);
                    break;
                } else if (!s2.f40812p) {
                    ((b1) obj4).m8527g(iIntValue);
                    break;
                } else {
                    AbstractC5601a.m11254y(context, R.string.find_recording_already_running, "getString(...)", context);
                    break;
                }
            case 3:
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                List list = (List) obj2;
                LazyColumn.m12099p(list.size(), new C0409l(list, 25), new C0409l(list, 26), new C6734c(new bt.a0(list, (b1) obj3, (C4899g) obj4, 5), true, -1091073711));
                break;
            default:
                Throwable th3 = (Throwable) obj;
                C4166x c4166x = (C4166x) obj4;
                rn.h0 h0Var = (rn.h0) obj3;
                C8805t c8805t2 = h0Var.f31531m;
                C4166x c4166x2 = (C4166x) obj2;
                int i12 = c4166x2.f21162a;
                if (i12 > 0) {
                    c8805t2.m16231f("UploadManager >>> Upload request counts >>> total request to upload:=" + i12 + " & upload success count:=" + c4166x.f21162a);
                    h0Var.m12616i(AbstractC5601a.m11235f("UploadManager >>> Upload request counts >>> total request to upload:=", c4166x2.f21162a, c4166x.f21162a, " & upload success count:="), null);
                }
                if (th3 != null) {
                    th3.printStackTrace();
                    c8805t2.m16235j(th3);
                }
                C0496f c0496f = m0.f34659a;
                tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C6574c(h0Var, interfaceC7559c, i11), 3);
                break;
        }
        return a0Var;
    }
}
