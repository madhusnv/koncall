package z7;

import android.os.Looper;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import p014p.C5785a;
import p020v.RunnableC7606p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC8879h {

    /* renamed from: b */
    public final /* synthetic */ C8889r f42689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String[] strArr, C8889r c8889r) {
        super(strArr);
        this.f42689b = c8889r;
    }

    @Override // z7.AbstractC8879h
    /* renamed from: a */
    public final void mo16374a(Set tables) {
        AbstractC4154l.m8923f(tables, "tables");
        C5785a c5785aM11334g = C5785a.m11334g();
        RunnableC7606p runnableC7606p = new RunnableC7606p(13, this.f42689b);
        c5785aM11334g.f28364a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnableC7606p.run();
        } else {
            c5785aM11334g.m11335h(runnableC7606p);
        }
    }
}
