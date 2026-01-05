package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.InterfaceC1797j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1788a implements InterfaceC1796i {

    /* renamed from: a */
    public Context f5538a;

    /* renamed from: b */
    public Context f5539b;

    /* renamed from: c */
    public C1792e f5540c;

    /* renamed from: d */
    public LayoutInflater f5541d;

    /* renamed from: e */
    public LayoutInflater f5542e;

    /* renamed from: f */
    public InterfaceC1796i.a f5543f;

    /* renamed from: g */
    public int f5544g;

    /* renamed from: h */
    public int f5545h;

    /* renamed from: q */
    public InterfaceC1797j f5546q;

    /* renamed from: s */
    public int f5547s;

    public AbstractC1788a(Context context, int i, int i2) {
        this.f5538a = context;
        this.f5541d = LayoutInflater.from(context);
        this.f5544g = i;
        this.f5545h = i2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: b */
    public void mo3963b(C1792e c1792e, boolean z) {
        InterfaceC1796i.a aVar = this.f5543f;
        if (aVar != null) {
            aVar.mo3835b(c1792e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: c */
    public boolean mo3964c(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: d */
    public void mo3965d(InterfaceC1796i.a aVar) {
        this.f5543f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: f */
    public boolean mo3966f(SubMenuC1799l subMenuC1799l) {
        InterfaceC1796i.a aVar = this.f5543f;
        SubMenuC1799l subMenuC1799l2 = subMenuC1799l;
        if (aVar == null) {
            return false;
        }
        if (subMenuC1799l == null) {
            subMenuC1799l2 = this.f5540c;
        }
        return aVar.mo3836c(subMenuC1799l2);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    public int getId() {
        return this.f5547s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: h */
    public void mo3967h(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f5546q;
        if (viewGroup == null) {
            return;
        }
        C1792e c1792e = this.f5540c;
        int i = 0;
        if (c1792e != null) {
            c1792e.m4058t();
            ArrayList arrayListM4020G = this.f5540c.m4020G();
            int size = arrayListM4020G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1794g c1794g = (C1794g) arrayListM4020G.get(i3);
                if (mo3978t(i2, c1794g)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C1794g itemData = childAt instanceof InterfaceC1797j.a ? ((InterfaceC1797j.a) childAt).getItemData() : null;
                    View viewMo3975q = mo3975q(c1794g, childAt, viewGroup);
                    if (c1794g != itemData) {
                        viewMo3975q.setPressed(false);
                        viewMo3975q.jumpDrawablesToCurrentState();
                    }
                    if (viewMo3975q != childAt) {
                        m3970l(viewMo3975q, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo3973o(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: j */
    public boolean mo3968j(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: k */
    public void mo3969k(Context context, C1792e c1792e) {
        this.f5539b = context;
        this.f5542e = LayoutInflater.from(context);
        this.f5540c = c1792e;
    }

    /* renamed from: l */
    public void m3970l(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f5546q).addView(view, i);
    }

    /* renamed from: m */
    public abstract void mo3971m(C1794g c1794g, InterfaceC1797j.a aVar);

    /* renamed from: n */
    public InterfaceC1797j.a m3972n(ViewGroup viewGroup) {
        return (InterfaceC1797j.a) this.f5541d.inflate(this.f5545h, viewGroup, false);
    }

    /* renamed from: o */
    public boolean mo3973o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: p */
    public InterfaceC1796i.a m3974p() {
        return this.f5543f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public View mo3975q(C1794g c1794g, View view, ViewGroup viewGroup) {
        InterfaceC1797j.a aVarM3972n = view instanceof InterfaceC1797j.a ? (InterfaceC1797j.a) view : m3972n(viewGroup);
        mo3971m(c1794g, aVarM3972n);
        return (View) aVarM3972n;
    }

    /* renamed from: r */
    public InterfaceC1797j mo3976r(ViewGroup viewGroup) {
        if (this.f5546q == null) {
            InterfaceC1797j interfaceC1797j = (InterfaceC1797j) this.f5541d.inflate(this.f5544g, viewGroup, false);
            this.f5546q = interfaceC1797j;
            interfaceC1797j.mo3956a(this.f5540c);
            mo3967h(true);
        }
        return this.f5546q;
    }

    /* renamed from: s */
    public void m3977s(int i) {
        this.f5547s = i;
    }

    /* renamed from: t */
    public abstract boolean mo3978t(int i, C1794g c1794g);
}
