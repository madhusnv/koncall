package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* loaded from: classes6.dex */
public final class OneSignalBounceInterpolator implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public OneSignalBounceInterpolator(double d, double d2) {
        this.mAmplitude = d;
        this.mFrequency = d2;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return (float) (((-1) * Math.pow(2.718281828459045d, (-f) / this.mAmplitude) * Math.cos(this.mFrequency * f)) + 1);
    }
}
