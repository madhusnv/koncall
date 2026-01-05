package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingUploadManager;
import ex.InterfaceC2144h;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import qw.C6361k;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.u */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0481u implements InterfaceC2144h {

    /* renamed from: a */
    public final /* synthetic */ RecordingUploadManager f3441a;

    /* renamed from: b */
    public final /* synthetic */ C4168z f3442b;

    public /* synthetic */ C0481u(RecordingUploadManager recordingUploadManager, C4168z c4168z) {
        this.f3441a = recordingUploadManager;
        this.f3442b = c4168z;
    }

    /* renamed from: a */
    public final Object m1478a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String title1 = (String) obj;
        String content = (String) obj2;
        Integer num = (Integer) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        Boolean bool = (Boolean) obj5;
        AbstractC4154l.m8923f(title1, "title1");
        AbstractC4154l.m8923f(content, "content");
        RecordingUploadManager recordingUploadManager = this.f3441a;
        C9097a c9097a = recordingUploadManager.f7484i;
        if (c9097a == null) {
            AbstractC4154l.m8928k("callyzerNotification");
            throw null;
        }
        C9097a c9097aM16506b = C9097a.m16506b(c9097a, null, content, title1, false, null, num, 262131);
        recordingUploadManager.f7484i = c9097aM16506b;
        if (zBooleanValue) {
            this.f3442b.f21164a = new C6361k(c9097aM16506b, bool);
        }
        recordingUploadManager.f7477b.m12025l(c9097aM16506b, true);
        return qw.a0.f30746a;
    }
}
