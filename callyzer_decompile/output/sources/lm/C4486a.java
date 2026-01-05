package lm;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import uo.C7476a;
import uo.C7481f;
import ww.AbstractC8199i;
import xm.C8418z;
import xm.y5;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lm.a */
/* loaded from: classes3.dex */
public final class C4486a {

    /* renamed from: a */
    public final C8805t f22319a;

    /* renamed from: b */
    public final C7481f f22320b;

    /* renamed from: c */
    public final C7476a f22321c;

    /* renamed from: d */
    public final C8418z f22322d;

    /* renamed from: e */
    public final y5 f22323e;

    /* renamed from: f */
    public final AbstractC8199i f22324f;

    /* renamed from: g */
    public final InterfaceC2139c f22325g;

    /* JADX WARN: Multi-variable type inference failed */
    public C4486a(C8805t traceLog, C7481f simVerificationUseCase, C7476a callDetailVerificationUseCase, C8418z appPreferencesRepository, y5 simDetailRepository, InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(traceLog, "traceLog");
        AbstractC4154l.m8923f(simVerificationUseCase, "simVerificationUseCase");
        AbstractC4154l.m8923f(callDetailVerificationUseCase, "callDetailVerificationUseCase");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        AbstractC4154l.m8923f(simDetailRepository, "simDetailRepository");
        this.f22319a = traceLog;
        this.f22320b = simVerificationUseCase;
        this.f22321c = callDetailVerificationUseCase;
        this.f22322d = appPreferencesRepository;
        this.f22323e = simDetailRepository;
        this.f22324f = (AbstractC8199i) interfaceC2141e;
        this.f22325g = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4486a)) {
            return false;
        }
        C4486a c4486a = (C4486a) obj;
        return AbstractC4154l.m8918a(this.f22319a, c4486a.f22319a) && AbstractC4154l.m8918a(this.f22320b, c4486a.f22320b) && AbstractC4154l.m8918a(this.f22321c, c4486a.f22321c) && AbstractC4154l.m8918a(this.f22322d, c4486a.f22322d) && AbstractC4154l.m8918a(this.f22323e, c4486a.f22323e) && this.f22324f.equals(c4486a.f22324f) && this.f22325g.equals(c4486a.f22325g);
    }

    public final int hashCode() {
        return this.f22325g.hashCode() + ((this.f22324f.hashCode() + ((this.f22323e.hashCode() + ((this.f22322d.hashCode() + ((this.f22321c.hashCode() + ((this.f22320b.hashCode() + (this.f22319a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Dependencies(traceLog=" + this.f22319a + ", simVerificationUseCase=" + this.f22320b + ", callDetailVerificationUseCase=" + this.f22321c + ", appPreferencesRepository=" + this.f22322d + ", simDetailRepository=" + this.f22323e + ", fetchCallLogs=" + this.f22324f + ", stopCallMonitorService=" + this.f22325g + ")";
    }
}
