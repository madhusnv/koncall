package rh;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import c6.v0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import pg.m6;
import ph.C5952g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.c */
/* loaded from: classes.dex */
public final class C6524c {

    /* renamed from: a */
    public final /* synthetic */ int f31299a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6536o f31300b;

    public /* synthetic */ C6524c(AbstractC6536o abstractC6536o, int i10) {
        this.f31299a = i10;
        this.f31300b = abstractC6536o;
    }

    /* renamed from: a */
    public final void m12550a(TextInputLayout textInputLayout) {
        int i10 = this.f31299a;
        AbstractC6536o abstractC6536o = this.f31300b;
        switch (i10) {
            case 0:
                C6528g c6528g = (C6528g) abstractC6536o;
                C6522a c6522a = c6528g.f31307d;
                EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(editText.hasFocus() && editText.getText().length() > 0);
                textInputLayout.setEndIconCheckable(false);
                editText.setOnFocusChangeListener(c6528g.f31308e);
                editText.removeTextChangedListener(c6522a);
                editText.addTextChangedListener(c6522a);
                return;
            case 1:
                EditText editText2 = textInputLayout.getEditText();
                if (!(editText2 instanceof AutoCompleteTextView)) {
                    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
                C6535n c6535n = (C6535n) abstractC6536o;
                C6531j c6531j = c6535n.f31323d;
                TextInputLayout textInputLayout2 = c6535n.f31336a;
                int boxBackgroundMode = textInputLayout2.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(c6535n.f31332m);
                } else if (boxBackgroundMode == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(c6535n.f31331l);
                }
                if (autoCompleteTextView.getKeyListener() == null) {
                    int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                    C5952g boxBackground = textInputLayout2.getBoxBackground();
                    int iM11786a = m6.m11786a(R.attr.colorControlHighlight, autoCompleteTextView);
                    int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                    if (boxBackgroundMode2 == 2) {
                        int iM11786a2 = m6.m11786a(R.attr.colorSurface, autoCompleteTextView);
                        C5952g c5952g = new C5952g(boxBackground.f29152a.f29135a);
                        int iM11787b = m6.m11787b(0.1f, iM11786a, iM11786a2);
                        c5952g.m11988i(new ColorStateList(iArr, new int[]{iM11787b, 0}));
                        c5952g.setTint(iM11786a2);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM11787b, iM11786a2});
                        C5952g c5952g2 = new C5952g(boxBackground.f29152a.f29135a);
                        c5952g2.setTint(-1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c5952g, c5952g2), boxBackground});
                        Field field = v0.f5527a;
                        autoCompleteTextView.setBackground(layerDrawable);
                    } else if (boxBackgroundMode2 == 1) {
                        int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{m6.m11787b(0.1f, iM11786a, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
                        Field field2 = v0.f5527a;
                        autoCompleteTextView.setBackground(rippleDrawable);
                    }
                }
                autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC6533l(c6535n, autoCompleteTextView));
                autoCompleteTextView.setOnFocusChangeListener(c6535n.f31324e);
                autoCompleteTextView.setOnDismissListener(new C6534m(c6535n));
                autoCompleteTextView.setThreshold(0);
                autoCompleteTextView.removeTextChangedListener(c6531j);
                autoCompleteTextView.addTextChangedListener(c6531j);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (autoCompleteTextView.getKeyListener() == null) {
                    CheckableImageButton checkableImageButton = c6535n.f31338c;
                    Field field3 = v0.f5527a;
                    checkableImageButton.setImportantForAccessibility(2);
                }
                textInputLayout.setTextInputAccessibilityDelegate(c6535n.f31325f);
                textInputLayout.setEndIconVisible(true);
                return;
            default:
                EditText editText3 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                C6539r c6539r = (C6539r) abstractC6536o;
                c6539r.f31338c.setChecked(!C6539r.m12570d(c6539r));
                C6531j c6531j2 = c6539r.f31365d;
                editText3.removeTextChangedListener(c6531j2);
                editText3.addTextChangedListener(c6531j2);
                return;
        }
    }
}
