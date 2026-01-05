package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class hea implements su5, tu5 {

    /* renamed from: a */
    public List f26742a;

    /* renamed from: b */
    public volatile boolean f26743b;

    @Override // p001o.tu5
    /* renamed from: a */
    public boolean mo30304a(su5 su5Var) {
        Objects.requireNonNull(su5Var, "d is null");
        if (!this.f26743b) {
            synchronized (this) {
                if (!this.f26743b) {
                    List linkedList = this.f26742a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f26742a = linkedList;
                    }
                    linkedList.add(su5Var);
                    return true;
                }
            }
        }
        su5Var.dispose();
        return false;
    }

    @Override // p001o.tu5
    /* renamed from: b */
    public boolean mo30305b(su5 su5Var) {
        Objects.requireNonNull(su5Var, "Disposable item is null");
        if (this.f26743b) {
            return false;
        }
        synchronized (this) {
            if (this.f26743b) {
                return false;
            }
            List list = this.f26742a;
            if (list != null && list.remove(su5Var)) {
                return true;
            }
            return false;
        }
    }

    @Override // p001o.tu5
    /* renamed from: d */
    public boolean mo30306d(su5 su5Var) {
        if (!mo30305b(su5Var)) {
            return false;
        }
        su5Var.dispose();
        return true;
    }

    @Override // p001o.su5
    public void dispose() {
        if (this.f26743b) {
            return;
        }
        synchronized (this) {
            if (this.f26743b) {
                return;
            }
            this.f26743b = true;
            List list = this.f26742a;
            this.f26742a = null;
            m30307e(list);
        }
    }

    /* renamed from: e */
    public void m30307e(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((su5) it.next()).dispose();
            } catch (Throwable th) {
                zk6.m59526b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new mo3(arrayList);
            }
            throw xk6.m56420h((Throwable) arrayList.get(0));
        }
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this.f26743b;
    }
}
