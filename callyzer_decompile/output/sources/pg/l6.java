package pg;

import a1.C0005d;
import al.C0182j;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import ch.C0972b;
import id.AbstractC3243m;
import id.C3238h;
import id.C3239i;
import id.C3241k;
import id.C3242l;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class l6 {
    /* renamed from: a */
    public static final String m11757a(C0182j c0182j) {
        AbstractC3243m abstractC3243mM419j = c0182j.m419j();
        if (abstractC3243mM419j instanceof C3242l) {
            String str = ((C3242l) abstractC3243mM419j).f17416b;
            return str == null ? "" : str;
        }
        if (abstractC3243mM419j == null || (abstractC3243mM419j instanceof C3239i)) {
            return "";
        }
        throw new DeserializationException("expected XmlToken.Text element, found " + abstractC3243mM419j);
    }

    /* renamed from: b */
    public static final C0182j m11758b(C3238h c3238h, C0005d c0005d) {
        C3241k c3241k = c3238h.f17406b;
        AbstractC3243m abstractC3243m = (AbstractC3243m) c0005d.f26d;
        C3238h c3238h2 = abstractC3243m instanceof C3238h ? (C3238h) abstractC3243m : null;
        if (c3238h2 == null) {
            throw new IllegalStateException(("expected start tag found " + ((AbstractC3243m) c0005d.f26d)).toString());
        }
        C3241k c3241k2 = c3238h2.f17406b;
        if (c3241k.equals(c3241k2)) {
            C0182j c0182j = new C0182j();
            c0182j.f555b = c3238h;
            c0182j.f556c = c0005d;
            return c0182j;
        }
        throw new IllegalStateException(("expected start tag " + c3241k + " but current reader state is on " + c3241k2).toString());
    }

    /* renamed from: c */
    public static final C0182j m11759c(byte[] payload) {
        boolean z6;
        AbstractC4154l.m8923f(payload, "payload");
        C0005d c0005d = new C0005d(new C8849i(new C0972b(AbstractC5185w.m10126h(payload))));
        AbstractC3243m abstractC3243mM40G = (AbstractC3243m) c0005d.f26d;
        do {
            z6 = abstractC3243mM40G instanceof C3238h;
            if (!z6) {
                abstractC3243mM40G = c0005d.m40G();
            }
            if (abstractC3243mM40G == null) {
                break;
            }
        } while (!z6);
        C3238h c3238h = (C3238h) abstractC3243mM40G;
        if (c3238h != null) {
            return m11758b(c3238h, c0005d);
        }
        throw new IllegalStateException(("expected start tag: last = " + ((AbstractC3243m) c0005d.f26d)).toString());
    }
}
