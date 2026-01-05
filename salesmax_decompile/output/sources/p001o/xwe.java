package p001o;

import android.view.View;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class xwe {

    /* renamed from: o.xwe$a */
    public static final class C18259a implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ View f54439a;

        /* renamed from: b */
        public final /* synthetic */ int f54440b;

        public C18259a(View view, int i) {
            this.f54439a = view;
            this.f54440b = i;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean bool) {
            View view = this.f54439a;
            sq8.m48645d(bool, "value");
            view.setVisibility(bool.booleanValue() ? 0 : this.f54440b);
        }
    }

    /* renamed from: a */
    public static final gu3 m56916a(View view, int i) {
        sq8.m48650i(view, "$this$visibility");
        boolean z = true;
        if (!(i != 0)) {
            throw new IllegalArgumentException("Setting visibility to VISIBLE when false would have no effect.".toString());
        }
        if (i != 4 && i != 8) {
            z = false;
        }
        if (z) {
            return new C18259a(view, i);
        }
        throw new IllegalArgumentException("Must set visibility to INVISIBLE or GONE when false.".toString());
    }
}
