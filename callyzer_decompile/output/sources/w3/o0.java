package w3;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import b4.C0595a;
import b4.C0597c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 implements ComponentCallbacks2 {

    /* renamed from: a */
    public final /* synthetic */ Configuration f37904a;

    /* renamed from: b */
    public final /* synthetic */ C0597c f37905b;

    public o0(Configuration configuration, C0597c c0597c) {
        this.f37904a = configuration;
        this.f37905b = c0597c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f37904a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f37905b.f3974a.entrySet().iterator();
        while (it.hasNext()) {
            C0595a c0595a = (C0595a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c0595a == null || Configuration.needNewResources(iUpdateFrom, c0595a.f3971b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f37905b.f3974a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f37905b.f3974a.clear();
    }
}
