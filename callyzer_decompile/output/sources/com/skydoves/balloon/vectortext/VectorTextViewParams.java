package com.skydoves.balloon.vectortext;

import android.graphics.drawable.Drawable;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class VectorTextViewParams {
    private final Integer compoundDrawablePadding;
    private Integer compoundDrawablePaddingRes;
    private CharSequence contentDescription;
    private Drawable drawableBottom;
    private Integer drawableBottomRes;
    private Drawable drawableEnd;
    private Integer drawableEndRes;
    private Drawable drawableStart;
    private Integer drawableStartRes;
    private Drawable drawableTop;
    private Integer drawableTopRes;
    private Integer heightRes;
    private final Integer iconHeight;
    private final Integer iconWidth;
    private boolean isRtlLayout;
    private Integer squareSizeRes;
    private Integer tintColor;
    private Integer widthRes;

    public VectorTextViewParams() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ VectorTextViewParams copy$default(VectorTextViewParams vectorTextViewParams, Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence charSequence, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i10, Object obj) {
        Integer num13;
        Integer num14;
        Integer num15 = (i10 & 1) != 0 ? vectorTextViewParams.drawableStartRes : num;
        Integer num16 = (i10 & 2) != 0 ? vectorTextViewParams.drawableEndRes : num2;
        Integer num17 = (i10 & 4) != 0 ? vectorTextViewParams.drawableBottomRes : num3;
        Integer num18 = (i10 & 8) != 0 ? vectorTextViewParams.drawableTopRes : num4;
        Drawable drawable5 = (i10 & 16) != 0 ? vectorTextViewParams.drawableStart : drawable;
        Drawable drawable6 = (i10 & 32) != 0 ? vectorTextViewParams.drawableEnd : drawable2;
        Drawable drawable7 = (i10 & 64) != 0 ? vectorTextViewParams.drawableBottom : drawable3;
        Drawable drawable8 = (i10 & 128) != 0 ? vectorTextViewParams.drawableTop : drawable4;
        boolean z10 = (i10 & 256) != 0 ? vectorTextViewParams.isRtlLayout : z6;
        CharSequence charSequence2 = (i10 & 512) != 0 ? vectorTextViewParams.contentDescription : charSequence;
        Integer num19 = (i10 & 1024) != 0 ? vectorTextViewParams.compoundDrawablePadding : num5;
        Integer num20 = (i10 & NewHope.SENDB_BYTES) != 0 ? vectorTextViewParams.iconWidth : num6;
        Integer num21 = (i10 & 4096) != 0 ? vectorTextViewParams.iconHeight : num7;
        Integer num22 = (i10 & 8192) != 0 ? vectorTextViewParams.compoundDrawablePaddingRes : num8;
        Integer num23 = num15;
        Integer num24 = (i10 & 16384) != 0 ? vectorTextViewParams.tintColor : num9;
        Integer num25 = (i10 & 32768) != 0 ? vectorTextViewParams.widthRes : num10;
        Integer num26 = (i10 & 65536) != 0 ? vectorTextViewParams.heightRes : num11;
        if ((i10 & 131072) != 0) {
            num14 = num26;
            num13 = vectorTextViewParams.squareSizeRes;
        } else {
            num13 = num12;
            num14 = num26;
        }
        return vectorTextViewParams.copy(num23, num16, num17, num18, drawable5, drawable6, drawable7, drawable8, z10, charSequence2, num19, num20, num21, num22, num24, num25, num14, num13);
    }

    public final Integer component1() {
        return this.drawableStartRes;
    }

    public final CharSequence component10() {
        return this.contentDescription;
    }

    public final Integer component11() {
        return this.compoundDrawablePadding;
    }

    public final Integer component12() {
        return this.iconWidth;
    }

    public final Integer component13() {
        return this.iconHeight;
    }

    public final Integer component14() {
        return this.compoundDrawablePaddingRes;
    }

    public final Integer component15() {
        return this.tintColor;
    }

    public final Integer component16() {
        return this.widthRes;
    }

    public final Integer component17() {
        return this.heightRes;
    }

    public final Integer component18() {
        return this.squareSizeRes;
    }

    public final Integer component2() {
        return this.drawableEndRes;
    }

    public final Integer component3() {
        return this.drawableBottomRes;
    }

    public final Integer component4() {
        return this.drawableTopRes;
    }

    public final Drawable component5() {
        return this.drawableStart;
    }

    public final Drawable component6() {
        return this.drawableEnd;
    }

    public final Drawable component7() {
        return this.drawableBottom;
    }

    public final Drawable component8() {
        return this.drawableTop;
    }

    public final boolean component9() {
        return this.isRtlLayout;
    }

    public final VectorTextViewParams copy(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
        return new VectorTextViewParams(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, num6, num7, num8, num9, num10, num11, num12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorTextViewParams)) {
            return false;
        }
        VectorTextViewParams vectorTextViewParams = (VectorTextViewParams) obj;
        return AbstractC4154l.m8918a(this.drawableStartRes, vectorTextViewParams.drawableStartRes) && AbstractC4154l.m8918a(this.drawableEndRes, vectorTextViewParams.drawableEndRes) && AbstractC4154l.m8918a(this.drawableBottomRes, vectorTextViewParams.drawableBottomRes) && AbstractC4154l.m8918a(this.drawableTopRes, vectorTextViewParams.drawableTopRes) && AbstractC4154l.m8918a(this.drawableStart, vectorTextViewParams.drawableStart) && AbstractC4154l.m8918a(this.drawableEnd, vectorTextViewParams.drawableEnd) && AbstractC4154l.m8918a(this.drawableBottom, vectorTextViewParams.drawableBottom) && AbstractC4154l.m8918a(this.drawableTop, vectorTextViewParams.drawableTop) && this.isRtlLayout == vectorTextViewParams.isRtlLayout && AbstractC4154l.m8918a(this.contentDescription, vectorTextViewParams.contentDescription) && AbstractC4154l.m8918a(this.compoundDrawablePadding, vectorTextViewParams.compoundDrawablePadding) && AbstractC4154l.m8918a(this.iconWidth, vectorTextViewParams.iconWidth) && AbstractC4154l.m8918a(this.iconHeight, vectorTextViewParams.iconHeight) && AbstractC4154l.m8918a(this.compoundDrawablePaddingRes, vectorTextViewParams.compoundDrawablePaddingRes) && AbstractC4154l.m8918a(this.tintColor, vectorTextViewParams.tintColor) && AbstractC4154l.m8918a(this.widthRes, vectorTextViewParams.widthRes) && AbstractC4154l.m8918a(this.heightRes, vectorTextViewParams.heightRes) && AbstractC4154l.m8918a(this.squareSizeRes, vectorTextViewParams.squareSizeRes);
    }

    public final Integer getCompoundDrawablePadding() {
        return this.compoundDrawablePadding;
    }

    public final Integer getCompoundDrawablePaddingRes() {
        return this.compoundDrawablePaddingRes;
    }

    public final CharSequence getContentDescription() {
        return this.contentDescription;
    }

    public final Drawable getDrawableBottom() {
        return this.drawableBottom;
    }

    public final Integer getDrawableBottomRes() {
        return this.drawableBottomRes;
    }

    public final Drawable getDrawableEnd() {
        return this.drawableEnd;
    }

    public final Integer getDrawableEndRes() {
        return this.drawableEndRes;
    }

    public final Drawable getDrawableStart() {
        return this.drawableStart;
    }

    public final Integer getDrawableStartRes() {
        return this.drawableStartRes;
    }

    public final Drawable getDrawableTop() {
        return this.drawableTop;
    }

    public final Integer getDrawableTopRes() {
        return this.drawableTopRes;
    }

    public final Integer getHeightRes() {
        return this.heightRes;
    }

    public final Integer getIconHeight() {
        return this.iconHeight;
    }

    public final Integer getIconWidth() {
        return this.iconWidth;
    }

    public final Integer getSquareSizeRes() {
        return this.squareSizeRes;
    }

    public final Integer getTintColor() {
        return this.tintColor;
    }

    public final Integer getWidthRes() {
        return this.widthRes;
    }

    public int hashCode() {
        Integer num = this.drawableStartRes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.drawableEndRes;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.drawableBottomRes;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.drawableTopRes;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Drawable drawable = this.drawableStart;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.drawableEnd;
        int iHashCode6 = (iHashCode5 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.drawableBottom;
        int iHashCode7 = (iHashCode6 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Drawable drawable4 = this.drawableTop;
        int iHashCode8 = (this.contentDescription.hashCode() + AbstractC1452a.m4558e((iHashCode7 + (drawable4 == null ? 0 : drawable4.hashCode())) * 31, 31, this.isRtlLayout)) * 31;
        Integer num5 = this.compoundDrawablePadding;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.iconWidth;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.iconHeight;
        int iHashCode11 = (iHashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.compoundDrawablePaddingRes;
        int iHashCode12 = (iHashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.tintColor;
        int iHashCode13 = (iHashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.widthRes;
        int iHashCode14 = (iHashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.heightRes;
        int iHashCode15 = (iHashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.squareSizeRes;
        return iHashCode15 + (num12 != null ? num12.hashCode() : 0);
    }

    public final boolean isRtlLayout() {
        return this.isRtlLayout;
    }

    public final void setCompoundDrawablePaddingRes(Integer num) {
        this.compoundDrawablePaddingRes = num;
    }

    public final void setContentDescription(CharSequence charSequence) {
        AbstractC4154l.m8923f(charSequence, "<set-?>");
        this.contentDescription = charSequence;
    }

    public final void setDrawableBottom(Drawable drawable) {
        this.drawableBottom = drawable;
    }

    public final void setDrawableBottomRes(Integer num) {
        this.drawableBottomRes = num;
    }

    public final void setDrawableEnd(Drawable drawable) {
        this.drawableEnd = drawable;
    }

    public final void setDrawableEndRes(Integer num) {
        this.drawableEndRes = num;
    }

    public final void setDrawableStart(Drawable drawable) {
        this.drawableStart = drawable;
    }

    public final void setDrawableStartRes(Integer num) {
        this.drawableStartRes = num;
    }

    public final void setDrawableTop(Drawable drawable) {
        this.drawableTop = drawable;
    }

    public final void setDrawableTopRes(Integer num) {
        this.drawableTopRes = num;
    }

    public final void setHeightRes(Integer num) {
        this.heightRes = num;
    }

    public final void setRtlLayout(boolean z6) {
        this.isRtlLayout = z6;
    }

    public final void setSquareSizeRes(Integer num) {
        this.squareSizeRes = num;
    }

    public final void setTintColor(Integer num) {
        this.tintColor = num;
    }

    public final void setWidthRes(Integer num) {
        this.widthRes = num;
    }

    public String toString() {
        Integer num = this.drawableStartRes;
        Integer num2 = this.drawableEndRes;
        Integer num3 = this.drawableBottomRes;
        Integer num4 = this.drawableTopRes;
        Drawable drawable = this.drawableStart;
        Drawable drawable2 = this.drawableEnd;
        Drawable drawable3 = this.drawableBottom;
        Drawable drawable4 = this.drawableTop;
        boolean z6 = this.isRtlLayout;
        CharSequence charSequence = this.contentDescription;
        return "VectorTextViewParams(drawableStartRes=" + num + ", drawableEndRes=" + num2 + ", drawableBottomRes=" + num3 + ", drawableTopRes=" + num4 + ", drawableStart=" + drawable + ", drawableEnd=" + drawable2 + ", drawableBottom=" + drawable3 + ", drawableTop=" + drawable4 + ", isRtlLayout=" + z6 + ", contentDescription=" + ((Object) charSequence) + ", compoundDrawablePadding=" + this.compoundDrawablePadding + ", iconWidth=" + this.iconWidth + ", iconHeight=" + this.iconHeight + ", compoundDrawablePaddingRes=" + this.compoundDrawablePaddingRes + ", tintColor=" + this.tintColor + ", widthRes=" + this.widthRes + ", heightRes=" + this.heightRes + ", squareSizeRes=" + this.squareSizeRes + ")";
    }

    public VectorTextViewParams(Integer num) {
        this(num, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 262142, null);
    }

    public VectorTextViewParams(Integer num, Integer num2) {
        this(num, num2, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 262140, null);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 262136, null);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 262128, null);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable) {
        this(num, num2, num3, num4, drawable, null, null, null, false, null, null, null, null, null, null, null, null, null, 262112, null);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2) {
        this(num, num2, num3, num4, drawable, drawable2, null, null, false, null, null, null, null, null, null, null, null, null, 262080, null);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, null, false, null, null, null, null, null, null, null, null, null, 262016, null);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, false, null, null, null, null, null, null, null, null, null, 261888, null);
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, null, null, null, null, null, null, null, null, null, 261632, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, null, null, null, null, null, null, null, null, 261120, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, null, null, null, null, null, null, null, 260096, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, num6, null, null, null, null, null, null, 258048, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6, Integer num7) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, num6, num7, null, null, null, null, null, 253952, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6, Integer num7, Integer num8) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, num6, num7, num8, null, null, null, null, 245760, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, num6, num7, num8, num9, null, null, null, 229376, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, num6, num7, num8, num9, num10, null, null, 196608, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11) {
        this(num, num2, num3, num4, drawable, drawable2, drawable3, drawable4, z6, contentDescription, num5, num6, num7, num8, num9, num10, num11, null, 131072, null);
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
    }

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence contentDescription, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        AbstractC4154l.m8923f(contentDescription, "contentDescription");
        this.drawableStartRes = num;
        this.drawableEndRes = num2;
        this.drawableBottomRes = num3;
        this.drawableTopRes = num4;
        this.drawableStart = drawable;
        this.drawableEnd = drawable2;
        this.drawableBottom = drawable3;
        this.drawableTop = drawable4;
        this.isRtlLayout = z6;
        this.contentDescription = contentDescription;
        this.compoundDrawablePadding = num5;
        this.iconWidth = num6;
        this.iconHeight = num7;
        this.compoundDrawablePaddingRes = num8;
        this.tintColor = num9;
        this.widthRes = num10;
        this.heightRes = num11;
        this.squareSizeRes = num12;
    }

    public /* synthetic */ VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z6, CharSequence charSequence, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : num4, (i10 & 16) != 0 ? null : drawable, (i10 & 32) != 0 ? null : drawable2, (i10 & 64) != 0 ? null : drawable3, (i10 & 128) != 0 ? null : drawable4, (i10 & 256) != 0 ? false : z6, (i10 & 512) != 0 ? "" : charSequence, (i10 & 1024) != 0 ? null : num5, (i10 & NewHope.SENDB_BYTES) != 0 ? null : num6, (i10 & 4096) != 0 ? null : num7, (i10 & 8192) != 0 ? null : num8, (i10 & 16384) != 0 ? null : num9, (i10 & 32768) != 0 ? null : num10, (i10 & 65536) != 0 ? null : num11, (i10 & 131072) != 0 ? null : num12);
    }
}
