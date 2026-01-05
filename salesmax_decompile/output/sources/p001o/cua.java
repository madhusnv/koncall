package p001o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.dhaval2404.colorpicker.model.ColorShape;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.cua;

/* loaded from: classes5.dex */
public final class cua extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public final List f18650a;

    /* renamed from: b */
    public boolean f18651b;

    /* renamed from: c */
    public String f18652c;

    /* renamed from: d */
    public ColorShape f18653d;

    /* renamed from: e */
    public boolean f18654e;

    /* renamed from: o.cua$a */
    public final class C12750a extends RecyclerView.d0 {

        /* renamed from: u */
        public final View f18655u;

        /* renamed from: v */
        public final CardView f18656v;

        /* renamed from: w */
        public final AppCompatImageView f18657w;

        /* renamed from: x */
        public final /* synthetic */ cua f18658x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12750a(final cua cuaVar, View view) {
            super(view);
            sq8.m48649h(cuaVar, "this$0");
            sq8.m48649h(view, "rootView");
            this.f18658x = cuaVar;
            this.f18655u = view;
            this.f18656v = (CardView) view.findViewById(m8e.colorView);
            this.f18657w = (AppCompatImageView) view.findViewById(m8e.checkIcon);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.bua
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cua.C12750a.m21833P(cuaVar, view2);
                }
            });
        }

        /* renamed from: P */
        public static final void m21833P(cua cuaVar, View view) {
            sq8.m48649h(cuaVar, "this$0");
            Object tag = view.getTag();
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int iIntValue = ((Integer) tag).intValue();
            String strM21825j = cuaVar.m21825j(iIntValue);
            int iIndexOf = cuaVar.f18650a.indexOf(cuaVar.f18652c);
            cuaVar.f18652c = strM21825j;
            cuaVar.notifyItemChanged(iIndexOf);
            cuaVar.notifyItemChanged(iIntValue);
        }

        /* renamed from: Q */
        public final void m21834Q(int i) {
            String strM21825j = this.f18658x.m21825j(i);
            this.f18655u.setTag(Integer.valueOf(i));
            oi3 oi3Var = oi3.f38397a;
            CardView cardView = this.f18656v;
            sq8.m48648g(cardView, "colorView");
            oi3Var.m42260b(cardView, strM21825j);
            CardView cardView2 = this.f18656v;
            sq8.m48648g(cardView2, "colorView");
            oi3Var.m42261c(cardView2, this.f18658x.f18653d);
            boolean zM48644c = sq8.m48644c(strM21825j, this.f18658x.f18652c);
            AppCompatImageView appCompatImageView = this.f18657w;
            sq8.m48648g(appCompatImageView, "checkIcon");
            gwi.m29622a(appCompatImageView, zM48644c);
            boolean zM37262e = this.f18658x.f18651b;
            if (this.f18658x.f18654e) {
                zM37262e = li3.m37262e(strM21825j);
            }
            this.f18657w.setColorFilter(zM37262e ? -1 : -16777216);
        }
    }

    public cua(List list) {
        int i;
        sq8.m48649h(list, "colors");
        this.f18650a = list;
        this.f18652c = "";
        this.f18653d = ColorShape.CIRCLE;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (li3.m37262e((String) it.next()) && (i = i + 1) < 0) {
                    ch3.m21255t();
                }
            }
        }
        this.f18651b = i * 2 >= this.f18650a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f18650a.size();
    }

    /* renamed from: j */
    public final String m21825j(int i) {
        return (String) this.f18650a.get(i);
    }

    /* renamed from: k */
    public final String m21826k() {
        return this.f18652c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C12750a c12750a, int i) {
        sq8.m48649h(c12750a, "holder");
        c12750a.m21834Q(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C12750a onCreateViewHolder(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "parent");
        return new C12750a(this, oi3.f38397a.m42259a(viewGroup));
    }

    /* renamed from: n */
    public final void m21829n(ColorShape colorShape) {
        sq8.m48649h(colorShape, "colorShape");
        this.f18653d = colorShape;
    }

    /* renamed from: o */
    public final void m21830o(String str) {
        sq8.m48649h(str, "color");
        this.f18652c = str;
    }

    /* renamed from: p */
    public final void m21831p(boolean z) {
        this.f18654e = z;
    }
}
