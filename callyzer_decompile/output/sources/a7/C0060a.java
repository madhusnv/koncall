package a7;

import android.content.Context;
import androidx.work.WorkerParameters;
import co.C0984a;
import com.websoptimization.callyzerbiz.workManager.CallNotesTemplatesWorkManager;
import com.websoptimization.callyzerbiz.workManager.LogFileUploadManager;
import com.websoptimization.callyzerbiz.workManager.ReadContactWorker;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import com.websoptimization.callyzerbiz.workManager.RecordingFindManager;
import com.websoptimization.callyzerbiz.workManager.RecordingUploadManager;
import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import com.websoptimization.callyzerbiz.workManager.SubmitContactUsFormWorkManager;
import com.websoptimization.callyzerbiz.workManager.SyncCallLogNotificationManager;
import gm.C2649r;
import gm.C2651t;
import gn.x2;
import io.C3330e;
import jn.AbstractC3802a;
import ln.C4492e;
import pn.C5979e;
import po.C5984e;
import pw.InterfaceC6043a;
import rn.h0;
import t8.AbstractC7076v;
import t8.i0;
import tn.C7174a;
import wo.C8134s;
import wx.w0;
import xm.C8418z;
import xm.o4;
import xm.q4;
import xm.w2;
import xm.y5;
import yh.C8669m;
import yo.C8720d;
import yv.C8803r;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a7.a */
/* loaded from: classes.dex */
public final class C0060a extends i0 {

    /* renamed from: a */
    public final C8669m f239a;

    public C0060a(C8669m c8669m) {
        this.f239a = c8669m;
    }

    @Override // t8.i0
    public final AbstractC7076v createWorker(Context context, String str, WorkerParameters workerParameters) {
        AbstractC7076v callNotesTemplatesWorkManager;
        InterfaceC6043a interfaceC6043a = (InterfaceC6043a) this.f239a.get(str);
        if (interfaceC6043a == null) {
            return null;
        }
        C2649r c2649r = (C2649r) interfaceC6043a.get();
        switch (c2649r.f14273a) {
            case 0:
                C2651t c2651t = c2649r.f14274b.f14275a;
                callNotesTemplatesWorkManager = new CallNotesTemplatesWorkManager(context, workerParameters, c2651t.m6616f(), (C8803r) c2651t.f14293Q.get(), AbstractC3802a.m8397a(c2651t.f14307e));
                break;
            case 1:
                C2651t c2651t2 = c2649r.f14274b.f14275a;
                callNotesTemplatesWorkManager = new LogFileUploadManager(context, workerParameters, new C3330e((y5) c2651t2.f14281E.get(), c2651t2.m6633w(), (q4) c2651t2.f14295S.get(), AbstractC3802a.m8397a(c2651t2.f14307e), c2651t2.f14305c.f15864a, (C8418z) c2651t2.f14296T.get()), c2651t2.m6633w(), c2651t2.m6624n(), c2651t2.m6628r());
                break;
            case 2:
                C2651t c2651t3 = c2649r.f14274b.f14275a;
                c2651t3.getClass();
                callNotesTemplatesWorkManager = new ReadContactWorker(context, workerParameters, new C8720d(new w2((x2) c2651t3.f14327y.get()), (y5) c2651t3.f14281E.get(), c2651t3.m6625o(), c2651t3.m6633w(), c2651t3.m6632v(), (C8418z) c2651t3.f14296T.get()), c2651t3.m6628r(), c2651t3.m6633w());
                break;
            case 3:
                C2651t c2651t4 = c2649r.f14274b.f14275a;
                C8805t c8805tM6633w = c2651t4.m6633w();
                h0 h0Var = (h0) c2651t4.f14302Z.get();
                C5979e c5979eM6613c = c2651t4.m6613c();
                w0 w0VarM6630t = c2651t4.m6630t();
                C8134s c8134sM6631u = c2651t4.m6631u();
                C5984e c5984eM6624n = c2651t4.m6624n();
                c2651t4.m6624n();
                RecordingCompressManager recordingCompressManager = new RecordingCompressManager(context, workerParameters, c8805tM6633w, h0Var, c5979eM6613c, w0VarM6630t, c8134sM6631u, c5984eM6624n, new C0984a());
                recordingCompressManager.f7460i = (y5) c2651t4.f14281E.get();
                callNotesTemplatesWorkManager = recordingCompressManager;
                break;
            case 4:
                C2651t c2651t5 = c2649r.f14274b.f14275a;
                callNotesTemplatesWorkManager = new RecordingFindManager(context, workerParameters, c2651t5.m6620j(), c2651t5.m6624n(), c2651t5.m6633w(), AbstractC3802a.m8397a(c2651t5.f14307e));
                break;
            case 5:
                C2651t c2651t6 = c2649r.f14274b.f14275a;
                callNotesTemplatesWorkManager = new RecordingUploadManager(context, workerParameters, c2651t6.m6624n(), (h0) c2651t6.f14302Z.get(), c2651t6.m6633w(), (C8803r) c2651t6.f14293Q.get(), c2651t6.m6631u());
                break;
            case 6:
                C2651t c2651t7 = c2649r.f14274b.f14275a;
                callNotesTemplatesWorkManager = new RetrieveWebSubscriptionWorkManager(context, workerParameters, c2651t7.m6633w(), (C8803r) c2651t7.f14293Q.get(), new C4492e((y5) c2651t7.f14281E.get(), c2651t7.m6633w()), (h0) c2651t7.f14302Z.get(), c2651t7.m6619i(), c2651t7.m6631u(), c2651t7.m6634x(), AbstractC3802a.m8397a(c2651t7.f14307e), c2651t7.m6624n(), c2651t7.m6618h());
                break;
            case 7:
                C2651t c2651t8 = c2649r.f14274b.f14275a;
                callNotesTemplatesWorkManager = new SubmitContactUsFormWorkManager(context, workerParameters, new C7174a((y5) c2651t8.f14281E.get()), c2651t8.m6633w(), (C8803r) c2651t8.f14293Q.get(), (o4) c2651t8.f44290e0.get(), AbstractC3802a.m8397a(c2651t8.f14307e));
                break;
            default:
                C2651t c2651t9 = c2649r.f14274b.f14275a;
                return new SyncCallLogNotificationManager(context, workerParameters, c2651t9.m6633w(), c2651t9.m6634x(), c2651t9.m6611a(), c2651t9.m6619i(), c2651t9.m6631u(), (C8803r) c2651t9.f14293Q.get(), (y5) c2651t9.f14281E.get(), c2651t9.m6624n());
        }
        return callNotesTemplatesWorkManager;
    }
}
