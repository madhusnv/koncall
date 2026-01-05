package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class rs1 {

    /* renamed from: a */
    public final Rect f43996a;

    /* renamed from: b */
    public final ColorStateList f43997b;

    /* renamed from: c */
    public final ColorStateList f43998c;

    /* renamed from: d */
    public final ColorStateList f43999d;

    /* renamed from: e */
    public final int f44000e;

    /* renamed from: f */
    public final ykf f44001f;

    public rs1(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ykf ykfVar, Rect rect) {
        fgd.m26660d(rect.left);
        fgd.m26660d(rect.top);
        fgd.m26660d(rect.right);
        fgd.m26660d(rect.bottom);
        this.f43996a = rect;
        this.f43997b = colorStateList2;
        this.f43998c = colorStateList;
        this.f43999d = colorStateList3;
        this.f44000e = i;
        this.f44001f = ykfVar;
    }

    /* renamed from: a */
    public static rs1 m47127a(Context context, int i) throws Resources.NotFoundException {
        fgd.m26658b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ebe.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListM58494a = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListM58494a2 = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListM58494a3 = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.MaterialCalendarItem_itemStrokeWidth, 0);
        ykf ykfVarM57970m = ykf.m57922b(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m57970m();
        typedArrayObtainStyledAttributes.recycle();
        return new rs1(colorStateListM58494a, colorStateListM58494a2, colorStateListM58494a3, dimensionPixelSize, ykfVarM57970m, rect);
    }

    /* renamed from: b */
    public int m47128b() {
        return this.f43996a.bottom;
    }

    /* renamed from: c */
    public int m47129c() {
        return this.f43996a.top;
    }

    /* renamed from: d */
    public void m47130d(TextView textView) {
        m47131e(textView, null, null);
    }

    /* renamed from: e */
    public void m47131e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        zya zyaVar = new zya();
        zya zyaVar2 = new zya();
        zyaVar.setShapeAppearanceModel(this.f44001f);
        zyaVar2.setShapeAppearanceModel(this.f44001f);
        if (colorStateList == null) {
            colorStateList = this.f43998c;
        }
        zyaVar.g0(colorStateList);
        zyaVar.q0(this.f44000e, this.f43999d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f43997b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f43997b.withAlpha(30), zyaVar, zyaVar2);
        Rect rect = this.f43996a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
