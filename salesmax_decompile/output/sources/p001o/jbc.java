package p001o;

import android.view.View;

/* loaded from: classes.dex */
public final class jbc implements View.OnClickListener {

    /* renamed from: a */
    public final InterfaceC14485a f30093a;

    /* renamed from: b */
    public final int f30094b;

    /* renamed from: o.jbc$a */
    public interface InterfaceC14485a {
        /* renamed from: c */
        void mo16294c(int i, View view);
    }

    public jbc(InterfaceC14485a interfaceC14485a, int i) {
        this.f30093a = interfaceC14485a;
        this.f30094b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f30093a.mo16294c(this.f30094b, view);
    }
}
