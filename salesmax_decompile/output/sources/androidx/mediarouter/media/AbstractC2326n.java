package androidx.mediarouter.media;

import android.content.Context;
import androidx.mediarouter.media.AbstractC2321i;
import java.lang.ref.WeakReference;

/* renamed from: androidx.mediarouter.media.n */
/* loaded from: classes2.dex */
public abstract class AbstractC2326n {

    /* renamed from: a */
    public final Context f9381a;

    /* renamed from: b */
    public final Object f9382b;

    /* renamed from: c */
    public c f9383c;

    /* renamed from: androidx.mediarouter.media.n$a */
    public static class a extends AbstractC2326n {

        /* renamed from: d */
        public final Object f9384d;

        /* renamed from: e */
        public final Object f9385e;

        /* renamed from: f */
        public final Object f9386f;

        /* renamed from: g */
        public boolean f9387g;

        /* renamed from: androidx.mediarouter.media.n$a$a, reason: collision with other inner class name */
        public static final class C19571a implements AbstractC2321i.e {

            /* renamed from: a */
            public final WeakReference f9388a;

            public C19571a(a aVar) {
                this.f9388a = new WeakReference(aVar);
            }

            @Override // androidx.mediarouter.media.AbstractC2321i.e
            /* renamed from: a */
            public void mo8422a(Object obj, int i) {
                c cVar;
                a aVar = (a) this.f9388a.get();
                if (aVar == null || (cVar = aVar.f9383c) == null) {
                    return;
                }
                cVar.mo8318b(i);
            }

            @Override // androidx.mediarouter.media.AbstractC2321i.e
            /* renamed from: d */
            public void mo8423d(Object obj, int i) {
                c cVar;
                a aVar = (a) this.f9388a.get();
                if (aVar == null || (cVar = aVar.f9383c) == null) {
                    return;
                }
                cVar.mo8317a(i);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object objM8389e = AbstractC2321i.m8389e(context);
            this.f9384d = objM8389e;
            Object objM8386b = AbstractC2321i.m8386b(objM8389e, "", false);
            this.f9385e = objM8386b;
            this.f9386f = AbstractC2321i.m8387c(objM8389e, objM8386b);
        }

        @Override // androidx.mediarouter.media.AbstractC2326n
        /* renamed from: c */
        public void mo8497c(b bVar) {
            AbstractC2321i.d.m8418e(this.f9386f, bVar.f9389a);
            AbstractC2321i.d.m8421h(this.f9386f, bVar.f9390b);
            AbstractC2321i.d.m8420g(this.f9386f, bVar.f9391c);
            AbstractC2321i.d.m8415b(this.f9386f, bVar.f9392d);
            AbstractC2321i.d.m8416c(this.f9386f, bVar.f9393e);
            if (this.f9387g) {
                return;
            }
            this.f9387g = true;
            AbstractC2321i.d.m8419f(this.f9386f, AbstractC2321i.m8388d(new C19571a(this)));
            AbstractC2321i.d.m8417d(this.f9386f, this.f9382b);
        }
    }

    /* renamed from: androidx.mediarouter.media.n$b */
    public static final class b {

        /* renamed from: a */
        public int f9389a;

        /* renamed from: b */
        public int f9390b;

        /* renamed from: c */
        public int f9391c = 0;

        /* renamed from: d */
        public int f9392d = 3;

        /* renamed from: e */
        public int f9393e = 1;

        /* renamed from: f */
        public String f9394f;
    }

    /* renamed from: androidx.mediarouter.media.n$c */
    public interface c {
        /* renamed from: a */
        void mo8317a(int i);

        /* renamed from: b */
        void mo8318b(int i);
    }

    public AbstractC2326n(Context context, Object obj) {
        this.f9381a = context;
        this.f9382b = obj;
    }

    /* renamed from: b */
    public static AbstractC2326n m8495b(Context context, Object obj) {
        return new a(context, obj);
    }

    /* renamed from: a */
    public Object m8496a() {
        return this.f9382b;
    }

    /* renamed from: c */
    public abstract void mo8497c(b bVar);

    /* renamed from: d */
    public void m8498d(c cVar) {
        this.f9383c = cVar;
    }
}
