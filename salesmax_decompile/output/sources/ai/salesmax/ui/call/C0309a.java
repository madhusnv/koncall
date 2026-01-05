package ai.salesmax.ui.call;

import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.event.ItemChangeEvent;
import ai.salesmax.model.event.ItemChangeListener;
import android.util.LruCache;
import p001o.id5;
import p001o.sq8;

/* renamed from: ai.salesmax.ui.call.a */
/* loaded from: classes.dex */
public final class C0309a implements ItemChangeListener {

    /* renamed from: b */
    public static final a f469b = new a(null);

    /* renamed from: c */
    public static final int f470c = 8;

    /* renamed from: d */
    public static final C0309a f471d = new C0309a();

    /* renamed from: e */
    public static boolean f472e;

    /* renamed from: a */
    public LruCache f473a = new LruCache(10);

    /* renamed from: ai.salesmax.ui.call.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C0309a m778a() {
            return C0309a.f471d;
        }

        /* renamed from: b */
        public final synchronized boolean m779b() {
            return m781d();
        }

        /* renamed from: c */
        public final synchronized C0309a m780c() {
            if (!m781d()) {
                m782e(true);
            }
            return m778a();
        }

        /* renamed from: d */
        public final boolean m781d() {
            return C0309a.f472e;
        }

        /* renamed from: e */
        public final void m782e(boolean z) {
            C0309a.f472e = z;
        }
    }

    /* renamed from: d */
    public final void m777d(String str, LeadsSummary leadsSummary) {
        sq8.m48649h(str, "phoneNumber");
        this.f473a.put(str, leadsSummary);
    }

    @Override // ai.salesmax.model.event.ItemChangeListener
    public void onItemChanged(ItemChangeEvent itemChangeEvent) {
    }
}
