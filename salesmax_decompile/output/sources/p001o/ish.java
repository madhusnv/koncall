package p001o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ish {

    /* renamed from: a */
    public static final Comparator f29205a = new C14365a();

    /* renamed from: o.ish$a */
    public class C14365a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    /* renamed from: a */
    public static ActionMenuView m32697a(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ImageView m32698b(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static ImageView m32699c(Toolbar toolbar) {
        return m32698b(toolbar, toolbar.getLogo());
    }

    /* renamed from: d */
    public static ImageButton m32700d(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public static TextView m32701e(Toolbar toolbar) {
        List listM32702f = m32702f(toolbar, toolbar.getSubtitle());
        if (listM32702f.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listM32702f, f29205a);
    }

    /* renamed from: f */
    public static List m32702f(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static TextView m32703g(Toolbar toolbar) {
        List listM32702f = m32702f(toolbar, toolbar.getTitle());
        if (listM32702f.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listM32702f, f29205a);
    }
}
