package pg;

import ad.C0104k;
import ad.C0109p;
import ad.C0118y;
import ad.C0119z;
import java.util.ArrayList;
import jc.AbstractC3745u;
import jc.InterfaceC3732h;
import jc.InterfaceC3738n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import tb.C7105p;
import tc.C7117b;
import tc.C7122g;
import tc.C7123h;
import tc.InterfaceC7116a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.h */
/* loaded from: classes.dex */
public abstract class AbstractC5927h {
    /* renamed from: a */
    public static final C7123h m11669a(jc.e0 method, C0109p c0109p, InterfaceC3738n headers, AbstractC3745u body, InterfaceC3732h trailingHeaders) {
        AbstractC4154l.m8923f(method, "method");
        AbstractC4154l.m8923f(headers, "headers");
        AbstractC4154l.m8923f(body, "body");
        AbstractC4154l.m8923f(trailingHeaders, "trailingHeaders");
        return new C7123h(method, c0109p, headers, body, trailingHeaders);
    }

    /* renamed from: b */
    public static final C7117b m11670b(InterfaceC7116a interfaceC7116a) {
        AbstractC4154l.m8923f(interfaceC7116a, "<this>");
        if (interfaceC7116a instanceof C7122g) {
            C7122g c7122g = (C7122g) interfaceC7116a;
            if (c7122g.f34330b) {
                return c7122g.f34329a;
            }
            throw new IllegalStateException("This is an immutable HttpRequest that should not be converted to a builder");
        }
        if (!(interfaceC7116a instanceof C7123h)) {
            throw new NoWhenBranchMatchedException();
        }
        C7117b c7117b = new C7117b();
        C7123h c7123h = (C7123h) interfaceC7116a;
        c7117b.m13402b(c7123h.f34335a);
        c7117b.f34312c.m337q(c7123h.f34337c);
        C0109p c0109p = c7123h.f34336b;
        C0104k c0104k = c7117b.f34311b;
        c0104k.getClass();
        c0104k.f358a = c0109p.f375a;
        c0104k.f359b = c0109p.f376b;
        c0104k.f360c = Integer.valueOf(c0109p.f377c);
        com.google.android.gms.internal.measurement.j4 j4Var = c0104k.f361d;
        C0118y c0118y = c0109p.f378d;
        ArrayList arrayList = (ArrayList) j4Var.f6252c;
        arrayList.clear();
        arrayList.addAll(c0118y.f393a);
        j4Var.f6251b = c0118y.f394b;
        c0104k.f362e.m265f(c0109p.f379e);
        C7105p c7105p = c0104k.f363f;
        C0119z c0119z = c0109p.f380f;
        c7105p.getClass();
        c7105p.f34290b = c0119z.f396a;
        c7105p.f34291c = c0119z.f397b;
        c0104k.f364g = c0109p.f381g;
        AbstractC3745u abstractC3745u = c7123h.f34338d;
        AbstractC4154l.m8923f(abstractC3745u, "<set-?>");
        c7117b.f34313d = abstractC3745u;
        c7117b.f34314e.m337q(c7123h.f34339e);
        return c7117b;
    }
}
