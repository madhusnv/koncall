package p001o;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class fz7 extends pic {

    /* renamed from: c */
    public final View f24272c;

    /* renamed from: d */
    public final Integer[] f24273d;

    public fz7(View view, Integer[] numArr) {
        sq8.m48649h(view, "view");
        sq8.m48649h(numArr, "tabs");
        this.f24272c = view;
        this.f24273d = numArr;
    }

    @Override // p001o.pic
    /* renamed from: a */
    public void mo27813a(ViewGroup viewGroup, int i, Object obj) {
        sq8.m48649h(viewGroup, "container");
        sq8.m48649h(obj, "obj");
    }

    @Override // p001o.pic
    /* renamed from: d */
    public int mo27814d() {
        return 3;
    }

    @Override // p001o.pic
    /* renamed from: f */
    public CharSequence mo27815f(int i) {
        return this.f24272c.getContext().getString(this.f24273d[i].intValue());
    }

    @Override // p001o.pic
    /* renamed from: h */
    public Object mo27816h(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "collection");
        View viewFindViewById = this.f24272c.findViewById(i != 0 ? i != 1 ? i != 2 ? 0 : z8e.page_three : z8e.page_two : z8e.page_one);
        sq8.m48648g(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    @Override // p001o.pic
    /* renamed from: i */
    public boolean mo27817i(View view, Object obj) {
        sq8.m48649h(view, "arg0");
        sq8.m48649h(obj, "arg1");
        return view == obj;
    }
}
