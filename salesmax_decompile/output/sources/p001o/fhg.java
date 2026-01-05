package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001o.ugg;

/* loaded from: classes2.dex */
public final class fhg extends ugg.AbstractC17377c {

    /* renamed from: a */
    public final List f23346a;

    public fhg(List list) {
        ArrayList arrayList = new ArrayList();
        this.f23346a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: w */
    public static ugg.AbstractC17377c m26708w(ugg.AbstractC17377c... abstractC17377cArr) {
        return new fhg(Arrays.asList(abstractC17377cArr));
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: o */
    public void mo17126o(ugg uggVar) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17126o(uggVar);
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: p */
    public void mo17127p(ugg uggVar) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17127p(uggVar);
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: q */
    public void mo17128q(ugg uggVar) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17128q(uggVar);
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: r */
    public void mo17129r(ugg uggVar) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17129r(uggVar);
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: s */
    public void mo17130s(ugg uggVar) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17130s(uggVar);
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: t */
    public void mo17131t(ugg uggVar) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17131t(uggVar);
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: u */
    public void mo17132u(ugg uggVar) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17132u(uggVar);
        }
    }

    @Override // p001o.ugg.AbstractC17377c
    /* renamed from: v */
    public void mo17133v(ugg uggVar, Surface surface) {
        Iterator it = this.f23346a.iterator();
        while (it.hasNext()) {
            ((ugg.AbstractC17377c) it.next()).mo17133v(uggVar, surface);
        }
    }

    /* renamed from: o.fhg$a */
    public static class C13432a extends ugg.AbstractC17377c {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f23347a;

        public C13432a(CameraCaptureSession.StateCallback stateCallback) {
            this.f23347a = stateCallback;
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: o */
        public void mo17126o(ugg uggVar) {
            this.f23347a.onActive(uggVar.mo17124l().m55763c());
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: p */
        public void mo17127p(ugg uggVar) {
            fi0.m26710a(this.f23347a, uggVar.mo17124l().m55763c());
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: q */
        public void mo17128q(ugg uggVar) {
            this.f23347a.onClosed(uggVar.mo17124l().m55763c());
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: r */
        public void mo17129r(ugg uggVar) {
            this.f23347a.onConfigureFailed(uggVar.mo17124l().m55763c());
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: s */
        public void mo17130s(ugg uggVar) {
            this.f23347a.onConfigured(uggVar.mo17124l().m55763c());
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: t */
        public void mo17131t(ugg uggVar) {
            this.f23347a.onReady(uggVar.mo17124l().m55763c());
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: u */
        public void mo17132u(ugg uggVar) {
        }

        @Override // p001o.ugg.AbstractC17377c
        /* renamed from: v */
        public void mo17133v(ugg uggVar, Surface surface) {
            ci0.m21292a(this.f23347a, uggVar.mo17124l().m55763c(), surface);
        }

        public C13432a(List list) {
            this(o82.m41757a(list));
        }
    }
}
