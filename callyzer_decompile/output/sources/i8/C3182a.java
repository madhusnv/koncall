package i8;

import android.os.Bundle;
import aw.C0465e;
import bl.C0689a;
import d7.C1639l;
import d7.EnumC1645q;
import g8.InterfaceC2547g;
import java.io.IOException;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i8.a */
/* loaded from: classes.dex */
public final class C3182a {

    /* renamed from: a */
    public final InterfaceC2547g f17106a;

    /* renamed from: b */
    public final C0465e f17107b;

    /* renamed from: e */
    public boolean f17110e;

    /* renamed from: f */
    public Bundle f17111f;

    /* renamed from: g */
    public boolean f17112g;

    /* renamed from: c */
    public final C0689a f17108c = new C0689a(17);

    /* renamed from: d */
    public final LinkedHashMap f17109d = new LinkedHashMap();

    /* renamed from: h */
    public boolean f17113h = true;

    public C3182a(InterfaceC2547g interfaceC2547g, C0465e c0465e) {
        this.f17106a = interfaceC2547g;
        this.f17107b = c0465e;
    }

    /* renamed from: a */
    public final void m7540a() throws IOException {
        InterfaceC2547g interfaceC2547g = this.f17106a;
        if (interfaceC2547g.getLifecycle().mo5344b() != EnumC1645q.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f17110e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f17107b.invoke();
        interfaceC2547g.getLifecycle().mo5343a(new C1639l(2, this));
        this.f17110e = true;
    }
}
