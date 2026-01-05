package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class wcd {

    /* renamed from: a */
    public final Map f51786a = new LinkedHashMap();

    /* renamed from: o.wcd$a */
    public static final class C17819a {

        /* renamed from: a */
        public final long f51787a;

        /* renamed from: b */
        public final long f51788b;

        /* renamed from: c */
        public final boolean f51789c;

        /* renamed from: d */
        public final int f51790d;

        public /* synthetic */ C17819a(long j, long j2, boolean z, int i, id5 id5Var) {
            this(j, j2, z, i);
        }

        /* renamed from: a */
        public final boolean m54222a() {
            return this.f51789c;
        }

        /* renamed from: b */
        public final long m54223b() {
            return this.f51788b;
        }

        /* renamed from: c */
        public final long m54224c() {
            return this.f51787a;
        }

        public C17819a(long j, long j2, boolean z, int i) {
            this.f51787a = j;
            this.f51788b = j2;
            this.f51789c = z;
            this.f51790d = i;
        }
    }

    /* renamed from: a */
    public final void m54220a() {
        this.f51786a.clear();
    }

    /* renamed from: b */
    public final vp8 m54221b(xcd xcdVar, ted tedVar) {
        long jM57573j;
        boolean zM54222a;
        long jMo5069l;
        sq8.m48649h(xcdVar, "pointerInputEvent");
        sq8.m48649h(tedVar, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(xcdVar.m56022b().size());
        List listM56022b = xcdVar.m56022b();
        int size = listM56022b.size();
        for (int i = 0; i < size; i++) {
            ycd ycdVar = (ycd) listM56022b.get(i);
            C17819a c17819a = (C17819a) this.f51786a.get(ucd.m51363a(ycdVar.m57566c()));
            if (c17819a == null) {
                jM57573j = ycdVar.m57573j();
                jMo5069l = ycdVar.m57568e();
                zM54222a = false;
            } else {
                long jM54224c = c17819a.m54224c();
                jM57573j = jM54224c;
                zM54222a = c17819a.m54222a();
                jMo5069l = tedVar.mo5069l(c17819a.m54223b());
            }
            linkedHashMap.put(ucd.m51363a(ycdVar.m57566c()), new vcd(ycdVar.m57566c(), ycdVar.m57573j(), ycdVar.m57568e(), ycdVar.m57564a(), ycdVar.m57570g(), jM57573j, jMo5069l, zM54222a, false, ycdVar.m57572i(), ycdVar.m57565b(), ycdVar.m57571h(), null));
            if (ycdVar.m57564a()) {
                this.f51786a.put(ucd.m51363a(ycdVar.m57566c()), new C17819a(ycdVar.m57573j(), ycdVar.m57569f(), ycdVar.m57564a(), ycdVar.m57572i(), null));
            } else {
                this.f51786a.remove(ucd.m51363a(ycdVar.m57566c()));
            }
        }
        return new vp8(linkedHashMap, xcdVar);
    }
}
