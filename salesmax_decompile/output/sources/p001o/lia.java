package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public class lia {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33897a = AtomicReferenceFieldUpdater.newUpdater(lia.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public lia(boolean z) {
        this._cur$volatile = new mia(8, z);
    }

    /* renamed from: a */
    public final boolean m37312a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33897a;
        while (true) {
            mia miaVar = (mia) atomicReferenceFieldUpdater.get(this);
            int iM39119a = miaVar.m39119a(obj);
            if (iM39119a == 0) {
                return true;
            }
            if (iM39119a == 1) {
                j9.m33417a(f33897a, this, miaVar, miaVar.m39127l());
            } else if (iM39119a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m37313b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33897a;
        while (true) {
            mia miaVar = (mia) atomicReferenceFieldUpdater.get(this);
            if (miaVar.m39122d()) {
                return;
            } else {
                j9.m33417a(f33897a, this, miaVar, miaVar.m39127l());
            }
        }
    }

    /* renamed from: c */
    public final int m37314c() {
        return ((mia) f33897a.get(this)).m39124g();
    }

    /* renamed from: e */
    public final Object m37315e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33897a;
        while (true) {
            mia miaVar = (mia) atomicReferenceFieldUpdater.get(this);
            Object objM39128m = miaVar.m39128m();
            if (objM39128m != mia.f35514h) {
                return objM39128m;
            }
            j9.m33417a(f33897a, this, miaVar, miaVar.m39127l());
        }
    }
}
