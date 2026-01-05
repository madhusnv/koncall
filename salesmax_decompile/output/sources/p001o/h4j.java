package p001o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class h4j {

    /* renamed from: a */
    public final fqb f26204a = new fqb(new Reference[16], 0);

    /* renamed from: b */
    public final ReferenceQueue f26205b = new ReferenceQueue();

    /* renamed from: a */
    public final void m29815a() {
        Reference referencePoll;
        do {
            referencePoll = this.f26205b.poll();
            if (referencePoll != null) {
                this.f26204a.m27359t(referencePoll);
            }
        } while (referencePoll != null);
    }

    /* renamed from: b */
    public final Object m29816b() {
        m29815a();
        while (this.f26204a.m27357r()) {
            Object obj = ((Reference) this.f26204a.m27361v(r0.m27354o() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m29817c(Object obj) {
        m29815a();
        this.f26204a.m27344c(new WeakReference(obj, this.f26205b));
    }
}
