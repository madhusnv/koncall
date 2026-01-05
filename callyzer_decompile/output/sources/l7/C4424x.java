package l7;

import a9.AbstractC0067f;
import ba.AbstractC0638h;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4599w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.x */
/* loaded from: classes.dex */
public final class C4424x extends AbstractC0067f {

    /* renamed from: f */
    public final o0 f22141f;

    /* renamed from: g */
    public final String f22142g;

    /* renamed from: h */
    public final ArrayList f22143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4424x(o0 provider, String startDestination) {
        super(provider.m9233b(AbstractC0638h.m1854b(C4426z.class)), (String) null);
        AbstractC4154l.m8923f(provider, "provider");
        AbstractC4154l.m8923f(startDestination, "startDestination");
        this.f22143h = new ArrayList();
        this.f22141f = provider;
        this.f22142g = startDestination;
    }

    /* renamed from: g */
    public final C4423w m9256g() {
        C4423w c4423w = (C4423w) super.mo186a();
        ArrayList nodes = this.f22143h;
        AbstractC4154l.m8923f(nodes, "nodes");
        C4599w c4599w = c4423w.f22140g;
        c4599w.getClass();
        int size = nodes.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = nodes.get(i10);
            i10++;
            AbstractC4422v abstractC4422v = (AbstractC4422v) obj;
            if (abstractC4422v != null) {
                c4599w.m9449a(abstractC4422v);
            }
        }
        String str = this.f22142g;
        if (str != null) {
            c4599w.m9472y(str);
            return c4423w;
        }
        if (((String) this.f252b) != null) {
            throw new IllegalStateException("You must set a start destination route");
        }
        throw new IllegalStateException("You must set a start destination id");
    }
}
