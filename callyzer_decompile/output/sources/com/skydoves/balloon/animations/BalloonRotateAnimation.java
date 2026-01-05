package com.skydoves.balloon.animations;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonRotateAnimation extends Animation {
    private final float degreeX;
    private final float degreeY;
    private final float degreeZ;
    private float height;
    private float width;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        public int degreeX;
        public int degreeZ;
        public BalloonRotateDirection direction = BalloonRotateDirection.RIGHT;
        public int turns = 1;
        public int loops = -1;
        public int speeds = 2500;

        public final BalloonRotateAnimation build() {
            return new BalloonRotateAnimation(this, null);
        }

        public final Builder setDegreeX(int i10) {
            this.degreeX = i10;
            return this;
        }

        public final Builder setDegreeZ(int i10) {
            this.degreeZ = i10;
            return this;
        }

        public final Builder setDirection(BalloonRotateDirection rotateDirection) {
            AbstractC4154l.m8923f(rotateDirection, "rotateDirection");
            this.direction = rotateDirection;
            return this;
        }

        public final Builder setLoops(int i10) {
            this.loops = i10;
            return this;
        }

        public final Builder setSpeeds(int i10) {
            this.speeds = i10;
            return this;
        }

        public final Builder setTurns(int i10) {
            this.turns = i10;
            return this;
        }
    }

    public /* synthetic */ BalloonRotateAnimation(Builder builder, AbstractC4148f abstractC4148f) {
        this(builder);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f6, Transformation transformation) {
        AbstractC4154l.m8923f(transformation, "transformation");
        float f10 = this.degreeX * f6;
        float f11 = this.degreeY * f6;
        float f12 = this.degreeZ * f6;
        Matrix matrix = transformation.getMatrix();
        Camera camera = new Camera();
        camera.save();
        camera.rotateX(f10);
        camera.rotateY(f11);
        camera.rotateZ(f12);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-this.width, -this.height);
        matrix.postTranslate(this.width, this.height);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.width = i10 * 0.5f;
        this.height = i11 * 0.5f;
    }

    private BalloonRotateAnimation(Builder builder) {
        this.degreeX = builder.degreeX;
        this.degreeY = builder.turns * 360 * builder.direction.getValue();
        this.degreeZ = builder.degreeZ;
        setDuration(builder.speeds);
        int i10 = builder.loops;
        setRepeatCount(i10 != -1 ? i10 - 1 : -1);
    }
}
