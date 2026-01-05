package u8;

import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4427a;
import mq.C4833a;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.a */
/* loaded from: classes.dex */
public final class C7353a {

    /* renamed from: a */
    public final /* synthetic */ int f34989a = 1;

    /* renamed from: b */
    public final Object f34990b;

    public C7353a(C4833a c4833a) {
        this.f34990b = c4833a;
    }

    /* renamed from: a */
    public final void m13766a(InterfaceC4427a db2) {
        switch (this.f34989a) {
            case 0:
                AbstractC4154l.m8923f(db2, "db");
                db2.mo9262k();
                try {
                    StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((C7077w) this.f34990b).getClass();
                    sb2.append(System.currentTimeMillis() - AbstractC7366n.f35038a);
                    sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    db2.mo9263p(sb2.toString());
                    db2.mo9259F();
                    return;
                } finally {
                    db2.mo9261T();
                }
            default:
                AbstractC4154l.m8923f(db2, "db");
                ((C4833a) this.f34990b).invoke(db2);
                return;
        }
    }

    public C7353a(C7077w clock) {
        AbstractC4154l.m8923f(clock, "clock");
        this.f34990b = clock;
    }
}
