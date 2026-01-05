package p013o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p009j.AbstractC3500a;
import p012n.AbstractC4931k;
import p012n.InterfaceC4937q;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j1 implements InterfaceC4937q {

    /* renamed from: B */
    public static final Method f25545B;

    /* renamed from: z */
    public static final Method f25546z;

    /* renamed from: a */
    public final Context f25547a;

    /* renamed from: b */
    public ListAdapter f25548b;

    /* renamed from: c */
    public n1 f25549c;

    /* renamed from: e */
    public int f25551e;

    /* renamed from: f */
    public int f25552f;

    /* renamed from: g */
    public boolean f25553g;

    /* renamed from: h */
    public boolean f25554h;

    /* renamed from: j */
    public boolean f25555j;

    /* renamed from: l */
    public g1 f25557l;

    /* renamed from: m */
    public View f25558m;

    /* renamed from: n */
    public AbstractC4931k f25559n;

    /* renamed from: t */
    public final Handler f25564t;

    /* renamed from: w */
    public Rect f25566w;

    /* renamed from: x */
    public boolean f25567x;

    /* renamed from: y */
    public final C5238x f25568y;

    /* renamed from: d */
    public int f25550d = -2;

    /* renamed from: k */
    public int f25556k = 0;

    /* renamed from: p */
    public final f1 f25560p = new f1(this, 1);

    /* renamed from: q */
    public final i1 f25561q = new i1(this);

    /* renamed from: r */
    public final h1 f25562r = new h1(this);

    /* renamed from: s */
    public final f1 f25563s = new f1(this, 0);

    /* renamed from: v */
    public final Rect f25565v = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f25546z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f25545B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public j1(Context context, int i10) {
        int resourceId;
        this.f25547a = context;
        this.f25564t = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC3500a.f18356m, i10, 0);
        this.f25551e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f25552f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f25553g = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C5238x c5238x = new C5238x(context, null, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC3500a.f18360q, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c5238x.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c5238x.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : s8.m11864b(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f25568y = c5238x;
        c5238x.setInputMethodMode(1);
    }

    /* renamed from: a */
    public final void m10248a(ListAdapter listAdapter) {
        g1 g1Var = this.f25557l;
        if (g1Var == null) {
            this.f25557l = new g1(this);
        } else {
            ListAdapter listAdapter2 = this.f25548b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(g1Var);
            }
        }
        this.f25548b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f25557l);
        }
        n1 n1Var = this.f25549c;
        if (n1Var != null) {
            n1Var.setAdapter(this.f25548b);
        }
    }

    @Override // p012n.InterfaceC4937q
    public final void dismiss() {
        C5238x c5238x = this.f25568y;
        c5238x.dismiss();
        c5238x.setContentView(null);
        this.f25549c = null;
        this.f25564t.removeCallbacks(this.f25560p);
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: e */
    public final boolean mo9836e() {
        return this.f25568y.isShowing();
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: f */
    public final void mo9837f() {
        int i10;
        n1 n1Var;
        n1 n1Var2 = this.f25549c;
        Context context = this.f25547a;
        C5238x c5238x = this.f25568y;
        if (n1Var2 == null) {
            n1 n1Var3 = new n1(context, !this.f25567x);
            n1Var3.setHoverListener((o1) this);
            this.f25549c = n1Var3;
            n1Var3.setAdapter(this.f25548b);
            this.f25549c.setOnItemClickListener(this.f25559n);
            this.f25549c.setFocusable(true);
            this.f25549c.setFocusableInTouchMode(true);
            this.f25549c.setOnItemSelectedListener(new c1(this));
            this.f25549c.setOnScrollListener(this.f25562r);
            c5238x.setContentView(this.f25549c);
        }
        Drawable background = c5238x.getBackground();
        Rect rect = this.f25565v;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f25553g) {
                this.f25552f = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iM10219a = d1.m10219a(c5238x, this.f25558m, this.f25552f, c5238x.getInputMethodMode() == 2);
        int i12 = this.f25550d;
        int iM10302a = this.f25549c.m10302a(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM10219a);
        int paddingBottom = iM10302a + (iM10302a > 0 ? this.f25549c.getPaddingBottom() + this.f25549c.getPaddingTop() + i10 : 0);
        c5238x.getInputMethodMode();
        c5238x.setWindowLayoutType(1002);
        if (c5238x.isShowing()) {
            if (this.f25558m.isAttachedToWindow()) {
                int width = this.f25550d;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f25558m.getWidth();
                }
                c5238x.setOutsideTouchable(true);
                c5238x.update(this.f25558m, this.f25551e, this.f25552f, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f25550d;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f25558m.getWidth();
        }
        c5238x.setWidth(width2);
        c5238x.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f25546z;
            if (method != null) {
                try {
                    method.invoke(c5238x, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            e1.m10222b(c5238x, true);
        }
        c5238x.setOutsideTouchable(true);
        c5238x.setTouchInterceptor(this.f25561q);
        if (this.f25555j) {
            c5238x.setOverlapAnchor(this.f25554h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f25545B;
            if (method2 != null) {
                try {
                    method2.invoke(c5238x, this.f25566w);
                } catch (Exception unused2) {
                }
            }
        } else {
            e1.m10221a(c5238x, this.f25566w);
        }
        c5238x.showAsDropDown(this.f25558m, this.f25551e, this.f25552f, this.f25556k);
        this.f25549c.setSelection(-1);
        if ((!this.f25567x || this.f25549c.isInTouchMode()) && (n1Var = this.f25549c) != null) {
            n1Var.setListSelectionHidden(true);
            n1Var.requestLayout();
        }
        if (this.f25567x) {
            return;
        }
        this.f25564t.post(this.f25563s);
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: h */
    public final ListView mo9839h() {
        return this.f25549c;
    }
}
