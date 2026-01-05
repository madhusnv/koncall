package p001o;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class z54 {

    /* renamed from: a */
    public final Set f56559a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f56560b;

    /* renamed from: a */
    public final void m58764a(lbc lbcVar) {
        sq8.m48649h(lbcVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = this.f56560b;
        if (context != null) {
            lbcVar.mo3786a(context);
        }
        this.f56559a.add(lbcVar);
    }

    /* renamed from: b */
    public final void m58765b() {
        this.f56560b = null;
    }

    /* renamed from: c */
    public final void m58766c(Context context) {
        sq8.m48649h(context, "context");
        this.f56560b = context;
        Iterator it = this.f56559a.iterator();
        while (it.hasNext()) {
            ((lbc) it.next()).mo3786a(context);
        }
    }

    /* renamed from: d */
    public final Context m58767d() {
        return this.f56560b;
    }

    /* renamed from: e */
    public final void m58768e(lbc lbcVar) {
        sq8.m48649h(lbcVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56559a.remove(lbcVar);
    }
}
