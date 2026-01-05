package p001o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class ygh {

    /* renamed from: c */
    public float f55496c;

    /* renamed from: d */
    public float f55497d;

    /* renamed from: g */
    public mgh f55500g;

    /* renamed from: a */
    public final TextPaint f55494a = new TextPaint(1);

    /* renamed from: b */
    public final ogh f55495b = new C18402a();

    /* renamed from: e */
    public boolean f55498e = true;

    /* renamed from: f */
    public WeakReference f55499f = new WeakReference(null);

    /* renamed from: o.ygh$a */
    public class C18402a extends ogh {
        public C18402a() {
        }

        @Override // p001o.ogh
        /* renamed from: a */
        public void mo14396a(int i) {
            ygh.this.f55498e = true;
            InterfaceC18403b interfaceC18403b = (InterfaceC18403b) ygh.this.f55499f.get();
            if (interfaceC18403b != null) {
                interfaceC18403b.mo14045a();
            }
        }

        @Override // p001o.ogh
        /* renamed from: b */
        public void mo14397b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            ygh.this.f55498e = true;
            InterfaceC18403b interfaceC18403b = (InterfaceC18403b) ygh.this.f55499f.get();
            if (interfaceC18403b != null) {
                interfaceC18403b.mo14045a();
            }
        }
    }

    /* renamed from: o.ygh$b */
    public interface InterfaceC18403b {
        /* renamed from: a */
        void mo14045a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public ygh(InterfaceC18403b interfaceC18403b) {
        m57792j(interfaceC18403b);
    }

    /* renamed from: c */
    public final float m57785c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f55494a.getFontMetrics().ascent);
    }

    /* renamed from: d */
    public final float m57786d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f55494a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: e */
    public mgh m57787e() {
        return this.f55500g;
    }

    /* renamed from: f */
    public float m57788f(String str) {
        if (!this.f55498e) {
            return this.f55497d;
        }
        m57791i(str);
        return this.f55497d;
    }

    /* renamed from: g */
    public TextPaint m57789g() {
        return this.f55494a;
    }

    /* renamed from: h */
    public float m57790h(String str) {
        if (!this.f55498e) {
            return this.f55496c;
        }
        m57791i(str);
        return this.f55496c;
    }

    /* renamed from: i */
    public final void m57791i(String str) {
        this.f55496c = m57786d(str);
        this.f55497d = m57785c(str);
        this.f55498e = false;
    }

    /* renamed from: j */
    public void m57792j(InterfaceC18403b interfaceC18403b) {
        this.f55499f = new WeakReference(interfaceC18403b);
    }

    /* renamed from: k */
    public void m57793k(mgh mghVar, Context context) {
        if (this.f55500g != mghVar) {
            this.f55500g = mghVar;
            if (mghVar != null) {
                mghVar.m39034q(context, this.f55494a, this.f55495b);
                InterfaceC18403b interfaceC18403b = (InterfaceC18403b) this.f55499f.get();
                if (interfaceC18403b != null) {
                    this.f55494a.drawableState = interfaceC18403b.getState();
                }
                mghVar.m39033p(context, this.f55494a, this.f55495b);
                this.f55498e = true;
            }
            InterfaceC18403b interfaceC18403b2 = (InterfaceC18403b) this.f55499f.get();
            if (interfaceC18403b2 != null) {
                interfaceC18403b2.mo14045a();
                interfaceC18403b2.onStateChange(interfaceC18403b2.getState());
            }
        }
    }

    /* renamed from: l */
    public void m57794l(boolean z) {
        this.f55498e = z;
    }

    /* renamed from: m */
    public void m57795m(boolean z) {
        this.f55498e = z;
    }

    /* renamed from: n */
    public void m57796n(Context context) {
        this.f55500g.m39033p(context, this.f55494a, this.f55495b);
    }
}
