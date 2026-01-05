package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public abstract class s4d implements Iterator, sb9 {

    /* renamed from: a */
    public final nxh[] f44803a;

    /* renamed from: b */
    public int f44804b;

    /* renamed from: c */
    public boolean f44805c;

    public s4d(mxh mxhVar, nxh[] nxhVarArr) {
        sq8.m48649h(mxhVar, "node");
        sq8.m48649h(nxhVarArr, ClientCookie.PATH_ATTR);
        this.f44803a = nxhVarArr;
        this.f44805c = true;
        nxhVarArr[0].m41212p(mxhVar.m39800p(), mxhVar.m39797m() * 2);
        this.f44804b = 0;
        m47824f();
    }

    /* renamed from: a */
    public final void m47822a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: e */
    public final Object m47823e() {
        m47822a();
        return this.f44803a[this.f44804b].m41204a();
    }

    /* renamed from: f */
    public final void m47824f() {
        if (this.f44803a[this.f44804b].m41208j()) {
            return;
        }
        for (int i = this.f44804b; -1 < i; i--) {
            int iM47826j = m47826j(i);
            if (iM47826j == -1 && this.f44803a[i].m41209k()) {
                this.f44803a[i].m41211o();
                iM47826j = m47826j(i);
            }
            if (iM47826j != -1) {
                this.f44804b = iM47826j;
                return;
            }
            if (i > 0) {
                this.f44803a[i - 1].m41211o();
            }
            this.f44803a[i].m41212p(mxh.f36081e.m39811a().m39800p(), 0);
        }
        this.f44805c = false;
    }

    /* renamed from: g */
    public final nxh[] m47825g() {
        return this.f44803a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44805c;
    }

    /* renamed from: j */
    public final int m47826j(int i) {
        if (this.f44803a[i].m41208j()) {
            return i;
        }
        if (!this.f44803a[i].m41209k()) {
            return -1;
        }
        mxh mxhVarM41205e = this.f44803a[i].m41205e();
        if (i == 6) {
            this.f44803a[i + 1].m41212p(mxhVarM41205e.m39800p(), mxhVarM41205e.m39800p().length);
        } else {
            this.f44803a[i + 1].m41212p(mxhVarM41205e.m39800p(), mxhVarM41205e.m39797m() * 2);
        }
        return m47826j(i + 1);
    }

    /* renamed from: k */
    public final void m47827k(int i) {
        this.f44804b = i;
    }

    @Override // java.util.Iterator
    public Object next() {
        m47822a();
        Object next = this.f44803a[this.f44804b].next();
        m47824f();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
