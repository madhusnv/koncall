package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.app.AbstractC2307c;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class f7b extends dk0 {

    /* renamed from: H */
    public final Handler f22858H;

    /* renamed from: a */
    public final C2319g f22859a;

    /* renamed from: b */
    public final C13356c f22860b;

    /* renamed from: c */
    public Context f22861c;

    /* renamed from: d */
    public C2318f f22862d;

    /* renamed from: e */
    public List f22863e;

    /* renamed from: f */
    public ImageButton f22864f;

    /* renamed from: g */
    public C13357d f22865g;

    /* renamed from: h */
    public RecyclerView f22866h;

    /* renamed from: q */
    public boolean f22867q;

    /* renamed from: s */
    public C2319g.h f22868s;

    /* renamed from: x */
    public long f22869x;

    /* renamed from: y */
    public long f22870y;

    /* renamed from: o.f7b$a */
    public class HandlerC13354a extends Handler {
        public HandlerC13354a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            f7b.this.updateRoutes((List) message.obj);
        }
    }

    /* renamed from: o.f7b$b */
    public class ViewOnClickListenerC13355b implements View.OnClickListener {
        public ViewOnClickListenerC13355b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f7b.this.dismiss();
        }
    }

    /* renamed from: o.f7b$c */
    public final class C13356c extends C2319g.a {
        public C13356c() {
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
            f7b.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
            f7b.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
            f7b.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteSelected(C2319g c2319g, C2319g.h hVar) {
            f7b.this.dismiss();
        }
    }

    /* renamed from: o.f7b$d */
    public final class C13357d extends RecyclerView.AbstractC2371h {

        /* renamed from: a */
        public final ArrayList f22874a = new ArrayList();

        /* renamed from: b */
        public final LayoutInflater f22875b;

        /* renamed from: c */
        public final Drawable f22876c;

        /* renamed from: d */
        public final Drawable f22877d;

        /* renamed from: e */
        public final Drawable f22878e;

        /* renamed from: f */
        public final Drawable f22879f;

        /* renamed from: o.f7b$d$a */
        public class a extends RecyclerView.d0 {

            /* renamed from: u */
            public TextView f22881u;

            public a(View view) {
                super(view);
                this.f22881u = (TextView) view.findViewById(b8e.mr_picker_header_name);
            }

            /* renamed from: O */
            public void m26234O(b bVar) {
                this.f22881u.setText(bVar.m26235a().toString());
            }
        }

        /* renamed from: o.f7b$d$b */
        public class b {

            /* renamed from: a */
            public final Object f22883a;

            /* renamed from: b */
            public final int f22884b;

            public b(Object obj) {
                this.f22883a = obj;
                if (obj instanceof String) {
                    this.f22884b = 1;
                } else if (obj instanceof C2319g.h) {
                    this.f22884b = 2;
                } else {
                    this.f22884b = 0;
                }
            }

            /* renamed from: a */
            public Object m26235a() {
                return this.f22883a;
            }

            /* renamed from: b */
            public int m26236b() {
                return this.f22884b;
            }
        }

        /* renamed from: o.f7b$d$c */
        public class c extends RecyclerView.d0 {

            /* renamed from: u */
            public final View f22886u;

            /* renamed from: v */
            public final ImageView f22887v;

            /* renamed from: w */
            public final ProgressBar f22888w;

            /* renamed from: x */
            public final TextView f22889x;

            /* renamed from: o.f7b$d$c$a */
            public class a implements View.OnClickListener {

                /* renamed from: a */
                public final /* synthetic */ C2319g.h f22891a;

                public a(C2319g.h hVar) {
                    this.f22891a = hVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    f7b f7bVar = f7b.this;
                    C2319g.h hVar = this.f22891a;
                    f7bVar.f22868s = hVar;
                    hVar.m8343I();
                    c.this.f22887v.setVisibility(4);
                    c.this.f22888w.setVisibility(0);
                }
            }

            public c(View view) {
                super(view);
                this.f22886u = view;
                this.f22887v = (ImageView) view.findViewById(b8e.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(b8e.mr_picker_route_progress_bar);
                this.f22888w = progressBar;
                this.f22889x = (TextView) view.findViewById(b8e.mr_picker_route_name);
                AbstractC2307c.m8015t(f7b.this.f22861c, progressBar);
            }

            /* renamed from: O */
            public void m26237O(b bVar) {
                C2319g.h hVar = (C2319g.h) bVar.m26235a();
                this.f22886u.setVisibility(0);
                this.f22888w.setVisibility(4);
                this.f22886u.setOnClickListener(new a(hVar));
                this.f22889x.setText(hVar.m8359m());
                this.f22887v.setImageDrawable(C13357d.this.m26231e(hVar));
            }
        }

        public C13357d() {
            this.f22875b = LayoutInflater.from(f7b.this.f22861c);
            this.f22876c = AbstractC2307c.m8002g(f7b.this.f22861c);
            this.f22877d = AbstractC2307c.m8012q(f7b.this.f22861c);
            this.f22878e = AbstractC2307c.m8008m(f7b.this.f22861c);
            this.f22879f = AbstractC2307c.m8009n(f7b.this.f22861c);
            m26233g();
        }

        /* renamed from: d */
        public final Drawable m26230d(C2319g.h hVar) {
            int iM8352f = hVar.m8352f();
            return iM8352f != 1 ? iM8352f != 2 ? hVar.m8371y() ? this.f22879f : this.f22876c : this.f22878e : this.f22877d;
        }

        /* renamed from: e */
        public Drawable m26231e(C2319g.h hVar) {
            Uri uriM8356j = hVar.m8356j();
            if (uriM8356j != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(f7b.this.f22861c.getContentResolver().openInputStream(uriM8356j), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load ");
                    sb.append(uriM8356j);
                }
            }
            return m26230d(hVar);
        }

        /* renamed from: f */
        public b m26232f(int i) {
            return (b) this.f22874a.get(i);
        }

        /* renamed from: g */
        public void m26233g() {
            this.f22874a.clear();
            this.f22874a.add(new b(f7b.this.f22861c.getString(bae.mr_chooser_title)));
            Iterator it = f7b.this.f22863e.iterator();
            while (it.hasNext()) {
                this.f22874a.add(new b((C2319g.h) it.next()));
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f22874a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemViewType(int i) {
            return ((b) this.f22874a.get(i)).m26236b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            int itemViewType = getItemViewType(i);
            b bVarM26232f = m26232f(i);
            if (itemViewType == 1) {
                ((a) d0Var).m26234O(bVarM26232f);
            } else {
                if (itemViewType != 2) {
                    return;
                }
                ((c) d0Var).m26237O(bVarM26232f);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new a(this.f22875b.inflate(i9e.mr_picker_header_item, viewGroup, false));
            }
            if (i != 2) {
                return null;
            }
            return new c(this.f22875b.inflate(i9e.mr_picker_route_item, viewGroup, false));
        }
    }

    /* renamed from: o.f7b$e */
    public static final class C13358e implements Comparator {

        /* renamed from: a */
        public static final C13358e f22893a = new C13358e();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2319g.h hVar, C2319g.h hVar2) {
            return hVar.m8359m().compareToIgnoreCase(hVar2.m8359m());
        }
    }

    public f7b(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22867q = true;
        this.f22859a.m8239b(this.f22862d, this.f22860b, 1);
        refreshRoutes();
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i9e.mr_picker_dialog);
        AbstractC2307c.m8014s(this.f22861c, this);
        this.f22863e = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(b8e.mr_picker_close_button);
        this.f22864f = imageButton;
        imageButton.setOnClickListener(new ViewOnClickListenerC13355b());
        this.f22865g = new C13357d();
        RecyclerView recyclerView = (RecyclerView) findViewById(b8e.mr_picker_list);
        this.f22866h = recyclerView;
        recyclerView.setAdapter(this.f22865g);
        this.f22866h.setLayoutManager(new LinearLayoutManager(this.f22861c));
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22867q = false;
        this.f22859a.m8249s(this.f22860b);
        this.f22858H.removeMessages(1);
    }

    public boolean onFilterRoute(C2319g.h hVar) {
        return !hVar.m8369w() && hVar.m8370x() && hVar.m8339E(this.f22862d);
    }

    public void onFilterRoutes(List list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!onFilterRoute((C2319g.h) list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    public void refreshRoutes() {
        if (this.f22868s == null && this.f22867q) {
            ArrayList arrayList = new ArrayList(this.f22859a.m8246m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, C13358e.f22893a);
            if (SystemClock.uptimeMillis() - this.f22870y >= this.f22869x) {
                updateRoutes(arrayList);
                return;
            }
            this.f22858H.removeMessages(1);
            Handler handler = this.f22858H;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f22870y + this.f22869x);
        }
    }

    public void setRouteSelector(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f22862d.equals(c2318f)) {
            return;
        }
        this.f22862d = c2318f;
        if (this.f22867q) {
            this.f22859a.m8249s(this.f22860b);
            this.f22859a.m8239b(c2318f, this.f22860b, 1);
        }
        refreshRoutes();
    }

    public void updateLayout() {
        getWindow().setLayout(d7b.m22452c(this.f22861c), d7b.m22450a(this.f22861c));
    }

    public void updateRoutes(List list) {
        this.f22870y = SystemClock.uptimeMillis();
        this.f22863e.clear();
        this.f22863e.addAll(list);
        this.f22865g.m26233g();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f7b(Context context, int i) {
        Context contextM7997b = AbstractC2307c.m7997b(context, i, false);
        super(contextM7997b, AbstractC2307c.m7998c(contextM7997b));
        this.f22862d = C2318f.f9224c;
        this.f22858H = new HandlerC13354a();
        Context context2 = getContext();
        this.f22859a = C2319g.m8234j(context2);
        this.f22860b = new C13356c();
        this.f22861c = context2;
        this.f22869x = context2.getResources().getInteger(a9e.mr_update_routes_delay_ms);
    }
}
