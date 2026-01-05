package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class lnb implements qtf {

    /* renamed from: a */
    public final AtomicReference f34115a = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f34116b = new AtomicReference();

    /* renamed from: o.lnb$a */
    public static final class C15110a extends AtomicReference {

        /* renamed from: a */
        public Object f34117a;

        public C15110a() {
        }

        /* renamed from: a */
        public Object m37523a() {
            Object objM37524b = m37524b();
            m37527e(null);
            return objM37524b;
        }

        /* renamed from: b */
        public Object m37524b() {
            return this.f34117a;
        }

        /* renamed from: c */
        public C15110a m37525c() {
            return (C15110a) get();
        }

        /* renamed from: d */
        public void m37526d(C15110a c15110a) {
            lazySet(c15110a);
        }

        /* renamed from: e */
        public void m37527e(Object obj) {
            this.f34117a = obj;
        }

        public C15110a(Object obj) {
            m37527e(obj);
        }
    }

    public lnb() {
        C15110a c15110a = new C15110a();
        m37521d(c15110a);
        m37522e(c15110a);
    }

    /* renamed from: a */
    public C15110a m37518a() {
        return (C15110a) this.f34116b.get();
    }

    /* renamed from: b */
    public C15110a m37519b() {
        return (C15110a) this.f34116b.get();
    }

    /* renamed from: c */
    public C15110a m37520c() {
        return (C15110a) this.f34115a.get();
    }

    @Override // p001o.rtf
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* renamed from: d */
    public void m37521d(C15110a c15110a) {
        this.f34116b.lazySet(c15110a);
    }

    /* renamed from: e */
    public C15110a m37522e(C15110a c15110a) {
        return (C15110a) this.f34115a.getAndSet(c15110a);
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return m37519b() == m37520c();
    }

    @Override // p001o.rtf
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C15110a c15110a = new C15110a(obj);
        m37522e(c15110a).m37526d(c15110a);
        return true;
    }

    @Override // p001o.qtf, p001o.rtf
    public Object poll() {
        C15110a c15110aM37525c;
        C15110a c15110aM37518a = m37518a();
        C15110a c15110aM37525c2 = c15110aM37518a.m37525c();
        if (c15110aM37525c2 != null) {
            Object objM37523a = c15110aM37525c2.m37523a();
            m37521d(c15110aM37525c2);
            return objM37523a;
        }
        if (c15110aM37518a == m37520c()) {
            return null;
        }
        do {
            c15110aM37525c = c15110aM37518a.m37525c();
        } while (c15110aM37525c == null);
        Object objM37523a2 = c15110aM37525c.m37523a();
        m37521d(c15110aM37525c);
        return objM37523a2;
    }
}
