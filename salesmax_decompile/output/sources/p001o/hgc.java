package p001o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes2.dex */
public class hgc extends ggc {
    public hgc(int i, Surface surface) {
        this(new OutputConfiguration(i, surface));
    }

    /* renamed from: n */
    public static hgc m30423n(OutputConfiguration outputConfiguration) {
        return new hgc(outputConfiguration);
    }

    @Override // p001o.egc, p001o.igc, p001o.dgc.InterfaceC12904a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Surface mo23039a() {
        return super.mo23039a();
    }

    @Override // p001o.igc, p001o.dgc.InterfaceC12904a
    /* renamed from: b */
    public void mo23040b(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) mo23047i()).setStreamUseCase(j);
    }

    @Override // p001o.fgc, p001o.igc, p001o.dgc.InterfaceC12904a
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo23041c(Surface surface) {
        super.mo23041c(surface);
    }

    @Override // p001o.ggc, p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: d */
    public void mo23042d(long j) {
        ((OutputConfiguration) mo23047i()).setDynamicRangeProfile(j);
    }

    @Override // p001o.ggc, p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo23043e(String str) {
        super.mo23043e(str);
    }

    @Override // p001o.igc
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p001o.ggc, p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ String mo23044f() {
        return super.mo23044f();
    }

    @Override // p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: g */
    public /* bridge */ /* synthetic */ void mo23045g() {
        super.mo23045g();
    }

    @Override // p001o.igc, p001o.dgc.InterfaceC12904a
    /* renamed from: h */
    public void mo23046h(int i) {
        ((OutputConfiguration) mo23047i()).setMirrorMode(i);
    }

    @Override // p001o.igc
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p001o.ggc, p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: i */
    public Object mo23047i() {
        fgd.m26657a(this.f28648a instanceof OutputConfiguration);
        return this.f28648a;
    }

    public hgc(Object obj) {
        super(obj);
    }
}
