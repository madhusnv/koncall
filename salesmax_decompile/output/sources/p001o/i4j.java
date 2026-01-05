package p001o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class i4j extends WeakReference {

    /* renamed from: a */
    public final q8c f28084a;

    /* renamed from: b */
    public final int f28085b;

    /* renamed from: c */
    public Object f28086c;

    public i4j(ewi ewiVar, int i, q8c q8cVar, ReferenceQueue referenceQueue) {
        super(ewiVar, referenceQueue);
        this.f28085b = i;
        this.f28084a = q8cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public ewi m31568a() {
        ewi ewiVar = (ewi) get();
        if (ewiVar == null) {
            m31572e();
        }
        return ewiVar;
    }

    /* renamed from: b */
    public Object m31569b() {
        return this.f28086c;
    }

    /* renamed from: c */
    public void m31570c(xca xcaVar) {
        this.f28084a.mo25702c(xcaVar);
    }

    /* renamed from: d */
    public void m31571d(Object obj) {
        m31572e();
        this.f28086c = obj;
        if (obj != null) {
            this.f28084a.mo25701b(obj);
        }
    }

    /* renamed from: e */
    public boolean m31572e() {
        boolean z;
        Object obj = this.f28086c;
        if (obj != null) {
            this.f28084a.mo25700a(obj);
            z = true;
        } else {
            z = false;
        }
        this.f28086c = null;
        return z;
    }
}
