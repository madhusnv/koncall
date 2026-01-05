package r6;

import a3.C0043b;
import android.content.Context;
import bl.C0689a;
import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4574m;
import nu.C5142c;
import o6.C5321w;
import o6.a0;
import o6.b0;
import o6.c0;
import og.pe;
import s6.C6764c;
import s6.C6768g;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r6.a */
/* loaded from: classes.dex */
public final class C6472a {

    /* renamed from: a */
    public final String f31138a;

    /* renamed from: b */
    public final InterfaceC2139c f31139b;

    /* renamed from: c */
    public final InterfaceC7266z f31140c;

    /* renamed from: d */
    public final Object f31141d;

    /* renamed from: e */
    public volatile C6764c f31142e;

    public C6472a(String name, InterfaceC2139c interfaceC2139c, InterfaceC7266z interfaceC7266z) {
        AbstractC4154l.m8923f(name, "name");
        this.f31138a = name;
        this.f31139b = interfaceC2139c;
        this.f31140c = interfaceC7266z;
        this.f31141d = new Object();
    }

    /* renamed from: a */
    public final Object m12455a(Object obj, InterfaceC4574m property) {
        C6764c c6764c;
        Context thisRef = (Context) obj;
        AbstractC4154l.m8923f(thisRef, "thisRef");
        AbstractC4154l.m8923f(property, "property");
        C6764c c6764c2 = this.f31142e;
        if (c6764c2 != null) {
            return c6764c2;
        }
        synchronized (this.f31141d) {
            try {
                if (this.f31142e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    InterfaceC2139c interfaceC2139c = this.f31139b;
                    AbstractC4154l.m8922e(applicationContext, "applicationContext");
                    List migrations = (List) interfaceC2139c.invoke(applicationContext);
                    InterfaceC7266z interfaceC7266z = this.f31140c;
                    C0043b c0043b = new C0043b(17, applicationContext, this);
                    AbstractC4154l.m8923f(migrations, "migrations");
                    this.f31142e = new C6764c(new C6764c(new C5321w(new c0(C6768g.f32223a, a0.f26001a, new b0(3, c0043b)), pe.m10833h(new C5142c(migrations, null, 1)), new C0689a(23), interfaceC7266z)));
                }
                c6764c = this.f31142e;
                AbstractC4154l.m8920c(c6764c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6764c;
    }
}
