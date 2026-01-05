package com.amplifyframework.predictions.models;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Pose {
    private final double pitch;
    private final double roll;
    private final double yaw;

    public Pose(double d2, double d10, double d11) {
        this.pitch = d2;
        this.roll = d10;
        this.yaw = d11;
    }

    public double getPitch() {
        return this.pitch;
    }

    public double getRoll() {
        return this.roll;
    }

    public double getYaw() {
        return this.yaw;
    }
}
