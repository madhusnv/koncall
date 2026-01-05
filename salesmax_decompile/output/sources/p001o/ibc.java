package p001o;

import android.widget.CompoundButton;

/* loaded from: classes.dex */
public final class ibc implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final InterfaceC14238a f28395a;

    /* renamed from: b */
    public final int f28396b;

    /* renamed from: o.ibc$a */
    public interface InterfaceC14238a {
        /* renamed from: d */
        void mo31835d(int i, CompoundButton compoundButton, boolean z);
    }

    public ibc(InterfaceC14238a interfaceC14238a, int i) {
        this.f28395a = interfaceC14238a;
        this.f28396b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f28395a.mo31835d(this.f28396b, compoundButton, z);
    }
}
