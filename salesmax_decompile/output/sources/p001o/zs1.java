package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes3.dex */
public final class zs1 {

    /* renamed from: a */
    public final rs1 f57586a;

    /* renamed from: b */
    public final rs1 f57587b;

    /* renamed from: c */
    public final rs1 f57588c;

    /* renamed from: d */
    public final rs1 f57589d;

    /* renamed from: e */
    public final rs1 f57590e;

    /* renamed from: f */
    public final rs1 f57591f;

    /* renamed from: g */
    public final rs1 f57592g;

    /* renamed from: h */
    public final Paint f57593h;

    public zs1(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ota.m42660d(context, x5e.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), ebe.MaterialCalendar);
        this.f57586a = rs1.m47127a(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendar_dayStyle, 0));
        this.f57592g = rs1.m47127a(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendar_dayInvalidStyle, 0));
        this.f57587b = rs1.m47127a(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendar_daySelectedStyle, 0));
        this.f57588c = rs1.m47127a(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListM58494a = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.MaterialCalendar_rangeFillColor);
        this.f57589d = rs1.m47127a(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendar_yearStyle, 0));
        this.f57590e = rs1.m47127a(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendar_yearSelectedStyle, 0));
        this.f57591f = rs1.m47127a(context, typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f57593h = paint;
        paint.setColor(colorStateListM58494a.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
