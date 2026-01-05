package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p001o.fv7;

/* loaded from: classes.dex */
public final class fv7 extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public InterfaceC13576a f24148a;

    /* renamed from: b */
    public final ArrayList f24149b;

    /* renamed from: c */
    public final ArrayList f24150c;

    /* renamed from: o.fv7$a */
    public interface InterfaceC13576a {
        /* renamed from: b */
        void mo947b();

        /* renamed from: c */
        void mo948c(String str);
    }

    /* renamed from: o.fv7$b */
    public static final class C13577b {

        /* renamed from: a */
        public final String f24151a;

        /* renamed from: b */
        public final int f24152b;

        public C13577b(String str, int i) {
            sq8.m48649h(str, "name");
            this.f24151a = str;
            this.f24152b = i;
        }

        /* renamed from: a */
        public final int m27555a() {
            return this.f24152b;
        }

        /* renamed from: b */
        public final String m27556b() {
            return this.f24151a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13577b)) {
                return false;
            }
            C13577b c13577b = (C13577b) obj;
            return sq8.m48644c(this.f24151a, c13577b.f24151a) && this.f24152b == c13577b.f24152b;
        }

        public int hashCode() {
            return (this.f24151a.hashCode() * 31) + Integer.hashCode(this.f24152b);
        }

        public String toString() {
            return "Menu(name=" + this.f24151a + ", drawable=" + this.f24152b + ")";
        }
    }

    /* renamed from: o.fv7$c */
    public static final class C13578c extends RecyclerView.d0 {

        /* renamed from: w */
        public static final a f24153w = new a(null);

        /* renamed from: x */
        public static final int f24154x = 8;

        /* renamed from: y */
        public static final int f24155y = p9e.item_menu;

        /* renamed from: u */
        public final TextView f24156u;

        /* renamed from: v */
        public final ImageView f24157v;

        /* renamed from: o.fv7$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C13578c m27561a(ViewGroup viewGroup, int i) {
                sq8.m48649h(viewGroup, "parent");
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(m27562b(), viewGroup, false);
                sq8.m48648g(viewInflate, "inflate(...)");
                return new C13578c(viewInflate);
            }

            /* renamed from: b */
            public final int m27562b() {
                return C13578c.f24155y;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13578c(View view) {
            super(view);
            sq8.m48649h(view, "itemView");
            View viewFindViewById = view.findViewById(z8e.tvTitle);
            sq8.m48648g(viewFindViewById, "findViewById(...)");
            this.f24156u = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(z8e.ivIcon);
            sq8.m48648g(viewFindViewById2, "findViewById(...)");
            this.f24157v = (ImageView) viewFindViewById2;
        }

        /* renamed from: R */
        public static final void m27559R(InterfaceC13576a interfaceC13576a, C13577b c13577b, View view) {
            sq8.m48649h(c13577b, "$menu");
            if (interfaceC13576a != null) {
                interfaceC13576a.mo948c(c13577b.m27556b());
            }
            if (interfaceC13576a != null) {
                interfaceC13576a.mo947b();
            }
        }

        /* renamed from: Q */
        public final void m27560Q(final C13577b c13577b, final InterfaceC13576a interfaceC13576a) {
            sq8.m48649h(c13577b, "menu");
            View view = this.f9794a;
            this.f24156u.setText(c13577b.m27556b());
            this.f24157v.setImageDrawable(c64.getDrawable(view.getContext(), c13577b.m27555a()));
            this.f9794a.setOnClickListener(new View.OnClickListener() { // from class: o.gv7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    fv7.C13578c.m27559R(interfaceC13576a, c13577b, view2);
                }
            });
        }
    }

    public fv7() {
        ArrayList arrayListM21242g = ch3.m21242g(new C13577b("Voice Message", w7e.ic_microphone), new C13577b("Photo & Videos", w7e.ic_image), new C13577b("Document", w7e.ic_pdf), new C13577b("Send Location", w7e.ic_location), new C13577b("Request Location", w7e.ic_map_pin_add), new C13577b("Ask for Address", w7e.ic_address), new C13577b("Templates", w7e.ic_message_text));
        this.f24149b = arrayListM21242g;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayListM21242g);
        this.f24150c = arrayList;
    }

    /* renamed from: d */
    public final void m27551d() {
        this.f24148a = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C13578c c13578c, int i) {
        sq8.m48649h(c13578c, "holder");
        Object obj = this.f24150c.get(i);
        sq8.m48648g(obj, "get(...)");
        c13578c.m27560Q((C13577b) obj, this.f24148a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C13578c onCreateViewHolder(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "parent");
        return C13578c.f24153w.m27561a(viewGroup, i);
    }

    /* renamed from: g */
    public final void m27554g(InterfaceC13576a interfaceC13576a) {
        this.f24148a = interfaceC13576a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f24150c.size();
    }
}
