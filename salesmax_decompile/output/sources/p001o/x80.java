package p001o;

import android.text.Editable;
import p001o.fjh;

/* loaded from: classes.dex */
public final class x80 implements fjh.InterfaceC13466b {

    /* renamed from: a */
    public final InterfaceC18072a f53317a;

    /* renamed from: b */
    public final int f53318b;

    /* renamed from: o.x80$a */
    public interface InterfaceC18072a {
        /* renamed from: f */
        void mo17969f(int i, Editable editable);
    }

    public x80(InterfaceC18072a interfaceC18072a, int i) {
        this.f53317a = interfaceC18072a;
        this.f53318b = i;
    }

    @Override // p001o.fjh.InterfaceC13466b
    public void afterTextChanged(Editable editable) {
        this.f53317a.mo17969f(this.f53318b, editable);
    }
}
