package p001o;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class pic {

    /* renamed from: a */
    public final DataSetObservable f40148a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f40149b;

    /* renamed from: a */
    public abstract void mo27813a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: b */
    public void m43734b(View view) {
    }

    /* renamed from: c */
    public void m43735c(ViewGroup viewGroup) {
        m43734b(viewGroup);
    }

    /* renamed from: d */
    public abstract int mo27814d();

    /* renamed from: e */
    public int m43736e(Object obj) {
        return -1;
    }

    /* renamed from: f */
    public CharSequence mo27815f(int i) {
        return null;
    }

    /* renamed from: g */
    public float m43737g(int i) {
        return 1.0f;
    }

    /* renamed from: h */
    public abstract Object mo27816h(ViewGroup viewGroup, int i);

    /* renamed from: i */
    public abstract boolean mo27817i(View view, Object obj);

    /* renamed from: j */
    public void m43738j(DataSetObserver dataSetObserver) {
        this.f40148a.registerObserver(dataSetObserver);
    }

    /* renamed from: k */
    public void m43739k(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: l */
    public Parcelable m43740l() {
        return null;
    }

    /* renamed from: m */
    public void m43741m(View view, int i, Object obj) {
    }

    /* renamed from: n */
    public void m43742n(ViewGroup viewGroup, int i, Object obj) {
        m43741m(viewGroup, i, obj);
    }

    /* renamed from: o */
    public void m43743o(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f40149b = dataSetObserver;
        }
    }

    /* renamed from: p */
    public void m43744p(View view) {
    }

    /* renamed from: q */
    public void m43745q(ViewGroup viewGroup) {
        m43744p(viewGroup);
    }

    /* renamed from: r */
    public void m43746r(DataSetObserver dataSetObserver) {
        this.f40148a.unregisterObserver(dataSetObserver);
    }
}
