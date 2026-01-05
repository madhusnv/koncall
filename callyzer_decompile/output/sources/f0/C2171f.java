package f0;

import d0.AbstractC1545b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f0.f */
/* loaded from: classes.dex */
public final class C2171f extends AbstractC1545b {

    /* renamed from: c */
    public static final EnumC2170e f10038c = EnumC2170e.OFF;

    /* renamed from: a */
    public final EnumC2170e f10039a;

    /* renamed from: b */
    public final EnumC2167b f10040b;

    public C2171f(EnumC2170e mode) {
        AbstractC4154l.m8923f(mode, "mode");
        this.f10039a = mode;
        this.f10040b = EnumC2167b.VIDEO_STABILIZATION;
    }

    @Override // d0.AbstractC1545b
    /* renamed from: a */
    public final EnumC2167b mo5083a() {
        return this.f10040b;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.f10039a.name() + ')';
    }
}
