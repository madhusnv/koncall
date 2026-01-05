package og;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.o */
/* loaded from: classes.dex */
public abstract class AbstractC5374o {

    /* renamed from: a */
    public transient C5367h f26680a;

    /* renamed from: b */
    public transient C5369j f26681b;

    /* renamed from: a */
    public final Map m10787a() {
        C5369j c5369j = this.f26681b;
        if (c5369j != null) {
            return c5369j;
        }
        C5375p c5375p = (C5375p) this;
        C5369j c5369j2 = new C5369j(c5375p, c5375p.f26714c);
        this.f26681b = c5369j2;
        return c5369j2;
    }

    /* renamed from: b */
    public final Set m10788b() {
        C5367h c5367h = this.f26680a;
        if (c5367h != null) {
            return c5367h;
        }
        C5375p c5375p = (C5375p) this;
        C5367h c5367h2 = new C5367h(c5375p, c5375p.f26714c);
        this.f26680a = c5367h2;
        return c5367h2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5374o) {
            return m10787a().equals(((AbstractC5374o) obj).m10787a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C5369j) m10787a()).f26550c.hashCode();
    }

    public final String toString() {
        return ((C5369j) m10787a()).f26550c.toString();
    }
}
