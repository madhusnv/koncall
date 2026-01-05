package com.google.android.material.datepicker;

import a1.C0005d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import ph.C5951f;
import ph.C5952g;
import ph.C5955j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C1354r extends BaseAdapter {

    /* renamed from: d */
    public static final int f6903d = AbstractC1361y.m4113c(null).getMaximum(4);

    /* renamed from: a */
    public final C1353q f6904a;

    /* renamed from: b */
    public C0005d f6905b;

    /* renamed from: c */
    public final C1338b f6906c;

    public C1354r(C1353q c1353q, C1338b c1338b) {
        this.f6904a = c1353q;
        this.f6906c = c1338b;
        throw null;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        C1353q c1353q = this.f6904a;
        if (i10 < c1353q.m4104d() || i10 > m4108b()) {
            return null;
        }
        int iM4104d = (i10 - c1353q.m4104d()) + 1;
        Calendar calendarM4111a = AbstractC1361y.m4111a(c1353q.f6896a);
        calendarM4111a.set(5, iM4104d);
        return Long.valueOf(calendarM4111a.getTimeInMillis());
    }

    /* renamed from: b */
    public final int m4108b() {
        C1353q c1353q = this.f6904a;
        return (c1353q.m4104d() + c1353q.f6900e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1353q c1353q = this.f6904a;
        return c1353q.m4104d() + c1353q.f6900e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f6904a.f6899d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f6905b == null) {
            this.f6905b = new C0005d(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        C1353q c1353q = this.f6904a;
        int iM4104d = i10 - c1353q.m4104d();
        if (iM4104d < 0 || iM4104d >= c1353q.f6900e) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i11 = iM4104d + 1;
            textView.setTag(c1353q);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
            Calendar calendarM4111a = AbstractC1361y.m4111a(c1353q.f6896a);
            calendarM4111a.set(5, i11);
            long timeInMillis = calendarM4111a.getTimeInMillis();
            int i12 = c1353q.f6898c;
            Calendar calendarM4112b = AbstractC1361y.m4112b();
            calendarM4112b.set(5, 1);
            Calendar calendarM4111a2 = AbstractC1361y.m4111a(calendarM4112b);
            calendarM4111a2.get(2);
            int i13 = calendarM4111a2.get(1);
            calendarM4111a2.getMaximum(7);
            calendarM4111a2.getActualMaximum(5);
            calendarM4111a2.getTimeInMillis();
            if (i12 == i13) {
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton.format(new Date(timeInMillis)));
            } else {
                DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
                instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton2.format(new Date(timeInMillis)));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        long jLongValue = item.longValue();
        if (textView != null) {
            if (jLongValue >= this.f6906c.f6841c.f6851a) {
                textView.setEnabled(true);
                throw null;
            }
            textView.setEnabled(false);
            C1339c c1339c = (C1339c) this.f6905b.f26d;
            c1339c.getClass();
            C5952g c5952g = new C5952g();
            C5952g c5952g2 = new C5952g();
            C5955j c5955j = (C5955j) c1339c.f6850f;
            c5952g.setShapeAppearanceModel(c5955j);
            c5952g2.setShapeAppearanceModel(c5955j);
            c5952g.m11988i((ColorStateList) c1339c.f6848d);
            float f6 = c1339c.f6845a;
            ColorStateList colorStateList = (ColorStateList) c1339c.f6849e;
            c5952g.f29152a.f29144j = f6;
            c5952g.invalidateSelf();
            C5951f c5951f = c5952g.f29152a;
            if (c5951f.f29138d != colorStateList) {
                c5951f.f29138d = colorStateList;
                c5952g.onStateChange(c5952g.getState());
            }
            ColorStateList colorStateList2 = (ColorStateList) c1339c.f6847c;
            textView.setTextColor(colorStateList2);
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2.withAlpha(30), c5952g, c5952g2);
            Rect rect = (Rect) c1339c.f6846b;
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
            Field field = v0.f5527a;
            textView.setBackground(insetDrawable);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
