package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p001o.hv7;

/* loaded from: classes.dex */
public final class hv7 extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public InterfaceC14105a f27675a;

    /* renamed from: b */
    public final ArrayList f27676b;

    /* renamed from: c */
    public final ArrayList f27677c;

    /* renamed from: o.hv7$a */
    public interface InterfaceC14105a {
        /* renamed from: b */
        void mo1677b();

        /* renamed from: c */
        void mo1678c(String str);
    }

    /* renamed from: o.hv7$b */
    public static final class C14106b {

        /* renamed from: a */
        public final String f27678a;

        /* renamed from: b */
        public final int f27679b;

        public C14106b(String str, int i) {
            sq8.m48649h(str, "name");
            this.f27678a = str;
            this.f27679b = i;
        }

        /* renamed from: a */
        public final int m31211a() {
            return this.f27679b;
        }

        /* renamed from: b */
        public final String m31212b() {
            return this.f27678a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14106b)) {
                return false;
            }
            C14106b c14106b = (C14106b) obj;
            return sq8.m48644c(this.f27678a, c14106b.f27678a) && this.f27679b == c14106b.f27679b;
        }

        public int hashCode() {
            return (this.f27678a.hashCode() * 31) + Integer.hashCode(this.f27679b);
        }

        public String toString() {
            return "Menu(name=" + this.f27678a + ", drawable=" + this.f27679b + ")";
        }
    }

    /* renamed from: o.hv7$c */
    public static final class C14107c extends RecyclerView.d0 {

        /* renamed from: w */
        public static final a f27680w = new a(null);

        /* renamed from: x */
        public static final int f27681x = 8;

        /* renamed from: y */
        public static final int f27682y = p9e.item_menu;

        /* renamed from: u */
        public final TextView f27683u;

        /* renamed from: v */
        public final ImageView f27684v;

        /* renamed from: o.hv7$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C14107c m31217a(ViewGroup viewGroup, int i) {
                sq8.m48649h(viewGroup, "parent");
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(m31218b(), viewGroup, false);
                sq8.m48648g(viewInflate, "inflate(...)");
                return new C14107c(viewInflate);
            }

            /* renamed from: b */
            public final int m31218b() {
                return C14107c.f27682y;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14107c(View view) {
            super(view);
            sq8.m48649h(view, "itemView");
            View viewFindViewById = view.findViewById(z8e.tvTitle);
            sq8.m48648g(viewFindViewById, "findViewById(...)");
            this.f27683u = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(z8e.ivIcon);
            sq8.m48648g(viewFindViewById2, "findViewById(...)");
            this.f27684v = (ImageView) viewFindViewById2;
        }

        /* renamed from: R */
        public static final void m31215R(InterfaceC14105a interfaceC14105a, C14106b c14106b, View view) {
            sq8.m48649h(c14106b, "$menu");
            if (interfaceC14105a != null) {
                interfaceC14105a.mo1678c(c14106b.m31212b());
            }
            if (interfaceC14105a != null) {
                interfaceC14105a.mo1677b();
            }
        }

        /* renamed from: Q */
        public final void m31216Q(final C14106b c14106b, final InterfaceC14105a interfaceC14105a) {
            sq8.m48649h(c14106b, "menu");
            View view = this.f9794a;
            this.f27683u.setText(c14106b.m31212b());
            this.f27684v.setImageDrawable(c64.getDrawable(view.getContext(), c14106b.m31211a()));
            this.f9794a.setOnClickListener(new View.OnClickListener() { // from class: o.iv7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    hv7.C14107c.m31215R(interfaceC14105a, c14106b, view2);
                }
            });
        }
    }

    public hv7() {
        ArrayList arrayListM21242g = ch3.m21242g(new C14106b("Voice Message", w7e.ic_microphone), new C14106b("Photo & Videos", w7e.ic_image), new C14106b("Document", w7e.ic_pdf));
        this.f27676b = arrayListM21242g;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayListM21242g);
        this.f27677c = arrayList;
    }

    /* renamed from: d */
    public final void m31207d() {
        this.f27675a = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C14107c c14107c, int i) {
        sq8.m48649h(c14107c, "holder");
        Object obj = this.f27677c.get(i);
        sq8.m48648g(obj, "get(...)");
        c14107c.m31216Q((C14106b) obj, this.f27675a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C14107c onCreateViewHolder(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "parent");
        return C14107c.f27680w.m31217a(viewGroup, i);
    }

    /* renamed from: g */
    public final void m31210g(InterfaceC14105a interfaceC14105a) {
        this.f27675a = interfaceC14105a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f27677c.size();
    }
}
