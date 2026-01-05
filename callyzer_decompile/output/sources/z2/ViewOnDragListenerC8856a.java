package z2;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import e1.C1899a;
import e1.C1904f;
import i1.C3140s;
import kotlin.jvm.internal.C4164v;
import s1.C6725t;
import uf.C7427b;
import v3.AbstractC7634f;
import v3.a1;
import v3.z1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z2.a */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC8856a implements View.OnDragListener, InterfaceC8858c {

    /* renamed from: a */
    public final C8860e f42632a;

    /* renamed from: b */
    public final C1904f f42633b;

    /* renamed from: c */
    public final AndroidDragAndDropManager$modifier$1 f42634c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ViewOnDragListenerC8856a() {
        C8860e c8860e = new C8860e();
        c8860e.f42641s = 0L;
        this.f42632a = c8860e;
        this.f42633b = new C1904f(0);
        this.f42634c = new a1() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // v3.a1
            /* renamed from: h */
            public final AbstractC7878q mo621h() {
                return this.f2088a.f42632a;
            }

            public final int hashCode() {
                return this.f2088a.f42632a.hashCode();
            }

            @Override // v3.a1
            /* renamed from: i */
            public final /* bridge */ /* synthetic */ void mo622i(AbstractC7878q abstractC7878q) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C7427b c7427b = new C7427b(18, dragEvent);
        int action = dragEvent.getAction();
        C1904f c1904f = this.f42633b;
        C8860e c8860e = this.f42632a;
        switch (action) {
            case 1:
                C4164v c4164v = new C4164v();
                C3140s c3140s = new C3140s(c7427b, c8860e, c4164v);
                if (c3140s.invoke(c8860e) == z1.ContinueTraversal) {
                    AbstractC7634f.m14539B(c8860e, c3140s);
                }
                boolean z6 = c4164v.f21160a;
                c1904f.getClass();
                C1899a c1899a = new C1899a(c1904f);
                while (c1899a.hasNext()) {
                    ((C8860e) c1899a.next()).P0(c7427b);
                }
                break;
            case 2:
                c8860e.O0(c7427b);
                break;
            case 4:
                C6725t c6725t = new C6725t(20, c7427b);
                if (c6725t.invoke(c8860e) == z1.ContinueTraversal) {
                    AbstractC7634f.m14539B(c8860e, c6725t);
                }
                c1904f.clear();
                break;
            case 5:
                c8860e.M0(c7427b);
                break;
            case 6:
                c8860e.N0(c7427b);
                break;
        }
        return false;
    }
}
