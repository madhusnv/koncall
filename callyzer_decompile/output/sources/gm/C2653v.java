package gm;

import com.websoptimization.callyzerbiz.CallRecordingAttachActivity;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.NotePopUpActivity;
import jn.AbstractC3802a;
import p004e.AbstractActivityC1878m;
import p006g.InterfaceC2410b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gm.v */
/* loaded from: classes3.dex */
public final class C2653v implements InterfaceC2410b {

    /* renamed from: a */
    public final /* synthetic */ int f14381a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC1878m f14382b;

    public /* synthetic */ C2653v(AbstractActivityC1878m abstractActivityC1878m, int i10) {
        this.f14381a = i10;
        this.f14382b = abstractActivityC1878m;
    }

    @Override // p006g.InterfaceC2410b
    /* renamed from: a */
    public final void mo1206a(AbstractActivityC1878m abstractActivityC1878m) {
        switch (this.f14381a) {
            case 0:
                CallRecordingAttachActivity callRecordingAttachActivity = (CallRecordingAttachActivity) this.f14382b;
                if (!callRecordingAttachActivity.f7252d) {
                    callRecordingAttachActivity.f7252d = true;
                    ((InterfaceC2633b) callRecordingAttachActivity.mo1432a()).getClass();
                    break;
                }
                break;
            case 1:
                MainActivity mainActivity = (MainActivity) this.f14382b;
                if (!mainActivity.f7260d) {
                    mainActivity.f7260d = true;
                    C2651t c2651t = ((C2645n) ((d0) mainActivity.mo1432a())).f14258a;
                    mainActivity.f7261e = c2651t.m6633w();
                    AbstractC3802a.m8397a(c2651t.f14307e);
                    break;
                }
                break;
            default:
                NotePopUpActivity notePopUpActivity = (NotePopUpActivity) this.f14382b;
                if (!notePopUpActivity.f7272d) {
                    notePopUpActivity.f7272d = true;
                    notePopUpActivity.f7274f = ((C2645n) ((f0) notePopUpActivity.mo1432a())).f14258a.m6633w();
                    break;
                }
                break;
        }
    }
}
