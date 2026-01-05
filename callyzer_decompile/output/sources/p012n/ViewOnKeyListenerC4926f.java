package p012n;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.websoptimization.callyzerbiz.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.C4001v;
import p013o.C5238x;
import p013o.l1;
import p013o.o1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.f */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4926f extends AbstractC4931k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B */
    public ViewTreeObserver f24501B;

    /* renamed from: C */
    public PopupWindow.OnDismissListener f24502C;

    /* renamed from: D */
    public boolean f24503D;

    /* renamed from: b */
    public final Context f24504b;

    /* renamed from: c */
    public final int f24505c;

    /* renamed from: d */
    public final int f24506d;

    /* renamed from: e */
    public final boolean f24507e;

    /* renamed from: f */
    public final Handler f24508f;

    /* renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC4923c f24511j;

    /* renamed from: k */
    public final ViewOnAttachStateChangeListenerC4924d f24512k;

    /* renamed from: p */
    public View f24516p;

    /* renamed from: q */
    public View f24517q;

    /* renamed from: r */
    public int f24518r;

    /* renamed from: s */
    public boolean f24519s;

    /* renamed from: t */
    public boolean f24520t;

    /* renamed from: v */
    public int f24521v;

    /* renamed from: w */
    public int f24522w;

    /* renamed from: y */
    public boolean f24524y;

    /* renamed from: z */
    public InterfaceC4934n f24525z;

    /* renamed from: g */
    public final ArrayList f24509g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f24510h = new ArrayList();

    /* renamed from: l */
    public final C4001v f24513l = new C4001v(10, this);

    /* renamed from: m */
    public int f24514m = 0;

    /* renamed from: n */
    public int f24515n = 0;

    /* renamed from: x */
    public boolean f24523x = false;

    public ViewOnKeyListenerC4926f(Context context, View view, int i10, boolean z6) {
        int i11 = 0;
        this.f24511j = new ViewTreeObserverOnGlobalLayoutListenerC4923c(this, i11);
        this.f24512k = new ViewOnAttachStateChangeListenerC4924d(i11, this);
        this.f24504b = context;
        this.f24516p = view;
        this.f24506d = i10;
        this.f24507e = z6;
        this.f24518r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f24505c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f24508f = new Handler();
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: a */
    public final void mo9833a(MenuC4929i menuC4929i, boolean z6) {
        ArrayList arrayList = this.f24510h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (menuC4929i == ((C4925e) arrayList.get(i10)).f24499b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((C4925e) arrayList.get(i11)).f24499b.m9854c(false);
        }
        C4925e c4925e = (C4925e) arrayList.remove(i10);
        MenuC4929i menuC4929i2 = c4925e.f24499b;
        o1 o1Var = c4925e.f24498a;
        C5238x c5238x = o1Var.f25568y;
        CopyOnWriteArrayList copyOnWriteArrayList = menuC4929i2.f24550r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC4935o interfaceC4935o = (InterfaceC4935o) weakReference.get();
            if (interfaceC4935o == null || interfaceC4935o == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.f24503D) {
            l1.m10252b(c5238x, null);
            c5238x.setAnimationStyle(0);
        }
        o1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f24518r = ((C4925e) arrayList.get(size2 - 1)).f24500c;
        } else {
            this.f24518r = this.f24516p.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((C4925e) arrayList.get(0)).f24499b.m9854c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC4934n interfaceC4934n = this.f24525z;
        if (interfaceC4934n != null) {
            interfaceC4934n.mo393a(menuC4929i, true);
        }
        ViewTreeObserver viewTreeObserver = this.f24501B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f24501B.removeGlobalOnLayoutListener(this.f24511j);
            }
            this.f24501B = null;
        }
        this.f24517q.removeOnAttachStateChangeListener(this.f24512k);
        this.f24502C.onDismiss();
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: c */
    public final boolean mo9834c(SubMenuC4939s subMenuC4939s) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.f24510h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C4925e c4925e = (C4925e) obj;
            if (subMenuC4939s == c4925e.f24499b) {
                c4925e.f24498a.f25549c.requestFocus();
                return true;
            }
        }
        if (!subMenuC4939s.hasVisibleItems()) {
            return false;
        }
        mo9841l(subMenuC4939s);
        InterfaceC4934n interfaceC4934n = this.f24525z;
        if (interfaceC4934n != null) {
            interfaceC4934n.mo397f(subMenuC4939s);
        }
        return true;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: d */
    public final boolean mo9835d() {
        return false;
    }

    @Override // p012n.InterfaceC4937q
    public final void dismiss() {
        ArrayList arrayList = this.f24510h;
        int size = arrayList.size();
        if (size > 0) {
            C4925e[] c4925eArr = (C4925e[]) arrayList.toArray(new C4925e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C4925e c4925e = c4925eArr[i10];
                if (c4925e.f24498a.f25568y.isShowing()) {
                    c4925e.f24498a.dismiss();
                }
            }
        }
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: e */
    public final boolean mo9836e() {
        ArrayList arrayList = this.f24510h;
        return arrayList.size() > 0 && ((C4925e) arrayList.get(0)).f24498a.f25568y.isShowing();
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: f */
    public final void mo9837f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo9836e()) {
            return;
        }
        ArrayList arrayList = this.f24509g;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m9849u((MenuC4929i) obj);
        }
        arrayList.clear();
        View view = this.f24516p;
        this.f24517q = view;
        if (view != null) {
            boolean z6 = this.f24501B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f24501B = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f24511j);
            }
            this.f24517q.addOnAttachStateChangeListener(this.f24512k);
        }
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: g */
    public final void mo9838g() {
        ArrayList arrayList = this.f24510h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((C4925e) obj).f24498a.f25549c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C4927g) adapter).notifyDataSetChanged();
        }
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: h */
    public final ListView mo9839h() {
        ArrayList arrayList = this.f24510h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C4925e) arrayList.get(arrayList.size() - 1)).f24498a.f25549c;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: j */
    public final void mo9840j(InterfaceC4934n interfaceC4934n) {
        this.f24525z = interfaceC4934n;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: l */
    public final void mo9841l(MenuC4929i menuC4929i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC4929i.m9853b(this, this.f24504b);
        if (mo9836e()) {
            m9849u(menuC4929i);
        } else {
            this.f24509g.add(menuC4929i);
        }
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: n */
    public final void mo9842n(View view) {
        if (this.f24516p != view) {
            this.f24516p = view;
            this.f24515n = Gravity.getAbsoluteGravity(this.f24514m, view.getLayoutDirection());
        }
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: o */
    public final void mo9843o(boolean z6) {
        this.f24523x = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C4925e c4925e;
        ArrayList arrayList = this.f24510h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c4925e = null;
                break;
            }
            c4925e = (C4925e) arrayList.get(i10);
            if (!c4925e.f24498a.f25568y.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (c4925e != null) {
            c4925e.f24499b.m9854c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: p */
    public final void mo9844p(int i10) {
        if (this.f24514m != i10) {
            this.f24514m = i10;
            this.f24515n = Gravity.getAbsoluteGravity(i10, this.f24516p.getLayoutDirection());
        }
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: q */
    public final void mo9845q(int i10) {
        this.f24519s = true;
        this.f24521v = i10;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: r */
    public final void mo9846r(PopupWindow.OnDismissListener onDismissListener) {
        this.f24502C = onDismissListener;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: s */
    public final void mo9847s(boolean z6) {
        this.f24524y = z6;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: t */
    public final void mo9848t(int i10) {
        this.f24520t = true;
        this.f24522w = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9849u(p012n.MenuC4929i r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012n.ViewOnKeyListenerC4926f.m9849u(n.i):void");
    }
}
