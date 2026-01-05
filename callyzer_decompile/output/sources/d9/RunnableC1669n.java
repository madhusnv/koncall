package d9;

import android.content.res.Resources;
import android.view.View;
import c6.v0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import m6.C4669e;
import t8.C7077w;
import u8.C7356d;
import u8.C7361i;
import u8.C7378z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.n */
/* loaded from: classes.dex */
public final class RunnableC1669n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8194a = 1;

    /* renamed from: b */
    public boolean f8195b;

    /* renamed from: c */
    public int f8196c;

    /* renamed from: d */
    public final Object f8197d;

    /* renamed from: e */
    public final Object f8198e;

    public RunnableC1669n(C7356d processor, C7361i token, boolean z6, int i10) {
        AbstractC4154l.m8923f(processor, "processor");
        AbstractC4154l.m8923f(token, "token");
        this.f8197d = processor;
        this.f8198e = token;
        this.f8195b = z6;
        this.f8196c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        C7378z c7378zM13770b;
        switch (this.f8194a) {
            case 0:
                if (this.f8195b) {
                    C7356d c7356d = (C7356d) this.f8197d;
                    C7361i c7361i = (C7361i) this.f8198e;
                    int i10 = this.f8196c;
                    c7356d.getClass();
                    String str = c7361i.f35021a.f5589a;
                    synchronized (c7356d.f35013k) {
                        c7378zM13770b = c7356d.m13770b(str);
                    }
                    C7356d.m13768d(c7378zM13770b, i10);
                } else {
                    C7356d c7356d2 = (C7356d) this.f8197d;
                    C7361i c7361i2 = (C7361i) this.f8198e;
                    int i11 = this.f8196c;
                    c7356d2.getClass();
                    String str2 = c7361i2.f35021a.f5589a;
                    synchronized (c7356d2.f35013k) {
                        try {
                            if (c7356d2.f35008f.get(str2) != null) {
                                C7077w.m13371a().getClass();
                            } else {
                                Set set = (Set) c7356d2.f35010h.get(str2);
                                if (set != null && set.contains(c7361i2)) {
                                    C7356d.m13768d(c7356d2.m13770b(str2), i11);
                                }
                            }
                        } finally {
                        }
                    }
                }
                C7077w c7077wM13371a = C7077w.m13371a();
                C7077w.m13372b("StopWorkRunnable");
                String str3 = ((C7361i) this.f8198e).f35021a.f5589a;
                c7077wM13371a.getClass();
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8198e;
                C4669e c4669e = bottomSheetBehavior.f6739G;
                if (c4669e == null || !c4669e.m9560f()) {
                    bottomSheetBehavior.m4067z(this.f8196c);
                } else {
                    View view = (View) this.f8197d;
                    Field field = v0.f5527a;
                    view.postOnAnimation(this);
                }
                this.f8195b = false;
                return;
        }
    }

    public RunnableC1669n(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f8198e = bottomSheetBehavior;
        this.f8197d = view;
        this.f8196c = i10;
    }
}
