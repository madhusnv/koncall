package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public class kia {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32277a = AtomicReferenceFieldUpdater.newUpdater(kia.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32278b = AtomicReferenceFieldUpdater.newUpdater(kia.class, Object.class, "_prev$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32279c = AtomicReferenceFieldUpdater.newUpdater(kia.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: d */
    public final boolean m35733d(kia kiaVar, int i) {
        kia kiaVarM35742m;
        do {
            kiaVarM35742m = m35742m();
            if (kiaVarM35742m instanceof gea) {
                return (((gea) kiaVarM35742m).f25036d & i) == 0 && kiaVarM35742m.m35733d(kiaVar, i);
            }
        } while (!kiaVarM35742m.m35734e(kiaVar, this));
        return true;
    }

    /* renamed from: e */
    public final boolean m35734e(kia kiaVar, kia kiaVar2) {
        f32278b.set(kiaVar, this);
        f32277a.set(kiaVar, kiaVar2);
        if (!j9.m33417a(f32277a, this, kiaVar2, kiaVar)) {
            return false;
        }
        kiaVar.m35739j(kiaVar2);
        return true;
    }

    /* renamed from: f */
    public final boolean m35735f(kia kiaVar) {
        f32278b.set(kiaVar, this);
        f32277a.set(kiaVar, this);
        while (m35740k() == this) {
            if (j9.m33417a(f32277a, this, this, kiaVar)) {
                kiaVar.m35739j(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m35736g(int i) {
        m35733d(new gea(i), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (p001o.j9.m33417a(p001o.kia.f32277a, r3, r2, ((p001o.pie) r4).f40158a) != false) goto L21;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kia m35737h() {
        while (true) {
            kia kiaVar = (kia) f32278b.get(this);
            kia kiaVar2 = kiaVar;
            while (true) {
                kia kiaVar3 = null;
                while (true) {
                    Object obj = f32277a.get(kiaVar2);
                    if (obj == this) {
                        if (kiaVar == kiaVar2) {
                            return kiaVar2;
                        }
                        if (j9.m33417a(f32278b, this, kiaVar, kiaVar2)) {
                            return kiaVar2;
                        }
                    } else {
                        if (mo33861q()) {
                            return null;
                        }
                        if (!(obj instanceof pie)) {
                            sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                            kiaVar3 = kiaVar2;
                            kiaVar2 = (kia) obj;
                        } else {
                            if (kiaVar3 != null) {
                                break;
                            }
                            kiaVar2 = (kia) f32278b.get(kiaVar2);
                        }
                    }
                }
                kiaVar2 = kiaVar3;
            }
        }
    }

    /* renamed from: i */
    public final kia m35738i(kia kiaVar) {
        while (kiaVar.mo33861q()) {
            kiaVar = (kia) f32278b.get(kiaVar);
        }
        return kiaVar;
    }

    /* renamed from: j */
    public final void m35739j(kia kiaVar) {
        kia kiaVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32278b;
        do {
            kiaVar2 = (kia) atomicReferenceFieldUpdater.get(kiaVar);
            if (m35740k() != kiaVar) {
                return;
            }
        } while (!j9.m33417a(f32278b, kiaVar, kiaVar2, this));
        if (mo33861q()) {
            kiaVar.m35737h();
        }
    }

    /* renamed from: k */
    public final Object m35740k() {
        return f32277a.get(this);
    }

    /* renamed from: l */
    public final kia m35741l() {
        kia kiaVar;
        Object objM35740k = m35740k();
        pie pieVar = objM35740k instanceof pie ? (pie) objM35740k : null;
        if (pieVar != null && (kiaVar = pieVar.f40158a) != null) {
            return kiaVar;
        }
        sq8.m48647f(objM35740k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (kia) objM35740k;
    }

    /* renamed from: m */
    public final kia m35742m() {
        kia kiaVarM35737h = m35737h();
        return kiaVarM35737h == null ? m35738i((kia) f32278b.get(this)) : kiaVarM35737h;
    }

    /* renamed from: q */
    public boolean mo33861q() {
        return m35740k() instanceof pie;
    }

    /* renamed from: r */
    public boolean m35743r() {
        return m35744s() == null;
    }

    /* renamed from: s */
    public final kia m35744s() {
        Object objM35740k;
        kia kiaVar;
        do {
            objM35740k = m35740k();
            if (objM35740k instanceof pie) {
                return ((pie) objM35740k).f40158a;
            }
            if (objM35740k == this) {
                return (kia) objM35740k;
            }
            sq8.m48647f(objM35740k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            kiaVar = (kia) objM35740k;
        } while (!j9.m33417a(f32277a, this, objM35740k, kiaVar.m35745t()));
        kiaVar.m35737h();
        return null;
    }

    /* renamed from: t */
    public final pie m35745t() {
        pie pieVar = (pie) f32279c.get(this);
        if (pieVar != null) {
            return pieVar;
        }
        pie pieVar2 = new pie(this);
        f32279c.set(this, pieVar2);
        return pieVar2;
    }

    public String toString() {
        return new urd(this) { // from class: o.kia.a
            @Override // p001o.bc9
            public Object get() {
                return o75.m41657a(this.receiver);
            }
        } + '@' + o75.m41658b(this);
    }
}
