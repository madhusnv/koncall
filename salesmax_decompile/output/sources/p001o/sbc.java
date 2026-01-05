package p001o;

import android.view.View;

/* loaded from: classes.dex */
public final class sbc implements View.OnLongClickListener {

    /* renamed from: a */
    public final InterfaceC16795a f45134a;

    /* renamed from: b */
    public final int f45135b;

    /* renamed from: o.sbc$a */
    public interface InterfaceC16795a {
        /* renamed from: a */
        boolean mo16293a(int i, View view);
    }

    public sbc(InterfaceC16795a interfaceC16795a, int i) {
        this.f45134a = interfaceC16795a;
        this.f45135b = i;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return this.f45134a.mo16293a(this.f45135b, view);
    }
}
