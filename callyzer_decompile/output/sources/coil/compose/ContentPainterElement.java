package coil.compose;

import c3.C0850e;
import com.sun.mail.util.AbstractC1452a;
import d3.C1559m;
import kotlin.jvm.internal.AbstractC4154l;
import t3.InterfaceC7023j;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;
import w2.InterfaceC7866e;
import xd.C8339j;
import xd.C8344o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ContentPainterElement extends a1 {

    /* renamed from: a */
    public final C8339j f5816a;

    /* renamed from: b */
    public final InterfaceC7866e f5817b;

    /* renamed from: c */
    public final InterfaceC7023j f5818c;

    /* renamed from: d */
    public final float f5819d;

    /* renamed from: e */
    public final C1559m f5820e;

    public ContentPainterElement(C8339j c8339j, InterfaceC7866e interfaceC7866e, InterfaceC7023j interfaceC7023j, float f6, C1559m c1559m) {
        this.f5816a = c8339j;
        this.f5817b = interfaceC7866e;
        this.f5818c = interfaceC7023j;
        this.f5819d = f6;
        this.f5820e = c1559m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return this.f5816a.equals(contentPainterElement.f5816a) && AbstractC4154l.m8918a(this.f5817b, contentPainterElement.f5817b) && AbstractC4154l.m8918a(this.f5818c, contentPainterElement.f5818c) && Float.compare(this.f5819d, contentPainterElement.f5819d) == 0 && AbstractC4154l.m8918a(this.f5820e, contentPainterElement.f5820e);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C8344o c8344o = new C8344o();
        c8344o.f39959q = this.f5816a;
        c8344o.f39960r = this.f5817b;
        c8344o.f39961s = this.f5818c;
        c8344o.f39962t = this.f5819d;
        c8344o.f39963v = this.f5820e;
        return c8344o;
    }

    public final int hashCode() {
        int iM4555b = AbstractC1452a.m4555b(this.f5819d, (this.f5818c.hashCode() + ((this.f5817b.hashCode() + (this.f5816a.hashCode() * 31)) * 31)) * 31, 31);
        C1559m c1559m = this.f5820e;
        return iM4555b + (c1559m == null ? 0 : c1559m.hashCode());
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C8344o c8344o = (C8344o) abstractC7878q;
        long jMo7533h = c8344o.f39959q.mo7533h();
        C8339j c8339j = this.f5816a;
        boolean zM2290a = C0850e.m2290a(jMo7533h, c8339j.mo7533h());
        c8344o.f39959q = c8339j;
        c8344o.f39960r = this.f5817b;
        c8344o.f39961s = this.f5818c;
        c8344o.f39962t = this.f5819d;
        c8344o.f39963v = this.f5820e;
        if (!zM2290a) {
            AbstractC7634f.m14553n(c8344o);
        }
        AbstractC7634f.m14552m(c8344o);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f5816a + ", alignment=" + this.f5817b + ", contentScale=" + this.f5818c + ", alpha=" + this.f5819d + ", colorFilter=" + this.f5820e + ')';
    }
}
