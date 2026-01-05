package p020v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import bg.AbstractC0656a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import og.u1;
import pg.t8;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends d1 {

    /* renamed from: a */
    public final /* synthetic */ int f36635a;

    /* renamed from: b */
    public final Object f36636b;

    public n0(List list, int i10) {
        this.f36635a = i10;
        switch (i10) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f36636b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.f36636b = list.isEmpty() ? new g0() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new f0(list);
                break;
        }
    }

    @Override // p020v.d1
    /* renamed from: a */
    public void mo14365a(g1 g1Var) {
        switch (this.f36635a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f36636b).onActive((CameraCaptureSession) ((C8849i) g1Var.m14387r().f36778a).f42583b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14365a(g1Var);
                }
                break;
        }
    }

    @Override // p020v.d1
    /* renamed from: b */
    public void mo14366b(g1 g1Var) {
        switch (this.f36635a) {
            case 1:
                AbstractC0656a.m1909r((CameraCaptureSession.StateCallback) this.f36636b, (CameraCaptureSession) ((C8849i) g1Var.m14387r().f36778a).f42583b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14366b(g1Var);
                }
                break;
        }
    }

    @Override // p020v.d1
    /* renamed from: c */
    public void mo14367c(g1 g1Var) {
        switch (this.f36635a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f36636b).onClosed((CameraCaptureSession) ((C8849i) g1Var.m14387r().f36778a).f42583b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14367c(g1Var);
                }
                break;
        }
    }

    @Override // p020v.d1
    /* renamed from: d */
    public final void mo14368d(g1 g1Var) {
        switch (this.f36635a) {
            case 0:
                synchronized (((o0) this.f36636b).f36644a) {
                    try {
                        switch (((o0) this.f36636b).f36653j) {
                            case UNINITIALIZED:
                            case INITIALIZED:
                            case GET_SURFACE:
                            case OPENED:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((o0) this.f36636b).f36653j);
                            case RELEASED:
                                u1.m10942a("CaptureSession");
                                break;
                            case RELEASING:
                            case CLOSED:
                            case OPENING:
                                ((o0) this.f36636b).m14411e();
                                break;
                        }
                        Objects.toString(((o0) this.f36636b).f36653j);
                        u1.m10943b("CaptureSession");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f36636b).onConfigureFailed((CameraCaptureSession) ((C8849i) g1Var.m14387r().f36778a).f42583b);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14368d(g1Var);
                }
                return;
        }
    }

    @Override // p020v.d1
    /* renamed from: e */
    public final void mo14369e(g1 g1Var) {
        switch (this.f36635a) {
            case 0:
                synchronized (((o0) this.f36636b).f36644a) {
                    try {
                        switch (((o0) this.f36636b).f36653j) {
                            case UNINITIALIZED:
                            case RELEASED:
                            case INITIALIZED:
                            case GET_SURFACE:
                            case OPENED:
                                throw new IllegalStateException("onConfigured() should not be possible in state: " + ((o0) this.f36636b).f36653j);
                            case RELEASING:
                                g1Var.m14378i();
                                break;
                            case CLOSED:
                                ((o0) this.f36636b).f36648e = g1Var;
                                break;
                            case OPENING:
                                ((o0) this.f36636b).m14420o(m0.OPENED);
                                ((o0) this.f36636b).f36648e = g1Var;
                                u1.m10942a("CaptureSession");
                                o0 o0Var = (o0) this.f36636b;
                                o0Var.m14416k(o0Var.f36649f);
                                o0 o0Var2 = (o0) this.f36636b;
                                o0Var2.f36659p.m166e().mo9026a(new RunnableC7606p(2, o0Var2), t8.m11872a());
                                break;
                        }
                        Objects.toString(((o0) this.f36636b).f36653j);
                        u1.m10942a("CaptureSession");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f36636b).onConfigured((CameraCaptureSession) ((C8849i) g1Var.m14387r().f36778a).f42583b);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14369e(g1Var);
                }
                return;
        }
    }

    @Override // p020v.d1
    /* renamed from: f */
    public final void mo14370f(g1 g1Var) {
        switch (this.f36635a) {
            case 0:
                synchronized (((o0) this.f36636b).f36644a) {
                    try {
                        if (((o0) this.f36636b).f36653j.ordinal() == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: " + ((o0) this.f36636b).f36653j);
                        }
                        Objects.toString(((o0) this.f36636b).f36653j);
                        u1.m10942a("CaptureSession");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f36636b).onReady((CameraCaptureSession) ((C8849i) g1Var.m14387r().f36778a).f42583b);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14370f(g1Var);
                }
                return;
        }
    }

    @Override // p020v.d1
    /* renamed from: g */
    public final void mo14371g(g1 g1Var) {
        switch (this.f36635a) {
            case 0:
                synchronized (((o0) this.f36636b).f36644a) {
                    try {
                        if (((o0) this.f36636b).f36653j == m0.UNINITIALIZED) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((o0) this.f36636b).f36653j);
                        }
                        u1.m10942a("CaptureSession");
                        ((o0) this.f36636b).m14411e();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14371g(g1Var);
                }
                return;
        }
    }

    @Override // p020v.d1
    /* renamed from: h */
    public void mo14372h(g1 g1Var, Surface surface) {
        switch (this.f36635a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f36636b).onSurfacePrepared((CameraCaptureSession) ((C8849i) g1Var.m14387r().f36778a).f42583b, surface);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f36636b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d1) obj).mo14372h(g1Var, surface);
                }
                break;
        }
    }

    public n0(o0 o0Var) {
        this.f36635a = 0;
        this.f36636b = o0Var;
    }

    /* renamed from: i */
    private final void m14405i(g1 g1Var) {
    }
}
