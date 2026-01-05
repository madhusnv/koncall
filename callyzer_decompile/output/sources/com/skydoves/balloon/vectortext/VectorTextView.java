package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.skydoves.balloon.C1413R;
import com.skydoves.balloon.extensions.TextViewExtensionKt;
import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import p013o.j0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class VectorTextView extends j0 {
    private VectorTextViewParams drawableTextViewParams;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC4154l.m8923f(context, "context");
    }

    private final void initAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1413R.styleable.VectorTextView);
            AbstractC4154l.m8922e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setDrawableTextViewParams(new VectorTextViewParams(DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawableStart, Integer.MIN_VALUE)), DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawableEnd, Integer.MIN_VALUE)), DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawableBottom, Integer.MIN_VALUE)), DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawableTop, Integer.MIN_VALUE)), null, null, null, null, false, null, null, null, null, DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawablePadding, Integer.MIN_VALUE)), DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getColor(C1413R.styleable.VectorTextView_balloon_drawableTintColor, Integer.MIN_VALUE)), DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawableWidth, Integer.MIN_VALUE)), DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawableHeight, Integer.MIN_VALUE)), DefinitionKt.takeIfNotNoIntValue(typedArrayObtainStyledAttributes.getResourceId(C1413R.styleable.VectorTextView_balloon_drawableSquareSize, Integer.MIN_VALUE)), 8176, null));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final VectorTextViewParams getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void isRtlSupport(boolean z6) {
        VectorTextViewParams vectorTextViewParams = this.drawableTextViewParams;
        if (vectorTextViewParams != null) {
            vectorTextViewParams.setRtlLayout(z6);
            TextViewExtensionKt.applyDrawable(this, vectorTextViewParams);
        }
    }

    public final void setDrawableTextViewParams(VectorTextViewParams vectorTextViewParams) {
        if (vectorTextViewParams != null) {
            TextViewExtensionKt.applyDrawable(this, vectorTextViewParams);
        } else {
            vectorTextViewParams = null;
        }
        this.drawableTextViewParams = vectorTextViewParams;
    }

    public /* synthetic */ VectorTextView(Context context, AttributeSet attributeSet, int i10, AbstractC4148f abstractC4148f) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC4154l.m8923f(context, "context");
        initAttrs(context, attributeSet);
    }
}
