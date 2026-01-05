package p001o;

import java.util.ConcurrentModificationException;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public class u4d extends s4d {

    /* renamed from: d */
    public final t4d f48320d;

    /* renamed from: e */
    public Object f48321e;

    /* renamed from: f */
    public boolean f48322f;

    /* renamed from: g */
    public int f48323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4d(t4d t4dVar, nxh[] nxhVarArr) {
        super(t4dVar.m49286d(), nxhVarArr);
        sq8.m48649h(t4dVar, "builder");
        sq8.m48649h(nxhVarArr, ClientCookie.PATH_ATTR);
        this.f48320d = t4dVar;
        this.f48323g = t4dVar.m49285c();
    }

    /* renamed from: n */
    public final void m50932n() {
        if (this.f48320d.m49285c() != this.f48323g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p001o.s4d, java.util.Iterator
    public Object next() {
        m50932n();
        this.f48321e = m47823e();
        this.f48322f = true;
        return super.next();
    }

    /* renamed from: o */
    public final void m50933o() {
        if (!this.f48322f) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public final void m50934p(int i, mxh mxhVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            m47825g()[i2].m41213r(mxhVar.m39800p(), mxhVar.m39800p().length, 0);
            while (!sq8.m48644c(m47825g()[i2].m41204a(), obj)) {
                m47825g()[i2].m41210n();
            }
            m47827k(i2);
            return;
        }
        int iM45963f = 1 << qxh.m45963f(i, i3);
        if (mxhVar.m39801q(iM45963f)) {
            m47825g()[i2].m41213r(mxhVar.m39800p(), mxhVar.m39797m() * 2, mxhVar.m39798n(iM45963f));
            m47827k(i2);
        } else {
            int iM39777O = mxhVar.m39777O(iM45963f);
            mxh mxhVarM39776N = mxhVar.m39776N(iM39777O);
            m47825g()[i2].m41213r(mxhVar.m39800p(), mxhVar.m39797m() * 2, iM39777O);
            m50934p(i, mxhVarM39776N, obj, i2 + 1);
        }
    }

    /* renamed from: r */
    public final void m50935r(Object obj, Object obj2) {
        if (this.f48320d.containsKey(obj)) {
            if (hasNext()) {
                Object objM47823e = m47823e();
                this.f48320d.put(obj, obj2);
                m50934p(objM47823e != null ? objM47823e.hashCode() : 0, this.f48320d.m49286d(), objM47823e, 0);
            } else {
                this.f48320d.put(obj, obj2);
            }
            this.f48323g = this.f48320d.m49285c();
        }
    }

    @Override // p001o.s4d, java.util.Iterator
    public void remove() {
        m50933o();
        if (hasNext()) {
            Object objM47823e = m47823e();
            azh.m18051d(this.f48320d).remove(this.f48321e);
            m50934p(objM47823e != null ? objM47823e.hashCode() : 0, this.f48320d.m49286d(), objM47823e, 0);
        } else {
            azh.m18051d(this.f48320d).remove(this.f48321e);
        }
        this.f48321e = null;
        this.f48322f = false;
        this.f48323g = this.f48320d.m49285c();
    }
}
