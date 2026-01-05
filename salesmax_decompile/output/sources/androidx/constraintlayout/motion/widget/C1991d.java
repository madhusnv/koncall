package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.C1990c;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.C2006c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p001o.gmb;

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* loaded from: classes2.dex */
public class C1991d {

    /* renamed from: a */
    public final MotionLayout f6758a;

    /* renamed from: c */
    public HashSet f6760c;

    /* renamed from: e */
    public ArrayList f6762e;

    /* renamed from: b */
    public ArrayList f6759b = new ArrayList();

    /* renamed from: d */
    public String f6761d = "ViewTransitionController";

    /* renamed from: f */
    public ArrayList f6763f = new ArrayList();

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    public class a implements C2006c.a {

        /* renamed from: a */
        public final /* synthetic */ C1990c f6764a;

        /* renamed from: b */
        public final /* synthetic */ int f6765b;

        /* renamed from: c */
        public final /* synthetic */ boolean f6766c;

        /* renamed from: d */
        public final /* synthetic */ int f6767d;

        public a(C1990c c1990c, int i, boolean z, int i2) {
            this.f6764a = c1990c;
            this.f6765b = i;
            this.f6766c = z;
            this.f6767d = i2;
        }
    }

    public C1991d(MotionLayout motionLayout) {
        this.f6758a = motionLayout;
    }

    /* renamed from: a */
    public void m5549a(C1990c c1990c) {
        this.f6759b.add(c1990c);
        this.f6760c = null;
        if (c1990c.m5539i() == 4) {
            m5554f(c1990c, true);
        } else if (c1990c.m5539i() == 5) {
            m5554f(c1990c, false);
        }
    }

    /* renamed from: b */
    public void m5550b(C1990c.b bVar) {
        if (this.f6762e == null) {
            this.f6762e = new ArrayList();
        }
        this.f6762e.add(bVar);
    }

    /* renamed from: c */
    public void m5551c() {
        ArrayList arrayList = this.f6762e;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1990c.b) it.next()).m5544a();
        }
        this.f6762e.removeAll(this.f6763f);
        this.f6763f.clear();
        if (this.f6762e.isEmpty()) {
            this.f6762e = null;
        }
    }

    /* renamed from: d */
    public boolean m5552d(int i, gmb gmbVar) {
        Iterator it = this.f6759b.iterator();
        while (it.hasNext()) {
            C1990c c1990c = (C1990c) it.next();
            if (c1990c.m5535e() == i) {
                c1990c.f6724f.m48185a(gmbVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m5553e() {
        this.f6758a.invalidate();
    }

    /* renamed from: f */
    public final void m5554f(C1990c c1990c, boolean z) {
        ConstraintLayout.getSharedValues().m5716a(c1990c.m5538h(), new a(c1990c, c1990c.m5538h(), z, c1990c.m5537g()));
    }

    /* renamed from: g */
    public void m5555g(C1990c.b bVar) {
        this.f6763f.add(bVar);
    }

    /* renamed from: h */
    public void m5556h(MotionEvent motionEvent) {
        C1990c c1990c;
        int currentState = this.f6758a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f6760c == null) {
            this.f6760c = new HashSet();
            Iterator it = this.f6759b.iterator();
            while (it.hasNext()) {
                C1990c c1990c2 = (C1990c) it.next();
                int childCount = this.f6758a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f6758a.getChildAt(i);
                    if (c1990c2.m5540k(childAt)) {
                        childAt.getId();
                        this.f6760c.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f6762e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = this.f6762e.iterator();
            while (it2.hasNext()) {
                ((C1990c.b) it2.next()).m5547d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            C2005b c2005bO0 = this.f6758a.o0(currentState);
            Iterator it3 = this.f6759b.iterator();
            while (it3.hasNext()) {
                C1990c c1990c3 = (C1990c) it3.next();
                if (c1990c3.m5542m(action)) {
                    Iterator it4 = this.f6760c.iterator();
                    while (it4.hasNext()) {
                        View view = (View) it4.next();
                        if (c1990c3.m5540k(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                c1990c = c1990c3;
                                c1990c3.m5533c(this, this.f6758a, currentState, c2005bO0, view);
                            } else {
                                c1990c = c1990c3;
                            }
                            c1990c3 = c1990c;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void m5557i(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6759b.iterator();
        while (it.hasNext()) {
            C1990c c1990c = (C1990c) it.next();
            if (c1990c.m5535e() == i) {
                for (View view : viewArr) {
                    if (c1990c.m5534d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    m5558j(c1990c, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }

    /* renamed from: j */
    public final void m5558j(C1990c c1990c, View... viewArr) {
        int currentState = this.f6758a.getCurrentState();
        if (c1990c.f6723e == 2) {
            c1990c.m5533c(this, this.f6758a, currentState, null, viewArr);
            return;
        }
        if (currentState == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("No support for ViewTransition within transition yet. Currently: ");
            sb.append(this.f6758a.toString());
        } else {
            C2005b c2005bO0 = this.f6758a.o0(currentState);
            if (c2005bO0 == null) {
                return;
            }
            c1990c.m5533c(this, this.f6758a, currentState, c2005bO0, viewArr);
        }
    }
}
