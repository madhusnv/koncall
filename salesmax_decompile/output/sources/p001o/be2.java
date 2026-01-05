package p001o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p001o.bhf;
import p001o.cd2;
import p001o.fhg;
import p001o.g32;
import p001o.i72;
import p001o.ugg;

/* loaded from: classes2.dex */
public final class be2 implements ce2 {

    /* renamed from: a */
    public final Object f16001a;

    /* renamed from: b */
    public final List f16002b;

    /* renamed from: c */
    public final C12365d f16003c;

    /* renamed from: d */
    public ugg.InterfaceC17375a f16004d;

    /* renamed from: e */
    public ugg f16005e;

    /* renamed from: f */
    public bhf f16006f;

    /* renamed from: g */
    public final Map f16007g;

    /* renamed from: h */
    public List f16008h;

    /* renamed from: i */
    public EnumC12364c f16009i;

    /* renamed from: j */
    public zfa f16010j;

    /* renamed from: k */
    public g32.C13614a f16011k;

    /* renamed from: l */
    public Map f16012l;

    /* renamed from: m */
    public final c6g f16013m;

    /* renamed from: n */
    public final tsh f16014n;

    /* renamed from: o */
    public final ome f16015o;

    /* renamed from: p */
    public final f26 f16016p;

    /* renamed from: q */
    public final meh f16017q;

    /* renamed from: r */
    public final boolean f16018r;

    /* renamed from: o.be2$a */
    public class C12362a implements qm7 {
        public C12362a() {
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            synchronized (be2.this.f16001a) {
                be2.this.f16004d.stop();
                int iOrdinal = be2.this.f16009i.ordinal();
                if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                    wja.m54639m("CaptureSession", "Opening session with fail " + be2.this.f16009i, th);
                    be2.this.m18768r();
                }
            }
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }
    }

    /* renamed from: o.be2$b */
    public class C12363b extends CameraCaptureSession.CaptureCallback {
        public C12363b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (be2.this.f16001a) {
                bhf bhfVar = be2.this.f16006f;
                if (bhfVar == null) {
                    return;
                }
                cd2 cd2VarM19031j = bhfVar.m19031j();
                wja.m54627a("CaptureSession", "Submit FLASH_MODE_OFF request");
                be2 be2Var = be2.this;
                be2Var.mo18759b(Collections.singletonList(be2Var.f16014n.m50438a(cd2VarM19031j)));
            }
        }
    }

    /* renamed from: o.be2$c */
    public enum EnumC12364c {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: o.be2$d */
    public final class C12365d extends ugg.AbstractC17377c {
        public C12365d() {
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: r */
        public void mo17129r(ugg uggVar) {
            synchronized (be2.this.f16001a) {
                switch (be2.this.f16009i) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + be2.this.f16009i);
                    case OPENING:
                    case CLOSED:
                    case RELEASING:
                        be2.this.m18768r();
                        break;
                    case RELEASED:
                        wja.m54627a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                wja.m54629c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + be2.this.f16009i);
            }
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: s */
        public void mo17130s(ugg uggVar) {
            synchronized (be2.this.f16001a) {
                switch (be2.this.f16009i) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                    case RELEASED:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + be2.this.f16009i);
                    case OPENING:
                        be2 be2Var = be2.this;
                        be2Var.f16009i = EnumC12364c.OPENED;
                        be2Var.f16005e = uggVar;
                        wja.m54627a("CaptureSession", "Attempting to send capture request onConfigured");
                        be2 be2Var2 = be2.this;
                        be2Var2.m18773x(be2Var2.f16006f);
                        be2.this.m18772w();
                        break;
                    case CLOSED:
                        be2.this.f16005e = uggVar;
                        break;
                    case RELEASING:
                        uggVar.close();
                        break;
                }
                wja.m54627a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + be2.this.f16009i);
            }
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: t */
        public void mo17131t(ugg uggVar) {
            synchronized (be2.this.f16001a) {
                if (be2.this.f16009i.ordinal() == 0) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + be2.this.f16009i);
                }
                wja.m54627a("CaptureSession", "CameraCaptureSession.onReady() " + be2.this.f16009i);
            }
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: u */
        public void mo17132u(ugg uggVar) {
            synchronized (be2.this.f16001a) {
                if (be2.this.f16009i == EnumC12364c.UNINITIALIZED) {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + be2.this.f16009i);
                }
                wja.m54627a("CaptureSession", "onSessionFinished()");
                be2.this.m18768r();
            }
        }
    }

    public be2(f26 f26Var) {
        this(f26Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ Object m18746B(g32.C13614a c13614a) {
        String str;
        synchronized (this.f16001a) {
            fgd.m26666j(this.f16011k == null, "Release completer expected to be null");
            this.f16011k = c13614a;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: p */
    public static List m18752p(List list, int i) {
        try {
            return (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, list, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            wja.m54629c("CaptureSession", "Failed to create instances for multi-resolution output, " + e.getMessage());
            return null;
        }
    }

    /* renamed from: q */
    public static Map m18753q(Map map, Map map2) {
        HashMap map3 = new HashMap();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (bhf.AbstractC12406f abstractC12406f : (List) map.get(Integer.valueOf(iIntValue))) {
                SurfaceUtil.C1897a c1897aM4702a = SurfaceUtil.m4702a((Surface) map2.get(abstractC12406f.mo19070f()));
                if (i == 0) {
                    i = c1897aM4702a.f6125a;
                }
                vd2.m52579a();
                int i2 = c1897aM4702a.f6126b;
                int i3 = c1897aM4702a.f6127c;
                String strMo19068d = abstractC12406f.mo19068d();
                Objects.requireNonNull(strMo19068d);
                arrayList.add(ud2.m51373a(i2, i3, strMo19068d));
            }
            if (i == 0 || arrayList.isEmpty()) {
                wja.m54629c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i + ", streamInfos size: " + arrayList.size());
            } else {
                List listM18752p = m18752p(arrayList, i);
                if (listM18752p != null) {
                    for (bhf.AbstractC12406f abstractC12406f2 : (List) map.get(Integer.valueOf(iIntValue))) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listM18752p.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(abstractC12406f2.mo19070f()));
                        map3.put(abstractC12406f2, new dgc(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    /* renamed from: u */
    public static Map m18754u(Collection collection) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bhf.AbstractC12406f abstractC12406f = (bhf.AbstractC12406f) it.next();
            if (abstractC12406f.mo19071g() > 0 && abstractC12406f.mo19069e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(abstractC12406f.mo19071g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(abstractC12406f.mo19071g()), arrayList);
                }
                arrayList.add(abstractC12406f);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            if (((List) map.get(Integer.valueOf(iIntValue))).size() >= 2) {
                map2.put(Integer.valueOf(iIntValue), (List) map.get(Integer.valueOf(iIntValue)));
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m18755y(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f16001a) {
            if (this.f16009i == EnumC12364c.OPENED) {
                m18773x(this.f16006f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m18756z() {
        synchronized (this.f16001a) {
            if (this.f16002b.isEmpty()) {
                return;
            }
            try {
                m18771v(this.f16002b);
            } finally {
                this.f16002b.clear();
            }
        }
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final zfa m18745A(List list, bhf bhfVar, CameraDevice cameraDevice) {
        synchronized (this.f16001a) {
            int iOrdinal = this.f16009i.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal == 2) {
                    this.f16007g.clear();
                    for (int i = 0; i < list.size(); i++) {
                        this.f16007g.put((yj5) this.f16008h.get(i), (Surface) list.get(i));
                    }
                    this.f16009i = EnumC12364c.OPENING;
                    wja.m54627a("CaptureSession", "Opening capture session.");
                    ugg.AbstractC17377c abstractC17377cM26708w = fhg.m26708w(this.f16003c, new fhg.C13432a(bhfVar.m19032k()));
                    d72 d72Var = new d72(bhfVar.m19027f());
                    cd2.C12638a c12638aM20893j = cd2.C12638a.m20893j(bhfVar.m19031j());
                    Map map = new HashMap();
                    if (this.f16018r && Build.VERSION.SDK_INT >= 35) {
                        map = m18753q(m18754u(bhfVar.m19029h()), this.f16007g);
                    }
                    ArrayList arrayList = new ArrayList();
                    String strA0 = d72Var.a0(null);
                    for (bhf.AbstractC12406f abstractC12406f : bhfVar.m19029h()) {
                        dgc dgcVarM18769s = (!this.f16018r || Build.VERSION.SDK_INT < 35) ? null : (dgc) map.get(abstractC12406f);
                        if (dgcVarM18769s == null) {
                            dgcVarM18769s = m18769s(abstractC12406f, this.f16007g, strA0);
                            if (this.f16012l.containsKey(abstractC12406f.mo19070f())) {
                                dgcVarM18769s.m23037h(((Long) this.f16012l.get(abstractC12406f.mo19070f())).longValue());
                            }
                        }
                        arrayList.add(dgcVarM18769s);
                    }
                    dhf dhfVarMo17121i = this.f16004d.mo17121i(bhfVar.m19033l(), m18770t(arrayList), abstractC17377cM26708w);
                    if (bhfVar.m19036o() == 5 && bhfVar.m19028g() != null) {
                        dhfVarMo17121i.m23143f(ej8.m25130b(bhfVar.m19028g()));
                    }
                    try {
                        CaptureRequest captureRequestM55686f = x62.m55686f(c12638aM20893j.m20901h(), cameraDevice, this.f16017q);
                        if (captureRequestM55686f != null) {
                            dhfVarMo17121i.m23144g(captureRequestM55686f);
                        }
                        return this.f16004d.mo17123k(cameraDevice, dhfVarMo17121i, this.f16008h);
                    } catch (CameraAccessException e) {
                        return bn7.m19428n(e);
                    }
                }
                if (iOrdinal != 4) {
                    return bn7.m19428n(new CancellationException("openCaptureSession() not execute in state: " + this.f16009i));
                }
            }
            return bn7.m19428n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f16009i));
        }
    }

    @Override // p001o.ce2
    /* renamed from: a */
    public zfa mo18758a(final bhf bhfVar, final CameraDevice cameraDevice, ugg.InterfaceC17375a interfaceC17375a) {
        synchronized (this.f16001a) {
            if (this.f16009i.ordinal() == 1) {
                this.f16009i = EnumC12364c.GET_SURFACE;
                ArrayList arrayList = new ArrayList(bhfVar.m19035n());
                this.f16008h = arrayList;
                this.f16004d = interfaceC17375a;
                rm7 rm7VarM46961e = rm7.m46957a(interfaceC17375a.mo17120h(arrayList, DeviceOrientationRequest.OUTPUT_PERIOD_FAST)).m46961e(new wr0() { // from class: o.zd2
                    @Override // p001o.wr0
                    public final zfa apply(Object obj) {
                        return this.f56970a.m18745A(bhfVar, cameraDevice, (List) obj);
                    }
                }, this.f16004d.mo17114b());
                bn7.m19424j(rm7VarM46961e, new C12362a(), this.f16004d.mo17114b());
                return bn7.m19407B(rm7VarM46961e);
            }
            wja.m54629c("CaptureSession", "Open not allowed in state: " + this.f16009i);
            return bn7.m19428n(new IllegalStateException("open() should not allow the state: " + this.f16009i));
        }
    }

    @Override // p001o.ce2
    /* renamed from: b */
    public void mo18759b(List list) {
        synchronized (this.f16001a) {
            switch (this.f16009i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f16009i);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.f16002b.addAll(list);
                    break;
                case OPENED:
                    this.f16002b.addAll(list);
                    m18772w();
                    break;
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // p001o.ce2
    /* renamed from: c */
    public boolean mo18760c() {
        boolean z;
        synchronized (this.f16001a) {
            EnumC12364c enumC12364c = this.f16009i;
            z = enumC12364c == EnumC12364c.OPENED || enumC12364c == EnumC12364c.OPENING;
        }
        return z;
    }

    @Override // p001o.ce2
    public void close() {
        synchronized (this.f16001a) {
            int iOrdinal = this.f16009i.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("close() should not be possible in state: " + this.f16009i);
            }
            if (iOrdinal == 1) {
                this.f16009i = EnumC12364c.RELEASED;
            } else if (iOrdinal == 2) {
                fgd.m26664h(this.f16004d, "The Opener shouldn't null in state:" + this.f16009i);
                this.f16004d.stop();
                this.f16009i = EnumC12364c.RELEASED;
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                fgd.m26664h(this.f16004d, "The Opener shouldn't null in state:" + this.f16009i);
                this.f16004d.stop();
                this.f16009i = EnumC12364c.CLOSED;
                this.f16015o.m42447i();
                this.f16006f = null;
            }
        }
    }

    @Override // p001o.ce2
    /* renamed from: d */
    public void mo18761d() {
        ArrayList<cd2> arrayList;
        synchronized (this.f16001a) {
            if (this.f16002b.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.f16002b);
                this.f16002b.clear();
            }
        }
        if (arrayList != null) {
            for (cd2 cd2Var : arrayList) {
                Iterator it = cd2Var.m20881c().iterator();
                while (it.hasNext()) {
                    ((j72) it.next()).mo18247a(cd2Var.m20884f());
                }
            }
        }
    }

    @Override // p001o.ce2
    /* renamed from: e */
    public zfa mo18762e(boolean z) {
        synchronized (this.f16001a) {
            switch (this.f16009i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f16009i);
                case GET_SURFACE:
                    fgd.m26664h(this.f16004d, "The Opener shouldn't null in state:" + this.f16009i);
                    this.f16004d.stop();
                case INITIALIZED:
                    this.f16009i = EnumC12364c.RELEASED;
                    return bn7.m19430p(null);
                case OPENED:
                case CLOSED:
                    ugg uggVar = this.f16005e;
                    if (uggVar != null) {
                        if (z) {
                            try {
                                uggVar.mo17117e();
                            } catch (CameraAccessException e) {
                                wja.m54630d("CaptureSession", "Unable to abort captures.", e);
                            }
                        }
                        this.f16005e.close();
                    }
                case OPENING:
                    this.f16009i = EnumC12364c.RELEASING;
                    this.f16015o.m42447i();
                    fgd.m26664h(this.f16004d, "The Opener shouldn't null in state:" + this.f16009i);
                    if (this.f16004d.stop()) {
                        m18768r();
                        return bn7.m19430p(null);
                    }
                case RELEASING:
                    if (this.f16010j == null) {
                        this.f16010j = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.yd2
                            @Override // p001o.g32.InterfaceC13616c
                            public final Object attachCompleter(g32.C13614a c13614a) {
                                return this.f55287a.m18746B(c13614a);
                            }
                        });
                    }
                    return this.f16010j;
                default:
                    return bn7.m19430p(null);
            }
        }
    }

    @Override // p001o.ce2
    /* renamed from: f */
    public List mo18763f() {
        List listUnmodifiableList;
        synchronized (this.f16001a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f16002b);
        }
        return listUnmodifiableList;
    }

    @Override // p001o.ce2
    /* renamed from: g */
    public bhf mo18764g() {
        bhf bhfVar;
        synchronized (this.f16001a) {
            bhfVar = this.f16006f;
        }
        return bhfVar;
    }

    @Override // p001o.ce2
    /* renamed from: h */
    public void mo18765h(bhf bhfVar) {
        synchronized (this.f16001a) {
            switch (this.f16009i) {
                case UNINITIALIZED:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f16009i);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.f16006f = bhfVar;
                    break;
                case OPENED:
                    this.f16006f = bhfVar;
                    if (bhfVar != null) {
                        if (!this.f16007g.keySet().containsAll(bhfVar.m19035n())) {
                            wja.m54629c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            wja.m54627a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            m18773x(this.f16006f);
                            break;
                        }
                    } else {
                        return;
                    }
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override // p001o.ce2
    /* renamed from: i */
    public void mo18766i(Map map) {
        synchronized (this.f16001a) {
            this.f16012l = map;
        }
    }

    /* renamed from: o */
    public final CameraCaptureSession.CaptureCallback m18767o(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bd2.m18628a((j72) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return n52.m40112a(arrayList);
    }

    /* renamed from: r */
    public void m18768r() {
        EnumC12364c enumC12364c = this.f16009i;
        EnumC12364c enumC12364c2 = EnumC12364c.RELEASED;
        if (enumC12364c == enumC12364c2) {
            wja.m54627a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f16009i = enumC12364c2;
        this.f16005e = null;
        g32.C13614a c13614a = this.f16011k;
        if (c13614a != null) {
            c13614a.m28005c(null);
            this.f16011k = null;
        }
    }

    /* renamed from: s */
    public final dgc m18769s(bhf.AbstractC12406f abstractC12406f, Map map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesM25955d;
        Surface surface = (Surface) map.get(abstractC12406f.mo19070f());
        fgd.m26664h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        dgc dgcVar = new dgc(abstractC12406f.mo19071g(), surface);
        if (str != null) {
            dgcVar.m23036g(str);
        } else {
            dgcVar.m23036g(abstractC12406f.mo19068d());
        }
        if (abstractC12406f.mo19067c() == 0) {
            dgcVar.m23035f(1);
        } else if (abstractC12406f.mo19067c() == 1) {
            dgcVar.m23035f(2);
        }
        if (!abstractC12406f.mo19069e().isEmpty()) {
            dgcVar.m23031b();
            Iterator it = abstractC12406f.mo19069e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((yj5) it.next());
                fgd.m26664h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                dgcVar.m23030a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesM25955d = this.f16016p.m25955d()) == null) {
            jLongValue = 1;
        } else {
            y16 y16VarMo19066b = abstractC12406f.mo19066b();
            Long lM16355a = a26.m16355a(y16VarMo19066b, dynamicRangeProfilesM25955d);
            if (lM16355a == null) {
                wja.m54629c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + y16VarMo19066b);
                jLongValue = 1;
            } else {
                jLongValue = lM16355a.longValue();
            }
        }
        dgcVar.m23034e(jLongValue);
        return dgcVar;
    }

    /* renamed from: t */
    public final List m18770t(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dgc dgcVar = (dgc) it.next();
            if (!arrayList.contains(dgcVar.m23033d())) {
                arrayList.add(dgcVar.m23033d());
                arrayList2.add(dgcVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: v */
    public int m18771v(List list) {
        i72 i72Var;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        synchronized (this.f16001a) {
            if (this.f16009i != EnumC12364c.OPENED) {
                wja.m54627a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                return -1;
            }
            if (list.isEmpty()) {
                return -1;
            }
            try {
                i72Var = new i72();
                arrayList = new ArrayList();
                wja.m54627a("CaptureSession", "Issuing capture request.");
                Iterator it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    cd2 cd2Var = (cd2) it.next();
                    if (cd2Var.m20887i().isEmpty()) {
                        wja.m54627a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator it2 = cd2Var.m20887i().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = true;
                                break;
                            }
                            yj5 yj5Var = (yj5) it2.next();
                            if (!this.f16007g.containsKey(yj5Var)) {
                                wja.m54627a("CaptureSession", "Skipping capture request with invalid surface: " + yj5Var);
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            if (cd2Var.m20889k() == 2) {
                                z = true;
                            }
                            cd2.C12638a c12638aM20893j = cd2.C12638a.m20893j(cd2Var);
                            if (cd2Var.m20889k() == 5 && cd2Var.m20882d() != null) {
                                c12638aM20893j.m20905n(cd2Var.m20882d());
                            }
                            bhf bhfVar = this.f16006f;
                            if (bhfVar != null) {
                                c12638aM20893j.m20898e(bhfVar.m19031j().m20885g());
                            }
                            c12638aM20893j.m20898e(cd2Var.m20885g());
                            CaptureRequest captureRequestM55685e = x62.m55685e(c12638aM20893j.m20901h(), this.f16005e.mo17118f(), this.f16007g, false, this.f16017q);
                            if (captureRequestM55685e == null) {
                                wja.m54627a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = cd2Var.m20881c().iterator();
                            while (it3.hasNext()) {
                                bd2.m18629b((j72) it3.next(), arrayList2);
                            }
                            i72Var.m31619a(captureRequestM55685e, arrayList2);
                            arrayList.add(captureRequestM55685e);
                        }
                    }
                }
            } catch (CameraAccessException e) {
                wja.m54629c("CaptureSession", "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                wja.m54627a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                return -1;
            }
            if (this.f16013m.m20349a(arrayList, z)) {
                this.f16005e.mo17125m();
                i72Var.m31621c(new i72.InterfaceC14202a() { // from class: o.ae2
                    @Override // p001o.i72.InterfaceC14202a
                    /* renamed from: a */
                    public final void mo16941a(CameraCaptureSession cameraCaptureSession, int i, boolean z3) {
                        this.f14560a.m18755y(cameraCaptureSession, i, z3);
                    }
                });
            }
            if (this.f16014n.m50439b(arrayList, z)) {
                i72Var.m31619a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new C12363b()));
            }
            return this.f16005e.mo17122j(arrayList, i72Var);
        }
    }

    /* renamed from: w */
    public void m18772w() {
        this.f16015o.m42445e().addListener(new Runnable() { // from class: o.xd2
            @Override // java.lang.Runnable
            public final void run() {
                this.f53543a.m18756z();
            }
        }, gb2.m28293a());
    }

    /* renamed from: x */
    public int m18773x(bhf bhfVar) {
        synchronized (this.f16001a) {
            if (bhfVar == null) {
                wja.m54627a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f16009i != EnumC12364c.OPENED) {
                wja.m54627a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            cd2 cd2VarM19031j = bhfVar.m19031j();
            if (cd2VarM19031j.m20887i().isEmpty()) {
                wja.m54627a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f16005e.mo17125m();
                } catch (CameraAccessException e) {
                    wja.m54629c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                wja.m54627a("CaptureSession", "Issuing request for session.");
                CaptureRequest captureRequestM55685e = x62.m55685e(cd2VarM19031j, this.f16005e.mo17118f(), this.f16007g, true, this.f16017q);
                if (captureRequestM55685e == null) {
                    wja.m54627a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f16005e.mo17119g(captureRequestM55685e, this.f16015o.m42444d(m18767o(cd2VarM19031j.m20881c(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e2) {
                wja.m54629c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    public be2(f26 f26Var, boolean z) {
        this(f26Var, new l5e(Collections.emptyList()), z);
    }

    public be2(f26 f26Var, l5e l5eVar) {
        this(f26Var, l5eVar, false);
    }

    public be2(f26 f26Var, l5e l5eVar, boolean z) {
        this.f16001a = new Object();
        this.f16002b = new ArrayList();
        this.f16007g = new HashMap();
        this.f16008h = Collections.emptyList();
        this.f16009i = EnumC12364c.UNINITIALIZED;
        this.f16012l = new HashMap();
        this.f16013m = new c6g();
        this.f16014n = new tsh();
        this.f16009i = EnumC12364c.INITIALIZED;
        this.f16016p = f26Var;
        this.f16003c = new C12365d();
        this.f16015o = new ome(l5eVar.m36593a(CaptureNoResponseQuirk.class));
        this.f16017q = new meh(l5eVar);
        this.f16018r = z;
    }
}
