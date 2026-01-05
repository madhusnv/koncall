package com.skydoves.balloon;

import a2.AbstractC0030c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.skydoves.balloon.extensions.ContextExtensionKt;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IconForm {
    private final Drawable drawable;
    private Integer drawableRes;
    private final int iconColor;
    private final CharSequence iconContentDescription;
    private final IconGravity iconGravity;
    private final int iconHeight;
    private final int iconSpace;
    private final int iconWidth;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @IconFormDsl
    public static final class Builder {
        private final Context context;
        private Drawable drawable;
        private Integer drawableRes;
        private int iconColor;
        private CharSequence iconContentDescription;
        private IconGravity iconGravity;
        private int iconHeight;
        private int iconSpace;
        private int iconWidth;

        public Builder(Context context) {
            AbstractC4154l.m8923f(context, "context");
            this.context = context;
            this.iconGravity = IconGravity.START;
            float f6 = 28;
            this.iconWidth = AbstractC0030c.m110a(f6, 1);
            this.iconHeight = AbstractC0030c.m110a(f6, 1);
            this.iconSpace = AbstractC0030c.m110a(8, 1);
            this.iconColor = -1;
            this.iconContentDescription = "";
        }

        public final IconForm build() {
            return new IconForm(this, null);
        }

        public final Context getContext() {
            return this.context;
        }

        public final Drawable getDrawable() {
            return this.drawable;
        }

        public final Integer getDrawableRes() {
            return this.drawableRes;
        }

        public final int getIconColor() {
            return this.iconColor;
        }

        public final CharSequence getIconContentDescription() {
            return this.iconContentDescription;
        }

        public final IconGravity getIconGravity() {
            return this.iconGravity;
        }

        public final int getIconHeight() {
            return this.iconHeight;
        }

        public final int getIconSpace() {
            return this.iconSpace;
        }

        public final int getIconWidth() {
            return this.iconWidth;
        }

        /* renamed from: setDrawable, reason: collision with other method in class */
        public final /* synthetic */ void m16662setDrawable(Drawable drawable) {
            this.drawable = drawable;
        }

        public final Builder setDrawableGravity(IconGravity value) {
            AbstractC4154l.m8923f(value, "value");
            this.iconGravity = value;
            return this;
        }

        public final /* synthetic */ void setDrawableRes(Integer num) {
            this.drawableRes = num;
        }

        public final Builder setDrawableResource(int i10) {
            this.drawableRes = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: setIconColor, reason: collision with other method in class */
        public final /* synthetic */ void m16663setIconColor(int i10) {
            this.iconColor = i10;
        }

        public final Builder setIconColorResource(int i10) {
            this.iconColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        /* renamed from: setIconContentDescription, reason: collision with other method in class */
        public final /* synthetic */ void m16664setIconContentDescription(CharSequence charSequence) {
            AbstractC4154l.m8923f(charSequence, "<set-?>");
            this.iconContentDescription = charSequence;
        }

        public final Builder setIconContentDescriptionResource(int i10) {
            this.iconContentDescription = this.context.getString(i10);
            return this;
        }

        public final /* synthetic */ void setIconGravity(IconGravity iconGravity) {
            AbstractC4154l.m8923f(iconGravity, "<set-?>");
            this.iconGravity = iconGravity;
        }

        /* renamed from: setIconHeight, reason: collision with other method in class */
        public final /* synthetic */ void m16665setIconHeight(int i10) {
            this.iconHeight = i10;
        }

        public final Builder setIconSize(int i10) {
            setIconWidth(i10);
            setIconHeight(i10);
            return this;
        }

        /* renamed from: setIconSpace, reason: collision with other method in class */
        public final /* synthetic */ void m16666setIconSpace(int i10) {
            this.iconSpace = i10;
        }

        /* renamed from: setIconWidth, reason: collision with other method in class */
        public final /* synthetic */ void m16667setIconWidth(int i10) {
            this.iconWidth = i10;
        }

        public final Builder setDrawable(Drawable drawable) {
            this.drawable = drawable;
            return this;
        }

        public final Builder setIconColor(int i10) {
            this.iconColor = i10;
            return this;
        }

        public final Builder setIconContentDescription(CharSequence value) {
            AbstractC4154l.m8923f(value, "value");
            this.iconContentDescription = value;
            return this;
        }

        public final Builder setIconHeight(int i10) {
            this.iconHeight = i10;
            return this;
        }

        public final Builder setIconSpace(int i10) {
            this.iconSpace = i10;
            return this;
        }

        public final Builder setIconWidth(int i10) {
            this.iconWidth = i10;
            return this;
        }
    }

    public /* synthetic */ IconForm(Builder builder, AbstractC4148f abstractC4148f) {
        this(builder);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final Integer getDrawableRes() {
        return this.drawableRes;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public final CharSequence getIconContentDescription() {
        return this.iconContentDescription;
    }

    public final IconGravity getIconGravity() {
        return this.iconGravity;
    }

    public final int getIconHeight() {
        return this.iconHeight;
    }

    public final int getIconSpace() {
        return this.iconSpace;
    }

    public final int getIconWidth() {
        return this.iconWidth;
    }

    public final void setDrawableRes(Integer num) {
        this.drawableRes = num;
    }

    private IconForm(Builder builder) {
        this.drawable = builder.getDrawable();
        this.drawableRes = builder.getDrawableRes();
        this.iconGravity = builder.getIconGravity();
        this.iconWidth = builder.getIconWidth();
        this.iconHeight = builder.getIconHeight();
        this.iconSpace = builder.getIconSpace();
        this.iconColor = builder.getIconColor();
        this.iconContentDescription = builder.getIconContentDescription();
    }
}
