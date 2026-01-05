package com.skydoves.balloon;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.MovementMethod;
import com.skydoves.balloon.annotations.Dp;
import com.skydoves.balloon.annotations.Sp;
import com.skydoves.balloon.extensions.ContextExtensionKt;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TextForm {
    private final boolean enableAutoSized;
    private final boolean includeFontPadding;
    private final float maxAutoSizeTextSize;
    private final float minAutoSizeTextSize;
    private final MovementMethod movementMethod;
    private final CharSequence text;
    private final int textColor;
    private final int textGravity;
    private final boolean textIsHtml;
    private final Float textLetterSpacing;
    private final Float textLineSpacing;

    @Sp
    private final float textSize;
    private final int textStyle;
    private final Typeface textTypeface;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @TextFormDsl
    public static final class Builder {
        private final Context context;
        private boolean enableAutoSized;
        private boolean includeFontPadding;
        private float maxAutoSizeTextSize;
        private float minAutoSizeTextSize;
        private MovementMethod movementMethod;
        private CharSequence text;
        private int textColor;
        private int textGravity;
        private boolean textIsHtml;
        private Float textLetterSpacing;
        private Float textLineSpacing;

        @Sp
        private float textSize;
        private int textTypeface;
        private Typeface textTypefaceObject;

        public Builder(Context context) {
            AbstractC4154l.m8923f(context, "context");
            this.context = context;
            this.text = "";
            this.textSize = 12.0f;
            this.enableAutoSized = true;
            this.minAutoSizeTextSize = 12.0f;
            this.maxAutoSizeTextSize = 12.0f + 1;
            this.textColor = -1;
            this.includeFontPadding = true;
            this.textGravity = 17;
        }

        public final TextForm build() {
            return new TextForm(this, null);
        }

        public final Context getContext() {
            return this.context;
        }

        public final boolean getEnableAutoSized() {
            return this.enableAutoSized;
        }

        public final boolean getIncludeFontPadding() {
            return this.includeFontPadding;
        }

        public final float getMaxAutoSizeTextSize() {
            return this.maxAutoSizeTextSize;
        }

        public final float getMinAutoSizeTextSize() {
            return this.minAutoSizeTextSize;
        }

        public final MovementMethod getMovementMethod() {
            return this.movementMethod;
        }

        public final CharSequence getText() {
            return this.text;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final int getTextGravity() {
            return this.textGravity;
        }

        public final boolean getTextIsHtml() {
            return this.textIsHtml;
        }

        public final Float getTextLetterSpacing() {
            return this.textLetterSpacing;
        }

        public final Float getTextLineSpacing() {
            return this.textLineSpacing;
        }

        public final float getTextSize() {
            return this.textSize;
        }

        public final int getTextTypeface() {
            return this.textTypeface;
        }

        public final Typeface getTextTypefaceObject() {
            return this.textTypefaceObject;
        }

        /* renamed from: setEnableAutoSized, reason: collision with other method in class */
        public final /* synthetic */ void m16668setEnableAutoSized(boolean z6) {
            this.enableAutoSized = z6;
        }

        /* renamed from: setIncludeFontPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16669setIncludeFontPadding(boolean z6) {
            this.includeFontPadding = z6;
        }

        /* renamed from: setMaxAutoSizeTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m16670setMaxAutoSizeTextSize(float f6) {
            this.maxAutoSizeTextSize = f6;
        }

        /* renamed from: setMinAutoSizeTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m16671setMinAutoSizeTextSize(float f6) {
            this.minAutoSizeTextSize = f6;
        }

        /* renamed from: setMovementMethod, reason: collision with other method in class */
        public final /* synthetic */ void m16672setMovementMethod(MovementMethod movementMethod) {
            this.movementMethod = movementMethod;
        }

        /* renamed from: setText, reason: collision with other method in class */
        public final /* synthetic */ void m16673setText(CharSequence charSequence) {
            AbstractC4154l.m8923f(charSequence, "<set-?>");
            this.text = charSequence;
        }

        /* renamed from: setTextColor, reason: collision with other method in class */
        public final /* synthetic */ void m16674setTextColor(int i10) {
            this.textColor = i10;
        }

        public final Builder setTextColorResource(int i10) {
            this.textColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        /* renamed from: setTextGravity, reason: collision with other method in class */
        public final /* synthetic */ void m16675setTextGravity(int i10) {
            this.textGravity = i10;
        }

        /* renamed from: setTextIsHtml, reason: collision with other method in class */
        public final /* synthetic */ void m16676setTextIsHtml(boolean z6) {
            this.textIsHtml = z6;
        }

        /* renamed from: setTextLetterSpacing, reason: collision with other method in class */
        public final /* synthetic */ void m16677setTextLetterSpacing(Float f6) {
            this.textLetterSpacing = f6;
        }

        public final Builder setTextLetterSpacingResource(int i10) {
            this.textLetterSpacing = Float.valueOf(ContextExtensionKt.dimen(this.context, i10));
            return this;
        }

        /* renamed from: setTextLineSpacing, reason: collision with other method in class */
        public final /* synthetic */ void m16678setTextLineSpacing(Float f6) {
            this.textLineSpacing = f6;
        }

        public final Builder setTextLineSpacingResource(int i10) {
            this.textLineSpacing = Float.valueOf(ContextExtensionKt.dimen(this.context, i10));
            return this;
        }

        public final Builder setTextResource(int i10) {
            this.text = this.context.getString(i10);
            return this;
        }

        /* renamed from: setTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m16679setTextSize(float f6) {
            this.textSize = f6;
        }

        public final Builder setTextSizeResource(int i10) {
            Context context = this.context;
            this.textSize = ContextExtensionKt.px2Sp(context, ContextExtensionKt.dimen(context, i10));
            return this;
        }

        /* renamed from: setTextTypeface, reason: collision with other method in class */
        public final /* synthetic */ void m16680setTextTypeface(int i10) {
            this.textTypeface = i10;
        }

        public final /* synthetic */ void setTextTypefaceObject(Typeface typeface) {
            this.textTypefaceObject = typeface;
        }

        public final Builder setEnableAutoSized(boolean z6) {
            this.enableAutoSized = z6;
            return this;
        }

        public final Builder setIncludeFontPadding(boolean z6) {
            this.includeFontPadding = z6;
            return this;
        }

        public final Builder setMaxAutoSizeTextSize(@Sp float f6) {
            this.maxAutoSizeTextSize = f6;
            return this;
        }

        public final Builder setMinAutoSizeTextSize(@Sp float f6) {
            this.minAutoSizeTextSize = f6;
            return this;
        }

        public final Builder setMovementMethod(MovementMethod value) {
            AbstractC4154l.m8923f(value, "value");
            this.movementMethod = value;
            return this;
        }

        public final Builder setText(CharSequence value) {
            AbstractC4154l.m8923f(value, "value");
            this.text = value;
            return this;
        }

        public final Builder setTextColor(int i10) {
            this.textColor = i10;
            return this;
        }

        public final Builder setTextGravity(int i10) {
            this.textGravity = i10;
            return this;
        }

        public final Builder setTextIsHtml(boolean z6) {
            this.textIsHtml = z6;
            return this;
        }

        public final Builder setTextLetterSpacing(@Dp Float f6) {
            this.textLetterSpacing = f6;
            return this;
        }

        public final Builder setTextLineSpacing(@Dp Float f6) {
            this.textLineSpacing = f6;
            return this;
        }

        public final Builder setTextSize(@Sp float f6) {
            this.textSize = f6;
            return this;
        }

        public final Builder setTextTypeface(int i10) {
            this.textTypeface = i10;
            return this;
        }

        public final Builder setTextTypeface(Typeface typeface) {
            this.textTypefaceObject = typeface;
            return this;
        }
    }

    public /* synthetic */ TextForm(Builder builder, AbstractC4148f abstractC4148f) {
        this(builder);
    }

    public final boolean getEnableAutoSized() {
        return this.enableAutoSized;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public final float getMaxAutoSizeTextSize() {
        return this.maxAutoSizeTextSize;
    }

    public final float getMinAutoSizeTextSize() {
        return this.minAutoSizeTextSize;
    }

    public final MovementMethod getMovementMethod() {
        return this.movementMethod;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextGravity() {
        return this.textGravity;
    }

    public final boolean getTextIsHtml() {
        return this.textIsHtml;
    }

    public final Float getTextLetterSpacing() {
        return this.textLetterSpacing;
    }

    public final Float getTextLineSpacing() {
        return this.textLineSpacing;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final int getTextStyle() {
        return this.textStyle;
    }

    public final Typeface getTextTypeface() {
        return this.textTypeface;
    }

    private TextForm(Builder builder) {
        this.text = builder.getText();
        this.textSize = builder.getTextSize();
        this.enableAutoSized = builder.getEnableAutoSized();
        this.minAutoSizeTextSize = builder.getMinAutoSizeTextSize();
        this.maxAutoSizeTextSize = builder.getMaxAutoSizeTextSize();
        this.textColor = builder.getTextColor();
        this.textIsHtml = builder.getTextIsHtml();
        this.movementMethod = builder.getMovementMethod();
        this.textStyle = builder.getTextTypeface();
        this.textTypeface = builder.getTextTypefaceObject();
        this.textLineSpacing = builder.getTextLineSpacing();
        this.includeFontPadding = builder.getIncludeFontPadding();
        this.textLetterSpacing = builder.getTextLetterSpacing();
        this.textGravity = builder.getTextGravity();
    }
}
