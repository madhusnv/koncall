package com.skydoves.balloon.extensions;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.widget.TextView;
import bg.AbstractC0656a;
import com.skydoves.balloon.IconForm;
import com.skydoves.balloon.IconGravity;
import com.skydoves.balloon.TextForm;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.skydoves.balloon.vectortext.VectorTextViewParams;
import g6.InterfaceC2527b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TextViewExtensionKt {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconGravity.values().length];
            try {
                iArr[IconGravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconGravity.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconGravity.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconGravity.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void applyDrawable(android.widget.TextView r9, com.skydoves.balloon.vectortext.VectorTextViewParams r10) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.extensions.TextViewExtensionKt.applyDrawable(android.widget.TextView, com.skydoves.balloon.vectortext.VectorTextViewParams):void");
    }

    public static final /* synthetic */ void applyIconForm(VectorTextView vectorTextView, IconForm iconForm) {
        AbstractC4154l.m8923f(vectorTextView, "<this>");
        AbstractC4154l.m8923f(iconForm, "iconForm");
        if (iconForm.getDrawable() != null) {
            int iconWidth = iconForm.getIconWidth();
            int iconHeight = iconForm.getIconHeight();
            int iconSpace = iconForm.getIconSpace();
            CharSequence iconContentDescription = iconForm.getIconContentDescription();
            Integer numValueOf = Integer.valueOf(iconForm.getIconColor());
            if (!(numValueOf.intValue() != Integer.MIN_VALUE)) {
                numValueOf = null;
            }
            VectorTextViewParams vectorTextViewParams = new VectorTextViewParams(null, null, null, null, null, null, null, null, false, iconContentDescription, Integer.valueOf(iconSpace), Integer.valueOf(iconWidth), Integer.valueOf(iconHeight), null, numValueOf, null, null, null, 238079, null);
            int i10 = WhenMappings.$EnumSwitchMapping$0[iconForm.getIconGravity().ordinal()];
            if (i10 == 1) {
                vectorTextViewParams.setDrawableStart(iconForm.getDrawable());
                vectorTextViewParams.setDrawableStartRes(iconForm.getDrawableRes());
            } else if (i10 == 2) {
                vectorTextViewParams.setDrawableTop(iconForm.getDrawable());
                vectorTextViewParams.setDrawableTopRes(iconForm.getDrawableRes());
            } else if (i10 == 3) {
                vectorTextViewParams.setDrawableBottom(iconForm.getDrawable());
                vectorTextViewParams.setDrawableBottomRes(iconForm.getDrawableRes());
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                vectorTextViewParams.setDrawableEnd(iconForm.getDrawable());
                vectorTextViewParams.setDrawableEndRes(iconForm.getDrawableRes());
            }
            vectorTextView.setDrawableTextViewParams(vectorTextViewParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyTextForm(TextView textView, TextForm textForm) {
        CharSequence text;
        AbstractC4154l.m8923f(textView, "<this>");
        AbstractC4154l.m8923f(textForm, "textForm");
        boolean textIsHtml = textForm.getTextIsHtml();
        if (textIsHtml) {
            text = fromHtml(textForm.getText().toString());
        } else {
            if (textIsHtml) {
                throw new NoWhenBranchMatchedException();
            }
            text = textForm.getText();
        }
        textView.setText(text);
        textView.setTextSize(textForm.getTextSize());
        textView.setGravity(textForm.getTextGravity());
        textView.setTextColor(textForm.getTextColor());
        textView.setIncludeFontPadding(textForm.getIncludeFontPadding());
        Float textLineSpacing = textForm.getTextLineSpacing();
        if (textLineSpacing != null) {
            textView.setLineSpacing(textLineSpacing.floatValue(), 1.0f);
        }
        Float textLetterSpacing = textForm.getTextLetterSpacing();
        if (textLetterSpacing != null) {
            textView.setLetterSpacing(textLetterSpacing.floatValue());
        }
        Typeface textTypeface = textForm.getTextTypeface();
        if (textTypeface != null) {
            textView.setTypeface(textTypeface);
        } else {
            textView.setTypeface(textView.getTypeface(), textForm.getTextStyle());
        }
        MovementMethod movementMethod = textForm.getMovementMethod();
        if (movementMethod != null) {
            textView.setMovementMethod(movementMethod);
        }
        if (textForm.getEnableAutoSized()) {
            int minAutoSizeTextSize = (int) textForm.getMinAutoSizeTextSize();
            int maxAutoSizeTextSize = (int) textForm.getMaxAutoSizeTextSize();
            if (Build.VERSION.SDK_INT >= 27) {
                AbstractC0656a.m1912u(textView, minAutoSizeTextSize, maxAutoSizeTextSize);
            } else if (textView instanceof InterfaceC2527b) {
                ((InterfaceC2527b) textView).setAutoSizeTextTypeUniformWithConfiguration(minAutoSizeTextSize, maxAutoSizeTextSize, 1, 1);
            }
        }
    }

    private static final Spanned fromHtml(String str) {
        return Html.fromHtml(str, 0);
    }

    public static final /* synthetic */ int getSumOfCompoundPadding(TextView textView) {
        AbstractC4154l.m8923f(textView, "<this>");
        return textView.getCompoundPaddingEnd() + textView.getCompoundPaddingStart();
    }
}
