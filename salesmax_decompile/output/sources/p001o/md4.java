package p001o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes6.dex */
public class md4 extends BaseAdapter {

    /* renamed from: a */
    public Context f35195a;

    /* renamed from: b */
    public List f35196b;

    /* renamed from: c */
    public LayoutInflater f35197c;

    /* renamed from: o.md4$a */
    public static class C15282a {

        /* renamed from: a */
        public TextView f35198a;

        /* renamed from: b */
        public ImageView f35199b;

        /* renamed from: a */
        public static C15282a m38751a(View view) {
            if (view == null) {
                return null;
            }
            if (view.getTag() != null) {
                return (C15282a) view.getTag();
            }
            C15282a c15282a = new C15282a();
            c15282a.f35198a = (TextView) view.findViewById(p8e.row_title);
            c15282a.f35199b = (ImageView) view.findViewById(p8e.row_icon);
            view.setTag(c15282a);
            return c15282a;
        }
    }

    public md4(Context context, List list) {
        this.f35195a = context;
        this.f35196b = list;
        this.f35197c = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f35196b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        jp6 jp6Var = (jp6) this.f35196b.get(i);
        if (view == null) {
            view = this.f35197c.inflate(e9e.row, (ViewGroup) null);
        }
        C15282a c15282aM38751a = C15282a.m38751a(view);
        c15282aM38751a.f35198a.setText(jp6Var.m34208e());
        jp6Var.m34210g(this.f35195a);
        if (jp6Var.m34207d() != -1) {
            c15282aM38751a.f35199b.setImageResource(jp6Var.m34207d());
        }
        return view;
    }
}
