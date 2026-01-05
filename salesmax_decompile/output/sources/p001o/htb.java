package p001o;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class htb {

    /* renamed from: a */
    public int f27536a;

    /* renamed from: b */
    public int f27537b;

    public htb(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m31120a() {
        return this.f27536a | this.f27537b;
    }

    /* renamed from: b */
    public void m31121b(View view, View view2, int i) {
        m31122c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m31122c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f27537b = i;
        } else {
            this.f27536a = i;
        }
    }

    /* renamed from: d */
    public void m31123d(View view) {
        m31124e(view, 0);
    }

    /* renamed from: e */
    public void m31124e(View view, int i) {
        if (i == 1) {
            this.f27537b = 0;
        } else {
            this.f27536a = 0;
        }
    }
}
