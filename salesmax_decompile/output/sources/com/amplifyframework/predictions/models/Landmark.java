package com.amplifyframework.predictions.models;

import android.graphics.PointF;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Landmark {
    private final List<PointF> points;

    /* renamed from: type, reason: collision with root package name */
    private final LandmarkType f58118type;

    public Landmark(LandmarkType landmarkType, List<PointF> list) {
        Objects.requireNonNull(landmarkType);
        this.f58118type = landmarkType;
        Objects.requireNonNull(list);
        this.points = list;
    }

    public List<PointF> getPoints() {
        return Immutable.of(this.points);
    }

    public LandmarkType getType() {
        return this.f58118type;
    }
}
