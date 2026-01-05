package com.hbb20;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import p001o.c64;
import p001o.o8e;
import p001o.o9e;
import p001o.s84;

/* renamed from: com.hbb20.c */
/* loaded from: classes6.dex */
public abstract class AbstractC11558c {

    /* renamed from: a */
    public static final Field f13488a;

    /* renamed from: b */
    public static final Field f13489b;

    /* renamed from: c */
    public static final Field f13490c;

    /* renamed from: d */
    public static Dialog f13491d;

    /* renamed from: e */
    public static Context f13492e;

    /* renamed from: com.hbb20.c$a */
    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC11558c.f13491d.dismiss();
        }
    }

    /* renamed from: com.hbb20.c$b */
    public class b implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public final /* synthetic */ CountryCodePicker f13493a;

        public b(CountryCodePicker countryCodePicker) {
            this.f13493a = countryCodePicker;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            AbstractC11558c.m15878d(AbstractC11558c.f13492e);
            this.f13493a.getDialogEventsListener();
        }
    }

    /* renamed from: com.hbb20.c$c */
    public class c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        public final /* synthetic */ CountryCodePicker f13494a;

        public c(CountryCodePicker countryCodePicker) {
            this.f13494a = countryCodePicker;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AbstractC11558c.m15878d(AbstractC11558c.f13492e);
            this.f13494a.getDialogEventsListener();
        }
    }

    static {
        Field declaredField;
        Field declaredField2;
        Field declaredField3;
        boolean z = true;
        try {
            declaredField2 = TextView.class.getDeclaredField("mCursorDrawableRes");
            try {
                declaredField2.setAccessible(true);
                declaredField = TextView.class.getDeclaredField("mEditor");
                try {
                    declaredField.setAccessible(true);
                    declaredField3 = declaredField.getType().getDeclaredField("mCursorDrawable");
                    try {
                        declaredField3.setAccessible(true);
                        z = false;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    declaredField3 = null;
                }
            } catch (Exception unused3) {
                declaredField = null;
                declaredField3 = null;
            }
        } catch (Exception unused4) {
            declaredField = null;
            declaredField2 = null;
            declaredField3 = null;
        }
        if (z) {
            f13488a = null;
            f13489b = null;
            f13490c = null;
        } else {
            f13488a = declaredField;
            f13489b = declaredField3;
            f13490c = declaredField2;
        }
    }

    /* renamed from: b */
    public static void m15876b() {
        Dialog dialog = f13491d;
        if (dialog != null) {
            dialog.dismiss();
        }
        f13491d = null;
        f13492e = null;
    }

    /* renamed from: c */
    public static Drawable m15877c(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: d */
    public static void m15878d(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0250  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m15879e(CountryCodePicker countryCodePicker, String str) {
        boolean z;
        f13492e = countryCodePicker.getContext();
        f13491d = new Dialog(f13492e);
        countryCodePicker.m15804C();
        countryCodePicker.m15807F();
        List listM15850o = C11556a.m15850o(f13492e, countryCodePicker);
        f13491d.requestWindowFeature(1);
        f13491d.getWindow().setContentView(o9e.layout_picker_dialog);
        f13491d.getWindow().setBackgroundDrawable(c64.getDrawable(f13492e, R.color.transparent));
        RecyclerView recyclerView = (RecyclerView) f13491d.findViewById(o8e.recycler_countryDialog);
        TextView textView = (TextView) f13491d.findViewById(o8e.textView_title);
        RelativeLayout relativeLayout = (RelativeLayout) f13491d.findViewById(o8e.rl_query_holder);
        ImageView imageView = (ImageView) f13491d.findViewById(o8e.img_clear_query);
        EditText editText = (EditText) f13491d.findViewById(o8e.editText_search);
        TextView textView2 = (TextView) f13491d.findViewById(o8e.textView_noresult);
        CardView cardView = (CardView) f13491d.findViewById(o8e.cardViewRoot);
        ImageView imageView2 = (ImageView) f13491d.findViewById(o8e.img_dismiss);
        if (countryCodePicker.m15832t() && countryCodePicker.m15830r()) {
            editText.requestFocus();
            f13491d.getWindow().setSoftInputMode(5);
        } else {
            f13491d.getWindow().setSoftInputMode(2);
        }
        try {
            if (countryCodePicker.getDialogTypeFace() != null) {
                if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                } else {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (countryCodePicker.getDialogBackgroundColor() != 0) {
            cardView.setCardBackgroundColor(countryCodePicker.getDialogBackgroundColor());
        }
        if (countryCodePicker.getDialogBackgroundResId() != 0) {
            cardView.setBackgroundResource(countryCodePicker.getDialogBackgroundResId());
        }
        cardView.setRadius(countryCodePicker.getDialogCornerRadius());
        if (countryCodePicker.m15833u()) {
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new a());
        } else {
            imageView2.setVisibility(8);
        }
        if (!countryCodePicker.getCcpDialogShowTitle()) {
            textView.setVisibility(8);
        }
        if (countryCodePicker.getDialogTextColor() != 0) {
            int dialogTextColor = countryCodePicker.getDialogTextColor();
            imageView.setColorFilter(dialogTextColor);
            imageView2.setColorFilter(dialogTextColor);
            textView.setTextColor(dialogTextColor);
            textView2.setTextColor(dialogTextColor);
            editText.setTextColor(dialogTextColor);
            editText.setHintTextColor(Color.argb(100, Color.red(dialogTextColor), Color.green(dialogTextColor), Color.blue(dialogTextColor)));
        }
        if (countryCodePicker.getDialogSearchEditTextTintColor() != 0) {
            editText.setBackgroundTintList(ColorStateList.valueOf(countryCodePicker.getDialogSearchEditTextTintColor()));
            m15880f(editText, countryCodePicker.getDialogSearchEditTextTintColor());
        }
        textView.setText(countryCodePicker.getDialogTitle());
        editText.setHint(countryCodePicker.getSearchHintText());
        textView2.setText(countryCodePicker.getNoResultACK());
        if (!countryCodePicker.m15832t()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
        s84 s84Var = new s84(f13492e, listM15850o, countryCodePicker, relativeLayout, editText, textView2, f13491d, imageView);
        recyclerView.setLayoutManager(new LinearLayoutManager(f13492e));
        recyclerView.setAdapter(s84Var);
        FastScroller fastScroller = (FastScroller) f13491d.findViewById(o8e.fastscroll);
        fastScroller.setRecyclerView(recyclerView);
        if (countryCodePicker.m15834v()) {
            if (countryCodePicker.getFastScrollerBubbleColor() != 0) {
                fastScroller.setBubbleColor(countryCodePicker.getFastScrollerBubbleColor());
            }
            if (countryCodePicker.getFastScrollerHandleColor() != 0) {
                fastScroller.setHandleColor(countryCodePicker.getFastScrollerHandleColor());
            }
            if (countryCodePicker.getFastScrollerBubbleTextAppearance() != 0) {
                try {
                    fastScroller.setBubbleTextAppearance(countryCodePicker.getFastScrollerBubbleTextAppearance());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            fastScroller.setVisibility(8);
        }
        f13491d.setOnDismissListener(new b(countryCodePicker));
        f13491d.setOnCancelListener(new c(countryCodePicker));
        if (str != null) {
            List list = countryCodePicker.P0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C11556a) it.next()).f13479a.equalsIgnoreCase(str)) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (!z) {
                    List list2 = countryCodePicker.P0;
                    int size = (list2 == null || list2.size() <= 0) ? 0 : countryCodePicker.P0.size() + 1;
                    int i = 0;
                    while (true) {
                        if (i >= listM15850o.size()) {
                            break;
                        }
                        if (((C11556a) listM15850o.get(i)).f13479a.equalsIgnoreCase(str)) {
                            recyclerView.s1(i + size);
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = false;
                if (!z) {
                }
            }
        }
        f13491d.show();
        countryCodePicker.getDialogEventsListener();
    }

    /* renamed from: f */
    public static void m15880f(EditText editText, int i) throws IllegalAccessException, IllegalArgumentException {
        Field field = f13489b;
        if (field == null) {
            return;
        }
        try {
            Drawable drawableM15877c = m15877c(editText.getContext(), f13490c.getInt(editText));
            drawableM15877c.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            field.set(f13488a.get(editText), new Drawable[]{drawableM15877c, drawableM15877c});
        } catch (Exception unused) {
        }
    }
}
