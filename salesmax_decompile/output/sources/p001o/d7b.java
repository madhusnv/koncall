package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class d7b {
    /* renamed from: a */
    public static int m22450a(Context context) {
        return !context.getResources().getBoolean(j6e.is_tablet) ? -1 : -2;
    }

    /* renamed from: b */
    public static int m22451b(Context context) throws Resources.NotFoundException {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? h7e.mr_dialog_fixed_width_minor : h7e.mr_dialog_fixed_width_major, typedValue, true);
        int i = typedValue.type;
        if (i == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i != 6) {
                return -2;
            }
            int i2 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i2, i2);
        }
        return (int) fraction;
    }

    /* renamed from: c */
    public static int m22452c(Context context) {
        if (context.getResources().getBoolean(j6e.is_tablet)) {
            return m22451b(context);
        }
        return -1;
    }

    /* renamed from: d */
    public static HashMap m22453d(Context context, ListView listView, ArrayAdapter arrayAdapter) {
        HashMap map = new HashMap();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            map.put(arrayAdapter.getItem(firstVisiblePosition + i), m22457h(context, listView.getChildAt(i)));
        }
        return map;
    }

    /* renamed from: e */
    public static HashMap m22454e(ListView listView, ArrayAdapter arrayAdapter) {
        HashMap map = new HashMap();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            Object item = arrayAdapter.getItem(firstVisiblePosition + i);
            View childAt = listView.getChildAt(i);
            map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
        }
        return map;
    }

    /* renamed from: f */
    public static Set m22455f(List list, List list2) {
        HashSet hashSet = new HashSet(list2);
        hashSet.removeAll(list);
        return hashSet;
    }

    /* renamed from: g */
    public static Set m22456g(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }

    /* renamed from: h */
    public static BitmapDrawable m22457h(Context context, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    /* renamed from: i */
    public static boolean m22458i(List list, List list2) {
        return new HashSet(list).equals(new HashSet(list2));
    }
}
