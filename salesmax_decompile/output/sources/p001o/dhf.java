package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class dhf {

    /* renamed from: a */
    public final InterfaceC12923c f19864a;

    /* renamed from: o.dhf$b */
    public static final class C12922b implements InterfaceC12923c {

        /* renamed from: a */
        public final List f19867a;

        /* renamed from: b */
        public final CameraCaptureSession.StateCallback f19868b;

        /* renamed from: c */
        public final Executor f19869c;

        /* renamed from: d */
        public final int f19870d;

        /* renamed from: e */
        public ej8 f19871e = null;

        /* renamed from: f */
        public CaptureRequest f19872f = null;

        public C12922b(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f19870d = i;
            this.f19867a = Collections.unmodifiableList(new ArrayList(list));
            this.f19868b = stateCallback;
            this.f19869c = executor;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: a */
        public ej8 mo23146a() {
            return this.f19871e;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: b */
        public Executor mo23147b() {
            return this.f19869c;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo23148c() {
            return this.f19868b;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: d */
        public void mo23149d(ej8 ej8Var) {
            if (this.f19870d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f19871e = ej8Var;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: e */
        public List mo23150e() {
            return this.f19867a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12922b) {
                C12922b c12922b = (C12922b) obj;
                if (Objects.equals(this.f19871e, c12922b.f19871e) && this.f19870d == c12922b.f19870d && this.f19867a.size() == c12922b.f19867a.size()) {
                    for (int i = 0; i < this.f19867a.size(); i++) {
                        if (!((dgc) this.f19867a.get(i)).equals(c12922b.f19867a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: f */
        public Object mo23151f() {
            return null;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: g */
        public int mo23152g() {
            return this.f19870d;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: h */
        public void mo23153h(CaptureRequest captureRequest) {
            this.f19872f = captureRequest;
        }

        public int hashCode() {
            int iHashCode = this.f19867a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            ej8 ej8Var = this.f19871e;
            int iHashCode2 = (ej8Var == null ? 0 : ej8Var.hashCode()) ^ i;
            return this.f19870d ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    /* renamed from: o.dhf$c */
    public interface InterfaceC12923c {
        /* renamed from: a */
        ej8 mo23146a();

        /* renamed from: b */
        Executor mo23147b();

        /* renamed from: c */
        CameraCaptureSession.StateCallback mo23148c();

        /* renamed from: d */
        void mo23149d(ej8 ej8Var);

        /* renamed from: e */
        List mo23150e();

        /* renamed from: f */
        Object mo23151f();

        /* renamed from: g */
        int mo23152g();

        /* renamed from: h */
        void mo23153h(CaptureRequest captureRequest);
    }

    public dhf(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f19864a = new C12922b(i, list, executor, stateCallback);
        } else {
            this.f19864a = new C12921a(i, list, executor, stateCallback);
        }
    }

    /* renamed from: h */
    public static List m23136h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((dgc) it.next()).m23038i());
        }
        return arrayList;
    }

    /* renamed from: i */
    public static List m23137i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dgc.m23029j((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Executor m23138a() {
        return this.f19864a.mo23147b();
    }

    /* renamed from: b */
    public ej8 m23139b() {
        return this.f19864a.mo23146a();
    }

    /* renamed from: c */
    public List m23140c() {
        return this.f19864a.mo23150e();
    }

    /* renamed from: d */
    public int m23141d() {
        return this.f19864a.mo23152g();
    }

    /* renamed from: e */
    public CameraCaptureSession.StateCallback m23142e() {
        return this.f19864a.mo23148c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof dhf) {
            return this.f19864a.equals(((dhf) obj).f19864a);
        }
        return false;
    }

    /* renamed from: f */
    public void m23143f(ej8 ej8Var) {
        this.f19864a.mo23149d(ej8Var);
    }

    /* renamed from: g */
    public void m23144g(CaptureRequest captureRequest) {
        this.f19864a.mo23153h(captureRequest);
    }

    public int hashCode() {
        return this.f19864a.hashCode();
    }

    /* renamed from: j */
    public Object m23145j() {
        return this.f19864a.mo23151f();
    }

    /* renamed from: o.dhf$a */
    public static final class C12921a implements InterfaceC12923c {

        /* renamed from: a */
        public final SessionConfiguration f19865a;

        /* renamed from: b */
        public final List f19866b;

        public C12921a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f19865a = sessionConfiguration;
            this.f19866b = Collections.unmodifiableList(dhf.m23137i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: a */
        public ej8 mo23146a() {
            return ej8.m25130b(this.f19865a.getInputConfiguration());
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: b */
        public Executor mo23147b() {
            return this.f19865a.getExecutor();
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo23148c() {
            return this.f19865a.getStateCallback();
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: d */
        public void mo23149d(ej8 ej8Var) {
            this.f19865a.setInputConfiguration((InputConfiguration) ej8Var.m25131a());
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: e */
        public List mo23150e() {
            return this.f19866b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C12921a) {
                return Objects.equals(this.f19865a, ((C12921a) obj).f19865a);
            }
            return false;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: f */
        public Object mo23151f() {
            return this.f19865a;
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: g */
        public int mo23152g() {
            return this.f19865a.getSessionType();
        }

        @Override // p001o.dhf.InterfaceC12923c
        /* renamed from: h */
        public void mo23153h(CaptureRequest captureRequest) {
            this.f19865a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f19865a.hashCode();
        }

        public C12921a(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, dhf.m23136h(list), executor, stateCallback));
        }
    }
}
