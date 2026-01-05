package o5;

import a2.AbstractC0030c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i0.m0;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import n5.AbstractC4955a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o5.d */
/* loaded from: classes.dex */
public final class C5295d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC5292a f25981a;

    /* renamed from: b */
    public boolean f25982b;

    /* renamed from: c */
    public final int f25983c;

    /* renamed from: d */
    public final int f25984d;

    /* renamed from: e */
    public final int f25985e;

    /* renamed from: f */
    public final int f25986f;

    /* renamed from: g */
    public final int f25987g;

    /* renamed from: h */
    public int f25988h;

    /* renamed from: i */
    public int f25989i;

    /* renamed from: j */
    public int f25990j;

    /* renamed from: k */
    public View f25991k;

    /* renamed from: l */
    public View f25992l;

    /* renamed from: m */
    public boolean f25993m;

    /* renamed from: n */
    public boolean f25994n;

    /* renamed from: o */
    public final Rect f25995o;

    public C5295d() {
        super(-2, -2);
        this.f25982b = false;
        this.f25983c = 0;
        this.f25984d = 0;
        this.f25985e = -1;
        this.f25986f = -1;
        this.f25987g = 0;
        this.f25988h = 0;
        this.f25995o = new Rect();
    }

    /* renamed from: a */
    public final boolean m10438a(int i10) {
        if (i10 == 0) {
            return this.f25993m;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f25994n;
    }

    public C5295d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        AbstractC5292a abstractC5292a;
        super(context, attributeSet);
        this.f25982b = false;
        this.f25983c = 0;
        this.f25984d = 0;
        this.f25985e = -1;
        this.f25986f = -1;
        this.f25987g = 0;
        this.f25988h = 0;
        this.f25995o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4955a.f24643b);
        this.f25983c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f25986f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f25984d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f25985e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f25987g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f25988h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f25982b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f2166w;
            if (TextUtils.isEmpty(string)) {
                abstractC5292a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f2166w;
                    if (!TextUtils.isEmpty(str2)) {
                        string = AbstractC0030c.m115f('.', str2, string);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f2168y;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2167x);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC5292a = (AbstractC5292a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException(m0.m7378k("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.f25981a = abstractC5292a;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC5292a abstractC5292a2 = this.f25981a;
        if (abstractC5292a2 != null) {
            abstractC5292a2.mo4057c(this);
        }
    }

    public C5295d(C5295d c5295d) {
        super((ViewGroup.MarginLayoutParams) c5295d);
        this.f25982b = false;
        this.f25983c = 0;
        this.f25984d = 0;
        this.f25985e = -1;
        this.f25986f = -1;
        this.f25987g = 0;
        this.f25988h = 0;
        this.f25995o = new Rect();
    }

    public C5295d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f25982b = false;
        this.f25983c = 0;
        this.f25984d = 0;
        this.f25985e = -1;
        this.f25986f = -1;
        this.f25987g = 0;
        this.f25988h = 0;
        this.f25995o = new Rect();
    }

    public C5295d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f25982b = false;
        this.f25983c = 0;
        this.f25984d = 0;
        this.f25985e = -1;
        this.f25986f = -1;
        this.f25987g = 0;
        this.f25988h = 0;
        this.f25995o = new Rect();
    }
}
